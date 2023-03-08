# jnosql-mapping-extension 
 
# Bad smells
I found 96 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantClassCall | 41 | false |
| BoundedWildcard | 9 | false |
| UnnecessarySuperQualifier | 8 | false |
| UnnecessaryFullyQualifiedName | 7 | false |
| NonProtectedConstructorInAbstractClass | 5 | true |
| SuspiciousNameCombination | 4 | false |
| MisspelledEquals | 4 | false |
| StringOperationCanBeSimplified | 3 | false |
| ReturnNull | 3 | false |
| SimplifyStreamApiCallChains | 2 | false |
| ConstantValue | 2 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| UnnecessaryModifier | 1 | true |
| DataFlowIssue | 1 | false |
| Convert2MethodRef | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| FuseStreamOperations | 1 | false |
| WrongPackageStatement | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'column'
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraColumnEntityConverter.java`
#### Snippet
```java
    }

    private <T> void setUDTField(T instance, Optional<Column> column, FieldMapping field) {
        if (column.isPresent() && org.eclipse.jnosql.communication.cassandra.column.UDT.class.isInstance(column.get())) {
            org.eclipse.jnosql.communication.cassandra.column.UDT udt =
```

## RuleId[id=SuspiciousNameCombination]
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
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/ComparableFieldBuilder.java`
#### Snippet
```java
    @Override
    public void buildField(JCodeModel codeModel, JDefinedClass jClass, TypeElement typeElement, Element element) {
        super.buildField(codeModel, jClass, typeElement, element, ComparableAttribute.class, DefaultComparableAttribute.class);
    }

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
in `jnosql-metamodel-processor-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/processor/AbstractValueFieldBuilder.java`
#### Snippet
```java
            Class<D> attributeClass
    ) {
        super.buildField(
                jClass,
                element,
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
Redundant call to `isInstance()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraUDTType.java`
#### Snippet
```java
    @Override
    public List<Column> toColumn(ColumnEntityConverter converter, Converters converters) {
        if (Iterable.class.isInstance(value)) {
            List<Iterable<Column>> columns = new ArrayList<>();
            stream(Iterable.class.cast(value).spliterator(), false)
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraUDTType.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            List<Iterable<Column>> columns = new ArrayList<>();
            stream(Iterable.class.cast(value).spliterator(), false)
                    .forEach(c -> columns.add(converter.toColumn(c).columns()));
            return singletonList(UDT.builder(type).withName(field.name()).addUDTs(columns).build());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb-extension/src/main/java/org/eclipse/jnosql/mapping/arangodb/document/ArangoDBDocumentRepositoryProxy.java`
#### Snippet
```java
    ArangoDBDocumentRepositoryProxy(ArangoDBTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb-extension/src/main/java/org/eclipse/jnosql/mapping/arangodb/document/ArangoDBDocumentRepositoryProxy.java`
#### Snippet
```java
    ArangoDBDocumentRepositoryProxy(ArangoDBTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb-extension/src/main/java/org/eclipse/jnosql/mapping/orientdb/document/OrientDBDocumentRepositoryProxy.java`
#### Snippet
```java
    OrientDBDocumentRepositoryProxy(OrientDBTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb-extension/src/main/java/org/eclipse/jnosql/mapping/orientdb/document/OrientDBDocumentRepositoryProxy.java`
#### Snippet
```java
    OrientDBDocumentRepositoryProxy(OrientDBTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(attribute)) {
            return new Date(Number.class.cast(attribute).longValue());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java

        if (Number.class.isInstance(attribute)) {
            return new Date(Number.class.cast(attribute).longValue());
        }
        if (java.time.LocalDate.class.isInstance(attribute)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
            return new Date(Number.class.cast(attribute).longValue());
        }
        if (java.time.LocalDate.class.isInstance(attribute)) {
            return Date.from(java.time.LocalDate.class.cast(attribute).atStartOfDay(ZONE_ID).toInstant());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
        }
        if (java.time.LocalDate.class.isInstance(attribute)) {
            return Date.from(java.time.LocalDate.class.cast(attribute).atStartOfDay(ZONE_ID).toInstant());
        }
        if (LocalDateTime.class.isInstance(attribute)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
            return Date.from(java.time.LocalDate.class.cast(attribute).atStartOfDay(ZONE_ID).toInstant());
        }
        if (LocalDateTime.class.isInstance(attribute)) {
            return Date.from(LocalDateTime.class.cast(attribute).atZone(ZONE_ID).toInstant());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
        }
        if (LocalDateTime.class.isInstance(attribute)) {
            return Date.from(LocalDateTime.class.cast(attribute).atZone(ZONE_ID).toInstant());
        }
        if (ZonedDateTime.class.isInstance(attribute)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
            return Date.from(LocalDateTime.class.cast(attribute).atZone(ZONE_ID).toInstant());
        }
        if (ZonedDateTime.class.isInstance(attribute)) {
            return Date.from(ZonedDateTime.class.cast(attribute).toInstant());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
        }
        if (ZonedDateTime.class.isInstance(attribute)) {
            return Date.from(ZonedDateTime.class.cast(attribute).toInstant());
        }
        if (Date.class.isInstance(attribute)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
            return Date.from(ZonedDateTime.class.cast(attribute).toInstant());
        }
        if (Date.class.isInstance(attribute)) {
            return Date.class.cast(attribute);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
        }
        if (Date.class.isInstance(attribute)) {
            return Date.class.cast(attribute);
        }
        if (Calendar.class.isInstance(attribute)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
            return Date.class.cast(attribute);
        }
        if (Calendar.class.isInstance(attribute)) {
            return Calendar.class.cast(attribute).getTime();
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraRepositoryProxy.java`
#### Snippet
```java

        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
        }
        if (Calendar.class.isInstance(attribute)) {
            return Calendar.class.cast(attribute).getTime();
        }
        throw new IllegalArgumentException("There is not support to: " + attribute.getClass());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraRepositoryProxy.java`
#### Snippet
```java

        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
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

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-solr-extension/src/main/java/org/eclipse/jnosql/mapping/solr/document/SolrRepositoryProxy.java`
#### Snippet
```java
    SolrRepositoryProxy(SolrTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-solr-extension/src/main/java/org/eclipse/jnosql/mapping/solr/document/SolrRepositoryProxy.java`
#### Snippet
```java
    SolrRepositoryProxy(SolrTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase-extension/src/main/java/org/eclipse/jnosql/mapping/couchbase/document/CouchbaseDocumentRepositoryProxy.java`
#### Snippet
```java
    CouchbaseDocumentRepositoryProxy(CouchbaseTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase-extension/src/main/java/org/eclipse/jnosql/mapping/couchbase/document/CouchbaseDocumentRepositoryProxy.java`
#### Snippet
```java
    CouchbaseDocumentRepositoryProxy(CouchbaseTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
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
in `jnosql-hazelcast-extension/src/main/java/org/eclipse/jnosql/mapping/hazelcast/keyvalue/HazelcastRepositoryProxy.java`
#### Snippet
```java
    HazelcastRepositoryProxy(HazelcastTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-hazelcast-extension/src/main/java/org/eclipse/jnosql/mapping/hazelcast/keyvalue/HazelcastRepositoryProxy.java`
#### Snippet
```java
    HazelcastRepositoryProxy(HazelcastTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraColumnEntityConverter.java`
#### Snippet
```java

    private <T> void setUDTField(T instance, Optional<Column> column, FieldMapping field) {
        if (column.isPresent() && org.eclipse.jnosql.communication.cassandra.column.UDT.class.isInstance(column.get())) {
            org.eclipse.jnosql.communication.cassandra.column.UDT udt =
                    org.eclipse.jnosql.communication.cassandra.column.UDT.class.cast(column.get());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraColumnEntityConverter.java`
#### Snippet
```java
        if (column.isPresent() && org.eclipse.jnosql.communication.cassandra.column.UDT.class.isInstance(column.get())) {
            org.eclipse.jnosql.communication.cassandra.column.UDT udt =
                    org.eclipse.jnosql.communication.cassandra.column.UDT.class.cast(column.get());
            Object columns = udt.get();
            if (StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false)
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraColumnEntityConverter.java`
#### Snippet
```java
                    org.eclipse.jnosql.communication.cassandra.column.UDT.class.cast(column.get());
            Object columns = udt.get();
            if (StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false)
                    .allMatch(Iterable.class::isInstance)) {
                GenericFieldMapping genericField = GenericFieldMapping.class.cast(field);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraColumnEntityConverter.java`
#### Snippet
```java
            if (StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false)
                    .allMatch(Iterable.class::isInstance)) {
                GenericFieldMapping genericField = GenericFieldMapping.class.cast(field);
                Collection collection = genericField.getCollectionInstance();
                List<List<Column>> embeddable = (List<List<Column>>) columns;
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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
            return new Date(Number.class.cast(attribute).longValue());
        }
        if (java.time.LocalDate.class.isInstance(attribute)) {
            return Date.from(java.time.LocalDate.class.cast(attribute).atStartOfDay(ZONE_ID).toInstant());
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
        }
        if (java.time.LocalDate.class.isInstance(attribute)) {
            return Date.from(java.time.LocalDate.class.cast(attribute).atStartOfDay(ZONE_ID).toInstant());
        }
        if (LocalDateTime.class.isInstance(attribute)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
 * <p>{@link Number}</p>
 * <p>{@link java.time.LocalDate}</p>
 * <p>{@link java.time.LocalDateTime}</p>
 * <p>{@link java.time.ZonedDateTime}</p>
 * <p>{@link Date}</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
 * <p>{@link java.time.LocalDate}</p>
 * <p>{@link java.time.LocalDateTime}</p>
 * <p>{@link java.time.ZonedDateTime}</p>
 * <p>{@link Date}</p>
 * <p>{@link Calendar}</p>
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
Constructor `DefaultSelectQuery()` of an abstract class should not be declared 'public'
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/DefaultSelectQuery.java`
#### Snippet
```java
    private R result;

    public DefaultSelectQuery(Class<X> type) {
        super(type);
    }
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
Constructor `DefaultAttribute()` of an abstract class should not be declared 'public'
in `jnosql-metamodel-extension/src/main/java/org/eclipse/jnosql/mapping/metamodel/DefaultAttribute.java`
#### Snippet
```java
    private final String name;
    
    public DefaultAttribute(Class<X> type, Class<T> attributeType, String name) {
        super(type);
        this.attributeType = attributeType;
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
    public BinaryPredicate<X, T, T> equal(T value) {
        return new DefaultBinaryPredicate(BinaryPredicate.Operator.EQUAL, this, value);
    }
```

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
in `jnosql-criteria-extension/src/main/java/org/eclipse/jnosql/mapping/criteria/api/Expression.java`
#### Snippet
```java
     * @return equality predicate
     */
    BinaryPredicate<X, T, T> equal(T value);

    /**
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

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/converters/TimestampConverter.java`
#### Snippet
```java
    public Date convertToDatabaseColumn(Object attribute) {
        if (attribute == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jnosql-mongodb-extension/src/main/java/org/eclipse/jnosql/mapping/mongodb/ObjectIdConverter.java`
#### Snippet
```java
            return new ObjectId(attribute);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-mongodb-extension/src/main/java/org/eclipse/jnosql/mapping/mongodb/ObjectIdConverter.java`
#### Snippet
```java
           return dbData.toString();
        }
        return null;
    }
}
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `sb` is redundant
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraUDTType.java`
#### Snippet
```java
    @Override
    public String toString() {
        String sb = "CassandraUDTType{" + "type='" + type + '\'' +
                ", value=" + value +
                ", field=" + field +
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
Can generalize to `? extends ArangoDBDocumentManager`
in `jnosql-arangodb-extension/src/main/java/org/eclipse/jnosql/mapping/arangodb/document/DefaultArangoDBTemplate.java`
#### Snippet
```java

    @Inject
    DefaultArangoDBTemplate(Instance<ArangoDBDocumentManager> manager,
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
```

### BoundedWildcard
Can generalize to `? extends CouchbaseDocumentManager`
in `jnosql-couchbase-extension/src/main/java/org/eclipse/jnosql/mapping/couchbase/document/DefaultCouchbaseTemplate.java`
#### Snippet
```java

    @Inject
    DefaultCouchbaseTemplate(Instance<CouchbaseDocumentManager> manager,
                             DocumentEntityConverter converter, DocumentWorkflow flow,
                             DocumentEventPersistManager persistManager,
```

### BoundedWildcard
Can generalize to `? extends SolrDocumentManager`
in `jnosql-solr-extension/src/main/java/org/eclipse/jnosql/mapping/solr/document/DefaultSolrTemplate.java`
#### Snippet
```java

    @Inject
    DefaultSolrTemplate(Instance<SolrDocumentManager> manager,
                        DocumentEntityConverter converter, DocumentWorkflow flow,
                        DocumentEventPersistManager persistManager,
```

### BoundedWildcard
Can generalize to `? extends OrientDBDocumentManager`
in `jnosql-orientdb-extension/src/main/java/org/eclipse/jnosql/mapping/orientdb/document/DefaultOrientDBTemplate.java`
#### Snippet
```java

    @Inject
    DefaultOrientDBTemplate(Instance<OrientDBDocumentManager> manager,
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
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

### BoundedWildcard
Can generalize to `? extends CassandraColumnManager`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/DefaultCassandraTemplate.java`
#### Snippet
```java

    @Inject
    DefaultCassandraTemplate(Instance<CassandraColumnManager> manager,
                             CassandraColumnEntityConverter converter,
                             CassandraColumnWorkflow flow,
```

### BoundedWildcard
Can generalize to `? extends ElasticsearchDocumentManager`
in `jnosql-elasticsearch-extension/src/main/java/org/eclipse/jnosql/mapping/elasticsearch/document/DefaultElasticsearchTemplate.java`
#### Snippet
```java

    @Inject
    DefaultElasticsearchTemplate(Instance<ElasticsearchDocumentManager> manager,
                                 DocumentEntityConverter converter, DocumentWorkflow flow,
                                 DocumentEventPersistManager persistManager,
```

### BoundedWildcard
Can generalize to `? extends MongoDBDocumentManager`
in `jnosql-mongodb-extension/src/main/java/org/eclipse/jnosql/mapping/mongodb/DefaultMongoDBTemplate.java`
#### Snippet
```java
    }

    DefaultMongoDBTemplate(Instance<MongoDBDocumentManager> manager,
            DocumentEntityConverter converter,
            DocumentWorkflow workflow,
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false) .allMatc...` is always `true`
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraColumnEntityConverter.java`
#### Snippet
```java
                    org.eclipse.jnosql.communication.cassandra.column.UDT.class.cast(column.get());
            Object columns = udt.get();
            if (StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false)
                    .allMatch(Iterable.class::isInstance)) {
                GenericFieldMapping genericField = GenericFieldMapping.class.cast(field);
                Collection collection = genericField.getCollectionInstance();
```

### ConstantValue
Method reference result is always 'true'
in `jnosql-cassandra-extension/src/main/java/org/eclipse/jnosql/mapping/cassandra/column/CassandraColumnEntityConverter.java`
#### Snippet
```java
            Object columns = udt.get();
            if (StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false)
                    .allMatch(Iterable.class::isInstance)) {
                GenericFieldMapping genericField = GenericFieldMapping.class.cast(field);
                Collection collection = genericField.getCollectionInstance();
```

