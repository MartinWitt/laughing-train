# dwh-migration-tools 
 
# Bad smells
I found 857 bad smells with 569 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 529 | true |
| NullableProblems | 148 | false |
| DataFlowIssue | 19 | false |
| NonProtectedConstructorInAbstractClass | 17 | true |
| ConstantValue | 12 | false |
| UnnecessarySemicolon | 11 | false |
| UnusedLabel | 11 | true |
| SystemOutErr | 10 | false |
| UnstableApiUsage | 10 | false |
| DynamicRegexReplaceableByCompiledPattern | 9 | false |
| Convert2Lambda | 7 | false |
| UtilityClassWithoutPrivateConstructor | 6 | true |
| RedundantFieldInitialization | 6 | false |
| AssignmentToMethodParameter | 6 | false |
| CommentedOutCode | 5 | false |
| DeprecatedIsStillUsed | 4 | false |
| BoundedWildcard | 4 | false |
| UnusedAssignment | 4 | false |
| StaticPseudoFunctionalStyleMethod | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| ReturnNull | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| SizeReplaceableByIsEmpty | 2 | true |
| UnnecessaryUnboxing | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| InstanceofCatchParameter | 2 | false |
| FieldMayBeStatic | 1 | false |
| LoopStatementsThatDontLoop | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| Convert2MethodRef | 1 | false |
| ComparatorCombinators | 1 | false |
| RedundantSuppression | 1 | false |
| IgnoreResultOfCall | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| ClassNameSameAsAncestorName | 1 | false |
| NestedAssignment | 1 | false |
| UnnecessaryBreak | 1 | false |
| EmptyMethod | 1 | false |
| EqualsAndHashcode | 1 | false |
| DuplicateThrows | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| BusyWait | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[id=UnnecessaryModifier]
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
  public String getFieldName();

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
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentQueryLogEnd.java`
#### Snippet
```java
public @interface RespectsArgumentQueryLogEnd {

  public static final String DESCRIPTION = "End date for query history to dump";
}

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
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentQueryLogEnd.java`
#### Snippet
```java
public @interface RespectsArgumentQueryLogEnd {

  public static final String DESCRIPTION = "End date for query history to dump";
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriverClass.java`
#### Snippet
```java
public @interface RespectsArgumentDriverClass {

  public static final String DESCRIPTION =
      "Optionally overrides the vendor-specified JDBC driver class name.";
}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriverClass.java`
#### Snippet
```java
public @interface RespectsArgumentDriverClass {

  public static final String DESCRIPTION =
      "Optionally overrides the vendor-specified JDBC driver class name.";
}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriverClass.java`
#### Snippet
```java
public @interface RespectsArgumentDriverClass {

  public static final String DESCRIPTION =
      "Optionally overrides the vendor-specified JDBC driver class name.";
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
  public String getDefaultFileName(boolean isAssessment);

  @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

  @Nonnull
  public default Class<? extends Enum<? extends ConnectorProperty>> getConnectorProperties() {
    return DefaultProperties.class;
  }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

  // Empty
  public enum DefaultProperties implements ConnectorProperty {}

  @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

  @Nonnull
  public void addTasksTo(@Nonnull List<? super Task<?>> out, @Nonnull ConnectorArguments arguments)
      throws Exception;

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
  public Long getTotalSize();

  @CheckForNull
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
  public Integer getLastAccessTime();

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
  public Long getRowsCount();

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

  @CheckForNull
  public Long getRawSize();

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
  public String getType();

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
  public String getFunctionName();

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
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Function.java`
#### Snippet
```java

  @CheckForNull
  public Integer getOwnerType();

  @CheckForNull
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
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/Table.java`
#### Snippet
```java

  @CheckForNull
  public String getLocation();

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
  public Integer getLastAccessTime();

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
  public String getOwner();

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
  public Long getTotalSize();

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
  public String getExpandedViewText();

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
  public Integer getBucketsCount();

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
  public String getOriginalViewText();

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
  public Long getRowsCount();

  @CheckForNull
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
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriver.java`
#### Snippet
```java
public @interface RespectsArgumentDriver {

  public static final String DESCRIPTION =
      "The vendor-supplied driver JARs to use for this connector.";
}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriver.java`
#### Snippet
```java
public @interface RespectsArgumentDriver {

  public static final String DESCRIPTION =
      "The vendor-supplied driver JARs to use for this connector.";
}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentDriver.java`
#### Snippet
```java
public @interface RespectsArgumentDriver {

  public static final String DESCRIPTION =
      "The vendor-supplied driver JARs to use for this connector.";
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskSetState.java`
#### Snippet
```java

