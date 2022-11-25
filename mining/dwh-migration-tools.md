# dwh-migration-tools 
 
# Bad smells
I found 905 bad smells with 566 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 531 | true |
| NullableProblems | 146 | false |
| UNUSED_IMPORT | 24 | false |
| DataFlowIssue | 19 | false |
| MissortedModifiers | 19 | false |
| NonProtectedConstructorInAbstractClass | 16 | true |
| ConstantValue | 15 | false |
| UnnecessarySemicolon | 11 | false |
| UnusedLabel | 11 | true |
| SystemOutErr | 11 | false |
| UnstableApiUsage | 11 | false |
| CommentedOutCode | 8 | false |
| Convert2Lambda | 7 | false |
| UtilityClassWithoutPrivateConstructor | 6 | false |
| DynamicRegexReplaceableByCompiledPattern | 6 | false |
| RedundantFieldInitialization | 6 | false |
| AssignmentToMethodParameter | 6 | false |
| DeprecatedIsStillUsed | 4 | false |
| UnusedAssignment | 4 | false |
| StaticPseudoFunctionalStyleMethod | 3 | false |
| BoundedWildcard | 3 | false |
| NonStrictComparisonCanBeEquality | 3 | true |
| ReturnNull | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| IgnoreResultOfCall | 2 | false |
| UnnecessaryUnboxing | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| InstanceofCatchParameter | 2 | false |
| TypeParameterExtendsObject | 2 | false |
| FieldMayBeStatic | 1 | false |
| LoopStatementsThatDontLoop | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| Convert2MethodRef | 1 | false |
| ComparatorCombinators | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| RedundantSuppression | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| NestedAssignment | 1 | false |
| UnnecessaryBreak | 1 | false |
| EmptyMethod | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| DuplicateThrows | 1 | false |
| BusyWait | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentProgressMonitor.java`
#### Snippet
```java
    /** Returns the current count. This may be a relatively slow operation. */
    @Nonnegative
    public long getCount();

    public void count(@Nonnegative int delta);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentProgressMonitor.java`
#### Snippet
```java

    @Override
    public void close();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentProgressMonitor.java`
#### Snippet
```java

    /** Counts 1. */
    default public void count() {
        count(1);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentProgressMonitor.java`
#### Snippet
```java

    @Nonnull
    default public ConcurrentProgressMonitor withBlockSize(@Nonnegative int blockSize) {
        return this;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentProgressMonitor.java`
#### Snippet
```java

    /** The divisor for memory measurements: 1 Mb. */
    public static final int MEMDIV = 1024 * 1024;

    @Nonnull
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentProgressMonitor.java`
#### Snippet
```java

    /** The divisor for memory measurements: 1 Mb. */
    public static final int MEMDIV = 1024 * 1024;

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java
     * Returns the number counted so far, including this count.
     */
    public long count(@Nonnegative int delta);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java

    @Override
    public void close();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java
     * Returns the number counted so far, including this count.
     */
    default public long count() {
        return count(1);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java

    /** The divisor for memory measurements: 1 Mb. */
    public static final int MEMDIV = 1024 * 1024;

    @Nonnull
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java

    /** The divisor for memory measurements: 1 Mb. */
    public static final int MEMDIV = 1024 * 1024;

    @Nonnull
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java

    /** The divisor for memory measurements: 1 Mb. */
    public static final int MEMDIV = 1024 * 1024;

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java

    /** Returns the time elapsed since creation of this ProgressMonitor */
    public long timeElapsed(TimeUnit desiredUnit);

    /** Returns the current count. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java
    /** Returns the current count. */
    @Nonnegative
    default public long getCount() {
        return count(0);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java

    @Nonnull
    default public BlockProgressMonitor withBlockSize(@Nonnegative int blockSize) {
        return new BlockProgressMonitor(this, blockSize);
    }
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentProgressMonitor.java`
#### Snippet
```java

    /** The divisor for memory measurements: 1 Mb. */
    public static final int MEMDIV = 1024 * 1024;

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentProgressMonitor.java`
#### Snippet
```java
    public long getCount();

    public void count(@Nonnegative int delta);

    /** Counts 1. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
        protected static interface BigQueryConsumer<V> {

            public void accept(@Nonnull V value) throws BigQueryException, IOException, InterruptedException;
        }

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
        }

        protected static interface BigQueryConsumer<V> {

            public void accept(@Nonnull V value) throws BigQueryException, IOException, InterruptedException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class TableMetadata {

            @CheckForNull
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class TableMetadata {

            @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface TablesJsonTaskFormat {

        public static final String ZIP_ENTRY_NAME = "tables.jsonl";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface TablesJsonTaskFormat {

        public static final String ZIP_ENTRY_NAME = "tables.jsonl";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TablesJsonTaskFormat {

        public static final String ZIP_ENTRY_NAME = "tables.jsonl";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TablesJsonTaskFormat {

        public static final String ZIP_ENTRY_NAME = "tables.jsonl";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TablesJsonTaskFormat {

        public static final String ZIP_ENTRY_NAME = "tables.jsonl";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            .disable(SerializationFeature.INDENT_OUTPUT);

    public static final String FORMAT_NAME = "hiveql.dump.zip";

    interface SchemataFormat {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            .disable(SerializationFeature.INDENT_OUTPUT);

    public static final String FORMAT_NAME = "hiveql.dump.zip";

    interface SchemataFormat {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            .disable(SerializationFeature.INDENT_OUTPUT);

    public static final String FORMAT_NAME = "hiveql.dump.zip";

    interface SchemataFormat {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
public interface HiveMetadataDumpFormat {

    public static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
            .disable(SerializationFeature.INDENT_OUTPUT);
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
public interface HiveMetadataDumpFormat {

    public static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
            .disable(SerializationFeature.INDENT_OUTPUT);
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
public interface HiveMetadataDumpFormat {

    public static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
            .disable(SerializationFeature.INDENT_OUTPUT);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java

    @Deprecated // Use TablesJsonTaskFormat.
    public static interface TablesTaskFormat {

        String ZIP_ENTRY_NAME = "tables.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java

    @Deprecated // Use TablesJsonTaskFormat.
    public static interface TablesTaskFormat {

        String ZIP_ENTRY_NAME = "tables.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
public interface BigQueryMetadataDumpFormat {

    public static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
            .disable(SerializationFeature.INDENT_OUTPUT);
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
public interface BigQueryMetadataDumpFormat {

    public static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
            .disable(SerializationFeature.INDENT_OUTPUT);
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
public interface BigQueryMetadataDumpFormat {

    public static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
            .disable(SerializationFeature.INDENT_OUTPUT);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface TablesJsonTaskFormat {

        public static final String ZIP_ENTRY_NAME = "tables.jsonl";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface TablesJsonTaskFormat {

        public static final String ZIP_ENTRY_NAME = "tables.jsonl";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class Metadata {

            @CheckForNull
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class Metadata {

            @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
    String FORMAT_NAME = "bigquery.dump.zip";

    public static enum TimePartitioningType {
        // See BQ's TimePartitioning.Type
        HOUR,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
    String FORMAT_NAME = "bigquery.dump.zip";

    public static enum TimePartitioningType {
        // See BQ's TimePartitioning.Type
        HOUR,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
        }

        public static enum Header {
            ProjectId,
            DatasetId,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
        }

        public static enum Header {
            ProjectId,
            DatasetId,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            public static class Field {

                public static enum Mode {
                    NULLABLE,
                    REQUIRED,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TablesJsonTaskFormat {

        public static final String ZIP_ENTRY_NAME = "tables.jsonl";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TablesJsonTaskFormat {

        public static final String ZIP_ENTRY_NAME = "tables.jsonl";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TablesJsonTaskFormat {

        public static final String ZIP_ENTRY_NAME = "tables.jsonl";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java

    @Deprecated // Use TablesJsonTaskFormat.
    public static interface ColumnsTaskFormat {

        String ZIP_ENTRY_NAME = "fields.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java

    @Deprecated // Use TablesJsonTaskFormat.
    public static interface ColumnsTaskFormat {

        String ZIP_ENTRY_NAME = "fields.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface DatasetsTaskFormat {

        String ZIP_ENTRY_NAME = "datasets.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface DatasetsTaskFormat {

        String ZIP_ENTRY_NAME = "datasets.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class Metadata {

            @CheckForNull
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class Metadata {

            @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
        }

        public static enum Header {
            ProjectId,
            DatasetId,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
        }

        public static enum Header {
            ProjectId,
            DatasetId,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
        String ZIP_ENTRY_NAME = "tables.csv";

        public static class Metadata {

            @CheckForNull
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
        String ZIP_ENTRY_NAME = "tables.csv";

        public static class Metadata {

            @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandleFactory.java`
#### Snippet
```java

    @Nonnull
    public OutputHandle newOutputFileHandle(@Nonnull String targetPath);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/PartitionKey.java`
#### Snippet
```java

    @CheckForNull
    public String getPartitionKeyName();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/PartitionKey.java`
#### Snippet
```java

    @CheckForNull
    public String getType();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/PartitionKey.java`
#### Snippet
```java

    @CheckForNull
    public String getComment();
}

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface XmlViews {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Views-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Views-XML.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.MViews.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.MViews.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Procedures.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Procedures.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.TabColumns.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.TabColumns.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Constraints.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Constraints.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface XmlSynonyms {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Synonyms-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Synonyms-XML.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Views.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Views.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Catalog {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Catalog.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Catalog.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface V_Option {

        final String ZIP_ENTRY_NAME = "V_Option.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Arguments {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Arguments.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Arguments.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Views {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Views.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Views.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Synonyms-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Synonyms-XML.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Indexes-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Indexes-XML.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Operators.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Operators.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface XmlFunctions {

        final String ZIP_ENTRY_NAME = "Functions-XML.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface XmlIndexes {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Indexes-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Indexes-XML.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Functions {

        final String ZIP_ENTRY_NAME = "Functions.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Part_key_columns {

        final String ZIP_ENTRY_NAME_DBA = "DBA.PartKeyColumns.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.PartKeyColumns.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface XmlTypes {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Types-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Types-XML.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface XmlTables {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Tables-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Tables-XML.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface V_Parameter2 {

        final String ZIP_ENTRY_NAME = "V_Parameter2.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Tab_Partitions {

        final String ZIP_ENTRY_NAME_DBA = "DBA.TabPartitions.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.TabPartitions.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface XmlSequences {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Sequences-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Sequences-XML.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Constraints {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Constraints.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Constraints.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Catalog.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Catalog.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Types.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Types.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.TabPartitions.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.TabPartitions.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Tables-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Tables-XML.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Tables.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Tables.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface MViews {

        final String ZIP_ENTRY_NAME_DBA = "DBA.MViews.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.MViews.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Sequences-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Sequences-XML.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Types {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Types.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Types.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
public interface OracleMetadataDumpFormat {

    public static final String FORMAT_NAME = "oracle.dump.zip";

    interface Arguments {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
public interface OracleMetadataDumpFormat {

    public static final String FORMAT_NAME = "oracle.dump.zip";

    interface Arguments {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
public interface OracleMetadataDumpFormat {

    public static final String FORMAT_NAME = "oracle.dump.zip";

    interface Arguments {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Views-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Views-XML.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Types-XML.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Types-XML.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Tables {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Tables.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Tables.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface V_Version {

        final String ZIP_ENTRY_NAME = "V_Version.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Operators {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Operators.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Operators.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface V_Pwfile_users {

        final String ZIP_ENTRY_NAME = "V_Pwfile_users.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Tab_Columns {

        final String ZIP_ENTRY_NAME_DBA = "DBA.TabColumns.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.TabColumns.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Procedures {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Procedures.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Procedures.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.PlsqlTypes.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.PlsqlTypes.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.PartKeyColumns.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.PartKeyColumns.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Indexes.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Indexes.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Indexes {

        final String ZIP_ENTRY_NAME_DBA = "DBA.Indexes.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Indexes.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java

        final String ZIP_ENTRY_NAME_DBA = "DBA.Arguments.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.Arguments.csv";

        enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleMetadataDumpFormat.java`
#### Snippet
```java
    interface Plsql_Types {

        final String ZIP_ENTRY_NAME_DBA = "DBA.PlsqlTypes.csv";
        final String ZIP_ENTRY_NAME_ALL = "ALL.PlsqlTypes.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/MetadataConnector.java`
#### Snippet
```java

    @Override
    default public String getDefaultFileName() {
        return "dwh-migration-" + getName() + "-metadata.zip";
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
        }

        public static boolean isZipEntryName(@Nonnull String name) {
            return name.startsWith(ZIP_ENTRY_PREFIX) && name.endsWith(ZIP_ENTRY_SUFFIX);
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static interface QueryMetricsHistory {

        public static final String ZIP_ENTRY_PREFIX = "querymetrics_";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static interface QueryMetricsHistory {

        public static final String ZIP_ENTRY_PREFIX = "querymetrics_";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static interface QueryMetricsHistory {

        public static final String ZIP_ENTRY_PREFIX = "querymetrics_";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_PREFIX = "querytext_";

        public static enum Header {
            userid, xid, pid, query, label, starttime, endtime, sequence, text;
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_PREFIX = "querytext_";

        public static enum Header {
            userid, xid, pid, query, label, starttime, endtime, sequence, text;
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    }

    public static interface QueryMetricsHistory {

        public static final String ZIP_ENTRY_PREFIX = "querymetrics_";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    }

    public static interface QueryMetricsHistory {

        public static final String ZIP_ENTRY_PREFIX = "querymetrics_";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static interface QueryHistory {

        public static final String ZIP_ENTRY_PREFIX = "querytext_";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static interface QueryHistory {

        public static final String ZIP_ENTRY_PREFIX = "querytext_";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static interface QueryHistory {

        public static final String ZIP_ENTRY_PREFIX = "querytext_";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
        }

        public static boolean isZipEntryName(@Nonnull String name) {
            return name.startsWith(ZIP_ENTRY_PREFIX) && name.endsWith(ZIP_ENTRY_SUFFIX);
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

    public static interface DdlHistory {

        public static final String ZIP_ENTRY_PREFIX = "ddltext_";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

    public static interface DdlHistory {

        public static final String ZIP_ENTRY_PREFIX = "ddltext_";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static interface DdlHistory {

        public static final String ZIP_ENTRY_PREFIX = "ddltext_";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static interface DdlHistory {

        public static final String ZIP_ENTRY_PREFIX = "ddltext_";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static interface DdlHistory {

        public static final String ZIP_ENTRY_PREFIX = "ddltext_";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_PREFIX = "ddltext_";

        public static enum Header {
            userid, xid, pid, label, starttime, endtime, sequence, text;
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_PREFIX = "ddltext_";

        public static enum Header {
            userid, xid, pid, label, starttime, endtime, sequence, text;
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
        }

        public static boolean isZipEntryName(@Nonnull String name) {
            return name.startsWith(ZIP_ENTRY_PREFIX) && name.endsWith(ZIP_ENTRY_SUFFIX);
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
public interface RedshiftRawLogsDumpFormat {

    public static final String FORMAT_NAME = "redshift-raw.logs.zip";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
public interface RedshiftRawLogsDumpFormat {

    public static final String FORMAT_NAME = "redshift-raw.logs.zip";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
public interface RedshiftRawLogsDumpFormat {

    public static final String FORMAT_NAME = "redshift-raw.logs.zip";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    }

    public static interface QueryHistory {

        public static final String ZIP_ENTRY_PREFIX = "querytext_";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    }

    public static interface QueryHistory {

        public static final String ZIP_ENTRY_PREFIX = "querytext_";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_PREFIX = "querymetrics_";

        public static enum Header {
            userid, service_class, query, segment, step_type, starttime, slices, max_rows, rows,
            max_cpu_time, cpu_time, max_blocks_read, blocks_read, max_run_time, run_time,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_PREFIX = "querymetrics_";

        public static enum Header {
            userid, service_class, query, segment, step_type, starttime, slices, max_rows, rows,
            max_cpu_time, cpu_time, max_blocks_read, blocks_read, max_run_time, run_time,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java

    public static final String FORMAT_NAME = "redshift-raw.logs.zip";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

    public static interface DdlHistory {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java

    public static final String FORMAT_NAME = "redshift-raw.logs.zip";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

    public static interface DdlHistory {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java

    public static final String FORMAT_NAME = "redshift-raw.logs.zip";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

    public static interface DdlHistory {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/MysqlMetadataDumpFormat.java`
#### Snippet
```java
public interface MysqlMetadataDumpFormat {

    public static final String FORMAT_NAME = "mysql.dump.zip";

    /*
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/MysqlMetadataDumpFormat.java`
#### Snippet
```java
public interface MysqlMetadataDumpFormat {

    public static final String FORMAT_NAME = "mysql.dump.zip";

    /*
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/MysqlMetadataDumpFormat.java`
#### Snippet
```java
public interface MysqlMetadataDumpFormat {

    public static final String FORMAT_NAME = "mysql.dump.zip";

    /*
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
    private static class InputDescriptor implements Comparable<InputDescriptor> {

        public static enum Category {
            Arg, Env, Other
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Field.java`
#### Snippet
```java

    @CheckForNull
    public String getType();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Field.java`
#### Snippet
```java

    @CheckForNull
    public String getComment();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Field.java`
#### Snippet
```java

    @CheckForNull
    public String getFieldName();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public Integer getLastDdlTime();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public Integer getBucketsCount();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public Integer getFilesCount();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public String getExpandedViewText();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public String getTableName();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public Integer getRetention();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public Long getTotalSize();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public Long getRawSize();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public String getTableType();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public Integer getCreateTime();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @Nonnull
    public List<? extends PartitionKey> getPartitionKeys();

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public Integer getLastAccessTime();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public String getOriginalViewText();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @Nonnull
    public List<? extends Field> getFields() throws Exception;

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public String getDatabaseName();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public Boolean isCompressed();

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public String getOwner();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @Nonnull
    public List<? extends Partition> getPartitions() throws Exception;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public Long getRowsCount();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

    @CheckForNull
    public String getLocation();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        //  ColumnPartitionFormat,ColumnPartitionAC,PseudoUDTFieldId,PseudoUDTFieldType,StorageFormat,DatasetSchemaName,InlineLength,TSColumnType
        // NOTE: This enum must match not what TD says is in the schema, but what we actually dump.
        public static enum Header {
            DatabaseName, TableName, /** New. */
            ColumnId, ColumnName, ColumnType;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        //  ColumnPartitionFormat,ColumnPartitionAC,PseudoUDTFieldId,PseudoUDTFieldType,StorageFormat,DatasetSchemaName,InlineLength,TSColumnType
        // NOTE: This enum must match not what TD says is in the schema, but what we actually dump.
        public static enum Header {
            DatabaseName, TableName, /** New. */
            ColumnId, ColumnName, ColumnType;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, FunctionName, SpecificName, FunctionId, NumParameters, ParameterDataTypes, FunctionType, ExternalName, SrcFileLanguage, NoSQLDataAccess, ParameterStyle, DeterministicOpt, NullCall, PrepareCount, ExecProtectionMode, ExtFileReference, CharacterType, Platform, InterimFldSize, RoutineKind, ParameterUDTIds, AuthIdUsed, MaxOutParameters, GLOPSetDatabaseName, GLOPSetMemberName, RefQueryband, ExecMapName, ExecMapColocName
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, FunctionName, SpecificName, FunctionId, NumParameters, ParameterDataTypes, FunctionType, ExternalName, SrcFileLanguage, NoSQLDataAccess, ParameterStyle, DeterministicOpt, NullCall, PrepareCount, ExecProtectionMode, ExtFileReference, CharacterType, Platform, InterimFldSize, RoutineKind, ParameterUDTIds, AuthIdUsed, MaxOutParameters, GLOPSetDatabaseName, GLOPSetMemberName, RefQueryband, ExecMapName, ExecMapColocName
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface ColumnsFormat {

        public static final String ZIP_ENTRY_NAME = "dbc.Columns.csv";

        // Complete Set for _some_ TD from Issue:5673
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface ColumnsFormat {

        public static final String ZIP_ENTRY_NAME = "dbc.Columns.csv";

        // Complete Set for _some_ TD from Issue:5673
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface ColumnsFormat {

        public static final String ZIP_ENTRY_NAME = "dbc.Columns.csv";

        // Complete Set for _some_ TD from Issue:5673
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface DiskSpaceVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.DiskSpaceV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface DiskSpaceVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.DiskSpaceV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            Vproc, DataBaseName, AccountName, TableName, CurrentPerm, PeakPerm
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            Vproc, DataBaseName, AccountName, TableName, CurrentPerm, PeakPerm
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface DiskSpaceVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.DiskSpaceV.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface DiskSpaceVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.DiskSpaceV.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TableSizeVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TableSizeV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TableSizeVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TableSizeV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface ColumnsQVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsQV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface ColumnsQVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsQV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface ColumnsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface ColumnsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface VersionFormat {

        public static final String ZIP_ENTRY_NAME = "version.csv";
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface VersionFormat {

        public static final String ZIP_ENTRY_NAME = "version.csv";
    }

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface VersionFormat {

        public static final String ZIP_ENTRY_NAME = "version.csv";
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface IndicesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.IndicesV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface IndicesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.IndicesV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface StatsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.StatsV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface StatsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.StatsV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface TableSizeVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TableSizeV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface TableSizeVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TableSizeV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface All_RI_ChildrenVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ChildrenV.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface All_RI_ChildrenVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ChildrenV.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, TableName, IndexName, IndexNumber, ConstraintType, ConstraintText, ConstraintCollation, CollationName, CreatorName, CreateTimeStamp, CharSetID, SessionMode, ResolvedCurrent_Date, ResolvedCurrent_TimeStamp, DefinedCombinedPartitions, MaxCombinedPartitions, PartitioningLevels, ColumnPartitioningLevel
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/SnowflakeMetadataDumpFormat.java`
#### Snippet
```java
public interface SnowflakeMetadataDumpFormat {

    public static final String FORMAT_NAME = "snowflake.dump.zip";

    interface DatabasesFormat {
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, TableName, IndexName, IndexNumber, ConstraintType, ConstraintText, ConstraintCollation, CollationName, CreatorName, CreateTimeStamp, CharSetID, SessionMode, ResolvedCurrent_Date, ResolvedCurrent_TimeStamp, DefinedCombinedPartitions, MaxCombinedPartitions, PartitioningLevels, ColumnPartitioningLevel
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/SnowflakeMetadataDumpFormat.java`
#### Snippet
```java
public interface SnowflakeMetadataDumpFormat {

    public static final String FORMAT_NAME = "snowflake.dump.zip";

    interface DatabasesFormat {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/SnowflakeMetadataDumpFormat.java`
#### Snippet
```java
public interface SnowflakeMetadataDumpFormat {

    public static final String FORMAT_NAME = "snowflake.dump.zip";

    interface DatabasesFormat {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static final String FORMAT_NAME = "teradata.dump.zip";

    public static interface VersionFormat {

        public static final String ZIP_ENTRY_NAME = "version.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static final String FORMAT_NAME = "teradata.dump.zip";

    public static interface VersionFormat {

        public static final String ZIP_ENTRY_NAME = "version.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface FunctionsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.FunctionsV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface FunctionsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.FunctionsV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface AllTempTablesVXFormat {

        public static String ZIP_ENTRY_NAME = "dbc.AllTempTablesVX.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface AllTempTablesVXFormat {

        public static String ZIP_ENTRY_NAME = "dbc.AllTempTablesVX.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, TableName, IndexNumber, IndexType, UniqueFlag, IndexName, ColumnName, ColumnPosition, CreatorName, CreateTimeStamp, LastAlterName, LastAlterTimeStamp, IndexMode, AccessCount, LastAccessTimeStamp, UniqueOrPK, VTConstraintType, TTConstraintType, SystemDefinedJI, IndexDatabaseName, LDIType, RowSizeFormat, TimeZero, TimeBucketUnit, TimeBucketValue, TSFlags
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, TableName, IndexNumber, IndexType, UniqueFlag, IndexName, ColumnName, ColumnPosition, CreatorName, CreateTimeStamp, LastAlterName, LastAlterTimeStamp, IndexMode, AccessCount, LastAccessTimeStamp, UniqueOrPK, VTConstraintType, TTConstraintType, SystemDefinedJI, IndexDatabaseName, LDIType, RowSizeFormat, TimeZero, TimeBucketUnit, TimeBucketValue, TSFlags
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DataBaseName, TableName, Version, TableKind, ProtectionType, JournalFlag, CreatorName, RequestText, CommentString, ParentCount, ChildCount, NamedTblCheckCount, UnnamedTblCheckExist, PrimaryKeyIndexId, RepStatus, CreateTimeStamp, LastAlterName, LastAlterTimeStamp, RequestTxtOverflow, AccessCount, LastAccessTimeStamp, UtilVersion, QueueFlag, CommitOpt, TransLog, CheckOpt, TemporalProperty, ResolvedCurrent_Date, ResolvedCurrent_Timestamp, SystemDefinedJI, VTQualifier, TTQualifier, PIColumnCount, PartitioningLevels, LoadProperty, CurrentLoadId, LoadIdLayout, DelayedJI, LastArchiveId, LastFullArchiveId, BlockSize, FreeSpacePercent, MergeBlockRatio, CheckSum, BlockCompression, BlockCompressionAlgorithm, BlockCompressionLevel, TableHeaderFormat, RowSizeFormat, MapName, ColocationName, TVMFlavor
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DataBaseName, TableName, Version, TableKind, ProtectionType, JournalFlag, CreatorName, RequestText, CommentString, ParentCount, ChildCount, NamedTblCheckCount, UnnamedTblCheckExist, PrimaryKeyIndexId, RepStatus, CreateTimeStamp, LastAlterName, LastAlterTimeStamp, RequestTxtOverflow, AccessCount, LastAccessTimeStamp, UtilVersion, QueueFlag, CommitOpt, TransLog, CheckOpt, TemporalProperty, ResolvedCurrent_Date, ResolvedCurrent_Timestamp, SystemDefinedJI, VTQualifier, TTQualifier, PIColumnCount, PartitioningLevels, LoadProperty, CurrentLoadId, LoadIdLayout, DelayedJI, LastArchiveId, LastFullArchiveId, BlockSize, FreeSpacePercent, MergeBlockRatio, CheckSum, BlockCompression, BlockCompressionAlgorithm, BlockCompressionLevel, TableHeaderFormat, RowSizeFormat, MapName, ColocationName, TVMFlavor
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface DatabasesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.DatabasesV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface DatabasesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.DatabasesV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.DiskSpaceV.csv";

        public static enum Header {
            VProc, DatabaseName, AccountName, MaxPerm, MaxSpool, MaxTemp, CurrentPerm, CurrentSpool, CurrentPersistentSpool, CurrentTemp, PeakPerm, PeakSpool, PeakPersistentSpool, PeakTemp, MaxProfileSpool, MaxProfileTemp, TrustUserName, AppProxyUser, AllocatedPerm, AllocatedSpool, AllocatedTemp, PermSkew, SpoolSkew, TempSkew
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.DiskSpaceV.csv";

        public static enum Header {
            VProc, DatabaseName, AccountName, MaxPerm, MaxSpool, MaxTemp, CurrentPerm, CurrentSpool, CurrentPersistentSpool, CurrentTemp, PeakPerm, PeakSpool, PeakPersistentSpool, PeakTemp, MaxProfileSpool, MaxProfileTemp, TrustUserName, AppProxyUser, AllocatedPerm, AllocatedSpool, AllocatedTemp, PermSkew, SpoolSkew, TempSkew
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface ColumnsJQVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsJQV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface ColumnsJQVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsJQV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface PartitioningConstraintsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.PartitioningConstraintsV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface PartitioningConstraintsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.PartitioningConstraintsV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ParentsV.csv";

        public static enum Header {
            IndexId, IndexName, ChildDB, ChildTable, ChildKeyColumn, ParentDB, ParentTable, ParentKeyColumn, InconsistencyFlag, CreatorName, CreateTimeStamp
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ParentsV.csv";

        public static enum Header {
            IndexId, IndexName, ChildDB, ChildTable, ChildKeyColumn, ParentDB, ParentTable, ParentKeyColumn, InconsistencyFlag, CreatorName, CreateTimeStamp
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface AllTempTablesVXFormat {

        public static String ZIP_ENTRY_NAME = "dbc.AllTempTablesVX.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface AllTempTablesVXFormat {

        public static String ZIP_ENTRY_NAME = "dbc.AllTempTablesVX.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface ColumnsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface ColumnsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface TableTextVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TableTextV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface TableTextVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TableTextV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface TablesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TablesV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface TablesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TablesV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
public interface TeradataMetadataDumpFormat {

    public static final String FORMAT_NAME = "teradata.dump.zip";

    public static interface VersionFormat {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentQueryLogEnd.java`
#### Snippet
```java
public @interface RespectsArgumentQueryLogEnd {

    public static final String DESCRIPTION = "End date for query history to dump";

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
public interface TeradataMetadataDumpFormat {

    public static final String FORMAT_NAME = "teradata.dump.zip";

    public static interface VersionFormat {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentQueryLogEnd.java`
#### Snippet
```java
public @interface RespectsArgumentQueryLogEnd {

    public static final String DESCRIPTION = "End date for query history to dump";

}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
public interface TeradataMetadataDumpFormat {

    public static final String FORMAT_NAME = "teradata.dump.zip";

    public static interface VersionFormat {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentQueryLogEnd.java`
#### Snippet
```java
public @interface RespectsArgumentQueryLogEnd {

    public static final String DESCRIPTION = "End date for query history to dump";

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TablesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TablesV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TablesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TablesV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.RoleMembersV.csv";

        public static enum Header {
            RoleName, Grantor, Grantee, WhenGranted, DefaultRole, WithAdmin
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.RoleMembersV.csv";

        public static enum Header {
            RoleName, Grantor, Grantee, WhenGranted, DefaultRole, WithAdmin
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface ColumnsFormat {

        public static final String ZIP_ENTRY_NAME = "dbc.Columns.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface ColumnsFormat {

        public static final String ZIP_ENTRY_NAME = "dbc.Columns.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface All_RI_ParentsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ParentsV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface All_RI_ParentsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ParentsV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface StatsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.StatsV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface StatsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.StatsV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface RoleMembersVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.RoleMembersV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface RoleMembersVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.RoleMembersV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, TableName, ColumnName, FieldIdList, StatsName, ExpressionCount, StatsId, StatsType, StatsSource, ValidStats, DBSVersion, IndexNumber, SampleSignature, SampleSizePct, ThresholdSignature, MaxIntervals, MaxValueLength, RowCount, UniqueValueCount, PNullUniqueValueCount, NullCount, AllNullCount, HighModeFreq, PNullHighModeFreq, StatsSkipCount, CreateTimeStamp, LastCollectTimeStamp, LastAlterTimeStamp, BLCCompRatio
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, TableName, ColumnName, FieldIdList, StatsName, ExpressionCount, StatsId, StatsType, StatsSource, ValidStats, DBSVersion, IndexNumber, SampleSignature, SampleSizePct, ThresholdSignature, MaxIntervals, MaxValueLength, RowCount, UniqueValueCount, PNullUniqueValueCount, NullCount, AllNullCount, HighModeFreq, PNullHighModeFreq, StatsSkipCount, CreateTimeStamp, LastCollectTimeStamp, LastAlterTimeStamp, BLCCompRatio
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface DatabasesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.DatabasesV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface DatabasesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.DatabasesV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface ColumnsJQVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsJQV.csv";
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface ColumnsJQVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsJQV.csv";
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface ColumnsQVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsQV.csv";
    }

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface ColumnsQVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.ColumnsQV.csv";
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface All_RI_ParentsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ParentsV.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface All_RI_ParentsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ParentsV.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface IndicesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.IndicesV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface IndicesVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.IndicesV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface All_RI_ChildrenVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ChildrenV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface All_RI_ChildrenVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ChildrenV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsInput.java`
#### Snippet
```java
    public String defaultValue() default "";

    public int order() default Integer.MAX_VALUE;

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface RoleMembersVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.RoleMembersV.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface RoleMembersVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.RoleMembersV.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsInput.java`
#### Snippet
```java

    @Nonnull
    public String description();

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsInput.java`
#### Snippet
```java

    @Nonnull
    public String arg() default "";

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, TableName, ColumnName, ColumnFormat, ColumnTitle, SPParameterType, ColumnType, ColumnUDTName, ColumnLength, DefaultValue, Nullable, CommentString, DecimalTotalDigits, DecimalFractionalDigits, ColumnId, UpperCaseFlag, Compressible, CompressValue, ColumnConstraint, ConstraintCount, CreatorName, CreateTimeStamp, LastAlterName, LastAlterTimeStamp, CharType, IdColType, AccessCount, LastAccessTimeStamp, CompressValueList, TimeDimension, VTCheckType, TTCheckType, ConstraintId, ArrayColNumberOfDimensions, ArrayColScope, ArrayColElementType, ArrayColElementUdtName, PartitioningColumn, ColumnPartitionNumber, ColumnPartitionFormat, ColumnPartitionAC, PseudoUDTFieldId, PseudoUDTFieldType, StorageFormat, DatasetSchemaName, InlineLength, TSColumnType
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsInput.java`
#### Snippet
```java

    @Nonnull
    public String required() default "";
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsInput.java`
#### Snippet
```java

    @Nonnull
    public String defaultValue() default "";

    public int order() default Integer.MAX_VALUE;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, TableName, ColumnName, ColumnFormat, ColumnTitle, SPParameterType, ColumnType, ColumnUDTName, ColumnLength, DefaultValue, Nullable, CommentString, DecimalTotalDigits, DecimalFractionalDigits, ColumnId, UpperCaseFlag, Compressible, CompressValue, ColumnConstraint, ConstraintCount, CreatorName, CreateTimeStamp, LastAlterName, LastAlterTimeStamp, CharType, IdColType, AccessCount, LastAccessTimeStamp, CompressValueList, TimeDimension, VTCheckType, TTCheckType, ConstraintId, ArrayColNumberOfDimensions, ArrayColScope, ArrayColElementType, ArrayColElementUdtName, PartitioningColumn, ColumnPartitionNumber, ColumnPartitionFormat, ColumnPartitionAC, PseudoUDTFieldId, PseudoUDTFieldType, StorageFormat, DatasetSchemaName, InlineLength, TSColumnType
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsInput.java`
#### Snippet
```java

    @Nonnull
    public String env() default "";

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PartitioningConstraintsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.PartitioningConstraintsV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PartitioningConstraintsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.PartitioningConstraintsV.csv";

        // TD 16.20.32.09 - complete set.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.AllTempTablesVX.csv";

        public static enum Header {
            HostNo, SessionNo, UserName, B_DatabaseName, B_TableName, E_TableId
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.AllTempTablesVX.csv";

        public static enum Header {
            HostNo, SessionNo, UserName, B_DatabaseName, B_TableName, E_TableId
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ChildrenV.csv";

        public static enum Header {
            IndexId, IndexName, ChildDB, ChildTable, ChildKeyColumn, ParentDB, ParentTable, ParentKeyColumn, InconsistencyFlag, CreatorName, CreateTimeStamp
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.All_RI_ChildrenV.csv";

        public static enum Header {
            IndexId, IndexName, ChildDB, ChildTable, ChildKeyColumn, ParentDB, ParentTable, ParentKeyColumn, InconsistencyFlag, CreatorName, CreateTimeStamp
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, CreatorName, OwnerName, AccountName, ProtectionType, JournalFlag, PermSpace, SpoolSpace, TempSpace, CommentString, CreateTimeStamp, LastAlterName, LastAlterTimeStamp, DBKind, AccessCount, LastAccessTimeStamp,
            /** Not in earlier versions. */
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

        // TD 16.20.32.09 - complete set.
        public static enum Header {
            DatabaseName, CreatorName, OwnerName, AccountName, ProtectionType, JournalFlag, PermSpace, SpoolSpace, TempSpace, CommentString, CreateTimeStamp, LastAlterName, LastAlterTimeStamp, DBKind, AccessCount, LastAccessTimeStamp,
            /** Not in earlier versions. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.TableTextV.csv";

        public static enum Header {
            DataBaseName, TableName, TableKind, RequestText, LineNo
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static String ZIP_ENTRY_NAME = "dbc.TableTextV.csv";

        public static enum Header {
            DataBaseName, TableName, TableKind, RequestText, LineNo
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TableTextVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TableTextV.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static interface TableTextVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.TableTextV.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface FunctionsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.FunctionsV.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface FunctionsVFormat {

        public static String ZIP_ENTRY_NAME = "dbc.FunctionsV.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentQueryLogStart.java`
#### Snippet
```java
public @interface RespectsArgumentQueryLogStart {

    public static final String DESCRIPTION = "Start date for query history to dump";

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentQueryLogStart.java`
#### Snippet
```java
public @interface RespectsArgumentQueryLogStart {

    public static final String DESCRIPTION = "Start date for query history to dump";

}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentQueryLogStart.java`
#### Snippet
```java
public @interface RespectsArgumentQueryLogStart {

    public static final String DESCRIPTION = "Start date for query history to dump";

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsInputs.java`
#### Snippet
```java

    @Nonnull
    public RespectsInput[] value();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentSchemaPredicate.java`
#### Snippet
```java
public @interface RespectsArgumentSchemaPredicate {

    public static final String DESCRIPTION = "The list of schemas to dump, separated by commas.";

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentSchemaPredicate.java`
#### Snippet
```java
public @interface RespectsArgumentSchemaPredicate {

    public static final String DESCRIPTION = "The list of schemas to dump, separated by commas.";

}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentSchemaPredicate.java`
#### Snippet
```java
public @interface RespectsArgumentSchemaPredicate {

    public static final String DESCRIPTION = "The list of schemas to dump, separated by commas.";

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface PgViews {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_views_generic.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface PgViews {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_views_generic.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

        public static enum Header {

            username, userid, usecreatedb, usesuper, userepl, usebypassrls, passwd, valuntil, useconfig
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

        public static enum Header {

            username, userid, usecreatedb, usesuper, userepl, usebypassrls, passwd, valuntil, useconfig
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "pg_views_private.csv";

        public static enum Header {

            schemaname,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "pg_views_private.csv";

        public static enum Header {

            schemaname,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "is_columns_private.csv";

        public static enum Header {
            table_catalog,
            table_schema,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "is_columns_private.csv";

        public static enum Header {
            table_catalog,
            table_schema,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface InformationSchemaColumns {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "is_columns_generic.csv";
        public static final String ZIP_ENTRY_NAME = "is_columns_private.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface InformationSchemaColumns {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "is_columns_generic.csv";
        public static final String ZIP_ENTRY_NAME = "is_columns_private.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface InformationSchemaColumns {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "is_columns_generic.csv";
        public static final String ZIP_ENTRY_NAME = "is_columns_private.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface PgUser {

        public static final String ZIP_ENTRY_NAME = "pg_user.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface PgUser {

        public static final String ZIP_ENTRY_NAME = "pg_user.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_functions_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_functions_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_functions_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_functions_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_functions_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_functions_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgFunctions {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_functions_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_functions_private.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgFunctions {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_functions_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_functions_private.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgFunctions {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_functions_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_functions_private.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgUser {

        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgUser {

        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgUser {

        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_views_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_views_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_views_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_views_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_views_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_views_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgViews {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_views_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_views_private.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgViews {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_views_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_views_private.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgViews {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_views_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_views_private.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static final String FORMAT_NAME = "postgresql.dump.zip";

    public static interface InformationSchemaColumns {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "is_columns_generic.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static final String FORMAT_NAME = "postgresql.dump.zip";

    public static interface InformationSchemaColumns {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "is_columns_generic.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "is_columns_generic.csv";
        public static final String ZIP_ENTRY_NAME = "is_columns_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "is_columns_generic.csv";
        public static final String ZIP_ENTRY_NAME = "is_columns_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "is_columns_generic.csv";
        public static final String ZIP_ENTRY_NAME = "is_columns_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java

    // functions, functions-11, aggregates, aggregates-11
    public static interface PgFunctions {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_functions_generic.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java

    // functions, functions-11, aggregates, aggregates-11
    public static interface PgFunctions {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_functions_generic.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "pg_functions_private.csv";

        public static enum Header {
            Schema,
            Name,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "pg_functions_private.csv";

        public static enum Header {
            Schema,
            Name,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
public interface PostgresqlMetadataDumpFormat {

    public static final String FORMAT_NAME = "postgresql.dump.zip";

    public static interface InformationSchemaColumns {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
public interface PostgresqlMetadataDumpFormat {

    public static final String FORMAT_NAME = "postgresql.dump.zip";

    public static interface InformationSchemaColumns {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
public interface PostgresqlMetadataDumpFormat {

    public static final String FORMAT_NAME = "postgresql.dump.zip";

    public static interface InformationSchemaColumns {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentQueryLogDays.java`
#### Snippet
```java
public @interface RespectsArgumentQueryLogDays {

    public static final String DESCRIPTION = "The number of days of query history to dump.";

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentQueryLogDays.java`
#### Snippet
```java
public @interface RespectsArgumentQueryLogDays {

    public static final String DESCRIPTION = "The number of days of query history to dump.";

}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentQueryLogDays.java`
#### Snippet
```java
public @interface RespectsArgumentQueryLogDays {

    public static final String DESCRIPTION = "The number of days of query history to dump.";

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskSetState.java`
#### Snippet
```java

    @ThreadSafe
    public static class Impl implements TaskSetState {

        @GuardedBy("lock")
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskSetState.java`
#### Snippet
```java

    @ThreadSafe
    public static class Impl implements TaskSetState {

        @GuardedBy("lock")
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskSetState.java`
#### Snippet
```java

    @CheckForNull
    public <T> TaskResult<T> getTaskResult(@Nonnull Task<T> task);

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskSetState.java`
#### Snippet
```java

    @Nonnull
    default public TaskState getTaskState(@Nonnull Task<?> task) {
        TaskResult<?> result = getTaskResult(task);
        return (result == null) ? TaskState.NOT_STARTED : result.getState();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriverClass.java`
#### Snippet
```java
public @interface RespectsArgumentDriverClass {

    public static final String DESCRIPTION = "Optionally overrides the vendor-specified JDBC driver class name.";

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriverClass.java`
#### Snippet
```java
public @interface RespectsArgumentDriverClass {

    public static final String DESCRIPTION = "Optionally overrides the vendor-specified JDBC driver class name.";

}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriverClass.java`
#### Snippet
```java
public @interface RespectsArgumentDriverClass {

    public static final String DESCRIPTION = "Optionally overrides the vendor-specified JDBC driver class name.";

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleLogsDumpFormat.java`
#### Snippet
```java
public interface OracleLogsDumpFormat {

    public static final String FORMAT_NAME = "oracle.logs.zip";

    String ZIP_ENTRY_FILENAME = "query_history.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleLogsDumpFormat.java`
#### Snippet
```java
public interface OracleLogsDumpFormat {

    public static final String FORMAT_NAME = "oracle.logs.zip";

    String ZIP_ENTRY_FILENAME = "query_history.csv";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/OracleLogsDumpFormat.java`
#### Snippet
```java
public interface OracleLogsDumpFormat {

    public static final String FORMAT_NAME = "oracle.logs.zip";

    String ZIP_ENTRY_FILENAME = "query_history.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java

        @FunctionalInterface
        private static interface HiveMetastoreThriftClientProvider {
            HiveMetastoreThriftClient provide(@Nonnull String name, @Nonnull TProtocol protocol);
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
        }

        public static enum UnavailableClientVersionBehavior {
            FALLBACK,
            THROW
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/ConnectorProperty.java`
#### Snippet
```java

    @Nonnull
    public default String getName() {
        return StringUtils.EMPTY;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/ConnectorProperty.java`
#### Snippet
```java

    @Nonnull
    public default String getDescription() {
        return StringUtils.EMPTY;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/SqlServerMetadataDumpFormat.java`
#### Snippet
```java
public interface SqlServerMetadataDumpFormat {

    public static final String FORMAT_NAME = "sqlserver.dump.zip";

    interface SchemataFormat {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/SqlServerMetadataDumpFormat.java`
#### Snippet
```java
public interface SqlServerMetadataDumpFormat {

    public static final String FORMAT_NAME = "sqlserver.dump.zip";

    interface SchemataFormat {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/SqlServerMetadataDumpFormat.java`
#### Snippet
```java
public interface SqlServerMetadataDumpFormat {

    public static final String FORMAT_NAME = "sqlserver.dump.zip";

    interface SchemataFormat {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Database.java`
#### Snippet
```java

  @CheckForNull
  public Integer getOwnerType();

  @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Database.java`
#### Snippet
```java
public interface Database {
  @CheckForNull
  public String getName();

  @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Database.java`
#### Snippet
```java

  @CheckForNull
  public String getLocation();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Database.java`
#### Snippet
```java

  @CheckForNull
  public String getDescription();

  @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Database.java`
#### Snippet
```java

  @CheckForNull
  public String getOwner();

  @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Function.java`
#### Snippet
```java

    @CheckForNull
    public String getFunctionName();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Function.java`
#### Snippet
```java

    @CheckForNull
    public Integer getOwnerType();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Function.java`
#### Snippet
```java

    @CheckForNull
    public String getOwner();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Function.java`
#### Snippet
```java

    @CheckForNull
    public Integer getCreateTime();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Function.java`
#### Snippet
```java

    @CheckForNull
    public String getType();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Function.java`
#### Snippet
```java

    @CheckForNull
    public String getClassName();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Function.java`
#### Snippet
```java

    @CheckForNull
    public String getDatabaseName();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "svv_tables.csv";

        public static enum Header {
            table_catalog,
            table_schema,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "svv_tables.csv";

        public static enum Header {
            table_catalog,
            table_schema,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

    @Deprecated // Does not give information about column order. TODO: Use SVV_TABLE_INFO.
    public static interface PgTableDef {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_table_def_generic.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

    @Deprecated // Does not give information about column order. TODO: Use SVV_TABLE_INFO.
    public static interface PgTableDef {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_table_def_generic.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
public interface RedshiftMetadataDumpFormat extends PostgresqlMetadataDumpFormat {

    public static final String FORMAT_NAME = "redshift.dump.zip";

    /** This appears to be a superset of SVV_COLUMNS_EXTERNAL. */
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
public interface RedshiftMetadataDumpFormat extends PostgresqlMetadataDumpFormat {

    public static final String FORMAT_NAME = "redshift.dump.zip";

    /** This appears to be a superset of SVV_COLUMNS_EXTERNAL. */
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
public interface RedshiftMetadataDumpFormat extends PostgresqlMetadataDumpFormat {

    public static final String FORMAT_NAME = "redshift.dump.zip";

    /** This appears to be a superset of SVV_COLUMNS_EXTERNAL. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     * SVV_TABLE_INFO filters system tables and shows only user-defined tables.
     */
    public static interface SvvTableInfo {
        public static final String ZIP_ENTRY_NAME = "svv_table_info.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     * SVV_TABLE_INFO filters system tables and shows only user-defined tables.
     */
    public static interface SvvTableInfo {
        public static final String ZIP_ENTRY_NAME = "svv_table_info.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     * Added "Tbl" suffix to avoid name collision.
     */
    public static interface FunctionsTbl {
        public static final String ZIP_ENTRY_NAME = "functions.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     * Added "Tbl" suffix to avoid name collision.
     */
    public static interface FunctionsTbl {
        public static final String ZIP_ENTRY_NAME = "functions.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

    public static interface RedshiftEnvironmentFormat {
        public static final String ZIP_ENTRY_NAME = "redshift-environment.yaml";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

    public static interface RedshiftEnvironmentFormat {
        public static final String ZIP_ENTRY_NAME = "redshift-environment.yaml";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

    public static interface RedshiftEnvironmentFormat {
        public static final String ZIP_ENTRY_NAME = "redshift-environment.yaml";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface InformationSchemaColumns {

        public static final String ZIP_ENTRY_NAME_SYSTEM = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface InformationSchemaColumns {

        public static final String ZIP_ENTRY_NAME_SYSTEM = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "svv_columns.csv";

        public static enum Header {
            table_catalog,
            table_schema,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "svv_columns.csv";

        public static enum Header {
            table_catalog,
            table_schema,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

        public static enum Header {
            usename,
            usesysid,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

        public static enum Header {
            usename,
            usesysid,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

        public static enum Header {
            table_catalog,
            table_schema,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

        public static enum Header {
            table_catalog,
            table_schema,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface FunctionsTbl {
        public static final String ZIP_ENTRY_NAME = "functions.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface FunctionsTbl {
        public static final String ZIP_ENTRY_NAME = "functions.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface FunctionsTbl {
        public static final String ZIP_ENTRY_NAME = "functions.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static interface SvvColumnsFormat {

        public static final String ZIP_ENTRY_NAME = "svv_columns.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static interface SvvColumnsFormat {

        public static final String ZIP_ENTRY_NAME = "svv_columns.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static interface SvvColumnsFormat {

        public static final String ZIP_ENTRY_NAME = "svv_columns.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface SvvTableInfo {
        public static final String ZIP_ENTRY_NAME = "svv_table_info.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface SvvTableInfo {
        public static final String ZIP_ENTRY_NAME = "svv_table_info.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface SvvTableInfo {
        public static final String ZIP_ENTRY_NAME = "svv_table_info.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     * SVV_TABLES contains both local and external catalogs.
     */
    public static interface SvvTables {
        public static final String ZIP_ENTRY_NAME = "svv_tables.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     * SVV_TABLES contains both local and external catalogs.
     */
    public static interface SvvTables {
        public static final String ZIP_ENTRY_NAME = "svv_tables.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface SvvTables {
        public static final String ZIP_ENTRY_NAME = "svv_tables.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface SvvTables {
        public static final String ZIP_ENTRY_NAME = "svv_tables.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface SvvTables {
        public static final String ZIP_ENTRY_NAME = "svv_tables.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgTableDef {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_table_def_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_table_def_private.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgTableDef {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_table_def_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_table_def_private.csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static interface PgTableDef {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_table_def_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_table_def_private.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface RedshiftEnvironmentFormat {
        public static final String ZIP_ENTRY_NAME = "redshift-environment.yaml";

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    }

    public static interface RedshiftEnvironmentFormat {
        public static final String ZIP_ENTRY_NAME = "redshift-environment.yaml";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class Root {
            public String currentDatabase;
            public String redshiftVersion;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class Root {
            public String currentDatabase;
            public String redshiftVersion;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

    /** This appears to be a superset of SVV_COLUMNS_EXTERNAL. */
    public static interface SvvColumnsFormat {

        public static final String ZIP_ENTRY_NAME = "svv_columns.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

    /** This appears to be a superset of SVV_COLUMNS_EXTERNAL. */
    public static interface SvvColumnsFormat {

        public static final String ZIP_ENTRY_NAME = "svv_columns.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "pg_table_def_private.csv";

        public static enum Header {

            schemaname,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "pg_table_def_private.csv";

        public static enum Header {

            schemaname,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static interface InformationSchemaColumns {

        public static final String ZIP_ENTRY_NAME_SYSTEM = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
        public static final String ZIP_ENTRY_NAME = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static interface InformationSchemaColumns {

        public static final String ZIP_ENTRY_NAME_SYSTEM = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
        public static final String ZIP_ENTRY_NAME = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static interface InformationSchemaColumns {

        public static final String ZIP_ENTRY_NAME_SYSTEM = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
        public static final String ZIP_ENTRY_NAME = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface PgUser {
        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface PgUser {
        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     */
    public static interface PgUser {
        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
        public static final String ZIP_ENTRY_NAME = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
        public static final String ZIP_ENTRY_NAME = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
        public static final String ZIP_ENTRY_NAME = PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_table_def_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_table_def_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_table_def_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_table_def_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_table_def_generic.csv";
        public static final String ZIP_ENTRY_NAME = "pg_table_def_private.csv";

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     * Headers for results from pg_user table.
     */
    public static interface PgUser {
        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
     * Headers for results from pg_user table.
     */
    public static interface PgUser {
        public static final String ZIP_ENTRY_NAME = "pg_user.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "functions.csv";

        public static enum Header {
            schema,
            name,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "functions.csv";

        public static enum Header {
            schema,
            name,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "svv_table_info.csv";

        public static enum Header {
            database,
            schema,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

    @Nonnull
    public String getTargetPath();

    @Nonnull
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_NAME = "svv_table_info.csv";

        public static enum Header {
            database,
            schema,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

    @CheckForNull
    public T run(@Nonnull TaskRunContext context) throws Exception;

    // returns true if tasks handles the exception.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    }

    public static class AndCondition implements Condition {

        private final List<Condition> conditions;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    }

    public static class AndCondition implements Condition {

        private final List<Condition> conditions;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

        @Nonnull
        default public String toSkipReason() {
            return "[" + this + "] was not true";
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    }

    public static class StateCondition implements Condition {

        private final Task<?> task;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    }

    public static class StateCondition implements Condition {

        private final Task<?> task;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    public static interface Condition {

        public static final Condition @ArrayLen(0) [] EMPTY_ARRAY = new Condition[0];

        public boolean evaluate(@Nonnull TaskSetState state);
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    public static interface Condition {

        public static final Condition @ArrayLen(0) [] EMPTY_ARRAY = new Condition[0];

        public boolean evaluate(@Nonnull TaskSetState state);
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    public static interface Condition {

        public static final Condition @ArrayLen(0) [] EMPTY_ARRAY = new Condition[0];

        public boolean evaluate(@Nonnull TaskSetState state);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    String FORMAT_NAME = "redshift.logs.zip";

    public static final String ZIP_ENTRY_PREFIX_METRICS = "metrics_history_";
    public static final String ZIP_ENTRY_PREFIX_SCANS = "scan_history_";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    // returns true if tasks handles the exception.
    // so it's not sent to user's screen
    default public boolean handleException(Exception Fe) {
        return false;
    }
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    String FORMAT_NAME = "redshift.logs.zip";

    public static final String ZIP_ENTRY_PREFIX_METRICS = "metrics_history_";
    public static final String ZIP_ENTRY_PREFIX_SCANS = "scan_history_";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

    @Nonnull
    default public TaskCategory getCategory() {
        return TaskCategory.REQUIRED;
    }
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    String FORMAT_NAME = "redshift.logs.zip";

    public static final String ZIP_ENTRY_PREFIX_METRICS = "metrics_history_";
    public static final String ZIP_ENTRY_PREFIX_SCANS = "scan_history_";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

    @Nonnull
    default public String getName() {
        return getTargetPath();
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_PREFIX_METRICS = "metrics_history_";
    public static final String ZIP_ENTRY_PREFIX_SCANS = "scan_history_";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

    public static enum DdlHistory {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

    @Nonnull
    default public Condition[] getConditions() {
        return Condition.EMPTY_ARRAY;
    }
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_PREFIX_METRICS = "metrics_history_";
    public static final String ZIP_ENTRY_PREFIX_SCANS = "scan_history_";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

    public static enum DdlHistory {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
        public static final Condition @ArrayLen(0) [] EMPTY_ARRAY = new Condition[0];

        public boolean evaluate(@Nonnull TaskSetState state);

        @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
public interface Task<T> {

    public static interface Condition {

        public static final Condition @ArrayLen(0) [] EMPTY_ARRAY = new Condition[0];
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_PREFIX_METRICS = "metrics_history_";
    public static final String ZIP_ENTRY_PREFIX_SCANS = "scan_history_";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

    public static enum DdlHistory {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java

    public static final String ZIP_ENTRY_PREFIX_METRICS = "metrics_history_";
    public static final String ZIP_ENTRY_PREFIX_SCANS = "scan_history_";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java

    public static final String ZIP_ENTRY_PREFIX_METRICS = "metrics_history_";
    public static final String ZIP_ENTRY_PREFIX_SCANS = "scan_history_";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java

    public static final String ZIP_ENTRY_PREFIX_METRICS = "metrics_history_";
    public static final String ZIP_ENTRY_PREFIX_SCANS = "scan_history_";
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
public interface Task<T> {

    public static interface Condition {

        public static final Condition @ArrayLen(0) [] EMPTY_ARRAY = new Condition[0];
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

    public static enum DdlHistory {
        userid, starttime, endtime, label, xid, pid, sqltext;
        public static final String ZIP_ENTRY_PREFIX = "ddl_history_";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_SUFFIX = ".csv";

    public static enum DdlHistory {
        userid, starttime, endtime, label, xid, pid, sqltext;
        public static final String ZIP_ENTRY_PREFIX = "ddl_history_";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    public static interface SvlStatementText {

        public static enum Header {
            userid, xid, pid, label, starttime, endtime, sequence, type, text, qid;
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    public static interface SvlStatementText {

        public static enum Header {
            userid, xid, pid, label, starttime, endtime, sequence, type, text, qid;
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
     * delimiter as ',' addquotes escape allowoverwrite ;
     */
    public static interface SvlStatementText {

        public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
     * delimiter as ',' addquotes escape allowoverwrite ;
     */
    public static interface SvlStatementText {

        public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    }

    public static enum QueryHistory {
        queryid, xid, pid, userid, starttime, endtime, label, sqltext;

```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
    }

    public static enum QueryHistory {
        queryid, xid, pid, userid, starttime, endtime, label, sqltext;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentHostUnlessUrl.java`
#### Snippet
```java
public @interface RespectsArgumentHostUnlessUrl {

    public static final String DESCRIPTION = "The hostname of the database server.";

    // public static final String EXAMPLES[] = {};
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/VerticaMetadataDumpFormat.java`
#### Snippet
```java
public interface VerticaMetadataDumpFormat {

    public static final String FORMAT_NAME = "vertica.dump.zip";

    interface AllTablesFormat {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/VerticaMetadataDumpFormat.java`
#### Snippet
```java
public interface VerticaMetadataDumpFormat {

    public static final String FORMAT_NAME = "vertica.dump.zip";

    interface AllTablesFormat {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/VerticaMetadataDumpFormat.java`
#### Snippet
```java
public interface VerticaMetadataDumpFormat {

    public static final String FORMAT_NAME = "vertica.dump.zip";

    interface AllTablesFormat {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentHostUnlessUrl.java`
#### Snippet
```java
public @interface RespectsArgumentHostUnlessUrl {

    public static final String DESCRIPTION = "The hostname of the database server.";

    // public static final String EXAMPLES[] = {};
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentHostUnlessUrl.java`
#### Snippet
```java
public @interface RespectsArgumentHostUnlessUrl {

    public static final String DESCRIPTION = "The hostname of the database server.";

    // public static final String EXAMPLES[] = {};
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriver.java`
#### Snippet
```java
public @interface RespectsArgumentDriver {

    public static final String DESCRIPTION = "The vendor-supplied driver JARs to use for this connector.";

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriver.java`
#### Snippet
```java
public @interface RespectsArgumentDriver {

    public static final String DESCRIPTION = "The vendor-supplied driver JARs to use for this connector.";

}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriver.java`
#### Snippet
```java
public @interface RespectsArgumentDriver {

    public static final String DESCRIPTION = "The vendor-supplied driver JARs to use for this connector.";

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

    @Nonnull
    public String getName();

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

    @Nonnull
    public Handle open(@Nonnull ConnectorArguments arguments) throws Exception;

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

    @Nonnull
    default public Class<? extends Enum<? extends ConnectorProperty>> getConnectorProperties() {
        return DefaultProperties.class;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

    @Nonnull
    public void addTasksTo(@Nonnull List<? super Task<?>> out, @Nonnull ConnectorArguments arguments) throws Exception;

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

    // Empty
    public enum DefaultProperties implements ConnectorProperty {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

    @Nonnull
    public String getDefaultFileName();

    @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/LogsConnector.java`
#### Snippet
```java

    @Override
    default public String getDefaultFileName() {
        return "dwh-migration-" + getName() + "-logs.zip";
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandle.java`
#### Snippet
```java
    /** Returns a ByteSink on the temporary file. */
    @Nonnull
    public ByteSink asTemporaryByteSink() throws IOException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandle.java`
#### Snippet
```java
    /** Returns a CharSink on the target file. */
    @Nonnull
    default public CharSink asCharSink(@Nonnull Charset charset) throws IOException {
        return asByteSink().asCharSink(charset);
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandle.java`
#### Snippet
```java
public interface OutputHandle {

    public boolean exists() throws IOException;

    /** Returns a ByteSink on the target file. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandle.java`
#### Snippet
```java
     * risk committing bad data.
     */
    public void commit() throws IOException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandle.java`
#### Snippet
```java
    /** Returns a ByteSink on the target file. */
    @Nonnull
    public ByteSink asByteSink() throws IOException;

    /** Returns a CharSink on the target file. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-bigquery/src/main/java/com/google/edwmigration/dumper/plugin/ext/bigquery/BigQueryCallable.java`
#### Snippet
```java

    @Nonnull
    public T call() throws BigQueryException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
    public static final String FORMAT_NAME = "netezza.dump.zip";

    public interface Views {

        public static final String ZIP_ENTRY_SUFFIX = "/nz.v_view.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
    }

    public interface DistMapFormat {

        public static final String ZIP_ENTRY_SUFFIX = "/nz.v_table_dist_map.csv";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_SUFFIX = "/nz.v_table_dist_map.csv";

        public static enum DistMapHeader {
            OBJID,
            TABLENAME,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
        public static final String ZIP_ENTRY_SUFFIX = "/nz.v_table_dist_map.csv";

        public static enum DistMapHeader {
            OBJID,
            TABLENAME,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
    public interface DistMapFormat {

        public static final String ZIP_ENTRY_SUFFIX = "/nz.v_table_dist_map.csv";

        public static enum DistMapHeader {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
    public interface DistMapFormat {

        public static final String ZIP_ENTRY_SUFFIX = "/nz.v_table_dist_map.csv";

        public static enum DistMapHeader {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
    public interface DistMapFormat {

        public static final String ZIP_ENTRY_SUFFIX = "/nz.v_table_dist_map.csv";

        public static enum DistMapHeader {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
    public interface Views {

        public static final String ZIP_ENTRY_SUFFIX = "/nz.v_view.csv";

        // Not sure of a docref for this.
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
    public interface Views {

        public static final String ZIP_ENTRY_SUFFIX = "/nz.v_view.csv";

        // Not sure of a docref for this.
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
    public interface Views {

        public static final String ZIP_ENTRY_SUFFIX = "/nz.v_view.csv";

        // Not sure of a docref for this.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
public interface NetezzaMetadataDumpFormat {

    public static final String FORMAT_NAME = "netezza.dump.zip";

    public interface Views {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
public interface NetezzaMetadataDumpFormat {

    public static final String FORMAT_NAME = "netezza.dump.zip";

    public interface Views {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java
public interface NetezzaMetadataDumpFormat {

    public static final String FORMAT_NAME = "netezza.dump.zip";

    public interface Views {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java

        // Not sure of a docref for this.
        public static enum Header {
            DATABASE,
            SCHEMA,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/NetezzaMetadataDumpFormat.java`
#### Snippet
```java

        // Not sure of a docref for this.
        public static enum Header {
            DATABASE,
            SCHEMA,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Partition.java`
#### Snippet
```java

    @CheckForNull
    public Boolean isCompressed();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Partition.java`
#### Snippet
```java

    @CheckForNull
    public Long getTotalSize();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Partition.java`
#### Snippet
```java

    @CheckForNull
    public Integer getLastAccessTime();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Partition.java`
#### Snippet
```java

    @CheckForNull
    public Long getRawSize();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Partition.java`
#### Snippet
```java

    @CheckForNull
    public Integer getFilesCount();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Partition.java`
#### Snippet
```java

    @CheckForNull
    public Long getRowsCount();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Partition.java`
#### Snippet
```java

    @CheckForNull
    public Integer getCreateTime();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Partition.java`
#### Snippet
```java

    @CheckForNull
    public String getLocation();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Partition.java`
#### Snippet
```java

    @Nonnull
    public String getPartitionName();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Partition.java`
#### Snippet
```java

    @CheckForNull
    public Integer getLastDdlTime();

    @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class Root {

            public String format;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class Root {

            public String format;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

    public static interface CompilerWorksDumpMetadataTaskFormat {

        public static final String ZIP_ENTRY_NAME = "compilerworks-metadata.yaml";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

    public static interface CompilerWorksDumpMetadataTaskFormat {

        public static final String ZIP_ENTRY_NAME = "compilerworks-metadata.yaml";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
            .disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
            .disable(YAMLGenerator.Feature.SPLIT_LINES);
    public static final ObjectMapper MAPPER = new ObjectMapper(FACTORY)
            // .registerModule(new GuavaModule())
            // .registerModule(new JavaTimeModule())
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
            .disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
            .disable(YAMLGenerator.Feature.SPLIT_LINES);
    public static final ObjectMapper MAPPER = new ObjectMapper(FACTORY)
            // .registerModule(new GuavaModule())
            // .registerModule(new JavaTimeModule())
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
            .disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
            .disable(YAMLGenerator.Feature.SPLIT_LINES);
    public static final ObjectMapper MAPPER = new ObjectMapper(FACTORY)
            // .registerModule(new GuavaModule())
            // .registerModule(new JavaTimeModule())
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class Product {

            public String version;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        public static class Product {

            public String version;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
    public static interface CompilerWorksDumpMetadataTaskFormat {

        public static final String ZIP_ENTRY_NAME = "compilerworks-metadata.yaml";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
    public static interface CompilerWorksDumpMetadataTaskFormat {

        public static final String ZIP_ENTRY_NAME = "compilerworks-metadata.yaml";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
    public static interface CompilerWorksDumpMetadataTaskFormat {

        public static final String ZIP_ENTRY_NAME = "compilerworks-metadata.yaml";

        @JsonIgnoreProperties(ignoreUnknown = true)
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
public interface CoreMetadataDumpFormat {

    public static final YAMLFactory FACTORY = new YAMLFactory()
            .enable(YAMLGenerator.Feature.LITERAL_BLOCK_STYLE)
            // .enable(YAMLGenerator.Feature.MINIMIZE_QUOTES)
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
public interface CoreMetadataDumpFormat {

    public static final YAMLFactory FACTORY = new YAMLFactory()
            .enable(YAMLGenerator.Feature.LITERAL_BLOCK_STYLE)
            // .enable(YAMLGenerator.Feature.MINIMIZE_QUOTES)
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
public interface CoreMetadataDumpFormat {

    public static final YAMLFactory FACTORY = new YAMLFactory()
            .enable(YAMLGenerator.Feature.LITERAL_BLOCK_STYLE)
            // .enable(YAMLGenerator.Feature.MINIMIZE_QUOTES)
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleMetadataConnector.java`
#### Snippet
```java
    }

    private static interface GroupTask extends Task<Void> {

        @CheckForNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleMetadataConnector.java`
#### Snippet
```java

        @CheckForNull
        public Exception getException();
    }

```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `HELP_INFO` may be 'static'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(ConnectorArguments.class);

    private final String HELP_INFO
            = "The CompilerWorks Metadata Exporters address three goals:\n"
            + "\n"
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `BigQueryClientUtils` has only 'static' members, and lacks a 'private' constructor
in `dumper/lib-ext-bigquery/src/main/java/com/google/edwmigration/dumper/plugin/ext/bigquery/BigQueryClientUtils.java`
#### Snippet
```java
 * @author shevek
 */
public class BigQueryClientUtils {

    @SuppressWarnings("UnusedVariable")
```

### UtilityClassWithoutPrivateConstructor
Class `MetastoreConstants` has only 'static' members, and lacks a 'private' constructor
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/MetastoreConstants.java`
#### Snippet
```java
package com.google.edwmigration.dumper.ext.hive.metastore;

public final class MetastoreConstants {
  public static final String DDL_TIME = "transient_lastDdlTime";

```

### UtilityClassWithoutPrivateConstructor
Class `TestUtils` has only 'static' members, and lacks a 'private' constructor
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/test/TestUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class TestUtils {

    private static final Logger LOG = LoggerFactory.getLogger(TestUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `JsonResponseFile` has only 'static' members, and lacks a 'private' constructor
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java
 * The output can be given to joptsimple.
 */
public class JsonResponseFile {

    private static final Logger LOG = LoggerFactory.getLogger(JsonResponseFile.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ZipFileUtils` has only 'static' members, and lacks a 'private' constructor
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/util/ZipFileUtils.java`
#### Snippet
```java
 * @author shevek
 */
public class ZipFileUtils {

    @SuppressWarnings("UnusedVariable")
```

### UtilityClassWithoutPrivateConstructor
Class `BigQueryAccessor` has only 'static' members, and lacks a 'private' constructor
in `dumper/lib-ext-bigquery/src/main/java/com/google/cloud/bigquery/BigQueryAccessor.java`
#### Snippet
```java
 * @author shevek
 */
public class BigQueryAccessor {

    @SuppressWarnings("UnusedVariable")
```

## RuleId[ruleID=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`for` statement does not loop
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
                @Override
                public boolean hasNext() {
                    for (;;) {
                        while (!currentPageIterator.hasNext()) {
                            try {
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
        DAY,
        MONTH,
        YEAR;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java

        public static enum Header {
            userid, xid, pid, query, label, starttime, endtime, sequence, text;
        }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
            database, query, xid, userid, queue_start_time, exec_start_time,
            service_class, slots, queue_elapsed, exec_elapsed, wlm_total_elapsed,
            commit_queue_elapsed, commit_exec_time;
        }
    }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java

        public static enum Header {
            userid, xid, pid, label, starttime, endtime, sequence, text;
        }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
            userid, xid, task, query, service_class, slot_count, service_class_start_time,
            queue_start_time, queue_end_time, total_queue_time, exec_start_time, exec_end_time,
            total_exec_time, service_class_end_time, final_state, query_priority;
        }
    }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
            max_cpu_time, cpu_time, max_blocks_read, blocks_read, max_run_time, run_time,
            max_blocks_to_disk, blocks_to_disk, step, max_query_scan_size, query_scan_size,
            query_priority, query_queue_time, service_class_name;

        }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
        public static enum Header {
            DatabaseName, TableName, /** New. */
            ColumnId, ColumnName, ColumnType;
        }
    }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskCategory.java`
#### Snippet
```java
    INFORMATIONAL,
    OPTIONAL,
    REQUIRED;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
            Kind,
            /** Not in functions. */
            Description;
        }
    }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java

        public static enum Header {
            userid, xid, pid, label, starttime, endtime, sequence, type, text, qid;
        }
    }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskState.java`
#### Snippet
```java
    SUCCEEDED,
    FAILED,
    SKIPPED;
}

```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/AbstractOracleConnector.java`
#### Snippet
```java
        //LOG.info("URL IS " + url);
        Driver driver = newDriver(arguments.getDriverPaths(), "oracle.jdbc.OracleDriver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return new JdbcHandle(dataSource);
    }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/AbstractOracleConnector.java`
#### Snippet
```java
        //LOG.info("URL IS " + url);
        Driver driver = newDriver(arguments.getDriverPaths(), "oracle.jdbc.OracleDriver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return new JdbcHandle(dataSource);
    }
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/vertica/AbstractVerticaConnector.java`
#### Snippet
```java

        Driver driver = newDriver(arguments.getDriverPaths(), "com.vertica.jdbc.Driver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return new JdbcHandle(dataSource);
    }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/vertica/AbstractVerticaConnector.java`
#### Snippet
```java

        Driver driver = newDriver(arguments.getDriverPaths(), "com.vertica.jdbc.Driver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return new JdbcHandle(dataSource);
    }
```

### DataFlowIssue
Method invocation `getNextPage` may produce `NullPointerException`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
                        while (!currentPageIterator.hasNext()) {
                            try {
                                currentPage = runWithBackOff(() -> currentPage.getNextPage());
                            } catch (IOException e) {
                                throw new BigQueryException(e);
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/mysql/AbstractMysqlConnector.java`
#### Snippet
```java

        Driver driver = newDriver(arguments.getDriverPaths(), "com.mysql.jdbc.Driver", "org.mariadb.jdbc.Driver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return new JdbcHandle(dataSource);
    }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/mysql/AbstractMysqlConnector.java`
#### Snippet
```java

        Driver driver = newDriver(arguments.getDriverPaths(), "com.mysql.jdbc.Driver", "org.mariadb.jdbc.Driver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return new JdbcHandle(dataSource);
    }
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/Teradata14LogsConnector.java`
#### Snippet
```java
        String queryTable = DEF_QUERY_TABLE;
        List<String> alternates = arguments.getQueryLogAlternates();
        if (!alternates.isEmpty()) {
            if (alternates.size() != 2)
                throw new MetadataDumperUsageException("Alternate query log tables must be given as a pair; you specified: " + alternates);
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/sqlserver/SqlServerMetadataConnector.java`
#### Snippet
```java
        // LOG.info("Connecting to URL {}", url);
        Driver driver = newDriver(arguments.getDriverPaths(), "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return new JdbcHandle(dataSource);
    }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/sqlserver/SqlServerMetadataConnector.java`
#### Snippet
```java
        // LOG.info("Connecting to URL {}", url);
        Driver driver = newDriver(arguments.getDriverPaths(), "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return new JdbcHandle(dataSource);
    }
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/AbstractRedshiftConnector.java`
#### Snippet
```java
        //   LogLevel 0/1
        LOG.trace("URI is " + url);
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());

        return JdbcHandle.newPooledJdbcHandle(dataSource, arguments.getThreadPoolSize());
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/AbstractRedshiftConnector.java`
#### Snippet
```java
        //   LogLevel 0/1
        LOG.trace("URI is " + url);
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());

        return JdbcHandle.newPooledJdbcHandle(dataSource, arguments.getThreadPoolSize());
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/netezza/NetezzaMetadataConnector.java`
#### Snippet
```java

        Driver driver = newDriver(arguments.getDriverPaths(), "org.netezza.Driver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return new JdbcHandle(dataSource);
    }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/netezza/NetezzaMetadataConnector.java`
#### Snippet
```java

        Driver driver = newDriver(arguments.getDriverPaths(), "org.netezza.Driver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return new JdbcHandle(dataSource);
    }
```

### DataFlowIssue
Expression `getJdbcTemplate().getDataSource()` might evaluate to null but is returned by the method declared as @Nonnull
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/handle/JdbcHandle.java`
#### Snippet
```java
    @Nonnull
    public DataSource getDataSource() {
        return getJdbcTemplate().getDataSource();
    }

```

### DataFlowIssue
Variable is already assigned to this value
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java
        for (int j = 0; hasResponseFile && j < args.length; j++)
            if (args[j].charAt(0) == '@')
                hasResponseFile = true;
        if (!hasResponseFile)
            return args;
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/AbstractSnowflakeConnector.java`
#### Snippet
```java

        Driver driver = newDriver(arguments.getDriverPaths(), "net.snowflake.client.jdbc.SnowflakeDriver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return checkCurrentDatabaseExists(arguments, new JdbcHandle(dataSource));
    }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/AbstractSnowflakeConnector.java`
#### Snippet
```java

        Driver driver = newDriver(arguments.getDriverPaths(), "net.snowflake.client.jdbc.SnowflakeDriver");
        DataSource dataSource = new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
        return checkCurrentDatabaseExists(arguments, new JdbcHandle(dataSource));
    }
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataLogsConnector.java`
#### Snippet
```java
        String queryTable = DEF_QUERY_TABLE;
        List<String> alternates = arguments.getQueryLogAlternates();
        if (!alternates.isEmpty()) {
            if (alternates.size() != 2)
                throw new MetadataDumperUsageException("Alternate query log tables must be given as a pair; you specified: " + alternates);
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getQueryLogEarliestTimestamp' is still used
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
    @CheckForNull
    @Deprecated
    public String getQueryLogEarliestTimestamp() {
        return getOptions().valueOf(optionQueryLogEarliestTimestamp);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'PgTableDef' is still used
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

    @Deprecated // Does not give information about column order. TODO: Use SVV_TABLE_INFO.
    public static interface PgTableDef {

        public static final String ZIP_ENTRY_NAME_SYSTEM = "pg_table_def_generic.csv";
```

### DeprecatedIsStillUsed
Deprecated member 'ArgumentsTask' is still used
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/ArgumentsTask.java`
#### Snippet
```java
 */
@Deprecated // Use DumpMetadataTask
public class ArgumentsTask extends AbstractTask<Void> {

    @Nonnull
```

### DeprecatedIsStillUsed
Deprecated member 'VersionTask' is still used
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/VersionTask.java`
#### Snippet
```java
 */
@Deprecated // Use DumpMetadataTask
public class VersionTask extends AbstractTask<Void> {

    public VersionTask(String targetPath) {
```

## RuleId[ruleID=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `v`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/Teradata14LogsConnector.java`
#### Snippet
```java

    private static List<String> enumNames(String prefix, Class< ? extends Enum<?>> en) {
        Enum<?> v[] = en.getEnumConstants();
        List<String> ret = new ArrayList<>(v.length);
        for (Enum<?> h : v)
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/generic/GenericConnector.java`
#### Snippet
```java
    private void checkArguments(@Nonnull ConnectorArguments arguments) throws MetadataDumperUsageException {
        // interefers with testing, no harm in calling two times anyway
        // if (argumentsProcessed)
        //    return;
        // argumentsProcessed = true;
```

### CommentedOutCode
Commented out code (2 lines)
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskGroup.java`
#### Snippet
```java
    public void addTask(Task<?> task) {
        // Checking for conditions would need some ordering of tasks execution or waiting on {@link TaskSetState#getTaskResult}
        // Preconditions.checkState(task.getConditions().length == 0, "Tasks in a parallel task should not have conditions");
        // Preconditions.checkState(task instanceof AbstractJdbcSelectTask || task instanceof FormatTask, "Parallel task only supports JdbcSelectTask and FormatTask sub tasks. Trying to add %s.", task.getClass().getSimpleName());
        tasks.add(task);
```

### CommentedOutCode
Commented out code (2 lines)
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/postgresql/PostgresqlMetadataConnector.java`
#### Snippet
```java
        out.add(new JdbcSelectTask(InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM, "select * from information_schema.columns where table_schema in " + PG_SCHEMAS));
        out.add(new JdbcSelectTask(InformationSchemaColumns.ZIP_ENTRY_NAME, "select * from information_schema.columns where table_schema not in " + PG_SCHEMAS));
        // out.add(new JdbcSelectTask("pg_table_def_generic.csv", "select * from pg_table_def where schemaname in " + PG_SCHEMAS));
        // out.add(new JdbcSelectTask("pg_table_def_private.csv", "select * from pg_table_def where schemaname not in " + PG_SCHEMAS));
        out.add(new JdbcSelectTask(PgViews.ZIP_ENTRY_NAME_SYSTEM, "select * from pg_views where schemaname in " + PG_SCHEMAS));
```

### CommentedOutCode
Commented out code (9 lines)
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/MysqlMetadataDumpFormat.java`
#### Snippet
```java
    public static final String FORMAT_NAME = "mysql.dump.zip";

    /*
    interface DatabasesFormat {

```

### CommentedOutCode
Commented out code (2 lines)
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
    // pa.add_argument('auth', help="extra key=value params for connector",
    // nargs=argparse.REMAINDER, type=lambda x: x.split("="))
    // private final OptionSpec<String> optionVerbose = parser.accepts("verbose", "enable verbose info").withOptionalArg().forHelp();
    // final OptionSpec<Boolean> optionAppend = parser.accepts("append", "accumulate meta from multiple runs in one directory").withRequiredArg().ofType(Boolean.class).defaultsTo(false).forHelp();
    private final OptionSpec<Void> optionDryrun = parser.acceptsAll(Arrays.asList("dry-run", "n"), "Show export actions without executing.").forHelp();
```

### CommentedOutCode
Commented out code (2 lines)
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataMetadataConnector.java`
#### Snippet
```java

        // This is theoretically more reliable than ColumnsV, but if we are bandwidth limited, we should risk taking ColumnsV only.
        // out.add(new JdbcSelectTask(ColumnsFormat.ZIP_ENTRY_NAME, // Was: teradata.columns.csv
        // "SELECT \"DatabaseName\", \"TableName\", \"ColumnId\", \"ColumnName\", \"ColumnType\" FROM DBC.Columns" + whereDatabaseNameClause + " ;"));
        out.add(new TeradataJdbcSelectTask(DatabasesVFormat.ZIP_ENTRY_NAME,
```

### CommentedOutCode
Commented out code (4 lines)
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/AbstractRedshiftConnector.java`
#### Snippet
```java
        Driver driver = newDriver(arguments.getDriverPaths(), "com.amazon.redshift.jdbc.Driver", "org.postgresql.Driver");

//        LOG.debug("DRIVER IS " + driver.getClass().getCanonicalName());
//        LOG.debug("DRIVER CAN RS " + driver.acceptsURL("jdbc:redshift://host/db"));
//        LOG.debug("DRIVER CAN IAM " + driver.acceptsURL("jdbc:redshift:iam://host/db"));
```

### CommentedOutCode
Commented out code (5 lines)
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/AbstractJdbcConnector.java`
#### Snippet
```java
        }

        /*
        @Override
        protected Connection getConnectionFromDriver(Properties props) throws SQLException {
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
        @Override
        public String toSkipReason() {
            return "all of " + Lists.transform(conditions, t -> t.toSkipReason());
        }

```

## RuleId[ruleID=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/DefaultArguments.java`
#### Snippet
```java
                //https://github.com/jopt-simple/jopt-simple/blob/master/src/main/java/joptsimple/BuiltinHelpFormatter.java#L91
                Comparator<OptionDescriptor> comparator
                        = (first, second)
                        -> first.options().iterator().next().compareTo(second.options().iterator().next());
                Set<OptionDescriptor> sorted = new TreeSet<>(comparator);

```

## RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/utils/SqlBuilder.java`
#### Snippet
```java
            StringBuilder buf = new StringBuilder();
            buf.append(id).append(" IN (");
            Joiner.on(", ").appendTo(buf, Lists.transform(vals, s -> "'" + s + "'"));
            buf.append(")");
            whereClause.add(buf.toString());
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
        @Override
        public String toSkipReason() {
            return "all of " + Lists.transform(conditions, t -> t.toSkipReason());
        }

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dumper/lib-ext-bigquery/src/main/java/com/google/cloud/bigquery/BigQueryAccessor.java`
#### Snippet
```java
        String cursor = result.x();
        Iterable<Job> jobs
                = Iterables.transform(result.y(),
                        new Function<com.google.api.services.bigquery.model.Job, Job>() {
                    @Override
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`buf.length() > 0` can be replaced with '!buf.isEmpty()'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/AbstractRedshiftConnector.java`
#### Snippet
```java
        Joiner.on(" AND ").appendTo(buf, clauseList);
        for (String clause : clauseArray) {
            if (buf.length() > 0)
                buf.append(" AND ");
            buf.append(clause);
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
                if (TaskCategory.REQUIRED.equals(task.getCategory()) && TaskState.FAILED.equals(result.getState()))
                    requiredTasksNotSucceeded++;
                System.out.println(buf.toString());
            }

```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Page`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
        }

        private void forEachDataset(@Nonnull BigQuery bigQuery, @Nonnull BigQueryConsumer<? super Dataset> consumer, @Nonnull BigQueryCallable<Page<Dataset>> callable) throws BigQueryException, IOException, InterruptedException {
            Page<Dataset> datasets = runWithBackOff(callable);
            // LOG.debug("List is " + datasets.getValues());
```

### BoundedWildcard
Can generalize to `? extends T`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/ParallelTaskGroup.java`
#### Snippet
```java
        private final CSVPrinter printer;

        public TaskRunner(TaskRunContext context, Task<T> task, CSVPrinter printer) {
            this.context = context;
            this.task = task;
```

### BoundedWildcard
Can generalize to `? super String`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java
        private final String value;

        private ResponseFileEntity(Map<String, ResponseFileEntity> fields, String value) {
            this.fields = fields;
            this.value = value;
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `default public`
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentProgressMonitor.java`
#### Snippet
```java

    /** Counts 1. */
    default public void count() {
        count(1);
    }
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentProgressMonitor.java`
#### Snippet
```java

    @Nonnull
    default public ConcurrentProgressMonitor withBlockSize(@Nonnegative int blockSize) {
        return this;
    }
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java
     * Returns the number counted so far, including this count.
     */
    default public long count() {
        return count(1);
    }
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java
    /** Returns the current count. */
    @Nonnegative
    default public long getCount() {
        return count(0);
    }
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java

    @Nonnull
    default public BlockProgressMonitor withBlockSize(@Nonnegative int blockSize) {
        return new BlockProgressMonitor(this, blockSize);
    }
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
    }

    public static abstract class AbstractBigQueryMetadataTask extends AbstractBigQueryTask {

        private final List<? extends String> databaseList;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
    }

    public static abstract class AbstractBigQueryTask extends AbstractTask<Void> {

        @Nonnull
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/MetadataConnector.java`
#### Snippet
```java

    @Override
    default public String getDefaultFileName() {
        return "dwh-migration-" + getName() + "-metadata.zip";
    }
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
    }

    protected static abstract class AbstractHiveTask extends AbstractTask<Void> {

        public AbstractHiveTask(String targetPath) {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/HiveMetadataConnector.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(HiveMetadataConnector.class);

    private static abstract class AbstractHiveMetadataTask extends AbstractHiveTask {

        private final Predicate<String> schemaPredicate;
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskSetState.java`
#### Snippet
```java

    @Nonnull
    default public TaskState getTaskState(@Nonnull Task<?> task) {
        TaskResult<?> result = getTaskResult(task);
        return (result == null) ? TaskState.NOT_STARTED : result.getState();
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

        @Nonnull
        default public String toSkipReason() {
            return "[" + this + "] was not true";
        }
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    // returns true if tasks handles the exception.
    // so it's not sent to user's screen
    default public boolean handleException(Exception Fe) {
        return false;
    }
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

    @Nonnull
    default public TaskCategory getCategory() {
        return TaskCategory.REQUIRED;
    }
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

    @Nonnull
    default public String getName() {
        return getTargetPath();
    }
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

    @Nonnull
    default public Condition[] getConditions() {
        return Condition.EMPTY_ARRAY;
    }
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

    @Nonnull
    default public Class<? extends Enum<? extends ConnectorProperty>> getConnectorProperties() {
        return DefaultProperties.class;
    }
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/LogsConnector.java`
#### Snippet
```java

    @Override
    default public String getDefaultFileName() {
        return "dwh-migration-" + getName() + "-logs.zip";
    }
```

### MissortedModifiers
Missorted modifiers `default public`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandle.java`
#### Snippet
```java
    /** Returns a CharSink on the target file. */
    @Nonnull
    default public CharSink asCharSink(@Nonnull Charset charset) throws IOException {
        return asByteSink().asCharSink(charset);
    }
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
Overridden methods are not annotated
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java
    public static final int MEMDIV = 1024 * 1024;

    @Nonnull
    default public BlockProgressMonitor withBlockSize(@Nonnegative int blockSize) {
        return new BlockProgressMonitor(this, blockSize);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/DefaultArguments.java`
#### Snippet
```java

    // Any description starting with UNDOCUMENTED: is ... undocumented
    protected void printHelpOn(@Nonnull PrintStream out, OptionSet o) throws IOException {

        BuiltinHelpFormatter helpFormatter = new BuiltinHelpFormatter(120, 4) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
            private static class Itr<T> extends UnmodifiableIterator<T> {

                @CheckForNull
                private Page<T> currentPage;
                @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Integer bucketsCount;
            @CheckForNull
            public Boolean isCompressed;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
                @CheckForNull
                private Page<T> currentPage;
                @Nonnull
                private Iterator<T> currentPageIterator;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String viewText;
            @CheckForNull
            public String location;
            @CheckForNull
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java

        @ForOverride
        protected abstract void run(@Nonnull Writer writer, @Nonnull BigQuery bigQuery) throws Exception;

        @Override
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java

        @ForOverride
        protected abstract void run(@Nonnull Writer writer, @Nonnull BigQuery bigQuery) throws Exception;

        @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String name;
            @CheckForNull
            public String type;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public List<PartitionKeyMetadata> partitionKeys;
            @CheckForNull
            public List<PartitionMetadata> partitions;
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            }

            @CheckForNull
            public String schemaName;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String type;
            @CheckForNull
            public Integer createTime;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public List<FieldMetadata> fields;
            @CheckForNull
            public List<PartitionKeyMetadata> partitionKeys;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long totalSize;
            @CheckForNull
            public Long rawSize;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Integer lastAccessTime;
            @CheckForNull
            public String owner;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Integer lastDdlTime;
            @CheckForNull
            public Long totalSize;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String owner;
            @CheckForNull
            public String viewText;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String schemaName;
            @CheckForNull
            public String name;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long rowsCount;
            @CheckForNull
            public Integer filesCount;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Integer filesCount;
            @CheckForNull
            public Integer retention;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Integer createTime;
            @CheckForNull
            public Integer lastAccessTime;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Integer retention;
            @CheckForNull
            public Integer bucketsCount;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            public Boolean isCompressed;

            @CheckForNull
            public List<FieldMetadata> fields;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long rawSize;
            @CheckForNull
            public Long rowsCount;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String location;
            @CheckForNull
            public Integer lastDdlTime;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public List<Field> schema;
            @CheckForNull
            public String timePartitioningField;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            }

            @CheckForNull
            public String project;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            }

            @CheckForNull
            public String viewQuery;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java

            @JsonProperty
            @CheckForNull
            public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;
            @JsonProperty
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String tableType;
            @CheckForNull
            public List<Field> schema;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String timePartitioningField;
            @CheckForNull
            public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;
            public boolean timePartitioningRequired;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            public String viewQuery;
            /** In milliseconds, since the epoch. */
            @CheckForNull
            public Long creationTime;
            /** In milliseconds, since the epoch. Null means the table does not expire. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String project;
            @CheckForNull
            public String dataset;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String timePartitioningField;
            @CheckForNull
            public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;
            public boolean timePartitioningRequired;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String dataset;
            @CheckForNull
            public String table;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String table;
            @CheckForNull
            public String friendlyName;
            // TABLE, VIEW, EXTERNAL, (MODEL?)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            public Long creationTime;
            /** In milliseconds, since the epoch. Null means the table does not expire. */
            @CheckForNull
            public Long expirationTime;
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;
            public boolean timePartitioningRequired;
            @CheckForNull
            public String viewQuery;
            /** In milliseconds, since the epoch. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String viewQuery;
            @CheckForNull
            public String timePartitioningField;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
            public String friendlyName;
            // TABLE, VIEW, EXTERNAL, (MODEL?)
            @CheckForNull
            public String tableType;
            @CheckForNull
```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandleFactory.java`
#### Snippet
```java
public interface OutputHandleFactory {

    @Nonnull
    public OutputHandle newOutputFileHandle(@Nonnull String targetPath);
}
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandleFactory.java`
#### Snippet
```java

    @Nonnull
    public OutputHandle newOutputFileHandle(@Nonnull String targetPath);
}

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeLogsConnector.java`
#### Snippet
```java

    @ForOverride
    protected String newQueryFormat(@Nonnull ConnectorArguments arguments) throws MetadataDumperUsageException {
        // Docref: https://docs.snowflake.net/manuals/sql-reference/functions/query_history.html
        // Per the docref, Snowflake only retains/returns seven trailing days of logs.
```

### NullableProblems
Primitive type members cannot be annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

    @Nonnull
    private static String repeat(@Nonnull char c, @Nonnegative int n) {
        char[] out = new char[n];
        Arrays.fill(out, c);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeMetadataConnector.java`
#### Snippet
```java
    /** Adds the INFORMATION_SCHEMA task, with a fallback to the ACCOUNT_USAGE task. */
    @ForOverride
    protected void addSqlTasks(@Nonnull List<? super Task<?>> out, @Nonnull Class<? extends Enum<?>> header, @Nonnull String format, @Nonnull TaskVariant is_task, @Nonnull TaskVariant au_task) {
        Task<?> t0 = new JdbcSelectTask(is_task.zipEntryName, String.format(format, is_task.schemaName, is_task.whereClause))
                .withHeaderClass(header);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeMetadataConnector.java`
#### Snippet
```java
    /** Adds the INFORMATION_SCHEMA task, with a fallback to the ACCOUNT_USAGE task. */
    @ForOverride
    protected void addSqlTasks(@Nonnull List<? super Task<?>> out, @Nonnull Class<? extends Enum<?>> header, @Nonnull String format, @Nonnull TaskVariant is_task, @Nonnull TaskVariant au_task) {
        Task<?> t0 = new JdbcSelectTask(is_task.zipEntryName, String.format(format, is_task.schemaName, is_task.whereClause))
                .withHeaderClass(header);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeMetadataConnector.java`
#### Snippet
```java
    /** Adds the INFORMATION_SCHEMA task, with a fallback to the ACCOUNT_USAGE task. */
    @ForOverride
    protected void addSqlTasks(@Nonnull List<? super Task<?>> out, @Nonnull Class<? extends Enum<?>> header, @Nonnull String format, @Nonnull TaskVariant is_task, @Nonnull TaskVariant au_task) {
        Task<?> t0 = new JdbcSelectTask(is_task.zipEntryName, String.format(format, is_task.schemaName, is_task.whereClause))
                .withHeaderClass(header);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeMetadataConnector.java`
#### Snippet
```java
    /** Adds the INFORMATION_SCHEMA task, with a fallback to the ACCOUNT_USAGE task. */
    @ForOverride
    protected void addSqlTasks(@Nonnull List<? super Task<?>> out, @Nonnull Class<? extends Enum<?>> header, @Nonnull String format, @Nonnull TaskVariant is_task, @Nonnull TaskVariant au_task) {
        Task<?> t0 = new JdbcSelectTask(is_task.zipEntryName, String.format(format, is_task.schemaName, is_task.whereClause))
                .withHeaderClass(header);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeMetadataConnector.java`
#### Snippet
```java
    /** Adds the INFORMATION_SCHEMA task, with a fallback to the ACCOUNT_USAGE task. */
    @ForOverride
    protected void addSqlTasks(@Nonnull List<? super Task<?>> out, @Nonnull Class<? extends Enum<?>> header, @Nonnull String format, @Nonnull TaskVariant is_task, @Nonnull TaskVariant au_task) {
        Task<?> t0 = new JdbcSelectTask(is_task.zipEntryName, String.format(format, is_task.schemaName, is_task.whereClause))
                .withHeaderClass(header);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskGroup.java`
#### Snippet
```java
    }

    protected void doRun(@Nonnull TaskRunContext context, @Nonnull CSVPrinter printer, @Nonnull Handle handle) throws Exception {
        for (Task<?> task : tasks) {
            context.runChildTask(task);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskGroup.java`
#### Snippet
```java
    }

    protected void doRun(@Nonnull TaskRunContext context, @Nonnull CSVPrinter printer, @Nonnull Handle handle) throws Exception {
        for (Task<?> task : tasks) {
            context.runChildTask(task);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskGroup.java`
#### Snippet
```java
    }

    protected void doRun(@Nonnull TaskRunContext context, @Nonnull CSVPrinter printer, @Nonnull Handle handle) throws Exception {
        for (Task<?> task : tasks) {
            context.runChildTask(task);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractTask.java`
#### Snippet
```java
    @CheckForNull
    // @VisibleForTesting @ForOverride
    protected abstract T doRun(TaskRunContext context, @Nonnull ByteSink sink, @Nonnull Handle handle) throws Exception;

    @Override
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractTask.java`
#### Snippet
```java
    @CheckForNull
    // @VisibleForTesting @ForOverride
    protected abstract T doRun(TaskRunContext context, @Nonnull ByteSink sink, @Nonnull Handle handle) throws Exception;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient_v2_3_6.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(HiveMetastoreThriftClient_v2_3_6.class);

    @Nonnull
    private final com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.v2_3_6.ThriftHiveMetastore.Client client;

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java

    @CheckForNull
    protected abstract T doInConnection(@Nonnull TaskRunContext context, @Nonnull JdbcHandle jdbcHandle, @Nonnull ByteSink sink, @Nonnull Connection connection) throws SQLException;

    @Override
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java

    @CheckForNull
    protected abstract T doInConnection(@Nonnull TaskRunContext context, @Nonnull JdbcHandle jdbcHandle, @Nonnull ByteSink sink, @Nonnull Connection connection) throws SQLException;

    @Override
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java

    @CheckForNull
    protected abstract T doInConnection(@Nonnull TaskRunContext context, @Nonnull JdbcHandle jdbcHandle, @Nonnull ByteSink sink, @Nonnull Connection connection) throws SQLException;

    @Override
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java

    @CheckForNull
    protected abstract T doInConnection(@Nonnull TaskRunContext context, @Nonnull JdbcHandle jdbcHandle, @Nonnull ByteSink sink, @Nonnull Connection connection) throws SQLException;

    @Override
```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
    }

    @Nonnull
    protected CSVFormat newCsvFormat(@Nonnull ResultSet rs) throws SQLException {
        CSVFormat format = FORMAT;
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java

    @Nonnull
    protected CSVFormat newCsvFormat(@Nonnull ResultSet rs) throws SQLException {
        CSVFormat format = FORMAT;
        Class<? extends Enum<?>> headerClass = getHeaderClass();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(AbstractJdbcTask.class);

    @CheckForNull
    private Class<? extends Enum<?>> headerClass;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
        @Nonnull
        private final String name;
        @Nonnull
        private final ThreadLocal<? extends HiveMetastoreThriftClient> threadLocalThriftClient;
        @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
        @Nonnull
        private final ExecutorService executorService;
        @Nonnull
        private final Object lock = new Object();
        @GuardedBy("lock")
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
        private final Object lock = new Object();
        @GuardedBy("lock")
        @Nonnull
        private final List<@NonNull HiveMetastoreThriftClient> builtClients = new ArrayList<>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
        @Nonnull
        private final ThreadLocal<? extends HiveMetastoreThriftClient> threadLocalThriftClient;
        @Nonnull
        private final ExecutorManager executorManager;
        @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
    protected static class ThriftClientHandle extends AbstractHandle {

        @Nonnull
        private final HiveMetastoreThriftClient.Builder thriftClientBuilder;
        @Nonnegative
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
        @Nonnull
        private final ExecutorManager executorManager;
        @Nonnull
        private final ExecutorService executorService;
        @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
        }

        @Nonnull
        private final String name;
        @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/test/TestUtils.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(TestUtils.class);

    @Nonnull
    private static final String TEST_OUTPUTS_DIR = "build" + File.separator + "test-outputs";

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/DumpMetadataTask.java`
#### Snippet
```java
public class DumpMetadataTask extends AbstractTask<Void> implements CoreMetadataDumpFormat.CompilerWorksDumpMetadataTaskFormat {

    @Nonnull
    private final ConnectorArguments arguments;
    private final String format;
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/JdbcSelectTask.java`
#### Snippet
```java

    @Override
    protected Void doInConnection(@Nonnull TaskRunContext context, @Nonnull JdbcHandle jdbcHandle, @Nonnull ByteSink sink, @Nonnull Connection connection) throws SQLException {
        ResultSetExtractor<Void> rse = newCsvResultSetExtractor(sink, -1);
        return doSelect(connection, rse, sql);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/JdbcSelectTask.java`
#### Snippet
```java

    @Override
    protected Void doInConnection(@Nonnull TaskRunContext context, @Nonnull JdbcHandle jdbcHandle, @Nonnull ByteSink sink, @Nonnull Connection connection) throws SQLException {
        ResultSetExtractor<Void> rse = newCsvResultSetExtractor(sink, -1);
        return doSelect(connection, rse, sql);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/JdbcSelectTask.java`
#### Snippet
```java

    @Override
    protected Void doInConnection(@Nonnull TaskRunContext context, @Nonnull JdbcHandle jdbcHandle, @Nonnull ByteSink sink, @Nonnull Connection connection) throws SQLException {
        ResultSetExtractor<Void> rse = newCsvResultSetExtractor(sink, -1);
        return doSelect(connection, rse, sql);
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/JdbcSelectTask.java`
#### Snippet
```java

    @Override
    protected Void doInConnection(@Nonnull TaskRunContext context, @Nonnull JdbcHandle jdbcHandle, @Nonnull ByteSink sink, @Nonnull Connection connection) throws SQLException {
        ResultSetExtractor<Void> rse = newCsvResultSetExtractor(sink, -1);
        return doSelect(connection, rse, sql);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/JdbcSelectTask.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(JdbcSelectTask.class);

    @Nonnull
    private final String sql;

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java

    @Nonnull
    public abstract Database getDatabase(@Nonnull String databaseName) throws Exception;

    @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
    }

    @Nonnull
    private final String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
        @Nonnegative
        private int port;
        @Nonnull
        private UnavailableClientVersionBehavior unavailableClientBehavior = UnavailableClientVersionBehavior.FALLBACK;
        private boolean debug = false;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
        }

        @Nonnull
        private final String requestedVersionString;
        @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
        @Nonnull
        private String name = "unnamed-thrift-client";
        @Nonnull
        private String host = "localhost";
        @Nonnegative
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
        @Nonnull
        private final String requestedVersionString;
        @Nonnull
        private String name = "unnamed-thrift-client";
        @Nonnull
```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskRunContext.java`
#### Snippet
```java
    }

    @Nonnull
    public abstract TaskState getTaskState(@Nonnull Task<?> task);

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskRunContext.java`
#### Snippet
```java

    @Nonnull
    public abstract TaskState getTaskState(@Nonnull Task<?> task);

    // Only used by ParallelTaskGroup at the moment.
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskRunContext.java`
#### Snippet
```java

    /** nothrow */
    public abstract <T> T runChildTask(@Nonnull Task<T> task) throws MetadataDumperUsageException;
}

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/UUIDGenerator.java`
#### Snippet
```java
        return data;
    }
    @Nonnull
    private final Ticker ticker;
    private final byte[] mac = getMac();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Map<String, String> labels;
            @CheckForNull
            public String userEmail;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String project;
            @CheckForNull
            public String job;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String createDisposition;
            @CheckForNull
            public String writeDisposition;
            // Where the data is loaded.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String dataset;
            @CheckForNull
            public String table;
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String userEmail;
            @CheckForNull
            public JobStatus jobStatus;
            /** In milliseconds since epoch. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String createDisposition;
            @CheckForNull
            public String writeDisposition;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long totalBytesBilled;
            @CheckForNull
            public Long totalBytesProcessed;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            public TableId destinationTable;

            @CheckForNull
            public LoadStatistics statistics;
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

            // What were the statistics
            @CheckForNull
            public QueryStatistics statistics;
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long dmlAffectedRowCount;
            @CheckForNull
            public Long totalPartitionsProcessed;
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

            /** The project in which the job was executed. */
            @CheckForNull
            public String project;
            /** The default dataset in which the job was executed. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public TableId destinationTable;
            @CheckForNull
            public String createDisposition;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long inputBytes;
            @CheckForNull
            public Long inputFiles;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String userEmail;
            @CheckForNull
            public String query;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            public String project;
            /** The default dataset in which the job was executed. */
            @CheckForNull
            public String defaultDataset;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            public String message;
            /** From JobStatus.BigQueryError. */
            @CheckForNull
            public String reason;
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            public String writeDisposition;
            // Where the data is loaded.
            @CheckForNull
            public TableId destinationTable;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            public Long startTime;
            /** In milliseconds since epoch. */
            @CheckForNull
            public Long endTime;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long badRecords;
            @CheckForNull
            public Long inputBytes;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String project;
            @CheckForNull
            public String dataset;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        class LoadStatistics {
            @CheckForNull
            public Long badRecords;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Integer billingTier;
            @CheckForNull
            public Boolean cacheHit;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long endTime;
            @CheckForNull
            public CopyJobConfiguration copyJobConfiguration;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String sourceFormat;
            @CheckForNull
            public String createDisposition;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public List<String> sourceUris;
            @CheckForNull
            public String sourceFormat;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long inputFiles;
            @CheckForNull
            public Long outputBytes;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long totalBytesProcessed;
            @CheckForNull
            public Long totalSlotMilliseconds;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long totalSlotMilliseconds;
            @CheckForNull
            public Long dmlAffectedRowCount;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

            /** From JobStatus.BigQueryError. */
            @CheckForNull
            public String message;
            /** From JobStatus.BigQueryError. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long estimatedBytesProcessed;
            @CheckForNull
            public Long totalBytesBilled;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public LoadJobConfiguration loadJobConfiguration;
            @CheckForNull
            public QueryJobConfiguration queryJobConfiguration;
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
        @JsonInclude(JsonInclude.Include.NON_ABSENT)
        class LoadJobConfiguration {
            @CheckForNull
            public List<String> sourceUris;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
        class TableId {

            @CheckForNull
            public String project;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Boolean cacheHit;
            @CheckForNull
            public Long estimatedBytesProcessed;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public ExtractJobConfiguration extractJobConfiguration;
            @CheckForNull
            public LoadJobConfiguration loadJobConfiguration;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            public JobStatus jobStatus;
            /** In milliseconds since epoch. */
            @CheckForNull
            public Long startTime;
            /** In milliseconds since epoch. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            public String defaultDataset;

            @CheckForNull
            public String userEmail;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

            // Where the data is written.
            @CheckForNull
            public TableId destinationTable;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public String job;
            @CheckForNull
            public Map<String, String> labels;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
        class QueryStatistics {

            @CheckForNull
            public Integer billingTier;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public Long outputBytes;
            @CheckForNull
            public Long outputRows;
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
            @CheckForNull
            public CopyJobConfiguration copyJobConfiguration;
            @CheckForNull
            public ExtractJobConfiguration extractJobConfiguration;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
        class Job {

            @CheckForNull
            public String project;
            @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/ArgumentsTask.java`
#### Snippet
```java
public class ArgumentsTask extends AbstractTask<Void> {

    @Nonnull
    private final ConnectorArguments arguments;

```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    }

    @Nonnull
    public String getTargetPath();

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

    @CheckForNull
    public T run(@Nonnull TaskRunContext context) throws Exception;

    // returns true if tasks handles the exception.
```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
        public boolean evaluate(@Nonnull TaskSetState state);

        @Nonnull
        default public String toSkipReason() {
            return "[" + this + "] was not true";
```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    }

    @Nonnull
    default public TaskCategory getCategory() {
        return TaskCategory.REQUIRED;
```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    public String getTargetPath();

    @Nonnull
    default public Condition[] getConditions() {
        return Condition.EMPTY_ARRAY;
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
        public static final Condition @ArrayLen(0) [] EMPTY_ARRAY = new Condition[0];

        public boolean evaluate(@Nonnull TaskSetState state);

        @Nonnull
```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java
    }

    @Nonnull
    public String getName();

```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java
    public void addTasksTo(@Nonnull List<? super Task<?>> out, @Nonnull ConnectorArguments arguments) throws Exception;

    @Nonnull
    public Handle open(@Nonnull ConnectorArguments arguments) throws Exception;

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

    @Nonnull
    public Handle open(@Nonnull ConnectorArguments arguments) throws Exception;

    @Nonnull
```

### NullableProblems
Primitive type members cannot be annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java
    public String getDefaultFileName();

    @Nonnull
    public void addTasksTo(@Nonnull List<? super Task<?>> out, @Nonnull ConnectorArguments arguments) throws Exception;

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

    @Nonnull
    public void addTasksTo(@Nonnull List<? super Task<?>> out, @Nonnull ConnectorArguments arguments) throws Exception;

    @Nonnull
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

    @Nonnull
    public void addTasksTo(@Nonnull List<? super Task<?>> out, @Nonnull ConnectorArguments arguments) throws Exception;

    @Nonnull
```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java
    public String getName();

    @Nonnull
    public String getDefaultFileName();

```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandle.java`
#### Snippet
```java

    /** Returns a ByteSink on the temporary file. */
    @Nonnull
    public ByteSink asTemporaryByteSink() throws IOException;

```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandle.java`
#### Snippet
```java

    /** Returns a ByteSink on the target file. */
    @Nonnull
    public ByteSink asByteSink() throws IOException;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient_Superset.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(HiveMetastoreThriftClient_Superset.class);

    @Nonnull
    private final com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset.ThriftHiveMetastore.Client client;

```

## RuleId[ruleID=UnusedLabel]
### UnusedLabel
Unused label `TASK`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
                    }
                };
                TASK:
                for (Task<?> task : tasks) {
                    runTask(runContext, state, task);
```

### UnusedLabel
Unused label `CHECK`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
    private <T> T runTask(@Nonnull TaskRunContext context, @Nonnull TaskSetState.Impl state, Task<T> task) throws MetadataDumperUsageException {
        try {
            CHECK:
            {
                TaskState ts = state.getTaskState(task);
```

### UnusedLabel
Unused label `PRECONDITION`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
            }

            PRECONDITION:
            for (Task.Condition condition : task.getConditions()) {
                if (!condition.evaluate(state)) {
```

### UnusedLabel
Unused label `RUN`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
            }

            RUN:
            {
                T value = task.run(context);
```

### UnusedLabel
Unused label `DESTINATION`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryLogsConnector.java`
#### Snippet
```java
            outConfiguration.query = queryJobConfiguration.getQuery();

            DESTINATION:
            {
                outConfiguration.createDisposition = getEnumName(queryJobConfiguration.getCreateDisposition());
```

### UnusedLabel
Unused label `STATISTICS`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryLogsConnector.java`
#### Snippet
```java
            }

            STATISTICS:
            {
                QueryHistoryJson.QueryStatistics outStatistics = new QueryHistoryJson.QueryStatistics();
```

### UnusedLabel
Unused label `DESTINATION`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryLogsConnector.java`
#### Snippet
```java
            outConfiguration.sourceFormat = loadConfiguration.getFormat();

            DESTINATION:
            {
                outConfiguration.createDisposition = getEnumName(loadConfiguration.getCreateDisposition());
```

### UnusedLabel
Unused label `STATISTICS`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryLogsConnector.java`
#### Snippet
```java
            }

            STATISTICS:
            {
                QueryHistoryJson.LoadStatistics outStatistics = new QueryHistoryJson.LoadStatistics();
```

### UnusedLabel
Unused label `PREPARE`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
            LOG.debug("Preparing statement...");

            PREPARE:
            {
                Stopwatch stopwatch = Stopwatch.createStarted();
```

### UnusedLabel
Unused label `EXECUTE`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
            }

            EXECUTE:
            {
                // debug(statement);
```

### UnusedLabel
Unused label `ROOT`
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/util/ZipFileUtils.java`
#### Snippet
```java
        Preconditions.checkNotNull(name, "ZipEntryName was null.");

        ROOT:
        {
            ZipArchiveEntry entry = zip.getEntry(name);
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumperUsageException.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public MetadataDumperUsageException(@Nonnull String msg) {
        this(msg, Collections.emptyList());
    }
```

## RuleId[ruleID=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java
        boolean hasResponseFile = true;
        for (int j = 0; hasResponseFile && j < args.length; j++)
            if (args[j].charAt(0) == '@')
                hasResponseFile = true;
        if (!hasResponseFile)
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
                            throw new IllegalStateException("Cannot overwrite existing non-file with file.");
                        if (!arguments.isOutputContinue())
                            outputFile.delete();    // It's a simple file, and we were asked to overwrite it.
                    } else {
                        Files.createParentDirs(outputFile);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
                    } else {
                        // LOG.debug("Not a zip file: " + outputFile);
                        outputFile.mkdirs();
                        if (!outputFile.isDirectory())
                            throw new IOException("Unable to create directory " + outputFile);
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeLogsConnector.java`
#### Snippet
```java

        final int daysToExport = arguments.getQueryLogDays(7);
        if (daysToExport <= 0)
            throw new MetadataDumperUsageException("At least one day of query logs should be exported; you specified: " + daysToExport);
        LOG.info("Log entries within the last {} days will be exported in increments of 1 hour.", daysToExport);
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/Teradata14LogsConnector.java`
#### Snippet
```java

        final int daysToExport = arguments.getQueryLogDays(7);
        if (daysToExport <= 0)
            throw new MetadataDumperUsageException("At least one day of query logs should be exported; you specified: " + daysToExport);

```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/ZonedIntervalIterable.java`
#### Snippet
```java

        final int daysToExport = arguments.getQueryLogDays(7);
        if (daysToExport <= 0)
            throw new MetadataDumperUsageException("At least one day of query logs should be exported; you specified: " + daysToExport);

```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
        Integer out = getQueryLogDays();
        if (out != null)
            return out.intValue();
        return defaultQueryLogDays;
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
        Integer customPort = getPort();
        if (customPort != null)
            return customPort.intValue();
        return defaultPort;
    }
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/DefaultArguments.java`
#### Snippet
```java
        OptionSet o = parser.parse(args);
        if (o.has(helpOption)) {
            printHelpOn(System.err, o);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/DefaultArguments.java`
#### Snippet
```java
        }
        if (o.has(versionOption)) {
            System.err.println(new ProductMetadata().getModule(PRODUCT_GROUP + ":" + PRODUCT_CORE_MODULE));
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
        if (arguments.isDryRun()) {
            String title = "Dry run: Printing task list for " + connector.getName();
            System.out.println(title);
            System.out.println(repeat('=', title.length()));
            System.out.println("Writing to " + outputFile);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
            String title = "Dry run: Printing task list for " + connector.getName();
            System.out.println(title);
            System.out.println(repeat('=', title.length()));
            System.out.println("Writing to " + outputFile);
            for (Task<?> task : tasks) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
            System.out.println(title);
            System.out.println(repeat('=', title.length()));
            System.out.println("Writing to " + outputFile);
            for (Task<?> task : tasks) {
                print(task, 1);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

            int requiredTasksNotSucceeded = 0;
            System.out.println(
                    "**********************************************************\n"
                    + "* Task Summary:"
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
                if (TaskCategory.REQUIRED.equals(task.getCategory()) && TaskState.FAILED.equals(result.getState()))
                    requiredTasksNotSucceeded++;
                System.out.println(buf.toString());
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

            if (connector instanceof MetadataConnector) {
                System.out.println(
                        "**********************************************************\n"
                        + "* Metadata has been saved to " + outputFile + "\n"
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
                );
            } else if (connector instanceof LogsConnector) {
                System.out.println(
                        "**********************************************************\n"
                        + "* Logs have been saved to " + outputFile + "\n"
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

            if (requiredTasksNotSucceeded > 0) {
                System.out.println(
                        "* ERROR: " + requiredTasksNotSucceeded + " required task[s] failed.\n"
                        + "* Output, including debugging information, has been saved to " + outputFile + "\n"
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

    private void print(@Nonnull Task<?> task, int indent) {
        System.out.println(StringUtils.repeat("  ", indent) + task);
        if (task instanceof TaskGroup) {
            for (Task<?> subtask : ((TaskGroup) task).getTasks())
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `QueryLogsTask` is the same as one of its superclass' names
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryLogsConnector.java`
#### Snippet
```java
    private static final boolean DEBUG = false;

    public static class QueryLogsTask extends AbstractBigQueryTask implements BigQueryLogsDumpFormat.QueryLogsTask {

        private final ConnectorArguments arguments;
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/RedshiftRawLogsConnector.java`
#### Snippet
```java
        // LOG.info("Exporting query log for " + intervals);
        for (ZonedInterval interval : intervals) {
            String query = queryTemplate.replace("##",
                    newWhereClause(whereClauses,
                            String.format("%s >= TIMESTAMP '%s'", startField, SQL_FORMAT.format(interval.getStart())),
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/generic/GenericConnector.java`
#### Snippet
```java
            for (ZonedInterval interval : intervals) {
                String finalQuery = this.query
                        .replace("{period-start}", "'" + SQL_FORMAT.format(interval.getStart()) + "'")
                        .replace("{period-end}", "'" + SQL_FORMAT.format(interval.getEndInclusive()) + "'");
                String finalFile = this.entryName
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/generic/GenericConnector.java`
#### Snippet
```java
                String finalQuery = this.query
                        .replace("{period-start}", "'" + SQL_FORMAT.format(interval.getStart()) + "'")
                        .replace("{period-end}", "'" + SQL_FORMAT.format(interval.getEndInclusive()) + "'");
                String finalFile = this.entryName
                        .replace("{period}", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(interval.getStartUTC()));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/generic/GenericConnector.java`
#### Snippet
```java
                        .replace("{period-end}", "'" + SQL_FORMAT.format(interval.getEndInclusive()) + "'");
                String finalFile = this.entryName
                        .replace("{period}", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(interval.getStartUTC()));
                out.add(new JdbcSelectTask(finalFile, finalQuery));
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
        @Override
        public String toString() {
            return "\n    If " + taskState.toString() + (" Then\n  " + task.toString()).replaceAll("\n", "\n    ");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/RedshiftLogsConnector.java`
#### Snippet
```java
        LOG.info("Exporting query log for " + intervals);
        for (ZonedInterval interval : intervals) {
            String query = queryTemplate.replace("##",
                    newWhereClause(whereClauses,
                            String.format("%s >= CAST('%s' AS TIMESTAMP)", startField, SQL_FORMAT.format(interval.getStart())),
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.google.common.io.ByteSink;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java

import com.google.auto.service.AutoService;
import com.google.common.io.ByteSink;
import java.io.IOException;
import java.io.InputStream;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import com.google.auto.service.AutoService;
import com.google.common.io.ByteSink;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import com.google.common.io.ByteSink;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
```

### UNUSED_IMPORT
Unused import `import java.io.StringWriter;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
```

### UNUSED_IMPORT
Unused import `import java.io.Writer;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.sql.Clob;
```

### UNUSED_IMPORT
Unused import `import java.nio.charset.StandardCharsets;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.sql.Clob;
import java.sql.ResultSet;
```

### UNUSED_IMPORT
Unused import `import java.sql.Clob;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.sql.Clob;
import java.sql.ResultSet;
import java.sql.SQLException;
```

### UNUSED_IMPORT
Unused import `import java.sql.ResultSet;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;
import java.sql.Clob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.sql.SQLException;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import java.sql.Clob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.csv.CSVFormat;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import java.util.List;
import javax.annotation.Nonnull;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.io.IOUtils;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.csv.CSVPrinter;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import javax.annotation.Nonnull;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.io.IOUtils;
import com.google.edwmigration.dumper.application.dumper.ConnectorArguments;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.io.IOUtils;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.io.IOUtils;
import com.google.edwmigration.dumper.application.dumper.ConnectorArguments;
import com.google.edwmigration.dumper.application.dumper.connector.Connector;
```

### UNUSED_IMPORT
Unused import `import com.google.edwmigration.dumper.plugin.ext.jdk.progress.RecordProgressMonitor;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import com.google.edwmigration.dumper.application.dumper.task.Task;
import com.google.edwmigration.dumper.plugin.ext.jdk.annotation.Description;
import com.google.edwmigration.dumper.plugin.ext.jdk.progress.RecordProgressMonitor;
import com.google.edwmigration.dumper.plugin.lib.dumper.spi.OracleLogsDumpFormat;
import org.springframework.dao.DataAccessException;
```

### UNUSED_IMPORT
Unused import `import org.springframework.dao.DataAccessException;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import com.google.edwmigration.dumper.plugin.ext.jdk.progress.RecordProgressMonitor;
import com.google.edwmigration.dumper.plugin.lib.dumper.spi.OracleLogsDumpFormat;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

```

### UNUSED_IMPORT
Unused import `import org.springframework.jdbc.core.ResultSetExtractor;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleLogsConnector.java`
#### Snippet
```java
import com.google.edwmigration.dumper.plugin.lib.dumper.spi.OracleLogsDumpFormat;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

@AutoService({Connector.class, LogsConnector.class})
```

### UNUSED_IMPORT
Unused import `import com.google.edwmigration.dumper.plugin.ext.jdk.progress.RecordProgressMonitor;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataLogsConnector.java`
#### Snippet
```java
import com.google.common.io.ByteSink;
import com.google.edwmigration.dumper.application.dumper.annotations.RespectsArgumentAssessment;
import com.google.edwmigration.dumper.plugin.ext.jdk.progress.RecordProgressMonitor;
import com.google.errorprone.annotations.ForOverride;
import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataLogsConnector.java`
#### Snippet
```java
import com.google.edwmigration.dumper.plugin.ext.jdk.progress.RecordProgressMonitor;
import com.google.errorprone.annotations.ForOverride;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
```

### UNUSED_IMPORT
Unused import `import java.io.Writer;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataLogsConnector.java`
#### Snippet
```java
import com.google.errorprone.annotations.ForOverride;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
```

### UNUSED_IMPORT
Unused import `import java.nio.charset.StandardCharsets;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataLogsConnector.java`
#### Snippet
```java
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.csv.CSVFormat;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataLogsConnector.java`
#### Snippet
```java
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.lang3.StringUtils;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.csv.CSVPrinter;`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataLogsConnector.java`
#### Snippet
```java
import javax.annotation.Nonnull;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.lang3.StringUtils;
import com.google.edwmigration.dumper.application.dumper.ConnectorArguments;
```

### UNUSED_IMPORT
Unused import `import javax.annotation.Nonnull;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
import java.util.List;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
```

### UNUSED_IMPORT
Unused import `import java.io.Closeable;`
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
import com.google.common.collect.ImmutableMap;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`url = url + database` could be simplified to 'url += database'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/vertica/AbstractVerticaConnector.java`
#### Snippet
```java
            url = "jdbc:vertica://" + host + ":" + port + "/";
            if (database != null)
                url = url + database;
        }

```

### ReplaceAssignmentWithOperatorAssignment
`url = url + database` could be simplified to 'url += database'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/postgresql/AbstractPostgresqlConnector.java`
#### Snippet
```java
            url = "jdbc:postgresql://" + host + ":" + port + "/";
            if (database != null)
                url = url + database;
        }

```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/RecordProgressMonitor.java`
#### Snippet
```java
    @Override
    public long count(int delta) {
        long ret = (count += delta);
        long currSeconds = stopwatch.elapsed(TimeUnit.SECONDS);
        if (count >= nextCount && currSeconds >= nextMinSeconds) {
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractOracleConnector()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/AbstractOracleConnector.java`
#### Snippet
```java
    public static final int OPT_PORT_DEFAULT = 1521;

    public AbstractOracleConnector(@Nonnull String name) {
        super(name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractVerticaConnector()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/vertica/AbstractVerticaConnector.java`
#### Snippet
```java
    public static final int OPT_PORT_DEFAULT = 5433;

    public /* pp */ AbstractVerticaConnector(@Nonnull String name) {
        super(name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractBigQueryMetadataTask()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
        private final Predicate<? super String> schemaPredicate;

        public AbstractBigQueryMetadataTask(String targetPath, @Nonnull List<? extends String> databaseList, Predicate<? super String> schemaPredicate) {
            super(targetPath);
            this.databaseList = Preconditions.checkNotNull(databaseList, "Database list was null.");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractBigQueryTask()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
        }

        public AbstractBigQueryTask(@Nonnull String targetPath) {
            super(targetPath);
        }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractBigQueryConnector()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
    }

    public AbstractBigQueryConnector(@Nonnull String name) {
        super(name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractMysqlConnector()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/mysql/AbstractMysqlConnector.java`
#### Snippet
```java
    public static final int OPT_PORT_DEFAULT = 3306;

    public AbstractMysqlConnector(String name) {
        super(name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTask()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractTask.java`
#### Snippet
```java
    protected Condition[] conditions = Condition.EMPTY_ARRAY;

    public AbstractTask(String targetPath) {
        this.targetPath = targetPath;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJdbcTask()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
    private Class<? extends Enum<?>> headerClass;

    public AbstractJdbcTask(@Nonnull String targetPath) {
        super(targetPath);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHiveConnector()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
    }

    public AbstractHiveConnector(@Nonnull String name) {
        super(name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHiveTask()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
    protected static abstract class AbstractHiveTask extends AbstractTask<Void> {

        public AbstractHiveTask(String targetPath) {
            super(targetPath);
        }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPostgresqlConnector()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/postgresql/AbstractPostgresqlConnector.java`
#### Snippet
```java
    public static final int OPT_PORT_DEFAULT = 5432;

    public AbstractPostgresqlConnector(String name) {
        super(name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `HiveMetastoreThriftClient()` of an abstract class should not be declared 'public'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
    private final String name;

    public HiveMetastoreThriftClient(@Nonnull String name) {
        this.name = Preconditions.checkNotNull(name, "name was null.");
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractConnector()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/AbstractConnector.java`
#### Snippet
```java
    private final String name;

    public AbstractConnector(@Nonnull String name) {
        this.name = Preconditions.checkNotNull(name, "Name was null.");
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJdbcConnector()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/AbstractJdbcConnector.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(AbstractJdbcConnector.class);

    public AbstractJdbcConnector(@Nonnull String name) {
        super(name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TaskRunContext()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskRunContext.java`
#### Snippet
```java
    private final Executor executorService;

    public TaskRunContext(OutputHandleFactory sinkFactory, Handle handle, int threadPoolSize) {
        this.sinkFactory = Preconditions.checkNotNull(sinkFactory, "ByteSinkFactory was null.");
        this.handle = Preconditions.checkNotNull(handle, "Handle was null.");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSnowflakeConnector()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/AbstractSnowflakeConnector.java`
#### Snippet
```java
public abstract class AbstractSnowflakeConnector extends AbstractJdbcConnector {

    public AbstractSnowflakeConnector(@Nonnull String name) {
        super(name);
    }
```

## RuleId[ruleID=UnnecessaryBreak]
### UnnecessaryBreak
`break` statement is unnecessary
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/UUIDGenerator.java`
#### Snippet
```java
            if (data != null)
                return data;
            break IFACE;
        } catch (Exception e) {
            // Notionally, this is an IOException, but it might also be an (unexpected) SecurityException
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new PrivilegedAction() can be replaced with lambda
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/test/SystemPropertyValue.java`
#### Snippet
```java

    public static boolean get(@Nonnull String name) {
        return AccessController.doPrivileged(new PrivilegedAction<Boolean>() {
            @Override
            public Boolean run() {
```

### Convert2Lambda
Anonymous new IntUnaryOperator() can be replaced with lambda
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/concurrent/ExecutorManager.java`
#### Snippet
```java
    }

    private static final IntUnaryOperator DECREMENT_IF_AVAILABLE = new IntUnaryOperator() {
        @Override
        public int applyAsInt(int operand) {
```

### Convert2Lambda
Anonymous new ResultSetExtractor\>() can be replaced with lambda
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/netezza/NetezzaMetadataConnector.java`
#### Snippet
```java

        protected ResultSetExtractor<List<String>> newResultSetExtractor(@Nonnull ByteSink sink, @Nonnull JdbcHandle handle) {
            return new ResultSetExtractor<List<String>>() {
                @Override
                public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
```

### Convert2Lambda
Anonymous new PrivilegedExceptionAction\>() can be replaced with lambda
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/AbstractJdbcConnector.java`
#### Snippet
```java
    @Nonnull
    private static Class<?> newDriverClass(@Nonnull ClassLoader driverClassLoader, @Nonnull String driverClassName) throws PrivilegedActionException {
        return AccessController.doPrivileged(new PrivilegedExceptionAction<Class<?>>() {
            @Override
            public Class<?> run() throws Exception {
```

### Convert2Lambda
Anonymous new PrivilegedExceptionAction() can be replaced with lambda
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/AbstractJdbcConnector.java`
#### Snippet
```java
        }
        final URL[] urls_array = urls.toArray(new URL[0]);
        return AccessController.doPrivileged(new PrivilegedExceptionAction<ClassLoader>() {
            @Override
            public ClassLoader run() throws Exception {
```

### Convert2Lambda
Anonymous new Callable\>\>() can be replaced with lambda
in `dumper/lib-ext-bigquery/src/main/java/com/google/cloud/bigquery/BigQueryAccessor.java`
#### Snippet
```java
        Tuple<String, Iterable<com.google.api.services.bigquery.model.Job>> result
                = runWithRetries(
                        new Callable<Tuple<String, Iterable<com.google.api.services.bigquery.model.Job>>>() {
                    @Override
                    public Tuple<String, Iterable<com.google.api.services.bigquery.model.Job>> call() {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `dumper/lib-ext-bigquery/src/main/java/com/google/cloud/bigquery/BigQueryAccessor.java`
#### Snippet
```java
        Iterable<Job> jobs
                = Iterables.transform(result.y(),
                        new Function<com.google.api.services.bigquery.model.Job, Job>() {
                    @Override
                    public Job apply(com.google.api.services.bigquery.model.Job job) {
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
        }

        private static void addExternalTable(@Nonnull Metadata metadata, @Nonnull ExternalTableDefinition in) {
            // in.getSourceUris();
            // TODO:
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/RecordProgressMonitor.java`
#### Snippet
```java
    // Progress
    private long nextCount = 0;
    private long nextSeconds = 0;
    private long nextMinSeconds = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/RecordProgressMonitor.java`
#### Snippet
```java
    private long nextCount = 0;
    private long nextSeconds = 0;
    private long nextMinSeconds = 0;

    public RecordProgressMonitor(@Nonnull String name, @Nonnegative long total) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/RecordProgressMonitor.java`
#### Snippet
```java
    private final Stopwatch stopwatch = Stopwatch.createStarted();
    // Progress
    private long nextCount = 0;
    private long nextSeconds = 0;
    private long nextMinSeconds = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
    // Pass properties
    private final OptionSpec<String> definitionOption = parser.accepts("D", "Pass a key=value property.").withRequiredArg().ofType(String.class).describedAs("define");
    private Map<String, String> definitionMap = null;

    // because of quoting of special characeters on command line... the -password is made optional,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/utils/SqlBuilder.java`
#### Snippet
```java
    private final List<String> projections = new ArrayList<>();
    private final List<String> orderBy = new ArrayList<>();
    private String fromTable = null;
    private final List<String> whereClause = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
        @Nonnull
        private UnavailableClientVersionBehavior unavailableClientBehavior = UnavailableClientVersionBehavior.FALLBACK;
        private boolean debug = false;

        public Builder(@Nonnull String version) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `args`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
        try {
            MetadataDumper main = new MetadataDumper();
            args = JsonResponseFile.addResponseFiles(args);
            //LOG.debug("Arguments are: [" + String.join("] [", args) + "]");
            // Without this, the dumper prints "Missing required arguments:[connector]"
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
            // Without this, the dumper prints "Missing required arguments:[connector]"
            if (args.length == 0)
                args = new String[]{"--help"};
            main.run(args);
        } catch (MetadataDumperUsageException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `argument`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java

            if (argument.startsWith("-D")) {
                argument = argument.substring(2);
                int idx = argument.indexOf('=');
                ResponseFileEntity definitions = fields.computeIfAbsent("definitions", d -> OBJECT.get());
```

### AssignmentToMethodParameter
Assignment to method parameter `argument`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java
                definitions.put(argument.substring(0, idx), argument.substring(idx + 1));
            } else {
                argument = argument.substring(2);
                String[] tokens = StringUtils.split(argument, "-");
                put(tokens, value);
```

### AssignmentToMethodParameter
Assignment to method parameter `msw`
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/UUIDGenerator.java`
#### Snippet
```java
        for (int i = 7; i >= 0; i--) {
            out[i] = (byte) (msw & 0xFFL);
            msw >>>= 8;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `lsw`
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/UUIDGenerator.java`
#### Snippet
```java
        for (int i = 7; i >= 0; i--) {
            out[i + 8] = (byte) (lsw & 0xFFL);
            lsw >>>= 8;
        }

```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `printer`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
            }
            DatasetId datasetId = dataset.getDatasetId();
            synchronized (printer) {
                printer.printRecord(datasetId.getProject(), datasetId.getDataset(), dataset.getFriendlyName(), dataset.getLocation());
            }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `writer`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java

            String metadataText = BigQueryMetadataDumpFormat.MAPPER.writeValueAsString(metadata);
            synchronized (writer) {
                writer.write(metadataText);
                writer.write('\n');
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
        } catch (Exception e) {
            // MetadataDumperUsageException should be fatal.
            if (e instanceof MetadataDumperUsageException)
                throw (MetadataDumperUsageException) e;
            if (e instanceof SQLException && e.getCause() instanceof MetadataDumperUsageException)
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
            if (e instanceof MetadataDumperUsageException)
                throw (MetadataDumperUsageException) e;
            if (e instanceof SQLException && e.getCause() instanceof MetadataDumperUsageException)
                throw (MetadataDumperUsageException) e.getCause();
            // TaskGroup is an attempt to get rid of this condition.
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
    @PolyNull
    private static String toEnumName(@PolyNull StringEnumValue value) {
        return value == null ? null : value.name();
    }

```

### ReturnNull
Return of `null`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
    @PolyNull
    private static String toEnumName(@PolyNull Enum<?> value) {
        return value == null ? null : value.name();
    }

```

### ReturnNull
Return of `null`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
        @Override
        public String valuePattern() {
            return null;
        }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `out` is redundant
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/test/SystemPropertyValue.java`
#### Snippet
```java
            @Override
            public Boolean run() {
                boolean out = Boolean.getBoolean(name);
                // LOG.debug("SystemPropertyValue {} -> {}", name, out);
                return out;
```

### UnnecessaryLocalVariable
Local variable `time` is redundant
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/UUIDGenerator.java`
#### Snippet
```java
    private long newTime() {
        long deltaNanos = ticker.read() - initNanos;
        long time = (initMillis * 1000 * 10) + (deltaNanos / 100);
        // LOG.info("Time is           " + time);
        return time;
```

### UnnecessaryLocalVariable
Local variable `sql` is redundant
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataLogsConnector.java`
#### Snippet
```java
            Function<String, Boolean> validator = expression -> isValid(handle.getJdbcTemplate(), expression);
            Predicate<String> predicate = expression -> state.expressionValidity.computeIfAbsent(expression, validator);
            String sql = getSql(predicate);
            // LOG.debug("SQL is " + sql);
            return sql;
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/AbstractJdbcConnector.java`
#### Snippet
```java
            urls.add(u);
        }
        final URL[] urls_array = urls.toArray(new URL[0]);
        return AccessController.doPrivileged(new PrivilegedExceptionAction<ClassLoader>() {
            @Override
```

## RuleId[ruleID=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java

    @VisibleForTesting
    /* pp */ static List<? extends String> to_arguments(@Nonnull String text) throws IOException, JsonProcessingException {
        return convert(newObjectMapper().readTree(text));
    }
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dumper/lib-ext-bigquery/src/main/java/com/google/edwmigration/dumper/plugin/ext/bigquery/BigQueryClientUtils.java`
#### Snippet
```java
            }
            LOG.warn("BigQuery retryable exception: sleeping for {}ms: {}", backOffMillis, exception);
            Thread.sleep(backOffMillis);
            retryCount++;
        }
```

## RuleId[ruleID=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
            );
            for (Map.Entry<Task<?>, TaskResult<?>> e : state.getTaskResultMap().entrySet()) {
                Task<? extends Object> task = e.getKey();
                TaskResult<? extends Object> result = e.getValue();
                StringBuilder buf = new StringBuilder();
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
            for (Map.Entry<Task<?>, TaskResult<?>> e : state.getTaskResultMap().entrySet()) {
                Task<? extends Object> task = e.getKey();
                TaskResult<? extends Object> result = e.getValue();
                StringBuilder buf = new StringBuilder();
                buf.append("* Task ").append(result.getState()).append(" (").append(task.getCategory()).append(")").append(' ').append(task);
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `nextSeconds` initializer `0` is redundant
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/RecordProgressMonitor.java`
#### Snippet
```java
    // Progress
    private long nextCount = 0;
    private long nextSeconds = 0;
    private long nextMinSeconds = 0;

```

### UnusedAssignment
Variable `nextMinSeconds` initializer `0` is redundant
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/RecordProgressMonitor.java`
#### Snippet
```java
    private long nextCount = 0;
    private long nextSeconds = 0;
    private long nextMinSeconds = 0;

    public RecordProgressMonitor(@Nonnull String name, @Nonnegative long total) {
```

### UnusedAssignment
Variable `nextCount` initializer `0` is redundant
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/RecordProgressMonitor.java`
#### Snippet
```java
    private final Stopwatch stopwatch = Stopwatch.createStarted();
    // Progress
    private long nextCount = 0;
    private long nextSeconds = 0;
    private long nextMinSeconds = 0;
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
            }

            T result = null;
            ResultSet rs = null;
            try {
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `this.entryName != null` is always `true`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/generic/GenericConnector.java`
#### Snippet
```java
                    errors.add("Query string must contain where clause with date_column < " + PERIOD_END);
            }
            if (this.entryName != null) {
                if (!this.entryName.contains(PERIOD_NAME))
                    errors.add("Entry name must have " + PERIOD_NAME + " in the name");
```

### ConstantValue
Condition `dataset == null` is always `false`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
        private void add(@Nonnull CSVPrinter printer, @Nonnull Dataset _dataset) throws IOException, InterruptedException {
            Dataset dataset = runWithBackOff(() -> _dataset.reload(BigQuery.DatasetOption.fields(BigQuery.DatasetField.FRIENDLY_NAME, BigQuery.DatasetField.LOCATION)));
            if (dataset == null) {
                // contractually non-null, but null seen during testing
                LOG_LIMITED.warn("BigQuery returned a null Dataset object from reload({}), which we will ignore.", _dataset.getDatasetId());
```

### ConstantValue
Condition `table == null` is always `false`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
                    BigQuery.TableField.EXPIRATION_TIME,
                    BigQuery.TableField.CREATION_TIME)));
            if (table == null) {
                // contractually non-null, but null seen during testing
                LOG_LIMITED.warn("BigQuery returned a null Table object from reload({}), which we will ignore (perhaps the dataset in use is empty?)", _table.getTableId());
```

### ConstantValue
Condition `val == null` is always `false`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/JdbcPropBuilder.java`
#### Snippet
```java
    @Nonnull
    public JdbcPropBuilder prop(@Nonnull String prop, @Nonnull String val) throws UnsupportedEncodingException {
        if (val == null) {
            throw new InternalError("Not checked for null: " + val);
        } else {
```

### ConstantValue
Condition `currentPage == null` is always `false`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
                                throw new BigQueryException(HttpStatusCodes.STATUS_CODE_CONFLICT, "Interrupted while retrying: " + e, e);
                            }
                            if (currentPage == null) {
                                return false;
                            }
```

### ConstantValue
Condition `connectorName == null` is always `false`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

        String connectorName = arguments.getConnectorName();
        if (connectorName == null) {
            LOG.error("Target DBMS is required");
            return;
```

### ConstantValue
Result of `Boolean.parseBoolean(OPT_HIVE_METASTORE_DUMP_PARTITION_METADATA_DEFAULT)` is always 'true'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
    // Hive metastore
    public final OptionSpec<String> optionHiveMetastoreVersion = parser.accepts(OPT_HIVE_METASTORE_VERSION).withOptionalArg().describedAs("major.minor.patch").defaultsTo(OPT_HIVE_METASTORE_VERSION_DEFAULT);
    public final OptionSpec<Boolean> optionHivePartitionMetadataCollection = parser.accepts(OPT_HIVE_METASTORE_DUMP_PARTITION_METADATA).withOptionalArg().withValuesConvertedBy(BooleanValueConverter.INSTANCE).defaultsTo(Boolean.parseBoolean(OPT_HIVE_METASTORE_DUMP_PARTITION_METADATA_DEFAULT));

    // Threading / Pooling
```

### ConstantValue
Condition `id != null` is always `true`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/utils/SqlBuilder.java`
#### Snippet
```java
    @Nonnull
    public SqlBuilder withWhereInVals(@Nonnull String id, @CheckForNull List<? extends String> vals) {
        Preconditions.checkArgument(id != null, "id was null.");
        if (vals != null && !vals.isEmpty()) {
            StringBuilder buf = new StringBuilder();
```

### ConstantValue
Condition `resourcesDir == null` is always `false`
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/test/TestUtils.java`
#### Snippet
```java
        File moduleDir = new File(getProjectRootDir(), subproject);
        File resourcesDir = new File(moduleDir, "build/resources/test");
        if (resourcesDir == null) {
            throw new IllegalStateException("Cannot find resources dir " + resourcesDir);
        }
```

### ConstantValue
Condition `hasResponseFile` is always `true`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java
    public static String[] addResponseFiles(@Nonnull @NonNull String @NonNull [] args) throws IOException {
        boolean hasResponseFile = true;
        for (int j = 0; hasResponseFile && j < args.length; j++)
            if (args[j].charAt(0) == '@')
                hasResponseFile = true;
```

### ConstantValue
Condition `!hasResponseFile` is always `false`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java
            if (args[j].charAt(0) == '@')
                hasResponseFile = true;
        if (!hasResponseFile)
            return args;

```

### ConstantValue
Value `hasResponseFile` is always 'true'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java
            if (args[j].charAt(0) == '@')
                hasResponseFile = true;
        if (!hasResponseFile)
            return args;

```

### ConstantValue
Condition `driverClass != null` is always `true`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/AbstractJdbcConnector.java`
#### Snippet
```java
                    try {
                        driverClass = newDriverClass(driverClassLoader, driverClassName);
                        if (driverClass != null)
                            break CLASS;
                    } catch (PrivilegedActionException e) {
```

### ConstantValue
Condition `ifaces == null` is always `false`
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/UUIDGenerator.java`
#### Snippet
```java
    public static byte[] getMacOrNull() throws SocketException {
        Enumeration<NetworkInterface> ifaces = NetworkInterface.getNetworkInterfaces();
        if (ifaces == null) // This happens in no-network jails.
            return null;

```

### ConstantValue
Condition is always false
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/RedshiftLogsConnector.java`
#### Snippet
```java
        makeTasks(arguments, RedshiftLogsDumpFormat.QueryHistory.ZIP_ENTRY_PREFIX, queryTemplateQuery, "Q.starttime", parallelTask);

        if (false) {
            // Metric Dance.... S3 logs has xid ..  .. so Above wil have to be used to map xid's to query
            //  1. SVL_QUERY_METRICS doesn't have starttime
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor)' is marked unstable with @Beta
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentRecordProgressMonitor.java`
#### Snippet
```java
                })
                .build();
        private static final ScheduledExecutorService EXECUTOR_SERVICE = MoreExecutors.getExitingScheduledExecutorService(new ScheduledThreadPoolExecutor(1, THREAD_FACTORY));
    }

```

### UnstableApiUsage
'shutdownAndAwaitTermination(java.util.concurrent.ExecutorService, long, java.util.concurrent.TimeUnit)' is marked unstable with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java

        protected void shutdown(@Nonnull ExecutorService executor) {
            MoreExecutors.shutdownAndAwaitTermination(executor, 30, TimeUnit.SECONDS);
        }

```

### UnstableApiUsage
'getCausalChain(java.lang.Throwable)' is marked unstable with @Beta
in `dumper/lib-ext-bigquery/src/main/java/com/google/edwmigration/dumper/plugin/ext/bigquery/BigQueryClientUtils.java`
#### Snippet
```java
    @CheckForNull
    private static BigQueryException getBigQueryException(@Nonnull RetryHelper.RetryHelperException e) {
        for (Throwable t : Throwables.getCausalChain(e))
            if (t instanceof BigQueryException)
                return (BigQueryException) t;
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

            LOG.info("Using " + connector);
            try (Closer closer = Closer.create()) {

                final OutputHandleFactory sinkFactory;
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

            LOG.info("Using " + connector);
            try (Closer closer = Closer.create()) {

                final OutputHandleFactory sinkFactory;
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

            LOG.info("Using " + connector);
            try (Closer closer = Closer.create()) {

                final OutputHandleFactory sinkFactory;
```

### UnstableApiUsage
'createParentDirs(java.io.File)' is marked unstable with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
                            outputFile.delete();    // It's a simple file, and we were asked to overwrite it.
                    } else {
                        Files.createParentDirs(outputFile);
                    }

```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
                            .put("useTempFile", Boolean.TRUE)
                            .build();
                    FileSystem fileSystem = closer.register(FileSystems.newFileSystem(outputUri, fileSystemProperties));
                    sinkFactory = new FileSystemOutputHandleFactory(fileSystem, "/");   // It's required to be "/"
                } else {
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
                LOG.debug("Target filesystem is " + sinkFactory);

                Handle handle = closer.register(connector.open(arguments));

                TaskRunContext runContext = new TaskRunContext(sinkFactory, handle, arguments.getThreadPoolSize()) {
```

### UnstableApiUsage
'shutdownAndAwaitTermination(java.util.concurrent.ExecutorService, long, java.util.concurrent.TimeUnit)' is marked unstable with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
            LOG.debug("Shutting down thread pool backing pooled Thrift client '{}'", name);
            executorManager.close();
            MoreExecutors.shutdownAndAwaitTermination(executorService, 30, TimeUnit.SECONDS);
            synchronized (lock) {
                for (HiveMetastoreThriftClient client : builtClients) {
```

### UnstableApiUsage
Overridden method 'sizeIfKnown()' is marked unstable with @Beta
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/io/ZipArchiveEntryByteSource.java`
#### Snippet
```java

    @Override
    public Optional<Long> sizeIfKnown() {
        return Optional.of(zipEntry.getSize());
    }
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Appendable.append()` call
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
    private void printConnectorHelp(@Nonnull Appendable out, @Nonnull Connector connector) throws IOException {
        Description description = connector.getClass().getAnnotation(Description.class);
        out.append("* " + connector.getName());
        if (description != null)
            out.append(" - ").append(description.value());
```

