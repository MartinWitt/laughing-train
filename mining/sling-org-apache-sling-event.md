# sling-org-apache-sling-event 
 
# Bad smells
I found 271 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 166 | false |
| UnnecessaryCallToStringValueOf | 23 | false |
| DuplicatedCode | 13 | false |
| StringBufferReplaceableByString | 9 | false |
| CatchMayIgnoreException | 6 | false |
| JavadocDeclaration | 5 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 5 | false |
| DuplicateExpressions | 4 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| UnnecessaryToStringCall | 3 | true |
| UnusedAssignment | 3 | false |
| UnnecessarySemicolon | 2 | false |
| FinalPrivateMethod | 2 | false |
| TrivialIf | 2 | false |
| AccessStaticViaInstance | 2 | false |
| UNUSED_IMPORT | 2 | false |
| FieldMayBeFinal | 2 | false |
| ConstantValue | 2 | false |
| NonAtomicOperationOnVolatileField | 2 | false |
| ManualArrayToCollectionCopy | 1 | false |
| DataFlowIssue | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| DanglingJavadoc | 1 | false |
| ReplaceAllDot | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| RegExpEmptyAlternationBranch | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| RedundantCast | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new InternalQueueConfiguration\[configurations.size()\]'
in `src/main/java/org/apache/sling/event/impl/jobs/config/QueueConfigurationManager.java`
#### Snippet
```java
        } else {
            Collections.sort(configurations);
            orderedConfigs = configurations.toArray(new InternalQueueConfiguration[configurations.size()]);
        }
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[instances.size()\]'
in `src/main/java/org/apache/sling/event/impl/jobs/console/InventoryPlugin.java`
#### Snippet
```java
                pw.println("    {");
                pw.printf("       \"topic\" : \"%s\",%n", entry.getKey());
                pw.printf("       \"instances\" : %s%n", formatArrayAsJson(instances.toArray(new String[instances.size()])));
                if ( iter.hasNext() ) {
                    pw.println("    },");
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[lnames.size()\]'
in `src/main/java/org/apache/sling/event/impl/jobs/jmx/QueuesMBeanImpl.java`
#### Snippet
```java
            List<String> lnames = new ArrayList<>(queues.keySet());
            Collections.sort(lnames);
            names = lnames.toArray(new String[lnames.size()]);
        }
        return names;
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `JobExecutor`
in `src/main/java/org/apache/sling/event/impl/jobs/InternalJobState.java`
#### Snippet
```java

/**
 * The state of the job after it has been processed by a {@link JobExecutor}.
 */
public enum InternalJobState {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getStartTime()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getStartTime()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getStartTime()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfQueuedJobs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getNumberOfQueuedJobs()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfQueuedJobs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfJobs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getNumberOfJobs()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfJobs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfActiveJobs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getNumberOfActiveJobs()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfActiveJobs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#reset()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `reset()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#reset()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.ScheduledJobInfo`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#unschedule()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `unschedule()`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#unschedule()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.ScheduledJobInfo`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#suspend()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `suspend()`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#suspend()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.ScheduledJobInfo`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#getJobTopic()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getJobTopic()`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#getJobTopic()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.ScheduledJobInfo`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#getNextScheduledExecution()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getNextScheduledExecution()`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#getNextScheduledExecution()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.ScheduledJobInfo`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#reschedule()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `reschedule()`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#reschedule()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.ScheduledJobInfo`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#resume()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `resume()`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#resume()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.ScheduledJobInfo`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#getJobProperties()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getJobProperties()`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#getJobProperties()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.ScheduledJobInfo`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#isSuspended()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `isSuspended()`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#isSuspended()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.ScheduledJobInfo`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#getSchedules()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getSchedules()`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobInfoImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.ScheduledJobInfo#getSchedules()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.TopicStatistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/TopicStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.TopicStatistics#getTopic()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getTopic()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/TopicStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.TopicStatistics#getTopic()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.QueueConfiguration`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getTopics()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getTopics()`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getTopics()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.QueueConfiguration`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getMaxRetries()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getMaxRetries()`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getMaxRetries()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.QueueConfiguration`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getType()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getType()`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getType()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.QueueConfiguration`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getMaxParallel()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getMaxParallel()`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getMaxParallel()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.QueueConfiguration`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getRetryDelayInMs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getRetryDelayInMs()`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getRetryDelayInMs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.QueueConfiguration`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getRanking()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getRanking()`
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.QueueConfiguration#getRanking()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getFinishedDate()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getFinishedDate()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getFinishedDate()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProgressLog()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getProgressLog()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProgressLog()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProperty(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getProperty(java.lang.String)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProperty(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getTopic()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getTopic()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getTopic()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getResultMessage()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getResultMessage()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getResultMessage()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getId()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getId()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getId()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProgressETA()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getProgressETA()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProgressETA()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProperty(java.lang.String, java.lang.Class)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getProperty(java.lang.String, java.lang.Class)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProperty(java.lang.String, java.lang.Class)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getFinishedProgressStep()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getFinishedProgressStep()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getFinishedProgressStep()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProgressStepCount()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getProgressStepCount()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProgressStepCount()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getPropertyNames()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getPropertyNames()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getPropertyNames()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProperty(java.lang.String, java.lang.Object)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getProperty(java.lang.String, java.lang.Object)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Job#getProperty(java.lang.String, java.lang.Object)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.commons.threads.ThreadPool`
in `src/main/java/org/apache/sling/event/impl/EventingThreadPool.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.commons.threads.ThreadPool#execute(java.lang.Runnable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `execute(java.lang.Runnable)`
in `src/main/java/org/apache/sling/event/impl/EventingThreadPool.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.commons.threads.ThreadPool#execute(java.lang.Runnable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.commons.threads.ThreadPool`
in `src/main/java/org/apache/sling/event/impl/EventingThreadPool.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.commons.threads.ThreadPool#getConfiguration()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getConfiguration()`
in `src/main/java/org/apache/sling/event/impl/EventingThreadPool.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.commons.threads.ThreadPool#getConfiguration()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.commons.threads.ThreadPool`
in `src/main/java/org/apache/sling/event/impl/EventingThreadPool.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.commons.threads.ThreadPool#getName()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getName()`
in `src/main/java/org/apache/sling/event/impl/EventingThreadPool.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.commons.threads.ThreadPool#getName()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#reset()
     */
    public synchronized void reset() {
```

### JavadocReference
Cannot resolve symbol `reset()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#reset()
     */
    public synchronized void reset() {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getAverageProcessingTime()
     */
    public long getAverageProcessingTime() {
```

### JavadocReference
Cannot resolve symbol `getAverageProcessingTime()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getAverageProcessingTime()
     */
    public long getAverageProcessingTime() {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getAverageWaitingTime()
     */
    public long getAverageWaitingTime() {
```

### JavadocReference
Cannot resolve symbol `getAverageWaitingTime()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getAverageWaitingTime()
     */
    public long getAverageWaitingTime() {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfFinishedJobs()
     */
    public long getNumberOfFinishedJobs() {
```

### JavadocReference
Cannot resolve symbol `getNumberOfFinishedJobs()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfFinishedJobs()
     */
    public long getNumberOfFinishedJobs() {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getLastFinishedJobTime()
     */
    public long getLastFinishedJobTime() {
```

### JavadocReference
Cannot resolve symbol `getLastFinishedJobTime()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getLastFinishedJobTime()
     */
    public long getLastFinishedJobTime() {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfCancelledJobs()
     */
    public long getNumberOfCancelledJobs() {
```

### JavadocReference
Cannot resolve symbol `getNumberOfCancelledJobs()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfCancelledJobs()
     */
    public long getNumberOfCancelledJobs() {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfProcessedJobs()
     */
    public long getNumberOfProcessedJobs() {
```

### JavadocReference
Cannot resolve symbol `getNumberOfProcessedJobs()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfProcessedJobs()
     */
    public long getNumberOfProcessedJobs() {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getLastActivatedJobTime()
     */
    public long getLastActivatedJobTime() {
```

### JavadocReference
Cannot resolve symbol `getLastActivatedJobTime()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getLastActivatedJobTime()
     */
    public long getLastActivatedJobTime() {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Statistics`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfFailedJobs()
     */
    public long getNumberOfFailedJobs() {
```

### JavadocReference
Cannot resolve symbol `getNumberOfFailedJobs()`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Statistics#getNumberOfFailedJobs()
     */
    public long getNumberOfFailedJobs() {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueManager.java`
#### Snippet
```java
     * @param name The queue name
     * @return The queue or {@code null}.
     * @see org.apache.sling.event.jobs.JobManager#getQueue(java.lang.String)
     */
    public Queue getQueue(final String name) {
```

### JavadocReference
Cannot resolve symbol `getQueue(java.lang.String)`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueManager.java`
#### Snippet
```java
     * @param name The queue name
     * @return The queue or {@code null}.
     * @see org.apache.sling.event.jobs.JobManager#getQueue(java.lang.String)
     */
    public Queue getQueue(final String name) {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueManager.java`
#### Snippet
```java
    /**
     * @return An iterator for the available queues.
     * @see org.apache.sling.event.jobs.JobManager#getQueues()
     */
    public Iterable<Queue> getQueues() {
```

### JavadocReference
Cannot resolve symbol `getQueues()`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueManager.java`
#### Snippet
```java
    /**
     * @return An iterator for the available queues.
     * @see org.apache.sling.event.jobs.JobManager#getQueues()
     */
    public Iterable<Queue> getQueues() {
```

### JavadocReference
Cannot resolve symbol `org.osgi.service.event.EventHandler`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueManager.java`
#### Snippet
```java

    /**
     * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `handleEvent(org.osgi.service.event.Event)`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueManager.java`
#### Snippet
```java

    /**
     * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.osgi.service.event.Event`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueManager.java`
#### Snippet
```java

    /**
     * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.felix.inventory.InventoryPrinter`
in `src/main/java/org/apache/sling/event/impl/jobs/console/InventoryPlugin.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.inventory.InventoryPrinter#print(java.io.PrintWriter, org.apache.felix.inventory.Format, boolean)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `print(java.io.PrintWriter, org.apache.felix.inventory.Format, boolean)`
in `src/main/java/org/apache/sling/event/impl/jobs/console/InventoryPlugin.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.inventory.InventoryPrinter#print(java.io.PrintWriter, org.apache.felix.inventory.Format, boolean)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.felix.inventory.Format`
in `src/main/java/org/apache/sling/event/impl/jobs/console/InventoryPlugin.java`
#### Snippet
```java

    /**
     * @see org.apache.felix.inventory.InventoryPrinter#print(java.io.PrintWriter, org.apache.felix.inventory.Format, boolean)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `PersistenceException`
in `src/main/java/org/apache/sling/event/impl/support/ResourceHelper.java`
#### Snippet
```java
     * @param props The properties
     * @return The created resource
     * @throws PersistenceException If something goes wrong
     */
    public static Resource createAndCommitResource(final ResourceResolver resolver,
```

### JavadocReference
Cannot resolve symbol `PersistenceException`
in `src/main/java/org/apache/sling/event/impl/support/ResourceHelper.java`
#### Snippet
```java
     * @param props    The properties of the new resource.
     * @return The resource for the path.
     * @throws PersistenceException If something goes wrong
     */
    public static Resource getOrCreateResource(final ResourceResolver resolver,
```

### JavadocReference
Cannot resolve symbol `rootResource`
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/UpgradeTask.java`
#### Snippet
```java
    /**
     * Upgrade bridged jobs
     * @param rootResource  The root resource (topic resource)
     */
    private void upgradeBridgedJobs(final Resource topicResource) {
```

### JavadocReference
Cannot resolve symbol `PersistenceException`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobHandler.java`
#### Snippet
```java
    /**
     * Write a scheduled job to the resource tree.
     * @throws PersistenceException
     */
    public ScheduledJobInfoImpl addOrUpdateJob(
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.commons.scheduler.Job`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.commons.scheduler.Job#execute(org.apache.sling.commons.scheduler.JobContext)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `execute(org.apache.sling.commons.scheduler.JobContext)`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.commons.scheduler.Job#execute(org.apache.sling.commons.scheduler.JobContext)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.commons.scheduler.JobContext`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.commons.scheduler.Job#execute(org.apache.sling.commons.scheduler.JobContext)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.api.resource.observation.ResourceChangeListener`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.api.resource.observation.ResourceChangeListener#onChange(java.util.List)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `onChange(java.util.List)`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.api.resource.observation.ResourceChangeListener#onChange(java.util.List)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.osgi.service.event.EventHandler`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java

    /**
     * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
     */
    public void handleEvent(final Event event) {
```

### JavadocReference
Cannot resolve symbol `handleEvent(org.osgi.service.event.Event)`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java

    /**
     * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
     */
    public void handleEvent(final Event event) {
```

### JavadocReference
Cannot resolve symbol `org.osgi.service.event.Event`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java

    /**
     * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
     */
    public void handleEvent(final Event event) {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.discovery.TopologyEventListener`
in `src/main/java/org/apache/sling/event/impl/jobs/config/JobManagerConfiguration.java`
#### Snippet
```java
     * This method is invoked asynchronously from the TopologyHandler.
     * Therefore this method can't be invoked concurrently
     * @see org.apache.sling.discovery.TopologyEventListener#handleTopologyEvent(org.apache.sling.discovery.TopologyEvent)
     */
    public void handleTopologyEvent(TopologyEvent event) {
```

### JavadocReference
Cannot resolve symbol `handleTopologyEvent(org.apache.sling.discovery.TopologyEvent)`
in `src/main/java/org/apache/sling/event/impl/jobs/config/JobManagerConfiguration.java`
#### Snippet
```java
     * This method is invoked asynchronously from the TopologyHandler.
     * Therefore this method can't be invoked concurrently
     * @see org.apache.sling.discovery.TopologyEventListener#handleTopologyEvent(org.apache.sling.discovery.TopologyEvent)
     */
    public void handleTopologyEvent(TopologyEvent event) {
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.discovery.TopologyEvent`
in `src/main/java/org/apache/sling/event/impl/jobs/config/JobManagerConfiguration.java`
#### Snippet
```java
     * This method is invoked asynchronously from the TopologyHandler.
     * Therefore this method can't be invoked concurrently
     * @see org.apache.sling.discovery.TopologyEventListener#handleTopologyEvent(org.apache.sling.discovery.TopologyEvent)
     */
    public void handleTopologyEvent(TopologyEvent event) {
```

### JavadocReference
Cannot resolve symbol `event`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
     * Write a job to the resource tree.
     * @param resolver The resolver resolver
     * @param event The event
     * @param info The queue information (queue name etc.)
     * @throws PersistenceException
```

### JavadocReference
Cannot resolve symbol `PersistenceException`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
     * @param event The event
     * @param info The queue information (queue name etc.)
     * @throws PersistenceException
     */
    private JobImpl writeJob(final ResourceResolver resolver,
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getQueue(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getQueue(java.lang.String)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getQueue(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#stopJobById(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `stopJobById(java.lang.String)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#stopJobById(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getQueues()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getQueues()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getQueues()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#createJob(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `createJob(java.lang.String)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#createJob(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#findJobs(org.apache.sling.event.jobs.JobManager.QueryType, java.lang.String, long, java.util.Map[])
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `findJobs(org.apache.sling.event.jobs.JobManager.QueryType, java.lang.String, long, java.util.Map[])`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#findJobs(org.apache.sling.event.jobs.JobManager.QueryType, java.lang.String, long, java.util.Map[])
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Queue`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#isSuspended()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager.QueryType`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#findJobs(org.apache.sling.event.jobs.JobManager.QueryType, java.lang.String, long, java.util.Map[])
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `isSuspended()`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#isSuspended()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getScheduledJobs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Queue`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#suspend()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getScheduledJobs()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getScheduledJobs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `suspend()`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#suspend()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Queue`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#resume()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#removeJobById(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `resume()`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#resume()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `removeJobById(java.lang.String)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#removeJobById(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Queue`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#getStateInfo()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getScheduledJobs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getStateInfo()`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#getStateInfo()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getScheduledJobs()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getScheduledJobs()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Queue`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#getState(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getJobById(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getState(java.lang.String)`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#getState(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getJobById(java.lang.String)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getJobById(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Queue`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#removeAll()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getJob(java.lang.String, java.util.Map)
     */
    @SuppressWarnings("unchecked")
```

### JavadocReference
Cannot resolve symbol `removeAll()`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#removeAll()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getJob(java.lang.String, java.util.Map)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getJob(java.lang.String, java.util.Map)
     */
    @SuppressWarnings("unchecked")
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.Queue`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#getStatistics()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
     * Return our internal statistics object.
     *
     * @see org.apache.sling.event.jobs.JobManager#getStatistics()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getStatistics()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
     * Return our internal statistics object.
     *
     * @see org.apache.sling.event.jobs.JobManager#getStatistics()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getStatistics()`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.Queue#getStatistics()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#addJob(java.lang.String, java.util.Map)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `addJob(java.lang.String, java.util.Map)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#addJob(java.lang.String, java.util.Map)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#retryJobById(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `retryJobById(java.lang.String)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#retryJobById(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.osgi.service.event.EventHandler`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `handleEvent(org.osgi.service.event.Event)`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.osgi.service.event.Event`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.osgi.service.event.EventHandler#handleEvent(org.osgi.service.event.Event)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `jobName`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
     * Persist the job in the resource tree
     * @param jobTopic The required job topic
     * @param jobName The optional job name
     * @param passedJobProperties The optional job properties
     * @return The persisted job or <code>null</code>.
```

### JavadocReference
Cannot resolve symbol `passedJobProperties`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
     * @param jobTopic The required job topic
     * @param jobName The optional job name
     * @param passedJobProperties The optional job properties
     * @return The persisted job or <code>null</code>.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.sling.event.jobs.JobManager`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getTopicStatistics()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getTopicStatistics()`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.event.jobs.JobManager#getTopicStatistics()
     */
    @Override
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/HistoryCleanUpTask.java`
#### Snippet
```java
        if ( states != null ) {
            stateList = new ArrayList<>();
            for(final String s : states) {
                stateList.add(s);
            }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java
                    config.put(PROPERTY_READ_JOB, info);
                    config.put(PROPERTY_SCHEDULE_INDEX, index);
                    this.scheduler.schedule(this, options.name(name)
                                                         .config(config)
                                                         .canRunConcurrently(false)
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/CleanUpTask.java`
#### Snippet
```java
        if ( topologyCapabilities != null ) {
            // Clean up
            final String cleanUpUnassignedPath;;
            if ( topologyCapabilities.isLeader() ) {
                cleanUpUnassignedPath = this.configuration.getUnassignedJobsPath();
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsManager.java`
#### Snippet
```java

        if ( state == InternalJobState.CANCELLED ) {
            ts.cancelledJob();;
            this.globalStatistics.cancelledJob();
            if ( queueStats != null ) {
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueManager.java`
#### Snippet
```java
            int index = 0;
            while ( this.queues.containsKey(newName) ) {
                newName = ResourceHelper.filterName(queue.getName()) + '$' + String.valueOf(index++);
            }
            this.queues.put(newName, queue);
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
        sb.append(this.scheduleType.name());
        sb.append("|");
        sb.append(String.valueOf(this.dayOfWeek));
        sb.append("|");
        sb.append(String.valueOf(this.hourOfDay));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
        sb.append(String.valueOf(this.dayOfWeek));
        sb.append("|");
        sb.append(String.valueOf(this.hourOfDay));
        sb.append("|");
        sb.append(String.valueOf(this.minuteOfHour));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
        sb.append(String.valueOf(this.hourOfDay));
        sb.append("|");
        sb.append(String.valueOf(this.minuteOfHour));
        sb.append("|");
        if ( at == null ) {
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            sb.append("null");
        } else {
            sb.append(String.valueOf(at.getTime()));
        }
        sb.append("|");
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
        }
        sb.append("|");
        sb.append(String.valueOf(this.monthOfYear));
        sb.append("|");
        if ( expression == null ) {
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            sb.append("null");
        } else {
            sb.append(String.valueOf(expression));
        }
        return sb.toString();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
        if ( this.scheduleType == ScheduleType.DAILY ) {
            final StringBuilder sb = new StringBuilder("0 ");
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
            sb.append(String.valueOf(this.hourOfDay));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
            sb.append(String.valueOf(this.hourOfDay));
            sb.append(" * * ?");
            return sb.toString();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
        } else if ( this.scheduleType == ScheduleType.WEEKLY ) {
            final StringBuilder sb = new StringBuilder("0 ");
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
            sb.append(String.valueOf(this.hourOfDay));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
            sb.append(String.valueOf(this.hourOfDay));
            sb.append(" ? * ");
            sb.append(String.valueOf(this.dayOfWeek));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            sb.append(String.valueOf(this.hourOfDay));
            sb.append(" ? * ");
            sb.append(String.valueOf(this.dayOfWeek));
            return sb.toString();
        } else if ( this.scheduleType == ScheduleType.HOURLY ) {
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
        } else if ( this.scheduleType == ScheduleType.HOURLY ) {
            final StringBuilder sb = new StringBuilder("0 ");
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(" * * * ?");
            return sb.toString();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
        } else if ( this.scheduleType == ScheduleType.MONTHLY ) {
            final StringBuilder sb = new StringBuilder("0 ");
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
            sb.append(String.valueOf(this.hourOfDay));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
            sb.append(String.valueOf(this.hourOfDay));
            sb.append(' ');
            sb.append(String.valueOf(this.dayOfWeek));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            sb.append(String.valueOf(this.hourOfDay));
            sb.append(' ');
            sb.append(String.valueOf(this.dayOfWeek));
            sb.append(" * ?");
            return sb.toString();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
        } else if ( this.scheduleType == ScheduleType.YEARLY ) {
            final StringBuilder sb = new StringBuilder("0 ");
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
            sb.append(String.valueOf(this.hourOfDay));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
            sb.append(String.valueOf(this.hourOfDay));
            sb.append(' ');
            sb.append(String.valueOf(this.dayOfWeek));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            sb.append(String.valueOf(this.hourOfDay));
            sb.append(' ');
            sb.append(String.valueOf(this.dayOfWeek));
            sb.append(' ');
            sb.append(String.valueOf(this.monthOfYear - 1));
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            sb.append(String.valueOf(this.dayOfWeek));
            sb.append(' ');
            sb.append(String.valueOf(this.monthOfYear - 1));
            sb.append(" ?");
            return sb.toString();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java
                int index = 0;
                for(final ScheduleInfo si : info.getSchedules()) {
                    final String name = info.getSchedulerJobId() + "-" + String.valueOf(index);
                    ScheduleOptions options = null;
                    switch ( si.getType() ) {
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java
                                  info.getSchedules()});
            for(int index = 0; index<info.getSchedules().size(); index++) {
                final String name = info.getSchedulerJobId() + "-" + String.valueOf(index);
                localScheduler.unschedule(name);
            }
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java
                ", asyncJobs=" + this.asyncCounter.get() +
                ", waitCount=" + this.waitCounter.get() +
                ", jobCount=" + String.valueOf(this.configuration.getMaxParallel() - this.available.availablePermits() +
                (this.configuration.getType() == Type.ORDERED ? ", isSleepingUntil=" + this.isSleepingUntil : ""));
    }
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/CleanUpTask.java`
#### Snippet
```java
    }

    private final long currentTimeMillis() {
        return clock.millis();
    }
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/CleanUpTask.java`
#### Snippet
```java
    }

    private final Calendar getCalendarInstance() {
        Calendar calendar = Calendar.getInstance();
        // explicitly set the time based on the clock to allow test fiddlings
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
                        final char firstChar = key.length() > 0 ? key.charAt(0) : 0;
                        final String propName;
                        final Operation op;
                        if ( firstChar == '=' ) {
                            propName = key.substring(1);
                            op  = Operation.EQUALS;
                        } else if ( firstChar == '<' ) {
                            final char secondChar = key.length() > 1 ? key.charAt(1) : 0;
                            if ( secondChar == '=' ) {
                                op = Operation.LESS_OR_EQUALS;
                                propName = key.substring(2);
                            } else {
                                op = Operation.LESS;
                                propName = key.substring(1);
                            }
                        } else if ( firstChar == '>' ) {
                            final char secondChar = key.length() > 1 ? key.charAt(1) : 0;
                            if ( secondChar == '=' ) {
                                op = Operation.GREATER_OR_EQUALS;
                                propName = key.substring(2);
                            } else {
                                op = Operation.GREATER;
                                propName = key.substring(1);
                            }
                        } else {
                            propName = key;
                            op  = Operation.EQUALS;
                        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
        if ( jobProperties != null ) {
            for(final Map.Entry<String, Object> entry : jobProperties.entrySet() ) {
                final String propName = entry.getKey();
                if ( !ResourceHelper.ignoreProperty(propName) ) {
                    properties.put(propName, entry.getValue());
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/config/JobManagerConfiguration.java`
#### Snippet
```java
        sb.append(now.get(Calendar.YEAR));
        sb.append('/');
        sb.append(now.get(Calendar.MONTH) + 1);
        sb.append('/');
        sb.append(now.get(Calendar.DAY_OF_MONTH));
        sb.append('/');
        sb.append(now.get(Calendar.HOUR_OF_DAY));
        sb.append('/');
        sb.append(now.get(Calendar.MINUTE));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/console/InventoryPlugin.java`
#### Snippet
```java
        if ( time == 0 ) {
            return "-";
        }
        if ( time < 1000 ) {
            return time + " ms";
        } else if ( time < 1000 * 60 ) {
            return time / 1000 + " secs";
        }
        final long min = time / 1000 / 60;
        final long secs = (time - min * 1000 * 60);
        return min + " min " + secs / 1000 + " secs";
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/console/InventoryPlugin.java`
#### Snippet
```java
        pw.printf("Last Activated : %s%n", formatDate(s.getLastActivatedJobTime()));
        pw.printf("Last Finished : %s%n", formatDate(s.getLastFinishedJobTime()));
        pw.printf("Queued Jobs : %s%n", s.getNumberOfQueuedJobs());
        pw.printf("Active Jobs : %s%n", s.getNumberOfActiveJobs());
        pw.printf("Jobs : %s%n", s.getNumberOfJobs());
        pw.printf("Finished Jobs : %s%n", s.getNumberOfFinishedJobs());
        pw.printf("Failed Jobs : %s%n", s.getNumberOfFailedJobs());
        pw.printf("Cancelled Jobs : %s%n", s.getNumberOfCancelledJobs());
        pw.printf("Processed Jobs : %s%n", s.getNumberOfProcessedJobs());
        pw.printf("Average Processing Time : %s%n", formatTime(s.getAverageProcessingTime()));
        pw.printf("Average Waiting Time : %s%n", formatTime(s.getAverageWaitingTime()));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/console/InventoryPlugin.java`
#### Snippet
```java
            pw.printf("Finished Jobs : %s%n", ts.getNumberOfFinishedJobs());
            pw.printf("Failed Jobs : %s%n", ts.getNumberOfFailedJobs());
            pw.printf("Cancelled Jobs : %s%n", ts.getNumberOfCancelledJobs());
            pw.printf("Processed Jobs : %s%n", ts.getNumberOfProcessedJobs());
            pw.printf("Average Processing Time : %s%n", formatTime(ts.getAverageProcessingTime()));
            pw.printf("Average Waiting Time : %s%n", formatTime(ts.getAverageWaitingTime()));
            pw.println();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/console/InventoryPlugin.java`
#### Snippet
```java
            pw.printf("Type : %s%n", formatType(c.getType()));
            pw.printf("Topics : %s%n", formatArrayAsText(c.getTopics()));
            pw.printf("Max Parallel : %s%n", c.getMaxParallel());
            pw.printf("Max Retries : %s%n", c.getMaxRetries());
            pw.printf("Retry Delay : %s ms%n", c.getRetryDelayInMs());
            pw.printf("Priority : %s%n", c.getThreadPriority());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/console/WebConsolePlugin.java`
#### Snippet
```java
        pw.printf("<tr><td>Finished Jobs</td><td>%s</td></tr>", s.getNumberOfFinishedJobs());
        pw.printf("<tr><td>Failed Jobs</td><td>%s</td></tr>", s.getNumberOfFailedJobs());
        pw.printf("<tr><td>Cancelled Jobs</td><td>%s</td></tr>", s.getNumberOfCancelledJobs());
        pw.printf("<tr><td>Processed Jobs</td><td>%s</td></tr>", s.getNumberOfProcessedJobs());
        pw.printf("<tr><td>Average Processing Time</td><td>%s</td></tr>", formatTime(s.getAverageProcessingTime()));
        pw.printf("<tr><td>Average Waiting Time</td><td>%s</td></tr>", formatTime(s.getAverageWaitingTime()));
        pw.println("</tbody></table>");
        pw.println("<br/>");
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobExecutionContextImpl.java`
#### Snippet
```java
                if ( result.succeeded() ) {
                    state = Job.JobState.SUCCEEDED;
                } else if ( result.failed() ) {
                    state = Job.JobState.QUEUED;
                } else if ( result.cancelled() ) {
                    if ( handler.isStopped() ) {
                        state = Job.JobState.STOPPED;
                    } else {
                        state = Job.JobState.ERROR;
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/CheckTopologyTask.java`
#### Snippet
```java
                                            final String newPath;
                                            if ( targetId != null ) {
                                                newPath = configuration.getAssginedJobsPath() + '/' + targetId + '/' + topicResource.getName() + rsrc.getPath().substring(topicResource.getPath().length());
                                                props.put(Job.PROPERTY_JOB_QUEUE_NAME, info.queueName);
                                                props.put(Job.PROPERTY_JOB_TARGET_INSTANCE, targetId);
                                            } else {
                                                newPath = configuration.getUnassignedJobsPath() + '/' + topicResource.getName() + rsrc.getPath().substring(topicResource.getPath().length());
                                                props.remove(Job.PROPERTY_JOB_QUEUE_NAME);
                                                props.remove(Job.PROPERTY_JOB_TARGET_INSTANCE);
                                            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/CleanUpTask.java`
#### Snippet
```java
                        final Resource yearResource = yearIter.next();
                        final int year = Integer.valueOf(yearResource.getName());
                        // we should not have a year higher than "now", but we test anyway
                        if ( year > removeYear ) {
                            continue;
                        }
                        final boolean oldYear = year < removeYear;

                        // months
                        final Iterator<Resource> monthIter = yearResource.listChildren();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/CleanUpTask.java`
#### Snippet
```java
                            final Resource monthResource = monthIter.next();
                            final int month = Integer.valueOf(monthResource.getName());
                            if ( !oldYear && month > removeMonth ) {
                                continue;
                            }
                            final boolean oldMonth = oldYear || month < removeMonth;

                            // days
                            final Iterator<Resource> dayIter = monthResource.listChildren();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            final StringBuilder sb = new StringBuilder("0 ");
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
            sb.append(String.valueOf(this.hourOfDay));
            sb.append(' ');
            sb.append(String.valueOf(this.dayOfWeek));
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/FindUnfinishedJobsTask.java`
#### Snippet
```java
                            jobResource.getResourceResolver().commit();
                        }
                    } catch ( final PersistenceException ignore) {
                        logger.error("Unable to update unfinished job " + job, ignore);
                    }
```

### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/FindUnfinishedJobsTask.java`
#### Snippet
```java
                            jobResource.getResourceResolver().commit();
                        }
                    } catch ( final PersistenceException ignore) {
                        logger.error("Unable to update queued date for job " + job.getId(), ignore);
                    }
```

### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `src/main/java/org/apache/sling/event/impl/jobs/JobHandler.java`
#### Snippet
```java
                jobResource.getResourceResolver().commit();
                return true;
            } catch (PersistenceException ignore) {
                this.configuration.getMainLogger().debug("Unable to persist properties", ignore);
            }
```

### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `src/main/java/org/apache/sling/event/impl/jobs/Utility.java`
#### Snippet
```java
                        resource.getResourceResolver().delete(resource);
                        resource.getResourceResolver().commit();
                    } catch ( final PersistenceException ignore) {
                        logger.debug("Unable to remove job resource.", ignore);
                    }
```

### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java
                                        try {
                                            brr.delete(jobResource);
                                        } catch ( final PersistenceException ignore) {
                                            logger.error("Unable to remove job " + job, ignore);
                                            topicResource.getResourceResolver().revert();
```

### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java
                    try {
                        resolver.commit();
                    } catch ( final PersistenceException ignore) {
                        logger.error("Unable to remove jobs", ignore);
                    }
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `key.length() > 1 ? key.charAt(1) : 0`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java
                    op  = Operation.EQUALS;
                } else if ( firstChar == '<' ) {
                    final char secondChar = key.length() > 1 ? key.charAt(1) : 0;
                    if ( secondChar == '=' ) {
                        op = Operation.LESS_OR_EQUALS;
```

### DuplicateExpressions
Multiple occurrences of `key.length() > 1 ? key.charAt(1) : 0`
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java
                    }
                } else if ( firstChar == '>' ) {
                    final char secondChar = key.length() > 1 ? key.charAt(1) : 0;
                    if ( secondChar == '=' ) {
                        op = Operation.GREATER_OR_EQUALS;
```

### DuplicateExpressions
Multiple occurrences of `key.length() > 1 ? key.charAt(1) : 0`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
                            op  = Operation.EQUALS;
                        } else if ( firstChar == '<' ) {
                            final char secondChar = key.length() > 1 ? key.charAt(1) : 0;
                            if ( secondChar == '=' ) {
                                op = Operation.LESS_OR_EQUALS;
```

### DuplicateExpressions
Multiple occurrences of `key.length() > 1 ? key.charAt(1) : 0`
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
                            }
                        } else if ( firstChar == '>' ) {
                            final char secondChar = key.length() > 1 ? key.charAt(1) : 0;
                            if ( secondChar == '=' ) {
                                op = Operation.GREATER_OR_EQUALS;
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
    public String getCronExpression() {
        if ( this.scheduleType == ScheduleType.DAILY ) {
            final StringBuilder sb = new StringBuilder("0 ");
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            return sb.toString();
        } else if ( this.scheduleType == ScheduleType.WEEKLY ) {
            final StringBuilder sb = new StringBuilder("0 ");
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            return sb.toString();
        } else if ( this.scheduleType == ScheduleType.HOURLY ) {
            final StringBuilder sb = new StringBuilder("0 ");
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(" * * * ?");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            return sb.toString();
        } else if ( this.scheduleType == ScheduleType.MONTHLY ) {
            final StringBuilder sb = new StringBuilder("0 ");
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java
            return sb.toString();
        } else if ( this.scheduleType == ScheduleType.YEARLY ) {
            final StringBuilder sb = new StringBuilder("0 ");
            sb.append(String.valueOf(this.minuteOfHour));
            sb.append(' ');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobHandler.java`
#### Snippet
```java
            final String scheduleKey = ResourceHelper.filterName(scheduleName);

            final StringBuilder sb = new StringBuilder(configuration.getScheduledJobsPath(true));
            sb.append(scheduleKey);
            final String path = sb.toString();
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobHandler.java`
#### Snippet
```java
        final ResourceResolver resolver = configuration.createResourceResolver();
        try {
            final StringBuilder sb = new StringBuilder(configuration.getScheduledJobsPath(true));
            sb.append(scheduleKey);
            final String path = sb.toString();
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java
        final ResourceResolver resolver = configuration.createResourceResolver();
        try {
            final StringBuilder sb = new StringBuilder(this.configuration.getScheduledJobsPath(true));
            sb.append(ResourceHelper.filterName(info.getName()));
            final String path = sb.toString();
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/sling/event/impl/jobs/config/JobManagerConfiguration.java`
#### Snippet
```java
    public String getUniqueId(final String jobTopic) {
        final Calendar now = Calendar.getInstance();
        final StringBuilder sb = new StringBuilder();
        sb.append(now.get(Calendar.YEAR));
        sb.append('/');
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueJobCache.java`
#### Snippet
```java
                        final Set<String> checkingTopics = new HashSet<String>();
                        synchronized ( this.topicsWithNewJobs ) {
                            checkingTopics.addAll(this.topicsWithNewJobs);
                            this.topicsWithNewJobs.clear();
                        }
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueJobCache.java`
#### Snippet
```java
    private void fillCache(final String queueName, final StatisticsManager statisticsManager) {
        final Set<String> checkingTopics = new HashSet<String>();
        checkingTopics.addAll(this.topics);
        if ( !checkingTopics.isEmpty() ) {
            this.loadJobs(queueName, checkingTopics, statisticsManager);
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `src/main/java/org/apache/sling/event/impl/jobs/Utility.java`
#### Snippet
```java
    public static Event toEvent(final Job job) {
        final Map<String, Object> eventProps = new HashMap<>();
        eventProps.putAll(((JobImpl)job).getProperties());
        eventProps.put(ResourceHelper.PROPERTY_JOB_ID, job.getId());
        eventProps.remove(JobConsumer.PROPERTY_JOB_ASYNC_HANDLER);
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/org/apache/sling/event/impl/jobs/config/JobManagerConfiguration.java`
#### Snippet
```java
        final List<Job> result = new ArrayList<>();
        synchronized ( this.retryList ) {
            result.addAll(retryList.values());
            retryList.clear();
        }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/event/impl/jobs/console/InventoryPlugin.java`
#### Snippet
```java
                    }
                }
                pw.printf("%s : %s%n", entry.getKey(), sb.toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
            }
        } catch (final QuerySyntaxException qse) {
            logger.warn("Query syntax wrong " + buf.toString(), qse);
        } finally {
            resolver.close();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
             }
        } catch (final QuerySyntaxException qse) {
            logger.warn("Query syntax wrong " + buf.toString(), qse);
        } finally {
            resolver.close();
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `QueueMBeanHolder` may be 'static'
in `src/main/java/org/apache/sling/event/impl/jobs/jmx/QueuesMBeanImpl.java`
#### Snippet
```java
    private BundleContext bundleContext;

    class QueueMBeanHolder {

        QueueMBeanHolder(String name, QueueMBeanImpl queueMBean,
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/CleanUpTask.java`
#### Snippet
```java
                    since,
                    resolver,
                    /**
                     * We use a dummy context here as we are running it as a
                     * scheduled task and not as a job.
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/sling/event/impl/jobs/config/InternalQueueConfiguration.java`
#### Snippet
```java
            return false;
        }
        if ( maxParallelProcesses < 1 ) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java
            for(final ScheduledJobInfoImpl job : this.scheduledJobs.values() ) {
                boolean add = true;
                if ( topic != null && !topic.equals(job.getJobTopic()) ) {
                    add = false;
                }
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.sling.event.impl.jobs.tasks.HistoryCleanUpTask.cleanup(java.util.Calendar, ResourceResolver, JobExecutionContext, java.lang.String, java.lang.String\[\], java.util.List)' accessed via instance reference
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/HistoryCleanUpTask.java`
#### Snippet
```java
        try {
            if ( stateList == null || stateList.contains(Job.JobState.SUCCEEDED.name()) ) {
                this.cleanup(removeDate, resolver, context, configuration.getStoredSuccessfulJobsPath(), topics, null);
            }
            if ( stateList == null || stateList.contains(Job.JobState.DROPPED.name())
```

### AccessStaticViaInstance
Static member 'org.apache.sling.event.impl.jobs.tasks.HistoryCleanUpTask.cleanup(java.util.Calendar, ResourceResolver, JobExecutionContext, java.lang.String, java.lang.String\[\], java.util.List)' accessed via instance reference
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/HistoryCleanUpTask.java`
#### Snippet
```java
                 || stateList.contains(Job.JobState.GIVEN_UP.name())
                 || stateList.contains(Job.JobState.STOPPED.name())) {
                this.cleanup(removeDate, resolver, context, configuration.getStoredCancelledJobsPath(), topics, stateList);
            }

```

## RuleId[id=ReplaceAllDot]
### ReplaceAllDot
Suspicious regex expression "\|" in call to 'split()'
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java

    public static ScheduleInfoImpl deserialize(final ScheduleType scheduleType, final String s) {
        final String[] parts = s.split("|");
        if ( scheduleType == ScheduleType.YEARLY && parts.length == 4 ) {
            try {
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/UpgradeTask.java`
#### Snippet
```java
                        ois.close();
                    } catch (final IOException ioe) {
                        throw new PersistenceException("Unable to deserialize job properties.", ioe);
                    }
                }
```

## RuleId[id=RegExpEmptyAlternationBranch]
### RegExpEmptyAlternationBranch
Empty branch in alternation
in `src/main/java/org/apache/sling/event/impl/support/ScheduleInfoImpl.java`
#### Snippet
```java

    public static ScheduleInfoImpl deserialize(final ScheduleType scheduleType, final String s) {
        final String[] parts = s.split("|");
        if ( scheduleType == ScheduleType.YEARLY && parts.length == 4 ) {
            try {
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'sr == null' covered by subsequent condition '!(sr instanceof Integer)'
in `src/main/java/org/apache/sling/event/impl/jobs/JobConsumerManager.java`
#### Snippet
```java
            this.isConsumer = isConsumer;
            final Object sr = serviceReference.getProperty(Constants.SERVICE_RANKING);
            if ( sr == null || !(sr instanceof Integer)) {
                this.ranking = 0;
            } else {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.osgi.service.component.annotations.*;`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsManager.java`
#### Snippet
```java
import org.apache.sling.event.jobs.TopicStatistics;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.*;


```

### UNUSED_IMPORT
Unused import `import java.util.Date;`
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/CleanUpTask.java`
#### Snippet
```java
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `src/main/java/org/apache/sling/event/impl/jobs/JobConsumerManager.java`
#### Snippet
```java
            }
            // If ranks are equal, then sort by service id in descending order.
            return (this.serviceId < o.serviceId) ? -1 : 1;
        }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/ScheduledJobHandler.java`
#### Snippet
```java
    /**
     * Write a scheduled job to the resource tree.
     * @throws PersistenceException
     */
    public ScheduledJobInfoImpl addOrUpdateJob(
```

### JavadocDeclaration
`@param e` tag description is missing
in `src/main/java/org/apache/sling/event/impl/jobs/scheduling/JobSchedulerImpl.java`
#### Snippet
```java
    /**
     * Helper method which just logs the exception in debug mode.
     * @param e
     */
    private void ignoreException(final Exception e) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/sling/event/impl/jobs/JobManagerImpl.java`
#### Snippet
```java
     * @param event The event
     * @param info The queue information (queue name etc.)
     * @throws PersistenceException
     */
    private JobImpl writeJob(final ResourceResolver resolver,
```

### JavadocDeclaration
`@param outdatedQueueInfo` tag description is missing
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java
     * @param services The queue services
     * @param topics The topics handled by this queue
     * @param outdatedQueueInfo
     * @param haltedTopicsBackRef reference to pass newly halted topics back
     *
```

### JavadocDeclaration
`@param outdatedQueue` tag description is missing
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java
     * @param services The queue services
     * @param cache The job cache
     * @param outdatedQueue
     */
    private JobQueueImpl(final String name,
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `"org.apache.sling.event.impl.jobs.DefaultJobManager"` to `Object` is redundant
in `src/main/java/org/apache/sling/event/impl/jobs/config/MainQueueConfiguration.java`
#### Snippet
```java
        logger.debug("properties for queue {}: {}", MAIN_QUEUE_NAME, config);
        this.mainConfiguration = InternalQueueConfiguration.fromConfiguration(
                Collections.singletonMap(Constants.SERVICE_PID, (Object)"org.apache.sling.event.impl.jobs.DefaultJobManager"),
                new InternalQueueConfiguration.Config() {

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `queues` may be 'final'
in `src/main/java/org/apache/sling/event/impl/jobs/jmx/QueuesMBeanImpl.java`
#### Snippet
```java
    private static final String QUEUE_NOTIFICATION = "org.apache.sling.event.queue";
    private static final String[] NOTIFICATION_TYPES = { QUEUE_NOTIFICATION };
    private Map<String, QueueMBeanHolder> queues = new ConcurrentHashMap<>();
    private String[] names;
    private AtomicLong sequence = new AtomicLong(System.currentTimeMillis());
```

### FieldMayBeFinal
Field `sequence` may be 'final'
in `src/main/java/org/apache/sling/event/impl/jobs/jmx/QueuesMBeanImpl.java`
#### Snippet
```java
    private Map<String, QueueMBeanHolder> queues = new ConcurrentHashMap<>();
    private String[] names;
    private AtomicLong sequence = new AtomicLong(System.currentTimeMillis());
    private BundleContext bundleContext;

```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `other`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java
     */
    public synchronized void add(final StatisticsImpl other) {
        synchronized ( other ) {
            super.add(other);
            this.queuedJobs.addAndGet(other.queuedJobs.get());
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `other`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/StatisticsImpl.java`
#### Snippet
```java
        final long localQueuedJobs;
        final long localActiveJobs;
        synchronized ( other ) {
            localQueuedJobs = other.queuedJobs.get();
            localActiveJobs = other.activeJobs.get();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `other`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java
        final long localFailedJobs;
        final long localCancelledJobs;
        synchronized ( other ) {
            localLastActivated = other.lastActivated.get();
            localLastFinished = other.lastFinished.get();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `other`
in `src/main/java/org/apache/sling/event/impl/jobs/stats/BaseStatisticsImpl.java`
#### Snippet
```java
     */
    public synchronized void add(final BaseStatisticsImpl other) {
        synchronized ( other ) {
            if ( other.lastActivated.get() > this.lastActivated.get() ) {
                this.lastActivated.set(other.lastActivated.get());
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `ctx`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/JobQueueImpl.java`
#### Snippet
```java

                try {
                    synchronized ( ctx ) {
                        result = (JobExecutionResultImpl)handler.getConsumer().process(job, ctx);
                        if ( result == null ) { // ASYNC processing
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `done` initializer `true` is redundant
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueJobCache.java`
#### Snippet
```java
        } else {
            // topic round robin
            boolean done = true;
            do {
                done = true;
```

### UnusedAssignment
Variable `result` initializer `true` is redundant
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueJobCache.java`
#### Snippet
```java
     */
    public boolean isEmpty() {
        boolean result = true;
        synchronized ( this.cache ) {
            result = this.cache.isEmpty();
```

### UnusedAssignment
Variable `queue` initializer `null` is redundant
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueManager.java`
#### Snippet
```java
        // get or create queue
        boolean isNewQueue = false;
        JobQueueImpl queue = null;
        // we synchronize to avoid creating a queue which is about to be removed during cleanup
        synchronized ( queuesLock ) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `stats != null` is always `true`
in `src/main/java/org/apache/sling/event/impl/jobs/jmx/QueueMBeanImpl.java`
#### Snippet
```java
        this.name = queue.getName();
        Statistics stats = queue instanceof Statistics ? (Statistics) queue : queue.getStatistics();
        this.statistics = stats != null ? stats : new EmptyStatistics();
    }

```

### ConstantValue
Condition `jobId == null` is always `true`
in `src/main/java/org/apache/sling/event/impl/jobs/Utility.java`
#### Snippet
```java
                    if ( errorMessage != null ) {
                        logger.warn("{} : {}", errorMessage, resource.getPath());
                    } else if ( jobId == null ) {
                        logger.warn("Discarding job - no job id found : {}", resource.getPath());
                    }
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/HistoryCleanUpTask.java`
#### Snippet
```java
            stateList = new ArrayList<>();
            for(final String s : states) {
                stateList.add(s);
            }
        } else {
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `schedulerRuns`
in `src/main/java/org/apache/sling/event/impl/jobs/queues/QueueManager.java`
#### Snippet
```java
     */
    void maintain() {
        this.schedulerRuns++;
        logger.debug("Queue manager maintenance: Starting #{}", this.schedulerRuns);

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `schedulerRuns`
in `src/main/java/org/apache/sling/event/impl/jobs/tasks/CleanUpTask.java`
#### Snippet
```java
     */
    public void run() {
        this.schedulerRuns++;
        logger.debug("Job manager maintenance: Starting #{}", this.schedulerRuns);

```

