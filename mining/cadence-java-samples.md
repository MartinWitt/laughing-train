# cadence-java-samples 
 
# Bad smells
I found 116 bad smells with 33 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 70 | false |
| UtilityClassWithoutPrivateConstructor | 29 | true |
| ThrowablePrintStackTrace | 3 | false |
| ThrowablePrintedToSystemOut | 3 | false |
| CodeBlock2Expr | 2 | true |
| UnnecessaryLocalVariable | 2 | true |
| FieldMayBeStatic | 1 | false |
| CommentedOutCode | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| ReturnNull | 1 | false |
| BusyWait | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| UnstableApiUsage | 1 | false |
## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/calculation/WorkflowStarter.java`
#### Snippet
```java

    WorkflowExecution execution = WorkflowClient.start(calculation::calculate, 4L, 5L, 6L);
    System.out.println("started workflow execution" + execution);
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloAsyncLambda.java`
#### Snippet
```java
    // Execute a workflow waiting for it to complete.
    String greeting = workflow.getGreeting("World");
    System.out.println(greeting);
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloWorkerSetup.java`
#### Snippet
```java
    // Execute a workflow waiting for it to complete.
    String greeting = workflow.getGreeting("World");
    System.out.println(greeting);
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
    // Execute a workflow waiting for it to complete.
    String greeting = workflow.getGreeting(new MyStruct(100, "Hello"));
    System.out.println(greeting);
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloActivityRetry.java`
#### Snippet
```java
      if (lastInvocationTime != 0) {
        long timeSinceLastInvocation = System.currentTimeMillis() - lastInvocationTime;
        System.out.print(timeSinceLastInvocation + " milliseconds since last invocation. ");
      }
      lastInvocationTime = System.currentTimeMillis();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloActivityRetry.java`
#### Snippet
```java
      lastInvocationTime = System.currentTimeMillis();
      if (++callCount < 4) {
        System.out.println("composeGreeting activity is going to fail");
        throw new IllegalStateException("not yet");
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloActivityRetry.java`
#### Snippet
```java
        throw new IllegalStateException("not yet");
      }
      System.out.println("composeGreeting activity is going to complete");
      return greeting + " " + name + "!";
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloActivityRetry.java`
#### Snippet
```java
    // Execute a workflow waiting for it to complete.
    String greeting = workflow.getGreeting("World");
    System.out.println(greeting);
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/calculation/WorkflowWorker.java`
#### Snippet
```java
    // Start all workers created by this factory.
    factory.start();
    System.out.println("Worker started for task list: " + DEFAULT_TASK_LIST);
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/fileprocessing/FileProcessingStarter.java`
#### Snippet
```java
    FileProcessingWorkflow workflow = workflowClient.newWorkflowStub(FileProcessingWorkflow.class);

    System.out.println("Executing FileProcessingWorkflow");

    URL source = new URL("http://www.google.com/");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/fileprocessing/FileProcessingStarter.java`
#### Snippet
```java
    // This is rarely used in production. Use the commented code below for async start version.
    workflow.processFile(source, destination);
    System.out.println("FileProcessingWorkflow completed");

    // Use this code instead of the above blocking call to start workflow asynchronously.
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloAsync.java`
#### Snippet
```java
    // Execute a workflow waiting for it to complete.
    String greeting = workflow.getGreeting("World");
    System.out.println(greeting);
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/common/QueryWorkflowExecution.java`
#### Snippet
```java
  public static void main(String[] args) throws Exception {
    if (args.length < 2 || args.length > 3) {
      System.err.println(
          "Usage: java "
              + QueryWorkflowExecution.class.getName()
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/common/QueryWorkflowExecution.java`
#### Snippet
```java
    String result = workflow.query(queryType, String.class);

    System.out.println("Query result for " + workflowExecution + ":");
    System.out.println(result);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/common/QueryWorkflowExecution.java`
#### Snippet
```java

    System.out.println("Query result for " + workflowExecution + ":");
    System.out.println(result);
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloCancellation.java`
#### Snippet
```java
      client.getResult(String.class);
    } catch (CancellationException ignored) {
      System.out.println("workflow cancelled. Cancellation exception thrown");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloCancellation.java`
