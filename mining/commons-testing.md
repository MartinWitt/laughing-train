# commons-testing 
 
# Bad smells
I found 5 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StringBufferReplaceableByString | 1 | false |
| DataFlowIssue | 1 | false |
| JavadocDeclaration | 1 | false |
| CommentedOutCode | 1 | false |
| FieldMayBeFinal | 1 | false |
## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `commons-testing-junit4/src/main/java/org/apache/commons/testing/junit4/net/AvailableServerPortSystemPropertyTestRule.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("AvailableServerPortSystemPropertyTestRule [name=");
        builder.append(name);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `commons-testing-generic/src/main/java/org/apache/commons/testing/net/AvailableServerPortFinder.java`
#### Snippet
```java
                ss = new ServerSocket(port);
            } catch (final Exception e) {
                ss = null;
                port += 200;
            }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param targetFilePath` tag description is missing
in `commons-testing-junit4/src/main/java/org/apache/commons/testing/junit4/io/CopyFileTestRule.java`
#### Snippet
```java
     * @param targetTemporaryFolder
     *            the destination folder.
     * @param targetFilePath
     * @return a new test rule.
     */
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (18 lines)
in `commons-testing-junit4/src/main/java/org/apache/commons/testing/junit4/AbstractAvailableLocalesTest.java`
#### Snippet
```java
public abstract class AbstractAvailableLocalesTest {

//    public static List<Object[]> combine(final Object[] objects, final List<Locale> locales) {
//        final List<Object[]> result = new ArrayList<>(objects.length * locales.size());
//        Arrays.stream(objects).forEachOrdered(object -> locales.stream().forEachOrdered(locale -> result.add(new Object[] { object, locale })));
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `currentMinPort` may be 'final'
in `commons-testing-generic/src/main/java/org/apache/commons/testing/net/AvailableServerPortFinder.java`
#### Snippet
```java
     * Incremented to the next lowest available port when getNextAvailable() is called.
     */
    private static AtomicInteger currentMinPort = new AtomicInteger(MIN_PORT_NUMBER);

    /**
```

