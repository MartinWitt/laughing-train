# jvm-diagnostics 
 
# Bad smells
I found 12 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 10 | false |
| ReturnNull | 1 | false |
| DataFlowIssue | 1 | false |
## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java
            return threadBean instanceof com.sun.management.ThreadMXBean
                    ? (com.sun.management.ThreadMXBean) threadBean
                    : null;
        }
    }
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `getThreadAllocatedBytes` may produce `NullPointerException`
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java
        @Override
        public long getAllocatedBytes(long threadId) {
            return hotspotThreadImpl.getThreadAllocatedBytes(threadId);
        }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang.management` is unnecessary, and can be replaced with an import
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java
    private static final class HotspotThreadCpuTimeAccessor implements ThreadCpuTimeAccessor {

        private final java.lang.management.ThreadMXBean threadManagementBean =
                java.lang.management.ManagementFactory.getThreadMXBean();

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.management` is unnecessary, and can be replaced with an import
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java

        private final java.lang.management.ThreadMXBean threadManagementBean =
                java.lang.management.ManagementFactory.getThreadMXBean();

        boolean isEnabled() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.management` is unnecessary, and can be replaced with an import
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java
    private static final class HotspotThreadUserTimeAccessor implements ThreadUserTimeAccessor {

        private final java.lang.management.ThreadMXBean threadManagementBean =
                java.lang.management.ManagementFactory.getThreadMXBean();

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.management` is unnecessary, and can be replaced with an import
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java

        private final java.lang.management.ThreadMXBean threadManagementBean =
                java.lang.management.ManagementFactory.getThreadMXBean();

        boolean isEnabled() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.management` is unnecessary, and can be replaced with an import
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java
    private static final class HotspotThreadAllocatedBytesAccessor implements ThreadAllocatedBytesAccessor {

        private final com.sun.management.ThreadMXBean hotspotThreadImpl = loadThreadManagementBean();

        boolean isEnabled() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.management` is unnecessary, and can be replaced with an import
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java
        }

        private static com.sun.management.ThreadMXBean loadThreadManagementBean() {
            java.lang.management.ThreadMXBean threadBean = java.lang.management.ManagementFactory.getThreadMXBean();
            return threadBean instanceof com.sun.management.ThreadMXBean
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.management` is unnecessary, and can be replaced with an import
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java

        private static com.sun.management.ThreadMXBean loadThreadManagementBean() {
            java.lang.management.ThreadMXBean threadBean = java.lang.management.ManagementFactory.getThreadMXBean();
            return threadBean instanceof com.sun.management.ThreadMXBean
                    ? (com.sun.management.ThreadMXBean) threadBean
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.management` is unnecessary, and can be replaced with an import
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java

        private static com.sun.management.ThreadMXBean loadThreadManagementBean() {
            java.lang.management.ThreadMXBean threadBean = java.lang.management.ManagementFactory.getThreadMXBean();
            return threadBean instanceof com.sun.management.ThreadMXBean
                    ? (com.sun.management.ThreadMXBean) threadBean
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.management` is unnecessary, and can be replaced with an import
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java
        private static com.sun.management.ThreadMXBean loadThreadManagementBean() {
            java.lang.management.ThreadMXBean threadBean = java.lang.management.ManagementFactory.getThreadMXBean();
            return threadBean instanceof com.sun.management.ThreadMXBean
                    ? (com.sun.management.ThreadMXBean) threadBean
                    : null;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.management` is unnecessary, and can be replaced with an import
in `jvm-diagnostics/src/main/java/com/palantir/jvm/diagnostics/JvmDiagnostics.java`
#### Snippet
```java
            java.lang.management.ThreadMXBean threadBean = java.lang.management.ManagementFactory.getThreadMXBean();
            return threadBean instanceof com.sun.management.ThreadMXBean
                    ? (com.sun.management.ThreadMXBean) threadBean
                    : null;
        }
```

