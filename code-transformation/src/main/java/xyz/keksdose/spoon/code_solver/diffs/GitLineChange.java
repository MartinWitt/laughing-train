package xyz.keksdose.spoon.code_solver.diffs;

/**
 * This represents a change in a line of code. Old content is the content of the line before the
 * change. New content is the content of the line after the change. Line number is the line number
 * of the change and larger than 0.
 */
public record GitLineChange(int lineNumber, String oldContent, String newContent) {}
