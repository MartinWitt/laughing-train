# jvm-diagnostics 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 1 | false |
## RuleId[id=DataFlowIssue]
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