#### Snippet
```java
    }

    System.out.println(activities.getInvocations());
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/common/WorkflowExecutionHistoryPrinter.java`
#### Snippet
```java
  public static void main(String[] args) throws Exception {
    if (args.length < 2) {
      System.err.println(
          "Usage: java "
              + WorkflowExecutionHistoryPrinter.class.getName()
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/common/WorkflowExecutionHistoryPrinter.java`
#### Snippet
```java
    String runId = args[1];
    workflowExecution.setRunId(runId);
    System.out.println(
        WorkflowExecutionUtils.prettyPrintHistory(cadenceService, DOMAIN, workflowExecution, true));
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloChild.java`
#### Snippet
```java
    // Execute a workflow waiting for it to complete.
    String greeting = workflow.getGreeting("World");
    System.out.println(greeting);
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloException.java`
#### Snippet
```java
      Throwable cause = Throwables.getRootCause(e);
      // prints "Hello World!"
      System.out.println(cause.getMessage());
      System.out.println("\nStack Trace:\n" + Throwables.getStackTraceAsString(e));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloException.java`
#### Snippet
```java
      // prints "Hello World!"
      System.out.println(cause.getMessage());
      System.out.println("\nStack Trace:\n" + Throwables.getStackTraceAsString(e));
    }
    System.exit(0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloConsistentQuery.java`
#### Snippet
```java
    // Start workflow asynchronously to not use another thread to query.
    final WorkflowExecution wf = workflow.start("World");
    System.out.println("started workflow " + wf.getWorkflowId() + ", " + wf.getRunId());
    System.out.println("initial value after started");
    System.out.println(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloConsistentQuery.java`
#### Snippet
```java
    final WorkflowExecution wf = workflow.start("World");
    System.out.println("started workflow " + wf.getWorkflowId() + ", " + wf.getRunId());
    System.out.println("initial value after started");
    System.out.println(
        workflow.queryWithOptions(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloConsistentQuery.java`
#### Snippet
```java
    System.out.println("started workflow " + wf.getWorkflowId() + ", " + wf.getRunId());
    System.out.println("initial value after started");
    System.out.println(
        workflow.queryWithOptions(
            "GreetingWorkflow::getCounter",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloConsistentQuery.java`
#### Snippet
```java
    // Now we can send a signal to it using workflow stub.
    workflow.signal("GreetingWorkflow::increase");
    System.out.println("after increase 1 time");
    System.out.println(
        workflow.queryWithOptions(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloConsistentQuery.java`
#### Snippet
```java
    workflow.signal("GreetingWorkflow::increase");
    System.out.println("after increase 1 time");
    System.out.println(
        workflow.queryWithOptions(
            "GreetingWorkflow::getCounter",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloConsistentQuery.java`
#### Snippet
```java
    workflow.signal("GreetingWorkflow::increase");
    workflow.signal("GreetingWorkflow::increase");
    System.out.println("after increase 1+4 times");
    System.out.println(
        workflow.queryWithOptions(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloConsistentQuery.java`
#### Snippet
```java
    workflow.signal("GreetingWorkflow::increase");
    System.out.println("after increase 1+4 times");
    System.out.println(
        workflow.queryWithOptions(
            "GreetingWorkflow::getCounter",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloAsyncActivityCompletion.java`
#### Snippet
```java
    CompletableFuture<String> greeting = WorkflowClient.execute(workflow::getGreeting, "World");
    // Wait for workflow completion.
    System.out.println(greeting.get());
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloQuery.java`
#### Snippet
```java
    // So we can send a signal to it using workflow stub.

    System.out.println(workflow.queryGreeting()); // Should print Hello...
    // Note that inside a workflow only WorkflowThread.sleep is allowed. Outside
    // WorkflowThread.sleep is not allowed.
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloQuery.java`
#### Snippet
```java
    // WorkflowThread.sleep is not allowed.
    Thread.sleep(2500);
    System.out.println(workflow.queryGreeting()); // Should print Bye ...
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloCron.java`
#### Snippet
```java
    CronWorkflow workflow = workflowClient.newWorkflowStub(CronWorkflow.class);
    WorkflowClient.start(workflow::greetPeriodically, "World");
    System.out.println("Cron workflow is running");

    // Cron workflow will not stop until it is terminated or cancelled.
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloCron.java`
#### Snippet
```java
    try {
      cadenceService.TerminateWorkflowExecution(request);
      System.out.println("Cron workflow is terminated");
    } catch (Exception e) {
      System.out.println(e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloCron.java`
