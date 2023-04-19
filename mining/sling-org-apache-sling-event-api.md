# sling-org-apache-sling-event-api 
 
# Bad smells
I found 9 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 4 | true |
| UnnecessaryFullyQualifiedName | 3 | false |
| UnnecessarySemicolon | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
## RuleId[id=UnnecessaryModifier]
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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/sling/event/jobs/consumer/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.3.0")
package org.apache.sling.event.jobs.consumer;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/sling/event/jobs/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("2.0.1")
package org.apache.sling.event.jobs;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/sling/event/jobs/jmx/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0.1")
package org.apache.sling.event.jobs.jmx;

```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `NotificationConstants` has no concrete subclass
in `src/main/java/org/apache/sling/event/jobs/NotificationConstants.java`
#### Snippet
```java
 * @since 1.3
 */
public abstract class NotificationConstants {

    /**
```

