package xyz.keksdose.spoon.code_solver.analyzer.qodana;

import com.contrastsecurity.sarif.Result;
import com.contrastsecurity.sarif.SarifSchema210;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.async.ResultCallback;
import com.github.dockerjava.api.async.ResultCallbackTemplate;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.command.LogContainerCmd;
import com.github.dockerjava.api.command.WaitContainerResultCallback;
import com.github.dockerjava.api.model.AccessMode;
import com.github.dockerjava.api.model.Bind;
import com.github.dockerjava.api.model.Frame;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.api.model.Image;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.api.model.WaitResponse;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.DockerClientImpl;
import com.github.dockerjava.httpclient5.ApacheDockerHttpClient;
import com.github.dockerjava.transport.DockerHttpClient;
import com.google.common.flogger.FluentLogger;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

public class QodanaAnalyzer {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private String resultFolder;
    private String qodanaImageName;
    private String resultPathString;
    private String sourceFileRoot;

    private QodanaAnalyzer(Builder builder) {
        this.resultFolder = builder.resultFolder;
        this.qodanaImageName = builder.qodanaImageName;
        this.resultPathString = builder.resultPathString;
        this.sourceFileRoot = builder.sourceFileRoot;
    }

    public List<AnalyzerResult> runQodana(Path sourceRoot) {
        sourceRoot = fixWindowsPath(sourceRoot);
        logger.atInfo().log("Running Qodana on %s", sourceRoot);
        copyQodanaRules(sourceRoot);
        DockerClientConfig standard =
                DefaultDockerClientConfig.createDefaultConfigBuilder().build();
        DockerHttpClient httpClient = createHttpClient(standard);
        try (DockerClient dockerClient = DockerClientImpl.getInstance(standard, httpClient)) {
            Path resultPath = Path.of(resultPathString);
            if (Files.exists(resultPath)) {
                logger.atInfo().log("Found old result dir %s", resultPath);
                return parseSarif(resultPath);
            }
            Optional<Image> qodana = findQodanaImage(dockerClient);
            if (qodana.isPresent()) {
                logger.atInfo().log("Found qodana image %s", qodana.get().getId());
                return executeQodana(sourceRoot, dockerClient, qodana.get());
            }
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Error running qodana");
        }
        return List.of();
    }

    @Deprecated
    public List<AnalyzerResult> runQodanaNoCacheDelete(Path sourceRoot) {
        sourceRoot = fixWindowsPath(sourceRoot);
        logger.atInfo().log("Running Qodana on %s", sourceRoot);
        copyQodanaRules(sourceRoot);
        DockerClientConfig standard =
                DefaultDockerClientConfig.createDefaultConfigBuilder().build();
        DockerHttpClient httpClient = createHttpClient(standard);
        try (DockerClient dockerClient = DockerClientImpl.getInstance(standard, httpClient)) {
            Optional<Image> qodana = findQodanaImage(dockerClient);
            if (qodana.isPresent()) {
                return executeQodana(sourceRoot, dockerClient, qodana.get());
            }
            logger.atSevere().log("Could not find qodana image");
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Error running qodana");
        }
        return List.of();
    }

    private List<AnalyzerResult> executeQodana(Path sourceRoot, DockerClient dockerClient, Image qodana)
            throws InterruptedException {
        HostConfig hostConfig = createHostConfig(sourceRoot);
        CreateContainerResponse container = createQodanaContainer(dockerClient, qodana, hostConfig);
        return startQodanaContainer(dockerClient, container);
    }

    private void copyQodanaRules(Path sourceRoot) {
        try {
            var url = this.getClass().getResource("/qodana.yml");
            File copyQodanaRules = new File(sourceRoot.toString(), "qodana.yaml");
            FileUtils.copyURLToFile(url, copyQodanaRules);
        } catch (IOException e) {
            logger.atSevere().withCause(e).log("Could not write qodana.yaml");
        }
    }

    private List<AnalyzerResult> startQodanaContainer(DockerClient dockerClient, CreateContainerResponse container)
            throws InterruptedException {
        String containerId = container.getId();
        if (containerId == null) {
            logger.atSevere().log("Container id is null");
            return List.of();
        }
        logger.atInfo().log("Starting qodana container %s", containerId);
        dockerClient.startContainerCmd(containerId).exec();
        WaitContainerResultCallback exec =
                dockerClient.waitContainerCmd(containerId).exec(new WaitContainerResultCallback());
        List<AnalyzerResult> results = new ArrayList<>();
        dockerClient
                .waitContainerCmd(containerId)
                .exec(new ResultCallbackTemplate<WaitContainerResultCallback, WaitResponse>() {
                    @Override
                    public void onNext(WaitResponse object) {
                        try {
                            exec.awaitCompletion(14, TimeUnit.MINUTES);
                            logger.atInfo().log("Qodana finished");
                            if (!Paths.get(resultPathString).toFile().exists()) {
                                StringBuilder sb = new StringBuilder();
                                LogContainerCmd logContainerCmd = dockerClient.logContainerCmd(containerId);
                                logContainerCmd
                                        .withStdOut(true)
                                        .withStdErr(true)
                                        .withTailAll()
                                        .exec(new ResultCallbackImplementation(sb));
                                logger.atSevere().log(sb.toString());
                                logger.atSevere().log("Qodana did not create result file");
                            } else {
                                results.addAll(parseSarif(Paths.get(resultPathString)));
                            }
                        } catch (Exception e) {
                            logger.atSevere().withCause(e).log("Could not parse sarif");
                        }
                    }
                })
                .awaitCompletion();
        logger.atInfo().log("Qodana finished with %s results", results.size());
        return results;
    }

