# maven-plugin-tools 
 
# Bad smells
I found 259 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 40 | false |
| BoundedWildcard | 31 | false |
| ReturnNull | 29 | false |
| DynamicRegexReplaceableByCompiledPattern | 16 | false |
| RegExpRedundantEscape | 15 | false |
| AssignmentToMethodParameter | 13 | false |
| ConstantValue | 12 | false |
| StringBufferReplaceableByString | 11 | false |
| DeprecatedIsStillUsed | 10 | false |
| UnnecessaryFullyQualifiedName | 9 | false |
| IgnoreResultOfCall | 8 | false |
| RedundantFieldInitialization | 8 | false |
| StringConcatenationInsideStringBufferAppend | 7 | false |
| RedundantSuppression | 5 | false |
| UnnecessaryUnboxing | 4 | false |
| ExtendsAnnotation | 4 | false |
| UnnecessaryStringEscape | 3 | true |
| SizeReplaceableByIsEmpty | 3 | true |
| UnnecessaryBoxing | 3 | false |
| MissingDeprecatedAnnotation | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| OptionalIsPresent | 2 | false |
| DataFlowIssue | 2 | false |
| ObsoleteCollection | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| MismatchedJavadocCode | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| UnusedAssignment | 2 | false |
| StringOperationCanBeSimplified | 1 | false |
| CommentedOutCode | 1 | false |
| RegExpSimplifiable | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| NestedAssignment | 1 | false |
| RedundantImplements | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| DuplicateThrows | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[includePatterns.size()\]'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java
        scanner.addDefaultExcludes();
        if (includePatterns != null) {
            scanner.setIncludes(includePatterns.toArray(new String[includePatterns.size()]));
        }
        scanner.scan();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[urls.size()\]'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
            }

            classLoader = new URLClassLoader(urls.toArray(new URL[urls.size()]), classLoader);
        }

```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            throws URISyntaxException {
        StringBuilder link = new StringBuilder();
        if (moduleName.isPresent()) {
            link.append(moduleName.get() + "/");
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            link.append(moduleName.get() + "/");
        }
        if (packageName.isPresent()) {
            link.append(packageName.get().replace('.', '/'));
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `getClass().getResourceAsStream("/extractor.bsh")` might be null
in `maven-script/maven-plugin-tools-beanshell/src/main/java/org/apache/maven/tools/plugin/extractor/beanshell/BeanshellMojoDescriptorExtractor.java`
#### Snippet
```java
            interpreter.set("encoding", "UTF-8");

            interpreter.eval(new InputStreamReader(getClass().getResourceAsStream("/extractor.bsh"), UTF_8));
        } catch (EvalError evalError) {
            throw new InvalidPluginDescriptorException("Error scanning beanshell script", evalError);
```

### DataFlowIssue
Argument `is` might be null
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginHelpGenerator.java`
#### Snippet
```java
                        .getContextClassLoader()
                        .getResourceAsStream(useMaven4Api ? "help-class-source-v4.vm" : "help-class-source.vm"); //
                InputStreamReader isReader = new InputStreamReader(is, UTF_8)) {
            // isReader =
            velocityComponent.getEngine().evaluate(context, stringWriter, "", isReader);
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
        }
        String packageName = binaryName.substring(0, indexOfDotBetweenPackageAndClass);
        String className = binaryName.substring(indexOfDotBetweenPackageAndClass + 1, binaryName.length());
        return new AbstractMap.SimpleEntry<>(packageName, className);
    }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            text = text.replace(">", "&gt;");
            text = text.replace("\"", "&quot;");
            text = text.replace("\'", "&apos;");
        }
        return text;
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `maven-script/maven-plugin-tools-model/src/main/java/org/apache/maven/tools/plugin/extractor/model/PluginMetadataParser.java`
#### Snippet
```java
                    throw new PluginMetadataParseException(
                            metadataFile,
                            "Mojo: \'" + mojo.getGoal()
                                    + "\' has a parameter without either property or name attributes. Please specify one.");
                }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `maven-script/maven-plugin-tools-model/src/main/java/org/apache/maven/tools/plugin/extractor/model/PluginMetadataParser.java`
#### Snippet
```java
                            metadataFile,
                            "Mojo: \'" + mojo.getGoal()
                                    + "\' has a parameter without either property or name attributes. Please specify one.");
                }

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
            ExtendedMojoDescriptor mojoDescriptor = new ExtendedMojoDescriptor(true);

            // mojoDescriptor.setRole( mojoAnnotatedClass.getClassName() );
            // mojoDescriptor.setRoleHint( "default" );
            mojoDescriptor.setImplementation(mojoAnnotatedClass.getClassName());
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'PARAMETER_EXPRESSION' is still used
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavadocMojoAnnotation.java`
#### Snippet
```java
     */
    @Deprecated
    String PARAMETER_EXPRESSION = "expression";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'MULTI_EXECUTION_STRATEGY' is still used
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavadocMojoAnnotation.java`
#### Snippet
```java
     */
    @Deprecated
    String MULTI_EXECUTION_STRATEGY = "attainAlways";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'AntMojoComponentFactory' is still used
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntMojoComponentFactory.java`
#### Snippet
```java
 */
@Deprecated
public class AntMojoComponentFactory extends AntComponentFactory {

    public Object newInstance(ComponentDescriptor descriptor, ClassRealm realm, PlexusContainer container)
```

### DeprecatedIsStillUsed
Deprecated member 'AntMojoWrapper' is still used
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntMojoWrapper.java`
#### Snippet
```java
 */
@Deprecated
public class AntMojoWrapper extends AbstractMojo implements ContextEnabled, MapOrientedComponent, LogEnabled {

