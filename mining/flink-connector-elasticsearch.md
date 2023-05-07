# flink-connector-elasticsearch 
 
# Bad smells
I found 195 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 127 | false |
| DuplicatedCode | 19 | false |
| RegExpRedundantEscape | 10 | false |
| NullableProblems | 10 | false |
| DeprecatedIsStillUsed | 8 | false |
| UnnecessaryLocalVariable | 5 | true |
| FieldMayBeFinal | 4 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| DataFlowIssue | 2 | false |
| ConstantValue | 2 | false |
| AutoCloseableResource | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| TrivialIf | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new HttpHost\[httpHosts.size()\]'
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch7/Elasticsearch7ApiCallBridge.java`
#### Snippet
```java
    public RestHighLevelClient createClient() {
        RestClientBuilder builder =
                RestClient.builder(httpHosts.toArray(new HttpHost[httpHosts.size()]));
        restClientFactory.configureRestClientBuilder(builder);

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new HttpHost\[httpHosts.size()\]'
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/Elasticsearch6ApiCallBridge.java`
#### Snippet
```java
    public RestHighLevelClient createClient() {
        RestClientBuilder builder =
                RestClient.builder(httpHosts.toArray(new HttpHost[httpHosts.size()]));
        restClientFactory.configureRestClientBuilder(builder);

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ElasticsearchContainer' used without 'try'-with-resources statement
in `flink-connector-elasticsearch-e2e-tests/flink-connector-elasticsearch-e2e-tests-common/src/main/java/org/apache/flink/streaming/tests/ElasticsearchSinkE2ECaseBase.java`
#### Snippet
```java
            DefaultContainerizedExternalSystem.builder()
                    .fromContainer(
                            new ElasticsearchContainer(
                                            DockerImageName.parse(getElasticsearchContainerName()))
                                    .withEnv(
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/KeyExtractor.java`
#### Snippet
```java
            default:
                RowData.FieldGetter fieldGetter = RowData.createFieldGetter(type, index);
                return (row) -> fieldGetter.getFieldOrNull(row).toString();
        }
    }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/KeyExtractor.java`
#### Snippet
```java
            default:
                RowData.FieldGetter fieldGetter = RowData.createFieldGetter(type, index);
                return (row) -> fieldGetter.getFieldOrNull(row).toString();
        }
    }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `numPendingRequests` may be 'final'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java
     * Throwable)}.
     */
    private AtomicLong numPendingRequests = new AtomicLong(0);

    /** Elasticsearch client created using the call bridge. */
```

### FieldMayBeFinal
Field `bufferedRequests` may be 'final'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java
class BufferingNoOpRequestIndexer implements RequestIndexer {

    private ConcurrentLinkedQueue<ActionRequest> bufferedRequests;

    BufferingNoOpRequestIndexer() {
```

### FieldMayBeFinal
Field `bulkRequestsConfig` may be 'final'
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch7/ElasticsearchSink.java`
#### Snippet
```java
        private final ElasticsearchSinkFunction<T> elasticsearchSinkFunction;

        private Map<String, String> bulkRequestsConfig = new HashMap<>();
        private ActionRequestFailureHandler failureHandler = new NoOpFailureHandler();
        private RestClientFactory restClientFactory = restClientBuilder -> {};
```

### FieldMayBeFinal
Field `bulkRequestsConfig` may be 'final'
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/ElasticsearchSink.java`
#### Snippet
```java
        private final ElasticsearchSinkFunction<T> elasticsearchSinkFunction;

        private Map<String, String> bulkRequestsConfig = new HashMap<>();
        private ActionRequestFailureHandler failureHandler = new NoOpFailureHandler();
        private RestClientFactory restClientFactory = restClientBuilder -> {};
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'Elasticsearch6DynamicSink' is still used
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSink.java`
#### Snippet
```java
@Deprecated
@PublicEvolving
final class Elasticsearch6DynamicSink implements DynamicTableSink {
    @VisibleForTesting
    static final Elasticsearch6RequestFactory REQUEST_FACTORY = new Elasticsearch6RequestFactory();
```

### DeprecatedIsStillUsed
Deprecated member 'RestClientFactory' is still used
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/RestClientFactory.java`
#### Snippet
```java
@Deprecated
@PublicEvolving
public interface RestClientFactory extends Serializable {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'RetryRejectedExecutionFailureHandler' is still used
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/util/RetryRejectedExecutionFailureHandler.java`
#### Snippet
```java
@Deprecated
@PublicEvolving
public class RetryRejectedExecutionFailureHandler implements ActionRequestFailureHandler {

    private static final long serialVersionUID = -7423562912824511906L;
```

### DeprecatedIsStillUsed
Deprecated member 'ElasticsearchSink' is still used
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch7/ElasticsearchSink.java`
#### Snippet
```java
@Deprecated
@PublicEvolving
public class ElasticsearchSink<T> extends ElasticsearchSinkBase<T, RestHighLevelClient> {

    private static final long serialVersionUID = 1L;
```

### DeprecatedIsStillUsed
Deprecated member 'Builder' is still used
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch7/ElasticsearchSink.java`
#### Snippet
```java
    @Deprecated
    @PublicEvolving
    public static class Builder<T> {

        private final List<HttpHost> httpHosts;
```

### DeprecatedIsStillUsed
Deprecated member 'RestClientFactory' is still used
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch7/RestClientFactory.java`
#### Snippet
```java
@Deprecated
@PublicEvolving
public interface RestClientFactory extends Serializable {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'Builder' is still used
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/ElasticsearchSink.java`
#### Snippet
```java
    @Deprecated
    @PublicEvolving
    public static class Builder<T> {

        private final List<HttpHost> httpHosts;
```

### DeprecatedIsStillUsed
Deprecated member 'ElasticsearchSink' is still used
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/ElasticsearchSink.java`
#### Snippet
```java
@Deprecated
@PublicEvolving
public class ElasticsearchSink<T> extends ElasticsearchSinkBase<T, RestHighLevelClient> {

    private static final long serialVersionUID = 1L;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\{` in RegExp
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
     */
    static class IndexHelper {
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
     */
    static class IndexHelper {
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
     */
    static class IndexHelper {
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
        private static final Pattern dynamicIndexSystemTimeExtractPattern =
                Pattern.compile(
                        ".*\\{\\s*(now\\(\\s*\\)|NOW\\(\\s*\\)|current_timestamp|CURRENT_TIMESTAMP)\\s*\\|.*\\}.*");
        private static final List<LogicalTypeRoot> supportedTypes = new ArrayList<>();
        private static final Map<LogicalTypeRoot, String> defaultFormats = new HashMap<>();
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
        private static final Pattern dynamicIndexSystemTimeExtractPattern =
                Pattern.compile(
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
        private static final Pattern dynamicIndexSystemTimeExtractPattern =
                Pattern.compile(
                        ".*\\{\\s*(now\\(\\s*\\)|NOW\\(\\s*\\)|current_timestamp|CURRENT_TIMESTAMP)\\s*\\|.*\\}.*");
        private static final List<LogicalTypeRoot> supportedTypes = new ArrayList<>();
        private static final Map<LogicalTypeRoot, String> defaultFormats = new HashMap<>();
```

### RegExpRedundantEscape
Redundant character escape `\\{` in RegExp
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
     */
    static class IndexHelper {
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
     */
    static class IndexHelper {
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
     */
    static class IndexHelper {
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
        private static final Pattern dynamicIndexSystemTimeExtractPattern =
                Pattern.compile(
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
        try {
            HttpHost httpHost = HttpHost.create(host);
            if (httpHost.getPort() < 0) {
                throw new ValidationException(
                        String.format(
                                "Could not parse host '%s' in option '%s'. It should follow the format 'http://host_name:port'. Missing port.",
                                host, HOSTS_OPTION.key()));
            }

            if (httpHost.getSchemeName() == null) {
                throw new ValidationException(
                        String.format(
                                "Could not parse host '%s' in option '%s'. It should follow the format 'http://host_name:port'. Missing scheme.",
                                host, HOSTS_OPTION.key()));
            }
            return httpHost;
        } catch (Exception e) {
            throw new ValidationException(
                    String.format(
                            "Could not parse host '%s' in option '%s'. It should follow the format 'http://host_name:port'.",
                            host, HOSTS_OPTION.key()),
                    e);
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/ElasticsearchDynamicSink.java`
#### Snippet
```java
        ChangelogMode.Builder builder = ChangelogMode.newBuilder();
        for (RowKind kind : requestedMode.getContainedKinds()) {
            if (kind != RowKind.UPDATE_BEFORE) {
                builder.addContainedKind(kind);
            }
        }
        if (isDynamicIndexWithSystemTime && !requestedMode.containsOnly(RowKind.INSERT)) {
            throw new ValidationException(
                    "Dynamic indexing based on system time only works on append only stream.");
        }
        return builder.build();
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/ElasticsearchDynamicSinkFactoryBase.java`
#### Snippet
```java
        config.getHosts(); // validate hosts
        validate(
                config.getIndex().length() >= 1,
                () -> String.format("'%s' must not be empty", INDEX_OPTION.key()));
        int maxActions = config.getBulkFlushMaxActions();
        validate(
                maxActions == -1 || maxActions >= 1,
                () ->
                        String.format(
                                "'%s' must be at least 1. Got: %s",
                                BULK_FLUSH_MAX_ACTIONS_OPTION.key(), maxActions));
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/ElasticsearchDynamicSinkFactoryBase.java`
#### Snippet
```java
        validate(
                config.getBulkFlushBackoffRetries().map(retries -> retries >= 1).orElse(true),
                () ->
                        String.format(
                                "'%s' must be at least 1. Got: %s",
                                BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION.key(),
                                config.getBulkFlushBackoffRetries().get()));
        if (config.getUsername().isPresent()
                && !StringUtils.isNullOrWhitespaceOnly(config.getUsername().get())) {
            validate(
                    config.getPassword().isPresent()
                            && !StringUtils.isNullOrWhitespaceOnly(config.getPassword().get()),
                    () ->
                            String.format(
                                    "'%s' and '%s' must be set at the same time. Got: username '%s' and password '%s'",
                                    USERNAME_OPTION.key(),
                                    PASSWORD_OPTION.key(),
                                    config.getUsername().get(),
                                    config.getPassword().orElse("")));
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
final String dynamicIndexPatternStr = indexHelper.extractDynamicIndexPatternStr(index);
        final String indexPrefix = index.substring(0, index.indexOf(dynamicIndexPatternStr));
        final String indexSuffix =
                index.substring(indexPrefix.length() + dynamicIndexPatternStr.length());

        if (indexHelper.checkIsDynamicIndexWithSystemTimeFormat(index)) {
            final String dateTimeFormat =
                    indexHelper.extractDateFormat(
                            index, LogicalTypeRoot.TIMESTAMP_WITH_LOCAL_TIME_ZONE);
            return new AbstractTimeIndexGenerator(index, dateTimeFormat) {
                @Override
                public String generate(RowData row) {
                    return indexPrefix
                            .concat(LocalDateTime.now(localTimeZoneId).format(dateTimeFormatter))
                            .concat(indexSuffix);
                }
            };
        }

        final boolean isDynamicIndexWithFormat = indexHelper.checkIsDynamicIndexWithFormat(index);
        final int indexFieldPos =
                indexHelper.extractIndexFieldPos(index, fieldNames, isDynamicIndexWithFormat);
        final LogicalType indexFieldType = fieldTypes[indexFieldPos].getLogicalType();
        final LogicalTypeRoot indexFieldLogicalTypeRoot = indexFieldType.getTypeRoot();

        // validate index field type
        indexHelper.validateIndexFieldType(indexFieldLogicalTypeRoot);

        // time extract dynamic index pattern
        final RowData.FieldGetter fieldGetter =
                RowData.createFieldGetter(indexFieldType, indexFieldPos);

        if (isDynamicIndexWithFormat) {
            final String dateTimeFormat =
                    indexHelper.extractDateFormat(index, indexFieldLogicalTypeRoot);
            DynamicFormatter formatFunction =
                    createFormatFunction(
                            indexFieldType, indexFieldLogicalTypeRoot, localTimeZoneId);

            return new AbstractTimeIndexGenerator(index, dateTimeFormat) {
                @Override
                public String generate(RowData row) {
                    Object fieldOrNull = fieldGetter.getFieldOrNull(row);
                    final String formattedField;
                    // TODO we can possibly optimize it to use the nullability of the field
                    if (fieldOrNull != null) {
                        formattedField = formatFunction.format(fieldOrNull, dateTimeFormatter);
                    } else {
                        formattedField = "null";
                    }
                    return indexPrefix.concat(formattedField).concat(indexSuffix);
                }
            };
        }
        // general dynamic index pattern
        return new IndexGeneratorBase(index) {
            @Override
            public String generate(RowData row) {
                Object indexField = fieldGetter.getFieldOrNull(row);
                return indexPrefix
                        .concat(indexField == null ? "null" : indexField.toString())
                        .concat(indexSuffix);
            }
        };
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
        switch (indexFieldLogicalTypeRoot) {
            case DATE:
                return (value, dateTimeFormatter) -> {
                    Integer indexField = (Integer) value;
                    return LocalDate.ofEpochDay(indexField).format(dateTimeFormatter);
                };
            case TIME_WITHOUT_TIME_ZONE:
                return (value, dateTimeFormatter) -> {
                    Integer indexField = (Integer) value;
                    return LocalTime.ofNanoOfDay(indexField * 1_000_000L).format(dateTimeFormatter);
                };
            case TIMESTAMP_WITHOUT_TIME_ZONE:
                return (value, dateTimeFormatter) -> {
                    TimestampData indexField = (TimestampData) value;
                    return indexField.toLocalDateTime().format(dateTimeFormatter);
                };
            case TIMESTAMP_WITH_TIME_ZONE:
                throw new UnsupportedOperationException(
                        "TIMESTAMP_WITH_TIME_ZONE is not supported yet");
            case TIMESTAMP_WITH_LOCAL_TIME_ZONE:
                return (value, dateTimeFormatter) -> {
                    TimestampData indexField = (TimestampData) value;
                    return indexField.toInstant().atZone(localTimeZoneId).format(dateTimeFormatter);
                };
            default:
                throw new TableException(
                        String.format(
                                "Unsupported type '%s' found in Elasticsearch dynamic index field, "
                                        + "time-related pattern only support types are: DATE,TIME,TIMESTAMP.",
                                indexFieldType));
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
            final Matcher matcher = dynamicIndexPattern.matcher(index);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            if (count > 1) {
                throw new TableException(
                        String.format(
                                "Chaining dynamic index pattern %s is not supported,"
                                        + " only support single dynamic index pattern.",
                                index));
            }
            return count == 1;
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
            List<String> fieldList = Arrays.asList(fieldNames);
            String indexFieldName;
            if (isDynamicIndexWithFormat) {
                indexFieldName = index.substring(index.indexOf("{") + 1, index.indexOf("|"));
            } else {
                indexFieldName = index.substring(index.indexOf("{") + 1, index.indexOf("}"));
            }
            if (!fieldList.contains(indexFieldName)) {
                throw new TableException(
                        String.format(
                                "Unknown field '%s' in index pattern '%s', please check the field name.",
                                indexFieldName, index));
            }
            return fieldList.indexOf(indexFieldName);
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/KeyExtractor.java`
#### Snippet
```java
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < fieldFormatters.length; i++) {
            if (i > 0) {
                builder.append(keyDelimiter);
            }
            final String value = fieldFormatters[i].format(rowData);
            builder.append(value);
        }
        return builder.toString();
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/KeyExtractor.java`
#### Snippet
```java
        switch (type.getTypeRoot()) {
            case DATE:
                return (row) -> LocalDate.ofEpochDay(row.getInt(index)).toString();
            case TIME_WITHOUT_TIME_ZONE:
                return (row) ->
                        LocalTime.ofNanoOfDay((long) row.getInt(index) * 1_000_000L).toString();
            case INTERVAL_YEAR_MONTH:
                return (row) -> Period.ofDays(row.getInt(index)).toString();
            case INTERVAL_DAY_TIME:
                return (row) -> Duration.ofMillis(row.getLong(index)).toString();
            case DISTINCT_TYPE:
                return toFormatter(index, ((DistinctType) type).getSourceType());
            default:
                RowData.FieldGetter fieldGetter = RowData.createFieldGetter(type, index);
                return (row) -> fieldGetter.getFieldOrNull(row).toString();
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/RowElasticsearchEmitter.java`
#### Snippet
```java
        switch (element.getRowKind()) {
            case INSERT:
            case UPDATE_AFTER:
                processUpsert(element, indexer);
                break;
            case UPDATE_BEFORE:
            case DELETE:
                processDelete(element, indexer);
                break;
            default:
                throw new TableException("Unsupported message kind: " + element.getRowKind());
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-e2e-tests/flink-connector-elasticsearch6-e2e-tests/src/main/java/org/apache/flink/streaming/tests/Elasticsearch6Client.java`
#### Snippet
```java
        GetIndexRequest request = new GetIndexRequest(indexName);
        CreateIndexRequest createIndexRequest = new CreateIndexRequest(indexName);
        createIndexRequest.settings(
                Settings.builder()
                        .put("index.number_of_shards", shards)
                        .put("index.number_of_replicas", replicas));
        try {
            boolean exists = restClient.indices().exists(request, RequestOptions.DEFAULT);
            if (!exists) {
                restClient.indices().create(createIndexRequest, RequestOptions.DEFAULT);
            } else {
                LOG.info("Index already exists {}", indexName);
            }
        } catch (IOException e) {
            LOG.error("Cannot create index {}", indexName, e);
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch-e2e-tests/flink-connector-elasticsearch6-e2e-tests/src/main/java/org/apache/flink/streaming/tests/Elasticsearch6Client.java`
#### Snippet
```java
        try {
            SearchResponse response =
                    restClient.search(
                            new SearchRequest(params.indexName())
                                    .source(
                                            new SearchSourceBuilder()
                                                    .sort(params.sortField(), SortOrder.ASC)
                                                    .from(params.from())
                                                    .size(params.pageLength())
                                                    .trackTotalHits(params.trackTotalHits())),
                            RequestOptions.DEFAULT);
            SearchHit[] searchHits = response.getHits().getHits();
            return Arrays.stream(searchHits)
                    .map(
                            searchHit ->
                                    KeyValue.of(
                                            Integer.valueOf(searchHit.getId()),
                                            searchHit.getSourceAsMap().get("value").toString()))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            LOG.error("Fetching records failed", e);
            return Collections.emptyList();
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/connector/elasticsearch/sink/Elasticsearch6SinkBuilder.java`
#### Snippet
```java
return new BulkProcessorBuilderFactory() {
            @Override
            public BulkProcessor.Builder apply(
                    RestHighLevelClient client,
                    BulkProcessorConfig bulkProcessorConfig,
                    BulkProcessor.Listener listener) {

                BulkProcessor.Builder builder =
                        BulkProcessor.builder(
                                new BulkRequestConsumerFactory() { // This cannot be inlined as a
                                    // lambda because then
                                    // deserialization fails
                                    @Override
                                    public void accept(
                                            BulkRequest bulkRequest,
                                            ActionListener<BulkResponse>
                                                    bulkResponseActionListener) {
                                        client.bulkAsync(
                                                bulkRequest,
                                                RequestOptions.DEFAULT,
                                                bulkResponseActionListener);
                                    }
                                },
                                listener);

                if (bulkProcessorConfig.getBulkFlushMaxActions() != -1) {
                    builder.setBulkActions(bulkProcessorConfig.getBulkFlushMaxActions());
                }

                if (bulkProcessorConfig.getBulkFlushMaxMb() != -1) {
                    builder.setBulkSize(
                            new ByteSizeValue(
                                    bulkProcessorConfig.getBulkFlushMaxMb(), ByteSizeUnit.MB));
                }

                if (bulkProcessorConfig.getBulkFlushInterval() != -1) {
                    builder.setFlushInterval(
                            new TimeValue(bulkProcessorConfig.getBulkFlushInterval()));
                }

                BackoffPolicy backoffPolicy;
                final TimeValue backoffDelay =
                        new TimeValue(bulkProcessorConfig.getBulkFlushBackOffDelay());
                final int maxRetryCount = bulkProcessorConfig.getBulkFlushBackoffRetries();
                switch (bulkProcessorConfig.getFlushBackoffType()) {
                    case CONSTANT:
                        backoffPolicy = BackoffPolicy.constantBackoff(backoffDelay, maxRetryCount);
                        break;
                    case EXPONENTIAL:
                        backoffPolicy =
                                BackoffPolicy.exponentialBackoff(backoffDelay, maxRetryCount);
                        break;
                    case NONE:
                        backoffPolicy = BackoffPolicy.noBackoff();
                        break;
                    default:
                        throw new IllegalArgumentException(
                                "Received unknown backoff policy type "
                                        + bulkProcessorConfig.getFlushBackoffType());
                }
                builder.setBackoffPolicy(backoffPolicy);
                return builder;
            }
        };
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSink.java`
#### Snippet
```java
final ElasticsearchSink.Builder<RowData> builder =
                    builderProvider.createBuilder(config.getHosts(), upsertFunction);

            builder.setFailureHandler(config.getFailureHandler());
            builder.setBulkFlushMaxActions(config.getBulkFlushMaxActions());
            builder.setBulkFlushMaxSizeMb((int) (config.getBulkFlushMaxByteSize() >> 20));
            builder.setBulkFlushInterval(config.getBulkFlushInterval());
            builder.setBulkFlushBackoff(config.isBulkFlushBackoffEnabled());
            config.getBulkFlushBackoffType().ifPresent(builder::setBulkFlushBackoffType);
            config.getBulkFlushBackoffRetries().ifPresent(builder::setBulkFlushBackoffRetries);
            config.getBulkFlushBackoffDelay().ifPresent(builder::setBulkFlushBackoffDelay);

            // we must overwrite the default factory which is defined with a lambda because of a bug
            // in shading lambda serialization shading see FLINK-18006
            if (config.getUsername().isPresent()
                    && config.getPassword().isPresent()
                    && !StringUtils.isNullOrWhitespaceOnly(config.getUsername().get())
                    && !StringUtils.isNullOrWhitespaceOnly(config.getPassword().get())) {
                builder.setRestClientFactory(
                        new AuthRestClientFactory(
                                config.getPathPrefix().orElse(null),
                                config.getUsername().get(),
                                config.getPassword().get()));
            } else {
                builder.setRestClientFactory(
                        new DefaultRestClientFactory(config.getPathPrefix().orElse(null)));
            }

            final ElasticsearchSink<RowData> sink = builder.build();

            if (config.isDisableFlushOnCheckpoint()) {
                sink.disableFlushOnCheckpoint();
            }

            return sink;
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSink.java`
#### Snippet
```java
            if (pathPrefix != null) {
                restClientBuilder.setPathPrefix(pathPrefix);
            }
            if (credentialsProvider == null) {
                credentialsProvider = new BasicCredentialsProvider();
                credentialsProvider.setCredentials(
                        AuthScope.ANY, new UsernamePasswordCredentials(username, password));
            }
            restClientBuilder.setHttpClientConfigCallback(
                    httpAsyncClientBuilder ->
                            httpAsyncClientBuilder.setDefaultCredentialsProvider(
                                    credentialsProvider));
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
        TableSchema tableSchema = context.getCatalogTable().getSchema();
        ElasticsearchValidationUtils.validatePrimaryKey(tableSchema);
        final FactoryUtil.TableFactoryHelper helper =
                FactoryUtil.createTableFactoryHelper(this, context);

        final EncodingFormat<SerializationSchema<RowData>> format =
                helper.discoverEncodingFormat(SerializationFormatFactory.class, FORMAT_OPTION);

        helper.validate();
        Configuration configuration = new Configuration();
        context.getCatalogTable().getOptions().forEach(configuration::setString);
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
config.getFailureHandler(); // checks if we can instantiate the custom failure handler
        config.getHosts(); // validate hosts
        validate(
                config.getIndex().length() >= 1,
                () -> String.format("'%s' must not be empty", INDEX_OPTION.key()));
        int maxActions = config.getBulkFlushMaxActions();
        validate(
                maxActions == -1 || maxActions >= 1,
                () ->
                        String.format(
                                "'%s' must be at least 1. Got: %s",
                                BULK_FLUSH_MAX_ACTIONS_OPTION.key(), maxActions));
        long maxSize = config.getBulkFlushMaxByteSize();
        long mb1 = 1024 * 1024;
        validate(
                maxSize == -1 || (maxSize >= mb1 && maxSize % mb1 == 0),
                () ->
                        String.format(
                                "'%s' must be in MB granularity. Got: %s",
                                BULK_FLASH_MAX_SIZE_OPTION.key(),
                                originalConfiguration
                                        .get(BULK_FLASH_MAX_SIZE_OPTION)
                                        .toHumanReadableString()));
        validate(
                config.getBulkFlushBackoffRetries().map(retries -> retries >= 1).orElse(true),
                () ->
                        String.format(
                                "'%s' must be at least 1. Got: %s",
                                BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION.key(),
                                config.getBulkFlushBackoffRetries().get()));
        if (config.getUsername().isPresent()
                && !StringUtils.isNullOrWhitespaceOnly(config.getUsername().get())) {
            validate(
                    config.getPassword().isPresent()
                            && !StringUtils.isNullOrWhitespaceOnly(config.getPassword().get()),
                    () ->
                            String.format(
                                    "'%s' and '%s' must be set at the same time. Got: username '%s' and password '%s'",
                                    USERNAME_OPTION.key(),
                                    PASSWORD_OPTION.key(),
                                    config.getUsername().get(),
                                    config.getPassword().orElse("")));
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/Elasticsearch6ApiCallBridge.java`
#### Snippet
```java
        BackoffPolicy backoffPolicy;
        if (flushBackoffPolicy != null) {
            switch (flushBackoffPolicy.getBackoffType()) {
                case CONSTANT:
                    backoffPolicy =
                            BackoffPolicy.constantBackoff(
                                    new TimeValue(flushBackoffPolicy.getDelayMillis()),
                                    flushBackoffPolicy.getMaxRetryCount());
                    break;
                case EXPONENTIAL:
                default:
                    backoffPolicy =
                            BackoffPolicy.exponentialBackoff(
                                    new TimeValue(flushBackoffPolicy.getDelayMillis()),
                                    flushBackoffPolicy.getMaxRetryCount());
            }
        } else {
            backoffPolicy = BackoffPolicy.noBackoff();
        }

        builder.setBackoffPolicy(backoffPolicy);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `zoneId` is redundant
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/ElasticsearchDynamicSinkFactoryBase.java`
#### Snippet
```java
    ZoneId getLocalTimeZoneId(ReadableConfig readableConfig) {
        final String zone = readableConfig.get(TableConfigOptions.LOCAL_TIME_ZONE);
        final ZoneId zoneId =
                TableConfigOptions.LOCAL_TIME_ZONE.defaultValue().equals(zone)
                        ? ZoneId.systemDefault()
```

### UnnecessaryLocalVariable
Local variable `rhlClient` is redundant
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch7/Elasticsearch7ApiCallBridge.java`
#### Snippet
```java
        restClientFactory.configureRestClientBuilder(builder);

        RestHighLevelClient rhlClient = new RestHighLevelClient(builder);

        return rhlClient;
```

### UnnecessaryLocalVariable
Local variable `rhlClient` is redundant
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/Elasticsearch6ApiCallBridge.java`
#### Snippet
```java
        restClientFactory.configureRestClientBuilder(builder);

        RestHighLevelClient rhlClient = new RestHighLevelClient(builder);

        return rhlClient;
```

### UnnecessaryLocalVariable
Local variable `zoneId` is redundant
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
    ZoneId getLocalTimeZoneId(ReadableConfig readableConfig) {
        final String zone = readableConfig.get(TableConfigOptions.LOCAL_TIME_ZONE);
        final ZoneId zoneId =
                TableConfigOptions.LOCAL_TIME_ZONE.defaultValue().equals(zone)
                        ? ZoneId.systemDefault()
```

### UnnecessaryLocalVariable
Local variable `zoneId` is redundant
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
    ZoneId getLocalTimeZoneId(ReadableConfig readableConfig) {
        final String zone = readableConfig.get(TableConfigOptions.LOCAL_TIME_ZONE);
        final ZoneId zoneId =
                TableConfigOptions.LOCAL_TIME_ZONE.defaultValue().equals(zone)
                        ? ZoneId.systemDefault()
```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchValidationUtils.java`
#### Snippet
```java
     * LogicalTypeRoot#RAW} type.
     */
    public static void validatePrimaryKey(TableSchema schema) {
        schema.getPrimaryKey()
                .ifPresent(
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/RowElasticsearchSinkFunction.java`
#### Snippet
```java
    }

    private void processDelete(RowData row, RequestIndexer indexer) {
        final String key = createKey.apply(row);
        final DeleteRequest deleteRequest =
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ElasticsearchSinkFunction' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/RowElasticsearchSinkFunction.java`
#### Snippet
```java
/** Sink function for converting upserts into Elasticsearch {@link ActionRequest}s. */
@Internal
class RowElasticsearchSinkFunction implements ElasticsearchSinkFunction<RowData> {

    private static final long serialVersionUID = 1L;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/RowElasticsearchSinkFunction.java`
#### Snippet
```java
    }

    private void processUpsert(RowData row, RequestIndexer indexer) {
        final byte[] document = serializationSchema.serialize(row);
        final String key = createKey.apply(row);
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/RowElasticsearchSinkFunction.java`
#### Snippet
```java

    @Override
    public void process(RowData element, RuntimeContext ctx, RequestIndexer indexer) {
        switch (element.getRowKind()) {
            case INSERT:
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6Configuration.java`
#### Snippet
```java
import java.util.stream.Collectors;

import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;

/** Elasticsearch 6 specific configuration. */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch7/Elasticsearch7BulkProcessorIndexer.java`
#### Snippet
```java

/**
 * Implementation of a {@link RequestIndexer}, using a {@link BulkProcessor}. {@link ActionRequest
 * ActionRequests} will be buffered before sending a bulk request to the Elasticsearch cluster.
 *
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch7/Elasticsearch7BulkProcessorIndexer.java`
#### Snippet
```java
 */
@Internal
class Elasticsearch7BulkProcessorIndexer implements RequestIndexer {

    private final BulkProcessor bulkProcessor;
```

### Deprecation
'DeleteRequest(java.lang.String, java.lang.String, java.lang.String)' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/RowElasticsearchEmitter.java`
#### Snippet
```java
        final String key = createKey.apply(row);
        final DeleteRequest deleteRequest =
                new DeleteRequest(indexGenerator.generate(row), documentType, key);
        indexer.add(deleteRequest);
    }
```

### Deprecation
'UpdateRequest(java.lang.String, java.lang.String, java.lang.String)' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/RowElasticsearchEmitter.java`
#### Snippet
```java
        if (key != null) {
            final UpdateRequest updateRequest =
                    new UpdateRequest(indexGenerator.generate(row), documentType, key)
                            .doc(document, contentType)
                            .upsert(document, contentType);
```

### Deprecation
'IndexRequest(java.lang.String, java.lang.String)' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/RowElasticsearchEmitter.java`
#### Snippet
```java
        } else {
            final IndexRequest indexRequest =
                    new IndexRequest(indexGenerator.generate(row), documentType)
                            .id(key)
                            .source(document, contentType);
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java

    public static IndexGenerator createIndexGenerator(
            String index, TableSchema schema, ZoneId localTimeZoneId) {
        final IndexHelper indexHelper = new IndexHelper();
        if (indexHelper.checkIsDynamicIndex(index)) {
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
    private IndexGeneratorFactory() {}

    public static IndexGenerator createIndexGenerator(String index, TableSchema schema) {
        return createIndexGenerator(index, schema, ZoneId.systemDefault());
    }
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchApiCallBridge.java`
#### Snippet
```java

    /**
     * Creates a {@link RequestIndexer} that is able to work with {@link BulkProcessor} binary
     * compatible.
     */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchApiCallBridge.java`
#### Snippet
```java
     * compatible.
     */
    RequestIndexer createBulkProcessorIndexer(
            BulkProcessor bulkProcessor,
            boolean flushOnCheckpoint,
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java

    /** User-provided handler for failed {@link ActionRequest ActionRequests}. */
    private final ActionRequestFailureHandler failureHandler;

    /**
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ElasticsearchSinkFunction' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java
     * each incoming element.
     */
    private final ElasticsearchSinkFunction<T> elasticsearchSinkFunction;

    /** User-provided handler for failed {@link ActionRequest ActionRequests}. */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java
     *
     * <p>This is incremented whenever the user adds (or re-adds through the {@link
     * ActionRequestFailureHandler}) requests to the {@link RequestIndexer}. It is decremented for
     * each completed request of a bulk request, in {@link BulkProcessor.Listener#afterBulk(long,
     * BulkRequest, BulkResponse)} and {@link BulkProcessor.Listener#afterBulk(long, BulkRequest,
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java
     *
     * <p>This is incremented whenever the user adds (or re-adds through the {@link
     * ActionRequestFailureHandler}) requests to the {@link RequestIndexer}. It is decremented for
     * each completed request of a bulk request, in {@link BulkProcessor.Listener#afterBulk(long,
     * BulkRequest, BulkResponse)} and {@link BulkProcessor.Listener#afterBulk(long, BulkRequest,
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java

    /**
     * Provided to the {@link ActionRequestFailureHandler} to allow users to re-index failed
     * requests.
     */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ElasticsearchSinkFunction' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java
            ElasticsearchApiCallBridge<C> callBridge,
            Map<String, String> userConfig,
            ElasticsearchSinkFunction<T> elasticsearchSinkFunction,
            ActionRequestFailureHandler failureHandler) {

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java
            Map<String, String> userConfig,
            ElasticsearchSinkFunction<T> elasticsearchSinkFunction,
            ActionRequestFailureHandler failureHandler) {

        this.callBridge = checkNotNull(callBridge);
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java
     * This is set from inside the {@link BulkProcessor.Listener} if a {@link Throwable} was thrown
     * in callbacks and the user considered it should fail the sink via the {@link
     * ActionRequestFailureHandler#onFailure(ActionRequest, Throwable, int, RequestIndexer)} method.
     *
     * <p>Errors will be checked and rethrown before processing each input element, and when the
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java
     * This is set from inside the {@link BulkProcessor.Listener} if a {@link Throwable} was thrown
     * in callbacks and the user considered it should fail the sink via the {@link
     * ActionRequestFailureHandler#onFailure(ActionRequest, Throwable, int, RequestIndexer)} method.
     *
     * <p>Errors will be checked and rethrown before processing each input element, and when the
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ElasticsearchSinkFunction' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java

    /**
     * Provided to the user via the {@link ElasticsearchSinkFunction} to add {@link ActionRequest
     * ActionRequests}.
     */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java
     * ActionRequests}.
     */
    private transient RequestIndexer requestIndexer;

    /**
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ElasticsearchSinkFunction' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/ElasticsearchSinkBase.java`
#### Snippet
```java
 * an internal {@link BulkProcessor} to buffer multiple {@link ActionRequest}s before sending the
 * requests to the cluster, as well as passing input records to the user provided {@link
 * ElasticsearchSinkFunction} for processing.
 *
 * <p>The version specific API calls for different Elasticsearch versions should be defined by a
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7Configuration.java`
#### Snippet
```java
import java.util.stream.Collectors;

import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;

/** Elasticsearch 7 specific configuration. */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.RestClientFactory' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch7/Elasticsearch7ApiCallBridge.java`
#### Snippet
```java

    /** The factory to configure the rest client. */
    private final RestClientFactory restClientFactory;

    Elasticsearch7ApiCallBridge(List<HttpHost> httpHosts, RestClientFactory restClientFactory) {
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch7/Elasticsearch7ApiCallBridge.java`
#### Snippet
```java

    @Override
    public RequestIndexer createBulkProcessorIndexer(
            BulkProcessor bulkProcessor,
            boolean flushOnCheckpoint,
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.RestClientFactory' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch7/Elasticsearch7ApiCallBridge.java`
#### Snippet
```java
    private final RestClientFactory restClientFactory;

    Elasticsearch7ApiCallBridge(List<HttpHost> httpHosts, RestClientFactory restClientFactory) {
        Preconditions.checkArgument(httpHosts != null && !httpHosts.isEmpty());
        this.httpHosts = httpHosts;
```

### Deprecation
'UpdateRequest(java.lang.String, java.lang.String, java.lang.String)' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/sink/MapElasticsearchEmitter.java`
#### Snippet
```java
        if (idFieldName != null) {
            final UpdateRequest updateRequest =
                    new UpdateRequest(
                                    indexProvider.apply(doc),
                                    documentType,
```

### Deprecation
'IndexRequest(java.lang.String, java.lang.String)' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/sink/MapElasticsearchEmitter.java`
#### Snippet
```java
        } else {
            final IndexRequest indexRequest =
                    new IndexRequest(indexProvider.apply(doc), documentType).source(doc);
            indexer.add(indexRequest);
        }
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/Elasticsearch6ApiCallBridge.java`
#### Snippet
```java

    @Override
    public RequestIndexer createBulkProcessorIndexer(
            BulkProcessor bulkProcessor,
            boolean flushOnCheckpoint,
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch6.RestClientFactory' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/Elasticsearch6ApiCallBridge.java`
#### Snippet
```java
    private final RestClientFactory restClientFactory;

    Elasticsearch6ApiCallBridge(List<HttpHost> httpHosts, RestClientFactory restClientFactory) {
        Preconditions.checkArgument(httpHosts != null && !httpHosts.isEmpty());
        this.httpHosts = httpHosts;
```

### Deprecation
'bulkAsync(org.elasticsearch.action.bulk.BulkRequest, org.elasticsearch.action.ActionListener, org.apache.http.Header...)' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/Elasticsearch6ApiCallBridge.java`
#### Snippet
```java
    public BulkProcessor.Builder createBulkProcessorBuilder(
            RestHighLevelClient client, BulkProcessor.Listener listener) {
        return BulkProcessor.builder(client::bulkAsync, listener);
    }

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch6.RestClientFactory' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/Elasticsearch6ApiCallBridge.java`
#### Snippet
```java

    /** The factory to configure the rest client. */
    private final RestClientFactory restClientFactory;

    Elasticsearch6ApiCallBridge(List<HttpHost> httpHosts, RestClientFactory restClientFactory) {
```

### Deprecation
'ping(org.apache.http.Header...)' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/Elasticsearch6ApiCallBridge.java`
#### Snippet
```java
        }

        if (!client.ping()) {
            throw new RuntimeException("There are no reachable Elasticsearch nodes!");
        }
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/util/IgnoringFailureHandler.java`
#### Snippet
```java
    @Override
    public void onFailure(
            ActionRequest action, Throwable failure, int restStatusCode, RequestIndexer indexer) {
        // ignore failure
    }
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/util/IgnoringFailureHandler.java`
#### Snippet
```java
/** Ignores all kinds of failures and drops the affected {@link ActionRequest}. */
@Internal
public class IgnoringFailureHandler implements ActionRequestFailureHandler {

    private static final long serialVersionUID = 1662846593501L;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/util/NoOpFailureHandler.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

/** An {@link ActionRequestFailureHandler} that simply fails the sink on any failures. */
@Internal
public class NoOpFailureHandler implements ActionRequestFailureHandler {
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/util/NoOpFailureHandler.java`
#### Snippet
```java
/** An {@link ActionRequestFailureHandler} that simply fails the sink on any failures. */
@Internal
public class NoOpFailureHandler implements ActionRequestFailureHandler {

    private static final long serialVersionUID = 737941343410827885L;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/util/NoOpFailureHandler.java`
#### Snippet
```java
    @Override
    public void onFailure(
            ActionRequest action, Throwable failure, int restStatusCode, RequestIndexer indexer)
            throws Throwable {
        LOG.error("Failed Elasticsearch item request: {}", failure.getMessage(), failure);
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java

    public Optional<String> getPathPrefix() {
        return config.getOptional(ElasticsearchConnectorOptions.CONNECTION_PATH_PREFIX);
    }

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java

    public String getIndex() {
        return config.get(ElasticsearchConnectorOptions.INDEX_OPTION);
    }

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
    }

    public ActionRequestFailureHandler getFailureHandler() {
        final ActionRequestFailureHandler failureHandler;
        String value = config.get(FAILURE_HANDLER_OPTION);
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java

    public ActionRequestFailureHandler getFailureHandler() {
        final ActionRequestFailureHandler failureHandler;
        String value = config.get(FAILURE_HANDLER_OPTION);
        switch (value.toUpperCase()) {
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.util.RetryRejectedExecutionFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
                break;
            case "RETRY-REJECTED":
                failureHandler = new RetryRejectedExecutionFailureHandler();
                break;
            default:
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
                    Class<?> failureHandlerClass = Class.forName(value, false, classLoader);
                    failureHandler =
                            (ActionRequestFailureHandler)
                                    InstantiationUtil.instantiate(failureHandlerClass);
                } catch (ClassNotFoundException e) {
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
    public long getBulkFlushMaxByteSize() {
        long maxSize =
                config.get(ElasticsearchConnectorOptions.BULK_FLASH_MAX_SIZE_OPTION).getBytes();
        // convert 0 to -1, because Elasticsearch client use -1 to disable this configuration.
        return maxSize == 0 ? -1 : maxSize;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java

    public boolean isDisableFlushOnCheckpoint() {
        return !config.get(ElasticsearchConnectorOptions.FLUSH_ON_CHECKPOINT_OPTION);
    }

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
import java.util.Optional;

import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_DELAY_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java

import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_DELAY_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_DELAY_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.USERNAME_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.USERNAME_OPTION;

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.USERNAME_OPTION;

/** Accessor methods to elasticsearch options. */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java

    public int getBulkFlushMaxActions() {
        int maxActions = config.get(ElasticsearchConnectorOptions.BULK_FLUSH_MAX_ACTIONS_OPTION);
        // convert 0 to -1, because Elasticsearch client use -1 to disable this configuration.
        return maxActions == 0 ? -1 : maxActions;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java
    public boolean isBulkFlushBackoffEnabled() {
        return config.get(BULK_FLUSH_BACKOFF_TYPE_OPTION)
                != ElasticsearchConnectorOptions.BackOffType.DISABLED;
    }

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java

    public String getKeyDelimiter() {
        return config.get(ElasticsearchConnectorOptions.KEY_DELIMITER_OPTION);
    }

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchConfiguration.java`
#### Snippet
```java

    public String getDocumentType() {
        return config.get(ElasticsearchConnectorOptions.DOCUMENT_TYPE_OPTION);
    }

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import java.util.stream.Stream;

import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLASH_MAX_SIZE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_DELAY_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java

import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLASH_MAX_SIZE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_DELAY_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLASH_MAX_SIZE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_DELAY_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_DELAY_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_MAX_ACTIONS_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_MAX_ACTIONS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.CONNECTION_PATH_PREFIX;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_MAX_ACTIONS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.CONNECTION_PATH_PREFIX;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.DOCUMENT_TYPE_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_MAX_ACTIONS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.CONNECTION_PATH_PREFIX;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.DOCUMENT_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_MAX_ACTIONS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.CONNECTION_PATH_PREFIX;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.DOCUMENT_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FLUSH_ON_CHECKPOINT_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.CONNECTION_PATH_PREFIX;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.DOCUMENT_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FLUSH_ON_CHECKPOINT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FORMAT_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.DOCUMENT_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FLUSH_ON_CHECKPOINT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FORMAT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FLUSH_ON_CHECKPOINT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FORMAT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.INDEX_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FLUSH_ON_CHECKPOINT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FORMAT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.INDEX_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.KEY_DELIMITER_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FORMAT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.INDEX_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.KEY_DELIMITER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.INDEX_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.KEY_DELIMITER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.USERNAME_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.INDEX_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.KEY_DELIMITER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.USERNAME_OPTION;

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.KEY_DELIMITER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.USERNAME_OPTION;

/** A {@link DynamicTableSinkFactory} for discovering {@link Elasticsearch6DynamicSink}. */
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
    @Override
    public DynamicTableSink createDynamicTableSink(Context context) {
        TableSchema tableSchema = context.getCatalogTable().getSchema();
        ElasticsearchValidationUtils.validatePrimaryKey(tableSchema);
        final FactoryUtil.TableFactoryHelper helper =
```

### Deprecation
'getSchema()' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
    @Override
    public DynamicTableSink createDynamicTableSink(Context context) {
        TableSchema tableSchema = context.getCatalogTable().getSchema();
        ElasticsearchValidationUtils.validatePrimaryKey(tableSchema);
        final FactoryUtil.TableFactoryHelper helper =
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.Elasticsearch6DynamicSink' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
        validate(config, configuration);

        return new Elasticsearch6DynamicSink(
                format,
                config,
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.Elasticsearch6DynamicSink' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.USERNAME_OPTION;

/** A {@link DynamicTableSinkFactory} for discovering {@link Elasticsearch6DynamicSink}. */
@Internal
public class Elasticsearch6DynamicSinkFactory implements DynamicTableSinkFactory {
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import java.util.stream.Stream;

import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLASH_MAX_SIZE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_DELAY_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java

import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLASH_MAX_SIZE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_DELAY_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLASH_MAX_SIZE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_DELAY_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_DELAY_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_MAX_ACTIONS_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_MAX_RETRIES_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_MAX_ACTIONS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.CONNECTION_PATH_PREFIX;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_BACKOFF_TYPE_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_MAX_ACTIONS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.CONNECTION_PATH_PREFIX;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_INTERVAL_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_MAX_ACTIONS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.CONNECTION_PATH_PREFIX;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FLUSH_ON_CHECKPOINT_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.BULK_FLUSH_MAX_ACTIONS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.CONNECTION_PATH_PREFIX;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FLUSH_ON_CHECKPOINT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FORMAT_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.CONNECTION_PATH_PREFIX;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FLUSH_ON_CHECKPOINT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FORMAT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FAILURE_HANDLER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FLUSH_ON_CHECKPOINT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FORMAT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.INDEX_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FLUSH_ON_CHECKPOINT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FORMAT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.INDEX_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.KEY_DELIMITER_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.FORMAT_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.INDEX_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.KEY_DELIMITER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.HOSTS_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.INDEX_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.KEY_DELIMITER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.USERNAME_OPTION;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.INDEX_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.KEY_DELIMITER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.USERNAME_OPTION;

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.KEY_DELIMITER_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.PASSWORD_OPTION;
import static org.apache.flink.streaming.connectors.elasticsearch.table.ElasticsearchConnectorOptions.USERNAME_OPTION;

/** A {@link DynamicTableSinkFactory} for discovering {@link Elasticsearch7DynamicSink}. */
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
    @Override
    public DynamicTableSink createDynamicTableSink(Context context) {
        TableSchema tableSchema = context.getCatalogTable().getSchema();
        ElasticsearchValidationUtils.validatePrimaryKey(tableSchema);

```

### Deprecation
'getSchema()' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSinkFactory.java`
#### Snippet
```java
    @Override
    public DynamicTableSink createDynamicTableSink(Context context) {
        TableSchema tableSchema = context.getCatalogTable().getSchema();
        ElasticsearchValidationUtils.validatePrimaryKey(tableSchema);

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/RequestFactory.java`
#### Snippet
```java

    /**
     * Creates an index request to be added to a {@link RequestIndexer}. Note: the type field has
     * been deprecated since Elasticsearch 7.x and it would not take any effort.
     */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/RequestFactory.java`
#### Snippet
```java
interface RequestFactory extends Serializable {
    /**
     * Creates an update request to be added to a {@link RequestIndexer}. Note: the type field has
     * been deprecated since Elasticsearch 7.x and it would not take any effort.
     */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/RequestFactory.java`
#### Snippet
```java

    /**
     * Creates a delete request to be added to a {@link RequestIndexer}. Note: the type field has
     * been deprecated since Elasticsearch 7.x and it would not take any effort.
     */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java
    }

    void processBufferedRequests(RequestIndexer actualIndexer) {
        for (ActionRequest request : bufferedRequests) {
            if (request instanceof IndexRequest) {
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java

/**
 * Implementation of a {@link RequestIndexer} that buffers {@link ActionRequest ActionRequests}
 * before re-sending them to the Elasticsearch cluster upon request.
 */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java
@Internal
@NotThreadSafe
class BufferingNoOpRequestIndexer implements RequestIndexer {

    private ConcurrentLinkedQueue<ActionRequest> bufferedRequests;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/Elasticsearch6BulkProcessorIndexer.java`
#### Snippet
```java

/**
 * Implementation of a {@link RequestIndexer}, using a {@link BulkProcessor}. {@link ActionRequest
 * ActionRequests} will be buffered before sending a bulk request to the Elasticsearch cluster.
 *
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer' is deprecated
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch6/Elasticsearch6BulkProcessorIndexer.java`
#### Snippet
```java
 */
@Internal
class Elasticsearch6BulkProcessorIndexer implements RequestIndexer {

    private final BulkProcessor bulkProcessor;
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/KeyExtractor.java`
#### Snippet
```java

    public static Function<RowData, String> createKeyExtractor(
            TableSchema schema, String keyDelimiter) {
        return schema.getPrimaryKey()
                .map(
```

### Deprecation
'org.apache.flink.table.api.TableColumn' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/KeyExtractor.java`
#### Snippet
```java
                        key -> {
                            Map<String, ColumnWithIndex> namesToColumns = new HashMap<>();
                            List<TableColumn> tableColumns = schema.getTableColumns();
                            for (int i = 0; i < schema.getFieldCount(); i++) {
                                TableColumn column = tableColumns.get(i);
```

### Deprecation
'org.apache.flink.table.api.TableColumn' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/KeyExtractor.java`
#### Snippet
```java
                            List<TableColumn> tableColumns = schema.getTableColumns();
                            for (int i = 0; i < schema.getFieldCount(); i++) {
                                TableColumn column = tableColumns.get(i);
                                namesToColumns.put(
                                        column.getName(), new ColumnWithIndex(column, i));
```

### Deprecation
'org.apache.flink.table.api.TableColumn' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/KeyExtractor.java`
#### Snippet
```java
        public int index;

        public ColumnWithIndex(TableColumn column, int index) {
            this.column = column;
            this.index = index;
```

### Deprecation
'org.apache.flink.table.api.TableColumn' is deprecated
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/KeyExtractor.java`
#### Snippet
```java

    private static class ColumnWithIndex {
        public TableColumn column;
        public int index;

```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
            EncodingFormat<SerializationSchema<RowData>> format,
            Elasticsearch7Configuration config,
            TableSchema schema,
            ZoneId localTimeZoneId,
            ElasticSearchBuilderProvider builderProvider) {
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.ElasticsearchSink' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
    @FunctionalInterface
    interface ElasticSearchBuilderProvider {
        ElasticsearchSink.Builder<RowData> createBuilder(
                List<HttpHost> httpHosts, RowElasticsearchSinkFunction upsertSinkFunction);
    }
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.ElasticsearchSink.Builder' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
    @FunctionalInterface
    interface ElasticSearchBuilderProvider {
        ElasticsearchSink.Builder<RowData> createBuilder(
                List<HttpHost> httpHosts, RowElasticsearchSinkFunction upsertSinkFunction);
    }
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
            EncodingFormat<SerializationSchema<RowData>> format,
            Elasticsearch7Configuration config,
            TableSchema schema,
            ZoneId localTimeZoneId) {
        this(format, config, schema, localTimeZoneId, (ElasticsearchSink.Builder::new));
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.ElasticsearchSink' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
            TableSchema schema,
            ZoneId localTimeZoneId) {
        this(format, config, schema, localTimeZoneId, (ElasticsearchSink.Builder::new));
    }

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.ElasticsearchSink.Builder' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
            TableSchema schema,
            ZoneId localTimeZoneId) {
        this(format, config, schema, localTimeZoneId, (ElasticsearchSink.Builder::new));
    }

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.ElasticsearchSink' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
                            KeyExtractor.createKeyExtractor(schema, config.getKeyDelimiter()));

            final ElasticsearchSink.Builder<RowData> builder =
                    builderProvider.createBuilder(config.getHosts(), upsertFunction);

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.ElasticsearchSink.Builder' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
                            KeyExtractor.createKeyExtractor(schema, config.getKeyDelimiter()));

            final ElasticsearchSink.Builder<RowData> builder =
                    builderProvider.createBuilder(config.getHosts(), upsertFunction);

```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.ElasticsearchSink' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
            }

            final ElasticsearchSink<RowData> sink = builder.build();

            if (config.isDisableFlushOnCheckpoint()) {
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.ElasticsearchSink' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java

/**
 * A {@link DynamicTableSink} that describes how to create a {@link ElasticsearchSink} from a
 * logical description.
 */
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.RestClientFactory' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
    }

    /** Serializable {@link RestClientFactory} used by the sink. */
    @VisibleForTesting
    static class DefaultRestClientFactory implements RestClientFactory {
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.RestClientFactory' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
    /** Serializable {@link RestClientFactory} used by the sink. */
    @VisibleForTesting
    static class DefaultRestClientFactory implements RestClientFactory {

        private final String pathPrefix;
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java

    private final EncodingFormat<SerializationSchema<RowData>> format;
    private final TableSchema schema;
    private final Elasticsearch7Configuration config;
    private final ZoneId localTimeZoneId;
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.RestClientFactory' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
    }

    /** Serializable {@link RestClientFactory} used by the sink which enable authentication. */
    @VisibleForTesting
    static class AuthRestClientFactory implements RestClientFactory {
```

### Deprecation
'org.apache.flink.streaming.connectors.elasticsearch7.RestClientFactory' is deprecated
in `flink-connector-elasticsearch7/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch7DynamicSink.java`
#### Snippet
```java
    /** Serializable {@link RestClientFactory} used by the sink which enable authentication. */
    @VisibleForTesting
    static class AuthRestClientFactory implements RestClientFactory {

        private final String pathPrefix;
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/sink/NetworkClientConfig.java`
#### Snippet
```java
    @Nullable private final String password;
    @Nullable private final String connectionPathPrefix;
    @Nullable private final Integer connectionRequestTimeout;
    @Nullable private final Integer connectionTimeout;
    @Nullable private final Integer socketTimeout;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/sink/NetworkClientConfig.java`
#### Snippet
```java

    @Nullable private final String username;
    @Nullable private final String password;
    @Nullable private final String connectionPathPrefix;
    @Nullable private final Integer connectionRequestTimeout;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/sink/NetworkClientConfig.java`
#### Snippet
```java
class NetworkClientConfig implements Serializable {

    @Nullable private final String username;
    @Nullable private final String password;
    @Nullable private final String connectionPathPrefix;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/sink/NetworkClientConfig.java`
#### Snippet
```java
    @Nullable private final String username;
    @Nullable private final String password;
    @Nullable private final String connectionPathPrefix;
    @Nullable private final Integer connectionRequestTimeout;
    @Nullable private final Integer connectionTimeout;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/sink/NetworkClientConfig.java`
#### Snippet
```java
    @Nullable private final Integer connectionRequestTimeout;
    @Nullable private final Integer connectionTimeout;
    @Nullable private final Integer socketTimeout;

    NetworkClientConfig(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/sink/NetworkClientConfig.java`
#### Snippet
```java
    @Nullable private final String connectionPathPrefix;
    @Nullable private final Integer connectionRequestTimeout;
    @Nullable private final Integer connectionTimeout;
    @Nullable private final Integer socketTimeout;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/ElasticsearchDynamicSink.java`
#### Snippet
```java
    final String summaryString;
    final ElasticsearchSinkBuilderSupplier<RowData> builderSupplier;
    @Nullable final String documentType;
    final boolean isDynamicIndexWithSystemTime;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/RowElasticsearchEmitter.java`
#### Snippet
```java
    private final SerializationSchema<RowData> serializationSchema;
    private final XContentType contentType;
    @Nullable private final String documentType;
    private final Function<RowData, String> createKey;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/sink/MapElasticsearchEmitter.java`
#### Snippet
```java

    private final String index;
    private @Nullable final String documentType;
    private @Nullable final String idFieldName;
    private final boolean isDynamicIndex;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/sink/MapElasticsearchEmitter.java`
#### Snippet
```java
    private final String index;
    private @Nullable final String documentType;
    private @Nullable final String idFieldName;
    private final boolean isDynamicIndex;
    private transient Function<Map<String, Object>, String> indexProvider;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `flink-connector-elasticsearch6/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/Elasticsearch6Configuration.java`
#### Snippet
```java
     *
     * <pre>
     *     connector.hosts = http://host_name:9092;http://host_name:9093
     * </pre>
     */
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `key` is always 'null'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/RowElasticsearchSinkFunction.java`
#### Snippet
```java
            final IndexRequest indexRequest =
                    requestFactory.createIndexRequest(
                            indexGenerator.generate(row), docType, key, contentType, document);
            indexer.add(indexRequest);
        }
```

### ConstantValue
Value `key` is always 'null'
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/RowElasticsearchEmitter.java`
#### Snippet
```java
            final IndexRequest indexRequest =
                    new IndexRequest(indexGenerator.generate(row), documentType)
                            .id(key)
                            .source(document, contentType);
            indexer.add(indexRequest);
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/streaming/connectors/elasticsearch/table/ElasticsearchValidationUtils.java`
#### Snippet
```java
                                                        LogicalType logicalType =
                                                                schema.getFieldDataType(fieldName)
                                                                        .get()
                                                                        .getLogicalType();
                                                        if (logicalType.is(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/ElasticsearchDynamicSink.java`
#### Snippet
```java
        if (config.getBulkFlushBackoffType().isPresent()) {
            FlushBackoffType backoffType = config.getBulkFlushBackoffType().get();
            int backoffMaxRetries = config.getBulkFlushBackoffRetries().get();
            long backoffDelayMs = config.getBulkFlushBackoffDelay().get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-elasticsearch-base/src/main/java/org/apache/flink/connector/elasticsearch/table/ElasticsearchDynamicSink.java`
#### Snippet
```java
            FlushBackoffType backoffType = config.getBulkFlushBackoffType().get();
            int backoffMaxRetries = config.getBulkFlushBackoffRetries().get();
            long backoffDelayMs = config.getBulkFlushBackoffDelay().get();

            builder.setBulkFlushBackoffStrategy(backoffType, backoffMaxRetries, backoffDelayMs);
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `flink-connector-elasticsearch-e2e-tests/flink-connector-elasticsearch-e2e-tests-common/src/main/java/org/apache/flink/streaming/tests/KeyValue.java`
#### Snippet
```java
            return false;
        }
        if (value != null ? !value.equals(keyValue.value) : keyValue.value != null) {
            return false;
        }
```

