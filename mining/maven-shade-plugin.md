# maven-shade-plugin 
 
# Bad smells
I found 136 bad smells with 22 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 66 | false |
| UnnecessaryLocalVariable | 18 | true |
| FieldMayBeFinal | 13 | false |
| DuplicatedCode | 7 | false |
| RedundantTypeArguments | 6 | false |
| CdiInjectionPointsInspection | 4 | false |
| NonStrictComparisonCanBeEquality | 3 | true |
| JavadocDeclaration | 3 | false |
| IOStreamConstructor | 3 | false |
| UNCHECKED_WARNING | 2 | false |
| DataFlowIssue | 2 | false |
| DeprecatedIsStillUsed | 1 | false |
| RegExpSimplifiable | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| Deprecation | 1 | false |
| PointlessNullCheck | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| DanglingJavadoc | 1 | false |
| UnusedAssignment | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/plugins/shade/resource/PluginXmlResourceTransformer.java`
#### Snippet
```java
        String attr = dom.getAttribute(attribute);

        if (attr == null || value == null || value.length() <= 0) {
            return;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/plugins/shade/resource/PluginXmlResourceTransformer.java`
#### Snippet
```java
        Xpp3Dom child = dom.getChild(element);

        if (child == null || value == null || value.length() <= 0) {
            return;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/plugins/shade/resource/ComponentsXmlResourceTransformer.java`
#### Snippet
```java
        Xpp3Dom child = dom.getChild(element);

        if (child == null || value == null || value.length() <= 0) {
            return;
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
                    if (depClazzpathUnit != null) {
                        Set<Clazz> clazzes = depClazzpathUnit.getClazzes();
                        for (final Clazz clazz : new HashSet<>(removable)) {
                            if (clazzes.contains(clazz) //
                                    && simpleFilter.isSpecificallyIncluded(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected Element findAndReplaceProperties(Counter counter, Element parent, String name, Map props) {
        Map<String, String> properties = props;
        boolean shouldExist = properties != null && !properties.isEmpty();
        Element element = updateElement(counter, parent, name, shouldExist);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/shade/Shader.java`
#### Snippet
```java
     * @param shadeRequest            holds the many parameters to this method
     * @throws IOException            for IO errors reading the thing
     * @throws MojoExecutionException for anything else that goes wrong.
     */
    void shade(ShadeRequest shadeRequest) throws IOException, MojoExecutionException;
```

### JavadocReference
Cannot resolve symbol `MavenProject`
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java

    /**
     * @param project {@link MavenProject}
     * @param log {@link Log}
     * @throws IOException in case of error.
```

### JavadocReference
Cannot resolve symbol `Log`
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
    /**
     * @param project {@link MavenProject}
     * @param log {@link Log}
     * @throws IOException in case of error.
     */
```

### JavadocReference
Cannot resolve symbol `MavenProject`
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java

    /**
     * @param project {@link MavenProject}
     * @param log {@link Log}
     * @param simpleFilters {@link SimpleFilter}
```

### JavadocReference
Cannot resolve symbol `Log`
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
    /**
     * @param project {@link MavenProject}
     * @param log {@link Log}
     * @param simpleFilters {@link SimpleFilter}
     * @param entryPoints
```

### JavadocReference
Cannot resolve symbol `MavenProject`
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java

    /**
     * @param project {@link MavenProject}
     * @param log {@link Log}
     * @param entryPoints
```

### JavadocReference
Cannot resolve symbol `Log`
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
    /**
     * @param project {@link MavenProject}
     * @param log {@link Log}
     * @param entryPoints
     * @throws IOException in case of error.
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java

    /**
     * @throws MojoExecutionException in case of an error.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Model`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * Method write
     *
     * @param project {@link Model}
     * @param writer {@link OutputStreamWriter}
     * @param document {@link Document}
```

### JavadocReference
Cannot resolve symbol `Document`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @param project {@link Model}
     * @param writer {@link OutputStreamWriter}
     * @param document {@link Document}
     * @throws IOException in case of an error.
     */
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @param props {@link Map}
     * @param name The name.
     * @param parent {@link Element}
     * @return {@link Element}
     */
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @param name The name.
     * @param parent {@link Element}
     * @return {@link Element}
     */
    protected Element findAndReplaceProperties(Counter counter, Element parent, String name, Map props) {
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @param list The list of elements.
     * @param parent The parent.
     * @return {@link Element}
     */
    protected Element findAndReplaceSimpleLists(
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @param name The name.
     * @param parent The parent.
     * @return {@link Element}
     */
    protected Element updateElement(Counter counter, Element parent, String name, boolean shouldExist) {
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @param parent The parent.
     * @param counter {@link Counter}
     * @param child {@link Element}
     */
    protected void insertAtPreferredLocation(Element parent, Element child, Counter counter) {
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @param name The name.
     * @param parent The parent.
     * @return {@link Element}
     */
    protected Element findAndReplaceSimpleElement(
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Model`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * Method write
     *
     * @param project {@link Model}
     * @param stream {@link OutputStream}
     * @param document {@link Document}
```

### JavadocReference
Cannot resolve symbol `Document`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @param project {@link Model}
     * @param stream {@link OutputStream}
     * @param document {@link Document}
     * @deprecated
     * @throws IOException in case of an error.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @param parent The parent.
     * @param counter {@link Counter}
     * @param parentDom {@link Element}
     */
    protected void replaceXpp3DOM(Element parent, Xpp3Dom parentDom, Counter counter) {
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Xpp3Dom`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param counter {@link Counter}
     * @param dom {@link Xpp3Dom}
     * @param name The name.
     * @param parent The parent.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @param name The name.
     * @param parent The parent.
     * @return {@link Element}
     */
    protected Element findAndReplaceXpp3DOM(Counter counter, Element parent, String name, Xpp3Dom dom) {
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Model`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * Method write
     *
     * @param project {@link Model}
     * @param jdomFormat {@link Format}
     * @param writer {@link Writer}
```

### JavadocReference
Cannot resolve symbol `Format`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param project {@link Model}
     * @param jdomFormat {@link Format}
     * @param writer {@link Writer}
     * @param document {@link Document}
```

### JavadocReference
Cannot resolve symbol `Document`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @param jdomFormat {@link Format}
     * @param writer {@link Writer}
     * @param document {@link Document}
     * @throws IOException in case of an error.
     */
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

### JavadocReference
Cannot resolve symbol `Element`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     *
     * @param value The value.
     * @param element {@link Element}
     * @param counter {@link Counter}
     * @param xmlTag The XMLTag.
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `next instanceof Element` is redundant and can be replaced with a null check
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
            Object next = it.next();
            offset = offset + 1;
            if (next instanceof Element) {
                elementCounter = elementCounter + 1;
                contentIndex = contentIndex + offset;
```

### DataFlowIssue
Condition `next instanceof Text` is redundant and can be replaced with a null check
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
                offset = 0;
            }
            if (next instanceof Text && it.hasNext()) {
                lastText = (Text) next;
            }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/maven/plugins/shade/mojo/RelativizePath.java`
#### Snippet
```java
     * @param relativeTo base to relativize it do. (e.g., a pom into which a relative pathname to the 'thing' is to be
     *        installed).
     * @return
     */
    static String convertToRelativePath(File thing, File relativeTo) {
```

### JavadocDeclaration
`@param entryPoints` tag description is missing
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
     * @param log {@link Log}
     * @param simpleFilters {@link SimpleFilter}
     * @param entryPoints
     * @throws IOException in case of errors.
     * @since 1.6
```

### JavadocDeclaration
`@param entryPoints` tag description is missing
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
     * @param project {@link MavenProject}
     * @param log {@link Log}
     * @param entryPoints
     * @throws IOException in case of error.
     */
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'SimpleFilter' is still used
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java
     */
    @Deprecated
    public SimpleFilter(Set<File> jars, Set<String> includes, Set<String> excludes) {
        this(jars, includes, excludes, true);
    }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `excludeDefaults` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/mojo/ArchiveFilter.java`
#### Snippet
```java
    private Set<String> excludes;

    private boolean excludeDefaults = true;

    public String getArtifact() {
```

### FieldMayBeFinal
Field `level` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/pom/Counter.java`
#### Snippet
```java
     * Field level
     */
    private int level;

    // ----------------/
```

### FieldMayBeFinal
Field `extensionClassesList` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
    static final String EXT_MODULE_NAME = "META-INF/groovy/org.codehaus.groovy.runtime.ExtensionModule";

    private List<String> extensionClassesList = new ArrayList<>();

    private List<String> staticExtensionClassesList = new ArrayList<>();
```

### FieldMayBeFinal
Field `staticExtensionClassesList` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
    private List<String> extensionClassesList = new ArrayList<>();

    private List<String> staticExtensionClassesList = new ArrayList<>();

    private String extModuleName = "no-module-name";
```

### FieldMayBeFinal
Field `mojos` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/resource/PluginXmlResourceTransformer.java`
#### Snippet
```java
 */
public class PluginXmlResourceTransformer extends AbstractCompatibilityTransformer {
    private List<Xpp3Dom> mojos = new ArrayList<>();

    private long time = Long.MIN_VALUE;
```

### FieldMayBeFinal
Field `components` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/resource/ComponentsXmlResourceTransformer.java`
#### Snippet
```java
 */
public class ComponentsXmlResourceTransformer extends AbstractCompatibilityTransformer {
    private Map<String, Xpp3Dom> components = new LinkedHashMap<>();

    private long time = Long.MIN_VALUE;
```

### FieldMayBeFinal
Field `includes` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/mojo/ArtifactSelector.java`
#### Snippet
```java
class ArtifactSelector {

    private Collection<ArtifactId> includes;

    private Collection<ArtifactId> excludes;
```

### FieldMayBeFinal
Field `excludes` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/mojo/ArtifactSelector.java`
#### Snippet
```java
    private Collection<ArtifactId> includes;

    private Collection<ArtifactId> excludes;

    ArtifactSelector(Artifact projectArtifact, ArtifactSet artifactSet, String groupPrefix) {
```

### FieldMayBeFinal
Field `dataMap` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/resource/ResourceBundleAppendingTransformer.java`
#### Snippet
```java
 */
public class ResourceBundleAppendingTransformer extends AbstractCompatibilityTransformer {
    private Map<String, ByteArrayOutputStream> dataMap = new HashMap<>();

    private Pattern resourceBundlePattern;
```

### FieldMayBeFinal
Field `log` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
public class MinijarFilter implements Filter {

    private Log log;

    private Set<Clazz> removable;
```

### FieldMayBeFinal
Field `jars` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java
public class SimpleFilter implements Filter {

    private Set<File> jars;

    private Set<String> includes;
```

### FieldMayBeFinal
Field `includes` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java
    private Set<File> jars;

    private Set<String> includes;

    private Set<String> excludes;
```

### FieldMayBeFinal
Field `excludes` may be 'final'
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java
    private Set<String> includes;

    private Set<String> excludes;

    private boolean excludeDefaults = true;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
                Element el;
                if (elIt != null && elIt.hasNext()) {
                    el = elIt.next();
                    if (!elIt.hasNext()) {
                        elIt = null;
                    }
                } else {
                    el = factory.element(childName, element.getNamespace());
                    insertAtPreferredLocation(element, el, innerCount);
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
            findAndReplaceSimpleElement(innerCount, root, "defaultGoal", value.getDefaultGoal(), null);
            iterateResource(innerCount, root, value.getResources(), "resources", "resource");
            iterateResource(innerCount, root, value.getTestResources(), "testResources", "testResource");
            findAndReplaceSimpleElement(innerCount, root, "directory", value.getDirectory(), null);
            findAndReplaceSimpleElement(innerCount, root, "finalName", value.getFinalName(), null);
            findAndReplaceSimpleLists(innerCount, root, value.getFilters(), "filters", "filter");
            updatePluginManagement(value.getPluginManagement(), "pluginManagement", innerCount, root);
            iteratePlugin(innerCount, root, value.getPlugins(), "plugins", "plugin");
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
        findAndReplaceSimpleElement(innerCount, root, "email", value.getEmail(), null);
        findAndReplaceSimpleElement(innerCount, root, "url", value.getUrl(), null);
        findAndReplaceSimpleElement(innerCount, root, "organization", value.getOrganization(), null);
        findAndReplaceSimpleElement(innerCount, root, "organizationUrl", value.getOrganizationUrl(), null);
        findAndReplaceSimpleLists(innerCount, root, value.getRoles(), "roles", "role");
        findAndReplaceSimpleElement(innerCount, root, "timezone", value.getTimezone(), null);
        findAndReplaceProperties(innerCount, root, "properties", value.getProperties());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "groupId", value.getGroupId(), null);
        findAndReplaceSimpleElement(innerCount, root, "artifactId", value.getArtifactId(), null);
        findAndReplaceSimpleElement(innerCount, root, "version", value.getVersion(), null);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
        findAndReplaceSimpleLists(innerCount, root, value.getModules(), "modules", "module");
        iterateRepository(innerCount, root, value.getRepositories(), "repositories", "repository");
        iterateRepository(innerCount, root, value.getPluginRepositories(), "pluginRepositories", "pluginRepository");
        iterateDependency(innerCount, root, value.getDependencies(), "dependencies", "dependency");
        updateReporting(value.getReporting(), "reporting", innerCount, root);
        updateDependencyManagement(value.getDependencyManagement(), "dependencyManagement", innerCount, root);
        updateDistributionManagement(value.getDistributionManagement(), "distributionManagement", innerCount, root);
        findAndReplaceProperties(innerCount, root, "properties", value.getProperties());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "groupId", value.getGroupId(), "org.apache.maven.plugins");
        findAndReplaceSimpleElement(innerCount, root, "artifactId", value.getArtifactId(), null);
        findAndReplaceSimpleElement(innerCount, root, "version", value.getVersion(), null);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/shade/resource/ServicesResourceTransformer.java`
#### Snippet
```java
        Scanner scanner = new Scanner(is, StandardCharsets.UTF_8.name());
        while (scanner.hasNextLine()) {
            String relContent = scanner.nextLine();
            for (Relocator relocator : relocators) {
                if (relocator.canRelocateClass(relContent)) {
                    relContent = relocator.applyToSourceContent(relContent);
                }
            }
            out.add(relContent);
        }

        if (time > this.time) {
            this.time = time;
        }
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[/]` can be simplified to '/'
in `src/main/java/org/apache/maven/plugins/shade/relocation/SimpleRelocator.java`
#### Snippet
```java
                if (exclude.startsWith(pathPattern)) {
                    sourcePathExcludes.add(
                            exclude.substring(pathPattern.length()).replaceFirst("[/][*]$", ""));
                }
            }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/plugins/shade/resource/IncludeResourceTransformer.java`
#### Snippet
```java
        jarEntry.setTime(time);

        try (InputStream in = new FileInputStream(file)) {
            jos.putNextEntry(jarEntry);
            IOUtil.copy(in, jos);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java

            try (BufferedReader configFileReader =
                    new BufferedReader(new InputStreamReader(new FileInputStream(serviceProviderConfigFile), UTF_8))) {
                // check whether the found classes use services in turn
                repeatScan |= scanServiceProviderConfigFile(cp, configFileReader);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
                            @Override
                            public InputStream call() throws Exception {
                                return new FileInputStream(file);
                            }
                        },
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
        }

        filters.addAll(simpleFilters);

        if (minimizeJar) {
```

## RuleId[id=Deprecation]
### Deprecation
'processResource(java.lang.String, java.io.InputStream, java.util.List)' is deprecated
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
                    ((ReproducibleResourceTransformer) transformer).processResource(name, is, relocators, time);
                } else {
                    transformer.processResource(name, is, relocators);
                }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `ioe` is redundant
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
            log.warn(dependency.getFile()
                    + " could not be unpacked/read for minimization; dependency is probably malformed.");
            IOException ioe = new IOException(
                    "Dependency " + dependency.toString() + " in file " + dependency.getFile()
                            + " could not be unpacked. File is probably corrupt",
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateLicense(License value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "name", value.getName(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateContributor(Contributor value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "name", value.getName(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updatePlugin(Plugin value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "groupId", value.getGroupId(), "org.apache.maven.plugins");
```

### UnnecessaryLocalVariable
Local variable `properties` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected Element findAndReplaceProperties(Counter counter, Element parent, String name, Map props) {
        Map<String, String> properties = props;
        boolean shouldExist = properties != null && !properties.isEmpty();
        Element element = updateElement(counter, parent, name, shouldExist);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateExtension(Extension value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "groupId", value.getGroupId(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateDeveloper(Developer value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "id", value.getId(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateModel(Model value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        updateParent(value.getParent(), "parent", innerCount, root);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateResource(Resource value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "targetPath", value.getTargetPath(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateRepository(Repository value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        updateRepositoryPolicy(value.getReleases(), "releases", innerCount, root);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateExclusion(Exclusion value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "artifactId", value.getArtifactId(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateReportSet(ReportSet value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "id", value.getId(), "default");
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateDependency(Dependency value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "groupId", value.getGroupId(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateMailingList(MailingList value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "name", value.getName(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updatePluginExecution(PluginExecution value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "id", value.getId(), "default");
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    // CHECKSTYLE_OFF: LineLength
    protected void updateNotifier(Notifier value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "type", value.getType(), "mail");
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateReportPlugin(ReportPlugin value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "groupId", value.getGroupId(), "org.apache.maven.plugins");
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateProfile(Profile value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "id", value.getId(), "default");
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java

    @Inject
    private RepositorySystem repositorySystem;

    /**
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
     */
    @Inject
    private ProjectBuilder projectBuilder;

    /**
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java

    @Inject
    private MavenProjectHelper projectHelper;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
     */
    @Inject
    private DependencyGraphBuilder dependencyGraphBuilder;

    /**
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected Element findAndReplaceSimpleElement(
            Counter counter, Element parent, String name, String text, String defaultValue) {
        if (defaultValue != null && text != null && defaultValue.equals(text)) {
            Element element = parent.getChild(name, parent.getNamespace());
            // if exist and is default value or if doesn't exist.. just keep the way it is..
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            // trap ArrayIndexOutOfBoundsExceptions caused by malformed dependency classes (MSHADE-107)
            log.warn(dependency.toString()
                    + " could not be analyzed for minimization; dependency is probably malformed.");
        }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java
import org.codehaus.plexus.util.SelectorUtils;

/**
 * @author David Blevins
 */
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
     */
    public MinijarFilter(MavenProject project, Log log) throws IOException {
        this(project, log, Collections.<SimpleFilter>emptyList(), Collections.<String>emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
     */
    public MinijarFilter(MavenProject project, Log log) throws IOException {
        this(project, log, Collections.<SimpleFilter>emptyList(), Collections.<String>emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
            }
            removeSpecificallyIncludedClasses(
                    project, simpleFilters == null ? Collections.<SimpleFilter>emptyList() : simpleFilters);
            removeServices(project, cp);
        }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
     */
    public MinijarFilter(MavenProject project, Log log, Set<String> entryPoints) throws IOException {
        this(project, log, Collections.<SimpleFilter>emptyList(), entryPoints);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java
            final Set<String> excludes,
            final boolean excludeDefaults) {
        this.jars = (jars != null) ? Collections.<File>unmodifiableSet(jars) : Collections.<File>emptySet();
        this.includes = normalizePatterns(includes);
        this.excludes = normalizePatterns(excludes);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java
            final Set<String> excludes,
            final boolean excludeDefaults) {
        this.jars = (jars != null) ? Collections.<File>unmodifiableSet(jars) : Collections.<File>emptySet();
        this.includes = normalizePatterns(includes);
        this.excludes = normalizePatterns(excludes);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `excludeDefaults` initializer `true` is redundant
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java
    private Set<String> excludes;

    private boolean excludeDefaults = true;

    /**
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/maven/plugins/shade/mojo/ArchiveFilter.java`
#### Snippet
```java
    private Set<String> excludes;

    private boolean excludeDefaults = true;

    public String getArtifact() {
```

