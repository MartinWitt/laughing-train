# Availability-Monitor-for-Kafka 
 
# Bad smells
I found 188 bad smells with 21 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 44 | false |
| MissortedModifiers | 17 | false |
| UnnecessaryModifier | 10 | true |
| UnusedAssignment | 10 | false |
| UNUSED_IMPORT | 8 | false |
| BoundedWildcard | 7 | false |
| UtilityClassWithoutPrivateConstructor | 6 | true |
| UnnecessaryBoxing | 6 | false |
| CatchMayIgnoreException | 5 | false |
| ReplaceAssignmentWithOperatorAssignment | 5 | false |
| BusyWait | 5 | false |
| CastCanBeRemovedNarrowingVariableType | 5 | false |
| CommentedOutCode | 4 | false |
| AccessStaticViaInstance | 4 | false |
| UseOfPropertiesAsHashtable | 4 | false |
| ConstantValue | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| ThrowablePrintStackTrace | 3 | false |
| DataFlowIssue | 2 | false |
| WhileCanBeForeach | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| NestedAssignment | 2 | false |
| RedundantFieldInitialization | 2 | false |
| ReturnNull | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| UnstableApiUsage | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| WrapperTypeMayBePrimitive | 1 | false |
| FieldMayBeStatic | 1 | false |
| BoxingBoxedValue | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| RedundantCollectionOperation | 1 | false |
| RegExpSimplifiable | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| StringEqualsEmptyString | 1 | false |
| IgnoreResultOfCall | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| InfiniteLoopStatement | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| EqualsAndHashcode | 1 | false |
| InstanceofCatchParameter | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Module\[allGuiceModules.size()\]'
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
        //Parent injector to process command line arguments and json files

        Injector injector = parent.createChildInjector(allGuiceModules.toArray(new Module[allGuiceModules.size()]));

        appProperties = injector.getInstance(AppProperties.class);
```

## RuleId[ruleID=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/microsoft/kafkaavailability/reporters/ScheduledReporterCollector.java`
#### Snippet
```java
        LOGGER.debug("Configuring metrics");

        Integer period = appProperties.reportInterval;
        this.reportIntervalInSeconds = period > 0 ? period : DEFAULT_REPORT_INTERVAL_IN_SECONDS;

```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/microsoft/kafkaavailability/discovery/Constants.java`
#### Snippet
```java

    public static final String DEFAULT_REGISTRATION_ROOT = "/services";
    public static final String SERVICE_NAME = "kattool";
    public static final long DEFAULT_ELAPSED_TIME = 60000;
}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/com/microsoft/kafkaavailability/discovery/Constants.java`
#### Snippet
```java

    public static final String DEFAULT_REGISTRATION_ROOT = "/services";
    public static final String SERVICE_NAME = "kattool";
    public static final long DEFAULT_ELAPSED_TIME = 60000;
}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/com/microsoft/kafkaavailability/discovery/Constants.java`
#### Snippet
```java

    public static final String DEFAULT_REGISTRATION_ROOT = "/services";
    public static final String SERVICE_NAME = "kattool";
    public static final long DEFAULT_ELAPSED_TIME = 60000;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/microsoft/kafkaavailability/discovery/Constants.java`
#### Snippet
```java
    public static final String DEFAULT_REGISTRATION_ROOT = "/services";
    public static final String SERVICE_NAME = "kattool";
    public static final long DEFAULT_ELAPSED_TIME = 60000;
}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/com/microsoft/kafkaavailability/discovery/Constants.java`
#### Snippet
```java
    public static final String DEFAULT_REGISTRATION_ROOT = "/services";
    public static final String SERVICE_NAME = "kattool";
    public static final long DEFAULT_ELAPSED_TIME = 60000;
}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/com/microsoft/kafkaavailability/discovery/Constants.java`
#### Snippet
```java
    public static final String DEFAULT_REGISTRATION_ROOT = "/services";
    public static final String SERVICE_NAME = "kattool";
    public static final long DEFAULT_ELAPSED_TIME = 60000;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/microsoft/kafkaavailability/discovery/Constants.java`
#### Snippet
```java
public interface Constants { 

    public static final String DEFAULT_REGISTRATION_ROOT = "/services";
    public static final String SERVICE_NAME = "kattool";
    public static final long DEFAULT_ELAPSED_TIME = 60000;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `src/main/java/com/microsoft/kafkaavailability/discovery/Constants.java`
#### Snippet
```java
public interface Constants { 

    public static final String DEFAULT_REGISTRATION_ROOT = "/services";
    public static final String SERVICE_NAME = "kattool";
    public static final long DEFAULT_ELAPSED_TIME = 60000;
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `src/main/java/com/microsoft/kafkaavailability/discovery/Constants.java`
#### Snippet
```java
public interface Constants { 

    public static final String DEFAULT_REGISTRATION_ROOT = "/services";
    public static final String SERVICE_NAME = "kattool";
    public static final long DEFAULT_ELAPSED_TIME = 60000;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdClient.java`
#### Snippet
```java
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]+");

    public static enum StatType { COUNTER, TIMER, GAUGE }

    private final String host;
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `MAX_FLUSH_BUFFER` may be 'static'
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdClient.java`
#### Snippet
```java
    private DatagramSocket datagramSocket;
    private Writer writer;
    private final long MAX_FLUSH_BUFFER = 1400;

