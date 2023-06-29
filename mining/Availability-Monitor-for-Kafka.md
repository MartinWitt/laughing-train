# Availability-Monitor-for-Kafka 
 
# Bad smells
I found 163 bad smells with 13 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 30 | false |
| UnnecessaryModifier | 10 | true |
| UnusedAssignment | 10 | false |
| Deprecation | 9 | false |
| UNCHECKED_WARNING | 8 | false |
| DanglingJavadoc | 8 | false |
| UNUSED_IMPORT | 8 | false |
| JavadocDeclaration | 8 | false |
| PlaceholderCountMatchesArgumentCount | 7 | false |
| FieldCanBeLocal | 6 | false |
| CatchMayIgnoreException | 5 | false |
| BusyWait | 5 | false |
| CastCanBeRemovedNarrowingVariableType | 5 | false |
| CommentedOutCode | 4 | false |
| AccessStaticViaInstance | 4 | false |
| ConstantValue | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| StringConcatenationInLoops | 3 | false |
| DataFlowIssue | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| AutoCloseableResource | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| UnstableApiUsage | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| WrapperTypeMayBePrimitive | 1 | false |
| BoxingBoxedValue | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| RedundantCollectionOperation | 1 | false |
| DuplicatedCode | 1 | false |
| RegExpSimplifiable | 1 | false |
| IOStreamConstructor | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| TrivialIf | 1 | false |
| IgnoreResultOfCall | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| InfiniteLoopStatement | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Module\[allGuiceModules.size()\]'
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
        //Parent injector to process command line arguments and json files

        Injector injector = parent.createChildInjector(allGuiceModules.toArray(new Module[allGuiceModules.size()]));

        appProperties = injector.getInstance(AppProperties.class);
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/microsoft/kafkaavailability/reporters/ScheduledReporterCollector.java`
#### Snippet
```java
        LOGGER.debug("Configuring metrics");

        Integer period = appProperties.reportInterval;
        this.reportIntervalInSeconds = period > 0 ? period : DEFAULT_REPORT_INTERVAL_IN_SECONDS;

