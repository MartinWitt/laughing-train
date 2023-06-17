# jnosql-communication-driver 
 
# Bad smells
I found 587 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 166 | false |
| JavadocReference | 125 | false |
| RedundantClassCall | 104 | false |
| CdiInjectionPointsInspection | 39 | false |
| ConstantValue | 32 | false |
| DataFlowIssue | 25 | false |
| StringBufferReplaceableByString | 11 | false |
| FieldMayBeFinal | 10 | false |
| NullableProblems | 9 | false |
| DuplicatedCode | 8 | false |
| SimplifyStreamApiCallChains | 6 | false |
| OptionalUsedAsFieldOrParameterType | 6 | false |
| AutoCloseableResource | 6 | false |
| FieldCanBeLocal | 4 | false |
| SimplifyOptionalCallChains | 4 | false |
| RedundantCast | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| TypeParameterExtendsObject | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| EqualsBetweenInconvertibleTypes | 2 | false |
| IgnoreResultOfCall | 2 | false |
| RedundantMethodOverride | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| CaughtExceptionImmediatelyRethrown | 2 | false |
| UnusedAssignment | 2 | false |
| UnnecessaryModifier | 1 | true |
| MissingSerialAnnotation | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| UnnecessaryReturn | 1 | true |
| JavadocLinkAsPlainText | 1 | false |
| IdempotentLoopBody | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/DefaultArangoDBTemplate.java`
#### Snippet
```java
        requireNonNull(query, "query is required");
        requireNonNull(values, "values is required");
        return manager.get().aql(query, values).map(converter::toEntity).map(d -> (T) d);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class\>'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/ArangoDBRepositoryBean.java`
#### Snippet
```java
        DocumentRepositoryProducer producer = getInstance(DocumentRepositoryProducer.class);

        PageableRepository<Object, Object> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);

        ArangoDBDocumentRepositoryProxy handler = new ArangoDBDocumentRepositoryProxy(template,type, repository);
```

