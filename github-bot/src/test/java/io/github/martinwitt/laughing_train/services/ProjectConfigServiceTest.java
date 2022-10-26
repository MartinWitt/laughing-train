package io.github.martinwitt.laughing_train.services;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.martinwitt.laughing_train.data.FindProjectConfigRequest;
import io.github.martinwitt.laughing_train.data.FindProjectConfigResult;
import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.quarkus.test.junit.QuarkusTest;
import javax.inject.Inject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ProjectConfigServiceTest {

    @Inject
    ProjectConfigService projectConfigService;

    @AfterEach
    void clearDataBase() {
        ProjectConfig.deleteAll();
    }

    @Test
    void emptyMessageReturnsNotfound() throws Throwable {

        FindProjectConfigRequest message = new FindProjectConfigRequest.ByProjectUrl("spoon.not.found");
        assertThat(projectConfigService.getConfig(message)).isInstanceOf(FindProjectConfigResult.NotFound.class);
    }

    @Test
    void defaultSrcFolderIsPoint() throws Throwable {
        ProjectConfig config = ProjectConfig.ofProjectUrl("spoon.github.com");
        config.persist();
        FindProjectConfigRequest message = new FindProjectConfigRequest.ByProjectUrl("spoon.github.com");
        assertThat(projectConfigService.getConfig(message)).isInstanceOf(FindProjectConfigResult.SingleResult.class);
        FindProjectConfigResult.SingleResult result =
                (FindProjectConfigResult.SingleResult) projectConfigService.getConfig(message);
        assertThat(result.projectConfig().getSourceFolder()).isEqualTo(".");
    }

    @Test
    void persistWithSourceFolder() throws Throwable {
        ProjectConfig config = ProjectConfig.ofProjectUrl("spoon.github.com");
        config.setSourceFolder("src/main/java");
        config.persist();
        FindProjectConfigRequest message = new FindProjectConfigRequest.ByProjectUrl("spoon.github.com");
        assertThat(projectConfigService.getConfig(message)).isInstanceOf(FindProjectConfigResult.SingleResult.class);
        FindProjectConfigResult.SingleResult result =
                (FindProjectConfigResult.SingleResult) projectConfigService.getConfig(message);
        assertThat(result.projectConfig().getSourceFolder()).isEqualTo("src/main/java");
    }

    @Test
    void updateSourceFolder() throws Throwable {
        ProjectConfig config = ProjectConfig.ofProjectUrl("spoon.github.com");
        config.setSourceFolder("src/main/java");
        config.persist();
        FindProjectConfigRequest message = new FindProjectConfigRequest.ByProjectUrl("spoon.github.com");
        assertThat(projectConfigService.getConfig(message)).isInstanceOf(FindProjectConfigResult.SingleResult.class);
        FindProjectConfigResult.SingleResult result =
                (FindProjectConfigResult.SingleResult) projectConfigService.getConfig(message);
        assertThat(result.projectConfig().getSourceFolder()).isEqualTo("src/main/java");
        config.setSourceFolder("src/main/java2");
        config.persistOrUpdate();
        assertThat(projectConfigService.getConfig(message)).isInstanceOf(FindProjectConfigResult.SingleResult.class);
        result = (FindProjectConfigResult.SingleResult) projectConfigService.getConfig(message);
        assertThat(result.projectConfig().getSourceFolder()).isEqualTo("src/main/java2");
    }
}