#### Snippet
```java
      System.out.println("Cron workflow is terminated");
    } catch (Exception e) {
      System.out.println(e);
    }
    System.exit(0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloCron.java`
#### Snippet
```java
    @Override
    public void greet(String greeting) {
      System.out.println("From " + Activity.getWorkflowExecution() + ": " + greeting);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/fileprocessing/FileProcessingWorker.java`
#### Snippet
```java
    // Start all workers created by this factory.
    factory.start();
    System.out.println("Worker started for task list: " + TASK_LIST);
    System.out.println("Worker Started for activity task List: " + hostSpecifiTaskList);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/fileprocessing/FileProcessingWorker.java`
#### Snippet
```java
    factory.start();
    System.out.println("Worker started for task list: " + TASK_LIST);
    System.out.println("Worker Started for activity task List: " + hostSpecifiTaskList);
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/bookingsaga/TripBookingSaga.java`
#### Snippet
```java
    // Start all workers created by this factory.
    factory.start();
    System.out.println("Worker started for task list: " + TASK_LIST);

    // now we can start running instances of our saga - its state will be persisted
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/shadowing/ShadowTraffic.java`
#### Snippet
```java
            shadowingWorker.start();
          } catch (Exception e) {
            System.out.println("Failed to start shadowing workflow");
            System.out.println(e);
            latch.countDown();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/shadowing/ShadowTraffic.java`
#### Snippet
```java
          } catch (Exception e) {
            System.out.println("Failed to start shadowing workflow");
            System.out.println(e);
            latch.countDown();
          }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/fileprocessing/StoreActivitiesImpl.java`
#### Snippet
```java
    }
    // Faking upload to simplify sample implementation.
    System.out.println("upload activity: uploaded from " + localFileName + " to " + url);
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/fileprocessing/StoreActivitiesImpl.java`
#### Snippet
```java
  @Override
  public String process(String sourceFile) {
    System.out.println("process activity: sourceFile= " + sourceFile);
    try {
      String processedName = processFileImpl(sourceFile);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/fileprocessing/StoreActivitiesImpl.java`
#### Snippet
```java
    try {
      String processedName = processFileImpl(sourceFile);
      System.out.println("process activity: processed file: " + processedName);
      return processedName;
    } catch (IOException e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/fileprocessing/StoreActivitiesImpl.java`
#### Snippet
```java
      File destination = new File(Files.createTempDir(), "downloaded");
      Files.write(binary, destination);
      System.out.println(
          "download activity: downloaded from " + url + " to " + destination.getAbsolutePath());
      return new TaskListFileNamePair(hostSpecificTaskList, destination.getAbsolutePath());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/bookingsaga/TripBookingActivitiesImpl.java`
#### Snippet
```java
  @Override
  public String cancelHotel(String reservationID, String name) {
    System.out.println("cancelling hotel reservation '" + reservationID + "' for '" + name + "'");
    return UUID.randomUUID().toString();
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/bookingsaga/TripBookingActivitiesImpl.java`
#### Snippet
```java
  @Override
  public String bookFlight(String name) {
    System.out.println("failing to book flight for '" + name + "'");
    throw new RuntimeException("Flight booking did not work");
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/bookingsaga/TripBookingActivitiesImpl.java`
#### Snippet
```java
  @Override
  public String reserveCar(String name) {
    System.out.println("reserve car for '" + name + "'");
    return UUID.randomUUID().toString();
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/bookingsaga/TripBookingActivitiesImpl.java`
#### Snippet
```java
  @Override
  public String cancelCar(String reservationID, String name) {
    System.out.println("cancelling car reservation '" + reservationID + "' for '" + name + "'");
    return UUID.randomUUID().toString();
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/bookingsaga/TripBookingActivitiesImpl.java`
#### Snippet
```java
  @Override
  public String bookHotel(String name) {
    System.out.println("booking hotel for '" + name + "'");
    return UUID.randomUUID().toString();
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/bookingsaga/TripBookingActivitiesImpl.java`
#### Snippet
```java
  @Override
  public String cancelFlight(String reservationID, String name) {
    System.out.println("cancelling flight reservation '" + reservationID + "' for '" + name + "'");
    return UUID.randomUUID().toString();
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/common/RegisterDomain.java`
#### Snippet
```java
    try {
      cadenceService.RegisterDomain(request);
      System.out.println(
          "Successfully registered domain \""
              + DOMAIN
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/common/RegisterDomain.java`
#### Snippet
```java
              + retentionPeriodInDays);
    } catch (DomainAlreadyExistsError e) {
      System.out.println("Domain \"" + DOMAIN + "\" is already registered");
    }
    System.exit(0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloActivity.java`
