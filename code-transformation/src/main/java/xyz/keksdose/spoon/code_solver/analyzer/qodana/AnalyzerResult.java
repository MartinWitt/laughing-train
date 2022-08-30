package xyz.keksdose.spoon.code_solver.analyzer.qodana;

public interface AnalyzerResult {

    String getAnalyzer();

    public String ruleID();

    public String filePath();

    public Position position();

    public String message();

    public String messageMarkdown();

    public String snippet();
}