### UNCHECKED_WARNING
Unchecked call to 'ArangoDBDocumentRepositoryProxy(ArangoDBTemplate, Class, PageableRepository)' as a member of raw type 'org.eclipse.jnosql.databases.arangodb.mapping.ArangoDBDocumentRepositoryProxy'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/ArangoDBRepositoryBean.java`
#### Snippet
```java
        PageableRepository<Object, Object> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);

        ArangoDBDocumentRepositoryProxy handler = new ArangoDBDocumentRepositoryProxy(template,type, repository);
        return (ArangoDBRepository) Proxy.newProxyInstance(type.getClassLoader(),
                new Class[]{type},
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/ArangoDBDocumentRepositoryProxy.java`
#### Snippet
```java
    ArangoDBDocumentRepositoryProxy(ArangoDBTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        Object value = properties.get(key);
        if (value instanceof Map map) {
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
                    .collect(Collectors.toList()));
        }
        if (isADocumentIterable(value)) {
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        Object value = properties.get(key);
        if (value instanceof Map map) {
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
                    .collect(Collectors.toList()));
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        if (value instanceof Map map) {
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
                    .collect(Collectors.toList()));
        }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static Object getMap(Object val) {
        return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .collect(toMap(KEY_DOCUMENT, VALUE_DOCUMENT));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(val)' has raw type, so result of spliterator is erased
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static Object getMap(Object val) {
        return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .collect(toMap(KEY_DOCUMENT, VALUE_DOCUMENT));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        }
        if (isSudDocumentList(val)) {
            return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                    .map(ArangoDBUtil::getMap).collect(toList());
        }
        return val;
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        }
        if (isSudDocumentList(val)) {
            return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                    .map(ArangoDBUtil::getMap).collect(toList());
        }
        return val;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(val)' has raw type, so result of spliterator is erased
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        }
        if (isSudDocumentList(val)) {
            return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                    .map(ArangoDBUtil::getMap).collect(toList());
        }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
    static DocumentEntity getEntity(Map map) {

        Map<String, Object> entity = new HashMap<>(map);
        Map<String, Object> metadata = (Map<String, Object>) entity.remove(Constants.Documents.Metadata.KEY);
        String id = metadata.get(Constants.Documents.Metadata.ID).toString();
```

### UNCHECKED_WARNING
Unchecked call to 'HashMap(Map)' as a member of raw type 'java.util.HashMap'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
    static DocumentEntity getEntity(Map map) {

        Map<String, Object> entity = new HashMap<>(map);
        Map<String, Object> metadata = (Map<String, Object>) entity.remove(Constants.Documents.Metadata.KEY);
        String id = metadata.get(Constants.Documents.Metadata.ID).toString();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java

        Map<String, Object> entity = new HashMap<>(map);
        Map<String, Object> metadata = (Map<String, Object>) entity.remove(Constants.Documents.Metadata.KEY);
        String id = metadata.get(Constants.Documents.Metadata.ID).toString();
        String collection = metadata.get(Constants.Documents.Metadata.COLLECTION).toString();
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'java.util.Map'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
    public static String getId(Map<?, ?> entity) {
        if (entity != null) {
            Map<String, Object> metadata = (Map<String, Object>) entity.remove(Constants.Documents.Metadata.KEY);
            return (String) metadata.get(Constants.Documents.Metadata.ID);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
    private static Map<String, Object> getMap(Object value) {
        Map<String, Object> subDocument = new HashMap<>();
        StreamSupport.stream(Iterable.class.cast(value).spliterator(),
                false).forEach(feedJSON(subDocument));
        return subDocument;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
    private static Map<String, Object> getMap(Object value) {
        Map<String, Object> subDocument = new HashMap<>();
        StreamSupport.stream(Iterable.class.cast(value).spliterator(),
                false).forEach(feedJSON(subDocument));
        return subDocument;
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
                map.put(d.name(), subDocument);
            } else if (isSudDocumentList(value)) {
                map.put(d.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                        .map(EntityConverter::getMap).collect(toList()));
            } else {
                map.put(d.name(), value);
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
                map.put(d.name(), subDocument);
            } else if (isSudDocumentList(value)) {
                map.put(d.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                        .map(EntityConverter::getMap).collect(toList()));
            } else {
                map.put(d.name(), value);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/EntityConverter.java`
#### Snippet
```java
                map.put(d.name(), subDocument);
            } else if (isSudDocumentList(value)) {
                map.put(d.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                        .map(EntityConverter::getMap).collect(toList()));
            } else {
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
        if (Map.class.isInstance(value)) {
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
                    .collect(Collectors.toList()));
        }
        if (isADocumentIterable(value)) {
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
        if (Map.class.isInstance(value)) {
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
                    .collect(Collectors.toList()));
        }
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.lang.Iterable'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/DocumentQueryConverter.java`
#### Snippet
```java
            if (value instanceof Iterable) {
                final Iterable iterable = Iterable.class.cast(value);
                iterable.forEach(i -> ids.add(i.toString()));
            } else {
                ids.add(value.toString());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
                    .collect(Collectors.toList()));
        }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBEntry.java`
#### Snippet
```java
    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/MangoQueryConverter.java`
#### Snippet
```java

    private void appendCombination(JsonObjectBuilder selector, Object value, String combination) {
        List<DocumentCondition> conditions = List.class.cast(value);
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (DocumentCondition documentCondition : conditions) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/mapping/DefaultElasticsearchTemplate.java`
#### Snippet
```java
        Objects.requireNonNull(query, "query is required");
        Stream<DocumentEntity> entities = manager.get().search(query);
        return entities.map(converter::toEntity).map(e -> (T) e);
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
        if (Map.class.isInstance(value)) {
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
                    .collect(Collectors.toList()));
        }
        if (isADocumentIterable(value)) {
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
        if (Map.class.isInstance(value)) {
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
                    .collect(Collectors.toList()));
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
                    .collect(Collectors.toList()));
        }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
                jsonObject.put(d.name(), subDocument);
            } else if (isSudDocumentList(value)) {
                jsonObject.put(d.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                        .map(EntityConverter::getMap).collect(toList()));
            } else {
                jsonObject.put(d.name(), value);
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
                jsonObject.put(d.name(), subDocument);
            } else if (isSudDocumentList(value)) {
                jsonObject.put(d.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                        .map(EntityConverter::getMap).collect(toList()));
            } else {
                jsonObject.put(d.name(), value);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
                jsonObject.put(d.name(), subDocument);
            } else if (isSudDocumentList(value)) {
                jsonObject.put(d.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                        .map(EntityConverter::getMap).collect(toList()));
            } else {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
    static Stream<DocumentEntity> getDocumentEntityStream(ElasticsearchClient client, SearchResponse<Map> responses) {
        return responses.hits().hits().stream()
                .map(hits -> ElasticsearchEntry.of(hits.id(), hits.source()))
                .filter(ElasticsearchEntry::isNotEmpty)
                .map(ElasticsearchEntry::toEntity);
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
    private static Map<String, Object> getMap(Object value) {
        Map<String, Object> subDocument = new HashMap<>();
        StreamSupport.stream(Iterable.class.cast(value).spliterator(),
                false).forEach(feedJSON(subDocument));
        return subDocument;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
    private static Map<String, Object> getMap(Object value) {
        Map<String, Object> subDocument = new HashMap<>();
        StreamSupport.stream(Iterable.class.cast(value).spliterator(),
                false).forEach(feedJSON(subDocument));
        return subDocument;
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java

    public DocumentEntity insert(String database, DocumentEntity entity) {
        Map<String, Object> map = new HashMap<>(entity.toMap());
        String id = map.getOrDefault(CouchDBConstant.ID, "").toString();
        map.put(CouchDBConstant.ENTITY, entity.name());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
            CouchDBDocumentQuery.class.cast(query).setBookmark(json);
        }
        return (List<Map<String, Object>>) json.getOrDefault(CouchDBConstant.DOCS_RESPONSE, emptyList());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'T'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisQueue.java`
#### Snippet
```java
        if (value != null && !value.isEmpty()) {
            if(isString){
                return (T) value;
            } else {
                return JSONB.fromJson(value, clazz);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'T'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisQueue.java`
#### Snippet
```java
        }
        if(isString) {
            return (T) jedis.lindex(keyWithNameSpace, (long) index - 1);
        } else {
            return JSONB.fromJson(jedis.lindex(keyWithNameSpace, (long) index - 1), clazz);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'T'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisSet.java`
#### Snippet
```java
        for (String redisValue : redisValues) {
            if (isString) {
                list.add((T) redisValue);
            } else {
                list.add(JSONB.fromJson(redisValue, clazz));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'T'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisList.java`
#### Snippet
```java
        for (String element : elements) {
            if(isString) {
                subList.add((T) element);
            } else {
                subList.add(JSONB.fromJson(element, clazz));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class\>'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/SolrRepositoryBean.java`
#### Snippet
```java
        SolrTemplate template = getInstance(SolrTemplate.class);
        DocumentRepositoryProducer producer = getInstance(DocumentRepositoryProducer.class);
        PageableRepository<Object, Object> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);
        SolrRepositoryProxy handler = new SolrRepositoryProxy(template, type, repository);
        return (SolrRepository) Proxy.newProxyInstance(type.getClassLoader(),
```

### UNCHECKED_WARNING
Unchecked call to 'SolrRepositoryProxy(SolrTemplate, Class, PageableRepository)' as a member of raw type 'org.eclipse.jnosql.databases.solr.mapping.SolrRepositoryProxy'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/SolrRepositoryBean.java`
#### Snippet
```java
        DocumentRepositoryProducer producer = getInstance(DocumentRepositoryProducer.class);
        PageableRepository<Object, Object> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);
        SolrRepositoryProxy handler = new SolrRepositoryProxy(template, type, repository);
        return (SolrRepository) Proxy.newProxyInstance(type.getClassLoader(),
                new Class[]{type},
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/SolrRepositoryProxy.java`
#### Snippet
```java
    SolrRepositoryProxy(SolrTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'T'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java
    protected T serialize(String value) {
        if(isString) {
            return (T) value;
        }
        return JSONB.fromJson(value,clazz);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'K'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java
        final Function<String, K> keyFunction = k -> {
            if(isKeyString) {
                return (K) k;
            } else {
                return JSONB.fromJson(k, keyClass);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'V'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java
        final Function<String, V> valueFunction = k -> {
            if(isValueString) {
                return (V) redisMap.get(k);
            } else {
                return JSONB.fromJson(redisMap.get(k), valueClass);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'V'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java
        if (value != null && !value.isEmpty()) {
            if (isValueString) {
                return (V) value;
            } else {
                return JSONB.fromJson(value, valueClass);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/DefaultSolrTemplate.java`
#### Snippet
```java
        return manager.get().solr(query, params).stream()
                .map(converter::toEntity)
                .map(d -> (T) d)
                .collect(Collectors.toList());
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/DefaultSolrTemplate.java`
#### Snippet
```java
        return manager.get().solr(query).stream()
                .map(converter::toEntity)
                .map(d -> (T) d)
                .collect(Collectors.toList());
    }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrUtils.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrUtils.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoTableUtils.java`
#### Snippet
```java
                ListTablesResponse response = client.listTables(request);

                List<String> tableNames = new ArrayList(response.tableNames());

                if (tableNames.isEmpty()) {
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoTableUtils.java`
#### Snippet
```java
                ListTablesResponse response = client.listTables(request);

                List<String> tableNames = new ArrayList(response.tableNames());

                if (tableNames.isEmpty()) {
```

### UNCHECKED_WARNING
Unchecked call to 'OrientDBLiveCallback(OrientDBLiveCreateCallback, OrientDBLiveUpdateCallback, OrientDBLiveDeleteCallback)' as a member of raw type 'org.eclipse.jnosql.databases.orientdb.communication.OrientDBLiveCallback'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/OrientDBLiveCallbackBuilder.java`
#### Snippet
```java
    public OrientDBLiveCallback build() {
        validateNonNullCallbacks();
        return new OrientDBLiveCallback(createCallback, updateCallback, deleteCallback);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class\>'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/OrientDBRepositoryBean.java`
#### Snippet
```java
        OrientDBTemplate template = getInstance(OrientDBTemplate.class);
        DocumentRepositoryProducer producer = getInstance(DocumentRepositoryProducer.class);
        PageableRepository<?, ?> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);

        OrientDBDocumentRepositoryProxy handler = new OrientDBDocumentRepositoryProxy(template, type, repository);
```

### UNCHECKED_WARNING
Unchecked call to 'OrientDBDocumentRepositoryProxy(OrientDBTemplate, Class, PageableRepository)' as a member of raw type 'org.eclipse.jnosql.databases.orientdb.mapping.OrientDBDocumentRepositoryProxy'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/OrientDBRepositoryBean.java`
#### Snippet
```java
        PageableRepository<?, ?> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);

        OrientDBDocumentRepositoryProxy handler = new OrientDBDocumentRepositoryProxy(template, type, repository);
        return (OrientDBCrudRepository) Proxy.newProxyInstance(type.getClassLoader(),
                new Class[]{type},
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/OrientDBDocumentRepositoryProxy.java`
#### Snippet
```java
    OrientDBDocumentRepositoryProxy(OrientDBTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/DefaultOrientDBTemplate.java`
#### Snippet
```java
    public <T> Stream<T> sql(String query, Object... params) {
        return manager.get().sql(query, params).map(converter::toEntity)
                .map(e -> (T) e);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/DefaultOrientDBTemplate.java`
#### Snippet
```java
    public <T> Stream<T> sql(String query, Map<String, Object> params) {
        return manager.get().sql(query, params).map(converter::toEntity)
                .map(e -> (T) e);
    }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBDocumentConfiguration.java`
#### Snippet
```java

    private String getHost(Settings settings) {
        return find(settings, OrientDBDocumentConfigurations.HOST,
                Configurations.HOST);
    }
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBDocumentConfiguration.java`
#### Snippet
```java

    private String getUser(Settings settings) {
        return find(settings, OrientDBDocumentConfigurations.USER,
                Configurations.USER);
    }
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBDocumentConfiguration.java`
#### Snippet
```java

    private String getPassword(Settings settings) {
        return find(settings, OrientDBDocumentConfigurations.PASSWORD,
                Configurations.PASSWORD);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraUDTType.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            List<Iterable<Column>> columns = new ArrayList<>();
            stream(Iterable.class.cast(value).spliterator(), false)
                    .forEach(c -> columns.add(converter.toColumn(c).columns()));
            return singletonList(UDT.builder(type).withName(field.name()).addUDTs(columns).build());

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraUDTType.java`
#### Snippet
```java
        if (Iterable.class.isInstance(value)) {
            List<Iterable<Column>> columns = new ArrayList<>();
            stream(Iterable.class.cast(value).spliterator(), false)
                    .forEach(c -> columns.add(converter.toColumn(c).columns()));
            return singletonList(UDT.builder(type).withName(field.name()).addUDTs(columns).build());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class\>'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraRepositoryBean.java`
#### Snippet
```java
        CassandraTemplate template = getInstance(CassandraTemplate.class);
        ColumnRepositoryProducer producer = getInstance(ColumnRepositoryProducer.class);
        PageableRepository<?,?> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);
        CassandraRepositoryProxy handler = new CassandraRepositoryProxy(template, type, repository);
        return (CassandraRepository) Proxy.newProxyInstance(type.getClassLoader(),
```

### UNCHECKED_WARNING
Unchecked call to 'CassandraRepositoryProxy(CassandraTemplate, Class, PageableRepository)' as a member of raw type 'org.eclipse.jnosql.databases.cassandra.mapping.CassandraRepositoryProxy'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraRepositoryBean.java`
#### Snippet
```java
        ColumnRepositoryProducer producer = getInstance(ColumnRepositoryProducer.class);
        PageableRepository<?,?> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);
        CassandraRepositoryProxy handler = new CassandraRepositoryProxy(template, type, repository);
        return (CassandraRepository) Proxy.newProxyInstance(type.getClassLoader(),
                new Class[]{type},
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
    private static boolean isDocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
    private static boolean isDocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
        if (Map.class.isInstance(object)) {
            Map map = Map.class.cast(object);
            return map.keySet().stream()
                    .map(k -> Document.of(k.toString(), map.get(k)))
                    .collect(toList());
        } else if (List.class.isInstance(object)) {
            return StreamSupport.stream(List.class.cast(object).spliterator(), false)
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
        if (Map.class.isInstance(object)) {
            Map map = Map.class.cast(object);
            return map.keySet().stream()
                    .map(k -> Document.of(k.toString(), map.get(k)))
                    .collect(toList());
        } else if (List.class.isInstance(object)) {
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
                    .collect(toList());
        } else if (List.class.isInstance(object)) {
            return StreamSupport.stream(List.class.cast(object).spliterator(), false)
                    .map(OrientDBConverter::convert).collect(toList());
        }
        return object;
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
                    .collect(toList());
        } else if (List.class.isInstance(object)) {
            return StreamSupport.stream(List.class.cast(object).spliterator(), false)
                    .map(OrientDBConverter::convert).collect(toList());
        }
        return object;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'List.class.cast(object)' has raw type, so result of spliterator is erased
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
                    .collect(toList());
        } else if (List.class.isInstance(object)) {
            return StreamSupport.stream(List.class.cast(object).spliterator(), false)
                    .map(OrientDBConverter::convert).collect(toList());
        }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isDocumentIterable(d));
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isDocumentIterable(d));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
            entityValues.put(document.name(), getMap(value));
        } else if (isSudDocumentList(value)) {
            entityValues.put(document.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                    .map(OrientDBConverter::getMap).collect(toList()));
        } else {
            entityValues.put(document.name(), value);
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
            entityValues.put(document.name(), getMap(value));
        } else if (isSudDocumentList(value)) {
            entityValues.put(document.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                    .map(OrientDBConverter::getMap).collect(toList()));
        } else {
            entityValues.put(document.name(), value);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
            entityValues.put(document.name(), getMap(value));
        } else if (isSudDocumentList(value)) {
            entityValues.put(document.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                    .map(OrientDBConverter::getMap).collect(toList()));
        } else {
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
    private static Map<String, Object> getMap(Object valueAsObject) {
        Map<String, Object> map = new java.util.HashMap<>();
        stream(Iterable.class.cast(valueAsObject).spliterator(), false)
                .forEach(d -> toDocument(map, Document.class.cast(d)));
        return map;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(valueAsObject)' has raw type, so result of spliterator is erased
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java
    private static Map<String, Object> getMap(Object valueAsObject) {
        Map<String, Object> map = new java.util.HashMap<>();
        stream(Iterable.class.cast(valueAsObject).spliterator(), false)
                .forEach(d -> toDocument(map, Document.class.cast(d)));
        return map;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraRepositoryProxy.java`
#### Snippet
```java

        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
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

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(columns)' has raw type, so result of spliterator is erased
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java
                    org.eclipse.jnosql.databases.cassandra.communication.UDT.class.cast(column.get());
            Object columns = udt.get();
            if (StreamSupport.stream(Iterable.class.cast(columns).spliterator(), false)
                    .allMatch(Iterable.class::isInstance)) {
                GenericFieldMapping genericField = GenericFieldMapping.class.cast(field);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java
                GenericFieldMapping genericField = GenericFieldMapping.class.cast(field);
                Collection collection = genericField.getCollectionInstance();
                List<List<Column>> embeddable = (List<List<Column>>) columns;
                for (List<Column> columnList : embeddable) {
                    Object element = toEntity(genericField.getElementType(), columnList);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java
                for (List<Column> columnList : embeddable) {
                    Object element = toEntity(genericField.getElementType(), columnList);
                    collection.add(element);
                }
                field.write(instance, collection);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java
                field.write(instance, collection);
            } else {
                Object value = toEntity(field.nativeField().getType(), (List<Column>) columns);
                field.write(instance, value);
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/DefaultCassandraTemplate.java`
#### Snippet
```java
                .map(e -> manager.get().save(e, ttl, level))
                .map(converter::toEntity)
                .map(e -> (T) e)
                .collect(Collectors.toList());
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/DefaultCassandraTemplate.java`
#### Snippet
```java
                .map(e -> manager.get().save(e, level))
                .map(converter::toEntity)
                .map(e -> (T) e)
                .collect(Collectors.toList());
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/DefaultCassandraTemplate.java`
#### Snippet
```java
        CassandraPreparedStatement cassandraPrepareStatement = manager.get().nativeQueryPrepare(query);
        Stream<ColumnEntity> entities = cassandraPrepareStatement.bind(params).executeQuery();
        return entities.map(converter::toEntity).map(e -> (T) e);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/DefaultCassandraColumnManager.java`
#### Snippet
```java
        BoundStatement statement = prepare.bind();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            final TypeCodec<Object> codec = CodecRegistry.DEFAULT.codecFor((Class<Object>) entry.getValue().getClass());
            statement = statement.set(entry.getKey(), entry.getValue(), codec);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java

    private static String getUserType(Object result) {
        return StreamSupport.stream(Iterable.class.cast(result).spliterator(), false)
                .limit(1L)
                .map(c -> UdtValue.class.cast(c).getType().getName().asInternal())
                .findFirst()
                .get().toString();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(result)' has raw type, so result of spliterator is erased
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConverter.java`
#### Snippet
```java

    private static String getUserType(Object result) {
        return StreamSupport.stream(Iterable.class.cast(result).spliterator(), false)
                .limit(1L)
                .map(c -> UdtValue.class.cast(c).getType().getName().asInternal())
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class\>'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/CouchbaseRepositoryBean.java`
#### Snippet
```java
        CouchbaseTemplate template = getInstance(CouchbaseTemplate.class);
        DocumentRepositoryProducer producer = getInstance(DocumentRepositoryProducer.class);
        PageableRepository<Object, Object> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);
        CouchbaseDocumentRepositoryProxy handler = new CouchbaseDocumentRepositoryProxy(template, type, repository);
        return (CouchbaseRepository) Proxy.newProxyInstance(type.getClassLoader(),
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/CouchbaseDocumentRepositoryProxy.java`
#### Snippet
```java
    CouchbaseDocumentRepositoryProxy(CouchbaseTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### UNCHECKED_WARNING
Unchecked call to 'CouchbaseDocumentRepositoryProxy(CouchbaseTemplate, Class, PageableRepository)' as a member of raw type 'org.eclipse.jnosql.databases.couchbase.mapping.CouchbaseDocumentRepositoryProxy'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/CouchbaseRepositoryBean.java`
#### Snippet
```java
        DocumentRepositoryProducer producer = getInstance(DocumentRepositoryProducer.class);
        PageableRepository<Object, Object> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);
        CouchbaseDocumentRepositoryProxy handler = new CouchbaseDocumentRepositoryProxy(template, type, repository);
        return (CouchbaseRepository) Proxy.newProxyInstance(type.getClassLoader(),
                new Class[]{type},
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
        }
        if (isSudDocumentList(val)) {
            return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                    .map(MongoDBUtils::getMap).collect(toList());
        }
        return val;
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
        }
        if (isSudDocumentList(val)) {
            return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                    .map(MongoDBUtils::getMap).collect(toList());
        }
        return val;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(val)' has raw type, so result of spliterator is erased
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
        }
        if (isSudDocumentList(val)) {
            return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                    .map(MongoDBUtils::getMap).collect(toList());
        }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
    private static boolean isDocumentIterable(Object value) {
        return value instanceof Iterable &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java
    private static boolean isDocumentIterable(Object value) {
        return value instanceof Iterable &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java

    private static Object getMap(Object val) {
        return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .collect(toMap(KEY_DOCUMENT, VALUE_DOCUMENT));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(val)' has raw type, so result of spliterator is erased
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBUtils.java`
#### Snippet
```java

    private static Object getMap(Object val) {
        return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .collect(toMap(KEY_DOCUMENT, VALUE_DOCUMENT));
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/DefaultCouchbaseTemplate.java`
#### Snippet
```java
        return manager.get().n1qlQuery(n1qlQuery)
                .map(converter::toEntity)
                .map(d -> (T) d);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/DefaultCouchbaseTemplate.java`
#### Snippet
```java
        return manager.get().n1qlQuery(n1qlQuery, params)
                .map(converter::toEntity)
                .map(d -> (T) d);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
            Object value = map.get(key);
            if (Map.class.isInstance(value)) {
                documents.add(Document.of(key, toDocuments(Map.class.cast(value))));
            } else if (isADocumentIterable(value)) {
                List<List<Document>> subDocuments = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
            } else if (isADocumentIterable(value)) {
                List<List<Document>> subDocuments = new ArrayList<>();
                stream(Iterable.class.cast(value).spliterator(), false)
                        .map(m -> toDocuments(Map.class.cast(m)))
                        .forEach(e -> subDocuments.add((List<Document>) e));
                documents.add(Document.of(key, subDocuments));
            } else {
```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
            } else if (isADocumentIterable(value)) {
                List<List<Document>> subDocuments = new ArrayList<>();
                stream(Iterable.class.cast(value).spliterator(), false)
                        .map(m -> toDocuments(Map.class.cast(m)))
                        .forEach(e -> subDocuments.add((List<Document>) e));
                documents.add(Document.of(key, subDocuments));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
            } else if (isADocumentIterable(value)) {
                List<List<Document>> subDocuments = new ArrayList<>();
                stream(Iterable.class.cast(value).spliterator(), false)
                        .map(m -> toDocuments(Map.class.cast(m)))
                        .forEach(e -> subDocuments.add((List<Document>) e));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
                List<List<Document>> subDocuments = new ArrayList<>();
                stream(Iterable.class.cast(value).spliterator(), false)
                        .map(m -> toDocuments(Map.class.cast(m)))
                        .forEach(e -> subDocuments.add((List<Document>) e));
                documents.add(Document.of(key, subDocuments));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
                stream(Iterable.class.cast(value).spliterator(), false)
                        .map(m -> toDocuments(Map.class.cast(m)))
                        .forEach(e -> subDocuments.add((List<Document>) e));
                documents.add(Document.of(key, subDocuments));
            } else {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
                                Map.Entry<String, Object> entry = map.entrySet().stream().findFirst().get();
                                if (entry.getValue() instanceof Map) {
                                    List<Document> documents = toDocuments((Map<String, Object>) entry.getValue());
                                    return DocumentEntity.of(entry.getKey(), documents);
                                }
```

### UNCHECKED_WARNING
Unchecked call to 'allMatch(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(value)' has raw type, so result of spliterator is erased
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.lang.Iterable'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
        JsonObject map = JsonObject.create();
        JsonArray array = JsonArray.create();
        Iterable.class.cast(value).forEach(element -> {
            if (Document.class.isInstance(element)) {
                Document subdocument = Document.class.cast(element);
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
                JsonObject subJson = JsonObject.create();

                stream(Iterable.class.cast(element).spliterator(), false)
                        .forEach(getSubdocument(subJson));
                array.add(subJson);
            } else {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(element)' has raw type, so result of spliterator is erased
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
                JsonObject subJson = JsonObject.create();

                stream(Iterable.class.cast(element).spliterator(), false)
                        .forEach(getSubdocument(subJson));
                array.add(subJson);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/mapping/HazelcastRepositoryProxy.java`
#### Snippet
```java
    HazelcastRepositoryProxy(HazelcastTemplate template, Class<?> repositoryType, PageableRepository<?, ?> repository) {
        this.template = template;
        this.typeClass = Class.class.cast(ParameterizedType.class.cast(repositoryType.getGenericInterfaces()[0])
                .getActualTypeArguments()[0]);
        this.repository = repository;
```

### UNCHECKED_WARNING
Unchecked cast: 'com.couchbase.client.java.datastructures.CouchbaseMap' to 'java.util.Map'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/DefaultCouchbaseBucketManagerFactory.java`
#### Snippet
```java
        Bucket bucket = this.cluster.bucket(bucketName);
        Collection collection = bucket.collection(bucketName);
        return (Map<K, V>)
                new com.couchbase.client.java.datastructures.CouchbaseMap<>(bucketName + ":map",
                        collection, valueValue,
                        MapOptions.mapOptions());

    }
```

### UNCHECKED_WARNING
Unchecked cast: 'com.couchbase.client.java.datastructures.CouchbaseMap' to 'java.util.Map'
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/DefaultCouchbaseBucketManagerFactory.java`
#### Snippet
```java
        Collection collection = bucket.collection(bucketName);

        return (Map<K, V>)
                new com.couchbase.client.java.datastructures.
                        CouchbaseMap<>(key, collection, valueType,
                        MapOptions.mapOptions());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class\>'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/mapping/HazelcastRepositoryBean.java`
#### Snippet
```java

        KeyValueRepositoryProducer producer = getInstance(KeyValueRepositoryProducer.class);
        PageableRepository<?, ?> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);
        HazelcastRepositoryProxy handler = new HazelcastRepositoryProxy(template, type, repository);
        return (HazelcastRepository) Proxy.newProxyInstance(type.getClassLoader(),
```

### UNCHECKED_WARNING
Unchecked call to 'HazelcastRepositoryProxy(HazelcastTemplate, Class, PageableRepository)' as a member of raw type 'org.eclipse.jnosql.databases.hazelcast.mapping.HazelcastRepositoryProxy'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/mapping/HazelcastRepositoryBean.java`
#### Snippet
```java
        KeyValueRepositoryProducer producer = getInstance(KeyValueRepositoryProducer.class);
        PageableRepository<?, ?> repository = producer.get((Class<PageableRepository<Object, Object>>) type, template);
        HazelcastRepositoryProxy handler = new HazelcastRepositoryProxy(template, type, repository);
        return (HazelcastRepository) Proxy.newProxyInstance(type.getClassLoader(),
                new Class[]{type},
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.lang.Iterable'
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java
        if (val instanceof Iterable) {
            List<Object> items = new ArrayList<>();
            Iterable.class.cast(val).forEach(items::add);
            if (items.size() == 1) {
                Object item = items.get(0);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'. Reason: 'items.stream().map(CONVERT)' has raw type, so result of collect is erased
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java
                }
            }
            return (List<Object>) items.stream().map(CONVERT).collect(toList());

        }
```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java
                }
            }
            return (List<Object>) items.stream().map(CONVERT).collect(toList());

        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.function.Function' to 'java.util.function.Function'
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java
                }
            }
            return (List<Object>) items.stream().map(CONVERT).collect(toList());

        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'. Reason: 'StreamSupport.stream(Iterable.class.cast(val).spliterator(), false) .map(CONVERT)' has raw type, so result of collect is erased
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java

    private static List<Object> getObjects(Object val) {
        return (List<Object>) StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .map(CONVERT).collect(toList());
    }

```

### UNCHECKED_WARNING
Unchecked call to 'collect(Collector)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java

    private static List<Object> getObjects(Object val) {
        return (List<Object>) StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .map(CONVERT).collect(toList());
    }

```

### UNCHECKED_WARNING
Unchecked call to 'map(Function)' as a member of raw type 'java.util.stream.Stream'
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java

    private static List<Object> getObjects(Object val) {
        return (List<Object>) StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .map(CONVERT).collect(toList());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'. Reason: 'Iterable.class.cast(val)' has raw type, so result of spliterator is erased
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java

    private static List<Object> getObjects(Object val) {
        return (List<Object>) StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .map(CONVERT).collect(toList());
    }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V, long, TimeUnit)' as a member of raw type 'com.hazelcast.map.IMap'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/DefaultHazelcastBucketManager.java`
#### Snippet
```java
    @Override
    public void put(KeyValueEntity entity, Duration ttl) {
        map.put(entity.key(), entity.value(), ttl.toMillis(), TimeUnit.MILLISECONDS);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/DefaultHazelcastBucketManager.java`
#### Snippet
```java
        };
        params.entrySet().forEach(consumer);
        return sql(new SqlPredicate(finalQuery.toString()));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.query.impl.predicates.SqlPredicate' to 'com.hazelcast.query.Predicate'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/DefaultHazelcastBucketManager.java`
#### Snippet
```java
        };
        params.entrySet().forEach(consumer);
        return sql(new SqlPredicate(finalQuery.toString()));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.hazelcast.map.IMap'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/DefaultHazelcastBucketManager.java`
#### Snippet
```java
    @Override
    public <K, V> void put(K key, V value) {
        map.put(key, value);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.hazelcast.map.IMap'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/DefaultHazelcastBucketManager.java`
#### Snippet
```java
    @Override
    public void put(KeyValueEntity entity) throws NullPointerException {
        map.put(entity.key(), entity.value());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/DefaultHazelcastBucketManager.java`
#### Snippet
```java
    public Collection<Value> sql(String query) throws NullPointerException {
        requireNonNull(query, "sql is required");
        return sql(new SqlPredicate(query));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.query.impl.predicates.SqlPredicate' to 'com.hazelcast.query.Predicate'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/DefaultHazelcastBucketManager.java`
#### Snippet
```java
    public Collection<Value> sql(String query) throws NullPointerException {
        requireNonNull(query, "sql is required");
        return sql(new SqlPredicate(query));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: 'map' has raw type, so result of values is erased
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/DefaultHazelcastBucketManager.java`
#### Snippet
```java
    public <K, V> Collection<Value> sql(Predicate<K, V> predicate) throws NullPointerException {
        requireNonNull(predicate, "predicate is required");
        Collection<V> values = map.values(predicate);
        return values.stream().map(Value::of).collect(toList());
    }
```

### UNCHECKED_WARNING
Unchecked call to 'values(Predicate)' as a member of raw type 'com.hazelcast.map.IMap'
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/DefaultHazelcastBucketManager.java`
#### Snippet
```java
    public <K, V> Collection<Value> sql(Predicate<K, V> predicate) throws NullPointerException {
        requireNonNull(predicate, "predicate is required");
        Collection<V> values = map.values(predicate);
        return values.stream().map(Value::of).collect(toList());
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `JNoSQLDocumentTemplate`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/ArangoDBTemplate.java`
#### Snippet
```java

/**
 * A {@link JNoSQLDocumentTemplate} to arangoDB
 */
public interface ArangoDBTemplate extends JNoSQLDocumentTemplate {
```

### JavadocReference
Cannot resolve symbol `DocumentManager`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBDocumentManager.java`
#### Snippet
```java

/**
 * The ArangoDB implementation of {@link DocumentManager} it does not support to TTL methods:
 * <p>{@link DocumentManager#insert(DocumentEntity)}</p>
 */
```

### JavadocReference
Cannot resolve symbol `DocumentManager`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBDocumentManager.java`
#### Snippet
```java
/**
 * The ArangoDB implementation of {@link DocumentManager} it does not support to TTL methods:
 * <p>{@link DocumentManager#insert(DocumentEntity)}</p>
 */
public interface ArangoDBDocumentManager extends DocumentManager {
```

### JavadocReference
Cannot resolve symbol `insert(DocumentEntity)`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBDocumentManager.java`
#### Snippet
```java
/**
 * The ArangoDB implementation of {@link DocumentManager} it does not support to TTL methods:
 * <p>{@link DocumentManager#insert(DocumentEntity)}</p>
 */
public interface ArangoDBDocumentManager extends DocumentManager {
```

### JavadocReference
Cannot resolve symbol `DocumentEntity`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBDocumentManager.java`
#### Snippet
```java
/**
 * The ArangoDB implementation of {@link DocumentManager} it does not support to TTL methods:
 * <p>{@link DocumentManager#insert(DocumentEntity)}</p>
 */
public interface ArangoDBDocumentManager extends DocumentManager {
```

### JavadocReference
Cannot resolve symbol `KeyValueConfiguration`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBKeyValueConfiguration.java`
#### Snippet
```java

/**
 * The ArangoDB implementation to {@link KeyValueConfiguration}
 *
 * @see ArangoDBConfigurations
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManagerFactory.java`
#### Snippet
```java

/**
 * The ArangoDB implementation to {@link BucketManagerFactory}
 * it does not support:
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManagerFactory.java`
#### Snippet
```java
 * The ArangoDB implementation to {@link BucketManagerFactory}
 * it does not support:
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
```

### JavadocReference
Cannot resolve symbol `getMap(String, Class, Class)`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManagerFactory.java`
#### Snippet
```java
 * The ArangoDB implementation to {@link BucketManagerFactory}
 * it does not support:
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManagerFactory.java`
#### Snippet
```java
 * it does not support:
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
```

### JavadocReference
Cannot resolve symbol `getSet(String, Class)`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManagerFactory.java`
#### Snippet
```java
 * it does not support:
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManagerFactory.java`
#### Snippet
```java
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
 */
```

### JavadocReference
Cannot resolve symbol `getQueue(String, Class)`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManagerFactory.java`
#### Snippet
```java
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
 */
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManagerFactory.java`
#### Snippet
```java
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
 */
public class ArangoDBBucketManagerFactory implements BucketManagerFactory {
```

### JavadocReference
Cannot resolve symbol `getList(String, Class)`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManagerFactory.java`
#### Snippet
```java
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
 */
public class ArangoDBBucketManagerFactory implements BucketManagerFactory {
```

### JavadocReference
Cannot resolve symbol `DocumentConfiguration`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBDocumentConfiguration.java`
#### Snippet
```java

/**
 * The implementation of {@link DocumentConfiguration}
 * that returns {@link ArangoDBDocumentManagerFactory}.
 *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum ArangoDBConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `DocumentConfiguration`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBDocumentConfiguration.java`
#### Snippet
```java

/**
 * The RavenDB implementation to both {@link DocumentConfiguration}
 * that returns  {@link RavenDBDocumentManagerFactory}
 *
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-riak/src/main/java/org/eclipse/jnosql/databases/riak/communication/RiakBucketManagerFactory.java`
#### Snippet
```java

/**
 * The riak implementation to {@link BucketManagerFactory} that returns {@link RiakBucketManager}
 * This implementation just has support to {@link RiakBucketManagerFactory#apply(String)}
 * So, these metdhos will returns {@link UnsupportedOperationException}
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-riak/src/main/java/org/eclipse/jnosql/databases/riak/communication/RiakBucketManagerFactory.java`
#### Snippet
```java
 * This implementation just has support to {@link RiakBucketManagerFactory#apply(String)}
 * So, these metdhos will returns {@link UnsupportedOperationException}
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
```

### JavadocReference
Cannot resolve symbol `getList(String, Class)`
in `jnosql-riak/src/main/java/org/eclipse/jnosql/databases/riak/communication/RiakBucketManagerFactory.java`
#### Snippet
```java
 * This implementation just has support to {@link RiakBucketManagerFactory#apply(String)}
 * So, these metdhos will returns {@link UnsupportedOperationException}
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-riak/src/main/java/org/eclipse/jnosql/databases/riak/communication/RiakBucketManagerFactory.java`
#### Snippet
```java
 * So, these metdhos will returns {@link UnsupportedOperationException}
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
```

### JavadocReference
Cannot resolve symbol `getSet(String, Class)`
in `jnosql-riak/src/main/java/org/eclipse/jnosql/databases/riak/communication/RiakBucketManagerFactory.java`
#### Snippet
```java
 * So, these metdhos will returns {@link UnsupportedOperationException}
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-riak/src/main/java/org/eclipse/jnosql/databases/riak/communication/RiakBucketManagerFactory.java`
#### Snippet
```java
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
 */
```

### JavadocReference
Cannot resolve symbol `getQueue(String, Class)`
in `jnosql-riak/src/main/java/org/eclipse/jnosql/databases/riak/communication/RiakBucketManagerFactory.java`
#### Snippet
```java
 * <p>{@link BucketManagerFactory#getList(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
 */
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-riak/src/main/java/org/eclipse/jnosql/databases/riak/communication/RiakBucketManagerFactory.java`
#### Snippet
```java
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
 */
public class RiakBucketManagerFactory implements BucketManagerFactory {
```

### JavadocReference
Cannot resolve symbol `getMap(String, Class, Class)`
in `jnosql-riak/src/main/java/org/eclipse/jnosql/databases/riak/communication/RiakBucketManagerFactory.java`
#### Snippet
```java
 * <p>{@link BucketManagerFactory#getSet(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getQueue(String, Class)}</p>
 * <p>{@link BucketManagerFactory#getMap(String, Class, Class)}</p>
 */
public class RiakBucketManagerFactory implements BucketManagerFactory {
```

### JavadocReference
Cannot resolve symbol `BucketManager`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManager.java`
#### Snippet
```java

/**
 * The ArangoDB implementation to {@link BucketManager} it does not support TTL methods:
 * <p>{@link BucketManager#put(Iterable, Duration)}</p>
 * <p>{@link BucketManager#put(Iterable, Duration)}</p>
```

### JavadocReference
Cannot resolve symbol `BucketManager`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManager.java`
#### Snippet
```java
/**
 * The ArangoDB implementation to {@link BucketManager} it does not support TTL methods:
 * <p>{@link BucketManager#put(Iterable, Duration)}</p>
 * <p>{@link BucketManager#put(Iterable, Duration)}</p>
 */
```

### JavadocReference
Cannot resolve symbol `put(Iterable, Duration)`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManager.java`
#### Snippet
```java
/**
 * The ArangoDB implementation to {@link BucketManager} it does not support TTL methods:
 * <p>{@link BucketManager#put(Iterable, Duration)}</p>
 * <p>{@link BucketManager#put(Iterable, Duration)}</p>
 */
```

### JavadocReference
Cannot resolve symbol `BucketManager`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManager.java`
#### Snippet
```java
 * The ArangoDB implementation to {@link BucketManager} it does not support TTL methods:
 * <p>{@link BucketManager#put(Iterable, Duration)}</p>
 * <p>{@link BucketManager#put(Iterable, Duration)}</p>
 */
public class ArangoDBBucketManager implements BucketManager {
```

### JavadocReference
Cannot resolve symbol `put(Iterable, Duration)`
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBBucketManager.java`
#### Snippet
```java
 * The ArangoDB implementation to {@link BucketManager} it does not support TTL methods:
 * <p>{@link BucketManager#put(Iterable, Duration)}</p>
 * <p>{@link BucketManager#put(Iterable, Duration)}</p>
 */
public class ArangoDBBucketManager implements BucketManager {
```

### JavadocReference
Cannot resolve symbol `KeyValueConfiguration`
in `jnosql-riak/src/main/java/org/eclipse/jnosql/databases/riak/communication/RiakKeyValueConfiguration.java`
#### Snippet
```java

/**
 * The riak implementation to {@link KeyValueConfiguration} that returns {@link RiakBucketManagerFactory}.
 * <p>riak.host-: The prefix to host. eg: riak.server.host.1= host1</p>
 */
```

### JavadocReference
Cannot resolve symbol `DocumentManagerFactory`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBDocumentManagerFactory.java`
#### Snippet
```java

/**
 * The RavenDB implementation to {@link DocumentManagerFactory}
 */
public class RavenDBDocumentManagerFactory implements DocumentManagerFactory {
```

### JavadocReference
Cannot resolve symbol `DocumentConfiguration`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBDocumentConfiguration.java`
#### Snippet
```java

/**
 * The CouchDB implementation of {@link DocumentConfiguration}  that returns
 * {@link CouchDBDocumentManagerFactory}.
 * @see CouchDBConfigurations
```

### JavadocReference
Cannot resolve symbol `DocumentQuery`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBDocumentQuery.java`
#### Snippet
```java

/**
 * A CouchDB specialization of {@link DocumentQuery} that allows query with bookmark which can do pagination.
 *
 * @see CouchDBDocumentQuery#of(DocumentQuery)
```

### JavadocReference
Cannot resolve symbol `DocumentQuery`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBDocumentQuery.java`
#### Snippet
```java
 * A CouchDB specialization of {@link DocumentQuery} that allows query with bookmark which can do pagination.
 *
 * @see CouchDBDocumentQuery#of(DocumentQuery)
 * @see CouchDBDocumentQuery#of(DocumentQuery, String)
 */
```

### JavadocReference
Cannot resolve symbol `DocumentQuery`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBDocumentQuery.java`
#### Snippet
```java
 *
 * @see CouchDBDocumentQuery#of(DocumentQuery)
 * @see CouchDBDocumentQuery#of(DocumentQuery, String)
 */
public final class CouchDBDocumentQuery implements DocumentQuery {
```

### JavadocReference
Cannot resolve symbol `DocumentQuery`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBDocumentQuery.java`
#### Snippet
```java
     * returns a new instance of {@link CouchDBDocumentQuery}
     *
     * @param query the {@link DocumentQuery}
     * @return a new instance
     * @throws NullPointerException when query is null
```

### JavadocReference
Cannot resolve symbol `DocumentQuery`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBDocumentQuery.java`
#### Snippet
```java
     * returns a new instance of {@link CouchDBDocumentQuery}
     *
     * @param query    the {@link DocumentQuery}
     * @param bookmark {@link CouchDBDocumentQuery#bookmark}
     * @return a new instance
```

### JavadocReference
Cannot resolve symbol `JNoSQLDocumentTemplate`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/mapping/ElasticsearchTemplate.java`
#### Snippet
```java

/**
 * A {@link JNoSQLDocumentTemplate} to elasticsearch
 */
public interface ElasticsearchTemplate extends JNoSQLDocumentTemplate {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/CouchDBConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum  CouchDBConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `DocumentManager`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchDocumentManager.java`
#### Snippet
```java

/**
 * The ES implementation of {@link DocumentManager}
 */
public interface ElasticsearchDocumentManager extends DocumentManager {
```

### JavadocReference
Cannot resolve symbol `DocumentManager`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBDocumentManager.java`
#### Snippet
```java

/**
 * The RavenDB implementation to {@link DocumentManager} that does not support TTL methods
 * <p>{@link RavenDBDocumentManager#insert(DocumentEntity, Duration)}</p>
 */
```

### JavadocReference
Cannot resolve symbol `DocumentEntity`
in `jnosql-ravendb/src/main/java/org/eclipse/jnosql/databases/ravendb/communication/RavenDBDocumentManager.java`
#### Snippet
```java
/**
 * The RavenDB implementation to {@link DocumentManager} that does not support TTL methods
 * <p>{@link RavenDBDocumentManager#insert(DocumentEntity, Duration)}</p>
 */
public class RavenDBDocumentManager implements DocumentManager {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum ElasticsearchConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `DocumentConfiguration`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchDocumentConfiguration.java`
#### Snippet
```java

/**
 * The implementation of {@link DocumentConfiguration}
 * that returns {@link ElasticsearchDocumentManagerFactory}.
 *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-memcached/src/main/java/org/eclipse/jnosql/databases/memcached/communication/MemcachedConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum MemcachedConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `DocumentManagerFactory`
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchDocumentManagerFactory.java`
#### Snippet
```java

/**
 * The elasticsearch implementation to {@link DocumentManagerFactory} that returns:
 * {@link ElasticsearchDocumentManager}
 * If the database does not exist, it tries to read a json mapping from the database name.
```

### JavadocReference
Cannot resolve symbol `KeyValueConfiguration`
in `jnosql-memcached/src/main/java/org/eclipse/jnosql/databases/memcached/communication/MemcachedKeyValueConfiguration.java`
#### Snippet
```java

/**
 * The memcached implementation of {@link KeyValueConfiguration} that returns
 * {@link MemcachedBucketManagerFactory}.
 *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum RedisConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisBucketManagerFactory.java`
#### Snippet
```java

/**
 * The redis implementation to {@link BucketManagerFactory} where returns {@link RedisBucketManager}
 */
public interface RedisBucketManagerFactory extends BucketManagerFactory {
```

### JavadocReference
Cannot resolve symbol `KeyValueConfiguration`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisConfiguration.java`
#### Snippet
```java

/**
 * The redis implementation of {@link KeyValueConfiguration} whose returns {@link RedisBucketManagerFactory}.
 * @see RedisConfigurations
 */
```

### JavadocReference
Cannot resolve symbol `BucketManager`
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisBucketManager.java`
#### Snippet
```java

/**
 * The redis implementation to {@link BucketManager}
 */
public class RedisBucketManager implements BucketManager {
```

### JavadocReference
Cannot resolve symbol `DocumentManager`
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrDocumentManager.java`
#### Snippet
```java

/**
 * The solr implementation to {@link DocumentManager} that does not support TTL methods
 * <p>{@link DefaultSolrDocumentManager#insert(DocumentEntity, Duration)}</p>
 */
```

### JavadocReference
Cannot resolve symbol `DocumentEntity`
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrDocumentManager.java`
#### Snippet
```java
/**
 * The solr implementation to {@link DocumentManager} that does not support TTL methods
 * <p>{@link DefaultSolrDocumentManager#insert(DocumentEntity, Duration)}</p>
 */
public interface SolrDocumentManager extends DocumentManager {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrDocumentConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum SolrDocumentConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `DocumentManagerFactory`
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrDocumentManagerFactory.java`
#### Snippet
```java

/**
 * The solr implementation to {@link DocumentManagerFactory}
 */
public class SolrDocumentManagerFactory implements DocumentManagerFactory {
```

### JavadocReference
Cannot resolve symbol `HttpSolrClient`
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrDocumentConfiguration.java`
#### Snippet
```java
     * Creates a {@link SolrDocumentManagerFactory} from mongoClient
     *
     * @param solrClient the mongo client {@link HttpSolrClient}
     * @return a SolrDocumentManagerFactory instance
     * @throws NullPointerException when the mongoClient is null
```

### JavadocReference
Cannot resolve symbol `DocumentConfiguration`
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrDocumentConfiguration.java`
#### Snippet
```java

/**
 * The Apache Solr implementation to {@link DocumentConfiguration}
 * that returns  {@link SolrDocumentManagerFactory}
 * @see SolrDocumentConfigurations
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBDocumentConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum OrientDBDocumentConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `DocumentManager`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBDocumentManager.java`
#### Snippet
```java

/**
 * The orientdb implementation to {@link DocumentManager}, this implementation
 * does not support TTL.
 * <p>{@link OrientDBDocumentManager#insert(DocumentEntity, java.time.Duration)}</p>
```

### JavadocReference
Cannot resolve symbol `insert(DocumentEntity, java.time.Duration)`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBDocumentManager.java`
#### Snippet
```java
 * The orientdb implementation to {@link DocumentManager}, this implementation
 * does not support TTL.
 * <p>{@link OrientDBDocumentManager#insert(DocumentEntity, java.time.Duration)}</p>
 * Also this implementation has support SQL query and also live query.
 * <p>{@link OrientDBDocumentManager#sql(String, Object...)}</p>
```

### JavadocReference
Cannot resolve symbol `DocumentEntity`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBDocumentManager.java`
#### Snippet
```java
 * The orientdb implementation to {@link DocumentManager}, this implementation
 * does not support TTL.
 * <p>{@link OrientDBDocumentManager#insert(DocumentEntity, java.time.Duration)}</p>
 * Also this implementation has support SQL query and also live query.
 * <p>{@link OrientDBDocumentManager#sql(String, Object...)}</p>
```

### JavadocReference
Cannot resolve symbol `DocumentManagerFactory`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBDocumentManagerFactory.java`
#### Snippet
```java

/**
 * The OrientDB implementation of {@link DocumentManagerFactory}
 */
public class OrientDBDocumentManagerFactory implements DocumentManagerFactory {
```

### JavadocReference
Cannot resolve symbol `DocumentConfiguration`
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBDocumentConfiguration.java`
#### Snippet
```java

/**
 * The orientDB implementation of {@link DocumentConfiguration}  that returns
 * {@link OrientDBDocumentManagerFactory}.
 *
```

### JavadocReference
Cannot resolve symbol `JNoSQLColumnTemplate`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraTemplate.java`
#### Snippet
```java

/**
 * A Cassandra extension of {@link JNoSQLColumnTemplate}
 */
public interface CassandraTemplate extends JNoSQLColumnTemplate {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum CassandraConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `ColumnManagerFactory`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraColumnManagerFactory.java`
#### Snippet
```java

/**
 * The Cassandra implementation to {@link ColumnManagerFactory}
 */
public class CassandraColumnManagerFactory implements ColumnManagerFactory {
```

### JavadocReference
Cannot resolve symbol `ColumnConfiguration`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraConfiguration.java`
#### Snippet
```java

/**
 * The Cassandra implementation to {@link ColumnConfiguration}  that returns
 * {@link CassandraColumnManagerFactory}
 *
```

### JavadocReference
Cannot resolve symbol `ObjectId`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/mapping/ObjectIdConverter.java`
#### Snippet
```java

/**
 * An implementation of AttributeConverter where it converts the {@link ObjectId}
 * from/to {@link String}
 */
```

### JavadocReference
Cannot resolve symbol `ColumnManager`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraColumnManager.java`
#### Snippet
```java

/**
 * The Cassandra implementation of {@link ColumnManager}, that supports all methods and also supports
 * CQL and ConsistencyLevel.
 * <p>{@link CassandraColumnManager#select(ColumnQuery, ConsistencyLevel)}</p>
```

### JavadocReference
Cannot resolve symbol `ColumnQuery`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraColumnManager.java`
#### Snippet
```java
 * The Cassandra implementation of {@link ColumnManager}, that supports all methods and also supports
 * CQL and ConsistencyLevel.
 * <p>{@link CassandraColumnManager#select(ColumnQuery, ConsistencyLevel)}</p>
 * <p>{@link CassandraColumnManager#cql(String)}</p>
 * <p>{@link CassandraColumnManager#nativeQueryPrepare(String)}</p>
```

### JavadocReference
Cannot resolve symbol `ColumnDeleteQuery`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraColumnManager.java`
#### Snippet
```java
 * <p>{@link CassandraColumnManager#cql(String)}</p>
 * <p>{@link CassandraColumnManager#nativeQueryPrepare(String)}</p>
 * <p>{@link CassandraColumnManager#delete(ColumnDeleteQuery, ConsistencyLevel)}</p>
 */
public interface CassandraColumnManager extends ColumnManager {
```

### JavadocReference
Cannot resolve symbol `com.mongodb.AuthenticationMechanism`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBDocumentConfigurations.java`
#### Snippet
```java
    AUTHENTICATION_SOURCE("jnosql.mongodb.authentication.source"),
    /**
     * Authentication mechanisms {@link com.mongodb.AuthenticationMechanism}
     */
    AUTHENTICATION_MECHANISM("jnosql.mongodb.authentication.mechanism");
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBDocumentConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum MongoDBDocumentConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `ColumnQuery`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraQuery.java`
#### Snippet
```java
     * returns a new instance of {@link CassandraQuery}
     *
     * @param query       the {@link ColumnQuery}
     * @param pagingState {@link CassandraQuery#pagingState}
     * @return a new instance
```

### JavadocReference
Cannot resolve symbol `ColumnQuery`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraQuery.java`
#### Snippet
```java
     * returns a new instance of {@link CassandraQuery}
     *
     * @param query the {@link ColumnQuery}
     * @return a new instance
     * @throws NullPointerException when query is null
```

### JavadocReference
Cannot resolve symbol `ColumnQuery`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraQuery.java`
#### Snippet
```java

/**
 * A Cassandra specialization of {@link ColumnQuery} that allows query with paging state which can do pagination.
 *
 * @see CassandraQuery#of(ColumnQuery)
```

### JavadocReference
Cannot resolve symbol `ColumnQuery`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraQuery.java`
#### Snippet
```java
 * A Cassandra specialization of {@link ColumnQuery} that allows query with paging state which can do pagination.
 *
 * @see CassandraQuery#of(ColumnQuery)
 * @see CassandraQuery#of(ColumnQuery, String)
 */
```

### JavadocReference
Cannot resolve symbol `ColumnQuery`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraQuery.java`
#### Snippet
```java
 *
 * @see CassandraQuery#of(ColumnQuery)
 * @see CassandraQuery#of(ColumnQuery, String)
 */
public final class CassandraQuery implements ColumnQuery {
```

### JavadocReference
Cannot resolve symbol `DocumentConfiguration`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBDocumentConfiguration.java`
#### Snippet
```java

/**
 * The MongoDB implementation to {@link DocumentConfiguration}
 * that returns  {@link MongoDBDocumentManagerFactory}
 * @see MongoDBDocumentConfigurations
```

### JavadocReference
Cannot resolve symbol `MongoClient`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBDocumentConfiguration.java`
#### Snippet
```java
     * Creates a {@link MongoDBDocumentManagerFactory} from mongoClient
     *
     * @param mongoClient the mongo client {@link MongoClient}
     * @return a MongoDBDocumentManagerFactory instance
     * @throws NullPointerException when the mongoClient is null
```

### JavadocReference
Cannot resolve symbol `ValueReader`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/BinaryValueReader.java`
#### Snippet
```java

/**
 * An implementation of {@link ValueReader} of {@link Binary}
 */
public class BinaryValueReader implements ValueReader {
```

### JavadocReference
Cannot resolve symbol `Binary`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/BinaryValueReader.java`
#### Snippet
```java

/**
 * An implementation of {@link ValueReader} of {@link Binary}
 */
public class BinaryValueReader implements ValueReader {
```

### JavadocReference
Cannot resolve symbol `DocumentManagerFactory`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBDocumentManagerFactory.java`
#### Snippet
```java

/**
 * The mongodb implementation to {@link DocumentManagerFactory}
 */
public class MongoDBDocumentManagerFactory implements DocumentManagerFactory {
```

### JavadocReference
Cannot resolve symbol `DocumentManager`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseDocumentManager.java`
#### Snippet
```java

/**
 * The couchbase implementation of {@link DocumentManager}
 */
public interface CouchbaseDocumentManager extends DocumentManager {
```

### JavadocReference
Cannot resolve symbol `DocumentConfiguration`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseDocumentConfiguration.java`
#### Snippet
```java

/**
 * The couchbase implementation of {@link DocumentConfiguration}  that returns
 * {@link CouchbaseDocumentManagerFactory}.
 * @see CouchbaseConfigurations
```

### JavadocReference
Cannot resolve symbol `KeyValueConfiguration`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseKeyValueConfiguration.java`
#### Snippet
```java

/**
 * The couchbase implementation to {@link KeyValueConfiguration} that returns {@link DefaultCouchbaseBucketManagerFactory}.
 * @see CouchbaseConfigurations
 */
```

### JavadocReference
Cannot resolve symbol `DocumentManager`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBDocumentManager.java`
#### Snippet
```java

/**
 * The mongodb implementation to {@link DocumentManager} that does not support TTL methods
 * <p>{@link MongoDBDocumentManager#insert(DocumentEntity, Duration)}</p>
 */
```

### JavadocReference
Cannot resolve symbol `DocumentEntity`
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/MongoDBDocumentManager.java`
#### Snippet
```java
/**
 * The mongodb implementation to {@link DocumentManager} that does not support TTL methods
 * <p>{@link MongoDBDocumentManager#insert(DocumentEntity, Duration)}</p>
 */
public class MongoDBDocumentManager implements DocumentManager {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum CouchbaseConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `BucketManager`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseBucketManager.java`
#### Snippet
```java

/**
 * The couchbase implementation to {@link BucketManager}
 */
public class CouchbaseBucketManager implements BucketManager {
```

### JavadocReference
Cannot resolve symbol `BucketManager`
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/HazelcastBucketManager.java`
#### Snippet
```java

/**
 * The hazelcast implementation of {@link BucketManager}
 */
public interface HazelcastBucketManager extends BucketManager {
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/HazelcastBucketManagerFactory.java`
#### Snippet
```java

/**
 * The hazelcast implementation of {@link BucketManagerFactory}
 */
public interface HazelcastBucketManagerFactory extends BucketManagerFactory {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Configurations`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java

    /**
     * Returns the host {@link org.eclipse.jnosql.communication.Configurations#HOST} or {@link CouchbaseConfigurations#HOST}
     *
     * @return the host {@link org.eclipse.jnosql.communication.Configurations#HOST} or {@link CouchbaseConfigurations#HOST}
```

### JavadocReference
Cannot resolve symbol `HOST`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java

    /**
     * Returns the host {@link org.eclipse.jnosql.communication.Configurations#HOST} or {@link CouchbaseConfigurations#HOST}
     *
     * @return the host {@link org.eclipse.jnosql.communication.Configurations#HOST} or {@link CouchbaseConfigurations#HOST}
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Configurations`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java
     * Returns the host {@link org.eclipse.jnosql.communication.Configurations#HOST} or {@link CouchbaseConfigurations#HOST}
     *
     * @return the host {@link org.eclipse.jnosql.communication.Configurations#HOST} or {@link CouchbaseConfigurations#HOST}
     */
    public String getHost() {
```

### JavadocReference
Cannot resolve symbol `HOST`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java
     * Returns the host {@link org.eclipse.jnosql.communication.Configurations#HOST} or {@link CouchbaseConfigurations#HOST}
     *
     * @return the host {@link org.eclipse.jnosql.communication.Configurations#HOST} or {@link CouchbaseConfigurations#HOST}
     */
    public String getHost() {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Configurations`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java

    /**
     * Returns the password {@link org.eclipse.jnosql.communication.Configurations#PASSWORD} or {@link CouchbaseConfigurations#PASSWORD}
     *
     * @return the password {@link org.eclipse.jnosql.communication.Configurations#PASSWORD} or {@link CouchbaseConfigurations#PASSWORD}
```

### JavadocReference
Cannot resolve symbol `PASSWORD`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java

    /**
     * Returns the password {@link org.eclipse.jnosql.communication.Configurations#PASSWORD} or {@link CouchbaseConfigurations#PASSWORD}
     *
     * @return the password {@link org.eclipse.jnosql.communication.Configurations#PASSWORD} or {@link CouchbaseConfigurations#PASSWORD}
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Configurations`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java
     * Returns the password {@link org.eclipse.jnosql.communication.Configurations#PASSWORD} or {@link CouchbaseConfigurations#PASSWORD}
     *
     * @return the password {@link org.eclipse.jnosql.communication.Configurations#PASSWORD} or {@link CouchbaseConfigurations#PASSWORD}
     */
    public String getPassword() {
```

### JavadocReference
Cannot resolve symbol `PASSWORD`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java
     * Returns the password {@link org.eclipse.jnosql.communication.Configurations#PASSWORD} or {@link CouchbaseConfigurations#PASSWORD}
     *
     * @return the password {@link org.eclipse.jnosql.communication.Configurations#PASSWORD} or {@link CouchbaseConfigurations#PASSWORD}
     */
    public String getPassword() {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Configurations`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java

    /**
     * Returns the user {@link org.eclipse.jnosql.communication.Configurations#USER} or {@link CouchbaseConfigurations#USER}
     *
     * @return the user {@link org.eclipse.jnosql.communication.Configurations#USER} or {@link CouchbaseConfigurations#USER}
```

### JavadocReference
Cannot resolve symbol `USER`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java

    /**
     * Returns the user {@link org.eclipse.jnosql.communication.Configurations#USER} or {@link CouchbaseConfigurations#USER}
     *
     * @return the user {@link org.eclipse.jnosql.communication.Configurations#USER} or {@link CouchbaseConfigurations#USER}
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Configurations`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java
     * Returns the user {@link org.eclipse.jnosql.communication.Configurations#USER} or {@link CouchbaseConfigurations#USER}
     *
     * @return the user {@link org.eclipse.jnosql.communication.Configurations#USER} or {@link CouchbaseConfigurations#USER}
     */
    public String getUser() {
```

### JavadocReference
Cannot resolve symbol `USER`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseSettings.java`
#### Snippet
```java
     * Returns the user {@link org.eclipse.jnosql.communication.Configurations#USER} or {@link CouchbaseConfigurations#USER}
     *
     * @return the user {@link org.eclipse.jnosql.communication.Configurations#USER} or {@link CouchbaseConfigurations#USER}
     */
    public String getUser() {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/HazelcastConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum HazelcastConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-infinispan/src/main/java/org/eclipse/jnosql/databases/infinispan/communication/InfinispanConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum InfinispanConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `BucketManagerFactory`
in `jnosql-infinispan/src/main/java/org/eclipse/jnosql/databases/infinispan/communication/InfinispanBucketManagerFactory.java`
#### Snippet
```java

/**
 * The Infinispan implementation of {@link BucketManagerFactory}
 */
public class InfinispanBucketManagerFactory implements BucketManagerFactory {
```

### JavadocReference
Cannot resolve symbol `org.infinispan.configuration.cache.Configuration`
in `jnosql-infinispan/src/main/java/org/eclipse/jnosql/databases/infinispan/communication/InfinispanKeyValueConfiguration.java`
#### Snippet
```java
    /**
     * Creates a {@link InfinispanBucketManagerFactory} from infinispan config
     * @param config the {@link org.infinispan.configuration.cache.Configuration}
     * @return the InfinispanBucketManagerFactory instance
     * @throws NullPointerException when config is null
```

### JavadocReference
Cannot resolve symbol `KeyValueConfiguration`
in `jnosql-infinispan/src/main/java/org/eclipse/jnosql/databases/infinispan/communication/InfinispanKeyValueConfiguration.java`
#### Snippet
```java

/**
 * The Infinispan implementation of {@link KeyValueConfiguration} that returns
 * {@link InfinispanBucketManagerFactory}.
 * @see InfinispanConfigurations
```

### JavadocReference
Cannot resolve symbol `BucketManager`
in `jnosql-infinispan/src/main/java/org/eclipse/jnosql/databases/infinispan/communication/InfinispanBucketManager.java`
#### Snippet
```java

/**
 * The Infinispan implementation of {@link BucketManager}
 */
public class InfinispanBucketManager implements BucketManager {
```

### JavadocReference
Cannot resolve symbol `Value`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java

    /**
     * Converts the {@link Value} to {@link List}
     *
     * @param value the value
```

### JavadocReference
Cannot resolve symbol `Value`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java

/**
 * Utilitarian class to {@link Value}
 */
public final class ValueUtil {
```

### JavadocReference
Cannot resolve symbol `Value`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java

    /**
     * converter a {@link Value} to Object
     *
     * @param value the value
```

### JavadocReference
Cannot resolve symbol `KeyValueConfiguration`
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/communication/HazelcastKeyValueConfiguration.java`
#### Snippet
```java

/**
 * The hazelcast implementation of {@link KeyValueConfiguration} that returns
 * {@link HazelcastBucketManagerFactory}.
 *
```

### JavadocReference
Cannot resolve symbol `Value`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueJSON.java`
#### Snippet
```java

    /**
     * Returns a new instance of {@link Value} converting to JSON first
     *
     * @param json the value
```

### JavadocReference
Cannot resolve symbol `Value`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueJSON.java`
#### Snippet
```java

    /**
     * Returns a new instance of {@link Value} keeping the value as JSON
     *
     * @param json the value
```

### JavadocReference
Cannot resolve symbol `Value`
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueJSON.java`
#### Snippet
```java

/**
 * A {@link Value} implementation that storage all the information as a {@link String} with JSON format.
 */
public class ValueJSON implements Value {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.jnosql.communication.Settings`
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HbaseConfigurations.java`
#### Snippet
```java
 * overwritten by the system environment using Eclipse Microprofile or Jakarta Config API.
 *
 * @see org.eclipse.jnosql.communication.Settings
 */
public enum  HbaseConfigurations implements Supplier<String> {
```

### JavadocReference
Cannot resolve symbol `HBaseConfiguration`
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnConfiguration.java`
#### Snippet
```java

    /**
     * creates an {@link HBaseColumnConfiguration} instance with {@link HBaseConfiguration#create()}
     */
    public HBaseColumnConfiguration() {
```

### JavadocReference
Cannot resolve symbol `create()`
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnConfiguration.java`
#### Snippet
```java

    /**
     * creates an {@link HBaseColumnConfiguration} instance with {@link HBaseConfiguration#create()}
     */
    public HBaseColumnConfiguration() {
```

### JavadocReference
Cannot resolve symbol `ColumnManager`
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnManager.java`
#### Snippet
```java

/**
 * The Hbase implementation to {@link ColumnManager}.
 * It does not support TTL methods
 * <p>{@link HBaseColumnManager#insert(ColumnEntity, Duration)}</p>
```

### JavadocReference
Cannot resolve symbol `ColumnEntity`
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnManager.java`
#### Snippet
```java
 * The Hbase implementation to {@link ColumnManager}.
 * It does not support TTL methods
 * <p>{@link HBaseColumnManager#insert(ColumnEntity, Duration)}</p>
 */
public class HBaseColumnManager implements ColumnManager {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Switch label `IN` is unreachable
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
        Document document = condition.document();
        switch (condition.condition()) {
            case IN:
                appendCondition(aql, params, entity, document, IN);
                return;
```

### DataFlowIssue
Switch label `EQUALS` is unreachable
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                appendCondition(aql, params, entity, document, IN);
                return;
            case EQUALS:
                appendCondition(aql, params, entity, document, EQUALS);
                return;
```

### DataFlowIssue
Switch label `GREATER_EQUALS_THAN` is unreachable
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                appendCondition(aql, params, entity, document, EQUALS);
                return;
            case GREATER_EQUALS_THAN:
                appendCondition(aql, params, entity, document, GREATER_EQUALS_THAN);
                return;
```

### DataFlowIssue
Switch label `GREATER_THAN` is unreachable
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                appendCondition(aql, params, entity, document, GREATER_EQUALS_THAN);
                return;
            case GREATER_THAN:
                appendCondition(aql, params, entity, document, GREATER_THAN);
                return;
```

### DataFlowIssue
Switch label `LESSER_THAN` is unreachable
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                appendCondition(aql, params, entity, document, GREATER_THAN);
                return;
            case LESSER_THAN:
                appendCondition(aql, params, entity, document, LESSER_THAN);
                return;
```

### DataFlowIssue
Switch label `LESSER_EQUALS_THAN` is unreachable
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                appendCondition(aql, params, entity, document, LESSER_THAN);
                return;
            case LESSER_EQUALS_THAN:
                appendCondition(aql, params, entity, document, LESSER_EQUALS_THAN);
                return;
```

### DataFlowIssue
Switch label `LIKE` is unreachable
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                appendCondition(aql, params, entity, document, LESSER_EQUALS_THAN);
                return;
            case LIKE:
                appendCondition(aql, params, entity, document, LIKE);
                return;
```

### DataFlowIssue
Switch label `AND` is unreachable
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                appendCondition(aql, params, entity, document, LIKE);
                return;
            case AND:

                for (DocumentCondition dc : document.get(new TypeReference<List<DocumentCondition>>() {
```

### DataFlowIssue
Switch label `OR` is unreachable
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                }
                return;
            case OR:

                for (DocumentCondition dc : document.get(new TypeReference<List<DocumentCondition>>() {
```

### DataFlowIssue
Switch label `NOT` is unreachable
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/QueryAQLConverter.java`
#### Snippet
```java
                }
                return;
            case NOT:
                DocumentCondition documentCondition = document.get(DocumentCondition.class);
                aql.append(NOT);
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
Switch label `IN` is unreachable
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
        Document document = condition.document();
        switch (condition.condition()) {
            case IN:
                appendCondition(query, params, document, IN, ids);
                return;
```

### DataFlowIssue
Switch label `EQUALS` is unreachable
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
                appendCondition(query, params, document, IN, ids);
                return;
            case EQUALS:
                appendCondition(query, params, document, EQUALS, ids);
                return;
```

### DataFlowIssue
Switch label `GREATER_EQUALS_THAN` is unreachable
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
                appendCondition(query, params, document, EQUALS, ids);
                return;
            case GREATER_EQUALS_THAN:
                appendCondition(query, params, document, GREATER_EQUALS_THAN, ids);
                return;
```

### DataFlowIssue
Switch label `GREATER_THAN` is unreachable
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
                appendCondition(query, params, document, GREATER_EQUALS_THAN, ids);
                return;
            case GREATER_THAN:
                appendCondition(query, params, document, GREATER_THAN, ids);
                return;
```

### DataFlowIssue
Switch label `LESSER_THAN` is unreachable
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
                appendCondition(query, params, document, GREATER_THAN, ids);
                return;
            case LESSER_THAN:
                appendCondition(query, params, document, LESSER_THAN, ids);
                return;
```

### DataFlowIssue
Switch label `LESSER_EQUALS_THAN` is unreachable
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
                appendCondition(query, params, document, LESSER_THAN, ids);
                return;
            case LESSER_EQUALS_THAN:
                appendCondition(query, params, document, LESSER_EQUALS_THAN, ids);
                return;
```

### DataFlowIssue
Switch label `LIKE` is unreachable
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
                appendCondition(query, params, document, LESSER_EQUALS_THAN, ids);
                return;
            case LIKE:
                appendCondition(query, params, document, LIKE, ids);
                return;
```

### DataFlowIssue
Switch label `AND` is unreachable
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
                appendCondition(query, params, document, LIKE, ids);
                return;
            case AND:
                for (DocumentCondition dc : document.get(new TypeReference<List<DocumentCondition>>() {
                })) {
```

### DataFlowIssue
Switch label `OR` is unreachable
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLConverter.java`
#### Snippet
```java
                }
                return;
            case OR:
                for (DocumentCondition dc : document.get(new TypeReference<List<DocumentCondition>>() {
                })) {
```

### DataFlowIssue
Condition `CassandraQuery.class.isInstance(query)` is redundant and can be replaced with a null check
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryExecutor.java`
#### Snippet
```java

    static QueryExecutor of(ColumnQuery query) {
        if (CassandraQuery.class.isInstance(query)) {
            return QueryExecutorType.PAGING_STATE;
        }
```

### DataFlowIssue
Condition `UDT.class.isInstance(c)` is redundant and can be replaced with a null check
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
        entity.columns().stream()
                .forEach(c -> {
                    if (UDT.class.isInstance(c)) {
                        insertUDT(UDT.class.cast(c), keyspace, entity.name(), session, values);
                    } else {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
                        insertUDT(UDT.class.cast(c), keyspace, entity.name(), session, values);
                    } else {
                        insertSingleField(c, values);
                    }
                });
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

## RuleId[id=RedundantClassCall]
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

    private static Object getMap(Object val) {
        return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .collect(toMap(KEY_DOCUMENT, VALUE_DOCUMENT));
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

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
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
                map.put(d.name(), subDocument);
            } else if (isSudDocumentList(value)) {
                map.put(d.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                        .map(EntityConverter::getMap).collect(toList()));
            } else {
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

    private void appendCombination(JsonObjectBuilder selector, Object value, String combination) {
        List<DocumentCondition> conditions = List.class.cast(value);
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (DocumentCondition documentCondition : conditions) {
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
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
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
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isDocumentIterable(d));
    }
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

    private static List<Object> getObjects(Object val) {
        return (List<Object>) StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .map(CONVERT).collect(toList());
    }
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
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
                .getCollections().stream()
                .map(CollectionEntity::getName)
                .collect(toList());
        if (!collections.contains(namespace)) {
            arangoDB.db(DbName.of(bucketName)).createCollection(namespace);
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
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnManagerFactory.java`
#### Snippet
```java
    private void createTable(Admin admin, TableName tableName) throws IOException {
        final TableDescriptorBuilder builder = TableDescriptorBuilder.newBuilder(tableName);
        families.stream().forEach(s -> builder.setColumnFamily(ColumnFamilyDescriptorBuilder.newBuilder(s.getBytes())
                .build()));
        final TableDescriptor descriptor = builder.build();
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/ArangoDBUtil.java`
#### Snippet
```java
        if (isADocumentIterable(value)) {
            List<List<Document>> documents = new ArrayList<>();
            for (Object object : Iterable.class.cast(value)) {
                Map<?, ?> map = Map.class.cast(object);
                documents.add(map.entrySet().stream().map(ENTRY_DOCUMENT).collect(toList()));
            }
            return Document.of(key, documents);

        }
        return Document.of(key, value);
```

### DuplicatedCode
Duplicated code
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/ParamUtil.java`
#### Snippet
```java
        Map<String, Object> jsonObject = new HashMap<>();
        Annotation[][] annotations = method.getParameterAnnotations();

        for (int index = 0; index < annotations.length; index++) {

            final Object arg = args[index];

            Optional<Param> param = Stream.of(annotations[index])
                    .filter(Param.class::isInstance)
                    .map(Param.class::cast)
                    .findFirst();
            param.ifPresent(p -> jsonObject.put(p.value(), arg));

        }

        return jsonObject;
```

### DuplicatedCode
Duplicated code
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/JsonObjectUtil.java`
#### Snippet
```java
        Annotation[][] annotations = method.getParameterAnnotations();

        for (int index = 0; index < annotations.length; index++) {

            final Object arg = args[index];

            Optional<Param> param = Stream.of(annotations[index])
                    .filter(Param.class::isInstance)
                    .map(Param.class::cast)
                    .findFirst();
            param.ifPresent(p -> jsonObject.put(p.value(), arg));

        }

        return jsonObject;
```

### DuplicatedCode
Duplicated code
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/DefaultUDT.java`
#### Snippet
```java
        final StringBuilder sb = new StringBuilder("UDT{");
        sb.append("name='").append(name).append('\'');
        sb.append(", userType='").append(userType).append('\'');
        sb.append(", columns=").append(columns);
        sb.append('}');
        return sb.toString();
```

### DuplicatedCode
Duplicated code
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/DefaultCouchbaseBucketManagerFactory.java`
#### Snippet
```java
        requireNonNull(valueValue, "valueValue is required");
        requireNonNull(keyValue, "keyValue is required");

        if (!String.class.isAssignableFrom(keyValue)) {
            throw new UnsupportedOperationException("Couchbase Map does not support a not String key instead of: "
                    + keyValue);
        }
        Bucket bucket = this.cluster.bucket(bucketName);
        Collection collection = bucket.collection(bucketName);
```

### DuplicatedCode
Duplicated code
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoDBBuilderASync.java`
#### Snippet
```java
        boolean accessKey = awsAccessKey != null && !awsAccessKey.equals("");
        boolean secretAccess = awsSecretAccess != null && !awsSecretAccess.equals("");

        if (accessKey && secretAccess) {

            AwsBasicCredentials awsBasicCredentials = AwsBasicCredentials.create(awsAccessKey, awsSecretAccess);
            AwsCredentialsProvider staticCredentialsProvider = StaticCredentialsProvider.create(awsBasicCredentials);
            dynamoDB.credentialsProvider(staticCredentialsProvider);
        }

        return dynamoDB.build();
```

### DuplicatedCode
Duplicated code
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchEntry.java`
#### Snippet
```java
        Object value = properties.get(key);
        if (Map.class.isInstance(value)) {
            Map map = Map.class.cast(value);
            return Document.of(key, map.keySet()
                    .stream().map(k -> toDocument(k.toString(), map))
                    .collect(Collectors.toList()));
        }
        if (isADocumentIterable(value)) {
            List<List<Document>> documents = new ArrayList<>();
            for (Object object : Iterable.class.cast(value)) {
                Map<?, ?> map = Map.class.cast(object);
                documents.add(map.entrySet().stream().map(ENTRY_DOCUMENT).collect(toList()));
            }
            return Document.of(key, documents);

        }
        return Document.of(key, value);
```

### DuplicatedCode
Duplicated code
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/EntityConverter.java`
#### Snippet
```java
        return d -> {
            Object value = ValueUtil.convert(d.value());
            if (value instanceof Document) {
                Document subDocument = Document.class.cast(value);
                jsonObject.put(d.name(), singletonMap(subDocument.name(), subDocument.get()));
            } else if (isSudDocument(value)) {
                Map<String, Object> subDocument = getMap(value);
                jsonObject.put(d.name(), subDocument);
            } else if (isSudDocumentList(value)) {
                jsonObject.put(d.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                        .map(EntityConverter::getMap).collect(toList()));
            } else {
                jsonObject.put(d.name(), value);
            }
        };
```

## RuleId[id=StringBufferReplaceableByString]
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
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/EntityUnit.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EntityUnit{");
        sb.append("rowKey='").append(rowKey).append('\'');
        sb.append(", columnFamily='").append(columnFamily).append('\'');
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

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/DefaultArangoDBTemplate.java`
#### Snippet
```java
    @Inject
    DefaultArangoDBTemplate(Instance<ArangoDBDocumentManager> manager,
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
                            EntitiesMetadata entities,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/DefaultArangoDBTemplate.java`
#### Snippet
```java
    @Inject
    DefaultArangoDBTemplate(Instance<ArangoDBDocumentManager> manager,
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
                            EntitiesMetadata entities,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/DefaultArangoDBTemplate.java`
#### Snippet
```java
    DefaultArangoDBTemplate(Instance<ArangoDBDocumentManager> manager,
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
                            EntitiesMetadata entities,
                            Converters converters) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/DefaultArangoDBTemplate.java`
#### Snippet
```java
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
                            EntitiesMetadata entities,
                            Converters converters) {
        this.manager = manager;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/mapping/DefaultArangoDBTemplate.java`
#### Snippet
```java
                            DocumentEventPersistManager persistManager,
                            EntitiesMetadata entities,
                            Converters converters) {
        this.manager = manager;
        this.converter = converter;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/mapping/DefaultElasticsearchTemplate.java`
#### Snippet
```java
    @Inject
    DefaultElasticsearchTemplate(Instance<ElasticsearchDocumentManager> manager,
                                 DocumentEntityConverter converter, DocumentWorkflow flow,
                                 DocumentEventPersistManager persistManager,
                                 EntitiesMetadata entities,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/mapping/DefaultElasticsearchTemplate.java`
#### Snippet
```java
    @Inject
    DefaultElasticsearchTemplate(Instance<ElasticsearchDocumentManager> manager,
                                 DocumentEntityConverter converter, DocumentWorkflow flow,
                                 DocumentEventPersistManager persistManager,
                                 EntitiesMetadata entities,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/mapping/DefaultElasticsearchTemplate.java`
#### Snippet
```java
    DefaultElasticsearchTemplate(Instance<ElasticsearchDocumentManager> manager,
                                 DocumentEntityConverter converter, DocumentWorkflow flow,
                                 DocumentEventPersistManager persistManager,
                                 EntitiesMetadata entities,
                                 Converters converters) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/mapping/DefaultElasticsearchTemplate.java`
#### Snippet
```java
                                 DocumentEntityConverter converter, DocumentWorkflow flow,
                                 DocumentEventPersistManager persistManager,
                                 EntitiesMetadata entities,
                                 Converters converters) {
        this.manager = manager;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/mapping/DefaultElasticsearchTemplate.java`
#### Snippet
```java
                                 DocumentEventPersistManager persistManager,
                                 EntitiesMetadata entities,
                                 Converters converters) {
        this.manager = manager;
        this.converter = converter;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/DefaultSolrTemplate.java`
#### Snippet
```java
    @Inject
    DefaultSolrTemplate(Instance<SolrDocumentManager> manager,
                        DocumentEntityConverter converter, DocumentWorkflow flow,
                        DocumentEventPersistManager persistManager,
                        EntitiesMetadata entities,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/DefaultSolrTemplate.java`
#### Snippet
```java
    @Inject
    DefaultSolrTemplate(Instance<SolrDocumentManager> manager,
                        DocumentEntityConverter converter, DocumentWorkflow flow,
                        DocumentEventPersistManager persistManager,
                        EntitiesMetadata entities,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/DefaultSolrTemplate.java`
#### Snippet
```java
    DefaultSolrTemplate(Instance<SolrDocumentManager> manager,
                        DocumentEntityConverter converter, DocumentWorkflow flow,
                        DocumentEventPersistManager persistManager,
                        EntitiesMetadata entities,
                        Converters converters) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/DefaultSolrTemplate.java`
#### Snippet
```java
                        DocumentEntityConverter converter, DocumentWorkflow flow,
                        DocumentEventPersistManager persistManager,
                        EntitiesMetadata entities,
                        Converters converters) {
        this.manager = manager;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/mapping/DefaultSolrTemplate.java`
#### Snippet
```java
                        DocumentEventPersistManager persistManager,
                        EntitiesMetadata entities,
                        Converters converters) {
        this.manager = manager;
        this.converter = converter;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/DefaultOrientDBTemplate.java`
#### Snippet
```java
    @Inject
    DefaultOrientDBTemplate(Instance<OrientDBDocumentManager> manager,
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
                            EntitiesMetadata entities,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/DefaultOrientDBTemplate.java`
#### Snippet
```java
    @Inject
    DefaultOrientDBTemplate(Instance<OrientDBDocumentManager> manager,
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
                            EntitiesMetadata entities,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/DefaultOrientDBTemplate.java`
#### Snippet
```java
    DefaultOrientDBTemplate(Instance<OrientDBDocumentManager> manager,
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
                            EntitiesMetadata entities,
                            Converters converters) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/DefaultOrientDBTemplate.java`
#### Snippet
```java
                            DocumentEntityConverter converter, DocumentWorkflow flow,
                            DocumentEventPersistManager persistManager,
                            EntitiesMetadata entities,
                            Converters converters) {

```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/mapping/DefaultOrientDBTemplate.java`
#### Snippet
```java
                            DocumentEventPersistManager persistManager,
                            EntitiesMetadata entities,
                            Converters converters) {

        this.manager = manager;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnWorkflow.java`
#### Snippet
```java

    @Inject
    private ColumnEventPersistManager columnEventPersistManager;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java

    @Inject
    private Converters converters;


```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java

    @Inject
    private EntitiesMetadata entities;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/DefaultCassandraTemplate.java`
#### Snippet
```java
                             CassandraColumnEntityConverter converter,
                             CassandraColumnWorkflow flow,
                             ColumnEventPersistManager persistManager,
                             EntitiesMetadata entities,
                             Converters converters) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/DefaultCassandraTemplate.java`
#### Snippet
```java
                             CassandraColumnWorkflow flow,
                             ColumnEventPersistManager persistManager,
                             EntitiesMetadata entities,
                             Converters converters) {
        this.manager = manager;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/DefaultCassandraTemplate.java`
#### Snippet
```java
                             ColumnEventPersistManager persistManager,
                             EntitiesMetadata entities,
                             Converters converters) {
        this.manager = manager;
        this.converter = converter;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/mapping/DefaultMongoDBTemplate.java`
#### Snippet
```java
    @Inject
    DefaultMongoDBTemplate(Instance<MongoDBDocumentManager> manager,
            DocumentEntityConverter converter,
            DocumentWorkflow workflow,
            EntitiesMetadata entities,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/mapping/DefaultMongoDBTemplate.java`
#### Snippet
```java
    DefaultMongoDBTemplate(Instance<MongoDBDocumentManager> manager,
            DocumentEntityConverter converter,
            DocumentWorkflow workflow,
            EntitiesMetadata entities,
            Converters converters,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/mapping/DefaultMongoDBTemplate.java`
#### Snippet
```java
            DocumentEntityConverter converter,
            DocumentWorkflow workflow,
            EntitiesMetadata entities,
            Converters converters,
            DocumentEventPersistManager persistManager) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/mapping/DefaultMongoDBTemplate.java`
#### Snippet
```java
            DocumentWorkflow workflow,
            EntitiesMetadata entities,
            Converters converters,
            DocumentEventPersistManager persistManager) {
        this.manager = manager;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/mapping/DefaultMongoDBTemplate.java`
#### Snippet
```java
            EntitiesMetadata entities,
            Converters converters,
            DocumentEventPersistManager persistManager) {
        this.manager = manager;
        this.converter = converter;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/DefaultCouchbaseTemplate.java`
#### Snippet
```java
    @Inject
    DefaultCouchbaseTemplate(Instance<CouchbaseDocumentManager> manager,
                             DocumentEntityConverter converter, DocumentWorkflow flow,
                             DocumentEventPersistManager persistManager,
                             EntitiesMetadata entities,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/DefaultCouchbaseTemplate.java`
#### Snippet
```java
    @Inject
    DefaultCouchbaseTemplate(Instance<CouchbaseDocumentManager> manager,
                             DocumentEntityConverter converter, DocumentWorkflow flow,
                             DocumentEventPersistManager persistManager,
                             EntitiesMetadata entities,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/DefaultCouchbaseTemplate.java`
#### Snippet
```java
    DefaultCouchbaseTemplate(Instance<CouchbaseDocumentManager> manager,
                             DocumentEntityConverter converter, DocumentWorkflow flow,
                             DocumentEventPersistManager persistManager,
                             EntitiesMetadata entities,
                             Converters converters) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/DefaultCouchbaseTemplate.java`
#### Snippet
```java
                             DocumentEntityConverter converter, DocumentWorkflow flow,
                             DocumentEventPersistManager persistManager,
                             EntitiesMetadata entities,
                             Converters converters) {
        this.manager = manager;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/mapping/DefaultCouchbaseTemplate.java`
#### Snippet
```java
                             DocumentEventPersistManager persistManager,
                             EntitiesMetadata entities,
                             Converters converters) {
        this.manager = manager;
        this.converter = converter;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/mapping/DefaultHazelcastTemplate.java`
#### Snippet
```java
    @Inject
    DefaultHazelcastTemplate(Instance<HazelcastBucketManager> manager,
                             KeyValueWorkflow flow,
                             KeyValueEntityConverter converter,
                             KeyValueEventPersistManager persistManager) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/mapping/DefaultHazelcastTemplate.java`
#### Snippet
```java
    DefaultHazelcastTemplate(Instance<HazelcastBucketManager> manager,
                             KeyValueWorkflow flow,
                             KeyValueEntityConverter converter,
                             KeyValueEventPersistManager persistManager) {
        this.manager = manager;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `jnosql-hazelcast/src/main/java/org/eclipse/jnosql/databases/hazelcast/mapping/DefaultHazelcastTemplate.java`
#### Snippet
```java
                             KeyValueWorkflow flow,
                             KeyValueEntityConverter converter,
                             KeyValueEventPersistManager persistManager) {
        this.manager = manager;
        this.flow = flow;
```

## RuleId[id=NullableProblems]
### NullableProblems
Non-annotated parameter 'a' in method 'toArray' from 'RedisCollection' should not override non-null parameter from 'Set'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisSet.java`
#### Snippet
```java
import java.util.Set;

class RedisSet<T> extends RedisCollection<T> implements Set<T> {

    RedisSet(Jedis jedis, Class<T> clazz, String keyWithNameSpace) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisList.java`
#### Snippet
```java

    @Override
    public boolean addAll(int index, Collection<? extends T> elements) {
        Objects.requireNonNull(elements);
        for (T element : elements) {
```

### NullableProblems
Non-annotated parameter 'a' in method 'toArray' from 'RedisCollection' should not override non-null parameter from 'List'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisList.java`
#### Snippet
```java
import java.util.Objects;

class RedisList<T> extends RedisCollection<T> implements List<T> {


```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public boolean removeAll(Collection<?> elements) {
        Objects.requireNonNull(elements);
        boolean result = false;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Use add all instead");
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Objects.requireNonNull(c);
        for (T bean : c) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java

    @Override
    public <E> E[] toArray(E[] a) {
        return toArrayList().toArray(a);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public boolean containsAll(Collection<?> elements) {
        Objects.requireNonNull(elements);
        boolean containsAll = true;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisMap.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        requireNonNull(map, "map is required");

```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `jnosql-mongodb/src/main/java/org/eclipse/jnosql/databases/mongodb/communication/BinaryValueReader.java`
#### Snippet
```java
    @Override
    public boolean test(Class<?> type) {
        return Binary.class.equals(type);
    }

```

### EqualsBetweenInconvertibleTypes
`isEqual` between objects of inconvertible types 'Column' and 'T'
in `jnosql-hbase/src/main/java/org/eclipse/jnosql/databases/hbase/communication/HBaseColumnManager.java`
#### Snippet
```java

        Put put = new Put(Bytes.toBytes(valueToString(columnID.value())));
        columns.stream().filter(Predicate.isEqual(columnID).negate()).forEach(column ->
                put.addColumn(Bytes.toBytes(family),
                        Bytes.toBytes(column.name()),
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `jnosql-solr/src/main/java/org/eclipse/jnosql/databases/solr/communication/SolrDocumentConfigurations.java`
#### Snippet
```java
public enum SolrDocumentConfigurations implements Supplier<String> {
    /**
     * Database's host. E.g.: jnosql.solr.host=http://localhost:8983/solr/
     */
    HOST("jnosql.solr.host"),
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/OrientDBDocumentManagerFactory.java`
#### Snippet
```java
public class OrientDBDocumentManagerFactory implements DocumentManagerFactory {

    private final String host;
    private final String user;
    private final String password;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/DefaultCassandraColumnManager.java`
#### Snippet
```java
    private final CqlSession session;

    private final Executor executor;

    private final String keyspace;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseDocumentManagerFactory.java`
#### Snippet
```java


    private final CouchbaseSettings settings;
    private final Cluster cluster;
    CouchbaseDocumentManagerFactory(CouchbaseSettings settings) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/CouchbaseBucketManager.java`
#### Snippet
```java
    private final String collectionName;

    private final String scopeName;


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
`Optional` used as type for field 'password'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/CassandraProperties.java`
#### Snippet
```java
    private Optional<String> user;

    private Optional<String> password;

    private int port;
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
`Optional` used as type for field 'INSTANCE'
in `jnosql-database-commons/src/main/java/org/eclipse/jnosql/communication/driver/JsonbSupplierServiceLoader.java`
#### Snippet
```java
    private static final List<JsonbSupplier> LOADERS;

    static final Optional<JsonbSupplier> INSTANCE;

    static {
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ArangoCursor' used without 'try'-with-resources statement
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/DefaultArangoDBDocumentManager.java`
#### Snippet
```java

        AQLQueryResult delete = QueryAQLConverter.delete(query);
        arangoDB.db(DbName.of(database)).query(delete.getQuery(), delete.getValues(),
                null, BaseDocument.class);
    }
```

### AutoCloseableResource
'ArangoCursor' used without 'try'-with-resources statement
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/DefaultArangoDBDocumentManager.java`
#### Snippet
```java
        requireNonNull(query, "query is required");
        requireNonNull(typeClass, "typeClass is required");
        ArangoCursor<T> result = arangoDB.db(DbName.of(database)).query(query, emptyMap(), null, typeClass);
        return StreamSupport.stream(result.spliterator(), false);
    }
```

### AutoCloseableResource
'ArangoCursor' used without 'try'-with-resources statement
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/DefaultArangoDBDocumentManager.java`
#### Snippet
```java

        AQLQueryResult result = QueryAQLConverter.select(query);
        ArangoCursor<BaseDocument> documents = arangoDB.db(DbName.of(database)).query(result.getQuery(),
                result.getValues(), null, BaseDocument.class);

```

### AutoCloseableResource
'ArangoCursor' used without 'try'-with-resources statement
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/DefaultArangoDBDocumentManager.java`
#### Snippet
```java
        requireNonNull(values, "values is required");
        requireNonNull(typeClass, "typeClass is required");
        ArangoCursor<T> result = arangoDB.db(DbName.of(database)).query(query, values, null, typeClass);
        return StreamSupport.stream(result.spliterator(), false);
    }
```

### AutoCloseableResource
'ArangoCursor' used without 'try'-with-resources statement
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/DefaultArangoDBDocumentManager.java`
#### Snippet
```java
        Objects.requireNonNull(documentCollection, "document collection is required");
        String aql = "RETURN LENGTH(" + documentCollection + ")";
        ArangoCursor<Object> query = arangoDB.db(DbName.of(database)).query(aql, emptyMap(), null, Object.class);
        return StreamSupport.stream(query.spliterator(), false).findFirst().map(Long.class::cast).orElse(0L);
    }
```

### AutoCloseableResource
'ArangoCursor' used without 'try'-with-resources statement
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/DefaultArangoDBDocumentManager.java`
#### Snippet
```java
        requireNonNull(query, "query is required");
        requireNonNull(values, "values is required");
        ArangoCursor<BaseDocument> result = arangoDB.db(DbName.of(database)).query(query, values, null, BaseDocument.class);
        return StreamSupport.stream(result.spliterator(), false)
                .map(ArangoDBUtil::toEntity);
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `jnosql-arangodb/src/main/java/org/eclipse/jnosql/databases/arangodb/communication/DefaultArangoDBDocumentManager.java`
#### Snippet
```java

    private boolean checkCondition(Optional<DocumentCondition> query) {
        return !query.isPresent();
    }

```

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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `index` to `long` is redundant
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisList.java`
#### Snippet
```java
        String value = serialize(o);
        for (int index = size(); index > 0; --index) {
            String findedValue = jedis.lindex(keyWithNameSpace, (long) index);
            if (value.equals(findedValue)) {
                return index;
```

### RedundantCast
Casting `index` to `long` is redundant
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java
        String value = serialize(o);
        for (int index = 0; index < size(); index++) {
            String findedValue = jedis.lindex(keyWithNameSpace, (long) index);
            if (value.equals(findedValue)) {
                return index;
```

### RedundantCast
Casting `index` to `long` is redundant
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/RedisCollection.java`
#### Snippet
```java

    protected T remove(int index) {
        String value = jedis.lindex(keyWithNameSpace, (long) index);
        if (value != null && !value.isEmpty()) {
            jedis.lrem(keyWithNameSpace, 1, value);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `headers` may be 'final'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchDocumentConfiguration.java`
#### Snippet
```java
    private List<HttpHost> httpHosts = new ArrayList<>();

    private List<Header> headers = new ArrayList<>();


```

### FieldMayBeFinal
Field `httpHosts` may be 'final'
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchDocumentConfiguration.java`
#### Snippet
```java
    private static final int DEFAULT_PORT = 9200;

    private List<HttpHost> httpHosts = new ArrayList<>();

    private List<Header> headers = new ArrayList<>();
```

### FieldMayBeFinal
Field `jedis` may be 'final'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/DefaultSortedSet.java`
#### Snippet
```java
    private String key;

    private Jedis jedis;

    DefaultSortedSet(Jedis jedis, String keyspace) {
```

### FieldMayBeFinal
Field `key` may be 'final'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/DefaultSortedSet.java`
#### Snippet
```java

    private static final int LAST_ELEMENT = -1;
    private String key;

    private Jedis jedis;
```

### FieldMayBeFinal
Field `jedis` may be 'final'
in `jnosql-redis/src/main/java/org/eclipse/jnosql/databases/redis/communication/DefaultCounter.java`
#### Snippet
```java
    private final String key;

    private Jedis jedis;

    DefaultCounter(String key, Jedis jedis) {
```

### FieldMayBeFinal
Field `client` may be 'final'
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoDBBucketManagerFactory.java`
#### Snippet
```java
public class DynamoDBBucketManagerFactory implements BucketManagerFactory {

    private DynamoDbClient client;

    DynamoDBBucketManagerFactory(DynamoDbClient client) {
```

### FieldMayBeFinal
Field `tableName` may be 'final'
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoDBBucketManager.java`
#### Snippet
```java

    private DynamoDbClient client;
    private String tableName;
    private static final Function<AttributeValue, String> TO_JSON = AttributeValue::s;

```

### FieldMayBeFinal
Field `client` may be 'final'
in `jnosql-dynamodb/src/main/java/org/eclipse/jnosql/databases/dynamodb/communication/DynamoDBBucketManager.java`
#### Snippet
```java


    private DynamoDbClient client;
    private String tableName;
    private static final Function<AttributeValue, String> TO_JSON = AttributeValue::s;
```

### FieldMayBeFinal
Field `documents` may be 'final'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLFactory.java`
#### Snippet
```java
    static QueryResultAsync toAsync(String query, Consumer<List<ODocument>> callBack, Object... params) {
        return new QueryResultAsync(new OSQLAsynchQuery<>(query, new OCommandResultListener() {
            private List<ODocument> documents = new ArrayList<>();

            @Override
```

### FieldMayBeFinal
Field `documents` may be 'final'
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLFactory.java`
#### Snippet
```java

        return new QueryResultAsync(new OSQLAsynchQuery<>(query.query(), new OCommandResultListener() {
            private List<ODocument> documents = new ArrayList<>();

            @Override
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

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `ex` is immediately rethrown
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
            entity.writeTo(stream);
            return JSONB.fromJson(new String(stream.toByteArray(), UTF_8), type);
        } catch (CouchDBHttpClientException ex) {
            throw ex;
        } catch (Exception ex) {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `ex` is immediately rethrown
in `jnosql-couchdb/src/main/java/org/eclipse/jnosql/databases/couchdb/communication/HttpExecute.java`
#### Snippet
```java
            entity.add(CouchDBConstant.REV, json.get(CouchDBConstant.REV_RESPONSE));
            return entity;
        } catch (CouchDBHttpClientException ex) {
            throw ex;
        } catch (Exception exp) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `elasticsearchClient` is redundant
in `jnosql-elasticsearch/src/main/java/org/eclipse/jnosql/databases/elasticsearch/communication/ElasticsearchDocumentConfiguration.java`
#### Snippet
```java
        var transport = new RestClientTransport(httpClient, new JsonbJsonpMapper());

        var elasticsearchClient = new ElasticsearchClient(transport);
        return elasticsearchClient;
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

## RuleId[id=UnusedAssignment]
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
Condition `!ids.isEmpty()` is always `true` when reached
in `jnosql-orientdb/src/main/java/org/eclipse/jnosql/databases/orientdb/communication/QueryOSQLFactory.java`
#### Snippet
```java

        public boolean isRunQuery() {
            return ids.isEmpty() || (!ids.isEmpty() && !params.isEmpty());
        }

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
Condition `org.eclipse.jnosql.databases.cassandra.communication.UDT.class.isInstance(column.get())` is always `true` when reached
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/mapping/CassandraColumnEntityConverter.java`
#### Snippet
```java

    private <T> void setUDTField(T instance, Optional<Column> column, FieldMapping field) {
        if (column.isPresent() && org.eclipse.jnosql.databases.cassandra.communication.UDT.class.isInstance(column.get())) {
            org.eclipse.jnosql.databases.cassandra.communication.UDT udt =
                    org.eclipse.jnosql.databases.cassandra.communication.UDT.class.cast(column.get());
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
Condition `Iterable.class.isInstance(object)` is always `false`
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
                }

            } else if (Iterable.class.isInstance(object)) {
                udtValues.add(getUdtValue(userType, Iterable.class.cast(Iterable.class.cast(object)), type));
            }
```

### ConstantValue
Value `c` is always 'null'
in `jnosql-cassandra/src/main/java/org/eclipse/jnosql/databases/cassandra/communication/QueryUtils.java`
#### Snippet
```java
                        insertUDT(UDT.class.cast(c), keyspace, entity.name(), session, values);
                    } else {
                        insertSingleField(c, values);
                    }
                });
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
Condition `Iterable.class.isInstance(value)` is always `false`
in `jnosql-couchbase/src/main/java/org/eclipse/jnosql/databases/couchbase/communication/EntityConverter.java`
#### Snippet
```java
            if (Document.class.isInstance(value)) {
                convertDocument(jsonObject, d, value);
            } else if (Iterable.class.isInstance(value)) {
                convertIterable(jsonObject, d, value);
            } else {
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

