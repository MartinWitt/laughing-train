# laughing-train 
 
# Bad smells
I found 159 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=PatternVariableCanBeUsed] | 28 | false |
| RuleId[ruleID=BoundedWildcard] | 21 | false |
| RuleId[ruleID=StringConcatenationInsideStringBufferAppend] | 17 | false |
| RuleId[ruleID=StaticCallOnSubclass] | 16 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 6 | false |
| RuleId[ruleID=SystemOutErr] | 6 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 6 | true |
| RuleId[ruleID=RedundantStringFormatCall] | 6 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 5 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 4 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 4 | false |
| RuleId[ruleID=DataFlowIssue] | 3 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 3 | false |
| RuleId[ruleID=ComparatorCombinators] | 3 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 3 | false |
| RuleId[ruleID=CommentedOutCode] | 2 | false |
| RuleId[ruleID=NullableProblems] | 2 | false |
| RuleId[ruleID=RedundantStreamOptionalCall] | 2 | false |
| RuleId[ruleID=GroovyUnusedAssignment] | 2 | false |
| RuleId[ruleID=ReturnNull] | 2 | false |
| RuleId[ruleID=ConstantValue] | 2 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 2 | false |
| RuleId[ruleID=UnnecessaryModifier] | 1 | true |
| RuleId[ruleID=UnnecessarySemicolon] | 1 | false |
| RuleId[ruleID=RefusedBequest] | 1 | false |
| RuleId[ruleID=StringBufferReplaceableByString] | 1 | false |
| RuleId[ruleID=EnhancedSwitchMigration] | 1 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 1 | true |
| RuleId[ruleID=SetReplaceableByEnumSet] | 1 | false |
| RuleId[ruleID=UtilityClassWithPublicConstructor] | 1 | false |
| RuleId[ruleID=UnnecessaryBoxing] | 1 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 1 | false |
| RuleId[ruleID=AccessStaticViaInstance] | 1 | false |
| RuleId[ruleID=DefaultAnnotationParam] | 1 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 1 | false |
| RuleId[ruleID=RedundantFileCreation] | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/AfterRefactorStep.java`
#### Snippet
```java
public interface AfterRefactorStep {