    public StatsdClient(String host, int port) {
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `KeyStoreLoader` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/kafkaavailability/KeyStoreLoader.java`
#### Snippet
```java
import java.security.cert.CertificateException;

public class KeyStoreLoader {

    final static Logger LOGGER = LoggerFactory.getLogger(KeyStoreLoader.class);
```

### UtilityClassWithoutPrivateConstructor
Class `KafkaUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/kafkaavailability/KafkaUtils.java`
#### Snippet
```java
 * Kafka utility functions.
 */
public class KafkaUtils {

    public static final int DEFAULT_NUM_OF_PARTITION = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `CommonUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/kafkaavailability/discovery/CommonUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class CommonUtils {

    private static Logger log = LoggerFactory.getLogger(CommonUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ModuleScanner` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/kafkaavailability/module/ModuleScanner.java`
#### Snippet
```java
import java.util.Set;

public class ModuleScanner {
    private final static Logger LOGGER = LoggerFactory.getLogger(ModuleScanner.class);

```

### UtilityClassWithoutPrivateConstructor
Class `CuratorClient` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorClient.java`
#### Snippet
```java
/** * The Class CuratorClient. 
 */ 
public class CuratorClient {

    private static Logger log = LoggerFactory.getLogger(CuratorClient.class);
```

### UtilityClassWithoutPrivateConstructor
Class `App` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
 * Availability is defined as the percentage of total partitions that respond to each operation.
 */
public class App {
    final static Logger m_logger = LoggerFactory.getLogger(App.class);

```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `cancel` may produce `NullPointerException`
in `src/main/java/com/microsoft/kafkaavailability/threads/JobManager.java`
#### Snippet
```java

        } finally {
            future.cancel(true);
            CommonUtils.shutdownAndAwaitTermination(executorService, job.toString());
        }
```

### DataFlowIssue
Method invocation `setData` may produce `NullPointerException`
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdClient.java`
#### Snippet
```java
        DatagramPacket packet = newPacket(outputData);
        byte[] data = outputData.toByteArray();
        packet.setData(data);
        datagramSocket.send(packet);
        outputData.reset();
```

## RuleId[ruleID=BoxingBoxedValue]
### BoxingBoxedValue
Boxing of already boxed `response.get(key).get()`
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
                try {
                    // Future.get() waits for task to get completed
                    elapsedTime = Long.valueOf(response.get(key).get());
                } catch (InterruptedException | ExecutionException e) {
                    m_logger.error("Error Reading from Topic: {}; Partition: {}; Exception: {}", item.topic(), key, e);
```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `src/main/java/com/microsoft/kafkaavailability/reporters/ScheduledReporterCollector.java`
#### Snippet
```java
        synchronized (reporters) {
            Iterator<ScheduledReporter> reporterIterator = reporters.listIterator();
            while (reporterIterator.hasNext()) {
                reporterIterator.next().stop();
            }
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `src/main/java/com/microsoft/kafkaavailability/reporters/ScheduledReporterCollector.java`
#### Snippet
```java
        synchronized (reporters) {
            Iterator<ScheduledReporter> reporterIterator = reporters.listIterator();
            while (reporterIterator.hasNext()) {
                reporterIterator.next().start(reportIntervalInSeconds, TimeUnit.SECONDS);
            }
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`new String()` is redundant
in `src/main/java/com/microsoft/kafkaavailability/TopicPartition.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return new String(topic + partitionId).hashCode();
    }
}
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `sslSocketFactory` from instance context
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
                // reused, supporting persistent connections.
                if(sslSocketFactory == null) {
                    sslSocketFactory = createSSLSocketFactory(useCertToConnect, keyStorePath, keyStorePassword);
                }
                con.setSSLSocketFactory(sslSocketFactory);
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java
                }
            }
            //phaser.arriveAndAwaitAdvance();
            //m_phaser.arriveAndDeregister();
            //CommonUtils.dumpPhaserState("After arrival of LeaderInfoThread", m_phaser);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java
        this.m_phaser = phaser;
        this.m_threadSleepTime = threadSleepTime;
        //this.m_phaser.register(); //Registers/Add a new unArrived party to this phaser.
        //CommonUtils.dumpPhaserState("After registration of LeaderInfoThread", phaser);
    }
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java

        this.m_phaser = phaser;
        //this.m_phaser.register(); //Registers/Add a new unArrived party to this phaser.
        //CommonUtils.dumpPhaserState("After register", phaser);
        this.m_threadSleepTime = threadSleepTime;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java

        this.m_phaser = phaser;
        //this.m_phaser.register(); //Registers/Add a new unArrived party to this phaser.
        //CommonUtils.dumpPhaserState("After register", phaser);
        this.m_threadSleepTime = threadSleepTime;
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
                        byte[] bytes = new byte[payload.limit()];
                        payload.get(bytes);
                        logger.debug(String.valueOf(messageAndOffset.offset()) + ": " + new String(bytes, "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        logger.error("Consumer error converting kafka item to String: " + e.getMessage());
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/com/microsoft/kafkaavailability/discovery/ServiceUtil.java`
#### Snippet
```java

        builder.name(serviceName).payload(metadata).id(registerAddress + ":" +
                String.valueOf(servicePort)).serviceType(ServiceType.DYNAMIC).address(registerAddress).port(servicePort);

        return builder.build();
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `response.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java

            int topicConsumerFailCount = 0;
            for (Integer key : response.keySet()) {
                int partitionConsumerFailCount = 0;
                long elapsedTime = DEFAULT_ELAPSED_TIME;
```

## RuleId[ruleID=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `src/main/java/com/microsoft/kafkaavailability/reporters/ScheduledReporterCollector.java`
#### Snippet
```java
        } else {
            reportersToUse = new ArrayList<>();
            List<String> reporterNames = Arrays.asList(reporterProperties.reportersCommaSeparatedList.split(","));
            for(String name : reporterNames) {
               if(allReporters.containsKey(name)) {
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdClient.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(StatsdClient.class);

    private static final Pattern WHITESPACE = Pattern.compile("[\\s]+");

    public static enum StatType { COUNTER, TIMER, GAUGE }
```

## RuleId[ruleID=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
                try {
                    Thread.sleep(NEW_LEADER_PAUSE_MS);
                } catch (InterruptedException ie) {
                }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
            } catch (TimeoutException te) {
                m_logger.error("Super thread timed out for " + mainThreadsTimeoutInSeconds + " " + TimeUnit.SECONDS + ", but super thread will advance.");
            } catch (InterruptedException ie) {
            }

```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
                 */
                phaser.forceTermination();
            } catch (IllegalStateException exception) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
            try {
                m_phaser.arriveAndDeregister();
            } catch (IllegalStateException success) {
            }
        } finally {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
        try {
            m_phaser.arriveAndDeregister();
        } catch (IllegalStateException exception) {
        }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`pml.size() > 0` can be replaced with '!pml.isEmpty()'
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
                }
            }
            if (pml.size() > 0)
            {
                kafka.api.TopicMetadata tm =
```

### SizeReplaceableByIsEmpty
`whiteListTopicMetadata.size() > 0` can be replaced with '!whiteListTopicMetadata.isEmpty()'
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
        int failureThreshold = 10;

        int windowSize = numMessages * ((whiteListTopicMetadata.size() > 0) ? (whiteListTopicMetadata.size()) : 1);

        m_logger.info("Starting " + name + " prop check." + reportAvailability);
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ServiceUtil` has no concrete subclass
in `src/main/java/com/microsoft/kafkaavailability/discovery/ServiceUtil.java`
#### Snippet
```java
/** * Provide static utility methods. 
 */ 
public abstract class ServiceUtil {

    private static final Logger log = LoggerFactory.getLogger(ServiceUtil.class);
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/microsoft/kafkaavailability/PropertiesManager.java`
#### Snippet
```java
     * @throws IOException if property file is not found in classpath
     */
    public PropertiesManager(String propFileName, Class<T> typeParameterClass) throws IOException
    {
        this.m_propFileName = propFileName;
```

### BoundedWildcard
Can generalize to `? extends ScheduledReporter`
in `src/main/java/com/microsoft/kafkaavailability/reporters/ScheduledReporterCollector.java`
#### Snippet
```java
    }

    private List<ScheduledReporter> selectReporters(ReporterProperties reporterProperties, Map<String, ScheduledReporter> allReporters) {
        List<ScheduledReporter> reportersToUse;

```

### BoundedWildcard
Can generalize to `? extends MetaDataManagerProperties`
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
    List<String> m_brokerIds;

    public MetaDataManager(CuratorFramework curatorFramework, IPropertiesManager<MetaDataManagerProperties> propManager)
    {
        m_mDProps = propManager.getProperties();
```

### BoundedWildcard
Can generalize to `? extends TopicMetadata`
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
    }

    public List<TopicMetadata> filterWhitelistTopics(List<TopicMetadata> topicMetadataList,
                                                     HashSet<String> whiteListTopics) {
        ArrayList<TopicMetadata> filteredTopics = new ArrayList<TopicMetadata>();
```

### BoundedWildcard
Can generalize to `? extends ConsumerProperties`
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java


    public Consumer(IPropertiesManager<ConsumerProperties> propManager, IMetaDataManager metaDataManager)

    {
```

### BoundedWildcard
Can generalize to `? extends ProducerProperties`
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
     * @param metaDataManager Used to get the broker list
     */
    public Producer(IPropertiesManager<ProducerProperties> propManager, IMetaDataManager metaDataManager) throws MetaDataManagerException {
        m_metaDataManager = metaDataManager;
        m_propManager = propManager;
```

### BoundedWildcard
Can generalize to `? extends kafka.javaapi.TopicMetadata`
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java

    private void postData(String name, MetricRegistry metrics, IProducer producer,
                          List<kafka.javaapi.TopicMetadata> whiteListTopicMetadata, List<String> gtmList,
                          boolean reportAvailability, boolean reportLatency, boolean useCertificateToConnect,
                          String keyStoreFilePath, String keyStoreFilePassword) {
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/KeyStoreLoader.java`
#### Snippet
```java
public class KeyStoreLoader {

    final static Logger LOGGER = LoggerFactory.getLogger(KeyStoreLoader.class);


```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java
public class ConsumerPartitionThread implements Callable<Long> {

    final static Logger m_logger = LoggerFactory.getLogger(ConsumerPartitionThread.class);
    private CuratorFramework m_curatorFramework;
    private TopicMetadata m_TopicMetadata;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/module/AppModule.java`
#### Snippet
```java

public class AppModule extends AbstractModule {
    private final static Logger LOGGER = LoggerFactory.getLogger(AppModule.class);


```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/threads/HeartBeatThread.java`
#### Snippet
```java

public class HeartBeatThread implements Runnable {
    final static Logger logger = LoggerFactory.getLogger(HeartBeatThread.class);

    private final ScheduledReporterCollector reporterCollector;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/KafkaUtils.java`
#### Snippet
```java
    public static final int DEFAULT_NUM_OF_PARTITION = 1;
    public static final int DEFAULT_REPLICATION = 3;
    final static Logger m_logger = LoggerFactory.getLogger(KafkaUtils.class);

    static int sessionTimeOutInMs = 15 * 1000; // 15 secs
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/threads/JobManager.java`
#### Snippet
```java

public class JobManager implements Callable<Long> {
    final static Logger m_logger = LoggerFactory.getLogger(JobManager.class);
    protected long timeout;
    protected TimeUnit timeUnit;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/PropertiesManager.java`
#### Snippet
```java
    private T m_prop;
    final Class<T> m_typeParameterClass;
    final static Logger m_logger = LoggerFactory.getLogger(PropertiesManager.class);

    private static final String STRING_TYPE = "java.lang.String";
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/threads/HeartBeat.java`
#### Snippet
```java
 */
public class HeartBeat {
    private final static Logger LOGGER = LoggerFactory.getLogger(HeartBeat.class);

    private final ScheduledReporterCollector scheduledReporterCollector;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
public class MetaDataManager implements IMetaDataManager
{
    final static Logger m_logger = LoggerFactory.getLogger(MetaDataManager.class);
    private CuratorFramework client;

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/module/ModuleScanner.java`
#### Snippet
```java

public class ModuleScanner {
    private final static Logger LOGGER = LoggerFactory.getLogger(ModuleScanner.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/module/MonitorTasksModule.java`
#### Snippet
```java

public class MonitorTasksModule extends AbstractModule {
    private final static Logger LOGGER = LoggerFactory.getLogger(MonitorTasksModule.class);

    public static final String LOCAL_IP_CONSTANT_NAME = "localIPAddress";
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java
public class LeaderInfoThread implements Callable<Long> {

    final static Logger m_logger = LoggerFactory.getLogger(LeaderInfoThread.class);
    private final CuratorFramework m_curatorFramework;

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
 */
public class App {
    final static Logger m_logger = LoggerFactory.getLogger(App.class);

    static int m_sleepTime = 30000;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
public class Producer implements IProducer {
    private IPropertiesManager<ProducerProperties> m_propManager;
    final static Logger m_logger = LoggerFactory.getLogger(Producer.class);
    private int m_vipRetries = 3;
    private IMetaDataManager m_metaDataManager;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
public class ProducerThread implements Callable<Long> {

    private final static Logger LOGGER = LoggerFactory.getLogger(ProducerThread.class);

    private final ScheduledReporterCollector reporterCollector;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
public class AvailabilityThread implements Callable<Long> {

    final static Logger m_logger = LoggerFactory.getLogger(AvailabilityThread.class);

    private final ScheduledReporterCollector reporterCollector;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
public class ConsumerThread implements Callable<Long> {

    final static Logger m_logger = LoggerFactory.getLogger(ConsumerThread.class);

    private final ScheduledReporterCollector reporterCollector;
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/com/microsoft/kafkaavailability/module/AppModule.java`
#### Snippet
```java
            AppProperties appProperties = (AppProperties) appPropertiesManager.getProperties();

            if(appProperties.environmentName == null || appProperties.environmentName.equals("")) {
                if(commandLine.hasOption("cluster")) {
                    appProperties.environmentName = commandLine.getOptionValue("cluster");
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Pattern.compile()` is ignored
in `src/main/java/com/microsoft/kafkaavailability/discovery/CommonUtils.java`
#### Snippet
```java
        }
        regex = "(" + stringbuilder.substring(0, stringbuilder.length() - 1) + ")";
        Pattern.compile(regex);
        return regex;
    }
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java
    @Override
    public Long call() throws Exception {
        return Long.valueOf(RunConsumerPartitionThread());
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java
        } while (!m_phaser.isTerminated());
        m_logger.info("LeaderInfoThread (run()) has been COMPLETED.");
        return Long.valueOf(elapsedTime);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/com/microsoft/kafkaavailability/discovery/ServiceUtil.java`
#### Snippet
```java
                }

                Integer port = Integer.valueOf(Integer.parseInt(service.substring(index + 1)));
                serviceMap.put(service.substring(0, index), port);
            }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java

        LOGGER.info("ProducerThread (run()) has been COMPLETED.");
        return Long.valueOf(elapsedTime);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java

        m_logger.info("AvailabilityThread (run()) has been COMPLETED.");
        return Long.valueOf(elapsedTime);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
        CommonUtils.dumpPhaserState("After arrival of ConsumerThread", m_phaser);
        m_logger.info("ConsumerThread (run()) has been COMPLETED.");
        return Long.valueOf(elapsedTime);
    }

```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorManager.java`
#### Snippet
```java
            for (Map.Entry<String, Integer> entry : services.entrySet()) {
                String serviceName = entry.getKey();
                int port = entry.getValue().intValue();

                ServiceDiscovery<MetaData> serviceDiscovery = ServiceUtil.getServiceDiscovery(curatorFramework, basePath);
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
                        byte[] bytes = new byte[payload.limit()];
                        payload.get(bytes);
                        logger.debug(String.valueOf(messageAndOffset.offset()) + ": " + new String(bytes, "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        logger.error("Consumer error converting kafka item to String: " + e.getMessage());
```

## RuleId[ruleID=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'java.lang.Thread.sleep(long)' accessed via instance reference
in `src/main/java/com/microsoft/kafkaavailability/discovery/CommonUtils.java`
#### Snippet
```java
    public static void sleep(long millis) {
        try {
            Thread.currentThread().sleep(millis);
        } catch (InterruptedException e) {
            // Do nothing
```

### AccessStaticViaInstance
Static member 'java.lang.Thread.sleep(long)' accessed via instance reference
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java
            while (elapsedTime < m_threadSleepTime && !m_phaser.isTerminated()) {
                try {
                    Thread.currentThread().sleep(sleepDuration);
                    elapsedTime = elapsedTime + sleepDuration;
                } catch (InterruptedException ie) {
```

### AccessStaticViaInstance
Static member 'java.lang.Thread.sleep(long)' accessed via instance reference
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
            while (elapsedTime < m_threadSleepTime && !m_phaser.isTerminated()) {
                try {
                    Thread.currentThread().sleep(sleepDuration);
                    elapsedTime = elapsedTime + sleepDuration;
                } catch (InterruptedException ie) {
```

### AccessStaticViaInstance
Static member 'java.lang.Thread.sleep(long)' accessed via instance reference
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
            while (elapsedTime < m_threadSleepTime && !m_phaser.isTerminated()) {
                try {
                    Thread.currentThread().sleep(sleepDuration);
                    elapsedTime = elapsedTime + sleepDuration;
                } catch (InterruptedException ie) {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/IMetaDataManager.java`
#### Snippet
```java
    List<String> getBrokerList(boolean addPort) throws MetaDataManagerException;
    List<kafka.javaapi.TopicMetadata> getMetaDataFromAllBrokers();
    List<kafka.javaapi.TopicMetadata> getAllTopicPartition();
    void createTopicIfNotExist(String topicName, int partitions, int replicationFactor);
    void createCanaryTopics();
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/IMetaDataManager.java`
#### Snippet
```java
{
    List<String> getBrokerList(boolean addPort) throws MetaDataManagerException;
    List<kafka.javaapi.TopicMetadata> getMetaDataFromAllBrokers();
    List<kafka.javaapi.TopicMetadata> getAllTopicPartition();
    void createTopicIfNotExist(String topicName, int partitions, int replicationFactor);
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
     * @return Deduped topic metadata
     */
    public List<kafka.javaapi.TopicMetadata> getAllTopicPartition()
    {
        List<kafka.javaapi.TopicMetadata> topicMetadataList = getMetaDataFromAllBrokers();
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
    public List<kafka.javaapi.TopicMetadata> getAllTopicPartition()
    {
        List<kafka.javaapi.TopicMetadata> topicMetadataList = getMetaDataFromAllBrokers();
        HashSet<TopicPartition> exploredTopicPartition = new HashSet<TopicPartition>();
        List<kafka.javaapi.TopicMetadata> ret = new ArrayList<TopicMetadata>();
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
        List<kafka.javaapi.TopicMetadata> topicMetadataList = getMetaDataFromAllBrokers();
        HashSet<TopicPartition> exploredTopicPartition = new HashSet<TopicPartition>();
        List<kafka.javaapi.TopicMetadata> ret = new ArrayList<TopicMetadata>();

        // Filter any white list topics
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
                                JavaConversions.asScalaBuffer(pml).toList(),
                                item.errorCode());
                ret.add(new kafka.javaapi.TopicMetadata(tm));
            }
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
     */
    @Override
    public List<kafka.javaapi.TopicMetadata> getMetaDataFromAllBrokers() {
        List<String> topics = new ArrayList<String>();
        try {
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
        }
        TopicMetadataRequest req = new TopicMetadataRequest(topics);
        List<kafka.javaapi.TopicMetadata> allMetaData = new ArrayList<kafka.javaapi.TopicMetadata>();
        for (String brokerId : m_brokerIds) {
            SimpleConsumer consumer = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
        }
        TopicMetadataRequest req = new TopicMetadataRequest(topics);
        List<kafka.javaapi.TopicMetadata> allMetaData = new ArrayList<kafka.javaapi.TopicMetadata>();
        for (String brokerId : m_brokerIds) {
            SimpleConsumer consumer = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
                        m_mDProps.bufferSize,
                        m_mDProps.clientId);
                kafka.javaapi.TopicMetadataResponse resp = null;
                resp = consumer.send(req);
                allMetaData.addAll(resp.topicsMetadata());
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
    public void printEverything()
    {
        List<kafka.javaapi.TopicMetadata> data = getAllTopicPartition();
        for (kafka.javaapi.TopicMetadata item : data)
        {
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
    {
        List<kafka.javaapi.TopicMetadata> data = getAllTopicPartition();
        for (kafka.javaapi.TopicMetadata item : data)
        {
            m_logger.info("Topic: " + item.topic());
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
        {
            m_logger.info("Topic: " + item.topic());
            for (kafka.javaapi.PartitionMetadata part : item.partitionsMetadata())
            {
                String replicas = "";
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.cluster` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
                String replicas = "";
                String isr = "";
                for (kafka.cluster.Broker replica : part.replicas())
                {
                    replicas += " " + replica.host();
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.cluster` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
                    replicas += " " + replica.host();
                }
                for (kafka.cluster.Broker replica : part.isr())
                {
                    isr += " " + replica.host();
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi.consumer` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
        loop:
        for (String seed : a_seedBrokers) {
            kafka.javaapi.consumer.SimpleConsumer consumer = null;
            try {
                logger.debug("Consumer looking up leader for " + a_topic + ", " + a_partition + " at " + seed + ":" + a_port);
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi.consumer` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
            try {
                logger.debug("Consumer looking up leader for " + a_topic + ", " + a_partition + " at " + seed + ":" + a_port);
                consumer = new kafka.javaapi.consumer.SimpleConsumer(seed, a_port, m_consumerProperties.soTimeout, m_consumerProperties.bufferSize, "leaderLookup");
                List<String> topics = Collections.singletonList(a_topic);
                TopicMetadataRequest req = new TopicMetadataRequest(topics);
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
                List<String> topics = Collections.singletonList(a_topic);
                TopicMetadataRequest req = new TopicMetadataRequest(topics);
                kafka.javaapi.TopicMetadataResponse resp = consumer.send(req);

                List<TopicMetadata> metaData = resp.topicsMetadata();
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.cluster` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
        if (returnMetaData != null) {
            m_replicaBrokers.clear();
            for (kafka.cluster.Broker replica : returnMetaData.replicas()) {
                m_replicaBrokers.add(replica.host());
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi.consumer` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
     * @throws Exception if leader is not found or there is an error fetching data offset from broker.
     */
    public static long getLastOffset(kafka.javaapi.consumer.SimpleConsumer consumer, String topic, int partition,
                                     long whichTime, String clientName) throws Exception {
        TopicAndPartition topicAndPartition = new TopicAndPartition(topic, partition);
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
        Map<TopicAndPartition, PartitionOffsetRequestInfo> requestInfo = new HashMap<TopicAndPartition, PartitionOffsetRequestInfo>();
        requestInfo.put(topicAndPartition, new PartitionOffsetRequestInfo(whichTime, 1));
        kafka.javaapi.OffsetRequest request = new kafka.javaapi.OffsetRequest(
                requestInfo, kafka.api.OffsetRequest.CurrentVersion(), clientName);
        OffsetResponse response = consumer.getOffsetsBefore(request);
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
        Map<TopicAndPartition, PartitionOffsetRequestInfo> requestInfo = new HashMap<TopicAndPartition, PartitionOffsetRequestInfo>();
        requestInfo.put(topicAndPartition, new PartitionOffsetRequestInfo(whichTime, 1));
        kafka.javaapi.OffsetRequest request = new kafka.javaapi.OffsetRequest(
                requestInfo, kafka.api.OffsetRequest.CurrentVersion(), clientName);
        OffsetResponse response = consumer.getOffsetsBefore(request);
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.api` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
        requestInfo.put(topicAndPartition, new PartitionOffsetRequestInfo(whichTime, 1));
        kafka.javaapi.OffsetRequest request = new kafka.javaapi.OffsetRequest(
                requestInfo, kafka.api.OffsetRequest.CurrentVersion(), clientName);
        OffsetResponse response = consumer.getOffsetsBefore(request);

```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi.consumer` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
        SimpleConsumer consumer = null;
        try {
            consumer = new kafka.javaapi.consumer.SimpleConsumer(leadBroker, m_consumerProperties.brokerPort, m_consumerProperties.soTimeout, m_consumerProperties.bufferSize, clientName);
            long readOffset = getLastOffset(consumer, a_topic, a_partition, kafka.api.OffsetRequest.EarliestTime(), clientName);

```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.api` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
        try {
            consumer = new kafka.javaapi.consumer.SimpleConsumer(leadBroker, m_consumerProperties.brokerPort, m_consumerProperties.soTimeout, m_consumerProperties.bufferSize, clientName);
            long readOffset = getLastOffset(consumer, a_topic, a_partition, kafka.api.OffsetRequest.EarliestTime(), clientName);

            int numErrors = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi.consumer` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
            while (maxReads > 0) {
                if (consumer == null) {
                    consumer = new kafka.javaapi.consumer.SimpleConsumer(leadBroker, m_consumerProperties.brokerPort, m_consumerProperties.soTimeout, m_consumerProperties.bufferSize, clientName);
                }
                FetchRequest req = new FetchRequestBuilder()
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.api` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
                        // We asked for an invalid offset. For simple case ask for the last element to reset
                        long invalidReadOffset = readOffset;
                        readOffset = getLastOffset(consumer, a_topic, a_partition, kafka.api.OffsetRequest.LatestTime(), clientName);
                        logger.error("Consumer requested an invalid offset " + invalidReadOffset + ". Resetting to " + readOffset);
                        continue;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
                })
                .loadKeyMaterial(trustStore, keyStorePassword.toCharArray())
                .setSecureRandom(new java.security.SecureRandom())
                .build();

```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
        List<TopicMetadata> totalTopicMetadata = metaDataManager.getAllTopicPartition();

        List<kafka.javaapi.TopicMetadata> whiteListTopicMetadata = new ArrayList<TopicMetadata>();

        for (kafka.javaapi.TopicMetadata topic : totalTopicMetadata) {
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
        List<kafka.javaapi.TopicMetadata> whiteListTopicMetadata = new ArrayList<TopicMetadata>();

        for (kafka.javaapi.TopicMetadata topic : totalTopicMetadata) {
            for (String whiteListTopic : metaDataProperties.canaryTestTopics)
                // java string compare while ignoring case
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
        LOGGER.info("canaryTestTopicsMetadata size:" + whiteListTopicMetadata.size());

        for (kafka.javaapi.TopicMetadata topic : whiteListTopicMetadata) {
            numPartitionsProducer += topic.partitionsMetadata().size();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
        LOGGER.info("start topic partition loop");

        for (kafka.javaapi.TopicMetadata item : whiteListTopicMetadata) {
            boolean isTopicAvailable = true;
            int topicProducerFailCount = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
            }

            for (kafka.javaapi.PartitionMetadata part : item.partitionsMetadata()) {
                int partitionProducerFailCount = 0;
                LOGGER.debug("Writing to Topic: {}; Partition: {};", item.topic(), part.partitionId());
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
        List<TopicMetadata> totalTopicMetadata = metaDataManager.getAllTopicPartition();

        List<kafka.javaapi.TopicMetadata> whiteListTopicMetadata = new ArrayList<TopicMetadata>();

        for (kafka.javaapi.TopicMetadata topic : totalTopicMetadata) {
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
        List<kafka.javaapi.TopicMetadata> whiteListTopicMetadata = new ArrayList<TopicMetadata>();

        for (kafka.javaapi.TopicMetadata topic : totalTopicMetadata) {
            for (String whiteListTopic : metaDataProperties.canaryTestTopics)
                // java string compare while ignoring case
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java

    private void postData(String name, MetricRegistry metrics, IProducer producer,
                          List<kafka.javaapi.TopicMetadata> whiteListTopicMetadata, List<String> gtmList,
                          boolean reportAvailability, boolean reportLatency, boolean useCertificateToConnect,
                          String keyStoreFilePath, String keyStoreFilePassword) {
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary and can be removed
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
            }

            for (kafka.javaapi.TopicMetadata item : whiteListTopicMetadata) {
                m_logger.info("Posting to Topic: {} using : {};", item.topic(), gtm);
                int tryCount = 0, failCount = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java

        //This is full list of topics
        List<kafka.javaapi.TopicMetadata> totalTopicMetadata = metaDataManager.getAllTopicPartition();
        List<kafka.javaapi.TopicMetadata> allTopicMetadata = new ArrayList<kafka.javaapi.TopicMetadata>();

```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
        //This is full list of topics
        List<kafka.javaapi.TopicMetadata> totalTopicMetadata = metaDataManager.getAllTopicPartition();
        List<kafka.javaapi.TopicMetadata> allTopicMetadata = new ArrayList<kafka.javaapi.TopicMetadata>();

        String sep = ", ";
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
        //This is full list of topics
        List<kafka.javaapi.TopicMetadata> totalTopicMetadata = metaDataManager.getAllTopicPartition();
        List<kafka.javaapi.TopicMetadata> allTopicMetadata = new ArrayList<kafka.javaapi.TopicMetadata>();

        String sep = ", ";
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
        StringBuilder rString = new StringBuilder();

        for (kafka.javaapi.TopicMetadata topic : totalTopicMetadata) {
            //Log the server/topic mapping to know which topic is getting  by which instance of KAT-List<String>
            int topicIndex = totalTopicMetadata.indexOf(topic);
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
        int consumerFailCount = 0;

        for (kafka.javaapi.TopicMetadata topic : allTopicMetadata) {
            numPartitionsConsumers += topic.partitionsMetadata().size();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
            }
        }
        for (kafka.javaapi.TopicMetadata item : allTopicMetadata) {
            boolean isTopicAvailable = true;
            m_logger.info("Reading from Topic: {};", item.topic());
```

### UnnecessaryFullyQualifiedName
Qualifier `kafka.javaapi` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
            Map<Integer, Future<Long>> response = new HashMap<Integer, Future<Long>>();

            for (kafka.javaapi.PartitionMetadata part : item.partitionsMetadata()) {
                m_logger.debug("Reading from Topic: {}; Partition: {};", item.topic(), part.partitionId());

```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.I0Itec.zkclient.serialize.ZkSerializer;`
in `src/main/java/com/microsoft/kafkaavailability/KafkaUtils.java`
#### Snippet
```java

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.ZkSerializer;
import org.apache.curator.framework.CuratorFramework;

```

### UNUSED_IMPORT
Unused import `import kafka.utils.ZkUtils;`
in `src/main/java/com/microsoft/kafkaavailability/KafkaUtils.java`
#### Snippet
```java
import kafka.admin.AdminUtils;
import kafka.common.TopicExistsException;
import kafka.utils.ZkUtils;
import kafka.utils.ZKStringSerializer$;
import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `src/main/java/com/microsoft/kafkaavailability/PropertiesManager.java`
#### Snippet
```java
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.io.UnsupportedEncodingException;`
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorManager.java`
#### Snippet
```java

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
```

### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorManager.java`
#### Snippet
```java
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Collection;`
in `src/main/java/com/microsoft/kafkaavailability/discovery/ServiceUtil.java`
#### Snippet
```java
import java.util.UUID;

import java.util.Collection;
import java.util.Comparator;

```

### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `src/main/java/com/microsoft/kafkaavailability/discovery/ServiceUtil.java`
#### Snippet
```java

import java.util.Collection;
import java.util.Comparator;

import org.apache.curator.framework.CuratorFramework;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.Phaser;`
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java

import java.io.IOException;
import java.util.concurrent.Phaser;
import java.util.concurrent.*;

```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
                    if (failCount >= 10) {
                        m_logger.error(name + ": {} has failed more than {} times. Giving up!!!.", gtm, failureThreshold);
                        tryCount = failCount = 100;
                        break;
                    }
```

## RuleId[ruleID=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
            }
        } else {
            while (true) {
                waitForChanges(curatorManager);
                runOnce(monitorTaskFactory, reporterCollector);
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`elapsedTime = elapsedTime + sleepDuration` could be simplified to 'elapsedTime += sleepDuration'
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java
                try {
                    Thread.currentThread().sleep(sleepDuration);
                    elapsedTime = elapsedTime + sleepDuration;
                } catch (InterruptedException ie) {
                    m_logger.error(ie.getMessage(), ie);
```

### ReplaceAssignmentWithOperatorAssignment
`elapsedTime = elapsedTime + sleepDuration` could be simplified to 'elapsedTime += sleepDuration'
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
                try {
                    Thread.currentThread().sleep(sleepDuration);
                    elapsedTime = elapsedTime + sleepDuration;
                } catch (InterruptedException ie) {
                    LOGGER.error(ie.getMessage(), ie);
```

### ReplaceAssignmentWithOperatorAssignment
`elapsedTime = elapsedTime + sleepDuration` could be simplified to 'elapsedTime += sleepDuration'
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
                try {
                    Thread.currentThread().sleep(sleepDuration);
                    elapsedTime = elapsedTime + sleepDuration;
                } catch (InterruptedException ie) {
                    m_logger.error(ie.getMessage(), ie);
```

### ReplaceAssignmentWithOperatorAssignment
`gtmIPStatusTryCount = gtmIPStatusTryCount + tryCount` could be simplified to 'gtmIPStatusTryCount += tryCount'
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
                    }
                }
                gtmIPStatusTryCount = gtmIPStatusTryCount + tryCount;
                gtmIPStatusFailCount = gtmIPStatusFailCount + failCount;
            }
```

### ReplaceAssignmentWithOperatorAssignment
`gtmIPStatusFailCount = gtmIPStatusFailCount + failCount` could be simplified to 'gtmIPStatusFailCount += failCount'
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
                }
                gtmIPStatusTryCount = gtmIPStatusTryCount + tryCount;
                gtmIPStatusFailCount = gtmIPStatusFailCount + failCount;
            }
            if (reportAvailability && !gtmList.isEmpty()) {
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/kafkaavailability/discovery/CommonUtils.java`
#### Snippet
```java
            ipAddress = iAddress.getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage(), e);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/kafkaavailability/discovery/CommonUtils.java`
#### Snippet
```java
            hostname = iAddress.getHostName();
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage(), e);
            hostname = getIpAddress();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
            } catch (Exception e) {
                m_logger.error(e.getMessage(), e);
                e.printStackTrace();
                //look for m_vipRetries - 1, otherwise you will never throw an exception in case of failures.
                if (i == m_vipRetries - 1)
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `instanceList` are updated, but never queried
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorManager.java`
#### Snippet
```java
    public void getWorkerNames(String serviceName) throws Exception {
        Collection<ServiceInstance<MetaData>> instances = getWorkers(serviceName);
        List<ServiceInstance<MetaData>> instanceList = Lists.newArrayList(ServiceUtil.getServiceDiscovery(curatorFramework, basePath).queryForInstances(serviceName));
    }

```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
            brokerList += broker + ", ";
        }
        props.put("metadata.broker.list", brokerList);
        props.put("serializer.class", producerProperties.serializer_class);
        props.put("partitioner.class", SimplePartitioner.class.getName());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
        }
        props.put("metadata.broker.list", brokerList);
        props.put("serializer.class", producerProperties.serializer_class);
        props.put("partitioner.class", SimplePartitioner.class.getName());
        props.put("request.required.acks", producerProperties.request_required_acks.toString());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
        props.put("metadata.broker.list", brokerList);
        props.put("serializer.class", producerProperties.serializer_class);
        props.put("partitioner.class", SimplePartitioner.class.getName());
        props.put("request.required.acks", producerProperties.request_required_acks.toString());

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
        props.put("serializer.class", producerProperties.serializer_class);
        props.put("partitioner.class", SimplePartitioner.class.getName());
        props.put("request.required.acks", producerProperties.request_required_acks.toString());

        ProducerConfig config = new ProducerConfig(props);
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdClient.java`
#### Snippet
```java
    private final int port;

    private boolean prependNewline = false;

    private ByteArrayOutputStream outputData;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
    private ProducerProperties producerProperties;
    private kafka.javaapi.producer.Producer<String, String> m_producer;
    private static SSLSocketFactory sslSocketFactory = null;

    /***
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/com/microsoft/kafkaavailability/metrics/MetricNameEncoded.java`
#### Snippet
```java
import java.util.Objects;

public class MetricNameEncoded {
    public String name;
    public String tag;
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdReporter.java`
#### Snippet
```java
            return format(((Long) o).longValue());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdClient.java`
#### Snippet
```java
            return new DatagramPacket(dataBuffer, dataBuffer.length, InetAddress.getByName(this.host), this.port);
        } catch (Exception e) {
            return null;
        }
    }
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/com/microsoft/kafkaavailability/threads/JobManager.java`
#### Snippet
```java
            elapsedTime = future.get(timeout, timeUnit);
        } catch (ExecutionException | TimeoutException e) {
            if (e instanceof TimeoutException) {
                m_logger.error("Thread Timeout of " + timeout + " " + timeUnit + " occurred for " + job.toString() + " Cancelling the thread:" + threadName);
            } else {
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer response` may be declared as 'StringBuilder'
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
                        new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `waitTime` is redundant
in `src/main/java/com/microsoft/kafkaavailability/discovery/CommonUtils.java`
#### Snippet
```java
    public static long getWaitTimeExp(int retryCount, long waitInterval) {

        long waitTime = ((long) Math.pow(2, retryCount) * waitInterval);

        return waitTime;
```

### UnnecessaryLocalVariable
Local variable `data` is redundant
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
        long runtime = new Date().getTime();
        String msg = producerProperties.messageStart + runtime + ",www.example.com," + partitionId;
        KeyedMessage<String, String> data = new KeyedMessage<String, String>(topicName, partitionId, msg);
        return data;
    }
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java
            while (elapsedTime < m_threadSleepTime && !m_phaser.isTerminated()) {
                try {
                    Thread.currentThread().sleep(sleepDuration);
                    elapsedTime = elapsedTime + sleepDuration;
                } catch (InterruptedException ie) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
                waitForChanges(curatorManager);
                runOnce(monitorTaskFactory, reporterCollector);
                Thread.sleep(m_sleepTime);
            }
        }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java

                try {
                    Thread.sleep(500);
                } catch (Exception ex) {
                    m_logger.error(ex.getMessage(), ex);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
            while (elapsedTime < m_threadSleepTime && !m_phaser.isTerminated()) {
                try {
                    Thread.currentThread().sleep(sleepDuration);
                    elapsedTime = elapsedTime + sleepDuration;
                } catch (InterruptedException ie) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
            while (elapsedTime < m_threadSleepTime && !m_phaser.isTerminated()) {
                try {
                    Thread.currentThread().sleep(sleepDuration);
                    elapsedTime = elapsedTime + sleepDuration;
                } catch (InterruptedException ie) {
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `regex` initializer `""` is redundant
in `src/main/java/com/microsoft/kafkaavailability/discovery/CommonUtils.java`
#### Snippet
```java

    public static String createTopicRegEx(HashSet<String> topicsSet) {
        String regex = "";
        StringBuilder stringbuilder = new StringBuilder();
        for (String whiteList : topicsSet) {
```

### UnusedAssignment
Variable `hostname` initializer `"Unknown"` is redundant
in `src/main/java/com/microsoft/kafkaavailability/discovery/CommonUtils.java`
#### Snippet
```java
     */
    public static String getComputerName() {
        String hostname = "Unknown";

        try {
```

### UnusedAssignment
Variable `reportIntervalInSeconds` initializer `DEFAULT_REPORT_INTERVAL_IN_SECONDS` is redundant
in `src/main/java/com/microsoft/kafkaavailability/reporters/ScheduledReporterCollector.java`
#### Snippet
```java
    private final MetricRegistry metricRegistry;

    private int reportIntervalInSeconds = DEFAULT_REPORT_INTERVAL_IN_SECONDS;
    private final List<ScheduledReporter> reporters;

```

### UnusedAssignment
Variable `resp` initializer `null` is redundant
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
                        m_mDProps.bufferSize,
                        m_mDProps.clientId);
                kafka.javaapi.TopicMetadataResponse resp = null;
                resp = consumer.send(req);
                allMetaData.addAll(resp.topicsMetadata());
```

### UnusedAssignment
Variable `elapsedTime` initializer `0L` is redundant
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java
    public Long call() throws Exception {
        int sleepDuration = 1000;
        long elapsedTime = 0L;

        do {
```

### UnusedAssignment
Variable `goToSleep` initializer `false` is redundant
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
    private String findNewLeader(String a_oldLeader, String a_topic, int a_partition, int a_port) throws Exception {
        for (int i = 0; i < NEW_LEADER_TRIES; i++) {
            boolean goToSleep = false;
            PartitionMetadata metadata = findLeader(m_replicaBrokers, a_port, a_topic, a_partition);
            if (metadata == null) {
```

### UnusedAssignment
Variable `elapsedTime` initializer `0L` is redundant
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
    public Long call() throws Exception {
        int sleepDuration = 1000;
        long elapsedTime = 0L;

        do {
```

### UnusedAssignment
Variable `elapsedTime` initializer `0L` is redundant
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
    public Long call() throws Exception {
        int sleepDuration = 1000;
        long elapsedTime = 0L;
        do {
            long lStartTime = System.currentTimeMillis();
```

### UnusedAssignment
Variable `authority` initializer `null` is redundant
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
            int gtmIPStatusTryCount = 0;
            int gtmIPStatusFailCount = 0;
            String authority = null;

            try {
```

### UnusedAssignment
Variable `elapsedTime` initializer `0L` is redundant
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
    public Long call() throws Exception {
        int sleepDuration = 1000;
        long elapsedTime = 0L;
        long lStartTime = System.currentTimeMillis();
        MetricRegistry metrics;
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `zkClient != null` is always `true`
in `src/main/java/com/microsoft/kafkaavailability/KafkaUtils.java`
#### Snippet
```java
                m_logger.info("Topic exists. name: {}", topicName);
            } finally {
                if (zkClient != null) {
                    zkClient.close();
                }
```

### ConstantValue
Condition `zkClient != null` is always `true`
in `src/main/java/com/microsoft/kafkaavailability/KafkaUtils.java`
#### Snippet
```java
            return AdminUtils.topicExists(zkClient, topic);
        } finally {
            if (zkClient != null) {
                zkClient.close();
            }
```

### ConstantValue
Condition `goToSleep` is always `true`
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
                return metadata.leader().host();
            }
            if (goToSleep) {
                try {
                    Thread.sleep(NEW_LEADER_PAUSE_MS);
```

### ConstantValue
Condition `fetchResponse == null` is always `false`
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
                }

                if (fetchResponse == null) {
                    logger.error("Consumer could not retrieve Kafka fetch response from the Broker:" + leadBroker);
                    continue;
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.io.Resources' is marked unstable with @Beta
in `src/main/java/com/microsoft/kafkaavailability/PropertiesManager.java`
#### Snippet
```java
        if (url != null)
        {
            String text = Resources.toString(url, Charsets.UTF_8);
            m_prop = gson.fromJson(text, m_typeParameterClass);
            this.mergePropsFromEnv(m_prop);
```

### UnstableApiUsage
'toString(java.net.URL, java.nio.charset.Charset)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `src/main/java/com/microsoft/kafkaavailability/PropertiesManager.java`
#### Snippet
```java
        if (url != null)
        {
            String text = Resources.toString(url, Charsets.UTF_8);
            m_prop = gson.fromJson(text, m_typeParameterClass);
            this.mergePropsFromEnv(m_prop);
```

## RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'metaDataManager' to 'MetaDataManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java
            endTime = System.currentTimeMillis() + DEFAULT_ELAPSED_TIME;
        } finally {
            ((MetaDataManager) metaDataManager).close();
        }
        return (endTime - startTime);
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'metaDataManager' to 'MetaDataManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java
        metaDataManager.printEverything();

        ((MetaDataManager) metaDataManager).close();
    }
}
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'metaDataManager' to 'MetaDataManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
        }
        producer.close();
        ((MetaDataManager) metaDataManager).close();
        LOGGER.info("Finished ProducerLatency");
    }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'metaDataManager' to 'MetaDataManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
                appProperties.keyStoreFilePassword);

        ((MetaDataManager) metaDataManager).close();
        m_logger.info("Finished AvailabilityLatency");
    }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'metaDataManager' to 'MetaDataManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
        }

        ((MetaDataManager) metaDataManager).close();
        m_logger.info("Finished ConsumerLatency");
    }
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java
        String NEW_LINE = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " Object {" + NEW_LINE);
        result.append(" TopicName: " + m_TopicMetadata.topic() + NEW_LINE);
        result.append(" PartitionId: " + m_PartitionMetadata.partitionId() + NEW_LINE);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java

        result.append(this.getClass().getName() + " Object {" + NEW_LINE);
        result.append(" TopicName: " + m_TopicMetadata.topic() + NEW_LINE);
        result.append(" PartitionId: " + m_PartitionMetadata.partitionId() + NEW_LINE);
        result.append("}");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java
        result.append(this.getClass().getName() + " Object {" + NEW_LINE);
        result.append(" TopicName: " + m_TopicMetadata.topic() + NEW_LINE);
        result.append(" PartitionId: " + m_PartitionMetadata.partitionId() + NEW_LINE);
        result.append("}");

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
                allTopicMetadata.add(topic);
            }
            rString.append(sep).append(topic.topic() + "-->" + client);
        }
        m_logger.info("Mapping of topics and servers:" + rString);
```

