package io.github.martinwitt.laughing_train.github_miner.data;

import io.quarkus.mongodb.panache.common.MongoEntity;
import java.util.Objects;
import org.bson.types.ObjectId;

@MongoEntity(collection = "GitHubProjects", database = "LaughingTrain")
public class GitHubProject {
    public ObjectId id;
    private String repositoryName;
    private String repositoryOwner;
    private String repositoryUrl;
    private String repositoryDescription;
    private String repositoryLanguage;
    private String apiURL;

    public GitHubProject() {
        // default constructor for MongoDB
    }

    public GitHubProject(
            String repositoryName,
            String repositoryOwner,
            String repositoryUrl,
            String repositoryDescription,
            String repositoryLanguage,
            String apiURL) {
        this.repositoryName = repositoryName;
        this.repositoryOwner = repositoryOwner;
        this.repositoryUrl = repositoryUrl;
        this.repositoryDescription = repositoryDescription;
        this.repositoryLanguage = repositoryLanguage;
        this.apiURL = apiURL;
    }
    /**
     * @return the repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * @return the repositoryOwner
     */
    public String getRepositoryOwner() {
        return repositoryOwner;
    }

    /**
     * @return the apiURL
     */
    public String getApiURL() {
        return apiURL;
    }
    /**
     * @return the repositoryDescription
     */
    public String getRepositoryDescription() {
        return repositoryDescription;
    }
    /**
     * @return the repositoryLanguage
     */
    public String getRepositoryLanguage() {
        return repositoryLanguage;
    }

    /**
     * @return the repositoryUrl
     */
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public ObjectId getId() {
        return this.id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public void setRepositoryOwner(String repositoryOwner) {
        this.repositoryOwner = repositoryOwner;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public void setRepositoryDescription(String repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
    }

    public void setRepositoryLanguage(String repositoryLanguage) {
        this.repositoryLanguage = repositoryLanguage;
    }

    public void setApiURL(String apiURL) {
        this.apiURL = apiURL;
    }

    /**
     * Updates the project with the values of the given project
     * @param project  the project to update from
     * @return      the updated project
     */
    public GitHubProject update(GitHubProject project) {
        this.repositoryName = project.getRepositoryName();
        this.repositoryOwner = project.getRepositoryOwner();
        this.repositoryUrl = project.getRepositoryUrl();
        this.repositoryDescription = project.getRepositoryDescription();
        this.repositoryLanguage = project.getRepositoryLanguage();
        this.apiURL = project.getApiURL();

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GitHubProject)) {
            return false;
        }
        GitHubProject gitHubProject = (GitHubProject) o;
        return Objects.equals(repositoryName, gitHubProject.repositoryName)
                && Objects.equals(repositoryOwner, gitHubProject.repositoryOwner)
                && Objects.equals(repositoryUrl, gitHubProject.repositoryUrl)
                && Objects.equals(repositoryDescription, gitHubProject.repositoryDescription)
                && Objects.equals(repositoryLanguage, gitHubProject.repositoryLanguage)
                && Objects.equals(apiURL, gitHubProject.apiURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                repositoryName, repositoryOwner, repositoryUrl, repositoryDescription, repositoryLanguage, apiURL);
    }

    @Override
    public String toString() {
        return "{" + " repositoryName='"
                + getRepositoryName() + "'" + ", repositoryOwner='"
                + getRepositoryOwner() + "'" + ", repositoryUrl='"
                + getRepositoryUrl() + "'" + ", repositoryDescription='"
                + getRepositoryDescription() + "'" + ", repositoryLanguage='"
                + getRepositoryLanguage() + "'" + ", apiURL='"
                + getApiURL() + "'" + "}";
    }
}
