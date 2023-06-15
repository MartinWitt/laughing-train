# jnosql 
 
# Bad smells
I found 540 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 220 | false |
| RedundantClassCall | 170 | false |
| JavadocReference | 83 | false |
| DuplicatedCode | 30 | false |
| UnnecessaryLocalVariable | 8 | true |
| ConstantValue | 4 | false |
| AutoCloseableResource | 3 | false |
| Deprecation | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| DataFlowIssue | 2 | false |
| TypeParameterHidesVisibleType | 2 | false |
| JavadocDeclaration | 2 | false |
| UnnecessaryDefault | 2 | false |
| Java9UndeclaredServiceUsage | 2 | false |
| ClassEscapesItsScope | 1 | false |
| CdiUnknownProducersForDisposerMethodInspection | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| ExtendsAnnotation | 1 | false |
| PointlessBooleanExpression | 1 | true |
## RuleId[id=ClassEscapesItsScope]
### ClassEscapesItsScope
Class `DefaultSelectQuery` is not exported from module 'org.eclipse.jnosql.communication.query'
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/SelectQueryConverter.java`
#### Snippet
```java

    @Override
    public DefaultSelectQuery apply(String query) {
        runQuery(query);
        return new DefaultSelectQuery(entity, fields, sorts, skip, limit, where);
```

## RuleId[id=CdiUnknownProducersForDisposerMethodInspection]
### CdiUnknownProducersForDisposerMethodInspection
Cannot find corresponding producers
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/configuration/GraphSupplier.java`
#### Snippet
```java
    }

    public void close(@Disposes Graph graph) throws Exception {
        graph.close();
    }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ColumnManagerFactory' used without 'try'-with-resources statement
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/configuration/ColumnManagerSupplier.java`
#### Snippet
```java
                }).orElseGet(ColumnConfiguration::getConfiguration);

        ColumnManagerFactory managerFactory = configuration.apply(settings);

        Optional<String> database = settings.get(COLUMN_DATABASE, String.class);
```

### AutoCloseableResource
'DocumentManagerFactory' used without 'try'-with-resources statement
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/configuration/DocumentManagerSupplier.java`
#### Snippet
```java
                }).orElseGet(DocumentConfiguration::getConfiguration);

        DocumentManagerFactory managerFactory = configuration.apply(settings);

        Optional<String> database = settings.get(DOCUMENT_DATABASE, String.class);
```

### AutoCloseableResource
'BucketManagerFactory' used without 'try'-with-resources statement
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/configuration/BucketManagerSupplier.java`
#### Snippet
```java
                }).orElseGet(KeyValueConfiguration::getConfiguration);

        BucketManagerFactory managerFactory = configuration.apply(settings);

        Optional<String> database = settings.get(KEY_VALUE_DATABASE, String.class);
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Columns.java`
#### Snippet
```java

        if (value instanceof Map) {
            List list = Columns.of((Map.class.cast(value)));
            if(list.size() == 1) {
                return list.get(0);
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Columns.java`
#### Snippet
```java
        }
        if (value instanceof Iterable) {
            return stream(Iterable.class.cast(value).spliterator(), false)
                    .map(Columns::getValue).collect(toList());
        }
        return value;
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Columns.java`
#### Snippet
```java
        }
        if (value instanceof Iterable) {
            return stream(Iterable.class.cast(value).spliterator(), false)
                    .map(Columns::getValue).collect(toList());
        }
        return value;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Columns.java`
#### Snippet
```java
        }
        if (value instanceof Iterable) {
            return stream(Iterable.class.cast(value).spliterator(), false)
                    .map(Columns::getValue).collect(toList());
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.communication.column.ColumnConfiguration' to 'T'
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnConfiguration.java`
#### Snippet
```java
     */
    static <T extends ColumnConfiguration> T getConfiguration() {
        return (T) ServiceLoader.load(ColumnConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .findFirst().orElseThrow(() -> new CommunicationException("No ColumnConfiguration implementation found!"));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.communication.column.ColumnConfiguration' to 'T'
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnConfiguration.java`
#### Snippet
```java
     */
    static <T extends ColumnConfiguration> T getConfiguration(Class<T> type) {
        return (T) ServiceLoader.load(ColumnConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .filter(type::isInstance)
                .findFirst().orElseThrow(() -> new CommunicationException("No ColumnConfiguration implementation found!"));
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/JsonObjects.java`
#### Snippet
```java

    static List<Column> getColumns(JsonObject jsonObject) {
        Map<String, Object> map = JSON.fromJson(jsonObject.toString(), Map.class);
        return Columns.of(map);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/ParameterConverter.java`
#### Snippet
```java
            GenericParameterMetaData genericParameter = (GenericParameterMetaData) metaData;
            Collection elements = genericParameter.getCollectionInstance();
            List<List<Column>> embeddable = (List<List<Column>>) column.get();
            for (List<Column> columnList : embeddable) {
                Object element = converter.toEntity(genericParameter.getElementType(), columnList);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/ParameterConverter.java`
#### Snippet
```java
            for (List<Column> columnList : embeddable) {
                Object element = converter.toEntity(genericParameter.getElementType(), columnList);
                elements.add(element);
            }
            builder.add(elements);
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.lang.Iterable'
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnEntity.java`
#### Snippet
```java
        } else if (value instanceof Iterable) {
            List<Object> list = new ArrayList<>();
            Iterable.class.cast(value).forEach(e -> list.add(convert(e)));
            return list;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnCondition.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {

            long count = (int) StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).count();
            if (count != 2) {
                throw new IllegalArgumentException("On ColumnCondition#between you must use an iterable" +
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'X'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/DefaultColumnFieldValue.java`
#### Snippet
```java
        if (optionalConverter.isPresent()) {
            AttributeConverter<X, Y> attributeConverter = converters.get(optionalConverter.get());
            return singletonList(Column.of(getName(), attributeConverter.convertToDatabaseColumn((X) value())));
        }
        return singletonList(Column.of(getName(), value()));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/ColumnRepositoryProxy.java`
#### Snippet
```java
                          Converters converters) {
        this.template = template;
        Class<T> typeClass = (Class) ((ParameterizedType) repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0];
        this.entityMetadata = entities.get(typeClass);
        this.repository = new ColumnRepository(template, entityMetadata);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'R'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/ColumnRepositoryProducer.java`
#### Snippet
```java
        ColumnRepositoryProxy<T, K> handler = new ColumnRepositoryProxy<>(template,
                entities, repositoryClass, converters);
        return (R) Proxy.newProxyInstance(repositoryClass.getClassLoader(),
                new Class[]{repositoryClass},
                handler);
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'ColumnRepositoryProxy(JNoSQLColumnTemplate, EntitiesMetadata, Class, Converters)' as a member of raw type 'org.eclipse.jnosql.mapping.column.query.ColumnRepositoryProxy'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/RepositoryColumnBean.java`
#### Snippet
```java
        Converters converters = getInstance(Converters.class);

        ColumnRepositoryProxy handler = new ColumnRepositoryProxy(template,
                entities, type, converters);
        return (T) Proxy.newProxyInstance(type.getClassLoader(),
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/RepositoryColumnBean.java`
#### Snippet
```java
        ColumnRepositoryProxy handler = new ColumnRepositoryProxy(template,
                entities, type, converters);
        return (T) Proxy.newProxyInstance(type.getClassLoader(),
                new Class[]{type},
                handler);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'Y'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/FieldConverter.java`
#### Snippet
```java
                if (optionalConverter.isPresent()) {
                    AttributeConverter<X, Y> attributeConverter = converter.getConverters().get(optionalConverter.get());
                    Y attr = (Y)(value.isInstanceOf(List.class) ? column : value.get());
                    Object attributeConverted = attributeConverter.convertToEntityAttribute(attr);
                    field.write(instance, field.value(Value.of(attributeConverted)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Set' to 'java.util.Set'. Reason: 'map' has raw type, so result of entrySet is erased
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/FieldConverter.java`
#### Snippet
```java
                List<Column> embeddedColumns = new ArrayList<>();

                for (Map.Entry entry : (Set<Map.Entry>) map.entrySet()) {
                    embeddedColumns.add(Column.of(entry.getKey().toString(), entry.getValue()));
                }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/FieldConverter.java`
#### Snippet
```java
                GenericFieldMapping genericField = (GenericFieldMapping) field;
                Collection elements = genericField.getCollectionInstance();
                List<List<Column>> embeddable = (List<List<Column>>) column.get();
                for (List<Column> columnList : embeddable) {
                    Object element = converter.toEntity(genericField.getElementType(), columnList);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/FieldConverter.java`
#### Snippet
```java
                for (List<Column> columnList : embeddable) {
                    Object element = converter.toEntity(genericField.getElementType(), columnList);
                    elements.add(element);
                }
                field.write(instance, elements);
```

### UNCHECKED_WARNING
Unchecked call to 'test(T)' as a member of raw type 'java.util.function.Predicate'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/ValueWriterDecorator.java`
#### Snippet
```java
    @Override
    public boolean test(Class<?> type) {
        return writers.stream().anyMatch(writerField -> writerField.test(type));
    }

```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'java.lang.Object', required 'S'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/ValueWriterDecorator.java`
#### Snippet
```java

    @Override
    public Object write(Object object) {
        Class<?> type = object.getClass();
        ValueWriter valueWriter = writers.stream().filter(r -> r.test(type)).findFirst().orElseThrow(
```

