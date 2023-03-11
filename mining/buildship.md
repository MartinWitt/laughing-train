# buildship 
 
# Bad smells
I found 786 bad smells with 97 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 135 | false |
| ReturnNull | 79 | false |
| ConstantValue | 63 | false |
| EmptyMethod | 46 | false |
| RedundantSuppression | 42 | false |
| GroovyUnusedAssignment | 32 | false |
| UnnecessaryModifier | 25 | true |
| RedundantFieldInitialization | 21 | false |
| ProtectedMemberInFinalClass | 21 | true |
| UnnecessaryQualifierForThis | 20 | false |
| ZeroLengthArrayInitialization | 17 | false |
| SimplifyOptionalCallChains | 15 | false |
| Convert2Lambda | 15 | false |
| AssignmentToMethodParameter | 14 | false |
| RegExpSimplifiable | 13 | false |
| UtilityClassWithoutPrivateConstructor | 13 | true |
| DataFlowIssue | 13 | false |
| StaticCallOnSubclass | 12 | false |
| NonProtectedConstructorInAbstractClass | 11 | true |
| InnerClassMayBeStatic | 10 | true |
| UnnecessaryBoxing | 10 | false |
| AssignmentToStaticFieldFromInstanceMethod | 7 | false |
| SizeReplaceableByIsEmpty | 7 | true |
| RegExpRedundantNestedCharacterClass | 7 | false |
| AbstractClassNeverImplemented | 7 | false |
| UnusedAssignment | 7 | false |
| NonShortCircuitBoolean | 6 | false |
| IgnoreResultOfCall | 6 | false |
| RegExpRedundantEscape | 5 | false |
| ObsoleteCollection | 5 | false |
| FinalStaticMethod | 5 | false |
| UnnecessarySemicolon | 5 | false |
| OptionalContainsCollection | 5 | false |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| NestedAssignment | 4 | false |
| Convert2MethodRef | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| KeySetIterationMayUseEntrySet | 3 | false |
| EqualsBetweenInconvertibleTypes | 3 | false |
| UnnecessaryUnboxing | 3 | false |
| UseOfPropertiesAsHashtable | 3 | false |
| CastConflictsWithInstanceof | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| StringEqualsEmptyString | 3 | false |
| SystemOutErr | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| UseCompareMethod | 3 | false |
| ThrowFromFinallyBlock | 2 | false |
| CodeBlock2Expr | 2 | true |
| EqualsAndHashcode | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| CatchMayIgnoreException | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| Anonymous2MethodRef | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| MarkedForRemoval | 1 | false |
| StaticInitializerReferencesSubClass | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| FinalPrivateMethod | 1 | false |
| UnnecessaryReturn | 1 | true |
| BooleanConstructor | 1 | false |
| BoundedWildcard | 1 | false |
| MissortedModifiers | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
| RedundantMethodOverride | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| DuplicateThrows | 1 | false |
| FuseStreamOperations | 1 | false |
| InfiniteRecursion | 1 | false |
| OptionalIsPresent | 1 | false |
| Java8MapForEach | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| Java9CollectionFactory | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| ReplaceNullCheck | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[tasksToRun.size()\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/RunOnImportTasksOperation.java`
#### Snippet
```java
                .build();
        BuildLauncher launcher = CorePlugin.internalGradleWorkspace().getGradleBuild(this.buildConfig).newBuildLauncher(runConfiguration, progressAttributes);
        launcher.forTasks(tasksToRun.toArray(new String[tasksToRun.size()])).run();
    }
}
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[newIds.size()\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultWorkspaceOperations.java`
#### Snippet
```java
            List<String> newIds = new ArrayList<>(currentNatureIds);
            newIds.remove(natureId);
            description.setNatureIds(newIds.toArray(new String[newIds.size()]));

            // save the updated description
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[words.size()\]'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
            i = j;
        }
        return words.toArray(new String[words.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[value.size()\]'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportWizardController.java`
#### Snippet
```java
            public void validationTriggered(Property<?> source, Optional<String> validationErrorMessage) {
                List<String> value = target.getValue();
                settings.put(settingsKey, value.toArray(new String[value.size()]));
            }
        });
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `parameterTypes` are written to, but never read
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/IdeFriendlyClassLoading.java`
#### Snippet
```java
                theClass = cls;
            }
            Class<?>[] parameterTypes = new Class[arguments.length];
            for (int i = 0; i < arguments.length; i++) {
                parameterTypes[i] = arguments[i].getClass();
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/HierarchicalElementUtils.java`
#### Snippet
```java
     * Compares {@link EclipseProject}s based on their paths.
     */
    static enum EclipseProjectComparator implements Comparator<EclipseProject> {

        INSTANCE;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/Path.java`
#### Snippet
```java
     * @author Etienne Studer
     */
    private static enum PathComparator implements java.util.Comparator<String> {

        INSTANCE;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/PublishedGradleVersions.java`
#### Snippet
```java
     * @author Stefan Oehme
     */
    public static enum LookupStrategy {
        /**
         * Look only in the local cache file. Fail if it does not exist or is unreadable.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiOperation.java`
#### Snippet
```java
     * @return the operation's scheduling rule
     */
    public ISchedulingRule getRule();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiOperation.java`
#### Snippet
```java
     * @throws Exception if any exception happens during the execution
     */
    public abstract void runInToolingApi(CancellationTokenSource tokenSource, IProgressMonitor monitor) throws Exception;
}

```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiOperation.java`
#### Snippet
```java
     * @throws Exception if any exception happens during the execution
     */
    public abstract void runInToolingApi(CancellationTokenSource tokenSource, IProgressMonitor monitor) throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiOperation.java`
#### Snippet
```java
     * @return the operation name
     */
    public String getName();

    /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        private final String messageTemplate;

        private ToolingApiStatusType(int severity, String messageTemplate) {
            this.severity = severity;
            this.messageTemplate = messageTemplate;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
     * The possible problem types that a {@link ToolingApiStatus} can represent.
     */
    public static enum ToolingApiStatusType {

        BUILD_CANCELLED(IStatus.CANCEL, "%s was cancelled."),
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/InternalGradleWorkspace.java`
#### Snippet
```java
     * @return the Gradle build, never null
     */
    public InternalGradleBuild getGradleBuild(BuildConfiguration buildConfiguration);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/InternalGradleWorkspace.java`
#### Snippet
```java
     * @return the set of Gradle builds
     */
    public Set<InternalGradleBuild> getGradleBuilds();
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @generated
     */
    private DistributionType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringListEditor.java`
#### Snippet
```java

    @FunctionalInterface
    public static interface StringListChangeListener {

        void onChange();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * Token type ID for '{@code /*}'-style multi-line comments.
     */
    public static final String TOKEN_TYPE_MULTILINE_COMMENT = UiPlugin.PLUGIN_ID + ".buildscript.multilinecomment";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * Token type ID for '{@code /*}'-style multi-line comments.
     */
    public static final String TOKEN_TYPE_MULTILINE_COMMENT = UiPlugin.PLUGIN_ID + ".buildscript.multilinecomment";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * Token type ID for '{@code /*}'-style multi-line comments.
     */
    public static final String TOKEN_TYPE_MULTILINE_COMMENT = UiPlugin.PLUGIN_ID + ".buildscript.multilinecomment";

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * All partitions types defined for Gradle build scripts.
     */
    public static final String[] PARTITIONS = { IDocument.DEFAULT_CONTENT_TYPE, TOKEN_TYPE_JAVADOC, TOKEN_TYPE_MULTILINE_COMMENT };
}

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * All partitions types defined for Gradle build scripts.
     */
    public static final String[] PARTITIONS = { IDocument.DEFAULT_CONTENT_TYPE, TOKEN_TYPE_JAVADOC, TOKEN_TYPE_MULTILINE_COMMENT };
}

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * All partitions types defined for Gradle build scripts.
     */
    public static final String[] PARTITIONS = { IDocument.DEFAULT_CONTENT_TYPE, TOKEN_TYPE_JAVADOC, TOKEN_TYPE_MULTILINE_COMMENT };
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * The partitioning for Gradle build script files.
     */
    public static final String PARTITIONING = UiPlugin.PLUGIN_ID + ".buildscript.partitioning";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * The partitioning for Gradle build script files.
     */
    public static final String PARTITIONING = UiPlugin.PLUGIN_ID + ".buildscript.partitioning";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * The partitioning for Gradle build script files.
     */
    public static final String PARTITIONING = UiPlugin.PLUGIN_ID + ".buildscript.partitioning";

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * Token type ID for '{@code /**}'-style multi-line comments.
     */
    public static final String TOKEN_TYPE_JAVADOC = UiPlugin.PLUGIN_ID + ".buildscript.javadoccomment";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * Token type ID for '{@code /**}'-style multi-line comments.
     */
    public static final String TOKEN_TYPE_JAVADOC = UiPlugin.PLUGIN_ID + ".buildscript.javadoccomment";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditorConstants.java`
#### Snippet
```java
     * Token type ID for '{@code /**}'-style multi-line comments.
     */
    public static final String TOKEN_TYPE_JAVADOC = UiPlugin.PLUGIN_ID + ".buildscript.javadoccomment";

    /**
```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'Boolean(boolean)' is deprecated and marked for removal
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
            try {
                testText = new Text(composite, SWT.SEARCH | SWT.ICON_CANCEL);
                useNativeSearchField = new Boolean((testText.getStyle() & SWT.ICON_CANCEL) != 0);
            } finally {
                if (testText != null) {
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `applyOverrideBuildSettings()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java
    @Override
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        GradleRunConfigurationAttributes.applyOverrideBuildSettings(this.gradleProjectSettingsComposite.getOverrideBuildSettingsCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyGradleDistribution(this.gradleProjectSettingsComposite.getGradleDistributionGroup().getDistribution().toGradleDistribution(), configuration);
        GradleRunConfigurationAttributes.applyGradleUserHomeExpression(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getGradleUserHomeText().getText(), configuration);
```

### StaticCallOnSubclass
Static method `applyGradleDistribution()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        GradleRunConfigurationAttributes.applyOverrideBuildSettings(this.gradleProjectSettingsComposite.getOverrideBuildSettingsCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyGradleDistribution(this.gradleProjectSettingsComposite.getGradleDistributionGroup().getDistribution().toGradleDistribution(), configuration);
        GradleRunConfigurationAttributes.applyGradleUserHomeExpression(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getGradleUserHomeText().getText(), configuration);
        GradleRunConfigurationAttributes.applyJavaHomeExpression(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJavaHomeText().getText(), configuration);
```

### StaticCallOnSubclass
Static method `applyGradleUserHomeExpression()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java
        GradleRunConfigurationAttributes.applyOverrideBuildSettings(this.gradleProjectSettingsComposite.getOverrideBuildSettingsCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyGradleDistribution(this.gradleProjectSettingsComposite.getGradleDistributionGroup().getDistribution().toGradleDistribution(), configuration);
        GradleRunConfigurationAttributes.applyGradleUserHomeExpression(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getGradleUserHomeText().getText(), configuration);
        GradleRunConfigurationAttributes.applyJavaHomeExpression(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJavaHomeText().getText(), configuration);
        GradleRunConfigurationAttributes.applyArgumentExpressions(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getArguments(), configuration);
```

### StaticCallOnSubclass
Static method `applyJavaHomeExpression()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java
        GradleRunConfigurationAttributes.applyGradleDistribution(this.gradleProjectSettingsComposite.getGradleDistributionGroup().getDistribution().toGradleDistribution(), configuration);
        GradleRunConfigurationAttributes.applyGradleUserHomeExpression(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getGradleUserHomeText().getText(), configuration);
        GradleRunConfigurationAttributes.applyJavaHomeExpression(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJavaHomeText().getText(), configuration);
        GradleRunConfigurationAttributes.applyArgumentExpressions(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getArguments(), configuration);
        GradleRunConfigurationAttributes.applyJvmArgumentExpressions(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJvmArguments(), configuration);
```

### StaticCallOnSubclass
Static method `applyArgumentExpressions()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java
        GradleRunConfigurationAttributes.applyGradleUserHomeExpression(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getGradleUserHomeText().getText(), configuration);
        GradleRunConfigurationAttributes.applyJavaHomeExpression(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJavaHomeText().getText(), configuration);
        GradleRunConfigurationAttributes.applyArgumentExpressions(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getArguments(), configuration);
        GradleRunConfigurationAttributes.applyJvmArgumentExpressions(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJvmArguments(), configuration);
        GradleRunConfigurationAttributes.applyOfflineMode(this.gradleProjectSettingsComposite.getOfflineModeCheckbox().getSelection(), configuration);
```

### StaticCallOnSubclass
Static method `applyJvmArgumentExpressions()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java
        GradleRunConfigurationAttributes.applyJavaHomeExpression(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJavaHomeText().getText(), configuration);
        GradleRunConfigurationAttributes.applyArgumentExpressions(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getArguments(), configuration);
        GradleRunConfigurationAttributes.applyJvmArgumentExpressions(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJvmArguments(), configuration);
        GradleRunConfigurationAttributes.applyOfflineMode(this.gradleProjectSettingsComposite.getOfflineModeCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyBuildScansEnabled(this.gradleProjectSettingsComposite.getBuildScansCheckbox().getSelection(), configuration);
```

### StaticCallOnSubclass
Static method `applyOfflineMode()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java
        GradleRunConfigurationAttributes.applyArgumentExpressions(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getArguments(), configuration);
        GradleRunConfigurationAttributes.applyJvmArgumentExpressions(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJvmArguments(), configuration);
        GradleRunConfigurationAttributes.applyOfflineMode(this.gradleProjectSettingsComposite.getOfflineModeCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyBuildScansEnabled(this.gradleProjectSettingsComposite.getBuildScansCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyShowConsoleView(this.gradleProjectSettingsComposite.getShowConsoleViewCheckbox().getSelection(), configuration);
```

### StaticCallOnSubclass
Static method `applyBuildScansEnabled()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java
        GradleRunConfigurationAttributes.applyJvmArgumentExpressions(this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJvmArguments(), configuration);
        GradleRunConfigurationAttributes.applyOfflineMode(this.gradleProjectSettingsComposite.getOfflineModeCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyBuildScansEnabled(this.gradleProjectSettingsComposite.getBuildScansCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyShowConsoleView(this.gradleProjectSettingsComposite.getShowConsoleViewCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyShowExecutionView(this.gradleProjectSettingsComposite.getShowExecutionsViewCheckbox().getSelection(), configuration);
```

### StaticCallOnSubclass
Static method `applyShowConsoleView()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java
        GradleRunConfigurationAttributes.applyOfflineMode(this.gradleProjectSettingsComposite.getOfflineModeCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyBuildScansEnabled(this.gradleProjectSettingsComposite.getBuildScansCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyShowConsoleView(this.gradleProjectSettingsComposite.getShowConsoleViewCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyShowExecutionView(this.gradleProjectSettingsComposite.getShowExecutionsViewCheckbox().getSelection(), configuration);
    }
```

### StaticCallOnSubclass
Static method `applyShowExecutionView()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java
        GradleRunConfigurationAttributes.applyBuildScansEnabled(this.gradleProjectSettingsComposite.getBuildScansCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyShowConsoleView(this.gradleProjectSettingsComposite.getShowConsoleViewCheckbox().getSelection(), configuration);
        GradleRunConfigurationAttributes.applyShowExecutionView(this.gradleProjectSettingsComposite.getShowExecutionsViewCheckbox().getSelection(), configuration);
    }

```

### StaticCallOnSubclass
Static method `applyWorkingDirExpression()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectTab.java`
#### Snippet
```java
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        GradleRunConfigurationAttributes.applyTasks(this.tasksList.getEntries(), configuration);
        GradleRunConfigurationAttributes.applyWorkingDirExpression(this.workingDirectoryText.getText(), configuration);
    }

```

### StaticCallOnSubclass
Static method `applyWorkingDirExpression()` declared in class 'org.eclipse.buildship.core.internal.launch.BaseRunConfigurationAttributes' but referenced via subclass 'org.eclipse.buildship.core.internal.launch.GradleRunConfigurationAttributes'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/TestsTab.java`
#### Snippet
```java
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        GradleTestRunConfigurationAttributes.applyTestNames(this.tests.getEntries(), configuration);
        GradleRunConfigurationAttributes.applyWorkingDirExpression(this.workingDirectoryText.getText(), configuration);
    }

```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass WrapperGradleDistribution from superclass GradleDistribution initializer might lead to class loading deadlock
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/GradleDistribution.java`
#### Snippet
```java
public abstract class GradleDistribution {

    private static final WrapperGradleDistribution WRAPPER_DISTRIBUTION = new WrapperGradleDistribution();

    /**
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `fSegments`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
    protected boolean fHasTrailingStar;

    protected String fSegments[]; // the given pattern is split into * separated
    // segments

```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `plugin` from instance context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CorePlugin.java`
#### Snippet
```java
        unregisterServices();
        IdeFriendlyClassLoading.cleanup();
        plugin = null;
        super.stop(context);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `plugin` from instance context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CorePlugin.java`
#### Snippet
```java
    public void start(BundleContext bundleContext) throws Exception {
        super.start(bundleContext);
        plugin = this;
        ensureProxySettingsApplied();
        registerServices(bundleContext);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `plugin` from instance context
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportEditPlugin.java`
#### Snippet
```java
            // Remember the static instance.
            //
            plugin = this;
        }
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelPackage` from instance context
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
    public GradleImportSwitch() {
        if (modelPackage == null) {
            modelPackage = GradleImportPackage.eINSTANCE;
        }
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelPackage` from instance context
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
    public GradleImportAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = GradleImportPackage.eINSTANCE;
        }
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `plugin` from instance context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/UiPlugin.java`
#### Snippet
```java
        unregisterListeners();
        unregisterServices();
        plugin = null;
        super.stop(context);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `plugin` from instance context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/UiPlugin.java`
#### Snippet
```java
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        registerServices(context);
        registerListeners();
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\-` in RegExp
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String PUNYCODE_TLD = "xn\\-\\-[\\w\\-]{0,58}\\w";

    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;
```

### RegExpRedundantEscape
Redundant character escape `\-` in RegExp
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;

    private static final String DOMAIN_NAME_STR = "(" + HOST_NAME + "|" + IP_ADDRESS_STRING + ")";
```

### RegExpRedundantEscape
Redundant character escape `\-` in RegExp
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;

    private static final String DOMAIN_NAME_STR = "(" + HOST_NAME + "|" + IP_ADDRESS_STRING + ")";
    public static final Pattern DOMAIN_NAME = Pattern.compile(DOMAIN_NAME_STR);

```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     * RFC 3492 references RFC 1034 and limits Punycode algorithm output to 63 characters.
     */
    private static final String PUNYCODE_TLD = "xn\\-\\-[\\w\\-]{0,58}\\w";

    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     * RFC 3492 references RFC 1034 and limits Punycode algorithm output to 63 characters.
     */
    private static final String PUNYCODE_TLD = "xn\\-\\-[\\w\\-]{0,58}\\w";

    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CorePlugin.java`
#### Snippet
```java
        // store services with low ranking such that they can be overridden
        // during testing or the like
        Dictionary<String, Object> preferences = new Hashtable<>();
        preferences.put(Constants.SERVICE_RANKING, 1);

```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/UiPlugin.java`
#### Snippet
```java
        // store services with low ranking such that they can be overridden
        // during testing or the like
        Dictionary<String, Object> preferences = new Hashtable<>();
        preferences.put(Constants.SERVICE_RANKING, 1);

```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/UiPlugin.java`
#### Snippet
```java
        preferences.put(Constants.SERVICE_RANKING, 1);

        Dictionary<String, Object> priorityPreferences = new Hashtable<>();
        priorityPreferences.put(Constants.SERVICE_RANKING, 2);

```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
        }

        Vector<String> temp = new Vector<>();

        int pos = 0;
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
        }

        Vector<String> temp = new Vector<>();

        int pos = 0;
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `projects.keySet()` may be replaced with 'entrySet()' iteration
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CorePlugin.java`
#### Snippet
```java
        }

        for (BuildConfiguration config : projects.keySet()) {
            PersistentModel model = modelPersistence().loadModel(projects.get(config));
            if (!model.isPresent()) {
```

### KeySetIterationMayUseEntrySet
Iteration over `plusEntries.keySet()` may be replaced with 'entrySet()' iteration
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/DefaultExternalLaunchConfigurationManager.java`
#### Snippet
```java

    private void updateLaunchConfiguration(ILaunchConfigurationWorkingCopy configuration, Map<String, String> plusEntries, Set<String> minusEntries) {
        for (String key : plusEntries.keySet()) {
            configuration.setAttribute(key, plusEntries.get(key));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `arguments.keySet()` may be replaced with 'entrySet()' iteration
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/preferences/BuildCommandConverter.java`
#### Snippet
```java
                if (!arguments.isEmpty()) {

                    for (String key : arguments.keySet()) {
                        String value = arguments.get(key);
                        Element argumentNode = createNode(document, commandNode, TAG_ARGUMENT, value);
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `RateLimitingProgressMonitor` on 'super' is unnecessary in this context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/progress/RateLimitingProgressMonitor.java`
#### Snippet
```java
                String taskName = RateLimitingProgressMonitor.this.lastTask.getAndSet(null);
                if (taskName != null) {
                    RateLimitingProgressMonitor.super.setTaskName(taskName);
                }
                String subTaskName = RateLimitingProgressMonitor.this.lastSubTask.getAndSet(null);
```

### UnnecessaryQualifierForThis
Qualifier `RateLimitingProgressMonitor` on 'super' is unnecessary in this context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/progress/RateLimitingProgressMonitor.java`
#### Snippet
```java
                String subTaskName = RateLimitingProgressMonitor.this.lastSubTask.getAndSet(null);
                if (subTaskName != null) {
                    RateLimitingProgressMonitor.super.subTask(subTaskName);
                }
            }
```

### UnnecessaryQualifierForThis
Qualifier `RunGradleTestLaunchRequestJob` on 'this' is unnecessary in this context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/RunGradleTestLaunchRequestJob.java`
#### Snippet
```java
    protected TestLauncher createLaunch(InternalGradleBuild gradleBuild, GradleProgressAttributes progressAttributes, ProcessDescription processDescription) {
        TestLauncher launcher = gradleBuild.newTestLauncher(this.runConfiguration, progressAttributes);
        launcher.withTests(RunGradleTestLaunchRequestJob.this.testDescriptors);
        return launcher;
    }
```

### UnnecessaryQualifierForThis
Qualifier `RunGradleBuildLaunchRequestJob` on 'this' is unnecessary in this context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/RunGradleBuildLaunchRequestJob.java`
#### Snippet
```java
    protected BuildLauncher createLaunch(InternalGradleBuild gradleBuild, GradleProgressAttributes progressAttributes, ProcessDescription processDescription) {
        BuildLauncher launcher = gradleBuild.newBuildLauncher(this.runConfig, progressAttributes);
        launcher.forTasks(RunGradleBuildLaunchRequestJob.this.runConfig.getTasks().toArray(new String[0]));
        return launcher;
    }
```

### UnnecessaryQualifierForThis
Qualifier `SynchronizationJob` on 'this' is unnecessary in this context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SynchronizationJob.java`
#### Snippet
```java
    @Override
    public Void runInToolingApi(CancellationTokenSource tokenSource, IProgressMonitor monitor) throws Exception {
        final SubMonitor progress = SubMonitor.convert(monitor, ImmutableSet.copyOf(SynchronizationJob.this.gradleBuilds).size() + 1);

        for (GradleBuild build : SynchronizationJob.this.gradleBuilds) {
```

### UnnecessaryQualifierForThis
Qualifier `SynchronizationJob` on 'this' is unnecessary in this context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SynchronizationJob.java`
#### Snippet
```java
        final SubMonitor progress = SubMonitor.convert(monitor, ImmutableSet.copyOf(SynchronizationJob.this.gradleBuilds).size() + 1);

        for (GradleBuild build : SynchronizationJob.this.gradleBuilds) {
            if (monitor.isCanceled()) {
                throw new OperationCanceledException();
```

### UnnecessaryQualifierForThis
Qualifier `SynchronizationJob` on 'this' is unnecessary in this context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SynchronizationJob.java`
#### Snippet
```java
                throw new OperationCanceledException();
            }
            SynchronizationResult result = ((DefaultGradleBuild)build).synchronize(SynchronizationJob.this.newProjectHandler, tokenSource, progress.newChild(1));
            if (result.getStatus().getException() instanceof Exception) {
                throw (Exception) result.getStatus().getException();
```

### UnnecessaryQualifierForThis
Qualifier `DefaultModelProvider` on 'this' is unnecessary in this context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultModelProvider.java`
#### Snippet
```java
    public <T>  Map<String, T> fetchModels(Class<T> model, FetchStrategy strategy, CancellationTokenSource tokenSource, IProgressMonitor monitor) {
        return executeOperation(() ->
            DefaultModelProvider.this.gradleBuild.withConnection(connection -> {
                BuildEnvironment buildEnvironment = connection.getModel(BuildEnvironment.class);
                GradleVersion gradleVersion = GradleVersion.version(buildEnvironment.getGradle().getGradleVersion());
```

### UnnecessaryQualifierForThis
Qualifier `DefaultModelProvider` on 'this' is unnecessary in this context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultModelProvider.java`
#### Snippet
```java
            // TODO (donat) Right now, project configurators can only get cached model query results if they invoke the same exact actions
            // used below. We should fix this by letting configurators declare their required models.
            DefaultModelProvider.this.gradleBuild.withConnection(connection -> EclipseModelUtils.runTasksAndQueryModels(connection), tokenSource, monitor),
        FetchStrategy.FORCE_RELOAD, EclipseProject.class);
    }
```

### UnnecessaryQualifierForThis
Qualifier `DefaultModelProvider` on 'this' is unnecessary in this context
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultModelProvider.java`
#### Snippet
```java
    public <T> T fetchModel(final Class<T> model, FetchStrategy strategy, CancellationTokenSource tokenSource, IProgressMonitor monitor) {
        return executeOperation(() ->
            DefaultModelProvider.this.gradleBuild.withConnection(connection -> {
                return queryModel(model, connection);
            }, tokenSource, monitor),
```

### UnnecessaryQualifierForThis
Qualifier `StringListEditor` on 'this' is unnecessary in this context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringListEditor.java`
#### Snippet
```java

    public void removeSelected() {
        List<Integer> indexes = Ints.asList(StringListEditor.this.table.getSelectionIndices());
        Collections.sort(indexes, Collections.reverseOrder());
        for (Integer index : indexes) {
```

### UnnecessaryQualifierForThis
Qualifier `StringListEditor` on 'this' is unnecessary in this context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringListEditor.java`
#### Snippet
```java
        Collections.sort(indexes, Collections.reverseOrder());
        for (Integer index : indexes) {
            StringListEditor.this.table.remove(index);
            Control cellEditor = this.editor.getEditor();
            if (cellEditor != null && !cellEditor.isDisposed()) {
```

### UnnecessaryQualifierForThis
Qualifier `SelectionHistoryManager` on 'this' is unnecessary in this context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/nodeselection/SelectionHistoryManager.java`
#### Snippet
```java
    private void fireSelectionChanged() {
        final SelectionChangedEvent selectionChangedEvent = new SelectionChangedEvent(
                SelectionHistoryManager.this.treeViewer, getSelection());
        for (final ISelectionChangedListener listener : this.selectionChangedListeners) {
            // using SafeRunnable here to ensure that no
```

### UnnecessaryQualifierForThis
Qualifier `QuickSearchManager` on 'this' is unnecessary in this context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/QuickSearchManager.java`
#### Snippet
```java
    private void performSearch() {
        // iterate through all tree items and find the ones matching the search pattern
        final String searchText = QuickSearchManager.this.state.searchText.toUpperCase();
        Predicate<TreeItem> predicate = new Predicate<TreeItem>() {

```

### UnnecessaryQualifierForThis
Qualifier `ProjectCreationWizard` on 'this' is unnecessary in this context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizard.java`
#### Snippet
```java
        IWizardPage currentPage = getContainer().getCurrentPage();
        if (this.projectPreviewPage.equals(currentPage)) {
            File projectDir = ProjectCreationWizard.this.importController.getConfiguration().getProjectDir().getValue();
            if (projectDir != null) {
                FileUtils.deleteRecursively(projectDir);
```

### UnnecessaryQualifierForThis
Qualifier `GradleOptionsWizardPage` on 'this' is unnecessary in this context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/GradleOptionsWizardPage.java`
#### Snippet
```java

        this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getArgumentsEditor().addChangeListener(() ->
                getConfiguration().getArguments().setValue(GradleOptionsWizardPage.this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getArguments()));

        this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJvmArgumentsEditor().addChangeListener(() ->
```

### UnnecessaryQualifierForThis
Qualifier `GradleOptionsWizardPage` on 'this' is unnecessary in this context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/GradleOptionsWizardPage.java`
#### Snippet
```java

        this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJvmArgumentsEditor().addChangeListener(() ->
                getConfiguration().getJvmArguments().setValue(GradleOptionsWizardPage.this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJvmArguments()));

        this.gradleProjectSettingsComposite.getShowConsoleViewCheckbox().addSelectionListener(new SelectionListener() {
```

### UnnecessaryQualifierForThis
Qualifier `ProjectPreviewWizardPage` on 'this' is unnecessary in this context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectPreviewWizardPage.java`
#### Snippet
```java
            // update Gradle user home
            String gradleUserHome = getGradleUserHomePath(buildEnvironment);
            ProjectPreviewWizardPage.this.gradleUserHomeLabel.setText(gradleUserHome);

            // update Gradle version
```

### UnnecessaryQualifierForThis
Qualifier `ProjectPreviewWizardPage` on 'this' is unnecessary in this context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectPreviewWizardPage.java`
#### Snippet
```java
            // update Gradle version
            String gradleVersion = buildEnvironment.getGradle().getGradleVersion();
            ProjectPreviewWizardPage.this.gradleVersionLabel.setText(gradleVersion);
            updateGradleVersionWarningLabel();

```

### UnnecessaryQualifierForThis
Qualifier `ProjectPreviewWizardPage` on 'this' is unnecessary in this context
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectPreviewWizardPage.java`
#### Snippet
```java
            // update Java home
            String javaHome = buildEnvironment.getJava().getJavaHome().getAbsolutePath();
            ProjectPreviewWizardPage.this.javaHomeLabel.setText(javaHome);
        }
    }
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/IdeFriendlyClassLoading.java`
#### Snippet
```java
    }

    private static final Class<?> loadClassWithIdeFriendlyClassLoader(String classname) throws Exception {
        ClassLoader compatClassloader = TellGradleToRunAutoSyncTasks.class.getClassLoader();
        ClassLoader tapiClassloader = ProjectConnection.class.getClassLoader();
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]` can be simplified to ' -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽\&\&\[\^ \[ - \]   　\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     * Valid characters for IRI TLD defined in RFC 3987.
     */
    private static final String TLD_CHAR = "a-zA-Z" + UCS_CHAR;

    /**
```

### RegExpSimplifiable
`[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\uD800\uDC00-\uD83F\uDFFD\uD840\uDC00-\uD87F\uDFFD\uD880\uDC...` can be simplified to ' -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽\&\&\[\^ \[ - \]   　\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     * Valid UCS characters defined in RFC 3987. Excludes space characters.
     */
    private static final String UCS_CHAR = "[" +
            "\u00A0-\uD7FF" +
            "\uF900-\uFDCF" +
            "\uFDF0-\uFFEF" +
            "\uD800\uDC00-\uD83F\uDFFD" +
            "\uD840\uDC00-\uD87F\uDFFD" +
            "\uD880\uDC00-\uD8BF\uDFFD" +
            "\uD8C0\uDC00-\uD8FF\uDFFD" +
            "\uD900\uDC00-\uD93F\uDFFD" +
            "\uD940\uDC00-\uD97F\uDFFD" +
            "\uD980\uDC00-\uD9BF\uDFFD" +
            "\uD9C0\uDC00-\uD9FF\uDFFD" +
            "\uDA00\uDC00-\uDA3F\uDFFD" +
            "\uDA40\uDC00-\uDA7F\uDFFD" +
            "\uDA80\uDC00-\uDABF\uDFFD" +
            "\uDAC0\uDC00-\uDAFF\uDFFD" +
            "\uDB00\uDC00-\uDB3F\uDFFD" +
            "\uDB44\uDC00-\uDB7F\uDFFD" +
            "&&[^\u00A0[\u2000-\u200A]\u2028\u2029\u202F\u3000]]";

    /**
```

### RegExpSimplifiable
`[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]` can be simplified to ' -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽\&\&\[\^ \[ - \]   　\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String PUNYCODE_TLD = "xn\\-\\-[\\w\\-]{0,58}\\w";

    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;
```

### RegExpSimplifiable
`[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]` can be simplified to ' -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽\&\&\[\^ \[ - \]   　\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;

    private static final String DOMAIN_NAME_STR = "(" + HOST_NAME + "|" + IP_ADDRESS_STRING + ")";
```

### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;

    private static final String DOMAIN_NAME_STR = "(" + HOST_NAME + "|" + IP_ADDRESS_STRING + ")";
```

### RegExpSimplifiable
`[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]` can be simplified to ' -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽\&\&\[\^ \[ - \]   　\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;

    private static final String DOMAIN_NAME_STR = "(" + HOST_NAME + "|" + IP_ADDRESS_STRING + ")";
```

### RegExpSimplifiable
`[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]` can be simplified to ' -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽\&\&\[\^ \[ - \]   　\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;

    private static final String DOMAIN_NAME_STR = "(" + HOST_NAME + "|" + IP_ADDRESS_STRING + ")";
    public static final Pattern DOMAIN_NAME = Pattern.compile(DOMAIN_NAME_STR);

```

### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;

    private static final String DOMAIN_NAME_STR = "(" + HOST_NAME + "|" + IP_ADDRESS_STRING + ")";
    public static final Pattern DOMAIN_NAME = Pattern.compile(DOMAIN_NAME_STR);

```

### RegExpSimplifiable
`[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]` can be simplified to ' -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽\&\&\[\^ \[ - \]   　\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     * Valid characters for IRI label defined in RFC 3987.
     */
    private static final String LABEL_CHAR = "a-zA-Z0-9" + UCS_CHAR;

    /**
```

### RegExpSimplifiable
`[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]` can be simplified to ' -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽\&\&\[\^ \[ - \]   　\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     */
    private static final String IRI_LABEL =
            "[" + LABEL_CHAR + "](?:[" + LABEL_CHAR + "\\-]{0,61}[" + LABEL_CHAR + "]){0,1}";

    /**
```

### RegExpSimplifiable
`[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]` can be simplified to ' -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽\&\&\[\^ \[ - \]   　\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     */
    private static final String IRI_LABEL =
            "[" + LABEL_CHAR + "](?:[" + LABEL_CHAR + "\\-]{0,61}[" + LABEL_CHAR + "]){0,1}";

    /**
```

### RegExpSimplifiable
`[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]` can be simplified to ' -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽\&\&\[\^ \[ - \]   　\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     */
    private static final String IRI_LABEL =
            "[" + LABEL_CHAR + "](?:[" + LABEL_CHAR + "\\-]{0,61}[" + LABEL_CHAR + "]){0,1}";

    /**
```

### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     */
    private static final String IRI_LABEL =
            "[" + LABEL_CHAR + "](?:[" + LABEL_CHAR + "\\-]{0,61}[" + LABEL_CHAR + "]){0,1}";

    /**
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`unsupportedVersions.size() == 0` can be replaced with 'unsupportedVersions.isEmpty()'
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java
        Predicate<GradleVersion> toolingApiConstraint = GradleVersionConstraints.toPredicate(">=2.6");
        Set<String> unsupportedVersions = CompatibilityChecker.compatibilityMap.get(JavaVersion.current().getMajorVersion());
        Predicate<GradleVersion> javaVersionConstraint = (ignoreJavaConstraint || unsupportedVersions == null || unsupportedVersions.size() == 0) ? Predicates.alwaysTrue() : GradleVersionConstraints.toPredicate("!=" + unsupportedVersions.stream().collect(Collectors.joining(" !=")));
        @SuppressWarnings("unchecked")
        Predicate<GradleVersion> matchingVersions = Predicates.and(versionConstraint, toolingApiConstraint, javaVersionConstraint);
```

### SizeReplaceableByIsEmpty
`label.length() == 0` can be replaced with 'label.isEmpty()'
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
    public String getText(Object object) {
        String label = ((GradleImportTask) object).getID();
        return label == null || label.length() == 0 ? getString("_UI_GradleImportTask_type") : getString("_UI_GradleImportTask_type") + " " + label;
    }

```

### SizeReplaceableByIsEmpty
`buf.length() > 0` can be replaced with '!buf.isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
                    break;
                case '*':
                    if (buf.length() > 0) {
                        /* new segment */
                        temp.addElement(buf.toString());
```

### SizeReplaceableByIsEmpty
`buf.length() > 0` can be replaced with '!buf.isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java

        /* add last buffer to segment list */
        if (buf.length() > 0) {
            temp.addElement(buf.toString());
            this.fBound += buf.length();
```

### SizeReplaceableByIsEmpty
`text.length() > 0` can be replaced with '!text.isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
                    FilteredTree.this.treeViewer.refresh(true);

                    if (text.length() > 0 && !initial) {
                        /*
                         * Expand elements one at a time. After each is expanded, check to see if
```

### SizeReplaceableByIsEmpty
`filterTextString.length() == 0` can be replaced with 'filterTextString.isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
            public void getName(AccessibleEvent e) {
                String filterTextString = FilteredTree.this.filterText.getText();
                if (filterTextString.length() == 0 || filterTextString.equals(FilteredTree.this.initialText)) {
                    e.result = FilteredTree.this.initialText;
                } else {
```

### SizeReplaceableByIsEmpty
`searchText.length() > 0` can be replaced with '!searchText.isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/QuickSearchManager.java`
#### Snippet
```java
        private void removeLastCharacterFromSearchText() {
            String searchText = this.searchText;
            if (searchText.length() > 0) {
                this.searchText = searchText.substring(0, searchText.length() - 1);
            }
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
                if (hasItems && e.keyCode == SWT.ARROW_DOWN) {
                    FilteredTree.this.treeViewer.getTree().setFocus();
                    return;
                }
            }
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `success &= deleteRecursively(child)`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/file/FileUtils.java`
#### Snippet
```java
            File[] children = file.listFiles();
            for (File child : children) {
                success &= deleteRecursively(child);
            }
            return success && file.delete();
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_COMPLIANCE, sour...`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/JavaSourceSettingsUpdater.java`
#### Snippet
```java

        boolean compilerOptionChanged = false;
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_COMPLIANCE, sourceVersion);
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_SOURCE, sourceVersion);
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, targetVersion);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_SOURCE, sourceVe...`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/JavaSourceSettingsUpdater.java`
#### Snippet
```java
        boolean compilerOptionChanged = false;
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_COMPLIANCE, sourceVersion);
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_SOURCE, sourceVersion);
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, targetVersion);

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_CODEGEN_TARGET_P...`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/JavaSourceSettingsUpdater.java`
#### Snippet
```java
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_COMPLIANCE, sourceVersion);
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_SOURCE, sourceVersion);
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, targetVersion);

        if (compilerOptionChanged && isProjectAutoBuildingEnabled()) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `layout |= updateWarningVisibility(getEnabled(), this.gradleUserHomeText, this.gradleUserHomeWarningL...`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java
    private void updateWarningVisibility() {
        boolean layout = false;
        layout |= updateWarningVisibility(getEnabled(), this.gradleUserHomeText, this.gradleUserHomeWarningLabel);
        layout |= updateWarningVisibility(getEnabled(), this.javaHomeText, this.javaHomeWarningLabel);
        if (layout) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `layout |= updateWarningVisibility(getEnabled(), this.javaHomeText, this.javaHomeWarningLabel)`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java
        boolean layout = false;
        layout |= updateWarningVisibility(getEnabled(), this.gradleUserHomeText, this.gradleUserHomeWarningLabel);
        layout |= updateWarningVisibility(getEnabled(), this.javaHomeText, this.javaHomeWarningLabel);
        if (layout) {
            // the Control.requestLayout() method was introduced in Eclipse Neon
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/IdeFriendlyClassLoading.java`
#### Snippet
```java
    }

    private static final Class<?> loadClassWithIdeFriendlyClassLoader(String classname) throws Exception {
        ClassLoader compatClassloader = TellGradleToRunAutoSyncTasks.class.getClassLoader();
        ClassLoader tapiClassloader = ProjectConnection.class.getClassLoader();
```

### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/gradle/GradleProgressAttributes.java`
#### Snippet
```java
    }

    public static final GradleProgressAttributesBuilder builder(CancellationTokenSource tokenSource, IProgressMonitor monitor) {
        return new GradleProgressAttributesBuilder(tokenSource, monitor);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SynchronizationProblem.java`
#### Snippet
```java
    }

    public static final SynchronizationProblem newError(String pluginId, IResource resource, String message, Exception exception) {
        return new SynchronizationProblem(pluginId, resource, message, exception, IStatus.ERROR);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SynchronizationProblem.java`
#### Snippet
```java
    }

    public static final SynchronizationProblem newWarning(String pluginId, IResource resource, String message, Exception exception) {
        return new SynchronizationProblem(pluginId, resource, message, exception, IStatus.WARNING);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/GradleProjectSettingsComposite.java`
#### Snippet
```java
    }

    public static final GradleProjectSettingsCompositeBuilder builder(Composite parent) {
        return new GradleProjectSettingsCompositeBuilder(parent);
    }
```

## RuleId[id=BooleanConstructor]
### BooleanConstructor
Boolean constructor call
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
            try {
                testText = new Text(composite, SWT.SEARCH | SWT.ICON_CANCEL);
                useNativeSearchField = new Boolean((testText.getStyle() & SWT.ICON_CANCEL) != 0);
            } finally {
                if (testText != null) {
```

## RuleId[id=RegExpRedundantNestedCharacterClass]
### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String PUNYCODE_TLD = "xn\\-\\-[\\w\\-]{0,58}\\w";

    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;

    private static final String DOMAIN_NAME_STR = "(" + HOST_NAME + "|" + IP_ADDRESS_STRING + ")";
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;

    private static final String DOMAIN_NAME_STR = "(" + HOST_NAME + "|" + IP_ADDRESS_STRING + ")";
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;

    private static final String DOMAIN_NAME_STR = "(" + HOST_NAME + "|" + IP_ADDRESS_STRING + ")";
    public static final Pattern DOMAIN_NAME = Pattern.compile(DOMAIN_NAME_STR);

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     */
    private static final String IRI_LABEL =
            "[" + LABEL_CHAR + "](?:[" + LABEL_CHAR + "\\-]{0,61}[" + LABEL_CHAR + "]){0,1}";

    /**
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     */
    private static final String IRI_LABEL =
            "[" + LABEL_CHAR + "](?:[" + LABEL_CHAR + "\\-]{0,61}[" + LABEL_CHAR + "]){0,1}";

    /**
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
     */
    private static final String IRI_LABEL =
            "[" + LABEL_CHAR + "](?:[" + LABEL_CHAR + "\\-]{0,61}[" + LABEL_CHAR + "]){0,1}";

    /**
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `LegacyEclipseSpockTestHelper` has no concrete subclass
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/LegacyEclipseSpockTestHelper.java`
#### Snippet
```java
 * The abstract modifier is set in order to be excluded from the test execution.
 */
public abstract class LegacyEclipseSpockTestHelper {

    private LegacyEclipseSpockTestHelper() {
```

### AbstractClassNeverImplemented
Abstract class `Combinations` has no concrete subclass
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/Combinations.java`
#### Snippet
```java
 * @author Etienne Studer
 */
public abstract class Combinations {

    private Combinations() {
```

### AbstractClassNeverImplemented
Abstract class `GradleVersionConstraints` has no concrete subclass
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionConstraints.java`
#### Snippet
```java
 * @author Etienne Studer
 */
public abstract class GradleVersionConstraints {

    private static final String CURRENT = "current";
```

### AbstractClassNeverImplemented
Abstract class `LegacyEclipseSpockTestHelper` has no concrete subclass
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/LegacyEclipseSpockTestHelper.java`
#### Snippet
```java
 * The abstract modifier is set in order to be excluded from the test execution.
 */
public abstract class LegacyEclipseSpockTestHelper {

    private LegacyEclipseSpockTestHelper() {
```

### AbstractClassNeverImplemented
Abstract class `Combinations` has no concrete subclass
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/Combinations.java`
#### Snippet
```java
 * @author Etienne Studer
 */
public abstract class Combinations {

    private Combinations() {
```

### AbstractClassNeverImplemented
Abstract class `GradleVersionConstraints` has no concrete subclass
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/GradleVersionConstraints.java`
#### Snippet
```java
 * @author Etienne Studer
 */
public abstract class GradleVersionConstraints {

    private static final String CURRENT = "current";
```

### AbstractClassNeverImplemented
Abstract class `LegacyEclipseSpockTestHelper` has no concrete subclass
in `org.eclipse.buildship.ui.test/src/main/groovy/org/eclipse/buildship/ui/internal/test/fixtures/LegacyEclipseSpockTestHelper.java`
#### Snippet
```java
 * The abstract modifier is set in order to be excluded from the test execution.
 */
public abstract class LegacyEclipseSpockTestHelper {

    private LegacyEclipseSpockTestHelper() {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Test`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/DefaultGradleLaunchConfigurationManager.java`
#### Snippet
```java
    }

    private String testRunConfigName(File workingDir, List<Test> tests) {
        // TODO (donat) add test coverage
        String rawLaunchConfigurationName;
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/InitializeNewProjectOperation.java`
#### Snippet
```java

    private final BuildConfiguration buildConfiguration;
    private final static String CURRENT_JAVA_VERSION = JavaVersion.current().getMajorVersion();

    public InitializeNewProjectOperation(BuildConfiguration buildConfiguration) {
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ConnectionAwareLauncherProxy.java`
#### Snippet
```java
            if (args == null) {
                return invokeRun(m);
            } else if (args.length == 1 && args[0].getClass() == ResultHandler.class) {
                return invokeRun(m, args[0]);
            }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'ProjectPreviewWizardPage' and 'IWizardPage'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizard.java`
#### Snippet
```java
        // needs to be removed
        IWizardPage currentPage = getContainer().getCurrentPage();
        if (this.projectPreviewPage.equals(currentPage)) {
            File projectDir = ProjectCreationWizard.this.importController.getConfiguration().getProjectDir().getValue();
            if (projectDir != null) {
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'ProjectPreviewWizardPage' and 'IWizardPage'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizard.java`
#### Snippet
```java
        @Override
        public void pageChanged(PageChangedEvent event) {
            if (this.projectCreationWizard.projectPreviewPage.equals(this.previousPage) && this.projectCreationWizard.gradleOptionsPage.equals(event.getSelectedPage())) {
                // user moved back, so we need to delete the previously created Gradle project
                File projectDir = this.projectCreationWizard.importController.getConfiguration().getProjectDir().getValue();
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal() can be replaced with ThreadLocal.withInitial()
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/DefaultExternalLaunchConfigurationManager.java`
#### Snippet
```java
        // listener again and causing a stack overflow error.
        // see https://github.com/eclipse/buildship/issues/617
        private final ThreadLocal<Boolean> configChangeCalled = new ThreadLocal<Boolean>() {

            @Override
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Matcher.matches()` is ignored
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/GradleVersion.java`
#### Snippet
```java
            Matcher m = Pattern.compile("(\\d+)([a-z])?").matcher(number);
            try {
                m.matches();
                this.number = Integer.parseInt(m.group(1));
            } catch (Exception e) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/preferences/DefaultModelPersistence.java`
#### Snippet
```java
    @Override
    public void deleteModel(IProject project) {
        preferencesFile(project).delete();
        this.modelCache.invalidate(project);
    }
```

### IgnoreResultOfCall
Result of `AbstractRunConfiguration.equals()` is ignored
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultTestRunConfiguration.java`
#### Snippet
```java
    public boolean equals(Object obj) {
        if (obj instanceof DefaultTestRunConfiguration) {
            super.equals(obj);
        }
        return false;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/PreferenceStore.java`
#### Snippet
```java
            try {
                if (!this.propertiesFile.exists()) {
                    this.propertiesFile.getParentFile().mkdirs();
                    Files.touch(this.propertiesFile);
                }
```

### IgnoreResultOfCall
Result of `UiBuilder.control()` is ignored
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/NewGradleProjectWizardPage.java`
#### Snippet
```java

        // project name label
        uiBuilderFactory.newLabel(projectNameComposite).alignLeft().text(ProjectWizardMessages.Label_ProjectName).control();

        // project name text field
```

### IgnoreResultOfCall
Result of `UiBuilder.control()` is ignored
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/GradleProjectWizardPage.java`
#### Snippet
```java

        // project directory label
        uiBuilderFactory.newLabel(projectDirectoryComposite).alignLeft().text(ProjectWizardMessages.Label_ProjectRootDirectory).control();

        // project directory text field
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
            this.foundAnyCache.put(parent, foundAny);
        }
        return foundAny.booleanValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
        if (filtered == null) {
            Boolean foundAny = this.foundAnyCache.get(parent);
            if (foundAny != null && !foundAny.booleanValue()) {
                filtered = EMPTY;
            } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java

        }
        return useNativeSearchField.booleanValue();
    }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getProperties()` is identical to its super method
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultRunConfiguration.java`
#### Snippet
```java
    }

    RunConfigurationProperties getProperties() {
        return this.properties;
    }
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Comparator` is the same as one of its superclass' names
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/Path.java`
#### Snippet
```java
     * Singleton comparator to compare {@code Path} instances.
     */
    public enum Comparator implements java.util.Comparator<Path> {

        INSTANCE;
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CompatibilityChecker.java`
#### Snippet
```java
                    inputStream.close();
                } catch (IOException e) {
                    throw new GradlePluginsRuntimeException(e);
                }
            }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/GradleVersion.java`
#### Snippet
```java
                    inputStream.close();
                } catch (IOException e) {
                    throw new GradlePluginsRuntimeException(e);
                }
            }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
            int currentMatch;
            int k = current.indexOf(fSingleWildCard);
            if (k < 0) {
                currentMatch = textPosIn(text, tCurPos, end, current);
                if (currentMatch < 0) {
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/LaunchUtils.java`
#### Snippet
```java
        monitor.beginTask(name, IProgressMonitor.UNKNOWN);
        try {
            if (!jobOrNull.isPresent()) {
                return;
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/LaunchConfigurationScope.java`
#### Snippet
```java
            for (IPackageFragmentRoot sourceFolder : soureFolders) {
                Optional<Set<String>> scope = ClasspathUtils.scopesFor(sourceFolder.getRawClasspathEntry());
                if (!scope.isPresent()) {
                    return INCLUDE_ALL;
                }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/LaunchConfigurationScope.java`
#### Snippet
```java

            Optional<Set<String>> entryUsedByScopes = ClasspathUtils.usedByScopesFor(entry);
            if (!entryUsedByScopes.isPresent() || entryUsedByScopes.get().isEmpty()) {
                return true;
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/TestExecutionTarget.java`
#### Snippet
```java
        List<IJavaElement> allElements = ImmutableList.<IJavaElement>builder().addAll(types).addAll(methods).build();
        Optional<String> result = validateJavaElements(allElements);
        if (!result.isPresent()) {
            result = validateTypes(types);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/TestExecutionTarget.java`
#### Snippet
```java
            result = validateTypes(types);
        }
        if (!result.isPresent()) {
            result =  validateMethods(methods);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/TestExecutionTarget.java`
#### Snippet
```java
        public Optional<String> validate() {
            Optional<String> result = canExecuteTestRun(this.selection.getSelectedTypes(), this.selection.getSelectedMethods());
            if (!result.isPresent() && "debug".equals(this.mode)) { //$NON-NLS-1$
                result = supportsTestDebugging(this.project);
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/TestExecutionTarget.java`
#### Snippet
```java
        public Optional<String> validate() {
            Optional<String> result = validateGradleProject(this.project);
            if (!result.isPresent()) {
                result = this.tests.isEmpty() ? Optional.of(NLS.bind(LaunchMessages.Validation_Message_NoTests_0, this.project.getName())) : Optional.empty();
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/TestExecutionTarget.java`
#### Snippet
```java
                result = this.tests.isEmpty() ? Optional.of(NLS.bind(LaunchMessages.Validation_Message_NoTests_0, this.project.getName())) : Optional.empty();
            }
            if (!result.isPresent()) {
                result = "debug".equals(this.mode) ? supportsTestDebugging(this.project) : Optional.empty(); //$NON-NLS-1$
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerInitializer.java`
#### Snippet
```java

            Optional<GradleBuild> gradleBuild = GradleCore.getWorkspace().getBuild(project);
            if (!gradleBuild.isPresent()) {
                GradleClasspathContainerUpdater.clear(javaProject, null);
            } else if (!((DefaultGradleBuild)gradleBuild.get()).isSynchronizing()) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.oomph/src/main/java/org/eclipse/buildship/oomph/impl/CustomGradleImportTaskImpl.java`
#### Snippet
```java

                for (IProject project : ROOT.getProjects()) {
                    if (!gradleBuildHolder.isPresent() && project.getLocation().equals(new Path(sourceLocator.getRootFolder()))) {
                        gradleBuildHolder = workspace.getBuild(project);
                        context.log(NLS.bind(ImportTaskMessages.GradleImportTaskImpl_found_existing, project.getName()));
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/gradle/GradleDistributionViewModel.java`
#### Snippet
```java
        java.util.Optional<GradleDistributionViewModel.Type> typeOrNull = getType();

        if (!typeOrNull.isPresent()) {
            return "Unknown Gradle distribution " + this.configuration; // TODO (donat) NLS
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/gradle/GradleDistributionViewModel.java`
#### Snippet
```java
    public Optional<String> validate() {
        java.util.Optional<GradleDistributionViewModel.Type> typeOrNull = getType();
        if (!typeOrNull.isPresent()) {
            return Optional.of("Invalid distribution type"); // TODO (donat) externalize string
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/SelectionPropertyTester.java`
#### Snippet
```java
    private boolean selectionIsLaunchableAsTestDebug(Collection<?> elements) {
        JavaElementSelection selection = SelectionJavaElementResolver.from(elements);
        return !TestExecutionTarget.from(selection, "debug").validate().isPresent();
    }
}
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/SelectionPropertyTester.java`
#### Snippet
```java
    private boolean selectionIsLaunchableAsTest(Collection<?> elements) {
        JavaElementSelection selection = SelectionJavaElementResolver.from(elements);
        return !TestExecutionTarget.from(selection, "run").validate().isPresent();

    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectPreviewWizardPage.java`
#### Snippet
```java

        Optional<Type> typeOrNull = distribution.getType();
        if (!typeOrNull.isPresent()) {
            target.setText(defaultMessage);
        } else {
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`tCurPos = tCurPos + segLength` could be simplified to 'tCurPos += segLength'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
            }
            ++i;
            tCurPos = tCurPos + segLength;
        }
        if ((this.fSegments.length == 1) && (!this.fHasLeadingStar) && (!this.fHasTrailingStar)) {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/UiPlugin.java`
#### Snippet
```java
        CorePlugin.listenerRegistry().addEventListener(this.executionShowingLaunchRequestListener);

        PlatformUI.getWorkbench().addWorkbenchListener(this.shutdownListener = new ShutdownListener());
    }

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskView.java`
#### Snippet
```java
        this.nonEmptyInputPage = new Composite(this.pages, SWT.NONE);
        GridLayout gridLayout = new GridLayout(1, false);
        gridLayout.marginWidth = gridLayout.marginHeight = gridLayout.verticalSpacing = 0;
        this.nonEmptyInputPage.setLayout(gridLayout);

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskView.java`
#### Snippet
```java
        this.nonEmptyInputPage = new Composite(this.pages, SWT.NONE);
        GridLayout gridLayout = new GridLayout(1, false);
        gridLayout.marginWidth = gridLayout.marginHeight = gridLayout.verticalSpacing = 0;
        this.nonEmptyInputPage.setLayout(gridLayout);

```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPage.java`
#### Snippet
```java
        toolbarManager.appendToGroup(MultiPageView.PAGE_GROUP, new Separator());
        toolbarManager.appendToGroup(MultiPageView.PAGE_GROUP, new RerunFailedTestsAction(this));
        toolbarManager.appendToGroup(MultiPageView.PAGE_GROUP, this.openBuildScanAction = new OpenBuildScanAction(this.getProcessDescription()));
        toolbarManager.appendToGroup(MultiPageView.PAGE_GROUP, new Separator());
        toolbarManager.appendToGroup(MultiPageView.PAGE_GROUP, new CancelBuildExecutionAction(this));
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultModelProvider.java`
#### Snippet
```java
        return executeOperation(() ->
            DefaultModelProvider.this.gradleBuild.withConnection(connection -> {
                return queryModel(model, connection);
            }, tokenSource, monitor),
        strategy, model);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultGradleProjectBuilder.java`
#### Snippet
```java
                    try {
                        gradleBuild.get().withConnection(connection -> {
                            return connection.action()
                                .projectsLoaded(IdeFriendlyClassLoading.loadClass(TellGradleToRunAutoSyncTasks.class), NoOpResultHandler.newInstance())
                                .build()
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/GradleVersion.java`
#### Snippet
```java
            properties.load(inputStream);

            String version = properties.get("ToolingApiVersion").toString();

            CURRENT = new GradleVersion(version);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/preferences/PersistentModelConverter.java`
#### Snippet
```java

    private static <T> T loadValue(Properties properties, String key, T defaultValue, Function<String, T> conversion) {
        String value = (String) properties.get(key);
        if (value == null) {
            return defaultValue;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/preferences/PersistentModelConverter.java`
#### Snippet
```java

    private static <T> List<T> loadList(Properties properties, String key, Function<String, T> conversion) {
        String values = (String) properties.get(key);
        if (values == null) {
            return ImmutableList.of();
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/BaseRunConfiguration.java`
#### Snippet
```java
public interface BaseRunConfiguration {

    ProjectConfiguration getProjectConfiguration();

    GradleDistribution getGradleDistribution();
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultGradleProjectBuilder.java`
#### Snippet
```java

        @Override
        public void onComplete(T result) {
        }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/DefaultExternalLaunchConfigurationManager.java`
#### Snippet
```java

        @Override
        public void launchConfigurationRemoved(ILaunchConfiguration configuration) {
        }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SynchronizeGradleBuildOperation.java`
#### Snippet
```java
    }

    private void synchronizeClosedWorkspaceProject(SubMonitor childProgress) {
        // do not modify closed projects
    }
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/CancelBuildExecutionAction.java`
#### Snippet
```java
    }

    public void dispose(){
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/GradleConsolePageParticipant.java`
#### Snippet
```java

    @Override
    public void activated() {
        // do nothing
    }
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/GradleConsolePageParticipant.java`
#### Snippet
```java

    @Override
    public void deactivated() {
        // do nothing
    }
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/RemoveAllTerminatedGradleConsolesAction.java`
#### Snippet
```java
    }

    public void dispose() {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/RemoveTerminatedGradleConsoleAction.java`
#### Snippet
```java
    }

    public void dispose() {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/RerunBuildExecutionAction.java`
#### Snippet
```java

    @Override
    public void launchConfigurationAdded(ILaunchConfiguration configuration) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/RerunBuildExecutionAction.java`
#### Snippet
```java

    @Override
    public void launchConfigurationChanged(ILaunchConfiguration configuration) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/UrlPatternMatchListener.java`
#### Snippet
```java

        @Override
        public void linkEntered() {
        }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/UrlPatternMatchListener.java`
#### Snippet
```java

        @Override
        public void linkExited() {
        }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ConsoleShowingLaunchListener.java`
#### Snippet
```java

    @Override
    public void launchRemoved(ILaunch launch) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ConsoleShowingLaunchListener.java`
#### Snippet
```java

    @Override
    public void launchChanged(ILaunch launch) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java

    @Override
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        // leave the controls empty
    }
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectTab.java`
#### Snippet
```java

    @Override
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        // leave the controls empty
    }
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/TestsTab.java`
#### Snippet
```java

    @Override
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        // leave the controls empty
    }
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/preferences/GradleExperimentalFeaturesPreferencePage.java`
#### Snippet
```java

    @Override
    public void init(IWorkbench workbench) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/preferences/GradleWorkbenchPreferencePage.java`
#### Snippet
```java

    @Override
    public void init(IWorkbench workbench) {
    }
}
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/ContextActivatingViewPartListener.java`
#### Snippet
```java

    @Override
    public void partOpened(IWorkbenchPartReference partRef) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/ContextActivatingViewPartListener.java`
#### Snippet
```java

    @Override
    public void partClosed(IWorkbenchPartReference partRef) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/ContextActivatingViewPartListener.java`
#### Snippet
```java

    @Override
    public void partVisible(IWorkbenchPartReference partRef) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/ContextActivatingViewPartListener.java`
#### Snippet
```java

    @Override
    public void partHidden(IWorkbenchPartReference partRef) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/ContextActivatingViewPartListener.java`
#### Snippet
```java

    @Override
    public void partBroughtToTop(IWorkbenchPartReference partRef) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/ContextActivatingViewPartListener.java`
#### Snippet
```java

    @Override
    public void partInputChanged(IWorkbenchPartReference partRef) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java

                @Override
                public void mouseHover(MouseEvent e) {
                }
            });
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/GradleDistributionGroup.java`
#### Snippet
```java

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/GradleProjectSettingsComposite.java`
#### Snippet
```java

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/HoverText.java`
#### Snippet
```java

        @Override
        public void mouseDoubleClick(MouseEvent event) {
        }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/HoverText.java`
#### Snippet
```java

        @Override
        public void mouseUp(MouseEvent e) {
        }
    }
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringListEditor.java`
#### Snippet
```java

                    @Override
                    public void focusGained(FocusEvent e) {
                        // TODO Auto-generated method stub

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageContentProvider.java`
#### Snippet
```java

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageContentProvider.java`
#### Snippet
```java

    @Override
    public void dispose() {
    }
}
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/RerunBuildExecutionAction.java`
#### Snippet
```java

    @Override
    public void launchConfigurationAdded(ILaunchConfiguration configuration) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/RerunBuildExecutionAction.java`
#### Snippet
```java

    @Override
    public void launchConfigurationChanged(ILaunchConfiguration configuration) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskViewContentProvider.java`
#### Snippet
```java

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskViewContentProvider.java`
#### Snippet
```java

    @Override
    public void dispose() {
    }
}
```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/ProjectNodeAdapter.java`
#### Snippet
```java

    @Override
    public void resetPropertyValue(Object id) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/ProjectNodeAdapter.java`
#### Snippet
```java

    @Override
    public void setPropertyValue(Object id, Object value) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/ProjectTaskNodeAdapter.java`
#### Snippet
```java

    @Override
    public void resetPropertyValue(Object id) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/ProjectTaskNodeAdapter.java`
#### Snippet
```java

    @Override
    public void setPropertyValue(Object id, Object value) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/TaskSelectorNodeAdapter.java`
#### Snippet
```java

    @Override
    public void resetPropertyValue(Object id) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/TaskSelectorNodeAdapter.java`
#### Snippet
```java

    @Override
    public void setPropertyValue(Object id, Object value) {
    }

```

### EmptyMethod
The method is empty
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/workspace/ShutdownListener.java`
#### Snippet
```java

    @Override
    public void postShutdown(IWorkbench workbench) {
    }

```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.site/build.gradle`
#### Snippet
```java

        // upload the update site and update the composite descriptors
        def directoriesInCompositeUpdateSite = eclipsebuild.BuildshipConfig.on(project).isSnapshot() ? 'ls -td -- */ | head -1' : 'ls -td -- */'
        ssh.run {
            session(remotes.eclipseDotOrg) {
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.site/build.gradle`
#### Snippet
```java

private void uploadFileWithScp(File source, String targetPath) {
    def sourcePath = source.absolutePath
    def cmd = "sshpass -p $ECLIPSE_ORG_FTP_PASSWORD scp -o UserKnownHostsFile=${project.rootProject.file('gradle/ssh/known_hosts')} $source $ECLIPSE_ORG_FTP_USER@$ECLIPSE_ORG_FTP_HOST:${targetPath}/"
    def process = cmd.execute()
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.site/build.gradle`
#### Snippet
```java

private void uploadDirWithScp(File source, String targetPath) {
    def sourcePath = source.absolutePath
    def cmd = "sshpass -p $ECLIPSE_ORG_FTP_PASSWORD scp -r -o UserKnownHostsFile=${project.rootProject.file('gradle/ssh/known_hosts')} $source $ECLIPSE_ORG_FTP_USER@$ECLIPSE_ORG_FTP_HOST:${targetPath}/"
    def process = cmd.execute()
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/GradleBuildConnectionProgressTest.groovy`
#### Snippet
```java
        GradleBuild gradleBuild = gradleBuildFor(location)
        Function query = { ProjectConnection c -> c.model(GradleProject).get() }
        GradleProject model = gradleBuild.withConnection(query, monitor)

        then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/GradleBuildConnectionTest.groovy`
#### Snippet
```java
       GradleBuild gradleBuild = gradleBuildFor(location)
       Function query = { ProjectConnection c -> c.newBuild().forTasks("myTask").run() }
       GradleProject model = gradleBuild.withConnection(query, new NullProgressMonitor())

       then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/GradleBuildConnectionTest.groovy`
#### Snippet
```java
       GradleBuild gradleBuild = gradleBuildFor(location)
       Function query = { ProjectConnection c -> c.newTestLauncher().withJvmTestClasses("SimpleTest").run() }
       GradleProject model = gradleBuild.withConnection(query, new NullProgressMonitor())

       then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/GradleBuildConnectionTest.groovy`
#### Snippet
```java
       gradleBuild = gradleBuildFor(location)
       query = { ProjectConnection c -> c.action().projectsLoaded(IdeFriendlyClassLoading.loadCompositeModelQuery(GradleProject), resultHandler).build().run() }
       result = gradleBuild.withConnection(query, new NullProgressMonitor())

       then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/GradleBuildConnectionTest.groovy`
#### Snippet
```java
       gradleBuild = gradleBuildFor(location)
       query = { ProjectConnection c -> c.action().buildFinished(IdeFriendlyClassLoading.loadCompositeModelQuery(GradleProject), resultHandler).build().run() }
       result = gradleBuild.withConnection(query, new NullProgressMonitor())

       then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/util/gradle/PublishedGradleVersionsTest.groovy`
#### Snippet
```java
    def "No remote download is attempted if CACHE_ONLY is specified"() {
        when:
        PublishedGradleVersions publishedVersions = PublishedGradleVersions.create(LookupStrategy.CACHED_ONLY)
        then:
        thrown IllegalStateException
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/launch/MavenGradleClasspathProviderUpdaterTest.groovy`
#### Snippet
```java
        when:
        IJavaProject project = newJavaProject('ext-run-config-manager-test')
        ILaunchConfiguration configuration = createJdtLaunchConfigFor(project)
        addGradleNature(project)

```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/marker/GradleErrorMarkerTest.groovy`
#### Snippet
```java
        }
        importAndWait(projectDir)
        File buildFile = new File(projectDir, 'build.gradle')
        File settingsFile = new File(projectDir, 'settings.gradle')
        File subBuildFile = new File(projectDir, 'sub/build.gradle')
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/launch/GradleLaunchConfigurationManagerTest.groovy`
#### Snippet
```java
    def "Can't create a run configuration from null object"() {
        when:
        def config = manager.getOrCreateRunConfiguration(null)

        then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/launch/RunGradleTestLaunchRequestJobTest.groovy`
#### Snippet
```java
    def "Warning message is printed if target project is closed"() {
        setup:
        DebugListener debugListener = new DebugListener()
        findProject(subDir.name).close(new NullProgressMonitor())

```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ProjectNameDeduplicationTest.groovy`
#### Snippet
```java
            dir('a')
        }
        IProject project = newProject('a')

        when:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ProjectNameDeduplicationTest.groovy`
#### Snippet
```java
            dir('a')
        }
        IProject project = newProject('a')
        importAndWait(location)

```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ProjectNameDeduplicationTest.groovy`
#### Snippet
```java
            dir('a')
        }
        IProject project =  newProject('not-a')

        when:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/LinkedProjectClasspathEntriesTest.groovy`
#### Snippet
```java
    def "Can include linked files in the classpath"(String type) {
        setup:
        def parent = dir('another')
        def linkedResource = type == '1' ? file('another/file.jar') : dir('another/dir')
        def linkedResourcePath = linkedResource.absolutePath.replace('\\', "\\\\")
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ImportingProjectInDefaultLocation.groovy`
#### Snippet
```java
    def "Disallow importing any modules located at the workspace root"() {
        setup:
        File rootProject = workspaceDir('sample2') {
            file 'settings.gradle', "include '..'"
        }
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ClasspathPersistenceTest.groovy`
#### Snippet
```java
        importAndWait(projectDir)
        IProject project = findProject("sample-project")
        IJavaProject javaProject = JavaCore.create(project)

        expect:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/WorkspaceOperationsTest.groovy`
#### Snippet
```java
        setup:
        IProject projectA = newProject('project-a')
        IProject projectB = newProject('project-b')

        when:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ImportingProjectWithCustomName.groovy`
#### Snippet
```java
        }

        FutureCallback<Pair<BuildEnvironment, GradleBuild>> previewResultHandler = Mock()

        when:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/SingleProjectSynchronizationSpecification.groovy`
#### Snippet
```java
        String sourceCompatibility = javaProject.getOption(JavaCore.COMPILER_SOURCE, true)
        String targetCompatibility = javaProject.getOption(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, true)
        String currentJavaVersion = JavaVersionUtil.adaptVersionToEclipseNamingConversions(JavaVersion.current())

        then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/SingleProjectSynchronizationSpecification.groovy`
#### Snippet
```java
        String sourceCompatibility = javaProject.getOption(JavaCore.COMPILER_SOURCE, true)
        String targetCompatibility = javaProject.getOption(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, true)
        String currentJavaVersion = JavaVersionUtil.adaptVersionToEclipseNamingConversions(JavaVersion.current())

        then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ImportingWtpProjects.groovy`
#### Snippet
```java
        def project = findProject('project')
        IClasspathEntry dependency = resolvedClasspath(project).find { it.path.lastSegment() == 'junit-4.12.jar' }
        IClasspathAttribute[] attributes = dependency.getExtraAttributes()
        IClasspathAttribute deploymenAttribute = dependency.getExtraAttributes().find { it.name == NON_DEPLOYED }
        deploymenAttribute.value == ""
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ImportingBrokenProject.groovy`
#### Snippet
```java
    def "can import the root project of a broken build"() {
        when:
        SynchronizationResult result = tryImportAndWait(projectDir)

        then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ImportingBrokenProject.groovy`
#### Snippet
```java
        when:
        newProject('broken-project')
        SynchronizationResult result = tryImportAndWait(projectDir)

        then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ImportingBrokenProject.groovy`
#### Snippet
```java

        when:
        SynchronizationResult result = tryImportAndWait(projectDir)

        then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/invocation/InvocationCustomizerTest.groovy`
#### Snippet
```java
        }
        importAndWait(projectDir)
        IProject project = findProject('sample-project')
        LongRunningOperation operation = Mock(LongRunningOperation)
        BuildEnvironment buildEnvironment = defaultBuildEnvironment()
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/LinkedResourcesUpdaterTest.groovy`
#### Snippet
```java

        LinkedResourcesUpdater.update(project, [linkedResourceB], persistentModel, new NullProgressMonitor())
        Collection<IResource> linkedResources = linkedResources(project)

        then:
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.ui.test/src/main/groovy/org/eclipse/buildship/ui/internal/view/task/ViewSpecification.groovy`
#### Snippet
```java
        BuildConfiguration buildConfiguration = createInheritingBuildConfiguration(projectDir)
        CorePlugin.configurationManager().saveBuildConfiguration(buildConfiguration)
        EclipseProject eclipseProject = Stub(EclipseProject) {
            getProjectDirectory() >> projectDir
            getParent() >> parentNode?.eclipseProject
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.ui.test/src/main/groovy/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJobTest.groovy`
#### Snippet
```java

    private File createSingleModuleProject() {
        File projectDir = dir('sample-project') {
            file 'settings.gradle'
            file 'build.gradle',
```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.buildship.ui.test/src/main/groovy/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJobTest.groovy`
#### Snippet
```java

    private File createMultiModuleProject() {
        File projectDir = dir('sample-multimodule-project') {
            file 'settings.gradle', 'include "sub1"; include "sub2"'
            file 'build.gradle',
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/BuildConfiguration.java`
#### Snippet
```java
        private boolean buildScansEnabled = false;
        private boolean offlineMode = false;
        private boolean autoSync = false;
        private List<String> arguments = new ArrayList<>();
        private List<String> jvmArguments = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/BuildConfiguration.java`
#### Snippet
```java
        private boolean overrideWorkspaceConfiguration = false;
        private GradleDistribution gradleDistribution;
        private File gradleUserHome = null;
        private File javaHome = null;
        private boolean buildScansEnabled = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/BuildConfiguration.java`
#### Snippet
```java

        private final File rootProjectDirectory;
        private boolean overrideWorkspaceConfiguration = false;
        private GradleDistribution gradleDistribution;
        private File gradleUserHome = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/BuildConfiguration.java`
#### Snippet
```java
        private File javaHome = null;
        private boolean buildScansEnabled = false;
        private boolean offlineMode = false;
        private boolean autoSync = false;
        private List<String> arguments = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/BuildConfiguration.java`
#### Snippet
```java
        private GradleDistribution gradleDistribution;
        private File gradleUserHome = null;
        private File javaHome = null;
        private boolean buildScansEnabled = false;
        private boolean offlineMode = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/BuildConfiguration.java`
#### Snippet
```java
        private File gradleUserHome = null;
        private File javaHome = null;
        private boolean buildScansEnabled = false;
        private boolean offlineMode = false;
        private boolean autoSync = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CacheKey.java`
#### Snippet
```java
    static final class Builder {

        private boolean invalid = false;
        private BuildAction<?> buildAction;
        private Class<?> modelType;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/gradle/GradleProgressAttributes.java`
#### Snippet
```java
        private ProcessDescription processDescription = null;
        private boolean isInteractive = true;
        private ProgressListener delegatingListener = null;

        public GradleProgressAttributesBuilder(CancellationTokenSource tokenSource, IProgressMonitor monitor) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/gradle/GradleProgressAttributes.java`
#### Snippet
```java
        private final IProgressMonitor monitor;

        private ProcessDescription processDescription = null;
        private boolean isInteractive = true;
        private ProgressListener delegatingListener = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SourceFolderUpdater.java`
#### Snippet
```java

        private final IPath path;
        private IPath output = null;
        private IPath[] includes = new IPath[0];
        private IPath[] excludes = new IPath[0];
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * @generated
     */
    private EEnum distributionTypeEEnum = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * @generated
     */
    private boolean isInitialized = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * @generated
     */
    private EClass gradleImportTaskEClass = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * @generated
     */
    private static boolean isInited = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * @generated
     */
    private boolean isCreated = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/GradleProjectSettingsComposite.java`
#### Snippet
```java
        private Pair<String, String> overrideCheckbox = null;
        private boolean autoSyncCheckbox = false;
        private boolean variableSelector = false;
        private Composite parent;
        private GradleProjectSettingsCompositeBuilder(Composite parent) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/GradleProjectSettingsComposite.java`
#### Snippet
```java
    public static class GradleProjectSettingsCompositeBuilder {
        private Pair<String, String> overrideCheckbox = null;
        private boolean autoSyncCheckbox = false;
        private boolean variableSelector = false;
        private Composite parent;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/GradleProjectSettingsComposite.java`
#### Snippet
```java
     */
    public static class GradleProjectSettingsCompositeBuilder {
        private Pair<String, String> overrideCheckbox = null;
        private boolean autoSyncCheckbox = false;
        private boolean variableSelector = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
    private Map<Object, Boolean> foundAnyCache = new HashMap<>();

    private boolean useCache = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
     * always included.
     */
    private boolean includeLeadingWildcard = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java

    /* boundary value beyond which we don't need to search in the text */
    protected int fBound = 0;

    protected static final char fSingleWildCard = '\u0000';
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultRunConfiguration.java`
#### Snippet
```java
 * Default implementation for {@link RunConfiguration}.
 */
class DefaultRunConfiguration extends AbstractRunConfiguration<RunConfigurationProperties> implements RunConfiguration {

    public DefaultRunConfiguration(ProjectConfiguration projectConfiguration, RunConfigurationProperties properties) {
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultTestRunConfiguration.java`
#### Snippet
```java
 * Default implementation for {@link TestRunConfiguration}.
 */
class DefaultTestRunConfiguration extends AbstractRunConfiguration<TestRunConfigurationProperties> implements TestRunConfiguration {

    public DefaultTestRunConfiguration(ProjectConfiguration projectConfiguration, TestRunConfigurationProperties properties) {
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer buf` may be declared as 'StringBuilder'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java

        int pos = 0;
        StringBuffer buf = new StringBuffer();
        while (pos < this.fLength) {
            char c = this.fPattern.charAt(pos++);
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/preferences/DefaultModelPersistence.java`
#### Snippet
```java
    }

    private static PersistentModel doLoadModel(IProject project) throws IOException, FileNotFoundException {
        String projectName = project.getName();
        File preferencesFile = preferencesFile(projectName);
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'sort'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/extension/InternalProjectConfigurator.java`
#### Snippet
```java
        filterCylicDependencies(configurators);

        List<InternalProjectConfigurator> internalConfigurators = configurators.stream().map(c -> new InternalProjectConfigurator(c)).collect(Collectors.toList());
        Collections.sort(internalConfigurators);

```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/GradleClasspathProvider.java`
#### Snippet
```java
        }

        return result.toArray(new IRuntimeClasspathEntry[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/RunGradleBuildLaunchRequestJob.java`
#### Snippet
```java
    protected BuildLauncher createLaunch(InternalGradleBuild gradleBuild, GradleProgressAttributes progressAttributes, ProcessDescription processDescription) {
        BuildLauncher launcher = gradleBuild.newBuildLauncher(this.runConfig, progressAttributes);
        launcher.forTasks(RunGradleBuildLaunchRequestJob.this.runConfig.getTasks().toArray(new String[0]));
        return launcher;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/BuildCommandUpdater.java`
#### Snippet
```java

        Result<ICommand> result = ManagedModelMergingStrategy.calculate(current, model, managed);
        description.setBuildSpec(result.getNextElements().toArray(new ICommand[0]));
        project.setDescription(description, monitor);
        persistentModel.managedBuilders(result.getNextManaged());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SourceFolderUpdater.java`
#### Snippet
```java
        private IPath[] includes = new IPath[0];
        private IPath[] excludes = new IPath[0];
        private IClasspathAttribute[] attributes = new IClasspathAttribute[0];
        private IJavaProject project;

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SourceFolderUpdater.java`
#### Snippet
```java
        private IPath output = null;
        private IPath[] includes = new IPath[0];
        private IPath[] excludes = new IPath[0];
        private IClasspathAttribute[] attributes = new IClasspathAttribute[0];
        private IJavaProject project;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SourceFolderUpdater.java`
#### Snippet
```java
        updateExistingSourceFolders(classpath);
        addNewSourceFolders(classpath);
        this.project.setRawClasspath(classpath.toArray(new IClasspathEntry[0]), monitor);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SourceFolderUpdater.java`
#### Snippet
```java
        private final IPath path;
        private IPath output = null;
        private IPath[] includes = new IPath[0];
        private IPath[] excludes = new IPath[0];
        private IClasspathAttribute[] attributes = new IClasspathAttribute[0];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ProjectNatureUpdater.java`
#### Snippet
```java
        Result<String> result = ManagedModelMergingStrategy.calculate(existingNatures, modelNatures, managedNatures);

        description.setNatureIds(result.getNextElements().toArray(new String[0]));
        project.setDescription(description, monitor);
        persistentModel.managedNatures(result.getNextManaged());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerRuntimeClasspathEntryResolver.java`
#### Snippet
```java
            boolean excludeTestCode, boolean moduleSupport) throws CoreException {
        if (entry.getType() != IRuntimeClasspathEntry.CONTAINER || !entry.getPath().equals(GradleClasspathContainer.CONTAINER_PATH)) {
            return new IRuntimeClasspathEntry[0];
        }
        PersistentModel model = CorePlugin.modelPersistence().loadModel(project.getProject());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerRuntimeClasspathEntryResolver.java`
#### Snippet
```java
        IClasspathContainer container = JavaCore.getClasspathContainer(GradleClasspathContainer.CONTAINER_PATH, project);
        if (container == null) {
            return new IRuntimeClasspathEntry[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerRuntimeClasspathEntryResolver.java`
#### Snippet
```java
    public IRuntimeClasspathEntry[] resolveRuntimeClasspathEntry(IRuntimeClasspathEntry entry, ILaunchConfiguration configuration) throws CoreException {
        if (entry == null || entry.getJavaProject() == null) {
            return new IRuntimeClasspathEntry[0];
        }
        LaunchConfigurationScope configurationScopes = LaunchConfigurationScope.from(configuration);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
    private boolean useEarlyReturnIfMatcherIsNull = true;

    private static Object[] EMPTY = new Object[0];

    public PatternFilter() {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/QuickSearchManager.java`
#### Snippet
```java
        } else if (clearIfNoResults) {
            // if there are no matching items, clear the selection
            this.tree.setSelection(new TreeItem[0]);
            this.tree.notifyListeners(SWT.Selection, new Event());
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/QuickSearchManager.java`
#### Snippet
```java
        private void reset() {
            this.searchText = "";
            this.results = new TreeItem[0];
            this.current = -1;
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageContentProvider.java`
#### Snippet
```java
    @Override
    public Object[] getChildren(Object parent) {
        return parent instanceof OperationItem ? ((OperationItem)parent).getChildren().toArray() : new Object[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java

            // find parameter-less method by name
            IMethod method = type.getMethod(methodName, new String[0]);
            if (method != null && method.exists()) {
                return method;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java
            return SearchEngine.createWorkspaceScope();
        } else {
            return SearchEngine.createJavaSearchScope(javaProjects.toArray(new IJavaProject[0]));
        }
    }
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'IRuntimeClasspathEntry2' type conflicts with preceding 'instanceof DefaultProjectClasspathEntry' check
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/GradleClasspathProvider.java`
#### Snippet
```java
        if (entry instanceof DefaultProjectClasspathEntry) {
            List<IRuntimeClasspathEntry> result = new ArrayList<>();
            for (IRuntimeClasspathEntry e : ((IRuntimeClasspathEntry2) entry).getRuntimeClasspathEntries(configuration)) {
                Collections.addAll(result, resolveClasspath(new IRuntimeClasspathEntry[] { e }, configuration));
            }
```

### CastConflictsWithInstanceof
Cast to 'StructuredSelection' type conflicts with preceding 'instanceof IStructuredSelection' check
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/SelectionJavaElementResolver.java`
#### Snippet
```java
     */
    public static SelectionJavaElementResolver from(ISelection selection) {
        Collection<?> adaptables = selection instanceof IStructuredSelection ? ((StructuredSelection) selection).toList() : Collections.emptyList();
        return new SelectionJavaElementResolver(adaptables);
    }
```

### CastConflictsWithInstanceof
Cast to 'ITextSelection' type conflicts with preceding 'instanceof TextSelection' check
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/EditorBackedJavaElementSelection.java`
#### Snippet
```java
                ISelection selection = selectionProvider.getSelection();
                if (selection instanceof TextSelection) {
                    ITextSelection textSelection = (ITextSelection) selection;
                    return SelectionConverter.getElementAtOffset(typeRoot, textSelection);
                }
```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `evaluateTests()` recurses infinitely, and can only end by throwing an exception
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/SupportedLaunchConfigType.java`
#### Snippet
```java
    private static class RelaxedJUnitLaunchConfigurationDelegate extends JUnitLaunchConfigurationDelegate {

        public IMember[] evaluateTests(ILaunchConfiguration configuration) throws CoreException {
            return evaluateTests(configuration, new NullProgressMonitor());
        }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `fragmentRootEntry` initializer `null` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/TestExecutionTarget.java`
#### Snippet
```java

    private static boolean isTestType(IType type) {
        IClasspathEntry fragmentRootEntry = null;
        try {
            fragmentRootEntry = getPackageFragmentRoot(type).getRawClasspathEntry();
```

### UnusedAssignment
Variable `runConfig` initializer `null` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/RunGradleJvmTestLaunchRequestJob.java`
#### Snippet
```java
    public static Optional<BaseLaunchRequestJob<TestLauncher>> createJob(ILaunchConfiguration launch, String mode) {
        // launch invalid configuration
        TestRunConfiguration runConfig = null;
        try {
            runConfig = CorePlugin.configurationManager().loadTestRunConfiguration(launch);
```

### UnusedAssignment
Variable `cause` initializer `e.getCause()` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/EclipseModelUtils.java`
#### Snippet
```java
            // For gradle >= 5.5 project name deduplication happens in gradle. In case gradle can't deduplicate then create an UnsupportedConfigurationException
            // to match the behaviour with previous gradle versions.
            Throwable cause = e.getCause();
            if (cause instanceof IllegalArgumentException && cause.getMessage().startsWith(EXCEPTION_DUPLICATE_ROOT_ELEMENT_TEXT)) {
                String projectName = cause.getMessage().substring(EXCEPTION_DUPLICATE_ROOT_ELEMENT_TEXT.length());
```

### UnusedAssignment
Variable `projectName` initializer `cause.getMessage().substring(EXCEPTION_DUPLICATE_ROOT_ELEMENT_TEXT.length())` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/EclipseModelUtils.java`
#### Snippet
```java
            Throwable cause = e.getCause();
            if (cause instanceof IllegalArgumentException && cause.getMessage().startsWith(EXCEPTION_DUPLICATE_ROOT_ELEMENT_TEXT)) {
                String projectName = cause.getMessage().substring(EXCEPTION_DUPLICATE_ROOT_ELEMENT_TEXT.length());
                String message = String.format("A project with the name %s already exists.", projectName);
                throw new UnsupportedConfigurationException(message, e);
```

### UnusedAssignment
Variable `message` initializer `String.format("A project with the name %s already exists.", projectName)` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/EclipseModelUtils.java`
#### Snippet
```java
            if (cause instanceof IllegalArgumentException && cause.getMessage().startsWith(EXCEPTION_DUPLICATE_ROOT_ELEMENT_TEXT)) {
                String projectName = cause.getMessage().substring(EXCEPTION_DUPLICATE_ROOT_ELEMENT_TEXT.length());
                String message = String.format("A project with the name %s already exists.", projectName);
                throw new UnsupportedConfigurationException(message, e);
            }
```

### UnusedAssignment
Variable `message` initializer `String.format("Cannot open file %s in editor.", file.getFullPath())` is redundant
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/editor/EditorUtils.java`
#### Snippet
```java
           return  IDE.openEditor(activePage, file, editorId, activate);
        } catch (PartInitException e) {
            String message = String.format("Cannot open file %s in editor.", file.getFullPath());
            UiPlugin.logger().error(message, e); //$NON-NLS-1$
            throw new GradlePluginsRuntimeException(message, e);
```

### UnusedAssignment
Variable `message` initializer `String.format("Cannot open file %s in editor.", file.getAbsolutePath())` is redundant
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/editor/EditorUtils.java`
#### Snippet
```java
            return IDE.openEditor(activePage, file.toURI(), editorId, activate);
        } catch (PartInitException e) {
            String message = String.format("Cannot open file %s in editor.", file.getAbsolutePath());
            UiPlugin.logger().error(message, e); //$NON-NLS-1$
            throw new GradlePluginsRuntimeException(message, e);
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SynchronizingBuildScriptUpdateListener.java`
#### Snippet
```java
    private void executeSyncIfBuildScriptChanged(final IProject project, IResourceDelta delta) {
        if (hasBuildScriptFileChanged(project, delta.getAffectedChildren())) {
            GradleBuild gradleBuild = GradleCore.getWorkspace().getBuild(project).get();
            SynchronizationJob job = new SynchronizationJob(gradleBuild);
            job.setResultHandler(new ResultHander());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/gradle/GradleDistributionViewModel.java`
#### Snippet
```java
       }

        switch (getType().get()) {
            case WRAPPER:
                return GradleDistribution.fromBuild();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/GradleDistributionGroup.java`
#### Snippet
```java

    public void setDistribution(GradleDistributionViewModel distribution) {
        GradleDistributionViewModel.Type type = distribution.getType().get();
        String configuration = Strings.nullToEmpty(distribution.getConfiguration());
        ImmutableList<Button> allRadios = ImmutableList.of(this.useGradleWrapperOption, this.useLocalInstallationDirOption, this.useRemoteDistributionUriOption, this.useGradleVersionOption);
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `parent` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseProject.java`
#### Snippet
```java
    public EclipseProject getParent() {
        EclipseProject parent = getElement().getParent();
        return parent == null ? parent : new CompatEclipseProject(parent);
    }

```

### ConstantValue
Value `parent` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatGradleProject.java`
#### Snippet
```java
    public GradleProject getParent() {
        GradleProject parent  = getElement().getParent();
        return parent == null ? parent : new CompatGradleProject(parent);
    }

```

### ConstantValue
Condition `gradleVersion.snapshot == null` is always `true` when reached
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/GradleVersion.java`
#### Snippet
```java
            return 1;
        }
        if (this.snapshot != null && gradleVersion.snapshot == null) {
            return -1;
        }
```

### ConstantValue
Condition `type != null` is always `true`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/SupportedLaunchConfigType.java`
#### Snippet
```java
                }

                if (type != null) {
                    IJavaElement pkg = type.getPackageFragment().getParent();
                    if (!(pkg instanceof IPackageFragmentRoot)) {
```

### ConstantValue
Condition `parent != null` is always `false`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/RunGradleTestLaunchRequestJob.java`
#### Snippet
```java
        if (parent instanceof TaskOperationDescriptor) {
            return Optional.of((TaskOperationDescriptor) parent);
        } else if (parent != null) {
            return findParentTestTask(parent);
        } else {
```

### ConstantValue
Condition `model instanceof Map` is always `false`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatProjectConnection.java`
#### Snippet
```java
        if (model instanceof EclipseProject) {
            return (T) new CompatEclipseProject((EclipseProject) model);
        } else if (model instanceof Map<?, ?>) {
            Map<String, EclipseProject> compatModel = Maps.newLinkedHashMap();
            for (Entry<Object, Object> entry : ((Map<Object, Object>)model).entrySet()) {
```

### ConstantValue
Value `entry` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/GradleClasspathProvider.java`
#### Snippet
```java
            return result.toArray(new IRuntimeClasspathEntry[result.size()]);
        } else {
            return JavaRuntime.resolveRuntimeClasspathEntry(entry, configuration);
        }
    }
```

### ConstantValue
Value `status` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiJob.java`
#### Snippet
```java
                this.resultHandler.onFailure((ToolingApiStatus) status);
            } else {
                return status;
            }
        }
```

### ConstantValue
Condition `failure instanceof BuildCancelledException` is always `false`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        if (failure instanceof OperationCanceledException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_CANCELLED, workName, failure);
        } else if (failure instanceof BuildCancelledException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_CANCELLED, workName, failure);
        } else if (failure instanceof BuildException) {
```

### ConstantValue
Value `failure` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        if (failure instanceof OperationCanceledException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_CANCELLED, workName, failure);
        } else if (failure instanceof BuildCancelledException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_CANCELLED, workName, failure);
        } else if (failure instanceof BuildException) {
```

### ConstantValue
Condition `failure instanceof BuildException` is always `false`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof BuildCancelledException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_CANCELLED, workName, failure);
        } else if (failure instanceof BuildException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_FAILED, workName, (BuildException) failure);
        } else if (failure instanceof GradleConnectionException) {
```

### ConstantValue
Value `failure` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof BuildCancelledException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_CANCELLED, workName, failure);
        } else if (failure instanceof BuildException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_FAILED, workName, (BuildException) failure);
        } else if (failure instanceof GradleConnectionException) {
```

### ConstantValue
Condition `failure instanceof GradleConnectionException` is always `false`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof BuildException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_FAILED, workName, (BuildException) failure);
        } else if (failure instanceof GradleConnectionException) {
            return new ToolingApiStatus(ToolingApiStatusType.CONNECTION_FAILED, workName, (GradleConnectionException) failure);
        } else if (failure instanceof ImportRootProjectException) {
```

### ConstantValue
Value `failure` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof BuildException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_FAILED, workName, (BuildException) failure);
        } else if (failure instanceof GradleConnectionException) {
            return new ToolingApiStatus(ToolingApiStatusType.CONNECTION_FAILED, workName, (GradleConnectionException) failure);
        } else if (failure instanceof ImportRootProjectException) {
```

### ConstantValue
Condition `failure instanceof ImportRootProjectException` is always `false`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof GradleConnectionException) {
            return new ToolingApiStatus(ToolingApiStatusType.CONNECTION_FAILED, workName, (GradleConnectionException) failure);
        } else if (failure instanceof ImportRootProjectException) {
            return new ToolingApiStatus(ToolingApiStatusType.IMPORT_ROOT_DIR_FAILED, workName, (ImportRootProjectException) failure);
        } else if (failure instanceof UnsupportedConfigurationException) {
```

### ConstantValue
Value `failure` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof GradleConnectionException) {
            return new ToolingApiStatus(ToolingApiStatusType.CONNECTION_FAILED, workName, (GradleConnectionException) failure);
        } else if (failure instanceof ImportRootProjectException) {
            return new ToolingApiStatus(ToolingApiStatusType.IMPORT_ROOT_DIR_FAILED, workName, (ImportRootProjectException) failure);
        } else if (failure instanceof UnsupportedConfigurationException) {
```

### ConstantValue
Condition `failure instanceof UnsupportedConfigurationException` is always `false`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof ImportRootProjectException) {
            return new ToolingApiStatus(ToolingApiStatusType.IMPORT_ROOT_DIR_FAILED, workName, (ImportRootProjectException) failure);
        } else if (failure instanceof UnsupportedConfigurationException) {
            return new ToolingApiStatus(ToolingApiStatusType.UNSUPPORTED_CONFIGURATION, workName, (UnsupportedConfigurationException) failure);
        } else if (failure instanceof CoreException && ((CoreException) failure).getStatus().getException() != null) {
```

### ConstantValue
Value `failure` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof ImportRootProjectException) {
            return new ToolingApiStatus(ToolingApiStatusType.IMPORT_ROOT_DIR_FAILED, workName, (ImportRootProjectException) failure);
        } else if (failure instanceof UnsupportedConfigurationException) {
            return new ToolingApiStatus(ToolingApiStatusType.UNSUPPORTED_CONFIGURATION, workName, (UnsupportedConfigurationException) failure);
        } else if (failure instanceof CoreException && ((CoreException) failure).getStatus().getException() != null) {
```

### ConstantValue
Condition `failure instanceof CoreException` is always `false`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof UnsupportedConfigurationException) {
            return new ToolingApiStatus(ToolingApiStatusType.UNSUPPORTED_CONFIGURATION, workName, (UnsupportedConfigurationException) failure);
        } else if (failure instanceof CoreException && ((CoreException) failure).getStatus().getException() != null) {
            return from(workName, ((CoreException) failure).getStatus().getException());
        } else if (failure instanceof GradlePluginsRuntimeException) {
```

### ConstantValue
Condition `failure instanceof CoreException && ((CoreException) failure).getStatus().getException() != null` is always `false`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof UnsupportedConfigurationException) {
            return new ToolingApiStatus(ToolingApiStatusType.UNSUPPORTED_CONFIGURATION, workName, (UnsupportedConfigurationException) failure);
        } else if (failure instanceof CoreException && ((CoreException) failure).getStatus().getException() != null) {
            return from(workName, ((CoreException) failure).getStatus().getException());
        } else if (failure instanceof GradlePluginsRuntimeException) {
```

### ConstantValue
Value `failure` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof UnsupportedConfigurationException) {
            return new ToolingApiStatus(ToolingApiStatusType.UNSUPPORTED_CONFIGURATION, workName, (UnsupportedConfigurationException) failure);
        } else if (failure instanceof CoreException && ((CoreException) failure).getStatus().getException() != null) {
            return from(workName, ((CoreException) failure).getStatus().getException());
        } else if (failure instanceof GradlePluginsRuntimeException) {
```

### ConstantValue
Condition `failure instanceof GradlePluginsRuntimeException` is always `false`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof CoreException && ((CoreException) failure).getStatus().getException() != null) {
            return from(workName, ((CoreException) failure).getStatus().getException());
        } else if (failure instanceof GradlePluginsRuntimeException) {
            return new ToolingApiStatus(ToolingApiStatusType.PLUGIN_FAILED, workName, (GradlePluginsRuntimeException) failure);
        } else if (failure instanceof UnsupportedJavaVersionException) {
```

### ConstantValue
Value `failure` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof CoreException && ((CoreException) failure).getStatus().getException() != null) {
            return from(workName, ((CoreException) failure).getStatus().getException());
        } else if (failure instanceof GradlePluginsRuntimeException) {
            return new ToolingApiStatus(ToolingApiStatusType.PLUGIN_FAILED, workName, (GradlePluginsRuntimeException) failure);
        } else if (failure instanceof UnsupportedJavaVersionException) {
```

### ConstantValue
Condition `failure instanceof UnsupportedJavaVersionException` is always `false`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof GradlePluginsRuntimeException) {
            return new ToolingApiStatus(ToolingApiStatusType.PLUGIN_FAILED, workName, (GradlePluginsRuntimeException) failure);
        } else if (failure instanceof UnsupportedJavaVersionException) {
            return new ToolingApiStatus(ToolingApiStatusType.INCOMPATIBILITY_JAVA, workName, failure);
        } else {
```

### ConstantValue
Value `failure` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
        } else if (failure instanceof GradlePluginsRuntimeException) {
            return new ToolingApiStatus(ToolingApiStatusType.PLUGIN_FAILED, workName, (GradlePluginsRuntimeException) failure);
        } else if (failure instanceof UnsupportedJavaVersionException) {
            return new ToolingApiStatus(ToolingApiStatusType.INCOMPATIBILITY_JAVA, workName, failure);
        } else {
```

### ConstantValue
Value `failure` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
            return new ToolingApiStatus(ToolingApiStatusType.INCOMPATIBILITY_JAVA, workName, failure);
        } else {
            return new ToolingApiStatus(ToolingApiStatusType.UNKNOWN, workName, failure);
        }
    }
```

### ConstantValue
Condition `compilerOptionChanged` at the left side of assignment expression is always `false`. Can be simplified
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/JavaSourceSettingsUpdater.java`
#### Snippet
```java

        boolean compilerOptionChanged = false;
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_COMPLIANCE, sourceVersion);
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_SOURCE, sourceVersion);
        compilerOptionChanged |= updateJavaProjectOptionIfNeeded(project, JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, targetVersion);
```

### ConstantValue
Condition `e instanceof OperationCanceledException` is always `true`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ImportRootProjectOperation.java`
#### Snippet
```java
            runInWorkspace(monitor);
        } catch (Exception e) {
            throw e instanceof OperationCanceledException ? (OperationCanceledException) e : new ImportRootProjectException(e);
        }
    }
```

### ConstantValue
Value `resource` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SynchronizingBuildScriptUpdateListener.java`
#### Snippet
```java
            return false;
        } else {
            return resource instanceof IWorkspaceRoot;
        }
    }
```

### ConstantValue
Result of `configurator.getId()` is always 'null'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/extension/InternalProjectConfigurator.java`
#### Snippet
```java
            ProjectConfiguratorContribution configurator = it.next();
            if (configurator.getId() == null) {
                LOGGER.trace(CoreTraceScopes.PROJECT_CONFIGURATORS, configurator.getId() + " was removed because it had no ID defined");
                it.remove();
            } else {
```

### ConstantValue
Condition `e instanceof UncheckedExecutionException` is always `true`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultModelProvider.java`
#### Snippet
```java
            return result;
        } catch (Exception e) {
            if (e instanceof UncheckedExecutionException && e.getCause() instanceof RuntimeException) {
                throw (RuntimeException)e.getCause();
            } else {
```

### ConstantValue
Condition `resource instanceof IProject || "gradle".equals(resource.getFileExtension()) || "gradle.properties"....` is always `true`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/GradleResourceTester.java`
#### Snippet
```java
            IProject project = resource.getProject();
            if (GradleProjectNature.isPresentOn(project)) {
                return resource instanceof IProject || "gradle".equals(resource.getFileExtension()) || "gradle.properties".equals(resource.getName());
            }
        }
```

### ConstantValue
Value `editor` is always 'null'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/editor/EditorUtils.java`
#### Snippet
```java
            textEditor.selectAndReveal(offset, length);
        } else {
            showWithMarker(editor, file, offset, length);
        }
    }
```

### ConstantValue
Condition `LOCAL_INSTALLATION_DIRECTORY_EDEFAULT == null` is always `true`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
                return distributionType != DISTRIBUTION_TYPE_EDEFAULT;
            case GradleImportPackage.GRADLE_IMPORT_TASK__LOCAL_INSTALLATION_DIRECTORY:
                return LOCAL_INSTALLATION_DIRECTORY_EDEFAULT == null ? localInstallationDirectory != null
                        : !LOCAL_INSTALLATION_DIRECTORY_EDEFAULT.equals(localInstallationDirectory);
            case GradleImportPackage.GRADLE_IMPORT_TASK__REMOTE_DISTRIBUTION_LOCATION:
```

### ConstantValue
Condition `REMOTE_DISTRIBUTION_LOCATION_EDEFAULT == null` is always `true`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
                        : !LOCAL_INSTALLATION_DIRECTORY_EDEFAULT.equals(localInstallationDirectory);
            case GradleImportPackage.GRADLE_IMPORT_TASK__REMOTE_DISTRIBUTION_LOCATION:
                return REMOTE_DISTRIBUTION_LOCATION_EDEFAULT == null ? remoteDistributionLocation != null
                        : !REMOTE_DISTRIBUTION_LOCATION_EDEFAULT.equals(remoteDistributionLocation);
            case GradleImportPackage.GRADLE_IMPORT_TASK__SPECIFIC_GRADLE_VERSION:
```

### ConstantValue
Condition `SPECIFIC_GRADLE_VERSION_EDEFAULT == null` is always `true`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
                        : !REMOTE_DISTRIBUTION_LOCATION_EDEFAULT.equals(remoteDistributionLocation);
            case GradleImportPackage.GRADLE_IMPORT_TASK__SPECIFIC_GRADLE_VERSION:
                return SPECIFIC_GRADLE_VERSION_EDEFAULT == null ? specificGradleVersion != null : !SPECIFIC_GRADLE_VERSION_EDEFAULT.equals(specificGradleVersion);
            case GradleImportPackage.GRADLE_IMPORT_TASK__PROGRAM_ARGUMENTS:
                return programArguments != null && !programArguments.isEmpty();
```

### ConstantValue
Condition `GRADLE_USER_HOME_EDEFAULT == null` is always `true`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
                return jvmArguments != null && !jvmArguments.isEmpty();
            case GradleImportPackage.GRADLE_IMPORT_TASK__GRADLE_USER_HOME:
                return GRADLE_USER_HOME_EDEFAULT == null ? gradleUserHome != null : !GRADLE_USER_HOME_EDEFAULT.equals(gradleUserHome);
            case GradleImportPackage.GRADLE_IMPORT_TASK__JAVA_HOME:
                return JAVA_HOME_EDEFAULT == null ? javaHome != null : !JAVA_HOME_EDEFAULT.equals(javaHome);
```

### ConstantValue
Condition `JAVA_HOME_EDEFAULT == null` is always `true`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
                return GRADLE_USER_HOME_EDEFAULT == null ? gradleUserHome != null : !GRADLE_USER_HOME_EDEFAULT.equals(gradleUserHome);
            case GradleImportPackage.GRADLE_IMPORT_TASK__JAVA_HOME:
                return JAVA_HOME_EDEFAULT == null ? javaHome != null : !JAVA_HOME_EDEFAULT.equals(javaHome);
            case GradleImportPackage.GRADLE_IMPORT_TASK__OFFLINE_MODE:
                return offlineMode != OFFLINE_MODE_EDEFAULT;
```

### ConstantValue
Condition `control instanceof Text` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java
        if (control instanceof Label) {
            ((Label) control).setText(text);
        } else if (control instanceof Text) {
            ((Text) control).setText(text);
        } else if (control instanceof Button) {
```

### ConstantValue
Condition `control instanceof Button` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java
        } else if (control instanceof Text) {
            ((Text) control).setText(text);
        } else if (control instanceof Button) {
            ((Button) control).setText(text);
        } else if (control instanceof Combo) {
```

### ConstantValue
Condition `control instanceof Combo` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java
        } else if (control instanceof Button) {
            ((Button) control).setText(text);
        } else if (control instanceof Combo) {
            ((Combo) control).setText(text);
        } else if (control instanceof Group) {
```

### ConstantValue
Condition `control instanceof Group` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java
        } else if (control instanceof Combo) {
            ((Combo) control).setText(text);
        } else if (control instanceof Group) {
            ((Group)control).setText(text);
        } else {
```

### ConstantValue
Condition `adaptable instanceof IStructuredSelection` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/predicate/Predicates.java`
#### Snippet
```java
                    project = ((PackageFragmentRootContainer) adaptable).getJavaProject().getProject();
                    return hasGradleNature(project);
                } else if (adaptable instanceof IStructuredSelection) {
                    List<?> selections = ((IStructuredSelection) adaptable).toList();
                    return FluentIterable.from(selections).anyMatch(hasGradleNature());
```

### ConstantValue
Condition `layout` at the left side of assignment expression is always `false`. Can be simplified
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java
    private void updateWarningVisibility() {
        boolean layout = false;
        layout |= updateWarningVisibility(getEnabled(), this.gradleUserHomeText, this.gradleUserHomeWarningLabel);
        layout |= updateWarningVisibility(getEnabled(), this.javaHomeText, this.javaHomeWarningLabel);
        if (layout) {
```

### ConstantValue
Condition `!(selection instanceof IStructuredSelection)` is always `false` when reached
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkingSetUtils.java`
#### Snippet
```java
     */
    public static List<IWorkingSet> getSelectedWorkingSets(IStructuredSelection selection) {
        if (selection.isEmpty() || !(selection instanceof IStructuredSelection)) {
            return ImmutableList.of();
        }
```

### ConstantValue
Condition `start == end` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
        }
        if (this.fLength == 0) {
            return start == end;
        }

```

### ConstantValue
Condition `index < 0 && index >= this.pages.size()` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/MultiPageView.java`
#### Snippet
```java

    public void switchToPageAtIndex(int index) {
        if (index < 0 && index >= this.pages.size()) {
            throw new GradlePluginsRuntimeException("Page index out of bounds: " + index);
        }
```

### ConstantValue
Condition `index >= this.pages.size()` is always `false` when reached
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/MultiPageView.java`
#### Snippet
```java

    public void switchToPageAtIndex(int index) {
        if (index < 0 && index >= this.pages.size()) {
            throw new GradlePluginsRuntimeException("Page index out of bounds: " + index);
        }
```

### ConstantValue
Condition `input instanceof IJavaElement` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/WorkbenchSelectionListener.java`
#### Snippet
```java
                if (input instanceof IProject) {
                    return (IProject) input;
                } else if (input instanceof IJavaElement) {
                    return ((IJavaElement) input).getJavaProject().getProject();
                } else if (input instanceof IResource) {
```

### ConstantValue
Condition `input instanceof IResource` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/WorkbenchSelectionListener.java`
#### Snippet
```java
                } else if (input instanceof IJavaElement) {
                    return ((IJavaElement) input).getJavaProject().getProject();
                } else if (input instanceof IResource) {
                    return ((IResource) input).getProject();
                } else {
```

### ConstantValue
Condition `filterCompositeLayoutData instanceof RowData` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
            if (filterCompositeLayoutData instanceof GridData) {
                ((GridData) filterCompositeLayoutData).exclude = !isShowFilterControls();
            } else if (filterCompositeLayoutData instanceof RowData) {
                ((RowData) filterCompositeLayoutData).exclude = !isShowFilterControls();
            }
```

### ConstantValue
Condition `text != null` is always `true`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
                if (initial) {
                    FilteredTree.this.patternFilter.setPattern(null);
                } else if (text != null) {
                    FilteredTree.this.patternFilter.setPattern(text);
                }
```

### ConstantValue
Condition `initialText != null && initialText.equals(filterText)` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
        if (!filterText.equals("") && !filterText.equals(initialText)) {//$NON-NLS-1$
            if (tree.getPatternFilter() != filter) {
                boolean initial = initialText != null && initialText.equals(filterText);
                if (initial) {
                    filter.setPattern(null);
```

### ConstantValue
Condition `initialText.equals(filterText)` is always `false` when reached
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
        if (!filterText.equals("") && !filterText.equals(initialText)) {//$NON-NLS-1$
            if (tree.getPatternFilter() != filter) {
                boolean initial = initialText != null && initialText.equals(filterText);
                if (initial) {
                    filter.setPattern(null);
```

### ConstantValue
Condition `initial` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
            if (tree.getPatternFilter() != filter) {
                boolean initial = initialText != null && initialText.equals(filterText);
                if (initial) {
                    filter.setPattern(null);
                } else if (filterText != null) {
```

### ConstantValue
Condition `filterText != null` is always `true`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
                if (initial) {
                    filter.setPattern(null);
                } else if (filterText != null) {
                    filter.setPattern(filterText);
                }
```

### ConstantValue
Condition `items.length > 0` is always `true`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
                            }
                            TreeItem[] children = item.getItems();
                            if (items.length > 0) {
                                canceled = recursiveExpand(children, monitor, cancelTime, numItemsLeft);
                            }
```

### ConstantValue
Value `result` is always 'null'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageNameLabelProvider.java`
#### Snippet
```java
            if (result instanceof FailureResult) {
                return PluginImages.OPERATION_FAILURE.withState(PluginImage.ImageState.ENABLED).getImage();
            } else if (result instanceof SkippedResult) {
                return PluginImages.OPERATION_SKIPPED.withState(PluginImage.ImageState.ENABLED).getImage();
            } else if (result instanceof SuccessResult) {
```

### ConstantValue
Value `result` is always 'null'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageNameLabelProvider.java`
#### Snippet
```java
            } else if (result instanceof SkippedResult) {
                return PluginImages.OPERATION_SKIPPED.withState(PluginImage.ImageState.ENABLED).getImage();
            } else if (result instanceof SuccessResult) {
                return PluginImages.OPERATION_SUCCESS.withState(PluginImage.ImageState.ENABLED).getImage();
            } else {
```

### ConstantValue
Value `descriptor` is always 'null'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageNameLabelProvider.java`
#### Snippet
```java
        if (descriptor instanceof TaskOperationDescriptor) {
            return renderTask(finishEvent, ((TaskOperationDescriptor) descriptor), verbose);
        } else if (descriptor instanceof TestOperationDescriptor) {
            return renderTest(descriptor, verbose);
        } else if (descriptor instanceof TestOutputDescriptor) {
```

### ConstantValue
Value `descriptor` is always 'null'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageNameLabelProvider.java`
#### Snippet
```java
        } else if (descriptor instanceof TestOperationDescriptor) {
            return renderTest(descriptor, verbose);
        } else if (descriptor instanceof TestOutputDescriptor) {
            return renderTestOutput((TestOutputDescriptor) descriptor);
        } else {
```

### ConstantValue
Value `descriptor` is always 'null'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageNameLabelProvider.java`
#### Snippet
```java
            return renderTestOutput((TestOutputDescriptor) descriptor);
        } else {
            return renderOther(descriptor);
        }
    }
```

### ConstantValue
Condition `e != null` is always `false`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/GradleConsole.java`
#### Snippet
```java
        }

        if (e != null) {
            String message = String.format("Cannot close streams of console %s.", getName()); //$NON-NLS-1$
            UiPlugin.logger().error(message, e);
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/TestExecutionTarget.java`
#### Snippet
```java

        Optional<Set<String>> scopes = ClasspathUtils.scopesFor(fragmentRootEntry);
        if (scopes.isPresent()) {
            return hasElementContainingTheWordTest(scopes.get());
        } else {
```

## RuleId[id=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CompatibilityChecker.java`
#### Snippet
```java
            Properties properties = new Properties();
            properties.load(inputStream);
            properties.entrySet().forEach(e -> {
                Object javaVersion = e.getKey();
                Object gradleVersions = e.getValue();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `GradleCore` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/GradleCore.java`
#### Snippet
```java
 * @since 3.0
 */
public final class GradleCore {
    public static GradleWorkspace getWorkspace() {
        return CorePlugin.internalGradleWorkspace();
```

### UtilityClassWithoutPrivateConstructor
Class `CompatibilityChecker` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CompatibilityChecker.java`
#### Snippet
```java
import java.util.Set;

public class CompatibilityChecker {
    public static final String BYPASS_COMPATIBILITY_CHECK_KEY = "org.eclipse.buildship.integtest.bypassToolingApiCompatibilityChecks";
    // <JDK, unsupported Gradle versions>
```

### UtilityClassWithoutPrivateConstructor
Class `PlatformUtils` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/eclipse/PlatformUtils.java`
#### Snippet
```java
 * Provides convenience calculations related to the Eclipse platform.
 */
public class PlatformUtils {
    public static boolean supportsTestAttributes() {
        Bundle platformBundle = Platform.getBundle("org.eclipse.platform");
```

### UtilityClassWithoutPrivateConstructor
Class `ProjectNameUpdater` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ProjectNameUpdater.java`
#### Snippet
```java
 * Updates project names to match the Gradle model. Moves other projects out of the way if necessary.
 */
final class ProjectNameUpdater {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `LibraryFilter` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/LibraryFilter.java`
#### Snippet
```java
 * @author Donat Csikos
 */
final class LibraryFilter {

    public static void update(IJavaProject eclipseProject, EclipseProject modelProject, IProgressMonitor monitor) throws JavaModelException {
```

### UtilityClassWithoutPrivateConstructor
Class `ManagedModelMergingStrategy` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ManagedModelMergingStrategy.java`
#### Snippet
```java
 * @author Donat Csikos
 */
final class ManagedModelMergingStrategy {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `BuildCommandUpdater` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/BuildCommandUpdater.java`
#### Snippet
```java
 * Updates the build commands on the target project.
 */
final class BuildCommandUpdater {

    public static void update(IProject project, List<EclipseBuildCommand> buildCommands, PersistentModelBuilder persistentModel, IProgressMonitor monitor) throws CoreException {
```

### UtilityClassWithoutPrivateConstructor
Class `OutputLocationUpdater` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/OutputLocationUpdater.java`
#### Snippet
```java
 * @author Donat Csikos
 */
final class OutputLocationUpdater {

    public static void update(ProjectContext projectContext, IJavaProject project, EclipseProject eclipseProject, IProgressMonitor monitor) throws CoreException {
```

### UtilityClassWithoutPrivateConstructor
Class `BuildScriptLocationUpdater` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/BuildScriptLocationUpdater.java`
#### Snippet
```java
 * @author Donat Csikos
 */
final class BuildScriptLocationUpdater {

    public static void update(EclipseProject eclipseProject, PersistentModelBuilder persistentModel, IProgressMonitor monitor) {
```

### UtilityClassWithoutPrivateConstructor
Class `PersistentModelConverter` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/preferences/PersistentModelConverter.java`
#### Snippet
```java
 * Contains helper methods for the {@link PersistentModel} <-> {@link Properties} conversion.
 */
final class PersistentModelConverter {

    private static final String PROPERTY_BUILD_DIR = "buildDir";
```

### UtilityClassWithoutPrivateConstructor
Class `Default` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java
     * @author Etienne Studer
     */
    public static final class Default {

        /**
```

### UtilityClassWithoutPrivateConstructor
Class `Default` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java
     * @author Etienne Studer
     */
    public static final class Default {

        /**
```

### UtilityClassWithoutPrivateConstructor
Class `ProjectSynchronizer` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/workspace/ProjectSynchronizer.java`
#### Snippet
```java
 * @see SynchronizeGradleProjectsJob
 */
public final class ProjectSynchronizer {

    public static void execute(final ExecutionEvent event) {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/NewProjectHandler.java`
#### Snippet
```java
        public boolean shouldImportNewProjects() {
            return true;
        };

        @Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/NewProjectHandler.java`
#### Snippet
```java
        public boolean shouldImportNewProjects() {
            return false;
        };

        @Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/WorkspaceConfiguration.java`
#### Snippet
```java
import com.google.common.base.Objects;

import org.eclipse.buildship.core.GradleDistribution;;

/**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskGroupNode.java`
#### Snippet
```java
    public List<TaskNode> getTaskNodes() {
        return this.taskNodes;
    };

    @Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/ProjectTask.java`
#### Snippet
```java
    public Task getTask() {
        return this.task;
    };

    public String getName() {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getDisplayName` will produce `NullPointerException`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/RunGradleTestLaunchRequestJob.java`
#### Snippet
```java
                    return methodName != null ? className + "#" + methodName : className;
                } else {
                    return descriptor.getDisplayName();
                }
            }
```

### DataFlowIssue
Method invocation `getDisplayName` will produce `NullPointerException`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/RunGradleTestLaunchRequestJob.java`
#### Snippet
```java
                    return methodName != null ? className + "#" + methodName : className;
                } else {
                    return descriptor.getDisplayName();
                }
            }
```

### DataFlowIssue
Method invocation `getRawClasspathEntry` may produce `NullPointerException`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/TestExecutionTarget.java`
#### Snippet
```java
        IClasspathEntry fragmentRootEntry = null;
        try {
            fragmentRootEntry = getPackageFragmentRoot(type).getRawClasspathEntry();
        } catch (JavaModelException e) {
            throw new GradlePluginsRuntimeException(e);
```

### DataFlowIssue
Method invocation `getWorkingCopy` will produce `NullPointerException`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/DefaultExternalLaunchConfigurationManager.java`
#### Snippet
```java
            updateLaunchConfiguration((ILaunchConfigurationWorkingCopy) configuration, plusEntries, minusEntries);
        } else {
            ILaunchConfigurationWorkingCopy workingCopy = configuration.getWorkingCopy();
            updateLaunchConfiguration(workingCopy, plusEntries, minusEntries);
            workingCopy.doSave();
```

### DataFlowIssue
Condition `failure instanceof OperationCanceledException` is redundant and can be replaced with a null check
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java

    public static ToolingApiStatus from(String workName, Throwable failure) {
        if (failure instanceof OperationCanceledException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_CANCELLED, workName, failure);
        } else if (failure instanceof BuildCancelledException) {
```

### DataFlowIssue
Argument `model` might be null
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/BaseConfigurator.java`
#### Snippet
```java
        persistentModel.gradleVersion(this.gradleVersion);

        BuildScriptLocationUpdater.update(model, persistentModel, progress.newChild(1));

        LinkedResourcesUpdater.update(project, ImmutableList.copyOf(model.getLinkedResources()), persistentModel, progress.newChild(1));
```

### DataFlowIssue
Switch label `GradleImportPackage.DISTRIBUTION_TYPE` is unreachable
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case GradleImportPackage.DISTRIBUTION_TYPE:
                return convertDistributionTypeToString(eDataType, instanceValue);
            default:
```

### DataFlowIssue
Switch label `GradleImportPackage.GRADLE_IMPORT_TASK` is unreachable
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case GradleImportPackage.GRADLE_IMPORT_TASK:
                return createGradleImportTask();
            default:
```

### DataFlowIssue
Switch label `GradleImportPackage.DISTRIBUTION_TYPE` is unreachable
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case GradleImportPackage.DISTRIBUTION_TYPE:
                return createDistributionTypeFromString(eDataType, initialValue);
            default:
```

### DataFlowIssue
Method invocation `getAdapter` will produce `NullPointerException`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/SelectionUtils.java`
#### Snippet
```java
                target = (ISetSelectionTarget) part;
            } else {
                target = (ISetSelectionTarget) part.getAdapter(ISetSelectionTarget.class);
            }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageNameLabelProvider.java`
#### Snippet
```java
            return renderTestOutput((TestOutputDescriptor) descriptor);
        } else {
            return renderOther(descriptor);
        }
    }
```

### DataFlowIssue
Method invocation `setDocumentPartitioner` will produce `NullPointerException`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleDocumentSetupParticipant.java`
#### Snippet
```java
            extension3.setDocumentPartitioner(GradleEditorConstants.PARTITIONING, partitioner);
        } else {
            document.setDocumentPartitioner(partitioner);
        }
        partitioner.connect(document);
```

### DataFlowIssue
Condition `target instanceof CoreException` is redundant and can be replaced with a null check
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/WizardHelper.java`
#### Snippet
```java
    static ToolingApiStatus containerExceptionToToolingApiStatus(InvocationTargetException exception) {
        Throwable target = exception.getTargetException() == null ? exception : exception.getTargetException();
        if (target instanceof CoreException && ((CoreException) target).getStatus() instanceof ToolingApiStatus) {
           return (ToolingApiStatus) ((CoreException) target).getStatus();
        } else {
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
The 'filter().findFirst().isPresent()' chain can be replaced with 'anyMatch()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/DefaultGradleBuild.java`
#### Snippet
```java
                return from(statusFor(failures.get(0)));
            } else {
                boolean internalFailure = failures.stream().filter(f -> CorePlugin.PLUGIN_ID.equals(f.getPluginId())).findFirst().isPresent();
                String pluginId = internalFailure ? CorePlugin.PLUGIN_ID : failures.get(0).getPluginId();
                MultiStatus status = new MultiStatus(pluginId, 0, "Gradle synchronization failed with multiple errors", null);
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java
        Predicate<GradleVersion> toolingApiConstraint = GradleVersionConstraints.toPredicate(">=2.6");
        Set<String> unsupportedVersions = CompatibilityChecker.compatibilityMap.get(JavaVersion.current().getMajorVersion());
        Predicate<GradleVersion> javaVersionConstraint = (ignoreJavaConstraint || unsupportedVersions == null || unsupportedVersions.size() == 0) ? Predicates.alwaysTrue() : GradleVersionConstraints.toPredicate("!=" + unsupportedVersions.stream().collect(Collectors.joining(" !=")));
        @SuppressWarnings("unchecked")
        Predicate<GradleVersion> matchingVersions = Predicates.and(versionConstraint, toolingApiConstraint, javaVersionConstraint);
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `Set`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/classpath/ClasspathUtils.java`
#### Snippet
```java
     * @return the set of scopes
     */
    public static Optional<Set<String>> scopesFor(IClasspathEntry entry) {
        for (IClasspathAttribute attribute : entry.getExtraAttributes()) {
            if (attribute.getName().equals("gradle_scope")) {
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/classpath/ClasspathUtils.java`
#### Snippet
```java
     * @return the set of used-by scopes
     */
    public static Optional<Set<String>> usedByScopesFor(IClasspathEntry entry) {
        for (IClasspathAttribute attribute : entry.getExtraAttributes()) {
            if (attribute.getName().equals("gradle_used_by_scope")) {
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/LaunchConfigurationScope.java`
#### Snippet
```java
            Set<IPackageFragmentRoot> soureFolders = SupportedLaunchConfigType.collectSourceFolders(configuration);
            for (IPackageFragmentRoot sourceFolder : soureFolders) {
                Optional<Set<String>> scope = ClasspathUtils.scopesFor(sourceFolder.getRawClasspathEntry());
                if (!scope.isPresent()) {
                    return INCLUDE_ALL;
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/LaunchConfigurationScope.java`
#### Snippet
```java
            }

            Optional<Set<String>> entryUsedByScopes = ClasspathUtils.usedByScopesFor(entry);
            if (!entryUsedByScopes.isPresent() || entryUsedByScopes.get().isEmpty()) {
                return true;
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/TestExecutionTarget.java`
#### Snippet
```java
        }

        Optional<Set<String>> scopes = ClasspathUtils.scopesFor(fragmentRootEntry);
        if (scopes.isPresent()) {
            return hasElementContainingTheWordTest(scopes.get());
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/extension/InternalProjectConfigurator.java`
#### Snippet
```java
        filterCylicDependencies(configurators);

        List<InternalProjectConfigurator> internalConfigurators = configurators.stream().map(c -> new InternalProjectConfigurator(c)).collect(Collectors.toList());
        Collections.sort(internalConfigurators);

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultModelProvider.java`
#### Snippet
```java
            // TODO (donat) Right now, project configurators can only get cached model query results if they invoke the same exact actions
            // used below. We should fix this by letting configurators declare their required models.
            DefaultModelProvider.this.gradleBuild.withConnection(connection -> EclipseModelUtils.runTasksAndQueryModels(connection), tokenSource, monitor),
        FetchStrategy.FORCE_RELOAD, EclipseProject.class);
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringListEditor.java`
#### Snippet
```java

    private void notifyListeners() {
        this.listeners.forEach(l -> l.onChange());
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/workspace/ProjectSynchronizer.java`
#### Snippet
```java
        Set<GradleBuild> gradleBuilds = Sets.newLinkedHashSet();
        for (IProject project : selectedProjects) {
            GradleCore.getWorkspace().getBuild(project).ifPresent(gradleBuild -> gradleBuilds.add(gradleBuild));
        }

```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/WrapperGradleDistribution.java`
#### Snippet
```java
    @Override
    public String toString() {
        return String.valueOf("GRADLE_DISTRIBUTION(WRAPPER)");
    }

```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/UrlPatternMatchListener.java`
#### Snippet
```java
            final String url = this.console.getDocument().get(offset, length);
            this.console.addHyperlink(new Hyperlink(url), offset, length);
        } catch (BadLocationException e) {
        }
    }
```

### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/BuildScanPatternMatchListener.java`
#### Snippet
```java
                CorePlugin.listenerRegistry().dispatch(new BuildScanCreatedEvent(buildScanUrl, description.get()));
            }
        } catch (BadLocationException e) {
        }
    }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/PublishedGradleVersionsWrapper.java`
#### Snippet
```java

        @Override
        protected void canceling() {
            Thread.currentThread().interrupt();
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/PublishedGradleVersionsWrapper.java`
#### Snippet
```java

        @Override
        protected IStatus run(IProgressMonitor monitor) {
            try {
                PublishedGradleVersions versions = PublishedGradleVersions.create(LookupStrategy.REMOTE_IF_NOT_CACHED);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/preferences/DefaultModelPersistence.java`
#### Snippet
```java

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                for (IProject project : CorePlugin.workspaceOperations().getAllProjects()) {
                    if (GradleProjectNature.isPresentOn(project)) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultGradleProjectBuilder.java`
#### Snippet
```java

    @Override
    protected void clean(IProgressMonitor monitor) throws CoreException {
        // delete markers
        GradleProjectMarker.INSTANCE.removeMarkerFromResourceRecursively(getProject());
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultGradleProjectBuilder.java`
#### Snippet
```java
    // In Eclipse 3.6, this method has no generics in the argument list (Map<String,String>)
    @Override
    protected IProject[] build(int kind, @SuppressWarnings("rawtypes") Map args, IProgressMonitor monitor) throws CoreException {
        IProject project = getProject();
        if (kind == AUTO_BUILD) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/PreferenceStore.java`
#### Snippet
```java
         * From org.eclipse.core.internal.preference.EclipsePreferences.
         */
        protected static String removeTimestampFromTable(Properties properties) throws IOException {
            // store the properties in a string and then skip the first line (date/timestamp)
            ByteArrayOutputStream output = new ByteArrayOutputStream();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/UiPlugin.java`
#### Snippet
```java

    @Override
    protected void initializeImageRegistry(ImageRegistry imageRegistry) {
        for (PluginImages pluginImage : PluginImages.values()) {
            pluginImage.register();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/GradleProjectSettingsComposite.java`
#### Snippet
```java

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/GradleDistributionGroup.java`
#### Snippet
```java

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/UpdateExecutionPageJob.java`
#### Snippet
```java

    @Override
    protected IStatus run(IProgressMonitor monitor) {
        RateLimiter rateLimiter = RateLimiter.create(MAX_UPDATES_PER_SECOND);
        while(this.running || !this.queue.isEmpty()) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditor.java`
#### Snippet
```java

    @Override
    protected boolean isTabsToSpacesConversionEnabled() {
        // Can't use our own preference store because JDT disables this functionality in its preferences.
        return EditorsUI.getPreferenceStore().getBoolean(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleEditor.java`
#### Snippet
```java
public final class GradleEditor extends TextEditor {
    @Override
    protected void initializeEditor() {
        super.initializeEditor();
        setSourceViewerConfiguration(new GradleTextViewerConfiguration());
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java
    }

    protected void openTestSourceFile(CancellationTokenSource tokenSource, IProgressMonitor monitor) throws Exception {
        SubMonitor subMonitor = SubMonitor.convert(monitor, this.operationItems.size());
        for (OperationItem operationItem : this.operationItems) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/FailureDialog.java`
#### Snippet
```java

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        GridData containerGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/FailureDialog.java`
#### Snippet
```java

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.CLOSE_LABEL, false);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/FailureDialog.java`
#### Snippet
```java

    @Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText(this.title);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/preferences/GradleExperimentalFeaturesPreferencePage.java`
#### Snippet
```java

    @Override
    protected Control createContents(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayoutFactory.swtDefaults().numColumns(1).applyTo(composite);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/preferences/GradleProjectPreferencePage.java`
#### Snippet
```java

    @Override
    protected Control createContents(Composite parent) {
        this.gradleProjectSettingsComposite = GradleProjectSettingsComposite.builder(parent)
                .withAutoSyncCheckbox()
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/preferences/GradleWorkbenchPreferencePage.java`
#### Snippet
```java

    @Override
    protected Control createContents(Composite parent) {
        this.gradleProjectSettingsComposite = GradleProjectSettingsComposite.builder(parent)
                .withAutoSyncCheckbox()
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/preferences/GradleWorkbenchPreferencePage.java`
#### Snippet
```java

    @Override
    protected void performDefaults() {
        this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getGradleUserHomeText().setText("");
        this.gradleProjectSettingsComposite.getAdvancedOptionsGroup().getJavaHomeText().setText("");
```

## RuleId[id=Java9CollectionFactory]
### Java9CollectionFactory
Can be replaced with 'List.of()' call
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @generated
     */
    public static final List<DistributionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `SortedProperties` may be 'static'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/PreferenceStore.java`
#### Snippet
```java
     * location.
     */
    public class SortedProperties extends Properties {

        private static final long serialVersionUID = 1L;
```

### InnerClassMayBeStatic
Inner class `DistributionLocator` may be 'static'
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java


    public class DistributionLocator {
        private static final String RELEASE_REPOSITORY = "https://services.gradle.org/distributions";
        private static final String SNAPSHOT_REPOSITORY = "https://services.gradle.org/distributions-snapshots";
```

### InnerClassMayBeStatic
Inner class `DistributionLocator` may be 'static'
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java


    public class DistributionLocator {
        private static final String RELEASE_REPOSITORY = "https://services.gradle.org/distributions";
        private static final String SNAPSHOT_REPOSITORY = "https://services.gradle.org/distributions-snapshots";
```

### InnerClassMayBeStatic
Inner class `QuickSearchState` may be 'static'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/QuickSearchManager.java`
#### Snippet
```java
     * Encapsulates the current state of the quick search.
     */
    private final class QuickSearchState {

        // contains the current search text
```

### InnerClassMayBeStatic
Inner class `ShowTestSourceFileSearchRequester` may be 'static'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java
     * Match the type and potentially also the method name.
     */
    private final class ShowTestSourceFileSearchRequester extends SearchRequestor {

        private final String methodName;
```

### InnerClassMayBeStatic
Inner class `DialogUpdater` may be 'static'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectSettingsTab.java`
#### Snippet
```java
     * Listener implementation to update the dialog buttons and messages.
     */
    private class DialogUpdater extends SelectionAdapter implements ModifyListener, DistributionChangedListener, StringListChangeListener {

        @Override
```

### InnerClassMayBeStatic
Inner class `DialogUpdater` may be 'static'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectTab.java`
#### Snippet
```java
     * Listener implementation to update the dialog buttons and messages.
     */
    private class DialogUpdater extends SelectionAdapter implements ModifyListener, StringListChangeListener {
        @Override
        public void widgetSelected(SelectionEvent e) {
```

### InnerClassMayBeStatic
Inner class `DialogUpdater` may be 'static'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/TestsTab.java`
#### Snippet
```java
     * Listener implementation to update the dialog buttons and messages.
     */
    private class DialogUpdater extends SelectionAdapter implements ModifyListener, StringListChangeListener {
        @Override
        public void widgetSelected(SelectionEvent e) {
```

### InnerClassMayBeStatic
Inner class `WorkbenchPreferenceOpeningSelectionListener` may be 'static'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/GradleOptionsWizardPage.java`
#### Snippet
```java
     * Opens the workspace preferences dialog.
     */
    private class WorkbenchPreferenceOpeningSelectionListener implements SelectionListener {

        @Override
```

### InnerClassMayBeStatic
Inner class `WorkbenchPreferenceOpeningSelectionListener` may be 'static'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/preferences/GradleProjectPreferencePage.java`
#### Snippet
```java
     * Opens the workspace preferences dialog.
     */
    private class WorkbenchPreferenceOpeningSelectionListener implements SelectionListener {

        @Override
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'LinkedHashMap' may not contain keys of type 'Path'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ClasspathContainerUpdater.java`
#### Snippet
```java

    private void ensureGradleContainerIsPresent(LinkedHashMap<IPath, IClasspathEntry> containersToAdd) {
        if (!containersToAdd.containsKey(GradleClasspathContainer.CONTAINER_PATH)) {
            containersToAdd.put(GradleClasspathContainer.CONTAINER_PATH, createContainerEntry(GradleClasspathContainer.CONTAINER_PATH));
        }
```

### SuspiciousMethodCalls
'List' may not contain objects of type 'OperationDescriptor'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/gradle/GradleUtils.java`
#### Snippet
```java
        OperationDescriptor parent = candidate.getParent();
        if (parent instanceof TestOperationDescriptor) {
            return selectedTestDescriptors.contains(parent) || isParentSelected((TestOperationDescriptor) parent, selectedTestDescriptors);
        } else {
            return false;
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/PublishedGradleVersions.java`
#### Snippet
```java
            @Override
            public boolean apply(Map<String, String> input) {
                return (Boolean.valueOf(input.get(ACTIVE_RC)) || input.get(RC_FOR).equals("")) &&
                        !Boolean.valueOf(input.get(BROKEN)) &&
                        !Boolean.valueOf(input.get(SNAPSHOT));
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
        }
        clearCaches();
        if (patternString == null || patternString.equals("")) { //$NON-NLS-1$
            this.matcher = null;
        } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
        // Do nothing if it's empty string
        String initialText = tree.getInitialText();
        if (!filterText.equals("") && !filterText.equals(initialText)) {//$NON-NLS-1$
            if (tree.getPatternFilter() != filter) {
                boolean initial = initialText != null && initialText.equals(filterText);
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CorePlugin.java`
#### Snippet
```java
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public final class CorePlugin extends Plugin {

    public static final String PLUGIN_ID = "org.eclipse.buildship.core"; //$NON-NLS-1$
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/collections/AdapterFunction.java`
#### Snippet
```java
    @SuppressWarnings({ "unchecked", "cast", "RedundantCast" })
    @Override
    public T apply(Object adaptable) {
        return (T) this.adapterManager.getAdapter(adaptable, this.adapter);
    }
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/file/FileUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("ConstantConditions")
    public static boolean deleteRecursively(File file) {
        if (file.isDirectory()) {
            boolean success = true;
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/HierarchicalElementUtils.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public static <T extends HierarchicalElement> T getRoot(T model) {
        T root = model;
        while (root.getParent() != null) {
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/HierarchicalElementUtils.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private static <T extends HierarchicalElement> void addRecursively(T node, List<T> nodes) {
        nodes.add(node);
        for (HierarchicalElement child : node.getChildren()) {
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/IdeFriendlyClassLoading.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public static <T, U> BuildAction<Map<String, T>>loadCompositeModelQuery(Class<T> model, Class<U> parameterType, Action<? super U> parameter) {
        return (BuildAction<Map<String, T>>) loadClass(CompositeModelQuery.class, new Object[] { model, parameterType, parameter });
    }
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/IdeFriendlyClassLoading.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public static <T> BuildAction<Map<String, T>> loadCompositeModelQuery(Class<T> model) {
        return (BuildAction<Map<String, T>>) loadClass(CompositeModelQuery.class, model );
    }
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/Pair.java`
#### Snippet
```java
 */
@SuppressWarnings("NonSerializableFieldInSerializableClass")
public final class Pair<S, T> implements Serializable {

    private static final long serialVersionUID = 1L;
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/Path.java`
#### Snippet
```java
    @SuppressWarnings("NullableProblems")
    @Override
    public int compareTo(Path other) {
        Preconditions.checkNotNull(other);
        return PathComparator.INSTANCE.compare(this.path, other.path);
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ConnectionAwareLauncherProxy.java`
#### Snippet
```java
@SuppressWarnings("unchecked")
// TODO (donat) replace this class with IdeAttachedProjectConnection
public final class ConnectionAwareLauncherProxy implements InvocationHandler {

    private final LongRunningOperation launcher;
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultModelProvider.java`
#### Snippet
```java
    private <T> T executeOperation(final Callable<T> operation, FetchStrategy fetchStrategy, Class<?> cacheKey) {
        if (FetchStrategy.FROM_CACHE_ONLY == fetchStrategy) {
            @SuppressWarnings("unchecked")
            T result = (T) this.cache.getIfPresent(cacheKey);
            return result;
        }
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultModelProvider.java`
#### Snippet
```java
    private <U> U getFromCache(Class<?> cacheKey, Callable<U> cacheValueLoader) {
        try {
            @SuppressWarnings("unchecked")
            U result = (U) this.cache.get(cacheKey, cacheValueLoader);
            return result;
        } catch (Exception e) {
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java
        Set<String> unsupportedVersions = CompatibilityChecker.compatibilityMap.get(JavaVersion.current().getMajorVersion());
        Predicate<GradleVersion> javaVersionConstraint = (ignoreJavaConstraint || unsupportedVersions == null || unsupportedVersions.size() == 0) ? Predicates.alwaysTrue() : GradleVersionConstraints.toPredicate("!=" + unsupportedVersions.stream().collect(Collectors.joining(" !=")));
        @SuppressWarnings("unchecked")
        Predicate<GradleVersion> matchingVersions = Predicates.and(versionConstraint, toolingApiConstraint, javaVersionConstraint);

        ImmutableList<GradleVersion> configuredGradleVersions = this.gradleVersionProvider.getConfiguredGradleVersions();
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java
        Predicate<GradleVersion> toolingApiConstraint = GradleVersionConstraints.toPredicate(">=2.9");
        Predicate<GradleVersion> javaVersionConstraint = JavaVersion.current().isJava9Compatible() ? GradleVersionConstraints.toPredicate(">=4.3") : Predicates.alwaysTrue();
        @SuppressWarnings("unchecked")
        Predicate<GradleVersion> matchingVersions = Predicates.and(versionConstraint, toolingApiConstraint, javaVersionConstraint);

        ImmutableList<GradleVersion> configuredGradleVersions = this.gradleVersionProvider.getConfiguredGradleVersions();
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/UiPlugin.java`
#### Snippet
```java
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public final class UiPlugin extends AbstractUIPlugin {

    public static final String PLUGIN_ID = "org.eclipse.buildship.ui"; //$NON-NLS-1$
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/UiPlugin.java`
#### Snippet
```java

    @SuppressWarnings({"cast", "RedundantCast"})
    private void registerListeners() {
        this.consoleShowingLaunchListener = new ConsoleShowingLaunchListener();
        this.consoleShowingLaunchListener.handleAlreadyRunningLaunches();
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/UiPlugin.java`
#### Snippet
```java

    @SuppressWarnings({"cast", "RedundantCast"})
    private void unregisterListeners() {
        PlatformUI.getWorkbench().removeWorkbenchListener(this.shutdownListener);
        CorePlugin.listenerRegistry().removeEventListener(this.executionShowingLaunchRequestListener);
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/GradleConsolePageParticipant.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked") // Eclipse Mars M6 introduced type parameters on the IAdaptable interface
public final class GradleConsolePageParticipant implements IConsolePageParticipant {

    private CancelBuildExecutionAction cancelBuildExecutionAction;
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectTab.java`
#### Snippet
```java
    @SuppressWarnings("Contract")
    @Override
    public boolean isValid(ILaunchConfiguration configuration) {
        String workingDirectoryExpression = this.workingDirectoryText.getText();

```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/SelectionJavaElementResolver.java`
#### Snippet
```java
            @Override
            @SuppressWarnings({"cast", "RedundantCast"})
            public IJavaElement apply(Object input) {
                return (IJavaElement) Platform.getAdapterManager().getAdapter(input, IJavaElement.class);
            }
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/TestsTab.java`
#### Snippet
```java
    @SuppressWarnings("Contract")
    @Override
    public boolean isValid(ILaunchConfiguration configuration) {
        String workingDirectoryExpression = this.workingDirectoryText.getText();

```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/navigator/SubProjectViewerFilter.java`
#### Snippet
```java
    @SuppressWarnings({"cast", "RedundantCast"})
    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
        IResource resource = (IResource) Platform.getAdapterManager().getAdapter(element, IResource.class);
        return resource == null || !isSubProject(resource);
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/preferences/GradleProjectPreferencePage.java`
#### Snippet
```java

    @SuppressWarnings({"cast", "RedundantCast"})
    private IProject getTargetProject() {
        return (IProject) Platform.getAdapterManager().getAdapter(getElement(), IProject.class);
    }
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/action/CommandBackedAction.java`
#### Snippet
```java

    @SuppressWarnings({"cast", "RedundantCast"})
    private IHandlerService getHandlerService() {
        return (IHandlerService) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(IHandlerService.class);
    }
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/editor/EditorUtils.java`
#### Snippet
```java

    @SuppressWarnings("deprecation")
    public static IEditorPart openInInternalEditor(IFile file, boolean activate) {
        IEditorDescriptor desc;
        try {
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/editor/EditorUtils.java`
#### Snippet
```java

    @SuppressWarnings("deprecation")
    public static IEditorPart openInInternalEditor(File file, boolean activate) {
        IEditorDescriptor desc;
        try {
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/predicate/Predicates.java`
#### Snippet
```java
            @Override
            public boolean apply(Object adaptable) {
                @SuppressWarnings({ "cast", "RedundantCast" })
                IProject project = (IProject) Platform.getAdapterManager().getAdapter(adaptable, IProject.class);
                if (project != null) {
                    return hasGradleNature(project);
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/ContextActivatingViewPartListener.java`
#### Snippet
```java

    @SuppressWarnings({"cast", "RedundantCast"})
    public ContextActivatingViewPartListener(String contextId, IViewPart viewPart) {
        this.viewPart = Preconditions.checkNotNull(viewPart);
        this.contextId = Preconditions.checkNotNull(contextId);
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/SelectionUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings({"cast", "RedundantCast"}) // Eclipse Mars M6 introduced type parameters on the IAdaptable interface
    public static void selectAndReveal(List<? extends IResource> resources, IWorkbenchWindow window) {
        // validate the input
        if (window == null || resources == null || resources.isEmpty()) {
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkbenchUtils.java`
#### Snippet
```java
        IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        try {
            @SuppressWarnings("unchecked")
            T view = (T) activeWorkbenchWindow.getActivePage().showView(viewId, secondaryId, mode);
            return view;
        } catch (PartInitException e) {
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkbenchUtils.java`
#### Snippet
```java
    public static <T extends IViewPart> Optional<T> findView(String viewId) {
        IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        @SuppressWarnings("unchecked")
        T result = (T) activeWorkbenchWindow.getActivePage().findView(viewId);
        return Optional.ofNullable(result);
    }
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkingSetUtils.java`
#### Snippet
```java

        List<?> elements = selection.toList();
        @SuppressWarnings("unchecked")
        List<IWorkingSet> workingSets = (List<IWorkingSet>) FluentIterable.from(elements).filter(Predicates.instanceOf(IWorkingSet.class)).toList();
        return workingSets;
    }
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/MessagePage.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public final class MessagePage extends BasePage<Composite> {

    private final String message;
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/MultiPageView.java`
#### Snippet
```java

    private void addSelectionListenerThatUpdatesSelectionProvider(Page page) {
        @SuppressWarnings({"cast", "RedundantCast"})
        ISelectionProvider selectionProvider = (ISelectionProvider) page.getAdapter(ISelectionProvider.class);
        if (selectionProvider != null) {
            selectionProvider.addSelectionChangedListener(this.selectionChangedListener);
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/MultiPageView.java`
#### Snippet
```java

    private void removeSelectionListenerThatUpdatesSelectionProvider(Page page) {
        @SuppressWarnings({"cast", "RedundantCast"})
        ISelectionProvider selectionProvider = (ISelectionProvider) page.getAdapter(ISelectionProvider.class);
        if (selectionProvider != null) {
            selectionProvider.removeSelectionChangedListener(this.selectionChangedListener);
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/FailureDialog.java`
#### Snippet
```java

    @SuppressWarnings("RedundantTypeArguments")
    private void update() {
        Optional<FailureItem> failureItem = this.selectionIndex == -1 ? Optional.<FailureItem>absent() : Optional.of(this.failureItems.get(this.selectionIndex));
        Optional<Failure> failure = failureItem.isPresent() ? failureItem.get().failure : Optional.<Failure>absent();
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java

            // short-circuit if the resource does not map to a file
            @SuppressWarnings({ "cast", "RedundantCast" })
            final IFile file = (IFile) resource.getAdapter(IFile.class);
            if (file == null) {
                return true;
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OperationItem.java`
#### Snippet
```java
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public Object getAdapter(Class adapter) {
        if (OperationDescriptor.class.equals(adapter)) {
            return this.getDescriptor();
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskNodeSelectionUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("ConstantConditions")
    public static GradleRunConfigurationAttributes getRunConfigurationAttributes(NodeSelection selection) {
        Preconditions.checkNotNull(selection);
        List<String> tasks = getTaskPathStrings(selection);
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TreeViewerDoubleClickListener.java`
#### Snippet
```java

    @SuppressWarnings({"cast", "RedundantCast"})
    private IHandlerService getHandlerService() {
        return (IHandlerService) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(IHandlerService.class);
    }
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/ProjectNodeAdapterFactory.java`
#### Snippet
```java
 */
@SuppressWarnings({ "unchecked", "rawtypes" }) // Eclipse Mars M6 introduced type parameters on the IAdapterFactory interface
public final class ProjectNodeAdapterFactory implements IAdapterFactory {

    @Override
```

### RedundantSuppression
Redundant suppression
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/TaskNodeAdapterFactory.java`
#### Snippet
```java
 */
@SuppressWarnings({ "unchecked", "rawtypes" }) // Eclipse Mars M6 introduced type parameters on the IAdapterFactory interface
public final class TaskNodeAdapterFactory implements IAdapterFactory {

    @Override
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/PublishedGradleVersions.java`
#### Snippet
```java
            @Override
            public boolean apply(Map<String, String> input) {
                return (Boolean.valueOf(input.get(ACTIVE_RC)) || input.get(RC_FOR).equals("")) &&
                        !Boolean.valueOf(input.get(BROKEN)) &&
                        !Boolean.valueOf(input.get(SNAPSHOT));
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/PublishedGradleVersions.java`
#### Snippet
```java
            public boolean apply(Map<String, String> input) {
                return (Boolean.valueOf(input.get(ACTIVE_RC)) || input.get(RC_FOR).equals("")) &&
                        !Boolean.valueOf(input.get(BROKEN)) &&
                        !Boolean.valueOf(input.get(SNAPSHOT));
            }
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/PublishedGradleVersions.java`
#### Snippet
```java
                return (Boolean.valueOf(input.get(ACTIVE_RC)) || input.get(RC_FOR).equals("")) &&
                        !Boolean.valueOf(input.get(BROKEN)) &&
                        !Boolean.valueOf(input.get(SNAPSHOT));
            }
        }).transform(new Function<Map<String, String>, GradleVersion>() {
```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
            try {
                testText = new Text(composite, SWT.SEARCH | SWT.ICON_CANCEL);
                useNativeSearchField = new Boolean((testText.getStyle() & SWT.ICON_CANCEL) != 0);
            } finally {
                if (testText != null) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public void setOfflineMode(boolean offlineMode) {
        this.offlineMode.setValue(Boolean.valueOf(offlineMode));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public void setAutoSync(boolean autoSync) {
        this.autoSync.setValue(Boolean.valueOf(autoSync));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public void setShowExecutionsView(boolean showExecutionsView) {
        this.showExecutionsView.setValue(Boolean.valueOf(showExecutionsView));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public void setShowConsoleView(boolean showConsoleView) {
        this.showConsoleView.setValue(Boolean.valueOf(showConsoleView));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public void setOverwriteWorkspaceSettings(boolean overwriteWorkspaceSettings) {
        this.overwriteWorkspaceSettings.setValue(Boolean.valueOf(overwriteWorkspaceSettings));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public void setBuildScansEnabled(boolean buildScansEnabled) {
        this.buildScansEnabled.setValue(Boolean.valueOf(buildScansEnabled));
    }

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'jobOrNull'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/LaunchUtils.java`
#### Snippet
```java
    }

    static void launch(String name, ILaunchConfiguration configuration, String mode, ILaunch launch, Optional<? extends Job> jobOrNull, IProgressMonitor monitor) {
        monitor.beginTask(name, IProgressMonitor.UNKNOWN);
        try {
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/PreferenceStore.java`
#### Snippet
```java
                output.close();
            }
            String string = output.toString("UTF-8");
            String separator = System.getProperty("line.separator");
            return string.substring(string.indexOf(separator) + separator.length());
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/PreferenceStore.java`
#### Snippet
```java
                output = new FileOutputStream(this.propertiesFile);

                output.write(removeTimestampFromTable(this.properties).getBytes("UTF-8")); //$NON-NLS-1$
                output.flush();
            } catch (IOException e) {
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/console/StdProcessStreamsProvider.java`
#### Snippet
```java
        @Override
        public OutputStream getError() {
            return System.err;
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/console/StdProcessStreamsProvider.java`
#### Snippet
```java
        @Override
        public OutputStream getOutput() {
            return System.out;
        }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/console/StdProcessStreamsProvider.java`
#### Snippet
```java
        @Override
        public OutputStream getConfiguration() {
            return System.err;
        }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionProvider.java`
#### Snippet
```java
        } else if (pattern.equals(LATEST)) {
            configuredGradleVersions = ImmutableSet.<GradleVersion> builder().add(GradleVersion.current()).add(this.releasedVersions.getLatest()).build();
        } else if (pattern.matches("^\\d.*$")) {
            configuredGradleVersions = FluentIterable.from(Splitter.on(',').split(pattern)).transform(new Function<String, GradleVersion>() {

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionConstraints.java`
#### Snippet
```java
        // AND-combined patterns
        final List<Predicate<GradleVersion>> predicates = new ArrayList<Predicate<GradleVersion>>();
        String[] patterns = trimmed.split("\\s+");
        for (String value : patterns) {
            if (value.startsWith(NOT_EQUALS)) {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/GradleVersionProvider.java`
#### Snippet
```java
        } else if (pattern.equals(LATEST)) {
            configuredGradleVersions = ImmutableSet.<GradleVersion> builder().add(GradleVersion.current()).add(this.releasedVersions.getLatest()).build();
        } else if (pattern.matches("^\\d.*$")) {
            configuredGradleVersions = FluentIterable.from(Splitter.on(',').split(pattern)).transform(new Function<String, GradleVersion>() {

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/GradleVersionConstraints.java`
#### Snippet
```java
        // AND-combined patterns
        final List<Predicate<GradleVersion>> predicates = new ArrayList<Predicate<GradleVersion>>();
        String[] patterns = trimmed.split("\\s+");
        for (String value : patterns) {
            if (value.startsWith(NOT_EQUALS)) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.core.internal.configuration` is unnecessary, and can be replaced with an import
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/DefaultGradleBuild.java`
#### Snippet
```java

    @Override
    public org.eclipse.buildship.core.internal.configuration.BuildConfiguration getBuildConfig() {
        return this.buildConfig;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.core.internal.configuration` is unnecessary, and can be replaced with an import
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/DefaultGradleBuild.java`
#### Snippet
```java
    private final org.eclipse.buildship.core.internal.configuration.BuildConfiguration buildConfig;

    public DefaultGradleBuild(org.eclipse.buildship.core.internal.configuration.BuildConfiguration buildConfiguration) {
        this.buildConfig = buildConfiguration;
        this.modelProvider = new DefaultModelProvider(this);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.core.internal.configuration` is unnecessary, and can be replaced with an import
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/DefaultGradleBuild.java`
#### Snippet
```java
    private final ModelProvider modelProvider;
    private final Cache<Object, Object> projectConnectionCache;
    private final org.eclipse.buildship.core.internal.configuration.BuildConfiguration buildConfig;

    public DefaultGradleBuild(org.eclipse.buildship.core.internal.configuration.BuildConfiguration buildConfiguration) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.core.internal.launch` is unnecessary and can be removed
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/ExternalLaunchConfigurationManager.java`
#### Snippet
```java
 * entries if Gradle provides the appropriate scope information.
 *
 * @see org.eclipse.buildship.core.internal.launch.GradleClasspathProvider
 *
 * @author Donat Csikos
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.core.internal.console` is unnecessary and can be removed
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/console/StdProcessStreamsProvider.java`
#### Snippet
```java

/**
 * Default implementation of {@link org.eclipse.buildship.core.internal.console.ProcessStreamsProvider} that provides {@link System#out},
 * {@link System#err}, and {@link System#in}.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.core.internal.operation` is unnecessary and can be removed
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiOperationManager.java`
#### Snippet
```java
     * If the target operation fails then the exception is caught internally and a new
     * {@code CoreException} is thrown containing a custom
     * {@link org.eclipse.buildship.core.internal.operation.ToolingApiStatus}.
     *
     * @param operation the target Tooling API operation
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.core.internal.configuration` is unnecessary and can be removed
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultGradleProjectNature.java`
#### Snippet
```java

/**
 * Backing implementation class for the {@link org.eclipse.buildship.core.internal.configuration.GradleProjectNature}.
 * <p/>
 * Delegates to the {@link GradleProjectBuilder} to wire the project under configuration with the {@link DefaultGradleProjectBuilder}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.core.internal.configuration` is unnecessary and can be removed
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultGradleProjectBuilder.java`
#### Snippet
```java

/**
 * Backing implementation class for the {@link org.eclipse.buildship.core.internal.configuration.GradleProjectBuilder}.
 * <p/>
 * Wired to the project by the {@link org.eclipse.buildship.core.internal.configuration.GradleProjectBuilder}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.core.internal.configuration` is unnecessary and can be removed
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultGradleProjectBuilder.java`
#### Snippet
```java
 * Backing implementation class for the {@link org.eclipse.buildship.core.internal.configuration.GradleProjectBuilder}.
 * <p/>
 * Wired to the project by the {@link org.eclipse.buildship.core.internal.configuration.GradleProjectBuilder}.
 * <p/>
 * Defined as an extension point of <code>org.eclipse.core.resources.builders</code> in the <i>plugin.xml</i>.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportFactory.java`
#### Snippet
```java
     * @generated
     */
    GradleImportFactory eINSTANCE = org.eclipse.buildship.oomph.impl.GradleImportFactoryImpl.init();

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportFactory.java`
#### Snippet
```java
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.buildship.oomph.GradleImportPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
 * Type</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.buildship.oomph.GradleImportPackage#getDistributionType()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `org.eclipse.buildship.oomph/src/main/java/org/eclipse/buildship/oomph/impl/CustomGradleImportTaskImpl.java`
#### Snippet
```java
                IPath projectFolder = project.getLocation();
                try {
                    if (Files.isSameFile(java.nio.file.Paths.get(projectFolder.toOSString()), java.nio.file.Paths.get(rootFolder.toOSString()))) {
                        projectPresentInWorkspace = true;
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `org.eclipse.buildship.oomph/src/main/java/org/eclipse/buildship/oomph/impl/CustomGradleImportTaskImpl.java`
#### Snippet
```java
                IPath projectFolder = project.getLocation();
                try {
                    if (Files.isSameFile(java.nio.file.Paths.get(projectFolder.toOSString()), java.nio.file.Paths.get(rootFolder.toOSString()))) {
                        projectPresentInWorkspace = true;
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
    /**
     * Sets the value of the
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#isAutomaticProjectSynchronization
     * <em>Automatic Project Synchronization</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Override Workspace Settings</em>' attribute.
     * @see #setOverrideWorkspaceSettings(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_OverrideWorkspaceSettings()
     * @model default="false"
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Specific Gradle Version</em>' attribute.
     * @see #setSpecificGradleVersion(String)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_SpecificGradleVersion()
     * @model
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * 
     * @return the value of the '<em>Source Locators</em>' containment reference list.
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_SourceLocators()
     * @model containment="true" required="true" extendedMetaData="name='sourceLocator'"
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java

    /**
     * Sets the value of the '{@link org.eclipse.buildship.oomph.GradleImportTask#isOfflineMode
     * <em>Offline Mode</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java

    /**
     * Sets the value of the '{@link org.eclipse.buildship.oomph.GradleImportTask#getJavaHome
     * <em>Java Home</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
    /**
     * Sets the value of the
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#isOverrideWorkspaceSettings <em>Override
     * Workspace Settings</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Offline Mode</em>' attribute.
     * @see #setOfflineMode(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_OfflineMode()
     * @model default="false"
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Java Home</em>' attribute.
     * @see #setJavaHome(String)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_JavaHome()
     * @model
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * </p>
 * <ul>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getSourceLocators <em>Source
 * Locators</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isOverrideWorkspaceSettings <em>Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getSourceLocators <em>Source
 * Locators</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isOverrideWorkspaceSettings <em>Override
 * Workspace Settings</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getDistributionType <em>Distribution
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isOverrideWorkspaceSettings <em>Override
 * Workspace Settings</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getDistributionType <em>Distribution
 * Type</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getLocalInstallationDirectory <em>Local
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getDistributionType <em>Distribution
 * Type</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getLocalInstallationDirectory <em>Local
 * Installation Directory</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getRemoteDistributionLocation <em>Remote
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getLocalInstallationDirectory <em>Local
 * Installation Directory</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getRemoteDistributionLocation <em>Remote
 * Distribution Location</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getSpecificGradleVersion <em>Specific
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getRemoteDistributionLocation <em>Remote
 * Distribution Location</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getSpecificGradleVersion <em>Specific
 * Gradle Version</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getProgramArguments <em>Program
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getSpecificGradleVersion <em>Specific
 * Gradle Version</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getProgramArguments <em>Program
 * Arguments</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getJvmArguments <em>Jvm
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getProgramArguments <em>Program
 * Arguments</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getJvmArguments <em>Jvm
 * Arguments</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getGradleUserHome <em>Gradle User
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getJvmArguments <em>Jvm
 * Arguments</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getGradleUserHome <em>Gradle User
 * Home</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getJavaHome <em>Java Home</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getGradleUserHome <em>Gradle User
 * Home</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getJavaHome <em>Java Home</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isOfflineMode <em>Offline Mode</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isBuildScans <em>Build Scans</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * Home</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getJavaHome <em>Java Home</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isOfflineMode <em>Offline Mode</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isBuildScans <em>Build Scans</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isAutomaticProjectSynchronization
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#getJavaHome <em>Java Home</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isOfflineMode <em>Offline Mode</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isBuildScans <em>Build Scans</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isAutomaticProjectSynchronization
 * <em>Automatic Project Synchronization</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isOfflineMode <em>Offline Mode</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isBuildScans <em>Build Scans</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isAutomaticProjectSynchronization
 * <em>Automatic Project Synchronization</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isShowConsoleView <em>Show Console
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isAutomaticProjectSynchronization
 * <em>Automatic Project Synchronization</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isShowConsoleView <em>Show Console
 * View</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isShowExecutionsView <em>Show Executions
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isShowConsoleView <em>Show Console
 * View</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.GradleImportTask#isShowExecutionsView <em>Show Executions
 * View</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java

    /**
     * Sets the value of the '{@link org.eclipse.buildship.oomph.GradleImportTask#isShowConsoleView
     * <em>Show Console View</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
    /**
     * Sets the value of the
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getLocalInstallationDirectory <em>Local
     * Installation Directory</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#isShowExecutionsView <em>Show Executions
     * View</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java

    /**
     * Sets the value of the '{@link org.eclipse.buildship.oomph.GradleImportTask#getGradleUserHome
     * <em>Gradle User Home</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Show Executions View</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#isShowExecutionsView()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
    /**
     * Sets the value of the
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getRemoteDistributionLocation <em>Remote
     * Distribution Location</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java

    /**
     * Returns the meta object for enum '{@link org.eclipse.buildship.oomph.DistributionType
     * <em>Distribution Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Gradle User Home</em>' attribute.
     * @see #setGradleUserHome(String)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_GradleUserHome()
     * @model
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for enum '<em>Distribution Type</em>'.
     * @see org.eclipse.buildship.oomph.DistributionType
     * @generated
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Build Scans</em>' attribute.
     * @see #setBuildScans(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_BuildScans()
     * @model default="false"
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java

        /**
         * The meta object literal for the '{@link org.eclipse.buildship.oomph.DistributionType
         * <em>Distribution Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
    /**
     * Returns the value of the '<em><b>Program Arguments</b></em>' attribute list. The list
     * contents are of type {@link java.lang.String}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Program Arguments</em>' attribute list isn't clear, there really
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * <em>Distribution Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.eclipse.buildship.oomph.DistributionType
         * @see org.eclipse.buildship.oomph.impl.GradleImportPackageImpl#getDistributionType()
         * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * 
     * @return the value of the '<em>Program Arguments</em>' attribute list.
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_ProgramArguments()
     * @model unique="false"
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
    /**
     * Sets the value of the
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#isShowExecutionsView <em>Show Executions
     * View</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getLocalInstallationDirectory <em>Local
     * Installation Directory</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
    /**
     * Returns the value of the '<em><b>Jvm Arguments</b></em>' attribute list. The list contents
     * are of type {@link java.lang.String}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Jvm Arguments</em>' attribute list isn't clear, there really
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * 
     * @return the value of the '<em>Jvm Arguments</em>' attribute list.
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_JvmArguments()
     * @model unique="false"
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Local Installation Directory</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#getLocalInstallationDirectory()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * Returns the value of the '<em><b>Distribution Type</b></em>' attribute. The default value is
     * <code>"GRADLE_WRAPPER"</code>. The literals are from the enumeration
     * {@link org.eclipse.buildship.oomph.DistributionType}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Distribution Type</em>' attribute isn't clear, there really should
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute list
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getJvmArguments <em>Jvm
     * Arguments</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * 
     * @return the value of the '<em>Distribution Type</em>' attribute.
     * @see org.eclipse.buildship.oomph.DistributionType
     * @see #setDistributionType(DistributionType)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_DistributionType()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.DistributionType
     * @see #setDistributionType(DistributionType)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_DistributionType()
     * @model default="GRADLE_WRAPPER"
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute list '<em>Jvm Arguments</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#getJvmArguments()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Local Installation Directory</em>' attribute.
     * @see #setLocalInstallationDirectory(String)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_LocalInstallationDirectory()
     * @model
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getSpecificGradleVersion <em>Specific
     * Gradle Version</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
    /**
     * Sets the value of the
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getDistributionType <em>Distribution
     * Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Specific Gradle Version</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#getSpecificGradleVersion()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * 
     * @param value the new value of the '<em>Distribution Type</em>' attribute.
     * @see org.eclipse.buildship.oomph.DistributionType
     * @see #getDistributionType()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getJavaHome <em>Java Home</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Automatic Project Synchronization</em>' attribute.
     * @see #setAutomaticProjectSynchronization(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_AutomaticProjectSynchronization()
     * @model default="false"
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Java Home</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#getJavaHome()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java

    /**
     * Sets the value of the '{@link org.eclipse.buildship.oomph.GradleImportTask#isBuildScans
     * <em>Build Scans</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getDistributionType <em>Distribution
     * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Show Executions View</em>' attribute.
     * @see #setShowExecutionsView(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_ShowExecutionsView()
     * @model default="false"
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Show Console View</em>' attribute.
     * @see #setShowConsoleView(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_ShowConsoleView()
     * @model default="false"
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Distribution Type</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#getDistributionType()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
    /**
     * Sets the value of the
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getSpecificGradleVersion <em>Specific
     * Gradle Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Remote Distribution Location</em>' attribute.
     * @see #setRemoteDistributionLocation(String)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_RemoteDistributionLocation()
     * @model
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#isShowConsoleView <em>Show Console
     * View</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Show Console View</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#isShowConsoleView()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getRemoteDistributionLocation <em>Remote
     * Distribution Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Remote Distribution Location</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#getRemoteDistributionLocation()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#isAutomaticProjectSynchronization
     * <em>Automatic Project Synchronization</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Automatic Project Synchronization</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#isAutomaticProjectSynchronization()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#isOverrideWorkspaceSettings <em>Override
     * Workspace Settings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Override Workspace Settings</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#isOverrideWorkspaceSettings()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.buildship.oomph.GradleImportFactory
 * @model kind="package" annotation="http://www.eclipse.org/emf/2002/Ecore
 *        schemaLocation='https://raw.githubusercontent.com/eclipse/buildship/master/org.eclipse.buildship.oomph/model/GradleImport-1.0.ecore'"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java

    /**
     * The meta object id for the '{@link org.eclipse.buildship.oomph.DistributionType
     * <em>Distribution Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * <em>Distribution Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.buildship.oomph.DistributionType
     * @see org.eclipse.buildship.oomph.impl.GradleImportPackageImpl#getDistributionType()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getGradleUserHome <em>Gradle User
     * Home</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Gradle User Home</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#getGradleUserHome()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the containment reference list
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getSourceLocators <em>Source
     * Locators</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the containment reference list '<em>Source Locators</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#getSourceLocators()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @generated
     */
    GradleImportPackage eINSTANCE = org.eclipse.buildship.oomph.impl.GradleImportPackageImpl.init();

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#isBuildScans <em>Build Scans</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Build Scans</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#isBuildScans()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#isOfflineMode <em>Offline Mode</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute '<em>Offline Mode</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#isOfflineMode()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
    /**
     * Returns the meta object for the attribute list
     * '{@link org.eclipse.buildship.oomph.GradleImportTask#getProgramArguments <em>Program
     * Arguments</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for the attribute list '<em>Program Arguments</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask#getProgramArguments()
     * @see #getGradleImportTask()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java

    /**
     * Returns the meta object for class '{@link org.eclipse.buildship.oomph.GradleImportTask
     * <em>Task</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the meta object for class '<em>Task</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask
     * @generated
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.buildship.oomph.GradleImportPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
    /**
     * Creates a new adapter for an object of class
     * '{@link org.eclipse.buildship.oomph.GradleImportTask <em>Task</em>}'. <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases; it's useful to
     * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * 
     * @return the new adapter.
     * @see org.eclipse.buildship.oomph.GradleImportTask
     * @generated
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.buildship.oomph.GradleImportPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.eclipse.buildship.oomph.GradleImportPackage#eNS_URI
     * @see #init()
     * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph` is unnecessary and can be removed
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java

/**
 * This is the item provider adapter for a {@link org.eclipse.buildship.oomph.GradleImportTask}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getSourceLocators <em>Source
 * Locators</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isOverrideWorkspaceSettings
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getSourceLocators <em>Source
 * Locators</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isOverrideWorkspaceSettings
 * <em>Override Workspace Settings</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getDistributionType
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isOverrideWorkspaceSettings
 * <em>Override Workspace Settings</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getDistributionType
 * <em>Distribution Type</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getLocalInstallationDirectory
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getDistributionType
 * <em>Distribution Type</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getLocalInstallationDirectory
 * <em>Local Installation Directory</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getRemoteDistributionLocation
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getLocalInstallationDirectory
 * <em>Local Installation Directory</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getRemoteDistributionLocation
 * <em>Remote Distribution Location</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getSpecificGradleVersion
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getRemoteDistributionLocation
 * <em>Remote Distribution Location</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getSpecificGradleVersion
 * <em>Specific Gradle Version</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getProgramArguments <em>Program
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getSpecificGradleVersion
 * <em>Specific Gradle Version</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getProgramArguments <em>Program
 * Arguments</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getJvmArguments <em>Jvm
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getProgramArguments <em>Program
 * Arguments</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getJvmArguments <em>Jvm
 * Arguments</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getGradleUserHome <em>Gradle
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getJvmArguments <em>Jvm
 * Arguments</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getGradleUserHome <em>Gradle
 * User Home</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getJavaHome <em>Java
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getGradleUserHome <em>Gradle
 * User Home</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getJavaHome <em>Java
 * Home</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isOfflineMode <em>Offline
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#getJavaHome <em>Java
 * Home</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isOfflineMode <em>Offline
 * Mode</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isBuildScans <em>Build
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isOfflineMode <em>Offline
 * Mode</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isBuildScans <em>Build
 * Scans</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isAutomaticProjectSynchronization
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isBuildScans <em>Build
 * Scans</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isAutomaticProjectSynchronization
 * <em>Automatic Project Synchronization</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isShowConsoleView <em>Show
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isAutomaticProjectSynchronization
 * <em>Automatic Project Synchronization</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isShowConsoleView <em>Show
 * Console View</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isShowExecutionsView <em>Show
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.oomph.impl` is unnecessary and can be removed
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isShowConsoleView <em>Show
 * Console View</em>}</li>
 * <li>{@link org.eclipse.buildship.oomph.impl.GradleImportTaskImpl#isShowExecutionsView <em>Show
 * Executions View</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.ui.internal.view` is unnecessary and can be removed
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/Page.java`
#### Snippet
```java
 * class containing sensible defaults.
 *
 * @see org.eclipse.buildship.ui.internal.view.BasePage
 * @see org.eclipse.buildship.ui.internal.view.MultiPageView
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.ui.internal.view` is unnecessary and can be removed
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/Page.java`
#### Snippet
```java
 *
 * @see org.eclipse.buildship.ui.internal.view.BasePage
 * @see org.eclipse.buildship.ui.internal.view.MultiPageView
 */
public interface Page extends IAdaptable {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/nodeselection/NodeSelection.java`
#### Snippet
```java
     * @param expectedType the expected type of the first node
     * @return the first node
     * @throws java.lang.IllegalStateException thrown if the selection is empty
     */
    public <T> T getFirstElement(Class<T> expectedType) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.ui.internal.view.task` is unnecessary and can be removed
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/ProjectNodeAdapter.java`
#### Snippet
```java

/**
 * Adapts a {@link org.eclipse.buildship.ui.internal.view.task.ProjectNode} instance to a {@link IPropertySource} instance.
 */
final class ProjectNodeAdapter implements IPropertySource {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.ui.internal.view.execution` is unnecessary and can be removed
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/RemoveTerminatedExecutionPageAction.java`
#### Snippet
```java

/**
 * Removes the target {@link org.eclipse.buildship.ui.internal.view.execution.ExecutionPage} from the
 * {@link org.eclipse.buildship.ui.internal.view.MultiPageView} to which this page belongs.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.ui.internal.view.execution` is unnecessary and can be removed
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/RerunFailedTestsAction.java`
#### Snippet
```java

/**
 * Reruns the build represented by the target {@link org.eclipse.buildship.ui.internal.view.execution.ExecutionPage}.
 * <p/>
 * Note: we listen for removals of {@code ILaunchConfiguration} instances even though not every {@code ProcessDescription} implementation
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.ui.internal.view.execution` is unnecessary and can be removed
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OperationItem.java`
#### Snippet
```java
 * <p>
 * {@code OperationItem} instances are the nodes added to the trees of the
 * {@link org.eclipse.buildship.ui.internal.view.execution.ExecutionsView}.
 * </p>
 * <pre>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.ui.internal.view.execution` is unnecessary and can be removed
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java
/**
 * Opens the test source files for the given
 * {@link org.eclipse.buildship.ui.internal.view.execution.OperationItem} test nodes. Knows how to handle
 * both Java and Groovy test source files.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.ui.internal.wizard.project` is unnecessary and can be removed
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizardController.java`
#### Snippet
```java

/**
 * Controller class for the {@link org.eclipse.buildship.ui.internal.wizard.project.ProjectImportWizard}. Contains all non-UI related calculations
 * the wizard has to perform.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.ui.internal` is unnecessary and can be removed
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizard.java`
#### Snippet
```java

    /**
     * Creates a new instance and uses the {@link org.eclipse.jface.dialogs.DialogSettings} from {@link org.eclipse.buildship.ui.internal.UiPlugin}..
     */
    @SuppressWarnings("UnusedDeclaration")
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.ui.internal.wizard.project` is unnecessary and can be removed
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/NewGradleProjectWizardPage.java`
#### Snippet
```java

/**
 * Page on the {@link org.eclipse.buildship.ui.internal.wizard.project.ProjectCreationWizard} declaring the project name and project location.
 */
public final class NewGradleProjectWizardPage extends AbstractWizardPage {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.buildship.core` is unnecessary, and can be replaced with an import
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportWizardController.java`
#### Snippet
```java
                    boolean showExecutionsView = internalBuildConfiguration.getWorkspaceConfiguration().isShowExecutionsView();
                    org.eclipse.buildship.core.BuildConfiguration buildConfiguration = ProjectImportWizardController.this.configuration.toBuildConfiguration();
                    org.eclipse.buildship.core.GradleBuild gradleBuild = GradleCore.getWorkspace().createBuild(buildConfiguration);

                    ImportWizardNewProjectHandler workingSetsAddingNewProjectHandler = new ImportWizardNewProjectHandler(newProjectHandler, ProjectImportWizardController.this.configuration, showExecutionsView);
```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/BuildScriptLocationUpdater.java`
#### Snippet
```java
            IPath buildScriptPath;
            File sourceFile = buildScript.getSourceFile();
            if (sourceFile != null) {
                buildScriptPath = new Path(sourceFile.getAbsolutePath());
            } else {
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `BaseToolingApiOperation()` of an abstract class should not be declared 'public'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/BaseToolingApiOperation.java`
#### Snippet
```java
    private String name;

    public BaseToolingApiOperation(String name) {
        this.name = Preconditions.checkNotNull(name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ToolingApiJob()` of an abstract class should not be declared 'public'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiJob.java`
#### Snippet
```java
    private ToolingApiJobResultHandler<T> resultHandler = new DefaultResultHandler<T>();

    public ToolingApiJob(String name) {
        super(name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseProjectChangedEvent()` of an abstract class should not be declared 'public'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/BaseProjectChangedEvent.java`
#### Snippet
```java
    private final IProject project;

    public BaseProjectChangedEvent(IProject project) {
        this.project = Preconditions.checkNotNull(project);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GradleVersionProvider()` of an abstract class should not be declared 'public'
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionProvider.java`
#### Snippet
```java
    private final Supplier<String> versionRangePattern;

    public GradleVersionProvider(Supplier<String> versionRangePattern) {
        this(ReleasedGradleVersions.create(), versionRangePattern);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GradleVersionProvider()` of an abstract class should not be declared 'public'
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionProvider.java`
#### Snippet
```java
    }

    public GradleVersionProvider(ReleasedGradleVersions releasedVersions, Supplier<String> versionRangePattern) {
        this.releasedVersions = releasedVersions;
        this.versionRangePattern = versionRangePattern;
```

### NonProtectedConstructorInAbstractClass
Constructor `GradleVersionParameterization()` of an abstract class should not be declared 'public'
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java
    private final GradleVersionProvider gradleVersionProvider;

    public GradleVersionParameterization(GradleVersionProvider gradleVersionProvider) {
        this.gradleVersionProvider = gradleVersionProvider;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GradleVersionProvider()` of an abstract class should not be declared 'public'
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/GradleVersionProvider.java`
#### Snippet
```java
    }

    public GradleVersionProvider(ReleasedGradleVersions releasedVersions, Supplier<String> versionRangePattern) {
        this.releasedVersions = releasedVersions;
        this.versionRangePattern = versionRangePattern;
```

### NonProtectedConstructorInAbstractClass
Constructor `GradleVersionProvider()` of an abstract class should not be declared 'public'
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/GradleVersionProvider.java`
#### Snippet
```java
    private final Supplier<String> versionRangePattern;

    public GradleVersionProvider(Supplier<String> versionRangePattern) {
        this(ReleasedGradleVersions.create(), versionRangePattern);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GradleVersionParameterization()` of an abstract class should not be declared 'public'
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java
    private final GradleVersionProvider gradleVersionProvider;

    public GradleVersionParameterization(GradleVersionProvider gradleVersionProvider) {
        this.gradleVersionProvider = gradleVersionProvider;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BasicUIJob()` of an abstract class should not be declared 'public'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/BasicUIJob.java`
#### Snippet
```java
     *
     */
    public BasicUIJob(String name, Display display) {
        super(name);
        this.cachedDisplay = display;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseProjectNode()` of an abstract class should not be declared 'public'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/BaseProjectNode.java`
#### Snippet
```java
    private final Optional<IProject> workspaceProject;

    public BaseProjectNode(Optional<IProject> workspaceProject) {
        this.workspaceProject = workspaceProject;
    }
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Validator() can be replaced with method reference
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/gradle/GradleDistributionViewModel.java`
#### Snippet
```java

    public static Validator<GradleDistributionViewModel> validator() {
        return new Validator<GradleDistributionViewModel>() {

            @Override
```

### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectPreviewWizardPage.java`
#### Snippet
```java
            // schedule the loading of the project preview asynchronously, otherwise the UI will not
            // update until the job has finished
            PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

                @Override
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator\>() can be replaced with lambda
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/PreferenceStore.java`
#### Snippet
```java
        @Override
        public Set<Entry<Object, Object>> entrySet() {
            TreeSet<Entry<Object, Object>> set = new TreeSet<>(new Comparator<Entry<Object, Object>>() {

                @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/BasicUIJob.java`
#### Snippet
```java
            return Status.CANCEL_STATUS;
        }
        asyncDisplay.asyncExec(new Runnable() {

            @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/SelectionUtils.java`
#### Snippet
```java
                // select and reveal resource
                final ISetSelectionTarget finalTarget = target;
                window.getShell().getDisplay().asyncExec(new Runnable() {

                    @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/ReloadTaskViewJob.java`
#### Snippet
```java

    private void refreshTaskView(final TaskViewContent content) {
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
                textChanged();
            } else {
                getDisplay().asyncExec(new Runnable() {

                    @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionShowingLaunchRequestListener.java`
#### Snippet
```java
    private void handleLaunchRequest(final ExecuteLaunchRequestEvent event) {
            // call synchronously to make sure we do not miss any progress events
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

                @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ConsoleShowingLaunchListener.java`
#### Snippet
```java
        final Optional<RunConfiguration> attributes = convertToGradleRunConfigurationAttributes(launch);
        if (attributes.isPresent() && attributes.get().isShowConsoleView()) {
            PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

                @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java

        private void openInEditor(final IJavaElement javaElement) {
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

                @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java
            // open the requested class and optionally mark the requested method
            Display display = PlatformUI.getWorkbench().getDisplay();
            display.syncExec(new Runnable() {

                @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportWizardController.java`
#### Snippet
```java

        private void ensureGradleViewsAreVisible() {
            PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

                @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/GradleConsole.java`
#### Snippet
```java

        // set proper colors on output/error streams (needs to happen in the UI thread)
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

            @SuppressWarnings("restriction")
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectPreviewWizardPage.java`
#### Snippet
```java

    private void previewFinished(final BuildEnvironment buildEnvironment, final GradleBuild gradleBuild) {
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

            @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectPreviewWizardPage.java`
#### Snippet
```java
            // schedule the loading of the project preview asynchronously, otherwise the UI will not
            // update until the job has finished
            PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

                @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectPreviewWizardPage.java`
#### Snippet
```java
        Throwable t = status.getException();
        final String stacktrace = t == null ? ProjectWizardMessages.Preview_No_Stacktrace : Throwables.getStackTraceAsString(t);
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

            @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectPreviewWizardPage.java`
#### Snippet
```java

    private void previewCancelled() {
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

            @Override
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `monitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/DefaultGradleBuild.java`
#### Snippet
```java
    public <T> T withConnection(Function<ProjectConnection, ? extends T> action, CancellationTokenSource tokenSource, IProgressMonitor monitor) throws Exception {
        Preconditions.checkNotNull(action);
        monitor = monitor != null ? monitor : new NullProgressMonitor();

        GradleConnectionOperation<T> operation = new GradleConnectionOperation<>(action);
```

### AssignmentToMethodParameter
Assignment to method parameter `monitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/DefaultGradleBuild.java`
#### Snippet
```java
        }

        monitor = monitor != null ? monitor : new NullProgressMonitor();

        SynchronizeOperation operation = new SynchronizeOperation(this, newProjectHandler);
```

### AssignmentToMethodParameter
Assignment to method parameter `workspaceProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SynchronizeGradleBuildOperation.java`
#### Snippet
```java
        configManager.saveProjectConfiguration(projectConfig);

        workspaceProject = ProjectNameUpdater.updateProjectName(workspaceProject, project, this.allProjects, progress.newChild(1));

        CorePlugin.workspaceOperations().addNature(workspaceProject, GradleProjectNature.ID, progress.newChild(1));
```

### AssignmentToMethodParameter
Assignment to method parameter `configurators`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/extension/InternalProjectConfigurator.java`
#### Snippet
```java
        }

        configurators = new ArrayList<>(configurators);
        filterInvalidConfigurators(configurators);
        filterDuplicateIds(configurators);
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java
     */
    public UiBuilder<T> text(String text) {
        text = Strings.nullToEmpty(text);

        T control = control();
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
        int tlen = text.length();
        if (start < 0) {
            start = 0;
        }
        if (end > tlen) {
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
        }
        if (end > tlen) {
            end = tlen;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
        int tlen = text.length();
        if (start < 0) {
            start = 0;
        }
        if (end > tlen) {
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
        }
        if (end > tlen) {
            end = tlen;
        }
        if (end < 0 || start >= end) {
```

### AssignmentToMethodParameter
Assignment to method parameter `plen`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
     */
    protected boolean regExpRegionMatches(String text, int tStart, String p, int pStart, int plen) {
        while (plen-- > 0) {
            char tchar = text.charAt(tStart++);
            char pchar = p.charAt(pStart++);
```

### AssignmentToMethodParameter
Assignment to method parameter `tStart`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
    protected boolean regExpRegionMatches(String text, int tStart, String p, int pStart, int plen) {
        while (plen-- > 0) {
            char tchar = text.charAt(tStart++);
            char pchar = p.charAt(pStart++);

```

### AssignmentToMethodParameter
Assignment to method parameter `pStart`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
        while (plen-- > 0) {
            char tchar = text.charAt(tStart++);
            char pchar = p.charAt(pStart++);

            /* process wild cards */
```

### AssignmentToMethodParameter
Assignment to method parameter `descriptor`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPage.java`
#### Snippet
```java
    private OperationDescriptor findFirstNonExcludedParent(OperationDescriptor descriptor) {
        while (isExcluded(descriptor.getParent())) {
            descriptor = descriptor.getParent();
        }
        return descriptor.getParent();
```

### AssignmentToMethodParameter
Assignment to method parameter `item`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPage.java`
#### Snippet
```java
            } else {
                level--;
                item = item.getParent();
            }
        }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseProject.java`
#### Snippet
```java
        try {
            EclipseJavaSourceSettings sourceSettings = getElement().getJavaSourceSettings();
            return sourceSettings == null ? null : new CompatSourceSettings(sourceSettings);
        } catch (Exception e) {
            return getSourceDirectories().isEmpty() ? null : FALLBACK_JAVA_SOURCE_SETTINGS;
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseProject.java`
#### Snippet
```java
            return sourceSettings == null ? null : new CompatSourceSettings(sourceSettings);
        } catch (Exception e) {
            return getSourceDirectories().isEmpty() ? null : FALLBACK_JAVA_SOURCE_SETTINGS;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseExternalDependency.java`
#### Snippet
```java
            return getElement().getAttemptedSelector();
        } catch (Exception ignore) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatGradleProject.java`
#### Snippet
```java
            return getElement().getBuildScript();
        } catch (Exception ignore) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatGradleProject.java`
#### Snippet
```java
            return getElement().getProjectDirectory();
        } catch (Exception ignore) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatGradleProject.java`
#### Snippet
```java
            return getElement().getBuildDirectory();
        } catch (Exception ignore) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/StringUtils.java`
#### Snippet
```java
     */
    public static String valueOf(Object value) {
        return value == null ? null : value.toString();
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/variable/ExpressionUtils.java`
#### Snippet
```java
     */
    public static String decode(String expression) throws CoreException {
        return expression != null ? getStringVariableManager().performStringSubstitution(expression) : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/DefaultGradleBuild.java`
#### Snippet
```java
        @Override
        public ISchedulingRule getRule() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/SupportedLaunchConfigType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/marker/ErrorMarkerLocation.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/marker/ErrorMarkerLocation.java`
#### Snippet
```java
    private static Matcher tryFindStackTraceErrorLocation(Throwable t) {
        if (t == null || t.getMessage() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/TestExecutionTarget.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/DefaultExternalLaunchConfigurationManager.java`
#### Snippet
```java
            return JavaRuntime.getJavaProject(configuration);
        } catch (CoreException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleFolderUpdater.java`
#### Snippet
```java
            }
            // TODO (donat) if an external build folder is not added as a linked resource than we should treat it as absent and not use the default 'build' folder
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WtpConfigurator.java`
#### Snippet
```java
                    if (deploymentPath != null && !deploymentPath.equals(attribute.getValue())) {
                        context.error("WTP currently does not support mixed deployment paths.", null);
                        return null;
                    }
                    deploymentPath = attribute.getValue();
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WtpConfigurator.java`
#### Snippet
```java
        IPath path = project.getLocation();
        if (path == null) {
            return null;
        }
        return this.locationToProject.get(path.toFile());
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultWorkspaceOperations.java`
#### Snippet
```java
     */
    private IPath normalizeProjectLocation(File location) {
        return isDirectChildOfWorkspaceRootFolder(location) ? null : Path.fromOSString(location.getPath());
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultGradleWorkspace.java`
#### Snippet
```java
    private static BuildConfiguration toBuildConfigurationOrNull(IProject project) {
        ProjectConfiguration projectConfiguration = CorePlugin.configurationManager().tryLoadProjectConfiguration(project);
        return projectConfiguration != null ? projectConfiguration.getBuildConfiguration() : null;
    }
}
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerRuntimeClasspathEntryResolver.java`
#### Snippet
```java
    @Override
    public IVMInstall resolveVMInstall(IClasspathEntry entry) throws CoreException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/BaseConfigurator.java`
#### Snippet
```java
        IPath path = project.getLocation();
        if (path == null) {
            return null;
        }
        return this.locationToProject.get(path.toFile());
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultGradleProjectBuilder.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/preferences/ClasspathConverter.java`
#### Snippet
```java
        } catch (Exception e) {
            CorePlugin.logger().error(String.format("Could not read persisted classpath for project %s.", this.javaProject.getProject().getName()), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultConfigurationManager.java`
#### Snippet
```java
        } catch(RuntimeException e) {
            CorePlugin.logger().trace(CoreTraceScopes.PREFERENCES, "Cannot load configuration for project " + project.getName(), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/GradleArguments.java`
#### Snippet
```java
            return gradleEnvironment.getGradleUserHome();
        } catch (Exception ignore) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
                return SPECIFIC_GRADLE_VERSION;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     */
    public String convertDistributionTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     */
    public T caseSetupTask(SetupTask object) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     */
    public T caseModelElement(ModelElement object) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     */
    public T caseGradleImportTask(GradleImportTask object) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     */
    public Adapter createGradleImportTaskAdapter() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     */
    public Adapter createModelElementAdapter() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     */
    public Adapter createSetupTaskAdapter() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
                newChildDescriptors.add(createChildParameter(SetupPackage.Literals.SETUP_TASK_CONTAINER__SETUP_TASKS, GradleImportFactory.eINSTANCE.createGradleImportTask()));

                return null;
            }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
                newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, GradleImportFactory.eINSTANCE.createGradleImportTask()));

                return null;
            }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
    private String getTextFromLabelProvider(IBaseLabelProvider baseLabelProvider, Object element) {
        if (baseLabelProvider == null) {
            return null;
        }
        String labelText = null;
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java
    public File getGradleUserHome() {
        String gradleUserHomeString = this.gradleUserHomeText.getText();
        return gradleUserHomeString.isEmpty() ? null : new File(gradleUserHomeString);
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java
    public File getJavaHome() {
        String javaHomeString = this.javaHomeText.getText();
        return javaHomeString.isEmpty() ? null : new File(javaHomeString);
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
        }
        if (end < 0 || start >= end) {
            return null;
        }
        if (this.fLength == 0) {
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
            int x = posIn(text, start, end);
            if (x < 0) {
                return null;
            }
            return new Position(x, x + this.fLength);
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
            int nextMatch = regExpPosIn(text, curPos, end, current);
            if (nextMatch < 0) {
                return null;
            }
            if (i == 0) {
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
        }
        if (i < segCount) {
            return null;
        }
        return new Position(matchStart, curPos);
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/SwitchToNextPageAction.java`
#### Snippet
```java
    @Override
    public Menu getMenu(Menu parent) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/nodeselection/NodeSelection.java`
#### Snippet
```java
    @Override
    public Object getFirstElement() {
        return isEmpty() ? null : this.nodes.get(0);
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/OpenRunConfigurationHandler.java`
#### Snippet
```java
        DebugUITools.openLaunchConfigurationPropertiesDialog(shell, launchConfiguration, UiPluginConstants.RUN_LAUNCH_GROUP_ID);

        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/MultiPageView.java`
#### Snippet
```java

    public Page getCurrentPage() {
        return this.currentPage != this.defaultPage ? this.currentPage : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/RefreshViewHandler.java`
#### Snippet
```java

        // todo (etst) disable the Refresh button while the model updates are in progress
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/RunTasksHandler.java`
#### Snippet
```java
        DebugUITools.launch(launchConfiguration, ILaunchManager.RUN_MODE);

        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskViewContentProvider.java`
#### Snippet
```java
            return ((TaskGroupNode) element).getProjectNode();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/WorkbenchSelectionListener.java`
#### Snippet
```java
                    return ((IResource) input).getProject();
                } else {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
     */
    protected String getFilterString() {
        return this.filterText != null ? this.filterText.getText() : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java

        if (filterText == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/OpenBuildScriptHandler.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/ProjectNodeAdapterFactory.java`
#### Snippet
```java
            return createProjectNodeAdapter((ProjectNode) adaptableObject);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/TaskNodeAdapterFactory.java`
#### Snippet
```java
            return createTaskNodeAdapter((TaskNode) adaptableObject);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageContentProvider.java`
#### Snippet
```java
    @Override
    public Object getParent(Object element) {
        return element instanceof OperationItem ? ((OperationItem)element).getParent() : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageNameLabelProvider.java`
#### Snippet
```java
    @Override
    public Image getImage(Object element) {
        return element instanceof OperationItem ? calculateImage((OperationItem) element) : null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageNameLabelProvider.java`
#### Snippet
```java
            return styledLabel;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageNameLabelProvider.java`
#### Snippet
```java
                return PluginImages.OPERATION_SUCCESS.withState(PluginImage.ImageState.ENABLED).getImage();
            } else {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleTextViewerConfiguration.java`
#### Snippet
```java
    @Override
    public IReconciler getReconciler(ISourceViewer sourceViewer) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java
            IStatus status = org.eclipse.jdt.internal.corext.util.JavaConventionsUtil.validateMethodName(methodName, type);
            if (!status.isOK()) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java
                    }
                }
                return null;
            } catch (JavaModelException e) {
                // ignore and treat as no method being found
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java
            } catch (JavaModelException e) {
                // ignore and treat as no method being found
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java
                } catch (Exception e) {
                    // ignore and treat as no method being found
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OpenTestSourceFileJob.java`
#### Snippet
```java
            } catch (Exception e) {
                // ignore and treat as no method being found
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/WorkingSetConfigurationWidget.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/GradleConsolePageParticipant.java`
#### Snippet
```java
    @Override
    public Object getAdapter(Class adapter) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/UrlPatternMatchListener.java`
#### Snippet
```java
    @Override
    public String getLineQualifier() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/BuildScanPatternMatchListener.java`
#### Snippet
```java
    @Override
    public String getLineQualifier() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/workspace/RefreshProjectHandler.java`
#### Snippet
```java
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ProjectSynchronizer.execute(event);
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/workspace/AddBuildshipNatureHandler.java`
#### Snippet
```java
            synchronize(buildConfigs);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectPreviewWizardPage.java`
#### Snippet
```java
            return gradleEnvironment.getGradleUserHome();
        } catch (Exception ignore) {
            return null;
        }
    }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `relativePath` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleFolderUpdater.java`
#### Snippet
```java
        IPath projectLocation = this.workspaceProject.getLocation();
        if (projectLocation.isPrefixOf(buildDirLocation)) {
            IPath relativePath = RelativePathUtils.getRelativePath(projectLocation, buildDirLocation);
            return relativePath;
        } else {
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultModelProvider.java`
#### Snippet
```java
        }

        T value = getFromCache(cacheKey, operation);

        return value;
```

### UnnecessaryLocalVariable
Local variable `gradleImportTask` is redundant
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
    @Override
    public GradleImportTask createGradleImportTask() {
        GradleImportTaskImpl gradleImportTask = new GradleImportTaskImpl();
        return gradleImportTask;
    }
```

## RuleId[id=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Character.compare'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/GradleVersion.java`
#### Snippet
```java
                return -1;
            }
            if (this.patchNo > other.patchNo) {
                return 1;
            }
```

### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskNodeViewerSorter.java`
#### Snippet
```java
                int leftOrdinal = toOrdinal(left.getType());
                int rightOrdinal = toOrdinal(right.getType());
                return (leftOrdinal < rightOrdinal ? -1 : (leftOrdinal == rightOrdinal ? 0 : 1));
            }

```

### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskNodeViewerSorter.java`
#### Snippet
```java
                int leftOrdinal = toOrdinal(left);
                int rightOrdinal = toOrdinal(right);
                return (leftOrdinal < rightOrdinal ? -1 : (leftOrdinal == rightOrdinal ? 0 : 1));
            }

```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/PreferenceStore.java`
#### Snippet
```java
            });
            for (Iterator<Entry<Object, Object>> i = super.entrySet().iterator(); i.hasNext();) {
                set.add(i.next());
            }
            return set;
```

