# jnosql-extensions 
 
# Bad smells
I found 100 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 56 | false |
| RedundantClassCall | 11 | false |
| JavadocReference | 8 | false |
| FieldMayBeFinal | 6 | false |
| CdiInjectionPointsInspection | 5 | false |
| SuspiciousNameCombination | 4 | false |
| SimplifyStreamApiCallChains | 2 | false |
| RedundantTypeArguments | 2 | false |
| UnnecessaryModifier | 1 | true |
| AutoCloseableResource | 1 | false |
| DataFlowIssue | 1 | false |
| Deprecation | 1 | false |
| FuseStreamOperations | 1 | false |
| WrongPackageStatement | 1 | false |
## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'y' should probably not be passed as parameter 'right'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> greaterThanOrEqualTo(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.GREATER_THAN_OR_EQUAL, this, y);
    }

```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'right'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> greaterThan(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.GREATER_THAN, this, y);
    }

```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'right'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> lessThanOrEqualTo(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LESS_THAN_OR_EQUAL, this, y);
    }

```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'right'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> lessThan(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LESS_THAN, this, y);
    }

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/api/CriteriaDocumentTemplateProducer.java`
#### Snippet
```java
public interface CriteriaDocumentTemplateProducer {

public <T extends CriteriaDocumentTemplate> T get(DocumentManager dm);
    
}
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ValidatorFactory' used without 'try'-with-resources statement
in `jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
                return validatorFactory.getValidator();
            } else {
                ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
                return factory.getValidator();
            }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.metamodel.api.StringAttribute' to 'org.eclipse.jnosql.mapping.metamodel.api.Attribute'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultStringExpression.java`
#### Snippet
```java

    public DefaultStringExpression(Path<X, Y> path, StringAttribute attribute) {
        super(path, attribute);
    }    
    
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultStringExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, String, String> like(String pattern) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LIKE, this, pattern);
    }
    
```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultStringExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, String, String> like(String pattern) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LIKE, this, pattern);
    }
    
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultEntityQueryResult' to 'org.eclipse.jnosql.mapping.criteria.DefaultEntityQueryResult'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultEntityQuery.java`
#### Snippet
```java
    public EntityQuery<T> feed(Stream<T> results) {
        this.setResult(
                new DefaultEntityQueryResult(results)
        );
        return this;
```

### UNCHECKED_WARNING
Unchecked call to 'DefaultEntityQueryResult(Stream)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultEntityQueryResult'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultEntityQuery.java`
#### Snippet
```java
    public EntityQuery<T> feed(Stream<T> results) {
        this.setResult(
                new DefaultEntityQueryResult(results)
        );
        return this;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate\>'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Expression<X, Y, T>> equal(Expression<X, Y, T> expression) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.EQUAL, this, expression);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Expression<X, Y, T>> equal(Expression<X, Y, T> expression) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.EQUAL, this, expression);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate\>'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Collection<T>> in(Collection<T> values) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.IN, this, values);
    }
    
```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Collection<T>> in(Collection<T> values) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.IN, this, values);
    }
    
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> equal(T value) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.EQUAL, this, value);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> equal(T value) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.EQUAL, this, value);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultNegationPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.NegationPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/AbstractPredicate.java`
#### Snippet
```java
    @Override
    public NegationPredicate<T> not() {
        return new DefaultNegationPredicate(this);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultNegationPredicate(Predicate)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultNegationPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/AbstractPredicate.java`
#### Snippet
```java
    @Override
    public NegationPredicate<T> not() {
        return new DefaultNegationPredicate(this);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultAggregatedQuery' to 'org.eclipse.jnosql.mapping.criteria.api.AggregatedQuery'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultFunctionQuery.java`
#### Snippet
```java
    @Override
    public AggregatedQuery<T> groupBy(Expression<T, ?, ?>... groupings) {
        return new DefaultAggregatedQuery(this.getType(), groupings);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultAggregatedQuery(Class, Expression...)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultAggregatedQuery'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultFunctionQuery.java`
