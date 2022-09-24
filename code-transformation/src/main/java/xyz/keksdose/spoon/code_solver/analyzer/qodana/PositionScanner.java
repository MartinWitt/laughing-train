package xyz.keksdose.spoon.code_solver.analyzer.qodana;

import java.util.ArrayList;
import java.util.List;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.path.CtRole;
import spoon.reflect.visitor.EarlyTerminatingScanner;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

public class PositionScanner extends EarlyTerminatingScanner<List<CtElement>> {

    private int startLine;
    private int startColumn;
    private int endLine;
    private int endColumn;
    private int charOffset;
    private int charLength;

    public PositionScanner(Position position) {
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
        if (element.getPosition().isValidPosition()) {
            if (element.getPosition().getLine() == startLine)
                if (Math.abs(element.getPosition().getSourceStart() - charOffset) < 2) {
                    if (element.getPosition().getEndLine() == endLine || endLine == 0) {
                        if (element.getPosition().getColumn() == startColumn)
                            if (element.getPosition().getEndColumn() == endColumn || endColumn == 0) {
                                if (element.getPosition().getSourceEnd() == charLength || charLength == 0) {
                                    getResult().add(element);
                                }
                            }
                    }
                }
        }
        super.onElement(role, element);
    }
}
