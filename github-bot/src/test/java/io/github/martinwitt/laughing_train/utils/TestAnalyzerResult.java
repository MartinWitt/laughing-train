package io.github.martinwitt.laughing_train.utils;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

/**
 * This mocks a result from an analyzer.
 */
public class TestAnalyzerResult implements AnalyzerResult {

    private String analyzer;
    private RuleId ruleID;
    private String filePath;
    private Position position;
    private String message;

    public TestAnalyzerResult(RuleId ruleID, String filePath, Position position, String message) {
        this.analyzer = "JUNIT";
        this.ruleID = ruleID;
        this.filePath = filePath;
        this.position = position;
        this.message = message;
    }

    public TestAnalyzerResult(String filePath, Position position) {
        this.analyzer = "JUNIT";
        this.filePath = filePath;
        this.position = position;
    }

    @Override
    public String getAnalyzer() {
        return analyzer;
    }

    @Override
    public RuleId ruleID() {
        return ruleID;
    }

    @Override
    public String filePath() {
        return filePath;
    }

    @Override
    public Position position() {
        return position;
    }

    @Override
    public String message() {
        return message;
    }

    @Override
    public String messageMarkdown() {
        return message;
    }

    @Override
    public String snippet() {
        return "";
    }
}