#### Snippet
```java
    @Override
    public AggregatedQuery<T> groupBy(Expression<T, ?, ?>... groupings) {
        return new DefaultAggregatedQuery(this.getType(), groupings);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.mapping.criteria.AbstractRestrictedQuery' to 'Q'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/AbstractRestrictedQuery.java`
#### Snippet
```java
    public Q where(Predicate<T>... restrictions) {
        this.restrictions = Arrays.asList(restrictions);
        return (Q) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.mapping.criteria.DefaultSelectQuery' to 'I'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultSelectQuery.java`
#### Snippet
```java
    public I setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return (I) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.mapping.criteria.DefaultSelectQuery' to 'I'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultSelectQuery.java`
#### Snippet
```java
    public I orderBy(Order<X, ?>... sortings) {
        this.sortings = Arrays.asList(sortings);
        return (I) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.mapping.criteria.DefaultSelectQuery' to 'I'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultSelectQuery.java`
#### Snippet
```java
    public I setFirstResult(Integer firstResult) {
        this.firstResult = firstResult;
        return (I) this;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultRangePredicate' to 'org.eclipse.jnosql.mapping.criteria.api.RangePredicate\>'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public RangePredicate<X, T, Expression<X, ?, T>> inclusiveBetween(Expression<X, ?, T> from, Expression<X, ? , T> to) {
        return new DefaultRangePredicate(RangePredicate.Operator.INCLUSIVE_BETWEEN, this, from, to);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultRangePredicate(Operator, Expression, RHS, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultRangePredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public RangePredicate<X, T, Expression<X, ?, T>> inclusiveBetween(Expression<X, ?, T> from, Expression<X, ? , T> to) {
        return new DefaultRangePredicate(RangePredicate.Operator.INCLUSIVE_BETWEEN, this, from, to);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultRangePredicate' to 'org.eclipse.jnosql.mapping.criteria.api.RangePredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public RangePredicate<X, T, T> exclusiveBetween(T from, T to) {
        return new DefaultRangePredicate(RangePredicate.Operator.EXCLUSIVE_BETWEEN, this, from, to);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultRangePredicate(Operator, Expression, RHS, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultRangePredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public RangePredicate<X, T, T> exclusiveBetween(T from, T to) {
        return new DefaultRangePredicate(RangePredicate.Operator.EXCLUSIVE_BETWEEN, this, from, to);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> greaterThanOrEqualTo(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.GREATER_THAN_OR_EQUAL, this, y);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> greaterThanOrEqualTo(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.GREATER_THAN_OR_EQUAL, this, y);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate\>'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Expression<X, ?, T>> greaterThanOrEqualTo(Expression<X, ?, T> expression) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.GREATER_THAN_OR_EQUAL, this, expression);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Expression<X, ?, T>> greaterThanOrEqualTo(Expression<X, ?, T> expression) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.GREATER_THAN_OR_EQUAL, this, expression);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultRangePredicate' to 'org.eclipse.jnosql.mapping.criteria.api.RangePredicate\>'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public RangePredicate<X, T, Expression<X, ?, T>> exclusiveBetween(Expression<X, ?, T> from, Expression<X, ?, T> to) {
        return new DefaultRangePredicate(RangePredicate.Operator.EXCLUSIVE_BETWEEN, this, from, to);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultRangePredicate(Operator, Expression, RHS, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultRangePredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public RangePredicate<X, T, Expression<X, ?, T>> exclusiveBetween(Expression<X, ?, T> from, Expression<X, ?, T> to) {
        return new DefaultRangePredicate(RangePredicate.Operator.EXCLUSIVE_BETWEEN, this, from, to);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate\>'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Expression<X, ?, T>> greaterThan(Expression<X, ?, T> expression) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.GREATER_THAN, this, expression);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Expression<X, ?, T>> greaterThan(Expression<X, ?, T> expression) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.GREATER_THAN, this, expression);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultRangePredicate' to 'org.eclipse.jnosql.mapping.criteria.api.RangePredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public RangePredicate<X, T, T> inclusiveBetween(T from, T to) {
        return new DefaultRangePredicate(RangePredicate.Operator.INCLUSIVE_BETWEEN, this, from, to);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultRangePredicate(Operator, Expression, RHS, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultRangePredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public RangePredicate<X, T, T> inclusiveBetween(T from, T to) {
        return new DefaultRangePredicate(RangePredicate.Operator.INCLUSIVE_BETWEEN, this, from, to);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate\>'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Expression<X, ?, T>> lessThanOrEqualTo(Expression<X, ?, T> expression) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LESS_THAN_OR_EQUAL, this, expression);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Expression<X, ?, T>> lessThanOrEqualTo(Expression<X, ?, T> expression) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LESS_THAN_OR_EQUAL, this, expression);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> greaterThan(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.GREATER_THAN, this, y);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> greaterThan(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.GREATER_THAN, this, y);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> lessThanOrEqualTo(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LESS_THAN_OR_EQUAL, this, y);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> lessThanOrEqualTo(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LESS_THAN_OR_EQUAL, this, y);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> lessThan(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LESS_THAN, this, y);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, T> lessThan(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LESS_THAN, this, y);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate' to 'org.eclipse.jnosql.mapping.criteria.api.BinaryPredicate\>'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Expression<X, ?, T>> lessThan(Expression<X, ?, T> expression) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LESS_THAN, this, expression);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DefaultBinaryPredicate(Operator, Expression, RHS)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultBinaryPredicate'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultComparableExpression.java`