    private Map<String, Object> pluginContext;
```

### DeprecatedIsStillUsed
Deprecated member 'AntMojoDescriptorExtractor' is still used
in `maven-script/maven-plugin-tools-ant/src/main/java/org/apache/maven/tools/plugin/extractor/ant/AntMojoDescriptorExtractor.java`
#### Snippet
```java
@Named(AntMojoDescriptorExtractor.NAME)
@Singleton
public class AntMojoDescriptorExtractor extends AbstractScriptedMojoDescriptorExtractor {
    public static final String NAME = "ant";

```

### DeprecatedIsStillUsed
Deprecated member 'makeHtmlValid' is still used
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String makeHtmlValid(String description) {

        if (StringUtils.isEmpty(description)) {
```

### DeprecatedIsStillUsed
Deprecated member 'toText' is still used
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String toText(String html) {
        if (StringUtils.isEmpty(html)) {
            return "";
```

### DeprecatedIsStillUsed
Deprecated member 'MAVEN_COMPONENTS' is still used
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Map<String, String> MAVEN_COMPONENTS;

    static {
```

### DeprecatedIsStillUsed
Deprecated member 'PluginMetadataParseException' is still used
in `maven-script/maven-plugin-tools-model/src/main/java/org/apache/maven/tools/plugin/extractor/model/PluginMetadataParseException.java`
#### Snippet
```java
 */
@Deprecated
public class PluginMetadataParseException extends Exception {
    /** serialVersionUID */
    static final long serialVersionUID = 4022348153707995574L;
```

### DeprecatedIsStillUsed
Deprecated member 'PluginMetadataParser' is still used
in `maven-script/maven-plugin-tools-model/src/main/java/org/apache/maven/tools/plugin/extractor/model/PluginMetadataParser.java`
#### Snippet
```java
 */
@Deprecated
public class PluginMetadataParser {
    /**
     * Default implementation path which will be replaced in
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocInlineTagsToXhtmlConverter.java`
#### Snippet
```java
    private final Map<String, JavadocInlineTagToHtmlConverter> converters;

    private static final Pattern INLINE_TAG_PATTERN = Pattern.compile("\\{@([^\\s]*)(?:\\s([^\\}]*))?\\}");
    private static final int GROUP_TAG_NAME = 1;
    private static final int GROUP_REFERENCE = 2;
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocInlineTagsToXhtmlConverter.java`
#### Snippet
```java
    private final Map<String, JavadocInlineTagToHtmlConverter> converters;

    private static final Pattern INLINE_TAG_PATTERN = Pattern.compile("\\{@([^\\s]*)(?:\\s([^\\}]*))?\\}");
    private static final int GROUP_TAG_NAME = 1;
    private static final int GROUP_REFERENCE = 2;
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
        StringBuffer decoded = new StringBuffer(description.length() + 1024);

        Matcher matcher = Pattern.compile("\\{@(\\w+)\\s*([^\\}]*)\\}").matcher(description);
        while (matcher.find()) {
            String tag = matcher.group(1);
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
        StringBuffer decoded = new StringBuffer(description.length() + 1024);

        Matcher matcher = Pattern.compile("\\{@(\\w+)\\s*([^\\}]*)\\}").matcher(description);
        while (matcher.find()) {
            String tag = matcher.group(1);
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                text = "<code>" + text + "</code>";
            } else if ("link".equals(tag) || "linkplain".equals(tag) || "value".equals(tag)) {
                String pattern = "(([^#\\.\\s]+\\.)*([^#\\.\\s]+))?" + "(#([^\\(\\s]*)(\\([^\\)]*\\))?\\s*(\\S.*)?)?";
                final int label = 7;
                final int clazz = 3;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                text = "<code>" + text + "</code>";
            } else if ("link".equals(tag) || "linkplain".equals(tag) || "value".equals(tag)) {
                String pattern = "(([^#\\.\\s]+\\.)*([^#\\.\\s]+))?" + "(#([^\\(\\s]*)(\\([^\\)]*\\))?\\s*(\\S.*)?)?";
                final int label = 7;
                final int clazz = 3;
```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                text = "<code>" + text + "</code>";
            } else if ("link".equals(tag) || "linkplain".equals(tag) || "value".equals(tag)) {
                String pattern = "(([^#\\.\\s]+\\.)*([^#\\.\\s]+))?" + "(#([^\\(\\s]*)(\\([^\\)]*\\))?\\s*(\\S.*)?)?";
                final int label = 7;
                final int clazz = 3;
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                text = "<code>" + text + "</code>";
            } else if ("link".equals(tag) || "linkplain".equals(tag) || "value".equals(tag)) {
                String pattern = "(([^#\\.\\s]+\\.)*([^#\\.\\s]+))?" + "(#([^\\(\\s]*)(\\([^\\)]*\\))?\\s*(\\S.*)?)?";
                final int label = 7;
                final int clazz = 3;
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
     * group 1 = link target, group 2 = link label
     */
    private static final Pattern HTML_LINK_PATTERN = Pattern.compile("<a href=\\\"([^\\\"]*)\\\">(.*?)</a>");

    private static final Logger LOG = LoggerFactory.getLogger(PluginXdocGenerator.class);
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
     * group 1 = link target, group 2 = link label
     */
    private static final Pattern HTML_LINK_PATTERN = Pattern.compile("<a href=\\\"([^\\\"]*)\\\">(.*?)</a>");

    private static final Logger LOG = LoggerFactory.getLogger(PluginXdocGenerator.class);
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
     * group 1 = link target, group 2 = link label
     */
    private static final Pattern HTML_LINK_PATTERN = Pattern.compile("<a href=\\\"([^\\\"]*)\\\">(.*?)</a>");

    private static final Logger LOG = LoggerFactory.getLogger(PluginXdocGenerator.class);
```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
     */
    private static final Pattern REFERENCE_VALUE_PATTERN =
            Pattern.compile("^\\s*(?:(.+)/)??([^#\\s/]+)?(?:#([^\\s\\(]+(?:\\([^\\)]*\\))?))?(?: +(.*))?$");

    private static final int GROUP_INDEX_MODULE = 1;
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
     */
    private static final Pattern REFERENCE_VALUE_PATTERN =
            Pattern.compile("^\\s*(?:(.+)/)??([^#\\s/]+)?(?:#([^\\s\\(]+(?:\\([^\\)]*\\))?))?(?: +(.*))?$");

    private static final int GROUP_INDEX_MODULE = 1;
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    static Pattern getAnchorPattern(String anchorNameOrId) {
        // javadoc 17 uses"<section ... id=<anchor> >"
        return Pattern.compile(".*(name|NAME|id)=\\\"" + Pattern.quote(anchorNameOrId) + "\\\"");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    static Pattern getAnchorPattern(String anchorNameOrId) {
        // javadoc 17 uses"<section ... id=<anchor> >"
        return Pattern.compile(".*(name|NAME|id)=\\\"" + Pattern.quote(anchorNameOrId) + "\\\"");
    }

```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
         * <code>null</code> element denotes an unordered list.
         */
        private Stack<Counter> numbering = new Stack<>();

        /**
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
         * <code>null</code> element denotes an unordered list.
         */
        private Stack<Counter> numbering = new Stack<>();

        /**
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'upperBound' in a Serializable class
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocLinkGenerator.java`
#### Snippet
```java
        // upper bound is exclusive, lower bound inclusive (null means unlimited)
        private final JavaVersion lowerBound;
        private final JavaVersion upperBound;

        JavadocToolVersionRange(JavaVersion lowerBound, JavaVersion upperBound) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'lowerBound' in a Serializable class
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocLinkGenerator.java`
#### Snippet
```java

        // upper bound is exclusive, lower bound inclusive (null means unlimited)
        private final JavaVersion lowerBound;
        private final JavaVersion upperBound;

```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     * @param basedir not null
     * @param include not null
     * @return list of included files with default SCM excluded files
     */
    public static String[] findSources(String basedir, String include) {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     * @param include not null
     * @param exclude could be null
     * @return list of included files
     */
    public static String[] findSources(String basedir, String include, String exclude) {
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[^\\s]` can be simplified to '\\S'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocInlineTagsToXhtmlConverter.java`
#### Snippet
```java
    private final Map<String, JavadocInlineTagToHtmlConverter> converters;

    private static final Pattern INLINE_TAG_PATTERN = Pattern.compile("\\{@([^\\s]*)(?:\\s([^\\}]*))?\\}");
    private static final int GROUP_TAG_NAME = 1;
    private static final int GROUP_REFERENCE = 2;
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`pluginDescriptor.getMojos().size() > 0` can be replaced with '!pluginDescriptor.getMojos().isEmpty()'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java

            if (!(pluginDescriptor.getMojos() != null
                    && pluginDescriptor.getMojos().size() > 0)) {
                paragraph(getBundle(locale).getString("report.plugin.goals.nogoal"));
                endSection();
```

### SizeReplaceableByIsEmpty
`requirements.getOthers().size() > 0` can be replaced with '!requirements.getOthers().isEmpty()'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            }

            if (requirements.getOthers() != null && requirements.getOthers().size() > 0) {
                for (Iterator it = requirements.getOthers().keySet().iterator(); it.hasNext(); ) {
                    String key = it.next().toString();
```

### SizeReplaceableByIsEmpty
`pluginDescriptor.getMojos().size() > 0` can be replaced with '!pluginDescriptor.getMojos().isEmpty()'
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java

            if (!(pluginDescriptor.getMojos() != null
                    && pluginDescriptor.getMojos().size() > 0)) {
                paragraph(getBundle(locale).getString("report.plugin.goals.nogoal"));
                endSection();
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/RequirementsHistory.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequirementsHistory{");
        sb.append("version='").append(version).append('\'');
        sb.append(", maven='").append(maven).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/Requirements.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Requirements{");
        sb.append("maven='").append(maven).append('\'');
        sb.append(", jdk='").append(jdk).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/MojoAnnotatedClass.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MojoAnnotatedClass");
        sb.append("{className='").append(className).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ExecuteAnnotationContent.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ExecuteAnnotationContent");
        sb.append("{goal='").append(goal).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/AnnotatedField.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AnnotatedField");
        sb.append("{fieldName='").append(fieldName).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ComponentAnnotationContent.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("ComponentAnnotationContent");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/MojoAnnotationContent.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MojoAnnotationContent");
        sb.append("{name='").append(name).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/RequirementsHistory.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequirementsHistory{");
        sb.append("version='").append(version).append('\'');
        sb.append(", maven='").append(maven).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ParameterAnnotationContent.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("ParameterAnnotationContent");
```

### StringBufferReplaceableByString
`StringBuilder shortType` can be replaced with 'String'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            return getShortTypeOfSimpleType(type);
        } else {
            StringBuilder shortType = new StringBuilder();
            shortType.append(getShortTypeOfSimpleType(type.substring(0, startTypeArguments)));
            shortType
```

### StringBufferReplaceableByString
`StringBuilder memberBuilder` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
                }
                // reconstruct member with fully qualified names but leaving out the argument names
                StringBuilder memberBuilder = new StringBuilder(methodName);
                memberBuilder.append("(");
                memberBuilder.append(parameterTypes.stream()
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Counter` may be 'static'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
         * Holds the index of the current item in a numbered list.
         */
        class Counter {
            int value;
        }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends JavadocBlockTagToHtmlConverter`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocBlockTagsToXhtmlConverter.java`
#### Snippet
```java
    public JavadocBlockTagsToXhtmlConverter(
            JavadocInlineTagsToXhtmlConverter inlineTagsConverter,
            Map<String, JavadocBlockTagToHtmlConverter> blockTagConverters) {
        this.inlineTagsConverter = inlineTagsConverter;
        this.blockTagConverters = blockTagConverters;
```

### BoundedWildcard
Can generalize to `? extends RequirementsHistory`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
                MavenProject project,
                Requirements requirements,
                List<RequirementsHistory> requirementsHistories,
                Sink sink,
                PluginDescriptor pluginDescriptor,
```

### BoundedWildcard
Can generalize to `? extends Plugin`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
        }

        private static Plugin getCompilerPlugin(Map<String, Plugin> pluginsAsMap) {
            return pluginsAsMap.get("org.apache.maven.plugins:maven-compiler-plugin");
        }
```

### BoundedWildcard
Can generalize to `? extends JavadocInlineTagToHtmlConverter`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocInlineTagsToXhtmlConverter.java`
#### Snippet
```java

    @Inject
    public JavadocInlineTagsToXhtmlConverter(Map<String, JavadocInlineTagToHtmlConverter> converters) {
        this.converters = converters;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java

    private void analyzeClassStream(
            Map<String, MojoAnnotatedClass> mojoAnnotatedClasses,
            InputStream is,
            Artifact artifact,
```

### BoundedWildcard
Can generalize to `? super MojoAnnotatedClass`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java

    private void analyzeClassStream(
            Map<String, MojoAnnotatedClass> mojoAnnotatedClasses,
            InputStream is,
            Artifact artifact,
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java

    protected void scan(
            Map<String, MojoAnnotatedClass> mojoAnnotatedClasses,
            File source,
            List<String> includePatterns,
```

### BoundedWildcard
Can generalize to `? super MojoAnnotatedClass`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java

    protected void scan(
            Map<String, MojoAnnotatedClass> mojoAnnotatedClasses,
            File source,
            List<String> includePatterns,
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
     * @param l
     */
    public AntPropertyHelper(ExpressionEvaluator exprEvaluator, Set<Artifact> artifacts, Log l) {
        this.mavenProject = null;
        this.exprEvaluator = exprEvaluator;
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntMojoWrapper.java`
#### Snippet
```java
    }

    public Path getPathFromArtifacts(Collection<Artifact> artifacts, Project antProject)
            throws DependencyResolutionRequiredException {
        List<String> list = new ArrayList<>(artifacts.size());
```

### BoundedWildcard
Can generalize to `? super String`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/LinkUtils.java`
#### Snippet
```java
            FullyQualifiedJavadocReference fqReference,
            ConverterContext context,
            UnaryOperator<String> labelDecorator,
            String htmlComment) {
        String label = getReferenceLabel(fqReference, context);
```

### BoundedWildcard
Can generalize to `? extends Plugin`
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
        }

        private static Plugin getCompilerPlugin(Map<String, Plugin> pluginsAsMap) {
            return pluginsAsMap.get("org.apache.maven.plugins:maven-compiler-plugin");
        }
```

### BoundedWildcard
Can generalize to `? extends RequirementsHistory`
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
        PluginOverviewRenderer(
                MavenProject project,
                List<RequirementsHistory> requirementsHistories,
                Sink sink,
                PluginDescriptor pluginDescriptor,
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
     * @return list of component dependencies, without in provided scope
     */
    public static List<ComponentDependency> toComponentDependencies(Collection<Artifact> artifacts) {
        List<ComponentDependency> componentDeps = new LinkedList<>();

```

### BoundedWildcard
Can generalize to `? extends Parameter`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
     * @param w              not null
     */
    private void writeParameterList(String title, List<Parameter> parameterList, XMLWriter w, String goal) {
        w.startElement("subsection");
        w.addAttribute("name", title);
```

### BoundedWildcard
Can generalize to `? extends Parameter`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
     * @return the parameters list without components.
     */
    private List<Parameter> filterParameters(List<Parameter> parameterList) {
        List<Parameter> filtered = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends Parameter`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
     * @return list of parameters depending the value of <code>required</code>
     */
    private List<Parameter> getParametersByRequired(boolean required, List<Parameter> parameterList) {
        List<Parameter> list = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends MojoDescriptor`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     * @see MojoDescriptor#getGoal()
     */
    public static void sortMojos(List<MojoDescriptor> mojoDescriptors) {
        if (mojoDescriptors != null) {
            Collections.sort(mojoDescriptors, new Comparator<MojoDescriptor>() {
```

### BoundedWildcard
Can generalize to `? extends Parameter`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     * @since 2.4.4
     */
    public static void sortMojoParameters(List<Parameter> parameters) {
        if (parameters != null) {
            Collections.sort(parameters, new Comparator<Parameter>() {
```

### BoundedWildcard
Can generalize to `? extends MojoAnnotatedClass`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java

    protected MojoAnnotatedClass findClassWithExecuteAnnotationInParentHierarchy(
            MojoAnnotatedClass mojoAnnotatedClass, Map<String, MojoAnnotatedClass> mojoAnnotatedClasses) {
        if (mojoAnnotatedClass.getExecute() != null) {
            return mojoAnnotatedClass;
```

### BoundedWildcard
Can generalize to `? extends File`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java

    private void extendJavaProjectBuilder(
            JavaProjectBuilder builder, List<File> sourceDirectories, Set<Artifact> artifacts) {

        // Build isolated Classloader with only the artifacts of the project (none of this plugin)
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java

    private void extendJavaProjectBuilder(
            JavaProjectBuilder builder, List<File> sourceDirectories, Set<Artifact> artifacts) {

        // Build isolated Classloader with only the artifacts of the project (none of this plugin)
```

### BoundedWildcard
Can generalize to `? extends JavaClass`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
     */
    private Map<String, JavaAnnotatedElement> extractFieldsAnnotations(
            JavaClass javaClass, Map<String, JavaClass> javaClassesMap) {
        try {
            Map<String, JavaAnnotatedElement> rawParams = new TreeMap<>();
```

### BoundedWildcard
Can generalize to `? extends MojoAnnotatedClass`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java

    private JavaProjectBuilder scanJavadoc(
            PluginToolsRequest request, Collection<MojoAnnotatedClass> mojoAnnotatedClasses)
            throws ExtractionException {
        // found artifact from reactors to scan sources
```

### BoundedWildcard
Can generalize to `? extends MojoAnnotatedClass`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
            MojoAnnotatedClass mojoAnnotatedClass,
            List<ParameterAnnotationContent> parameterAnnotationContents,
            Map<String, MojoAnnotatedClass> mojoAnnotatedClasses) {
        parameterAnnotationContents.addAll(mojoAnnotatedClass.getParameters().values());
        String parentClassName = mojoAnnotatedClass.getParentClassName();
```

### BoundedWildcard
Can generalize to `? extends MojoAnnotatedClass`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
            MojoAnnotatedClass mojoAnnotatedClass,
            List<ComponentAnnotationContent> componentAnnotationContents,
            Map<String, MojoAnnotatedClass> mojoAnnotatedClasses) {
        componentAnnotationContents.addAll(mojoAnnotatedClass.getComponents().values());
        String parentClassName = mojoAnnotatedClass.getParentClassName();
```

### BoundedWildcard
Can generalize to `? extends JavaClass`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
     */
    private Map<String, JavaAnnotatedElement> extractMethodsAnnotations(
            JavaClass javaClass, Map<String, JavaClass> javaClassesMap) {
        try {
            Map<String, JavaAnnotatedElement> rawParams = new TreeMap<>();
```

### BoundedWildcard
Can generalize to `? extends MojoDescriptorExtractor`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/scanner/DefaultMojoScanner.java`
#### Snippet
```java
     */
    @Inject
    public DefaultMojoScanner(Map<String, MojoDescriptorExtractor> extractors) {
        this.mojoDescriptorExtractors = extractors;

```

### BoundedWildcard
Can generalize to `? extends MojoAnnotatedClass`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
            JavaClass declaringClass,
            JavaProjectBuilder javaProjectBuilder,
            Map<String, MojoAnnotatedClass> mojoAnnotatedClasses,
            JavadocLinkGenerator linkGenerator,
            int lineNumber) {
```

### BoundedWildcard
Can generalize to `? super URI`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            FullyQualifiedJavadocReference javadocReference,
            URI baseUri,
            BiFunction<URI, FullyQualifiedJavadocReference, URI> fragmentAppender,
            Optional<String> pathPrefix)
            throws IllegalArgumentException {
```

### BoundedWildcard
Can generalize to `? super FullyQualifiedJavadocReference`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            FullyQualifiedJavadocReference javadocReference,
            URI baseUri,
            BiFunction<URI, FullyQualifiedJavadocReference, URI> fragmentAppender,
            Optional<String> pathPrefix)
            throws IllegalArgumentException {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/AbstractScriptedMojoDescriptorExtractor.java`
#### Snippet
```java
        MavenProject project = request.getProject();

        @SuppressWarnings("unchecked")
        Map<String, Set<File>> scriptFilesKeyedByBasedir =
                gatherFilesByBasedir(project.getBasedir(), project.getScriptSourceRoots(), scriptExtension, request);

        List<MojoDescriptor> mojoDescriptors;
```

### RedundantSuppression
Redundant suppression
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/AbstractScriptedMojoDescriptorExtractor.java`
#### Snippet
```java
        List<MojoDescriptor> mojoDescriptors;
        if (!StringUtils.isEmpty(metadataExtension)) {
            @SuppressWarnings("unchecked")
            Map<String, Set<File>> metadataFilesKeyedByBasedir = gatherFilesByBasedir(
                    project.getBasedir(), project.getScriptSourceRoots(), metadataExtension, request);

            mojoDescriptors = extractMojoDescriptorsFromMetadata(metadataFilesKeyedByBasedir, request);
```

### RedundantSuppression
Redundant suppression
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static boolean isMavenReport(String impl, MavenProject project) throws IllegalArgumentException {
        if (impl == null) {
            throw new IllegalArgumentException("mojo implementation should be declared");
```

### RedundantSuppression
Redundant suppression
in `maven-script/maven-plugin-tools-ant/src/main/java/org/apache/maven/tools/plugin/extractor/ant/AntMojoDescriptorExtractor.java`
#### Snippet
```java

                    for (MojoDescriptor descriptor : mojoDescriptors) {
                        @SuppressWarnings("unchecked")
                        Map<String, ?> paramMap = descriptor.getParameterMap();

                        if (!paramMap.containsKey("basedir")) {
```

### RedundantSuppression
Redundant suppression
in `maven-script/maven-plugin-tools-ant/src/main/java/org/apache/maven/tools/plugin/extractor/ant/AntMojoDescriptorExtractor.java`
#### Snippet
```java
                        }

                        @SuppressWarnings("unchecked")
                        List<ComponentRequirement> requirements = descriptor.getRequirements();
                        Map<String, ComponentRequirement> reqMap = new HashMap<>();

```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                if (packageNames.get(name) != null) {
                    int next = (packageNames.get(name)).intValue() + 1;
                    packageNames.put(name, Integer.valueOf(next));
                } else {
                    packageNames.put(name, Integer.valueOf(1));
```

### UnnecessaryBoxing
Unnecessary boxing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                    packageNames.put(name, Integer.valueOf(next));
                } else {
                    packageNames.put(name, Integer.valueOf(1));
                }
            } else {
```

### UnnecessaryBoxing
Unnecessary boxing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                }
            } else {
                packageNames.put("", Integer.valueOf(1));
            }
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
            request.setPluginDescriptor(extendPluginDescriptor(request));

            outputDirectory.mkdirs();

            PluginDescriptorFilesGenerator pluginDescriptorGenerator = new PluginDescriptorFilesGenerator();
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
        try {
            File outputDir = outputDirectory;
            outputDir.mkdirs();

            PluginXdocGenerator generator = new PluginXdocGenerator(
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginHelpGenerator.java`
#### Snippet
```java

            File helpClass = new File(destinationDirectory, sourcePath);
            helpClass.getParentFile().mkdirs();

            String helpClassSources = getHelpClassSources(getPluginHelpPath(mavenProject));
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
        try {
            File outputDir = outputDirectory;
            outputDir.mkdirs();

            PluginXdocGenerator generator = new PluginXdocGenerator(
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java

        if (!destinationFile.getParentFile().exists()) {
            destinationFile.getParentFile().mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
                                + sourcesArtifact.getArtifactId() + "/" + sourcesArtifact.getVersion()
                                + "/" + sourcesArtifact.getClassifier());
                extractDirectory.mkdirs();

                UnArchiver unArchiver = archiverManager.getUnArchiver("jar");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/AbstractScriptedMojoDescriptorExtractor.java`
#### Snippet
```java

        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/AbstractScriptedMojoDescriptorExtractor.java`
#### Snippet
```java

                if (!outputFile.getParentFile().exists()) {
                    outputFile.getParentFile().mkdirs();
                }

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleName'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/LinkUtils.java`
#### Snippet
```java

    private static String createLabel(
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packageName'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/LinkUtils.java`
#### Snippet
```java
    private static String createLabel(
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'className'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/LinkUtils.java`
#### Snippet
```java
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member) {
        StringBuilder sb = new StringBuilder();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/LinkUtils.java`
#### Snippet
```java
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member) {
        StringBuilder sb = new StringBuilder();
        if (packageName.isPresent() && !"java.lang".equals(packageName.get())) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'packageNameClassName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
    private final Optional<String> moduleName;

    private final Optional<String> packageNameClassName;

    private final Optional<String> member; // optional, but may appear with both className and packageName being null
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'label'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
    private final Optional<String> member; // optional, but may appear with both className and packageName being null

    private final Optional<String> label;

    /*
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'moduleName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
 */
public class JavadocReference {
    private final Optional<String> moduleName;

    private final Optional<String> packageNameClassName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java

    JavadocReference(
            Optional<String> moduleName,
            Optional<String> packageNameClassName,
            Optional<String> member,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packageNameClassName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
    JavadocReference(
            Optional<String> moduleName,
            Optional<String> packageNameClassName,
            Optional<String> member,
            Optional<String> label) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
            Optional<String> moduleName,
            Optional<String> packageNameClassName,
            Optional<String> member,
            Optional<String> label) {
        this.moduleName = moduleName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
            Optional<String> packageNameClassName,
            Optional<String> member,
            Optional<String> label) {
        this.moduleName = moduleName;
        this.packageNameClassName = packageNameClassName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'member'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
    private final Optional<String> packageNameClassName;

    private final Optional<String> member; // optional, but may appear with both className and packageName being null

    private final Optional<String> label;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java

    private Optional<FullyQualifiedJavadocReference> resolveMember(
            String fullyQualifiedPackageNameClassName, Optional<String> member, Optional<String> label) {
        return resolveMember(fullyQualifiedPackageNameClassName, "", member, label);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java

    private Optional<FullyQualifiedJavadocReference> resolveMember(
            String fullyQualifiedPackageNameClassName, Optional<String> member, Optional<String> label) {
        return resolveMember(fullyQualifiedPackageNameClassName, "", member, label);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java

    private Optional<FullyQualifiedJavadocReference> resolveMember(
            JavaClass javaClass, Optional<String> member, Optional<String> label) {
        final Optional<MemberType> memberType;
        Optional<String> resolvedMember = member;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java

    private Optional<FullyQualifiedJavadocReference> resolveMember(
            JavaClass javaClass, Optional<String> member, Optional<String> label) {
        final Optional<MemberType> memberType;
        Optional<String> resolvedMember = member;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
            String fullyQualifiedPackageNameClassName,
            String nestedClassName,
            Optional<String> member,
            Optional<String> label) {
        JavaClass javaClass = javaProjectBuilder.getClassByName(fullyQualifiedPackageNameClassName);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
            String nestedClassName,
            Optional<String> member,
            Optional<String> label) {
        JavaClass javaClass = javaProjectBuilder.getClassByName(fullyQualifiedPackageNameClassName);
        if (!isClassFound(javaClass)) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'javaModule'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
    final int lineNumber;

    final Optional<JavaModule> javaModule;

    final Map<String, Object> attributes;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalMember'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     */
    // CHECKSTYLE_ON: LineLength
    URI appendMemberAsFragment(URI url, Optional<String> optionalMember, Optional<MemberType> optionalMemberType)
            throws URISyntaxException, IOException {
        if (!optionalMember.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalMemberType'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     */
    // CHECKSTYLE_ON: LineLength
    URI appendMemberAsFragment(URI url, Optional<String> optionalMember, Optional<MemberType> optionalMemberType)
            throws URISyntaxException, IOException {
        if (!optionalMember.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    }

    public boolean hasEntryFor(Optional<String> moduleName, Optional<String> packageName) {
        if (containedPackageNamesAndModules.isEmpty()) {
            throw new UnsupportedOperationException(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packageName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    }

    public boolean hasEntryFor(Optional<String> moduleName, Optional<String> packageName) {
        if (containedPackageNamesAndModules.isEmpty()) {
            throw new UnsupportedOperationException(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java

    static URI createLink(
            URI baseUri, Optional<String> moduleName, Optional<String> packageName, Optional<String> className)
            throws URISyntaxException {
        StringBuilder link = new StringBuilder();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packageName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java

    static URI createLink(
            URI baseUri, Optional<String> moduleName, Optional<String> packageName, Optional<String> className)
            throws URISyntaxException {
        StringBuilder link = new StringBuilder();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'className'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java

    static URI createLink(
            URI baseUri, Optional<String> moduleName, Optional<String> packageName, Optional<String> className)
            throws URISyntaxException {
        StringBuilder link = new StringBuilder();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pathPrefix'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            URI baseUri,
            BiFunction<URI, FullyQualifiedJavadocReference, URI> fragmentAppender,
            Optional<String> pathPrefix)
            throws IllegalArgumentException {
        try {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java

    public FullyQualifiedJavadocReference(
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packageName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
    public FullyQualifiedJavadocReference(
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'className'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'memberType'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
            boolean isExternal) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
            boolean isExternal) {
        super(moduleName, className, member, label);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'memberType'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
    private final Optional<String> packageName;

    private final Optional<MemberType> memberType;

    /** The type of the member part of the reference. */
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'className'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
    public FullyQualifiedJavadocReference(
            String packageName,
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            String packageName,
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'memberType'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
            boolean isExternal) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
            boolean isExternal) {
        this(Optional.empty(), Optional.of(packageName), className, member, memberType, label, isExternal);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
    }

    public FullyQualifiedJavadocReference(String packageName, Optional<String> label, boolean isExternal) {
        this(packageName, Optional.empty(), Optional.empty(), Optional.empty(), label, isExternal);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'packageName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
    private final boolean isExternal;

    private final Optional<String> packageName;

    private final Optional<MemberType> memberType;
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java

            if (StringUtils.isNotEmpty(value)) {
                defaultValue = Boolean.valueOf(value).booleanValue();
            }
        }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java

            if (StringUtils.isNotEmpty(value)) {
                return Boolean.valueOf(value).booleanValue();
            } else {
                return defaultForTag;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                String name = impl.substring(0, impl.lastIndexOf('.'));
                if (packageNames.get(name) != null) {
                    int next = (packageNames.get(name)).intValue() + 1;
                    packageNames.put(name, Integer.valueOf(next));
                } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
        int max = 0;
        for (Map.Entry<String, Integer> entry : packageNames.entrySet()) {
            int value = entry.getValue().intValue();
            if (value > max) {
                max = value;
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
     * @param l
     */
    public AntPropertyHelper(ExpressionEvaluator exprEvaluator, Log l) {
        this(exprEvaluator, Collections.<Artifact>emptySet(), l);
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
     * @param l
     */
    public AntPropertyHelper(MavenProject project, Log l) {
        mavenProject = project;
        log = l;
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
     * @return The property value.
     */
    private Object getPropertyHook(String ns, String name, boolean user, MavenProject mavenProject) {
        Object val = null;
        try {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/HelpGeneratorMojo.java`
#### Snippet
```java
        if (packageName == null) {
            packageName = project.getGroupId() + "." + project.getArtifactId();
            packageName = packageName.replace("-", "_");

            String[] packageItems = packageName.split("\\.");
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoClassVisitor.java`
#### Snippet
```java
        }
        String typeParameters = declaration.substring(startTypeParameters + 1, declaration.lastIndexOf('>'));
        return Arrays.asList(typeParameters.split(", "));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/HtmlToPlainTextConverter.java`
#### Snippet
```java
        public String toString() {
            // collate multiple consecutive spaces
            return accum.toString().replaceAll(" +", " ").replace("\n ", "\n");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/HtmlToPlainTextConverter.java`
#### Snippet
```java
        public String toString() {
            // collate multiple consecutive spaces
            return accum.toString().replaceAll(" +", " ").replace("\n ", "\n");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginHelpGenerator.java`
#### Snippet
```java
        // Apply OS lineSeparator instead of template's lineSeparator to have consistent separators for
        // all source files.
        return stringWriter.toString().replaceAll("(\r\n|\n|\r)", System.lineSeparator());
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
            // some heuristics here
            String[] parameterTypes = type.substring(startOfParameterType + 1, type.lastIndexOf(">"))
                    .split(",\\s*");
            switch (parameterTypes.length) {
                case 1: // if only one parameter type, assume collection, first parameter type is most interesting
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java

    private static String getShortTypeOfTypeArgument(String type) {
        String[] typeArguments = type.split(",\\s*");
        StringBuilder shortType = new StringBuilder();
        for (int i = 0; i < typeArguments.length; i++) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
    private String escapeXml(String text) {
        if (text != null) {
            text = text.replace("&", "&amp;");
            text = text.replace("<", "&lt;");
            text = text.replace(">", "&gt;");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
        if (text != null) {
            text = text.replace("&", "&amp;");
            text = text.replace("<", "&lt;");
            text = text.replace(">", "&gt;");
            text = text.replace("\"", "&quot;");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            text = text.replace("&", "&amp;");
            text = text.replace("<", "&lt;");
            text = text.replace(">", "&gt;");
            text = text.replace("\"", "&quot;");
            text = text.replace("\'", "&apos;");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            text = text.replace("<", "&lt;");
            text = text.replace(">", "&gt;");
            text = text.replace("\"", "&quot;");
            text = text.replace("\'", "&apos;");
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            text = text.replace(">", "&gt;");
            text = text.replace("\"", "&quot;");
            text = text.replace("\'", "&apos;");
        }
        return text;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
                if (importName.endsWith(".*")) {
                    resolvedName = resolveMember(
                            importName.replace("*", packageNameClassName), reference.getMember(), reference.getLabel());
                    if (resolvedName.isPresent()) {
                        return resolvedName.get();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            case JDK7_OR_LOWER:
                // separate argument by spaces
                fragment = fragment.replace(",", ", ");
                break;
            case JDK8_OR_9:
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            case JDK8_OR_9:
                // replace [] by ":A"
                fragment = fragment.replace("[]", ":A");
                // separate arguments by "-", enclose all arguments in "-" for javadoc 8
                fragment = fragment.replace('(', '-').replace(')', '-').replace(',', '-');
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
                throw new IllegalArgumentException("When member is set, also the member type needs to be set");
            }
            if (member.get().matches(".*\\s.*")) {
                throw new IllegalArgumentException("member must not contain any whitespace characters!");
            }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/Requirements.java`
#### Snippet
```java
     * Field others.
     */
    private java.util.Properties others;

    public String getMaven() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.descriptor` is unnecessary and can be removed
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java
 * https://maven.apache.org/developers/mojo-api-specification.html</a>
 *
 * @see org.apache.maven.plugin.descriptor.MojoDescriptor
 */
@Named(JavaJavadocMojoDescriptorExtractor.NAME)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.tools.ant` is unnecessary and can be removed
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java

    /**
     * @see org.apache.tools.ant.PropertyHelper#getPropertyHook(java.lang.String, java.lang.String, boolean)
     */
    public synchronized Object getPropertyHook(String ns, String name, boolean user) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java

    /**
     * @see org.apache.tools.ant.PropertyHelper#getPropertyHook(java.lang.String, java.lang.String, boolean)
     */
    public synchronized Object getPropertyHook(String ns, String name, boolean user) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java

    /**
     * @see org.apache.tools.ant.PropertyHelper#getPropertyHook(java.lang.String, java.lang.String, boolean)
     */
    public synchronized Object getPropertyHook(String ns, String name, boolean user) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.descriptor` is unnecessary, and can be replaced with an import
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java

            for (ParameterAnnotationContent parameterAnnotationContent : new TreeSet<>(parameters.values())) {
                org.apache.maven.plugin.descriptor.Parameter parameter =
                        new org.apache.maven.plugin.descriptor.Parameter();
                String name = StringUtils.isEmpty(parameterAnnotationContent.name())
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.descriptor` is unnecessary, and can be replaced with an import
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
            for (ParameterAnnotationContent parameterAnnotationContent : new TreeSet<>(parameters.values())) {
                org.apache.maven.plugin.descriptor.Parameter parameter =
                        new org.apache.maven.plugin.descriptor.Parameter();
                String name = StringUtils.isEmpty(parameterAnnotationContent.name())
                        ? parameterAnnotationContent.getFieldName()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.descriptor` is unnecessary, and can be replaced with an import
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java

            for (ComponentAnnotationContent componentAnnotationContent : new TreeSet<>(components.values())) {
                org.apache.maven.plugin.descriptor.Parameter parameter =
                        new org.apache.maven.plugin.descriptor.Parameter();
                parameter.setName(componentAnnotationContent.getFieldName());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.descriptor` is unnecessary, and can be replaced with an import
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
            for (ComponentAnnotationContent componentAnnotationContent : new TreeSet<>(components.values())) {
                org.apache.maven.plugin.descriptor.Parameter parameter =
                        new org.apache.maven.plugin.descriptor.Parameter();
                parameter.setName(componentAnnotationContent.getFieldName());

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            String line;
            String module = null;
            while ((line = reader.readLine()) != null) {
                // each line starting with "module:" contains the module name afterwards
                if (line.startsWith(PREFIX_MODULE)) {
```

## RuleId[id=ExtendsAnnotation]
### ExtendsAnnotation
Class 'ExecuteAnnotationContent' implements annotation interface `Execute`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ExecuteAnnotationContent.java`
#### Snippet
```java
 * @since 3.0
 */
public class ExecuteAnnotationContent implements Execute {
    private String goal;

```

### ExtendsAnnotation
Class 'ComponentAnnotationContent' implements annotation interface `Component`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ComponentAnnotationContent.java`
#### Snippet
```java
 * @since 3.0
 */
public class ComponentAnnotationContent extends AnnotatedField implements Component {
    private String roleClassName;

```

### ExtendsAnnotation
Class 'MojoAnnotationContent' implements annotation interface `Mojo`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/MojoAnnotationContent.java`
#### Snippet
```java
 * @since 3.0
 */
public class MojoAnnotationContent extends AnnotatedContent implements Mojo {
    private String name;

```

### ExtendsAnnotation
Class 'ParameterAnnotationContent' implements annotation interface `Parameter`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ParameterAnnotationContent.java`
#### Snippet
```java
 * @since 3.0
 */
public class ParameterAnnotationContent extends AnnotatedField implements Parameter {

    private String name;
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> mojoDependencies = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/MojoAnnotationContent.java`
#### Snippet
```java
    private String configurator;

    private boolean threadSafe = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/MojoAnnotationContent.java`
#### Snippet
```java
    private boolean requiresReports = false;

    private boolean aggregator = false;

    private boolean requiresDirectInvocation = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/MojoAnnotationContent.java`
#### Snippet
```java
    private boolean requiresProject = true;

    private boolean requiresReports = false;

    private boolean aggregator = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/MojoAnnotationContent.java`
#### Snippet
```java
    private boolean aggregator = false;

    private boolean requiresDirectInvocation = false;

    private boolean requiresOnline = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/MojoAnnotationContent.java`
#### Snippet
```java
    private boolean requiresDirectInvocation = false;

    private boolean requiresOnline = false;

    private boolean inheritByDefault = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ParameterAnnotationContent.java`
#### Snippet
```java
    private boolean required = false;

    private boolean readonly = false;

    private String className;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ParameterAnnotationContent.java`
#### Snippet
```java
    private String defaultValue;

    private boolean required = false;

    private boolean readonly = false;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `name`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/HelpGeneratorMojo.java`
#### Snippet
```java
    private String prefixSpecialCase(String name) {
        if (SourceVersion.isKeyword(name) || !Character.isJavaIdentifierStart(name.charAt(0))) {
            name = "_" + name;
        }
        return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `defaultValue`
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java

            if (StringUtils.isNotEmpty(value)) {
                defaultValue = Boolean.valueOf(value).booleanValue();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/JavadocTagToHtmlConverter.java`
#### Snippet
```java
    protected static String escapeXmlElement(String text) {
        if (text.indexOf('<') >= 0) {
            text = LT.matcher(text).replaceAll("&lt;");
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/JavadocTagToHtmlConverter.java`
#### Snippet
```java

        if (text.indexOf('>') >= 0) {
            text = GT.matcher(text).replaceAll("&gt;");
        }
        return text;
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java

        if (value == null) {
            value = "";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `addedUl`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
        if (!addedUl) {
            w.startElement("ul");
            addedUl = true;
        }
        return addedUl;
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
    private String escapeXml(String text) {
        if (text != null) {
            text = text.replace("&", "&amp;");
            text = text.replace("<", "&lt;");
            text = text.replace(">", "&gt;");
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
        if (text != null) {
            text = text.replace("&", "&amp;");
            text = text.replace("<", "&lt;");
            text = text.replace(">", "&gt;");
            text = text.replace("\"", "&quot;");
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            text = text.replace("&", "&amp;");
            text = text.replace("<", "&lt;");
            text = text.replace(">", "&gt;");
            text = text.replace("\"", "&quot;");
            text = text.replace("\'", "&apos;");
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            text = text.replace("<", "&lt;");
            text = text.replace(">", "&gt;");
            text = text.replace("\"", "&quot;");
            text = text.replace("\'", "&apos;");
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            text = text.replace(">", "&gt;");
            text = text.replace("\"", "&quot;");
            text = text.replace("\'", "&apos;");
        }
        return text;
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            if (className.endsWith("[]")) {
                // url must point to simple class
                className = className.substring(0, className.length() - 2);
            }
            return createLink(baseUri, Optional.empty(), Optional.of(packageName), Optional.of(className));
```

### AssignmentToMethodParameter
Assignment to method parameter `binaryName`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            indexOfDotBetweenPackageAndClass = binaryName.lastIndexOf('.', indexOfDollar);
            // replace dollar by dot
            binaryName = binaryName.replace('$', '.');
        } else {
            indexOfDotBetweenPackageAndClass = binaryName.lastIndexOf('.');
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `ContextEnabled`
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntMojoWrapper.java`
#### Snippet
```java
 */
@Deprecated
public class AntMojoWrapper extends AbstractMojo implements ContextEnabled, MapOrientedComponent, LogEnabled {

    private Map<String, Object> pluginContext;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-19-02-19-38.301.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `maven-plugin-plugin/src/main/java/org/apache/maven/artifact/repository/metadata/GroupRepositoryMetadata.java`
#### Snippet
```java

    public String getArtifactId() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-plugin-plugin/src/main/java/org/apache/maven/artifact/repository/metadata/GroupRepositoryMetadata.java`
#### Snippet
```java

    public ArtifactRepository getRepository() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-plugin-plugin/src/main/java/org/apache/maven/artifact/repository/metadata/GroupRepositoryMetadata.java`
#### Snippet
```java

    public String getBaseVersion() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
            getLog().warn("Cannot determine the minimally required Java version automatically, it is recommended to "
                    + "configure some explicit value manually.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoMethodVisitor.java`
#### Snippet
```java
        String annotationClassName = Type.getType(desc).getClassName();
        if (!MojoAnnotationsScanner.METHOD_LEVEL_ANNOTATIONS.contains(annotationClassName)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoFieldVisitor.java`
#### Snippet
```java
        String annotationClassName = Type.getType(desc).getClassName();
        if (!MojoAnnotationsScanner.FIELD_LEVEL_ANNOTATIONS.contains(annotationClassName)) {
            return null;
        }
        MojoAnnotationVisitor mojoAnnotationVisitor = new MojoAnnotationVisitor(annotationClassName);
```

### ReturnNull
Return of `null`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoClassVisitor.java`
#### Snippet
```java
        if ((access & Opcodes.ACC_PUBLIC) != Opcodes.ACC_PUBLIC
                || (access & Opcodes.ACC_STATIC) == Opcodes.ACC_STATIC) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoClassVisitor.java`
#### Snippet
```java

        if (name.length() < 4 || !(name.startsWith("add") || name.startsWith("set"))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoClassVisitor.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoClassVisitor.java`
#### Snippet
```java
        String annotationClassName = Type.getType(desc).getClassName();
        if (!MojoAnnotationsScanner.CLASS_LEVEL_ANNOTATIONS.contains(annotationClassName)) {
            return null;
        }
        if (annotationClassName.startsWith(MojoAnnotationsScanner.V4_API_ANNOTATIONS_PACKAGE)) {
```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ExecuteAnnotationContent.java`
#### Snippet
```java
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ComponentAnnotationContent.java`
#### Snippet
```java
    public Class<?> role() {
        // not used
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ComponentAnnotationContent.java`
#### Snippet
```java
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/MojoAnnotationContent.java`
#### Snippet
```java
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ParameterAnnotationContent.java`
#### Snippet
```java
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
        }
        // no property can be extracted
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
        String parentClassName = mojoAnnotatedClass.getParentClassName();
        if (StringUtils.isEmpty(parentClassName)) {
            return null;
        }
        MojoAnnotatedClass parent = mojoAnnotatedClasses.get(parentClassName);
```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
        MojoAnnotatedClass parent = mojoAnnotatedClasses.get(parentClassName);
        if (parent == null) {
            return null;
        }
        return findClassWithExecuteAnnotationInParentHierarchy(parent, mojoAnnotatedClasses);
```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
        String comment = element.getComment();
        if (comment == null) {
            return null;
        }
        StringBuilder description = new StringBuilder(javadocInlineTagsToHtmlConverter.convert(comment, context));
```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
        if (project.getProjectReferences() == null
                || project.getProjectReferences().isEmpty()) {
            return null;
        }
        Collection<MavenProject> mavenProjects = project.getProjectReferences().values();
```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
        } catch (NoClassDefFoundError e) {
            if (e.getMessage().replace('/', '.').contains(MojoAnnotationsScanner.V4_API_PLUGIN_PACKAGE)) {
                return null;
            }
            String str;
```

### ReturnNull
Return of `null`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/MojoDescriptorExtractor.java`
#### Snippet
```java
     */
    default String getRequiredJavaVersion() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/AbstractScriptedMojoDescriptorExtractor.java`
#### Snippet
```java
     */
    protected String getMetadataFileExtension(PluginToolsRequest request) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/AbstractScriptedMojoDescriptorExtractor.java`
#### Snippet
```java
            Map<String, Set<File>> metadataFilesByBasedir, PluginToolsRequest request)
            throws ExtractionException, InvalidPluginDescriptorException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/AbstractScriptedMojoDescriptorExtractor.java`
#### Snippet
```java
            Map<String, Set<File>> scriptFilesKeyedByBasedir, PluginToolsRequest request)
            throws ExtractionException, InvalidPluginDescriptorException {
        return null;
    }

```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    }

    boolean findAnchor(URI uri, String anchorNameOrId) throws MalformedURLException, IOException {
        return findLineContaining(uri, settings, getAnchorPattern(anchorNameOrId));
    }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java
            }
        }
        builder.addClassLoader(new URLClassLoader(urls.toArray(new URL[0]), ClassLoader.getSystemClassLoader()));

        MavenProject project = request.getProject();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
            }
        }
        builder.addClassLoader(new URLClassLoader(urls.toArray(new URL[0]), ClassLoader.getSystemClassLoader()));

        for (File source : sourceDirectories) {
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/EnhancedParameterWrapper.java`
#### Snippet
```java
    }

    public boolean equals(Object other) {
        return delegate.equals(other);
    }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `relativePath` initializer `null` is redundant
in `maven-script/maven-plugin-tools-beanshell/src/main/java/org/apache/maven/tools/plugin/extractor/beanshell/BeanshellMojoDescriptorExtractor.java`
#### Snippet
```java

            for (File scriptFile : metadataFiles) {
                String relativePath = null;

                if (basedir.endsWith("/")) {
```

### UnusedAssignment
Variable `reader` initializer `null` is redundant
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java

    static BufferedReader getReader(URL url, Settings settings) throws IOException {
        BufferedReader reader = null;

        if ("file".equals(url.getProtocol())) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `maven != null` is always `true`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            tableCell(getBundle(locale).getString("report.plugin.systemrequirements.maven"));
            tableCell(
                    (maven != null
                            ? maven
                            : getBundle(locale).getString("report.plugin.systemrequirements.nominimum")));
```

### ConstantValue
Condition `jdk != null` is always `true`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            sink.tableRow();
            tableCell(getBundle(locale).getString("report.plugin.systemrequirements.jdk"));
            tableCell((jdk != null ? jdk : getBundle(locale).getString("report.plugin.systemrequirements.nominimum")));
            sink.tableRow_();

```

### ConstantValue
Value `v4Api` is always 'true'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
            boolean v4Api = extendedMojoDescriptor.isV4Api();
            if (v4Api) {
                GeneratorUtils.element(w, "v4Api", String.valueOf(v4Api));
            }
        }
```

### ConstantValue
Condition `requirements != null` is always `true`
in `maven-script/maven-plugin-tools-ant/src/main/java/org/apache/maven/tools/plugin/extractor/ant/AntMojoDescriptorExtractor.java`
#### Snippet
```java
                        Map<String, ComponentRequirement> reqMap = new HashMap<>();

                        if (requirements != null) {
                            for (ComponentRequirement req : requirements) {
                                reqMap.put(req.getRole(), req);
```

### ConstantValue
Value `pendingNewline` is always 'false'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                        && numbering.isEmpty()) {
                    pendingNewline = false;
                    newline(pendingNewline);
                } else {
                    newline(true);
```

### ConstantValue
Value `addedUl` is always 'true'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            addedUl = true;
        }
        return addedUl;
    }

```

### ConstantValue
Value `addedUl` is always 'false'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
        String value;
        if (mojoDescriptor.isProjectRequired()) {
            addedUl = addUl(w, addedUl);
            w.startElement("li");
            w.writeMarkup(getString("pluginxdoc.mojodescriptor.projectRequired"));
```

### ConstantValue
Value `addedUl` is always 'false'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java

            boolean addedUl = false;
            addedUl = addUl(w, addedUl, parameter.getType());
            String typeValue = getLinkedType(parameter, false);
            writeDetail(getString("pluginxdoc.mojodescriptor.parameter.type"), typeValue, w);
```

### ConstantValue
Condition `indexOfOpeningParenthesis >= 0 && indexOfOpeningParenthesis == -1` is always `false` when reached
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
            signatureArguments = member.substring(indexOfOpeningParenthesis + 1, indexOfClosingParenthesis);
        } else if (indexOfOpeningParenthesis == -1 && indexOfClosingParenthesis >= 0
                || indexOfOpeningParenthesis >= 0 && indexOfOpeningParenthesis == -1) {
            throw new IllegalArgumentException("Found opening without closing parentheses or vice versa in " + member);
        } else {
```

### ConstantValue
Condition `indexOfOpeningParenthesis == -1` is always `false` when reached
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
            signatureArguments = member.substring(indexOfOpeningParenthesis + 1, indexOfClosingParenthesis);
        } else if (indexOfOpeningParenthesis == -1 && indexOfClosingParenthesis >= 0
                || indexOfOpeningParenthesis >= 0 && indexOfOpeningParenthesis == -1) {
            throw new IllegalArgumentException("Found opening without closing parentheses or vice versa in " + member);
        } else {
```

### ConstantValue
Condition `httpMethod != null` is always `true`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
                    super.close();

                    if (httpMethod != null) {
                        httpMethod.releaseConnection();
                    }
```

### ConstantValue
Condition `httpClient != null` is always `true`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
                        httpMethod.releaseConnection();
                    }
                    if (httpClient != null) {
                        httpClient.close();
                    }
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            sb.append("  ...").append('\n');
            sb.append("  <build>").append('\n');
            sb.append("    <!-- " + getBundle(locale).getString("report.plugin.usage.pluginManagement") + " -->")
                    .append('\n');
            sb.append("    <pluginManagement>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            sb.append("      </plugins>").append('\n');
            sb.append("    </pluginManagement>").append('\n');
            sb.append("    <!-- " + getBundle(locale).getString("report.plugin.usage.plugins") + " -->")
                    .append('\n');
            sb.append("    <plugins>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            if (hasMavenReport) {
                sb.append("  ...").append('\n');
                sb.append("  <!-- " + getBundle(locale).getString("report.plugin.usage.reporting") + " -->")
                        .append('\n');
                sb.append("  <reporting>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
            sb.append("  ...").append('\n');
            sb.append("  <build>").append('\n');
            sb.append("    <!-- " + getBundle(locale).getString("report.plugin.usage.pluginManagement") + " -->")
                    .append('\n');
            sb.append("    <pluginManagement>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
            sb.append("      </plugins>").append('\n');
            sb.append("    </pluginManagement>").append('\n');
            sb.append("    <!-- " + getBundle(locale).getString("report.plugin.usage.plugins") + " -->")
                    .append('\n');
            sb.append("    <plugins>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
            if (hasMavenReport) {
                sb.append("  ...").append('\n');
                sb.append("  <!-- " + getBundle(locale).getString("report.plugin.usage.reporting") + " -->")
                        .append('\n');
                sb.append("  <reporting>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
        StringBuilder link = new StringBuilder();
        if (moduleName.isPresent()) {
            link.append(moduleName.get() + "/");
        }
        if (packageName.isPresent()) {
```

