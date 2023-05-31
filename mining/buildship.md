# buildship 
 
# Bad smells
I found 1126 bad smells with 64 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 439 | false |
| JavadocReference | 251 | false |
| DuplicatedCode | 68 | false |
| ConstantValue | 61 | false |
| RedundantTypeArguments | 32 | false |
| FieldMayBeFinal | 29 | false |
| UnnecessaryModifier | 25 | true |
| JavadocLinkAsPlainText | 22 | false |
| ProtectedMemberInFinalClass | 21 | true |
| SimplifyOptionalCallChains | 15 | false |
| RegExpSimplifiable | 13 | false |
| DataFlowIssue | 13 | false |
| InnerClassMayBeStatic | 10 | true |
| TrivialIf | 10 | false |
| FieldCanBeLocal | 8 | false |
| RegExpRedundantNestedCharacterClass | 7 | false |
| UnusedAssignment | 7 | false |
| RedundantCast | 7 | false |
| IgnoreResultOfCall | 6 | false |
| RegExpRedundantEscape | 5 | false |
| FinalStaticMethod | 5 | false |
| UnnecessarySemicolon | 5 | false |
| SwitchStatementWithTooFewBranches | 5 | false |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| FinalMethodInFinalClass | 4 | false |
| Deprecation | 4 | false |
| UNCHECKED_WARNING | 4 | false |
| ArraysAsListWithZeroOrOneArgument | 4 | false |
| EqualsBetweenInconvertibleTypes | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| SimplifiableConditionalExpression | 2 | false |
| NullableProblems | 2 | false |
| ThrowFromFinallyBlock | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| CatchMayIgnoreException | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| UnnecessaryUnicodeEscape | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| StaticInitializerReferencesSubClass | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| FinalPrivateMethod | 1 | false |
| UnnecessaryReturn | 1 | true |
| BooleanConstructor | 1 | false |
| RedundantMethodOverride | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| DuplicateThrows | 1 | false |
| FuseStreamOperations | 1 | false |
| PointlessNullCheck | 1 | false |
| InfiniteRecursion | 1 | false |
| OptionalIsPresent | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| DanglingJavadoc | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[id=RegExpRedundantEscape]
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
Redundant character escape `\-` in RegExp
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String PUNYCODE_TLD = "xn\\-\\-[\\w\\-]{0,58}\\w";

    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/GradleProjectSettingsComposite.java`
#### Snippet
```java
    }

    public static final GradleProjectSettingsCompositeBuilder builder(Composite parent) {
        return new GradleProjectSettingsCompositeBuilder(parent);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/gradle/GradleProgressAttributes.java`
#### Snippet
```java
    }

    public static final GradleProgressAttributesBuilder builder(CancellationTokenSource tokenSource, IProgressMonitor monitor) {
        return new GradleProgressAttributesBuilder(tokenSource, monitor);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SynchronizationProblem.java`
#### Snippet
```java
    }

    public static final SynchronizationProblem newError(String pluginId, IResource resource, String message, Exception exception) {
        return new SynchronizationProblem(pluginId, resource, message, exception, IStatus.ERROR);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SynchronizationProblem.java`
#### Snippet
```java
    }

    public static final SynchronizationProblem newWarning(String pluginId, IResource resource, String message, Exception exception) {
        return new SynchronizationProblem(pluginId, resource, message, exception, IStatus.WARNING);
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
     * Valid characters for IRI TLD defined in RFC 3987.
     */
    private static final String TLD_CHAR = "a-zA-Z" + UCS_CHAR;

    /**
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

### RegExpSimplifiable
`[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]]` can be simplified to ' -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽\&\&\[\^ \[ - \]   　\]'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String PUNYCODE_TLD = "xn\\-\\-[\\w\\-]{0,58}\\w";

    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;
```

## RuleId[id=Deprecation]
### Deprecation
'Boolean(boolean)' is deprecated
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
            try {
                testText = new Text(composite, SWT.SEARCH | SWT.ICON_CANCEL);
                useNativeSearchField = new Boolean((testText.getStyle() & SWT.ICON_CANCEL) != 0);
            } finally {
                if (testText != null) {
```

### Deprecation
'newInstance()' is deprecated
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/IdeFriendlyClassLoading.java`
#### Snippet
```java
        try {
            if (Platform.inDevelopmentMode()) {
                return (T) loadClassWithIdeFriendlyClassLoader(cls.getName()).newInstance();
            } else {
                return cls.newInstance();
```

### Deprecation
'newInstance()' is deprecated
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/IdeFriendlyClassLoading.java`
#### Snippet
```java
                return (T) loadClassWithIdeFriendlyClassLoader(cls.getName()).newInstance();
            } else {
                return cls.newInstance();
            }
        } catch (Exception e) {
```

### Deprecation
'newInstance()' is deprecated
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/preference/EclipsePreferencesUtils.java`
#### Snippet
```java
        } catch (Exception e1) {
            try {
                return InstanceScope.class.newInstance();
            } catch (Exception e2) {
                throw new GradlePluginsRuntimeException(e2);
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

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`element instanceof OperationItem ? !((OperationItem)element).getChildren().isEmpty() : false` can be simplified to 'element instanceof OperationItem \&\& !((OperationItem)element).getChildren().isEmpty()'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPageContentProvider.java`
#### Snippet
```java
    @Override
    public boolean hasChildren(Object element) {
        return element instanceof OperationItem ? !((OperationItem)element).getChildren().isEmpty() : false;
    }

```

### SimplifiableConditionalExpression
`finishEvent != null ? finishEvent.getResult() instanceof FailureResult : false` can be simplified to 'finishEvent != null \&\& finishEvent.getResult() instanceof FailureResult'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPage.java`
#### Snippet
```java
    private boolean isFailedOperation(OperationItem item) {
        FinishEvent finishEvent = item.getFinishEvent();
        return finishEvent != null ? finishEvent.getResult() instanceof FailureResult : false;
    }

```

## RuleId[id=FinalStaticMethod]
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

## RuleId[id=RegExpRedundantNestedCharacterClass]
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

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String PUNYCODE_TLD = "xn\\-\\-[\\w\\-]{0,58}\\w";

    private static final String TLD = "(" + PUNYCODE_TLD + "|" + "[" + TLD_CHAR + "]{2,63}" +")";

    private static final String HOST_NAME = "(" + IRI_LABEL + "\\.)+" + TLD;
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizardController.java`
#### Snippet
```java
        // assemble configuration object that serves as the extra data model of the creation wizard
        Property<String> projectNameProperty = Property.create(Validators.uniqueWorkspaceProjectNameValidator(ProjectWizardMessages.Label_ProjectName));
        Property<Boolean> useDefaultLocationProperty = Property.create(Validators.<Boolean>nullValidator());
        Property<File> customLocationProperty = Property.create(Validators.validateIfConditionFalse(Validators.requiredDirectoryValidator(ProjectWizardMessages.Label_CustomLocation), useDefaultLocationProperty));
        Property<File> targetProjectDirProperty = Property.create(Validators.nonExistentDirectoryValidator(ProjectWizardMessages.Message_TargetProjectDirectory));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
            Validator<File> gradleUserHomeValidator, Validator<File> javaHomeValidator, Validator<Boolean> applyWorkingSetsValidator, Validator<List<String>> workingSetsValidators) {
        this.projectDir = Property.create(projectDirValidator);
        this.overwriteWorkspaceSettings = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.distribution = Property.create(distributionValidator);
        this.gradleUserHome = Property.create(gradleUserHomeValidator);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
            Validator<File> gradleUserHomeValidator, Validator<File> javaHomeValidator, Validator<Boolean> applyWorkingSetsValidator, Validator<List<String>> workingSetsValidators) {
        this.projectDir = Property.create(projectDirValidator);
        this.overwriteWorkspaceSettings = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.distribution = Property.create(distributionValidator);
        this.gradleUserHome = Property.create(gradleUserHomeValidator);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.applyWorkingSets = Property.create(applyWorkingSetsValidator);
        this.workingSets = Property.create(workingSetsValidators);
        this.buildScansEnabled = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.offlineMode = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.autoSync = Property.<Boolean>create(Validators.<Boolean>noOp());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.applyWorkingSets = Property.create(applyWorkingSetsValidator);
        this.workingSets = Property.create(workingSetsValidators);
        this.buildScansEnabled = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.offlineMode = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.autoSync = Property.<Boolean>create(Validators.<Boolean>noOp());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.workingSets = Property.create(workingSetsValidators);
        this.buildScansEnabled = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.offlineMode = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.autoSync = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.arguments = Property.<List<String>>create(Validators.<List<String>>noOp());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.workingSets = Property.create(workingSetsValidators);
        this.buildScansEnabled = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.offlineMode = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.autoSync = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.arguments = Property.<List<String>>create(Validators.<List<String>>noOp());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.buildScansEnabled = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.offlineMode = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.autoSync = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.arguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.jvmArguments = Property.<List<String>>create(Validators.<List<String>>noOp());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.buildScansEnabled = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.offlineMode = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.autoSync = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.arguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.jvmArguments = Property.<List<String>>create(Validators.<List<String>>noOp());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.offlineMode = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.autoSync = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.arguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.jvmArguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.showConsoleView = Property.<Boolean>create(Validators.<Boolean>noOp());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.offlineMode = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.autoSync = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.arguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.jvmArguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.showConsoleView = Property.<Boolean>create(Validators.<Boolean>noOp());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.autoSync = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.arguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.jvmArguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.showConsoleView = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.showExecutionsView = Property.<Boolean>create(Validators.<Boolean>noOp());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.autoSync = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.arguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.jvmArguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.showConsoleView = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.showExecutionsView = Property.<Boolean>create(Validators.<Boolean>noOp());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.arguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.jvmArguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.showConsoleView = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.showExecutionsView = Property.<Boolean>create(Validators.<Boolean>noOp());
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.arguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.jvmArguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.showConsoleView = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.showExecutionsView = Property.<Boolean>create(Validators.<Boolean>noOp());
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.jvmArguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.showConsoleView = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.showExecutionsView = Property.<Boolean>create(Validators.<Boolean>noOp());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java
        this.jvmArguments = Property.<List<String>>create(Validators.<List<String>>noOp());
        this.showConsoleView = Property.<Boolean>create(Validators.<Boolean>noOp());
        this.showExecutionsView = Property.<Boolean>create(Validators.<Boolean>noOp());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public ProjectImportConfiguration() {
        this(Validators.<File>noOp(), Validators.<GradleDistributionViewModel>noOp(), Validators.<File>noOp(), Validators.<File>noOp(), Validators.<Boolean>noOp(), Validators.<List<String>>noOp());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public ProjectImportConfiguration() {
        this(Validators.<File>noOp(), Validators.<GradleDistributionViewModel>noOp(), Validators.<File>noOp(), Validators.<File>noOp(), Validators.<Boolean>noOp(), Validators.<List<String>>noOp());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public ProjectImportConfiguration() {
        this(Validators.<File>noOp(), Validators.<GradleDistributionViewModel>noOp(), Validators.<File>noOp(), Validators.<File>noOp(), Validators.<Boolean>noOp(), Validators.<List<String>>noOp());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public ProjectImportConfiguration() {
        this(Validators.<File>noOp(), Validators.<GradleDistributionViewModel>noOp(), Validators.<File>noOp(), Validators.<File>noOp(), Validators.<Boolean>noOp(), Validators.<List<String>>noOp());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public ProjectImportConfiguration() {
        this(Validators.<File>noOp(), Validators.<GradleDistributionViewModel>noOp(), Validators.<File>noOp(), Validators.<File>noOp(), Validators.<Boolean>noOp(), Validators.<List<String>>noOp());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportConfiguration.java`
#### Snippet
```java

    public ProjectImportConfiguration() {
        this(Validators.<File>noOp(), Validators.<GradleDistributionViewModel>noOp(), Validators.<File>noOp(), Validators.<File>noOp(), Validators.<Boolean>noOp(), Validators.<List<String>>noOp());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseProject.java`
#### Snippet
```java
            result.add(new CompatEclipseSourceDirectory(directory));
        }
        return ModelUtils.<CompatEclipseSourceDirectory> asDomainObjectSet(result);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/DefaultExternalLaunchConfigurationManager.java`
#### Snippet
```java
            plusEntries.put(ORIGINAL_CLASSPATH_PROVIDER_ATTRIBUTE, originalClasspathProvider);
        }
        updateLaunchConfiguration(configuration, plusEntries, Collections.<String> emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/LinkedResourcesUpdater.java`
#### Snippet
```java
    private void removeOutdatedLinkedResources(PersistentModelBuilder persistentModel, SubMonitor progress) throws CoreException {
        PersistentModel previousModel = persistentModel.getPrevious();
        Collection<IPath> linkedPaths = previousModel.isPresent() ? previousModel.getLinkedResources() : Collections.<IPath>emptyList();
        progress.setWorkRemaining(linkedPaths.size());
        for (IPath linkedPath : linkedPaths) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleFolderUpdater.java`
#### Snippet
```java
    private void removePreviousMarkers(Collection<IPath> folderPaths, PersistentModelBuilder persistentModel, SubMonitor progress) throws CoreException {
        PersistentModel previousModel = persistentModel.getPrevious();
        Collection<IPath> previouslyKnownPaths = previousModel.isPresent() ? previousModel.getDerivedResources() : Collections.<IPath>emptyList();
        progress.setWorkRemaining(previouslyKnownPaths.size());
        for (IPath resourcePath : previouslyKnownPaths) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/BuildCommandUpdater.java`
#### Snippet
```java
            commands.add(toCommand(buildCommand.getName(), buildCommand.getArguments(), description));
        }
        commands.add(toCommand(GradleProjectBuilder.ID, Collections.<String, String>emptyMap(), description));
        return commands;
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultGradleWorkspace.java`
#### Snippet
```java
            if (projectConfiguration != null) {
                BuildConfiguration buildConfiguration = projectConfiguration.getBuildConfiguration();
                return Optional.<GradleBuild> of(getGradleBuild(buildConfiguration));
            }
        }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultConfigurationManager.java`
#### Snippet
```java
        Preconditions.checkArgument(configuration instanceof DefaultBuildConfiguration, "Unknow configuration type: ", configuration.getClass());
        ProjectConfiguration projectConfiguration = new DefaultProjectConfiguration(configuration.getRootProjectDirectory(), configuration);
        RunConfigurationProperties runConfig = new RunConfigurationProperties(Collections.<String>emptyList(),
                GradleDistribution.fromBuild(),
                null,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultConfigurationManager.java`
#### Snippet
```java
                null,
                null,
                Collections.<String>emptyList(),
                Collections.<String>emptyList(),
                false,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultConfigurationManager.java`
#### Snippet
```java
                null,
                Collections.<String>emptyList(),
                Collections.<String>emptyList(),
                false,
                false,
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/ModelUtils.java`
#### Snippet
```java

        @Override
        public Iterator<T> iterator() {
            return this.elements.iterator();
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/extension/InternalProjectConfigurator.java`
#### Snippet
```java

    @Override
    public int compareTo(InternalProjectConfigurator that) {
        if (this.runsBefore(that) || that.runsAfter(this)) {
            return -1;
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTreeMessages.java`
#### Snippet
```java
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/BasicUIJob.java`
#### Snippet
```java
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringMatcher.java`
#### Snippet
```java
 * the accompanying materials are made available under the terms of the Eclipse Public License
 * v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/ModelUtils.java`
#### Snippet
```java
     *
     * This class copied from Gradle Core 4.6 as it is not part of the public API.
     * Source URL: https://github.com/gradle/gradle/blob/v4.6.0/subprojects/tooling-api/src/main/java/org/gradle/tooling/model/internal/ImmutableDomainObjectSet.java
     *
     * @param <T> the type of the contained elements
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
 * Patterns to capture URLs in console outputs.
 *
 * The code was taken from https://github.com/android/platform_frameworks_base/blob/master/core/java/android/util/Patterns.java
 *
 * @author Donat Csikos
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 *
 * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement
 *        variableName='setup.buildship.p2'
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement
 *        variableName='setup.buildship.p2'
 *        repository='https://download.eclipse.org/buildship/updates/latest'
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement
 *        variableName='setup.buildship.p2'
 *        repository='https://download.eclipse.org/buildship/updates/latest'
 *        installableUnits='org.eclipse.buildship.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 *        repository='https://download.eclipse.org/buildship/updates/latest'
 *        installableUnits='org.eclipse.buildship.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement
 *        variableName='setup.buildship.oomph.p2'
 *        repository='https://download.eclipse.org/buildship/updates/latest'
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement
 *        variableName='setup.buildship.oomph.p2'
 *        repository='https://download.eclipse.org/buildship/updates/latest'
 *        installableUnits='org.eclipse.buildship.oomph.feature.group'"
 * @generated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
 * 
 * @see org.eclipse.buildship.oomph.GradleImportFactory
 * @model kind="package" annotation="http://www.eclipse.org/emf/2002/Ecore
 *        schemaLocation='https://raw.githubusercontent.com/eclipse/buildship/master/org.eclipse.buildship.oomph/model/GradleImport-1.0.ecore'"
 * @generated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
 * @see org.eclipse.buildship.oomph.GradleImportFactory
 * @model kind="package" annotation="http://www.eclipse.org/emf/2002/Ecore
 *        schemaLocation='https://raw.githubusercontent.com/eclipse/buildship/master/org.eclipse.buildship.oomph/model/GradleImport-1.0.ecore'"
 * @generated
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/Combinations.java`
#### Snippet
```java
 * Calculates all the combinations of the elements from different lists.
 * <p/>
 * Inspired by http://www.megustaulises.com/2012/12/cross-product-using-recursion.html
 *
 * @author Etienne Studer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java
 * '=nnn', 'current', '!current', or a space-separated list of these patterns.
 * <p/>
 * See https://code.google.com/p/spock/wiki/Parameterizations
 *
 * @author Etienne Studer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/Combinations.java`
#### Snippet
```java
 * Calculates all the combinations of the elements from different lists.
 * <p/>
 * Inspired by http://www.megustaulises.com/2012/12/cross-product-using-recursion.html
 *
 * @author Etienne Studer
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java
 * '=nnn', 'current', '!current', or a space-separated list of these patterns.
 * <p/>
 * See https://code.google.com/p/spock/wiki/Parameterizations
 *
 * @author Etienne Studer
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java
public final class AdvancedOptionsGroup extends Group {

    private final UiBuilder.UiBuilderFactory builderFactory;

    private Text gradleUserHomeText;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskView.java`
#### Snippet
```java
    private PageBook pages;
    private Link emptyInputPage;
    private Label errorInputPage;
    private Composite nonEmptyInputPage;
    private TreeViewer treeViewer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/UiContributionManager.java`
#### Snippet
```java

    private final TaskView taskView;
    private final ImmutableList<SelectionSpecificAction> toolBarActions;
    private final ImmutableList<SelectionSpecificAction> contextMenuActions;
    private final ImmutableList<SelectionSpecificAction> contextMenuActionsPrecededBySeparator;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/FailureDialog.java`
#### Snippet
```java
    private static final class FailureItem {

        private final FinishEvent event;
        private final Optional<Failure> failure;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/FailureDialog.java`
#### Snippet
```java

        private final FinishEvent event;
        private final Optional<Failure> failure;

        private FailureItem(FinishEvent event, Optional<Failure> failure) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPage.java`
#### Snippet
```java
    private TreeViewerColumn nameColumn;
    private TreeViewerColumn durationColumn;
    private ExecutionProgressListener progressListener;

    private OpenBuildScanAction openBuildScanAction;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizard.java`
#### Snippet
```java
    // the controllers that contain the wizard logic
    private final ProjectImportWizardController importController;
    private final ProjectCreationWizardController creationController;
    private final IPageChangedListener pageChangeListener;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerUpdater.java`
#### Snippet
```java
    private final IJavaProject eclipseProject;
    private final EclipseProject gradleProject;
    private final Map<File, EclipseProject> projectDirToProject;
    private final ProjectContext projectContext;

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `UiBuilder.control()` is ignored
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/GradleProjectWizardPage.java`
#### Snippet
```java

        // project directory label
        uiBuilderFactory.newLabel(projectDirectoryComposite).alignLeft().text(ProjectWizardMessages.Label_ProjectRootDirectory).control();

        // project directory text field
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
    private boolean selectionIsLaunchableAsTest(Collection<?> elements) {
        JavaElementSelection selection = SelectionJavaElementResolver.from(elements);
        return !TestExecutionTarget.from(selection, "run").validate().isPresent();

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
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectPreviewWizardPage.java`
#### Snippet
```java

        Optional<Type> typeOrNull = distribution.getType();
        if (!typeOrNull.isPresent()) {
            target.setText(defaultMessage);
        } else {
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

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'isSubProject()' call
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/navigator/SubProjectViewerFilter.java`
#### Snippet
```java
    public boolean select(Viewer viewer, Object parentElement, Object element) {
        IResource resource = (IResource) Platform.getAdapterManager().getAdapter(element, IResource.class);
        return resource == null || !isSubProject(resource);
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

## RuleId[id=OptionalGetWithoutIsPresent]
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

## RuleId[id=ConstantValue]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.Map'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskViewContent.java`
#### Snippet
```java

    private static List<IProject> collectFaultyWorkspaceProjects(Map<String, IProject> workspaceProjects, List<BuildNode> builds) {
        Map<String, IProject> result = new LinkedHashMap<>(workspaceProjects);
        for (EclipseProject p : collectAllEclipseProjects(builds)) {
            result.remove(p.getName());
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashMap(Map)' as a member of raw type 'java.util.LinkedHashMap'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskViewContent.java`
#### Snippet
```java

    private static List<IProject> collectFaultyWorkspaceProjects(Map<String, IProject> workspaceProjects, List<BuildNode> builds) {
        Map<String, IProject> result = new LinkedHashMap<>(workspaceProjects);
        for (EclipseProject p : collectAllEclipseProjects(builds)) {
            result.remove(p.getName());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskViewContent.java`
#### Snippet
```java
            result.remove(p.getName());
        }
        return new ArrayList<>(result.values());
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskViewContent.java`
#### Snippet
```java
            result.remove(p.getName());
        }
        return new ArrayList<>(result.values());
    }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `JFaceResources`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/font/FontUtils.java`
#### Snippet
```java

    /**
     * Provides a new font derived from {@link JFaceResources#getDialogFont()}, amended with the
     * selected modifiers.
     * <p>
```

### JavadocReference
Cannot resolve symbol `getDialogFont()`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/font/FontUtils.java`
#### Snippet
```java

    /**
     * Provides a new font derived from {@link JFaceResources#getDialogFont()}, amended with the
     * selected modifiers.
     * <p>
```

### JavadocReference
Cannot resolve symbol `org.eclipse.swt.SWT`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/font/FontUtils.java`
#### Snippet
```java
     * selected modifiers.
     * <p>
     * The combination of the following style bits can be used: {@link org.eclipse.swt.SWT#NORMAL}, {@link org.eclipse.swt.SWT#BOLD}
     * and {@link org.eclipse.swt.SWT#ITALIC}.
     *
```

### JavadocReference
Cannot resolve symbol `NORMAL`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/font/FontUtils.java`
#### Snippet
```java
     * selected modifiers.
     * <p>
     * The combination of the following style bits can be used: {@link org.eclipse.swt.SWT#NORMAL}, {@link org.eclipse.swt.SWT#BOLD}
     * and {@link org.eclipse.swt.SWT#ITALIC}.
     *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.swt.SWT`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/font/FontUtils.java`
#### Snippet
```java
     * selected modifiers.
     * <p>
     * The combination of the following style bits can be used: {@link org.eclipse.swt.SWT#NORMAL}, {@link org.eclipse.swt.SWT#BOLD}
     * and {@link org.eclipse.swt.SWT#ITALIC}.
     *
```

### JavadocReference
Cannot resolve symbol `BOLD`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/font/FontUtils.java`
#### Snippet
```java
     * selected modifiers.
     * <p>
     * The combination of the following style bits can be used: {@link org.eclipse.swt.SWT#NORMAL}, {@link org.eclipse.swt.SWT#BOLD}
     * and {@link org.eclipse.swt.SWT#ITALIC}.
     *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.swt.SWT`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/font/FontUtils.java`
#### Snippet
```java
     * <p>
     * The combination of the following style bits can be used: {@link org.eclipse.swt.SWT#NORMAL}, {@link org.eclipse.swt.SWT#BOLD}
     * and {@link org.eclipse.swt.SWT#ITALIC}.
     *
     * @param style the requested font style
```

### JavadocReference
Cannot resolve symbol `ITALIC`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/font/FontUtils.java`
#### Snippet
```java
     * <p>
     * The combination of the following style bits can be used: {@link org.eclipse.swt.SWT#NORMAL}, {@link org.eclipse.swt.SWT#BOLD}
     * and {@link org.eclipse.swt.SWT#ITALIC}.
     *
     * @param style the requested font style
```

### JavadocReference
Cannot resolve symbol `Action`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/action/CommandBackedAction.java`
#### Snippet
```java

/**
 * Base class for {@link Action} instances that invoke a {@link org.eclipse.core.commands.Command}
 * instance via its command id when the action is triggered.
 */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.core.commands.Command`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/action/CommandBackedAction.java`
#### Snippet
```java

/**
 * Base class for {@link Action} instances that invoke a {@link org.eclipse.core.commands.Command}
 * instance via its command id when the action is triggered.
 */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.swt.events.SelectionListener`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/file/DirectoryDialogSelectionListener.java`
#### Snippet
```java

/**
 * A {@link org.eclipse.swt.events.SelectionListener} implementation which opens a
 * {@link DirectoryDialog} and puts the path of the selected {@code File} into a target widget.
 */
```

### JavadocReference
Cannot resolve symbol `DirectoryDialog`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/file/DirectoryDialogSelectionListener.java`
#### Snippet
```java
/**
 * A {@link org.eclipse.swt.events.SelectionListener} implementation which opens a
 * {@link DirectoryDialog} and puts the path of the selected {@code File} into a target widget.
 */
public final class DirectoryDialogSelectionListener extends SelectionAdapter {
```

### JavadocReference
Cannot resolve symbol `GridLayout`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/layout/LayoutUtils.java`
#### Snippet
```java

    /**
     * Creates a new {@link GridLayout} with the given number of columns.
     *
     * @param numOfColumns the number of columns
```

### JavadocReference
Cannot resolve symbol `ImageRegistry`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/PluginImages.java`
#### Snippet
```java

/**
 * Enumerates all the images used in this plugin. Uses the {@link ImageRegistry} provided by the
 * {@link UiPlugin} for storage and access.
 */
```

### JavadocReference
Cannot resolve symbol `BaseGradleDistribution`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/gradle/GradleDistributionViewModel.java`
#### Snippet
```java

/**
 * Describes a valid or invalid {@link BaseGradleDistribution}.
 *
 * @author Donat Csikos
```

### JavadocReference
Cannot resolve symbol `org.eclipse.swt.layout.GridLayout`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java
 * Creates SWT widgets and aligns them through a fluent API.
 *
 * All created controls are assumed to be part of a {@link org.eclipse.swt.layout.GridLayout}.
 *
 * @param <T> the type of the control to build
```

### JavadocReference
Cannot resolve symbol `Text`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new {@link Text} control.
         *
         * @param parent the parent control
```

### JavadocReference
Cannot resolve symbol `Tree`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new {@link Tree} control.
         *
         * @param parent The parent control of the result tree.
```

### JavadocReference
Cannot resolve symbol `org.eclipse.swt.layout.GridLayout`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java
         * a certain minimum row height.
         *
         * @param parent the control having the {@link org.eclipse.swt.layout.GridLayout} having the next column to be empty
         */
        public void span(Composite parent) {
```

### JavadocReference
Cannot resolve symbol `Combo`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new {@link Combo} control.
         *
         * @param parent the parent control
```

### JavadocReference
Cannot resolve symbol `Button`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new {@link Button} control.
         *
         * @param parent the parent control
```

### JavadocReference
Cannot resolve symbol `Label`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new {@link Label} control.
         *
         * @param parent the parent control
```

### JavadocReference
Cannot resolve symbol `Button`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new checkbox which is a {@link Button} control with the {@link SWT#CHECK}
         * style bit specified.
         *
```

### JavadocReference
Cannot resolve symbol `SWT`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new checkbox which is a {@link Button} control with the {@link SWT#CHECK}
         * style bit specified.
         *
```

### JavadocReference
Cannot resolve symbol `CHECK`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new checkbox which is a {@link Button} control with the {@link SWT#CHECK}
         * style bit specified.
         *
```

### JavadocReference
Cannot resolve symbol `Group`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new {@link Group} control.
         *
         * @param parent The parent control of the result group.
```

### JavadocReference
Cannot resolve symbol `Button`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new radio button which is a {@link Button} control with the {@link SWT#RADIO}
         * style bit specified.
         *
```

### JavadocReference
Cannot resolve symbol `SWT`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new radio button which is a {@link Button} control with the {@link SWT#RADIO}
         * style bit specified.
         *
```

### JavadocReference
Cannot resolve symbol `RADIO`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/UiBuilder.java`
#### Snippet
```java

        /**
         * Creates a new radio button which is a {@link Button} control with the {@link SWT#RADIO}
         * style bit specified.
         *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.core.runtime.jobs.Job`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/BasicUIJob.java`
#### Snippet
```java

    /**
     * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor) Note:
     *      this message is marked final. Implementors should use runInUIThread() instead.
     */
```

### JavadocReference
Cannot resolve symbol `run(org.eclipse.core.runtime.IProgressMonitor)`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/BasicUIJob.java`
#### Snippet
```java

    /**
     * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor) Note:
     *      this message is marked final. Implementors should use runInUIThread() instead.
     */
```

### JavadocReference
Symbol `org.eclipse.core.runtime.IProgressMonitor` is inaccessible from here
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/BasicUIJob.java`
#### Snippet
```java

    /**
     * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor) Note:
     *      this message is marked final. Implementors should use runInUIThread() instead.
     */
```

### JavadocReference
Cannot resolve symbol `Predicate`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/predicate/Predicates.java`
#### Snippet
```java

/**
 * Supplies some useful {@link Predicate} instances. May also be used used in PropertyTesters.
 */
@SuppressWarnings("restriction")
```

### JavadocReference
Cannot resolve symbol `IWorkbenchPartReference`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/ContextActivatingViewPartListener.java`
#### Snippet
```java
/**
 * Dynamically activates the context with the specified id whenever the currently active
 * {@link IWorkbenchPartReference} belongs to the specified {@link IViewPart}.
 */
public final class ContextActivatingViewPartListener implements IPartListener2 {
```

### JavadocReference
Cannot resolve symbol `IViewPart`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/ContextActivatingViewPartListener.java`
#### Snippet
```java
/**
 * Dynamically activates the context with the specified id whenever the currently active
 * {@link IWorkbenchPartReference} belongs to the specified {@link IViewPart}.
 */
public final class ContextActivatingViewPartListener implements IPartListener2 {
```

### JavadocReference
Cannot resolve symbol `IAction`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/nodeselection/SelectionSpecificAction.java`
#### Snippet
```java

/**
 * Describes an {@link IAction} instance that knows when it can be <i>shown</i> and when it can be
 * <i>enabled</i> for a given selection state.
 */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.IWorkbenchPage`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkbenchUtils.java`
#### Snippet
```java
     * @param viewId the id of the view
     * @param secondaryId the secondary id of the view, or {@code null] for no secondary id
     * @param mode the activation mode, must be {@link org.eclipse.ui.IWorkbenchPage#VIEW_ACTIVATE},
     *            {@link org.eclipse.ui.IWorkbenchPage#VIEW_VISIBLE} or
     *            {@link org.eclipse.ui.IWorkbenchPage#VIEW_CREATE}
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.IWorkbenchPage`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkbenchUtils.java`
#### Snippet
```java
     * @param secondaryId the secondary id of the view, or {@code null] for no secondary id
     * @param mode the activation mode, must be {@link org.eclipse.ui.IWorkbenchPage#VIEW_ACTIVATE},
     *            {@link org.eclipse.ui.IWorkbenchPage#VIEW_VISIBLE} or
     *            {@link org.eclipse.ui.IWorkbenchPage#VIEW_CREATE}
     * @param <T> the expected type of the view
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.IWorkbenchPage`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkbenchUtils.java`
#### Snippet
```java
     * @param mode the activation mode, must be {@link org.eclipse.ui.IWorkbenchPage#VIEW_ACTIVATE},
     *            {@link org.eclipse.ui.IWorkbenchPage#VIEW_VISIBLE} or
     *            {@link org.eclipse.ui.IWorkbenchPage#VIEW_CREATE}
     * @param <T> the expected type of the view
     * @return the shown view, never null
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.IWorkingSet`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkingSetUtils.java`
#### Snippet
```java

    /**
     * Returns the names of the selected {@link org.eclipse.ui.IWorkingSet} instancesor an empty
     * List, if the selection does not contain any {@link org.eclipse.ui.IWorkingSet}.
     *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.IWorkingSet`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkingSetUtils.java`
#### Snippet
```java
    /**
     * Returns the names of the selected {@link org.eclipse.ui.IWorkingSet} instancesor an empty
     * List, if the selection does not contain any {@link org.eclipse.ui.IWorkingSet}.
     *
     * @param selection the selection
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.IWorkingSet`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkingSetUtils.java`
#### Snippet
```java

    /**
     * Converts the given working set names to {@link org.eclipse.ui.IWorkingSet} instances. Filters
     * out working sets that cannot be found by the {@link IWorkingSetManager}.
     *
```

### JavadocReference
Cannot resolve symbol `IWorkingSetManager`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkingSetUtils.java`
#### Snippet
```java
    /**
     * Converts the given working set names to {@link org.eclipse.ui.IWorkingSet} instances. Filters
     * out working sets that cannot be found by the {@link IWorkingSetManager}.
     *
     * @param workingSetNames the names of the working sets
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.IWorkingSet`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkingSetUtils.java`
#### Snippet
```java
     *
     * @param workingSetNames the names of the working sets
     * @return the {@link org.eclipse.ui.IWorkingSet} instances
     */
    public static IWorkingSet[] toWorkingSets(List<String> workingSetNames) {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.IWorkingSet`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkingSetUtils.java`
#### Snippet
```java

    /**
     * Returns the selected {@link org.eclipse.ui.IWorkingSet} instances or an empty List, if the
     * selection does not contain any {@link org.eclipse.ui.IWorkingSet}.
     *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.IWorkingSet`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkingSetUtils.java`
#### Snippet
```java
    /**
     * Returns the selected {@link org.eclipse.ui.IWorkingSet} instances or an empty List, if the
     * selection does not contain any {@link org.eclipse.ui.IWorkingSet}.
     *
     * @param selection the selection
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.IWorkingSet`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/workbench/WorkingSetUtils.java`
#### Snippet
```java

    /**
     * Converts the given working {@link org.eclipse.ui.IWorkingSet} instances to working set names.
     *
     * @param workingSets the working sets
```

### JavadocReference
Cannot resolve symbol `TreeViewer`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/nodeselection/SelectionHistoryManager.java`
#### Snippet
```java
/**
 * Stores the sequence in which the currently selected nodes were selected in
 * the {@link TreeViewer} and acts as {@link ISelectionProvider}, which can be
 * added to an {@link org.eclipse.ui.IViewSite}.
 *
```

### JavadocReference
Cannot resolve symbol `ISelectionProvider`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/nodeselection/SelectionHistoryManager.java`
#### Snippet
```java
/**
 * Stores the sequence in which the currently selected nodes were selected in
 * the {@link TreeViewer} and acts as {@link ISelectionProvider}, which can be
 * added to an {@link org.eclipse.ui.IViewSite}.
 *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.IViewSite`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/nodeselection/SelectionHistoryManager.java`
#### Snippet
```java
 * Stores the sequence in which the currently selected nodes were selected in
 * the {@link TreeViewer} and acts as {@link ISelectionProvider}, which can be
 * added to an {@link org.eclipse.ui.IViewSite}.
 *
 * @see org.eclipse.buildship.ui.internal.view.task.TaskView
```

### JavadocReference
Cannot resolve symbol `IActionBars`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/PageSite.java`
#### Snippet
```java

/**
 * Page site to modify the page specific {@link IActionBars}.
 */
public interface PageSite {
```

### JavadocReference
Cannot resolve symbol `ISelection`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/nodeselection/NodeSelection.java`
#### Snippet
```java

    /**
     * Creates a new instance reflecting the given {@link ISelection} instance. All selection sub-types other than the {@link IStructuredSelection} sub-type will always have an
     * empty {@link NodeSelection} instance returned.
     *
```

### JavadocReference
Cannot resolve symbol `IStructuredSelection`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/nodeselection/NodeSelection.java`
#### Snippet
```java

    /**
     * Creates a new instance reflecting the given {@link ISelection} instance. All selection sub-types other than the {@link IStructuredSelection} sub-type will always have an
     * empty {@link NodeSelection} instance returned.
     *
```

### JavadocReference
Cannot resolve symbol `IStructuredSelection`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/nodeselection/NodeSelection.java`
#### Snippet
```java

    /**
     * Creates a new instance reflecting the given {@link IStructuredSelection} instance.
     *
     * @param selection the selection from which to create the new instance
```

### JavadocReference
Cannot resolve symbol `org.eclipse.debug.core.ILaunchConfiguration`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/OpenRunConfigurationHandler.java`
#### Snippet
```java
/**
 * Opens a run configuration dialog for the selected Gradle tasks. Either a new
 * {@link org.eclipse.debug.core.ILaunchConfiguration} instance is created or an existing one is
 * reused if it already exists for the selected tasks.
 */
```

### JavadocReference
Cannot resolve symbol `Composite`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
    /**
     * Creates the filter text and adds listeners. This method calls
     * {@link #doCreateFilterText(Composite)} to create the text control. Subclasses should override
     * {@link #doCreateFilterText(Composite)} instead of overriding this method.
     *
```

### JavadocReference
Cannot resolve symbol `Composite`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
     * Creates the filter text and adds listeners. This method calls
     * {@link #doCreateFilterText(Composite)} to create the text control. Subclasses should override
     * {@link #doCreateFilterText(Composite)} instead of overriding this method.
     *
     * @param parent <code>Composite</code> of the filter text
```

### JavadocReference
Cannot resolve symbol `Composite`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
    /**
     * Creates and set up the tree and tree viewer. This method calls
     * {@link #doCreateTreeViewer(Composite, int)} to create the tree viewer. Subclasses should
     * override {@link #doCreateTreeViewer(Composite, int)} instead of overriding this method.
     *
```

### JavadocReference
Cannot resolve symbol `Composite`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
     * Creates and set up the tree and tree viewer. This method calls
     * {@link #doCreateTreeViewer(Composite, int)} to create the tree viewer. Subclasses should
     * override {@link #doCreateTreeViewer(Composite, int)} instead of overriding this method.
     *
     * @param parent parent <code>Composite</code>
```

### JavadocReference
Cannot resolve symbol `ISelectionProvider`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/MultiPageView.java`
#### Snippet
```java
/**
 * Abstract view part that manages multiple {@link Page} elements shown within this view part. If
 * your {@link Page} implementation contains an {@link ISelectionProvider} it should return it as
 * an adapter through the {@link #getAdapter(Class)} method.
 *
```

### JavadocReference
Cannot resolve symbol `getAdapter(Class)`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/MultiPageView.java`
#### Snippet
```java
 * Abstract view part that manages multiple {@link Page} elements shown within this view part. If
 * your {@link Page} implementation contains an {@link ISelectionProvider} it should return it as
 * an adapter through the {@link #getAdapter(Class)} method.
 *
 * @see MessagePage
```

### JavadocReference
Cannot resolve symbol `ILaunchConfiguration`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/RunTasksHandler.java`
#### Snippet
```java
/**
 * Runs the currently selected Gradle tasks. The tasks are run through an
 * {@link ILaunchConfiguration} instance that is either freshly created or reused if it already
 * exists for the selected tasks.
 */
```

### JavadocReference
Cannot resolve symbol `IProject`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/WorkbenchSelectionListener.java`
#### Snippet
```java
 * Links the selection from the workspace to the {@link TaskView}.
 * <p>
 * If an {@link IProject} object is selected anywhere in the UI - like in the project explorer - the
 * corresponding node is selected in the task view.
 */
```

### JavadocReference
Cannot resolve symbol `IProject`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TreeViewerSelectionChangeListener.java`
#### Snippet
```java
 * Links the selection from the {@link TaskView} to the workspace.
 * <p>
 * If a task or project node is selected in the task view, the corresponding {@link IProject} is
 * selected everywhere in the UI.
 */
```

### JavadocReference
Cannot resolve symbol `Tree`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/QuickSearchManager.java`
#### Snippet
```java

/**
 * Custom label control wrapper hooking quick search capability to a {@link Tree}.
 *
 * When instantiated, it adds a key listener to the tree which performs a search amongst the tree
```

### JavadocReference
Cannot resolve symbol `Label`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/QuickSearchManager.java`
#### Snippet
```java
 * keys.
 * <p>
 * The implementation is wrapped around a {@link Label} control that displays the search pattern.
 * <p>
 * If there is nothing entered or the enter/escape key is pressed, the up/down keys regain their
```

### JavadocReference
Cannot resolve symbol `IPropertySource`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/ProjectNodeAdapterFactory.java`
#### Snippet
```java

/**
 * Adapts {@link ProjectNode} instances to {@link IPropertySource} instances.
 * <p/>
 * By adapting to {@link IPropertySource} instances, the Eclipse Properties View can automatically
```

### JavadocReference
Cannot resolve symbol `IPropertySource`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/ProjectNodeAdapterFactory.java`
#### Snippet
```java
 * Adapts {@link ProjectNode} instances to {@link IPropertySource} instances.
 * <p/>
 * By adapting to {@link IPropertySource} instances, the Eclipse Properties View can automatically
 * display the properties of a project node upon selection.
 * <p/>
```

### JavadocReference
Cannot resolve symbol `IPropertySource`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/TaskSelectorNodeAdapter.java`
#### Snippet
```java

/**
 * Adapts a {@link TaskSelectorNode} instance to a {@link IPropertySource} instance.
 */
final class TaskSelectorNodeAdapter implements IPropertySource {
```

### JavadocReference
Cannot resolve symbol `IPropertySource`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/TaskNodeAdapterFactory.java`
#### Snippet
```java

/**
 * Adapts {@link TaskNode} instances to {@link IPropertySource} instances.
 * <p/>
 * By adapting to {@link IPropertySource} instances, the Eclipse Properties View can automatically
```

### JavadocReference
Cannot resolve symbol `IPropertySource`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/TaskNodeAdapterFactory.java`
#### Snippet
```java
 * Adapts {@link TaskNode} instances to {@link IPropertySource} instances.
 * <p/>
 * By adapting to {@link IPropertySource} instances, the Eclipse Properties View can automatically
 * display the properties of a task node upon selection.
 * <p/>
```

### JavadocReference
Cannot resolve symbol `org.eclipse.ui.console.IConsole`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/SwitchToConsoleViewAction.java`
#### Snippet
```java

/**
 * Navigates from the target {@link Page} to the corresponding {@link org.eclipse.ui.console.IConsole} page in the Console View.
 */
public final class SwitchToConsoleViewAction extends Action {
```

### JavadocReference
Cannot resolve symbol `IPropertySource`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/ProjectNodeAdapter.java`
#### Snippet
```java

/**
 * Adapts a {@link org.eclipse.buildship.ui.internal.view.task.ProjectNode} instance to a {@link IPropertySource} instance.
 */
final class ProjectNodeAdapter implements IPropertySource {
```

### JavadocReference
Cannot resolve symbol `IPropertySource`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/adapter/ProjectTaskNodeAdapter.java`
#### Snippet
```java

/**
 * Adapts a {@link ProjectTaskNode} instance to a {@link IPropertySource} instance.
 */
final class ProjectTaskNodeAdapter implements IPropertySource {
```

### JavadocReference
Cannot resolve symbol `TestOperationDescriptor`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/RunTestAction.java`
#### Snippet
```java

/**
 * Action to launch a new Gradle execution specified by {@link TestOperationDescriptor} instances.
 */
public final class RunTestAction extends Action implements SelectionSpecificAction {
```

### JavadocReference
Cannot resolve symbol `ProgressEvent`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionProgressListener.java`
#### Snippet
```java

/**
 * Buffers {@link ProgressEvent}s for asynchronous UI updates in the {@link ExecutionPage}.
 */
public final class ExecutionProgressListener implements org.gradle.tooling.events.ProgressListener {
```

### JavadocReference
Cannot resolve symbol `FailureResult`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ShowFailureAction.java`
#### Snippet
```java

/**
 * Opens a dialog which displays the {@link FailureResult} in a dialog.
 */
public final class ShowFailureAction extends Action implements SelectionSpecificAction {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.buildship.core.GradleRunConfigurationAttributes.GradleRunConfigurationAttributes`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionShowingLaunchRequestListener.java`
#### Snippet
```java
 * {@link EventListener} implementation showing/activating the Executions View when a new Gradle
 * build is executed and the
 * {@link org.eclipse.buildship.core.GradleRunConfigurationAttributes.GradleRunConfigurationAttributes#isShowExecutionView()}
 * setting is enabled.
 * <p/>
```

### JavadocReference
Cannot resolve symbol `isShowExecutionView()`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionShowingLaunchRequestListener.java`
#### Snippet
```java
 * {@link EventListener} implementation showing/activating the Executions View when a new Gradle
 * build is executed and the
 * {@link org.eclipse.buildship.core.GradleRunConfigurationAttributes.GradleRunConfigurationAttributes#isShowExecutionView()}
 * setting is enabled.
 * <p/>
```

### JavadocReference
Cannot resolve symbol `editor`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleTextViewerConfiguration.java`
#### Snippet
```java
    /**
     *
     * @param editor the editor we're creating.
     * @param preferenceStore the preference store.
     */
```

### JavadocReference
Cannot resolve symbol `preferenceStore`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/editor/GradleTextViewerConfiguration.java`
#### Snippet
```java
     *
     * @param editor the editor we're creating.
     * @param preferenceStore the preference store.
     */
    public GradleTextViewerConfiguration() {
```

### JavadocReference
Cannot resolve symbol `Failure`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/FailureDialog.java`
#### Snippet
```java

/**
 * Dialog presenting a list of {@link Failure} instances.
 */
public final class FailureDialog extends Dialog {
```

### JavadocReference
Cannot resolve symbol `ILaunchConfiguration`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/UiGradleLaunchConfigurationManager.java`
#### Snippet
```java
/**
 * Decorates an original {@link GradleLaunchConfigurationManager} such that the
 * {@link #launch(ILaunchConfiguration, String)} method calls
 * {@link DebugUITools#launch(ILaunchConfiguration, String)}.
 */
```

### JavadocReference
Cannot resolve symbol `DebugUITools`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/UiGradleLaunchConfigurationManager.java`
#### Snippet
```java
 * Decorates an original {@link GradleLaunchConfigurationManager} such that the
 * {@link #launch(ILaunchConfiguration, String)} method calls
 * {@link DebugUITools#launch(ILaunchConfiguration, String)}.
 */
public final class UiGradleLaunchConfigurationManager implements GradleLaunchConfigurationManager {
```

### JavadocReference
Cannot resolve symbol `launch(ILaunchConfiguration, String)`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/UiGradleLaunchConfigurationManager.java`
#### Snippet
```java
 * Decorates an original {@link GradleLaunchConfigurationManager} such that the
 * {@link #launch(ILaunchConfiguration, String)} method calls
 * {@link DebugUITools#launch(ILaunchConfiguration, String)}.
 */
public final class UiGradleLaunchConfigurationManager implements GradleLaunchConfigurationManager {
```

### JavadocReference
Cannot resolve symbol `ILaunchConfiguration`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/UiGradleLaunchConfigurationManager.java`
#### Snippet
```java
 * Decorates an original {@link GradleLaunchConfigurationManager} such that the
 * {@link #launch(ILaunchConfiguration, String)} method calls
 * {@link DebugUITools#launch(ILaunchConfiguration, String)}.
 */
public final class UiGradleLaunchConfigurationManager implements GradleLaunchConfigurationManager {
```

### JavadocReference
Cannot resolve symbol `ILaunchListener`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ConsoleShowingLaunchListener.java`
#### Snippet
```java

/**
 * {@link ILaunchListener} implementation showing/activating the Console View when a new Gradle build has launched and the {@link
 * RunConfiguration#isShowConsoleView()} setting is enabled.
 * <p/>
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jface.dialogs.DialogSettings`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizard.java`
#### Snippet
```java

    /**
     * The section name declaration for {@link org.eclipse.jface.dialogs.DialogSettings} where the import wizard stores its
     * preferences.
     *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jface.dialogs.DialogSettings`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizard.java`
#### Snippet
```java
     * preferences.
     *
     * @see org.eclipse.jface.dialogs.DialogSettings#getOrCreateSection(IDialogSettings, String)
     */
    private static final String PROJECT_CREATION_DIALOG_SETTINGS = "org.eclipse.buildship.ui.wizard.project.creation"; //$NON-NLS-1$
```

### JavadocReference
Cannot resolve symbol `getOrCreateSection(IDialogSettings, String)`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizard.java`
#### Snippet
```java
     * preferences.
     *
     * @see org.eclipse.jface.dialogs.DialogSettings#getOrCreateSection(IDialogSettings, String)
     */
    private static final String PROJECT_CREATION_DIALOG_SETTINGS = "org.eclipse.buildship.ui.wizard.project.creation"; //$NON-NLS-1$
```

### JavadocReference
Cannot resolve symbol `IDialogSettings`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizard.java`
#### Snippet
```java
     * preferences.
     *
     * @see org.eclipse.jface.dialogs.DialogSettings#getOrCreateSection(IDialogSettings, String)
     */
    private static final String PROJECT_CREATION_DIALOG_SETTINGS = "org.eclipse.buildship.ui.wizard.project.creation"; //$NON-NLS-1$
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jface.dialogs.DialogSettings`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizard.java`
#### Snippet
```java

    /**
     * Creates a new instance and uses the {@link org.eclipse.jface.dialogs.DialogSettings} from {@link org.eclipse.buildship.ui.internal.UiPlugin}..
     */
    @SuppressWarnings("UnusedDeclaration")
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jface.dialogs.DialogSettings`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectCreationWizard.java`
#### Snippet
```java

    /**
     * Creates a new instance and uses the given {@link org.eclipse.jface.dialogs.DialogSettings}.
     *
     * @param dialogSettings          the dialog settings to store/retrieve dialog preferences
```

### JavadocReference
Cannot resolve symbol `IWorkingSet`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/WorkingSetChangedListener.java`
#### Snippet
```java

/**
 * A {@link WorkingSetChangedListener} gets informed when the selected {@link IWorkingSet} instances
 * of the {@link WorkingSetConfigurationWidget} change.
 *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jface.dialogs.DialogSettings`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportWizard.java`
#### Snippet
```java

    /**
     * The section name declaration for {@link org.eclipse.jface.dialogs.DialogSettings} where the import wizard stores its
     * preferences.
     *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jface.dialogs.DialogSettings`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportWizard.java`
#### Snippet
```java
     * preferences.
     *
     * @see org.eclipse.jface.dialogs.DialogSettings#getOrCreateSection(IDialogSettings, String)
     */
    private static final String PROJECT_IMPORT_DIALOG_SETTINGS = "org.eclipse.buildship.ui.wizard.project.import"; //$NON-NLS-1$
```

### JavadocReference
Cannot resolve symbol `getOrCreateSection(IDialogSettings, String)`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportWizard.java`
#### Snippet
```java
     * preferences.
     *
     * @see org.eclipse.jface.dialogs.DialogSettings#getOrCreateSection(IDialogSettings, String)
     */
    private static final String PROJECT_IMPORT_DIALOG_SETTINGS = "org.eclipse.buildship.ui.wizard.project.import"; //$NON-NLS-1$
```

### JavadocReference
Cannot resolve symbol `IDialogSettings`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportWizard.java`
#### Snippet
```java
     * preferences.
     *
     * @see org.eclipse.jface.dialogs.DialogSettings#getOrCreateSection(IDialogSettings, String)
     */
    private static final String PROJECT_IMPORT_DIALOG_SETTINGS = "org.eclipse.buildship.ui.wizard.project.import"; //$NON-NLS-1$
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jface.dialogs.DialogSettings`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportWizard.java`
#### Snippet
```java

    /**
     * Creates a new instance and uses the {@link org.eclipse.jface.dialogs.DialogSettings}.
     */
    @SuppressWarnings("UnusedDeclaration")
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jface.dialogs.DialogSettings`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/ProjectImportWizard.java`
#### Snippet
```java

    /**
     * Creates a new instance and uses the given {@link org.eclipse.jface.dialogs.DialogSettings}.
     *
     * @param dialogSettings the dialog settings to store/retrieve dialog preferences
```

### JavadocReference
Cannot resolve symbol `WorkingSetConfigurationBlock`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/WorkingSetConfigurationWidget.java`
#### Snippet
```java

/**
 * Enhances the {@link WorkingSetConfigurationBlock} class with {@link WorkingSetChangedListener}
 * functionality.
 *
```

### JavadocReference
Cannot resolve symbol `IHyperlink`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/UrlPatternMatchListener.java`
#### Snippet
```java

    /**
     * Simple {@link IHyperlink} implementation opening the target URL in the external browser.
     */
    static final class Hyperlink implements IHyperlink {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.debug.core.ILaunch`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/RemoveTerminatedGradleConsoleAction.java`
#### Snippet
```java

/**
 * Removes the finished {@link org.eclipse.debug.core.ILaunch} instance associated with a given {@link GradleConsole}
 * instance. The action is only enabled if the launch instance has terminated.
 *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.debug.core.ILaunch`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/RemoveAllTerminatedGradleConsolesAction.java`
#### Snippet
```java

/**
 * Removes all finished {@link org.eclipse.debug.core.ILaunch} instances associated with a {@link GradleConsole} instance.
 * The action is only enabled if at least one console can be removed.
 */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.core.resources.IProject`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/workspace/RefreshProjectHandler.java`
#### Snippet
```java

/**
 * Synchronizes all selected, Gradle-aware {@link org.eclipse.core.resources.IProject} instances with
 * the workspace, including those projects that belong to the same Gradle multi-project.
 */
```

### JavadocReference
Cannot resolve symbol `IProject`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/workspace/ProjectSynchronizer.java`
#### Snippet
```java

/**
 * Collects all selected, Gradle-aware {@link IProject} instances and schedules a
 * {@link SynchronizeGradleProjectsJob} to refresh these projects.
 *
```

### JavadocReference
Cannot resolve symbol `SynchronizeGradleProjectsJob`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/workspace/ProjectSynchronizer.java`
#### Snippet
```java
/**
 * Collects all selected, Gradle-aware {@link IProject} instances and schedules a
 * {@link SynchronizeGradleProjectsJob} to refresh these projects.
 *
 * @see SynchronizeGradleProjectsJob
```

### JavadocReference
Cannot resolve symbol `SynchronizeGradleProjectsJob`
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/workspace/ProjectSynchronizer.java`
#### Snippet
```java
 * {@link SynchronizeGradleProjectsJob} to refresh these projects.
 *
 * @see SynchronizeGradleProjectsJob
 */
public final class ProjectSynchronizer {
```

### JavadocReference
Symbol `org.gradle.tooling.GradleConnector` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/GradleDistribution.java`
#### Snippet
```java
     *
     * @return a new distribution instance
     * @see org.gradle.tooling.GradleConnector#useBuildDistribution()
     */
    public static WrapperGradleDistribution fromBuild() {
```

### JavadocReference
Symbol `useBuildDistribution()` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/GradleDistribution.java`
#### Snippet
```java
     *
     * @return a new distribution instance
     * @see org.gradle.tooling.GradleConnector#useBuildDistribution()
     */
    public static WrapperGradleDistribution fromBuild() {
```

### JavadocReference
Symbol `org.eclipse.core.runtime.IStatus` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#ERROR} severity in Eclipse's log.
     *
     * @param message the error to log
```

### JavadocReference
Symbol `ERROR` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#ERROR} severity in Eclipse's log.
     *
     * @param message the error to log
```

### JavadocReference
Symbol `org.eclipse.core.runtime.IStatus` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#INFO} severity in Eclipse's log.
     *
     * @param message the information to log
```

### JavadocReference
Symbol `INFO` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#INFO} severity in Eclipse's log.
     *
     * @param message the information to log
```

### JavadocReference
Symbol `org.eclipse.core.runtime.ILog` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

/**
 * Simplifying abstraction over Eclipse's logging ({@link org.eclipse.core.runtime.ILog}) interface.
 * <p>
 * By using this interface, we can log like this:
```

### JavadocReference
Symbol `org.eclipse.core.runtime.IStatus` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#WARNING} severity in Eclipse's log.
     *
     * @param message the warning to log
```

### JavadocReference
Symbol `WARNING` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#WARNING} severity in Eclipse's log.
     *
     * @param message the warning to log
```

### JavadocReference
Symbol `org.eclipse.core.runtime.IStatus` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#INFO} severity in Eclipse's log if
     * tracing is enabled for the specified scope.
     */
```

### JavadocReference
Symbol `INFO` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#INFO} severity in Eclipse's log if
     * tracing is enabled for the specified scope.
     */
```

### JavadocReference
Symbol `org.eclipse.core.runtime.IStatus` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#WARNING} severity in Eclipse's log.
     *
     * @param message the warning to log
```

### JavadocReference
Symbol `WARNING` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#WARNING} severity in Eclipse's log.
     *
     * @param message the warning to log
```

### JavadocReference
Symbol `org.eclipse.core.runtime.IStatus` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#INFO} severity in Eclipse's log.
     *
     * @param message the information to log
```

### JavadocReference
Symbol `INFO` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#INFO} severity in Eclipse's log.
     *
     * @param message the information to log
```

### JavadocReference
Symbol `org.eclipse.core.runtime.IStatus` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#ERROR} severity in Eclipse's log.
     *
     * @param message the error to log
```

### JavadocReference
Symbol `ERROR` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#ERROR} severity in Eclipse's log.
     *
     * @param message the error to log
```

### JavadocReference
Symbol `org.eclipse.core.runtime.IStatus` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#INFO} severity in Eclipse's log if
     * tracing is enabled for the specified scope.
     *
```

### JavadocReference
Symbol `INFO` is inaccessible from here
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/Logger.java`
#### Snippet
```java

    /**
     * Logs an entry with {@link org.eclipse.core.runtime.IStatus#INFO} severity in Eclipse's log if
     * tracing is enabled for the specified scope.
     *
```

### JavadocReference
Cannot resolve symbol `EclipseJavaSourceSettings`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatSourceSettings.java`
#### Snippet
```java

/**
 * Compatibility decorator for {@link EclipseJavaSourceSettings}.
 *
 * @author Donat Csikos
```

### JavadocReference
Cannot resolve symbol `GradleTask`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatTask.java`
#### Snippet
```java

/**
 * Compatibility decorator for {@link GradleTask}.
 *
 * @author Donat Csikos
```

### JavadocReference
Cannot resolve symbol `Optional`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/file/FileUtils.java`
#### Snippet
```java
     * @param path the relative or absolute path of the {@code File} instance to derive
     * @return the absolute {@code File} if the path is not {@code null} or empty, otherwise
     * {@link Optional#absent()}
     */
    public static Optional<File> getAbsoluteFile(String path) {
```

### JavadocReference
Cannot resolve symbol `absent()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/file/FileUtils.java`
#### Snippet
```java
     * @param path the relative or absolute path of the {@code File} instance to derive
     * @return the absolute {@code File} if the path is not {@code null} or empty, otherwise
     * {@link Optional#absent()}
     */
    public static Optional<File> getAbsoluteFile(String path) {
```

### JavadocReference
Cannot resolve symbol `Optional`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/file/FileUtils.java`
#### Snippet
```java
     * @param file the relative or absolute file of the {@code File} instance to derive
     * @return the absolute {@code File} if the file is not {@code null}, otherwise
     * {@link Optional#absent()}
     */
    public static Optional<File> getAbsoluteFile(File file) {
```

### JavadocReference
Cannot resolve symbol `absent()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/file/FileUtils.java`
#### Snippet
```java
     * @param file the relative or absolute file of the {@code File} instance to derive
     * @return the absolute {@code File} if the file is not {@code null}, otherwise
     * {@link Optional#absent()}
     */
    public static Optional<File> getAbsoluteFile(File file) {
```

### JavadocReference
Cannot resolve symbol `Optional`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/file/FileUtils.java`
#### Snippet
```java
     * @param file the file from which to get the absolute path
     * @return the absolute path if the file is not {@code null}, otherwise
     * {@link Optional#absent()}
     */
    public static Optional<String> getAbsolutePath(File file) {
```

### JavadocReference
Cannot resolve symbol `absent()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/file/FileUtils.java`
#### Snippet
```java
     * @param file the file from which to get the absolute path
     * @return the absolute path if the file is not {@code null}, otherwise
     * {@link Optional#absent()}
     */
    public static Optional<String> getAbsolutePath(File file) {
```

### JavadocReference
Cannot resolve symbol `BundleContext`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CorePlugin.java`
#### Snippet
```java
 * accessible via static methods on this class.
 * <p/>
 * The {@link #start(BundleContext)} and {@link #stop(BundleContext)} methods' responsibility is to
 * assign and free the managed services along the plugin runtime lifecycle.
 */
```

### JavadocReference
Cannot resolve symbol `BundleContext`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CorePlugin.java`
#### Snippet
```java
 * accessible via static methods on this class.
 * <p/>
 * The {@link #start(BundleContext)} and {@link #stop(BundleContext)} methods' responsibility is to
 * assign and free the managed services along the plugin runtime lifecycle.
 */
```

### JavadocReference
Cannot resolve symbol `HierarchicalElement`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/HierarchicalElementUtils.java`
#### Snippet
```java

/**
 * Contains helper methods to traverse {@link HierarchicalElement} instances.
 *
 * @author Donat Csikos
```

### JavadocReference
Cannot resolve symbol `EclipseProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/HierarchicalElementUtils.java`
#### Snippet
```java

    /**
     * Compares {@link EclipseProject}s based on their paths.
     */
    static enum EclipseProjectComparator implements Comparator<EclipseProject> {
```

### JavadocReference
Cannot resolve symbol `DomainObjectSet`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/ModelUtils.java`
#### Snippet
```java

    /**
     * Default implementation of the {@link DomainObjectSet} interface.
     *
     * This class copied from Gradle Core 4.6 as it is not part of the public API.
```

### JavadocReference
Cannot resolve symbol `EclipseProjectDependency`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseProjectDependency.java`
#### Snippet
```java

/**
 * Compatibility decorator for {@link EclipseProjectDependency}.
 *
 * @author Donat Csikos
```

### JavadocReference
Cannot resolve symbol `EclipseProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseProject.java`
#### Snippet
```java
/**
 *
 * {@link EclipseProject}  decorator that returns sensible defaults for attributes that don't
 * exist in older Gradle versions.
 * <p>
```

### JavadocReference
Cannot resolve symbol `JavaVersion`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/JavaVersionUtil.java`
#### Snippet
```java

/**
 * Utility class to map Gradle {@link JavaVersion} values to the Eclipse domain.
 *
 * @author Donat Csikos
```

### JavadocReference
Cannot resolve symbol `EclipseExternalDependency`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseExternalDependency.java`
#### Snippet
```java

/**
 * Compatibility decorator for {@link EclipseExternalDependency}.
 *
 * @author Donat Csikos
```

### JavadocReference
Cannot resolve symbol `EclipseClasspathEntry`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseClasspathEntry.java`
#### Snippet
```java

/**
 * Compatibility decorator for {@link EclipseClasspathEntry}.
 *
 * @param <T> the decorated type
```

### JavadocReference
Cannot resolve symbol `EclipseSourceDirectory`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseSourceDirectory.java`
#### Snippet
```java

/**
 * Compatibility decorator for {@link EclipseSourceDirectory}.
 *
 * @author Donat Csikos
```

### JavadocReference
Cannot resolve symbol `GradleProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatGradleProject.java`
#### Snippet
```java

/**
 * Compatibility decorator for {@link GradleProject}.
 *
 * @author Donat Csikos
```

### JavadocReference
Cannot resolve symbol `EclipseProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatProjectConnection.java`
#### Snippet
```java

/**
 * Injects {@link CompatEclipseProject} into all model queries requesting the {@link EclipseProject}
 * model.
 *
```

### JavadocReference
Cannot resolve symbol `ProgressListener`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/progress/DelegatingProgressListener.java`
#### Snippet
```java

/**
 * {@link ProgressListener} implementation which delegates all Gradle {@link ProgressEvent} to a
 * target {@link IProgressMonitor}. The Tooling API does not provide up-front information about how
 * many work units will be needed. To give the user some perceived progress, this class will use a
```

### JavadocReference
Cannot resolve symbol `ProgressEvent`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/progress/DelegatingProgressListener.java`
#### Snippet
```java

/**
 * {@link ProgressListener} implementation which delegates all Gradle {@link ProgressEvent} to a
 * target {@link IProgressMonitor}. The Tooling API does not provide up-front information about how
 * many work units will be needed. To give the user some perceived progress, this class will use a
```

### JavadocReference
Cannot resolve symbol `IProgressMonitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/progress/DelegatingProgressListener.java`
#### Snippet
```java
/**
 * {@link ProgressListener} implementation which delegates all Gradle {@link ProgressEvent} to a
 * target {@link IProgressMonitor}. The Tooling API does not provide up-front information about how
 * many work units will be needed. To give the user some perceived progress, this class will use a
 * logarithmic approach. Every new message will lead to 1/100 of the remaining progress to be consumed.
```

### JavadocReference
Cannot resolve symbol `ProgressListener`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/progress/DelegatingProgressListener.java`
#### Snippet
```java

    /**
     * Creates a new {@link ProgressListener} that will forward a filtered set of
     * progress messages to the provided {@link IProgressMonitor}.
     *
```

### JavadocReference
Cannot resolve symbol `IProgressMonitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/progress/DelegatingProgressListener.java`
#### Snippet
```java
    /**
     * Creates a new {@link ProgressListener} that will forward a filtered set of
     * progress messages to the provided {@link IProgressMonitor}.
     *
     * The progress stream from Gradle contains a lot of duplicate log messages.
```

### JavadocReference
Cannot resolve symbol `ProgressListener`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/progress/DelegatingProgressListener.java`
#### Snippet
```java

    /**
     * Creates a new {@link ProgressListener} that will forward all progress messages to the
     * provided {@link IProgressMonitor}.
     *
```

### JavadocReference
Cannot resolve symbol `IProgressMonitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/progress/DelegatingProgressListener.java`
#### Snippet
```java
    /**
     * Creates a new {@link ProgressListener} that will forward all progress messages to the
     * provided {@link IProgressMonitor}.
     *
     * @param monitor the monitor to delegate to, may be null
```

### JavadocReference
Cannot resolve symbol `absent()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/classpath/ClasspathUtils.java`
#### Snippet
```java
     * Returns the list of Gradle scopes that is defined on the target classpath entry.
     * <p>
     * If the scope information is not available then {@link Optional#absent()} is returned.
     *
     * @param entry the target entry
```

### JavadocReference
Cannot resolve symbol `absent()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/classpath/ClasspathUtils.java`
#### Snippet
```java
     * Returns the list of Gradle used-by scopes that is defined on the target classpath entry.
     * <p>
     * If the scope information is not available then {@link Optional#absent()} is returned.
     *
     * @param entry the target entry
```

### JavadocReference
Cannot resolve symbol `IMethod`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/JavaElementSelection.java`
#### Snippet
```java

/**
 * Base class to collect selected {@link IMethod} and {@link IType} instances.
 */
public abstract class JavaElementSelection {
```

### JavadocReference
Cannot resolve symbol `IType`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/JavaElementSelection.java`
#### Snippet
```java

/**
 * Base class to collect selected {@link IMethod} and {@link IType} instances.
 */
public abstract class JavaElementSelection {
```

### JavadocReference
Cannot resolve symbol `IJavaElement`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/JavaElementSelection.java`
#### Snippet
```java

    /**
     * Collects {@link IJavaElement} instances which can be resolved to methods and types.
     *
     * @return the Java elements to be resolved
```

### JavadocReference
Cannot resolve symbol `IMethod`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/JavaElementSelection.java`
#### Snippet
```java
     * Returns the selected types.
     * <p/>
     * For each {@link IMethod} or {@link IField}, the enclosing {@link IType} is returned. If
     * the exact type can't be determined then the top-level type is returned.
     * <p/>
```

### JavadocReference
Cannot resolve symbol `IField`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/JavaElementSelection.java`
#### Snippet
```java
     * Returns the selected types.
     * <p/>
     * For each {@link IMethod} or {@link IField}, the enclosing {@link IType} is returned. If
     * the exact type can't be determined then the top-level type is returned.
     * <p/>
```

### JavadocReference
Cannot resolve symbol `IType`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/JavaElementSelection.java`
#### Snippet
```java
     * Returns the selected types.
     * <p/>
     * For each {@link IMethod} or {@link IField}, the enclosing {@link IType} is returned. If
     * the exact type can't be determined then the top-level type is returned.
     * <p/>
```

### JavadocReference
Cannot resolve symbol `IType`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/JavaElementSelection.java`
#### Snippet
```java
     * If an item can't be resolved then it is skipped from from the result list.
     *
     * @return the resolved {@link IType} instances
     */
    public final List<IType> getSelectedTypes() {
```

### JavadocReference
Cannot resolve symbol `IMethod`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/JavaElementSelection.java`
#### Snippet
```java
     * If an item can't be resolved then it is skipped from from the result list.
     *
     * @return the selected {@link IMethod} instances
     */
    public final List<IMethod> getSelectedMethods() {
```

### JavadocReference
Cannot resolve symbol `ILaunchConfiguration`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/GradleLaunchConfigurationManager.java`
#### Snippet
```java

/**
 * Manages the interactions with the Gradle {@link ILaunchConfiguration} instances.
 */
public interface GradleLaunchConfigurationManager {
```

### JavadocReference
Cannot resolve symbol `ILaunchConfiguration`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/GradleLaunchConfigurationManager.java`
#### Snippet
```java

    /**
     * Returns either a new Gradle {@link ILaunchConfiguration} instance or an existing one,
     * depending on whether there is already a Gradle test run configuration for the given set of
     * attributes or not. The result is saved to the disk.
```

### JavadocReference
Cannot resolve symbol `ILaunchConfiguration`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/GradleLaunchConfigurationManager.java`
#### Snippet
```java

    /**
     * Returns the existing Gradle {@link ILaunchConfiguration} instance for the given set of
     * attributes, if such a configuration exists.
     *
```

### JavadocReference
Cannot resolve symbol `Optional`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/GradleLaunchConfigurationManager.java`
#### Snippet
```java
     *
     * @param configurationAttributes the run configuration attributes, must not be not null
     * @return the existing Gradle run configuration or {@link Optional#absent()} if no such
     *         configuration exists
     */
```

### JavadocReference
Cannot resolve symbol `absent()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/GradleLaunchConfigurationManager.java`
#### Snippet
```java
     *
     * @param configurationAttributes the run configuration attributes, must not be not null
     * @return the existing Gradle run configuration or {@link Optional#absent()} if no such
     *         configuration exists
     */
```

### JavadocReference
Cannot resolve symbol `ILaunchConfiguration`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/GradleLaunchConfigurationManager.java`
#### Snippet
```java

    /**
     * Returns either a new Gradle {@link ILaunchConfiguration} instance or an existing one,
     * depending on whether there is already a Gradle run configuration for the given set of
     * attributes or not. The result is saved to the disk.
```

### JavadocReference
Cannot resolve symbol `scopes`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/LaunchConfigurationScope.java`
#### Snippet
```java
     *
     * @param entry the target classpath entry
     * @param scopes the name of the scopes to look for
     *
     * @return whether the scopes contain the the entry's dependency scope
```

### JavadocReference
Cannot resolve symbol `ILaunchConfiguration`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/ExternalLaunchConfigurationManager.java`
#### Snippet
```java
    /**
     * Iterates through the existing run configurations and calls
     * {@link #updateClasspathProvider(ILaunchConfiguration)} if the configuration references the
     * target project.
     *
```

### JavadocReference
Cannot resolve symbol `CoreException`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiOperationManager.java`
#### Snippet
```java
     * @param tokenSource the cancellation token source to be used in the operation
     * @param monitor the raw monitor the operation will report its progress on
     * @throws CoreException if the operation fails
     */
    void run(ToolingApiOperation operation, CancellationTokenSource tokenSource, IProgressMonitor monitor) throws CoreException;
```

### JavadocReference
Cannot resolve symbol `CoreException`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiOperationManager.java`
#### Snippet
```java
     * @param operation the target Tooling API operation
     * @param monitor the monitor to report progress on
     * @throws CoreException if the execution fails
     *
     * @see #run(ToolingApiOperation, CancellationTokenSource, IProgressMonitor)
```

### JavadocReference
Cannot resolve symbol `CancellationTokenSource`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiOperationManager.java`
#### Snippet
```java
     * @throws CoreException if the execution fails
     *
     * @see #run(ToolingApiOperation, CancellationTokenSource, IProgressMonitor)
     */
    void run(ToolingApiOperation operation, IProgressMonitor monitor) throws CoreException;
```

### JavadocReference
Cannot resolve symbol `IProgressMonitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiOperationManager.java`
#### Snippet
```java
     * @throws CoreException if the execution fails
     *
     * @see #run(ToolingApiOperation, CancellationTokenSource, IProgressMonitor)
     */
    void run(ToolingApiOperation operation, IProgressMonitor monitor) throws CoreException;
```

### JavadocReference
Cannot resolve symbol `Job`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiJob.java`
#### Snippet
```java

    /**
     * Method to be executed in {@link Job#run(IProgressMonitor)}.
     *
     * @param tokenSource the Tooling API cancellation token source
```

### JavadocReference
Cannot resolve symbol `run(IProgressMonitor)`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiJob.java`
#### Snippet
```java

    /**
     * Method to be executed in {@link Job#run(IProgressMonitor)}.
     *
     * @param tokenSource the Tooling API cancellation token source
```

### JavadocReference
Cannot resolve symbol `IProgressMonitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiJob.java`
#### Snippet
```java

    /**
     * Method to be executed in {@link Job#run(IProgressMonitor)}.
     *
     * @param tokenSource the Tooling API cancellation token source
```

### JavadocReference
Cannot resolve symbol `projects`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/InternalGradleWorkspace.java`
#### Snippet
```java
     * Returns all Gradle builds from the workspace.
     *
     * @param projects the projects for which to find the corresponding builds
     * @return the set of Gradle builds
     */
```

### JavadocReference
Cannot resolve symbol `EclipseProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ModelProvider.java`
#### Snippet
```java

    /**
     * Queries the {@link EclipseProject} model and executes the synchronization tasks in the same Tooling API query.
     *
     * @return the returned models
```

### JavadocReference
Cannot resolve symbol `IStatus`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java

/**
 * Custom {@link IStatus} implementation to represent Gradle-related statuses.
 *
 * @author Donat Csikos
```

### JavadocReference
Cannot resolve symbol `workspaceModel`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ProjectNameUpdater.java`
#### Snippet
```java
     *
     * @param project     the project whose name is to be verified
     * @param workspaceModel the workspace model to which the project belongs
     * @param monitor     the monitor to report progress on
     */
```

### JavadocReference
Cannot resolve symbol `workspaceModel`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ProjectNameUpdater.java`
#### Snippet
```java
     * @param workspaceProject the Eclipse project whose name to update
     * @param project          the Gradle project corresponding to the Eclipse project
     * @param workspaceModel the workspace model to which the project belongs
     * @param monitor          the monitor to report progress on
     * @return the new project reference in case the project name has changed, the incoming project instance otherwise
```

### JavadocReference
Cannot resolve symbol `update(IJavaProject, Optional, IProgressMonitor)`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ClasspathContainerUpdater.java`
#### Snippet
```java
 * Updates the classpath containers of the target project.
 * <p/>
 * The update is triggered via {@link #update(IJavaProject, Optional, IProgressMonitor)}. The method
 * executes synchronously and unprotected, without thread synchronization or job scheduling.
 * <p/>
```

### JavadocReference
Cannot resolve symbol `IJavaProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ClasspathContainerUpdater.java`
#### Snippet
```java
 * Updates the classpath containers of the target project.
 * <p/>
 * The update is triggered via {@link #update(IJavaProject, Optional, IProgressMonitor)}. The method
 * executes synchronously and unprotected, without thread synchronization or job scheduling.
 * <p/>
```

### JavadocReference
Cannot resolve symbol `Optional`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ClasspathContainerUpdater.java`
#### Snippet
```java
 * Updates the classpath containers of the target project.
 * <p/>
 * The update is triggered via {@link #update(IJavaProject, Optional, IProgressMonitor)}. The method
 * executes synchronously and unprotected, without thread synchronization or job scheduling.
 * <p/>
```

### JavadocReference
Cannot resolve symbol `IProgressMonitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ClasspathContainerUpdater.java`
#### Snippet
```java
 * Updates the classpath containers of the target project.
 * <p/>
 * The update is triggered via {@link #update(IJavaProject, Optional, IProgressMonitor)}. The method
 * executes synchronously and unprotected, without thread synchronization or job scheduling.
 * <p/>
```

### JavadocReference
Cannot resolve symbol `Optional`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/EclipseVmUtil.java`
#### Snippet
```java
     *
     * @param version the Java version
     * @return the execution environment or {@link Optional#absent()} if none was found
     */
    public static Optional<IExecutionEnvironment> findExecutionEnvironment(String version) {
```

### JavadocReference
Cannot resolve symbol `absent()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/EclipseVmUtil.java`
#### Snippet
```java
     *
     * @param version the Java version
     * @return the execution environment or {@link Optional#absent()} if none was found
     */
    public static Optional<IExecutionEnvironment> findExecutionEnvironment(String version) {
```

### JavadocReference
Cannot resolve symbol `IResourceChangeListener`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/ProjectChangeListener.java`
#### Snippet
```java

/**
 * An {@link IResourceChangeListener} implementation which sends events about project change events
 * via {@link CorePlugin#listenerRegistry()}.
 *
```

### JavadocReference
Cannot resolve symbol `IJavaProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SourceFolderUpdater.java`
#### Snippet
```java
 * Updates the source folders of the target project.
 * <p/>
 * The update is triggered via {@link #update(IJavaProject, List, IProgressMonitor)}. The method
 * executes synchronously and unprotected, without thread synchronization or job scheduling.
 * <p/>
```

### JavadocReference
Cannot resolve symbol `IProgressMonitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SourceFolderUpdater.java`
#### Snippet
```java
 * Updates the source folders of the target project.
 * <p/>
 * The update is triggered via {@link #update(IJavaProject, List, IProgressMonitor)}. The method
 * executes synchronously and unprotected, without thread synchronization or job scheduling.
 * <p/>
```

### JavadocReference
Cannot resolve symbol `IClasspathEntry`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SourceFolderUpdater.java`
#### Snippet
```java

    /**
     * Helper class to create an {@link IClasspathEntry} instance representing a source folder.
     */
    private static class SourceFolderEntryBuilder {
```

### JavadocReference
Cannot resolve symbol `JavaModelException`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SourceFolderUpdater.java`
#### Snippet
```java
     *            project
     * @param monitor the monitor to report progress on
     * @throws JavaModelException if the classpath modification fails
     */
    public static void update(IJavaProject project, List<EclipseSourceDirectory> sourceDirectories, IProgressMonitor monitor) throws JavaModelException {
```

### JavadocReference
Cannot resolve symbol `updateFromModel(IJavaProject, EclipseProject, IProgressMonitor, ProjectContext)`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerUpdater.java`
#### Snippet
```java
    /**
     * Updates the classpath container from the state stored by the last call to
     * {@link #updateFromModel(IJavaProject, EclipseProject, IProgressMonitor, ProjectContext)}.
     */
    public static boolean updateFromStorage(IJavaProject eclipseProject, IProgressMonitor monitor) throws JavaModelException {
```

### JavadocReference
Cannot resolve symbol `IJavaProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerUpdater.java`
#### Snippet
```java
    /**
     * Updates the classpath container from the state stored by the last call to
     * {@link #updateFromModel(IJavaProject, EclipseProject, IProgressMonitor, ProjectContext)}.
     */
    public static boolean updateFromStorage(IJavaProject eclipseProject, IProgressMonitor monitor) throws JavaModelException {
```

### JavadocReference
Cannot resolve symbol `EclipseProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerUpdater.java`
#### Snippet
```java
    /**
     * Updates the classpath container from the state stored by the last call to
     * {@link #updateFromModel(IJavaProject, EclipseProject, IProgressMonitor, ProjectContext)}.
     */
    public static boolean updateFromStorage(IJavaProject eclipseProject, IProgressMonitor monitor) throws JavaModelException {
```

### JavadocReference
Cannot resolve symbol `IProgressMonitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerUpdater.java`
#### Snippet
```java
    /**
     * Updates the classpath container from the state stored by the last call to
     * {@link #updateFromModel(IJavaProject, EclipseProject, IProgressMonitor, ProjectContext)}.
     */
    public static boolean updateFromStorage(IJavaProject eclipseProject, IProgressMonitor monitor) throws JavaModelException {
```

### JavadocReference
Cannot resolve symbol `updateFromModel(IJavaProject, EclipseProject, Set, IProgressMonitor, ProjectContext)`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerUpdater.java`
#### Snippet
```java
 * <p/>
 * The update is triggered via
 * {@link #updateFromModel(IJavaProject, EclipseProject, Set, IProgressMonitor, ProjectContext)}.
 * The method executes synchronously and unprotected, without thread synchronization or job
 * scheduling.
```

### JavadocReference
Cannot resolve symbol `IProgressMonitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/InternalGradleBuild.java`
#### Snippet
```java
     * Executes an action in the Gradle runtime.
     *
     * @see #withConnection(Function, IProgressMonitor)
     */
    <T> T withConnection(Function<ProjectConnection, ? extends T> action, CancellationTokenSource tokenSource, IProgressMonitor monitor) throws Exception;
```

### JavadocReference
Cannot resolve symbol `IJavaProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerUpdater.java`
#### Snippet
```java
 * <p/>
 * The update is triggered via
 * {@link #updateFromModel(IJavaProject, EclipseProject, Set, IProgressMonitor, ProjectContext)}.
 * The method executes synchronously and unprotected, without thread synchronization or job
 * scheduling.
```

### JavadocReference
Cannot resolve symbol `EclipseProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerUpdater.java`
#### Snippet
```java
 * <p/>
 * The update is triggered via
 * {@link #updateFromModel(IJavaProject, EclipseProject, Set, IProgressMonitor, ProjectContext)}.
 * The method executes synchronously and unprotected, without thread synchronization or job
 * scheduling.
```

### JavadocReference
Cannot resolve symbol `IProgressMonitor`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerUpdater.java`
#### Snippet
```java
 * <p/>
 * The update is triggered via
 * {@link #updateFromModel(IJavaProject, EclipseProject, Set, IProgressMonitor, ProjectContext)}.
 * The method executes synchronously and unprotected, without thread synchronization or job
 * scheduling.
```

### JavadocReference
Cannot resolve symbol `IProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WorkspaceOperations.java`
#### Snippet
```java

    /**
     * Adds the given nature to an existing {@link IProject}.
     * <p/>
     * If the target project already has the nature, then it will remain unchanged.
```

### JavadocReference
Cannot resolve symbol `IProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WorkspaceOperations.java`
#### Snippet
```java

    /**
     * Includes an existing {@link IProject} in the workspace. The project must not yet exist in the workspace.
     * The project is also opened and the specified natures are added.
     *
```

### JavadocReference
Cannot resolve symbol `IProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WorkspaceOperations.java`
#### Snippet
```java

   /**
     * Creates a new {@link IProject} in the workspace using the specified name and location. The
     * location must exist and no project with the specified name must currently exist in the
    * workspace. The new project gets the specified natures applied.
```

### JavadocReference
Cannot resolve symbol `Optional`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WorkspaceOperations.java`
#### Snippet
```java
     *
     * @param location the location of the project to find
     * @return the matching project, otherwise {@link Optional#absent()}
     */
    Optional<IProject> findProjectByLocation(File location);
```

### JavadocReference
Cannot resolve symbol `absent()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WorkspaceOperations.java`
#### Snippet
```java
     *
     * @param location the location of the project to find
     * @return the matching project, otherwise {@link Optional#absent()}
     */
    Optional<IProject> findProjectByLocation(File location);
```

### JavadocReference
Cannot resolve symbol `Optional`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WorkspaceOperations.java`
#### Snippet
```java
     *
     * @param name the name of the project to find
     * @return the matching project, otherwise {@link Optional#absent()}
     */
    Optional<IProject> findProjectByName(String name);
```

### JavadocReference
Cannot resolve symbol `absent()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WorkspaceOperations.java`
#### Snippet
```java
     *
     * @param name the name of the project to find
     * @return the matching project, otherwise {@link Optional#absent()}
     */
    Optional<IProject> findProjectByName(String name);
```

### JavadocReference
Cannot resolve symbol `IProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WorkspaceOperations.java`
#### Snippet
```java

    /**
     * Remove the given nature from an existing {@link IProject}.
     *
     * @param project  the project from which to remove the nature
```

### JavadocReference
Cannot resolve symbol `IProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WorkspaceOperations.java`
#### Snippet
```java

    /**
     * Refreshes the content of an existing {@link IProject} to get it in sync with the file system.
     *
     * Useful to avoid having out-of-sync warnings showing up in the IDE.
```

### JavadocReference
Cannot resolve symbol `Optional`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WorkspaceOperations.java`
#### Snippet
```java
     * @param location the physical location where to look for an existing Eclipse project
     * @param monitor  the monitor to report progress on
     * @return the found Eclipse project, otherwise {@link Optional#absent()}
     */
    Optional<IProjectDescription> findProjectDescriptor(File location, IProgressMonitor monitor);
```

### JavadocReference
Cannot resolve symbol `absent()`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/WorkspaceOperations.java`
#### Snippet
```java
     * @param location the physical location where to look for an existing Eclipse project
     * @param monitor  the monitor to report progress on
     * @return the found Eclipse project, otherwise {@link Optional#absent()}
     */
    Optional<IProjectDescription> findProjectDescriptor(File location, IProgressMonitor monitor);
```

### JavadocReference
Cannot resolve symbol `IResource`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/GradleResourceTester.java`
#### Snippet
```java

/**
 * Determines whether a given {@link IResource} is a Gradle resource, i.e.
 *
 * <ul>
```

### JavadocReference
Cannot resolve symbol `org.eclipse.core.resources.IProject`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/GradleProjectValidationResourceDeltaVisitor.java`
#### Snippet
```java

    /**
     * Validates the Gradle project configuration and adds error markers to the given {@link org.eclipse.core.resources.IProject} instance if the configuration is missing or
     * invalid.
     */
```

### JavadocReference
Cannot resolve symbol `CoreException`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/GradleProjectValidationResourceDeltaVisitor.java`
#### Snippet
```java
     *
     * @return {@code true} if the validation succeeds, {@code false} otherwise
     * @throws CoreException thrown if there is a problem with the marker operations
     */
    public boolean validate() throws CoreException {
```

### JavadocReference
Cannot resolve symbol `CoreException`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/GradleProjectValidationResourceDeltaVisitor.java`
#### Snippet
```java
         *
         * @return {@code true} if the validation succeeds, {@code false} otherwise
         * @throws CoreException thrown if there is a problem with the marker operations
         */
        public boolean validate() throws CoreException {
```

### JavadocReference
Cannot resolve symbol `IRuntimeClasspathEntryResolver`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerRuntimeClasspathEntryResolver.java`
#### Snippet
```java

/**
 * {@link IRuntimeClasspathEntryResolver} implementation to resolve Gradle classpath container
 * entries.
 *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.core.resources.IWorkspaceRoot`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/GradleProjectBuilder.java`
#### Snippet
```java
     * Configures the builder on the target project if it was not added previously.
     * <p/>
     * This method requires the {@link org.eclipse.core.resources.IWorkspaceRoot} scheduling rule.
     *
     * @param project the target project
```

### JavadocReference
Cannot resolve symbol `org.eclipse.core.resources.IWorkspaceRoot`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/GradleProjectBuilder.java`
#### Snippet
```java
     * Removes the builder from the target project if it was there before.
     * <p/>
     * This method requires the {@link org.eclipse.core.resources.IWorkspaceRoot} scheduling rule.
     *
     * @param project the target project
```

### JavadocReference
Cannot resolve symbol `doSwitch(org.eclipse.emf.ecore.EObject)`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.emf.ecore.EObject`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
```

### JavadocReference
Cannot resolve symbol `doSwitch(org.eclipse.emf.ecore.EObject)`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.emf.ecore.EObject`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
```

### JavadocReference
Cannot resolve symbol `doSwitch(org.eclipse.emf.ecore.EObject)`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.emf.ecore.EObject`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
```

### JavadocReference
Cannot resolve symbol `doSwitch(org.eclipse.emf.ecore.EObject)`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.emf.ecore.EObject`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
```

### JavadocReference
Cannot resolve symbol `doSwitch(EObject)`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
```

### JavadocReference
Cannot resolve symbol `EObject`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
```

### JavadocReference
Cannot resolve symbol `org.eclipse.oomph.base.ModelElement`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.oomph.base.ModelElement
     * <em>Model Element</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
```

### JavadocReference
Cannot resolve symbol `org.eclipse.oomph.base.ModelElement`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * 
     * @return the new adapter.
     * @see org.eclipse.oomph.base.ModelElement
     * @generated
     */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.oomph.setup.SetupTask`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.oomph.setup.SetupTask
     * <em>Task</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
```

### JavadocReference
Cannot resolve symbol `org.eclipse.oomph.setup.SetupTask`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * 
     * @return the new adapter.
     * @see org.eclipse.oomph.setup.SetupTask
     * @generated
     */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.oomph.resources.SourceLocator`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
    /**
     * Returns the value of the '<em><b>Source Locators</b></em>' containment reference list. The
     * list contents are of type {@link org.eclipse.oomph.resources.SourceLocator}. <!--
     * begin-user-doc -->
     * <p>
```

### JavadocReference
Cannot resolve symbol `org.eclipse.emf.ecore.EPackage.Registry`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
```

### JavadocReference
Cannot resolve symbol `org.eclipse.emf.ecore.EPackage.Registry`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.eclipse.buildship.oomph.GradleImportPackage#eNS_URI
     * @see #init()
```

### JavadocReference
Cannot resolve symbol `BasePackage`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java

    /**
     * A child creation extender for the {@link BasePackage}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
```

### JavadocReference
Cannot resolve symbol `SetupPackage`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java

    /**
     * A child creation extender for the {@link SetupPackage}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
```

### JavadocReference
Cannot resolve symbol `org.eclipse.emf.edit.provider.IChangeNotifier`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
```

### JavadocReference
Cannot resolve symbol `updateChildren`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to
     * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
```

### JavadocReference
Cannot resolve symbol `fireNotifyChanged`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to
     * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
```

### JavadocReference
Cannot resolve symbol `getChildren`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
```

### JavadocReference
Cannot resolve symbol `org.eclipse.emf.edit.command.AddCommand`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
```

### JavadocReference
Cannot resolve symbol `org.eclipse.emf.edit.command.RemoveCommand`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
```

### JavadocReference
Cannot resolve symbol `org.eclipse.emf.edit.command.MoveCommand`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
```

### JavadocReference
Cannot resolve symbol `createCommand`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.emf.edit.command.CommandParameter`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
```

## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=DataFlowIssue]
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
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case GradleImportPackage.DISTRIBUTION_TYPE:
                return convertDistributionTypeToString(eDataType, instanceValue);
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case GradleImportPackage.GRADLE_IMPORT_TASK: {
                GradleImportTask gradleImportTask = (GradleImportTask) theEObject;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case GradleImportPackage.GRADLE_IMPORT_TASK:
                return createGradleImportTask();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case GradleImportPackage.DISTRIBUTION_TYPE:
                return convertDistributionTypeToString(eDataType, instanceValue);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case GradleImportPackage.DISTRIBUTION_TYPE:
                return createDistributionTypeFromString(eDataType, initialValue);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GradleImportPackage.GRADLE_IMPORT_TASK__SOURCE_LOCATORS:
                return ((InternalEList<?>) getSourceLocators()).basicRemove(otherEnd, msgs);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/configuration/BuildConfigurationPersistenceTest.groovy`
#### Snippet
```java
        then:
        properties.overrideWorkspaceSettings == false
        properties.gradleDistribution == GradleDistribution.fromBuild()
        properties.gradleUserHome == null
        properties.buildScansEnabled == false
        properties.offlineMode == false
        properties.autoSync == false
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/configuration/BuildConfigurationPersistenceTest.groovy`
#### Snippet
```java
        importedProjectProperties.gradleDistribution == distribution
        importedProjectProperties.gradleUserHome == gradleUserHome
        importedProjectProperties.javaHome == javaHome
        importedProjectProperties.buildScansEnabled == buildScansEnabled
        importedProjectProperties.offlineMode == offlineMode
        importedProjectProperties.autoSync == autoSync
        importedProjectProperties.arguments == arguments
        importedProjectProperties.jvmArguments == jvmArguments
        importedProjectProperties.showConsoleView == showConsole
        importedProjectProperties.showExecutionsView == showExecutions
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/configuration/BuildConfigurationTest.groovy`
#### Snippet
```java
        configuration.buildScansEnabled == buildScansEnabled
        configuration.offlineMode == offlineMode
        configuration.autoSync == autoSync
        configuration.arguments == workspaceArguments
        configuration.jvmArguments == workspaceJvmArguments
        configuration.showConsoleView == showConsole
        configuration.showExecutionsView == showExecutions

        cleanup:
        configurationManager.saveWorkspaceConfiguration(orignalConfiguration)

        where:
        distribution                                                                 | offlineMode  | buildScansEnabled | autoSync | showConsole | showExecutions
        GradleDistribution.fromBuild()                                               | false        | false             | true     | false       | true
        GradleDistribution.forVersion("3.2.1")                                       | false        | true              | false    | true        | false
        GradleDistribution.forLocalInstallation(new File('/').canonicalFile)         | true         | true              | false    | true        | false
        GradleDistribution.forRemoteDistribution(new URI('http://example.com/gd'))   | true         | false             | true     | false       | true
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/configuration/BuildConfigurationTest.groovy`
#### Snippet
```java
        where:
        distribution                                                                 | offlineMode  | buildScansEnabled | autoSync | showConsole | showExecutions
        GradleDistribution.fromBuild()                                               | false        | false             | true     | false       | true
        GradleDistribution.forVersion("3.2.1")                                       | false        | true              | false    | true        | false
        GradleDistribution.forLocalInstallation(new File('/').canonicalFile)         | true         | true              | false    | true        | false
        GradleDistribution.forRemoteDistribution(new URI('http://example.com/gd'))   | true         | false             | true     | false       | true
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/GradleImportTaskTest.groovy`
#### Snippet
```java
        configuration.javaHome == projectJavaHome
        configuration.overrideWorkspaceSettings == true
        configuration.buildScansEnabled == buildScansEnabled
        configuration.offlineMode == offlineMode
        configuration.autoSync == autoSync
        configuration.arguments == projectArguments
        configuration.jvmArguments == projectJvmArguments
        configuration.showConsoleView == showConsole
        configuration.showExecutionsView == showExecutions
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/configuration/BuildConfigurationTest.groovy`
#### Snippet
```java
        configuration.overrideWorkspaceSettings == true
        configuration.buildScansEnabled == buildScansEnabled
        configuration.offlineMode == offlineMode
        configuration.autoSync == autoSync
        configuration.arguments == projectArguments
        configuration.jvmArguments == projectJvmArguments
        configuration.showConsoleView == showConsole
        configuration.showExecutionsView == showExecutions
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/configuration/BuildConfigurationTest.groovy`
#### Snippet
```java
        configuration = configurationManager.loadBuildConfiguration(projectDir)

        then:
        configuration.rootProjectDirectory == projectDir
        configuration.gradleDistribution == GradleDistribution.forVersion('2.0')
        configuration.gradleUserHome == null
        configuration.javaHome == null
        configuration.overrideWorkspaceSettings == true
        configuration.buildScansEnabled == false
        configuration.offlineMode == false
        configuration.autoSync == false
        configuration.arguments == []
        configuration.jvmArguments == []
        configuration.showConsoleView == true
        configuration.showExecutionsView == true
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/configuration/BuildConfigurationTest.groovy`
#### Snippet
```java
        File projectGradleUserHome = dir('gradle-user-home').canonicalFile
        File projectJavaHome = dir('java-home').canonicalFile
        List<String> projectArguments = ['--info']
        List<String> projectJvmArguments = ['-Dfoo=bar']
        BuildConfiguration buildConfig = createOverridingBuildConfiguration(projectDir, distribution, buildScansEnabled, offlineMode, autoSync, projectGradleUserHome, projectJavaHome, projectArguments, projectJvmArguments, showConsole, showExecutions)
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/configuration/ProjectConfigurationTest.groovy`
#### Snippet
```java
    def "project configuration can be read if the project is closed"() {
        given:
        BuildConfiguration buildConfig = createInheritingBuildConfiguration(rootProjectDir)
        ProjectConfiguration projectConfig = configurationManager.createProjectConfiguration(buildConfig, projectDir);
        configurationManager.saveProjectConfiguration(projectConfig)

        project.close(new NullProgressMonitor())

        when:
        ProjectConfiguration loadedConfig = configurationManager.loadProjectConfiguration(project)

        then:
        loadedConfig == projectConfig
    }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/configuration/ProjectConfigurationTest.groovy`
#### Snippet
```java
        projectConfig.buildConfiguration.buildScansEnabled == buildScansEnabled
        projectConfig.buildConfiguration.offlineMode == offlineMode
        projectConfig.buildConfiguration.autoSync == autoSync

        cleanup:
        configurationManager.saveWorkspaceConfiguration(originalWsConfig)

        where:
        distribution                         | buildScansEnabled | offlineMode | autoSync | showConsole | showExecutions
        GradleDistribution.forVersion('3.5') | false             | false       | true     | false       | true
        GradleDistribution.forVersion('3.4') | false             | true        | false    | true        | false
        GradleDistribution.forVersion('3.3') | true              | false       | false    | true        | false
        GradleDistribution.forVersion('3.2') | true              | true        | true     | false       | true
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/launch/ExternalLaunchConfigurationManagerTest.groovy`
#### Snippet
```java
    private ILaunchConfiguration createJdtLaunchConfigFor(IJavaProject javaProject, Map<String, String> attributes = [:]) {
        IProject project = javaProject.project
        ILaunchConfigurationWorkingCopy launchConfig = createLaunchConfig(SupportedLaunchConfigType.JDT_JAVA_APPLICATION.id)
        launchConfig.setAttribute(ATTR_PROJECT_NAME, project.name)
        attributes.each { String k, String v -> launchConfig.setAttribute(k, v) }
        launchConfig.doSave()
    }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/launch/RunGradleTestLaunchRequestJobTest.groovy`
#### Snippet
```java
        then:
        assertTestExecuted('MyTest1#test1_1')
        assertTestExecuted('MyTest1#test1_2')
        assertTestExecuted('MyTest1#test1_3')
        assertTestNotExecuted('MyTest2#test2_1')
        assertTestNotExecuted('MyTest2#test2_2')
        assertTestNotExecuted('MyTest2#test2_3')
        assertTestNotExecuted('MyTest3#test3_1')
        assertTestNotExecuted('MyTest3#test3_2')
        assertTestNotExecuted('MyTest3#test3_3')
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/preferences/DefaultModelPersistenceTest.groovy`
#### Snippet
```java
        setup:
        def buildDir = new Path('buildDir')
        def buildScriptPath = new Path('build.gradle')
        def subProjectPaths = [new Path('subproject')]
        def classpath = [JavaCore.newProjectEntry(new Path('/project-path'))]
        def derivedResources = [new Path('derived')]
        def linkedResources = [project.getFolder('linked')]
        def managedNatures = ['org.eclipse.pde.UpdateSiteNature']
        def command = project.description.newCommand()
        command.setBuilderName('custom-command')
        def managedBuilders = [command]
        def hasAutoBuildTasks = true
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/preferences/DefaultModelPersistenceTest.groovy`
#### Snippet
```java
        setup:
        def buildDir = new Path('buildDir')
        def buildScriptPath = new Path('build.gradle')
        def subProjectPaths = [new Path('subproject')]
        def classpath = [JavaCore.newProjectEntry(new Path('/project-path'))]
        def derivedResources = [new Path('derived')]
        def linkedResources = [project.getFolder('linked')]
        def managedNatures = ['org.eclipse.pde.UpdateSiteNature']
        def command = project.description.newCommand()
        command.setBuilderName('custom-command')
        def managedBuilders = [command]
        def hasAutoBuildTasks = false
        def gradleVersion = GradleVersion.version('5.6')
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/Combinations.java`
#### Snippet
```java
        Preconditions.checkNotNull(lists);

        if (lists.length == 0) {
            return ImmutableList.of();
        }

        ImmutableMap.Builder<Integer, List<?>> listsMappedByDepth = ImmutableMap.builder();
        for (int i = 0; i < lists.length; i++) {
            listsMappedByDepth.put(i, lists[i]);
        }

        return getCombinationsRecursive(listsMappedByDepth.build(), 0, new Object[(lists.length)]);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/Combinations.java`
#### Snippet
```java
        ImmutableList.Builder<List<Object>> result = ImmutableList.builder();
        Collection<?> listAtCurrentDepth = lists.get(depth);
        for (Object element : listAtCurrentDepth) {
            current[depth] = element;
            if (depth < lists.size() - 1) {
                result.addAll(getCombinationsRecursive(lists, depth + 1, current));
            } else {
                result.add(Lists.newArrayList(current)); // use ArrayList to support null values
            }
        }
        return result.build();
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/EclipseProjects.groovy`
#### Snippet
```java
    static IProject newProject(String name, File location) {
        def workspace = LegacyEclipseSpockTestHelper.workspace
        IProjectDescription projectDescription = workspace.newProjectDescription(name)
        projectDescription.setLocation(location == null ? null : new Path(location.absolutePath))
        IProject project = workspace.getRoot().getProject(name)
        project.create(projectDescription, null)
        project.open(null)
        project
    }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/EclipseProjects.groovy`
#### Snippet
```java
        IProject project = newProject(name, location)
        IProjectDescription description = project.description
        description.natureIds = description.natureIds + JavaCore.NATURE_ID
        project.setDescription(description, null)
        IJavaProject javaProject = JavaCore.create(project)
        project.getFolder('src').create(true, false, null)
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionConstraints.java`
#### Snippet
```java
        Preconditions.checkNotNull(constraint);

        String trimmed = constraint.trim();

        // exclusive patterns
        if (trimmed.equals(CURRENT)) {
            final GradleVersion current = GradleVersion.current();
            return new Predicate<GradleVersion>() {

                @Override
                public boolean apply(GradleVersion element) {
                    return element.equals(current);
                }
            };
        }
        if (trimmed.equals(NOT_CURRENT)) {
            final GradleVersion current = GradleVersion.current();
            return new Predicate<GradleVersion>() {

                @Override
                public boolean apply(GradleVersion element) {
                    return !element.equals(current);
                }
            };
        }
        if (trimmed.startsWith(EQUALS)) {
            final GradleVersion target = GradleVersion.version(trimmed.substring(1)).getBaseVersion();
            return new Predicate<GradleVersion>() {

                @Override
                public boolean apply(GradleVersion element) {
                    return element.getBaseVersion().equals(target);
                }
            };
        }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionConstraints.java`
#### Snippet
```java
final List<Predicate<GradleVersion>> predicates = new ArrayList<Predicate<GradleVersion>>();
        String[] patterns = trimmed.split("\\s+");
        for (String value : patterns) {
            if (value.startsWith(NOT_EQUALS)) {
                final GradleVersion version = GradleVersion.version(value.substring(2));
                predicates.add(new Predicate<GradleVersion>() {

                    @Override
                    public boolean apply(GradleVersion element) {
                        return !element.getBaseVersion().equals(version);
                    }
                });
            } else if (value.startsWith(GREATER_THAN_OR_EQUALS)) {
                final GradleVersion minVersion = GradleVersion.version(value.substring(2));
                predicates.add(new Predicate<GradleVersion>() {

                    @Override
                    public boolean apply(GradleVersion element) {
                        return element.getBaseVersion().compareTo(minVersion) >= 0;
                    }
                });
            } else if (value.startsWith(GREATER_THAN)) {
                final GradleVersion minVersion = GradleVersion.version(value.substring(1));
                predicates.add(new Predicate<GradleVersion>() {

                    @Override
                    public boolean apply(GradleVersion element) {
                        return element.getBaseVersion().compareTo(minVersion) > 0;
                    }
                });
            } else if (value.startsWith(SMALLER_THAN_OR_EQUALS)) {
                final GradleVersion maxVersion = GradleVersion.version(value.substring(2));
                predicates.add(new Predicate<GradleVersion>() {

                    @Override
                    public boolean apply(GradleVersion element) {
                        return element.getBaseVersion().compareTo(maxVersion) <= 0;
                    }
                });
            } else if (value.startsWith(SMALLER_THAN)) {
                final GradleVersion maxVersion = GradleVersion.version(value.substring(1));
                predicates.add(new Predicate<GradleVersion>() {

                    @Override
                    public boolean apply(GradleVersion element) {
                        return element.getBaseVersion().compareTo(maxVersion) < 0;
                    }
                });
            } else {
                throw new RuntimeException(String
                        .format("Unsupported version range '%s' specified in constraint '%s'. Supported formats: '>=nnn' or '<=nnn' or space-separate patterns", value, constraint));
            }
        }

        return new Predicate<GradleVersion>() {

            @Override
            public boolean apply(GradleVersion element) {
                for (Predicate<GradleVersion> predicate : predicates) {
                    if (!predicate.apply(element)) {
                        return false;
                    }
                }
                return true;
            }
        };
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionParameterization.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        Predicate<GradleVersion> matchingVersions = Predicates.and(versionConstraint, toolingApiConstraint, javaVersionConstraint);

        ImmutableList<GradleVersion> configuredGradleVersions = this.gradleVersionProvider.getConfiguredGradleVersions();
        ImmutableList<GradleVersion> result = FluentIterable.from(configuredGradleVersions).filter(matchingVersions).toList();

        if (!result.isEmpty()) {
            return result;
        }

        Optional<GradleVersion> singleVersion = FluentIterable.from(this.gradleVersionProvider.getConfiguredGradleVersions(GradleVersionProvider.ALL)).filter(matchingVersions).last();
        if (!singleVersion.isPresent()) {
            throw new RuntimeException("No released Gradle version matches to the pattern " + gradleVersionPattern);
        }
        return ImmutableList.of(singleVersion.get());
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/GradleVersionProvider.java`
#### Snippet
```java
        LOG.debug("Applying version range pattern '{}'", pattern);

        // add matching versions to set to avoid potential duplicates (e.g. when current == latest)
        ImmutableSet<GradleVersion> configuredGradleVersions;
        if (pattern.equals(ALL)) {
            configuredGradleVersions = ImmutableSet.<GradleVersion> builder().add(GradleVersion.current()).addAll(this.releasedVersions.getAll()).build();
        } else if (pattern.equals(LATEST)) {
            configuredGradleVersions = ImmutableSet.<GradleVersion> builder().add(GradleVersion.current()).add(this.releasedVersions.getLatest()).build();
        } else if (pattern.matches("^\\d.*$")) {
            configuredGradleVersions = FluentIterable.from(Splitter.on(',').split(pattern)).transform(new Function<String, GradleVersion>() {

                @Override
                public GradleVersion apply(String input) {
                    return GradleVersion.version(input);
                }
            }).toSet();
        } else {
            throw new RuntimeException("Invalid range pattern: " + pattern + " (valid values: 'all', 'latest', or comma separated list of versions)");
        }

        return Ordering.natural().reverse().immutableSortedCopy(configuredGradleVersions);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/ReleasedGradleVersions.java`
#### Snippet
```java
        PublishedGradleVersions publishedGradleVersions = PublishedGradleVersions.create(PublishedGradleVersions.LookupStrategy.REMOTE);
        ImmutableSet<GradleVersion> nonMilestoneReleases = FluentIterable.from(publishedGradleVersions.getVersions()).filter(new Predicate<GradleVersion>() {

            @Override
            public boolean apply(GradleVersion version) {
                return !version.getVersion().contains("-milestone-");
            }
        }).toSet();
        return createFromGradleVersions(nonMilestoneReleases);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/TestEnvironment.groovy`
#### Snippet
```java
/*******************************************************************************
 * Copyright (c) 2019 Gradle Inc. and others
 *
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/TestProcessStreamProvider.groovy`
#### Snippet
```java
/*******************************************************************************
 * Copyright (c) 2019 Gradle Inc. and others
 *
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/WorkspaceSpecification.groovy`
#### Snippet
```java
    protected void deleteAllProjects(boolean includingContent) {
        for (IProject project : CorePlugin.workspaceOperations().allProjects) {
             try {
                project.delete(includingContent, true, null)
            } catch(CoreException e) {
               CorePlugin.logger().warn("Cannot delete test project ${project.name}; falling back to workspace cleaning", e)
               project.delete(false, true, null)
            }
        }
        workspaceDir.listFiles().findAll { it.isDirectory() && it.name != '.metadata' }.each { File it -> it.deleteDir() }
    }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.ui.test/src/main/groovy/org/eclipse/buildship/ui/internal/test/fixtures/SwtBotSpecification.groovy`
#### Snippet
```java
        for (IProject project : CorePlugin.workspaceOperations().allProjects) {
            try {
                project.delete(includingContent, true, null)
            } catch(CoreException e) {
               CorePlugin.logger().warn("Cannot delete test project ${project.name}; falling back to workspace cleaning", e)
               project.delete(false, true, null)
            }
        }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/WorkspaceSpecification.groovy`
#### Snippet
```java
    protected BuildConfiguration createOverridingBuildConfiguration(File projectDir, GradleDistribution distribution = GradleDistribution.fromBuild(),
                                                                  boolean buildScansEnabled = false, boolean offlineMode = false, boolean autoSync = false, File gradleUserHome = null, File javaHome = null,
                                                                  List<String> arguments = [], List<String> jvmArguments = [], boolean showConsoleView = true, boolean showExecutionsView = true) {
        configurationManager.createBuildConfiguration(projectDir, true, distribution, gradleUserHome, javaHome, buildScansEnabled, offlineMode, autoSync, arguments, jvmArguments, showConsoleView, showExecutionsView)
    }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/test/fixtures/WorkspaceSpecification.groovy`
#### Snippet
```java
    private class LogCollector implements ILogListener {

        private final List<IStatus> entries = new ArrayList()

        @Override
        public synchronized void logging(IStatus status, String plugin) {
            entries.add(status)
        }

        synchronized void clear() {
            entries.clear()
        }

        synchronized List<IStatus> getAll() {
            ImmutableList.copyOf(entries)
        }
    }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/util/file/RelativePathUtilsTest.groovy`
#### Snippet
```java
        then:
        thrown expected

        where:
        basePath                     | targetPath                   | expected
        null                         | new Path('.')                | NullPointerException
        new Path('.')                | null                         | NullPointerException
        new Path('.').makeRelative() | new Path('.')                | IllegalArgumentException
        new Path('.')                | new Path('.').makeRelative() | IllegalArgumentException
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/util/gradle/GradleVersionTest.groovy`
#### Snippet
```java
        expect:
        GradleVersion.version(a) > GradleVersion.version(b)
        GradleVersion.version(b) < GradleVersion.version(a)
        GradleVersion.version(a) == GradleVersion.version(a)
        GradleVersion.version(b) == GradleVersion.version(b)

        where:
        a      | b
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/BuildCommandUpdaterTest.groovy`
#### Snippet
```java
        given:
        def project = newProject('sample-project')
        def description = project.description
        def command = description.newCommand()
        command.setBuilderName('manuallyCreatedBuildCommand')
        command.setArguments([:])
        def commands = description.buildSpec + command
        description.setBuildSpec(commands as ICommand[])
        project.setDescription(description, new NullProgressMonitor())
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ClasspathContainerOrderingTest.groovy`
#### Snippet
```java
        setup:
        File location = dir('sample-project') {
            file('build.gradle') << "apply plugin: 'java'"
        }

        when:
        importAndWait(location, GradleDistribution.forVersion('2.14.1'))
        IProject project = findProject('sample-project')

        then:
        assertClasspatContent(project, JRE_CONTAINER, GRADLE_CONTAINER)

        when:
        synchronizeAndWait(project)
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ClasspathContainerUpdaterTest.groovy`
#### Snippet
```java
        setup:
        IJavaProject project = newJavaProject('project-with-classpath-container')
        IAccessRule[] rules = [JavaCore.newAccessRule(new Path('accessiblePattern'), IAccessRule.K_ACCESSIBLE)]
        IClasspathAttribute[] attributes = [JavaCore.newClasspathAttribute('attributeKey', 'attributeValue')]
        IClasspathEntry[] classpath = project.rawClasspath + JavaCore.newContainerEntry(CUSTOM_USER_CONTAINER, rules, attributes, true)
        project.setRawClasspath(classpath, new NullProgressMonitor())

        when:
        executeContainerUpdate(project)
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ClasspathContainerUpdaterTest.groovy`
#### Snippet
```java
        setup:
        IJavaProject project = newJavaProject('sample-project')
        def updatedClasspath = project.rawClasspath.findAll { !it.path.segment(0).equals(JavaRuntime.JRE_CONTAINER) }
        updatedClasspath += JavaCore.newContainerEntry(DEFAULT_JAVA_8_CONTAINER)
        updatedClasspath += JavaCore.newContainerEntry(CUSTOM_JRE_CONTAINER)
        project.setRawClasspath(updatedClasspath as IClasspathEntry[], null)

        expect:
        findContainer(project, DEFAULT_JAVA_8_CONTAINER)
        findContainer(project, CUSTOM_JRE_CONTAINER)

        when:
        executeContainerUpdateWithOldGradle(project)
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ClasspathContainerUpdaterTest.groovy`
#### Snippet
```java
        def updatedClasspath = project.rawClasspath.findAll { !it.path.segment(0).equals(JavaRuntime.JRE_CONTAINER) }
        updatedClasspath += JavaCore.newContainerEntry(DEFAULT_JAVA_8_CONTAINER)
        updatedClasspath += JavaCore.newContainerEntry(CUSTOM_JRE_CONTAINER)
        project.setRawClasspath(updatedClasspath as IClasspathEntry[], null)

        expect:
        findContainer(project, DEFAULT_JAVA_8_CONTAINER)
        findContainer(project, CUSTOM_JRE_CONTAINER)
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ClasspathContainerUpdaterTest.groovy`
#### Snippet
```java
        given:
        IJavaProject project = newJavaProject('sample-project')
        def updatedClasspath = project.rawClasspath.findAll { !it.path.segment(0).equals(JavaRuntime.JRE_CONTAINER) }
        updatedClasspath += JavaCore.newContainerEntry(new Path('org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/custom'))
        project.setRawClasspath(updatedClasspath as IClasspathEntry[], null)

        expect:
        project.rawClasspath.find {
            it.path.toPortableString().equals('org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/custom')
        }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ClasspathContainerUpdaterTest.groovy`
#### Snippet
```java
    private EclipseJavaSourceSettings sourceSettings(String sourceVersion, String targetVersion) {
        InstalledJdk jdk = Mock(InstalledJdk)
        jdk.javaHome >> new File(System.getProperty('java.home'))
        jdk.javaVersion >> JavaVersion.current()

        EclipseJavaSourceSettings settings = Mock(EclipseJavaSourceSettings)
        settings.jdk >> jdk
        settings.sourceLanguageLevel >> JavaVersion.toVersion(sourceVersion)
        settings.targetBytecodeVersion >> JavaVersion.toVersion(targetVersion)

        settings
    }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerUpdaterTest.groovy`
#### Snippet
```java
        def gradleProject = gradleProjectWithClasspath(
            externalDependency(file)
        )
        PersistentModelBuilder persistentModel = persistentModelBuilder(project.project)

        when:
        Set allProjects = HierarchicalElementUtils.getAll(gradleProject).toSet()
        GradleClasspathContainerUpdater.updateFromModel(project, gradleProject, allProjects, persistentModel, null, null)

        then:
        resolvedClasspath[0].entryKind == IClasspathEntry.CPE_LIBRARY
        resolvedClasspath[0].path.toFile() == file.absoluteFile
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/GradleClasspathContainerUpdaterTest.groovy`
#### Snippet
```java
        given:
        def gradleProject = gradleProjectWithClasspath(
            externalDependency(new File(path))
        )
        PersistentModelBuilder persistentModel = persistentModelBuilder(project.project)

        when:
        Set allProjects = HierarchicalElementUtils.getAll(gradleProject).toSet()
        GradleClasspathContainerUpdater.updateFromModel(project, gradleProject, allProjects, persistentModel, null, null)

        then:
        resolvedClasspath[0].entryKind == IClasspathEntry.CPE_LIBRARY
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ImportingProjectCrossVersionTest.groovy`
#### Snippet
```java
        when:
        importAndWait(compositeProjectDir, distribution)

        then:
        allProjects().size() == 7
        findProject('root')
        findProject('included1')
        findProject('included2')
        findProject('included1-sub1')
        findProject('included1-sub2')
        findProject('included2-sub1')
        findProject('included2-sub2')
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ImportingWtpProjects.groovy`
#### Snippet
```java
        wtpinstalled = true

        when:
        SynchronizationResult result = tryImportAndWait(root)
        IProject project = findProject('project')

        then:
        result.status.severity == IStatus.ERROR
        gradleErrorMarkers.size() == 1
        gradleErrorMarkers[0].getAttribute(IMarker.MESSAGE) == "WTP currently does not support mixed deployment paths."
        gradleErrorMarkers[0].getResource() == project.getFile('build.gradle')
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ImportingWtpProjects.groovy`
#### Snippet
```java
        when:
        SynchronizationResult result = tryImportAndWait(root)
        IProject project = findProject('project')

        then:
        result.status.severity == IStatus.ERROR
        gradleErrorMarkers.size() == 1
        gradleErrorMarkers[0].getAttribute(IMarker.MESSAGE) == "WTP currently does not support mixed deployment paths."
        gradleErrorMarkers[0].getResource() == project.getFile('build.gradle')
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ImportingWtpProjects.groovy`
#### Snippet
```java
        setup:
        File root = dir("project") {
            file 'build.gradle', """
                apply plugin: 'java'
                ${jcenterRepositoryBlock}
                dependencies {
                    implementation "junit:junit:4.12"
                }
            """
        }
        wtpinstalled = true

        when:
        importAndWait(root)

        then:
        def project = findProject('project')
        IClasspathEntry dependency = resolvedClasspath(project).find { it.path.lastSegment() == 'junit-4.12.jar' }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/ImportingWtpProjects.groovy`
#### Snippet
```java
        setup:
        File root = dir("project") {
            file 'build.gradle', """
                apply plugin: 'war'
                ${jcenterRepositoryBlock}
                dependencies {
                    implementation "junit:junit:4.12"
                }
            """
        }
        wtpinstalled = true

        when:
        importAndWait(root)

        then:
        def project = findProject('project')
        IClasspathEntry dependency = rawClasspath(project).find { it.path == GradleClasspathContainer.CONTAINER_PATH }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/JavaSourceSettingsUpdaterTest.groovy`
#### Snippet
```java
        given:
        IJavaProject project = newJavaProject('sample-project')

        when:
        JavaSourceSettingsUpdater.update(project, modelProject(sourceVersion, targetVersion), new NullProgressMonitor())

        then:
        project.getOption(JavaCore.COMPILER_COMPLIANCE, true) == sourceVersion
        project.getOption(JavaCore.COMPILER_SOURCE, true) == sourceVersion
        project.getOption(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, true) == targetVersion
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/LinkedResourcesUpdaterTest.groovy`
#### Snippet
```java
    def "Can define a linked resource"() {
        given:
        File externalDir = dir('another')
        IProject project = newProject('project-name')
        EclipseLinkedResource linkedResource =  newFolderLinkedResource(externalDir.name, externalDir)
        PersistentModelBuilder persistentModel = persistentModelBuilder(project)

        when:
        LinkedResourcesUpdater.update(project, [linkedResource], persistentModel, new NullProgressMonitor())
        Collection<IResource> linkedresources = linkedResources(project)

        then:
        linkedresources.size() == 1
        linkedresources[0].name == 'another'
        linkedresources[0].exists()
        linkedresources[0].location.toFile().canonicalPath.equals(externalDir.canonicalPath)
    }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/LinkedResourcesUpdaterTest.groovy`
#### Snippet
```java
        EclipseLinkedResource linkedResource =  newFolderLinkedResource(externalDir.name, externalDir)
        PersistentModelBuilder persistentModel = persistentModelBuilder(project)

        when:
        LinkedResourcesUpdater.update(project, [linkedResource], persistentModel, new NullProgressMonitor())
        Collection<IResource> linkedResources = linkedResources(project)

        then:
        linkedResources.size() == 1
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/SingleProjectSynchronizationSpecification.groovy`
#### Snippet
```java
        setup:
        prepareJavaProject('sample-project')
        def projectDir = dir('sample-project') {
            file 'build.gradle', """
                apply plugin: 'java'
                sourceCompatibility = 1.2
                targetCompatibility = 1.3
            """
            dir 'src/main/java'
        }

        when:
        importAndWait(projectDir, distribution)
        IJavaProject javaProject = findJavaProject('sample-project')
        String sourceCompliance = javaProject.getOption(JavaCore.COMPILER_COMPLIANCE, true)
        String sourceCompatibility = javaProject.getOption(JavaCore.COMPILER_SOURCE, true)
        String targetCompatibility = javaProject.getOption(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, true)
        String currentJavaVersion = JavaVersionUtil.adaptVersionToEclipseNamingConversions(JavaVersion.current())
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/SingleProjectSynchronizationSpecification.groovy`
#### Snippet
```java
        IJavaProject javaProject = findJavaProject('sample-project')
        String sourceCompliance = javaProject.getOption(JavaCore.COMPILER_COMPLIANCE, true)
        String sourceCompatibility = javaProject.getOption(JavaCore.COMPILER_SOURCE, true)
        String targetCompatibility = javaProject.getOption(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, true)
        String currentJavaVersion = JavaVersionUtil.adaptVersionToEclipseNamingConversions(JavaVersion.current())

        then:
        sourceCompliance == JavaCore.VERSION_1_2
        sourceCompatibility == JavaCore.VERSION_1_2
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/SingleProjectSynchronizationSpecification.groovy`
#### Snippet
```java
        setup:
        prepareJavaProject('sample-project')
        def projectDir = dir('sample-project') {
            file 'build.gradle', '''
                apply plugin: 'java'

                sourceSets {
                    main {
                        java {
                            exclude 'excludePattern'
                            include 'includePattern'
                        }
                    }
                }
            '''
            dir 'src/main/java'
        }

        when:
        importAndWait(projectDir, distribution)
        IJavaProject javaProject = findJavaProject('sample-project')
        IClasspathEntry sourceDir = javaProject.rawClasspath.find { it.entryKind == IClasspathEntry.CPE_SOURCE && it.path.toPortableString() == '/sample-project/src/main/java' }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/SingleProjectSynchronizationSpecification.groovy`
#### Snippet
```java
        setup:
        prepareProject('sample-project')
        def projectDir = dir('sample-project') {
            file 'build.gradle', """
                apply plugin: 'java'
                apply plugin: 'eclipse'
                eclipse {
                    classpath {
                        containers 'custom.container', 'second.container'
                    }
                }
            """
            dir 'src/main/java'
        }

        when:
        importAndWait(projectDir, distribution)
        List containers = findJavaProject('sample-project').rawClasspath.findAll { it.entryKind == IClasspathEntry.CPE_CONTAINER }.collect { it.path.segment(0) }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/SingleProjectSynchronizationSpecification.groovy`
#### Snippet
```java
        setup:
        prepareProject('sample-project')
        def projectDir = dir('sample-project') {
            dir 'src/main/java'
            file 'build.gradle', """
                apply plugin: 'java'
                apply plugin: 'eclipse'
                eclipse {
                    classpath {
                        file {
                            whenMerged { classpath ->
                                def src = classpath.entries.find { it.path == 'src/main/java' }
                                src.output = 'target/classes'
                            }
                        }
                    }
                }
            """
        }

        when:
        importAndWait(projectDir, distribution)
        IClasspathEntry sourceDir = findJavaProject('sample-project').rawClasspath.find { it.path.toPortableString() == '/sample-project/src/main/java' }
        String outputLocation = sourceDir.outputLocation?.toPortableString()
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/SourceFolderUpdaterTest.groovy`
#### Snippet
```java
        srcNew.create(true, true, null)
        def newModelSourceFolders = gradleSourceFoldersWithoutAttributes([srcNew.name])

        when:
        SourceFolderUpdater.update(javaProject, newModelSourceFolders, null)

        then:
        javaProject.rawClasspath.length == 1
        javaProject.rawClasspath[0].entryKind == IClasspathEntry.CPE_SOURCE
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core.test/src/main/groovy/org/eclipse/buildship/core/internal/workspace/SynchronizingRenamedProject.groovy`
#### Snippet
```java
        def alreadyThere = newProject("already-there")

        expect:
        findProject(sample.name)

        when:
        renameInGradle(sample, "already-there")
        SynchronizationResult result = trySynchronizeAndWait(sample)

        then:
        result.status.exception instanceof UnsupportedConfigurationException
        findProject('already-there') == alreadyThere
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/launch/GradleRunConfigurationAttributes.java`
#### Snippet
```java
        String workingDirExpression = getStringAttribute(WORKING_DIR, "", launchConfiguration);

        String gradleDistribution = getStringAttribute(GRADLE_DISTRIBUTION, GradleDistribution.fromBuild().toString(), launchConfiguration);
        String gradleUserHomeExpression = getStringAttribute(GRADLE_USER_HOME, null, launchConfiguration);
        String javaHomeExpression = getStringAttribute(JAVA_HOME, null, launchConfiguration);
        List<String> jvmArgumentExpressions = getListAttribute(JVM_ARGUMENTS, launchConfiguration);
        List<String> argumentExpressions = getListAttribute(ARGUMENTS, launchConfiguration);
        boolean showExecutionView = getBooleanAttribute(SHOW_EXECUTION_VIEW, true, launchConfiguration);
        boolean showConsoleView = getBooleanAttribute(SHOW_CONSOLE_VIEW, true, launchConfiguration);
        boolean overrideWorkspaceSettings = getBooleanAttribute(OVERRIDE_BUILD_SETTINGS, false, launchConfiguration);
        boolean isOffline = getBooleanAttribute(OFFLINE_MODE, false, launchConfiguration);
        boolean isBuildScansEnabled = getBooleanAttribute(BUILD_SCANS_ENABLED, false, launchConfiguration);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/DefaultWorkspaceOperations.java`
#### Snippet
```java
            IProject project = workspace.getRoot().getProject(name);
            project.create(projectDescription, progress.newChild(1));

            // open the project
            project.open(IResource.NONE, progress.newChild(1));

            // add project natures separately to trigger IProjectNature#configure
            // the project needs to be open while the natures are added
            SubMonitor natureProgress = progress.newChild(1).setWorkRemaining(natureIds.size());
            for (String natureId : natureIds) {
                addNature(project, natureId, natureProgress.newChild(1));
            }

            // return the created, open project
            return project;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.oomph.test/src/main/groovy/org/eclipse/buildship/oomph/internal/test/GradleImportTaskTest.groovy`
#### Snippet
```java
        def location = dir('manual-sync') {
            file 'build.gradle', '''
                plugins {
                    id 'java-library'
                }
            '''
            dir('src/main/java') {
                file 'A.java', ''
            }
            file 'settings.gradle','rootProject.name = "ManualSync"'
        }
        importAndWait(location)
        importTask.sourceLocators.add(ResourcesFactoryImpl.eINSTANCE.createSourceLocator(location.absolutePath))

        expect:
        findProject("ManualSync")

        when:
        changeProjectName(location, "ManualSyncChanged")
        importTask.perform(setupTaskContext)
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.ui.test/src/main/groovy/org/eclipse/buildship/ui/internal/view/task/BuildInvocationsTest.groovy`
#### Snippet
```java
        ModelProvider modelProvider = CorePlugin.internalGradleWorkspace().getBuild(project).get().modelProvider
        Map<String, EclipseProject> eclipseProjects = modelProvider.fetchModels(EclipseProject, FetchStrategy.LOAD_IF_NOT_CACHED, GradleConnector.newCancellationTokenSource(), new NullProgressMonitor())
        GradleProject gradleProject = eclipseProjects[':'].gradleProject
        Map<Path, BuildInvocations> pathToBuildInvocations = BuildInvocations.collectAll(gradleProject)
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.ui.test/src/main/groovy/org/eclipse/buildship/ui/internal/view/task/CreateAndOpenRunConfigurationActionTest.groovy`
#### Snippet
```java
        def selection = NodeSelection.from(new StructuredSelection(taskNode))

        expect:
        createAction.isVisibleFor(selection) != runConfigurationAlreadyExists
        createAction.isEnabledFor(selection) != runConfigurationAlreadyExists
        openAction.isVisibleFor(selection) == runConfigurationAlreadyExists
        openAction.isEnabledFor(selection) == runConfigurationAlreadyExists

        where:
        runConfigurationAlreadyExists << [true, false]
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.ui.test/src/main/groovy/org/eclipse/buildship/ui/internal/view/task/CreateAndOpenRunConfigurationActionTest.groovy`
#### Snippet
```java
        def selection = NodeSelection.from(new StructuredSelection([projectNode1, projectNode2]))

        expect:
        createAction.isVisibleFor(selection)
        !createAction.isEnabledFor(selection)
        !openAction.isVisibleFor(selection)
        !openAction.isEnabledFor(selection)

        where:
        runConfigurationAlreadyExists << [true, false]
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/console/RemoveAllTerminatedGradleConsolesAction.java`
#### Snippet
```java
        Optional<ProcessDescription> processDescription = this.gradleConsole.getProcessDescription();
        if (processDescription.isPresent()) {
            Job job = processDescription.get().getJob();
            job.addJobChangeListener(new JobChangeAdapter() {

                @Override
                public void done(IJobChangeEvent event) {
                    update();
                }
            });
            update();
        } else {
            // if no job is associated with the console, never enable this action
            setEnabled(false);
        }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectTab.java`
#### Snippet
```java
        this.workingDirectoryText = new Text(container, SWT.SINGLE | SWT.BORDER);
        this.workingDirectoryText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        this.workingDirectoryText.addModifyListener(new DialogUpdater());

        Composite buttonContainer = new Composite(container, SWT.NONE);
        GridLayout buttonContainerLayout = new GridLayout(3, false);
        buttonContainerLayout.marginHeight = 1;
        buttonContainerLayout.marginWidth = 0;
        buttonContainer.setLayout(buttonContainerLayout);
        buttonContainer.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

        Button browseWorkspaceButton = new Button(buttonContainer, SWT.NONE);
        browseWorkspaceButton.setText(LaunchMessages.Button_Label_BrowseWorkspace);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectTab.java`
#### Snippet
```java
                ListDialog projectDialog = new ListDialog(getShell());
                projectDialog.setTitle(LaunchMessages.Title_BrowseWorkspaceDialog);
                projectDialog.setContentProvider(new ArrayContentProvider() {

                    @Override
                    public Object[] getElements(Object input) {
                        return findAllGradleProjects();
                    }

                });
                projectDialog.setLabelProvider(new WorkbenchLabelProvider());
                projectDialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

                // open the dialog and put the path of the selected project into the working directory text field
                projectDialog.open();
                Object[] result = projectDialog.getResult();
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectTab.java`
#### Snippet
```java
        Button browseFilesystemButton = new Button(buttonContainer, SWT.NONE);
        browseFilesystemButton.setText(LaunchMessages.Button_Label_BrowseFilesystem);
        browseFilesystemButton.addSelectionListener(new DirectoryDialogSelectionListener(getShell(), this.workingDirectoryText, LaunchMessages.Title_BrowseFileSystemDialog));

        Button selectVariableButton = new Button(buttonContainer, SWT.NONE);
        selectVariableButton.setText(LaunchMessages.Button_Label_SelectVariables);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/launch/ProjectTab.java`
#### Snippet
```java
        String workingDirectoryExpression = this.workingDirectoryText.getText();

        String workingDirectoryResolved;
        try {
            workingDirectoryResolved = ExpressionUtils.decode(workingDirectoryExpression);
        } catch (CoreException e) {
            setErrorMessage(NLS.bind(LaunchMessages.ErrorMessage_CannotResolveExpression_0, workingDirectoryExpression));
            return false;
        }

        File workingDir = FileUtils.getAbsoluteFile(workingDirectoryResolved).orNull();
        Optional<String> error = this.workingDirValidator.validate(workingDir);
        setErrorMessage(error.orNull());
        return !error.isPresent();
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/preferences/GradleProjectPreferencePage.java`
#### Snippet
```java
        AdvancedOptionsGroup advancedOptionsGroup = this.gradleProjectSettingsComposite.getAdvancedOptionsGroup();
        advancedOptionsGroup.getGradleUserHomeText().addModifyListener(new ValidatingListener<>(this, () -> advancedOptionsGroup.getGradleUserHome(), this.gradleUserHomeValidator));
        advancedOptionsGroup.getJavaHomeText().addModifyListener(new ValidatingListener<>(this, () -> advancedOptionsGroup.getJavaHome(), this.javaHomeValidator));
        this.gradleProjectSettingsComposite.getGradleDistributionGroup().addDistributionChangedListener(new GradleDistributionValidatingListener(this, this.distributionValidator));
```

### DuplicatedCode
Duplicated code
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/wizard/project/GradleProjectWizardPage.java`
#### Snippet
```java
        Group workingSetGroup = uiBuilderFactory.newGroup(root).text(ProjectWizardMessages.Group_Label_WorkingSets).control();
        GridLayoutFactory.swtDefaults().applyTo(workingSetGroup);
        GridDataFactory.swtDefaults().align(SWT.FILL, SWT.TOP).grab(true, false).span(3, SWT.DEFAULT).applyTo(workingSetGroup);

        this.workingSetConfigurationWidget = new WorkingSetConfigurationWidget(new String[] { UiPluginConstants.RESOURCE, UiPluginConstants.JAVA }, UiPlugin.getInstance().getDialogSettings());
        this.workingSetConfigurationWidget.createContent(workingSetGroup);
        this.workingSetConfigurationWidget.modifyCurrentWorkingSetItem(WorkingSetUtils.toWorkingSets(getConfiguration().getWorkingSets().getValue()));
        this.workingSetConfigurationWidget.getWorkingSetsEnabledButton().setSelection(getConfiguration().getApplyWorkingSets().getValue());
        this.workingSetConfigurationWidget.getWorkingSetsCombo().setEnabled(getConfiguration().getApplyWorkingSets().getValue());
        this.workingSetConfigurationWidget.getWorkingSetsSelectButton().setEnabled(getConfiguration().getApplyWorkingSets().getValue());
```

## RuleId[id=CatchMayIgnoreException]
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

## RuleId[id=ProtectedMemberInFinalClass]
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
public final class GradleEditor extends TextEditor {
    @Override
    protected void initializeEditor() {
        super.initializeEditor();
        setSourceViewerConfiguration(new GradleTextViewerConfiguration());
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

## RuleId[id=SuspiciousMethodCalls]
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
    private static final long SOFT_MAX_EXPAND_TIME = 200;

    /**
     * Get image descriptors for the clear button.
     */
```

## RuleId[id=InnerClassMayBeStatic]
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/selection/SelectionUtils.java`
#### Snippet
```java
                // compare the ids and secondary ids (the ids are never null, the secondary ids can
                // be null)
                if (currentReference.getId().equals(viewSite.getId()) && Objects.equal(currentReference.getSecondaryId(), viewSite.getSecondaryId())) {
                    return true;
                }
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
                        long stopTime = SOFT_MAX_EXPAND_TIME + System.currentTimeMillis();
                        boolean cancel = false;
                        if (items.length > 0 && recursiveExpand(items, monitor, stopTime, new int[] { numVisibleItems })) {
                            cancel = true;
                        }
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/RerunFailedTestsAction.java`
#### Snippet
```java
            if (testFinishEvent.getResult() instanceof TestFailureResult && testFinishEvent.getDescriptor() instanceof JvmTestOperationDescriptor) {
                JvmTestOperationDescriptor descriptor = (JvmTestOperationDescriptor) testFinishEvent.getDescriptor();
                if (descriptor.getJvmTestKind() == JvmTestKind.ATOMIC || descriptor.getJvmTestKind() == JvmTestKind.UNKNOWN) {
                    return true;
                }
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/ExecutionPage.java`
#### Snippet
```java
        if (descriptor instanceof JvmTestOperationDescriptor) {
            JvmTestOperationDescriptor testOperationDescriptor = (JvmTestOperationDescriptor) descriptor;
            if (testOperationDescriptor.getJvmTestKind() == JvmTestKind.SUITE) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/FixedVersionGradleDistribution.java`
#### Snippet
```java
        FixedVersionGradleDistribution other = (FixedVersionGradleDistribution) obj;
        if (this.version == null) {
            if (other.version != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/FixedVersionGradleDistribution.java`
#### Snippet
```java
                return false;
            }
        } else if (!this.version.equals(other.version)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/LocalGradleDistribution.java`
#### Snippet
```java
        LocalGradleDistribution other = (LocalGradleDistribution) obj;
        if (this.location == null) {
            if (other.location != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/LocalGradleDistribution.java`
#### Snippet
```java
                return false;
            }
        } else if (!this.location.equals(other.location)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/RemoteGradleDistribution.java`
#### Snippet
```java
        RemoteGradleDistribution other = (RemoteGradleDistribution) obj;
        if (this.url == null) {
            if (other.url != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/RemoteGradleDistribution.java`
#### Snippet
```java
                return false;
            }
        } else if (!this.url.equals(other.url)) {
            return false;
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
                output = new FileOutputStream(this.propertiesFile);

                output.write(removeTimestampFromTable(this.properties).getBytes("UTF-8")); //$NON-NLS-1$
                output.flush();
            } catch (IOException e) {
```

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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `node` to `TaskSelectorNode` is redundant
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/TaskNodeSelectionUtils.java`
#### Snippet
```java
                        break;
                    case TASK_SELECTOR_NODE:
                        taskStrings.add(((TaskSelectorNode) node).getName());
                        break;
                    default:
```

### RedundantCast
Casting `failure` to `BuildException` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_CANCELLED, workName, failure);
        } else if (failure instanceof BuildException) {
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_FAILED, workName, (BuildException) failure);
        } else if (failure instanceof GradleConnectionException) {
            return new ToolingApiStatus(ToolingApiStatusType.CONNECTION_FAILED, workName, (GradleConnectionException) failure);
```

### RedundantCast
Casting `failure` to `GradleConnectionException` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
            return new ToolingApiStatus(ToolingApiStatusType.BUILD_FAILED, workName, (BuildException) failure);
        } else if (failure instanceof GradleConnectionException) {
            return new ToolingApiStatus(ToolingApiStatusType.CONNECTION_FAILED, workName, (GradleConnectionException) failure);
        } else if (failure instanceof ImportRootProjectException) {
            return new ToolingApiStatus(ToolingApiStatusType.IMPORT_ROOT_DIR_FAILED, workName, (ImportRootProjectException) failure);
```

### RedundantCast
Casting `failure` to `ImportRootProjectException` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
            return new ToolingApiStatus(ToolingApiStatusType.CONNECTION_FAILED, workName, (GradleConnectionException) failure);
        } else if (failure instanceof ImportRootProjectException) {
            return new ToolingApiStatus(ToolingApiStatusType.IMPORT_ROOT_DIR_FAILED, workName, (ImportRootProjectException) failure);
        } else if (failure instanceof UnsupportedConfigurationException) {
            return new ToolingApiStatus(ToolingApiStatusType.UNSUPPORTED_CONFIGURATION, workName, (UnsupportedConfigurationException) failure);
```

### RedundantCast
Casting `failure` to `UnsupportedConfigurationException` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
            return new ToolingApiStatus(ToolingApiStatusType.IMPORT_ROOT_DIR_FAILED, workName, (ImportRootProjectException) failure);
        } else if (failure instanceof UnsupportedConfigurationException) {
            return new ToolingApiStatus(ToolingApiStatusType.UNSUPPORTED_CONFIGURATION, workName, (UnsupportedConfigurationException) failure);
        } else if (failure instanceof CoreException && ((CoreException) failure).getStatus().getException() != null) {
            return from(workName, ((CoreException) failure).getStatus().getException());
```

### RedundantCast
Casting `failure` to `GradlePluginsRuntimeException` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/ToolingApiStatus.java`
#### Snippet
```java
            return from(workName, ((CoreException) failure).getStatus().getException());
        } else if (failure instanceof GradlePluginsRuntimeException) {
            return new ToolingApiStatus(ToolingApiStatusType.PLUGIN_FAILED, workName, (GradlePluginsRuntimeException) failure);
        } else if (failure instanceof UnsupportedJavaVersionException) {
            return new ToolingApiStatus(ToolingApiStatusType.INCOMPATIBILITY_JAVA, workName, failure);
```

### RedundantCast
Casting `configuration` to `BuildConfiguration` is redundant
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/DefaultConfigurationManager.java`
#### Snippet
```java
    public void saveBuildConfiguration(BuildConfiguration configuration) {
        Preconditions.checkArgument(configuration instanceof DefaultBuildConfiguration, "Unknow configuration type: ", configuration.getClass());
        BuildConfigurationProperties properties = ((BuildConfiguration)configuration).getProperties();
        File rootDir = configuration.getRootProjectDirectory();
        Optional<IProject> rootProject = CorePlugin.workspaceOperations().findProjectByLocation(rootDir);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param monitor` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/BasicUIJob.java`
#### Snippet
```java
     * Run the job in the UI Thread.
     *
     * @param monitor
     * @return IStatus
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
     * it is used merely to organize the elements.
     *
     * @param element
     * @return true if this element is eligible for automatic selection
     */
```

### JavadocDeclaration
`@param text` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
     * Take the given filter text and break it down into words using a BreakIterator.
     *
     * @param text
     * @return an array of words
     */
```

### JavadocDeclaration
`@param viewer` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
     * enabled; the computation is done in computeAnyVisible.
     *
     * @param viewer
     * @param parent
     * @param elements the elements (must not be an empty array)
```

### JavadocDeclaration
`@param parent` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
     *
     * @param viewer
     * @param parent
     * @param elements the elements (must not be an empty array)
     * @return true if any of the elements makes it through the filter.
```

### JavadocDeclaration
`@param patternString` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
     * The pattern string for which this filter should select elements in the viewer.
     *
     * @param patternString
     */
    public void setPattern(String patternString) {
```

### JavadocDeclaration
`@param items` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
             * cancellation).
             *
             * @param items
             * @param monitor
             * @param cancelTime
```

### JavadocDeclaration
`@param monitor` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
             *
             * @param items
             * @param monitor
             * @param cancelTime
             * @param numItemsLeft
```

### JavadocDeclaration
`@param cancelTime` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
             * @param items
             * @param monitor
             * @param cancelTime
             * @param numItemsLeft
             * @return true if canceled
```

### JavadocDeclaration
`@param numItemsLeft` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
             * @param monitor
             * @param cancelTime
             * @param numItemsLeft
             * @return true if canceled
             */
```

### JavadocDeclaration
`@param items` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
     * Return the first item in the tree that matches the filter pattern.
     *
     * @param items
     * @return the first matching TreeItem
     */
```

### JavadocDeclaration
`@param parent` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java

        /**
         * @param parent
         * @param style
         */
```

### JavadocDeclaration
`@param style` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
        /**
         * @param parent
         * @param style
         */
        public NotifyingTreeViewer(Composite parent, int style) {
```

### JavadocDeclaration
`@param parent` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
     * Create the filtered tree's controls. Subclasses should override.
     *
     * @param parent
     * @param treeStyle
     */
```

### JavadocDeclaration
`@param treeStyle` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
     *
     * @param parent
     * @param treeStyle
     */
    protected void createControl(Composite parent, int treeStyle) {
```

### JavadocDeclaration
`@param string` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
     * Set the text in the filter control.
     *
     * @param string
     */
    protected void setFilterText(String string) {
```

### JavadocDeclaration
`@param treeItem` tag description is missing
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/FilteredTree.java`
#### Snippet
```java
             * Return the count of treeItem and it's children to infinite depth.
             *
             * @param treeItem
             * @return int
             */
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/SynchronizationResult.java`
#### Snippet
```java
 * @author Donat Csikos
 * @since 3.0
 * @noimplement this interface is not intended to be implemented by clients
 */
public interface SynchronizationResult {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/WrapperGradleDistribution.java`
#### Snippet
```java
 * @author Donat Csikos
 * @since 3.0
 * @noimplement this interface is not intended to be implemented by clients
 */
public final class WrapperGradleDistribution extends GradleDistribution {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/FixedVersionGradleDistribution.java`
#### Snippet
```java
 * @author Donat Csikos
 * @since 3.0
 * @noimplement this interface is not intended to be implemented by clients
 */
public final class FixedVersionGradleDistribution extends GradleDistribution {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/GradleBuild.java`
#### Snippet
```java
 * @author Donat Csikos
 * @since 3.0
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface GradleBuild {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/LocalGradleDistribution.java`
#### Snippet
```java
 * @author Donat Csikos
 * @since 3.0
 * @noimplement this interface is not intended to be implemented by clients
 */
public final class LocalGradleDistribution extends GradleDistribution {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/RemoteGradleDistribution.java`
#### Snippet
```java
 * @author Donat Csikos
 * @since 3.0
 * @noimplement this interface is not intended to be implemented by clients
 */
public final class RemoteGradleDistribution extends GradleDistribution {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/GradleWorkspace.java`
#### Snippet
```java
 * @author Donat Csikos
 * @since 3.0
 * @noimplement this interface is not intended to be implemented by clients
 */
public interface GradleWorkspace {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/GradleDistribution.java`
#### Snippet
```java
 * @author Donat Csikos
 * @since 3.0
 * @noimplement this interface is not intended to be implemented by clients
 */
public abstract class GradleDistribution {
```

### JavadocDeclaration
Wrong tag `noimplement`
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/BuildConfiguration.java`
#### Snippet
```java
 * @author Donat Csikos
 * @since 3.0
 * @noimplement this interface is not intended to be implemented by clients
 */
public final class BuildConfiguration {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportFactory.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportFactory.java`
#### Snippet
```java
     * 
     * @return the package supported by this factory.
     * @generated
     */
    GradleImportPackage getGradleImportPackage();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportFactory.java`
#### Snippet
```java
 * 
 * @see org.eclipse.buildship.oomph.GradleImportPackage
 * @generated
 */
public interface GradleImportFactory extends EFactory {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportFactory.java`
#### Snippet
```java
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    GradleImportFactory eINSTANCE = org.eclipse.buildship.oomph.impl.GradleImportFactoryImpl.init();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportFactory.java`
#### Snippet
```java
     * 
     * @return a new object of class '<em>Task</em>'.
     * @generated
     */
    GradleImportTask createGradleImportTask();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final DistributionType[] VALUES_ARRAY = new DistributionType[] { GRADLE_WRAPPER, LOCAL_INSTALLATION, REMOTE_DISTRIBUTION, SPECIFIC_GRADLE_VERSION, };
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DistributionType get(String literal) {
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * 
     * @see #SPECIFIC_GRADLE_VERSION
     * @model
     * @generated
     * @ordered
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @see #SPECIFIC_GRADLE_VERSION
     * @model
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @model
     * @generated
     * @ordered
     */
    public static final int SPECIFIC_GRADLE_VERSION_VALUE = 3;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * 
     * @see #REMOTE_DISTRIBUTION_VALUE
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @see #REMOTE_DISTRIBUTION_VALUE
     * @generated
     * @ordered
     */
    REMOTE_DISTRIBUTION(2, "REMOTE_DISTRIBUTION", "REMOTE_DISTRIBUTION"),
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private final int value;
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
 * 
 * @see org.eclipse.buildship.oomph.GradleImportPackage#getDistributionType()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
 * @see org.eclipse.buildship.oomph.GradleImportPackage#getDistributionType()
 * @model
 * @generated
 */
public enum DistributionType implements Enumerator {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * 
     * @see #GRADLE_WRAPPER_VALUE
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @see #GRADLE_WRAPPER_VALUE
     * @generated
     * @ordered
     */
    GRADLE_WRAPPER(0, "GRADLE_WRAPPER", "GRADLE_WRAPPER"),
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private final String literal;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * 
     * @see #LOCAL_INSTALLATION_VALUE
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @see #LOCAL_INSTALLATION_VALUE
     * @generated
     * @ordered
     */
    LOCAL_INSTALLATION(1, "LOCAL_INSTALLATION", "LOCAL_INSTALLATION"),
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private DistributionType(int value, String name, String literal) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private final String name;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * 
     * @see #SPECIFIC_GRADLE_VERSION_VALUE
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @see #SPECIFIC_GRADLE_VERSION_VALUE
     * @generated
     * @ordered
     */
    SPECIFIC_GRADLE_VERSION(3, "SPECIFIC_GRADLE_VERSION", "SPECIFIC_GRADLE_VERSION");
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * 
     * @see #LOCAL_INSTALLATION
     * @model
     * @generated
     * @ordered
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @see #LOCAL_INSTALLATION
     * @model
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElement(ModelElement object) {
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @model
     * @generated
     * @ordered
     */
    public static final int LOCAL_INSTALLATION_VALUE = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * 
     * @see #REMOTE_DISTRIBUTION
     * @model
     * @generated
     * @ordered
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @see #REMOTE_DISTRIBUTION
     * @model
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @model
     * @generated
     * @ordered
     */
    public static final int REMOTE_DISTRIBUTION_VALUE = 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * 
     * @see #GRADLE_WRAPPER
     * @model
     * @generated
     * @ordered
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @see #GRADLE_WRAPPER
     * @model
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @model
     * @generated
     * @ordered
     */
    public static final int GRADLE_WRAPPER_VALUE = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public GradleImportSwitch() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<DistributionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DistributionType getByName(String name) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/DistributionType.java`
#### Snippet
```java
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DistributionType get(int value) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @return the result of interpreting the object as an instance of '<em>Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGradleImportTask(GradleImportTask object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * @return the result of interpreting the object as an instance of '<em>Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSetupTask(SetupTask object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
 * 
 * @see org.eclipse.buildship.oomph.GradleImportPackage
 * @generated
 */
public class GradleImportSwitch<T> extends Switch<T> {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportSwitch.java`
#### Snippet
```java
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static GradleImportPackage modelPackage;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @param value the new value of the '<em>Automatic Project Synchronization</em>' attribute.
     * @see #isAutomaticProjectSynchronization()
     * @generated
     */
    void setAutomaticProjectSynchronization(boolean value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setBuildScans(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_BuildScans()
     * @model default="false"
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_BuildScans()
     * @model default="false"
     * @generated
     */
    boolean isBuildScans();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setJavaHome(String)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_JavaHome()
     * @model
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_JavaHome()
     * @model
     * @generated
     */
    String getJavaHome();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setDistributionType(DistributionType)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_DistributionType()
     * @model default="GRADLE_WRAPPER"
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_DistributionType()
     * @model default="GRADLE_WRAPPER"
     * @generated
     */
    DistributionType getDistributionType();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @param value the new value of the '<em>Show Executions View</em>' attribute.
     * @see #isShowExecutionsView()
     * @generated
     */
    void setShowExecutionsView(boolean value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setShowExecutionsView(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_ShowExecutionsView()
     * @model default="false"
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_ShowExecutionsView()
     * @model default="false"
     * @generated
     */
    boolean isShowExecutionsView();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @param value the new value of the '<em>Local Installation Directory</em>' attribute.
     * @see #getLocalInstallationDirectory()
     * @generated
     */
    void setLocalInstallationDirectory(String value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @param value the new value of the '<em>Override Workspace Settings</em>' attribute.
     * @see #isOverrideWorkspaceSettings()
     * @generated
     */
    void setOverrideWorkspaceSettings(boolean value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Program Arguments</em>' attribute list.
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_ProgramArguments()
     * @model unique="false"
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_ProgramArguments()
     * @model unique="false"
     * @generated
     */
    EList<String> getProgramArguments();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__OVERRIDE_WORKSPACE_SETTINGS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setRemoteDistributionLocation(String)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_RemoteDistributionLocation()
     * @model
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @return the meta object for class '<em>Task</em>'.
     * @see org.eclipse.buildship.oomph.GradleImportTask
     * @generated
     */
    EClass getGradleImportTask();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#getDistributionType()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_DistributionType();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#isShowExecutionsView()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_ShowExecutionsView();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__JAVA_HOME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 9;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#getSpecificGradleVersion()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_SpecificGradleVersion();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__SOURCE_LOCATORS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__LOCAL_INSTALLATION_DIRECTORY = eINSTANCE.getGradleImportTask_LocalInstallationDirectory();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#getJavaHome()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_JavaHome();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__OVERRIDE_WORKSPACE_SETTINGS = eINSTANCE.getGradleImportTask_OverrideWorkspaceSettings();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__SHOW_CONSOLE_VIEW = SetupPackage.SETUP_TASK_FEATURE_COUNT + 13;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__LOCAL_INSTALLATION_DIRECTORY = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#isOfflineMode()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_OfflineMode();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#getRemoteDistributionLocation()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_RemoteDistributionLocation();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_PREFIX = "oomph";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 15;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__SHOW_EXECUTIONS_VIEW = eINSTANCE.getGradleImportTask_ShowExecutionsView();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__OFFLINE_MODE = SetupPackage.SETUP_TASK_FEATURE_COUNT + 10;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__GRADLE_USER_HOME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 8;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__GRADLE_USER_HOME = eINSTANCE.getGradleImportTask_GradleUserHome();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#isShowConsoleView()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_ShowConsoleView();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * @see org.eclipse.buildship.oomph.impl.GradleImportTaskImpl
         * @see org.eclipse.buildship.oomph.impl.GradleImportPackageImpl#getGradleImportTask()
         * @generated
         */
        EClass GRADLE_IMPORT_TASK = eINSTANCE.getGradleImportTask();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__REMOTE_DISTRIBUTION_LOCATION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 4;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__SPECIFIC_GRADLE_VERSION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 5;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__DISTRIBUTION_TYPE = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__JVM_ARGUMENTS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 7;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__SPECIFIC_GRADLE_VERSION = eINSTANCE.getGradleImportTask_SpecificGradleVersion();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__ID = SetupPackage.SETUP_TASK__ID;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * 
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__JAVA_HOME = eINSTANCE.getGradleImportTask_JavaHome();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public GradleImportAdapterFactory() {
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__PROGRAM_ARGUMENTS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 6;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__JVM_ARGUMENTS = eINSTANCE.getGradleImportTask_JvmArguments();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
 * 
 * @see org.eclipse.buildship.oomph.GradleImportPackage
 * @generated
 */
public class GradleImportAdapterFactory extends AdapterFactoryImpl {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#getGradleUserHome()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_GradleUserHome();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference GRADLE_IMPORT_TASK__SOURCE_LOCATORS = eINSTANCE.getGradleImportTask_SourceLocators();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * @return the new adapter.
     * @see org.eclipse.oomph.base.ModelElement
     * @generated
     */
    public Adapter createModelElementAdapter() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    protected GradleImportSwitch<Adapter> modelSwitch = new GradleImportSwitch<Adapter>() {
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__AUTOMATIC_PROJECT_SYNCHRONIZATION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 12;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static GradleImportPackage modelPackage;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.DistributionType
     * @see org.eclipse.buildship.oomph.impl.GradleImportPackageImpl#getDistributionType()
     * @generated
     */
    int DISTRIBUTION_TYPE = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * @return the new adapter.
     * @see org.eclipse.buildship.oomph.GradleImportTask
     * @generated
     */
    public Adapter createGradleImportTaskAdapter() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    GradleImportFactory getGradleImportFactory();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/util/GradleImportAdapterFactory.java`
#### Snippet
```java
     * @return the new adapter.
     * @see org.eclipse.oomph.setup.SetupTask
     * @generated
     */
    public Adapter createSetupTaskAdapter() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.impl.GradleImportTaskImpl
     * @see org.eclipse.buildship.oomph.impl.GradleImportPackageImpl#getGradleImportTask()
     * @generated
     */
    int GRADLE_IMPORT_TASK = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    GradleImportPackage eINSTANCE = org.eclipse.buildship.oomph.impl.GradleImportPackageImpl.init();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class GradleImportFactoryImpl extends EFactoryImpl implements GradleImportFactory {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertDistributionTypeToString(EDataType eDataType, Object instanceValue) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public GradleImportFactoryImpl() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public DistributionType createDistributionTypeFromString(EDataType eDataType, String initialValue) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static GradleImportFactory init() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportFactoryImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__AUTOMATIC_PROJECT_SYNCHRONIZATION = eINSTANCE.getGradleImportTask_AutomaticProjectSynchronization();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_RemoteDistributionLocation()
     * @model
     * @generated
     */
    String getRemoteDistributionLocation();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 *
 * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement
 *        variableName='setup.buildship.p2'
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
 *        repository='https://download.eclipse.org/buildship/updates/latest'
 *        installableUnits='org.eclipse.buildship.oomph.feature.group'"
 * @generated
 */
public interface GradleImportTask extends SetupTask {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @param value the new value of the '<em>Show Console View</em>' attribute.
     * @see #isShowConsoleView()
     * @generated
     */
    void setShowConsoleView(boolean value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setLocalInstallationDirectory(String)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_LocalInstallationDirectory()
     * @model
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_LocalInstallationDirectory()
     * @model
     * @generated
     */
    String getLocalInstallationDirectory();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @param value the new value of the '<em>Build Scans</em>' attribute.
     * @see #isBuildScans()
     * @generated
     */
    void setBuildScans(boolean value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Jvm Arguments</em>' attribute list.
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_JvmArguments()
     * @model unique="false"
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_JvmArguments()
     * @model unique="false"
     * @generated
     */
    EList<String> getJvmArguments();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setOverrideWorkspaceSettings(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_OverrideWorkspaceSettings()
     * @model default="false"
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_OverrideWorkspaceSettings()
     * @model default="false"
     * @generated
     */
    boolean isOverrideWorkspaceSettings();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @return the value of the '<em>Source Locators</em>' containment reference list.
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_SourceLocators()
     * @model containment="true" required="true" extendedMetaData="name='sourceLocator'"
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_SourceLocators()
     * @model containment="true" required="true" extendedMetaData="name='sourceLocator'"
     * @generated
     */
    EList<SourceLocator> getSourceLocators();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @param value the new value of the '<em>Remote Distribution Location</em>' attribute.
     * @see #getRemoteDistributionLocation()
     * @generated
     */
    void setRemoteDistributionLocation(String value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @param value the new value of the '<em>Offline Mode</em>' attribute.
     * @see #isOfflineMode()
     * @generated
     */
    void setOfflineMode(boolean value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setGradleUserHome(String)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_GradleUserHome()
     * @model
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_GradleUserHome()
     * @model
     * @generated
     */
    String getGradleUserHome();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.DistributionType
     * @see #getDistributionType()
     * @generated
     */
    void setDistributionType(DistributionType value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setShowConsoleView(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_ShowConsoleView()
     * @model default="false"
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_ShowConsoleView()
     * @model default="false"
     * @generated
     */
    boolean isShowConsoleView();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setOfflineMode(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_OfflineMode()
     * @model default="false"
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_OfflineMode()
     * @model default="false"
     * @generated
     */
    boolean isOfflineMode();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setAutomaticProjectSynchronization(boolean)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_AutomaticProjectSynchronization()
     * @model default="false"
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_AutomaticProjectSynchronization()
     * @model default="false"
     * @generated
     */
    boolean isAutomaticProjectSynchronization();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @param value the new value of the '<em>Specific Gradle Version</em>' attribute.
     * @see #getSpecificGradleVersion()
     * @generated
     */
    void setSpecificGradleVersion(String value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @param value the new value of the '<em>Java Home</em>' attribute.
     * @see #getJavaHome()
     * @generated
     */
    void setJavaHome(String value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @param value the new value of the '<em>Gradle User Home</em>' attribute.
     * @see #getGradleUserHome()
     * @generated
     */
    void setGradleUserHome(String value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see #setSpecificGradleVersion(String)
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_SpecificGradleVersion()
     * @model
     * @generated
     */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportTask.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#getGradleImportTask_SpecificGradleVersion()
     * @model
     * @generated
     */
    String getSpecificGradleVersion();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__SHOW_CONSOLE_VIEW = eINSTANCE.getGradleImportTask_ShowConsoleView();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__REMOTE_DISTRIBUTION_LOCATION = eINSTANCE.getGradleImportTask_RemoteDistributionLocation();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__SHOW_EXECUTIONS_VIEW = SetupPackage.SETUP_TASK_FEATURE_COUNT + 14;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#getLocalInstallationDirectory()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_LocalInstallationDirectory();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#isOverrideWorkspaceSettings()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_OverrideWorkspaceSettings();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
 * 
 * @see org.eclipse.buildship.oomph.GradleImportFactory
 * @model kind="package" annotation="http://www.eclipse.org/emf/2002/Ecore
 *        schemaLocation='https://raw.githubusercontent.com/eclipse/buildship/master/org.eclipse.buildship.oomph/model/GradleImport-1.0.ecore'"
 * @generated
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
 * @model kind="package" annotation="http://www.eclipse.org/emf/2002/Ecore
 *        schemaLocation='https://raw.githubusercontent.com/eclipse/buildship/master/org.eclipse.buildship.oomph/model/GradleImport-1.0.ecore'"
 * @generated
 */
public interface GradleImportPackage extends EPackage {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__OFFLINE_MODE = eINSTANCE.getGradleImportTask_OfflineMode();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#getProgramArguments()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_ProgramArguments();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNAME = "oomph";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#getSourceLocators()
     * @see #getGradleImportTask()
     * @generated
     */
    EReference getGradleImportTask_SourceLocators();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__DISTRIBUTION_TYPE = eINSTANCE.getGradleImportTask_DistributionType();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__BUILD_SCANS = eINSTANCE.getGradleImportTask_BuildScans();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute GRADLE_IMPORT_TASK__PROGRAM_ARGUMENTS = eINSTANCE.getGradleImportTask_ProgramArguments();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#isBuildScans()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_BuildScans();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_URI = "http://www.eclipse.org/buildship/oomph/1.0";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#getJvmArguments()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_JvmArguments();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    interface Literals {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportTask#isAutomaticProjectSynchronization()
     * @see #getGradleImportTask()
     * @generated
     */
    EAttribute getGradleImportTask_AutomaticProjectSynchronization();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * 
     * @generated
     * @ordered
     */
    int GRADLE_IMPORT_TASK__BUILD_SCANS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 11;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
     * @return the meta object for enum '<em>Distribution Type</em>'.
     * @see org.eclipse.buildship.oomph.DistributionType
     * @generated
     */
    EEnum getDistributionType();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/GradleImportPackage.java`
#### Snippet
```java
         * @see org.eclipse.buildship.oomph.DistributionType
         * @see org.eclipse.buildship.oomph.impl.GradleImportPackageImpl#getDistributionType()
         * @generated
         */
        EEnum DISTRIBUTION_TYPE = eINSTANCE.getDistributionType();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class GradleImportPackageImpl extends EPackageImpl implements GradleImportPackage {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static GradleImportPackage init() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void createValidTriggersAnnotations() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass gradleImportTaskEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * @see org.eclipse.buildship.oomph.GradleImportPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private GradleImportPackageImpl() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum distributionTypeEEnum = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void createEcoreAnnotations() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void createEnablementAnnotations() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportPackageImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getRemoteDistributionLocation()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getRemoteDistributionLocation()
     * @generated
     * @ordered
     */
    protected String remoteDistributionLocation = REMOTE_DISTRIBUTION_LOCATION_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getJavaHome()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getJavaHome()
     * @generated
     * @ordered
     */
    protected String javaHome = JAVA_HOME_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getGradleUserHome()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getGradleUserHome()
     * @generated
     * @ordered
     */
    protected static final String GRADLE_USER_HOME_EDEFAULT = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getProgramArguments()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getProgramArguments()
     * @generated
     * @ordered
     */
    protected EList<String> programArguments;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isShowExecutionsView()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isShowExecutionsView()
     * @generated
     * @ordered
     */
    protected static final boolean SHOW_EXECUTIONS_VIEW_EDEFAULT = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getSpecificGradleVersion()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getSpecificGradleVersion()
     * @generated
     * @ordered
     */
    protected String specificGradleVersion = SPECIFIC_GRADLE_VERSION_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getRemoteDistributionLocation()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getRemoteDistributionLocation()
     * @generated
     * @ordered
     */
    protected static final String REMOTE_DISTRIBUTION_LOCATION_EDEFAULT = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getJavaHome()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getJavaHome()
     * @generated
     * @ordered
     */
    protected static final String JAVA_HOME_EDEFAULT = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getLocalInstallationDirectory()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getLocalInstallationDirectory()
     * @generated
     * @ordered
     */
    protected static final String LOCAL_INSTALLATION_DIRECTORY_EDEFAULT = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getLocalInstallationDirectory()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getLocalInstallationDirectory()
     * @generated
     * @ordered
     */
    protected String localInstallationDirectory = LOCAL_INSTALLATION_DIRECTORY_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isOfflineMode()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isOfflineMode()
     * @generated
     * @ordered
     */
    protected boolean offlineMode = OFFLINE_MODE_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isAutomaticProjectSynchronization()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isAutomaticProjectSynchronization()
     * @generated
     * @ordered
     */
    protected boolean automaticProjectSynchronization = AUTOMATIC_PROJECT_SYNCHRONIZATION_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isAutomaticProjectSynchronization()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isAutomaticProjectSynchronization()
     * @generated
     * @ordered
     */
    protected static final boolean AUTOMATIC_PROJECT_SYNCHRONIZATION_EDEFAULT = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getSourceLocators()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getSourceLocators()
     * @generated
     * @ordered
     */
    protected EList<SourceLocator> sourceLocators;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isOfflineMode()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isOfflineMode()
     * @generated
     * @ordered
     */
    protected static final boolean OFFLINE_MODE_EDEFAULT = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isOverrideWorkspaceSettings()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isOverrideWorkspaceSettings()
     * @generated
     * @ordered
     */
    protected boolean overrideWorkspaceSettings = OVERRIDE_WORKSPACE_SETTINGS_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getDistributionType()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getDistributionType()
     * @generated
     * @ordered
     */
    protected static final DistributionType DISTRIBUTION_TYPE_EDEFAULT = DistributionType.GRADLE_WRAPPER;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isOverrideWorkspaceSettings()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isOverrideWorkspaceSettings()
     * @generated
     * @ordered
     */
    protected static final boolean OVERRIDE_WORKSPACE_SETTINGS_EDEFAULT = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isShowConsoleView()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isShowConsoleView()
     * @generated
     * @ordered
     */
    protected static final boolean SHOW_CONSOLE_VIEW_EDEFAULT = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isBuildScans()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isBuildScans()
     * @generated
     * @ordered
     */
    protected boolean buildScans = BUILD_SCANS_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getSpecificGradleVersion()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getSpecificGradleVersion()
     * @generated
     * @ordered
     */
    protected static final String SPECIFIC_GRADLE_VERSION_EDEFAULT = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getDistributionType()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getDistributionType()
     * @generated
     * @ordered
     */
    protected DistributionType distributionType = DISTRIBUTION_TYPE_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class GradleImportTaskImpl extends SetupTaskImpl implements GradleImportTask {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isShowExecutionsView()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isShowExecutionsView()
     * @generated
     * @ordered
     */
    protected boolean showExecutionsView = SHOW_EXECUTIONS_VIEW_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isShowConsoleView()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isShowConsoleView()
     * @generated
     * @ordered
     */
    protected boolean showConsoleView = SHOW_CONSOLE_VIEW_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected GradleImportTaskImpl() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getGradleUserHome()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getGradleUserHome()
     * @generated
     * @ordered
     */
    protected String gradleUserHome = GRADLE_USER_HOME_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #getJvmArguments()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #getJvmArguments()
     * @generated
     * @ordered
     */
    protected EList<String> jvmArguments;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * 
     * @see #isBuildScans()
     * @generated
     * @ordered
     */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.buildship.oomph/src/main/java-generated/org/eclipse/buildship/oomph/impl/GradleImportTaskImpl.java`
#### Snippet
```java
     * @see #isBuildScans()
     * @generated
     * @ordered
     */
    protected static final boolean BUILD_SCANS_EDEFAULT = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportEditPlugin.java`
#### Snippet
```java
 * end-user-doc -->
 * 
 * @generated
 */
public final class GradleImportEditPlugin extends EMFPlugin {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportEditPlugin.java`
#### Snippet
```java
     * 
     * @return the singleton instance.
     * @generated
     */
    public static Implementation getPlugin() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportEditPlugin.java`
#### Snippet
```java
     * 
     * @return the singleton instance.
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportEditPlugin.java`
#### Snippet
```java
     * Create the instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public GradleImportEditPlugin() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportEditPlugin.java`
#### Snippet
```java
     * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static Implementation plugin;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportEditPlugin.java`
#### Snippet
```java
         * Creates an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        public Implementation() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportEditPlugin.java`
#### Snippet
```java
     * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final GradleImportEditPlugin INSTANCE = new GradleImportEditPlugin();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportEditPlugin.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportEditPlugin.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    public static class Implementation extends EclipsePlugin {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
             * begin-user-doc --> <!-- end-user-doc -->
             * 
             * @generated
             */
            CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * This helps manage the child creation extenders. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(GradleImportEditPlugin.INSTANCE, GradleImportPackage.eNS_URI);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    public static class SetupChildCreationExtender implements IChildCreationExtender {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
             * <!-- begin-user-doc --> <!-- end-user-doc -->
             * 
             * @generated
             */
            @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
             * begin-user-doc --> <!-- end-user-doc -->
             * 
             * @generated
             */
            CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
 * end-user-doc -->
 * 
 * @generated
 */
public class GradleImportItemProviderAdapterFactory extends GradleImportAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
             * -->
             * 
             * @generated
             */
            protected EditingDomain editingDomain;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    public static class BaseChildCreationExtender implements IChildCreationExtender {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
             * <!-- begin-user-doc --> <!-- end-user-doc -->
             * 
             * @generated
             */
            @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
             * The child descriptors being populated. <!-- begin-user-doc --> <!-- end-user-doc -->
             * 
             * @generated
             */
            protected List<Object> newChildDescriptors;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public GradleImportItemProviderAdapterFactory() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders() {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        protected static class CreationSwitch extends BaseSwitch<Object> {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * isFactoryForType}. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
             * <!-- begin-user-doc --> <!-- end-user-doc -->
             * 
             * @generated
             */
            protected CommandParameter createChildParameter(Object feature, Object child) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
             * -->
             * 
             * @generated
             */
            protected EditingDomain editingDomain;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
             * <!-- begin-user-doc --> <!-- end-user-doc -->
             * 
             * @generated
             */
            protected CommandParameter createChildParameter(Object feature, Object child) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
             * The child descriptors being populated. <!-- begin-user-doc --> <!-- end-user-doc -->
             * 
             * @generated
             */
            protected List<Object> newChildDescriptors;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        protected static class CreationSwitch extends SetupSwitch<Object> {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    protected GradleImportTaskItemProvider gradleImportTaskItemProvider;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportItemProviderAdapterFactory.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addOfflineModePropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addJvmArgumentsPropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addLocalInstallationDirectoryPropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addOverrideWorkspaceSettingsPropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addBuildScansPropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * This returns gradle_file.png.
     *
     * @generated NOT
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addShowConsoleViewPropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class GradleImportTaskItemProvider extends SetupTaskItemProvider {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * -->
     *
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addShowExecutionsViewPropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addRemoteDistributionLocationPropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright (c) 2019 the original author or authors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addGradleUserHomePropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addDistributionTypePropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addAutomaticProjectSynchronizationPropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    public GradleImportTaskItemProvider(AdapterFactory adapterFactory) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addJavaHomePropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addSpecificGradleVersionPropertyDescriptor(Object object) {
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.buildship.oomph.edit/src/main/java-generated/org/eclipse/buildship/oomph/provider/GradleImportTaskItemProvider.java`
#### Snippet
```java
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addProgramArgumentsPropertyDescriptor(Object object) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `gradleUserHomeText` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java
    private final UiBuilder.UiBuilderFactory builderFactory;

    private Text gradleUserHomeText;
    private Button gradleUserHomeBrowseButton;
    private Label gradleUserHomeWarningLabel;
```

### FieldMayBeFinal
Field `gradleUserHomeBrowseButton` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java

    private Text gradleUserHomeText;
    private Button gradleUserHomeBrowseButton;
    private Label gradleUserHomeWarningLabel;

```

### FieldMayBeFinal
Field `javaHomeBrowseButton` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java

    private Text javaHomeText;
    private Button javaHomeBrowseButton;
    private Label javaHomeWarningLabel;

```

### FieldMayBeFinal
Field `javaHomeText` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java
    private Label gradleUserHomeWarningLabel;

    private Text javaHomeText;
    private Button javaHomeBrowseButton;
    private Label javaHomeWarningLabel;
```

### FieldMayBeFinal
Field `javaHomeWarningLabel` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java
    private Text javaHomeText;
    private Button javaHomeBrowseButton;
    private Label javaHomeWarningLabel;

    private StringListEditor argumentsEditor;
```

### FieldMayBeFinal
Field `gradleUserHomeWarningLabel` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java
    private Text gradleUserHomeText;
    private Button gradleUserHomeBrowseButton;
    private Label gradleUserHomeWarningLabel;

    private Text javaHomeText;
```

### FieldMayBeFinal
Field `jvmArgumentsEditor` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java

    private StringListEditor argumentsEditor;
    private StringListEditor jvmArgumentsEditor;

    public AdvancedOptionsGroup(Composite parent, boolean variableSelector) {
```

### FieldMayBeFinal
Field `argumentsEditor` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/AdvancedOptionsGroup.java`
#### Snippet
```java
    private Label javaHomeWarningLabel;

    private StringListEditor argumentsEditor;
    private StringListEditor jvmArgumentsEditor;

```

### FieldMayBeFinal
Field `cachedDisplay` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/BasicUIJob.java`
#### Snippet
```java
public abstract class BasicUIJob extends Job {

    private Display cachedDisplay;

    /**
```

### FieldMayBeFinal
Field `parent` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/GradleProjectSettingsComposite.java`
#### Snippet
```java
        private boolean autoSyncCheckbox = false;
        private boolean variableSelector = false;
        private Composite parent;
        private GradleProjectSettingsCompositeBuilder(Composite parent) {
            this.parent = parent;
```

### FieldMayBeFinal
Field `EMPTY` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
    private boolean useEarlyReturnIfMatcherIsNull = true;

    private static Object[] EMPTY = new Object[0];

    public PatternFilter() {
```

### FieldMayBeFinal
Field `foundAnyCache` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
     * Maps parent elements to TRUE or FALSE
     */
    private Map<Object, Boolean> foundAnyCache = new HashMap<>();

    private boolean useCache = false;
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/PatternFilter.java`
#### Snippet
```java
     * Cache of filtered elements in the tree
     */
    private Map<Object, Object[]> cache = new HashMap<>();

    /*
```

### FieldMayBeFinal
Field `task` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/task/ProjectTask.java`
#### Snippet
```java
public class ProjectTask {

    private Task task;

    public ProjectTask(Task task) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/view/execution/OperationItem.java`
#### Snippet
```java
    private final OperationDescriptor descriptor;
    private FinishEvent finishEvent;
    private String name;
    private OperationItem parent;
    private List<OperationItem> children;
```

### FieldMayBeFinal
Field `delegate` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CachingIntermediateResultHandler.java`
#### Snippet
```java

    private BuildAction<T> buildAction;
    private IntermediateResultHandler<? super T> delegate;
    private Cache<Object, Object> cache;

```

### FieldMayBeFinal
Field `cache` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CachingIntermediateResultHandler.java`
#### Snippet
```java
    private BuildAction<T> buildAction;
    private IntermediateResultHandler<? super T> delegate;
    private Cache<Object, Object> cache;

    public CachingIntermediateResultHandler(BuildAction<T> buildAction, IntermediateResultHandler<? super T> handler, Cache<Object, Object> cache) {
```

### FieldMayBeFinal
Field `buildAction` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/CachingIntermediateResultHandler.java`
#### Snippet
```java
class CachingIntermediateResultHandler<T> implements IntermediateResultHandler<T> {

    private BuildAction<T> buildAction;
    private IntermediateResultHandler<? super T> delegate;
    private Cache<Object, Object> cache;
```

### FieldMayBeFinal
Field `syncOperations` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/DefaultGradleBuild.java`
#### Snippet
```java

public final class DefaultGradleBuild implements InternalGradleBuild {
    private static Map<File, SynchronizeOperation> syncOperations = new ConcurrentHashMap<>();

    // TODO (donat) Now, we have two caches: one for the project configurators and that lives within
```

### FieldMayBeFinal
Field `UNSUPPORTED_OUTPUT` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseSourceDirectory.java`
#### Snippet
```java
    private static List<String> UNSUPPORTED_EXCLUDES = Collections.emptyList();
    private static List<String> UNSUPPORTED_INCLUDES = Collections.emptyList();
    private static String UNSUPPORTED_OUTPUT = "bin";

    CompatEclipseSourceDirectory(EclipseSourceDirectory delegate) {
```

### FieldMayBeFinal
Field `UNSUPPORTED_EXCLUDES` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseSourceDirectory.java`
#### Snippet
```java
public class CompatEclipseSourceDirectory extends CompatEclipseClasspathEntry<EclipseSourceDirectory> implements EclipseSourceDirectory {

    private static List<String> UNSUPPORTED_EXCLUDES = Collections.emptyList();
    private static List<String> UNSUPPORTED_INCLUDES = Collections.emptyList();
    private static String UNSUPPORTED_OUTPUT = "bin";
```

### FieldMayBeFinal
Field `UNSUPPORTED_INCLUDES` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatEclipseSourceDirectory.java`
#### Snippet
```java

    private static List<String> UNSUPPORTED_EXCLUDES = Collections.emptyList();
    private static List<String> UNSUPPORTED_INCLUDES = Collections.emptyList();
    private static String UNSUPPORTED_OUTPUT = "bin";

```

### FieldMayBeFinal
Field `delegate` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/gradle/CompatProjectConnection.java`
#### Snippet
```java
public class CompatProjectConnection implements ProjectConnection {

    private ProjectConnection delegate;

    public CompatProjectConnection(ProjectConnection delegate) {
```

### FieldMayBeFinal
Field `adapterManager` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/collections/AdapterFunction.java`
#### Snippet
```java

    private Class<T> adapter;
    private IAdapterManager adapterManager;

    private AdapterFunction(Class<T> adapter, IAdapterManager adapterManager) {
```

### FieldMayBeFinal
Field `adapter` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/collections/AdapterFunction.java`
#### Snippet
```java
    }

    private Class<T> adapter;
    private IAdapterManager adapterManager;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/operation/BaseToolingApiOperation.java`
#### Snippet
```java
public abstract class BaseToolingApiOperation implements ToolingApiOperation {

    private String name;

    public BaseToolingApiOperation(String name) {
```

### FieldMayBeFinal
Field `project` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/SourceFolderUpdater.java`
#### Snippet
```java
        private IPath[] excludes = new IPath[0];
        private IClasspathAttribute[] attributes = new IClasspathAttribute[0];
        private IJavaProject project;

        public SourceFolderEntryBuilder(IJavaProject project, IPath path) {
```

### FieldMayBeFinal
Field `className` may be 'final'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/configuration/Test.java`
#### Snippet
```java
    private static class TestType extends Test {

        private String className;

        public TestType(String className) {
```

### FieldMayBeFinal
Field `parameterType` may be 'final'
in `org.eclipse.buildship.compat/src/main/java/org/eclipse/buildship/core/internal/workspace/CompositeModelQuery.java`
#### Snippet
```java
    private final Action<? super U> parameter;

    private Class<U> parameterType;

    public CompositeModelQuery(Class<T> modelType) {
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\uF900` can be replaced with '豈'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
    private static final String UCS_CHAR = "[" +
            "\u00A0-\uD7FF" +
            "\uF900-\uFDCF" +
            "\uFDF0-\uFFEF" +
            "\uD800\uDC00-\uD83F\uDFFD" +
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFDF0` can be replaced with 'ﷰ'
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/string/PatternUtils.java`
#### Snippet
```java
            "\u00A0-\uD7FF" +
            "\uF900-\uFDCF" +
            "\uFDF0-\uFFEF" +
            "\uD800\uDC00-\uD83F\uDFFD" +
            "\uD840\uDC00-\uD87F\uDFFD" +
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringListEditor.java`
#### Snippet
```java
        GridLayoutFactory.fillDefaults().margins(0, 0).spacing(0, 0).applyTo(buttonRoot);

        this.addButton = createButton(buttonRoot, "Add", () -> addEntries(Arrays.asList(newEntryName)));
        if (variableSelector) {
            this.variablesButton = createButton(buttonRoot, LaunchMessages.Button_Label_SelectVariables, () -> {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.buildship.ui/src/main/java/org/eclipse/buildship/ui/internal/util/widget/StringListEditor.java`
#### Snippet
```java
                String variable = dialog.getVariableExpression();
                if (variable != null) {
                    addEntries(Arrays.asList(variable));
                }
            });
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/util/binding/Validators.java`
#### Snippet
```java
            private boolean projectNameAlreadyExistsInWorkspace(final String projectName) {
                IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
                return FluentIterable.from(Arrays.asList(projects)).anyMatch(new Predicate<IProject>() {

                    @Override
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.buildship.core/src/main/java/org/eclipse/buildship/core/internal/workspace/LibraryFilter.java`
#### Snippet
```java

    private static IClasspathEntry[] filterLibraries(IClasspathEntry[] classpath) throws JavaModelException {
        return FluentIterable.from(Arrays.asList(classpath)).filter(new Predicate<IClasspathEntry>() {

            @Override
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

