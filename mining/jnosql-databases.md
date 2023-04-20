# jnosql-databases 
 
# Bad smells
I found 383 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantClassCall | 137 | false |
| BoundedWildcard | 32 | false |
| ConstantValue | 30 | false |
| CallToStringConcatCanBeReplacedByOperator | 27 | false |
| UnnecessaryFullyQualifiedName | 21 | false |
| SimplifyStreamApiCallChains | 15 | false |
| StringBufferReplaceableByString | 15 | false |
| ReturnNull | 14 | false |
| EnhancedSwitchMigration | 11 | false |
| OptionalUsedAsFieldOrParameterType | 7 | false |
| AssignmentToMethodParameter | 7 | false |
| PatternVariableCanBeUsed | 6 | false |
| DataFlowIssue | 5 | false |
| StringEqualsEmptyString | 4 | false |
| SimplifyOptionalCallChains | 4 | false |
| ClassCanBeRecord | 4 | false |
| ZeroLengthArrayInitialization | 3 | false |
| TypeParameterExtendsObject | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| MissortedModifiers | 2 | false |
| IgnoreResultOfCall | 2 | false |
| RedundantMethodOverride | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| RedundantFieldInitialization | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| UnusedAssignment | 2 | false |
| UnnecessaryModifier | 1 | true |
| MissingSerialAnnotation | 1 | false |
| OptionalContainsCollection | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| UnnecessaryReturn | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| AbstractClassNeverImplemented | 1 | false |
| SystemOutErr | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| NestedAssignment | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| IdempotentLoopBody | 1 | false |
| UseOfPropertiesAsHashtable | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| SynchronizeOnThis | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/UDTFinisherBuilder.java`
#### Snippet
```java
     * @throws IllegalStateException when there is a null element
     */
    public UDT build();
}

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Passing a non-null argument to `Optional`
in `jnosql-infinispan/src/main/java/org/eclipse/jnosql/databases/infinispan/communication/InfinispanBucketManager.java`
#### Snippet
```java
            return Optional.empty();
        }
        return Optional.ofNullable(Value.of(value));
    }

```

### DataFlowIssue
Argument `row.getUdtValue(name)` might be null
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java
        final DataType type = definition.getType();
        if (type instanceof UserDefinedType) {
            return getUDT(definition, row.getUdtValue(name));
        }
        final TypeCodec<Object> codec = row.codecRegistry().codecFor(type);
```

### DataFlowIssue
Method invocation `getLong` may produce `NullPointerException`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/DefaultCassandraColumnManager.java`
#### Snippet
```java
        requireNonNull(columnFamily, "columnFamily is required");
        final ResultSet execute = session.execute(QueryBuilder.selectFrom(keyspace, columnFamily).countAll().build());
        return execute.one().getLong(0);
    }

```

### DataFlowIssue
Argument `password` might be null
in `jnosql-memcached/src/main/java/org/eclipse/jnosql/databases/memcached/communication/MemcachedKeyValueConfiguration.java`
#### Snippet
```java
                            , Configurations.PASSWORD)))
                            .map(Object::toString).orElse(null);
                    factoryBuilder.setAuthDescriptor(AuthDescriptor.typical(u, password));
                });

```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/DefaultHazelcastBucketManager.java`
#### Snippet
```java
            return Optional.empty();
        }
        return Optional.ofNullable(Value.of(value));
    }

```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
    private static Map<String, Object> getMap(Object value) {
        Map<String, Object> subDocument = new HashMap<>();
        StreamSupport.stream(Iterable.class.cast(value).spliterator(),
                false).forEach(feedJSON(subDocument));
        return subDocument;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
            Object value = ValueUtil.convert(d.value());
            if (value instanceof Document) {
                Document subDocument = Document.class.cast(value);
                jsonObject.put(d.name(), singletonMap(subDocument.name(), subDocument.get()));
            } else if (isSudDocument(value)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
                jsonObject.put(d.name(), subDocument);
            } else if (isSudDocumentList(value)) {
                jsonObject.put(d.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                        .map(EntityConverter::getMap).collect(toList()));
            } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java

    private static List<Object> getObjects(Object val) {
        return (List<Object>) StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .map(CONVERT).collect(toList());
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java
        if (val instanceof Iterable) {
            List<Object> items = new ArrayList<>();
            Iterable.class.cast(val).forEach(items::add);
            if (items.size() == 1) {
                Object item = items.get(0);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java
                //check if it is dynamic params
                if (PARAM_CLASS_NAME.equals(item.getClass().getName())) {
                    Object params = Value.class.cast(item).get();
                    if (params instanceof Iterable) {
                        return getObjects(Iterable.class.cast(params));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java
                    Object params = Value.class.cast(item).get();
                    if (params instanceof Iterable) {
                        return getObjects(Iterable.class.cast(params));
                    } else {
                        return Collections.singletonList(getObject(params));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java
    private static final Function CONVERT = o -> {
        if (o instanceof Value) {
            return convert(Value.class.cast(o));
        }
        return getObject(o);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java

    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/SolrRepositoryProxy.java`