#### Snippet
```java
    // Execute a workflow waiting for it to complete.
    String greeting = workflow.getGreeting("World");
    System.out.println(greeting);
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloSideEffect.java`
#### Snippet
```java
    workflow.start();
    // Query and print the set value
    System.out.println(workflow.get());
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloPeriodic.java`
#### Snippet
```java
          workflow.getResult(Void.class); //
        } catch (WorkflowException e) {
          System.out.println("Previous instance failed:\n" + Throwables.getStackTraceAsString(e));
        }
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloPeriodic.java`
#### Snippet
```java
        execution =
            WorkflowClient.start(workflow::greetPeriodically, "World", Duration.ofSeconds(1));
        System.out.println("Started " + execution);
      } catch (DuplicateWorkflowException e) {
        System.out.println("Still running as " + e.getExecution());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloPeriodic.java`
#### Snippet
```java
        System.out.println("Started " + execution);
      } catch (DuplicateWorkflowException e) {
        System.out.println("Still running as " + e.getExecution());
      } catch (Throwable e) {
        e.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloPeriodic.java`
#### Snippet
```java
    @Override
    public void greet(String greeting) {
      System.out.println("From " + Activity.getWorkflowExecution() + ": " + greeting);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloSaga.java`
#### Snippet
```java
    @Override
    public void compensate(int amount) {
      System.out.println("ActivityCompensationImpl.compensate() is called with amount " + amount);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloSaga.java`
#### Snippet
```java
        // to log messages in workflow code.
        saga.addCompensation(
            () -> System.out.println("Other compensation logic in main workflow."));
        throw new RuntimeException("some error");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloSaga.java`
#### Snippet
```java
    @Override
    public void execute(int amount) {
      System.out.println("ActivityOperationImpl.execute() is called with amount " + amount);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloLocalActivity.java`
#### Snippet
```java
    // Execute a workflow waiting for it to complete.
    String greeting = workflow.getGreeting("World");
    System.out.println(greeting);
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloSearchAttributes.java`
#### Snippet
```java
          WorkflowUtils.getValueFromSearchAttributes(
              searchAttributes, "CustomKeywordField", String.class);
      System.out.printf("In workflow we get CustomKeywordField is: %s\n", keyword);
    } catch (Exception e) {
      System.out.println(e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloSearchAttributes.java`
#### Snippet
```java
      System.out.printf("In workflow we get CustomKeywordField is: %s\n", keyword);
    } catch (Exception e) {
      System.out.println(e);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloSearchAttributes.java`
#### Snippet
```java
    }

    System.out.println(greeting);
    System.exit(0);
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloSearchAttributes.java`
#### Snippet
```java
      SearchAttributes currentSearchAttributes = Workflow.getWorkflowInfo().getSearchAttributes();
      // Use System.out just for demo, please use Workflow.getLogger in production.
      System.out.println("Search Attributes on start: ");
      printSearchAttributes(currentSearchAttributes);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloSearchAttributes.java`
#### Snippet
```java

      currentSearchAttributes = Workflow.getWorkflowInfo().getSearchAttributes();
      System.out.println("Search Attributes after upsert: ");
      printSearchAttributes(currentSearchAttributes);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloSearchAttributes.java`
#### Snippet
```java
          .forEach(
              (k, v) -> {
                System.out.printf("%s: %s\n", k, getValueForKey(k, searchAttributes));
              });
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloMetric.java`
#### Snippet
```java
    // Execute a workflow waiting for it to complete.
    String greeting = workflow.getGreeting("World");
    System.out.println(greeting);
  }

```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `CONTINUE_AS_NEW_FREQUENCEY` may be 'static'
in `src/main/java/com/uber/cadence/samples/hello/HelloPeriodic.java`
#### Snippet
```java
     * an hour 24 would make sense.
     */
    private final int CONTINUE_AS_NEW_FREQUENCEY = 10;

    private final GreetingActivities activities =
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SampleConstants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/common/SampleConstants.java`
#### Snippet
```java
package com.uber.cadence.samples.common;

public class SampleConstants {
  public static final String DOMAIN = "samples-domain";
}
```

