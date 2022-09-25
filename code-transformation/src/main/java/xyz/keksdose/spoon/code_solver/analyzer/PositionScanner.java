package xyz.keksdose.spoon.code_solver.analyzer;

import java.util.ArrayList;
import java.util.List;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.path.CtRole;
import spoon.reflect.visitor.EarlyTerminatingScanner;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

/**
 * This class matches AST elements with a given position {@link Position}.
 * {@link PositionScanner#findLineOnly(CtElement, Position)} only matches elements that are on the same line as the given position.
 * {@link PositionScanner#find(CtElement, Position)} matches elements that are exactly on the given position.
 */
public class PositionScanner extends EarlyTerminatingScanner<List<CtElement>> {

    private int startLine;
    private int startColumn;
    private int endLine;
    private int endColumn;
    private int charOffset;
    private int charLength;
    /**
     * Searches for all elements that are on the given position. This search visits the subtree of the given element.
     * @param element  the element to search in. This element is also included in the result.
     * @param position  the position to search for
     * @return  a list of all elements that are on the given position. This list is never null.
     */
    public static List<CtElement> find(CtElement element, Position position) {
        PositionScanner scanner = new PositionScanner(position);
        scanner.scan(element);
        return scanner.getResult();
    }
    /**
     * Searches for all elements that are on the same line as the given position. This search visits the subtree of the given element.
     * @param element  the element to search in. This element is also included in the result.
     * @param position  the position to search for
     * @return  a list of all elements that are on the same line as the given position. Never null.
     */
    public static List<CtElement> findLineOnly(CtElement element, Position position) {
        PositionScanner scanner = new PositionScanner(position);
        scanner.charOffset = 0;
        scanner.charLength = 0;
        scanner.startColumn = 0;
        scanner.scan(element);
        return scanner.getResult();
    }

    private PositionScanner(Position position) {
        this.startLine = position.startLine();
        this.startColumn = position.startColumn();
        this.endLine = position.endLine();
        this.endColumn = position.endColumn();
        this.charOffset = position.charOffset();
        this.charLength = position.charLength();
        setResult(new ArrayList<>());
    }

    @Override
    protected void onElement(CtRole role, CtElement element) {
        if (hasValidPosition(element)
                && matchesStartLine(element)
                && matchesSourceStart(element)
                && matchesEndLineIfSet(element)
                && matchesColumn(element)
                && matchesEndcolumn(element)
                && matchesSourceEnd(element)) {
            getResult().add(element);
        }
        super.onElement(role, element);
    }

    private boolean matchesSourceEnd(CtElement element) {
        return element.getPosition().getSourceEnd() == charLength || charLength == 0;
    }

    private boolean matchesEndcolumn(CtElement element) {
        return element.getPosition().getEndColumn() == endColumn || endColumn == 0;
    }

    private boolean matchesColumn(CtElement element) {
        return element.getPosition().getColumn() == startColumn || startColumn == 0;
    }

    private boolean matchesSourceStart(CtElement element) {
        return Math.abs(element.getPosition().getSourceStart() - charOffset) < 2 || charOffset == 0;
    }

    private boolean matchesEndLineIfSet(CtElement element) {
        return element.getPosition().getEndLine() == endLine || endLine == 0;
    }

    private boolean matchesStartLine(CtElement element) {
        return element.getPosition().getLine() == startLine;
    }

    private boolean hasValidPosition(CtElement element) {
        return element.getPosition().isValidPosition();
    }
}
