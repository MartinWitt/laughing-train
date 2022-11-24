package io.github.martinwitt.laughing_train.api.graphql.dto;

import io.github.martinwitt.laughing_train.persistence.BadSmell;
import java.util.List;
import org.eclipse.microprofile.graphql.Name;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@Name("BadSmell")
public class BadSmellGraphQLDto {

    private String identifier;
    private String name;
    private String messageMarkdown;
    private String snippet;
    private String ruleID;
    private List<String> commitHashes;
    private String filePath;
    private Position position;

    @SuppressWarnings("NullAway")
    public BadSmellGraphQLDto() {}

    public BadSmellGraphQLDto(BadSmell badSmell) {
        this.identifier = badSmell.getIdentifier();
        this.name = badSmell.getAnalyzer();
        this.messageMarkdown = badSmell.messageMarkdown();
        this.snippet = badSmell.snippet();
        this.ruleID = badSmell.ruleID().ruleID();
        this.commitHashes = List.of(badSmell.getCommitHash());
        this.filePath = badSmell.filePath();
        this.position = badSmell.position();
    }

    /**
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @param identifier the identifier to set
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the messageMarkdown
     */
    public String getMessageMarkdown() {
        return messageMarkdown;
    }

    /**
     * @param messageMarkdown the messageMarkdown to set
     */
    public void setMessageMarkdown(String messageMarkdown) {
        this.messageMarkdown = messageMarkdown;
    }

    /**
     * @return the snippet
     */
    public String getSnippet() {
        return snippet;
    }

    /**
     * @param snippet the snippet to set
     */
    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    /**
     * @return the ruleID
     */
    public String getRuleID() {
        return ruleID;
    }

    /**
     * @param ruleID the ruleID to set
     */
    public void setRuleID(String ruleID) {
        this.ruleID = ruleID;
    }

    /**
     * @return the commitHashes
     */
    public List<String> getCommitHashes() {
        return commitHashes;
    }

    /**
     * @param commitHashes the commitHashes to set
     */
    public void setCommitHashes(List<String> commitHashes) {
        this.commitHashes = commitHashes;
    }

    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }
}