### UNCHECKED_WARNING
Unchecked call to 'test(T)' as a member of raw type 'java.util.function.Predicate'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/ValueWriterDecorator.java`
#### Snippet
```java
    public Object write(Object object) {
        Class<?> type = object.getClass();
        ValueWriter valueWriter = writers.stream().filter(r -> r.test(type)).findFirst().orElseThrow(
                () -> new UnsupportedOperationException("The type " + type + " is not supported yet"));
        return valueWriter.write(object);
```

### UNCHECKED_WARNING
Unchecked call to 'write(T)' as a member of raw type 'org.eclipse.jnosql.communication.ValueWriter'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/ValueWriterDecorator.java`
#### Snippet
```java
        ValueWriter valueWriter = writers.stream().filter(r -> r.test(type)).findFirst().orElseThrow(
                () -> new UnsupportedOperationException("The type " + type + " is not supported yet"));
        return valueWriter.write(object);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Stream' to 'java.util.stream.Stream\>'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/ValueWriter.java`
#### Snippet
```java
     */
    static <T, S> Stream<ValueWriter<T, S>> getWriters() {
        return ServiceLoader.load(ValueWriter.class)
                .stream()
                .map(ServiceLoader.Provider::get);
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/AbstractColumnRepository.java`
#### Snippet
```java
    private Function optionalToStream() {
        return id -> {
            Optional entity = this.findById((K) id);
            return entity.isPresent() ? Stream.of(entity.get()) : Stream.empty();
        };
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Stream' to 'java.util.stream.Stream'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/AbstractColumnRepository.java`
#### Snippet
```java
    public Stream<T> findAllById(Iterable<K> ids) {
        requireNonNull(ids, "ids is required");
        return stream(ids.spliterator(), false)
                .flatMap(optionalToStream());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.function.Function' to 'java.util.function.Function\>'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/AbstractColumnRepository.java`
#### Snippet
```java
        requireNonNull(ids, "ids is required");
        return stream(ids.spliterator(), false)
                .flatMap(optionalToStream());
    }

```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'jakarta.data.repository.Page', required 'jakarta.data.repository.Page'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/AbstractColumnRepository.java`
#### Snippet
```java

    @Override
    public Page findAll(Pageable pageable) {
        Objects.requireNonNull(pageable, "pageable is required");
        EntityMetadata metadata = getEntityMetadata();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/AbstractColumnRepository.java`
#### Snippet
```java

    private Class<T> getType() {
        return (Class<T>) getEntityMetadata().type();
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/AbstractColumnRepository.java`
#### Snippet
```java

        Object id = getIdField().read(entity);
        if (nonNull(id) && existsById((K) id)) {
            return getTemplate().update(entity);
        } else {
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'java.util.stream.Stream', required 'java.util.stream.Stream'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/AbstractColumnRepository.java`
#### Snippet
```java

    @Override
    public Stream findAll() {
        return getTemplate().findAll(getType());
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/configuration/ColumnManagerSupplier.java`
#### Snippet
```java
                .map(c -> {
                    final Reflections reflections = CDI.current().select(Reflections.class).get();
                    return (ColumnConfiguration) reflections.newInstance(c);
                }).orElseGet(ColumnConfiguration::getConfiguration);

```

### UNCHECKED_WARNING
Unchecked call to 'withClassSource(Class)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/BaseColumnRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, ColumnQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/ColumnEntityConverter.java`
#### Snippet
```java

        if (type.getClass().isRecord()) {
            return (T) toEntity(type.getClass(), entity.columns());
        }
        EntityMetadata mapping = getEntities().get(type.getClass());
```

### UNCHECKED_WARNING
Unchecked call to 'withPage(Function\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/BaseColumnRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, ColumnQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
                .withSingleResult(() -> getTemplate().singleResult(query))
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(streamPagination(query))
                .withSingleResultPagination(getSingleResult(query))
                .withPage(getPage(query))
                .build();
        return dynamicReturn.execute();
```

### UNCHECKED_WARNING
Unchecked call to 'withResult(Supplier\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/BaseColumnRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, ColumnQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
                .withSingleResult(() -> getTemplate().singleResult(query))
                .withPagination(DynamicReturn.findPageable(args))
```

### UNCHECKED_WARNING
Unchecked call to 'withSingleResult(Supplier\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/BaseColumnRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, ColumnQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
                .withSingleResult(() -> getTemplate().singleResult(query))
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(streamPagination(query))
```

### UNCHECKED_WARNING
Unchecked call to 'withSingleResultPagination(Function\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/BaseColumnRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, ColumnQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
                .withSingleResult(() -> getTemplate().singleResult(query))
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(streamPagination(query))
                .withSingleResultPagination(getSingleResult(query))
                .withPage(getPage(query))
                .build();
```

### UNCHECKED_WARNING
Unchecked call to 'withStreamPagination(Function\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/BaseColumnRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, ColumnQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
                .withSingleResult(() -> getTemplate().singleResult(query))
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(streamPagination(query))
                .withSingleResultPagination(getSingleResult(query))
                .withPage(getPage(query))
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DateReader.java`
#### Snippet
```java

        if (Date.class.isInstance(value)) {
            return (T) value;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Date' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DateReader.java`
#### Snippet
```java

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue());
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Date' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DateReader.java`
#### Snippet
```java
        }

        return (T) new Date(value.toString());
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CharacterReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {
        if (Character.class.isInstance(value)) {
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Character' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CharacterReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Character.valueOf((char) Number.class.cast(value).intValue());
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Character' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CharacterReader.java`
#### Snippet
```java

        if (value.toString().isEmpty()) {
            return (T) Character.valueOf(MIN_VALUE);
        }
        return (T) Character.valueOf(value.toString().charAt(0));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Character' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CharacterReader.java`
#### Snippet
```java
            return (T) Character.valueOf(MIN_VALUE);
        }
        return (T) Character.valueOf(value.toString().charAt(0));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java

        if (isAtomicBoolean && AtomicBoolean.class.isInstance(value)) {
            return (T) value;
        }
        Boolean bool = null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.concurrent.atomic.AtomicBoolean' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java

        if (isAtomicBoolean) {
            return (T) new AtomicBoolean(bool);
        }
        return (T) bool;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Boolean' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
            return (T) new AtomicBoolean(bool);
        }
        return (T) bool;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'. Reason: 'stream(iterable.spliterator(), false).map(o -\> SERVICE_PROVIDER.read(classType, o))' has raw type, so result of collect is erased
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(toList());
        }
        return (T) new ArrayList<>(Collections.singletonList(SERVICE_PROVIDER.read(classType, value)));
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(toList());
        }
        return (T) new ArrayList<>(Collections.singletonList(SERVICE_PROVIDER.read(classType, value)));
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(toList());
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'iterable' has raw type, so result of spliterator is erased
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(toList());
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.ArrayList' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
                    .collect(toList());
        }
        return (T) new ArrayList<>(Collections.singletonList(SERVICE_PROVIDER.read(classType, value)));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'executeFindByQuery(Method, Object\[\], Class, ColumnQuery)' as a member of raw type 'org.eclipse.jnosql.mapping.column.query.BaseColumnRepository'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/AbstractColumnRepositoryProxy.java`
#### Snippet
```java
            }
            case FIND_BY -> {
                return executeFindByQuery(method, args, typeClass, getQuery(method, args));
            }
            case COUNT_BY -> {
```

### UNCHECKED_WARNING
Unchecked call to 'executeFindByQuery(Method, Object\[\], Class, ColumnQuery)' as a member of raw type 'org.eclipse.jnosql.mapping.column.query.BaseColumnRepository'
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/AbstractColumnRepositoryProxy.java`
#### Snippet
```java
            case FIND_ALL -> {
                ColumnQuery queryFindAll = ColumnQuery.select().from(getEntityMetadata().name()).build();
                return executeFindByQuery(method, args, typeClass, updateQueryDynamically(args, queryFindAll));
            }
            case DELETE_BY -> {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicIntegerReader.java`
#### Snippet
```java

        if (AtomicInteger.class.isInstance(value)) {
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.concurrent.atomic.AtomicInteger' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicIntegerReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) new AtomicInteger(Number.class.cast(value).intValue());
        } else {
            return (T) new AtomicInteger(Integer.parseInt(value.toString()));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.concurrent.atomic.AtomicInteger' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicIntegerReader.java`
#### Snippet
```java
            return (T) new AtomicInteger(Number.class.cast(value).intValue());
        } else {
            return (T) new AtomicInteger(Integer.parseInt(value.toString()));
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicLongReader.java`
#### Snippet
```java

        if (AtomicLong.class.isInstance(value)) {
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.concurrent.atomic.AtomicLong' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicLongReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) new AtomicLong(Number.class.cast(value).longValue());
        } else {
            return (T) new AtomicLong(Long.parseLong(value.toString()));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.concurrent.atomic.AtomicLong' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicLongReader.java`
#### Snippet
```java
            return (T) new AtomicLong(Number.class.cast(value).longValue());
        } else {
            return (T) new AtomicLong(Long.parseLong(value.toString()));
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.stream.Stream' to 'T'. Reason: 'stream(iterable.spliterator(), false)' has raw type, so result of map is erased
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o));
        }
        return (T) Stream.of(SERVICE_PROVIDER.read(classType, value));
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o));
        }
        return (T) Stream.of(SERVICE_PROVIDER.read(classType, value));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'iterable' has raw type, so result of spliterator is erased
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o));
        }
        return (T) Stream.of(SERVICE_PROVIDER.read(classType, value));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.stream.Stream\>' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o));
        }
        return (T) Stream.of(SERVICE_PROVIDER.read(classType, value));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigIntegerReader.java`
#### Snippet
```java

        if (BigInteger.class.isInstance(value)) {
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.math.BigInteger' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigIntegerReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) BigInteger.valueOf(Number.class.cast(value).longValue());
        } else {
            return (T) BigInteger.valueOf(Long.parseLong(value.toString()));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.math.BigInteger' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigIntegerReader.java`
#### Snippet
```java
            return (T) BigInteger.valueOf(Number.class.cast(value).longValue());
        } else {
            return (T) BigInteger.valueOf(Long.parseLong(value.toString()));
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DoubleReader.java`
#### Snippet
```java

        if (Double.class.isInstance(value)) {
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Double' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DoubleReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Double.valueOf(Number.class.cast(value).doubleValue());
        } else {
            return (T) Double.valueOf(value.toString());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Double' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DoubleReader.java`
#### Snippet
```java
            return (T) Double.valueOf(Number.class.cast(value).doubleValue());
        } else {
            return (T) Double.valueOf(value.toString());
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java

        if (LocalDateTime.class.isInstance(value)) {
            return (T) value;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.time.LocalDateTime' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java

        if (Calendar.class.isInstance(value)) {
            return (T) ((Calendar) value).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.time.LocalDateTime' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java

        if (Date.class.isInstance(value)) {
            return (T) ((Date) value).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.time.LocalDateTime' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.time.LocalDateTime' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java
        }

        return (T) LocalDateTime.parse(value.toString());
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigDecimalReader.java`
#### Snippet
```java

        if (BigDecimal.class.isInstance(value)) {
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.math.BigDecimal' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigDecimalReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) BigDecimal.valueOf(Number.class.cast(value).doubleValue());
        } else {
            return (T) BigDecimal.valueOf(Double.parseDouble(value.toString()));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.math.BigDecimal' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigDecimalReader.java`
#### Snippet
```java
            return (T) BigDecimal.valueOf(Number.class.cast(value).doubleValue());
        } else {
            return (T) BigDecimal.valueOf(Double.parseDouble(value.toString()));
        }
    }
```

### UNCHECKED_WARNING
Unchecked method 'allOf(Class)' invocation
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java

    private <T> List<Enum> getEnumList(Class<Enum> type) {
        EnumSet enumSet = EnumSet.allOf(type);
        return new ArrayList<>(enumSet);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java
    private <T> List<Enum> getEnumList(Class<Enum> type) {
        EnumSet enumSet = EnumSet.allOf(type);
        return new ArrayList<>(enumSet);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java
    private <T> List<Enum> getEnumList(Class<Enum> type) {
        EnumSet enumSet = EnumSet.allOf(type);
        return new ArrayList<>(enumSet);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java

        if (type.isInstance(value)) {
            return (T) value;
        }
        if (!Enum.class.isAssignableFrom(type)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java
            throw new IllegalArgumentException("The informed class isn't an enum type: " + type);
        }
        List<Enum> elements = getEnumList((Class<Enum>) type);

        if (Number.class.isInstance(value)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Enum' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java
        if (Number.class.isInstance(value)) {
            int index = Number.class.cast(value).intValue();
            return (T) elements.stream().filter(element -> element.ordinal() == index).findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("There is not index in enum to value: " + index));
        }
        String name = value.toString();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Enum' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java
        }
        String name = value.toString();
        return (T) elements.stream().filter(element -> element.name().equals(name)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("There isn't name in enum to value: " + name));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/YearReader.java`
#### Snippet
```java

        if (Year.class.isInstance(value)) {
            return (T) value;
        }
        return (T) Year.parse(value.toString());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.time.Year' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/YearReader.java`
#### Snippet
```java
            return (T) value;
        }
        return (T) Year.parse(value.toString());
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/FloatReader.java`
#### Snippet
```java

        if (Float.class.isInstance(value)) {
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Float' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/FloatReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Float.valueOf(Number.class.cast(value).floatValue());
        } else {
            return (T) Float.valueOf(value.toString());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Float' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/FloatReader.java`
#### Snippet
```java
            return (T) Float.valueOf(Number.class.cast(value).floatValue());
        } else {
            return (T) Float.valueOf(value.toString());
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CalendarReader.java`
#### Snippet
```java

        if (Calendar.class.isInstance(value)) {
            return (T) value;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Calendar' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CalendarReader.java`
#### Snippet
```java
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis( ((Number) value).longValue());
            return (T) calendar;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Calendar' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CalendarReader.java`
#### Snippet
```java
            Calendar calendar = Calendar.getInstance();
            calendar.setTime((Date)value);
            return (T) calendar;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ByteReader.java`
#### Snippet
```java

        if (Byte.class.isInstance(value)) {
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Calendar' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CalendarReader.java`
#### Snippet
```java
        calendar.setTime(date);

        return (T) calendar;
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Byte' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ByteReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Byte.valueOf(Number.class.cast(value).byteValue());
        } else {
            return (T) Byte.valueOf(value.toString());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Byte' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ByteReader.java`
#### Snippet
```java
            return (T) Byte.valueOf(Number.class.cast(value).byteValue());
        } else {
            return (T) Byte.valueOf(value.toString());
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.time.OffsetTime' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetTimeReader.java`
#### Snippet
```java
    public <T> T read(Class<T> typeClass, Object value) {

        return (T) getOffSetDateTime(value);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/DefaultSettings.java`
#### Snippet
```java
        Objects.requireNonNull(key, "key is required");
        Objects.requireNonNull(defaultValue, "defaultValue is required");
        Class<T> type = (Class<T>) defaultValue.getClass();
        return get(key, type).orElse(defaultValue);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.time.OffsetDateTime' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetDateTimeReader.java`
#### Snippet
```java
    @Override
    public <T> T read(Class<T> typeClass, Object value) {
        return (T) getOffSetDateTime(value);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LongReader.java`
#### Snippet
```java

        if (Long.class.isInstance(value)) {
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Long' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LongReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Long.valueOf(Number.class.cast(value).longValue());
        } else {
            return (T) Long.valueOf(value.toString());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Long' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LongReader.java`
#### Snippet
```java
            return (T) Long.valueOf(Number.class.cast(value).longValue());
        } else {
            return (T) Long.valueOf(value.toString());
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalReader.java`
#### Snippet
```java

        if (Optional.class.isInstance(value)) {
            return (T) value;
        }
        return (T) Optional.ofNullable(value);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/YearMonthReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {
        if (YearMonth.class.isInstance(value)) {
            return (T) value;
        }
        return (T) YearMonth.parse(value.toString());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.time.YearMonth' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/YearMonthReader.java`
#### Snippet
```java
            return (T) value;
        }
        return (T) YearMonth.parse(value.toString());
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Optional' to 'T'
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalReader.java`
#### Snippet
```java
            return (T) value;
        }
        return (T) Optional.ofNullable(value);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.mapping.graph.GraphConfiguration' to 'T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphConfiguration.java`
#### Snippet
```java
     */
    static <T extends GraphConfiguration> T getConfiguration(Class<T> type) {
        return (T) ServiceLoader.load(GraphConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .filter(type::isInstance)
                .findFirst().orElseThrow(() -> new CommunicationException("It does not find GraphConfiguration"));
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.mapping.graph.GraphConfiguration' to 'T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphConfiguration.java`
#### Snippet
```java
     */
    static <T extends GraphConfiguration> T getConfiguration() {
        return (T) ServiceLoader.load(GraphConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .findFirst().orElseThrow(() -> new CommunicationException("It does not find GraphConfiguration"));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GremlinExecutor.java`
#### Snippet
```java

    private <T> Stream<T> convertToStream(Stream<?> stream) {
        return stream.map(this::getElement).map(e -> (T) e);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: '((Iterable) eval)' has raw type, so result of spliterator is erased
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GremlinExecutor.java`
#### Snippet
```java
            }
            if (eval instanceof Iterable) {
                return convertToStream(StreamSupport.stream(((Iterable) eval).spliterator(), false));
            }
            if (eval instanceof Stream) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GremlinExecutor.java`
#### Snippet
```java
                return convertToStream((Stream) eval);
            }
            return Stream.of((T) eval);
        } catch (ScriptException e) {
            throw new GremlinQueryException("There is an error when executed the gremlin query: " + gremlin, e);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'X'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/FieldGraph.java`
#### Snippet
```java
        if (optionalConverter.isPresent()) {
            AttributeConverter<X, Y> attributeConverter = converters.get(optionalConverter.get());
            return singletonList(DefaultProperty.of(field.name(), attributeConverter.convertToDatabaseColumn((X) value)));
        }
        return singletonList(DefaultProperty.of(field.name(), value));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'X'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/FieldGraph.java`
#### Snippet
```java
        if (optionalConverter.isPresent()) {
            AttributeConverter<X, Y> attributeConverter = converters.get(optionalConverter.get());
            return DefaultProperty.of(field.name(), attributeConverter.convertToDatabaseColumn((X) value));
        }
        return DefaultProperty.of(field.name(), value);
```

### UNCHECKED_WARNING
Unchecked call to 'convertToEntityAttribute(Y)' as a member of raw type 'org.eclipse.jnosql.mapping.AttributeConverter'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityConverterByContructor.java`
#### Snippet
```java
            parameter.getConverter().ifPresentOrElse(c -> {
                AttributeConverter attributeConverter = this.converters.get(c);
                Object attributeConverted = attributeConverter.convertToEntityAttribute(vertexId);
                Value value = Value.of(attributeConverted);
                builder.add(value.get(parameter.getType()));
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'O', required 'T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultEdgeEntity.java`
#### Snippet
```java

    @Override
    public O outgoing() {
        return outgoing;
    }
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'I', required 'T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultEdgeEntity.java`
#### Snippet
```java

    @Override
    public I incoming() {
        return incoming;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphConverter.java`
#### Snippet
```java

        if (type.getClass().isRecord()) {
            return (T) toEntity(type.getClass(), vertex);
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphConverter.java`
#### Snippet
```java
            entity = mapInheritanceEntity(vertex, properties, mapping.type());
        } else {
            entity = convert((Class<T>) mapping.type(), properties, vertex);
        }
        getEventManager().firePostEntity(entity);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphConverter.java`
#### Snippet
```java

        EntityMetadata mapping = getEntities().get(inheritance.getEntity());
        return convert((Class<T>) mapping.type(), properties, vertex);
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityConverterByField.java`
#### Snippet
```java
    private void embeddedField(T instance, List<Property<?>> elements,
                                   FieldMapping field, Vertex vertex) {
        Class<T> type = (Class<T>) field.nativeField().getType();
        field.write(instance, convert(type, elements, vertex));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'convertToEntityAttribute(Y)' as a member of raw type 'org.eclipse.jnosql.mapping.AttributeConverter'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityConverterByField.java`
#### Snippet
```java
            fieldMapping.getConverter().ifPresentOrElse(c -> {
                AttributeConverter attributeConverter = converters.get(c);
                Object attributeConverted = attributeConverter.convertToEntityAttribute(vertexId);
                fieldMapping.write(entity, fieldMapping.value(Value.of(attributeConverted)));
            }, () -> fieldMapping.write(entity, fieldMapping.value(Value.of(vertexId))));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'Y'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityConverterByField.java`
#### Snippet
```java
        if (converter.isPresent()) {
            AttributeConverter<X, Y> attributeConverter = converters().get(converter.get());
            Object attributeConverted = attributeConverter.convertToEntityAttribute((Y) value);
            field.write(instance, field.value(Value.of(attributeConverted)));
        } else {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jnosql.mapping.graph.query.GraphRepositoryProxy' to 'org.eclipse.jnosql.mapping.graph.query.GraphRepositoryProxy'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphRepositoryProducer.java`
#### Snippet
```java
        Objects.requireNonNull(manager, "manager class is required");
        GraphTemplate template = producer.get(manager);
        GraphRepositoryProxy<R, K> handler = new GraphRepositoryProxy(template,
                entities, repositoryClass, manager, converter, converters);
        return (R) Proxy.newProxyInstance(repositoryClass.getClassLoader(),
```

### UNCHECKED_WARNING
Unchecked call to 'GraphRepositoryProxy(GraphTemplate, EntitiesMetadata, Class, Graph, GraphConverter, Converters)' as a member of raw type 'org.eclipse.jnosql.mapping.graph.query.GraphRepositoryProxy'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphRepositoryProducer.java`
#### Snippet
```java
        Objects.requireNonNull(manager, "manager class is required");
        GraphTemplate template = producer.get(manager);
        GraphRepositoryProxy<R, K> handler = new GraphRepositoryProxy(template,
                entities, repositoryClass, manager, converter, converters);
        return (R) Proxy.newProxyInstance(repositoryClass.getClassLoader(),
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'R'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphRepositoryProducer.java`
#### Snippet
```java
        GraphRepositoryProxy<R, K> handler = new GraphRepositoryProxy(template,
                entities, repositoryClass, manager, converter, converters);
        return (R) Proxy.newProxyInstance(repositoryClass.getClassLoader(),
                new Class[]{repositoryClass},
                handler);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'GraphRepositoryProxy(GraphTemplate, EntitiesMetadata, Class, Graph, GraphConverter, Converters)' as a member of raw type 'org.eclipse.jnosql.mapping.graph.query.GraphRepositoryProxy'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/RepositoryGraphBean.java`
#### Snippet
```java
        Converters converters = getInstance(Converters.class);

        GraphRepositoryProxy handler = new GraphRepositoryProxy(repository,
                entities, type, graph, converter, converters);
        return (T) Proxy.newProxyInstance(type.getClassLoader(),
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/RepositoryGraphBean.java`
#### Snippet
```java
        GraphRepositoryProxy handler = new GraphRepositoryProxy(repository,
                entities, type, graph, converter, converters);
        return (T) Proxy.newProxyInstance(type.getClassLoader(),
                new Class[]{type},
                handler);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphRepositoryProxy.java`
#### Snippet
```java
                         Converters converters) {

        Class<T> typeClass = (Class) ((ParameterizedType) repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0];

        this.graph = graph;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/configuration/GraphSupplier.java`
#### Snippet
```java
                .map(c -> {
                    final Reflections reflections = CDI.current().select(Reflections.class).get();
                    return (GraphConfiguration) reflections.newInstance(c);
                }).orElseGet(GraphConfiguration::getConfiguration);

```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'java.util.stream.Stream', required 'java.util.stream.Stream'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepository.java`
#### Snippet
```java

    @Override
    public Stream findAll() {
        return getTemplate().findAll(getEntityMetadata().type());
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepository.java`
#### Snippet
```java
    private Function optionalToStream() {
        return id -> {
            Optional entity = this.findById((K) id);
            return entity.isPresent() ? Stream.of(entity.get()) : Stream.empty();
        };
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Stream' to 'java.util.stream.Stream'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepository.java`
#### Snippet
```java
    public Stream<T> findAllById(Iterable<K> ids) {
        requireNonNull(ids, "ids is required");
        return stream(ids.spliterator(), false)
                .flatMap(optionalToStream());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.function.Function' to 'java.util.function.Function\>'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepository.java`
#### Snippet
```java
        requireNonNull(ids, "ids is required");
        return stream(ids.spliterator(), false)
                .flatMap(optionalToStream());
    }

```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'jakarta.data.repository.Page', required 'jakarta.data.repository.Page'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepository.java`
#### Snippet
```java

    @Override
    public Page findAll(Pageable pageable) {
        Objects.requireNonNull(pageable, "pageable is required");
        EntityMetadata metadata = getEntityMetadata();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepository.java`
#### Snippet
```java
        Objects.requireNonNull(entity, "Entity is required");
        Object id = getIdField().read(entity);
        if (nonNull(id) && existsById((K) id)) {
            return getTemplate().update(entity);
        } else {
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphQueryMethod.java`
#### Snippet
```java
        Object value = getValue();
        if (value instanceof Iterable<?>) {
            return (Collection<?>) StreamSupport.stream(((Iterable) value).spliterator(), false)
                    .map(v -> ConverterUtil.getValue(v, mapping, name, converters))
                    .collect(Collectors.toList());
        }
        return singletonList(ConverterUtil.getValue(value, mapping, name, converters));
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphQueryMethod.java`
#### Snippet
```java
        Object value = getValue();
        if (value instanceof Iterable<?>) {
            return (Collection<?>) StreamSupport.stream(((Iterable) value).spliterator(), false)
                    .map(v -> ConverterUtil.getValue(v, mapping, name, converters))
                    .collect(Collectors.toList());
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: '((Iterable) value)' has raw type, so result of spliterator is erased
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphQueryMethod.java`
#### Snippet
```java
        Object value = getValue();
        if (value instanceof Iterable<?>) {
            return (Collection<?>) StreamSupport.stream(((Iterable) value).spliterator(), false)
                    .map(v -> ConverterUtil.getValue(v, mapping, name, converters))
                    .collect(Collectors.toList());
```

### UNCHECKED_WARNING
Unchecked call to 'withClassSource(Class)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepositoryProxy.java`
#### Snippet
```java
        };

        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(querySupplier)
```

### UNCHECKED_WARNING
Unchecked call to 'withPage(Function\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepositoryProxy.java`
#### Snippet
```java
        };

        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(querySupplier)
                .withSingleResult(singleSupplier)
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(p -> querySupplier.get())
                .withSingleResultPagination(p -> singleSupplier.get())
                .withPage(pageFunction)
                .build();

```

### UNCHECKED_WARNING
Unchecked call to 'withResult(Supplier\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepositoryProxy.java`
#### Snippet
```java
        };

        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(querySupplier)
                .withSingleResult(singleSupplier)
                .withPagination(DynamicReturn.findPageable(args))
```

### UNCHECKED_WARNING
Unchecked call to 'withSingleResult(Supplier\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepositoryProxy.java`
#### Snippet
```java
        };

        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(querySupplier)
                .withSingleResult(singleSupplier)
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(p -> querySupplier.get())
```

### UNCHECKED_WARNING
Unchecked call to 'withSingleResultPagination(Function\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepositoryProxy.java`
#### Snippet
```java
        };

        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(querySupplier)
                .withSingleResult(singleSupplier)
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(p -> querySupplier.get())
                .withSingleResultPagination(p -> singleSupplier.get())
                .withPage(pageFunction)
                .build();
```

### UNCHECKED_WARNING
Unchecked call to 'withStreamPagination(Function\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/AbstractGraphRepositoryProxy.java`
#### Snippet
```java
        };

        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(querySupplier)
                .withSingleResult(singleSupplier)
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(p -> querySupplier.get())
                .withSingleResultPagination(p -> singleSupplier.get())
                .withPage(pageFunction)
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/ParameterConverter.java`
#### Snippet
```java
            GenericParameterMetaData genericParameter = (GenericParameterMetaData) metaData;
            Collection elements = genericParameter.getCollectionInstance();
            List<List<Document>> embeddable = (List<List<Document>>) document.get();
            for (List<Document> columnList : embeddable) {
                Object element = converter.toEntity(genericParameter.getElementType(), columnList);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/ParameterConverter.java`
#### Snippet
```java
            for (List<Document> columnList : embeddable) {
                Object element = converter.toEntity(genericParameter.getElementType(), columnList);
                elements.add(element);
            }
            builder.add(elements);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'X'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/DefaultDocumentFieldValue.java`
#### Snippet
```java
        if (optionalConverter.isPresent()) {
            AttributeConverter<X, Y> attributeConverter = converters.get(optionalConverter.get());
            return singletonList(Document.of(getName(), attributeConverter.convertToDatabaseColumn((X) value())));
        }
        return singletonList(Document.of(getName(), value()));
```

### UNCHECKED_WARNING
Unchecked call to 'DocumentRepositoryProxy(JNoSQLDocumentTemplate, EntitiesMetadata, Class, Converters)' as a member of raw type 'org.eclipse.jnosql.mapping.document.query.DocumentRepositoryProxy'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/RepositoryDocumentBean.java`
#### Snippet
```java
        Converters converters = getInstance(Converters.class);

        DocumentRepositoryProxy handler = new DocumentRepositoryProxy(template,
                entities, type, converters);
        return (T) Proxy.newProxyInstance(type.getClassLoader(),
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/RepositoryDocumentBean.java`
#### Snippet
```java
        DocumentRepositoryProxy handler = new DocumentRepositoryProxy(template,
                entities, type, converters);
        return (T) Proxy.newProxyInstance(type.getClassLoader(),
                new Class[]{type},
                handler);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'R'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/DocumentRepositoryProducer.java`
#### Snippet
```java
        DocumentRepositoryProxy<R> handler = new DocumentRepositoryProxy<>(template,
                entities, repositoryClass, converters);
        return (R) Proxy.newProxyInstance(repositoryClass.getClassLoader(),
                new Class[]{repositoryClass},
                handler);
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'executeFindByQuery(Method, Object\[\], Class, DocumentQuery)' as a member of raw type 'org.eclipse.jnosql.mapping.document.query.BaseDocumentRepository'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/AbstractDocumentRepositoryProxy.java`
#### Snippet
```java
            }
            case FIND_BY -> {
                return executeFindByQuery(method, args, typeClass, getQuery(method, args));
            }
            case COUNT_BY -> {
```

### UNCHECKED_WARNING
Unchecked call to 'executeFindByQuery(Method, Object\[\], Class, DocumentQuery)' as a member of raw type 'org.eclipse.jnosql.mapping.document.query.BaseDocumentRepository'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/AbstractDocumentRepositoryProxy.java`
#### Snippet
```java
            case FIND_ALL -> {
                DocumentQuery queryFindAll = select().from(getEntityMetadata().name()).build();
                return executeFindByQuery(method, args, typeClass, updateQueryDynamically(args, queryFindAll));
            }
            case DELETE_BY -> {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/DocumentRepositoryProxy.java`
#### Snippet
```java
                            Class<?> repositoryType, Converters converters) {
        this.template = template;
        Class<T> typeClass = (Class) ((ParameterizedType) repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0];
        this.entityMetadata = entities.get(typeClass);
        this.repository = new DocumentRepository(template, entityMetadata);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'Y'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/FieldConverter.java`
#### Snippet
```java
                if (optionalConverter.isPresent()) {
                    AttributeConverter<X, Y> attributeConverter = converter.getConverters().get(optionalConverter.get());
                    Y attr = (Y)(value.isInstanceOf(List.class) ? document : value.get());
                    Object attributeConverted = attributeConverter.convertToEntityAttribute(attr);
                    field.write(instance, field.value(Value.of(attributeConverted)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Set' to 'java.util.Set'. Reason: 'map' has raw type, so result of entrySet is erased
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/FieldConverter.java`
#### Snippet
```java
                List<Document> embeddedDocument = new ArrayList<>();

                for (Map.Entry entry : (Set<Map.Entry>) map.entrySet()) {
                    embeddedDocument.add(Document.of(entry.getKey().toString(), entry.getValue()));
                }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/FieldConverter.java`
#### Snippet
```java
                GenericFieldMapping genericField = (GenericFieldMapping) field;
                Collection collection = genericField.getCollectionInstance();
                List<List<Document>> embeddable = (List<List<Document>>) document.get();
                for (List<Document> documentList : embeddable) {
                    Object element = converter.toEntity(genericField.getElementType(), documentList);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/FieldConverter.java`
#### Snippet
```java
                for (List<Document> documentList : embeddable) {
                    Object element = converter.toEntity(genericField.getElementType(), documentList);
                    collection.add(element);
                }
                field.write(instance, collection);
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/DocumentEntityConverter.java`
#### Snippet
```java

        if (type.getClass().isRecord()) {
            return (T) toEntity(type.getClass(), entity.documents());
        }
        EntityMetadata mapping = getEntities().get(type.getClass());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/configuration/DocumentManagerSupplier.java`
#### Snippet
```java
                .map(c -> {
                    final Reflections reflections = CDI.current().select(Reflections.class).get();
                    return (DocumentConfiguration) reflections.newInstance(c);
                }).orElseGet(DocumentConfiguration::getConfiguration);

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/AbstractDocumentRepository.java`
#### Snippet
```java

    private Class<T> getType() {
        return (Class<T>) getEntityMetadata().type();
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/AbstractDocumentRepository.java`
#### Snippet
```java
        Objects.requireNonNull(entity, "Entity is required");
        Object id = getIdField().read(entity);
        if (nonNull(id) && existsById((K) id)) {
            return getTemplate().update(entity);
        } else {
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'jakarta.data.repository.Page', required 'jakarta.data.repository.Page'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/AbstractDocumentRepository.java`
#### Snippet
```java

    @Override
    public Page findAll(Pageable pageable) {
        Objects.requireNonNull(pageable, "pageable is required");
        EntityMetadata metadata = getEntityMetadata();
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'java.util.stream.Stream', required 'java.util.stream.Stream'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/AbstractDocumentRepository.java`
#### Snippet
```java

    @Override
    public Stream findAll() {
        return getTemplate().findAll(getType());
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/AbstractDocumentRepository.java`
#### Snippet
```java
    private Function optionalToStream() {
        return id -> {
            Optional entity = this.findById((K) id);
            return entity.isPresent() ? Stream.of(entity.get()) : Stream.empty();
        };
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Stream' to 'java.util.stream.Stream'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/AbstractDocumentRepository.java`
#### Snippet
```java
    public Stream<T> findAllById(Iterable<K> ids) {
        requireNonNull(ids, "ids is required");
        return  stream(ids.spliterator(), false)
                .flatMap(optionalToStream());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.function.Function' to 'java.util.function.Function\>'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/AbstractDocumentRepository.java`
#### Snippet
```java
        requireNonNull(ids, "ids is required");
        return  stream(ids.spliterator(), false)
                .flatMap(optionalToStream());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/KeyValueWorkflow.java`
#### Snippet
```java
        Function<T, KeyValueEntity> convertKeyValue = t -> getConverter().toKeyValue(t);

        Function<KeyValueEntity, T> converterEntity = t -> getConverter().toEntity((Class<T>) entity.getClass(), t);

        UnaryOperator<T> firePostEntity = t -> {
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'java.lang.Class', required 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/query/KeyValueRepositoryProxy.java`
#### Snippet
```java

    @Override
    protected Class getType() {
        return type;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/query/KeyValueRepositoryProxy.java`
#### Snippet
```java

    KeyValueRepositoryProxy(Class<?> repositoryType, KeyValueTemplate template) {
        Class<T> typeClass = (Class) ((ParameterizedType) repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0];
        this.repository = new DefaultKeyValueRepository(typeClass, template);
        this.template = template;
```

### UNCHECKED_WARNING
Unchecked call to 'DefaultKeyValueRepository(Class, KeyValueTemplate)' as a member of raw type 'org.eclipse.jnosql.mapping.keyvalue.query.DefaultKeyValueRepository'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/query/KeyValueRepositoryProxy.java`
#### Snippet
```java
        Class<T> typeClass = (Class) ((ParameterizedType) repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0];
        this.repository = new DefaultKeyValueRepository(typeClass, template);
        this.template = template;
        this.type = typeClass;
```

### UNCHECKED_WARNING
Unchecked call to 'withClassSource(Class)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/BaseDocumentRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, DocumentQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
```

### UNCHECKED_WARNING
Unchecked call to 'withPage(Function\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/BaseDocumentRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, DocumentQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
                .withSingleResult(() -> getTemplate().singleResult(query))
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(streamPagination(query))
                .withSingleResultPagination(getSingleResult(query))
                .withPage(getPage(query))
                .build();
        return dynamicReturn.execute();
```

### UNCHECKED_WARNING
Unchecked call to 'withResult(Supplier\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/BaseDocumentRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, DocumentQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
                .withSingleResult(() -> getTemplate().singleResult(query))
                .withPagination(DynamicReturn.findPageable(args))
```

### UNCHECKED_WARNING
Unchecked call to 'withSingleResult(Supplier\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/BaseDocumentRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, DocumentQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
                .withSingleResult(() -> getTemplate().singleResult(query))
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(streamPagination(query))
```

### UNCHECKED_WARNING
Unchecked call to 'withSingleResultPagination(Function\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/BaseDocumentRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, DocumentQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
                .withSingleResult(() -> getTemplate().singleResult(query))
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(streamPagination(query))
                .withSingleResultPagination(getSingleResult(query))
                .withPage(getPage(query))
                .build();
```

### UNCHECKED_WARNING
Unchecked call to 'withStreamPagination(Function\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/query/BaseDocumentRepository.java`
#### Snippet
```java

    protected Object executeFindByQuery(Method method, Object[] args, Class<?> typeClass, DocumentQuery query) {
        DynamicReturn<?> dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(() -> getTemplate().select(query))
                .withSingleResult(() -> getTemplate().singleResult(query))
                .withPagination(DynamicReturn.findPageable(args))
                .withStreamPagination(streamPagination(query))
                .withSingleResultPagination(getSingleResult(query))
                .withPage(getPage(query))
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/KeyValuePreparedStatement.java`
#### Snippet
```java
        if (singleResult.isPresent()) {
            requireNonNull(type, "type is required when the command returns value");
            return singleResult.map(v -> v.get((Class<T>) type));
        }
        return Optional.empty();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/KeyValuePreparedStatement.java`
#### Snippet
```java
        Stream<Value> values = preparedStatement.result();
        requireNonNull(type, "type is required when the command returns value");
        return values.map(v -> v.get((Class<T>) type));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Iterable' to 'java.lang.Iterable'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/query/AbstractKeyValueRepository.java`
#### Snippet
```java
    @Override
    public Iterable saveAll(Iterable entities) {
        return getTemplate().put(entities);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'getTemplate().get(keys, type)' has raw type, so result of spliterator is erased
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/query/AbstractKeyValueRepository.java`
#### Snippet
```java
    @Override
    public Stream findAllById(Iterable keys) {
        return StreamSupport.stream(getTemplate().get(keys, type).spliterator(), false);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Iterable' to 'java.lang.Iterable'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/query/AbstractKeyValueRepository.java`
#### Snippet
```java
    @Override
    public Stream findAllById(Iterable keys) {
        return StreamSupport.stream(getTemplate().get(keys, type).spliterator(), false);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Iterable' to 'java.lang.Iterable'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/query/AbstractKeyValueRepository.java`
#### Snippet
```java
    @Override
    public void deleteAllById(Iterable ids) {
        getTemplate().delete(ids);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'convertToEntityAttribute(Y)' as a member of raw type 'org.eclipse.jnosql.mapping.AttributeConverter'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/KeyValueEntityConverter.java`
#### Snippet
```java
            AttributeConverter attributeConverter = getConverters().get(id.getConverter().get());
            if (toEntity) {
                return attributeConverter.convertToEntityAttribute(key);
            } else {
                return attributeConverter.convertToDatabaseColumn(key);
```

### UNCHECKED_WARNING
Unchecked call to 'convertToDatabaseColumn(X)' as a member of raw type 'org.eclipse.jnosql.mapping.AttributeConverter'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/KeyValueEntityConverter.java`
#### Snippet
```java
                return attributeConverter.convertToEntityAttribute(key);
            } else {
                return attributeConverter.convertToDatabaseColumn(key);
            }
        } else {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'R'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/query/KeyValueRepositoryProducer.java`
#### Snippet
```java

        KeyValueRepositoryProxy<T> handler = new KeyValueRepositoryProxy<>(repositoryClass, template);
        return (R) Proxy.newProxyInstance(repositoryClass.getClassLoader(),
                new Class[]{repositoryClass},
                handler);
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/configuration/BucketManagerSupplier.java`
#### Snippet
```java
                .map(c -> {
                    final Reflections reflections = CDI.current().select(Reflections.class).get();
                    return (KeyValueConfiguration) reflections.newInstance(c);
                }).orElseGet(KeyValueConfiguration::getConfiguration);

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.communication.keyvalue.KeyValueConfiguration' to 'T'
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/KeyValueConfiguration.java`
#### Snippet
```java
     */
    static <T extends KeyValueConfiguration> T getConfiguration() {
       return (T) ServiceLoader.load(KeyValueConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
               .findFirst().orElseThrow(() -> new CommunicationException("No KeyValueConfiguration implementation found!"));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.communication.keyvalue.KeyValueConfiguration' to 'T'
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/KeyValueConfiguration.java`
#### Snippet
```java
    static <T extends KeyValueConfiguration> T getConfiguration(Class<T> type) {
        Objects.requireNonNull(type, "service is required");
        return (T) ServiceLoader.load(KeyValueConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .filter(type::isInstance)
                .findFirst().orElseThrow(() -> new CommunicationException("No KeyValueConfiguration implementation found!"));
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'KeyValueRepositoryProxy(Class, KeyValueTemplate)' as a member of raw type 'org.eclipse.jnosql.mapping.keyvalue.query.KeyValueRepositoryProxy'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/query/RepositoryKeyValueBean.java`
#### Snippet
```java
        KeyValueTemplate template = provider.isEmpty() ? getInstance(KeyValueTemplate.class) :
                getInstance(KeyValueTemplate.class, DatabaseQualifier.ofKeyValue(provider));
        KeyValueRepositoryProxy handler = new KeyValueRepositoryProxy(type, template);
        return (T) Proxy.newProxyInstance(type.getClassLoader(),
                new Class[]{type},
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/query/RepositoryKeyValueBean.java`
#### Snippet
```java
                getInstance(KeyValueTemplate.class, DatabaseQualifier.ofKeyValue(provider));
        KeyValueRepositoryProxy handler = new KeyValueRepositoryProxy(type, template);
        return (T) Proxy.newProxyInstance(type.getClassLoader(),
                new Class[]{type},
                handler);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'jakarta.enterprise.inject.spi.Bean\>' to 'jakarta.enterprise.inject.spi.Bean'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/Converters.java`
#### Snippet
```java
        Iterator<Bean<?>> iterator = beanManager.getBeans(entity).iterator();
        if (iterator.hasNext()) {
            Bean<T> bean = (Bean<T>) iterator.next();
            CreationalContext<T> ctx = beanManager.createCreationalContext(bean);
            return (T) beanManager.getReference(bean, entity, ctx);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/Converters.java`
#### Snippet
```java
            Bean<T> bean = (Bean<T>) iterator.next();
            CreationalContext<T> ctx = beanManager.createCreationalContext(bean);
            return (T) beanManager.getReference(bean, entity, ctx);
        } else {
            LOGGER.info("The entity type: " + entity + " not found on CDI context, creating by constructor");
```

### UNCHECKED_WARNING
Unchecked call to 'convertToDatabaseColumn(X)' as a member of raw type 'org.eclipse.jnosql.mapping.AttributeConverter'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/util/ConverterUtil.java`
#### Snippet
```java
                return value;
            }
            return a.convertToDatabaseColumn(value);
        };
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>\>' to 'java.lang.Class\>'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/AbstractFieldMapping.java`
#### Snippet
```java
    @Override
    public <X, Y, T extends AttributeConverter<X, Y>> Optional<Class<? extends AttributeConverter<X, Y>>> getConverter() {
        return Optional.ofNullable((Class<? extends AttributeConverter<X, Y>>) converter);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/DefaultEntityMetadata.java`
#### Snippet
```java
    @Override
    public <T> T newInstance() {
        return (T) instanceSupplier.get();
    }

```

### UNCHECKED_WARNING
Unchecked call to 'test(T)' as a member of raw type 'java.util.function.Predicate'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/GenericParameterMetaData.java`
#### Snippet
```java
                .map(ServiceLoader.Provider::get)
                .map(CollectionSupplier.class::cast)
                .filter(c -> c.test(type))
                .findFirst()
                .orElseThrow(() -> new UnsupportedOperationException("This collection is not supported yet: " + type));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/config/MicroProfileSettings.java`
#### Snippet
```java
        Objects.requireNonNull(key, "key is required");
        Objects.requireNonNull(defaultValue, "defaultValue is required");
        Class<T> type = (Class<T>) defaultValue.getClass();
        return get(key, type).orElse(defaultValue);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>\>' to 'java.lang.Class\>'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/DefaultParameterMetaData.java`
#### Snippet
```java
    @Override
    public <X, Y, T extends AttributeConverter<X, Y>> Optional<Class<? extends AttributeConverter<X, Y>>> getConverter() {
        return Optional.ofNullable((Class<? extends AttributeConverter<X, Y>>)converter);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'getAnnotation(Class)' as a member of raw type 'java.lang.Class'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/GenericFieldMapping.java`
#### Snippet
```java

    private boolean hasFieldAnnotation(Class<?> annotation) {
        return ((Class) ((ParameterizedType) nativeField()
                .getGenericType())
                .getActualTypeArguments()[0])
                .getAnnotation(annotation) != null;
    }

```

### UNCHECKED_WARNING
Unchecked call to 'test(T)' as a member of raw type 'java.util.function.Predicate'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/GenericFieldMapping.java`
#### Snippet
```java
                .map(ServiceLoader.Provider::get)
                .map(CollectionSupplier.class::cast)
                .filter(c -> c.test(type))
                .findFirst()
                .orElseThrow(() -> new UnsupportedOperationException("This collection is not supported yet: " + type));
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/ConstructorBuilder.java`
#### Snippet
```java
            Event<ConstructorEvent> event = instance.get();
            event.fire(ConstructorEvent.of(constructor, values.toArray()));
            return (T) constructor.newInstance(values.toArray());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new MappingException("There is an issue to create a new instance of this class" +
```

### UNCHECKED_WARNING
Unchecked call to 'withClassSource(Class)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturnConverter.java`
#### Snippet
```java
        Supplier<Optional<?>> singleSupplier = DynamicReturn.toSingleResult(method).apply(streamSupplier);

        DynamicReturn dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(streamSupplier)
```

### UNCHECKED_WARNING
Unchecked call to 'withResult(Supplier\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturnConverter.java`
#### Snippet
```java
        Supplier<Optional<?>> singleSupplier = DynamicReturn.toSingleResult(method).apply(streamSupplier);

        DynamicReturn dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(streamSupplier)
                .withSingleResult(singleSupplier)
                .build();
```

### UNCHECKED_WARNING
Unchecked call to 'withSingleResult(Supplier\>)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn.DefaultDynamicReturnBuilder'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturnConverter.java`
#### Snippet
```java
        Supplier<Optional<?>> singleSupplier = DynamicReturn.toSingleResult(method).apply(streamSupplier);

        DynamicReturn dynamicReturn = DynamicReturn.builder()
                .withClassSource(typeClass)
                .withMethodSource(method)
                .withResult(streamSupplier)
                .withSingleResult(singleSupplier)
                .build();

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.reflect.Constructor\>' to 'java.lang.reflect.Constructor'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/Reflections.java`
#### Snippet
```java
                .findFirst();
        if (publicConstructor.isPresent()) {
            return (Constructor<T>) publicConstructor.get();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.reflect.Constructor\>' to 'java.lang.reflect.Constructor'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/Reflections.java`
#### Snippet
```java
        Constructor<?> constructor = constructors.get(0);
        constructor.setAccessible(true);
        return (Constructor<T>) constructor;
    }

```

### UNCHECKED_WARNING
Unchecked call to 'DynamicReturn(Class, Method, Supplier\>, Supplier\>, Pageable, Function\>, Function\>, ...)' as a member of raw type 'org.eclipse.jnosql.mapping.repository.DynamicReturn'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturn.java`
#### Snippet
```java
            }

            return new DynamicReturn(classSource, methodSource, singleResult, result,
                    pagination, singleResultPagination, streamPagination, page);
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.communication.document.DocumentConfiguration' to 'T'
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentConfiguration.java`
#### Snippet
```java
     */
    static <T extends DocumentConfiguration> T getConfiguration() {
        return (T) ServiceLoader.load(DocumentConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .findFirst().orElseThrow(() -> new CommunicationException("No DocumentConfiguration implementation found!"));

    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.jnosql.communication.document.DocumentConfiguration' to 'T'
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentConfiguration.java`
#### Snippet
```java
     */
    static <T extends DocumentConfiguration> T getConfiguration(Class<T> type) {
        return (T) ServiceLoader.load(DocumentConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .filter(type::isInstance)
                .findFirst().orElseThrow(() -> new CommunicationException("No DocumentConfiguration implementation found!"));
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/JsonObjects.java`
#### Snippet
```java

    static List<Document> getDocuments(JsonObject jsonObject) {
        Map<String, Object> map = JSON.fromJson(jsonObject.toString(), Map.class);
        return Documents.of(map);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Documents.java`
#### Snippet
```java

        if (value instanceof Map) {
            List list = Documents.of((Map.class.cast(value)));
            if(list.size() == 1) {
                return list.get(0);
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Documents.java`
#### Snippet
```java
        }
        if (value instanceof Iterable) {
            return stream(Iterable.class.cast(value).spliterator(), false)
                    .map(Documents::getValue).collect(toList());
        }
        return value;
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Documents.java`
#### Snippet
```java
        }
        if (value instanceof Iterable) {
            return stream(Iterable.class.cast(value).spliterator(), false)
                    .map(Documents::getValue).collect(toList());
        }
        return value;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Documents.java`
#### Snippet
```java
        }
        if (value instanceof Iterable) {
            return stream(Iterable.class.cast(value).spliterator(), false)
                    .map(Documents::getValue).collect(toList());
        }
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.lang.Iterable'
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentEntity.java`
#### Snippet
```java
        } else if (value instanceof Iterable) {
            List<Object> list = new ArrayList<>();
            Iterable.class.cast(value).forEach(e -> list.add(convert(e)));
            return list;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentCondition.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {

            long count = (int) StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).count();

            if (count != 2) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java

    /**
     * A wrapper {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#getLeafObjects}
     *
     * @param <T> the entity type
```

### JavadocReference
Cannot resolve symbol `getLeafObjects`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java

    /**
     * A wrapper {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#getLeafObjects}
     *
     * @param <T> the entity type
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java
    /**
     * Returns a {@link Stream} of  it is a wrapper of
     * {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#getLeafTrees}
     *
     * @return a stream of
```

### JavadocReference
Cannot resolve symbol `getLeafTrees`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java
    /**
     * Returns a {@link Stream} of  it is a wrapper of
     * {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#getLeafTrees}
     *
     * @return a stream of
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java
    /**
     * Returns a {@link Stream} of  it is a wrapper of
     * {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#getObjectsAtDepth(int)}
     *
     * @param depth the depth
```

### JavadocReference
Cannot resolve symbol `getObjectsAtDepth(int)`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java
    /**
     * Returns a {@link Stream} of  it is a wrapper of
     * {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#getObjectsAtDepth(int)}
     *
     * @param depth the depth
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java

    /**
     * A wrapper {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#keySet()}
     *
     * @param <T> the entity type
```

### JavadocReference
Cannot resolve symbol `keySet()`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java

    /**
     * A wrapper {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#keySet()}
     *
     * @param <T> the entity type
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java
    /**
     * Returns a {@link Stream} of  it is a wrapper of
     * {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#getTreesAtDepth(int)}
     *
     * @param depth the depth
```

### JavadocReference
Cannot resolve symbol `getTreesAtDepth(int)`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java
    /**
     * Returns a {@link Stream} of  it is a wrapper of
     * {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#getTreesAtDepth(int)}
     *
     * @param depth the depth
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java

/**
 * A wrapper of {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree} to manipulate entities classes.
 */
public interface EntityTree {
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java

    /**
     * It is a wrapper of {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#isLeaf()}
     *
     * @return true if is leaf or not
```

### JavadocReference
Cannot resolve symbol `isLeaf()`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityTree.java`
#### Snippet
```java

    /**
     * It is a wrapper of {@link org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree#isLeaf()}
     *
     * @return true if is leaf or not
```

### JavadocReference
Cannot resolve symbol `Vertex`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphWorkflow.java`
#### Snippet
```java

/**
 * This implementation defines the workflow to insert an Entity on {@link Vertex}.
 * The default implementation follows:
 *  <p>{@link GraphEventPersistManager#firePreEntity(Object)}</p>
```

### JavadocReference
Cannot resolve symbol `Graph`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphConfiguration.java`
#### Snippet
```java

/**
 * The Configuration that creates an instance of {@link Graph} that given a {@link Settings} make an  {@link Graph} instance.
 */
public interface GraphConfiguration extends Function<Settings, Graph> {
```

### JavadocReference
Cannot resolve symbol `Graph`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphConfiguration.java`
#### Snippet
```java

/**
 * The Configuration that creates an instance of {@link Graph} that given a {@link Settings} make an  {@link Graph} instance.
 */
public interface GraphConfiguration extends Function<Settings, Graph> {
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Edge`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeEntity.java`
#### Snippet
```java

/**
 * It is a wrapper of {@link org.apache.tinkerpop.gremlin.structure.Edge} that links two Entity.
 * Along with its Property objects, an Edge has both a Direction and a label.
 * Any Change at the Edge is automatically continued in the database. However, any, change in the Entity will be ignored.
```

### JavadocReference
Cannot resolve symbol `GraphTraversalSource`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTraversalSourceSupplier.java`
#### Snippet
```java

/**
 * A {@link Supplier} to {@link GraphTraversalSource}
 */
public interface GraphTraversalSourceSupplier extends Supplier<GraphTraversalSource> {
```

### JavadocReference
Cannot resolve symbol `DedupGlobalStep`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexTraversal.java`
#### Snippet
```java
     *
     * @param labels if labels are provided, then the scoped object's labels determine de-duplication. No labels implies current object.
     * @return the traversal with an appended {@link DedupGlobalStep}.
     */
    VertexTraversal dedup(final String... labels);
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Vertex`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexTraversal.java`
#### Snippet
```java

/**
 * The Graph Traversal that maps {@link org.apache.tinkerpop.gremlin.structure.Vertex}.
 * This Traversal is lazy, in other words, that just run after any finalizing method.
 */
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Element`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexTraversal.java`
#### Snippet
```java

    /**
     * Map the {@link org.apache.tinkerpop.gremlin.structure.Element} to a {@link java.util.Map} of the properties key'd according
     * to their {@link org.apache.tinkerpop.gremlin.structure.Property#key}.
     * If no property keys are provided, then all properties are retrieved.
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Property`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexTraversal.java`
#### Snippet
```java
    /**
     * Map the {@link org.apache.tinkerpop.gremlin.structure.Element} to a {@link java.util.Map} of the properties key'd according
     * to their {@link org.apache.tinkerpop.gremlin.structure.Property#key}.
     * If no property keys are provided, then all properties are retrieved.
     *
```

### JavadocReference
Cannot resolve symbol `key`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexTraversal.java`
#### Snippet
```java
    /**
     * Map the {@link org.apache.tinkerpop.gremlin.structure.Element} to a {@link java.util.Map} of the properties key'd according
     * to their {@link org.apache.tinkerpop.gremlin.structure.Property#key}.
     * If no property keys are provided, then all properties are retrieved.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Element`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeConditionTraversal.java`
#### Snippet
```java

    /**
     * Map the {@link org.apache.tinkerpop.gremlin.structure.Element} to the values of the associated properties given the provide property keys.
     * If no property keys are provided, then all property values are emitted.
     *
```

### JavadocReference
Cannot resolve symbol `DedupGlobalStep`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeTraversal.java`
#### Snippet
```java
     *
     * @param labels if labels are provided, then the scoped object's labels determine de-duplication. No labels implies current object.
     * @return the traversal with an appended {@link DedupGlobalStep}.
     */
    EdgeTraversal dedup(final String... labels);
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Edge`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeTraversal.java`
#### Snippet
```java

/**
 * The Graph Traversal that maps {@link org.apache.tinkerpop.gremlin.structure.Edge}.
 * This Traversal is lazy, in other words, that just run after any finalizing method.
 */
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Element`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeTraversal.java`
#### Snippet
```java

    /**
     * Map the {@link org.apache.tinkerpop.gremlin.structure.Element} to a {@link java.util.Map} of the properties key'd according
     * to their {@link org.apache.tinkerpop.gremlin.structure.Property#key}.
     * If no property keys are provided, then all properties are retrieved.
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Property`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeTraversal.java`
#### Snippet
```java
    /**
     * Map the {@link org.apache.tinkerpop.gremlin.structure.Element} to a {@link java.util.Map} of the properties key'd according
     * to their {@link org.apache.tinkerpop.gremlin.structure.Property#key}.
     * If no property keys are provided, then all properties are retrieved.
     *
```

### JavadocReference
Cannot resolve symbol `key`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeTraversal.java`
#### Snippet
```java
    /**
     * Map the {@link org.apache.tinkerpop.gremlin.structure.Element} to a {@link java.util.Map} of the properties key'd according
     * to their {@link org.apache.tinkerpop.gremlin.structure.Property#key}.
     * If no property keys are provided, then all properties are retrieved.
     *
```

### JavadocReference
Cannot resolve symbol `Transaction`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
     * Gets the current transaction
     *
     * @return the current {@link Transaction}
     */
    Transaction transaction();
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Vertex`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java

    /**
     * Deletes {@link org.apache.tinkerpop.gremlin.structure.Vertex} instances
     *
     * @param ids the ids to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.T`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
     * Deletes {@link org.apache.tinkerpop.gremlin.structure.Vertex} instances
     *
     * @param ids the ids to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
     * @param <T> the id type
     * @throws NullPointerException when id is null
```

### JavadocReference
Cannot resolve symbol `id`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
     * Deletes {@link org.apache.tinkerpop.gremlin.structure.Vertex} instances
     *
     * @param ids the ids to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
     * @param <T> the id type
     * @throws NullPointerException when id is null
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Edge`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
    /**
     * Either find or create an Edge between this two entities.
     * {@link org.apache.tinkerpop.gremlin.structure.Edge}
     * <pre>entityOUT ---label---&#62; entityIN.</pre>
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.T`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java

    /**
     * Find an entity given {@link org.apache.tinkerpop.gremlin.structure.T#label} and
     * {@link org.apache.tinkerpop.gremlin.structure.T#id}
     *
```

### JavadocReference
Cannot resolve symbol `label`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java

    /**
     * Find an entity given {@link org.apache.tinkerpop.gremlin.structure.T#label} and
     * {@link org.apache.tinkerpop.gremlin.structure.T#id}
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.T`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
    /**
     * Find an entity given {@link org.apache.tinkerpop.gremlin.structure.T#label} and
     * {@link org.apache.tinkerpop.gremlin.structure.T#id}
     *
     * @param id  the id to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
```

### JavadocReference
Cannot resolve symbol `id`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
    /**
     * Find an entity given {@link org.apache.tinkerpop.gremlin.structure.T#label} and
     * {@link org.apache.tinkerpop.gremlin.structure.T#id}
     *
     * @param id  the id to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.T`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
     * {@link org.apache.tinkerpop.gremlin.structure.T#id}
     *
     * @param id  the id to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
     * @param <T> the entity type
     * @param <K> the id type
```

### JavadocReference
Cannot resolve symbol `id`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
     * {@link org.apache.tinkerpop.gremlin.structure.T#id}
     *
     * @param id  the id to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
     * @param <T> the entity type
     * @param <K> the id type
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Edge`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java

    /**
     * Deletes a {@link org.apache.tinkerpop.gremlin.structure.Edge}
     *
     * @param id  the id to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.T`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
     * Deletes a {@link org.apache.tinkerpop.gremlin.structure.Edge}
     *
     * @param id  the id to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
     * @param <T> the id type
     * @throws NullPointerException when either label and id are null
```

### JavadocReference
Cannot resolve symbol `id`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
     * Deletes a {@link org.apache.tinkerpop.gremlin.structure.Edge}
     *
     * @param id  the id to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
     * @param <T> the id type
     * @throws NullPointerException when either label and id are null
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Vertex`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java

    /**
     * Deletes a {@link org.apache.tinkerpop.gremlin.structure.Vertex}
     *
     * @param id  the id to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.T`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
     * Deletes a {@link org.apache.tinkerpop.gremlin.structure.Vertex}
     *
     * @param id  the id to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
     * @param <T> the id type
     * @throws NullPointerException when id is null
```

### JavadocReference
Cannot resolve symbol `id`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
     * Deletes a {@link org.apache.tinkerpop.gremlin.structure.Vertex}
     *
     * @param id  the id to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
     * @param <T> the id type
     * @throws NullPointerException when id is null
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Edge`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java

    /**
     * Deletes {@link org.apache.tinkerpop.gremlin.structure.Edge} instances
     *
     * @param ids the ids to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.T`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
     * Deletes {@link org.apache.tinkerpop.gremlin.structure.Edge} instances
     *
     * @param ids the ids to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
     * @param <T> the id type
     * @throws NullPointerException when either label and id are null
```

### JavadocReference
Cannot resolve symbol `id`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
     * Deletes {@link org.apache.tinkerpop.gremlin.structure.Edge} instances
     *
     * @param ids the ids to be used in the query {@link org.apache.tinkerpop.gremlin.structure.T#id}
     * @param <T> the id type
     * @throws NullPointerException when either label and id are null
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Vertex`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
/**
 * GraphTemplate is a helper class that increases productivity when performing common Graph operations.
 * Includes integrated object mapping between documents and POJOs {@link org.apache.tinkerpop.gremlin.structure.Vertex}
 * and {@link org.apache.tinkerpop.gremlin.structure.Edge}.
 * It represents the common operation between an entity and {@link org.apache.tinkerpop.gremlin.structure.Graph}
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Edge`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
 * GraphTemplate is a helper class that increases productivity when performing common Graph operations.
 * Includes integrated object mapping between documents and POJOs {@link org.apache.tinkerpop.gremlin.structure.Vertex}
 * and {@link org.apache.tinkerpop.gremlin.structure.Edge}.
 * It represents the common operation between an entity and {@link org.apache.tinkerpop.gremlin.structure.Graph}
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Graph`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
 * Includes integrated object mapping between documents and POJOs {@link org.apache.tinkerpop.gremlin.structure.Vertex}
 * and {@link org.apache.tinkerpop.gremlin.structure.Edge}.
 * It represents the common operation between an entity and {@link org.apache.tinkerpop.gremlin.structure.Graph}
 *
 * @see org.apache.tinkerpop.gremlin.structure.Graph
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Graph`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
 * It represents the common operation between an entity and {@link org.apache.tinkerpop.gremlin.structure.Graph}
 *
 * @see org.apache.tinkerpop.gremlin.structure.Graph
 */
public interface GraphTemplate extends Template {
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Edge`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTemplate.java`
#### Snippet
```java
    /**
     * Either find or create an Edge between this two entities.
     * {@link org.apache.tinkerpop.gremlin.structure.Edge}
     * <pre>entityOUT ---label---&#62; entityIN.</pre>
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Transaction`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTransactionUtil.java`
#### Snippet
```java

/**
 * Utilitarian to {@link org.apache.tinkerpop.gremlin.structure.Transaction}
 */
final class GraphTransactionUtil {
```

### JavadocReference
Cannot resolve symbol `Transaction`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTransactionUtil.java`
#### Snippet
```java

    /**
     * Holds the current transaction to don't allow a {@link Transaction#commit()}
     *
     * @param transaction the {@link Transaction}
```

### JavadocReference
Cannot resolve symbol `commit()`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTransactionUtil.java`
#### Snippet
```java

    /**
     * Holds the current transaction to don't allow a {@link Transaction#commit()}
     *
     * @param transaction the {@link Transaction}
```

### JavadocReference
Cannot resolve symbol `Transaction`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTransactionUtil.java`
#### Snippet
```java
     * Holds the current transaction to don't allow a {@link Transaction#commit()}
     *
     * @param transaction the {@link Transaction}
     */
    static void lock(Transaction transaction) {
```

### JavadocReference
Cannot resolve symbol `Transaction`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTransactionUtil.java`
#### Snippet
```java

    /**
     * Unlocks the {@link Transaction} of the current thread
     */
    static void unlock() {
```

### JavadocReference
Cannot resolve symbol `Transaction`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTransactionUtil.java`
#### Snippet
```java

    /**
     * Checks if possible to {@link Transaction#commit()},
     * if checks it the {@link Transaction} holds and if it is defined as an automatic transaction.
     *
```

### JavadocReference
Cannot resolve symbol `commit()`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTransactionUtil.java`
#### Snippet
```java

    /**
     * Checks if possible to {@link Transaction#commit()},
     * if checks it the {@link Transaction} holds and if it is defined as an automatic transaction.
     *
```

### JavadocReference
Cannot resolve symbol `Transaction`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTransactionUtil.java`
#### Snippet
```java
    /**
     * Checks if possible to {@link Transaction#commit()},
     * if checks it the {@link Transaction} holds and if it is defined as an automatic transaction.
     *
     * @param graph the graph
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphTraversalSourceOperation.java`
#### Snippet
```java
/**
 * All Graph operation go through the Graph traversal e.g. the GraphConverter and GraphTemplate implementation will use
 * {@link org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource} in all operations.
 */
@Target({FIELD, TYPE, PARAMETER})
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexRepeatTraversal.java`
#### Snippet
```java
/**
 * The wrapper step to
 * {@link org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal#repeat(org.apache.tinkerpop.gremlin.process.traversal.Traversal)}
 * in the Vertex type.
 */
```

### JavadocReference
Cannot resolve symbol `repeat(org.apache.tinkerpop.gremlin.process.traversal.Traversal)`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexRepeatTraversal.java`
#### Snippet
```java
/**
 * The wrapper step to
 * {@link org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal#repeat(org.apache.tinkerpop.gremlin.process.traversal.Traversal)}
 * in the Vertex type.
 */
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.Traversal`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexRepeatTraversal.java`
#### Snippet
```java
/**
 * The wrapper step to
 * {@link org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal#repeat(org.apache.tinkerpop.gremlin.process.traversal.Traversal)}
 * in the Vertex type.
 */
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Element`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/ValueMapTraversal.java`
#### Snippet
```java

/**
 * The Graph Traversal that maps {@link org.apache.tinkerpop.gremlin.structure.Element}.
 * This Traversal is lazy, in other words, that just run after the
 */
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeUntilTraversal.java`
#### Snippet
```java
/**
 * The Edge until wrapper of
 * {@link org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal#until(java.util.function.Predicate)}
 */
public interface EdgeUntilTraversal extends EdgeConditionTraversal {
```

### JavadocReference
Cannot resolve symbol `until(java.util.function.Predicate)`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeUntilTraversal.java`
#### Snippet
```java
/**
 * The Edge until wrapper of
 * {@link org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal#until(java.util.function.Predicate)}
 */
public interface EdgeUntilTraversal extends EdgeConditionTraversal {
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexUntilTraversal.java`
#### Snippet
```java
/**
 * The Vertex until wrapper of
 * {@link org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal#until(java.util.function.Predicate)}
 */
public interface VertexUntilTraversal extends VertexConditionTraversal {
```

### JavadocReference
Cannot resolve symbol `until(java.util.function.Predicate)`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/VertexUntilTraversal.java`
#### Snippet
```java
/**
 * The Vertex until wrapper of
 * {@link org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal#until(java.util.function.Predicate)}
 */
public interface VertexUntilTraversal extends VertexConditionTraversal {
```

### JavadocReference
Cannot resolve symbol `Property`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultProperty.java`
#### Snippet
```java

    /**
     * Creates an instance of {@link Property}
     *
     * @param key   the key
```

### JavadocReference
Cannot resolve symbol `Property`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultProperty.java`
#### Snippet
```java
     * @param value the value
     * @param <T>   the type of value
     * @return a {@link Property} instance
     * @throws NullPointerException when either key and value are null
     */
```

### JavadocReference
Cannot resolve symbol `Vertex`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityConverterByContructor.java`
#### Snippet
```java

/**
 * Given a {@link Vertex} it will create an entity from the database information using the constructor.
 * It might be a record or a class that provides constructor annotations
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Element`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeRepeatTraversal.java`
#### Snippet
```java

    /**
     * Map the {@link org.apache.tinkerpop.gremlin.structure.Element} to the values of the associated properties given the provide property keys.
     * If no property keys are provided, then all property values are emitted.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeRepeatTraversal.java`
#### Snippet
```java
/**
 * The wrapper step to
 * {@link org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal#repeat(org.apache.tinkerpop.gremlin.process.traversal.Traversal)}
 * in the Edge type.
 */
```

### JavadocReference
Cannot resolve symbol `repeat(org.apache.tinkerpop.gremlin.process.traversal.Traversal)`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeRepeatTraversal.java`
#### Snippet
```java
/**
 * The wrapper step to
 * {@link org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal#repeat(org.apache.tinkerpop.gremlin.process.traversal.Traversal)}
 * in the Edge type.
 */
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.process.traversal.Traversal`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EdgeRepeatTraversal.java`
#### Snippet
```java
/**
 * The wrapper step to
 * {@link org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal#repeat(org.apache.tinkerpop.gremlin.process.traversal.Traversal)}
 * in the Edge type.
 */
```

### JavadocReference
Cannot resolve symbol `Vertex`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphEventPersistManager.java`
#### Snippet
```java

    /**
     * Fire an event after convert the {@link Vertex},
     * from database response, to Entity.
     *
```

### JavadocReference
Cannot resolve symbol `Edge`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphConverter.java`
#### Snippet
```java

    /**
     * Converts {@link EdgeEntity} from {@link Edge} Thinkerpop
     *
     * @param edge the ThinkerPop edge
```

### JavadocReference
Cannot resolve symbol `Edge`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GraphConverter.java`
#### Snippet
```java

    /**
     * Converts {@link Edge} from {@link EdgeEntity}
     *
     * @param edge the EdgeEntity instance
```

### JavadocReference
Cannot resolve symbol `org.apache.tinkerpop.gremlin.structure.Transaction`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/Transactional.java`
#### Snippet
```java
/**
 * The Transactional annotation provides the application the ability to declaratively
 * control transaction boundaries on CDI managed beans. {@link org.apache.tinkerpop.gremlin.structure.Transaction}
 */
@InterceptorBinding
```

### JavadocReference
Cannot resolve symbol `Config`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/config/MicroProfileSettings.java`
#### Snippet
```java

/**
 *The {@link Settings} implementations that uses {@link Config}
 */
public enum MicroProfileSettings implements Settings {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Unboxing of `bool` may produce `NullPointerException`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java

        if (isAtomicBoolean) {
            return (T) new AtomicBoolean(bool);
        }
        return (T) bool;
```

### DataFlowIssue
Condition `RepositoryReturn.class::isInstance` is redundant and can be replaced with a null check
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/DynamicReturnConverter.java`
#### Snippet
```java
                .stream()
                .map(ServiceLoader.Provider::get)
                .filter(RepositoryReturn.class::isInstance)
                .map(RepositoryReturn.class::cast)
                .filter(r -> r.isCompatible(typeClass, returnType))
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Columns.java`
#### Snippet
```java

        if (value instanceof Map) {
            List list = Columns.of((Map.class.cast(value)));
            if(list.size() == 1) {
                return list.get(0);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Columns.java`
#### Snippet
```java
        }
        if (value instanceof Iterable) {
            return stream(Iterable.class.cast(value).spliterator(), false)
                    .map(Columns::getValue).collect(toList());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Column.java`
#### Snippet
```java
    private static Value getValue(Object value) {
        if (value instanceof Value) {
            return Value.class.cast(value);
        } else {
            return Value.of(value);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Conditions.java`
#### Snippet
```java
                    Values.get(condition.value(),
                            parameters)));
            case NOT -> getCondition(ConditionQueryValue.class.cast(condition.value()).get().get(0),
                    parameters, observer,
                    entity).negate();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Conditions.java`
#### Snippet
```java
                    parameters, observer,
                    entity).negate();
            case OR -> ColumnCondition.or(ConditionQueryValue.class.cast(condition.value())
                    .get()
                    .stream().map(v -> getCondition(v, parameters, observer, entity))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Conditions.java`
#### Snippet
```java
                    .stream().map(v -> getCondition(v, parameters, observer, entity))
                    .toArray(ColumnCondition[]::new));
            case AND -> ColumnCondition.and(ConditionQueryValue.class.cast(condition.value())
                    .get()
                    .stream().map(v -> getCondition(v, parameters, observer, entity))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Values.java`
#### Snippet
```java
            }
            case PARAMETER -> {
                return parameters.add(ParamQueryValue.class.cast(value).get());
            }
            case ARRAY -> {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Values.java`
#### Snippet
```java
            }
            case ARRAY -> {
                return Stream.of(ArrayQueryValue.class.cast(value).get())
                        .map(v -> get(v, parameters))
                        .collect(toList());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Values.java`
#### Snippet
```java
            }
            case FUNCTION -> {
                Function function = FunctionQueryValue.class.cast(value).get();
                String name = function.name();
                Object[] params = function.params();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Values.java`
#### Snippet
```java
                Object[] params = function.params();
                if ("convert".equals(name)) {
                    return Value.of(get(QueryValue.class.cast(params[0]), parameters))
                            .get((Class<?>) params[1]);
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Values.java`
#### Snippet
```java
            }
            case JSON -> {
                return JsonObjects.getColumns(JSONQueryValue.class.cast(value).get());
            }
            default -> throw new QueryException("There is not support to the value: " + type);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnEntity.java`
#### Snippet
```java
    private Object convert(Object value) {
        if (value instanceof Column) {
            Column column = Column.class.cast(value);
            return Collections.singletonMap(column.name(), convert(column.get()));
        } else if (value instanceof Iterable) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnEntity.java`
#### Snippet
```java
        } else if (value instanceof Iterable) {
            List<Object> list = new ArrayList<>();
            Iterable.class.cast(value).forEach(e -> list.add(convert(e)));
            return list;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnCondition.java`
#### Snippet
```java

    private static void checkBetweenClause(Object value) {
        if (Iterable.class.isInstance(value)) {

            long count = (int) StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).count();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnCondition.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {

            long count = (int) StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).count();
            if (count != 2) {
                throw new IllegalArgumentException("On ColumnCondition#between you must use an iterable" +
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DateReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Date.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DateReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CharacterReader.java`
#### Snippet
```java
    @Override
    public <T> T read(Class<T> type, Object value) {
        if (Character.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CharacterReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Character.valueOf((char) Number.class.cast(value).intValue());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CharacterReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Character.valueOf((char) Number.class.cast(value).intValue());
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        boolean isAtomicBoolean = AtomicBoolean.class.equals(type);

        if (isAtomicBoolean && AtomicBoolean.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        }
        Boolean bool = null;
        if (Boolean.class.isInstance(value)) {
            bool = Boolean.class.cast(value);
        } else if (AtomicBoolean.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        Boolean bool = null;
        if (Boolean.class.isInstance(value)) {
            bool = Boolean.class.cast(value);
        } else if (AtomicBoolean.class.isInstance(value)) {
            bool = AtomicBoolean.class.cast(value).get();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        if (Boolean.class.isInstance(value)) {
            bool = Boolean.class.cast(value);
        } else if (AtomicBoolean.class.isInstance(value)) {
            bool = AtomicBoolean.class.cast(value).get();
        } else if (Number.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
            bool = Boolean.class.cast(value);
        } else if (AtomicBoolean.class.isInstance(value)) {
            bool = AtomicBoolean.class.cast(value).get();
        } else if (Number.class.isInstance(value)) {
            bool = Number.class.cast(value).longValue() != 0;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        } else if (AtomicBoolean.class.isInstance(value)) {
            bool = AtomicBoolean.class.cast(value).get();
        } else if (Number.class.isInstance(value)) {
            bool = Number.class.cast(value).longValue() != 0;
        } else if (String.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
            bool = AtomicBoolean.class.cast(value).get();
        } else if (Number.class.isInstance(value)) {
            bool = Number.class.cast(value).longValue() != 0;
        } else if (String.class.isInstance(value)) {
            bool = Boolean.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BooleanReader.java`
#### Snippet
```java
        } else if (Number.class.isInstance(value)) {
            bool = Number.class.cast(value).longValue() != 0;
        } else if (String.class.isInstance(value)) {
            bool = Boolean.valueOf(value.toString());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(toList());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            return (List.class.equals(parameterizedType.getRawType())
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ListTypeReferenceReader.java`
#### Snippet
```java
                    || Iterable.class.equals(parameterizedType.getRawType())
                    || Collection.class.equals(parameterizedType.getRawType())) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicIntegerReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (AtomicInteger.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicIntegerReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) new AtomicInteger(Number.class.cast(value).intValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicIntegerReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) new AtomicInteger(Number.class.cast(value).intValue());
        } else {
            return (T) new AtomicInteger(Integer.parseInt(value.toString()));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicLongReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (AtomicLong.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicLongReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) new AtomicLong(Number.class.cast(value).longValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/AtomicLongReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) new AtomicLong(Number.class.cast(value).longValue());
        } else {
            return (T) new AtomicLong(Long.parseLong(value.toString()));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            return Stream.class.equals(parameterizedType.getRawType()) &&
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java

            return Stream.class.equals(parameterizedType.getRawType()) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StreamTypeReferenceReader.java`
#### Snippet
```java
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o));
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NumberReader.java`
#### Snippet
```java
    @Override
    public <T> T read(Class<T> type, Object value) {
        if (Number.class.isInstance(value)) {
            return (T) value;
        } else {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigIntegerReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (BigInteger.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigIntegerReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) BigInteger.valueOf(Number.class.cast(value).longValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigIntegerReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) BigInteger.valueOf(Number.class.cast(value).longValue());
        } else {
            return (T) BigInteger.valueOf(Long.parseLong(value.toString()));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ShortReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Short.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ShortReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Short.valueOf(Number.class.cast(value).shortValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ShortReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Short.valueOf(Number.class.cast(value).shortValue());
        } else {
            return (T) Short.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/IntegerReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Integer.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/IntegerReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Integer.valueOf(Number.class.cast(value).intValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/IntegerReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Integer.valueOf(Number.class.cast(value).intValue());
        } else {
            return (T) Integer.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DoubleReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Double.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DoubleReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Double.valueOf(Number.class.cast(value).doubleValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DoubleReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Double.valueOf(Number.class.cast(value).doubleValue());
        } else {
            return (T) Double.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (LocalDateTime.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return (T) ((Calendar) value).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return (T) ((Date) value).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateTimeReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalTimeReader.java`
#### Snippet
```java
    @Override
    public <T> T read(Class<T> type, Object value) {
        if (LocalTime.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalTimeReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return (T) ((Calendar) value).toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalTimeReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return (T) ((Date) value).toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalTimeReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            return Optional.class.equals(parameterizedType.getRawType()) &&
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalTypeReferenceReader.java`
#### Snippet
```java

            return Optional.class.equals(parameterizedType.getRawType()) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalTypeReferenceReader.java`
#### Snippet
```java

        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        return (T) Optional.ofNullable(SERVICE_PROVIDER.read(classType, value));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigDecimalReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (BigDecimal.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigDecimalReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) BigDecimal.valueOf(Number.class.cast(value).doubleValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/BigDecimalReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) BigDecimal.valueOf(Number.class.cast(value).doubleValue());
        } else {
            return (T) BigDecimal.valueOf(Double.parseDouble(value.toString()));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/StringReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (CharSequence.class.equals(type) && CharSequence.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            Type collectionType = parameterizedType.getRawType();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
                    ||
                    SortedSet.class.equals(collectionType));
            boolean isElementCompatible = Class.class.isInstance(elementType)
                    && Comparable.class.isAssignableFrom((Class<?>) elementType);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(Collectors.toCollection(TreeSet::new));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java
        List<Enum> elements = getEnumList((Class<Enum>) type);

        if (Number.class.isInstance(value)) {
            int index = Number.class.cast(value).intValue();
            return (T) elements.stream().filter(element -> element.ordinal() == index).findFirst()
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(toSet());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            return Set.class.equals(parameterizedType.getRawType()) &&
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/SetTypeReferenceReader.java`
#### Snippet
```java

            return Set.class.equals(parameterizedType.getRawType()) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/EnumReader.java`
#### Snippet
```java

        if (Number.class.isInstance(value)) {
            int index = Number.class.cast(value).intValue();
            return (T) elements.stream().filter(element -> element.ordinal() == index).findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("There is not index in enum to value: " + index));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/YearReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Year.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (LocalDate.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return (T) ((Calendar) value).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return (T) ((Date) value).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LocalDateReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/FloatReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Float.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/FloatReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Float.valueOf(Number.class.cast(value).floatValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/FloatReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Float.valueOf(Number.class.cast(value).floatValue());
        } else {
            return (T) Float.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetTimeReader.java`
#### Snippet
```java

    private OffsetTime getOffSetDateTime(Object value) {
        if (OffsetTime.class.isInstance(value)) {
            return OffsetTime.class.cast(value);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetTimeReader.java`
#### Snippet
```java
    private OffsetTime getOffSetDateTime(Object value) {
        if (OffsetTime.class.isInstance(value)) {
            return OffsetTime.class.cast(value);
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CalendarReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Calendar.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CalendarReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis( ((Number) value).longValue());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ByteReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Byte.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CalendarReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime((Date)value);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ByteReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Byte.valueOf(Number.class.cast(value).byteValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ByteReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Byte.valueOf(Number.class.cast(value).byteValue());
        } else {
            return (T) Byte.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetTimeReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return ((Calendar) value).toInstant().atZone(ZoneId.systemDefault())
                    .toOffsetDateTime().toOffsetTime();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetTimeReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return ((Date) value).toInstant().atZone(ZoneId.systemDefault())
                    .toOffsetDateTime()
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetTimeReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault())
                    .toOffsetDateTime()
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetDateTimeReader.java`
#### Snippet
```java

    private OffsetDateTime getOffSetDateTime(Object value) {
        if (OffsetDateTime.class.isInstance(value)) {
            return OffsetDateTime.class.cast(value);
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetDateTimeReader.java`
#### Snippet
```java
    private OffsetDateTime getOffSetDateTime(Object value) {
        if (OffsetDateTime.class.isInstance(value)) {
            return OffsetDateTime.class.cast(value);
        }

```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetDateTimeReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return ((Calendar) value).toInstant().atZone(ZoneId.systemDefault()).toOffsetDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetDateTimeReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return ((Date) value).toInstant().atZone(ZoneId.systemDefault()).toOffsetDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OffsetDateTimeReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault()).toOffsetDateTime();
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LongReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Long.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LongReader.java`
#### Snippet
```java
            return (T) value;
        }
        if (Number.class.isInstance(value)) {
            return (T) Long.valueOf(Number.class.cast(value).longValue());
        } else {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/LongReader.java`
#### Snippet
```java
        }
        if (Number.class.isInstance(value)) {
            return (T) Long.valueOf(Number.class.cast(value).longValue());
        } else {
            return (T) Long.valueOf(value.toString());
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/OptionalReader.java`
#### Snippet
```java
    public <T> T read(Class<T> type, Object value) {

        if (Optional.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ZonedDateTimeReader.java`
#### Snippet
```java
    @Override
    public <T> T read(Class<T> type, Object value) {
        if (ZonedDateTime.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ZonedDateTimeReader.java`
#### Snippet
```java
        }

        if (Calendar.class.isInstance(value)) {
            return (T) ((Calendar) value).toInstant().atZone(ZoneId.systemDefault());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ZonedDateTimeReader.java`
#### Snippet
```java
        }

        if (Date.class.isInstance(value)) {
            return (T) ((Date) value).toInstant().atZone(ZoneId.systemDefault());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/ZonedDateTimeReader.java`
#### Snippet
```java
        }

        if (Number.class.isInstance(value)) {
            return (T) new Date(((Number) value).longValue()).toInstant().atZone(ZoneId.systemDefault());
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/YearMonthReader.java`
#### Snippet
```java
    @Override
    public <T> T read(Class<T> type, Object value) {
        if (YearMonth.class.isInstance(value)) {
            return (T) value;
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java

    private void convertEntryToMap(Object value, Map<String, Object> map) {
        Entry entry = Entry.class.cast(value);
        Object entryValue = entry.value().get();
        if (entryValue instanceof Entry) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
        if (entryValue instanceof Entry) {
            Map<String, Object> subMap = new HashMap<>();
            Entry subEntry = Entry.class.cast(entryValue);
            convertEntryToMap(subEntry, subMap);
            map.put(entry.name(), subMap);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            return Map.class.equals(parameterizedType.getRawType()) &&
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(Collectors.toCollection(LinkedList::new));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
    public boolean test(TypeSupplier<?> typeReference) {
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        if (ParameterizedType.class.isInstance(type)) {
            ParameterizedType parameterizedType = ParameterizedType.class.cast(type);

            boolean isCollectionRight = Queue.class.equals(parameterizedType.getRawType())
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/QueueTypeReferenceReader.java`
#### Snippet
```java
                    || Deque.class.equals(parameterizedType.getRawType());
            return isCollectionRight &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java

            return Map.class.equals(parameterizedType.getRawType()) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0])
                    && Class.class.isInstance(parameterizedType.getActualTypeArguments()[1]);
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
            return Map.class.equals(parameterizedType.getRawType()) &&
                    Class.class.isInstance(parameterizedType.getActualTypeArguments()[0])
                    && Class.class.isInstance(parameterizedType.getActualTypeArguments()[1]);
        }
        return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
    public <T> T convert(TypeSupplier<T> typeReference, Object value) {
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> keyType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        Class<?> valueType = (Class<?>) Optional.of(parameterizedType.getActualTypeArguments()[1])
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
    private <K, V> Map<K, V> getMap(Class<K> keyClass, Class<V> valueClass, Object value) {

        if (Map.class.isInstance(value)) {
            return convertToMap(keyClass, valueClass, value);
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
            return convertToMap(keyClass, valueClass, value);
        }
        if (Iterable.class.isInstance(value)) {
            List<Object> collection = new ArrayList<>();
            Iterable.class.cast(value).forEach(collection::add);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            List<Object> collection = new ArrayList<>();
            Iterable.class.cast(value).forEach(collection::add);
            if (collection.isEmpty()) {
                return Collections.emptyMap();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/MapTypeReferenceReader.java`
#### Snippet
```java

    private <K, V> Map<K, V> convertToMap(Class<K> keyClass, Class<V> valueClass, Object value) {
        Map mapValue = Map.class.cast(value);
        return (Map<K, V>) mapValue.keySet().stream()
                .collect(Collectors.toMap(mapKeyElement(keyClass), mapValueElement(valueClass, mapValue)));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/query/GraphQueryMethod.java`
#### Snippet
```java
    public Object getValue(String name, QueryValue<?> value) {
        if (value instanceof BooleanQueryValue) {
            return BooleanQueryValue.class.cast(value).get();
        }
        return ConverterUtil.getValue(getValue(), mapping, name, converters);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java

    private static Object executeConvert(Params parameters, Object[] params) {
        Object value = get(QueryValue.class.cast(params[0]), parameters);
        return Value.of(value).get((Class<?>) params[1]);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java
    static Value getValue(QueryValue<?> value, Params parameters) {
        Object result = get(value, parameters);
        return result instanceof Value ? Value.class.cast(result) : Value.of(result);
    }
}
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java
            }
            case PARAMETER -> {
                return parameters.add(ParamQueryValue.class.cast(value).get());
            }
            case ARRAY -> {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java
            }
            case ARRAY -> {
                return Stream.of(ArrayQueryValue.class.cast(value).get())
                        .map(v -> get(v, parameters))
                        .collect(toList());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java
            }
            case FUNCTION -> {
                Function function = FunctionQueryValue.class.cast(value).get();
                String name = function.name();
                Object[] params = function.params();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/Values.java`
#### Snippet
```java
            }
            case JSON -> {
                return JSONQueryValue.class.cast(value).get().toString();
            }
            default -> throw new QueryException("There is not support to the value: " + type);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/KeyValueEntity.java`
#### Snippet
```java
    private static Object getKey(Object key) {
        if (key instanceof Value) {
            return Value.class.cast(key).get();
        }
        return key;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/KeyValueEntity.java`
#### Snippet
```java
    private static Value getValue(Object value) {
        if (value instanceof Value) {
            return Value.class.cast(value);
        }
        return Value.of(value);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/AbstractWhereSupplier.java`
#### Snippet
```java

        if (operator.equals(this.condition.condition())) {
            ConditionQueryValue conditionValue = ConditionQueryValue.class.cast(this.condition.value());
            List<QueryCondition> conditions = new ArrayList<>(conditionValue.get());
            conditions.add(newCondition);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/AbstractWhereSupplier.java`
#### Snippet
```java
            this.condition = new DefaultQueryCondition("_" + operator.name(), operator, ConditionQueryValue.of(conditions));
        } else {
            List<QueryCondition> conditions = ConditionQueryValue.class.cast(this.condition.value()).get();
            QueryCondition lastCondition = conditions.get(conditions.size() - 1);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/AbstractWhereSupplier.java`
#### Snippet
```java
            if (isAppendable(lastCondition) && operator.equals(lastCondition.condition())) {
                List<QueryCondition> lastConditions = new ArrayList<>(ConditionQueryValue.class
                        .cast(lastCondition.value()).get());
                lastConditions.add(newCondition);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java

        if (operator.equals(this.condition.condition())) {
            ConditionQueryValue conditionValue = ConditionQueryValue.class.cast(this.condition.value());
            List<QueryCondition> conditions = new ArrayList<>(conditionValue.get());
            conditions.add(newCondition);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
            this.condition = new MethodCondition(SUB_ENTITY_FLAG + operator.name(), operator, ConditionQueryValue.of(conditions));
        } else {
            List<QueryCondition> conditions = ConditionQueryValue.class.cast(this.condition.value()).get();
            QueryCondition lastCondition = conditions.get(conditions.size() - 1);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java

            if (isAppendable(lastCondition) && Condition.EQUALS.equals(lastCondition.condition())) {
                List<QueryCondition> lastConditions = new ArrayList<>(ConditionQueryValue.class.cast(lastCondition.value()).get());
                lastConditions.add(newCondition);

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/util/ParamsBinder.java`
#### Snippet
```java
            if (value instanceof Iterable) {
                List<Object> values = new ArrayList<>();
                for (Object item : Iterable.class.cast(value)) {
                    values.add(ConverterUtil.getValue(item, converters, field));
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Conditions.java`
#### Snippet
```java
            case BETWEEN -> between(Document.of(getName(condition, observer, entity),
                    Values.get(condition.value(), parameters)));
            case NOT -> getCondition(ConditionQueryValue.class.cast(condition.value()).get().get(0),
                    parameters, observer,
                    entity).negate();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Conditions.java`
#### Snippet
```java
                    parameters, observer,
                    entity).negate();
            case OR -> or(ConditionQueryValue.class.cast(condition.value())
                    .get()
                    .stream().map(v -> getCondition(v, parameters, observer, entity))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Conditions.java`
#### Snippet
```java
                    .stream().map(v -> getCondition(v, parameters, observer, entity))
                    .toArray(DocumentCondition[]::new));
            case AND -> and(ConditionQueryValue.class.cast(condition.value())
                    .get()
                    .stream().map(v -> getCondition(v, parameters, observer, entity))
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Document.java`
#### Snippet
```java
    private static Value getValue(Object value) {
        if (value instanceof Value) {
            return Value.class.cast(value);
        } else {
            return Value.of(value);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Values.java`
#### Snippet
```java
            }
            case PARAMETER -> {
                return parameters.add(ParamQueryValue.class.cast(value).get());
            }
            case ARRAY -> {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Values.java`
#### Snippet
```java
            }
            case ARRAY -> {
                return Stream.of(ArrayQueryValue.class.cast(value).get())
                        .map(v -> get(v, parameters))
                        .collect(toList());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Values.java`
#### Snippet
```java
            }
            case FUNCTION -> {
                Function function = FunctionQueryValue.class.cast(value).get();
                String name = function.name();
                Object[] params = function.params();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Values.java`
#### Snippet
```java
                Object[] params = function.params();
                if ("convert".equals(name)) {
                    return Value.of(get(QueryValue.class.cast(params[0]), parameters))
                            .get((Class<?>) params[1]);
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Values.java`
#### Snippet
```java
            }
            case JSON -> {
                return JsonObjects.getDocuments(JSONQueryValue.class.cast(value).get());
            }
            default -> throw new QueryException("There is not support to the value: " + type);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Documents.java`
#### Snippet
```java

        if (value instanceof Map) {
            List list = Documents.of((Map.class.cast(value)));
            if(list.size() == 1) {
                return list.get(0);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Documents.java`
#### Snippet
```java
        }
        if (value instanceof Iterable) {
            return stream(Iterable.class.cast(value).spliterator(), false)
                    .map(Documents::getValue).collect(toList());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentEntity.java`
#### Snippet
```java
    private Object convert(Object value) {
        if (value instanceof Document) {
            Document column = Document.class.cast(value);
            return singletonMap(column.name(), convert(column.get()));
        } else if (value instanceof Iterable) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentEntity.java`
#### Snippet
```java
        } else if (value instanceof Iterable) {
            List<Object> list = new ArrayList<>();
            Iterable.class.cast(value).forEach(e -> list.add(convert(e)));
            return list;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentCondition.java`
#### Snippet
```java

    private static void checkBetweenClause(Object value) {
        if (Iterable.class.isInstance(value)) {

            long count = (int) StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).count();
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentCondition.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {

            long count = (int) StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).count();

            if (count != 2) {
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toUnmodifiableList())' can be replaced with 'toList()'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/config/MicroProfileSettings.java`
#### Snippet
```java
                .filter(p -> p.startsWith(prefix))
                .map(p -> config.getValue(p, String.class))
                .collect(Collectors.toUnmodifiableList());
    }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary arguments
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/repository/RepositoryObserverParser.java`
#### Snippet
```java
        char[] chars = text.toCharArray();
        chars[0] = updatedChar;
        return new String(chars, 0, chars.length);
    }

```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/spi/AbstractBean.java`
#### Snippet
```java
public abstract class AbstractBean<T> implements Bean<T>, PassivationCapable {

    protected <T> T getInstance(Class<T> bean) {
        return CDI.current().select(bean).get();
    }
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/spi/AbstractBean.java`
#### Snippet
```java
    }

    protected <T> T getInstance(Class<T> bean, Annotation qualifier) {
        return CDI.current().select(bean, qualifier).get();
    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/InsertQuery.java`
#### Snippet
```java
     * Returns the value to insert when the query uses JSON value instead of Conditions.
     * In an insert, an operation is not able to use both: {@link InsertQuery#conditions()} and
     * {@link InsertQuery#value()}.
     * Therefore, execution will use just one operation type.
     *
```

### JavadocDeclaration
Javadoc pointing to itself
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/UpdateQuery.java`
#### Snippet
```java
     * Returns the value to update when the query uses JSON value instead of Conditions.
     * In an insert, an operation is not able to use both: {@link UpdateQuery#conditions()} and
     * {@link UpdateQuery#value()}.
     * Therefore, execution will use just one operation type.
     * @return a {@link JSONQueryValue} or {@link Optional#empty()} when it uses {@link UpdateQuery#conditions()}
```

## RuleId[id=ExtendsAnnotation]
### ExtendsAnnotation
Class 'DatabaseQualifier' implements annotation interface `Database`
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/DatabaseQualifier.java`
#### Snippet
```java
 * Utilitarian class to select the {@link Database}
 */
public final class DatabaseQualifier extends AnnotationLiteral<Database> implements Database {

    private static final DatabaseQualifier DEFAULT_DOCUMENT_PROVIDER = new DatabaseQualifier("", DOCUMENT);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/BaseQueryBuilder.java`
#### Snippet
```java
        ColumnCondition columnCondition = getColumnCondition(newCondition);

        if (nonNull(condition)) {
            if (and) {
                this.condition = condition.and(columnCondition);
            } else {
                this.condition = condition.or(columnCondition);
            }
        } else {
            this.condition = columnCondition;
        }
        this.negate = false;
        this.name = null;
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnManager.java`
#### Snippet
```java
        final Iterator<ColumnEntity> iterator = entities.iterator();
        if (!iterator.hasNext()) {
            return Optional.empty();
        }
        final ColumnEntity entity = iterator.next();
        if (!iterator.hasNext()) {
            return Optional.of(entity);
        }
        throw new NonUniqueResultException("The select returns more than one entity, select: " + query);
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnPreparedStatement.java`
#### Snippet
```java
        if (!paramsLeft.isEmpty()) {
            throw new QueryException("Check all the parameters before execute the query, params left: " + paramsLeft);
        }
        switch (type) {
            case SELECT -> {
                return manager.select(columnQuery);
            }
            case DELETE -> {
                manager.delete(columnDeleteQuery);
                return Stream.empty();
            }
            case UPDATE -> {
                return Stream.of(manager.update(entity));
            }
            case INSERT -> {
                if (Objects.isNull(duration)) {
                    return Stream.of(manager.insert(entity));
                } else {
                    return Stream.of(manager.insert(entity, duration));
                }
            }
            default -> throw new UnsupportedOperationException("there is not support to operation type: " + type);
        }
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnQueryParser.java`
#### Snippet
```java
        validation(query, manager, observer);
        String command = query.substring(0, 6);
        return switch (command) {
            case "select" -> select.query(query, manager, observer);
            case "delete" -> delete.query(query, manager, observer);
            case "insert" -> insert.query(query, manager, observer);
            case "update" -> update.query(query, manager, observer);
            default ->
                    throw new QueryException(String.format("The command was not recognized at the query %s ", query));
        };
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnQueryParser.java`
#### Snippet
```java
        validation(query, manager, observer);
        String command = query.substring(0, 6);

        return switch (command) {
            case "select" -> select.prepare(query, manager, observer);
            case "delete" -> delete.prepare(query, manager, observer);
            case "insert" -> insert.prepare(query, manager, observer);
            case "update" -> update.prepare(query, manager, observer);
            default ->
                    throw new QueryException(String.format("The command was not recognized at the query %s ", query));
        };
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/DeleteQueryParser.java`
#### Snippet
```java
        DeleteQueryConverter converter = new DeleteQueryConverter();
        DeleteQuery deleteQuery = converter.apply(query);

        String columnFamily = observer.fireEntity(deleteQuery.entity());
        List<String> columns = deleteQuery.fields().stream()
                .map(f -> observer.fireField(columnFamily, f))
                .collect(Collectors.toList());
        Params params = Params.newParams();
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/SelectQueryParser.java`
#### Snippet
```java
        SelectQueryConverter converter = new SelectQueryConverter();
        SelectQuery selectQuery = converter.apply(query);
        String columnFamily = observer.fireEntity(selectQuery.entity());
        long limit = selectQuery.limit();
        long skip = selectQuery.skip();
        List<String> columns = selectQuery.fields().stream()
                .map(f -> observer.fireField(columnFamily, f))
                .collect(Collectors.toList());
        List<Sort> sorts = selectQuery.orderBy().stream().map(s -> toSort(s, observer, columnFamily))
                .collect(toList());

        Params params = Params.newParams();
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/SelectQueryParser.java`
#### Snippet
```java
        String columnFamily = observer.fireEntity(selectQuery.entity());
        long limit = selectQuery.limit();
        long skip = selectQuery.skip();
        List<String> columns = selectQuery.fields().stream()
                .map(f -> observer.fireField(columnFamily, f))
                .collect(Collectors.toList());

        List<Sort> sorts = selectQuery.orderBy().stream().map(s -> toSort(s, observer, columnFamily)).collect(toList());
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Values.java`
#### Snippet
```java
            case FUNCTION -> {
                Function function = FunctionQueryValue.class.cast(value).get();
                String name = function.name();
                Object[] params = function.params();
                if ("convert".equals(name)) {
                    return Value.of(get(QueryValue.class.cast(params[0]), parameters))
                            .get((Class<?>) params[1]);
                }
                String message = String.format("There is not support to the function: %s with parameters %s", name,
                        Arrays.toString(params));
                throw new QueryException(message);
            }
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/NavigableSetTypeReferenceReader.java`
#### Snippet
```java
        Type type = typeReference.get();
        ParameterizedType parameterizedType = ParameterizedType.class.cast(type);
        Class<?> classType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
        if (Iterable.class.isInstance(value)) {
            Iterable iterable = Iterable.class.cast(value);
            return (T) stream(iterable.spliterator(), false).map(o -> SERVICE_PROVIDER.read(classType, o))
                    .collect(Collectors.toCollection(TreeSet::new));
        }
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/BaseQueryBuilder.java`
#### Snippet
```java
        DocumentCondition documentCondition = getDocumentCondition(newCondition);

        if (nonNull(condition)) {
            if (and) {
                this.condition = condition.and(documentCondition);
            } else {
                this.condition = condition.or(documentCondition);
            }
        } else {
            this.condition = documentCondition;
        }
        this.negate = false;
        this.name = null;
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/DocumentManager.java`
#### Snippet
```java
        final Iterator<DocumentEntity> iterator = entities.iterator();
        if (!iterator.hasNext()) {
            return Optional.empty();
        }
        final DocumentEntity entity = iterator.next();
        if (!iterator.hasNext()) {
            return Optional.of(entity);
        }
        throw new NonUniqueResultException("The select returns more than one entity, select: " + query);
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-key-value/src/main/java/org/eclipse/jnosql/communication/keyvalue/PutQueryParser.java`
#### Snippet
```java
        PutQueryConverter converter = new PutQueryConverter();
        PutQuery putQuery = converter.apply(query);
        Params params = Params.newParams();
        Value key = Values.getValue(putQuery.key(), params);
        Value value = Values.getValue(putQuery.value(), params);
        Optional<Duration> ttl = putQuery.ttl();
```

### DuplicatedCode
Duplicated code
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/AbstractSupplier.java`
#### Snippet
```java
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        lexer.addErrorListener(QueryErrorListener.INSTANCE);
        parser.addErrorListener(QueryErrorListener.INSTANCE);

        ParseTree tree = getParserTree().apply(parser);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/AbstractColumnTemplate.java`
#### Snippet
```java
        final Stream<T> select = select(query);

        final Iterator<T> iterator = select.iterator();

        if (!iterator.hasNext()) {
            return Optional.empty();
        }
        final T entity = iterator.next();

        if (!iterator.hasNext()) {
            return Optional.of(entity);
        }
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultPreparedStatement.java`
#### Snippet
```java
        final Iterator<T> iterator = entities.iterator();
        if (!iterator.hasNext()) {
            return Optional.empty();
        }
        final T entity = iterator.next();
        if (!iterator.hasNext()) {
            return Optional.of(entity);
        }
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/AbstractColumnTemplate.java`
#### Snippet
```java
        Stream<T> entities = query(query);
        final Iterator<T> iterator = entities.iterator();

        if (!iterator.hasNext()) {
            return Optional.empty();
        }
        final T entity = iterator.next();
        if (!iterator.hasNext()) {
            return Optional.of(entity);
        }
        throw new NonUniqueResultException("No unique result found to the query: " + query);
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/ColumnEntityConverter.java`
#### Snippet
```java
        EntityMetadata mapping = getEntities().get(type);
        if (mapping.isInheritance()) {
            return inheritanceToEntity(columns, mapping);
        }
        ConstructorMetadata constructor = mapping.constructor();
        if (constructor.isDefault()) {
            T instance = mapping.newInstance();
            return convertEntity(columns, mapping, instance);
        } else {
            return convertEntityByConstructor(columns, mapping);
        }
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/ColumnEntityConverter.java`
#### Snippet
```java
        final Map<String, FieldMapping> fieldsGroupByName = mapping.fieldsGroupByName();
        final List<String> names = columns.stream().map(Column::name).sorted().toList();
        final Predicate<String> existField = k -> Collections.binarySearch(names, k) >= 0;
        final Predicate<String> isElementType = k -> {
            MappingType type = fieldsGroupByName.get(k).type();
            return EMBEDDED.equals(type) || ENTITY.equals(type);
        };
        fieldsGroupByName.keySet().stream()
                .filter(existField.or(isElementType))
                .forEach(feedObject(instance, columns, fieldsGroupByName));

        return instance;
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/ColumnEntityConverter.java`
#### Snippet
```java
        Map<String, InheritanceMetadata> group = getEntities()
                .findByParentGroupByDiscriminatorValue(type);

        if (group.isEmpty()) {
            throw new MappingException("There is no discriminator inheritance to the document collection "
                    + entity.name());
        }
        String column = group.values()
                .stream()
                .findFirst()
                .map(InheritanceMetadata::getDiscriminatorColumn)
                .orElseThrow();

        String discriminator = entity.find(column, String.class)
                .orElseThrow(
                        () -> new MappingException("To inheritance there is the discriminator column missing" +
                                " on the Document Collection, the document name: " + column));

        InheritanceMetadata inheritance = Optional.ofNullable(group.get(discriminator))
                .orElseThrow(() -> new MappingException("There is no inheritance map to the discriminator" +
                        " column value " + discriminator));

        EntityMetadata mapping = getEntities().get(inheritance.getEntity());
        ConstructorMetadata constructor = mapping.constructor();
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/ColumnEntityConverter.java`
#### Snippet
```java
        Map<String, InheritanceMetadata> group = getEntities()
                .findByParentGroupByDiscriminatorValue(mapping.type());

        if (group.isEmpty()) {
            throw new MappingException("There is no discriminator inheritance to the document collection "
                    + mapping.name());
        }

        String column = group.values()
                .stream()
                .findFirst()
                .map(InheritanceMetadata::getDiscriminatorColumn)
                .orElseThrow();

        String discriminator = columns.stream()
                .filter(d -> d.name().equals(column))
                .findFirst()
                .map(d -> d.get(String.class))
                .orElseThrow(
                        () -> new MappingException("To inheritance there is the discriminator column missing" +
                                " on the Document Collection, the document name: " + column));

        InheritanceMetadata inheritance = Optional.ofNullable(group.get(discriminator))
                .orElseThrow(() -> new MappingException("There is no inheritance map to the discriminator" +
                        " column value " + discriminator));

        EntityMetadata inheritanceMetadata = getEntities().get(inheritance.getEntity());
        T instance = inheritanceMetadata.newInstance();
        return convertEntity(columns, inheritanceMetadata, instance);
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/FieldConverter.java`
#### Snippet
```java
            Field nativeField = field.nativeField();
            Object subEntity = converter.toEntity(nativeField.getType(), columns);
            EntityMetadata mapping = converter.getEntities().get(subEntity.getClass());
            boolean areAllFieldsNull = mapping.fields()
                    .stream()
                    .map(f -> f.read(subEntity))
                    .allMatch(Objects::isNull);
            if (!areAllFieldsNull) {
                field.write(instance, subEntity);
            }
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/FieldConverter.java`
#### Snippet
```java
                Collection elements = genericField.getCollectionInstance();
                List<List<Column>> embeddable = (List<List<Column>>) column.get();
                for (List<Column> columnList : embeddable) {
                    Object element = converter.toEntity(genericField.getElementType(), columnList);
                    elements.add(element);
                }
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/FieldConverter.java`
#### Snippet
```java
            if (Objects.nonNull(column)) {
                Value value = column.value();
                Optional<Class<? extends AttributeConverter<X, Y>>> optionalConverter = field.getConverter();
                if (optionalConverter.isPresent()) {
                    AttributeConverter<X, Y> attributeConverter = converter.getConverters().get(optionalConverter.get());
                    Y attr = (Y)(value.isInstanceOf(List.class) ? column : value.get());
                    Object attributeConverted = attributeConverter.convertToEntityAttribute(attr);
                    field.write(instance, field.value(Value.of(attributeConverted)));
                } else {
                    field.write(instance, field.value(value));
                }
            }
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/BaseColumnRepository.java`
#### Snippet
```java
            List<Sort> sorts = new ArrayList<>();
            sorts.addAll(query.sorts());
            sorts.addAll(special.sorts());
            long skip = limit.map(l -> l.startAt() - 1).orElse(query.skip());
            long max = limit.map(Limit::maxResults).orElse((int) query.limit());
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-column/src/main/java/org/eclipse/jnosql/mapping/column/query/BaseColumnRepository.java`
#### Snippet
```java
            long size = p.size();
            long skip = NoSQLPage.skip(p);
            List<Sort> sorts = query.sorts();
            if (!special.sorts().isEmpty()) {
                sorts = new ArrayList<>(query.sorts());
                sorts.addAll(special.sorts());
            }
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-document/src/main/java/org/eclipse/jnosql/mapping/document/FieldConverter.java`
#### Snippet
```java
                Collection collection = genericField.getCollectionInstance();
                List<List<Document>> embeddable = (List<List<Document>>) document.get();
                for (List<Document> documentList : embeddable) {
                    Object element = converter.toEntity(genericField.getElementType(), documentList);
                    collection.add(element);
                }
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultGraphTraversalSourceConverter.java`
#### Snippet
```java
        requireNonNull(entity, "entity is required");

        EntityMetadata mapping = getEntities().get(entity.getClass());
        String label = mapping.name();

        List<FieldGraph> fields = mapping.fields().stream()
                .map(f -> to(f, entity))
                .filter(FieldGraph::isNotEmpty).toList();

        Optional<FieldGraph> id = fields.stream().filter(FieldGraph::isId).findFirst();
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/DefaultGraphTraversalSourceConverter.java`
#### Snippet
```java
        fields.stream().filter(FieldGraph::isNotId)
                .flatMap(f -> f.toElements(this, getConverters()).stream())
                .forEach(p -> vertex.property(p.key(), p.value()));

        mapping.inheritance().ifPresent(i ->
                vertex.property(i.getDiscriminatorColumn(), i.getDiscriminatorValue()));

        return vertex;
```

### DuplicatedCode
Duplicated code
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/EntityConverterByField.java`
#### Snippet
```java
        Map<String, FieldMapping> fieldsGroupByName = mapping.fieldsGroupByName();
        List<String> names = elements.stream()
                .map(Property::key)
                .sorted()
                .toList();
        Predicate<String> existField = k -> Collections.binarySearch(names, k) >= 0;

        fieldsGroupByName.keySet().stream()
                .filter(existField.or(k -> EMBEDDED.equals(fieldsGroupByName.get(k).type())))
                .forEach(feedObject(instance, elements, fieldsGroupByName, vertex));
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = BETWEEN;
        ArrayQueryValue value = MethodArrayValue.of(variable);
        checkCondition(new MethodCondition(variable, operator, value), hasNot);
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = LESSER_THAN;
        appendCondition(hasNot, variable, operator);
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = IN;
        appendCondition(hasNot, variable, operator);
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = GREATER_EQUALS_THAN;
        appendCondition(hasNot, variable, operator);
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
    @Override
    public void exitEq(MethodParser.EqContext ctx) {
        Condition operator = EQUALS;
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = LESSER_EQUALS_THAN;
        appendCondition(hasNot, variable, operator);
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = LIKE;
        appendCondition(hasNot, variable, operator);
    }
```

### UnnecessaryLocalVariable
Local variable `operator` is redundant
in `jnosql-communication/jnosql-communication-query/src/main/java/org/eclipse/jnosql/communication/query/method/AbstractMethodQueryProvider.java`
#### Snippet
```java
        boolean hasNot = Objects.nonNull(ctx.not());
        String variable = getVariable(ctx.variable());
        Condition operator = GREATER_THAN;
        appendCondition(hasNot, variable, operator);
    }
```

## RuleId[id=Deprecation]
### Deprecation
'Date(java.lang.String)' is deprecated
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/DateReader.java`
#### Snippet
```java
        }

        return (T) new Date(value.toString());
    }
}
```

### Deprecation
'Date(java.lang.String)' is deprecated
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/reader/CalendarReader.java`
#### Snippet
```java
        }

        Date date = new Date(value.toString());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
```

### Deprecation
'isAccessible()' is deprecated
in `jnosql-mapping/jnosql-mapping-core/src/main/java/org/eclipse/jnosql/mapping/reflection/Reflections.java`
#### Snippet
```java
        if ((!Modifier.isPublic(field.getModifiers()) || !Modifier
                .isPublic(field.getDeclaringClass().getModifiers()))
                && !field.isAccessible()) {
            field.setAccessible(true);
        }
```

## RuleId[id=UnnecessaryDefault]
### UnnecessaryDefault
`default` branch is unnecessary
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/Conditions.java`
#### Snippet
```java
                    .stream().map(v -> getCondition(v, parameters, observer, entity))
                    .toArray(ColumnCondition[]::new));
            default -> throw new QueryException("There is not support the type: " + condition.condition());
        };
    }
```

### UnnecessaryDefault
`default` branch is unnecessary
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/Conditions.java`
#### Snippet
```java
                    .stream().map(v -> getCondition(v, parameters, observer, entity))
                    .toArray(DocumentCondition[]::new));
            default -> throw new QueryException("There is not support the type: " + condition.condition());
        };
    }
```

## RuleId[id=Java9UndeclaredServiceUsage]
### Java9UndeclaredServiceUsage
Usage of service 'org.eclipse.jnosql.communication.column.ColumnConfiguration' is not declared in module-info
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnConfiguration.java`
#### Snippet
```java
     */
    static <T extends ColumnConfiguration> T getConfiguration() {
        return (T) ServiceLoader.load(ColumnConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
```

### Java9UndeclaredServiceUsage
Usage of service 'org.eclipse.jnosql.communication.column.ColumnConfiguration' is not declared in module-info
in `jnosql-communication/jnosql-communication-column/src/main/java/org/eclipse/jnosql/communication/column/ColumnConfiguration.java`
#### Snippet
```java
     */
    static <T extends ColumnConfiguration> T getConfiguration(Class<T> type) {
        return (T) ServiceLoader.load(ColumnConfiguration.class)
                .stream()
                .map(ServiceLoader.Provider::get)
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`sort.isAscending() == true` can be simplified to 'sort.isAscending()'
in `jnosql-communication/jnosql-communication-document/src/main/java/org/eclipse/jnosql/communication/document/SelectQueryParser.java`
#### Snippet
```java
    private Sort toSort(Sort sort, DocumentObserverParser observer, String entity) {
        return Sort.of(observer.fireField(entity, sort.property()),
                sort.isAscending() == true ? Direction.ASC : Direction.DESC, false);
    }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `eval instanceof Iterable` is always `false`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GremlinExecutor.java`
#### Snippet
```java
                return convertToStream(((GraphTraversal) eval).toStream());
            }
            if (eval instanceof Iterable) {
                return convertToStream(StreamSupport.stream(((Iterable) eval).spliterator(), false));
            }
```

### ConstantValue
Condition `eval instanceof Stream` is always `false`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GremlinExecutor.java`
#### Snippet
```java
                return convertToStream(StreamSupport.stream(((Iterable) eval).spliterator(), false));
            }
            if (eval instanceof Stream) {
                return convertToStream((Stream) eval);
            }
```

### ConstantValue
Condition `entity instanceof Edge` is always `false`
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/GremlinExecutor.java`
#### Snippet
```java
        }

        if (entity instanceof Edge) {
            return converter.toEdgeEntity((Edge) entity);
        }
```

### ConstantValue
Method reference result is always 'true'
in `jnosql-mapping/jnosql-mapping-key-value/src/main/java/org/eclipse/jnosql/mapping/keyvalue/AbstractKeyValueTemplate.java`
#### Snippet
```java
        Optional<Value> value = getManager().get(key);
        return value.map(v -> getConverter().toEntity(type, KeyValueEntity.of(key, v)))
                .filter(Objects::nonNull).map(e -> {
                    getEventManager().firePostEntity(e);
                    return e;
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jnosql-communication/jnosql-communication-core/src/main/java/org/eclipse/jnosql/communication/writer/OptionalValueWriter.java`
#### Snippet
```java
    @Override
    public T write(Optional<T> optional) {
        return optional.get();
    }
}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/AbstractGraphTemplate.java`
#### Snippet
```java
    private <T> Optional<Vertex> vertex(T entity) {
        EntityMetadata entityMetadata = getEntities().get(entity.getClass());
        FieldMapping field = entityMetadata.id().get();
        Object id = field.read(entity);
        Iterator<Vertex> vertices = vertices(id);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jnosql-mapping/jnosql-mapping-graph/src/main/java/org/eclipse/jnosql/mapping/graph/AbstractGraphTemplate.java`
#### Snippet
```java
    private <T> boolean isIdNull(T entity) {
        EntityMetadata entityMetadata = getEntities().get(entity.getClass());
        FieldMapping field = entityMetadata.id().get();
        return isNull(field.read(entity));

```

