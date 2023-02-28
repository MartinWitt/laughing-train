# jnosql-communication-driver 
 
# Bad smells
I found 305 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantClassCall | 107 | false |
| ConstantValue | 28 | false |
| CallToStringConcatCanBeReplacedByOperator | 27 | false |
| BoundedWildcard | 25 | false |
| UnnecessaryFullyQualifiedName | 19 | false |
| StringBufferReplaceableByString | 15 | false |
| ReturnNull | 11 | false |
| SimplifyStreamApiCallChains | 7 | false |
| AssignmentToMethodParameter | 7 | false |
| OptionalUsedAsFieldOrParameterType | 6 | false |
| DataFlowIssue | 5 | false |
| StringEqualsEmptyString | 4 | false |
| SimplifyOptionalCallChains | 4 | false |
| ZeroLengthArrayInitialization | 3 | false |
| TypeParameterExtendsObject | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| IgnoreResultOfCall | 2 | false |
| RedundantMethodOverride | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| RedundantFieldInitialization | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| UnusedAssignment | 2 | false |
| UnnecessaryModifier | 1 | true |
| DeprecatedIsStillUsed | 1 | false |
| OptionalContainsCollection | 1 | false |
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
| ExceptionNameDoesntEndWithException | 1 | false |
| SynchronizeOnThis | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/UDTFinisherBuilder.java`
#### Snippet
```java
     * @throws IllegalStateException when there is a null element
     */
    public UDT build();
}

```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `password` might be null
in `jnosql-memcached-driver/src/main/java/org/eclipse/jnosql/communication/memcached/keyvalue/MemcachedKeyValueConfiguration.java`
#### Snippet
```java
                            , Configurations.PASSWORD)))
                            .map(Object::toString).orElse(null);
                    factoryBuilder.setAuthDescriptor(AuthDescriptor.typical(u, password));
                });

```

### DataFlowIssue
Method invocation `getLong` may produce `NullPointerException`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/DefaultCassandraColumnManager.java`
#### Snippet
```java
        requireNonNull(columnFamily, "columnFamily is required");
        final ResultSet execute = session.execute(QueryBuilder.selectFrom(keyspace, columnFamily).countAll().build());
        return execute.one().getLong(0);
    }

```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `jnosql-hazelcast-driver/src/main/java/org/eclipse/jnosql/communication/hazelcast/keyvalue/DefaultHazelcastBucketManager.java`
#### Snippet
```java
            return Optional.empty();
        }
        return Optional.ofNullable(Value.of(value));
    }

```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `jnosql-infinispan-driver/src/main/java/org/eclipse/jnosql/communication/infinispan/keyvalue/InfinispanBucketManager.java`
#### Snippet
```java
            return Optional.empty();
        }
        return Optional.ofNullable(Value.of(value));
    }

```

### DataFlowIssue
Argument `row.getUdtValue(name)` might be null
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraConverter.java`
#### Snippet
```java
        final DataType type = definition.getType();
        if (type instanceof UserDefinedType) {
            return getUDT(definition, row.getUdtValue(name));
        }
        final TypeCodec<Object> codec = row.codecRegistry().codecFor(type);
