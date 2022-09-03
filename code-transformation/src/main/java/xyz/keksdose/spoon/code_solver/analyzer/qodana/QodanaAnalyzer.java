package xyz.keksdose.spoon.code_solver.analyzer.qodana;

import com.contrastsecurity.sarif.Result;
import com.contrastsecurity.sarif.SarifSchema210;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.async.ResultCallbackTemplate;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.command.WaitContainerResultCallback;
import com.github.dockerjava.api.model.Bind;
import com.github.dockerjava.api.model.Frame;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.api.model.Image;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.api.model.WaitResponse;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.DockerClientImpl;
import com.github.dockerjava.core.command.LogContainerResultCallback;
import com.github.dockerjava.httpclient5.ApacheDockerHttpClient;
import com.github.dockerjava.transport.DockerHttpClient;
import com.google.common.flogger.FluentLogger;
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
import org.apache.commons.io.FileUtils;

public class QodanaAnalyzer {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private String resultFolder;
    private String cacheFolder;
    private String qodanaImageName;
    private String resultPathString;
    private boolean removeResultDir = true;
    private String sourceFileRoot;

    private QodanaAnalyzer(Builder builder) {
        this.resultFolder = builder.resultFolder;
        this.cacheFolder = builder.cacheFolder;
        this.qodanaImageName = builder.qodanaImageName;
        this.resultPathString = builder.resultPathString;
        this.removeResultDir = builder.removeResultDir;
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
            throws InterruptedException, IOException {
        HostConfig hostConfig = createHostConfig(sourceRoot);
        CreateContainerResponse container = createQodanaContainer(dockerClient, qodana, hostConfig);
        List<AnalyzerResult> results = startQodanaContainer(dockerClient, container);
        // cleanCaches(sourceRoot);
        return results;
    }

    private void cleanCaches(Path sourceRoot) throws IOException {
        if (removeResultDir) {
            FileUtils.deleteDirectory(stringToFile(resultFolder));
        }
        FileUtils.deleteDirectory(stringToFile(cacheFolder));
        Files.deleteIfExists(Path.of(sourceRoot.toString(), "qodana.yaml"));
    }

    /**
     * Converts the given path as string to a file object
     * @param path  the path as string
     * @return  	the file object
     */
    private File stringToFile(String path) {
        return Path.of(path).toFile();
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
        dockerClient
                .logContainerCmd(container.getId())
                .withStdOut(true)
                .withStdErr(true)
                .exec(new LogContainerResultCallback() {
                    @Override
                    public void onNext(Frame frame) {
                        logger.atInfo().log("%s", frame.toString());
                    }
                });
        dockerClient.startContainerCmd(container.getId()).exec();

        WaitContainerResultCallback exec =
                dockerClient.waitContainerCmd(container.getId()).exec(new WaitContainerResultCallback());
        List<AnalyzerResult> results = new ArrayList<>();
        dockerClient
                .waitContainerCmd(container.getId())
                .exec(new ResultCallbackTemplate<WaitContainerResultCallback, WaitResponse>() {
                    @Override
                    public void onNext(WaitResponse object) {
                        try {
                            exec.awaitCompletion();
                            System.out.println(object.getStatusCode());
                            System.out.println(object.getRawValues());
                            System.out.println("Qodana finished: " + Files.exists(Path.of(resultPathString)));
                            // TODO: remove
                            results.addAll(parseSarif(Path.of(resultPathString)));
                        } catch (IOException | InterruptedException e) {
                            logger.atSevere().withCause(e).log("Could not parse sarif");
                        }
                    }
                })
                .awaitCompletion();
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
        Volume cacheDir = new Volume("/data/cache/");
        Bind bind = new Bind(sourceRoot.toAbsolutePath().toString(), sourceFile);
        Bind resultsBind = new Bind(new File(resultFolder).getAbsolutePath(), targetFile);
        Bind cacheBind = new Bind(new File(cacheFolder).getAbsolutePath(), cacheDir);
        logger.atInfo().log("Bind %s", bind);
        logger.atInfo().log("Bind %s", resultsBind);
        logger.atInfo().log("Bind %s", cacheBind);
        return HostConfig.newHostConfig().withBinds(bind, cacheBind, resultsBind)
        // .withAutoRemove(true)
        ;
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
        // TODO: remove
        try {
            Files.walk(resultPath.getParent()).forEach(System.out::println);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        StringReader reader = new StringReader(Files.readString(resultPath));
        ObjectMapper mapper = new ObjectMapper();
        SarifSchema210 sarif = mapper.readValue(reader, SarifSchema210.class);
        List<AnalyzerResult> results = new ArrayList<>();
        for (Result result : sarif.getRuns().get(0).getResults()) {
            results.add(new QodanaAnalyzerResult(result));
        }
        return results;
    }

    public static class Builder {

        private String resultFolder = "laughing-cache";
        private String cacheFolder = "laughing-cache";
        private String qodanaImageName = "jetbrains/qodana";
        private String resultPathString = resultFolder + "/qodana.sarif.json";
        private boolean removeResultDir = true;
        private String sourceFileRoot = "./src/main/java";

        public Builder withResultFolder(String resultFolder) {
            this.resultFolder = resultFolder;
            this.resultPathString = resultFolder + "/qodana.sarif.json";
            logger.atInfo().log("Result folder set to " + resultFolder);
            logger.atInfo().log("Result path set to " + resultPathString);
            return this;
        }

        public Builder withCacheFolder(String cacheFolder) {
            this.cacheFolder = cacheFolder;
            return this;
        }

        public Builder withQodanaImageName(String qodanaImageName) {
            this.qodanaImageName = qodanaImageName;
            return this;
        }

        public Builder withRemoveResultDir(boolean removeResultDir) {
            this.removeResultDir = removeResultDir;
            return this;
        }

        public Builder withSourceFileRoot(String sourceFileRoot) {
            this.sourceFileRoot = sourceFileRoot;
            return this;
        }

        public QodanaAnalyzer build() {
            return new QodanaAnalyzer(this);
        }
    }
}
