package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import com.google.common.flogger.FluentLogger;
import com.google.common.flogger.StackSize;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import io.github.martinwitt.spoon_analyzer.badsmells.Index_off_replaceable_by_contains.IndexOfReplaceableByContains;
import io.github.martinwitt.spoon_analyzer.badsmells.access_static_via_instance.AccessStaticViaInstance;
import io.github.martinwitt.spoon_analyzer.badsmells.array_can_be_replaced_with_enum_values.ArrayCanBeReplacedWithEnumValues;
import io.github.martinwitt.spoon_analyzer.badsmells.charset_object_can_be_used.CharsetObjectCanBeUsed;
import io.github.martinwitt.spoon_analyzer.badsmells.final_static_method.FinalStaticMethod;
import io.github.martinwitt.spoon_analyzer.badsmells.innerclass_may_be_static.InnerClassMayBeStatic;
import io.github.martinwitt.spoon_analyzer.badsmells.non_protected_constructor_In_abstract_class.NonProtectedConstructorInAbstractClass;
import io.github.martinwitt.spoon_analyzer.badsmells.private_final_method.PrivateFinalMethod;
import io.github.martinwitt.spoon_analyzer.badsmells.size_replaceable_by_is_empty.SizeReplaceableByIsEmpty;
import io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_implements.UnnecessaryImplements;
import io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_tostring.UnnecessaryTostring;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;

class AnalyzerResultVisitor implements BadSmellVisitor<AnalyzerResult> {

    private static final AnalyzerResultVisitor analyzerResultVisitor = new AnalyzerResultVisitor();
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public static Optional<AnalyzerResult> toAnalyzerResult(BadSmell badSmell) {
        try {
            return Optional.ofNullable(badSmell.accept(analyzerResultVisitor));

        } catch (Exception e) {
            logger.atWarning().withCause(e).withStackTrace(StackSize.NONE).log(
                    "Could not convert bad smell to analyzer result %s",
                    badSmell.getClass().getCanonicalName());
            return Optional.empty();
        }
    }

    private AnalyzerResultVisitor() {}

    @Override
    public AnalyzerResult visit(IndexOfReplaceableByContains badSmell) {
        return toSpoonAnalyzerResult(
                badSmell,
                badSmell.getIndexOfCall().getPosition(),
                trygetOriginalSourceCode(badSmell.getIndexOfCall())
                        .orElse(badSmell.getIndexOfCall()
                                .getParent(CtBinaryOperator.class)
                                .toString()));
    }

    private String getAbsolutePath(BadSmell badSmell) {
        return badSmell.getAffectedType().getPosition().getFile().getAbsolutePath();
    }

    private Position toPosition(SourcePosition position) {
        int sourceStart = position.getSourceStart();
        int sourceEnd = position.getSourceEnd();
        int line = position.getLine();
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
        String snippet = trygetOriginalSourceCode(badSmell.getAffectedCtInvocation())
                .orElse(badSmell.getAffectedCtInvocation().toString());
        return toSpoonAnalyzerResult(
                badSmell, badSmell.getAffectedCtInvocation().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(ArrayCanBeReplacedWithEnumValues badSmell) {
        String snippet = trygetOriginalSourceCode(badSmell.getAffectedElement())
                .orElse(badSmell.getAffectedElement().toString());
        return toSpoonAnalyzerResult(badSmell, badSmell.getAffectedElement().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(CharsetObjectCanBeUsed badSmell) {
        if (badSmell.getInvocation() != null) {
            String snippet = trygetOriginalSourceCode(badSmell.getInvocation())
                    .orElse(badSmell.getInvocation().toString());
            return toSpoonAnalyzerResult(badSmell, badSmell.getInvocation().getPosition(), snippet);
        } else {
            String snippet = trygetOriginalSourceCode(badSmell.getCtorCall())
                    .orElse(badSmell.getCtorCall().toString());
            return toSpoonAnalyzerResult(badSmell, badSmell.getCtorCall().getPosition(), snippet);
        }
    }

    @Override
    public AnalyzerResult visit(InnerClassMayBeStatic badSmell) {
        CtType<?> clone = badSmell.getAffectedType().clone();
        clone.setTypeMembers(new ArrayList<>());
        String snippet = clone.toString();
        return toSpoonAnalyzerResult(badSmell, badSmell.getInnerClass().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(NonProtectedConstructorInAbstractClass badSmell) {
        String snippet = trygetOriginalSourceCode(badSmell.getCtConstructor())
                .orElse(badSmell.getCtConstructor().toString());
        return toSpoonAnalyzerResult(badSmell, badSmell.getCtConstructor().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(PrivateFinalMethod badSmell) {
        String snippet = trygetOriginalSourceCode(badSmell.getAffectedMethod())
                .orElse(badSmell.getAffectedMethod().toString());
        return toSpoonAnalyzerResult(badSmell, badSmell.getAffectedMethod().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(SizeReplaceableByIsEmpty badSmell) {
        String snippet = trygetOriginalSourceCode(badSmell.getSizeInvocation())
                .orElse(badSmell.getSizeInvocation().toString());
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
        String snippet = trygetOriginalSourceCode(badSmell.getNotNeededTostring())
                .orElse(badSmell.getNotNeededTostring().toString());
        return toSpoonAnalyzerResult(badSmell, badSmell.getNotNeededTostring().getPosition(), snippet);
    }

    @Override
    public AnalyzerResult visit(FinalStaticMethod badSmell) {
        String snippet = badSmell.getMethod().getSignature();
        return toSpoonAnalyzerResult(badSmell, badSmell.getMethod().getPosition(), snippet);
    }

    private Optional<String> trygetOriginalSourceCode(CtElement element) {
        try {
            File file = element.getPosition().getCompilationUnit().getFile();
            String sourceCode = Files.readString(file.toPath());
            int lineNumber = element.getPosition().getLine();

            // Split the source code into lines
            String[] lines = sourceCode.split("\\r?\\n");

            // Extract the two lines before and after the given line number
            int startIndex = Math.max(0, lineNumber - 3);
            int endIndex = Math.min(lines.length - 1, lineNumber + 2);
            String context = String.join("\n", Arrays.copyOfRange(lines, startIndex, endIndex + 1));

            return Optional.ofNullable(context);
        } catch (Throwable e) {
            return Optional.empty();
        }
    }
}
