# assertj-automation 
 
# Bad smells
I found 93 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 43 | false |
| BoundedWildcard | 19 | false |
| SimplifyOptionalCallChains | 10 | false |
| SizeReplaceableByIsEmpty | 8 | true |
| DataFlowIssue | 3 | false |
| UnnecessaryToStringCall | 2 | true |
| OptionalContainsCollection | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| UnstableApiUsage | 2 | false |
| ReturnNull | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresent.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Optional<T> thing) {
        assertThat(thing).isPresent();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresent.java`
#### Snippet
```java

    @BeforeTemplate
    void before4(Optional<T> thing) {
        assertThat(!thing.isEmpty()).isTrue();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresent.java`
#### Snippet
```java

    @BeforeTemplate
    void before2(Optional<T> thing) {
        assertThat(!thing.isPresent()).isFalse();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresent.java`
#### Snippet
```java

    @BeforeTemplate
    void before1(Optional<T> thing) {
        assertThat(thing.isPresent()).isTrue();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresent.java`
#### Snippet
```java

    @BeforeTemplate
    void before3(Optional<T> thing) {
        assertThat(thing.isEmpty()).isFalse();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmpty.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Optional<T> thing) {
        assertThat(thing).isEmpty();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmpty.java`
#### Snippet
```java

    @BeforeTemplate
    void before1(Optional<T> thing) {
        assertThat(thing.isPresent()).isFalse();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmpty.java`
#### Snippet
```java

    @BeforeTemplate
    void before5(Optional<T> thing) {
        assertThat(thing).isEqualTo(Optional.empty());
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmpty.java`
#### Snippet
```java

    @BeforeTemplate
    void before4(Optional<T> thing) {
        assertThat(!thing.isEmpty()).isFalse();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmpty.java`
#### Snippet
```java

    @BeforeTemplate
    void before3(Optional<T> thing) {
        assertThat(thing.isEmpty()).isTrue();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmpty.java`
#### Snippet
```java

    @BeforeTemplate
    void before6(Optional<T> thing) {
        assertThat(Optional.empty()).isEqualTo(thing);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmpty.java`
#### Snippet
```java

    @BeforeTemplate
    void before2(Optional<T> thing) {
        assertThat(!thing.isPresent()).isTrue();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'failMessage'
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjAssertThatThrownBy.java`
#### Snippet
```java
            List<? extends StatementTree> throwingStatements,
            VariableTree catchParameter,
            Optional<String> failMessage,
            VisitorState state) {
        int startPos = ((JCTree) throwingStatements.iterator().next()).getStartPosition();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsRedundantWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void redundantAssertion1(
            Optional<T> optional,
            T innerValue,
            String description1,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsRedundantWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void redundantAssertion2(
            Optional<T> optional,
            T innerValue,
            String description1,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsRedundantWithDescription.java`
#### Snippet
```java
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(
            Optional<T> optional,
            T innerValue,
            // The first assertion is unnecessary
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'result'
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjRefactoring.java`
#### Snippet
```java
    }

    private void describe(Optional<AssertjCheckerResult> result, Tree tree, VisitorState state) {
        if (result.isPresent()) {
            AssertjCheckerResult value = result.get();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresentWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before3(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(thing.isEmpty()).describedAs(description, descriptionArgs).isFalse();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresentWithDescription.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(thing).describedAs(description, descriptionArgs).isPresent();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresentWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before1(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(thing.isPresent()).describedAs(description, descriptionArgs).isTrue();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresentWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before4(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(!thing.isEmpty()).describedAs(description, descriptionArgs).isTrue();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresentWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before2(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(!thing.isPresent()).describedAs(description, descriptionArgs).isFalse();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContains.java`
#### Snippet
```java

    @BeforeTemplate
    void redundantAssertion2(Optional<T> optional, T innerValue) {
        assertThat(optional).isPresent();
        assertThat(optional).contains(innerValue);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContains.java`
#### Snippet
```java

    @BeforeTemplate
    void before2(Optional<T> optional, T innerValue) {
        assertThat(optional).isEqualTo(Optional.of(innerValue));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContains.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Optional<T> optional, T innerValue) {
        assertThat(optional).contains(innerValue);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContains.java`
#### Snippet
```java

    @BeforeTemplate
    void before3(Optional<T> optional, T innerValue) {
        assertThat(optional.isPresent() && optional.get().equals(innerValue)).isTrue();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContains.java`
#### Snippet
```java

    @BeforeTemplate
    void redundantAssertion1(Optional<T> optional, T innerValue) {
        assertThat(optional).isPresent();
        assertThat(optional).hasValue(innerValue);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContains.java`
#### Snippet
```java

    @BeforeTemplate
    void before(Optional<T> optional, T innerValue) {
        assertThat(optional.get()).isEqualTo(innerValue);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmptyWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before2(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(!thing.isPresent()).describedAs(description, descriptionArgs).isTrue();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmptyWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before1(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(thing.isPresent()).describedAs(description, descriptionArgs).isFalse();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmptyWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before4(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(!thing.isEmpty()).describedAs(description, descriptionArgs).isFalse();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmptyWithDescription.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(thing).describedAs(description, descriptionArgs).isEmpty();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmptyWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before5(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(thing).describedAs(description, descriptionArgs).isEqualTo(Optional.empty());
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmptyWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before3(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(thing.isEmpty()).describedAs(description, descriptionArgs).isTrue();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'thing'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmptyWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before6(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(Optional.empty()).describedAs(description, descriptionArgs).isEqualTo(thing);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fix'
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjCheckerResult.java`
#### Snippet
```java

    private final String description;
    private final Optional<? extends Fix> fix;

    private AssertjCheckerResult(String description, Optional<? extends Fix> fix) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'fix'
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjCheckerResult.java`
#### Snippet
```java
    private final Optional<? extends Fix> fix;

    private AssertjCheckerResult(String description, Optional<? extends Fix> fix) {
        this.description = description;
        this.fix = fix;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjCheckerResult.java`
#### Snippet
```java
        }

        Builder fix(Optional<? extends Fix> value) {
            this.fix = Preconditions.checkNotNull(value, "Fix is required");
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fix'
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjCheckerResult.java`
#### Snippet
```java

        private String description;
        private Optional<? extends Fix> fix = Optional.empty();

        private Builder() {}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before3(Optional<T> optional, T innerValue, String description, @Repeated Object descriptionArgs) {
        assertThat(optional.isPresent() && optional.get().equals(innerValue))
                .describedAs(description, descriptionArgs)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before2(Optional<T> optional, T innerValue, String description, @Repeated Object descriptionArgs) {
        assertThat(optional).describedAs(description, descriptionArgs).isEqualTo(Optional.of(innerValue));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsWithDescription.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Optional<T> optional, T innerValue, String description, @Repeated Object descriptionArgs) {
        assertThat(optional).describedAs(description, descriptionArgs).contains(innerValue);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsWithDescription.java`
#### Snippet
```java

    @BeforeTemplate
    void before1(Optional<T> optional, T innerValue, String description, @Repeated Object descriptionArgs) {
        assertThat(optional.get()).describedAs(description, descriptionArgs).isEqualTo(innerValue);
    }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjCollectionAssert.java`
#### Snippet
```java
            return IterableType.SET;
        } else {
            return null;
        }
    }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`things.size() == 0` can be replaced with 'things.isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjCollectionIsEmpty.java`
#### Snippet
```java
    @BeforeTemplate
    void bad1(Collection<T> things) {
        assertThat(things.size() == 0).isTrue();
    }

```

### SizeReplaceableByIsEmpty
`things.size() == 0` can be replaced with 'things.isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjCollectionIsNotEmptyWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void bad2(Collection<T> things, String description, @Repeated Object descriptionArgs) {
        assertThat(things.size() == 0).describedAs(description, descriptionArgs).isFalse();
    }

```

### SizeReplaceableByIsEmpty
`things.size() != 0` can be replaced with '!things.isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjCollectionIsNotEmptyWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void bad1(Collection<T> things, String description, @Repeated Object descriptionArgs) {
        assertThat(things.size() != 0).describedAs(description, descriptionArgs).isTrue();
    }

```

### SizeReplaceableByIsEmpty
`things.size() == 0` can be replaced with 'things.isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjCollectionIsEmptyWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void bad1(Collection<T> things, String description, @Repeated Object descriptionArgs) {
        assertThat(things.size() == 0).describedAs(description, descriptionArgs).isTrue();
    }

```

### SizeReplaceableByIsEmpty
`things.size() == 0` can be replaced with 'things.isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjMapIsEmpty.java`
#### Snippet
```java
    @BeforeTemplate
    void before1(Map<K, V> things) {
        assertThat(things.size() == 0).isTrue();
    }

```

### SizeReplaceableByIsEmpty
`things.size() == 0` can be replaced with 'things.isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjMapIsEmptyWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void before1(Map<K, V> things, String description, @Repeated Object descriptionArgs) {
        assertThat(things.size() == 0).describedAs(description, descriptionArgs).isTrue();
    }

```

### SizeReplaceableByIsEmpty
`things.size() == 0` can be replaced with 'things.isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjCollectionIsNotEmpty.java`
#### Snippet
```java
    @BeforeTemplate
    void bad2(Collection<T> things) {
        assertThat(things.size() == 0).isFalse();
    }

```

### SizeReplaceableByIsEmpty
`things.size() != 0` can be replaced with '!things.isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjCollectionIsNotEmpty.java`
#### Snippet
```java
    @BeforeTemplate
    void bad1(Collection<T> things) {
        assertThat(things.size() != 0).isTrue();
    }

```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isPresent()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresent.java`
#### Snippet
```java
    @BeforeTemplate
    void before4(Optional<T> thing) {
        assertThat(!thing.isEmpty()).isTrue();
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresent.java`
#### Snippet
```java
    @BeforeTemplate
    void before2(Optional<T> thing) {
        assertThat(!thing.isPresent()).isFalse();
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjPrimitiveComparison.java`
#### Snippet
```java
        BinaryTree binaryTree = (BinaryTree) target;
        Optional<Type> maybeTarget = getPromotionType(binaryTree.getLeftOperand(), binaryTree.getRightOperand(), state);
        if (!maybeTarget.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjPrimitiveComparison.java`
#### Snippet
```java
                ? negate(binaryTree.getKind()).flatMap(AssertjPrimitiveComparison::getAssertionName)
                : getAssertionName(binaryTree.getKind());
        if (!comparison.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isPresent()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmpty.java`
#### Snippet
```java
    @BeforeTemplate
    void before4(Optional<T> thing) {
        assertThat(!thing.isEmpty()).isFalse();
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmpty.java`
#### Snippet
```java
    @BeforeTemplate
    void before2(Optional<T> thing) {
        assertThat(!thing.isPresent()).isTrue();
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isPresent()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresentWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void before4(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(!thing.isEmpty()).describedAs(description, descriptionArgs).isTrue();
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsPresentWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void before2(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(!thing.isPresent()).describedAs(description, descriptionArgs).isFalse();
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmptyWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void before2(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(!thing.isPresent()).describedAs(description, descriptionArgs).isTrue();
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isPresent()'
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalIsEmptyWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void before4(Optional<T> thing, String description, @Repeated Object descriptionArgs) {
        assertThat(!thing.isEmpty()).describedAs(description, descriptionArgs).isFalse();
    }

```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjRefactoring.java`
#### Snippet
```java
    @SuppressWarnings("unused") // Required by ServiceLoader
    public AssertjRefactoring() {
        this(discoveredChecks.toArray(new AssertjChecker[0]));
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `subSequence` may produce `NullPointerException`
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjAssertThatThrownBy.java`
#### Snippet
```java
                    return Optional.of(CharMatcher.is('\n')
                            .trimLeadingFrom(
                                    state.getSourceCode().subSequence(token.endPos(), firstStatementStartPosition)));
                }
                return Optional.empty();
```

### DataFlowIssue
Method invocation `subSequence` may produce `NullPointerException`
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjAssertThatThrownBy.java`
#### Snippet
```java
        int startPos = ((JCTree) throwingStatements.iterator().next()).getStartPosition();
        int endPos = state.getEndPosition(Iterables.getLast(throwingStatements));
        CharSequence throwingStatementsLines = state.getSourceCode().subSequence(startPos, endPos);

        boolean useExpressionLambda = throwingStatements.size() == 1
```

### DataFlowIssue
Method invocation `subSequence` may produce `NullPointerException`
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjCollectionAssert.java`
#### Snippet
```java
    private static String getArgumentsSource(MethodInvocationTree tree, VisitorState state) {
        return state.getSourceCode()
                .subSequence(
                        ASTHelpers.getStartPosition(tree.getArguments().get(0)),
                        state.getEndPosition(Iterables.getLast(tree.getArguments())))
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjAssertThatThrownBy.java`
#### Snippet
```java
            replacement.append(throwingStatementsLines
                    .subSequence(0, throwingStatementsLines.length() - 1)
                    .toString());
        } else {
            replacement.append("{");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjAssertThatThrownBy.java`
#### Snippet
```java
        } else {
            replacement.append("{");
            replacement.append(throwingStatementsLines.toString());
            replacement.append("}");
        }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super T`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsRedundantWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void redundantAssertion1(
            Optional<T> optional,
            T innerValue,
            String description1,
```

### BoundedWildcard
Can generalize to `? super T`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsRedundantWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void redundantAssertion2(
            Optional<T> optional,
            T innerValue,
            String description1,
```

### BoundedWildcard
Can generalize to `? super T`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsRedundantWithDescription.java`
#### Snippet
```java
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(
            Optional<T> optional,
            T innerValue,
            // The first assertion is unnecessary
```

### BoundedWildcard
Can generalize to `? super SingleAssertMatch`
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjSingleAssertMatcher.java`
#### Snippet
```java

    private AssertjSingleAssertMatcher(
            BiFunction<SingleAssertMatch, VisitorState, Optional<AssertjCheckerResult>> function) {
        this.function = function;
    }
```

### BoundedWildcard
Can generalize to `? super VisitorState`
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjSingleAssertMatcher.java`
#### Snippet
```java

    private AssertjSingleAssertMatcher(
            BiFunction<SingleAssertMatch, VisitorState, Optional<AssertjCheckerResult>> function) {
        this.function = function;
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjMapContainsEntryWithDescription.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Map<K, V> things, K key, V expectedValue, String description, @Repeated Object descriptionArgs) {
        assertThat(things).describedAs(description, descriptionArgs).containsEntry(key, expectedValue);
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjMapContainsEntryWithDescription.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Map<K, V> things, K key, V expectedValue, String description, @Repeated Object descriptionArgs) {
        assertThat(things).describedAs(description, descriptionArgs).containsEntry(key, expectedValue);
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjMapContainsEntry.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Map<K, V> things, K key, V expectedValue) {
        assertThat(things).containsEntry(key, expectedValue);
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjMapContainsEntry.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Map<K, V> things, K key, V expectedValue) {
        assertThat(things).containsEntry(key, expectedValue);
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContains.java`
#### Snippet
```java

    @BeforeTemplate
    void redundantAssertion2(Optional<T> optional, T innerValue) {
        assertThat(optional).isPresent();
        assertThat(optional).contains(innerValue);
```

### BoundedWildcard
Can generalize to `? super T`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContains.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Optional<T> optional, T innerValue) {
        assertThat(optional).contains(innerValue);
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContains.java`
#### Snippet
```java

    @BeforeTemplate
    void redundantAssertion1(Optional<T> optional, T innerValue) {
        assertThat(optional).isPresent();
        assertThat(optional).hasValue(innerValue);
```

### BoundedWildcard
Can generalize to `? super K`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjMapDoesNotContainKey.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Map<K, V> things, K key) {
        assertThat(things).doesNotContainKey(key);
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjMapDoesNotContainKeyWithDescription.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Map<K, V> things, K key, String description, @Repeated Object descriptionArgs) {
        assertThat(things).describedAs(description, descriptionArgs).doesNotContainKey(key);
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjMapContainsKey.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Map<K, V> things, K key) {
        assertThat(things).containsKey(key);
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjMapContainsKeyWithDescription.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Map<K, V> things, K key, String description, @Repeated Object descriptionArgs) {
        assertThat(things).describedAs(description, descriptionArgs).containsKey(key);
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsWithDescription.java`
#### Snippet
```java
    @AfterTemplate
    @UseImportPolicy(ImportPolicy.STATIC_IMPORT_ALWAYS)
    void after(Optional<T> optional, T innerValue, String description, @Repeated Object descriptionArgs) {
        assertThat(optional).describedAs(description, descriptionArgs).contains(innerValue);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/PreferAssertj.java`
#### Snippet
```java
            VisitorState state,
            int actualIndex,
            BiConsumer<String, SuggestedFix.Builder> assertThat) {
        SuggestedFix.Builder fix = SuggestedFix.builder();
        String qualified = qualifyAssertThat(fix, state);
```

### BoundedWildcard
Can generalize to `? super SuggestedFix.Builder`
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/PreferAssertj.java`
#### Snippet
```java
            VisitorState state,
            int actualIndex,
            BiConsumer<String, SuggestedFix.Builder> assertThat) {
        SuggestedFix.Builder fix = SuggestedFix.builder();
        String qualified = qualifyAssertThat(fix, state);
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjSingleAssertMatcher.java`
#### Snippet
```java
    }

    private static Optional<List<MethodInvocationTree>> matchAssertj(
            ExpressionTree inputExpressionTree, VisitorState state) {
        if (inputExpressionTree == null) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjSingleAssertMatcher.java`
#### Snippet
```java
                return matchAssertj(ASTHelpers.getReceiver(methodInvocationTree), state);
            } else if (ASSERTION.matches(methodInvocationTree, state)) {
                Optional<List<MethodInvocationTree>> result =
                        matchAssertj(ASTHelpers.getReceiver(methodInvocationTree), state);
                result.ifPresent(list -> list.add(methodInvocationTree));
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContains.java`
#### Snippet
```java
    @BeforeTemplate
    void before(Optional<T> optional, T innerValue) {
        assertThat(optional.get()).isEqualTo(innerValue);
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjOptionalContainsWithDescription.java`
#### Snippet
```java
    @BeforeTemplate
    void before1(Optional<T> optional, T innerValue, String description, @Repeated Object descriptionArgs) {
        assertThat(optional.get()).describedAs(description, descriptionArgs).isEqualTo(innerValue);
    }

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'toByteArray(java.io.File)' is marked unstable with @Beta
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjFileContent.java`
#### Snippet
```java
    @BeforeTemplate
    void before(File file, String expected) throws IOException {
        assertThat(new String(Files.toByteArray(file), StandardCharsets.UTF_8)).isEqualTo(expected);
    }

```

### UnstableApiUsage
'toString(java.io.File, java.nio.charset.Charset)' is marked unstable with @Beta
in `assertj-refaster-rules/src/main/java/com/palantir/assertj/refaster/AssertjFileContent.java`
#### Snippet
```java
    @SuppressWarnings("deprecation") // we're migrating people off a deprecated method
    void before2(File file, String expected) throws IOException {
        assertThat(Files.toString(file, StandardCharsets.UTF_8)).isEqualTo(expected);
    }

```

