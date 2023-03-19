# commons-testing 
 
# Bad smells
I found 6 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StringBufferReplaceableByString | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DataFlowIssue | 1 | false |
| CommentedOutCode | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `RuleChainFactory` has only 'static' members, and lacks a 'private' constructor
in `commons-testing-junit4/src/main/java/org/apache/commons/testing/junit4/RuleChainFactory.java`
#### Snippet
```java
 * Builds JUnit {@link RuleChain}s.
 */
public class RuleChainFactory {

    /**
```

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

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `commons-testing-junit4-mongodb/src/main/java/org/apache/commons/testing/junit4/mongodb/MongoDbTestRule.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("MongoDbTestRule [portSystemPropertyName=");
        builder.append(portSystemPropertyName);
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

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractAvailableLocalesTest()` of an abstract class should not be declared 'public'
in `commons-testing-junit4/src/main/java/org/apache/commons/testing/junit4/AbstractAvailableLocalesTest.java`
#### Snippet
```java
    public final DefaultLocaleTestRule rule;

    public AbstractAvailableLocalesTest(final Locale locale)  {
        this.locale = locale;
        this.rule = new DefaultLocaleTestRule(locale);
```