#### Snippet
```java
    @Override
    public BinaryPredicate<X, T, Expression<X, ?, T>> lessThan(Expression<X, ?, T> expression) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.LESS_THAN, this, expression);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.DefaultExpressionQueryResult' to 'org.eclipse.jnosql.mapping.criteria.DefaultExpressionQueryResult'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpressionQuery.java`
#### Snippet
```java
    public ExpressionQuery<X> feed(Stream<List<Value>> results) {
        this.setResult(
                new DefaultExpressionQueryResult(
                        results.map(
                                result -> new DefaultExpressionQueryResultRow(
```

### UNCHECKED_WARNING
Unchecked call to 'DefaultExpressionQueryResult(Stream\>)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultExpressionQueryResult'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpressionQuery.java`
#### Snippet
```java
    public ExpressionQuery<X> feed(Stream<List<Value>> results) {
        this.setResult(
                new DefaultExpressionQueryResult(
                        results.map(
                                result -> new DefaultExpressionQueryResultRow(
```

### UNCHECKED_WARNING
Unchecked call to 'DefaultExpressionQueryResultRow(Map, Value\>)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.DefaultExpressionQueryResultRow'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpressionQuery.java`
#### Snippet
```java
                new DefaultExpressionQueryResult(
                        results.map(
                                result -> new DefaultExpressionQueryResultRow(
                                        this.expressions.stream().collect(
                                                Collectors.toMap(
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.metamodel.api.NumberAttribute' to 'org.eclipse.jnosql.mapping.metamodel.api.ComparableAttribute'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultNumberExpression.java`
#### Snippet
```java

    public DefaultNumberExpression(Path<X, Y> path, NumberAttribute attribute) {
        super(path, attribute);
    }
    
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.eclipse.jnosql.mapping.criteria.api.CriteriaDocumentTemplate', required 'T'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplateProducer.java`
#### Snippet
```java

    @Override
    public CriteriaDocumentTemplate get(DocumentManager dm) {
        return new DefaultCriteriaDocumentTemplate(
                dm,
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.api.SelectQuery' to 'org.eclipse.jnosql.mapping.criteria.api.SelectQuery'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java
        requireNonNull(criteriaQuery, "query is required");
        if (criteriaQuery instanceof SelectQuery) {
            SelectQuery<T, ?, ?, ?> selectQuery = SelectQuery.class.cast(criteriaQuery);
            DocumentQuery documentQuery = CriteriaQueryUtils.convert(selectQuery);
            Stream<DocumentEntity> entityStream = this.getManager().select(
```

### UNCHECKED_WARNING
Unchecked call to 'feed(F)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.api.ExecutableQuery'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java

            if (selectQuery instanceof EntityQuery) {
                EntityQuery.class.cast(selectQuery).feed(
                        entityStream.map(
                                documentEntity -> this.getConverter().toEntity(
```

### UNCHECKED_WARNING
Unchecked call to 'feed(F)' as a member of raw type 'org.eclipse.jnosql.mapping.criteria.api.ExecutableQuery'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java
                );
            } else if (selectQuery instanceof ExpressionQuery) {
                ExpressionQuery.class.cast(selectQuery).feed(
                        entityStream.map(
                                documentEntity -> documentEntity.documents().stream().map(
```

### UNCHECKED_WARNING
Unchecked call to 'buildField(JCodeModel, JDefinedClass, TypeElement, Element, Class)' as a member of raw type 'org.eclipse.jnosql.mapping.metamodel.processor.AbstractValueFieldBuilder'
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/MetamodelProcessor.java`
#### Snippet
```java
                    stringFieldBuilder.buildField(codeModel, jClass, typeElement, element);
                } else if (Number.class.isAssignableFrom(forName)) {
                    numberFieldBuilder.buildField(codeModel, jClass, typeElement, element, forName);
                } else if (Comparable.class.isAssignableFrom(forName)) {
                    comparableFieldBuilder.buildField(codeModel, jClass, typeElement, element);
```

### UNCHECKED_WARNING
Unchecked call to 'buildField(JCodeModel, JDefinedClass, TypeElement, Element, Class)' as a member of raw type 'org.eclipse.jnosql.mapping.metamodel.processor.AbstractValueFieldBuilder'
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/MetamodelProcessor.java`
#### Snippet
```java
                    pluralFieldBuilder.buildField(codeModel, jClass, typeElement, element);
                } else {
                    valueFieldBuilder.buildField(codeModel, jClass, typeElement, element, forName);
                }
            } catch (ClassNotFoundException exception) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayDeque' to 'java.util.Deque'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java
    public static String unfold(Path path) {
        Path tmp = path;
        Deque<String> attributes = new ArrayDeque();
        while (Objects.nonNull(tmp) && !(tmp instanceof Root)) {
            attributes.add(
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.criteria.api.ExpressionQuery' to 'org.eclipse.jnosql.mapping.criteria.api.ExpressionQuery'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java

        if (selectQuery instanceof ExpressionQuery) {
            ExpressionQuery<X> expressionQuery = ExpressionQuery.class.cast(selectQuery);
            builder = DocumentQuery.builder(
                    expressionQuery.getExpressions().stream().map(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: 'CompositionPredicate.class.cast(predicate)' has raw type, so result of getPredicates is erased
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java
        DocumentCondition result = null;
        if (predicate instanceof CompositionPredicate) {
            Collection<Predicate> restrictions = CompositionPredicate.class.cast(predicate).getPredicates();
            Function<DocumentCondition[], DocumentCondition> function = predicate instanceof DisjunctionPredicate
                    ? DocumentCondition::or
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Graph`
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/Neo4JEmbeddedGraphConfiguration.java`
#### Snippet
```java

/**
 * Creates the connection to {@link Graph} using Neo4J Embedded.
 */
public class Neo4JEmbeddedGraphConfiguration implements GraphConfiguration {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/Neo4JGraphConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum Neo4JGraphConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `Graph`
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/Neo4JGraphConfiguration.java`
#### Snippet
```java

/**
 * Creates the connection to {@link Graph} using Neo4J remote.
 */
public class Neo4JGraphConfiguration implements GraphConfiguration {
```

### JavadocReference
Cannot resolve symbol `Graph`
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/JanusGraphConfiguration.java`
#### Snippet
```java

/**
 * Creates the connection to {@link Graph} using JanusGraph.
 */
public class JanusGraphConfiguration implements GraphConfiguration {
```

### JavadocReference
Cannot resolve symbol `Graph`
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/ArangoDBGraphConfiguration.java`
#### Snippet
```java

/**
 * Creates the connection to {@link Graph} using ArangoDB.
 */
public class ArangoDBGraphConfiguration implements GraphConfiguration {
```

### JavadocReference
Cannot resolve symbol `Graph`
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/TitanGraphConfiguration.java`
#### Snippet
```java

/**
 * Creates the connection to {@link Graph} using Titan.
 */
public class TitanGraphConfiguration implements GraphConfiguration {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/ArangoDBGraphConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum ArangoDBGraphConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `DocumentCondition`
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java

/**
 * Utility to convert {@link Predicate}s in {@link DocumentCondition}s
 */
public class CriteriaQueryUtils {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/MetamodelProcessor.java`
#### Snippet
```java
        }
        if (Objects.nonNull(typeElement)) {
            String toString = fieldType.toString();
            try {
                Class<?> forName = Class.forName(
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java
        requireNonNull(criteriaQuery, "query is required");
        if (criteriaQuery instanceof SelectQuery) {
            SelectQuery<T, ?, ?, ?> selectQuery = SelectQuery.class.cast(criteriaQuery);
            DocumentQuery documentQuery = CriteriaQueryUtils.convert(selectQuery);
            Stream<DocumentEntity> entityStream = this.getManager().select(
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java

            if (selectQuery instanceof EntityQuery) {
                EntityQuery.class.cast(selectQuery).feed(
                        entityStream.map(
                                documentEntity -> this.getConverter().toEntity(
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java
                );
            } else if (selectQuery instanceof ExpressionQuery) {
                ExpressionQuery.class.cast(selectQuery).feed(
                        entityStream.map(
                                documentEntity -> documentEntity.documents().stream().map(
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/MetamodelProcessor.java`
#### Snippet
```java
            for (Element element : re.getElementsAnnotatedWith(annotationElement)) {
                if (element instanceof TypeElement) {
                    TypeElement typeElement = TypeElement.class.cast(element);

                    String name = typeElement.getQualifiedName() + "_";
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/MetamodelProcessor.java`
#### Snippet
```java
            Element asElement = this.processingEnv.getTypeUtils().asElement(asType);
            if (asElement instanceof TypeElement) {
                fieldType = TypeElement.class.cast(asElement);
            }
        } else if (asType instanceof PrimitiveType) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/MetamodelProcessor.java`
#### Snippet
```java
        } else if (asType instanceof PrimitiveType) {
            fieldType = this.processingEnv.getTypeUtils().boxedClass(
                    PrimitiveType.class.cast(asType)
            );
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java

        if (selectQuery instanceof ExpressionQuery) {
            ExpressionQuery<X> expressionQuery = ExpressionQuery.class.cast(selectQuery);
            builder = DocumentQuery.builder(
                    expressionQuery.getExpressions().stream().map(
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java
        DocumentCondition result = null;
        if (predicate instanceof CompositionPredicate) {
            Collection<Predicate> restrictions = CompositionPredicate.class.cast(predicate).getPredicates();
            Function<DocumentCondition[], DocumentCondition> function = predicate instanceof DisjunctionPredicate
                    ? DocumentCondition::or
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java
        } else if (predicate instanceof NegationPredicate) {
            result = computeCondition(
                    NegationPredicate.class.cast(predicate).getPredicate()
            ).negate();
        } else if (predicate instanceof BinaryPredicate) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java
            ).negate();
        } else if (predicate instanceof BinaryPredicate) {
            BinaryPredicate cast = BinaryPredicate.class.cast(predicate);
            String lhs = unfold(
                    cast.getLeft()
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java
            }
        } else if (predicate instanceof RangePredicate) {
            RangePredicate cast = RangePredicate.class.cast(predicate);
            String lhs = unfold(
                    cast.getLeft()
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Stream.of()'
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/MetamodelProcessor.java`
#### Snippet
```java
                        Embeddable.class,
                        MappedSuperclass.class
                ).stream().map(
                        Class::getName
                ).collect(
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Stream.of()'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java
                        ),
                        expression.getAttribute().getName()
                ).stream().filter(
                        value -> !Objects.equals(
                                0,
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `converters` may be 'final'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java
    private EntitiesMetadata entities;

    private Converters converters;

    private DocumentEventPersistManager persistManager;
```

### FieldMayBeFinal
Field `manager` may be 'final'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java
public class DefaultCriteriaDocumentTemplate extends AbstractDocumentTemplate implements CriteriaDocumentTemplate {

    private DocumentManager manager;

    private DocumentEntityConverter converter;
```

### FieldMayBeFinal
Field `entities` may be 'final'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java
    private DocumentWorkflow workflow;

    private EntitiesMetadata entities;

    private Converters converters;
```

### FieldMayBeFinal
Field `workflow` may be 'final'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java
    private DocumentEntityConverter converter;

    private DocumentWorkflow workflow;

    private EntitiesMetadata entities;
```

### FieldMayBeFinal
Field `persistManager` may be 'final'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java
    private Converters converters;

    private DocumentEventPersistManager persistManager;

    public DefaultCriteriaDocumentTemplate(
```

### FieldMayBeFinal
Field `converter` may be 'final'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java
    private DocumentManager manager;

    private DocumentEntityConverter converter;

    private DocumentWorkflow workflow;
```

## RuleId[id=Deprecation]
### Deprecation
'Neo4JGraph(org.neo4j.driver.Driver, com.steelbridgelabs.oss.neo4j.structure.Neo4JElementIdProvider, com.steelbridgelabs.oss.neo4j.structure.Neo4JElementIdProvider)' is deprecated
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/Neo4JGraphConfiguration.java`
#### Snippet
```java
        Neo4JElementIdProvider<Long> vertexIdProvider = new Neo4JNativeElementIdProvider();
        Neo4JElementIdProvider<Long> edgeIdProvider = new Neo4JNativeElementIdProvider();
        return new Neo4JGraph(driver, vertexIdProvider, edgeIdProvider);
    }
}
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing HashSet
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/MetamodelProcessor.java`
#### Snippet
```java
                ).stream().map(
                        Class::getName
                ).collect(
                        Collectors.toList()
                )
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplateProducer.java`
#### Snippet
```java

    @Inject
    private DocumentEntityConverter converter;
    
    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplateProducer.java`
#### Snippet
```java

    @Inject
    private DocumentEventPersistManager persistManager;

    @Override
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplateProducer.java`
#### Snippet
```java
    
    @Inject
    private EntitiesMetadata entities;
    
    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplateProducer.java`
#### Snippet
```java
    
    @Inject
    private Converters converters;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplateProducer.java`
#### Snippet
```java
    
    @Inject
    private DocumentWorkflow workflow;
    
    @Inject
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java
                                selectQuery.getRestrictions()
                        ).orElse(
                                Collections.<Predicate<X>>emptyList()
                        ).stream().map(
                                CriteriaQueryUtils::computeCondition
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java
                        selectQuery.getOrderBy()
                ).orElse(
                        Collections.<Order<X, ?>>emptyList()
                ).stream().map(
                        orderBy -> {
```

## RuleId[id=WrongPackageStatement]
### WrongPackageStatement
Package name 'org.eclipse.jnosql.mapping.metamodel' does not correspond to the file path 'org.eclipse.jnosql.mapping'
in `jnosql-metamodel-extension/src/main/java/org/eclipse/jnosql/mapping/package-info.java`
#### Snippet
```java
 * for example a stronly typed query builder.
 */
package org.eclipse.jnosql.mapping.metamodel;
```

