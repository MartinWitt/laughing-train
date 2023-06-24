# sling-org-apache-sling-event-api 
 
# Bad smells
I found 13 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 8 | false |
| UnnecessaryModifier | 4 | true |
| UnnecessarySemicolon | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/event/jobs/consumer/JobExecutionContext.java`
#### Snippet
```java
    ResultBuilder result();

    public interface ResultBuilder {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/sling/event/jobs/JobBuilder.java`
#### Snippet
```java
     * This is a builder interface for creating schedule information
     */
    public interface ScheduleBuilder {

        /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `src/main/java/org/apache/sling/event/jobs/QueueConfiguration.java`
#### Snippet
```java

    /** The queue type. */
    static enum Type {
        UNORDERED,          // unordered, parallel processing (push)
        ORDERED,            // ordered, FIFO (push)
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `src/main/java/org/apache/sling/event/jobs/QueueConfiguration.java`
#### Snippet
```java
     * @since 1.3
     */
    static enum ThreadPriority {
        NORM,
        MIN,
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.osgi.service.event.EventConstants`
in `src/main/java/org/apache/sling/event/jobs/NotificationConstants.java`
#### Snippet
```java
     * the property {@link #NOTIFICATION_PROPERTY_JOB_ID} contains the unique job id.
     * The time stamp of the event (as a Long) is available from the property
     * {@link org.osgi.service.event.EventConstants#TIMESTAMP}.
     * The payload of the job is available as additional job specific properties.
     */
```

### JavadocReference
Cannot resolve symbol `TIMESTAMP`
in `src/main/java/org/apache/sling/event/jobs/NotificationConstants.java`
#### Snippet
```java
     * the property {@link #NOTIFICATION_PROPERTY_JOB_ID} contains the unique job id.
     * The time stamp of the event (as a Long) is available from the property
     * {@link org.osgi.service.event.EventConstants#TIMESTAMP}.
     * The payload of the job is available as additional job specific properties.
     */
```

### JavadocReference
Cannot resolve symbol `org.osgi.service.event.EventConstants`
in `src/main/java/org/apache/sling/event/jobs/NotificationConstants.java`
#### Snippet
```java
     * the property {@link #NOTIFICATION_PROPERTY_JOB_ID} contains the unique job id.
     * The time stamp of the event (as a Long) is available from the property
     * {@link org.osgi.service.event.EventConstants#TIMESTAMP}.
     * The payload of the job is available as additional job specific properties.
     */
```

### JavadocReference
Cannot resolve symbol `TIMESTAMP`
in `src/main/java/org/apache/sling/event/jobs/NotificationConstants.java`
#### Snippet
```java
     * the property {@link #NOTIFICATION_PROPERTY_JOB_ID} contains the unique job id.
     * The time stamp of the event (as a Long) is available from the property
     * {@link org.osgi.service.event.EventConstants#TIMESTAMP}.
     * The payload of the job is available as additional job specific properties.
     */
```

### JavadocReference
Cannot resolve symbol `org.osgi.service.event.EventConstants`
in `src/main/java/org/apache/sling/event/jobs/NotificationConstants.java`
#### Snippet
```java
     * the property {@link #NOTIFICATION_PROPERTY_JOB_ID} contains the unique job id.
     * The time stamp of the event (as a Long) is available from the property
     * {@link org.osgi.service.event.EventConstants#TIMESTAMP}.
     * The payload of the job is available as additional job specific properties.
     */
```

### JavadocReference
Cannot resolve symbol `TIMESTAMP`
in `src/main/java/org/apache/sling/event/jobs/NotificationConstants.java`
#### Snippet
```java
     * the property {@link #NOTIFICATION_PROPERTY_JOB_ID} contains the unique job id.
     * The time stamp of the event (as a Long) is available from the property
     * {@link org.osgi.service.event.EventConstants#TIMESTAMP}.
     * The payload of the job is available as additional job specific properties.
     */
```

### JavadocReference
Cannot resolve symbol `org.osgi.service.event.EventConstants`
in `src/main/java/org/apache/sling/event/jobs/NotificationConstants.java`
#### Snippet
```java
     * the property {@link #NOTIFICATION_PROPERTY_JOB_ID} contains the unique job id.
     * The time stamp of the event (as a Long) is available from the property
     * {@link org.osgi.service.event.EventConstants#TIMESTAMP}.
     * The payload of the job is available as additional job specific properties.
     */
```

### JavadocReference
Cannot resolve symbol `TIMESTAMP`
in `src/main/java/org/apache/sling/event/jobs/NotificationConstants.java`
#### Snippet
```java
     * the property {@link #NOTIFICATION_PROPERTY_JOB_ID} contains the unique job id.
     * The time stamp of the event (as a Long) is available from the property
     * {@link org.osgi.service.event.EventConstants#TIMESTAMP}.
     * The payload of the job is available as additional job specific properties.
     */
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/sling/event/jobs/Job.java`
#### Snippet
```java
        ERROR,      // processing signaled CANCELLED or throw an exception
        DROPPED     // dropped jobs
    };

    /**
```