  @Nonnull
  public default TaskState getTaskState(@Nonnull Task<?> task) {
    TaskResult<?> result = getTaskResult(task);
    return (result == null) ? TaskState.NOT_STARTED : result.getState();
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
    public static final String ZIP_ENTRY_NAME = "pg_user.csv";

    public static enum Header {
      username,
      userid,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_NAME = "pg_user.csv";

    public static enum Header {
      username,
      userid,
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
    public static final String ZIP_ENTRY_NAME = "pg_views_private.csv";

    public static enum Header {
      schemaname,
      viewname,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/PostgresqlMetadataDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_NAME = "pg_views_private.csv";

    public static enum Header {
      schemaname,
      viewname,
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
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_PREFIX = "querymetrics_";

    public static enum Header {
      userid,
      service_class,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_PREFIX = "querymetrics_";

    public static enum Header {
      userid,
      service_class,
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
    public static final String ZIP_ENTRY_PREFIX = "querytext_";

    public static enum Header {
      userid,
      xid,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_PREFIX = "querytext_";

    public static enum Header {
      userid,
      xid,
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
    public static final String ZIP_ENTRY_PREFIX = "ddltext_";

    public static enum Header {
      userid,
      xid,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_PREFIX = "ddltext_";

    public static enum Header {
      userid,
      xid,
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
  public default void count() {
    count(1);
  }
```

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

  @Nonnull
  public default ConcurrentProgressMonitor withBlockSize(@Nonnegative int blockSize) {
    return this;
  }
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
  public String getComment();
}

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
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsArgumentHostUnlessUrl.java`
#### Snippet
```java
public @interface RespectsArgumentHostUnlessUrl {

  public static final String DESCRIPTION = "The hostname of the database server.";

  // public static final String EXAMPLES[] = {};
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
  public default CharSink asCharSink(@Nonnull Charset charset) throws IOException {
    return asByteSink().asCharSink(charset);
  }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/io/OutputHandle.java`
#### Snippet
```java
   * try-with-resources or finally block, or you risk committing bad data.
   */
  public void commit() throws IOException;
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
  /** Returns a ByteSink on the target file. */
  @Nonnull
  public ByteSink asByteSink() throws IOException;

  /** Returns a CharSink on the target file. */
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

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      Vproc,
      DataBaseName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      Vproc,
      DataBaseName,
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
public interface TeradataMetadataDumpFormat {

  public static final String FORMAT_NAME = "teradata.dump.zip";

  public static interface VersionFormat {
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
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
public interface TeradataMetadataDumpFormat {

  public static final String FORMAT_NAME = "teradata.dump.zip";

  public static interface VersionFormat {
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

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      FunctionName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      FunctionName,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DataBaseName,
      TableName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DataBaseName,
      TableName,
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
    public static String ZIP_ENTRY_NAME = "dbc.TableTextV.csv";

    public static enum Header {
      DataBaseName,
      TableName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static String ZIP_ENTRY_NAME = "dbc.TableTextV.csv";

    public static enum Header {
      DataBaseName,
      TableName,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static String ZIP_ENTRY_NAME = "dbc.All_RI_ChildrenV.csv";

    public static enum Header {
      IndexId,
      IndexName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static String ZIP_ENTRY_NAME = "dbc.All_RI_ChildrenV.csv";

    public static enum Header {
      IndexId,
      IndexName,
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
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      CreatorName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      CreatorName,
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
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      TableName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      TableName,
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

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      TableName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      TableName,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static String ZIP_ENTRY_NAME = "dbc.AllTempTablesVX.csv";

    public static enum Header {
      HostNo,
      SessionNo,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static String ZIP_ENTRY_NAME = "dbc.AllTempTablesVX.csv";

    public static enum Header {
      HostNo,
      SessionNo,
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
    public static String ZIP_ENTRY_NAME = "dbc.RoleMembersV.csv";

    public static enum Header {
      RoleName,
      Grantor,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static String ZIP_ENTRY_NAME = "dbc.RoleMembersV.csv";

    public static enum Header {
      RoleName,
      Grantor,
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
    public static String ZIP_ENTRY_NAME = "dbc.All_RI_ParentsV.csv";

    public static enum Header {
      IndexId,
      IndexName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static String ZIP_ENTRY_NAME = "dbc.All_RI_ParentsV.csv";

    public static enum Header {
      IndexId,
      IndexName,
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

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      TableName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      TableName,
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
    public static String ZIP_ENTRY_NAME = "dbc.DiskSpaceV.csv";

    public static enum Header {
      VProc,
      DatabaseName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    public static String ZIP_ENTRY_NAME = "dbc.DiskSpaceV.csv";

    public static enum Header {
      VProc,
      DatabaseName,
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
    // ColumnPartitionFormat,ColumnPartitionAC,PseudoUDTFieldId,PseudoUDTFieldType,StorageFormat,DatasetSchemaName,InlineLength,TSColumnType
    // NOTE: This enum must match not what TD says is in the schema, but what we actually dump.
    public static enum Header {
      DatabaseName,
      TableName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
    // ColumnPartitionFormat,ColumnPartitionAC,PseudoUDTFieldId,PseudoUDTFieldType,StorageFormat,DatasetSchemaName,InlineLength,TSColumnType
    // NOTE: This enum must match not what TD says is in the schema, but what we actually dump.
    public static enum Header {
      DatabaseName,
      TableName,
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

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      TableName,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java

    // TD 16.20.32.09 - complete set.
    public static enum Header {
      DatabaseName,
      TableName,
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
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java

  @Nonnull
  public default BlockProgressMonitor withBlockSize(@Nonnegative int blockSize) {
    return new BlockProgressMonitor(this, blockSize);
  }
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
  /** Returns the current count. */
  @Nonnegative
  public default long getCount() {
    return count(0);
  }
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

  /** Adds 1 to the current count. Returns the number counted so far, including this count. */
  public default long count() {
    return count(1);
  }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java

  /** Adds delta to the current count. Returns the number counted so far, including this count. */
  public long count(@Nonnegative int delta);

  /** Adds 1 to the current count. Returns the number counted so far, including this count. */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

    public static enum Header {
      table_catalog,
      table_schema,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
        PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

    public static enum Header {
      table_catalog,
      table_schema,
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
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

  /** Headers for results from pg_user table. */
  public static interface PgUser {
    public static final String ZIP_ENTRY_NAME = "pg_user.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java

  /** Headers for results from pg_user table. */
  public static interface PgUser {
    public static final String ZIP_ENTRY_NAME = "pg_user.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
  /** Headers for results from pg_user table. */
  public static interface PgUser {
    public static final String ZIP_ENTRY_NAME = "pg_user.csv";

    public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
  /** Headers for results from pg_user table. */
  public static interface PgUser {
    public static final String ZIP_ENTRY_NAME = "pg_user.csv";

    public static enum Header {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
  /** Headers for results from pg_user table. */
  public static interface PgUser {
    public static final String ZIP_ENTRY_NAME = "pg_user.csv";

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
   * suffix to avoid name collision.
   */
  public static interface FunctionsTbl {
    public static final String ZIP_ENTRY_NAME = "functions.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
   * suffix to avoid name collision.
   */
  public static interface FunctionsTbl {
    public static final String ZIP_ENTRY_NAME = "functions.csv";

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
  public static interface InformationSchemaColumns {

    public static final String ZIP_ENTRY_NAME_SYSTEM =
        PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
    public static final String ZIP_ENTRY_NAME =
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
  public static interface InformationSchemaColumns {

    public static final String ZIP_ENTRY_NAME_SYSTEM =
        PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
    public static final String ZIP_ENTRY_NAME =
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
  public static interface InformationSchemaColumns {

    public static final String ZIP_ENTRY_NAME_SYSTEM =
        PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
    public static final String ZIP_ENTRY_NAME =
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
   * only user-defined tables.
   */
  public static interface SvvTableInfo {
    public static final String ZIP_ENTRY_NAME = "svv_table_info.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
   * only user-defined tables.
   */
  public static interface SvvTableInfo {
    public static final String ZIP_ENTRY_NAME = "svv_table_info.csv";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
  }

  public static interface InformationSchemaColumns {

    public static final String ZIP_ENTRY_NAME_SYSTEM =
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
  }

  public static interface InformationSchemaColumns {

    public static final String ZIP_ENTRY_NAME_SYSTEM =
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
    public static final String ZIP_ENTRY_NAME = "pg_table_def_private.csv";

    public static enum Header {
      schemaname,
      tablename,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_NAME = "pg_table_def_private.csv";

    public static enum Header {
      schemaname,
      tablename,
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
    public static final String ZIP_ENTRY_NAME_SYSTEM =
        PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
    public static final String ZIP_ENTRY_NAME =
        PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_NAME_SYSTEM =
        PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
    public static final String ZIP_ENTRY_NAME =
        PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
    public static final String ZIP_ENTRY_NAME_SYSTEM =
        PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME_SYSTEM;
    public static final String ZIP_ENTRY_NAME =
        PostgresqlMetadataDumpFormat.InformationSchemaColumns.ZIP_ENTRY_NAME;

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
   * catalogs.
   */
  public static interface SvvTables {
    public static final String ZIP_ENTRY_NAME = "svv_tables.csv";

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftMetadataDumpFormat.java`
#### Snippet
```java
   * catalogs.
   */
  public static interface SvvTables {
    public static final String ZIP_ENTRY_NAME = "svv_tables.csv";

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

  @Nonnull
  public default TaskCategory getCategory() {
    return TaskCategory.REQUIRED;
  }
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
  // returns true if tasks handles the exception.
  // so it's not sent to user's screen
  public default boolean handleException(Exception Fe) {
    return false;
  }
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

  @Nonnull
  public String getTargetPath();

  @Nonnull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

  @Nonnull
  public default Condition[] getConditions() {
    return Condition.EMPTY_ARRAY;
  }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java

  @Nonnull
  public default String getName() {
    return getTargetPath();
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

    @Nonnull
    public default String toSkipReason() {
      return "[" + this + "] was not true";
    }
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
public interface BigQueryMetadataDumpFormat {

  public static final ObjectMapper MAPPER =
      new ObjectMapper()
          .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
public interface BigQueryMetadataDumpFormat {

  public static final ObjectMapper MAPPER =
      new ObjectMapper()
          .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
public interface BigQueryMetadataDumpFormat {

  public static final ObjectMapper MAPPER =
      new ObjectMapper()
          .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
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
  interface Views {

    final String ZIP_ENTRY_NAME_DBA = "DBA.Views.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.Views.csv";

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

    final String ZIP_ENTRY_NAME_DBA = "DBA.MViews.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.MViews.csv";

    enum Header {
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

    final String ZIP_ENTRY_NAME_DBA = "DBA.TabColumns.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.TabColumns.csv";

    enum Header {
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

    final String ZIP_ENTRY_NAME_DBA = "DBA.PlsqlTypes.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.PlsqlTypes.csv";

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
  interface Plsql_Types {

    final String ZIP_ENTRY_NAME_DBA = "DBA.PlsqlTypes.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.PlsqlTypes.csv";

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
  interface V_Option {

    final String ZIP_ENTRY_NAME = "V_Option.csv";

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

    final String ZIP_ENTRY_NAME_DBA = "DBA.Tables-XML.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.Tables-XML.csv";

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
  interface Operators {

    final String ZIP_ENTRY_NAME_DBA = "DBA.Operators.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.Operators.csv";

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

    final String ZIP_ENTRY_NAME_DBA = "DBA.Indexes.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.Indexes.csv";

    enum Header {
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
  interface V_Version {

    final String ZIP_ENTRY_NAME = "V_Version.csv";

    enum Header {
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

    final String ZIP_ENTRY_NAME_DBA = "DBA.Tables.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.Tables.csv";

    enum Header {
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
  interface XmlViews {

    final String ZIP_ENTRY_NAME_DBA = "DBA.Views-XML.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.Views-XML.csv";

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
  interface Procedures {

    final String ZIP_ENTRY_NAME_DBA = "DBA.Procedures.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.Procedures.csv";

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
  interface MViews {

    final String ZIP_ENTRY_NAME_DBA = "DBA.MViews.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.MViews.csv";

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
  interface Functions {

    final String ZIP_ENTRY_NAME = "Functions.csv";

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

    final String ZIP_ENTRY_NAME_DBA = "DBA.Views-XML.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.Views-XML.csv";

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

    final String ZIP_ENTRY_NAME_DBA = "DBA.Views.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.Views.csv";

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
  interface XmlSequences {

    final String ZIP_ENTRY_NAME_DBA = "DBA.Sequences-XML.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.Sequences-XML.csv";

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

    final String ZIP_ENTRY_NAME_DBA = "DBA.PartKeyColumns.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.PartKeyColumns.csv";

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
  interface XmlTypes {

    final String ZIP_ENTRY_NAME_DBA = "DBA.Types-XML.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.Types-XML.csv";

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
  interface Tab_Partitions {

    final String ZIP_ENTRY_NAME_DBA = "DBA.TabPartitions.csv";
    final String ZIP_ENTRY_NAME_ALL = "ALL.TabPartitions.csv";

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
  interface V_Pwfile_users {

    final String ZIP_ENTRY_NAME = "V_Pwfile_users.csv";

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
public interface HiveMetadataDumpFormat {

  public static final ObjectMapper MAPPER =
      new ObjectMapper()
          .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
public interface HiveMetadataDumpFormat {

  public static final ObjectMapper MAPPER =
      new ObjectMapper()
          .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
public interface HiveMetadataDumpFormat {

  public static final ObjectMapper MAPPER =
      new ObjectMapper()
          .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
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
public interface CoreMetadataDumpFormat {

  public static final YAMLFactory FACTORY =
      new YAMLFactory()
          .enable(YAMLGenerator.Feature.LITERAL_BLOCK_STYLE)
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
public interface CoreMetadataDumpFormat {

  public static final YAMLFactory FACTORY =
      new YAMLFactory()
          .enable(YAMLGenerator.Feature.LITERAL_BLOCK_STYLE)
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
public interface CoreMetadataDumpFormat {

  public static final YAMLFactory FACTORY =
      new YAMLFactory()
          .enable(YAMLGenerator.Feature.LITERAL_BLOCK_STYLE)
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
          .disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
          .disable(YAMLGenerator.Feature.SPLIT_LINES);
  public static final ObjectMapper MAPPER =
      new ObjectMapper(FACTORY)
          // .registerModule(new GuavaModule())
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
          .disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
          .disable(YAMLGenerator.Feature.SPLIT_LINES);
  public static final ObjectMapper MAPPER =
      new ObjectMapper(FACTORY)
          // .registerModule(new GuavaModule())
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/CoreMetadataDumpFormat.java`
#### Snippet
```java
          .disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
          .disable(YAMLGenerator.Feature.SPLIT_LINES);
  public static final ObjectMapper MAPPER =
      new ObjectMapper(FACTORY)
          // .registerModule(new GuavaModule())
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
  public static interface SvlStatementText {

    public static enum Header {
      userid,
      xid,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
  public static interface SvlStatementText {

    public static enum Header {
      userid,
      xid,
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
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
  }

  public static enum QueryHistory {
    queryid,
    xid,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
  }

  public static enum QueryHistory {
    queryid,
    xid,
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
   * $CREDENTIALS delimiter as ',' addquotes escape allowoverwrite ;
   */
  public static interface SvlStatementText {

    public static enum Header {
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
   * $CREDENTIALS delimiter as ',' addquotes escape allowoverwrite ;
   */
  public static interface SvlStatementText {

    public static enum Header {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
  public static final String ZIP_ENTRY_SUFFIX = ".csv";

  public static enum DdlHistory {
    userid,
    starttime,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
  public static final String ZIP_ENTRY_SUFFIX = ".csv";

  public static enum DdlHistory {
    userid,
    starttime,
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

  @CheckForNull
  public String getOwner();

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
  public String getDescription();

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
in `dumper/lib-ext-bigquery/src/main/java/com/google/edwmigration/dumper/plugin/ext/bigquery/BigQueryCallable.java`
#### Snippet
```java

  @Nonnull
  public T call() throws BigQueryException;
}

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
Modifier `static` is redundant for inner interfaces
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/OracleMetadataConnector.java`
#### Snippet
```java
  }

  private static interface GroupTask<T> extends Task<T> {

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
Modifier `static` is redundant for inner enums
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
  private static class InputDescriptor implements Comparable<InputDescriptor> {

    public static enum Category {
      Arg,
      Env,
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
  }

  public interface DistMapFormat {

    public static final String ZIP_ENTRY_SUFFIX = "/nz.v_table_dist_map.csv";
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
  public static final String FORMAT_NAME = "netezza.dump.zip";

  public interface Views {

    public static final String ZIP_ENTRY_SUFFIX = "/nz.v_view.csv";
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
    }

    protected static interface BigQueryConsumer<V> {

      public void accept(@Nonnull V value)
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
    protected static interface BigQueryConsumer<V> {

      public void accept(@Nonnull V value)
          throws BigQueryException, IOException, InterruptedException;
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
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsInput.java`
#### Snippet
```java
  public String defaultValue() default "";

  public int order() default Integer.MAX_VALUE;

  @Nonnull
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
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/annotations/RespectsInput.java`
#### Snippet
```java

  @Nonnull
  public String required() default "";
}

```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `HELP_INFO` may be 'static'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ConnectorArguments.class);

  private final String HELP_INFO =
      "The CompilerWorks Metadata Exporters address three goals:\n"
          + "\n"
```

## RuleId[id=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`for` statement does not loop
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
        @Override
        public boolean hasNext() {
          for (; ; ) {
            while (!currentPageIterator.hasNext()) {
              try {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ZipFileUtils` has only 'static' members, and lacks a 'private' constructor
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/util/ZipFileUtils.java`
#### Snippet
```java

/** @author shevek */
public class ZipFileUtils {

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
Class `BigQueryClientUtils` has only 'static' members, and lacks a 'private' constructor
in `dumper/lib-ext-bigquery/src/main/java/com/google/edwmigration/dumper/plugin/ext/bigquery/BigQueryClientUtils.java`
#### Snippet
```java

/** @author shevek */
public class BigQueryClientUtils {

  @SuppressWarnings("UnusedVariable")
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
Class `BigQueryAccessor` has only 'static' members, and lacks a 'private' constructor
in `dumper/lib-ext-bigquery/src/main/java/com/google/cloud/bigquery/BigQueryAccessor.java`
#### Snippet
```java
 * @author shevek
 */
public class BigQueryAccessor {

  @SuppressWarnings("UnusedVariable")
```

### UtilityClassWithoutPrivateConstructor
Class `JsonResponseFile` has only 'static' members, and lacks a 'private' constructor
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java
 * joptsimple.
 */
public class JsonResponseFile {

  private static final Logger LOG = LoggerFactory.getLogger(JsonResponseFile.class);
```

## RuleId[id=UnnecessarySemicolon]
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
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
      query_priority,
      query_queue_time,
      service_class_name;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
      endtime,
      sequence,
      text;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
      wlm_total_elapsed,
      commit_queue_elapsed,
      commit_exec_time;
    }
  }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
      endtime,
      sequence,
      text;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftRawLogsDumpFormat.java`
#### Snippet
```java
      service_class_end_time,
      final_state,
      query_priority;
    }
  }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/TeradataMetadataDumpFormat.java`
#### Snippet
```java
      ColumnId,
      ColumnName,
      ColumnType;
    }
  }
```

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
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/RedshiftLogsDumpFormat.java`
#### Snippet
```java
      type,
      text,
      qid;
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

## RuleId[id=DataFlowIssue]
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
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/mysql/AbstractMysqlConnector.java`
#### Snippet
```java
        newDriver(arguments.getDriverPaths(), "com.mysql.jdbc.Driver", "org.mariadb.jdbc.Driver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
    return new JdbcHandle(dataSource);
  }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/mysql/AbstractMysqlConnector.java`
#### Snippet
```java
        newDriver(arguments.getDriverPaths(), "com.mysql.jdbc.Driver", "org.mariadb.jdbc.Driver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
    return new JdbcHandle(dataSource);
  }
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/AbstractSnowflakeConnector.java`
#### Snippet
```java
        newDriver(arguments.getDriverPaths(), "net.snowflake.client.jdbc.SnowflakeDriver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
    return checkCurrentDatabaseExists(arguments, new JdbcHandle(dataSource));
  }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/AbstractSnowflakeConnector.java`
#### Snippet
```java
        newDriver(arguments.getDriverPaths(), "net.snowflake.client.jdbc.SnowflakeDriver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
    return checkCurrentDatabaseExists(arguments, new JdbcHandle(dataSource));
  }
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/vertica/AbstractVerticaConnector.java`
#### Snippet
```java
    Driver driver = newDriver(arguments.getDriverPaths(), "com.vertica.jdbc.Driver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
    return new JdbcHandle(dataSource);
  }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/vertica/AbstractVerticaConnector.java`
#### Snippet
```java
    Driver driver = newDriver(arguments.getDriverPaths(), "com.vertica.jdbc.Driver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
    return new JdbcHandle(dataSource);
  }
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/netezza/NetezzaMetadataConnector.java`
#### Snippet
```java
    Driver driver = newDriver(arguments.getDriverPaths(), "org.netezza.Driver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
    return new JdbcHandle(dataSource);
  }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/netezza/NetezzaMetadataConnector.java`
#### Snippet
```java
    Driver driver = newDriver(arguments.getDriverPaths(), "org.netezza.Driver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
    return new JdbcHandle(dataSource);
  }
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/AbstractRedshiftConnector.java`
#### Snippet
```java
    LOG.trace("URI is " + url);
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());

    return JdbcHandle.newPooledJdbcHandle(dataSource, arguments.getThreadPoolSize());
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/AbstractRedshiftConnector.java`
#### Snippet
```java
    LOG.trace("URI is " + url);
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());

    return JdbcHandle.newPooledJdbcHandle(dataSource, arguments.getThreadPoolSize());
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataLogsConnector.java`
#### Snippet
```java
    String queryTable = DEF_QUERY_TABLE;
    List<String> alternates = arguments.getQueryLogAlternates();
    if (!alternates.isEmpty()) {
      if (alternates.size() != 2) {
        throw new MetadataDumperUsageException(
```

### DataFlowIssue
Method invocation `withInterval` may produce `NullPointerException`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
  public interface ExtendableResultSetExtractor extends ResultSetExtractor<Summary> {
    default ResultSetExtractor<Summary> withInterval(ZonedInterval interval) {
      return rs -> extractData(rs).withInterval(interval);
    }
  }
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/sqlserver/SqlServerMetadataConnector.java`
#### Snippet
```java
        newDriver(arguments.getDriverPaths(), "com.microsoft.sqlserver.jdbc.SQLServerDriver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
    return new JdbcHandle(dataSource);
  }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/sqlserver/SqlServerMetadataConnector.java`
#### Snippet
```java
        newDriver(arguments.getDriverPaths(), "com.microsoft.sqlserver.jdbc.SQLServerDriver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
    return new JdbcHandle(dataSource);
  }
```

### DataFlowIssue
Argument `arguments.getUser()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/AbstractOracleConnector.java`
#### Snippet
```java
    Driver driver = newDriver(arguments.getDriverPaths(), "oracle.jdbc.OracleDriver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
    return new JdbcHandle(dataSource);
  }
```

### DataFlowIssue
Argument `arguments.getPassword()` might be null
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/oracle/AbstractOracleConnector.java`
#### Snippet
```java
    Driver driver = newDriver(arguments.getDriverPaths(), "oracle.jdbc.OracleDriver");
    DataSource dataSource =
        new SimpleDriverDataSource(driver, url, arguments.getUser(), arguments.getPassword());
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
        throw new MetadataDumperUsageException(
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

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `v`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/Teradata14LogsConnector.java`
#### Snippet
```java

  private static List<String> enumNames(String prefix, Class<? extends Enum<?>> en) {
    Enum<?> v[] = en.getEnumConstants();
    List<String> ret = new ArrayList<>(v.length);
    for (Enum<?> h : v) ret.add(prefix + h.name());
```

## RuleId[id=DeprecatedIsStillUsed]
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
Deprecated member 'VersionTask' is still used
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/VersionTask.java`
#### Snippet
```java
/** @author shevek */
@Deprecated // Use DumpMetadataTask
public class VersionTask extends AbstractTask<Void> {

  public VersionTask(String targetPath) {
```

### DeprecatedIsStillUsed
Deprecated member 'ArgumentsTask' is still used
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/ArgumentsTask.java`
#### Snippet
```java
/** @author shevek */
@Deprecated // Use DumpMetadataTask
public class ArgumentsTask extends AbstractTask<Void> {

  @Nonnull private final ConnectorArguments arguments;
```

## RuleId[id=CommentedOutCode]
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
Commented out code (4 lines)
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/AbstractRedshiftConnector.java`
#### Snippet
```java
            arguments.getDriverPaths(), "com.amazon.redshift.jdbc.Driver", "org.postgresql.Driver");

    //        LOG.debug("DRIVER IS " + driver.getClass().getCanonicalName());
    //        LOG.debug("DRIVER CAN RS " + driver.acceptsURL("jdbc:redshift://host/db"));
    //        LOG.debug("DRIVER CAN IAM " + driver.acceptsURL("jdbc:redshift:iam://host/db"));
```

### CommentedOutCode
Commented out code (3 lines)
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/generic/GenericConnector.java`
#### Snippet
```java
      throws MetadataDumperUsageException {
    // interefers with testing, no harm in calling two times anyway
    // if (argumentsProcessed)
    //    return;
    // argumentsProcessed = true;
```

### CommentedOutCode
Commented out code (3 lines)
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java

    private static void addTable(@Nonnull Metadata metadata, @Nonnull Table table) {
      // printer.printRecord(tableId.getProject(), tableId.getDataset(), tableId.getTable(),
      // table.getFriendlyName(), tableDefinition.getType(), table.getNumRows(),
      // table.getNumBytes(), metadataText);
```

## RuleId[id=Convert2MethodRef]
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

## RuleId[id=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/DefaultArguments.java`
#### Snippet
```java
            // https://github.com/jopt-simple/jopt-simple/blob/master/src/main/java/joptsimple/BuiltinHelpFormatter.java#L91
            Comparator<OptionDescriptor> comparator =
                (first, second) ->
                    first.options().iterator().next().compareTo(second.options().iterator().next());
            Set<OptionDescriptor> sorted = new TreeSet<>(comparator);

```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
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
in `dumper/lib-ext-bigquery/src/main/java/com/google/cloud/bigquery/BigQueryAccessor.java`
#### Snippet
```java
    String cursor = result.x();
    Iterable<Job> jobs =
        Iterables.transform(
            result.y(),
            new Function<com.google.api.services.bigquery.model.Job, Job>() {
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`partitionValue.length() == 0` can be replaced with 'partitionValue.isEmpty()'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/utils/PartitionNameGenerator.java`
#### Snippet
```java
  @CheckForNull
  private static String constructPartitionName(String partitionKey, String partitionValue) {
    if (partitionValue == null || partitionValue.length() == 0) {
      // This is unexpected and the original code throws an exception here.
      LOG.warn(
```

### SizeReplaceableByIsEmpty
`buf.length() > 0` can be replaced with '!buf.isEmpty()'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/AbstractRedshiftConnector.java`
#### Snippet
```java
    Joiner.on(" AND ").appendTo(buf, clauseList);
    for (String clause : clauseArray) {
      if (buf.length() > 0) buf.append(" AND ");
      buf.append(clause);
    }
```

## RuleId[id=BoundedWildcard]
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

### BoundedWildcard
Can generalize to `? extends T`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
  }

  private <T> Optional<T> optionAsOptional(OptionSpec<T> spec) {
    if (!getOptions().has(spec)) {
      return Optional.empty();
```

### BoundedWildcard
Can generalize to `? extends Page`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
        @Nonnull BigQuery bigQuery,
        @Nonnull BigQueryConsumer<? super Dataset> consumer,
        @Nonnull BigQueryCallable<Page<Dataset>> callable)
        throws BigQueryException, IOException, InterruptedException {
      Page<Dataset> datasets = runWithBackOff(callable);
```

## RuleId[id=NullableProblems]
### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java
  public enum DefaultProperties implements ConnectorProperty {}

  @Nonnull
  public String getName();

```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java
      throws Exception;

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
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java
  public String getName();

  @Nonnull
  public String getDefaultFileName(boolean isAssessment);

```

### NullableProblems
Primitive type members cannot be annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java
  public String getDefaultFileName(boolean isAssessment);

  @Nonnull
  public void addTasksTo(@Nonnull List<? super Task<?>> out, @Nonnull ConnectorArguments arguments)
      throws Exception;
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

  @Nonnull
  public void addTasksTo(@Nonnull List<? super Task<?>> out, @Nonnull ConnectorArguments arguments)
      throws Exception;

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/Connector.java`
#### Snippet
```java

  @Nonnull
  public void addTasksTo(@Nonnull List<? super Task<?>> out, @Nonnull ConnectorArguments arguments)
      throws Exception;

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/JdbcSelectTask.java`
#### Snippet
```java
  @Override
  protected Summary doInConnection(
      @Nonnull TaskRunContext context,
      @Nonnull JdbcHandle jdbcHandle,
      @Nonnull ByteSink sink,
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/JdbcSelectTask.java`
#### Snippet
```java
  protected Summary doInConnection(
      @Nonnull TaskRunContext context,
      @Nonnull JdbcHandle jdbcHandle,
      @Nonnull ByteSink sink,
      @Nonnull Connection connection)
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/JdbcSelectTask.java`
#### Snippet
```java
      @Nonnull TaskRunContext context,
      @Nonnull JdbcHandle jdbcHandle,
      @Nonnull ByteSink sink,
      @Nonnull Connection connection)
      throws SQLException {
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/JdbcSelectTask.java`
#### Snippet
```java
      @Nonnull JdbcHandle jdbcHandle,
      @Nonnull ByteSink sink,
      @Nonnull Connection connection)
      throws SQLException {
    ResultSetExtractor<Summary> rse = newCsvResultSetExtractor(sink, -1);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/JdbcSelectTask.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(JdbcSelectTask.class);

  @Nonnull private final String sql;

  public JdbcSelectTask(@Nonnull String targetPath, @Nonnull String sql) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/UUIDGenerator.java`
#### Snippet
```java
  }

  @Nonnull private final Ticker ticker;
  private final byte[] mac = getMac();
  private final long macWord =
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java

    @Nonnull private final String name;
    @Nonnull private final ThreadLocal<? extends HiveMetastoreThriftClient> threadLocalThriftClient;
    @Nonnull private final ExecutorManager executorManager;
    @Nonnull private final ExecutorService executorService;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
    @Nonnull private final ThreadLocal<? extends HiveMetastoreThriftClient> threadLocalThriftClient;
    @Nonnull private final ExecutorManager executorManager;
    @Nonnull private final ExecutorService executorService;
    @Nonnull private final Object lock = new Object();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
    @Nonnull private final ExecutorManager executorManager;
    @Nonnull private final ExecutorService executorService;
    @Nonnull private final Object lock = new Object();

    @GuardedBy("lock")
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
  protected static class ThriftClientHandle extends AbstractHandle {

    @Nonnull private final HiveMetastoreThriftClient.Builder thriftClientBuilder;
    @Nonnegative private final int threadPoolSize;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
    }

    @Nonnull private final String name;
    @Nonnull private final ThreadLocal<? extends HiveMetastoreThriftClient> threadLocalThriftClient;
    @Nonnull private final ExecutorManager executorManager;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java
    @Nonnull private final String name;
    @Nonnull private final ThreadLocal<? extends HiveMetastoreThriftClient> threadLocalThriftClient;
    @Nonnull private final ExecutorManager executorManager;
    @Nonnull private final ExecutorService executorService;
    @Nonnull private final Object lock = new Object();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/hive/AbstractHiveConnector.java`
#### Snippet
```java

    @GuardedBy("lock")
    @Nonnull
    private final List<@NonNull HiveMetastoreThriftClient> builtClients = new ArrayList<>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
    @Nonnull private final String requestedVersionString;
    @Nonnull private String name = "unnamed-thrift-client";
    @Nonnull private String host = "localhost";
    @Nonnegative private int port;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
    @Nonnegative private int port;

    @Nonnull
    private UnavailableClientVersionBehavior unavailableClientBehavior =
        UnavailableClientVersionBehavior.FALLBACK;
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

  @Nonnull private final String name;

  public HiveMetastoreThriftClient(@Nonnull String name) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
    }

    @Nonnull private final String requestedVersionString;
    @Nonnull private String name = "unnamed-thrift-client";
    @Nonnull private String host = "localhost";
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java

    @Nonnull private final String requestedVersionString;
    @Nonnull private String name = "unnamed-thrift-client";
    @Nonnull private String host = "localhost";
    @Nonnegative private int port;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient_v2_3_6.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(HiveMetastoreThriftClient_v2_3_6.class);

  @Nonnull
  private final com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.v2_3_6
          .ThriftHiveMetastore.Client
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/test/TestUtils.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(TestUtils.class);

  @Nonnull private static final String TEST_OUTPUTS_DIR = "build" + File.separator + "test-outputs";

  /** Returns a filename in build/test-outputs, ensuring that the parent directory exists. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/DumpMetadataTask.java`
#### Snippet
```java
    implements CoreMetadataDumpFormat.CompilerWorksDumpMetadataTaskFormat {

  @Nonnull private final ConnectorArguments arguments;
  private final String format;

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
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractTask.java`
#### Snippet
```java
  @CheckForNull
  // @VisibleForTesting @ForOverride
  protected abstract T doRun(TaskRunContext context, @Nonnull ByteSink sink, @Nonnull Handle handle)
      throws Exception;

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractTask.java`
#### Snippet
```java
  @CheckForNull
  // @VisibleForTesting @ForOverride
  protected abstract T doRun(TaskRunContext context, @Nonnull ByteSink sink, @Nonnull Handle handle)
      throws Exception;

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
Overridden methods are not annotated
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ProgressMonitor.java`
#### Snippet
```java
  public static final int MEMDIV = 1024 * 1024;

  @Nonnull
  public default BlockProgressMonitor withBlockSize(@Nonnegative int blockSize) {
    return new BlockProgressMonitor(this, blockSize);
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
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
  }

  @Nonnull
  public default TaskCategory getCategory() {
    return TaskCategory.REQUIRED;
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
  }

  @Nonnull
  public String getTargetPath();

```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
  public String getTargetPath();

  @Nonnull
  public default Condition[] getConditions() {
    return Condition.EMPTY_ARRAY;
```

### NullableProblems
Overridden methods are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
    public boolean evaluate(@Nonnull TaskSetState state);

    @Nonnull
    public default String toSkipReason() {
      return "[" + this + "] was not true";
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      }

      @CheckForNull public String viewQuery;
      @CheckForNull public String timePartitioningField;
      @CheckForNull public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java

      @CheckForNull public String viewQuery;
      @CheckForNull public String timePartitioningField;
      @CheckForNull public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;
      public boolean timePartitioningRequired;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String tableType;
      @CheckForNull public List<Field> schema;
      @CheckForNull public String timePartitioningField;
      @CheckForNull public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;
      public boolean timePartitioningRequired;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      // TABLE, VIEW, EXTERNAL, (MODEL?)
      @CheckForNull public String tableType;
      @CheckForNull public List<Field> schema;
      @CheckForNull public String timePartitioningField;
      @CheckForNull public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      }

      @JsonProperty @CheckForNull
      public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String viewQuery;
      @CheckForNull public String timePartitioningField;
      @CheckForNull public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;
      public boolean timePartitioningRequired;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;
      public boolean timePartitioningRequired;
      @CheckForNull public String viewQuery;
      /** In milliseconds, since the epoch. */
      @CheckForNull public Long creationTime;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public List<Field> schema;
      @CheckForNull public String timePartitioningField;
      @CheckForNull public TimePartitioningType timePartitioningType = TimePartitioningType.DAY;
      public boolean timePartitioningRequired;
      @CheckForNull public String viewQuery;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long creationTime;
      /** In milliseconds, since the epoch. Null means the table does not expire. */
      @CheckForNull public Long expirationTime;
    }
  }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      }

      @CheckForNull public String project;
      @CheckForNull public String dataset;
      @CheckForNull public String table;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java

      @CheckForNull public String project;
      @CheckForNull public String dataset;
      @CheckForNull public String table;
      @CheckForNull public String friendlyName;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String friendlyName;
      // TABLE, VIEW, EXTERNAL, (MODEL?)
      @CheckForNull public String tableType;
      @CheckForNull public List<Field> schema;
      @CheckForNull public String timePartitioningField;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String dataset;
      @CheckForNull public String table;
      @CheckForNull public String friendlyName;
      // TABLE, VIEW, EXTERNAL, (MODEL?)
      @CheckForNull public String tableType;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String project;
      @CheckForNull public String dataset;
      @CheckForNull public String table;
      @CheckForNull public String friendlyName;
      // TABLE, VIEW, EXTERNAL, (MODEL?)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String viewQuery;
      /** In milliseconds, since the epoch. */
      @CheckForNull public Long creationTime;
      /** In milliseconds, since the epoch. Null means the table does not expire. */
      @CheckForNull public Long expirationTime;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(AbstractJdbcTask.class);

  @CheckForNull private Class<? extends Enum<?>> headerClass;

  public AbstractJdbcTask(@Nonnull String targetPath) {
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
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
  @CheckForNull
  protected abstract T doInConnection(
      @Nonnull TaskRunContext context,
      @Nonnull JdbcHandle jdbcHandle,
      @Nonnull ByteSink sink,
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
  protected abstract T doInConnection(
      @Nonnull TaskRunContext context,
      @Nonnull JdbcHandle jdbcHandle,
      @Nonnull ByteSink sink,
      @Nonnull Connection connection)
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
      @Nonnull TaskRunContext context,
      @Nonnull JdbcHandle jdbcHandle,
      @Nonnull ByteSink sink,
      @Nonnull Connection connection)
      throws SQLException;
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/AbstractJdbcTask.java`
#### Snippet
```java
      @Nonnull JdbcHandle jdbcHandle,
      @Nonnull ByteSink sink,
      @Nonnull Connection connection)
      throws SQLException;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/JdbcSelectIntervalTask.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(JdbcSelectIntervalTask.class);

  @Nonnull private final ZonedInterval interval;

  public JdbcSelectIntervalTask(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public List<FieldMetadata> fields;
      @CheckForNull public List<PartitionKeyMetadata> partitionKeys;
      @CheckForNull public List<PartitionMetadata> partitions;
    }
  }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java

      @CheckForNull public List<FieldMetadata> fields;
      @CheckForNull public List<PartitionKeyMetadata> partitionKeys;
      @CheckForNull public List<PartitionMetadata> partitions;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long rowsCount;
      @CheckForNull public Integer filesCount;
      @CheckForNull public Integer retention;
      @CheckForNull public Integer bucketsCount;
      @CheckForNull public Boolean isCompressed;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String name;
      @CheckForNull public String type;
      @CheckForNull public Integer createTime;
      @CheckForNull public Integer lastAccessTime;
      @CheckForNull public String owner;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Integer filesCount;
      @CheckForNull public Integer retention;
      @CheckForNull public Integer bucketsCount;
      @CheckForNull public Boolean isCompressed;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Integer lastDdlTime;
      @CheckForNull public Long totalSize;
      @CheckForNull public Long rawSize;
      @CheckForNull public Long rowsCount;
      @CheckForNull public Integer filesCount;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Integer retention;
      @CheckForNull public Integer bucketsCount;
      @CheckForNull public Boolean isCompressed;

      @CheckForNull public List<FieldMetadata> fields;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String viewText;
      @CheckForNull public String location;
      @CheckForNull public Integer lastDdlTime;
      @CheckForNull public Long totalSize;
      @CheckForNull public Long rawSize;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long rawSize;
      @CheckForNull public Long rowsCount;
      @CheckForNull public Integer filesCount;
      @CheckForNull public Integer retention;
      @CheckForNull public Integer bucketsCount;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Integer createTime;
      @CheckForNull public Integer lastAccessTime;
      @CheckForNull public String owner;
      @CheckForNull public String viewText;
      @CheckForNull public String location;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java

      @CheckForNull public String schemaName;
      @CheckForNull public String name;
      @CheckForNull public String type;
      @CheckForNull public Integer createTime;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      }

      @CheckForNull public String schemaName;
      @CheckForNull public String name;
      @CheckForNull public String type;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String type;
      @CheckForNull public Integer createTime;
      @CheckForNull public Integer lastAccessTime;
      @CheckForNull public String owner;
      @CheckForNull public String viewText;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long totalSize;
      @CheckForNull public Long rawSize;
      @CheckForNull public Long rowsCount;
      @CheckForNull public Integer filesCount;
      @CheckForNull public Integer retention;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String owner;
      @CheckForNull public String viewText;
      @CheckForNull public String location;
      @CheckForNull public Integer lastDdlTime;
      @CheckForNull public Long totalSize;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Integer lastAccessTime;
      @CheckForNull public String owner;
      @CheckForNull public String viewText;
      @CheckForNull public String location;
      @CheckForNull public Integer lastDdlTime;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Boolean isCompressed;

      @CheckForNull public List<FieldMetadata> fields;
      @CheckForNull public List<PartitionKeyMetadata> partitionKeys;
      @CheckForNull public List<PartitionMetadata> partitions;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String location;
      @CheckForNull public Integer lastDdlTime;
      @CheckForNull public Long totalSize;
      @CheckForNull public Long rawSize;
      @CheckForNull public Long rowsCount;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/HiveMetadataDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String schemaName;
      @CheckForNull public String name;
      @CheckForNull public String type;
      @CheckForNull public Integer createTime;
      @CheckForNull public Integer lastAccessTime;
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskGroup.java`
#### Snippet
```java

  protected void doRun(
      @Nonnull TaskRunContext context, @Nonnull CSVPrinter printer, @Nonnull Handle handle)
      throws Exception {
    for (Task<?> task : tasks) {
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskGroup.java`
#### Snippet
```java

  protected void doRun(
      @Nonnull TaskRunContext context, @Nonnull CSVPrinter printer, @Nonnull Handle handle)
      throws Exception {
    for (Task<?> task : tasks) {
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/TaskGroup.java`
#### Snippet
```java

  protected void doRun(
      @Nonnull TaskRunContext context, @Nonnull CSVPrinter printer, @Nonnull Handle handle)
      throws Exception {
    for (Task<?> task : tasks) {
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeMetadataConnector.java`
#### Snippet
```java
  @ForOverride
  protected void addSqlTasks(
      @Nonnull List<? super Task<?>> out,
      @Nonnull Class<? extends Enum<?>> header,
      @Nonnull String format,
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeMetadataConnector.java`
#### Snippet
```java
  protected void addSqlTasks(
      @Nonnull List<? super Task<?>> out,
      @Nonnull Class<? extends Enum<?>> header,
      @Nonnull String format,
      @Nonnull TaskVariant is_task,
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeMetadataConnector.java`
#### Snippet
```java
      @Nonnull List<? super Task<?>> out,
      @Nonnull Class<? extends Enum<?>> header,
      @Nonnull String format,
      @Nonnull TaskVariant is_task,
      @Nonnull TaskVariant au_task) {
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeMetadataConnector.java`
#### Snippet
```java
      @Nonnull Class<? extends Enum<?>> header,
      @Nonnull String format,
      @Nonnull TaskVariant is_task,
      @Nonnull TaskVariant au_task) {
    Task<?> t0 =
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeMetadataConnector.java`
#### Snippet
```java
      @Nonnull String format,
      @Nonnull TaskVariant is_task,
      @Nonnull TaskVariant au_task) {
    Task<?> t0 =
        new JdbcSelectTask(
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
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    class LoadJobConfiguration {
      @CheckForNull public List<String> sourceUris;
      @CheckForNull public String sourceFormat;
      @CheckForNull public String createDisposition;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String project;
      /** The default dataset in which the job was executed. */
      @CheckForNull public String defaultDataset;

      @CheckForNull public String userEmail;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
    class QueryStatistics {

      @CheckForNull public Integer billingTier;
      @CheckForNull public Boolean cacheHit;
      @CheckForNull public Long estimatedBytesProcessed;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Map<String, String> labels;
      @CheckForNull public String userEmail;
      @CheckForNull public JobStatus jobStatus;
      /** In milliseconds since epoch. */
      @CheckForNull public Long startTime;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
    class Job {

      @CheckForNull public String project;
      @CheckForNull public String job;
      @CheckForNull public Map<String, String> labels;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public TableId destinationTable;
      @CheckForNull public String createDisposition;
      @CheckForNull public String writeDisposition;

      // What were the statistics
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

      /** From JobStatus.BigQueryError. */
      @CheckForNull public String message;
      /** From JobStatus.BigQueryError. */
      @CheckForNull public String reason;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    class LoadStatistics {
      @CheckForNull public Long badRecords;
      @CheckForNull public Long inputBytes;
      @CheckForNull public Long inputFiles;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

      /** The project in which the job was executed. */
      @CheckForNull public String project;
      /** The default dataset in which the job was executed. */
      @CheckForNull public String defaultDataset;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

      @CheckForNull public String project;
      @CheckForNull public String job;
      @CheckForNull public Map<String, String> labels;
      @CheckForNull public String userEmail;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

      @CheckForNull public String userEmail;
      @CheckForNull public String query;

      // Where the data is written.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String project;
      @CheckForNull public String dataset;
      @CheckForNull public String table;
    }

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String writeDisposition;
      // Where the data is loaded.
      @CheckForNull public TableId destinationTable;

      @CheckForNull public LoadStatistics statistics;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

      @CheckForNull public String project;
      @CheckForNull public String dataset;
      @CheckForNull public String table;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public TableId destinationTable;

      @CheckForNull public LoadStatistics statistics;
    }

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

      // Where the data is written.
      @CheckForNull public TableId destinationTable;
      @CheckForNull public String createDisposition;
      @CheckForNull public String writeDisposition;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
    class LoadStatistics {
      @CheckForNull public Long badRecords;
      @CheckForNull public Long inputBytes;
      @CheckForNull public Long inputFiles;
      @CheckForNull public Long outputBytes;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String project;
      @CheckForNull public String job;
      @CheckForNull public Map<String, String> labels;
      @CheckForNull public String userEmail;
      @CheckForNull public JobStatus jobStatus;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Boolean cacheHit;
      @CheckForNull public Long estimatedBytesProcessed;
      @CheckForNull public Long totalBytesBilled;
      @CheckForNull public Long totalBytesProcessed;
      @CheckForNull public Long totalSlotMilliseconds;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long totalSlotMilliseconds;
      @CheckForNull public Long dmlAffectedRowCount;
      @CheckForNull public Long totalPartitionsProcessed;
    }

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long totalBytesBilled;
      @CheckForNull public Long totalBytesProcessed;
      @CheckForNull public Long totalSlotMilliseconds;
      @CheckForNull public Long dmlAffectedRowCount;
      @CheckForNull public Long totalPartitionsProcessed;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public ExtractJobConfiguration extractJobConfiguration;
      @CheckForNull public LoadJobConfiguration loadJobConfiguration;
      @CheckForNull public QueryJobConfiguration queryJobConfiguration;
    }
  }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

      @CheckForNull public Integer billingTier;
      @CheckForNull public Boolean cacheHit;
      @CheckForNull public Long estimatedBytesProcessed;
      @CheckForNull public Long totalBytesBilled;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
    class LoadJobConfiguration {
      @CheckForNull public List<String> sourceUris;
      @CheckForNull public String sourceFormat;
      @CheckForNull public String createDisposition;
      @CheckForNull public String writeDisposition;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      // Where the data is written.
      @CheckForNull public TableId destinationTable;
      @CheckForNull public String createDisposition;
      @CheckForNull public String writeDisposition;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long startTime;
      /** In milliseconds since epoch. */
      @CheckForNull public Long endTime;

      @CheckForNull public CopyJobConfiguration copyJobConfiguration;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long endTime;

      @CheckForNull public CopyJobConfiguration copyJobConfiguration;
      @CheckForNull public ExtractJobConfiguration extractJobConfiguration;
      @CheckForNull public LoadJobConfiguration loadJobConfiguration;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long inputBytes;
      @CheckForNull public Long inputFiles;
      @CheckForNull public Long outputBytes;
      @CheckForNull public Long outputRows;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String sourceFormat;
      @CheckForNull public String createDisposition;
      @CheckForNull public String writeDisposition;
      // Where the data is loaded.
      @CheckForNull public TableId destinationTable;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String message;
      /** From JobStatus.BigQueryError. */
      @CheckForNull public String reason;
    }

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long inputFiles;
      @CheckForNull public Long outputBytes;
      @CheckForNull public Long outputRows;
    }

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
    class TableId {

      @CheckForNull public String project;
      @CheckForNull public String dataset;
      @CheckForNull public String table;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public CopyJobConfiguration copyJobConfiguration;
      @CheckForNull public ExtractJobConfiguration extractJobConfiguration;
      @CheckForNull public LoadJobConfiguration loadJobConfiguration;
      @CheckForNull public QueryJobConfiguration queryJobConfiguration;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public List<String> sourceUris;
      @CheckForNull public String sourceFormat;
      @CheckForNull public String createDisposition;
      @CheckForNull public String writeDisposition;
      // Where the data is loaded.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Integer billingTier;
      @CheckForNull public Boolean cacheHit;
      @CheckForNull public Long estimatedBytesProcessed;
      @CheckForNull public Long totalBytesBilled;
      @CheckForNull public Long totalBytesProcessed;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public JobStatus jobStatus;
      /** In milliseconds since epoch. */
      @CheckForNull public Long startTime;
      /** In milliseconds since epoch. */
      @CheckForNull public Long endTime;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String job;
      @CheckForNull public Map<String, String> labels;
      @CheckForNull public String userEmail;
      @CheckForNull public JobStatus jobStatus;
      /** In milliseconds since epoch. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long badRecords;
      @CheckForNull public Long inputBytes;
      @CheckForNull public Long inputFiles;
      @CheckForNull public Long outputBytes;
      @CheckForNull public Long outputRows;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

      @CheckForNull public CopyJobConfiguration copyJobConfiguration;
      @CheckForNull public ExtractJobConfiguration extractJobConfiguration;
      @CheckForNull public LoadJobConfiguration loadJobConfiguration;
      @CheckForNull public QueryJobConfiguration queryJobConfiguration;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public String defaultDataset;

      @CheckForNull public String userEmail;
      @CheckForNull public String query;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long totalBytesProcessed;
      @CheckForNull public Long totalSlotMilliseconds;
      @CheckForNull public Long dmlAffectedRowCount;
      @CheckForNull public Long totalPartitionsProcessed;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java
      @CheckForNull public Long estimatedBytesProcessed;
      @CheckForNull public Long totalBytesBilled;
      @CheckForNull public Long totalBytesProcessed;
      @CheckForNull public Long totalSlotMilliseconds;
      @CheckForNull public Long dmlAffectedRowCount;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/lib-dumper-spi/src/main/java/com/google/edwmigration/dumper/plugin/lib/dumper/spi/BigQueryLogsDumpFormat.java`
#### Snippet
```java

      // What were the statistics
      @CheckForNull public QueryStatistics statistics;
    }

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/SnowflakeLogsConnector.java`
#### Snippet
```java

  @ForOverride
  protected String newQueryFormat(@Nonnull ConnectorArguments arguments)
      throws MetadataDumperUsageException {
    // Docref: https://docs.snowflake.net/manuals/sql-reference/functions/query_history.html
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataUtilityLogsJdbcTask.java`
#### Snippet
```java
  private final SharedState state;
  private final String utilityTable;
  @Nonnull private final ZonedInterval interval;

  protected TeradataUtilityLogsJdbcTask(
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
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient_Superset.java`
#### Snippet
```java
      LoggerFactory.getLogger(HiveMetastoreThriftClient_Superset.class);

  @Nonnull
  private final com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset
          .ThriftHiveMetastore.Client
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/DefaultArguments.java`
#### Snippet
```java

  // Any description starting with UNDOCUMENTED: is ... undocumented
  protected void printHelpOn(@Nonnull PrintStream out, OptionSet o) throws IOException {

    BuiltinHelpFormatter helpFormatter =
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/ArgumentsTask.java`
#### Snippet
```java
public class ArgumentsTask extends AbstractTask<Void> {

  @Nonnull private final ConnectorArguments arguments;

  public ArgumentsTask(String targetPath, @Nonnull ConnectorArguments arguments) {
```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java

    @ForOverride
    protected abstract void run(@Nonnull Writer writer, @Nonnull BigQuery bigQuery)
        throws Exception;

```

### NullableProblems
Overridden method parameters are not annotated
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java

    @ForOverride
    protected abstract void run(@Nonnull Writer writer, @Nonnull BigQuery bigQuery)
        throws Exception;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java

        @CheckForNull private Page<T> currentPage;
        @Nonnull private Iterator<T> currentPageIterator;

        Itr(@Nonnull Page<T> currentPage) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
      private static class Itr<T> extends UnmodifiableIterator<T> {

        @CheckForNull private Page<T> currentPage;
        @Nonnull private Iterator<T> currentPageIterator;

```

## RuleId[id=UnusedLabel]
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

### UnusedLabel
Unused label `CHECK`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
      throws MetadataDumperUsageException {
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
Unused label `DESTINATION`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryLogsConnector.java`
#### Snippet
```java
      outConfiguration.query = queryJobConfiguration.getQuery();

      DESTINATION:
      {
        outConfiguration.createDisposition =
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

## RuleId[id=RedundantSuppression]
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

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
        if (outputFile.exists()) {
          if (!arguments.isOutputContinue())
            outputFile.delete(); // It's a simple file, and we were asked to overwrite it.
        } else {
          Files.createParentDirs(outputFile);
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'interval'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Summary.java`
#### Snippet
```java
  private final long rowCount;

  private Optional<ZonedInterval> interval;

  /* pp */ Summary(long rowCount) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'tableAlias'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataUtils.java`
#### Snippet
```java
  }

  private static String createTimestampExpression(Optional<String> tableAlias, String columnName) {
    Preconditions.checkArgument(!columnName.isEmpty(), "Column name must not be empty.");
    Preconditions.checkArgument(
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'maxRowCountMaybe'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataMetadataConnector.java`
#### Snippet
```java

  private static void appendSelect(
      StringBuilder query, OptionalLong maxRowCountMaybe, String selectBody, String orderBy) {
    query.append(" SELECT ");
    maxRowCountMaybe.ifPresent(
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/ZonedIntervalIterable.java`
#### Snippet
```java

    final int daysToExport = arguments.getQueryLogDays(7);
    if (daysToExport <= 0)
      throw new MetadataDumperUsageException(
          "At least one day of query logs should be exported; you specified: " + daysToExport);
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
  public int getQueryLogDays(@Nonnegative int defaultQueryLogDays) {
    Integer out = getQueryLogDays();
    if (out != null) return out.intValue();
    return defaultQueryLogDays;
  }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
  public int getPort(@Nonnegative int defaultPort) {
    Integer customPort = getPort();
    if (customPort != null) return customPort.intValue();
    return defaultPort;
  }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
          "Output, including debugging information, has been saved to " + outputFile);
      if (exitOnError) {
        System.out.println(STARS);
        System.exit(1);
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

  private void print(@Nonnull Task<?> task, int indent) {
    System.out.println(StringUtils.repeat("  ", indent) + task);
    if (task instanceof TaskGroup) {
      for (Task<?> subtask : ((TaskGroup) task).getTasks()) print(subtask, indent + 1);
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
      checkRequiredTaskSuccess(state, outputFile);
      logStatusSummary(state);
      System.out.println(STARS);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

  private void log(List<String> lines) {
    System.out.println(STARS);
    lines.stream().map(s -> "* " + s).forEach(System.out::println);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
  private void log(List<String> lines) {
    System.out.println(STARS);
    lines.stream().map(s -> "* " + s).forEach(System.out::println);
  }

```

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
      System.err.println(
          new ProductMetadata().getModule(PRODUCT_GROUP + ":" + PRODUCT_CORE_MODULE));
      System.exit(1);
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `QueryLogsTask` is the same as one of its superclass' names
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryLogsConnector.java`
#### Snippet
```java
  private static final boolean DEBUG = false;

  public static class QueryLogsTask extends AbstractBigQueryTask
      implements BigQueryLogsDumpFormat.QueryLogsTask {

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/RedshiftLogsConnector.java`
#### Snippet
```java
    for (ZonedInterval interval : intervals) {
      String query =
          queryTemplate.replace(
              "##",
              newWhereClause(
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Task.java`
#### Snippet
```java
      return "\n    If "
          + taskState.toString()
          + (" Then\n  " + task.toString()).replaceAll("\n", "\n    ");
    }
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataUtils.java`
#### Snippet
```java
   */
  static String formatQuery(String query) {
    return query.replaceAll("\\s+", " ").replaceAll("\\( ", "(").replaceAll(" \\)", ")").trim();
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataUtils.java`
#### Snippet
```java
   */
  static String formatQuery(String query) {
    return query.replaceAll("\\s+", " ").replaceAll("\\( ", "(").replaceAll(" \\)", ")").trim();
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataUtils.java`
#### Snippet
```java
   */
  static String formatQuery(String query) {
    return query.replaceAll("\\s+", " ").replaceAll("\\( ", "(").replaceAll(" \\)", ")").trim();
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/generic/GenericConnector.java`
#### Snippet
```java
        String finalQuery =
            this.query
                .replace("{period-start}", "'" + SQL_FORMAT.format(interval.getStart()) + "'")
                .replace("{period-end}", "'" + SQL_FORMAT.format(interval.getEndInclusive()) + "'");
        String finalFile =
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/generic/GenericConnector.java`
#### Snippet
```java
            this.query
                .replace("{period-start}", "'" + SQL_FORMAT.format(interval.getStart()) + "'")
                .replace("{period-end}", "'" + SQL_FORMAT.format(interval.getEndInclusive()) + "'");
        String finalFile =
            this.entryName.replace(
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/generic/GenericConnector.java`
#### Snippet
```java
                .replace("{period-end}", "'" + SQL_FORMAT.format(interval.getEndInclusive()) + "'");
        String finalFile =
            this.entryName.replace(
                "{period}", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(interval.getStartUTC()));
        out.add(new JdbcSelectTask(finalFile, finalQuery));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/RedshiftRawLogsConnector.java`
#### Snippet
```java
    for (ZonedInterval interval : intervals) {
      String query =
          queryTemplate.replace(
              "##",
              newWhereClause(
```

## RuleId[id=NestedAssignment]
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

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`url = url + database` could be simplified to 'url += database'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/vertica/AbstractVerticaConnector.java`
#### Snippet
```java
      String database = Iterables.getFirst(arguments.getDatabases(), null);
      url = "jdbc:vertica://" + host + ":" + port + "/";
      if (database != null) url = url + database;
    }

```

### ReplaceAssignmentWithOperatorAssignment
`url = url + database` could be simplified to 'url += database'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/postgresql/AbstractPostgresqlConnector.java`
#### Snippet
```java
      String database = Iterables.getFirst(arguments.getDatabases(), null);
      url = "jdbc:postgresql://" + host + ":" + port + "/";
      if (database != null) url = url + database;
    }

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
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
Constructor `AbstractSnowflakeConnector()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/snowflake/AbstractSnowflakeConnector.java`
#### Snippet
```java
public abstract class AbstractSnowflakeConnector extends AbstractJdbcConnector {

  public AbstractSnowflakeConnector(@Nonnull String name) {
    super(name);
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
  protected abstract static class AbstractHiveTask extends AbstractTask<Void> {

    public AbstractHiveTask(String targetPath) {
      super(targetPath);
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
Constructor `HiveMetastoreThriftClient()` of an abstract class should not be declared 'public'
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
  @Nonnull private final String name;

  public HiveMetastoreThriftClient(@Nonnull String name) {
    this.name = Preconditions.checkNotNull(name, "name was null.");
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
  @CheckForNull private Class<? extends Enum<?>> headerClass;

  public AbstractJdbcTask(@Nonnull String targetPath) {
    super(targetPath);
  }
```

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
Constructor `Teradata14LogsJdbcTask()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/Teradata14LogsConnector.java`
#### Snippet
```java
    protected final List<String> orderBy;

    public Teradata14LogsJdbcTask(
        @Nonnull String targetPath,
        SharedState state,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractBigQueryMetadataTask()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
    private final Predicate<? super String> schemaPredicate;

    public AbstractBigQueryMetadataTask(
        String targetPath,
        @Nonnull List<? extends String> databaseList,
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
Constructor `AbstractBigQueryTask()` of an abstract class should not be declared 'public'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
    }

    public AbstractBigQueryTask(@Nonnull String targetPath) {
      super(targetPath);
    }
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new PrivilegedExceptionAction() can be replaced with lambda
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/AbstractJdbcConnector.java`
#### Snippet
```java
    final URL[] urls_array = urls.toArray(new URL[0]);
    return AccessController.doPrivileged(
        new PrivilegedExceptionAction<ClassLoader>() {
          @Override
          public ClassLoader run() throws Exception {
```

### Convert2Lambda
Anonymous new PrivilegedExceptionAction\>() can be replaced with lambda
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/AbstractJdbcConnector.java`
#### Snippet
```java
      throws PrivilegedActionException {
    return AccessController.doPrivileged(
        new PrivilegedExceptionAction<Class<?>>() {
          @Override
          public Class<?> run() throws Exception {
```

### Convert2Lambda
Anonymous new PrivilegedAction() can be replaced with lambda
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/test/SystemPropertyValue.java`
#### Snippet
```java
  public static boolean get(@Nonnull String name) {
    return AccessController.doPrivileged(
        new PrivilegedAction<Boolean>() {
          @Override
          public Boolean run() {
```

### Convert2Lambda
Anonymous new ResultSetExtractor\>() can be replaced with lambda
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/netezza/NetezzaMetadataConnector.java`
#### Snippet
```java
    protected ResultSetExtractor<List<String>> newResultSetExtractor(
        @Nonnull ByteSink sink, @Nonnull JdbcHandle handle) {
      return new ResultSetExtractor<List<String>>() {
        @Override
        public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
```

### Convert2Lambda
Anonymous new Callable\>\>() can be replaced with lambda
in `dumper/lib-ext-bigquery/src/main/java/com/google/cloud/bigquery/BigQueryAccessor.java`
#### Snippet
```java
    Tuple<String, Iterable<com.google.api.services.bigquery.model.Job>> result =
        runWithRetries(
            new Callable<Tuple<String, Iterable<com.google.api.services.bigquery.model.Job>>>() {
              @Override
              public Tuple<String, Iterable<com.google.api.services.bigquery.model.Job>> call() {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `dumper/lib-ext-bigquery/src/main/java/com/google/cloud/bigquery/BigQueryAccessor.java`
#### Snippet
```java
        Iterables.transform(
            result.y(),
            new Function<com.google.api.services.bigquery.model.Job, Job>() {
              @Override
              public Job apply(com.google.api.services.bigquery.model.Job job) {
```

### Convert2Lambda
Anonymous new IntUnaryOperator() can be replaced with lambda
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/concurrent/ExecutorManager.java`
#### Snippet
```java

  private static final IntUnaryOperator DECREMENT_IF_AVAILABLE =
      new IntUnaryOperator() {
        @Override
        public int applyAsInt(int operand) {
```

## RuleId[id=UnnecessaryBreak]
### UnnecessaryBreak
`break` statement is unnecessary
in `dumper/lib-common/src/testFixtures/java/com/google/edwmigration/dumper/common/UUIDGenerator.java`
#### Snippet
```java
      byte[] data = getMacOrNull();
      if (data != null) return data;
      break IFACE;
    } catch (Exception e) {
      // Notionally, this is an IOException, but it might also be an (unexpected) SecurityException
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
    }

    private static void addExternalTable(
        @Nonnull Metadata metadata, @Nonnull ExternalTableDefinition in) {
      // in.getSourceUris();
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/HiveMetastoreThriftClient.java`
#### Snippet
```java
        UnavailableClientVersionBehavior.FALLBACK;

    private boolean debug = false;

    public Builder(@Nonnull String version) {
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
          .ofType(String.class)
          .describedAs("define");
  private Map<String, String> definitionMap = null;

  // because of quoting of special characeters on command line... the -password is made optional,
```

## RuleId[id=AssignmentToMethodParameter]
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

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
    try {
      MetadataDumper main = new MetadataDumper();
      args = JsonResponseFile.addResponseFiles(args);
      // LOG.debug("Arguments are: [" + String.join("] [", args) + "]");
      // Without this, the dumper prints "Missing required arguments:[connector]"
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
      // Without this, the dumper prints "Missing required arguments:[connector]"
      if (args.length == 0) {
        args = new String[] {"--help"};
      }
      main.run(args);
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

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/task/Summary.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class Summary {

  /*
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
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

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `printer`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
      }
      DatasetId datasetId = dataset.getDatasetId();
      synchronized (printer) {
        printer.printRecord(
            datasetId.getProject(),
```

## RuleId[id=ReturnNull]
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

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
    } catch (Exception e) {
      // MetadataDumperUsageException should be fatal.
      if (e instanceof MetadataDumperUsageException) throw (MetadataDumperUsageException) e;
      if (e instanceof SQLException && e.getCause() instanceof MetadataDumperUsageException)
        throw (MetadataDumperUsageException) e.getCause();
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
      // MetadataDumperUsageException should be fatal.
      if (e instanceof MetadataDumperUsageException) throw (MetadataDumperUsageException) e;
      if (e instanceof SQLException && e.getCause() instanceof MetadataDumperUsageException)
        throw (MetadataDumperUsageException) e.getCause();
      // TaskGroup is an attempt to get rid of this condition.
```

## RuleId[id=UnnecessaryLocalVariable]
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
Local variable `sql` is redundant
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/teradata/TeradataLogsJdbcTask.java`
#### Snippet
```java
    Predicate<String> predicate =
        expression -> state.expressionValidity.computeIfAbsent(expression, validator);
    String sql = getSql(predicate);
    // LOG.debug("SQL is " + sql);
    return sql;
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/JsonResponseFile.java`
#### Snippet
```java
  @VisibleForTesting
  /* pp */ static List<? extends String> to_arguments(@Nonnull String text)
      throws IOException, JsonProcessingException {
    return convert(newObjectMapper().readTree(text));
  }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/AbstractJdbcConnector.java`
#### Snippet
```java
      urls.add(u);
    }
    final URL[] urls_array = urls.toArray(new URL[0]);
    return AccessController.doPrivileged(
        new PrivilegedExceptionAction<ClassLoader>() {
```

## RuleId[id=BusyWait]
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

## RuleId[id=UnusedAssignment]
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

## RuleId[id=ConstantValue]
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
Condition `driverClass != null` is always `true`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/AbstractJdbcConnector.java`
#### Snippet
```java
          try {
            driverClass = newDriverClass(driverClassLoader, driverClassName);
            if (driverClass != null) break CLASS;
          } catch (PrivilegedActionException e) {
            if (e.getCause() instanceof ClassNotFoundException)
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
Condition `val == null` is always `false`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/JdbcPropBuilder.java`
#### Snippet
```java
  public JdbcPropBuilder prop(@Nonnull String prop, @Nonnull String val)
      throws UnsupportedEncodingException {
    if (val == null) {
      throw new InternalError("Not checked for null: " + val);
    } else {
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
Condition is always false
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/redshift/RedshiftLogsConnector.java`
#### Snippet
```java
        parallelTask);

    if (false) {
      // Metric Dance.... S3 logs has xid ..  .. so Above wil have to be used to map xid's to query
      //  1. SVL_QUERY_METRICS doesn't have starttime
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
Result of `Boolean.parseBoolean(OPT_HIVE_METASTORE_DUMP_PARTITION_METADATA_DEFAULT)` is always 'true'
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
          .withOptionalArg()
          .withValuesConvertedBy(BooleanValueConverter.INSTANCE)
          .defaultsTo(Boolean.parseBoolean(OPT_HIVE_METASTORE_DUMP_PARTITION_METADATA_DEFAULT));

  // Threading / Pooling
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
        LOG_LIMITED.warn(
```

### ConstantValue
Condition `dataset == null` is always `false`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/BigQueryMetadataConnector.java`
#### Snippet
```java
                      BigQuery.DatasetOption.fields(
                          BigQuery.DatasetField.FRIENDLY_NAME, BigQuery.DatasetField.LOCATION)));
      if (dataset == null) {
        // contractually non-null, but null seen during testing
        LOG_LIMITED.warn(
```

### ConstantValue
Condition `currentPage == null` is always `false`
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/connector/bigquery/AbstractBigQueryConnector.java`
#### Snippet
```java
                    HttpStatusCodes.STATUS_CODE_CONFLICT, "Interrupted while retrying: " + e, e);
              }
              if (currentPage == null) {
                return false;
              }
```

## RuleId[id=UnstableApiUsage]
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

### UnstableApiUsage
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `dumper/lib-ext-hive-metastore/src/main/java/com/google/edwmigration/dumper/ext/hive/metastore/utils/PartitionNameGenerator.java`
#### Snippet
```java
   */
  public static String makePartitionName(List<String> partitionKeys, List<String> partitionValues) {
    return Streams.zip(
            partitionKeys.stream(),
            partitionValues.stream(),
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
'com.google.common.io.Closer' is marked unstable with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

      LOG.info("Using " + connector);
      try (Closer closer = Closer.create()) {

        if (outputFile.exists()) {
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

      LOG.info("Using " + connector);
      try (Closer closer = Closer.create()) {

        if (outputFile.exists()) {
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java

      LOG.info("Using " + connector);
      try (Closer closer = Closer.create()) {

        if (outputFile.exists()) {
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
                .build();
        FileSystem fileSystem =
            closer.register(FileSystems.newFileSystem(outputUri, fileSystemProperties));
        OutputHandleFactory sinkFactory =
            new FileSystemOutputHandleFactory(fileSystem, "/"); // It's required to be "/"
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/MetadataDumper.java`
#### Snippet
```java
        LOG.debug("Target filesystem is " + sinkFactory);

        Handle handle = closer.register(connector.open(arguments));

        TaskRunContext runContext =
```

### UnstableApiUsage
'getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor)' is marked unstable with @Beta
in `dumper/lib-common/src/main/java/com/google/edwmigration/dumper/plugin/ext/jdk/progress/ConcurrentRecordProgressMonitor.java`
#### Snippet
```java
            .build();
    private static final ScheduledExecutorService EXECUTOR_SERVICE =
        MoreExecutors.getExitingScheduledExecutorService(
            new ScheduledThreadPoolExecutor(1, THREAD_FACTORY));
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

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `Appendable.append()` call
in `dumper/app/src/main/java/com/google/edwmigration/dumper/application/dumper/ConnectorArguments.java`
#### Snippet
```java
      throws IOException {
    Description description = connector.getClass().getAnnotation(Description.class);
    out.append("* " + connector.getName());
    if (description != null) out.append(" - ").append(description.value());
    out.append("\n");
```