    public void apply(Changelog changelog, File projectRoot);
}

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PrinterCreation` has only 'static' members, and lacks a 'private' constructor
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/printing/PrinterCreation.java`
#### Snippet
```java
import xyz.keksdose.spoon.code_solver.spoon.SelectiveForceImport;

public class PrinterCreation {
    public static void setPrettyPrinter(Environment env, CtModel model) {
        new FragmentAwareChangeCollector().attachTo(env);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CommitBuilder` has only 'static' members, and lacks a 'private' constructor
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class CommitBuilder {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JunitHelper` has only 'static' members, and lacks a 'private' constructor
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/JunitHelper.java`
#### Snippet
```java
import spoon.reflect.reference.CtTypeReference;

public class JunitHelper {

    public static boolean isJunit4TestAnnotation(CtAnnotation<?> annotation) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ImportHelper` has only 'static' members, and lacks a 'private' constructor
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/ImportHelper.java`
#### Snippet
```java
import spoon.reflect.visitor.CtAbstractImportVisitor;

public class ImportHelper {

    public static void addImport(CtImport ctImport, CtCompilationUnit uni) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PullRequest` has only 'static' members, and lacks a 'private' constructor
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class PullRequest {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

## RuleId[ruleID=StaticCallOnSubclass]
### RuleId[ruleID=StaticCallOnSubclass]
Static method `list()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.Project'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/ProjectGraphQL.java`
#### Snippet
```java
    @Description("Gets project with given name from the database")
    public Project getProject(String projectName) {
        return Project.<Project>list("projectName", projectName).stream()
                .findAny()
                .orElse(null);
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `findAll()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.Project'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/ProjectGraphQL.java`
#### Snippet
```java
    @Description("Gets all projects from the database")
    public List<Project> getAllProjects() {
        return Project.<Project>findAll().list();
    }

```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `mongoCollection()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.BadSmell'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/ProjectGraphQL.java`
#### Snippet
```java
        Bson groupStage = group("$commitHash");
        Bson sortStage = sort(ascending("commitHash"));
        return BadSmell.<BadSmell>mongoCollection()
                .aggregate(List.of(matchStage, groupStage, sortStage), BsonDocument.class)
                .map(v -> v.get(v.getFirstKey()).asString().getValue())
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `mongoCollection()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.Project'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/PeriodicMiner.java`
#### Snippet
```java
    private Uni<Project> getKnownProject() {
        return Uni.createFrom()
                .item(Project.<Project>mongoCollection()
                        .aggregate(List.of(Aggregates.sample(1)))
                        .first());
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `listAll()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.BadSmell'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/BadSmellGraphQL.java`
#### Snippet
```java
    @Description("Gets all bad smells from the database")
    public List<BadSmell> getAllBadSmells() {
        return BadSmell.<BadSmell>listAll();
    }

```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `mongoCollection()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.Project'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java
    private void removeDuplicatedBadSmells() {
        var project =
                Project.<Project>mongoCollection().find(Aggregates.sample(1)).first();
        if (BadSmell.findByProjectUrl(project.getProjectUrl()).isEmpty()) {
            logger.atInfo().log("No bad smells found for project %s", project.getProjectUrl());
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `deleteById()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.BadSmell'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java
                    if (v.size() > 1) {
                        logger.atInfo().log("Found duplicated bad smells for identifier %s", k);
                        v.stream().skip(1).forEach(x -> BadSmell.deleteById(x.id));
                    }
                });
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `listAll()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.Project'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java

    private void removeProjectHashesWithoutResults() {
        for (Project project : Project.<Project>listAll()) {
            @Var boolean changed = false;
            for (String hash : new ArrayList<>(project.commitHashes)) {
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `mongoCollection()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.BadSmell'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java

    private void removeBadSmellsWithoutPosition() {
        BadSmell.mongoCollection()
                .find(Filters.not(Filters.exists("position")))
                .forEach(PanacheMongoEntityBase::delete);
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `findAll()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.BadSmell'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java

    private void removeBadSmellsWithWrongIdentifier() {
        BadSmell.<BadSmell>findAll().stream()
                .filter(v -> v.identifier.contains("--"))
                .map(v -> {
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `findAll()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.BadSmell'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java
                })
                .forEach(v -> v.update());
        BadSmell.<BadSmell>findAll().stream()
                .filter(v -> {
                    String hashPart = StringUtils.substringAfterLast(v.identifier, "-");
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `findAll()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.BadSmell'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java
                })
                .forEach(PanacheMongoEntityBase::delete);
        BadSmell.<BadSmell>findAll().stream()
                .filter(v -> v.getIdentifier().contains("["))
                .forEach(PanacheMongoEntityBase::delete);
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `listAll()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.Project'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java

    private void removeBadSmellsWithMissingProject() {
        for (Project project : Project.<Project>listAll()) {
            if (project.commitHashes == null || project.commitHashes.isEmpty() || project.projectUrl.endsWith(".git")) {
                project.delete();
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `mongoCollection()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.BadSmell'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java
            if (project.commitHashes == null || project.commitHashes.isEmpty() || project.projectUrl.endsWith(".git")) {
                project.delete();
                BadSmell.mongoCollection().deleteMany(Filters.eq("projectName", project.projectName));
            }
        }
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `streamAll()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.Project'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java

    private void createConfigsIfMissing() {
        Project.<Project>streamAll().forEach(project -> {
            if (ProjectConfig.findByProjectUrl(project.getProjectUrl()).isEmpty()) {
                var config = new ProjectConfig(project.getProjectUrl());
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `mongoCollection()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.BadSmell'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java

    private void removeBadSmellsWithoutIdentifier() {
        BadSmell.mongoCollection()
                .find(Filters.not(Filters.exists("identifier")))
                .forEach(PanacheMongoEntityBase::delete);
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java
                .find(Filters.not(Filters.exists("position")))
                .forEach(PanacheMongoEntityBase::delete);
        ;
    }
}
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/PointlessBooleanExpression.java`
#### Snippet
```java
    private boolean isAlreadyFixed(ChangeListener listener) {
        return listener.getChangelog().getChanges().stream()
                .anyMatch(v -> v.getAnalyzerResult().equals(result));
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getPath` may produce `NullPointerException`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/config/ConfigStore.java`
#### Snippet
```java
        property = new Properties();
        URL rootPath = Thread.currentThread().getContextClassLoader().getResource(CONFIG_FILE_NAME);
        String appConfigPath = URLDecoder.decode(rootPath.getPath(), StandardCharsets.UTF_8);
        try (FileInputStream configFile = new FileInputStream(new File(appConfigPath))) {
            property.load(configFile);
```

### RuleId[ruleID=DataFlowIssue]
Argument `url` might be null
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
            var url = this.getClass().getResource("/qodana.yml");
            File copyQodanaRules = new File(sourceRoot.toString(), "qodana.yaml");
            FileUtils.copyURLToFile(url, copyQodanaRules);
        } catch (IOException e) {
            logger.atSevere().withCause(e).log("Could not write qodana.yaml");
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
'collect(toList())' can be replaced with 'toList()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/CollectionEmptyCheck.java`
#### Snippet
```java
        innvocation.stream()
                .filter(outer -> innvocation.stream().anyMatch(outer::hasParent))
                .collect(Collectors.toList())
                .forEach(innvocation::remove);
        return innvocation;
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
'collect(toList())' can be replaced with 'toList()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'peek'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java
        BadSmell.<BadSmell>findAll().stream()
                .filter(v -> v.identifier.contains("--"))
                .map(v -> {
                    v.identifier = v.identifier.replace("--", "-");
                    return v;
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
'collect(toList())' can be replaced with 'toList()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/ProtectedMemberInFinalType.java`
#### Snippet
```java
            List<CtTypeMember> protectedMethods = type.getTypeMembers().stream()
                    .filter(CtModifiable::isProtected)
                    .collect(Collectors.toList());
            for (CtTypeMember ctMethod : protectedMethods) {
                ctMethod.removeModifier(ModifierKind.PROTECTED);
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
'collect(toList())' can be replaced with 'toList()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
'collect(toList())' can be replaced with 'toList()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/MiningPrinter.java`
#### Snippet
```java
                .append("\n");
        sb.append(generateTableBadSmells(results, ruleIds));
        // var blameTable = calculateGtBlameForIssues(results, project);
        // sb.append(generateBlameTable(blameTable));
        var grouped = results.stream().collect(Collectors.groupingBy(AnalyzerResult::ruleID));
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (5 lines)
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                switchToCleanBranch(config, git);
                Changelog changelog = refactorFixPoint(sourceDirectory, tempRepoFolder);
                // Function<ChangeListener, TransformationProcessor<?>> qodanaRefactorFunction = setUpQodana(
                // 	sourceDirectory, tempRepoFolder, changeListener);
                // Changelog changelog = refactorFolderWithQodana(tempRepoFolder, changeListener,
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'analyze' is still used
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java
     */
    @Deprecated
    public void analyze(Path projectRoot) {
        var runnerBuilder = new QodanaAnalyzer.Builder();
        settings.forEach(s -> s.accept(runnerBuilder));
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'withCacheFolder' is still used
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java

        @Deprecated
        public Builder withCacheFolder(String cacheFolder) {
            return this;
        }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'withRemoveResultDir' is still used
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java

        @Deprecated
        public Builder withRemoveResultDir(boolean removeResultDir) {
            return this;
        }
```

## RuleId[ruleID=ComparatorCombinators]
### RuleId[ruleID=ComparatorCombinators]
Can be replaced with 'Comparator.comparing'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
                .filter(v -> !v.isEmptyRule())
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
```

### RuleId[ruleID=ComparatorCombinators]
Can be replaced with 'Comparator.comparing'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .filter(v -> !v.isEmptyRule())
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
```

### RuleId[ruleID=ComparatorCombinators]
Can be replaced with 'Comparator.comparing'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .filter(v -> !v.isEmptyRule())
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
```

## RuleId[ruleID=RefusedBequest]
### RuleId[ruleID=RefusedBequest]
Method `clone()` does not call 'super.clone()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/NewLineAnnotation.java`
#### Snippet
```java

    @Override
    public NewLineAnnotation<A> clone() {
        return (NewLineAnnotation<A>) new NewLineAnnotation<>();
    }
```

## RuleId[ruleID=PatternVariableCanBeUsed]
### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'compilationUnit' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/formatting/ImportGrouper.java`
#### Snippet
```java
    public void process(CtElement element) {
        if (element instanceof CtCompilationUnit) {
            CtCompilationUnit compilationUnit = (CtCompilationUnit) element;
            compilationUnit.setImports(cloneImports(compilationUnit));
        }
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'targetedExpression' can be replaced with pattern variable
in `code-transformation/src/main/java/spoon/reflect/visitor/ImportAnalyzer.java`
#### Snippet
```java

        if (element instanceof CtTargetedExpression) {
            CtTargetedExpression<?, ?> targetedExpression = (CtTargetedExpression<?, ?>) element;
            handleTargetedExpression(targetedExpression, context);
        } else if (element instanceof CtTypeReference<?>) {
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'assignment' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java
                CtStatement statement = body.getStatement(index);
                if (statement instanceof CtAssignment) {
                    CtAssignment<?, ?> assignment = (CtAssignment<?, ?>) statement;
                    if (assignment.getAssigned().equals(ctReturn.getReturnedExpression())) {
                        ctReturn.setReturnedExpression((CtExpression) assignment.getAssignment());
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'returnStatement' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java

        if (element.getBody().getLastStatement() instanceof CtReturn) {
            CtReturn<?> returnStatement = (CtReturn<?>) element.getBody().getLastStatement();
            int size = body.getStatements().size();
            CtStatement statement = body.getStatement(size - 2);
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'ifStatement' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java
            CtStatement statement = body.getStatement(size - 2);
            if (statement instanceof CtIf) {
                CtIf ifStatement = (CtIf) statement;
                CtStatement thenStatement = ifStatement.getThenStatement();
                if (thenStatement instanceof CtBlock) {
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'thenBlock' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java
                CtStatement thenStatement = ifStatement.getThenStatement();
                if (thenStatement instanceof CtBlock) {
                    CtBlock<?> thenBlock = (CtBlock<?>) thenStatement;
                    if (thenBlock.getStatements().size() == 1 && thenBlock.getStatement(0) instanceof CtReturn) {
                        CtReturn<?> ifReturnStatement = (CtReturn<?>) thenBlock.getStatement(0);
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'ifReturnStatement' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java
                    CtBlock<?> thenBlock = (CtBlock<?>) thenStatement;
                    if (thenBlock.getStatements().size() == 1 && thenBlock.getStatement(0) instanceof CtReturn) {
                        CtReturn<?> ifReturnStatement = (CtReturn<?>) thenBlock.getStatement(0);
                    }
                }
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'ctReturn' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UnnecessaryLocalVariable.java`
#### Snippet
```java
                    if (block.getStatements().size() > index + 1
                            && block.getStatements().get(index + 1) instanceof CtReturn) {
                        CtReturn<?> ctReturn =
                                (CtReturn<?>) block.getStatements().get(index + 1);
                        if (ctReturn.getReturnedExpression() instanceof CtVariableRead) {
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'binaryOperator' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNullTransformation.java`
#### Snippet
```java
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
                CtBinaryOperator<?> binaryOperator = (CtBinaryOperator<?>) expression;
                if (binaryOperator.getKind().equals(BinaryOperatorKind.EQ)) {
                    CtExpression<?> check = findTestingExpression(binaryOperator);
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'invocation' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/StringBuilderDirectUse.java`
#### Snippet
```java
    public void process(CtInvocation<?> element) {
        if (targetIsStringType(element) && element.getTarget() instanceof CtInvocation) {
            CtInvocation<?> invocation = (CtInvocation<?>) element.getTarget();
            if (targetIsStringBuilder(invocation) && stringBuilderHasMethod(element)) {
                element.setTarget(invocation.getTarget());
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'fieldRead' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/ExpectedExceptionRemoval.java`
#### Snippet
```java
    private boolean isNoneType(CtExpression<?> value) {
        if (value instanceof CtFieldRead) {
            CtFieldRead<?> fieldRead = (CtFieldRead<?>) value;
            return fieldRead.getVariable().getDeclaringType().getSimpleName().equals("None");
        }
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'binaryOperator' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseSameCheck.java`
#### Snippet
```java
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
                CtBinaryOperator<?> binaryOperator = (CtBinaryOperator<?>) expression;
                if (binaryOperator.getKind().equals(BinaryOperatorKind.EQ)) {
                    CtInvocation<?> junit5AssertNotNull = createJunit5AssertSame(
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'binaryOperator' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNotNullTransformation.java`
#### Snippet
```java
            CtExpression<?> expression = element.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
                CtBinaryOperator<?> binaryOperator = (CtBinaryOperator<?>) expression;
                if (binaryOperator.getKind().equals(BinaryOperatorKind.NE)) {
                    CtExpression<?> check = findTestingExpression(binaryOperator);
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'equalsInvocation' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueEqualsCheck.java`
#### Snippet
```java
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtInvocation) {
                CtInvocation<?> equalsInvocation = (CtInvocation<?>) expression;
                if (equalsInvocation.getExecutable().getSimpleName().equals("equals")) {
                    CtExpression<?> firstArgument = equalsInvocation.getTarget();
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'other' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/Change.java`
#### Snippet
```java
            return false;
        }
        Change other = (Change) obj;
        return Objects.equals(affectedType, other.affectedType)
                && Objects.equals(badsmell, other.badsmell)
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'localVariable' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/UnusedAssignment.java`
#### Snippet
```java
            var assigned = ctAssignment.getAssigned();
            if (assigned instanceof CtVariableWrite) {
                CtVariableWrite<?> localVariable = (CtVariableWrite<?>) assigned;
                if (element.getElements(new VariableAccessFilter<>(localVariable.getVariable()))
                        .isEmpty()) {
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'equalsInvocation' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseEqualsCheck.java`
#### Snippet
```java
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtInvocation) {
                CtInvocation<?> equalsInvocation = (CtInvocation<?>) expression;
                if (equalsInvocation.getExecutable().getSimpleName().equals("equals")) {
                    CtExpression<?> firstArgument = equalsInvocation.getTarget();
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'binaryOperator' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueSameCheck.java`
#### Snippet
```java
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
                CtBinaryOperator<?> binaryOperator = (CtBinaryOperator<?>) expression;
                if (binaryOperator.getKind().equals(BinaryOperatorKind.EQ)) {
                    CtInvocation<?> junit5AssertNotNull = createJunit5AssertSame(
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'typeReference' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/ImportHelper.java`
#### Snippet
```java
        for (CtImport ctImport : imports) {
            if (ctImport.getReference() instanceof CtTypeReference) {
                CtTypeReference<?> typeReference = (CtTypeReference<?>) ctImport.getReference();
                if (typeReference.getQualifiedName().equals(importString)) {
                    removalableImports.add(ctImport);
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'executableReference' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/ImportHelper.java`
#### Snippet
```java
            }
            if (ctImport.getReference() instanceof CtExecutableReference) {
                CtExecutableReference<?> executableReference = (CtExecutableReference<?>) ctImport.getReference();
                String simpleName = importString.substring(importString.lastIndexOf('.') + 1);
                if (executableReference.getSimpleName().equals(simpleName)) {
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'methodRef' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/MethodMayBeStatic.java`
#### Snippet
```java
                CtExecutable<?> exec = executableRef.getExecutable().getExecutableDeclaration();
                if (exec instanceof CtMethod) {
                    CtMethod<?> methodRef = (CtMethod<?>) exec;
                    if (methodRef.equals(method)) {
                        CtTypeReference<Object> typeReference = method.getFactory()
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'other' can be replaced with pattern variable
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
            return false;
        }
        BadSmell other = (BadSmell) obj;
        return Objects.equals(analyzer, other.analyzer)
                && Objects.equals(identifier, other.identifier)
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'invocation' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java

            } else if (targetedExpression instanceof CtInvocation<?>) {
                CtInvocation<?> invocation = (CtInvocation<?>) targetedExpression;
                // import static method
                if (invocation.getExecutable().isStatic()) {
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'fieldAccess' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
            } else if (targetedExpression instanceof CtFieldAccess<?>) {
                // import static field
                CtFieldAccess<?> fieldAccess = (CtFieldAccess<?>) targetedExpression;
                if (fieldAccess.getVariable().isStatic()) {
                    context.addImport(fieldAccess.getVariable());
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'fieldRef' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        }
        if (ref instanceof CtFieldReference) {
            CtFieldReference fieldRef = (CtFieldReference) ref;
            return fieldRef.getDeclaringType().getQualifiedName() + "." + fieldRef.getSimpleName();
        }
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'execRef' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        }
        if (ref instanceof CtExecutableReference) {
            CtExecutableReference execRef = (CtExecutableReference) ref;
            return execRef.getDeclaringType().getQualifiedName() + "." + execRef.getSimpleName();
        }
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'wildRef' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        }
        if (ref instanceof CtTypeMemberWildcardImportReference) {
            CtTypeMemberWildcardImportReference wildRef = (CtTypeMemberWildcardImportReference) ref;
            return wildRef.getTypeReference().getQualifiedName() + ".*";
        }
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'typeRef' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        }
        if (ref instanceof CtTypeReference) {
            CtTypeReference typeRef = (CtTypeReference) ref;
            return typeRef.getQualifiedName();
        }
```

## RuleId[ruleID=StringBufferReplaceableByString]
### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder sb` can be replaced with 'String'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                git.close();
                PrintStream foo = new PrintStream(new File(tempRepoFolder, "changelog.md"));
                StringBuilder sb = new StringBuilder();
                foo.print(sb);
            } catch (IOException | GitAPIException e) {
```

## RuleId[ruleID=EnhancedSwitchMigration]
### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportComparator.java`
#### Snippet
```java
    private int getImportKindOrder(CtImportKind importKind) {

        switch (importKind) {
            case TYPE:
            case ALL_TYPES:
```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `ResultCallbackImplementation` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
    }

    private final class ResultCallbackImplementation implements ResultCallback<Frame> {
        private final StringBuilder sb;

```

## RuleId[ruleID=SetReplaceableByEnumSet]
### RuleId[ruleID=SetReplaceableByEnumSet]
`HashSet<>` can be replaced with 'EnumSet'
in `code-transformation/src/main/java/spoon/reflect/visitor/ImportAnalyzer.java`
#### Snippet
```java

    // The set of roles whose values are always kept implicit
    protected static Set<CtRole> IGNORED_ROLES_WHEN_IMPLICIT = new HashSet<>(Arrays.asList(
            // e.g. List<String> s = new ArrayList</*keep me implicit*/>();
            CtRole.TYPE_ARGUMENT,
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Message`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/MentionCommands.java`
#### Snippet
```java
    }

    private void runQodanaOnRepo(GHEventPayload.IssueComment issueComment, AsyncResult<Message<ProjectResult>> v) {
        if (v.succeeded() && v.result().body() instanceof ProjectResult.Success success) {
            vertx.executeBlocking(project -> eventBus.<QodanaResult>request(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GHPullRequest`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/MentionCommands.java`
#### Snippet
```java
    }

    private void closePullRequestsWithLabelName(List<GHPullRequest> pr, String name) {
        for (GHPullRequest ghPullRequest : pr) {
            ghPullRequest.getLabels().forEach(v -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtLiteral`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/EmptyStringCheck.java`
#### Snippet
```java
    }

    private boolean isEmptyStringArgument(List<CtLiteral<?>> literals) {
        return literals.get(0).getValue().equals("");
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtLiteral`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/EmptyStringCheck.java`
#### Snippet
```java
    }

    private boolean isSingleArgumentAndEmptyString(List<CtLiteral<?>> literals) {
        return literals.size() == 1 && literals.get(0).getValue().equals("");
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtType`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/printing/ChangedTypePrinting.java`
#### Snippet
```java
    }

    public void printChangedTypes(ChangeListener listener, Iterable<CtType<?>> newTypes) {
        for (CtType<?> type : newTypes) {
            if (type.getPosition().getFile() == null || !listener.isChanged(type)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtImport`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/formatting/NewLineImportGroups.java`
#### Snippet
```java

    @Override
    public List<CtImport> group(List<CtImport> imports) {
        LinkedList<CtImport> newImports = new LinkedList<>();
        newImports.add(new NewlineImport());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtImport`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/formatting/SpoonStyle.java`
#### Snippet
```java

    @Override
    public List<CtImport> group(List<CtImport> imports) {
        LinkedList<CtImport> staticImports = new LinkedList<>();
        LinkedList<CtImport> nonStaticImports = new LinkedList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java

    public static void refactorRepo(
            String path, String sourceFiles, String file, BiFunction<String, String, Changelog> transformation) {
        ConfigStore config = new ConfigStore();
        try (Repository repository = Git.open(new File(path)).checkout().getRepository()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java

    public static void refactorRepo(
            String path, String sourceFiles, String file, BiFunction<String, String, Changelog> transformation) {
        ConfigStore config = new ConfigStore();
        try (Repository repository = Git.open(new File(path)).checkout().getRepository()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Changelog`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java

    public static void refactorRepo(
            String path, String sourceFiles, String file, BiFunction<String, String, Changelog> transformation) {
        ConfigStore config = new ConfigStore();
        try (Repository repository = Git.open(new File(path)).checkout().getRepository()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/util/Nullsafe.java`
#### Snippet
```java
     * @return  the value of the given supplier if it doesn't throw an exception, otherwise returns the default value.
     */
    public static <T> T get(Supplier<T> supplier, T defaultValue) {
        try {
            return supplier.get();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtType`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java

    private void createPullRequestForAffectedType(
            GHRepository repo, Path dir, Map<CtType<?>, List<Change>> changesByType) throws IOException {
        GHRef mainRef = repo.getRef("heads/" + repo.getDefaultBranch());
        logger.atInfo().log(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java

    private void createPullRequestForAffectedType(
            GHRepository repo, Path dir, Map<CtType<?>, List<Change>> changesByType) throws IOException {
        GHRef mainRef = repo.getRef("heads/" + repo.getDefaultBranch());
        logger.atInfo().log(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtInvocation`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/AssertionsTransformation.java`
#### Snippet
```java
    }

    private void convertToJunit5(List<CtInvocation<?>> junit4Asserts) {
        for (CtInvocation<?> junit4Assert : junit4Asserts) {
            junit4Assert.setTarget(null);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtImport`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/formatting/GoogleStyle.java`
#### Snippet
```java

    @Override
    public List<CtImport> group(List<CtImport> imports) {
        LinkedList<CtImport> staticImports = new LinkedList<>();
        LinkedList<CtImport> nonStaticImports = new LinkedList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CtExecutableReferenceExpression``>`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/MethodMayBeStatic.java`
#### Snippet
```java

    private void refactorExecutableReferences(
            CtMethod<?> method, List<CtExecutableReferenceExpression<?, CtTypeAccess<?>>> executableRefs) {
        for (CtExecutableReferenceExpression<?, CtTypeAccess<?>> executableRef : executableRefs) {
            if (executableRef.getExecutable() != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/summary/PeriodicSummary.java`
#### Snippet
```java
    }

    private String createSummaryBody(Map<String, List<PullRequest>> prsByGHRepo) {
        var sb = new StringBuilder();
        sb.append("# Summary\n");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Message`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/services/RefactorService.java`
#### Snippet
```java

    private Promise<String> createPullRequest(
            AsyncResult<Message<ProjectResult>> message, List<BadSmell> badSmells, ProjectConfig config) {
        if (message.failed()) {
            logger.atSevere().withCause(message.cause()).log("Failed to get project");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BadSmell`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/services/RefactorService.java`
#### Snippet
```java

    private Promise<String> createPullRequest(
            AsyncResult<Message<ProjectResult>> message, List<BadSmell> badSmells, ProjectConfig config) {
        if (message.failed()) {
            logger.atSevere().withCause(message.cause()).log("Failed to get project");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Change`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
    }

    private static void appendBadSmells(Collection<Change> changelog, StringBuilder sb) {
        sb.append("The following bad smells are refactored:\n");
        List<BadSmell> badSmells = changelog.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Change`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
    }

    private static String getFixedIssues(Collection<Change> change) {
        return change.stream()
                .map(Change::getBadSmell)
```

## RuleId[ruleID=NullableProblems]
### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/analyzer/AnalyzerResult.java`
#### Snippet
```java
    String getAnalyzer();

    @Nonnull
    RuleId ruleID();

```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/RepoCheckout.java`
#### Snippet
```java
     * @return  the path to the checked out repo.
     */
    @Nonnull
    File prepareRepo();
}
```

## RuleId[ruleID=UtilityClassWithPublicConstructor]
### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `CommitBuilder` has only 'static' members, and a 'public' constructor
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class CommitBuilder {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

## RuleId[ruleID=UnnecessaryBoxing]
### RuleId[ruleID=UnnecessaryBoxing]
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/config/ConfigStore.java`
#### Snippet
```java

    public boolean getPrintMarkdown() {
        return Boolean.valueOf(property.getProperty("changelog.markdown"));
    }

```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'cacheFolder'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
        private String resultPathString = resultFolder + "/qodana.sarif.json";
        private String sourceFileRoot = "./src/main/java";
        private Optional<String> cacheFolder = Optional.of("data/cache");
        private String subFolder;

```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java

    void onConfigEdit(@Issue.Edited GHEventPayload.Issue issueComment) throws IOException {
        System.out.println("onEditConfig");
        if (isNotConfigIssue(issueComment)
                || !userWhitelist.isWhitelisted(GitHubUtils.getLogin(issueComment))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
        try {
            var results = qodanaService.runQodana(repoUrl, dir);
            System.out.println(config.getActiveRules());
            Function<ChangeListener, TransformationProcessor<?>> function =
                    (v -> new QodanaRefactor(config.getActiveRules(), v, results));
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
            TransformationEngine transformationEngine = new TransformationEngine(List.of(function));
            transformationEngine.setChangeListener(changeListener);
            System.out.println("refactorRepo: " + dir + "/" + config.getSrcFolder());
            transformationEngine.applyToGivenPath(dir + "/" + config.getSrcFolder());
        } catch (Exception e) {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
    public static Changelog refactorFixPoint(String sourceDirectory, File tempRepoFolder) {
        Changelog startPoint = applyQodana(sourceDirectory, tempRepoFolder, true);
        System.out.println(startPoint.getChanges().size());
        do {
            Changelog iterativeResult = applyQodana(sourceDirectory, tempRepoFolder, true);
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
            }
            startPoint.getChanges().addAll(newChanges);
            System.out.println("New changes");
            for (Change change : newChanges) {
                System.out.println(change.getChangeText().asText());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
            System.out.println("New changes");
            for (Change change : newChanges) {
                System.out.println(change.getChangeText().asText());
            }
        } while (!startPoint.getChanges().isEmpty());
```

## RuleId[ruleID=AccessStaticViaInstance]
### RuleId[ruleID=AccessStaticViaInstance]
Static member 'io.github.martinwitt.laughing_train.persistence.ProjectConfig.update(java.lang.Object, java.lang.Object...)' accessed via instance reference
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/ProjectGraphQL.java`
#### Snippet
```java
                new FindProjectConfigRequest.ByProjectUrl(projectConfig.getProjectUrl()));
        if (result instanceof FindProjectConfigResult.SingleResult singleResult) {
            singleResult.projectConfig().update(projectConfig);
            return singleResult.projectConfig();
        } else {
```

## RuleId[ruleID=RedundantStreamOptionalCall]
### RuleId[ruleID=RedundantStreamOptionalCall]
Redundant 'distinct()' call: stream contains at most one element
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .map(BadSmell::getName)
                .map(MarkdownString::asText)
                .distinct()
                .collect(Collectors.joining("\n"));
    }
```

### RuleId[ruleID=RedundantStreamOptionalCall]
Redundant 'distinct()' call: stream contains at most one element
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .map(Change::getBadSmell)
                .filter(v -> !v.isEmptyRule())
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
```

## RuleId[ruleID=DefaultAnnotationParam]
### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/summary/PeriodicSummary.java`
#### Snippet
```java
    EventBus eventBus;

    @Scheduled(every = "2h", delay = 10, delayUnit = TimeUnit.MINUTES)
    public void createSummary() {
        eventBus.<FindIssueResult>request(ServiceAdresses.FIND_SUMMARY_ISSUE_REQUEST, "message")
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/NewLineAnnotation.java`
#### Snippet
```java

    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java

    /** (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java

    /** (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java

    /** (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/MentionCommands.java`
#### Snippet
```java
                        ghPullRequest.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/Config.java`
#### Snippet
```java
            options = markdownPrinter.toYamlMarkdown(MAPPER.writeValueAsString(this));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        String configString =
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
            return relative.toString().replace('\\', '/');
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/services/RefactorService.java`
#### Snippet
```java
            return relative.toString().replace('\\', '/');
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
```

## RuleId[ruleID=GroovyUnusedAssignment]
### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `code-transformation/build.gradle`
#### Snippet
```java


def test = tasks.named("test") {
	useJUnitPlatform {
		excludeTags "Mining"
```

### RuleId[ruleID=GroovyUnusedAssignment]
Assignment is not used
in `code-transformation/build.gradle`
#### Snippet
```java
}

def mining = tasks.register("mining", Test) {
	useJUnitPlatform {
		includeTags "Mining"
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/RepeatingProcessingManager.java`
#### Snippet
```java
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private final ChangeListener listener;
    private int iteration = 0;

    public RepeatingProcessingManager(Factory factory, ChangeListener listener) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java
        private List<AfterRefactorStep> afterRefactorStep = new ArrayList<>();
        private ChangeListener listener = new ChangeListener();
        private IPrinting printing = null;
        private String subProjectSuffix = "";

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        Iterator<CtImport> iter = imports.iterator();
        class Visitor extends CtAbstractImportVisitor {
            boolean found = false;

            @Override
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sourceRoot`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java

    public List<AnalyzerResult> runQodana(@Var Path sourceRoot) {
        sourceRoot = fixWindowsPath(sourceRoot);
        logger.atInfo().log("Running Qodana on %s", sourceRoot);
        copyQodanaRules(sourceRoot);
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `code-transformation/src/main/java/spoon/reflect/visitor/ImportAnalyzer.java`
#### Snippet
```java
    protected static <T extends CtElement> T getParentIfType(CtElement element, Class<T> type) {
        if (element == null || !element.isParentInitialized()) {
            return null;
        }
        CtElement parent = element.getParent();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `code-transformation/src/main/java/spoon/reflect/visitor/ImportAnalyzer.java`
#### Snippet
```java
            return type.cast(parent);
        }
        return null;
    }
}
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNullTransformation.java`
#### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertTrue(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseSameCheck.java`
#### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertFalse(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNotNullTransformation.java`
#### Snippet
```java
    public void process(CtInvocation<?> element) {
        if (element.getExecutable() != null && JunitHelper.isJunit5AssertTrue(element.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = element;
            CtExpression<?> expression = element.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueEqualsCheck.java`
#### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertTrue(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtInvocation) {
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseEqualsCheck.java`
#### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertFalse(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtInvocation) {
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueSameCheck.java`
#### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertTrue(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```

## RuleId[ruleID=RedundantStringFormatCall]
### RuleId[ruleID=RedundantStringFormatCall]
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNullTransformation.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced nullcheck in assertTrue with assertNull"),
                        "AssertTrue instead of AssertNull",
                        parent));
```

### RuleId[ruleID=RedundantStringFormatCall]
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseSameCheck.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced assertFalse checking not same with assertNotSame"),
                        "assertFalse with not equals instead of assertNotSame",
                        parent));
```

### RuleId[ruleID=RedundantStringFormatCall]
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNotNullTransformation.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced not nullcheck in assertTrue with assertNotNull"),
                        "AssertTrue instead of AssertNotNull",
                        parent));
```

### RuleId[ruleID=RedundantStringFormatCall]
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueEqualsCheck.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced assertTrue checking equals with assertEquals"),
                        "AssertTrue with equals instead of AssertEquals",
                        parent));
```

### RuleId[ruleID=RedundantStringFormatCall]
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseEqualsCheck.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced assertFalse checking equals with assertNotEquals"),
                        "assertFalse with equals instead of assertNotEquals",
                        parent));
```

### RuleId[ruleID=RedundantStringFormatCall]
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueSameCheck.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced assertTrue checking same with assertSame"),
                        "assertTrue with equals instead of assertSame",
                        parent));
```

## RuleId[ruleID=RedundantFileCreation]
### RuleId[ruleID=RedundantFileCreation]
`new File` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/config/ConfigStore.java`
#### Snippet
```java
        URL rootPath = Thread.currentThread().getContextClassLoader().getResource(CONFIG_FILE_NAME);
        String appConfigPath = URLDecoder.decode(rootPath.getPath(), StandardCharsets.UTF_8);
        try (FileInputStream configFile = new FileInputStream(new File(appConfigPath))) {
            property.load(configFile);
        } catch (IOException e) {
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `gitBlame == null` is always `true`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/MiningPrinter.java`
#### Snippet
```java
                        .setTextComparator(RawTextComparator.WS_IGNORE_ALL)
                        .call();
                if (gitBlame == null) {
                    logger.atSevere().log("Git blame is null for %s", analyzerResult.filePath());
                    continue;
```

### RuleId[ruleID=ConstantValue]
Condition `result == null` is always `false`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/summary/PeriodicSummary.java`
#### Snippet
```java
                .replace("\"", "")
                .trim();
        if (result == null || result.isEmpty()) {
            return "Multiple rules";
        } else {
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/impl/SingleChangeGitPushSsh.java`
#### Snippet
```java
                        path.getName(path.getNameCount() - 1).toString().equals(changedFile.getName()),
                FileVisitOption.FOLLOW_LINKS)) {
            Path changedFilePath = changedFiles.findFirst().get();
            String changedFileName =
                    projectRoot.toPath().relativize(changedFilePath).toString().replace("\\", "/");
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                        FileVisitOption.FOLLOW_LINKS)
                .findFirst()
                .get();
        String changedFileName =
                tempRepoFolder.toPath().relativize(changedFilePath).toString().replace("\\", "/");
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/ChangelogPrinter.java`
#### Snippet
```java
        sb.append("# Repairing Code Style Issues\n");
        sb.append("<!-- laughing-train-refactor -->\n");
        changes.stream().map(Change::getBadSmell).distinct().forEach(v -> sb.append(
                        "## " + v.getName().asText() + "\n")
                .append(v.getDescription().asMarkdown())
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/ChangelogPrinter.java`
#### Snippet
```java
        var changesByBadSmell = changes.stream().collect(Collectors.groupingBy(Change::getBadSmell));
        for (var change : changesByBadSmell.entrySet()) {
            sb.append("* %s".formatted(change.getKey().getName().asMarkdown())
                    + " (%s)%n".formatted(change.getValue().size()));
        }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/ChangelogPrinter.java`
#### Snippet
```java
        sb.append("## Changes: \n");
        for (var fix : changes) {
            sb.append("* " + fix.getChangeText().asMarkdown()).append("\n");
            if (fix.getAnalyzerResult() != null) {
                sb.append("<!-- ").append(toYaml(fix.getAnalyzerResult())).append(" -->\n");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
    private static void appendChanges(Map<String, List<Change>> changesByType, StringBuilder sb) {
        for (Entry<String, List<Change>> entry : changesByType.entrySet()) {
            sb.append("### " + entry.getKey() + "\n");
            sb.append(entry.getValue().stream()
                    .map(c -> "- " + c.getChangeText().asMarkdown())
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
            }
        }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
        for (Change change : log.getChanges()) {
            if (change.getAffectedType().getSimpleName().equals(name)) {
                sb.append(change.getChangeText().asText() + "\n");
            }
        }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/Changelog.java`
#### Snippet
```java
        builder.append("The following has changed in the code:\n");
        for (Change change : changes) {
            builder.append(change.getChangeText() + "\n");
        }
        return builder.toString();
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
            }
        }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
            }
        }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
    private static void appendChanges(Map<String, List<Change>> changesByType, StringBuilder sb) {
        for (Entry<String, List<Change>> entry : changesByType.entrySet()) {
            sb.append("### " + entry.getKey() + "\n");
            sb.append(entry.getValue().stream()
                    .map(c -> "- " + c.getChangeText().asMarkdown())
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
        for (Change change : log.getChanges()) {
            if (change.getAffectedType().getSimpleName().equals(name)) {
                sb.append(change.getChangeText().asText() + "\n");
            }
        }
```

