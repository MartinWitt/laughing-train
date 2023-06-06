# cadence-java-samples 
 
# Bad smells
I found 33 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 11 | false |
| DuplicatedCode | 3 | false |
| ThrowablePrintedToSystemOut | 3 | false |
| FieldMayBeFinal | 2 | false |
| Deprecation | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| DanglingJavadoc | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| JavadocReference | 1 | false |
| CommentedOutCode | 1 | false |
| BusyWait | 1 | false |
| FieldCanBeLocal | 1 | false |
| UnstableApiUsage | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'com.uber.cadence.samples.hello.HelloDataConverter.MyStruct' to 'T'
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
        throws DataConverterException {
      if (valueType.getTypeName().equals(MyStruct.class.getTypeName())) {
        return (T) MyStruct.fromBytes(content);
      } else {
        return cadenceDefaultDataConverter.fromData(content, valueClass, valueType);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `invoke(Functions.Proc)`
in `src/main/java/com/uber/cadence/samples/hello/HelloActivityRetry.java`
#### Snippet
```java
    /**
     * To enable activity retry set {@link RetryOptions} on {@link ActivityOptions}. It also works
     * for activities invoked through {@link com.uber.cadence.workflow.Async#invoke(Functions.Proc)}
     * and for child workflows.
     */
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param a` tag description is missing
in `src/main/java/com/uber/cadence/samples/calculation/Activities.java`
#### Snippet
```java

  /**
   * @param a
   * @param b
   * @return a*b
```

### JavadocDeclaration
`@param b` tag description is missing
in `src/main/java/com/uber/cadence/samples/calculation/Activities.java`
#### Snippet
```java
  /**
   * @param a
   * @param b
   * @return a*b
   */
```

### JavadocDeclaration
`@param content` tag description is missing
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
     * workflow/activity, exception, internal classes(local activity, heartbeat etc)
     *
     * @param content
     * @param valueClass
     * @param valueType
```

### JavadocDeclaration
`@param valueClass` tag description is missing
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
     *
     * @param content
     * @param valueClass
     * @param valueType
     * @param <T>
```

### JavadocDeclaration
`@param valueType` tag description is missing
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
     * @param content
     * @param valueClass
     * @param valueType
     * @param <T>
     * @return
```

### JavadocDeclaration
`@param ` tag description is missing
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
     * @param valueClass
     * @param valueType
     * @param <T>
     * @return
     * @throws DataConverterException
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
     * @param valueType
     * @param <T>
     * @return
     * @throws DataConverterException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
     * @param <T>
     * @return
     * @throws DataConverterException
     */
    @Override
```

### JavadocDeclaration
`@param values` tag description is missing
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
     * classes(local activity, heartbeat etc) into binary.
     *
     * @param values
     * @return
     * @throws DataConverterException
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
     *
     * @param values
     * @return
     * @throws DataConverterException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
     * @param values
     * @return
     * @throws DataConverterException
     */
    @Override
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/com/uber/cadence/samples/fileprocessing/FileProcessingStarter.java`
#### Snippet
```java

    // Use this code instead of the above blocking call to start workflow asynchronously.
    //        WorkflowExecution workflowExecution = WorkflowClient.start(workflow::processFile,
    // source, destination);
    //        System.out.println("Started periodic workflow with workflowId=\"" +
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `scope` may be 'final'
in `src/main/java/com/uber/cadence/samples/hello/HelloMetric.java`
#### Snippet
```java
class PrometheusScope implements Scope {

  private Scope scope;

  PrometheusScope(Scope scope) {
```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `src/main/java/com/uber/cadence/samples/calculation/WorkflowMethodsImpl.java`
#### Snippet
```java
public class WorkflowMethodsImpl implements WorkflowMethods {

  private static Logger LOGGER = Workflow.getLogger(WorkflowMethodsImpl.class);

  private final ActivityOptions options =
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/samples/hello/HelloActivity.java`
#### Snippet
```java
    WorkflowClient workflowClient =
        WorkflowClient.newInstance(
            new Thrift2ProtoAdapter(IGrpcServiceStubs.newInstance()),
            WorkflowClientOptions.newBuilder().setDomain(DOMAIN).build());
    // Get worker to poll the task list.
    WorkerFactory factory = WorkerFactory.newInstance(workflowClient);
    Worker worker = factory.newWorker(TASK_LIST);
    // Workflows are stateful. So you need a type to create instances.
    worker.registerWorkflowImplementationTypes(GreetingWorkflowImpl.class);
    // Activities are stateless and thread safe. So a shared instance is used.
    worker.registerActivitiesImplementations(new GreetingActivitiesImpl());
    // Start listening to the workflow and activity task lists.
    factory.start();
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/samples/hello/HelloWorkerSetup.java`
#### Snippet
```java
    worker.registerWorkflowImplementationTypes(GreetingWorkflowImpl.class);
    // Activities are stateless and thread safe. So a shared instance is used.
    worker.registerActivitiesImplementations(new GreetingActivitiesImpl());
    // Start listening to the workflow and activity task lists.
    factory.start();

    // Start a workflow execution. Usually this is done from another program.
    // Get a workflow stub using the same task list the worker uses.
    GreetingWorkflow workflow = workflowClient.newWorkflowStub(GreetingWorkflow.class);
    // Execute a workflow waiting for it to complete.
    String greeting = workflow.getGreeting("World");
    System.out.println(greeting);
    System.exit(0);
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/samples/hello/HelloConsistentQuery.java`
#### Snippet
```java
    WorkflowClient workflowClient =
        WorkflowClient.newInstance(
            new Thrift2ProtoAdapter(IGrpcServiceStubs.newInstance()),
            WorkflowClientOptions.newBuilder().setDomain(DOMAIN).build());
    // Get worker to poll the task list.
    WorkerFactory factory = WorkerFactory.newInstance(workflowClient);
    Worker worker = factory.newWorker(TASK_LIST);
    worker.registerWorkflowImplementationTypes(GreetingWorkflowImpl.class);
    factory.start();

    // Start a workflow execution. Usually this is done from another program.
    // Get a workflow stub using the same task list the worker uses.
    WorkflowOptions workflowOptions =
        new WorkflowOptions.Builder()
            .setTaskList(TASK_LIST)
            .setExecutionStartToCloseTimeout(Duration.ofSeconds(30))
            .build();
```

## RuleId[id=Deprecation]
### Deprecation
'com.uber.m3.tally.Buckets' is deprecated
in `src/main/java/com/uber/cadence/samples/hello/HelloMetric.java`
#### Snippet
```java

  @Override
  public Histogram histogram(final String name, final Buckets buckets) {
    String newName = fixName(name);
    return scope.histogram(newName, buckets);
```

### Deprecation
'createTempDir()' is deprecated
in `src/main/java/com/uber/cadence/samples/fileprocessing/StoreActivitiesImpl.java`
#### Snippet
```java
    try {
      byte[] binary = Resources.toByteArray(url);
      File destination = new File(Files.createTempDir(), "downloaded");
      Files.write(binary, destination);
      System.out.println(
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `newName` is redundant
in `src/main/java/com/uber/cadence/samples/hello/HelloMetric.java`
#### Snippet
```java

  private String fixName(String name) {
    String newName = name.replace('-', '_');
    return newName;
  }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
        throws DataConverterException {
      if ((content == null) || (content.length == 0)) {
        Object[] result = new Object[valueTypes.length];
        return result;
      }
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/cadence/samples/hello/HelloPeriodic.java`
#### Snippet
```java
      // This value is so low just for the sample purpose. In production workflow
      // it is usually much higher.
      Thread.sleep(10000);
    }
  }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/uber/cadence/samples/hello/HelloCancellation.java`
#### Snippet
```java
        // This exception is thrown when a cancellation is requested on the current workflow
      } catch (CancellationException e) {
        /**
         * Any call to an activity or a child workflow after the workflow is cancelled is going to
         * fail immediately with the CancellationException. the DetachedCancellationScope doesn't
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/uber/cadence/samples/hello/HelloWorkerSetup.java`
#### Snippet
```java
            WorkflowClientOptions.newBuilder().setDomain(DOMAIN).build());

    /**
     * If you see error "Not enough threads to execute workflows" exception it indicates that there
     * are not enough threads to execute currently running workflow tasks.
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/uber/cadence/samples/hello/HelloMetric.java`
#### Snippet
```java
/**
 * Hello World Cadence workflow that executes a single activity with emitting metrics to Prometheus.
 * Check http://localhost:9098/ to see the reported metrics for scaping. Requires a local instance
 * the Cadence service to be running.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/uber/cadence/samples/hello/HelloMetric.java`
#### Snippet
```java
/**
 * PrometheusScope will replace all "-"(dash) into "_"(underscore) so that it meets the requirement
 * in https://prometheus.io/docs/concepts/data_model/
 */
class PrometheusScope implements Scope {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/cadence/samples/hello/HelloPeriodic.java`
#### Snippet
```java
     * an hour 24 would make sense.
     */
    private final int CONTINUE_AS_NEW_FREQUENCEY = 10;

    private final GreetingActivities activities =
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'createTempDir()' is marked unstable with @Beta
in `src/main/java/com/uber/cadence/samples/fileprocessing/StoreActivitiesImpl.java`
#### Snippet
```java
    try {
      byte[] binary = Resources.toByteArray(url);
      File destination = new File(Files.createTempDir(), "downloaded");
      Files.write(binary, destination);
      System.out.println(
```

## RuleId[id=ThrowablePrintedToSystemOut]
### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.out.println()' call
in `src/main/java/com/uber/cadence/samples/hello/HelloCron.java`
#### Snippet
```java
      System.out.println("Cron workflow is terminated");
    } catch (Exception e) {
      System.out.println(e);
    }
    System.exit(0);
```

### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.out.println()' call
in `src/main/java/com/uber/cadence/samples/hello/HelloSearchAttributes.java`
#### Snippet
```java
      System.out.printf("In workflow we get CustomKeywordField is: %s\n", keyword);
    } catch (Exception e) {
      System.out.println(e);
    }

```

### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.out.println()' call
in `src/main/java/com/uber/cadence/samples/shadowing/ShadowTraffic.java`
#### Snippet
```java
          } catch (Exception e) {
            System.out.println("Failed to start shadowing workflow");
            System.out.println(e);
            latch.countDown();
          }
```

