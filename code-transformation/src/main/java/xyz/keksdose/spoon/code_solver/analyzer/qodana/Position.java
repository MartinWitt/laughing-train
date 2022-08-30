package xyz.keksdose.spoon.code_solver.analyzer.qodana;

public record Position(int startLine, int endLine, int startColumn, int endColumn, int charOffset, int charLength) {}
