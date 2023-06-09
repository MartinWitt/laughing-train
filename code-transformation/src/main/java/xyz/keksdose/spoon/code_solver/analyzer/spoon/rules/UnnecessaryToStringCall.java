package xyz.keksdose.spoon.code_solver.analyzer.spoon.rules;

import static xyz.keksdose.spoon.code_solver.history.MarkdownString.fromMarkdown;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.template.TemplateMatcher;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.AbstractSpoonRuleAnalyzer;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonAnalyzerResult;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.TemplateHelper;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnnecessaryToStringCall implements AbstractSpoonRuleAnalyzer {

    private static final List<TemplateMatcher> templates = createPattern();
    private static final BadSmell UNNECESSARY_TO_STRING_CALL = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("UnnecessaryToStringCall");
        }

        @Override
        public MarkdownString getDescription() {
            return fromMarkdown(
                    "The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.");
        }
    };

    @Override
    public List<BadSmell> getHandledBadSmells() {
        throw new UnsupportedOperationException("Unimplemented method 'getHandledBadSmells'");
    }

    @Override
    public List<SpoonAnalyzerResult> analyze(CtType<?> type) {
        List<SpoonAnalyzerResult> results = new ArrayList<>();
        List<CtElement> matches = new ArrayList<>();
        for (TemplateMatcher templateMatcher : templates) {
            templateMatcher.find(type).forEach(matches::add);
        }
        for (CtElement ctElement : matches) {
            String filePath = ctElement.getPosition().getFile().getAbsolutePath();
            Position position = createPosition(ctElement);
            String snippet = ctElement.toString();
            RuleId ruleId = new RuleId(UNNECESSARY_TO_STRING_CALL.getName().asText());
            String message = UNNECESSARY_TO_STRING_CALL.getDescription().asText();
            String messageMarkdown = UNNECESSARY_TO_STRING_CALL.getDescription().asMarkdown();
            results.add(new SpoonAnalyzerResult(ruleId, filePath, position, message, messageMarkdown, snippet));
        }
        return results;
    }

    private Position createPosition(CtElement ctElement) {
        int startLine = ctElement.getPosition().getLine();
        int endLine = ctElement.getPosition().getEndLine();
        int startColumn = ctElement.getPosition().getColumn();
        int endColumn = ctElement.getPosition().getEndColumn();
        int startOffset = ctElement.getPosition().getSourceStart();
        int length = ctElement.getPosition().getSourceEnd() - startOffset;
        Position position = new Position(startLine, endLine, startColumn, endColumn, startOffset, length);
        return position;
    }

    private static List<TemplateMatcher> createPattern() {
        List<TemplateMatcher> templates = new ArrayList<>();
        var templateType = TemplateHelper.fromResource("patternDB/UnnecessaryToStringCall");
        for (CtMethod<?> method : templateType.getMethods()) {
            if (method.getSimpleName().startsWith("matcher")) {
                var root = method.getElements(new TypeFilter<>(CtReturn.class))
                        .get(0)
                        .getReturnedExpression();
                templates.add(new TemplateMatcher(root));
            }
        }
        return templates;
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type, AnalyzerResult result) {
        throw new UnsupportedOperationException("Unimplemented method 'refactor'");
    }
}
