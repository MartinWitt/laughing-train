package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import io.github.martinwitt.spoon_analyzer.badsmells.Index_off_replaceable_by_contains.IndexOfReplaceableByContains;
import io.github.martinwitt.spoon_analyzer.badsmells.access_static_via_instance.AccessStaticViaInstance;
import io.github.martinwitt.spoon_analyzer.badsmells.array_can_be_replaced_with_enum_values.ArrayCanBeReplacedWithEnumValues;
import io.github.martinwitt.spoon_analyzer.badsmells.charset_object_can_be_used.CharsetObjectCanBeUsed;
import io.github.martinwitt.spoon_analyzer.badsmells.innerclass_may_be_static.InnerClassMayBeStatic;
import io.github.martinwitt.spoon_analyzer.badsmells.non_protected_constructor_In_abstract_class.NonProtectedConstructorInAbstractClass;
import io.github.martinwitt.spoon_analyzer.badsmells.private_final_method.PrivateFinalMethod;
import io.github.martinwitt.spoon_analyzer.badsmells.size_replaceable_by_is_empty.SizeReplaceableByIsEmpty;
import io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_implements.UnnecessaryImplements;
import io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_tostring.UnnecessaryTostring;
import java.util.ArrayList;
import java.util.Optional;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtType;

class AnalyzerResultVisitor implements BadSmellVisitor<AnalyzerResult> {

    private static AnalyzerResultVisitor analyzerResultVisitor = new AnalyzerResultVisitor();

    public static Optional<AnalyzerResult> toAnalyzerResult(BadSmell badSmell) {
        return Optional.ofNullable(badSmell.accept(analyzerResultVisitor));
    }

    private AnalyzerResultVisitor() {}

    @Override
    public AnalyzerResult emptyResult() {
        return null;
    }

    @Override
    public AnalyzerResult visit(IndexOfReplaceableByContains badSmell) {
        return toSpoonAnalyzerResult(
                badSmell,
                badSmell.getIndexOfCall().getPosition(),
                badSmell.getIndexOfCall()
                        .getParent(CtBinaryOperator.class)
                        .getOriginalSourceFragment()
                        .toString());
    }

    private String getAbsolutePath(BadSmell badSmell) {
        return badSmell.getAffectedType().getPosition().getFile().getAbsolutePath();
    }

    private Position toPosition(SourcePosition position) {
        int sourceStart = position.getSourceStart();
        int sourceEnd = position.getSourceEnd();
        int line = position.getLine();
        ;
        int column = position.getColumn();
        int endColumn = position.getEndColumn();
        int endLine = position.getEndLine();
        return new Position(line, endLine, column, endColumn, sourceStart, sourceEnd - sourceStart);
    }

    public AnalyzerResult toSpoonAnalyzerResult(BadSmell badSmell, SourcePosition position, String snippet) {
        String absolutePath = getAbsolutePath(badSmell);
        RuleId ruleId = new RuleId(badSmell.getName());
        return new SpoonAnalyzerResult(
                ruleId,
                absolutePath,
                toPosition(position),
                badSmell.getDescription(),
                badSmell.getDescription(),
                snippet);
    }

    @Override
    public AnalyzerResult visit(AccessStaticViaInstance badSmell) {
        String snippet =
                badSmell.getAffectedCtInvocation().getOriginalSourceFragment().toString();
        return toSpoonAnalyzerResult(
                badSmell, badSmell.getAffectedCtInvocation().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(ArrayCanBeReplacedWithEnumValues badSmell) {
        String snippet =
                badSmell.getAffectedElement().getOriginalSourceFragment().toString();
        return toSpoonAnalyzerResult(badSmell, badSmell.getAffectedElement().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(CharsetObjectCanBeUsed badSmell) {
        if (badSmell.getInvocation() != null) {
            String snippet =
                    badSmell.getInvocation().getOriginalSourceFragment().toString();
            return toSpoonAnalyzerResult(badSmell, badSmell.getInvocation().getPosition(), snippet);
        } else {
            String snippet = badSmell.getCtorCall().getOriginalSourceFragment().toString();
            return toSpoonAnalyzerResult(badSmell, badSmell.getCtorCall().getPosition(), snippet);
        }
    }

    @Override
    public AnalyzerResult visit(InnerClassMayBeStatic badSmell) {
        CtType<?> clone = badSmell.getAffectedType().clone();
        clone.setTypeMembers(new ArrayList<>());
        String snippet = clone.toString();
        return toSpoonAnalyzerResult(badSmell, badSmell.getAffectedType().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(NonProtectedConstructorInAbstractClass badSmell) {
        String snippet = badSmell.getCtConstructor().getOriginalSourceFragment().toString();
        return toSpoonAnalyzerResult(badSmell, badSmell.getCtConstructor().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(PrivateFinalMethod badSmell) {
        String snippet =
                badSmell.getAffectedMethod().getOriginalSourceFragment().toString();
        return toSpoonAnalyzerResult(badSmell, badSmell.getAffectedMethod().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(SizeReplaceableByIsEmpty badSmell) {
        String snippet =
                badSmell.getSizeInvocation().getOriginalSourceFragment().toString();
        return toSpoonAnalyzerResult(badSmell, badSmell.getSizeInvocation().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(UnnecessaryImplements badSmell) {

        CtType<?> clone = badSmell.getAffectedType().clone();
        clone.setTypeMembers(new ArrayList<>());
        String snippet = clone.toString();
        return toSpoonAnalyzerResult(badSmell, badSmell.getAffectedType().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(UnnecessaryTostring badSmell) {
        String snippet =
                badSmell.getNotNeededTostring().getOriginalSourceFragment().toString();
        return toSpoonAnalyzerResult(badSmell, badSmell.getNotNeededTostring().getPosition(), snippet);
    }
}