```

## RuleId[id=UnnecessaryModifier]
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
Modifier `static` is redundant for inner enums
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdClient.java`
#### Snippet
```java
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]+");

    public static enum StatType { COUNTER, TIMER, GAUGE }

    private final String host;
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.kafkaavailability.IPropertiesManager' to 'com.microsoft.kafkaavailability.IPropertiesManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java
        IPropertiesManager consumerPropertiesManager = new PropertiesManager<ConsumerProperties>("consumerProperties.json", ConsumerProperties.class);
        IPropertiesManager metaDataPropertiesManager = new PropertiesManager<MetaDataManagerProperties>("metadatamanagerProperties.json", MetaDataManagerProperties.class);
        IMetaDataManager metaDataManager = new MetaDataManager(m_curatorFramework, metaDataPropertiesManager);
        IConsumer consumer = new Consumer(consumerPropertiesManager, metaDataManager);

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.kafkaavailability.IPropertiesManager' to 'com.microsoft.kafkaavailability.IPropertiesManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java
        IPropertiesManager metaDataPropertiesManager = new PropertiesManager<MetaDataManagerProperties>("metadatamanagerProperties.json", MetaDataManagerProperties.class);
        IMetaDataManager metaDataManager = new MetaDataManager(m_curatorFramework, metaDataPropertiesManager);
        IConsumer consumer = new Consumer(consumerPropertiesManager, metaDataManager);

        long startTime, endTime;
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.kafkaavailability.IPropertiesManager' to 'com.microsoft.kafkaavailability.IPropertiesManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java
    private void RunLeaderInfo() throws IOException, MetaDataManagerException {
        IPropertiesManager metaDataPropertiesManager = new PropertiesManager<MetaDataManagerProperties>("metadatamanagerProperties.json", MetaDataManagerProperties.class);
        IMetaDataManager metaDataManager = new MetaDataManager(m_curatorFramework, metaDataPropertiesManager);

        //Print all the topic/partition information.
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.kafkaavailability.IPropertiesManager' to 'com.microsoft.kafkaavailability.IPropertiesManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
        IPropertiesManager producerPropertiesManager = new PropertiesManager<ProducerProperties>("producerProperties.json", ProducerProperties.class);
        IPropertiesManager metaDataPropertiesManager = new PropertiesManager<MetaDataManagerProperties>("metadatamanagerProperties.json", MetaDataManagerProperties.class);
        IMetaDataManager metaDataManager = new MetaDataManager(m_curatorFramework, metaDataPropertiesManager);
        MetaDataManagerProperties metaDataProperties = (MetaDataManagerProperties) metaDataPropertiesManager.getProperties();

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.kafkaavailability.IPropertiesManager' to 'com.microsoft.kafkaavailability.IPropertiesManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
        MetaDataManagerProperties metaDataProperties = (MetaDataManagerProperties) metaDataPropertiesManager.getProperties();

        IProducer producer = new Producer(producerPropertiesManager, metaDataManager);

        //This is full list of topics
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.kafkaavailability.IPropertiesManager' to 'com.microsoft.kafkaavailability.IPropertiesManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
        IPropertiesManager producerPropertiesManager = new PropertiesManager<ProducerProperties>("producerProperties.json", ProducerProperties.class);
        IPropertiesManager metaDataPropertiesManager = new PropertiesManager<MetaDataManagerProperties>("metadatamanagerProperties.json", MetaDataManagerProperties.class);
        IMetaDataManager metaDataManager = new MetaDataManager(m_curatorFramework, metaDataPropertiesManager);
        MetaDataManagerProperties metaDataProperties = (MetaDataManagerProperties) metaDataPropertiesManager.getProperties();

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.kafkaavailability.IPropertiesManager' to 'com.microsoft.kafkaavailability.IPropertiesManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
        MetaDataManagerProperties metaDataProperties = (MetaDataManagerProperties) metaDataPropertiesManager.getProperties();

        IProducer producer = new Producer(producerPropertiesManager, metaDataManager);

        IPropertiesManager appPropertiesManager = new PropertiesManager<AppProperties>("appProperties.json", AppProperties.class);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.kafkaavailability.IPropertiesManager' to 'com.microsoft.kafkaavailability.IPropertiesManager'
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java

        IPropertiesManager metaDataPropertiesManager = new PropertiesManager<MetaDataManagerProperties>("metadatamanagerProperties.json", MetaDataManagerProperties.class);
        IMetaDataManager metaDataManager = new MetaDataManager(m_curatorFramework, metaDataPropertiesManager);

        IPropertiesManager appPropertiesManager = new PropertiesManager<AppProperties>("appProperties.json", AppProperties.class);
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=BoxingBoxedValue]
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

## RuleId[id=StringOperationCanBeSimplified]
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

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `src/main/java/com/microsoft/kafkaavailability/discovery/CommonUtils.java`
#### Snippet
```java
            }
        } catch (InterruptedException ie) {
            log.error("Error occured from {}; Exception: {}", name, ie);
            // (Re-)Cancel if current thread also interrupted
            pool.shutdownNow();
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java
            endTime = System.currentTimeMillis();
        } catch (Exception e) {
            m_logger.error("Error Reading from Topic: {}; Partition: {}; Exception: {}", m_TopicMetadata.topic(), m_PartitionMetadata.partitionId(), e);
            endTime = System.currentTimeMillis() + DEFAULT_ELAPSED_TIME;
        } finally {
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdReporter.java`
#### Snippet
```java

        } catch(IOException e) {
            LOGGER.warn("Unable to report to StatsD", statsdClient, e);
        } finally {
            try {
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdReporter.java`
#### Snippet
```java
                statsdClient.close();
            } catch (IOException e) {
                LOGGER.debug("Error disconnecting from StatsD server", statsdClient, e);
            }
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (at least 3)
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
                        } catch (Exception e) {
                            failCount++;
                            m_logger.error(name + " -- Error Writing to Topic: {} using : {}; Exception: {}", item.topic(), gtm, e);
                            endTime = System.currentTimeMillis() + DEFAULT_ELAPSED_TIME;
                        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
                    endTime = System.currentTimeMillis();
                } catch (Exception e) {
                    LOGGER.error("Error Writing to Topic: {}; Partition: {}; Exception: {}", item.topic(), part.partitionId(), e);
                    topicProducerFailCount++;
                    partitionProducerFailCount++;
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (2) than placeholders specified (3)
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
                    elapsedTime = Long.valueOf(response.get(key).get());
                } catch (InterruptedException | ExecutionException e) {
                    m_logger.error("Error Reading from Topic: {}; Partition: {}; Exception: {}", item.topic(), key, e);
                }
                if (elapsedTime >= DEFAULT_ELAPSED_TIME) {
```

## RuleId[id=CommentedOutCode]
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
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java

        this.m_phaser = phaser;
        //this.m_phaser.register(); //Registers/Add a new unArrived party to this phaser.
        //CommonUtils.dumpPhaserState("After register", phaser);
        this.m_threadSleepTime = threadSleepTime;
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

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/com/microsoft/kafkaavailability/discovery/ServiceUtil.java`
#### Snippet
```java

        builder.name(serviceName).payload(metadata).id(registerAddress + ":" +
                String.valueOf(servicePort)).serviceType(ServiceType.DYNAMIC).address(registerAddress).port(servicePort);

        return builder.build();
```

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

## RuleId[id=RedundantCollectionOperation]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/kafkaavailability/discovery/ServiceUtil.java`
#### Snippet
```java
        new EnsurePath(basePath).ensure(curatorFramework.getZookeeperClient());

        JsonInstanceSerializer<MetaData> serializer = new JsonInstanceSerializer<MetaData>(MetaData.class); // Payload Serializer
        ServiceDiscovery<MetaData> serviceDiscovery = ServiceDiscoveryBuilder.builder(MetaData.class).client(curatorFramework).basePath(basePath).serializer(serializer).build(); // Service Discovery
        serviceDiscovery.start();

        return serviceDiscovery;
```

## RuleId[id=CatchMayIgnoreException]
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

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdClient.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(StatsdClient.class);

    private static final Pattern WHITESPACE = Pattern.compile("[\\s]+");

    public static enum StatType { COUNTER, TIMER, GAUGE }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/com/microsoft/kafkaavailability/KeyStoreLoader.java`
#### Snippet
```java
        KeyStore trustStore = null;

        try (InputStream ksStream = new FileInputStream(keyStorePath)) {

            trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
        List<String> topics = new ArrayList<String>();
        if (!m_mDProps.canaryTestTopics.isEmpty()) {
            topics.addAll(m_mDProps.canaryTestTopics);
            int replicationFactor = (m_mDProps.replicationFactor > 0) ? m_mDProps.replicationFactor : 3;
            try {
```

## RuleId[id=Deprecation]
### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorClient.java`
#### Snippet
```java
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
            Throwables.propagate(e);
        }

```

### Deprecation
'org.apache.curator.utils.EnsurePath' is deprecated
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorClient.java`
#### Snippet
```java

            try {
                new EnsurePath(basePath).ensure(curatorFramework.getZookeeperClient());
            } catch (Exception e) {
                log.error(e.getMessage(), e);
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorClient.java`
#### Snippet
```java
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                Throwables.propagate(e);
            }
        }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorClient.java`
#### Snippet
```java
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
            Throwables.propagate(e);
        }

```

### Deprecation
'org.apache.curator.utils.EnsurePath' is deprecated
in `src/main/java/com/microsoft/kafkaavailability/discovery/ServiceUtil.java`
#### Snippet
```java
            throws Exception {

        new EnsurePath(basePath).ensure(curatorFramework.getZookeeperClient());

        JsonInstanceSerializer<MetaData> serializer = new JsonInstanceSerializer<MetaData>(MetaData.class); // Payload Serializer
```

### Deprecation
'org.apache.curator.utils.EnsurePath' is deprecated
in `src/main/java/com/microsoft/kafkaavailability/discovery/ServiceUtil.java`
#### Snippet
```java
            throws Exception {

        new EnsurePath(basePath).ensure(curatorFramework.getZookeeperClient());

        JsonInstanceSerializer<MetaData> serializer = new JsonInstanceSerializer<MetaData>(MetaData.class); // Payload Serializer
```

### Deprecation
'org.apache.curator.utils.EnsurePath' is deprecated
in `src/main/java/com/microsoft/kafkaavailability/discovery/ServiceUtil.java`
#### Snippet
```java
            throws Exception {

        new EnsurePath(basePath).ensure(curatorFramework.getZookeeperClient());

        JsonInstanceSerializer<MetaData> serializer = new JsonInstanceSerializer<MetaData>(MetaData.class); // Payload Serializer
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorManager.java`
#### Snippet
```java
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw Throwables.propagate(e);
        }

```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorManager.java`
#### Snippet
```java
            throw rte;
        } catch (Exception e) {
            throw Throwables.propagate(e);
        }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/kafkaavailability/properties/AppProperties.java`
#### Snippet
```java
// Licensed under the MIT license. See LICENSE file in the project root for full license information.
//*********************************************************
/**
 * Created by Akshat Kaul
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/kafkaavailability/properties/ConsumerProperties.java`
#### Snippet
```java
// Licensed under the MIT license. See LICENSE file in the project root for full license information.
//*********************************************************
/**
 * Created by Akshat Kaul
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/kafkaavailability/properties/ProducerProperties.java`
#### Snippet
```java
// Licensed under the MIT license. See LICENSE file in the project root for full license information.
//*********************************************************
/**
 * Created by Akshat Kaul
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/kafkaavailability/properties/MetaDataManagerProperties.java`
#### Snippet
```java
// Licensed under the MIT license. See LICENSE file in the project root for full license information.
//*********************************************************
/**
 * Created by Akshat Kaul
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
    private static void runOnce(MonitorTaskFactory monitorTaskFactory, ScheduledReporterCollector reporterCollector) throws IOException, MetaDataManagerException {

        /** The phaser is a nice synchronization barrier. */
        final Phaser phaser = new Phaser(1) {
            /**
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
        while (!phaser.isTerminated()) {

            /**
             * This block will try a TimeoutException. Why ? Because the phase isn't advanced.
             * It will be advanced when all registered tasks will invoke arrive* method.
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
        CommonUtils.shutdownAndAwaitTermination(service, "Main-ExecutorService-Thread");

        /**
         * When the final party for a given phase arrives, onAdvance() is invoked and the phase advances. The
         * "face advances" means that all threads reached the barrier and therefore all threads are synchronized and can
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
         */

        /**
         * The arrival and deregistration of the main thread allows the other threads to start working. This is because
         * now the registered parties equal the arrived parties.
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/kafkaavailability/discovery/CommonUtils.java`
#### Snippet
```java
     * Stop new job from being submitted and wait termination.
     * Taken from official documentation:
     * http://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ExecutorService.html
     * @param pool the thread pool
     */
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdClient.java`
#### Snippet
```java
    private DatagramSocket datagramSocket;
    private Writer writer;
    private final long MAX_FLUSH_BUFFER = 1400;

    public StatsdClient(String host, int port) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
    private Phaser m_phaser;
    private List<String> m_listServers;
    private long m_threadSleepTime;

    @Inject
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
 */
public class Producer implements IProducer {
    private IPropertiesManager<ProducerProperties> m_propManager;
    final static Logger m_logger = LoggerFactory.getLogger(Producer.class);
    private int m_vipRetries = 3;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
    final static Logger m_logger = LoggerFactory.getLogger(Producer.class);
    private int m_vipRetries = 3;
    private IMetaDataManager m_metaDataManager;
    private ProducerProperties producerProperties;
    private kafka.javaapi.producer.Producer<String, String> m_producer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
    private IPropertiesManager<ProducerProperties> m_propManager;
    final static Logger m_logger = LoggerFactory.getLogger(Producer.class);
    private int m_vipRetries = 3;
    private IMetaDataManager m_metaDataManager;
    private ProducerProperties producerProperties;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/kafkaavailability/PropertiesManager.java`
#### Snippet
```java
public class PropertiesManager<T> implements IPropertiesManager<T>
{
    private String m_propFileName;
    private T m_prop;
    final Class<T> m_typeParameterClass;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/com/microsoft/kafkaavailability/TopicPartition.java`
#### Snippet
```java
        {
            TopicPartition otherObj = (TopicPartition) obj;
            if (topic.equals(otherObj.topic) && partitionId == otherObj.partitionId)
                return true;
        }
```

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=CharsetObjectCanBeUsed]
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

## RuleId[id=AccessStaticViaInstance]
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
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ScheduledReporter' used without 'try'-with-resources statement
in `src/main/java/com/microsoft/kafkaavailability/reporters/ScheduledReporterCollector.java`
#### Snippet
```java
            Iterator<ScheduledReporter> reporterIterator = reporters.listIterator();
            while (reporterIterator.hasNext()) {
                reporterIterator.next().stop();
            }
        }
```

### AutoCloseableResource
'ScheduledReporter' used without 'try'-with-resources statement
in `src/main/java/com/microsoft/kafkaavailability/reporters/ScheduledReporterCollector.java`
#### Snippet
```java
            Iterator<ScheduledReporter> reporterIterator = reporters.listIterator();
            while (reporterIterator.hasNext()) {
                reporterIterator.next().start(reportIntervalInSeconds, TimeUnit.SECONDS);
            }
        }
```

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=InfiniteLoopStatement]
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/com/microsoft/kafkaavailability/discovery/MetaData.java`
#### Snippet
```java
     *
     * @param parameters - The parameter map
     * @return void
     */
    @JsonProperty
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorManager.java`
#### Snippet
```java
     * Verify services are registered.
     *
     * @throws Exception
     */
    public void verifyRegistrations() throws Exception {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/kafkaavailability/module/ModuleScanner.java`
#### Snippet
```java
     * Purpose of this method is to get all Guice module classes, to pick up drop wizard reporters in dependencies.
     *
     * @return
     */
    public static Set<Module> getModulesFromDependencies() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/kafkaavailability/module/ModuleScanner.java`
#### Snippet
```java
     * scan KAT and all KAT's dependencies.
     *
     * @return
     */
    private static Set<Class<? extends AbstractModule>> findAllModuleClasses() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/kafkaavailability/reporters/ScheduledReporterCollector.java`
#### Snippet
```java
     * Get the underlying metrics registry.
     *
     * @return
     */
    public MetricRegistry getRegistry() {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
     * Closes this context
     *
     * @throws IOException
     */
    public void close() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
     * @param keyStorePath file path to KeyStore file
     * @param keyStorePassword password to load KeyStore file
     * @throws Exception
     */

```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
     * @param topicName   topic name
     * @param partitionId partition id
     * @return
     */
    private KeyedMessage<String, String> createCanaryMessage(String topicName, String partitionId) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `log` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorClient.java`
#### Snippet
```java
public class CuratorClient {

    private static Logger log = LoggerFactory.getLogger(CuratorClient.class);

    public static final int DEFAULT_MAX_SLEEP_MS = 60000;
```

### FieldMayBeFinal
Field `log` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/discovery/CommonUtils.java`
#### Snippet
```java
public class CommonUtils {

    private static Logger log = LoggerFactory.getLogger(CommonUtils.class);

    /**
```

### FieldMayBeFinal
Field `m_curatorFramework` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java

    final static Logger m_logger = LoggerFactory.getLogger(ConsumerPartitionThread.class);
    private CuratorFramework m_curatorFramework;
    private TopicMetadata m_TopicMetadata;
    private PartitionMetadata m_PartitionMetadata;
```

### FieldMayBeFinal
Field `m_TopicMetadata` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java
    final static Logger m_logger = LoggerFactory.getLogger(ConsumerPartitionThread.class);
    private CuratorFramework m_curatorFramework;
    private TopicMetadata m_TopicMetadata;
    private PartitionMetadata m_PartitionMetadata;

```

### FieldMayBeFinal
Field `m_PartitionMetadata` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerPartitionThread.java`
#### Snippet
```java
    private CuratorFramework m_curatorFramework;
    private TopicMetadata m_TopicMetadata;
    private PartitionMetadata m_PartitionMetadata;

    public ConsumerPartitionThread(CuratorFramework curatorFramework, TopicMetadata topicMetadata, PartitionMetadata partitionMetadata) {
```

### FieldMayBeFinal
Field `active` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorManager.java`
#### Snippet
```java
     * Maintain client state of what was called by clients of this object.
     */
    private AtomicBoolean active = new AtomicBoolean(false);

    /**
```

### FieldMayBeFinal
Field `discoveryMap` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorManager.java`
#### Snippet
```java
     * Map of discovery objects and instances since there is a one to one correlation.
     */
    private Map<ServiceDiscovery<MetaData>, ServiceInstance<MetaData>> discoveryMap;

    private Map<String, ServiceProvider<MetaData>> serviceProviders = Maps.newHashMap();
```

### FieldMayBeFinal
Field `serviceProviders` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorManager.java`
#### Snippet
```java
    private Map<ServiceDiscovery<MetaData>, ServiceInstance<MetaData>> discoveryMap;

    private Map<String, ServiceProvider<MetaData>> serviceProviders = Maps.newHashMap();

    /**
```

### FieldMayBeFinal
Field `log` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/discovery/CuratorManager.java`
#### Snippet
```java
     * The log.
     */
    private Logger log = LoggerFactory.getLogger(this.getClass());

    /**
```

### FieldMayBeFinal
Field `m_phaser` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java
    private final CuratorFramework m_curatorFramework;

    private Phaser m_phaser;
    private long m_threadSleepTime;

```

### FieldMayBeFinal
Field `m_threadSleepTime` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/LeaderInfoThread.java`
#### Snippet
```java

    private Phaser m_phaser;
    private long m_threadSleepTime;

    @Inject
```

### FieldMayBeFinal
Field `prefix` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdReporter.java`
#### Snippet
```java
    public static class Builder {
        private final MetricRegistry registry;
        private String prefix;
        private TimeUnit rateUnit;
        private TimeUnit durationUnit;
```

### FieldMayBeFinal
Field `filter` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdReporter.java`
#### Snippet
```java
        private TimeUnit rateUnit;
        private TimeUnit durationUnit;
        private MetricFilter filter;

        private Builder(MetricRegistry registry) {
```

### FieldMayBeFinal
Field `outputData` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/reporters/StatsdClient.java`
#### Snippet
```java
    private boolean prependNewline = false;

    private ByteArrayOutputStream outputData;
    private DatagramSocket datagramSocket;
    private Writer writer;
```

### FieldMayBeFinal
Field `m_phaser` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java
    private final MetricNameEncodedFactory metricNameFactory;

    private Phaser m_phaser;
    private long m_threadSleepTime;

```

### FieldMayBeFinal
Field `m_threadSleepTime` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
#### Snippet
```java

    private Phaser m_phaser;
    private long m_threadSleepTime;

    @Inject
```

### FieldMayBeFinal
Field `m_threadSleepTime` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java

    private Phaser m_phaser;
    private long m_threadSleepTime;

    @Inject
```

### FieldMayBeFinal
Field `m_phaser` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/ProducerThread.java`
#### Snippet
```java
    private final MetricNameEncodedFactory metricNameFactory;

    private Phaser m_phaser;
    private long m_threadSleepTime;

```

### FieldMayBeFinal
Field `client` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
{
    final static Logger m_logger = LoggerFactory.getLogger(MetaDataManager.class);
    private CuratorFramework client;

    MetaDataManagerProperties m_mDProps;
```

### FieldMayBeFinal
Field `m_phaser` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
    private final MetricNameEncodedFactory metricNameFactory;

    private Phaser m_phaser;
    private List<String> m_listServers;
    private long m_threadSleepTime;
```

### FieldMayBeFinal
Field `m_threadSleepTime` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
    private Phaser m_phaser;
    private List<String> m_listServers;
    private long m_threadSleepTime;

    @Inject
```

### FieldMayBeFinal
Field `m_listServers` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java

    private Phaser m_phaser;
    private List<String> m_listServers;
    private long m_threadSleepTime;

```

### FieldMayBeFinal
Field `computerName` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/App.java`
#### Snippet
```java
    static List<String> listServers;

    private static String computerName = CommonUtils.getComputerName();

    public static void main(String[] args) throws IOException, MetaDataManagerException, InterruptedException {
```

### FieldMayBeFinal
Field `m_propManager` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
 */
public class Producer implements IProducer {
    private IPropertiesManager<ProducerProperties> m_propManager;
    final static Logger m_logger = LoggerFactory.getLogger(Producer.class);
    private int m_vipRetries = 3;
```

### FieldMayBeFinal
Field `m_producer` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
    private IMetaDataManager m_metaDataManager;
    private ProducerProperties producerProperties;
    private kafka.javaapi.producer.Producer<String, String> m_producer;
    private static SSLSocketFactory sslSocketFactory = null;

```

### FieldMayBeFinal
Field `producerProperties` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
    private int m_vipRetries = 3;
    private IMetaDataManager m_metaDataManager;
    private ProducerProperties producerProperties;
    private kafka.javaapi.producer.Producer<String, String> m_producer;
    private static SSLSocketFactory sslSocketFactory = null;
```

### FieldMayBeFinal
Field `m_metaDataManager` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
    final static Logger m_logger = LoggerFactory.getLogger(Producer.class);
    private int m_vipRetries = 3;
    private IMetaDataManager m_metaDataManager;
    private ProducerProperties producerProperties;
    private kafka.javaapi.producer.Producer<String, String> m_producer;
```

### FieldMayBeFinal
Field `m_vipRetries` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
    private IPropertiesManager<ProducerProperties> m_propManager;
    final static Logger m_logger = LoggerFactory.getLogger(Producer.class);
    private int m_vipRetries = 3;
    private IMetaDataManager m_metaDataManager;
    private ProducerProperties producerProperties;
```

### FieldMayBeFinal
Field `m_propFileName` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/PropertiesManager.java`
#### Snippet
```java
public class PropertiesManager<T> implements IPropertiesManager<T>
{
    private String m_propFileName;
    private T m_prop;
    final Class<T> m_typeParameterClass;
```

### FieldMayBeFinal
Field `m_prop` may be 'final'
in `src/main/java/com/microsoft/kafkaavailability/PropertiesManager.java`
#### Snippet
```java
{
    private String m_propFileName;
    private T m_prop;
    final Class<T> m_typeParameterClass;
    final static Logger m_logger = LoggerFactory.getLogger(PropertiesManager.class);
```

## RuleId[id=MismatchedCollectionQueryUpdate]
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

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=BusyWait]
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
in `src/main/java/com/microsoft/kafkaavailability/threads/AvailabilityThread.java`
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

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
                for (kafka.cluster.Broker replica : part.replicas())
                {
                    replicas += " " + replica.host();
                }
                for (kafka.cluster.Broker replica : part.isr())
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/com/microsoft/kafkaavailability/MetaDataManager.java`
#### Snippet
```java
                for (kafka.cluster.Broker replica : part.isr())
                {
                    isr += " " + replica.host();
                }
                String leader = "";
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/com/microsoft/kafkaavailability/Producer.java`
#### Snippet
```java
        String brokerList = "";
        for (String broker : m_metaDataManager.getBrokerList(true)) {
            brokerList += broker + ", ";
        }
        props.put("metadata.broker.list", brokerList);
```

## RuleId[id=UnusedAssignment]
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
Variable `reportIntervalInSeconds` initializer `DEFAULT_REPORT_INTERVAL_IN_SECONDS` is redundant
in `src/main/java/com/microsoft/kafkaavailability/reporters/ScheduledReporterCollector.java`
#### Snippet
```java
    private final MetricRegistry metricRegistry;

    private int reportIntervalInSeconds = DEFAULT_REPORT_INTERVAL_IN_SECONDS;
    private final List<ScheduledReporter> reporters;

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
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
    public Long call() throws Exception {
        int sleepDuration = 1000;
        long elapsedTime = 0L;
        long lStartTime = System.currentTimeMillis();
        MetricRegistry metrics;
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

## RuleId[id=ConstantValue]
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
Condition `fetchResponse == null` is always `false`
in `src/main/java/com/microsoft/kafkaavailability/Consumer.java`
#### Snippet
```java
                }

                if (fetchResponse == null) {
                    logger.error("Consumer could not retrieve Kafka fetch response from the Broker:" + leadBroker);
                    continue;
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

## RuleId[id=UnstableApiUsage]
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

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
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
in `src/main/java/com/microsoft/kafkaavailability/threads/ConsumerThread.java`
#### Snippet
```java
        }

        ((MetaDataManager) metaDataManager).close();
        m_logger.info("Finished ConsumerLatency");
    }
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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

