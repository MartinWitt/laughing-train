package xyz.keksdose.spoon.code_solver.api.analyzer;

/**
 * This class represents a position in a text. It is used to identify the position of an element in a source file.
 * @param startLine the line in which the element begins, (1-indexed)
 * @param endLine the line in which the element ends, (1-indexed)
 * @param startColumn the column in which the element begins, (1-indexed)
 * @param endColumn the column in which the element ends, (1-indexed)
 * @param charOffset the offset of the element in the source file, (0-indexed)
 * @param charLength the length of the element in the source file
 */
public record Position(int startLine, int endLine, int startColumn, int endColumn, int charOffset, int charLength) {}