```

## RuleId[ruleID=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java
                JsonObject subJson = JsonObject.create();

                stream(Iterable.class.cast(element).spliterator(), false)
                        .forEach(getSubdocument(subJson));
                array.add(subJson);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java

    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java

    private static void convertDocument(JsonObject jsonObject, Document d, Object value) {
        Document document = Document.class.cast(value);
        jsonObject.put(d.name(), Collections.singletonMap(document.name(), document.get()));
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java
            if (Document.class.isInstance(value)) {
                convertDocument(jsonObject, d, value);
            } else if (Iterable.class.isInstance(value)) {
                convertIterable(jsonObject, d, value);
            } else {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/RavenDBEntry.java`
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
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/RavenDBEntry.java`
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
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/RavenDBEntry.java`
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
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/RavenDBEntry.java`
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
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/RavenDBEntry.java`
#### Snippet
```java

    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/RavenDBEntry.java`
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
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java
        Map<String, Object> json = execute(request, JSON, HttpStatus.SC_OK);
        if (query instanceof CouchDBDocumentQuery) {
            CouchDBDocumentQuery.class.cast(query).setBookmark(json);
        }
        return (List<Map<String, Object>>) json.getOrDefault(CouchDBConstant.DOCS_RESPONSE, emptyList());
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/DocumentQueryConverter.java`
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
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/MangoQueryConverter.java`
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
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/MangoQueryConverter.java`
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
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/MangoQueryConverter.java`
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
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/MangoQueryConverter.java`
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
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/MangoQueryConverter.java`
#### Snippet
```java

    private void appendCombination(JsonObjectBuilder selector, Object value, String combination) {
        List<DocumentCondition> conditions = List.class.cast(value);
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (DocumentCondition documentCondition : conditions) {
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/MangoQueryConverter.java`
#### Snippet
```java

        if (documentQuery instanceof CouchDBDocumentQuery) {
            Optional<String> bookmark = CouchDBDocumentQuery.class.cast(documentQuery).getBookmark();
            bookmark.ifPresent(b -> bookmark(b, select));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-solr-driver/src/main/java/org/eclipse/jnosql/communication/solr/document/SolrUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-solr-driver/src/main/java/org/eclipse/jnosql/communication/solr/document/SolrUtils.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
#### Snippet
```java

    private static org.eclipse.jnosql.communication.document.Document cast(Object document) {
        return org.eclipse.jnosql.communication.document.Document.class.cast(document);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
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
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
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
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
#### Snippet
```java

    private static Object getMap(Object val) {
        return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .collect(toMap(KEY_DOCUMENT, VALUE_DOCUMENT));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
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
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
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
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
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
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
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
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/EntityConverter.java`
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
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/EntityConverter.java`
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
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/EntityConverter.java`
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
in `jnosql-communication-driver-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
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
in `jnosql-communication-driver-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
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
in `jnosql-communication-driver-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
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
in `jnosql-communication-driver-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
#### Snippet
```java

    private static List<Object> getObjects(Object val) {
        return (List<Object>) StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .map(CONVERT).collect(toList());
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-communication-driver-commons/src/main/java/org/eclipse/jnosql/communication/driver/ValueUtil.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryExecutor.java`
#### Snippet
```java

    static QueryExecutor of(ColumnQuery query) {
        if (CassandraQuery.class.isInstance(query)) {
            return QueryExecutorType.PAGING_STATE;
        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisMap.java`
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
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisMap.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryExecutorType.java`
#### Snippet
```java
                                            DefaultCassandraColumnManager manager) {

            CassandraQuery query = CassandraQuery.class.cast(q);

            if (query.isExhausted()) {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisCollection.java`
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
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisCollection.java`
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
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
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
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
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
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
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
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
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
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
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
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java
        Object val = ValueUtil.convert(value);

        if (Document.class.isInstance(val)) {
            Document document = Document.class.cast(val);
            return singletonMap(document.name(), convert(document.value()));
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java

        if (Document.class.isInstance(val)) {
            Document document = Document.class.cast(val);
            return singletonMap(document.name(), convert(document.value()));
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
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
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java

    private static org.eclipse.jnosql.communication.document.Document cast(Object document) {
        return org.eclipse.jnosql.communication.document.Document.class.cast(document);
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java

    private static Object getMap(Object val) {
        return StreamSupport.stream(Iterable.class.cast(val).spliterator(), false)
                .collect(toMap(KEY_DOCUMENT, VALUE_DOCUMENT));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/DefaultOrientDBDocumentManager.java`
#### Snippet
```java
            OResult next = command.next();
            Object count = next.getProperty("count(*)");
            return Number.class.cast(count).longValue();

        }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java
                .forEach(c -> {
                    if (UDT.class.isInstance(c)) {
                        insertUDT(UDT.class.cast(c), keyspace, entity.name(), session, values);
                    } else {
                        insertSingleField(c, values);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java

        final DataType type = columnMetadata.getType();
        Iterable elements = Iterable.class.cast(udt.get());
        Object udtValue = getUdtValue(userType, elements, type);
        values.put(getName(udt), QueryBuilder.literal(udtValue));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java
        for (Object object : elements) {
            if (Column.class.isInstance(object)) {
                Column column = Column.class.cast(object);
                Object convert = ValueUtil.convert(column.value());

```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java
                }

            } else if (Iterable.class.isInstance(object)) {
                udtValues.add(getUdtValue(userType, Iterable.class.cast(Iterable.class.cast(object)), type));
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java

            } else if (Iterable.class.isInstance(object)) {
                udtValues.add(getUdtValue(userType, Iterable.class.cast(Iterable.class.cast(object)), type));
            }
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java

            } else if (Iterable.class.isInstance(object)) {
                udtValues.add(getUdtValue(userType, Iterable.class.cast(Iterable.class.cast(object)), type));
            }
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isDocumentIterable(d));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
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
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
#### Snippet
```java
        Map<String, Object> map = new java.util.HashMap<>();
        stream(Iterable.class.cast(valueAsObject).spliterator(), false)
                .forEach(d -> toDocument(map, Document.class.cast(d)));
        return map;
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
#### Snippet
```java

    private static boolean isDocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
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
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
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
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
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
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
#### Snippet
```java
            entityValues.put(document.name(), getMap(value));
        } else if (isSudDocumentList(value)) {
            entityValues.put(document.name(), StreamSupport.stream(Iterable.class.cast(value).spliterator(), false)
                    .map(OrientDBConverter::getMap).collect(toList()));
        } else {
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
#### Snippet
```java

    private static Object convert(Object object) {
        if (Map.class.isInstance(object)) {
            Map map = Map.class.cast(object);
            return map.keySet().stream()
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
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
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
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
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
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
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/EntityConverter.java`
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
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocumentList(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(d -> d instanceof Iterable && isSudDocument(d));
    }
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/EntityConverter.java`
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
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/EntityConverter.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraConverter.java`
#### Snippet
```java

    private static boolean isUDTIterable(Object result) {
        final Iterable<?> iterable = Iterable.class.cast(result);
        if (!iterable.iterator().hasNext()) {
            return false;
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraConverter.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraConverter.java`
#### Snippet
```java

        List<Iterable<Column>> columns = new ArrayList<>();
        for (Object value : Iterable.class.cast(result)) {
            final UdtValue udtValue = UdtValue.class.cast(value);
            final UDT udt = getUDT(definition, udtValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraConverter.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraConverter.java`
#### Snippet
```java

    private static String getUserType(Object result) {
        return StreamSupport.stream(Iterable.class.cast(result).spliterator(), false)
                .limit(1L)
                .map(c -> UdtValue.class.cast(c).getType().getName().asInternal())
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraConverter.java`
#### Snippet
```java
        return StreamSupport.stream(Iterable.class.cast(result).spliterator(), false)
                .limit(1L)
                .map(c -> UdtValue.class.cast(c).getType().getName().asInternal())
                .findFirst()
                .get().toString();
```

### RedundantClassCall
Redundant call to `isInstance()`
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/ElasticsearchEntry.java`
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
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/ElasticsearchEntry.java`
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
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/ElasticsearchEntry.java`
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
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/ElasticsearchEntry.java`
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
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/ElasticsearchEntry.java`
#### Snippet
```java

    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
```

### RedundantClassCall
Redundant call to `cast()`
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/ElasticsearchEntry.java`
#### Snippet
```java
    private boolean isADocumentIterable(Object value) {
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java
        JsonObject jsonObject = JsonObject.create();
        entity.documents().stream()
                .forEach(toJsonObject(jsonObject));
        return jsonObject;
    }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `jnosql-solr-driver/src/main/java/org/eclipse/jnosql/communication/solr/document/SolrUtils.java`
#### Snippet
```java
        SolrInputDocument document = new SolrInputDocument();
        document.addField(ENTITY, entity.name());
        entity.documents().stream().forEach(d -> document.addField(d.name(), convert(d.value())));
        return document;
    }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `jnosql-hbase-driver/src/main/java/org/eclipse/jnosql/communication/hbase/column/HBaseColumnManagerFactory.java`
#### Snippet
```java
    private void createTable(Admin admin, TableName tableName) throws IOException {
        final TableDescriptorBuilder builder = TableDescriptorBuilder.newBuilder(tableName);
        families.stream().forEach(s -> builder.setColumnFamily(ColumnFamilyDescriptorBuilder.newBuilder(s.getBytes())
                .build()));
        final TableDescriptor descriptor = builder.build();
```

### SimplifyStreamApiCallChains
Can be replaced with 'collection.toArray()'
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/ElasticsearchDocumentConfiguration.java`
#### Snippet
```java

        RestClientBuilder builder = RestClient.builder(httpHosts.toArray(new HttpHost[0]));
        builder.setDefaultHeaders(headers.stream().toArray(Header[]::new));

        final Optional<String> username = settings
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/N1QLBuilder.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java
        InsertInto insert = QueryBuilder.insertInto(keyspace, entity.name());
        entity.columns().stream()
                .forEach(c -> {
                    if (UDT.class.isInstance(c)) {
                        insertUDT(UDT.class.cast(c), keyspace, entity.name(), session, values);
```

### SimplifyStreamApiCallChains
Can be replaced with 'List.class.cast(...).stream()' call
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
#### Snippet
```java
                    .collect(toList());
        } else if (List.class.isInstance(object)) {
            return StreamSupport.stream(List.class.cast(object).spliterator(), false)
                    .map(OrientDBConverter::convert).collect(toList());
        }
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
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
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            entity.writeTo(stream);
            return JSONB.fromJson(new String(stream.toByteArray(), UTF_8), type);
        } catch (CouchDBHttpClientException ex) {
            throw ex;
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'delete' is still used
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/SortedSet.java`
#### Snippet
```java
     */
    @Deprecated
    void delete();

    /**
```

## RuleId[ruleID=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains array `char[]`
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoAuthentication.java`
#### Snippet
```java
                .map(Object::toString);

        Optional<char[]> password = settings.getSupplier(Arrays.asList(MongoDBDocumentConfigurations.PASSWORD,
                Configurations.PASSWORD))
                .map(Object::toString).map(String::toCharArray);
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java
    private static List<Document> toDocuments(Map<String, Object> map) {
        List<Document> documents = new ArrayList<>();
        for (String key : map.keySet()) {
            Object value = map.get(key);
            if (Map.class.isInstance(value)) {
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisMap.java`
#### Snippet
```java
        requireNonNull(map, "map is required");

        for (K key : map.keySet()) {
            V value = map.get(key);
            if (value != null) {
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/DeleteElement.java`
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
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/RavenDBDocumentManagerFactory.java`
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
in `jnosql-hbase-driver/src/main/java/org/eclipse/jnosql/communication/hbase/column/EntityUnit.java`
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
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/DefaultSortedSet.java`
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
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/DefaultRanking.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/DefaultUDT.java`
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
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisMap.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraQuery.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraColumnManagerFactory.java`
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
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/ElasticsearchAddress.java`
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
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/DefaultCounter.java`
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
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/DefaultRedisBucketManagerFactory.java`
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
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/CouchDBDocumentQuery.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CouchDBDocumentQuery{");
        sb.append("query=").append(query);
        sb.append(", bookmark='").append(bookmark).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `jnosql-hbase-driver/src/main/java/org/eclipse/jnosql/communication/hbase/column/HBaseColumnConfiguration.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/IterableUDT.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UDT{");
        sb.append("name='").append(name).append('\'');
        sb.append(", userType='").append(userType).append('\'');
```

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/CouchDBHttpClient.java`
#### Snippet
```java
            httpExecute.createDatabase(database);
        }
        return;
    }

```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java
        return entity.find(CouchDBConstant.ID)
                .orElseThrow(() -> new CouchDBHttpClientException(
                        String.format("To update the entity %s the id field is required", entity.toString())))
                .get(String.class);
    }
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `RedisUtils` has no concrete subclass
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisUtils.java`
#### Snippet
```java
package org.eclipse.jnosql.communication.redis.keyvalue;

abstract class RedisUtils {


```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends JsonObject`
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java


    static Stream<DocumentEntity> convert(List<JsonObject> result, String database) {
        return
                result.stream()
```

### BoundedWildcard
Can generalize to `? extends Map`
in `jnosql-dynamodb-driver/src/main/java/org/eclipse/jnosql/communication/dynamodb/DynamoDBUtils.java`
#### Snippet
```java
    }

    private static Map<String, List<WriteRequest>> createMapWriteRequest(Collection<Map<String, AttributeValue>> map, String tableName) {

        PutRequest.Builder putRequestBuilder = PutRequest.builder();
```

### BoundedWildcard
Can generalize to `? extends KeyValueEntity`
in `jnosql-dynamodb-driver/src/main/java/org/eclipse/jnosql/communication/dynamodb/DynamoDBUtils.java`
#### Snippet
```java
    }

    public static <K> Collection<Map<String, AttributeValue>> createAttributeValues(Iterable<KeyValueEntity> entities) {

        return StreamSupport.stream(entities.spliterator(), false)
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/DocumentQueryConverter.java`
#### Snippet
```java
    }

    private static void feedQuery(IDocumentQuery<HashMap> ravenQuery, DocumentCondition condition, List<String> ids) {
        Document document = condition.document();
        Object value = document.get();
```

### BoundedWildcard
Can generalize to `? extends Bson`
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBDocumentManager.java`
#### Snippet
```java
     * @throws NullPointerException when filter or collectionName is null
     */
    public Stream<Map<String, BsonValue>> aggregate(String collectionName, List<Bson> pipeline) {
        Objects.requireNonNull(pipeline, "filter is required");
        Objects.requireNonNull(collectionName, "collectionName is required");
```

### BoundedWildcard
Can generalize to `? extends Column`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/UDTBuilder.java`
#### Snippet
```java

    @Override
    public UDTBuilder addUDT(Iterable<Column> udt) throws NullPointerException {
        Objects.requireNonNull(udt, "udt is required");
        StreamSupport.stream(udt.spliterator(), false).forEach(this.columns::add);
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/EntityConverter.java`
#### Snippet
```java


    private static Consumer<Document> feedJSON(Map<String, Object> map) {
        return d -> {
            Object value = ValueUtil.convert(d.value());
```

### BoundedWildcard
Can generalize to `? extends ColumnEntity`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/DefaultCassandraColumnManager.java`
#### Snippet
```java

    @Override
    public Iterable<ColumnEntity> save(Iterable<ColumnEntity> entities, Duration ttl, ConsistencyLevel level) {
        requireNonNull(entities, "entities is required");
        requireNonNull(level, "level is required");
```

### BoundedWildcard
Can generalize to `? extends ColumnEntity`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/DefaultCassandraColumnManager.java`
#### Snippet
```java

    @Override
    public Iterable<ColumnEntity> save(Iterable<ColumnEntity> entities, ConsistencyLevel level) {
        requireNonNull(entities, "entities is required");
        requireNonNull(level, "level is required");
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/QueryConverter.java`
#### Snippet
```java


    private static Query.Builder getCondition(DocumentCondition condition, List<String> ids) {
        Document document = condition.document();

```

### BoundedWildcard
Can generalize to `? extends V`
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisMap.java`
#### Snippet
```java


    RedisMap(Jedis jedis, Class<K> keyValue, Class<V> valueClass, String keyWithNameSpace) {
        this.keyClass = keyValue;
        this.valueClass = valueClass;
```

### BoundedWildcard
Can generalize to `? super Stream`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLFactory.java`
#### Snippet
```java
    }

    static QueryResultAsync toAsync(DocumentQuery documentQuery, Consumer<Stream<ODocument>> callBack) {
        QueryOSQLConverter.Query query = QueryOSQLConverter.select(documentQuery);

```

### BoundedWildcard
Can generalize to `? super List`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLFactory.java`
#### Snippet
```java
    }

    static QueryResultAsync toAsync(String query, Consumer<List<ODocument>> callBack, Object... params) {
        return new QueryResultAsync(new OSQLAsynchQuery<>(query, new OCommandResultListener() {
            private List<ODocument> documents = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super ORecordId`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLConverter.java`
#### Snippet
```java

    private static void appendCondition(StringBuilder query, List<Object> params,
                                        Document document, String condition, List<ORecordId> ids) {

        if(OrientDBConverter.RID_FIELD.equals(document.name())) {
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java

    private static void insertUDT(UDT udt, String keyspace, String columnFamily, CqlSession session,
                                  Map<String, Term> values) {

        final Optional<KeyspaceMetadata> keyspaceMetadata = session.getMetadata().getKeyspace(keyspace);
```

### BoundedWildcard
Can generalize to `? super Term`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java

    private static void insertUDT(UDT udt, String keyspace, String columnFamily, CqlSession session,
                                  Map<String, Term> values) {

        final Optional<KeyspaceMetadata> keyspaceMetadata = session.getMetadata().getKeyspace(keyspace);
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java
    }

    private static void insertSingleField(Column column, Map<String, Term> values) {
        Object value = column.get();
        try {
```

### BoundedWildcard
Can generalize to `? super Term`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java
    }

    private static void insertSingleField(Column column, Map<String, Term> values) {
        Object value = column.get();
        try {
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
#### Snippet
```java
    }

    private static void toDocument(Map<String, Object> entityValues, Document document) {
        Object value = ValueUtil.convert(document.value());
        if (Document.class.isInstance(value)) {
```

### BoundedWildcard
Can generalize to `? super Relation`
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/Relations.java`
#### Snippet
```java
    }

    private static void load(ColumnCondition columnCondition, List<Relation> relations) {

        Column column = columnCondition.column();
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-hbase-driver/src/main/java/org/eclipse/jnosql/communication/hbase/column/HBaseColumnManager.java`
#### Snippet
```java


    private void convert(ColumnCondition columnCondition, List<String> values) {
        Condition condition = columnCondition.condition();

```

### BoundedWildcard
Can generalize to `? extends Map`
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/EntityConverter.java`
#### Snippet
```java
    }

    static Stream<DocumentEntity> getDocumentEntityStream(ElasticsearchClient client, SearchResponse<Map> responses) {
        return responses.hits().hits().stream()
                .map(hits -> ElasticsearchEntry.of(hits.id(), hits.source()))
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/EntityConverter.java`
#### Snippet
```java


    private static Consumer<Document> feedJSON(Map<String, Object> jsonObject) {
        return d -> {
            Object value = ValueUtil.convert(d.value());
```

### BoundedWildcard
Can generalize to `? super String`
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/CouchDBDocumentQuery.java`
#### Snippet
```java
    }

    void setBookmark(Map<String, Object> json) {
        json.computeIfPresent(CouchDBConstant.BOOKMARK, (k, v) -> this.bookmark = v.toString());
    }
```

### BoundedWildcard
Can generalize to `? super DocumentEntity`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/LiveQueryListener.java`
#### Snippet
```java
    private final ODatabaseSession tx;

    LiveQueryListener(OrientDBLiveCallback<DocumentEntity> callbacks, ODatabaseSession tx) {
        this.callbacks = callbacks;
        this.tx = tx;
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jnosql-dynamodb-driver/src/main/java/org/eclipse/jnosql/communication/dynamodb/DynamoDBBuilderSync.java`
#### Snippet
```java
    public DynamoDbClient build() {

        boolean accessKey = awsAccessKey != null && !awsAccessKey.equals("");
        boolean secretAccess = awsSecretAccess != null && !awsSecretAccess.equals("");

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jnosql-dynamodb-driver/src/main/java/org/eclipse/jnosql/communication/dynamodb/DynamoDBBuilderSync.java`
#### Snippet
```java

        boolean accessKey = awsAccessKey != null && !awsAccessKey.equals("");
        boolean secretAccess = awsSecretAccess != null && !awsSecretAccess.equals("");


```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jnosql-dynamodb-driver/src/main/java/org/eclipse/jnosql/communication/dynamodb/DynamoDBBuilderASync.java`
#### Snippet
```java
    public DynamoDbAsyncClient build() {

        boolean accessKey = awsAccessKey != null && !awsAccessKey.equals("");
        boolean secretAccess = awsSecretAccess != null && !awsSecretAccess.equals("");

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jnosql-dynamodb-driver/src/main/java/org/eclipse/jnosql/communication/dynamodb/DynamoDBBuilderASync.java`
#### Snippet
```java

        boolean accessKey = awsAccessKey != null && !awsAccessKey.equals("");
        boolean secretAccess = awsSecretAccess != null && !awsSecretAccess.equals("");

        if (accessKey && secretAccess) {
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `SettableByName.set()` is ignored
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
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
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java
                    udtValue.set(getName(column), new HashSet<Object>((Collection<?>) convert), objectTypeCodec);
                } else {
                    udtValue.set(getName(column), convert, objectTypeCodec);
                }

```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'user'
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraProperties.java`
#### Snippet
```java
    private Optional<String> name;

    private Optional<String> user;

    private Optional<String> password;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'password'
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraProperties.java`
#### Snippet
```java
    private Optional<String> user;

    private Optional<String> password;

    private int port;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'name'
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraProperties.java`
#### Snippet
```java
    private final List<String> nodes = new ArrayList<>();

    private Optional<String> name;

    private Optional<String> user;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'query'
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/DefaultArangoDBDocumentManager.java`
#### Snippet
```java
    }

    private boolean checkCondition(Optional<DocumentCondition> query) {
        return !query.isPresent();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'INSTANCE'
in `jnosql-communication-driver-commons/src/main/java/org/eclipse/jnosql/communication/driver/JsonbSupplierServiceLoader.java`
#### Snippet
```java
    private static final List<JsonbSupplier> LOADERS;

    static final Optional<JsonbSupplier> INSTANCE;

    static {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'documentCondition'
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/QueryAQLConverter.java`
#### Snippet
```java

    private static AQLQueryResult convert(String documentCollection,
                                          Optional<DocumentCondition> documentCondition,
                                          List<Sort> sorts,
                                          long firstResult,
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/LiveQueryListener.java`
#### Snippet
```java
    @Override
    public void onError(ODatabaseDocument database, OException exception) {
        System.out.print("error");
    }

```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `iterator()` is identical to its super method
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisList.java`
#### Snippet
```java

    @Override
    public Iterator<T> iterator() {
        return toArrayList().iterator();
    }
```

### RedundantMethodOverride
Method `size()` is identical to its super method
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisList.java`
#### Snippet
```java

    @Override
    public int size() {
        return (int) jedis.llen(keyWithNameSpace);
    }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/CouchbaseConfiguration.java`
#### Snippet
```java
        settings.get(CouchbaseConfigurations.COLLECTIONS)
                .map(Object::toString).stream()
                .flatMap(s -> Stream.of(s.split(",\\s*")))
                .forEach(collections::add);
        return collections;
```

## RuleId[ruleID=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Optional chain can be simplified
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/RavenDBDocumentManager.java`
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
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoAuthentication.java`
#### Snippet
```java
                .map(AuthenticationMechanism::fromMechanismName);

        if (!user.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoAuthentication.java`
#### Snippet
```java
        }

        if (!mechanism.isPresent()) {
            return Optional.of(MongoCredential.createCredential(user.orElseThrow(missingExceptionUser()),
                    source.orElseThrow(missingExceptionSource()), password.orElseThrow(missingExceptionPassword())));
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/DefaultArangoDBDocumentManager.java`
#### Snippet
```java

    private boolean checkCondition(Optional<DocumentCondition> query) {
        return !query.isPresent();
    }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/CouchbaseConfiguration.java`
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
in `jnosql-solr-driver/src/main/java/org/eclipse/jnosql/communication/solr/document/SolrUtils.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.infinispan.configuration.cache` is unnecessary, and can be replaced with an import
in `jnosql-infinispan-driver/src/main/java/org/eclipse/jnosql/communication/infinispan/keyvalue/InfinispanKeyValueConfiguration.java`
#### Snippet
```java
     * @throws NullPointerException when config is null
     */
    public InfinispanBucketManagerFactory get(org.infinispan.configuration.cache.Configuration config)throws NullPointerException {
        requireNonNull(config, "config is required");

```

### UnnecessaryFullyQualifiedName
Qualifier `org.infinispan.client.hotrod.configuration` is unnecessary, and can be replaced with an import
in `jnosql-infinispan-driver/src/main/java/org/eclipse/jnosql/communication/infinispan/keyvalue/InfinispanKeyValueConfiguration.java`
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
in `jnosql-infinispan-driver/src/main/java/org/eclipse/jnosql/communication/infinispan/keyvalue/InfinispanKeyValueConfiguration.java`
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
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.couchbase.client.java.datastructures` is unnecessary, and can be replaced with an import
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/keyvalue/DefaultCouchbaseBucketManagerFactory.java`
#### Snippet
```java
        Collection collection = bucket.collection(bucketName);

        return new com.couchbase.client.java.datastructures.CouchbaseQueue<>(key + QUEUE, collection, type,
                QueueOptions.queueOptions());

```

### UnnecessaryFullyQualifiedName
Qualifier `com.couchbase.client.java.datastructures` is unnecessary, and can be replaced with an import
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/keyvalue/DefaultCouchbaseBucketManagerFactory.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/keyvalue/DefaultCouchbaseBucketManagerFactory.java`
#### Snippet
```java

        return (Map<K, V>)
                new com.couchbase.client.java.datastructures.
                        CouchbaseMap<>(key, collection, valueType,
                        MapOptions.mapOptions());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.couchbase.client.java.datastructures` is unnecessary, and can be replaced with an import
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/keyvalue/DefaultCouchbaseBucketManagerFactory.java`
#### Snippet
```java
        Collection collection = bucket.collection(bucketName);

        return new com.couchbase.client.java.datastructures.CouchbaseQueue<>(bucketName + QUEUE, collection, type,
                QueueOptions.queueOptions());

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLConverter.java`
#### Snippet
```java
    static Query select(DocumentQuery documentQuery) {
        StringBuilder query = new StringBuilder();
        List<Object> params = new java.util.ArrayList<>();
        List<ORecordId> ids = new ArrayList<>();
        query.append("SELECT FROM ");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java
    }

    private static org.eclipse.jnosql.communication.document.Document cast(Object document) {
        return org.eclipse.jnosql.communication.document.Document.class.cast(document);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java

    private static org.eclipse.jnosql.communication.document.Document cast(Object document) {
        return org.eclipse.jnosql.communication.document.Document.class.cast(document);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
#### Snippet
```java

    private static Map<String, Object> getMap(Object valueAsObject) {
        Map<String, Object> map = new java.util.HashMap<>();
        stream(Iterable.class.cast(valueAsObject).spliterator(), false)
                .forEach(d -> toDocument(map, Document.class.cast(d)));
```

### UnnecessaryFullyQualifiedName
Qualifier `com.datastax.oss.driver.api.core.cql` is unnecessary, and can be replaced with an import
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraPreparedStatement.java`
#### Snippet
```java
    private BoundStatement boundStatement;

    CassandraPreparedStatement(com.datastax.oss.driver.api.core.cql.PreparedStatement prepare, CqlSession session) {
        this.prepare = prepare;
        this.session = session;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.datastax.oss.driver.api.core.cql` is unnecessary, and can be replaced with an import
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraPreparedStatement.java`
#### Snippet
```java
public class CassandraPreparedStatement {

    private final com.datastax.oss.driver.api.core.cql.PreparedStatement prepare;

    private final CqlSession session;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jnosql.communication.document` is unnecessary and can be removed
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/CouchDBDocumentQuery.java`
#### Snippet
```java

    void setBookmark(Map<String, Object> json) {
        json.computeIfPresent(CouchDBConstant.BOOKMARK, (k, v) -> this.bookmark = v.toString());
    }

```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `jnosql-hbase-driver/src/main/java/org/eclipse/jnosql/communication/hbase/column/HBaseColumnManager.java`
#### Snippet
```java
            table.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `nodes` are updated, but never queried
in `jnosql-riak-driver/src/main/java/org/eclipse/jnosql/communication/riak/keyvalue/RiakKeyValueConfiguration.java`
#### Snippet
```java
            .withRemoteAddress("127.0.0.1").build();

    private final List<RiakNode> nodes = new ArrayList<>();


```

### MismatchedCollectionQueryUpdate
Contents of collection `families` are updated, but never queried
in `jnosql-hbase-driver/src/main/java/org/eclipse/jnosql/communication/hbase/column/HBaseColumnConfiguration.java`
#### Snippet
```java
    private final Configuration configuration;

    private final List<String> families = new ArrayList<>();

    /**
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `pagingState` is accessed in both synchronized and unsynchronized contexts
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraQuery.java`
#### Snippet
```java
     * It can be saved and reused later on the same statement.
     */
    private String pagingState;


```

## RuleId[ruleID=IdempotentLoopBody]
### IdempotentLoopBody
Idempotent loop body
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/QueryAQLConverter.java`
#### Snippet
```java
        String paramName = parameter;
        int counter = 1;
        while (params.containsKey(paramName)) {
            paramName = parameter + '_' + counter;
        }
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `jnosql-communication-driver-commons/src/main/java/org/eclipse/jnosql/communication/driver/ConfigurationReader.java`
#### Snippet
```java
                properties.load(stream);
                return properties.keySet().stream().collect(Collectors
                        .toMap(Object::toString, s -> properties.get(s).toString()));
            } else {
                LOGGER.info("The file " + resource + " as resource, returning an empty configuration");
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/CouchDBHttpConfigurationBuilder.java`
#### Snippet
```java
    private String password;

    private boolean compression = false;
    private int maxObjectSizeBytes = 8192;
    private int maxCacheEntries = 1000;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/CouchDBHttpConfigurationBuilder.java`
#### Snippet
```java
    private int connectionTimeout = 1000;
    private int socketTimeout = 10000;
    private boolean enableSSL = false;

    private String username;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `counter`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLConverter.java`
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
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLConverter.java`
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
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLConverter.java`
#### Snippet
```java
                DocumentCondition documentCondition = document.get(DocumentCondition.class);
                query.append("NOT (");
                definesCondition(documentCondition, query, params, ++counter, ids);
                query.append(")");
                return;
```

### AssignmentToMethodParameter
Assignment to method parameter `counter`
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/QueryAQLConverter.java`
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
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/QueryAQLConverter.java`
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
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/QueryAQLConverter.java`
#### Snippet
```java
                DocumentCondition documentCondition = document.get(DocumentCondition.class);
                aql.append(NOT);
                definesCondition(documentCondition, aql, params, entity, ++counter);
                return;
            default:
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisList.java`
#### Snippet
```java
        Objects.requireNonNull(elements);
        for (T element : elements) {
            add(index++, element);
        }
        return true;
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `IrregularKeyValue` does not end with 'Exception'
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/IrregularKeyValue.java`
#### Snippet
```java
 * An exception when has irregular key value problem
 */
public class IrregularKeyValue extends RuntimeException {

    private static final long serialVersionUID = 6161854579438859925L;
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    public List<String> getDatabases() {
        HttpGet httpget = new HttpGet(configuration.getUrl().concat(CouchDBConstant.ALL_DBS));
        return execute(httpget, LIST_STRING, HttpStatus.SC_OK);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    public void createDatabase(String database) {
        HttpPut httpPut = new HttpPut(configuration.getUrl().concat(database));
        Map<String, Object> json = execute(httpPut, JSON, HttpStatus.SC_CREATED);
        if (!json.getOrDefault("ok", "false").toString().equals("true")) {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    private List<Map<String, Object>> executeQuery(String database, DocumentQuery query) {
        HttpPost request = new HttpPost(configuration.getUrl().concat(database).concat(CouchDBConstant.FIND));
        setHeader(request);
        JsonObject mangoQuery = converter.apply(query);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    private List<Map<String, Object>> executeQuery(String database, DocumentQuery query) {
        HttpPost request = new HttpPost(configuration.getUrl().concat(database).concat(CouchDBConstant.FIND));
        setHeader(request);
        JsonObject mangoQuery = converter.apply(query);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    private void delete(String database, DeleteElement id) {
        HttpDelete request = new HttpDelete(configuration.getUrl().concat(database).concat("/").concat(id.getId()));
        request.addHeader(CouchDBConstant.REV_HEADER, id.getRev());
        execute(request, null, HttpStatus.SC_OK, true);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    private void delete(String database, DeleteElement id) {
        HttpDelete request = new HttpDelete(configuration.getUrl().concat(database).concat("/").concat(id.getId()));
        request.addHeader(CouchDBConstant.REV_HEADER, id.getRev());
        execute(request, null, HttpStatus.SC_OK, true);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    private void delete(String database, DeleteElement id) {
        HttpDelete request = new HttpDelete(configuration.getUrl().concat(database).concat("/").concat(id.getId()));
        request.addHeader(CouchDBConstant.REV_HEADER, id.getRev());
        execute(request, null, HttpStatus.SC_OK, true);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    private Map<String, Object> findById(String database, String id) {
        HttpGet request = new HttpGet(configuration.getUrl().concat(database).concat("/").concat(id));
        return execute(request, JSON, HttpStatus.SC_OK);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    private Map<String, Object> findById(String database, String id) {
        HttpGet request = new HttpGet(configuration.getUrl().concat(database).concat("/").concat(id));
        return execute(request, JSON, HttpStatus.SC_OK);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    private Map<String, Object> findById(String database, String id) {
        HttpGet request = new HttpGet(configuration.getUrl().concat(database).concat("/").concat(id));
        return execute(request, JSON, HttpStatus.SC_OK);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    public long count(String database) {
        HttpGet request = new HttpGet(configuration.getUrl().concat(database).concat(CouchDBConstant.COUNT));
        Map<String, Object> json = execute(request, JSON, HttpStatus.SC_OK);
        String total = json.get(CouchDBConstant.TOTAL_ROWS_RESPONSE).toString();
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java

    public long count(String database) {
        HttpGet request = new HttpGet(configuration.getUrl().concat(database).concat(CouchDBConstant.COUNT));
        Map<String, Object> json = execute(request, JSON, HttpStatus.SC_OK);
        String total = json.get(CouchDBConstant.TOTAL_ROWS_RESPONSE).toString();
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
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
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
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
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java
            } else {
                id = CODEC.encode(id);
                request = new HttpPut(configuration.getUrl().concat(database).concat("/").concat(id));
            }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java
            } else {
                id = CODEC.encode(id);
                request = new HttpPut(configuration.getUrl().concat(database).concat("/").concat(id));
            }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java
            } else {
                id = CODEC.encode(id);
                request = new HttpPut(configuration.getUrl().concat(database).concat("/").concat(id));
            }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/N1QLBuilder.java`
#### Snippet
```java
        ((Iterable<?>) document.get()).forEach(values::add);

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/N1QLBuilder.java`
#### Snippet
```java
        ((Iterable<?>) document.get()).forEach(values::add);

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/N1QLBuilder.java`
#### Snippet
```java
        ((Iterable<?>) document.get()).forEach(values::add);

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/N1QLBuilder.java`
#### Snippet
```java

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
        params.put(param, values.get(0));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/N1QLBuilder.java`
#### Snippet
```java

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
        params.put(param, values.get(0));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/N1QLBuilder.java`
#### Snippet
```java

        String param = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        String param2 = "$".concat(document.name()).concat("_").concat(Integer.toString(random.nextInt(0, 100)));
        n1ql.append(name).append(" ").append(param).append(" AND ").append(param2);
        params.put(param, values.get(0));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/N1QLBuilder.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/N1QLBuilder.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/N1QLBuilder.java`
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
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/DefaultOrientDBDocumentManager.java`
#### Snippet
```java
        requireNonNull(documentCollection, "query is required");
        try (ODatabaseSession tx = pool.acquire()) {
            String query = "select count(*) from ".concat(documentCollection);
            OResultSet command = tx.command(query);
            OResult next = command.next();
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/BinaryValueReader.java`
#### Snippet
```java

        if (value == null) {
            return null;
        }
        if (value instanceof byte[]) {
```

### ReturnNull
Return of `null`
in `jnosql-couchdb-driver/src/main/java/org/eclipse/jnosql/communication/couchdb/document/HttpExecute.java`
#### Snippet
```java
            }
            if (Objects.isNull(type)) {
                return null;
            }
            HttpEntity entity = result.getEntity();
```

### ReturnNull
Return of `null`
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisQueue.java`
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
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisQueue.java`
#### Snippet
```java

        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/QueryConverter.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisMap.java`
#### Snippet
```java
            return value;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisMap.java`
#### Snippet
```java

        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLFactory.java`
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
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLFactory.java`
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
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisCollection.java`
#### Snippet
```java
            return serialize(value);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisCollection.java`
#### Snippet
```java
        String value = jedis.lindex(keyWithNameSpace, index);
        if (value == null || value.isEmpty()) {
            return null;
        }
        return serialize(value);
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `map` is redundant
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisMap.java`
#### Snippet
```java

    private Map<String, String> createRedisMap() {
        Map<String, String> map = jedis.hgetAll(nameSpace);
        return map;
    }
```

### UnnecessaryLocalVariable
Local variable `delete` is redundant
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/DeleteQueryConverter.java`
#### Snippet
```java
        }

        final Delete delete = deleteSelection.where(Relations.createClause(query.condition().orElse(null)));
        return delete;
    }
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraQuery.java`
#### Snippet
```java

    void setExhausted(boolean exhausted) {
        synchronized (this) {
            if (exhausted) {
                this.pagingState = EXHAUSTED;
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/ElasticsearchDocumentConfiguration.java`
#### Snippet
```java
                .forEach(httpHosts::add);

        RestClientBuilder builder = RestClient.builder(httpHosts.toArray(new HttpHost[0]));
        builder.setDefaultHeaders(headers.stream().toArray(Header[]::new));

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLFactory.java`
#### Snippet
```java

        Object[] getParams() {
            return params.toArray(new Object[0]);
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLFactory.java`
#### Snippet
```java

        Object[] getParams() {
            return params.toArray(new Object[0]);
        }
    }
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `value` initializer `jedis.hget(nameSpace, JSONB.toJson(key))` is redundant
in `jnosql-redis-driver/src/main/java/org/eclipse/jnosql/communication/redis/keyvalue/RedisMap.java`
#### Snippet
```java
        requireNonNull(key, "Key is required");

        String value = jedis.hget(nameSpace, JSONB.toJson(key));
        if (isKeyString) {
            value = jedis.hget(nameSpace, key.toString());
```

### UnusedAssignment
Variable `select` initializer `null` is redundant
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/QueryUtils.java`
#### Snippet
```java
        final List<String> columns = query.columns();

        Select select = null;
        if (columns.isEmpty()) {
            select = QueryBuilder.selectFrom(keyspace, columnFamily).all();
```

## RuleId[ruleID=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `jnosql-solr-driver/src/main/java/org/eclipse/jnosql/communication/solr/document/SolrDocumentManager.java`
#### Snippet
```java
     * @throws NullPointerException when there is null parameter
     */
    List<DocumentEntity> solr(String query, Map<String, ? extends Object> params);
}

```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `jnosql-solr-driver/src/main/java/org/eclipse/jnosql/communication/solr/document/DefaultSolrDocumentManager.java`
#### Snippet
```java

    @Override
    public List<DocumentEntity> solr(String query, Map<String, ? extends Object> params) {
        Objects.requireNonNull(query, "query is required");
        Objects.requireNonNull(params, "params is required");
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `jnosql-solr-driver/src/main/java/org/eclipse/jnosql/communication/solr/document/DefaultSolrDocumentManager.java`
#### Snippet
```java
        Objects.requireNonNull(params, "params is required");
        String nativeQuery = query;
        for (Entry<String, ? extends Object> entry : params.entrySet()) {
            nativeQuery = nativeQuery.replace('@' + entry.getKey(), entry.getValue().toString());
        }
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jnosql-dynamodb-driver/src/main/java/org/eclipse/jnosql/communication/dynamodb/DynamoTableUtils.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/CouchbaseSettings.java`
#### Snippet
```java
            String finalScope = getScope().orElseGet(() -> bucket.defaultScope().name());
            ScopeSpec spec = scopes.stream().filter(s -> finalScope.equals(s.name()))
                    .findFirst().get();
            for (String collection : collections) {
                if (spec.collections().stream().noneMatch(c -> collection.equals(c.name()))) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jnosql-cassandra-driver/src/main/java/org/eclipse/jnosql/communication/cassandra/column/CassandraConverter.java`
#### Snippet
```java
                .map(c -> UdtValue.class.cast(c).getType().getName().asInternal())
                .findFirst()
                .get().toString();
    }

```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false). allMatch(org.eclipse.jnosql...` is always `true` when reached
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Map.class:...` is always `true` when reached
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
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
in `jnosql-couchbase-driver/src/main/java/org/eclipse/jnosql/communication/couchbase/document/EntityConverter.java`
#### Snippet
```java
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Map.class:...` is always `true` when reached
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/RavenDBEntry.java`
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
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/RavenDBEntry.java`
#### Snippet
```java
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### ConstantValue
Condition `!hasTable` is always `true`
in `jnosql-dynamodb-driver/src/main/java/org/eclipse/jnosql/communication/dynamodb/DynamoTableUtils.java`
#### Snippet
```java
        String lastName = null;

        while (!hasTable) {
            try {
                ListTablesRequest.Builder builder = ListTablesRequest.builder();
```

### ConstantValue
Value `hasTable` is always 'false'
in `jnosql-dynamodb-driver/src/main/java/org/eclipse/jnosql/communication/dynamodb/DynamoTableUtils.java`
#### Snippet
```java
        String lastName = null;

        while (!hasTable) {
            try {
                ListTablesRequest.Builder builder = ListTablesRequest.builder();
```

### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(value).spliterator(), false). allMatch(org....` is always `true` when reached
in `jnosql-solr-driver/src/main/java/org/eclipse/jnosql/communication/solr/document/SolrUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-solr-driver/src/main/java/org/eclipse/jnosql/communication/solr/document/SolrUtils.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Document.c...` is always `true` when reached
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
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
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
#### Snippet
```java
        return value instanceof Iterable &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }

```

### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(value).spliterator(), false). allMatch(org....` is always `true` when reached
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-mongodb-driver/src/main/java/org/eclipse/jnosql/communication/mongodb/document/MongoDBUtils.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(value).spliterator(), false). allMatch(org....` is always `true` when reached
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-ravendb-driver/src/main/java/org/eclipse/jnosql/communication/ravendb/document/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `!ids.isEmpty()` is always `true` when reached
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLFactory.java`
#### Snippet
```java

        public boolean isRunQuery() {
            return ids.isEmpty() || (!ids.isEmpty() && !params.isEmpty());
        }

```

### ConstantValue
Result of `ids.isEmpty()` is always 'false'
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/QueryOSQLFactory.java`
#### Snippet
```java

        public boolean isRunQuery() {
            return ids.isEmpty() || (!ids.isEmpty() && !params.isEmpty());
        }

```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Map.class:...` is always `true` when reached
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
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
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(value).spliterator(), false). allMatch(org....` is always `true` when reached
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-arangodb-driver/src/main/java/org/eclipse/jnosql/communication/arangodb/document/ArangoDBUtil.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Document.c...` is always `true` when reached
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
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
in `jnosql-orientdb-driver/src/main/java/org/eclipse/jnosql/communication/orientdb/document/OrientDBConverter.java`
#### Snippet
```java
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Document.class::isInstance);
    }

```

### ConstantValue
Condition `StreamSupport.stream(Iterable.class.cast(value).spliterator(), false). allMatch(org....` is always `true` when reached
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/EntityConverter.java`
#### Snippet
```java

    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Method reference result is always 'true'
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/EntityConverter.java`
#### Snippet
```java
    private static boolean isSudDocument(Object value) {
        return value instanceof Iterable && StreamSupport.stream(Iterable.class.cast(value).spliterator(), false).
                allMatch(org.eclipse.jnosql.communication.document.Document.class::isInstance);
    }

```

### ConstantValue
Condition `stream(Iterable.class.cast(value).spliterator(), false) .allMatch(Map.class:...` is always `true` when reached
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/ElasticsearchEntry.java`
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
in `jnosql-elasticsearch-driver/src/main/java/org/eclipse/jnosql/communication/elasticsearch/document/ElasticsearchEntry.java`
#### Snippet
```java
        return Iterable.class.isInstance(value) &&
                stream(Iterable.class.cast(value).spliterator(), false)
                        .allMatch(Map.class::isInstance);
    }

```