### UtilityClassWithoutPrivateConstructor
Class `WorkflowStarter` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/calculation/WorkflowStarter.java`
#### Snippet
```java
import com.uber.cadence.serviceclient.WorkflowServiceTChannel;

public class WorkflowStarter {

  @SuppressWarnings("CatchAndPrintStackTrace")
```

### UtilityClassWithoutPrivateConstructor
Class `HelloAsyncLambda` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloAsyncLambda.java`
#### Snippet
```java
 * Cadence server to be running.
 */
public class HelloAsyncLambda {

  static final String TASK_LIST = "HelloAsyncLambda";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloWorkerSetup` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloWorkerSetup.java`
#### Snippet
```java
 * customize a worker
 */
public class HelloWorkerSetup {

  static final String TASK_LIST = "HelloActivity";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloDataConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
 * you want to use a different way to serialize/deserialize
 */
public class HelloDataConverter {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `HelloActivityRetry` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloActivityRetry.java`
#### Snippet
```java
 * of the Cadence service to be running.
 */
public class HelloActivityRetry {

  static final String TASK_LIST = "HelloActivityRetry";
```

### UtilityClassWithoutPrivateConstructor
Class `WorkflowWorker` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/calculation/WorkflowWorker.java`
#### Snippet
```java
import com.uber.cadence.worker.WorkerFactory;

public class WorkflowWorker {

  static final String DEFAULT_TASK_LIST = "calculation-default-tasklist";
```

### UtilityClassWithoutPrivateConstructor
Class `FileProcessingStarter` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/fileprocessing/FileProcessingStarter.java`
#### Snippet
```java

/** Starts a file processing sample workflow. */
public class FileProcessingStarter {

  public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `HelloAsync` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloAsync.java`
#### Snippet
```java
 * running.
 */
public class HelloAsync {

  static final String TASK_LIST = "HelloAsync";
```

### UtilityClassWithoutPrivateConstructor
Class `QueryWorkflowExecution` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/common/QueryWorkflowExecution.java`
#### Snippet
```java
 * @author fateev
 */
public class QueryWorkflowExecution {

  public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `HelloCancellation` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloCancellation.java`
#### Snippet
```java
 * instance of Cadence server to be running.
 */
public class HelloCancellation {

  static final String TASK_LIST = "HelloCancellation";
```

### UtilityClassWithoutPrivateConstructor
Class `WorkflowExecutionHistoryPrinter` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/common/WorkflowExecutionHistoryPrinter.java`
#### Snippet
```java
 * @author fateev
 */
public class WorkflowExecutionHistoryPrinter {

  public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `HelloChild` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloChild.java`
#### Snippet
```java

/** Demonstrates a child workflow. Requires a local instance of the Cadence server to be running. */
public class HelloChild {

  static final String TASK_LIST = "HelloChild";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloException` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloException.java`
#### Snippet
```java
 * besides being wrapped when rethrown.
 */
public class HelloException {

  static final String TASK_LIST = "HelloException";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloConsistentQuery` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloConsistentQuery.java`
#### Snippet
```java
 * >= 0.22.0 to be running.
 */
public class HelloConsistentQuery {

  static final String TASK_LIST = "HelloQuery";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloAsyncActivityCompletion` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloAsyncActivityCompletion.java`
#### Snippet
```java
 * to be running.
 */
public class HelloAsyncActivityCompletion {

  static final String TASK_LIST = "HelloAsyncActivityCompletion";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloQuery` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloQuery.java`
#### Snippet
```java

/** Demonstrates query capability. Requires a local instance of Cadence server to be running. */
public class HelloQuery {

  static final String TASK_LIST = "HelloQuery";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloCron` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloCron.java`
#### Snippet
```java
 * Cadence server to be running.
 */
public class HelloCron {

  static final String TASK_LIST = "HelloCron";
```

### UtilityClassWithoutPrivateConstructor
Class `FileProcessingWorker` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/fileprocessing/FileProcessingWorker.java`
#### Snippet
```java
 * list.
 */
public class FileProcessingWorker {

