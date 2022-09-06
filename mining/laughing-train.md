# Bad smells
I found 11 bad smells:
## UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/MentionCommands.java`
### Snippet
```java
        if (comment.contains("@laughing-train close")) {
            closePullRequestsWithLabelName(GitHubUtils.getOpenPullRequests(issueComment), Constants.LABEL_NAME);
            return;
        }
    }
```
## UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
### Snippet
```java
            disableAllRules();
            issueComment.getIssue().setBody(config.regenerateConfig());
            return;
        }
    }
```
## UnnecessaryToStringCall
Unnecessary `toString()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/CollectionEmptyCheck.java`
### Snippet
```java
        CtType<?> parent = element.getParent(CtType.class).getTopLevelType();
        String raw = "Replaced " + element + " with " + innvocation.toString();
        String markdown = "Replaced `" + element + "` with `" + innvocation.toString() + "`";
        setChanged(parent, new Change(COLLECTION_EMPTY_CHECK, MarkdownString.fromMarkdown(raw, markdown), parent));
    }
```
## UnnecessaryToStringCall
Unnecessary `toString()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UnnecessaryToStringCall.java`
### Snippet
```java
        for (CtInvocation<?> toStringInvocations : type.getElements(new InvocationFilter(toStringMethod))) {
            if (isAlmostMatch(toStringInvocations)) {
                String oldInvocation = "" + toStringInvocations.toString();
                toStringInvocations.replace(toStringInvocations.getTarget());
                toStringInvocations
```
## UnnecessaryToStringCall
Unnecessary `toString()` call
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
### Snippet
```java
        transformationEngine.setChangeListener(changeListener);
        System.out.println("refactorRepo: " + dir.toString() + "/" + config.getSrcFolder());
        transformationEngine.applyToGivenPath(dir.toString() + "/" + config.getSrcFolder());
        return changeListener;
    }
```
## UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNullTransformation.java`
### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertTrue(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```
## UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNotNullTransformation.java`
### Snippet
```java
    public void process(CtInvocation<?> element) {
        if (element.getExecutable() != null && JunitHelper.isJunit5AssertTrue(element.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = element;
            CtExpression<?> expression = element.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```
## UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseSameCheck.java`
### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertFalse(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```
## UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueSameCheck.java`
### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertTrue(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```
## UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseEqualsCheck.java`
### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertFalse(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtInvocation) {
```
## UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueEqualsCheck.java`
### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertTrue(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtInvocation) {
```
