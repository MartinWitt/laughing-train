
package xyz.keksdose.spoon.code_solver.analyzer.qodana;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.contrastsecurity.sarif.Result;
import com.contrastsecurity.sarif.SarifSchema210;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.command.WaitContainerResultCallback;
import com.github.dockerjava.api.model.Bind;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.api.model.Image;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.DockerClientImpl;
import com.github.dockerjava.httpclient5.ApacheDockerHttpClient;
import com.github.dockerjava.transport.DockerHttpClient;
import com.google.common.flogger.FluentLogger;

class QodanaRunner {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();
	private String qodanaImageName = "jetbrains/qodana-jvm-community:2021.3";
	private String resultPathString = "./results/qodana.sarif.json";

	public List<Result> runQodana(Path sourceRoot) {
		logger.atInfo().log("Running Qodana on %s", sourceRoot);
		try {
			sourceRoot = fixWindowsPath(sourceRoot);
			File qodanaRules = new File(this.getClass().getResource("/qodana.yml").toURI());
			File copyQodanaRules = new File(sourceRoot.toString(), "qodana.yaml");
			Files.writeString(copyQodanaRules.toPath(), Files.readString(qodanaRules.toPath()),
				StandardOpenOption.CREATE);

		}
		catch (URISyntaxException | IOException e1) {
			logger.atSevere().withCause(e1).log("Could not write qodana.yaml");
		}
		DockerClientConfig standard = DefaultDockerClientConfig.createDefaultConfigBuilder().build();
		DockerHttpClient httpClient = createHttpClient(standard);
		try (DockerClient dockerClient = DockerClientImpl.getInstance(standard, httpClient);) {
			Path resultPath = Path.of(resultPathString);
			if (resultPath.toFile().exists()) {
				return parseSarif(resultPath);
			}
			Optional<Image> qodana = findQodanaImage(dockerClient);
			if (qodana.isPresent()) {
				HostConfig hostConfig = createHostConfig(sourceRoot);
				CreateContainerResponse container = createQodanaContainer(dockerClient, qodana, hostConfig);
				startQodanaContainer(dockerClient, container);
				cleanUpContainer(dockerClient, container);
				Files.deleteIfExists(Path.of(sourceRoot.toString(), "qodana.yaml"));
				return parseSarif(resultPath);
			}
		}
		catch (Exception e) {
			logger.atSevere().withCause(e).log("Error running qodana");
		}
		return List.of();
	}

	private void cleanUpContainer(DockerClient dockerClient, CreateContainerResponse container) {
		dockerClient.removeContainerCmd(container.getId()).exec();
	}

	private void startQodanaContainer(DockerClient dockerClient, CreateContainerResponse container)
			throws InterruptedException {
		dockerClient.startContainerCmd(container.getId()).exec();
		WaitContainerResultCallback exec = dockerClient.waitContainerCmd(container.getId())
				.exec(new WaitContainerResultCallback());
		exec.awaitCompletion();
	}

	private CreateContainerResponse createQodanaContainer(DockerClient dockerClient, Optional<Image> qodana,
			HostConfig hostConfig) {
		return dockerClient.createContainerCmd(qodana.get().getId())
				.withHostConfig(hostConfig)
				.withAttachStderr(true)
				.withAttachStdout(true)
				.withCmd("-d", "./src/main/java")
				.exec();
	}

	private HostConfig createHostConfig(Path sourceRoot) {
		Volume sourceFile = new Volume("/data/project/");
		Volume targetFile = new Volume("/data/results/");
		Bind bind = new Bind(sourceRoot.toFile().getAbsolutePath(), sourceFile);
		Bind resultsBind = new Bind(new File("./results").getAbsolutePath(), targetFile);
		return HostConfig.newHostConfig().withBinds(bind, resultsBind);
	}

	private Optional<Image> findQodanaImage(DockerClient dockerClient) {
		List<Image> images = dockerClient.listImagesCmd().exec();
		return images.stream().filter(v -> Arrays.asList(v.getRepoTags()).contains(qodanaImageName)).findFirst();
	}

	private ApacheDockerHttpClient createHttpClient(DockerClientConfig standard) {
		return new ApacheDockerHttpClient.Builder().dockerHost(standard.getDockerHost())
				.sslConfig(standard.getSSLConfig())
				.maxConnections(100)
				.connectionTimeout(Duration.ofSeconds(30))
				.responseTimeout(Duration.ofSeconds(45))
				.build();
	}

	private Path fixWindowsPath(Path sourceRoot) {
		if (sourceRoot.toFile().toPath().toString().endsWith(Path.of("/src/main/java").toString())) {
			if (sourceRoot.getRoot() == null) {
				sourceRoot = sourceRoot.subpath(0, sourceRoot.getNameCount() - 3);
			}
			else {
				sourceRoot = Paths.get(sourceRoot.getRoot().toString(),
					sourceRoot.subpath(0, sourceRoot.getNameCount() - 3).toString());
			}
		}
		return sourceRoot;
	}

	private List<Result> parseSarif(Path resultPath) throws IOException {
		StringReader reader = new StringReader(Files.readString(resultPath));
		ObjectMapper mapper = new ObjectMapper();
		SarifSchema210 sarif = mapper.readValue(reader, SarifSchema210.class);
		return sarif.getRuns().get(0).getResults();
	}
}
