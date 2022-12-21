# incubator-streampark 
 
# Bad smells
I found 46 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 10 | false |
| RedundantImplements | 9 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 6 | false |
| RedundantFieldInitialization | 5 | false |
| SynchronizeOnThis | 2 | false |
| FieldMayBeStatic | 1 | false |
| ImplicitArrayToString | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| NestedAssignment | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| InstanceofCatchParameter | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| NonFinalFieldOfException | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| TrivialStringConcatenation | 1 | false |
| BusyWait | 1 | false |
| BoundedWildcard | 1 | false |
## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `timeout` may be 'static'
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java

    private final Map<String, DorisSinkBufferEntry> bufferMap = new ConcurrentHashMap<>();
    private final Long timeout = 3000L;
    private volatile boolean closed = false;
    private volatile boolean flushThreadAlive = false;
```

## RuleId[ruleID=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array returned by call to `data.getDataRows()`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkFunction.java`
#### Snippet
```java
            DorisSinkRowDataWithMeta data = (DorisSinkRowDataWithMeta) value;
            if (Strings.isNullOrEmpty(data.getDatabase()) || Strings.isNullOrEmpty(data.getTable()) || null == data.getDataRows()) {
                LOGGER.warn(String.format(" row data not fullfilled. {database: %s, table: %s, dataRows: %s}", data.getDatabase(), data.getTable(), data.getDataRows()));
                return;
            }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DorisDelimiterParser` has only 'static' members, and lacks a 'private' constructor
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/util/DorisDelimiterParser.java`
#### Snippet
```java
import java.io.StringWriter;

public class DorisDelimiterParser {

    private static final String HEX_STRING = "0123456789ABCDEF";
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java

    public String createLabel() {
        return String.format("%s_%s_%s", labelPrefix, System.currentTimeMillis(), UUID.randomUUID().toString().replaceAll("-", ""));
    }
}
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java

    public String reGenerateLabel() {
        return label = createLabel();
    }

```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `batchCount` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java

    private ArrayList<byte[]> buffer = new ArrayList<>();
    private int batchCount = 0;
    private long batchSize = 0;
    private String label;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `batchSize` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java
    private ArrayList<byte[]> buffer = new ArrayList<>();
    private int batchCount = 0;
    private long batchSize = 0;
    private String label;
    private String database;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `label` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java
    private int batchCount = 0;
    private long batchSize = 0;
    private String label;
    private String database;
    private String table;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java
    }

    private ArrayList<byte[]> buffer = new ArrayList<>();
    private int batchCount = 0;
    private long batchSize = 0;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scheduledFuture` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java

    private ScheduledExecutorService schedule;
    private ScheduledFuture<?> scheduledFuture;

    private transient Counter totalFlushBytes;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `schedule` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
    private final DorisStreamLoader streamLoader;

    private ScheduledExecutorService schedule;
    private ScheduledFuture<?> scheduledFuture;