    private CreateContainerResponse createQodanaContainer(
            DockerClient dockerClient, Image qodana, HostConfig hostConfig) {
        return dockerClient
                .createContainerCmd(qodana.getId())
                .withHostConfig(hostConfig)
                .withAttachStderr(true)
                .withAttachStdout(true)
                .withCmd("-d", sourceFileRoot)
                .exec();
    }

    private HostConfig createHostConfig(Path sourceRoot) {
        Volume sourceFile = new Volume("/data/project/");
        Volume targetFile = new Volume("/data/results/");
        Bind bind = new Bind(sourceRoot.toAbsolutePath().toString(), sourceFile, AccessMode.rw);
        Bind resultsBind = new Bind(Path.of(resultFolder).toAbsolutePath().toString(), targetFile, AccessMode.rw);
        return HostConfig.newHostConfig()
                .withBinds(bind, resultsBind)
                .withPrivileged(true)
                .withAutoRemove(true);
    }

    private Optional<Image> findQodanaImage(DockerClient dockerClient) {
        List<Image> images = dockerClient.listImagesCmd().exec();
        return images.stream()
                .filter(v -> v.getRepoTags() != null)
                .filter(v -> Arrays.stream(v.getRepoTags()).anyMatch(q -> q.contains(qodanaImageName)))
                .findFirst();
    }

    private ApacheDockerHttpClient createHttpClient(DockerClientConfig standard) {
        return new ApacheDockerHttpClient.Builder()
                .dockerHost(standard.getDockerHost())
                .sslConfig(standard.getSSLConfig())
                .maxConnections(100)
                .connectionTimeout(Duration.ofSeconds(30))
                .responseTimeout(Duration.ofSeconds(45))
                .build();
    }

    private Path fixWindowsPath(Path sourceRoot) {
        if (sourceRoot
                .toFile()
                .toPath()
                .toString()
                .endsWith(Path.of("/src/main/java").toString())) {
            if (sourceRoot.getRoot() == null) {
                sourceRoot = sourceRoot.subpath(0, sourceRoot.getNameCount() - 3);
            } else {
                sourceRoot = Paths.get(
                        sourceRoot.getRoot().toString(),
                        sourceRoot.subpath(0, sourceRoot.getNameCount() - 3).toString());
            }
        }
        return sourceRoot;
    }

    private List<AnalyzerResult> parseSarif(Path resultPath) throws IOException {
        List<AnalyzerResult> results = new ArrayList<>();
        try {
            StringReader reader = new StringReader(Files.readString(resultPath));
            ObjectMapper mapper = new ObjectMapper();
            SarifSchema210 sarif = mapper.readValue(reader, SarifSchema210.class);
            for (Result result : sarif.getRuns().get(0).getResults()) {
                results.add(new QodanaAnalyzerResult(result));
            }
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Could not parse sarif");
        }
        return results;
    }

    private final class ResultCallbackImplementation implements ResultCallback<Frame> {
        private final StringBuilder sb;

        private ResultCallbackImplementation(StringBuilder sb) {
            this.sb = sb;
        }

        @Override
        public void close() throws IOException {}

        @Override
        public void onStart(Closeable closeable) {}

        @Override
        public void onNext(Frame object) {
            sb.append(new String(object.getPayload()));
        }

        @Override
        public void onError(Throwable throwable) {
            sb.append(throwable.getMessage());
        }

        @Override
        public void onComplete() {}
    }

    public static class Builder {

        private String resultFolder = "laughing-cache";
        private String qodanaImageName = "jetbrains/qodana-jvm-community";
        private String resultPathString = resultFolder + "/qodana.sarif.json";
        private String sourceFileRoot = "./src/main/java";
        private Optional<String> cacheFolder = Optional.of("data/cache");
        private String subFolder;

        public Builder withResultFolder(String resultFolder) {
            this.resultFolder = resultFolder;
            this.resultPathString = resultFolder + "/qodana.sarif.json";
            logger.atInfo().log("Result folder set to %s", resultFolder);
            logger.atInfo().log("Result path set to %s", resultPathString);
            return this;
        }

        public Builder withQodanaImageName(String qodanaImageName) {
            this.qodanaImageName = qodanaImageName;
            return this;
        }

        @Deprecated
        public Builder withRemoveResultDir(boolean removeResultDir) {
            return this;
        }

        public Builder withSourceFileRoot(String sourceFileRoot) {
            this.sourceFileRoot = sourceFileRoot;
            return this;
        }

        public Builder withCacheVolume(String volumeName, String subFolder) {
            this.cacheFolder = Optional.of(volumeName);
            this.subFolder = subFolder;
            return this;
        }

        public QodanaAnalyzer build() {
            return new QodanaAnalyzer(this);
        }
    }
}