  static final String TASK_LIST = "FileProcessing";
```

### UtilityClassWithoutPrivateConstructor
Class `TripBookingSaga` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/bookingsaga/TripBookingSaga.java`
#### Snippet
```java
import com.uber.cadence.worker.WorkerFactory;

public class TripBookingSaga {

  static final String TASK_LIST = "TripBooking";
```

### UtilityClassWithoutPrivateConstructor
Class `ShadowTraffic` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/shadowing/ShadowTraffic.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;

public class ShadowTraffic {
  public static void main(String[] args) throws InterruptedException {
    // Get a new client
```

### UtilityClassWithoutPrivateConstructor
Class `RegisterDomain` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/common/RegisterDomain.java`
#### Snippet
```java
 * @author fateev
 */
public class RegisterDomain {

  public static void main(String[] args) throws TException, IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `HelloActivity` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloActivity.java`
#### Snippet
```java
 * Cadence service to be running.
 */
public class HelloActivity {

  static final String TASK_LIST = "HelloActivity";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloPeriodic` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloPeriodic.java`
#### Snippet
```java
 * <p>Requires a local instance of Cadence server to be running.
 */
public class HelloPeriodic {

  static final String TASK_LIST = "HelloPeriodic";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloSideEffect` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloSideEffect.java`
#### Snippet
```java
 * local instance the Cadence service to be running.
 */
public class HelloSideEffect {

  static final String TASK_LIST = "HelloSideEffect";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloSaga` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloSaga.java`
#### Snippet
```java

/** Demonstrates implementing saga transaction and compensation logic using Cadence. */
public class HelloSaga {
  static final String TASK_LIST = "HelloSaga";

```

### UtilityClassWithoutPrivateConstructor
Class `HelloLocalActivity` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloLocalActivity.java`
#### Snippet
```java
 * Cadence service to be running.
 */
public class HelloLocalActivity {

  static final String TASK_LIST = "HelloActivity";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloSearchAttributes` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloSearchAttributes.java`
#### Snippet
```java
import java.util.UUID;

public class HelloSearchAttributes {

  static final String TASK_LIST = "HelloSearchAttributes";
```

### UtilityClassWithoutPrivateConstructor
Class `HelloMetric` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/samples/hello/HelloMetric.java`
#### Snippet
```java
 * the Cadence service to be running.
 */
public class HelloMetric {

  static final String TASK_LIST = "HelloActivity";
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/bookingsaga/TripBookingSaga.java`
#### Snippet
```java
    } catch (WorkflowException e) {
      // Expected
      e.printStackTrace();
    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/bookingsaga/TripBookingSaga.java`
#### Snippet
```java
      trip2.bookTrip("trip2");
    } catch (WorkflowException e) {
      e.printStackTrace();
    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/samples/hello/HelloPeriodic.java`
#### Snippet
```java
        System.out.println("Still running as " + e.getExecution());
      } catch (Throwable e) {
        e.printStackTrace();
        System.exit(1);
      }
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/uber/cadence/samples/hello/HelloSideEffect.java`
#### Snippet
```java
              String.class,
              () -> {
                return UUID.randomUUID().toString();
              });
    }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/uber/cadence/samples/hello/HelloSearchAttributes.java`
#### Snippet
```java
          .getIndexedFields()
          .forEach(
              (k, v) -> {
                System.out.printf("%s: %s\n", k, getValueForKey(k, searchAttributes));
              });
```

## RuleId[ruleID=CommentedOutCode]
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

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `st`
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
    public String getGreeting(MyStruct st) {
      // This is a blocking call that returns only after the activity has completed.
      st = activities.composeGreeting(st.num, st.str);
      return st.toString();
    }
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/samples/hello/HelloDataConverter.java`
#### Snippet
```java
    public byte[] toData(final Object... values) throws DataConverterException {
      if (values == null || values.length == 0) {
        return null;
      }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
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

## RuleId[ruleID=BusyWait]
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

## RuleId[ruleID=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `HelloException` ends with 'Exception'
in `src/main/java/com/uber/cadence/samples/hello/HelloException.java`
#### Snippet
```java
 * besides being wrapped when rethrown.
 */
public class HelloException {

  static final String TASK_LIST = "HelloException";
```

## RuleId[ruleID=UnstableApiUsage]
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

## RuleId[ruleID=ThrowablePrintedToSystemOut]
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
in `src/main/java/com/uber/cadence/samples/shadowing/ShadowTraffic.java`
#### Snippet
```java
          } catch (Exception e) {
            System.out.println("Failed to start shadowing workflow");
            System.out.println(e);
            latch.countDown();
          }
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

