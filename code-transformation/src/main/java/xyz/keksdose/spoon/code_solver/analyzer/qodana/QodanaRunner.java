
package xyz.keksdose.spoon.code_solver.analyzer.qodana;

import java.io.File;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

public class QodanaRunner {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();

	public List<Result> runQodana(Path sourceRoot) {
		try {
			Path resultPath = Path.of("./results/qodana.sarif.json");
			if (resultPath.toFile().exists()) {
				StringReader reader = new StringReader(Files.readString(resultPath));
				ObjectMapper mapper = new ObjectMapper();
				SarifSchema210 sarif = mapper.readValue(reader, SarifSchema210.class);
				return sarif.getRuns().get(0).getResults();
			}
			DockerClientConfig standard = DefaultDockerClientConfig.createDefaultConfigBuilder().build();
			DockerHttpClient httpClient = new ApacheDockerHttpClient.Builder().dockerHost(standard.getDockerHost())
					.sslConfig(standard.getSSLConfig())
					.maxConnections(100)
					.connectionTimeout(Duration.ofSeconds(30))
					.responseTimeout(Duration.ofSeconds(45))
					.build();
			DockerClient dockerClient = DockerClientImpl.getInstance(standard, httpClient);
			List<Image> images = dockerClient.listImagesCmd().exec();
			Optional<Image> qodana = images.stream()
					.filter(v -> Arrays.asList(v.getRepoTags()).contains("jetbrains/qodana-jvm-community:2021.2"))
					.findFirst();
			if (qodana.isPresent()) {
				Volume sourceFile = new Volume("/data/project/");
				Volume targetFile = new Volume("/data/results/");
				if (sourceRoot.toFile().toPath().toString().endsWith(Path.of("/src/main/java").toString())) {
					if (sourceRoot.getRoot() == null) {
						sourceRoot = sourceRoot.subpath(0, sourceRoot.getNameCount() - 3);
					}
					else {
						sourceRoot = Paths.get(sourceRoot.getRoot().toString(),
							sourceRoot.subpath(0, sourceRoot.getNameCount() - 3).toString());
					}
				}
				Bind bind = new Bind(sourceRoot.toFile().getAbsolutePath(), sourceFile);
				Bind resultsBind = new Bind(new File("./results").getAbsolutePath(), targetFile);
				HostConfig hostConfig = HostConfig.newHostConfig().withBinds(bind, resultsBind);
				CreateContainerResponse container = dockerClient.createContainerCmd(qodana.get().getId())
						.withHostConfig(hostConfig)
						.withAttachStderr(true)
						.withAttachStdout(true)
						.withCmd("-d", "./src/main/java")
						.exec();
				dockerClient.startContainerCmd(container.getId()).exec();
				WaitContainerResultCallback exec = dockerClient.waitContainerCmd(container.getId())
						.exec(new WaitContainerResultCallback());
				exec.awaitCompletion();
				dockerClient.removeContainerCmd(container.getId()).exec();
				StringReader reader = new StringReader(Files.readString(resultPath));
				ObjectMapper mapper = new ObjectMapper();
				SarifSchema210 sarif = mapper.readValue(reader, SarifSchema210.class);
				return sarif.getRuns().get(0).getResults();
			}
		}
		catch (Exception e) {
			logger.atSevere().withCause(e).log("Error running qodana");
		}
		return List.of();
	}
}