```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-jdbc/src/main/scala/org/apache/streampark/flink/connector/jdbc/source/JdbcJavaSource.java`
#### Snippet
```java
    private final StreamingContext context;
    private Properties jdbc;
    private String alias = null;

    public JdbcJavaSource(StreamingContext context) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java

    private ArrayList<byte[]> buffer = new ArrayList<>();
    private int batchCount = 0;
    private long batchSize = 0;
    private String label;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java
    private ArrayList<byte[]> buffer = new ArrayList<>();
    private int batchCount = 0;
    private long batchSize = 0;
    private String label;
    private String database;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
    private final Map<String, DorisSinkBufferEntry> bufferMap = new ConcurrentHashMap<>();
    private final Long timeout = 3000L;
    private volatile boolean closed = false;
    private volatile boolean flushThreadAlive = false;
    private volatile Throwable flushException;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
    private final Long timeout = 3000L;
    private volatile boolean closed = false;
    private volatile boolean flushThreadAlive = false;
    private volatile Throwable flushException;

```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisStreamLoader.java`
#### Snippet
```java
                            return;
                        case LAEBL_STATE_COMMITTED:
                            return;
                        case RESULT_LABEL_PREPARE:
                            continue;
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `DorisSinkWriter` on 'this' is unnecessary in this context
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
        this.schedule = Executors.newScheduledThreadPool(1, ThreadUtils.threadFactory("doris-interval-sink"));
        this.scheduledFuture = this.schedule.schedule(() -> {
            synchronized (DorisSinkWriter.this) {
                if (!closed) {
                    try {
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/Semantic.java`
#### Snippet
```java
import java.io.Serializable;

public enum Semantic implements Serializable {

    /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/DevelopmentMode.java`
#### Snippet
```java
import java.io.Serializable;

public enum DevelopmentMode implements Serializable {

    /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ClusterState.java`
#### Snippet
```java
 * @since: 1.2.3
 */
public enum ClusterState implements Serializable {
    /**
     * The cluster was just created but not started
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ResolveOrder.java`
#### Snippet
```java
 * classloader.resolve-order
 */
public enum ResolveOrder implements Serializable {
    /**
     * parent-first
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkK8sRestExposedType.java`
#### Snippet
```java
 * kubernetes.rest-service.exposed.type
 */
public enum FlinkK8sRestExposedType implements Serializable {

    /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/StorageType.java`
#### Snippet
```java
import java.io.Serializable;

public enum StorageType implements Serializable {

    /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkSqlValidationFailedType.java`
#### Snippet
```java
import java.io.Serializable;

public enum FlinkSqlValidationFailedType implements Serializable {
    /**
     * Basic test failed (such as null, etc.)
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ApplicationType.java`
#### Snippet
```java
import java.io.Serializable;

public enum ApplicationType implements Serializable {
    /**
     * StreamPark Flink
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ExecutionMode.java`
#### Snippet
```java
import java.util.List;

public enum ExecutionMode implements Serializable {

    /**
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
                    throw e;
                }
                if (e instanceof LoadStatusFailedException && ((LoadStatusFailedException) e).needReCreateLabel()) {
                    String oldLabel = flushData.getLabel();
                    flushData.reGenerateLabel();
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/Semantic.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/DevelopmentMode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ClusterState.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ResolveOrder.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkK8sRestExposedType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkSqlValidationFailedType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ApplicationType.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ExecutionMode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ExecutionMode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisStreamLoader.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`sp.length() == 0` can be replaced with 'sp.isEmpty()'
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/util/DorisDelimiterParser.java`
#### Snippet
```java

    public static String parse(String sp) throws RuntimeException {
        if (sp == null || sp.length() == 0) {
            throw new RuntimeException("Delimiter can't be empty");
        }
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-hbase/src/main/scala/org/apache/streampark/flink/connector/hbase/bean/HBaseQuery.java`
#### Snippet
```java
    public Table getTable(Properties prop) {
        if (htable == null) {
            synchronized (HBaseQuery.class) {
                if (htable == null) {
                    htable = HBaseClient.apply(prop).table(this.getTable());
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
        this.schedule = Executors.newScheduledThreadPool(1, ThreadUtils.threadFactory("doris-interval-sink"));
        this.scheduledFuture = this.schedule.schedule(() -> {
            synchronized (DorisSinkWriter.this) {
                if (!closed) {
                    try {
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `reCreateLabel` of exception class
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/LoadStatusFailedException.java`
#### Snippet
```java
    static final long serialVersionUID = 1L;
    private final Map<String, Object> response;
    private boolean reCreateLabel;

    public LoadStatusFailedException(String message, Map<String, Object> response) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkRowDataWithMeta.java`
#### Snippet
```java

    public String[] getDataRows() {
        return dataRows.toArray(new String[]{});
    }

```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisStreamLoader.java`
#### Snippet
```java
            properties.forEach((k, v) -> put.setHeader(k.toString(), v.toString()));
            if (properties.containsKey("columns")) {
                put.setHeader("timeout", dorisConfig.timeout() + "");
            }
            put.setHeader(HttpHeaders.EXPECT, "100-continue");
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
            }
            try {
                Thread.sleep(1000L * (i + 1));
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends DorisSinkBufferEntry`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
    }

    public void setBufferedBatchMap(Map<String, DorisSinkBufferEntry> newBufferMap) {
        if (Semantic.EXACTLY_ONCE.equals(semantic)) {
            bufferMap.clear();
```

