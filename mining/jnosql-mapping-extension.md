# jnosql-mapping-extension 
 
# Bad smells
I found 61 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantClassCall | 11 | false |
| UnnecessarySuperQualifier | 8 | false |
| UnnecessaryFullyQualifiedName | 7 | false |
| NonProtectedConstructorInAbstractClass | 5 | true |
| SuspiciousNameCombination | 4 | false |
| MisspelledEquals | 4 | false |
| ClassCanBeRecord | 4 | false |
| BoundedWildcard | 4 | false |
| StringOperationCanBeSimplified | 3 | false |
| SimplifyStreamApiCallChains | 2 | false |
| EnhancedSwitchMigration | 2 | false |
| UnnecessaryModifier | 1 | true |
| DataFlowIssue | 1 | false |
| Convert2MethodRef | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| FuseStreamOperations | 1 | false |
| WrongPackageStatement | 1 | false |
## RuleId[id=SuspiciousNameCombination]
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
    public BinaryPredicate<X, T, T> greaterThanOrEqualTo(T y) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.GREATER_THAN_OR_EQUAL, this, y);
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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/StringFieldBuilder.java`
#### Snippet
```java
    @Override
    public void buildField(JCodeModel codeModel, JDefinedClass jClass, TypeElement typeElement, Element element) {
        super.buildField(codeModel, jClass, typeElement, element, StringAttribute.class, DefaultStringAttribute.class);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/ValueFieldBuilder.java`
#### Snippet
```java
    @Override
    public void buildField(JCodeModel codeModel, JDefinedClass jClass, TypeElement typeElement, Element element, Class<?> forName) {
        super.buildField(codeModel, jClass, typeElement, element, forName, ValueAttribute.class, DefaultValueAttribute.class);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/PluralFieldBuilder.java`
#### Snippet
```java
    @Override
    public void buildField(JCodeModel codeModel, JDefinedClass jClass, TypeElement typeElement, Element element) {
        super.buildField(codeModel, jClass, typeElement, element, PluralAttribute.class, DefaultPluralAttribute.class);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/EntityFieldBuilder.java`
#### Snippet
```java

    public void buildField(JCodeModel codeModel, JDefinedClass jClass, TypeElement typeElement, Element element, String toString) {
        super.buildField(
                jClass,
                element,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/AbstractSimpleFieldBuilder.java`
#### Snippet
```java

    protected void buildField(JCodeModel codeModel, JDefinedClass jClass, TypeElement typeElement, Element element, Class<A> attributeInterface, Class<D> attributeClass) {
        super.buildField(jClass,
                element,
                codeModel.ref(
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/NumberFieldBuilder.java`
#### Snippet
```java
    @Override
    public void buildField(JCodeModel codeModel, JDefinedClass jClass, TypeElement typeElement, Element element, Class<?> forName) {
        super.buildField(codeModel, jClass, typeElement, element, forName, NumberAttribute.class, DefaultNumberAttribute.class);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/AbstractValueFieldBuilder.java`
#### Snippet
```java
            Class<D> attributeClass
    ) {
        super.buildField(
                jClass,
                element,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/ComparableFieldBuilder.java`
#### Snippet
```java
    @Override
    public void buildField(JCodeModel codeModel, JDefinedClass jClass, TypeElement typeElement, Element element) {
        super.buildField(codeModel, jClass, typeElement, element, ComparableAttribute.class, DefaultComparableAttribute.class);
    }

```

## RuleId[id=RedundantClassCall]
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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `jakarta.validation` is unnecessary and can be removed
in `jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
     * @param event the event
     * @throws NullPointerException                            when entity is null
     * @throws jakarta.validation.ConstraintViolationException when {@link jakarta.validation.Validator#validate(Object, Class[])}
     *                                                         returns a non-empty collection
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.validation` is unnecessary and can be removed
in `jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
     * @param event the event
     * @throws NullPointerException                            when entity is null
     * @throws jakarta.validation.ConstraintViolationException when {@link jakarta.validation.Validator#validate(Object, Class[])}
     *                                                         returns a non-empty collection
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.validation` is unnecessary and can be removed
in `jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
     * @param entity the entity to be validated
     * @throws NullPointerException                            when entity is null
     * @throws jakarta.validation.ConstraintViolationException when {@link jakarta.validation.Validator#validate(Object, Class[])}
     *                                                         returns a non-empty collection
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.validation` is unnecessary and can be removed
in `jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
     * @param entity the entity to be validated
     * @throws NullPointerException                            when entity is null
     * @throws jakarta.validation.ConstraintViolationException when {@link jakarta.validation.Validator#validate(Object, Class[])}
     *                                                         returns a non-empty collection
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.mapping.criteria.api` is unnecessary and can be removed
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/api/CriteriaDocumentTemplate.java`
#### Snippet
```java
     * @param criteriaQuery - the query
     * @param <T> the instance type of the query
     * {@link org.eclipse.jnosql.mapping.criteria.api.Root}
     * @param <R> the result type of the query
     * @param <Q> the type of the actual query
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultPath.java`
#### Snippet
```java

    @Override
    public <Z extends java.lang.Number & java.lang.Comparable> NumberExpression<X, Y, Z> get(NumberAttribute<Y, Z> attribute) {
        return new DefaultNumberExpression<>(this, attribute);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultPath.java`
#### Snippet
```java

    @Override
    public <Z extends java.lang.Number & java.lang.Comparable> NumberExpression<X, Y, Z> get(NumberAttribute<Y, Z> attribute) {
        return new DefaultNumberExpression<>(this, attribute);
    }
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

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/Neo4JGraphConfiguration.java`
#### Snippet
```java
        Objects.requireNonNull(settings, "settings is required");

        String url = settings.getOrDefault(HOST.get(), "bolt://localhost:7687").toString();
        String user = settings.getOrDefault(USER.get(), "neo4j").toString();
        String password = settings.getOrDefault(PASSWORD.get(), "neo4j").toString();
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/Neo4JGraphConfiguration.java`
#### Snippet
```java

        String url = settings.getOrDefault(HOST.get(), "bolt://localhost:7687").toString();
        String user = settings.getOrDefault(USER.get(), "neo4j").toString();
        String password = settings.getOrDefault(PASSWORD.get(), "neo4j").toString();
        AuthToken basic = AuthTokens.basic(user, password);
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/Neo4JGraphConfiguration.java`
#### Snippet
```java
        String url = settings.getOrDefault(HOST.get(), "bolt://localhost:7687").toString();
        String user = settings.getOrDefault(USER.get(), "neo4j").toString();
        String password = settings.getOrDefault(PASSWORD.get(), "neo4j").toString();
        AuthToken basic = AuthTokens.basic(user, password);
        Driver driver = GraphDatabase.driver(url, basic);
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractRestrictedQuery()` of an abstract class should not be declared 'public'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/AbstractRestrictedQuery.java`
#### Snippet
```java
    private Collection<Predicate<T>> restrictions;

    public AbstractRestrictedQuery(Class<T> type) {
        super(type);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DefaultAttribute()` of an abstract class should not be declared 'public'
in `jnosql-metamodel-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/DefaultAttribute.java`
#### Snippet
```java
    private final String name;
    
    public DefaultAttribute(Class<X> type, Class<T> attributeType, String name) {
        super(type);
        this.attributeType = attributeType;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractCompositionPredicate()` of an abstract class should not be declared 'public'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/AbstractCompositionPredicate.java`
#### Snippet
```java
    private final Collection<Predicate<X>> predicates;

    public AbstractCompositionPredicate(Collection<Predicate<X>> predicates) {
        this.predicates = predicates;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DefaultSingularAttribute()` of an abstract class should not be declared 'public'
in `jnosql-metamodel-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/DefaultSingularAttribute.java`
#### Snippet
```java
public abstract class DefaultSingularAttribute<X, T> extends DefaultAttribute<X, T> implements SingularAttribute<X, T> {

    public DefaultSingularAttribute(Class<X> type, Class<T> attributeType, String name) {
        super(type, attributeType, name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DefaultSelectQuery()` of an abstract class should not be declared 'public'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultSelectQuery.java`
#### Snippet
```java
    private R result;

    public DefaultSelectQuery(Class<X> type) {
        super(type);
    }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultCriteriaDocumentTemplate.java`
#### Snippet
```java
                        entityStream.map(
                                documentEntity -> documentEntity.documents().stream().map(
                                        document -> document.value()
                                ).collect(
                                        Collectors.toList()
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `MetamodelProcessor` on 'this' is unnecessary in this context
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/MetamodelProcessor.java`
#### Snippet
```java
                                isId.or(isColumn).and(isField)
                        ).forEach(enclosedElement
                                -> MetamodelProcessor.this.buildField(
                                        codeModel,
                                        definedClass,
```

## RuleId[id=MisspelledEquals]
### MisspelledEquals
`equal()` method should probably be 'equals()'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpression.java`
#### Snippet
```java

    @Override
    public BinaryPredicate<X, T, Expression<X, Y, T>> equal(Expression<X, Y, T> expression) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.EQUAL, this, expression);
    }
```

### MisspelledEquals
`equal()` method should probably be 'equals()'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpression.java`
#### Snippet
```java

    @Override
    public BinaryPredicate<X, T, T> equal(T value) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.EQUAL, this, value);
    }
```

### MisspelledEquals
`equal()` method should probably be 'equals()'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/api/Expression.java`
#### Snippet
```java
     * @return equality predicate
     */
    BinaryPredicate<X, T, Expression<X, Y, T>> equal(Expression<X, Y, T> expression);

    /**
```

### MisspelledEquals
`equal()` method should probably be 'equals()'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/api/Expression.java`
#### Snippet
```java
     * @return equality predicate
     */
    BinaryPredicate<X, T, T> equal(T value);

    /**
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-05-01-01-07-30.805.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=EnhancedSwitchMigration]
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java
            } else {
                BiFunction<String, Object, DocumentCondition> bifunction;
                switch (cast.getOperator()) {
                    case EQUAL:
                        bifunction = DocumentCondition::eq;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/CriteriaQueryUtils.java`
#### Snippet
```java
            } else {
                BiFunction<String, Object, DocumentCondition> bifunction;
                switch (cast.getOperator()) {
                    case EXCLUSIVE_BETWEEN:
                    case INCLUSIVE_BETWEEN:
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

## RuleId[id=ClassCanBeRecord]
### ClassCanBeRecord
Class can be a record
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultPathFunction.java`
#### Snippet
```java
 * @param <R> the return type of the function
 */
public class DefaultPathFunction<X, Y, T, R> implements PathFunction<X, Y, T, R> {
    
    private final Path<X, Y> path;
```

### ClassCanBeRecord
Class can be a record
in `jnosql-graph-connections/src/main/java/org/eclipse/jnosql/mapping/graph/connections/ArangoDBGraphConfiguration.java`
#### Snippet
```java


    private static class EdgeConfiguration {

        private final String edge;
```

### ClassCanBeRecord
Class can be a record
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpressionQueryResult.java`
#### Snippet
```java
 * @param <X> the type of the root entity
 */
public class DefaultExpressionQueryResult<X> implements ExpressionQueryResult<X> {
    
    private final Stream<ExpressionQueryResultRow<X>> rows;
```

### ClassCanBeRecord
Class can be a record
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpressionFunction.java`
#### Snippet
```java
 * @param <T> the type of the expression
 */
public class DefaultExpressionFunction<X, Y, T, R> implements ExpressionFunction<X, Y, T, R> {
    
    private final Expression<X, Y, T> expression;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Value`
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultExpressionQueryResultRow.java`
#### Snippet
```java
    
    public DefaultExpressionQueryResultRow(
            Map<Expression<X, ?, ?>, Value> map
    ) {
        this.map = map;
```

### BoundedWildcard
Can generalize to `? extends ValidatorFactory`
in `jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
         * @throws NullPointerException when the provided validatorFactories or the validators instances are null
         */
        private static Validator get(Instance<ValidatorFactory> validatorFactories, Instance<Validator> validators) {
            Objects.requireNonNull(validatorFactories, "validatorFactories is required");
            Objects.requireNonNull(validators, "validators is required");
```

### BoundedWildcard
Can generalize to `? extends Validator`
in `jnosql-mapping-validation/src/main/java/org/eclipse/jnosql/mapping/validation/MappingValidator.java`
#### Snippet
```java
         * @throws NullPointerException when the provided validatorFactories or the validators instances are null
         */
        private static Validator get(Instance<ValidatorFactory> validatorFactories, Instance<Validator> validators) {
            Objects.requireNonNull(validatorFactories, "validatorFactories is required");
            Objects.requireNonNull(validators, "validators is required");
```

### BoundedWildcard
Can generalize to `? extends JExpression`
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/AbstractFieldBuilder.java`
#### Snippet
```java
    protected JInvocation buildInvocation(
            JClass jClass,
            List<JExpression> arguments
    ) {
        JInvocation invocation = JExpr._new(
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

