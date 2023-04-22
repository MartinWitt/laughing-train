package io.github.martinwitt.laughing_train.github_miner;

import io.github.martinwitt.laughing_train.github_miner.usecase.SearchProjectOnGithub;
import io.github.martinwitt.laughing_train.github_miner.usecase.StoreProject;
import io.quarkus.logging.Log;
import io.quarkus.scheduler.Scheduled;

public class Application {

    private final SearchProjectOnGithub searchProjectOnGithub;
    private final StoreProject storeProject;

    Application(SearchProjectOnGithub searchProjectOnGithub, StoreProject storeProject) {
        this.searchProjectOnGithub = searchProjectOnGithub;
        this.storeProject = storeProject;
    }

    @Scheduled(every = "5m", delay = 3)
    void searchProjectsOnGitHub() {
        searchProjectOnGithub
                .searchProjectOnGithub()
                .onItem()
                .transformToUni(storeProject::storeProject)
                .subscribe()
                .with(
                        project -> Log.info("Stored project"),
                        failure -> Log.info("Failed to store project: " + failure.getMessage()));
    }
}
