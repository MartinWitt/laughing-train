package io.github.martinwitt.spoon_analyzer.badsmells.Index_off_replaceable_by_contains;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtType;

public class IndexOfReplaceableByContains implements BadSmell {

    private final CtType<?> affectedType;
    private final CtExpression<?> indexOfCall;
    private final CtExpression<?> minusOne;

    public IndexOfReplaceableByContains(CtType<?> affectedType, CtExpression<?> indexOfCall, CtExpression<?> minusOne) {
        this.affectedType = affectedType;
        this.indexOfCall = indexOfCall;
        this.minusOne = minusOne;
    }

    @Override
    public String getName() {
        return "IndexOfReplaceableByContains";
    }

    @Override
    public String getDescription() {

        return "The indexOf method returns -1 if the substring is not found. This can be replaced by the contains method.";
    }

    @Override
    public CtType<?> getAffectedType() {
        return affectedType;
    }

    /**
     * @return the indexOfCall
     */
    public CtExpression<?> getIndexOfCall() {
        return indexOfCall;
    }
    /**
     * @return the minusOne
     */
    public CtExpression<?> getMinusOne() {
        return minusOne;
    }

    @Override
    public String toString() {
        return "IndexOfReplaceableByContains [affectedType=" + affectedType.getQualifiedName() + ", indexOfCall="
                + indexOfCall + ", minusOne=" + minusOne + "]";
    }

    @Override
    public void fix() {
        new IndexOfReplaceableByContainsAnalyzer().refactor(this);
    }

    @Override
    public boolean isFixable() {
        return true;
    }

    @Override
    public <T> T accept(BadSmellVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