#### Snippet
```java
    SolrRepositoryProxy(SolrTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
    private Document toDocument(String key, Map<String, Object> properties) {
        Object value = properties.get(key);
        if (Map.class.isInstance(value)) {
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
        Object value = properties.get(key);
        if (Map.class.isInstance(value)) {
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
        if (isADocumentIterable(value)) {
            List<List<Document>> documents = new ArrayList<>();
            for (Object object : Iterable.class.cast(value)) {
                Map<?, ?> map = Map.class.cast(object);
                documents.add(map.entrySet().stream().map(ENTRY_DOCUMENT).collect(toList()));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
            List<List<Document>> documents = new ArrayList<>();
            for (Object object : Iterable.class.cast(value)) {
                Map<?, ?> map = Map.class.cast(object);
                documents.add(map.entrySet().stream().map(ENTRY_DOCUMENT).collect(toList()));
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/SolrRepositoryProxy.java`
#### Snippet
```java
    SolrRepositoryProxy(SolrTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraUDTType.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraUDTType.java`
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
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrUtils.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java

    private <T> void setUDTField(T instance, Optional<Column> column, FieldMapping field) {
        if (column.isPresent() && org.eclipse.jnosql.databases.cassandra.communication.UDT.class.isInstance(column.get())) {
            org.eclipse.jnosql.databases.cassandra.communication.UDT udt =
                    org.eclipse.jnosql.databases.cassandra.communication.UDT.class.cast(column.get());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java
        if (column.isPresent() && org.eclipse.jnosql.databases.cassandra.communication.UDT.class.isInstance(column.get())) {
            org.eclipse.jnosql.databases.cassandra.communication.UDT udt =
                    org.eclipse.jnosql.databases.cassandra.communication.UDT.class.cast(column.get());
            Object columns = udt.get();
            if (StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false)
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java
                    org.eclipse.jnosql.databases.cassandra.communication.UDT.class.cast(column.get());
            Object columns = udt.get();
            if (StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false)
                    .allMatch(Iterable.class::isInstance)) {
                GenericFieldMapping genericField = GenericFieldMapping.class.cast(field);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java
            if (StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false)
                    .allMatch(Iterable.class::isInstance)) {
                GenericFieldMapping genericField = GenericFieldMapping.class.cast(field);
                Collection collection = genericField.getCollectionInstance();
                List<List<Column>> embeddable = (List<List<Column>>) columns;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryExecutor.java`
#### Snippet
```java

    static QueryExecutor of(ColumnQuery query) {
        if (CassandraQuery.class.isInstance(query)) {
            return QueryExecutorType.PAGING_STATE;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(attribute)) {
            return new Date(Number.class.cast(attribute).longValue());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
#### Snippet
```java

        if (Number.class.isInstance(attribute)) {
            return new Date(Number.class.cast(attribute).longValue());
        }
        if (java.time.LocalDate.class.isInstance(attribute)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraRepositoryProxy.java`
#### Snippet
```java

        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraRepositoryProxy.java`
#### Snippet
```java

        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryExecutorType.java`
#### Snippet
```java
                                            DefaultCassandraColumnManager manager) {

            CassandraQuery query = CassandraQuery.class.cast(q);

            if (query.isExhausted()) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java
        switch (type.getProtocolCode()) {
            case ProtocolConstants.DataType.UDT:
                return Column.class.cast(result);
            case ProtocolConstants.DataType.LIST:
            case ProtocolConstants.DataType.SET:
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java

    private static String getUserType(Object result) {
        return StreamSupport.stream(Iterable.class.cast(result).spliterator(), false)
                .limit(1L)
                .map(c -> UdtValue.class.cast(c).getType().getName().asInternal())
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java
        return StreamSupport.stream(Iterable.class.cast(result).spliterator(), false)
                .limit(1L)
                .map(c -> UdtValue.class.cast(c).getType().getName().asInternal())
                .findFirst()
                .get().toString();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java

    private static boolean isUDTIterable(Object result) {
        final Iterable<?> iterable = Iterable.class.cast(result);
        if (!iterable.iterator().hasNext()) {
            return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java

        List<Iterable<Column>> columns = new ArrayList<>();
        for (Object value : Iterable.class.cast(result)) {
            final UdtValue udtValue = UdtValue.class.cast(value);
            final UDT udt = getUDT(definition, udtValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java
        List<Iterable<Column>> columns = new ArrayList<>();
        for (Object value : Iterable.class.cast(result)) {
            final UdtValue udtValue = UdtValue.class.cast(value);
            final UDT udt = getUDT(definition, udtValue);
            columns.add((Iterable<Column>) udt.get());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
        entity.columns().stream()
                .forEach(c -> {
                    if (UDT.class.isInstance(c)) {
                        insertUDT(UDT.class.cast(c), keyspace, entity.name(), session, values);
                    } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
                .forEach(c -> {
                    if (UDT.class.isInstance(c)) {
                        insertUDT(UDT.class.cast(c), keyspace, entity.name(), session, values);
                    } else {
                        insertSingleField(c, values);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
                .collect(Collectors.toList());
        for (Object object : elements) {
            if (Column.class.isInstance(object)) {
                Column column = Column.class.cast(object);
                Object convert = ValueUtil.convert(column.value());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
        for (Object object : elements) {
            if (Column.class.isInstance(object)) {
                Column column = Column.class.cast(object);
                Object convert = ValueUtil.convert(column.value());

```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
                }

            } else if (Iterable.class.isInstance(object)) {
                udtValues.add(getUdtValue(userType, Iterable.class.cast(Iterable.class.cast(object)), type));
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java

            } else if (Iterable.class.isInstance(object)) {
                udtValues.add(getUdtValue(userType, Iterable.class.cast(Iterable.class.cast(object)), type));
            }
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java

            } else if (Iterable.class.isInstance(object)) {
                udtValues.add(getUdtValue(userType, Iterable.class.cast(Iterable.class.cast(object)), type));
            }
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java

        final DataType type = columnMetadata.getType();
        Iterable elements = Iterable.class.cast(udt.get());
        Object udtValue = getUdtValue(userType, elements, type);
        values.put(getName(udt), QueryBuilder.literal(udtValue));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/OrientDBDocumentRepositoryProxy.java`
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
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/OrientDBDocumentRepositoryProxy.java`
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
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java

    private static boolean isDocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
    private static boolean isDocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
    private static void toDocument(Map<String, Object> entityValues, Document document) {
        Object value = ValueUtil.convert(document.value());
        if (Document.class.isInstance(value)) {
            Document subDocument = Document.class.cast(value);
            entityValues.put(document.name(), singletonMap(subDocument.name(), subDocument.get()));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
        Object value = ValueUtil.convert(document.value());
        if (Document.class.isInstance(value)) {
            Document subDocument = Document.class.cast(value);
            entityValues.put(document.name(), singletonMap(subDocument.name(), subDocument.get()));
        } else if (isDocumentIterable(value)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
            entityValues.put(document.name(), getMap(value));
        } else if (isSudDocumentList(value)) {
            entityValues.put(document.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                    .map(OrientDBConverter::getMap).collect(toList()));
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
    private static Map<String, Object> getMap(Object valueAsObject) {
        Map<String, Object> map = new java.util.HashMap<>();
        stream(Iterable.class.cast(valueAsObject).spliterator(), false)
                .forEach(d -> toDocument(map, Document.class.cast(d)));
        return map;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
        Map<String, Object> map = new java.util.HashMap<>();
        stream(Iterable.class.cast(valueAsObject).spliterator(), false)
                .forEach(d -> toDocument(map, Document.class.cast(d)));
        return map;
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isDocumentIterable(d));
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java

    private static Object convert(Object object) {
        if (Map.class.isInstance(object)) {
            Map map = Map.class.cast(object);
            return map.keySet().stream()
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
    private static Object convert(Object object) {
        if (Map.class.isInstance(object)) {
            Map map = Map.class.cast(object);
            return map.keySet().stream()
                    .map(k -> Document.of(k.toString(), map.get(k)))
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
                    .map(k -> Document.of(k.toString(), map.get(k)))
                    .collect(toList());
        } else if (List.class.isInstance(object)) {
            return StreamSupport.stream(List.class.cast(object).spliterator(), false)
                    .map(OrientDBConverter::convert).collect(toList());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
                    .collect(toList());
        } else if (List.class.isInstance(object)) {
            return StreamSupport.stream(List.class.cast(object).spliterator(), false)
                    .map(OrientDBConverter::convert).collect(toList());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
            Object value = ValueUtil.convert(d.value());
            if (value instanceof Document) {
                Document subDocument = Document.class.cast(value);
                map.put(d.name(), singletonMap(subDocument.name(), subDocument.get()));
            } else if (isSudDocument(value)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
                map.put(d.name(), subDocument);
            } else if (isSudDocumentList(value)) {
                map.put(d.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                        .map(EntityConverter::getMap).collect(toList()));
            } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
    private static Map<String, Object> getMap(Object value) {
        Map<String, Object> subDocument = new HashMap<>();
        StreamSupport.stream(Iterable.class.cast(value).spliterator(),
                false).forEach(feedJSON(subDocument));
        return subDocument;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/DefaultOrientDBDocumentManager.java`
#### Snippet
```java
            OResult next = command.next();
            Object count = next.getProperty("count(*)");
            return Number.class.cast(count).longValue();

        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
    private Document toDocument(String key, Map<String, Object> properties) {
        Object value = properties.get(key);
        if (Map.class.isInstance(value)) {
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
        Object value = properties.get(key);
        if (Map.class.isInstance(value)) {
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
        if (isADocumentIterable(value)) {
            List<List<Document>> documents = new ArrayList<>();
            for (Object object : Iterable.class.cast(value)) {
                Map<?, ?> map = Map.class.cast(object);
                documents.add(map.entrySet().stream().map(ENTRY_DOCUMENT).collect(toList()));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
            List<List<Document>> documents = new ArrayList<>();
            for (Object object : Iterable.class.cast(value)) {
                Map<?, ?> map = Map.class.cast(object);
                documents.add(map.entrySet().stream().map(ENTRY_DOCUMENT).collect(toList()));
            }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java

    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/DocumentQueryConverter.java`
#### Snippet
```java
        if (EntityConverter.ID_FIELD.equals(name)) {
            if (value instanceof Iterable) {
                final Iterable iterable = Iterable.class.cast(value);
                iterable.forEach(i -> ids.add(i.toString()));
            } else {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java
            return true;
        }
        if (RedisCollection.class.isInstance(obj)) {
            RedisCollection otherRedis = RedisCollection.class.cast(obj);
            return Objects.equals(otherRedis.keyWithNameSpace, keyWithNameSpace);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java
        }
        if (RedisCollection.class.isInstance(obj)) {
            RedisCollection otherRedis = RedisCollection.class.cast(obj);
            return Objects.equals(otherRedis.keyWithNameSpace, keyWithNameSpace);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/mapping/HazelcastRepositoryProxy.java`
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
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/mapping/HazelcastRepositoryProxy.java`
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
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/CouchbaseDocumentRepositoryProxy.java`
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
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/CouchbaseDocumentRepositoryProxy.java`
#### Snippet
```java
    CouchbaseDocumentRepositoryProxy(CouchbaseTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java
            return true;
        }
        if (RedisMap.class.isInstance(obj)) {
            RedisMap otherRedis = RedisMap.class.cast(obj);
            return Objects.equals(otherRedis.nameSpace, nameSpace);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java
        }
        if (RedisMap.class.isInstance(obj)) {
            RedisMap otherRedis = RedisMap.class.cast(obj);
            return Objects.equals(otherRedis.nameSpace, nameSpace);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java

    private static void convertDocument(JsonObject jsonObject, Document d, Object value) {
        Document document = Document.class.cast(value);
        jsonObject.put(d.name(), Collections.singletonMap(document.name(), document.get()));
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
        return d -> {
            Object value = ValueUtil.convert(d.value());
            if (Document.class.isInstance(value)) {
                convertDocument(jsonObject, d, value);
            } else if (Iterable.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
            if (Document.class.isInstance(value)) {
                convertDocument(jsonObject, d, value);
            } else if (Iterable.class.isInstance(value)) {
                convertIterable(jsonObject, d, value);
            } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
        JsonObject map = JsonObject.create();
        JsonArray array = JsonArray.create();
        Iterable.class.cast(value).forEach(element -> {
            if (Document.class.isInstance(element)) {
                Document subdocument = Document.class.cast(element);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
        JsonArray array = JsonArray.create();
        Iterable.class.cast(value).forEach(element -> {
            if (Document.class.isInstance(element)) {
                Document subdocument = Document.class.cast(element);
                map.put(subdocument.name(), subdocument.get());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
        Iterable.class.cast(value).forEach(element -> {
            if (Document.class.isInstance(element)) {
                Document subdocument = Document.class.cast(element);
                map.put(subdocument.name(), subdocument.get());
            } else if (isSudDocument(element)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
                JsonObject subJson = JsonObject.create();

                stream(Iterable.class.cast(element).spliterator(), false)
                        .forEach(getSubdocument(subJson));
                array.add(subJson);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
        for (String key : map.keySet()) {
            Object value = map.get(key);
            if (Map.class.isInstance(value)) {
                documents.add(Document.of(key, toDocuments(Map.class.cast(value))));
            } else if (isADocumentIterable(value)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
            Object value = map.get(key);
            if (Map.class.isInstance(value)) {
                documents.add(Document.of(key, toDocuments(Map.class.cast(value))));
            } else if (isADocumentIterable(value)) {
                List<List<Document>> subDocuments = new ArrayList<>();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
            } else if (isADocumentIterable(value)) {
                List<List<Document>> subDocuments = new ArrayList<>();
                stream(Iterable.class.cast(value).spliterator(), false)
                        .map(m -> toDocuments(Map.class.cast(m)))
                        .forEach(e -> subDocuments.add((List<Document>) e));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
                List<List<Document>> subDocuments = new ArrayList<>();
                stream(Iterable.class.cast(value).spliterator(), false)
                        .map(m -> toDocuments(Map.class.cast(m)))
                        .forEach(e -> subDocuments.add((List<Document>) e));
                documents.add(Document.of(key, subDocuments));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/ArangoDBDocumentRepositoryProxy.java`
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
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/ArangoDBDocumentRepositoryProxy.java`
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
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static org.eclipse.jnosql.communication.document.Document cast(Object document) {
        return org.eclipse.jnosql.communication.document.Document.class.cast(document);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        Object val = ValueUtil.convert(value);

        if (Document.class.isInstance(val)) {
            Document document = Document.class.cast(val);
            return singletonMap(document.name(), convert(document.value()));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

        if (Document.class.isInstance(val)) {
            Document document = Document.class.cast(val);
            return singletonMap(document.name(), convert(document.value()));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        }
        if (isSudDocumentList(val)) {
            return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                    .map(ArangoDBUtil::getMap).collect(toList());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
    private static Document toDocument(String key, Map<String, Object> properties) {
        Object value = properties.get(key);
        if (Map.class.isInstance(value)) {
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        Object value = properties.get(key);
        if (Map.class.isInstance(value)) {
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        if (isADocumentIterable(value)) {
            List<List<Document>> documents = new ArrayList<>();
            for (Object object : Iterable.class.cast(value)) {
                Map<?, ?> map = Map.class.cast(object);
                documents.add(map.entrySet().stream().map(ENTRY_DOCUMENT).collect(toList()));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
            List<List<Document>> documents = new ArrayList<>();
            for (Object object : Iterable.class.cast(value)) {
                Map<?, ?> map = Map.class.cast(object);
                documents.add(map.entrySet().stream().map(ENTRY_DOCUMENT).collect(toList()));
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static Object getMap(Object val) {
        return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .collect(toMap(KEY_DOCUMENT, VALUE_DOCUMENT));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
        }
        if (isSudDocumentList(val)) {
            return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                    .map(MongoDBUtils::getMap).collect(toList());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
    private static boolean isDocumentIterable(Object value) {
        return value instanceof Iterable &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java

    private static Object getMap(Object val) {
        return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .collect(toMap(KEY_DOCUMENT, VALUE_DOCUMENT));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
    private static Object convertValue(Object value) {
        if (value instanceof Binary) {
            return Binary.class.cast(value).getData();
        }
        return value;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java

    private static org.eclipse.jnosql.communication.document.Document cast(Object document) {
        return org.eclipse.jnosql.communication.document.Document.class.cast(document);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
    private static org.eclipse.jnosql.communication.document.Document getDocument(String key, Object value) {
        if (value instanceof Document) {
            return org.eclipse.jnosql.communication.document.Document.of(key, of(Document.class.cast(value)));
        } else if (isDocumentIterable(value)) {
            List<List<org.eclipse.jnosql.communication.document.Document>> documents = new ArrayList<>();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
        } else if (isDocumentIterable(value)) {
            List<List<org.eclipse.jnosql.communication.document.Document>> documents = new ArrayList<>();
            for (Object object : Iterable.class.cast(value)) {
                Map<?, ?> map = Map.class.cast(object);
                documents.add(map.entrySet().stream().map(e -> getDocument(e.getKey().toString(), e.getValue())).collect(toList()));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
            List<List<org.eclipse.jnosql.communication.document.Document>> documents = new ArrayList<>();
            for (Object object : Iterable.class.cast(value)) {
                Map<?, ?> map = Map.class.cast(object);
                documents.add(map.entrySet().stream().map(e -> getDocument(e.getKey().toString(), e.getValue())).collect(toList()));
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/MangoQueryConverter.java`
#### Snippet
```java
        }
        if (value instanceof Boolean) {
            condition.add(name, Boolean.class.cast(value));
            return;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/MangoQueryConverter.java`
#### Snippet
```java
        }
        if (value instanceof Number) {
            condition.add(name, Number.class.cast(value).doubleValue());
            return;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/MangoQueryConverter.java`
#### Snippet
```java
        }
        if (value instanceof JsonArray) {
            condition.add(name, JsonArray.class.cast(value));
            return;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/MangoQueryConverter.java`
#### Snippet
```java

        if (documentQuery instanceof CouchDBDocumentQuery) {
            Optional<String> bookmark = CouchDBDocumentQuery.class.cast(documentQuery).getBookmark();
            bookmark.ifPresent(b -> bookmark(b, select));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/MangoQueryConverter.java`
#### Snippet
```java
    private void appendNot(JsonObjectBuilder selector, Object value) {
        JsonObjectBuilder not = Json.createObjectBuilder();
        appendCondition(DocumentCondition.class.cast(value), not);
        selector.add("$not", not.build());
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/MangoQueryConverter.java`
#### Snippet
```java

    private void appendCombination(JsonObjectBuilder selector, Object value, String combination) {
        List<DocumentCondition> conditions = List.class.cast(value);
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (DocumentCondition documentCondition : conditions) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
        Map<String, Object> json = execute(request, JSON, HttpStatus.SC_OK);
        if (query instanceof CouchDBDocumentQuery) {
            CouchDBDocumentQuery.class.cast(query).setBookmark(json);
        }
        return (List<Map<String, Object>>) json.getOrDefault(CouchDBConstant.DOCS_RESPONSE, emptyList());
```

## RuleId[id=MissingSerialAnnotation]
### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/IrregularKeyValue.java`
#### Snippet
```java
public class IrregularKeyValue extends RuntimeException {

    private static final long serialVersionUID = 6161854579438859925L;

    IrregularKeyValue(String message) {
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/DefaultElasticsearchDocumentManager.java`
#### Snippet
```java
        DocumentQuery select = new ElasticsearchDocumentQuery(query);

        List<DocumentEntity> entities = select(select).collect(Collectors.toList());

        if (entities.isEmpty()) {
```

### SimplifyStreamApiCallChains
Can be replaced with 'collection.toArray()'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchDocumentConfiguration.java`
#### Snippet
```java

        RestClientBuilder builder = RestClient.builder(httpHosts.toArray(new HttpHost[0]));
        builder.setDefaultHeaders(headers.stream().toArray(Header[]::new));

        final Optional<String> username = settings
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `jnosql-infinispan/src/main/java/org/eclipse/jnosql/databases/infinispan/communication/InfinispanKeyValueConfiguration.java`
#### Snippet
```java

        List<String> servers = settings.prefixSupplier(Arrays.asList(InfinispanConfigurations.HOST, Configurations.HOST))
                .stream().map(Object::toString).collect(Collectors.toList());

        Optional<String> config = settings.get(InfinispanConfigurations.CONFIG)
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrUtils.java`
#### Snippet
```java
        SolrInputDocument document = new SolrInputDocument();
        document.addField(ENTITY, entity.name());
        entity.documents().stream().forEach(d -> document.addField(d.name(), convert(d.value())));
        return document;
    }
```

### SimplifyStreamApiCallChains
'collect(toUnmodifiableList())' can be replaced with 'toList()'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConfiguration.java`
#### Snippet
```java
                .stream()
                .filter(k -> k.startsWith("jnosql."))
                .collect(Collectors.toUnmodifiableList());

        for (String key : keys) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java
        final UserDefinedType type = udtValue.getType();
        List<Column> columns = new ArrayList<>();
        List<String> names = type.getFieldNames().stream().map(CqlIdentifier::asInternal).collect(toList());
        for (CqlIdentifier fieldName : type.getFieldNames()) {
            final int index = names.indexOf(fieldName.asInternal());
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
        InsertInto insert = QueryBuilder.insertInto(keyspace, entity.name());
        entity.columns().stream()
                .forEach(c -> {
                    if (UDT.class.isInstance(c)) {
                        insertUDT(UDT.class.cast(c), keyspace, entity.name(), session, values);
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
        UdtValue udtValue = userType.newValue();
        final List<String> udtNames = userType.getFieldNames().stream().map(CqlIdentifier::asInternal)
                .collect(Collectors.toList());
        for (Object object : elements) {
            if (Column.class.isInstance(object)) {
```

### SimplifyStreamApiCallChains
Can be replaced with 'List.class.cast(...).stream()' call
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
                    .collect(toList());
        } else if (List.class.isInstance(object)) {
            return StreamSupport.stream(List.class.cast(object).spliterator(), false)
                    .map(OrientDBConverter::convert).collect(toList());
        }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
        JsonObject jsonObject = JsonObject.create();
        entity.documents().stream()
                .forEach(toJsonObject(jsonObject));
        return jsonObject;
    }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/HazelcastKeyValueConfiguration.java`
#### Snippet
```java
                HazelcastConfigurations.HOST, Configurations.HOST))
                .stream().map(Object::toString)
                .collect(Collectors.toList());
        String instance = settings.get(HazelcastConfigurations.INSTANCE).map(Object::toString)
                .orElse(DEFAULT_INSTANCE);
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLBuilder.java`
#### Snippet
```java
    private String select() {
        String documents = query.documents().stream()
                .collect(Collectors.joining(", "));
        if (documents.isBlank()) {
            return "*";
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnManagerFactory.java`
#### Snippet
```java
    private void createTable(Admin admin, TableName tableName) throws IOException {
        final TableDescriptorBuilder builder = TableDescriptorBuilder.newBuilder(tableName);
        families.stream().forEach(s -> builder.setColumnFamily(ColumnFamilyDescriptorBuilder.newBuilder(s.getBytes())
                .build()));
        final TableDescriptor descriptor = builder.build();
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnManagerFactory.java`
#### Snippet
```java
        ColumnFamilyDescriptor[] columnFamilies = tableDescriptor.getColumnFamilies();
        final TableDescriptorBuilder builder = TableDescriptorBuilder.newBuilder(tableName);
        List<String> familiesExist = Arrays.stream(columnFamilies).map(ColumnFamilyDescriptor::getName).map(String::new).collect(Collectors.toList());
        if (familiesExist.size() != families.size()) {
            families.stream().filter(s -> !familiesExist.contains(s))
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
                .getCollections().stream()
                .map(CollectionEntity::getName)
                .collect(toList());
        if (!collections.contains(namespace)) {
            arangoDB.db(DbName.of(bucketName)).createCollection(namespace);
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                result.getEntity().writeTo(stream);
                String response = new String(stream.toByteArray(), UTF_8);
                throw new CouchDBHttpClientException("There is an error when load the database status: " +
                        result.getStatusLine().getStatusCode()
```

### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            entity.writeTo(stream);
            return JSONB.fromJson(new String(stream.toByteArray(), UTF_8), type);
        } catch (CouchDBHttpClientException ex) {
            throw ex;
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains array `char[]`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoAuthentication.java`
#### Snippet
```java
                .map(Object::toString);

        Optional<char[]> password = settings.getSupplier(Arrays.asList(MongoDBDocumentConfigurations.PASSWORD,
                Configurations.PASSWORD))
                .map(Object::toString).map(String::toCharArray);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'delete' is still used
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/SortedSet.java`
#### Snippet
```java
     */
    @Deprecated
    void delete();

    /**
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java
        requireNonNull(map, "map is required");

        for (K key : map.keySet()) {
            V value = map.get(key);
            if (value != null) {
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
    private static List<Document> toDocuments(Map<String, Object> map) {
        List<Document> documents = new ArrayList<>();
        for (String key : map.keySet()) {
            Object value = map.get(key);
            if (Map.class.isInstance(value)) {
```

## RuleId[id=PatternVariableCanBeUsed]
### PatternVariableCanBeUsed
Variable 'udt' can be replaced with pattern variable
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/DefaultUDT.java`
#### Snippet
```java
            return false;
        }
        UDT udt = (UDT) o;
        return Objects.equals(name, udt.name()) &&
                Objects.equals(userType, udt.getUserType()) &&
```

### PatternVariableCanBeUsed
Variable 'udt' can be replaced with pattern variable
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/IterableUDT.java`
#### Snippet
```java
            return false;
        }
        UDT udt = (UDT) o;
        return Objects.equals(name, udt.name()) &&
                Objects.equals(userType, udt.getUserType()) &&
```

### PatternVariableCanBeUsed
Variable 'that' can be replaced with pattern variable
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/DefaultRanking.java`
#### Snippet
```java
            return false;
        }
        Ranking that = (Ranking) o;
        return Objects.equals(point, that.getPoints()) &&
                Objects.equals(member, that.getMember());
```

### PatternVariableCanBeUsed
Variable 'that' can be replaced with pattern variable
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/DefaultSortedSet.java`
#### Snippet
```java
            return false;
        }
        DefaultSortedSet that = (DefaultSortedSet) o;
        return Objects.equals(key, that.key);
    }
```

### PatternVariableCanBeUsed
Variable 'that' can be replaced with pattern variable
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/DefaultCounter.java`
#### Snippet
```java
            return false;
        }
        DefaultCounter that = (DefaultCounter) o;
        return Objects.equals(key, that.key);
    }
```

### PatternVariableCanBeUsed
Variable 'subDocument' can be replaced with pattern variable
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
        Object val = ValueUtil.convert(value);
        if (val instanceof org.eclipse.jnosql.communication.document.Document) {
            org.eclipse.jnosql.communication.document.Document subDocument = (org.eclipse.jnosql.communication.document.Document) val;
            Object converted = convert(subDocument.value());
            return new Document(subDocument.name(), converted);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchAddress.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ElasticsearchAddress{");
        sb.append("host='").append(host.getHostName()).append('\'');
        sb.append(", port=").append(host.getPort());
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/DefaultUDT.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UDT{");
        sb.append("name='").append(name).append('\'');
        sb.append(", userType='").append(userType).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraColumnManagerFactory.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CassandraColumnManagerFactory{");
        sb.append("cluster=").append(sessionBuilder);
        sb.append(", executor=").append(executor);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/IterableUDT.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UDT{");
        sb.append("name='").append(name).append('\'');
        sb.append(", userType='").append(userType).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraQuery.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CouchDBDocumentQuery{");
        sb.append("query=").append(query);
        sb.append(", pagingState='").append(pagingState).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBDocumentManagerFactory.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RavenDBDocumentManagerFactory{");
        sb.append("hosts=").append(Arrays.toString(hosts));
        sb.append('}');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/DefaultRanking.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DefaultRanking{");
        sb.append("point=").append(point);
        sb.append(", member='").append(member).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/DefaultRedisBucketManagerFactory.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RedisBucketManagerFactory{");
        sb.append("jedisPool=").append(jedisPool);
        sb.append('}');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/DefaultSortedSet.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SortedSet{");
        sb.append("key='").append(key).append('\'');
        sb.append('}');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/DefaultCounter.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Counter{");
        sb.append("key='").append(key).append('\'');
        sb.append('}');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RedisMap{");
        sb.append("keyClass=").append(keyClass);
        sb.append(", valueClass=").append(valueClass);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/EntityUnit.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EntityUnit{");
        sb.append("rowKey='").append(rowKey).append('\'');
        sb.append(", columnFamily='").append(columnFamily).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnConfiguration.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HBaseColumnConfiguration{");
        sb.append("configuration=").append(configuration);
        sb.append('}');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/DeleteElement.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeleteElement{");
        sb.append("id='").append(id).append('\'');
        sb.append(", rev='").append(rev).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBDocumentQuery.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CouchDBDocumentQuery{");
        sb.append("query=").append(query);
        sb.append(", bookmark='").append(bookmark).append('\'');
```

## RuleId[id=EnhancedSwitchMigration]
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/DocumentQueryConversor.java`
#### Snippet
```java
        Object value = ValueUtil.convert(document.value());

        switch (condition.condition()) {
            case EQUALS:
            case LIKE:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/QueryConverter.java`
#### Snippet
```java
        }

        switch (condition.condition()) {
            case EQUALS:
                return (Query.Builder) new Query.Builder()
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/Relations.java`
#### Snippet
```java
        Condition condition = columnCondition.condition();

        switch (condition) {
            case EQUALS:
                relations.add(Relation.column(QueryUtils.getName(column)).isEqualTo(getTerm(column)));
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java

        final DataType type = definition.getType();
        switch (type.getProtocolCode()) {
            case ProtocolConstants.DataType.UDT:
                return Column.class.cast(result);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java

        Document document = condition.document();
        switch (condition.condition()) {
            case IN:
                appendCondition(query, params, document, IN, ids);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/DocumentQueryConverter.java`
#### Snippet
```java
        }

        switch (condition.condition()) {
            case EQUALS:
                ravenQuery.whereEquals(name, value);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLBuilder.java`
#### Snippet
```java
    private void condition(DocumentCondition condition, StringBuilder n1ql, JsonObject params, List<String> ids) {
        Document document = condition.document();
        switch (condition.condition()) {
            case EQUALS:
                if (document.name().equals(EntityConverter.ID_FIELD)) {
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoAuthentication.java`
#### Snippet
```java
        }

        switch (mechanism.get()) {
            case PLAIN:
                return Optional.of(MongoCredential.createPlainCredential(user.orElseThrow(missingExceptionUser()),
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/DocumentQueryConversor.java`
#### Snippet
```java
        Document document = condition.document();
        Object value = ValueUtil.convert(document.value());
        switch (condition.condition()) {
            case EQUALS:
                return Filters.eq(document.name(), value);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/MangoQueryConverter.java`
#### Snippet
```java
        Object value = ValueUtil.convert(document.value());

        switch (condition.condition()) {
            case EQUALS:
                appendCondition(selector, name, value);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java

        Document document = condition.document();
        switch (condition.condition()) {
            case IN:
                appendCondition(aql, params, entity, document, IN);
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBHttpClient.java`
#### Snippet
```java
            httpExecute.createDatabase(database);
        }
        return;
    }

```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
        return entity.find(CouchDBConstant.ID)
                .orElseThrow(() -> new CouchDBHttpClientException(
                        String.format("To update the entity %s the id field is required", entity.toString())))
                .get(String.class);
    }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `RedisUtils` has no concrete subclass
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisUtils.java`
#### Snippet
```java
package org.eclipse.jnosql.databases.redis.communication;

abstract class RedisUtils {


```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ElasticsearchDocumentManager`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/mapping/DefaultElasticsearchTemplate.java`
#### Snippet
```java

    @Inject
    DefaultElasticsearchTemplate(Instance<ElasticsearchDocumentManager> manager,
                                 DocumentEntityConverter converter, DocumentWorkflow flow,
                                 DocumentEventPersistManager persistManager,
```

### BoundedWildcard
Can generalize to `? extends Map`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
    }

    static Stream<DocumentEntity> getDocumentEntityStream(ElasticsearchClient client, SearchResponse<Map> responses) {
        return responses.hits().hits().stream()
                .map(hits -> ElasticsearchEntry.of(hits.id(), hits.source()))
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java


    private static Consumer<Document> feedJSON(Map<String, Object> jsonObject) {
        return d -> {
            Object value = ValueUtil.convert(d.value());
```

### BoundedWildcard
Can generalize to `? extends Map`
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoDBUtils.java`
#### Snippet
```java
    }

    private static Map<String, List<WriteRequest>> createMapWriteRequest(Collection<Map<String, AttributeValue>> map, String tableName) {

        PutRequest.Builder putRequestBuilder = PutRequest.builder();
```

### BoundedWildcard
Can generalize to `? extends KeyValueEntity`
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoDBUtils.java`
#### Snippet
```java
    }

    public static <K> Collection<Map<String, AttributeValue>> createAttributeValues(Iterable<KeyValueEntity> entities) {

        return StreamSupport.stream(entities.spliterator(), false)
```

### BoundedWildcard
Can generalize to `? extends SolrDocumentManager`
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/DefaultSolrTemplate.java`
#### Snippet
```java

    @Inject
    DefaultSolrTemplate(Instance<SolrDocumentManager> manager,
                        DocumentEntityConverter converter, DocumentWorkflow flow,
                        DocumentEventPersistManager persistManager,
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/QueryConverter.java`
#### Snippet
```java


    private static Query.Builder getCondition(DocumentCondition condition, List<String> ids) {
        Document document = condition.document();

```

### BoundedWildcard
Can generalize to `? extends Column`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/UDTBuilder.java`
#### Snippet
```java

    @Override
    public UDTBuilder addUDT(Iterable<Column> udt) throws NullPointerException {
        Objects.requireNonNull(udt, "udt is required");
        StreamSupport.stream(udt.spliterator(), false).forEach(this.columns::add);
```

### BoundedWildcard
Can generalize to `? super Relation`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/Relations.java`
#### Snippet
```java
    }

    private static void load(ColumnCondition columnCondition, List<Relation> relations) {

        Column column = columnCondition.column();
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
    }

    private static void insertSingleField(Column column, Map<String, Term> values) {
        Object value = column.get();
        try {
```

### BoundedWildcard
Can generalize to `? super Term`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
    }

    private static void insertSingleField(Column column, Map<String, Term> values) {
        Object value = column.get();
        try {
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java

    private static void insertUDT(UDT udt, String keyspace, String columnFamily, CqlSession session,
                                  Map<String, Term> values) {

        final Optional<KeyspaceMetadata> keyspaceMetadata = session.getMetadata().getKeyspace(keyspace);
```

### BoundedWildcard
Can generalize to `? super Term`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java

    private static void insertUDT(UDT udt, String keyspace, String columnFamily, CqlSession session,
                                  Map<String, Term> values) {

        final Optional<KeyspaceMetadata> keyspaceMetadata = session.getMetadata().getKeyspace(keyspace);
```

### BoundedWildcard
Can generalize to `? extends CassandraColumnManager`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/DefaultCassandraTemplate.java`
#### Snippet
```java

    @Inject
    DefaultCassandraTemplate(Instance<CassandraColumnManager> manager,
                             CassandraColumnEntityConverter converter,
                             CassandraColumnWorkflow flow,
```

### BoundedWildcard
Can generalize to `? super DocumentEntity`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/LiveQueryListener.java`
#### Snippet
```java
    private final ODatabaseSession tx;

    LiveQueryListener(OrientDBLiveCallback<DocumentEntity> callbacks, ODatabaseSession tx) {
        this.callbacks = callbacks;
        this.tx = tx;
```

### BoundedWildcard
Can generalize to `? extends OrientDBDocumentManager`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/DefaultOrientDBTemplate.java`
#### Snippet
```java

    @Inject
    DefaultOrientDBTemplate(Instance<OrientDBDocumentManager> manager,
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
```

### BoundedWildcard
Can generalize to `? extends ColumnEntity`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/DefaultCassandraColumnManager.java`
#### Snippet
```java

    @Override
    public Iterable<ColumnEntity> save(Iterable<ColumnEntity> entities, ConsistencyLevel level) {
        requireNonNull(entities, "entities is required");
        requireNonNull(level, "level is required");
```

### BoundedWildcard
Can generalize to `? extends ColumnEntity`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/DefaultCassandraColumnManager.java`
#### Snippet
```java

    @Override
    public Iterable<ColumnEntity> save(Iterable<ColumnEntity> entities, Duration ttl, ConsistencyLevel level) {
        requireNonNull(entities, "entities is required");
        requireNonNull(level, "level is required");
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
    }

    private static void toDocument(Map<String, Object> entityValues, Document document) {
        Object value = ValueUtil.convert(document.value());
        if (Document.class.isInstance(value)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java


    private static Consumer<Document> feedJSON(Map<String, Object> map) {
        return d -> {
            Object value = ValueUtil.convert(d.value());
```

### BoundedWildcard
Can generalize to `? super ORecordId`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java

    private static void appendCondition(StringBuilder query, List<Object> params,
                                        Document document, String condition, List<ORecordId> ids) {

        if(OrientDBConverter.RID_FIELD.equals(document.name())) {
```

### BoundedWildcard
Can generalize to `? super Stream`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLFactory.java`
#### Snippet
```java
    }

    static QueryResultAsync toAsync(DocumentQuery documentQuery, Consumer<Stream<ODocument>> callBack) {
        QueryOSQLConverter.Query query = QueryOSQLConverter.select(documentQuery);

```

### BoundedWildcard
Can generalize to `? super List`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLFactory.java`
#### Snippet
```java
    }

    static QueryResultAsync toAsync(String query, Consumer<List<ODocument>> callBack, Object... params) {
        return new QueryResultAsync(new OSQLAsynchQuery<>(query, new OCommandResultListener() {
            private List<ODocument> documents = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/DocumentQueryConverter.java`
#### Snippet
```java
    }

    private static void feedQuery(IDocumentQuery<HashMap> ravenQuery, DocumentCondition condition, List<String> ids) {
        Document document = condition.document();
        Object value = document.get();
```

### BoundedWildcard
Can generalize to `? extends V`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java


    RedisMap(Jedis jedis, Class<K> keyValue, Class<V> valueClass, String keyWithNameSpace) {
        this.keyClass = keyValue;
        this.valueClass = valueClass;
```

### BoundedWildcard
Can generalize to `? extends CouchbaseDocumentManager`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/DefaultCouchbaseTemplate.java`
#### Snippet
```java

    @Inject
    DefaultCouchbaseTemplate(Instance<CouchbaseDocumentManager> manager,
                             DocumentEntityConverter converter, DocumentWorkflow flow,
                             DocumentEventPersistManager persistManager,
```

### BoundedWildcard
Can generalize to `? extends JsonObject`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java


    static Stream<DocumentEntity> convert(List<JsonObject> result, String database) {
        return
                result.stream()
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnManager.java`
#### Snippet
```java


    private void convert(ColumnCondition columnCondition, List<String> values) {
        Condition condition = columnCondition.condition();

```

### BoundedWildcard
Can generalize to `? extends ArangoDBDocumentManager`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/DefaultArangoDBTemplate.java`
#### Snippet
```java

    @Inject
    DefaultArangoDBTemplate(Instance<ArangoDBDocumentManager> manager,
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBDocumentQuery.java`
#### Snippet
```java
    }

    void setBookmark(Map<String, Object> json) {
        json.computeIfPresent(CouchDBConstant.BOOKMARK, (k, v) -> this.bookmark = v.toString());
    }
```

### BoundedWildcard
Can generalize to `? extends Bson`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBDocumentManager.java`
#### Snippet
```java
     * @throws NullPointerException when filter or collectionName is null
     */
    public Stream<Map<String, BsonValue>> aggregate(String collectionName, List<Bson> pipeline) {
        Objects.requireNonNull(pipeline, "filter is required");
        Objects.requireNonNull(collectionName, "collectionName is required");
```

### BoundedWildcard
Can generalize to `? extends MongoDBDocumentManager`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/mapping/DefaultMongoDBTemplate.java`
#### Snippet
```java
    }

    DefaultMongoDBTemplate(Instance<MongoDBDocumentManager> manager,
            DocumentEntityConverter converter,
            DocumentWorkflow workflow,
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/IntegrationTest.java`
#### Snippet
```java
     * The {@link System#getProperty(String)} key to find
     */
    public final static String NAMED = "jnosql.test.integration";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/IntegrationTest.java`
#### Snippet
```java
     * The match value on the integration test
     */
    public final static String MATCHES = "true";

    private IntegrationTest() {
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoDBBuilderSync.java`
#### Snippet
```java
    public DynamoDbClient build() {

        boolean accessKey = awsAccessKey != null && !awsAccessKey.equals("");
        boolean secretAccess = awsSecretAccess != null && !awsSecretAccess.equals("");

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoDBBuilderSync.java`
#### Snippet
```java

        boolean accessKey = awsAccessKey != null && !awsAccessKey.equals("");
        boolean secretAccess = awsSecretAccess != null && !awsSecretAccess.equals("");


```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoDBBuilderASync.java`
#### Snippet
```java
    public DynamoDbAsyncClient build() {

        boolean accessKey = awsAccessKey != null && !awsAccessKey.equals("");
        boolean secretAccess = awsSecretAccess != null && !awsSecretAccess.equals("");

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoDBBuilderASync.java`
#### Snippet
```java

        boolean accessKey = awsAccessKey != null && !awsAccessKey.equals("");
        boolean secretAccess = awsSecretAccess != null && !awsSecretAccess.equals("");

        if (accessKey && secretAccess) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `SettableByName.set()` is ignored
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
                TypeCodec<Object> objectTypeCodec = CodecRegistry.DEFAULT.codecFor(fieldType);
                if (fieldType instanceof SetType) {
                    udtValue.set(getName(column), new HashSet<Object>((Collection<?>) convert), objectTypeCodec);
                } else {
                    udtValue.set(getName(column), convert, objectTypeCodec);
```

### IgnoreResultOfCall
Result of `SettableByName.set()` is ignored
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
                    udtValue.set(getName(column), new HashSet<Object>((Collection<?>) convert), objectTypeCodec);
                } else {
                    udtValue.set(getName(column), convert, objectTypeCodec);
                }

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'INSTANCE'
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/JsonbSupplierServiceLoader.java`
#### Snippet
```java
    private static final List<JsonbSupplier> LOADERS;

    static final Optional<JsonbSupplier> INSTANCE;

    static {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'column'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java
    }

    private <T> void setUDTField(T instance, Optional<Column> column, FieldMapping field) {
        if (column.isPresent() && org.eclipse.jnosql.databases.cassandra.communication.UDT.class.isInstance(column.get())) {
            org.eclipse.jnosql.databases.cassandra.communication.UDT udt =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'name'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraProperties.java`
#### Snippet
```java
    private final List<String> nodes = new ArrayList<>();

    private Optional<String> name;

    private Optional<String> user;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'password'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraProperties.java`
#### Snippet
```java
    private Optional<String> user;

    private Optional<String> password;

    private int port;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'user'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraProperties.java`
#### Snippet
```java
    private Optional<String> name;

    private Optional<String> user;

    private Optional<String> password;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'query'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/DefaultArangoDBDocumentManager.java`
#### Snippet
```java
    }

    private boolean checkCondition(Optional<DocumentCondition> query) {
        return !query.isPresent();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'documentCondition'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java

    private static AQLQueryResult convert(String documentCollection,
                                          Optional<DocumentCondition> documentCondition,
                                          List<Sort> sorts,
                                          long firstResult,
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/LiveQueryListener.java`
#### Snippet
```java
    @Override
    public void onError(ODatabaseDocument database, OException exception) {
        System.out.print("error");
    }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `iterator()` is identical to its super method
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisList.java`
#### Snippet
```java

    @Override
    public Iterator<T> iterator() {
        return toArrayList().iterator();
    }
```

### RedundantMethodOverride
Method `size()` is identical to its super method
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisList.java`
#### Snippet
```java

    @Override
    public int size() {
        return (int) jedis.llen(keyWithNameSpace);
    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseConfiguration.java`
#### Snippet
```java
        settings.get(CouchbaseConfigurations.COLLECTIONS)
                .map(Object::toString).stream()
                .flatMap(s -> Stream.of(s.split(",\\s*")))
                .forEach(collections::add);
        return collections;
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Optional chain can be simplified
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBDocumentManager.java`
#### Snippet
```java
        final Stream<HashMap> queryStream = queryResult.getRavenQuery()
                .map(IEnumerableQuery::toList)
                .map(List::stream).orElseGet(Stream::empty);
        return Stream.concat(idQueryStream, queryStream);
    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoAuthentication.java`
#### Snippet
```java
                .map(AuthenticationMechanism::fromMechanismName);

        if (!user.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoAuthentication.java`
#### Snippet
```java
        }

        if (!mechanism.isPresent()) {
            return Optional.of(MongoCredential.createCredential(user.orElseThrow(missingExceptionUser()),
                    source.orElseThrow(missingExceptionSource()), password.orElseThrow(missingExceptionPassword())));
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/DefaultArangoDBDocumentManager.java`
#### Snippet
```java

    private boolean checkCondition(Optional<DocumentCondition> query) {
        return !query.isPresent();
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.infinispan.configuration.cache` is unnecessary, and can be replaced with an import
in `jnosql-infinispan/src/main/java/org/eclipse/jnosql/databases/infinispan/communication/InfinispanKeyValueConfiguration.java`
#### Snippet
```java
     * @throws NullPointerException when config is null
     */
    public InfinispanBucketManagerFactory get(org.infinispan.configuration.cache.Configuration config)throws NullPointerException {
        requireNonNull(config, "config is required");

```

### UnnecessaryFullyQualifiedName
Qualifier `org.infinispan.client.hotrod.configuration` is unnecessary, and can be replaced with an import
in `jnosql-infinispan/src/main/java/org/eclipse/jnosql/databases/infinispan/communication/InfinispanKeyValueConfiguration.java`
#### Snippet
```java
                .map(Object::toString);
        if (!servers.isEmpty()) {
            org.infinispan.client.hotrod.configuration.ConfigurationBuilder builder = new org.infinispan.client.hotrod.configuration.ConfigurationBuilder();
            for(String server : servers) {
                builder.addServer().host(server);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.infinispan.client.hotrod.configuration` is unnecessary, and can be replaced with an import
in `jnosql-infinispan/src/main/java/org/eclipse/jnosql/databases/infinispan/communication/InfinispanKeyValueConfiguration.java`
#### Snippet
```java
                .map(Object::toString);
        if (!servers.isEmpty()) {
            org.infinispan.client.hotrod.configuration.ConfigurationBuilder builder = new org.infinispan.client.hotrod.configuration.ConfigurationBuilder();
            for(String server : servers) {
                builder.addServer().host(server);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrUtils.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
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
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
#### Snippet
```java
        }
        if (java.time.LocalDate.class.isInstance(attribute)) {
            return Date.from(java.time.LocalDate.class.cast(attribute).atStartOfDay(ZONE_ID).toInstant());
        }
        if (LocalDateTime.class.isInstance(attribute)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.datastax.oss.driver.api.core.cql` is unnecessary, and can be replaced with an import
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraPreparedStatement.java`
#### Snippet
```java
public class CassandraPreparedStatement {

    private final com.datastax.oss.driver.api.core.cql.PreparedStatement prepare;

    private final CqlSession session;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.datastax.oss.driver.api.core.cql` is unnecessary, and can be replaced with an import
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraPreparedStatement.java`
#### Snippet
```java
    private BoundStatement boundStatement;

    CassandraPreparedStatement(com.datastax.oss.driver.api.core.cql.PreparedStatement prepare, CqlSession session) {
        this.prepare = prepare;
        this.session = session;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java

    private static Map<String, Object> getMap(Object valueAsObject) {
        Map<String, Object> map = new java.util.HashMap<>();
        stream(Iterable.class.cast(valueAsObject).spliterator(), false)
                .forEach(d -> toDocument(map, Document.class.cast(d)));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
    static Query select(DocumentQuery documentQuery) {
        StringBuilder query = new StringBuilder();
        List<Object> params = new java.util.ArrayList<>();
        List<ORecordId> ids = new ArrayList<>();
        query.append("SELECT FROM ");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseConfiguration.java`
#### Snippet
```java
     */
    public void addCollection(String collection) {
        java.util.Objects.requireNonNull(collection, "collection is required");
        this.collections.add(collection);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.couchbase.client.java.datastructures` is unnecessary, and can be replaced with an import
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/DefaultCouchbaseBucketManagerFactory.java`
#### Snippet
```java

        return (Map<K, V>)
                new com.couchbase.client.java.datastructures.
                        CouchbaseMap<>(key, collection, valueType,
                        MapOptions.mapOptions());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.couchbase.client.java.datastructures` is unnecessary, and can be replaced with an import
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/DefaultCouchbaseBucketManagerFactory.java`
#### Snippet
```java
        Collection collection = bucket.collection(bucketName);
        return (Map<K, V>)
                new com.couchbase.client.java.datastructures.CouchbaseMap<>(bucketName + ":map",
                        collection, valueValue,
                        MapOptions.mapOptions());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.couchbase.client.java.datastructures` is unnecessary, and can be replaced with an import
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/DefaultCouchbaseBucketManagerFactory.java`
#### Snippet
```java
        Collection collection = bucket.collection(bucketName);

        return new com.couchbase.client.java.datastructures.CouchbaseQueue<>(key + QUEUE, collection, type,
                QueueOptions.queueOptions());

```

### UnnecessaryFullyQualifiedName
Qualifier `com.couchbase.client.java.datastructures` is unnecessary, and can be replaced with an import
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/DefaultCouchbaseBucketManagerFactory.java`
#### Snippet
```java
        Collection collection = bucket.collection(bucketName);

        return new com.couchbase.client.java.datastructures.CouchbaseQueue<>(bucketName + QUEUE, collection, type,
                QueueOptions.queueOptions());

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
    }

    private static org.eclipse.jnosql.communication.document.Document cast(Object document) {
        return org.eclipse.jnosql.communication.document.Document.class.cast(document);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static org.eclipse.jnosql.communication.document.Document cast(Object document) {
        return org.eclipse.jnosql.communication.document.Document.class.cast(document);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBDocumentQuery.java`
#### Snippet
```java

    void setBookmark(Map<String, Object> json) {
        json.computeIfPresent(CouchDBConstant.BOOKMARK, (k, v) -> this.bookmark = v.toString());
    }

```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnManager.java`
#### Snippet
```java
            table.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `nodes` are updated, but never queried
in `jnosql-riak/src/main/java/org/eclipse/jnosql/databases/riak/communication/RiakKeyValueConfiguration.java`
#### Snippet
```java
            .withRemoteAddress("127.0.0.1").build();

    private final List<RiakNode> nodes = new ArrayList<>();


```

### MismatchedCollectionQueryUpdate
Contents of collection `families` are updated, but never queried
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnConfiguration.java`
#### Snippet
```java
    private final Configuration configuration;

    private final List<String> families = new ArrayList<>();

    /**
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `pagingState` is accessed in both synchronized and unsynchronized contexts
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraQuery.java`
#### Snippet
```java
     * It can be saved and reused later on the same statement.
     */
    private String pagingState;


```

## RuleId[id=IdempotentLoopBody]
### IdempotentLoopBody
Idempotent loop body
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
        String paramName = parameter;
        int counter = 1;
        while (params.containsKey(paramName)) {
            paramName = parameter + '_' + counter;
        }
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ConfigurationReader.java`
#### Snippet
```java
                properties.load(stream);
                return properties.keySet().stream().collect(Collectors
                        .toMap(Object::toString, s -> properties.get(s).toString()));
            } else {
                LOGGER.info("The file " + resource + " as resource, returning an empty configuration");
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBHttpConfigurationBuilder.java`
#### Snippet
```java
    private int connectionTimeout = 1000;
    private int socketTimeout = 10000;
    private boolean enableSSL = false;

    private String username;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBHttpConfigurationBuilder.java`
#### Snippet
```java
    private String password;

    private boolean compression = false;
    private int maxObjectSizeBytes = 8192;
    private int maxCacheEntries = 1000;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `counter`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
                        query.append(AND);
                    }
                    definesCondition(dc, query, params, ++counter, ids);
                }
                return;
```

### AssignmentToMethodParameter
Assignment to method parameter `counter`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
                        query.append(OR);
                    }
                    definesCondition(dc, query, params, ++counter, ids);
                }
                return;
```

### AssignmentToMethodParameter
Assignment to method parameter `counter`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
                DocumentCondition documentCondition = document.get(DocumentCondition.class);
                query.append("NOT (");
                definesCondition(documentCondition, query, params, ++counter, ids);
                query.append(")");
                return;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisList.java`
#### Snippet
```java
        Objects.requireNonNull(elements);
        for (T element : elements) {
            add(index++, element);
        }
        return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `counter`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                        aql.append(AND);
                    }
                    definesCondition(dc, aql, params, entity, ++counter);
                }
                return;
```

### AssignmentToMethodParameter
Assignment to method parameter `counter`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                        aql.append(OR);
                    }
                    definesCondition(dc, aql, params, entity, ++counter);
                }
                return;
```

### AssignmentToMethodParameter
Assignment to method parameter `counter`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                DocumentCondition documentCondition = document.get(DocumentCondition.class);
                aql.append(NOT);
                definesCondition(documentCondition, aql, params, entity, ++counter);
                return;
            default:
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-19-09-39-38.824.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/DefaultOrientDBDocumentManager.java`
#### Snippet
```java
        requireNonNull(documentCollection, "query is required");
        try (ODatabaseSession tx = pool.acquire()) {
            String query = "select count(*) from ".concat(documentCollection);
            OResultSet command = tx.command(query);
            OResult next = command.next();
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLBuilder.java`
#### Snippet
```java
        String name = '\'' + document.name() + '\'';
        Object value = document.get();
        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(condition).append(param);
        params.put(param, value);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLBuilder.java`
#### Snippet
```java
        String name = '\'' + document.name() + '\'';
        Object value = document.get();
        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(condition).append(param);
        params.put(param, value);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLBuilder.java`
#### Snippet
```java
        String name = '\'' + document.name() + '\'';
        Object value = document.get();
        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(condition).append(param);
        params.put(param, value);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLBuilder.java`
#### Snippet
```java
        ((Iterable<?>) document.get()).forEach(values::add);

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLBuilder.java`
#### Snippet
```java
        ((Iterable<?>) document.get()).forEach(values::add);

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLBuilder.java`
#### Snippet
```java
        ((Iterable<?>) document.get()).forEach(values::add);

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLBuilder.java`
#### Snippet
```java

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
        params.put(param, values.get(0));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLBuilder.java`
#### Snippet
```java

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
        params.put(param, values.get(0));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLBuilder.java`
#### Snippet
```java

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
        params.put(param, values.get(0));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    private Map<String, Object> findById(String database, String id) {
        HttpGet request = new HttpGet(configuration.getUrl().concat(database).concat("/").concat(id));
        return execute(request, JSON, HttpStatus.SC_OK);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    private Map<String, Object> findById(String database, String id) {
        HttpGet request = new HttpGet(configuration.getUrl().concat(database).concat("/").concat(id));
        return execute(request, JSON, HttpStatus.SC_OK);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    private Map<String, Object> findById(String database, String id) {
        HttpGet request = new HttpGet(configuration.getUrl().concat(database).concat("/").concat(id));
        return execute(request, JSON, HttpStatus.SC_OK);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
            HttpEntityEnclosingRequestBase request;
            if (id.isEmpty()) {
                request = new HttpPost(configuration.getUrl().concat(database).concat("/"));
            } else {
                id = CODEC.encode(id);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
            HttpEntityEnclosingRequestBase request;
            if (id.isEmpty()) {
                request = new HttpPost(configuration.getUrl().concat(database).concat("/"));
            } else {
                id = CODEC.encode(id);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
            } else {
                id = CODEC.encode(id);
                request = new HttpPut(configuration.getUrl().concat(database).concat("/").concat(id));
            }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
            } else {
                id = CODEC.encode(id);
                request = new HttpPut(configuration.getUrl().concat(database).concat("/").concat(id));
            }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
            } else {
                id = CODEC.encode(id);
                request = new HttpPut(configuration.getUrl().concat(database).concat("/").concat(id));
            }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    public void createDatabase(String database) {
        HttpPut httpPut = new HttpPut(configuration.getUrl().concat(database));
        Map<String, Object> json = execute(httpPut, JSON, HttpStatus.SC_CREATED);
        if (!json.getOrDefault("ok", "false").toString().equals("true")) {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    private void delete(String database, DeleteElement id) {
        HttpDelete request = new HttpDelete(configuration.getUrl().concat(database).concat("/").concat(id.getId()));
        request.addHeader(CouchDBConstant.REV_HEADER, id.getRev());
        execute(request, null, HttpStatus.SC_OK, true);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    private void delete(String database, DeleteElement id) {
        HttpDelete request = new HttpDelete(configuration.getUrl().concat(database).concat("/").concat(id.getId()));
        request.addHeader(CouchDBConstant.REV_HEADER, id.getRev());
        execute(request, null, HttpStatus.SC_OK, true);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    private void delete(String database, DeleteElement id) {
        HttpDelete request = new HttpDelete(configuration.getUrl().concat(database).concat("/").concat(id.getId()));
        request.addHeader(CouchDBConstant.REV_HEADER, id.getRev());
        execute(request, null, HttpStatus.SC_OK, true);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    private List<Map<String, Object>> executeQuery(String database, DocumentQuery query) {
        HttpPost request = new HttpPost(configuration.getUrl().concat(database).concat(CouchDBConstant.FIND));
        setHeader(request);
        JsonObject mangoQuery = converter.apply(query);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    private List<Map<String, Object>> executeQuery(String database, DocumentQuery query) {
        HttpPost request = new HttpPost(configuration.getUrl().concat(database).concat(CouchDBConstant.FIND));
        setHeader(request);
        JsonObject mangoQuery = converter.apply(query);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    public long count(String database) {
        HttpGet request = new HttpGet(configuration.getUrl().concat(database).concat(CouchDBConstant.COUNT));
        Map<String, Object> json = execute(request, JSON, HttpStatus.SC_OK);
        String total = json.get(CouchDBConstant.TOTAL_ROWS_RESPONSE).toString();
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    public long count(String database) {
        HttpGet request = new HttpGet(configuration.getUrl().concat(database).concat(CouchDBConstant.COUNT));
        Map<String, Object> json = execute(request, JSON, HttpStatus.SC_OK);
        String total = json.get(CouchDBConstant.TOTAL_ROWS_RESPONSE).toString();
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    public List<String> getDatabases() {
        HttpGet httpget = new HttpGet(configuration.getUrl().concat(CouchDBConstant.ALL_DBS));
        return execute(httpget, LIST_STRING, HttpStatus.SC_OK);
    }
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `IrregularKeyValue` does not end with 'Exception'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/IrregularKeyValue.java`
#### Snippet
```java
 * An exception when has irregular key value problem
 */
public class IrregularKeyValue extends RuntimeException {

    private static final long serialVersionUID = 6161854579438859925L;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/converters/TimestampConverter.java`
#### Snippet
```java
    public Date convertToDatabaseColumn(Object attribute) {
        if (attribute == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/QueryConverter.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLFactory.java`
#### Snippet
```java
            @Override
            public Object getResult() {
                return null;
            }
        }), asList(params));
```

### ReturnNull
Return of `null`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLFactory.java`
#### Snippet
```java
            @Override
            public Object getResult() {
                return null;
            }
        }), query.getParams());
```

### ReturnNull
Return of `null`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisQueue.java`
#### Snippet
```java

        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisQueue.java`
#### Snippet
```java
        int index = size();
        if (index == 0) {
            return null;
        }
        if(isString) {
```

### ReturnNull
Return of `null`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java
            return serialize(value);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java
        String value = jedis.lindex(keyWithNameSpace, index);
        if (value == null || value.isEmpty()) {
            return null;
        }
        return serialize(value);
```

### ReturnNull
Return of `null`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java

        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java
            return value;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/mapping/ObjectIdConverter.java`
#### Snippet
```java
           return dbData.toString();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/mapping/ObjectIdConverter.java`
#### Snippet
```java
            return new ObjectId(attribute);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/BinaryValueReader.java`
#### Snippet
```java

        if (value == null) {
            return null;
        }
        if (value instanceof byte[]) {
```

### ReturnNull
Return of `null`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
            }
            if (Objects.isNull(type)) {
                return null;
            }
            HttpEntity entity = result.getEntity();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `delete` is redundant
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/DeleteQueryConverter.java`
#### Snippet
```java
        }

        final Delete delete = deleteSelection.where(Relations.createClause(query.condition().orElse(null)));
        return delete;
    }
```

### UnnecessaryLocalVariable
Local variable `map` is redundant
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java

    private Map<String, String> createRedisMap() {
        Map<String, String> map = jedis.hgetAll(nameSpace);
        return map;
    }
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraQuery.java`
#### Snippet
```java

    void setExhausted(boolean exhausted) {
        synchronized (this) {
            if (exhausted) {
                this.pagingState = EXHAUSTED;
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchDocumentConfiguration.java`
#### Snippet
```java
                .forEach(httpHosts::add);

        RestClientBuilder builder = RestClient.builder(httpHosts.toArray(new HttpHost[0]));
        builder.setDefaultHeaders(headers.stream().toArray(Header[]::new));

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLFactory.java`
#### Snippet
```java

        Object[] getParams() {
            return params.toArray(new Object[0]);
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLFactory.java`
#### Snippet
```java

        Object[] getParams() {
            return params.toArray(new Object[0]);
        }

```

## RuleId[id=ClassCanBeRecord]
### ClassCanBeRecord
Class can be a record
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/QueryConverterResult.java`
#### Snippet
```java
import java.util.List;

class QueryConverterResult {

    private final Query.Builder statement;
```

### ClassCanBeRecord
Class can be a record
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/N1QLQuery.java`
#### Snippet
```java
import java.util.Objects;

final class N1QLQuery {

    private final String query;
```

### ClassCanBeRecord
Class can be a record
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/AQLQueryResult.java`
#### Snippet
```java
import java.util.Map;

class AQLQueryResult {
    private final String query;

```

### ClassCanBeRecord
Class can be a record
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBuilders.java`
#### Snippet
```java
    }

    private static class ArangoDBHost {
        private final String hots;

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `select` initializer `null` is redundant
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
        final List<String> columns = query.columns();

        Select select = null;
        if (columns.isEmpty()) {
            select = QueryBuilder.selectFrom(keyspace, columnFamily).all();
```

### UnusedAssignment
Variable `value` initializer `jedis.hget(nameSpace, JSONB.toJson(key))` is redundant
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java
        requireNonNull(key, "Key is required");

        String value = jedis.hget(nameSpace, JSONB.toJson(key));
        if (isKeyString) {
            value = jedis.hget(nameSpace, key.toString());
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrDocumentManager.java`
#### Snippet
```java
     * @throws NullPointerException when there is null parameter
     */
    List<DocumentEntity> solr(String query, Map<String, ? extends Object> params);
}

```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/DefaultSolrDocumentManager.java`
#### Snippet
```java

    @Override
    public List<DocumentEntity> solr(String query, Map<String, ? extends Object> params) {
        Objects.requireNonNull(query, "query is required");
        Objects.requireNonNull(params, "params is required");
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/DefaultSolrDocumentManager.java`
#### Snippet
```java
        Objects.requireNonNull(params, "params is required");
        String nativeQuery = query;
        for (Entry<String, ? extends Object> entry : params.entrySet()) {
            nativeQuery = nativeQuery.replace('@' + entry.getKey(), entry.getValue().toString());
        }
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoTableUtils.java`
#### Snippet
```java
                    }
                    Collections.reverse(tableNames);
                    lastName = tableNames.stream().findFirst().get();
                }
            } catch (DynamoDbException e) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java
                .map(c -> UdtValue.class.cast(c).getType().getName().asInternal())
                .findFirst()
                .get().toString();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java
            String finalScope = getScope().orElseGet(() -> bucket.defaultScope().name());
            ScopeSpec spec = scopes.stream().filter(s -> finalScope.equals(s.name()))
                    .findFirst().get();
            for (String collection : collections) {
                if (spec.collections().stream().noneMatch(c -> collection.equals(c.name()))) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(value).spliterator(), false). allMatch(org....` is always `true` when reached
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `!hasTable` is always `true`
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoTableUtils.java`
#### Snippet
```java
        String lastName = null;

        while (!hasTable) {
            try {
                ListTablesRequest.Builder builder = ListTablesRequest.builder();
```

### ConstantValue
Value `hasTable` is always 'false'
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoTableUtils.java`
#### Snippet
```java
        String lastName = null;

        while (!hasTable) {
            try {
                ListTablesRequest.Builder builder = ListTablesRequest.builder();
```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Map.class:...` is always `true` when reached
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(value).spliterator(), false). allMatch(org....` is always `true` when reached
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrUtils.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false) .allMatc...` is always `true`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java
                    org.eclipse.jnosql.databases.cassandra.communication.UDT.class.cast(column.get());
            Object columns = udt.get();
            if (StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false)
                    .allMatch(Iterable.class::isInstance)) {
                GenericFieldMapping genericField = GenericFieldMapping.class.cast(field);
                Collection collection = genericField.getCollectionInstance();
```

### ConstantValue
Method reference result is always 'true'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java
            Object columns = udt.get();
            if (StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false)
                    .allMatch(Iterable.class::isInstance)) {
                GenericFieldMapping genericField = GenericFieldMapping.class.cast(field);
                Collection collection = genericField.getCollectionInstance();
```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Document.c...` is always `true` when reached
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
    private static boolean isDocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }

```

### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(value).spliterator(), false). allMatch(org....` is always `true` when reached
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `!ids.isEmpty()` is always `true` when reached
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLFactory.java`
#### Snippet
```java

        public boolean isRunQuery() {
            return ids.isEmpty() || (!ids.isEmpty() && !params.isEmpty());
        }

```

### ConstantValue
Result of `ids.isEmpty()` is always 'false'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLFactory.java`
#### Snippet
```java

        public boolean isRunQuery() {
            return ids.isEmpty() || (!ids.isEmpty() && !params.isEmpty());
        }

```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Map.class:...` is always `true` when reached
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false). allMatch(org.eclipse.jnosql...` is always `true` when reached
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Map.class:...` is always `true` when reached
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(value).spliterator(), false). allMatch(org....` is always `true` when reached
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Map.class:...` is always `true` when reached
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(value).spliterator(), false). allMatch(org....` is always `true` when reached
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Document.c...` is always `true` when reached
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
    private static boolean isDocumentIterable(Object value) {
        return value instanceof Iterable &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
        return value instanceof Iterable &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }

```
