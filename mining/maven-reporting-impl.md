# maven-reporting-impl 
 
# Bad smells
I found 11 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AbstractClassNeverImplemented | 2 | false |
| ReturnNull | 1 | false |
| MismatchedJavadocCode | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| AssignmentToForLoopParameter | 1 | false |
| CodeBlock2Expr | 1 | true |
| NonProtectedConstructorInAbstractClass | 1 | true |
| ConstantValue | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/reporting/AbstractMavenReportRenderer.java`
#### Snippet
```java
    private static List<String> applyPattern(String text) {
        if (StringUtils.isEmpty(text)) {
            return null;
        }

```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return map but the return type is list
in `src/main/java/org/apache/maven/reporting/AbstractMavenReportRenderer.java`
#### Snippet
```java
     *
     * @param text a text with or without the pattern <code>{text, url}</code>
     * @return a map of text/href
     */
    private static List<String> applyPattern(String text) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.reporting` is unnecessary and can be removed
in `src/main/java/org/apache/maven/reporting/AbstractMavenReport.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.reporting.MavenReport#isExternalReport()
     * @return {@code false} by default.
     */
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/maven/reporting/AbstractMavenReportRenderer.java`
#### Snippet
```java
                // handle: ''
                if (i + 1 < text.length() && text.charAt(i + 1) == '\'') {
                    i++;
                    segments.add(text.substring(lastOffset, i));
                    segments.add(null);
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractMavenReportRenderer` has no concrete subclass
in `src/main/java/org/apache/maven/reporting/AbstractMavenReportRenderer.java`
#### Snippet
```java
 * @see #renderBody()
 */
public abstract class AbstractMavenReportRenderer implements MavenReportRenderer {
    /** The current sink to use */
    protected Sink sink;
```

### AbstractClassNeverImplemented
Abstract class `AbstractMavenReport` has no concrete subclass
in `src/main/java/org/apache/maven/reporting/AbstractMavenReport.java`
#### Snippet
```java
 * @see #executeReport(Locale) <code>abstract executeReport( Locale )</code>
 */
public abstract class AbstractMavenReport extends AbstractMojo implements MavenMultiPageReport {
    /**
     * The output directory for the report. Note that this parameter is only evaluated if the goal is run directly from
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/org/apache/maven/reporting/AbstractMavenReport.java`
#### Snippet
```java
        // Add publish date
        String outputTimestamp = getProject().getProperties().getProperty("project.build.outputTimestamp");
        MavenArchiver.parseBuildOutputTimestamp(outputTimestamp).ifPresent(v -> {
            context.setPublishDate(Date.from(v));
        });
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractMavenReportRenderer()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/maven/reporting/AbstractMavenReportRenderer.java`
#### Snippet
```java
     * @param sink the sink to use.
     */
    public AbstractMavenReportRenderer(Sink sink) {
        this.sink = sink;
    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `text` is always 'null'
in `src/main/java/org/apache/maven/reporting/AbstractMavenReportRenderer.java`
#### Snippet
```java
    protected static String createLinkPatternedText(String text, String href) {
        if (text == null) {
            return text;
        }

```

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`text.indexOf("${") != -1` can be replaced with 'text.contains("${")'
in `src/main/java/org/apache/maven/reporting/AbstractMavenReportRenderer.java`
#### Snippet
```java

        // TODO Special case http://jira.codehaus.org/browse/MEV-40
        if (text.indexOf("${") != -1) {
            int lastComma = text.lastIndexOf(",");
            int lastSemi = text.lastIndexOf("}");
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/reporting/AbstractMavenReport.java`
#### Snippet
```java
            if (!isExternalReport()) // MSHARED-204: only render Doxia sink if not an external report
            {
                outputDirectory.mkdirs();

                try (Writer writer = new OutputStreamWriter(
```

