package xyz.keksdose.spoon.code_solver.transformations.self;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLambda;
import spoon.reflect.code.CtNewClass;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Link;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class ThreadLocalWithInitial extends TransformationProcessor<CtNewClass<?>> {

    private static final BadSmell threadLocalWithInitalValue = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("ThreadLocalWithInitialValue");
        }

        @Override
        public MarkdownString getDescription() {
            String rawText = "ThreadLocal with initialValue override shall be replaced by ThreadLocal.withInitialValue";
            String markdown =
                    "`ThreadLocal` with initialValue override shall be replaced by `ThreadLocal.withInitialValue`";
            return MarkdownString.fromMarkdown(rawText, markdown);
        }

        @Override
        public List<Link> getLinks() {
            return List.of(new Link("https://rules.sonarsource.com/java/RSPEC-4065"));
        }
    };

    public ThreadLocalWithInitial(ChangeListener listener) {
        super(listener);
    }

    @Override
    public void process(CtNewClass<?> threadLocal) {
        if (threadLocal.getType() != null
                && threadLocal.getType().getQualifiedName().equals("java.lang.ThreadLocal")) {
            CtClass<?> innerClass = threadLocal.getAnonymousClass();
            if (hasNoFields(innerClass) && hasOnlyConstructorAndSingleMethod(innerClass)) {
                Optional<CtExecutableReference<?>> initalValueMethod = findInitalValueMethod(innerClass);
                if (initalValueMethod.isPresent()) {
                    CtLambda<?> lambda = createSupplier(initalValueMethod.get());
                    CtInvocation<?> invocation = createInitalMethod(threadLocal, lambda);
                    invocation.setArguments(List.of(lambda));
                    notifyChangeListener(threadLocal, lambda, invocation);
                    threadLocal.replace(invocation);
                }
            }
        }
    }

    private void notifyChangeListener(CtNewClass<?> threadLocal, CtLambda<?> lambda, CtInvocation<?> invocation) {
        CtElement element = lambda.getBody() == null ? lambda.getExpression() : lambda.getBody();
        String rawText = String.format(
                "ThreadLocal with initialValue %s was replaced by ThreadLocal.withInitialValue(%s)",
                element, invocation);
        String markdown = String.format(
                "`ThreadLocal` with initialValue `%s` was replaced by `ThreadLocal.withInitialValue(%s)`",
                element, invocation);
        setChanged(
                threadLocal.getParent(CtType.class).getTopLevelType(),
                new Change(
                        threadLocalWithInitalValue,
                        MarkdownString.fromMarkdown(rawText, markdown),
                        threadLocal.getParent(CtType.class).getTopLevelType()));
    }

    private CtInvocation<?> createInitalMethod(CtNewClass<?> threadLocal, CtLambda<?> lambda) {
        return getFactory()
                .createInvocation(
                        getFactory().createTypeAccess(createThreadLocalRef()),
                        getFactory()
                                .Executable()
                                .createReference(
                                        threadLocal.getType(),
                                        true,
                                        threadLocal.getType(),
                                        "withInitial",
                                        List.of(lambda.getType())));
    }

    private CtTypeReference<Object> createThreadLocalRef() {
        return getFactory().createCtTypeReference(ThreadLocal.class);
    }

    private CtLambda<?> createSupplier(CtExecutableReference<?> initalValueMethod) {
        CtLambda<?> lambda = getFactory().createLambda();
        if (initalValueMethod.getDeclaration().getBody().getStatements().size() == 1) {
            CtStatement statement = initalValueMethod.getDeclaration().getBody().getStatement(0);
            if (statement instanceof CtReturn) {
                lambda.setExpression(getReturnStatement(statement));
            } else {
                lambda.setBody(initalValueMethod.getDeclaration().getBody());
            }
        } else {
            lambda.setBody(initalValueMethod.getDeclaration().getBody());
        }
        lambda.setType(getFactory().createCtTypeReference(Supplier.class));
        return lambda;
    }

    private <T> CtExpression<T> getReturnStatement(CtStatement statement) {
        return ((CtReturn<T>) statement).getReturnedExpression();
    }

    private Optional<CtExecutableReference<?>> findInitalValueMethod(CtClass<?> innerClass) {
        return innerClass.getDeclaredExecutables().stream()
                .filter(v -> v.getSimpleName().equals("initialValue"))
                .findFirst();
    }

    private boolean hasOnlyConstructorAndSingleMethod(CtClass<?> innerClass) {
        return innerClass.getDeclaredExecutables().size() == 2;
    }

    private boolean hasNoFields(CtClass<?> innerClass) {
        return innerClass.getDeclaredFields().isEmpty();
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(threadLocalWithInitalValue);
    }
}
