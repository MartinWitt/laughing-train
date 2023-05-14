# jifa 
 
# Bad smells
I found 263 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 110 | false |
| UNUSED_IMPORT | 26 | false |
| IgnoreResultOfCall | 19 | false |
| RegExpRedundantEscape | 18 | false |
| DataFlowIssue | 13 | false |
| ReactiveStreamsUnusedPublisher | 11 | false |
| UNCHECKED_WARNING | 10 | false |
| DuplicatedCode | 9 | false |
| UnnecessarySemicolon | 7 | false |
| NonFinalFieldInEnum | 6 | false |
| FieldCanBeLocal | 4 | false |
| ConstantValue | 3 | false |
| UnstableApiUsage | 3 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| DanglingJavadoc | 2 | false |
| TrivialIf | 2 | false |
| RedundantMethodOverride | 2 | false |
| RedundantCast | 2 | false |
| UnnecessaryModifier | 1 | true |
| EmptyStatementBody | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| RegExpSimplifiable | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| TrivialStringConcatenation | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| AutoCloseableResource | 1 | false |
| JavadocDeclaration | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `backend/common/src/main/java/org/eclipse/jifa/common/JifaHooks.java`
#### Snippet
```java

    /* An empty default configuration */
    public class EmptyHooks implements JifaHooks {
        // use default implementations
    }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jifa.common.vo.PageView' to 'org.eclipse.jifa.common.vo.PageView'
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            .limit(pagingRequest.getPageSize())
            .collect(Collectors.toList());
        return new PageView(pagingRequest, afterFilterCount.get(), items);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'PageView(PagingRequest, int, List)' as a member of raw type 'org.eclipse.jifa.common.vo.PageView'
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            .limit(pagingRequest.getPageSize())
            .collect(Collectors.toList());
        return new PageView(pagingRequest, afterFilterCount.get(), items);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jifa.common.vo.PageView' to 'org.eclipse.jifa.common.vo.PageView'
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            .limit(pagingRequest.getPageSize())
            .collect(Collectors.toList());
        return new PageView(pagingRequest, afterFilterCount.get(), items);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'PageView(PagingRequest, int, List)' as a member of raw type 'org.eclipse.jifa.common.vo.PageView'
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            .limit(pagingRequest.getPageSize())
            .collect(Collectors.toList());
        return new PageView(pagingRequest, afterFilterCount.get(), items);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jifa.common.vo.PageView' to 'org.eclipse.jifa.common.vo.PageView'
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                                  SearchType searchType, int page, int pageSize) {
        PagingRequest pagingRequest = new PagingRequest(page, pageSize);
        return $(() -> {
            IResultTree result = queryByCommand(context, "thread_overview");
            final AtomicInteger afterFilterCount = new AtomicInteger(0);
```

### UNCHECKED_WARNING
Unchecked call to 'PageView(PagingRequest, int, List)' as a member of raw type 'org.eclipse.jifa.common.vo.PageView'
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                .limit(pagingRequest.getPageSize())
                .collect(Collectors.toList());
            return new PageView(pagingRequest, afterFilterCount.get(), items);
        });
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jifa.common.vo.PageView' to 'org.eclipse.jifa.common.vo.PageView'
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            .limit(pagingRequest.getPageSize())
            .collect(Collectors.toList());
        return new PageView(pagingRequest, afterFilterCount.get(), items);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'PageView(PagingRequest, int, List)' as a member of raw type 'org.eclipse.jifa.common.vo.PageView'
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            .limit(pagingRequest.getPageSize())
            .collect(Collectors.toList());
        return new PageView(pagingRequest, afterFilterCount.get(), items);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jifa.common.vo.PageView' to 'org.eclipse.jifa.common.vo.PageView'
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            .limit(pagingRequest.getPageSize())
            .collect(Collectors.toList());
        return new PageView(pagingRequest, afterFilterCount.get(), items);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'PageView(PagingRequest, int, List)' as a member of raw type 'org.eclipse.jifa.common.vo.PageView'
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            .limit(pagingRequest.getPageSize())
            .collect(Collectors.toList());
        return new PageView(pagingRequest, afterFilterCount.get(), items);
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `setLogStyle` may produce `NullPointerException`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractGCLogParser.java`
#### Snippet
```java
    public final GCModel parse(BufferedReader br) throws Exception {
        model = GCModelFactory.getModel(metadata.getCollector());
        model.setLogStyle(metadata.getStyle());
        String line;
        while ((line = br.readLine()) != null) {
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractPreUnifiedGCLogParser.java`
#### Snippet
```java
                referenceGC.setSoftReferencePauseTime(event.getDuration());
                referenceGC.setSoftReferenceStartTime(event.getStartTime());
                referenceGC.setSoftReferenceCount(counts.get(0));
                break;
            case "WeakReference":
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractPreUnifiedGCLogParser.java`
#### Snippet
```java
                referenceGC.setWeakReferencePauseTime(event.getDuration());
                referenceGC.setWeakReferenceStartTime(event.getStartTime());
                referenceGC.setWeakReferenceCount(counts.get(0));
                break;
            case "FinalReference":
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractPreUnifiedGCLogParser.java`
#### Snippet
```java
                referenceGC.setFinalReferencePauseTime(event.getDuration());
                referenceGC.setFinalReferenceStartTime(event.getStartTime());
                referenceGC.setFinalReferenceCount(counts.get(0));
                break;
            case "PhantomReference":
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractPreUnifiedGCLogParser.java`
#### Snippet
```java
                referenceGC.setPhantomReferencePauseTime(event.getDuration());
                referenceGC.setPhantomReferenceStartTime(event.getStartTime());
                referenceGC.setPhantomReferenceCount(counts.get(0));
                if (counts.size() > 1) {
                    referenceGC.setPhantomReferenceFreedCount(counts.get(1));
```

### DataFlowIssue
Method invocation `getPhaseParentEventType` may produce `NullPointerException`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/UnifiedZGCLogParser.java`
#### Snippet
```java
        GCModel model = parser.getModel();
        GCEventType eventType = getGCEventType(phaseName);
        GCEvent event = model.getLastEventOfType(eventType.getPhaseParentEventType());
        if (event == null) {
            // log may be incomplete
```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/VirtualPackageItem.java`
#### Snippet
```java
    public int getObjectType() {
        Map<String, ?> subPackages = ReflectionUtil.getFieldValueOrNull(e, "subPackages");
        if (subPackages.size() == 0) {
            return DominatorTree.ItemType.CLASS;
        } else {
```

### DataFlowIssue
Method invocation `getIp` may produce `NullPointerException`
in `backend/master/src/main/java/org/eclipse/jifa/master/support/K8SWorkerScheduler.java`
#### Snippet
```java
            return Single.just(none);
        } else {
            String workerIp = getWorkerInfo(name).getIp();
            Worker handmake = new Worker();
            handmake.setHostIP(workerIp);
```

### DataFlowIssue
Method invocation `getIp` may produce `NullPointerException`
in `backend/master/src/main/java/org/eclipse/jifa/master/support/K8SWorkerScheduler.java`
#### Snippet
```java
        schedule(name, config);

        String workerIp = getWorkerInfo(name).getIp();

        if (workerIp == null) {
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `backend/master/src/main/java/org/eclipse/jifa/master/support/K8SWorkerScheduler.java`
#### Snippet
```java
            List<Worker> workers = pods.stream().map(pod -> {
                Worker w = new Worker();
                w.setHostName(pod.getMetadata().getName());
                w.setHostIP(pod.getStatus().getPodIP());
                return w;
```

### DataFlowIssue
Method invocation `getPodIP` may produce `NullPointerException`
in `backend/master/src/main/java/org/eclipse/jifa/master/support/K8SWorkerScheduler.java`
#### Snippet
```java
                Worker w = new Worker();
                w.setHostName(pod.getMetadata().getName());
                w.setHostIP(pod.getStatus().getPodIP());
                return w;
            }).collect(Collectors.toList());
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `backend/thread-dump-analyzer/src/main/java/org/eclipse/jifa/tda/parser/JStackParser.java`
#### Snippet
```java
            }
            int dlCount = 0;
            while (line.equals(PATTERNS.DEAD_LOCK_HEAD)) {
                dlCount++;
                if (snapshot.getDeadLockThreads() == null) {
```

### DataFlowIssue
Argument `line` might be null
in `backend/thread-dump-analyzer/src/main/java/org/eclipse/jifa/tda/parser/JStackParser.java`
#### Snippet
```java
                line = input.readLine();
                for (int i = 0; i < tCount; i++) {
                    matcher = PATTERNS.DEAD_LOCK_THREAD.matcher(line);
                    if (!matcher.matches()) {
                        throw new ParserException("Illegal dead lock thread name");
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/event/evnetInfo/GCEventBooleanType.java`
#### Snippet
```java
    YOUNG_GC_BECOME_FULL_GC,
    INITIAL_MARK,
    PREPARE_MIXED;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `backend/common/src/main/java/org/eclipse/jifa/common/listener/ProgressListener.java`
#### Snippet
```java
        INFO,
        WARNING,
        ERROR;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `backend/heap-dump-analyzer/api/src/main/java/org/eclipse/jifa/hda/api/Model.java`
#### Snippet
```java
            BY_CLASSLOADER,

            BY_PACKAGE;
        }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `backend/heap-dump-analyzer/api/src/main/java/org/eclipse/jifa/hda/api/Model.java`
#### Snippet
```java
            BY_CLASSLOADER,

            BY_PACKAGE;
        }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `backend/common/src/main/java/org/eclipse/jifa/common/vo/support/SearchType.java`
#### Snippet
```java
    BY_PERCENT,
    BY_CLASSLOADER_COUNT,
    BY_CONTEXT_CLASSLOADER_NAME;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            summary.totalSize = items.size();
            summary.shallowHeap = items.stream().mapToLong(Model.Thread.Item::getShallowSize).sum();
            summary.retainedHeap = items.stream().mapToLong(Model.Thread.Item::getRetainedSize).sum();;
            return summary;
        });
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `backend/master/src/main/java/org/eclipse/jifa/master/support/Pattern.java`
#### Snippet
```java
    DEFAULT,

    K8S;
}

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractPreUnifiedGCLogParser.java`
#### Snippet
```java
                    GCMemoryItem item = new GCMemoryItem(MemoryArea.METASPACE, memories);
                    event.setMemoryItem(item);
                } else if (token.getType() == TOKEN_RIGHT_BRACKET) {
                    // do nothing
                } else {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                    }

                                    if (label.matches("^int(\\[\\])*") || label.matches("^char(\\[\\])*") ||
                                        label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                        label.matches("^boolean(\\[\\])*") ||
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                    }

                                    if (label.matches("^int(\\[\\])*") || label.matches("^char(\\[\\])*") ||
                                        label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                        label.matches("^boolean(\\[\\])*") ||
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java

                                    if (label.matches("^int(\\[\\])*") || label.matches("^char(\\[\\])*") ||
                                        label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                        label.matches("^boolean(\\[\\])*") ||
                                        label.matches("^double(\\[\\])*") ||
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java

                                    if (label.matches("^int(\\[\\])*") || label.matches("^char(\\[\\])*") ||
                                        label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                        label.matches("^boolean(\\[\\])*") ||
                                        label.matches("^double(\\[\\])*") ||
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                    if (label.matches("^int(\\[\\])*") || label.matches("^char(\\[\\])*") ||
                                        label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                        label.matches("^boolean(\\[\\])*") ||
                                        label.matches("^double(\\[\\])*") ||
                                        label.matches("^float(\\[\\])*") || label.matches("^long(\\[\\])*") ||
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                        label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                        label.matches("^boolean(\\[\\])*") ||
                                        label.matches("^double(\\[\\])*") ||
                                        label.matches("^float(\\[\\])*") || label.matches("^long(\\[\\])*") ||
                                        label.matches("^void(\\[\\])*")) {
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                        label.matches("^boolean(\\[\\])*") ||
                                        label.matches("^double(\\[\\])*") ||
                                        label.matches("^float(\\[\\])*") || label.matches("^long(\\[\\])*") ||
                                        label.matches("^void(\\[\\])*")) {
                                        item.setType(Model.Histogram.ItemType.CLASS);
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                        label.matches("^boolean(\\[\\])*") ||
                                        label.matches("^double(\\[\\])*") ||
                                        label.matches("^float(\\[\\])*") || label.matches("^long(\\[\\])*") ||
                                        label.matches("^void(\\[\\])*")) {
                                        item.setType(Model.Histogram.ItemType.CLASS);
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                        label.matches("^double(\\[\\])*") ||
                                        label.matches("^float(\\[\\])*") || label.matches("^long(\\[\\])*") ||
                                        label.matches("^void(\\[\\])*")) {
                                        item.setType(Model.Histogram.ItemType.CLASS);
                                    }
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                }

                                if (label.matches("^int(\\[\\])*") || label.matches("^char(\\[\\])*") ||
                                    label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                    label.matches("^boolean(\\[\\])*") ||
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                }

                                if (label.matches("^int(\\[\\])*") || label.matches("^char(\\[\\])*") ||
                                    label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                    label.matches("^boolean(\\[\\])*") ||
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java

                                if (label.matches("^int(\\[\\])*") || label.matches("^char(\\[\\])*") ||
                                    label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                    label.matches("^boolean(\\[\\])*") ||
                                    label.matches("^double(\\[\\])*") ||
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java

                                if (label.matches("^int(\\[\\])*") || label.matches("^char(\\[\\])*") ||
                                    label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                    label.matches("^boolean(\\[\\])*") ||
                                    label.matches("^double(\\[\\])*") ||
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                if (label.matches("^int(\\[\\])*") || label.matches("^char(\\[\\])*") ||
                                    label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                    label.matches("^boolean(\\[\\])*") ||
                                    label.matches("^double(\\[\\])*") ||
                                    label.matches("^float(\\[\\])*") || label.matches("^long(\\[\\])*") ||
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                    label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                    label.matches("^boolean(\\[\\])*") ||
                                    label.matches("^double(\\[\\])*") ||
                                    label.matches("^float(\\[\\])*") || label.matches("^long(\\[\\])*") ||
                                    label.matches("^void(\\[\\])*")) {
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                    label.matches("^boolean(\\[\\])*") ||
                                    label.matches("^double(\\[\\])*") ||
                                    label.matches("^float(\\[\\])*") || label.matches("^long(\\[\\])*") ||
                                    label.matches("^void(\\[\\])*")) {
                                    item.setType(Model.Histogram.ItemType.CLASS);
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                    label.matches("^boolean(\\[\\])*") ||
                                    label.matches("^double(\\[\\])*") ||
                                    label.matches("^float(\\[\\])*") || label.matches("^long(\\[\\])*") ||
                                    label.matches("^void(\\[\\])*")) {
                                    item.setType(Model.Histogram.ItemType.CLASS);
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                                    label.matches("^double(\\[\\])*") ||
                                    label.matches("^float(\\[\\])*") || label.matches("^long(\\[\\])*") ||
                                    label.matches("^void(\\[\\])*")) {
                                    item.setType(Model.Histogram.ItemType.CLASS);
                                }
```

## RuleId[id=ReactiveStreamsUnusedPublisher]
### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `backend/master/src/main/java/org/eclipse/jifa/master/http/AnalyzerRoute.java`
#### Snippet
```java
        return jobService.rxFindActive(jobType, target)
                         .flatMap(job -> job.found() ?
                                         Single.just(job) :
                                         jobService.rxAllocate(user.getId(), file.getHostIP(), jobType,
                                                               target, EMPTY_STRING, Utils.calculateLoadFromSize(file.getSize()), false)
```

### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `backend/master/src/main/java/org/eclipse/jifa/master/http/AnalyzerRoute.java`
#### Snippet
```java
                   .doOnSuccess(file -> checkPermission(user, file))
                   .doOnSuccess(file -> ASSERT.isTrue(file.transferred(), ErrorCode.NOT_TRANSFERRED))
                   .flatMap(file -> findOrAllocate(user, file, jobType))
                   .doOnSuccess(this::assertJobInProgress)
                   .flatMap(job -> WorkerClient.send(context.request(), job.getHostIP()))
```

### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `backend/master/src/main/java/org/eclipse/jifa/master/http/AnalyzerRoute.java`
#### Snippet
```java
                   .flatMap(file -> findOrAllocate(user, file, jobType))
                   .doOnSuccess(this::assertJobInProgress)
                   .flatMap(job -> WorkerClient.send(context.request(), job.getHostIP()))
                   .subscribe(resp -> HTTPRespGuarder.ok(context, resp.statusCode(), resp.bodyAsString()),
                              t -> HTTPRespGuarder.fail(context, t));
```

### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `backend/master/src/main/java/org/eclipse/jifa/master/http/FileRoute.java`
#### Snippet
```java

        fileService.rxTransfer(userId, type, origin, name, TransferWay.UPLOAD, convert(request.params()))
                   .flatMap(job -> WorkerClient.uploadFile(job.getHostIP(),
                                                           new java.io.File(file.uploadedFileName()),
                                                           name,
```

### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `backend/master/src/main/java/org/eclipse/jifa/master/http/FileRoute.java`
#### Snippet
```java
                   .doOnSuccess(file -> checkPermission(user, file))
                   .doOnSuccess(file -> ASSERT.isTrue(file.transferred(), ErrorCode.NOT_TRANSFERRED))
                   .flatMap(file -> WorkerClient.send(context.request(), file.getHostIP()))
                   .subscribe(resp -> HTTPRespGuarder.ok(context, resp.statusCode(), resp.bodyAsString()),
                              t -> HTTPRespGuarder.fail(context, t));
```

### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `backend/master/src/main/java/org/eclipse/jifa/master/http/FileRoute.java`
#### Snippet
```java
                   .doOnSuccess(file -> ASSERT.isTrue(file.transferred(), ErrorCode.NOT_TRANSFERRED))
                   .doOnSuccess(file -> context.request().params().add("type", file.getType().name()))
                   .flatMap(file -> WorkerClient.send(context.request(), file.getHostIP()))
                   .subscribe(resp -> HTTPRespGuarder.ok(context, resp.statusCode(), resp.bodyAsString()),
                              t -> HTTPRespGuarder.fail(context, t));
```

### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `backend/master/src/main/java/org/eclipse/jifa/master/http/FileRoute.java`
#### Snippet
```java
                                  .doOnSuccess(this::assertFileAvailable)
                                  .doOnSuccess(file -> checkPermission(user, file))
                                  .flatMap(file -> Single.just(toProgress(file)));
            }

```

### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `backend/master/src/main/java/org/eclipse/jifa/master/http/FileRoute.java`
#### Snippet
```java
                            .map(resp -> GSON.fromJson(resp.bodyAsString(), TransferProgress.class));

            return progressSingle.flatMap(progress -> {
                ProgressState state = progress.getState();
                if (state.isFinal()) {
```

### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `backend/master/src/main/java/org/eclipse/jifa/master/http/FileRoute.java`
#### Snippet
```java
                    FileTransferState transferState = FileTransferState.fromProgressState(state);
                    return fileService.rxTransferDone(name, transferState, progress.getTotalSize())
                                      .andThen(Single.just(progress));
                }
                return Single.just(progress);
```

### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `backend/master/src/main/java/org/eclipse/jifa/master/http/FileRoute.java`
#### Snippet
```java
                    HttpRequest<Buffer> workerRequest = WorkerClient.request(context.request().method(), file.getHostIP(), context.request().uri());
                    workerRequest.as(BodyCodec.pipe(context.response()));
                    return WorkerClient.send(workerRequest, context.request().method() == HttpMethod.POST, null);
                })
                .subscribe(resp -> context.response().end(),
```

### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `backend/master/src/main/java/org/eclipse/jifa/master/http/JobRoute.java`
#### Snippet
```java
                  .flatMap(job -> {
                      if (job.getState() == JobState.IN_PROGRESS) {
                          return Single.just(new PendingJobsResult(true));
                      }
                      ASSERT.isTrue(job.getState() == JobState.PENDING, ErrorCode.SANITY_CHECK);
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            IResult result = queryByCommand(context, "histogram -groupBy " + groupBy.name(), args);
            switch (groupBy) {
                case BY_CLASS: {
                    throw new AnalysisException("Should not reach here");
                }
                case BY_CLASSLOADER: {
                    Histogram.ClassLoaderTree tree = (Histogram.ClassLoaderTree) result;
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `backend/master/src/main/java/org/eclipse/jifa/master/service/impl/Pivot.java`
#### Snippet
```java

    public Completable postInProgressJob(Job job) {
        switch (job.getType()) {
            case FILE_TRANSFER:
                File file = new File(new JsonObject(job.getAttachment()));
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/Analyzer.java`
#### Snippet
```java

    public boolean isFirstAnalysis(FileType fileType, String file) {
        switch (fileType) {
            case HEAP_DUMP:
                return !new File(FileSupport.indexPath(fileType, file)).exists() &&
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `pathKey` in enum 'TransferWay'
in `backend/master/src/main/java/org/eclipse/jifa/master/model/TransferWay.java`
#### Snippet
```java
    UPLOAD(uri(FILE_UPLOAD), "");

    private String[] pathKey;

    private String uri;
```

### NonFinalFieldInEnum
Non-final field `uri` in enum 'TransferWay'
in `backend/master/src/main/java/org/eclipse/jifa/master/model/TransferWay.java`
#### Snippet
```java
    private String[] pathKey;

    private String uri;

    TransferWay(String uri, String... pathKey) {
```

### NonFinalFieldInEnum
Non-final field `name` in enum 'GCCollectorType'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/modeInfo/GCCollectorType.java`
#### Snippet
```java
    UNKNOWN("Unknown GC");

    private String name;

    GCCollectorType(String name) {
```

### NonFinalFieldInEnum
Non-final field `tag` in enum 'FileType'
in `backend/common/src/main/java/org/eclipse/jifa/common/enums/FileType.java`
#### Snippet
```java
    ;

    private String tag;

    FileType(String tag) {
```

### NonFinalFieldInEnum
Non-final field `name` in enum 'GCLogStyle'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/modeInfo/GCLogStyle.java`
#### Snippet
```java
    UNKNOWN("unknown");

    private String name;

    GCLogStyle(String name) {
```

### NonFinalFieldInEnum
Non-final field `name` in enum 'SuggestionType'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/SuggestionType.java`
#### Snippet
```java
    public static final String I18N_PREFIX = "jifa.gclog.diagnose.suggestion.";

    private String name;

    SuggestionType(String name) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/PreUnifiedG1GCLogParser.java`
#### Snippet
```java
        GCEvent phaseStart = parent.getLastPhaseOfType(phaseType);
        if (phaseStart == null) {
            phase.setEventType(phaseType);
            model.addPhase(parent, phase);
            if (phaseType == G1_CONCURRENT_MARK_RESET_FOR_OVERFLOW || phaseType == G1_CONCURRENT_MARK_ABORT) {
                phase.setDuration(0);
            }
            ((AbstractPreUnifiedGCLogParser) parser).pushIfWaitingForCpuTime(phase);
        } else {
            copyPhaseDataToStart(phaseStart, phase);
            ((AbstractPreUnifiedGCLogParser) parser).pushIfWaitingForCpuTime(phaseStart);
        }
```

### DuplicatedCode
Duplicated code
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/util/GCLogUtil.java`
#### Snippet
```java
        int mid;
        for (mid = 0; mid < sizeString.length(); mid++) {
            char c = sizeString.charAt(mid);
            if (!Character.isDigit(c) && c != '.') {
                break;
            }
        }

        double size = Double.parseDouble(sizeString.substring(0, mid));
```

### DuplicatedCode
Duplicated code
in `backend/heap-dump-analyzer/api/src/main/java/org/eclipse/jifa/hda/api/Model.java`
#### Snippet
```java
                switch (type) {
                    case BY_NAME:
                        return getLabel();
                    case BY_PERCENT:
                        return getPercent();
                    case BY_OBJ_NUM:
                        return getObjects();
                    case BY_RETAINED_SIZE:
                        return getRetainedSize();
                    case BY_SHALLOW_SIZE:
                        return getShallowSize();
                    default:
                        ErrorUtil.shouldNotReachHere();
                }
                return null;
```

### DuplicatedCode
Duplicated code
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            ISnapshot baselineSnapshot = ((HeapDumpAnalyzerImpl) PROVIDER.provide(other, Collections.emptyMap(),
                                                                                NoOpProgressListener)).context.snapshot;
            ISnapshot targetSnapshot = context.snapshot;
            Histogram targetHistogram = targetSnapshot.getHistogram(new ProgressListenerImpl(NoOpProgressListener));
            Histogram baselineHistogram = baselineSnapshot.getHistogram(new ProgressListenerImpl(NoOpProgressListener));
            final Histogram delta = targetHistogram.diffWithBaseline(baselineHistogram);
```

### DuplicatedCode
Duplicated code
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
            origin.setLabel(object.getDisplayName());
            origin.setSuffix(Helper.suffix(snapshot, originId));
            origin.setGCRoot(snapshot.isGCRoot(originId));
            origin.setObjectType(typeOf(object));
            origin.setShallowSize(object.getUsedHeapSize());
            origin.setRetainedSize(object.getRetainedHeapSize());
```

### DuplicatedCode
Duplicated code
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                    PageViewBuilder.build(
                        ((IResultTree) result).getElements(),
                        new PagingRequest(page, pageSize),
                        e -> $(()-> context.snapshot.getObject(((IResultTree) result).getContext(e).getObjectId())),
                        o -> $(() -> {
                            JavaObject jo = new JavaObject();
                            jo.setObjectId(o.getObjectId());
                            jo.setLabel(o.getDisplayName());
                            jo.setSuffix(Helper.suffix(o.getGCRootInfo()));
                            jo.setShallowSize(o.getUsedHeapSize());
                            jo.setRetainedSize(o.getRetainedHeapSize());
                            jo.setGCRoot(context.snapshot.isGCRoot(o.getObjectId()));
                            jo.setObjectType(typeOf(o));
                            jo.setHasOutbound(true);
                            return jo;
                        }), IObjectSortHelper.sortBy(sortBy, ascendingOrder)));
```

### DuplicatedCode
Duplicated code
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                        .map(e -> {
                            Model.Histogram.Item item = new Model.Histogram.Item();
                            int objectId = st.getContext(e).getObjectId();
                            item.setType(Model.Histogram.ItemType.SUPER_CLASS);
                            item.setObjectId(objectId);
                            item.setLabel((String) st.getColumnValue(e, 0));
                            item.setNumberOfObjects((Long) st.getColumnValue(e, 1));
                            item.setShallowSize(((Bytes) st.getColumnValue(e, 2)).getValue());
                            return item;
                        })
```

### DuplicatedCode
Duplicated code
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                            .map(e -> {

                                Model.Histogram.Item item = new Model.Histogram.Item();
                                String label = (String) pt.getColumnValue(e, 0);
                                item.setLabel(label);

                                if (e instanceof XClassHistogramRecord) {
                                    int objectId = pt.getContext(e).getObjectId();
                                    item.setObjectId(objectId);
                                    item.setType(Model.Histogram.ItemType.CLASS);
                                } else {
                                    item.setObjectId(label.hashCode());
                                    item.setType(Model.Histogram.ItemType.PACKAGE);
                                }

                                if (label.matches("^int(\\[\\])*") || label.matches("^char(\\[\\])*") ||
                                    label.matches("^byte(\\[\\])*") || label.matches("^short(\\[\\])*") ||
                                    label.matches("^boolean(\\[\\])*") ||
                                    label.matches("^double(\\[\\])*") ||
                                    label.matches("^float(\\[\\])*") || label.matches("^long(\\[\\])*") ||
                                    label.matches("^void(\\[\\])*")) {
                                    item.setType(Model.Histogram.ItemType.CLASS);
                                }
                                item.setNumberOfObjects((Long) pt.getColumnValue(e, 1));
                                item.setShallowSize(((Bytes) pt.getColumnValue(e, 2)).getValue());

                                return item;
                            })
```

### DuplicatedCode
Duplicated code
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/HeapDumpAnalyzerImpl.java`
#### Snippet
```java
                        Map<String, ?> packageMap = ReflectionUtil.getFieldValueOrNull(targetParentNode, "subPackages");
                        List<?> elems = new ArrayList<>();
                        if (packageMap != null) {
                            if (packageMap.size() == 0) {
                                elems = ReflectionUtil.getFieldValueOrNull(targetParentNode, "classes");
                            } else {
                                elems = new ArrayList<>(packageMap.values());
                            }
                        }
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[b]` can be simplified to 'b'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/modeInfo/VmOptions.java`
#### Snippet
```java

    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");
    private static final Pattern SIZE_PATTERN = Pattern.compile("\\d+[kmgt]]?[b]?");

    private Object decideTypeAndParse(String s) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/SuggestionGenerator.java`
#### Snippet
```java
        }
        givenCause.set(type.ordinal());
        result.add(new I18nStringView(SuggestionType.I18N_PREFIX + type.toString(), params));
    }

```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `backend/master/src/main/java/org/eclipse/jifa/master/http/FileRoute.java`
#### Snippet
```java

        if (name.length() == 0) {
            name = System.currentTimeMillis() + "";
        }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `backend/common/src/main/java/org/eclipse/jifa/common/util/TypeFactory.java`
#### Snippet
```java
 ********************************************************************************/

/**
 * @plasma147 provided this solution:
 * https://stackoverflow.com/a/11385215/813561
```

### DanglingJavadoc
Dangling Javadoc comment
in `backend/common/src/main/java/org/eclipse/jifa/common/util/AccessorBasedTypeAdaptor.java`
#### Snippet
```java
********************************************************************************/

/**
* @plasma147 provided this solution:
* https://stackoverflow.com/a/11385215/813561
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `item` declared in one 'switch' branch and used in another
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/UnifiedZGCLogParser.java`
#### Snippet
```java
        switch (prefix) {
            case "Capacity":
                GCMemoryItem item = new GCMemoryItem(HEAP);
                item.setPreCapacity(GCLogUtil.toByte(parts[0]));
                item.setPostCapacity(GCLogUtil.toByte(parts[6]));
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractUnifiedGCLogParser.java`
#### Snippet
```java
     * Either timestamp or uptime is necessary. Detail is necessary.
     * Other decorations are useless to us.
     * see https://docs.oracle.com/javase/9/tools/java.htm#JSWOR-GUID-9569449C-525F-4474-972C-4C1F63D5C357    Decorations chapter
     */
    private JDK11LogLine parseJDK11LogLine(String line) {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `backend/master/src/main/java/org/eclipse/jifa/master/task/RetiringTask.java`
#### Snippet
```java

public class RetiringTask extends BaseTask {
    private static long MIN_TIMEOUT_THRESHOLD = 5 * 6000L;

    private static long timeoutThreshold;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/G1GCModel.java`
#### Snippet
```java
public class G1GCModel extends GCModel {
    private long heapRegionSize = UNKNOWN_INT;   // in b
    private boolean regionSizeExact = false;
    private static GCCollectorType collector = GCCollectorType.G1;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `backend/master/src/main/java/org/eclipse/jifa/master/support/K8SWorkerScheduler.java`
#### Snippet
```java
    private static long MINIMAL_MEM_REQ;

    private static String MASTER_POD_NAME;

    private static String WORKER_PVC_NAME;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/GCLogAnalyzer.java`
#### Snippet
```java
    private ProgressListener listener;

    private final int MAX_SINGLE_LINE_LENGTH = 2048; // max length in hotspot

    public GCLogAnalyzer(File file, ProgressListener listener) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Maybe.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/service/ServiceVerticle.java`
#### Snippet
```java

            future.complete(Single.just(this));
        }).subscribe(f -> startFuture.complete(), startFuture::fail);
    }

```

### IgnoreResultOfCall
Result of `Single.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/task/StopAbnormalWorkerTask.java`
#### Snippet
```java
                    });
            })
            .subscribe(n -> {
                if (n != Worker.NOT_FOUND) {
                    LOGGER.info("Stopped abnormal worker {}/{}", n.getHostName(), n.getHostIP());
```

### IgnoreResultOfCall
Result of `Maybe.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/task/DiskCleaningTask.java`
#### Snippet
```java
        // action for every file in that list
        isEnableDiskCleaning()
            .subscribe(val -> getHighDiskOverloadWorkers()
                .flatMapObservable(workerIpList -> markAndDeleteFiles(pivot.getDbClient(), pivot, workerIpList))
                .ignoreElements()
```

### IgnoreResultOfCall
Result of `Completable.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/task/DiskCleaningTask.java`
#### Snippet
```java
                .flatMapObservable(workerIpList -> markAndDeleteFiles(pivot.getDbClient(), pivot, workerIpList))
                .ignoreElements()
                .subscribe(
                    () -> {
                        LOGGER.info("Execute {} successfully ", name());
```

### IgnoreResultOfCall
Result of `Single.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/task/SchedulingTask.java`
#### Snippet
```java
                 return pendingJobs.size() > 0;
             })
             .subscribe(hasPendingJobs -> {
                 if (hasPendingJobs) {
                     processNextPendingJob();
```

### IgnoreResultOfCall
Result of `Single.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/task/SchedulingTask.java`
#### Snippet
```java
        if (index < pendingJobs.size()) {
            processJob(pendingJobs.get(index++))
                .subscribe(
                    next -> {
                        if (next) {
```

### IgnoreResultOfCall
Result of `Single.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/http/HttpServerVerticle.java`
#### Snippet
```java

            Integer port = config().getInteger("port");
            vertx.createHttpServer().requestHandler(router).rxListen(port).subscribe(s -> {
                LOGGER.info("Master-Http-Server-Verticle started successfully, port is {}", port);
                future.complete(Single.just(this));
```

### IgnoreResultOfCall
Result of `Maybe.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/http/HttpServerVerticle.java`
#### Snippet
```java
                future.complete(Single.just(this));
            }, future::fail);
        }).subscribe(f -> startFuture.complete(), startFuture::fail);
    }

```

### IgnoreResultOfCall
Result of `Completable.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/task/DiskUsageUpdatingTask.java`
#### Snippet
```java
                                                                                                      usage.getUsedSpaceInMb()))
                                    )
        ).ignoreElements().subscribe(this::end, t -> {
            LOGGER.error("Execute {} error", name(), t);
            end();
```

### IgnoreResultOfCall
Result of `Single.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/http/FileRoute.java`
#### Snippet
```java
            pv.setData(fileRecords.stream().map(FileRoute::buildFileInfo).collect(Collectors.toList()));
            return pv;
        }).subscribe(pageView -> HTTPRespGuarder.ok(context, pageView), t -> HTTPRespGuarder.fail(context, t));
    }

```

### IgnoreResultOfCall
Result of `Completable.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/task/FileSyncTask.java`
#### Snippet
```java
                             .onErrorComplete()
                     )
             ).andThen(processLongTransferJob()).subscribe(this::end,
                         t -> {
                             LOGGER.error("Execute {} error", name(), t);
```

### IgnoreResultOfCall
Result of `Single.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/service/impl/Pivot.java`
#### Snippet
```java
                        String url = "/jifa-api/" + type.getTag() + "/" + target + "/release";
                        Single<HttpResponse<Buffer>> post = post(job.getHostIP(), url);
                        post.subscribe(resp -> {
                                           if (resp.statusCode() != Constant.HTTP_POST_CREATED_STATUS) {
                                               LOGGER.error("Notify worker {} to release task error, result : {}",
```

### IgnoreResultOfCall
Result of `Single.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/Master.java`
#### Snippet
```java
                                        .setConfig(new JsonObject().put("path", mc))));

        configRetriever.rxGetConfig().subscribe(masterConfig -> {
            WorkerClient.init(masterConfig.getJsonObject(WORKER_CONFIG_KEY), WebClient.create(vertx));

```

### IgnoreResultOfCall
Result of `Single.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/Master.java`
#### Snippet
```java
                                       .setInstances(Runtime.getRuntime().availableProcessors());
            service.flatMap(id -> vertx.rxDeployVerticle(HttpServerVerticle.class.getName(), httpConfig))
                   .subscribe(id -> startFuture.complete(), startFuture::fail);
        }, startFuture::fail);
    }
```

### IgnoreResultOfCall
Result of `Completable.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/task/RetiringTask.java`
#### Snippet
```java
             .map(jobs -> jobs.stream().map(pivot::finish).collect(Collectors.toList()))
             .flatMapCompletable(Completable::concat)
             .subscribe(
                 this::end,
                 t -> {
```

### IgnoreResultOfCall
Result of `Completable.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/task/TransferJobResultFillingTask.java`
#### Snippet
```java
             .map(jobs -> jobs.stream().map(pivot::processTimeoutTransferJob).collect(Collectors.toList()))
             .flatMapCompletable(Completable::concat)
             .subscribe(
                 this::end,
                 t -> {
```

### IgnoreResultOfCall
Result of `Completable.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/task/PVCCleanupTask.java`
#### Snippet
```java
                    )
            )
            .subscribe(() -> {
                    this.end();
                },
```

### IgnoreResultOfCall
Result of `Completable.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/task/FileSyncForK8STask.java`
#### Snippet
```java
                }
            ).andThen(processLongTransferJob())
            .subscribe(this::end,
                t -> {
                    LOGGER.error("Execute {} error", name(), t);
```

### IgnoreResultOfCall
Result of `Single.subscribe()` is ignored
in `backend/master/src/main/java/org/eclipse/jifa/master/http/UserRoute.java`
#### Snippet
```java
                      return Single.just("");
                  }
              }).subscribe(token -> HTTPRespGuarder.ok(context, new UserToken(token)),
                           t -> HTTPRespGuarder.fail(context, t));
    }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `backend/master/src/main/java/org/eclipse/jifa/master/service/impl/FileServiceImpl.java`
#### Snippet
```java
        boolean immediate = false;

        if (transferWay == TransferWay.OSS ||
            (transferWay == TransferWay.SCP && !Boolean.parseBoolean(transferInfo.get("usePublicKey")))) {
            immediate = true;
```

### TrivialIf
`if` statement can be simplified
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractUnifiedGCLogParser.java`
#### Snippet
```java
                return false;
            }
            if (getTags() != null && !getTags().contains("gc")) { // need gc tag
                return false;
            }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `doInit()` is identical to its super method
in `backend/master/src/main/java/org/eclipse/jifa/master/task/StopAbnormalWorkerTask.java`
#### Snippet
```java

    @Override
    public void doInit() {
    }

```

### RedundantMethodOverride
Method `doInit()` is identical to its super method
in `backend/master/src/main/java/org/eclipse/jifa/master/task/PVCCleanupTask.java`
#### Snippet
```java

    @Override
    public void doInit() {
    }

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'SSHClient' used without 'try'-with-resources statement
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/FileSupport.java`
#### Snippet
```java
                                     Promise<TransferringFile> promise) {
        transferProgressListener.updateState(ProgressState.IN_PROGRESS);
        SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier((h, port, key) -> true);
        try {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.lang.reflect.Method;`
in `backend/common/src/main/java/org/eclipse/jifa/common/util/ReflectionUtil.java`
#### Snippet
```java

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtil {
```

### UNUSED_IMPORT
Unused import `import lombok.EqualsAndHashCode;`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/AnalysisConfig.java`
#### Snippet
```java

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
```

### UNUSED_IMPORT
Unused import `import com.google.common.util.concurrent.AtomicDouble;`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/CMSGCModel.java`
#### Snippet
```java
package org.eclipse.jifa.gclog.model;

import com.google.common.util.concurrent.AtomicDouble;
import org.eclipse.jifa.gclog.event.GCEvent;
import org.eclipse.jifa.gclog.event.evnetInfo.GCEventBooleanType;
```

### UNUSED_IMPORT
Unused import `import static org.eclipse.jifa.gclog.util.Constant.UNKNOWN_LONG;`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/CMSGCModel.java`
#### Snippet
```java
import java.util.List;

import static org.eclipse.jifa.gclog.util.Constant.UNKNOWN_LONG;
import static org.eclipse.jifa.gclog.event.evnetInfo.MemoryArea.METASPACE;
import static org.eclipse.jifa.gclog.event.evnetInfo.MemoryArea.OLD;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.jifa.common.util.ErrorUtil;`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/GCLogParserFactory.java`
#### Snippet
```java
import lombok.Data;
import org.eclipse.jifa.common.JifaException;
import org.eclipse.jifa.common.util.ErrorUtil;
import org.eclipse.jifa.gclog.model.modeInfo.GCCollectorType;
import org.eclipse.jifa.gclog.model.modeInfo.GCLogStyle;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.jifa.gclog.util.Constant;`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/UnifiedG1OrGenerationalGCLogParser.java`
#### Snippet
```java
import org.eclipse.jifa.gclog.parser.ParseRule.ParseRuleContext;
import org.eclipse.jifa.gclog.parser.ParseRule.PrefixAndValueParseRule;
import org.eclipse.jifa.gclog.util.Constant;
import org.eclipse.jifa.gclog.util.GCLogUtil;

```

### UNUSED_IMPORT
Unused import `import java.util.regex.Matcher;`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/util/GCLogUtil.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

```

### UNUSED_IMPORT
Unused import `import java.util.regex.Pattern;`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/util/GCLogUtil.java`
#### Snippet
```java
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.eclipse.jifa.gclog.util.Constant.UNKNOWN_INT;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.mat.SnapshotException;`
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/VirtualThreadItem.java`
#### Snippet
```java
package org.eclipse.jifa.hda.impl;

import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.query.Bytes;
import org.eclipse.mat.query.IResultTree;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.mat.snapshot.ISnapshot;`
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/VirtualThreadItem.java`
#### Snippet
```java
import org.eclipse.mat.query.Bytes;
import org.eclipse.mat.query.IResultTree;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.model.IObject;
import org.eclipse.jifa.common.util.UseAccessor;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.mat.snapshot.model.IObject;`
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/VirtualThreadItem.java`
#### Snippet
```java
import org.eclipse.mat.query.IResultTree;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.model.IObject;
import org.eclipse.jifa.common.util.UseAccessor;
import org.eclipse.jifa.hda.api.AnalysisException;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.jifa.hda.api.AnalysisException;`
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/VirtualThreadItem.java`
#### Snippet
```java
import org.eclipse.mat.snapshot.model.IObject;
import org.eclipse.jifa.common.util.UseAccessor;
import org.eclipse.jifa.hda.api.AnalysisException;
import static org.eclipse.jifa.hda.api.Model.Thread;

```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `backend/master/src/main/java/org/eclipse/jifa/master/support/DefaultWorkerScheduler.java`
#### Snippet
```java

import java.util.List;
import java.util.Map;

public class DefaultWorkerScheduler implements WorkerScheduler {
```

### UNUSED_IMPORT
Unused import `import static org.eclipse.jifa.master.Constant.K8S_WORKER_PVC_NAME;`
in `backend/master/src/main/java/org/eclipse/jifa/master/support/K8SWorkerScheduler.java`
#### Snippet
```java

import static org.eclipse.jifa.master.Constant.*;
import static org.eclipse.jifa.master.Constant.K8S_WORKER_PVC_NAME;

public class K8SWorkerScheduler implements WorkerScheduler {
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `backend/master/src/main/java/org/eclipse/jifa/master/support/WorkerScheduler.java`
#### Snippet
```java

import java.util.List;
import java.util.Map;

public interface WorkerScheduler {
```

### UNUSED_IMPORT
Unused import `import org.eclipse.jifa.gclog.vo.GCEventVO;`
in `backend/worker/src/main/java/org/eclipse/jifa/worker/route/gclog/GCLogRoute.java`
#### Snippet
```java
import org.eclipse.jifa.gclog.diagnoser.AnalysisConfig;
import org.eclipse.jifa.gclog.diagnoser.GlobalDiagnoser;
import org.eclipse.jifa.gclog.vo.GCEventVO;
import org.eclipse.jifa.gclog.model.modeInfo.GCLogMetadata;
import org.eclipse.jifa.gclog.model.GCModel;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.AWSCredentials;`
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/FileSupport.java`
#### Snippet
```java
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.AWSStaticCredentialsProvider;`
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/FileSupport.java`
#### Snippet
```java
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.BasicAWSCredentials;`
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/FileSupport.java`
#### Snippet
```java
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.regions.Regions;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;`
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/FileSupport.java`
#### Snippet
```java
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.regions.Regions;`
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/FileSupport.java`
#### Snippet
```java
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.AmazonServiceException;`
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/FileSupport.java`
#### Snippet
```java
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.*;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.SdkClientException;`
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/FileSupport.java`
#### Snippet
```java
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.*;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.auth.profile.ProfileCredentialsProvider;`
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/FileSupport.java`
#### Snippet
```java
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.*;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.services.s3.model.S3Object;
```

### UNUSED_IMPORT
Unused import `import com.amazonaws.services.s3.model.ResponseHeaderOverrides;`
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/FileSupport.java`
#### Snippet
```java
import com.amazonaws.auth.*;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.services.s3.model.S3Object;

```

### UNUSED_IMPORT
Unused import `import com.amazonaws.services.s3.model.S3Object;`
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/FileSupport.java`
#### Snippet
```java
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.services.s3.model.S3Object;


```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `backend/thread-dump-analyzer/src/main/java/org/eclipse/jifa/tda/ThreadDumpAnalyzer.java`
#### Snippet
```java
     * @param lineLimit line count
     * @return the raw content
     * @throws IOException
     */
    public Content content(int lineNo, int lineLimit) throws IOException {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `param` to `Enum` is redundant
in `backend/master/src/main/java/org/eclipse/jifa/master/service/impl/helper/SQLHelper.java`
#### Snippet
```java
                jsonArray.addAll((JsonArray) param);
            } else if (param instanceof Enum) {
                jsonArray.add((Enum) param);
            } else {
                jsonArray.add(param);
```

### RedundantCast
Casting `result.hasChildren(...)` to `Boolean` is redundant
in `backend/heap-dump-analyzer/impl/src/main/java/org/eclipse/jifa/hda/impl/VirtualThreadItem.java`
#### Snippet
```java
    @Override
    public boolean isHasStack() {
        return (Boolean) result.hasChildren(row);
    }

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `map` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/util/CountingMap.java`
#### Snippet
```java

public class CountingMap<T> {
    private Map<T, Integer> map = new HashMap<>();

    public void put(T key) {
```

### FieldMayBeFinal
Field `map` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/util/Key2ValueListMap.java`
#### Snippet
```java

public class Key2ValueListMap<K, V> {
    private Map<K, List<V>> map;

    public Key2ValueListMap(Map<K, List<V>> map) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/event/evnetInfo/GCCause.java`
#### Snippet
```java

public class GCCause {
    private String name;

    private static final Map<String, GCCause> name2cause = new HashMap<>();
```

### FieldMayBeFinal
Field `allEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/UnknownGCModel.java`
#### Snippet
```java
    }

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
```

### FieldMayBeFinal
Field `collector` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/UnknownGCModel.java`
#### Snippet
```java
public class UnknownGCModel extends GenerationalGCModel {

    private static GCCollectorType collector = GCCollectorType.UNKNOWN;

    public UnknownGCModel() {
```

### FieldMayBeFinal
Field `importantEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/UnknownGCModel.java`
#### Snippet
```java
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC);

    @Override
```

### FieldMayBeFinal
Field `parentEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/UnknownGCModel.java`
#### Snippet
```java
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC);

```

### FieldMayBeFinal
Field `pauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/UnknownGCModel.java`
#### Snippet
```java

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
```

### FieldMayBeFinal
Field `mainPauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/UnknownGCModel.java`
#### Snippet
```java
    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC);
```

### FieldMayBeFinal
Field `pathKey` may be 'final'
in `backend/master/src/main/java/org/eclipse/jifa/master/model/TransferWay.java`
#### Snippet
```java
    UPLOAD(uri(FILE_UPLOAD), "");

    private String[] pathKey;

    private String uri;
```

### FieldMayBeFinal
Field `uri` may be 'final'
in `backend/master/src/main/java/org/eclipse/jifa/master/model/TransferWay.java`
#### Snippet
```java
    private String[] pathKey;

    private String uri;

    TransferWay(String uri, String... pathKey) {
```

### FieldMayBeFinal
Field `phases` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/vo/GCEventVO.java`
#### Snippet
```java
public class GCEventVO {
    private Map<String, Object> info = new HashMap<>();
    private List<GCEventVO> phases = new ArrayList<>();
    // todo: add diagnostic info

```

### FieldMayBeFinal
Field `info` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/vo/GCEventVO.java`
#### Snippet
```java
 */
public class GCEventVO {
    private Map<String, Object> info = new HashMap<>();
    private List<GCEventVO> phases = new ArrayList<>();
    // todo: add diagnostic info
```

### FieldMayBeFinal
Field `proxyMap` may be 'final'
in `backend/master/src/main/java/org/eclipse/jifa/master/service/ProxyDictionary.java`
#### Snippet
```java
public class ProxyDictionary {

    private static Map<String, Object> proxyMap = new ConcurrentHashMap<>();

    static synchronized void add(Class<?> serviceInterface, Object proxy) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/modeInfo/GCCollectorType.java`
#### Snippet
```java
    UNKNOWN("Unknown GC");

    private String name;

    GCCollectorType(String name) {
```

### FieldMayBeFinal
Field `GENERATIONAL_GCS` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    private static GCCollectorType[] SERIAL_AND_CMS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.CMS};
    private static GCCollectorType[] ALL_GCS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.PARALLEL, GCCollectorType.G1, GCCollectorType.SHENANDOAH, GCCollectorType.ZGC, GCCollectorType.CMS, GCCollectorType.UNKNOWN};
    private static GCCollectorType[] GENERATIONAL_GCS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.PARALLEL, GCCollectorType.G1, GCCollectorType.CMS, GCCollectorType.UNKNOWN};

    // external event types
```

### FieldMayBeFinal
Field `pause` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java

    private String name;
    private GCPause pause;
    private GCEventType[] phaseParentEventType;
    private GCEventLevel level;
```

### FieldMayBeFinal
Field `CMS` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    private static GCCollectorType[] SERIAL = new GCCollectorType[]{GCCollectorType.SERIAL};
    private static GCCollectorType[] PARALLEL = new GCCollectorType[]{GCCollectorType.PARALLEL};
    private static GCCollectorType[] CMS = new GCCollectorType[]{GCCollectorType.CMS};
    private static GCCollectorType[] G1 = new GCCollectorType[]{GCCollectorType.G1};
    private static GCCollectorType[] SHENANDOAH = new GCCollectorType[]{GCCollectorType.SHENANDOAH};
```

### FieldMayBeFinal
Field `level` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    private GCPause pause;
    private GCEventType[] phaseParentEventType;
    private GCEventLevel level;
    private List<GCCollectorType> gcs; // which gcs do this event type may occur?

```

### FieldMayBeFinal
Field `phaseParentEventType` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    private String name;
    private GCPause pause;
    private GCEventType[] phaseParentEventType;
    private GCEventLevel level;
    private List<GCCollectorType> gcs; // which gcs do this event type may occur?
```

### FieldMayBeFinal
Field `SERIAL_AND_CMS` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    private static GCCollectorType[] SHENANDOAH = new GCCollectorType[]{GCCollectorType.SHENANDOAH};
    private static GCCollectorType[] ZGC = new GCCollectorType[]{GCCollectorType.ZGC};
    private static GCCollectorType[] SERIAL_AND_CMS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.CMS};
    private static GCCollectorType[] ALL_GCS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.PARALLEL, GCCollectorType.G1, GCCollectorType.SHENANDOAH, GCCollectorType.ZGC, GCCollectorType.CMS, GCCollectorType.UNKNOWN};
    private static GCCollectorType[] GENERATIONAL_GCS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.PARALLEL, GCCollectorType.G1, GCCollectorType.CMS, GCCollectorType.UNKNOWN};
```

### FieldMayBeFinal
Field `ZGC` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    private static GCCollectorType[] G1 = new GCCollectorType[]{GCCollectorType.G1};
    private static GCCollectorType[] SHENANDOAH = new GCCollectorType[]{GCCollectorType.SHENANDOAH};
    private static GCCollectorType[] ZGC = new GCCollectorType[]{GCCollectorType.ZGC};
    private static GCCollectorType[] SERIAL_AND_CMS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.CMS};
    private static GCCollectorType[] ALL_GCS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.PARALLEL, GCCollectorType.G1, GCCollectorType.SHENANDOAH, GCCollectorType.ZGC, GCCollectorType.CMS, GCCollectorType.UNKNOWN};
```

### FieldMayBeFinal
Field `SHENANDOAH` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    private static GCCollectorType[] CMS = new GCCollectorType[]{GCCollectorType.CMS};
    private static GCCollectorType[] G1 = new GCCollectorType[]{GCCollectorType.G1};
    private static GCCollectorType[] SHENANDOAH = new GCCollectorType[]{GCCollectorType.SHENANDOAH};
    private static GCCollectorType[] ZGC = new GCCollectorType[]{GCCollectorType.ZGC};
    private static GCCollectorType[] SERIAL_AND_CMS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.CMS};
```

### FieldMayBeFinal
Field `PARALLEL` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    // shared gc arrays
    private static GCCollectorType[] SERIAL = new GCCollectorType[]{GCCollectorType.SERIAL};
    private static GCCollectorType[] PARALLEL = new GCCollectorType[]{GCCollectorType.PARALLEL};
    private static GCCollectorType[] CMS = new GCCollectorType[]{GCCollectorType.CMS};
    private static GCCollectorType[] G1 = new GCCollectorType[]{GCCollectorType.G1};
```

### FieldMayBeFinal
Field `name` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    private static List<GCEventType> allEventTypes = new ArrayList<>();

    private String name;
    private GCPause pause;
    private GCEventType[] phaseParentEventType;
```

### FieldMayBeFinal
Field `ALL_GCS` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    private static GCCollectorType[] ZGC = new GCCollectorType[]{GCCollectorType.ZGC};
    private static GCCollectorType[] SERIAL_AND_CMS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.CMS};
    private static GCCollectorType[] ALL_GCS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.PARALLEL, GCCollectorType.G1, GCCollectorType.SHENANDOAH, GCCollectorType.ZGC, GCCollectorType.CMS, GCCollectorType.UNKNOWN};
    private static GCCollectorType[] GENERATIONAL_GCS = new GCCollectorType[]{GCCollectorType.SERIAL, GCCollectorType.PARALLEL, GCCollectorType.G1, GCCollectorType.CMS, GCCollectorType.UNKNOWN};

```

### FieldMayBeFinal
Field `G1` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    private static GCCollectorType[] PARALLEL = new GCCollectorType[]{GCCollectorType.PARALLEL};
    private static GCCollectorType[] CMS = new GCCollectorType[]{GCCollectorType.CMS};
    private static GCCollectorType[] G1 = new GCCollectorType[]{GCCollectorType.G1};
    private static GCCollectorType[] SHENANDOAH = new GCCollectorType[]{GCCollectorType.SHENANDOAH};
    private static GCCollectorType[] ZGC = new GCCollectorType[]{GCCollectorType.ZGC};
```

### FieldMayBeFinal
Field `SERIAL` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java

    // shared gc arrays
    private static GCCollectorType[] SERIAL = new GCCollectorType[]{GCCollectorType.SERIAL};
    private static GCCollectorType[] PARALLEL = new GCCollectorType[]{GCCollectorType.PARALLEL};
    private static GCCollectorType[] CMS = new GCCollectorType[]{GCCollectorType.CMS};
```

### FieldMayBeFinal
Field `gcs` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
    private GCEventType[] phaseParentEventType;
    private GCEventLevel level;
    private List<GCCollectorType> gcs; // which gcs do this event type may occur?

    public static final GCEventType UNDEFINED = new GCEventType("Undefined", GCPause.PARTIAL, new GCCollectorType[]{});
```

### FieldMayBeFinal
Field `allEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCEventType.java`
#### Snippet
```java
 */
public class GCEventType {
    private static List<GCEventType> allEventTypes = new ArrayList<>();

    private String name;
```

### FieldMayBeFinal
Field `pendingJobs` may be 'final'
in `backend/master/src/main/java/org/eclipse/jifa/master/task/SchedulingTask.java`
#### Snippet
```java
    private int index;

    private List<Job> pendingJobs = new ArrayList<>();

    private Set<String> pinnedHostIPs = new HashSet<>();
```

### FieldMayBeFinal
Field `pinnedHostIPs` may be 'final'
in `backend/master/src/main/java/org/eclipse/jifa/master/task/SchedulingTask.java`
#### Snippet
```java
    private List<Job> pendingJobs = new ArrayList<>();

    private Set<String> pinnedHostIPs = new HashSet<>();

    public SchedulingTask(Pivot pivot, Vertx vertx) {
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/ParseRule.java`
#### Snippet
```java

    class RegexParseRules implements ParseRule {
        private Pattern pattern;
        TriConsumer<AbstractGCLogParser, ParseRuleContext, Matcher> consumer;

```

### FieldMayBeFinal
Field `map` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/ParseRule.java`
#### Snippet
```java
        public static final String EVENT = "event";

        private Map<String, Object> map;

        public void put(String key, Object value) {
```

### FieldMayBeFinal
Field `content` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/ParseRule.java`
#### Snippet
```java

    class FixedContentParseRule implements ParseRule {
        private String content;
        private BiConsumer<AbstractGCLogParser, ParseRuleContext> consumer;

```

### FieldMayBeFinal
Field `prefix` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/ParseRule.java`
#### Snippet
```java
    // e.g as to "Heap: 1g" then prefix is "Heap" or "Heap:", value is "1g"
    class PrefixAndValueParseRule implements ParseRule {
        private String prefix;
        private FourConsumer<AbstractGCLogParser, ParseRuleContext, String, String> consumer;

```

### FieldMayBeFinal
Field `consumer` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/ParseRule.java`
#### Snippet
```java
    class FixedContentParseRule implements ParseRule {
        private String content;
        private BiConsumer<AbstractGCLogParser, ParseRuleContext> consumer;

        public FixedContentParseRule(String content, BiConsumer<AbstractGCLogParser, ParseRuleContext> consumer) {
```

### FieldMayBeFinal
Field `consumer` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/ParseRule.java`
#### Snippet
```java
    class PrefixAndValueParseRule implements ParseRule {
        private String prefix;
        private FourConsumer<AbstractGCLogParser, ParseRuleContext, String, String> consumer;

        public PrefixAndValueParseRule(String prefix, FourConsumer<AbstractGCLogParser, ParseRuleContext, String, String> consumer) {
```

### FieldMayBeFinal
Field `statistics` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ZGCModel.java`
#### Snippet
```java
    // key of maps here should include unit like
    // "Memory: Allocation Rate MB/s" to deduplicate
    private List<ZStatistics> statistics = new ArrayList<>();
    private List<GCEvent> allocationStalls = new ArrayList<>();
    private long recommendMaxHeapSize = UNKNOWN_INT;
```

### FieldMayBeFinal
Field `allocationStalls` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ZGCModel.java`
#### Snippet
```java
    // "Memory: Allocation Rate MB/s" to deduplicate
    private List<ZStatistics> statistics = new ArrayList<>();
    private List<GCEvent> allocationStalls = new ArrayList<>();
    private long recommendMaxHeapSize = UNKNOWN_INT;

```

### FieldMayBeFinal
Field `collector` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ZGCModel.java`
#### Snippet
```java


    private static GCCollectorType collector = GCCollectorType.ZGC;

    public ZGCModel() {
```

### FieldMayBeFinal
Field `importantEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ZGCModel.java`
#### Snippet
```java
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(ZGC_GARBAGE_COLLECTION, ZGC_PAUSE_MARK_START,
            ZGC_PAUSE_MARK_END, ZGC_PAUSE_RELOCATE_START, ZGC_CONCURRENT_MARK, ZGC_CONCURRENT_NONREF,
            ZGC_CONCURRENT_SELECT_RELOC_SET, ZGC_CONCURRENT_PREPARE_RELOC_SET, ZGC_CONCURRENT_RELOCATE);
```

### FieldMayBeFinal
Field `allEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ZGCModel.java`
#### Snippet
```java
    }

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
```

### FieldMayBeFinal
Field `parentEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ZGCModel.java`
#### Snippet
```java
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(ZGC_GARBAGE_COLLECTION, ZGC_PAUSE_MARK_START,
            ZGC_PAUSE_MARK_END, ZGC_PAUSE_RELOCATE_START, ZGC_CONCURRENT_MARK, ZGC_CONCURRENT_NONREF,
```

### FieldMayBeFinal
Field `mainPauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ZGCModel.java`
#### Snippet
```java
    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(ZGC_GARBAGE_COLLECTION, ZGC_PAUSE_MARK_START,
```

### FieldMayBeFinal
Field `pauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ZGCModel.java`
#### Snippet
```java

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
```

### FieldMayBeFinal
Field `converter` may be 'final'
in `backend/worker/src/main/java/org/eclipse/jifa/worker/route/RouterAnnotationProcessor.java`
#### Snippet
```java

class RouterAnnotationProcessor {
    private static Map<Class<?>, Function<String, ?>> converter = new HashMap<>();

    static {
```

### FieldMayBeFinal
Field `importantEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ParallelGCModel.java`
#### Snippet
```java
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC);

    @Override
```

### FieldMayBeFinal
Field `parentEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ParallelGCModel.java`
#### Snippet
```java
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC);

```

### FieldMayBeFinal
Field `mainPauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ParallelGCModel.java`
#### Snippet
```java
    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC);
```

### FieldMayBeFinal
Field `collector` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ParallelGCModel.java`
#### Snippet
```java

public class ParallelGCModel extends GenerationalGCModel {
    private static GCCollectorType collector = GCCollectorType.PARALLEL;

    public ParallelGCModel() {
```

### FieldMayBeFinal
Field `allEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ParallelGCModel.java`
#### Snippet
```java
    }

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
```

### FieldMayBeFinal
Field `pauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/ParallelGCModel.java`
#### Snippet
```java

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
```

### FieldMayBeFinal
Field `sentenceToParseQueue` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractPreUnifiedGCLogParser.java`
#### Snippet
```java
public abstract class AbstractPreUnifiedGCLogParser extends AbstractGCLogParser {

    private LinkedList<List<GCLogToken>> sentenceToParseQueue = new LinkedList<>();
    private LinkedList<List<GCLogToken>> sentenceToAssembleStack = new LinkedList<>();

```

### FieldMayBeFinal
Field `eventsWaitingForCpuTime` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractPreUnifiedGCLogParser.java`
#### Snippet
```java
            ((parser, context, prefix, flags) -> parser.getModel().setVmOptions(new VmOptions(flags))));

    private LinkedList<GCEvent> eventsWaitingForCpuTime = new LinkedList<>();

    protected void pushIfWaitingForCpuTime(GCEvent event) {
```

### FieldMayBeFinal
Field `sentenceToAssembleStack` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractPreUnifiedGCLogParser.java`
#### Snippet
```java

    private LinkedList<List<GCLogToken>> sentenceToParseQueue = new LinkedList<>();
    private LinkedList<List<GCLogToken>> sentenceToAssembleStack = new LinkedList<>();

    private final static String[] FULL_LINE_PREFIXES = Arrays.stream(new String[]{
```

### FieldMayBeFinal
Field `router` may be 'final'
in `backend/worker/src/main/java/org/eclipse/jifa/worker/route/RouteFiller.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(RouteFiller.class);

    private Router router;

    public RouteFiller(Router router) {
```

### FieldMayBeFinal
Field `tag` may be 'final'
in `backend/common/src/main/java/org/eclipse/jifa/common/enums/FileType.java`
#### Snippet
```java
    ;

    private String tag;

    FileType(String tag) {
```

### FieldMayBeFinal
Field `ROUTES` may be 'final'
in `backend/worker/src/main/java/org/eclipse/jifa/worker/route/gclog/GCLogBaseRoute.java`
#### Snippet
```java
@MappingPrefix("/gc-log/:file")
public class GCLogBaseRoute extends BaseRoute {
    private static List<Class<? extends GCLogBaseRoute>> ROUTES = new ArrayList<>();

    static {
```

### FieldMayBeFinal
Field `model` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/EventAbnormalDetector.java`
#### Snippet
```java
    private static List<Method> eventDiagnoseRules = new ArrayList<>();

    private GCModel model;
    private AnalysisConfig config;
    private GlobalDiagnoseInfo globalDiagnoseInfo;
```

### FieldMayBeFinal
Field `globalDiagnoseInfo` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/EventAbnormalDetector.java`
#### Snippet
```java
    private GCModel model;
    private AnalysisConfig config;
    private GlobalDiagnoseInfo globalDiagnoseInfo;

    public EventAbnormalDetector(GCModel model, AnalysisConfig config, GlobalDiagnoseInfo globalDiagnoseInfo) {
```

### FieldMayBeFinal
Field `config` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/EventAbnormalDetector.java`
#### Snippet
```java

    private GCModel model;
    private AnalysisConfig config;
    private GlobalDiagnoseInfo globalDiagnoseInfo;

```

### FieldMayBeFinal
Field `eventDiagnoseRules` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/EventAbnormalDetector.java`
#### Snippet
```java
// be found in the next step in EventSuggestionGenerator.
public class EventAbnormalDetector {
    private static List<Method> eventDiagnoseRules = new ArrayList<>();

    private GCModel model;
```

### FieldMayBeFinal
Field `ab` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/DefaultSuggestionGenerator.java`
#### Snippet
```java
// This class generates common suggestions when we can not find the exact cause of problem.
public class DefaultSuggestionGenerator extends SuggestionGenerator {
    private AbnormalPoint ab;

    public DefaultSuggestionGenerator(GCModel model, AbnormalPoint ab) {
```

### FieldMayBeFinal
Field `rules` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/DefaultSuggestionGenerator.java`
#### Snippet
```java
    }

    private static Map<AbnormalType, Method> rules = new HashMap<>();

    static {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/AbnormalType.java`
#### Snippet
```java


    private String name;
    private int ordinal;

```

### FieldMayBeFinal
Field `name2Type` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/AbnormalType.java`
#### Snippet
```java
public class AbnormalType {
    public static String I18N_PREFIX = "jifa.gclog.diagnose.abnormal.";
    private static Map<String, AbnormalType> name2Type = new HashMap<>();

    // Types below can be used in either gc detail diagnose and global diagnose.
```

### FieldMayBeFinal
Field `ordinal` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/AbnormalType.java`
#### Snippet
```java

    private String name;
    private int ordinal;

    private AbnormalType(String name) {
```

### FieldMayBeFinal
Field `model` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/GlobalDiagnoseInfo.java`
#### Snippet
```java

public class GlobalDiagnoseInfo {
    private GCModel model;
    private AnalysisConfig config; // time range in this config is ignored
    private EventDiagnoseInfo[] eventDiagnoseInfos;
```

### FieldMayBeFinal
Field `eventDiagnoseInfos` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/GlobalDiagnoseInfo.java`
#### Snippet
```java
    private GCModel model;
    private AnalysisConfig config; // time range in this config is ignored
    private EventDiagnoseInfo[] eventDiagnoseInfos;

    public GlobalDiagnoseInfo(GCModel model, AnalysisConfig config) {
```

### FieldMayBeFinal
Field `config` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/GlobalDiagnoseInfo.java`
#### Snippet
```java
public class GlobalDiagnoseInfo {
    private GCModel model;
    private AnalysisConfig config; // time range in this config is ignored
    private EventDiagnoseInfo[] eventDiagnoseInfos;

```

### FieldMayBeFinal
Field `gson` may be 'final'
in `backend/common/src/main/java/org/eclipse/jifa/common/util/AccessorBasedTypeAdaptor.java`
#### Snippet
```java

public class AccessorBasedTypeAdaptor<T> extends TypeAdapter<T> {
    private Gson gson;

    public AccessorBasedTypeAdaptor(Gson gson) {
```

### FieldMayBeFinal
Field `MIN_TIMEOUT_THRESHOLD` may be 'final'
in `backend/master/src/main/java/org/eclipse/jifa/master/task/RetiringTask.java`
#### Snippet
```java

public class RetiringTask extends BaseTask {
    private static long MIN_TIMEOUT_THRESHOLD = 5 * 6000L;

    private static long timeoutThreshold;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/modeInfo/GCLogStyle.java`
#### Snippet
```java
    UNKNOWN("unknown");

    private String name;

    GCLogStyle(String name) {
```

### FieldMayBeFinal
Field `ROUTES` may be 'final'
in `backend/worker/src/main/java/org/eclipse/jifa/worker/route/threaddump/ThreadDumpBaseRoute.java`
#### Snippet
```java
public class ThreadDumpBaseRoute extends BaseRoute {

    private static List<Class<? extends ThreadDumpBaseRoute>> ROUTES = new ArrayList<>();

    static {
```

### FieldMayBeFinal
Field `allEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/G1GCModel.java`
#### Snippet
```java
    }

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
```

### FieldMayBeFinal
Field `parentEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/G1GCModel.java`
#### Snippet
```java
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, G1_MIXED_GC, FULL_GC, G1_CONCURRENT_CYCLE,
            G1_CONCURRENT_MARK, G1_REMARK, G1_CONCURRENT_REBUILD_REMEMBERED_SETS, G1_PAUSE_CLEANUP, G1_CONCURRENT_UNDO_CYCLE);
```

### FieldMayBeFinal
Field `AREAS_COUNTED_BY_REGION` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/G1GCModel.java`
#### Snippet
```java
    }

    private static List<MemoryArea> AREAS_COUNTED_BY_REGION = List.of(EDEN, SURVIVOR, OLD, HUMONGOUS, ARCHIVE);

    private void inferHeapRegionSize() {
```

### FieldMayBeFinal
Field `pauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/G1GCModel.java`
#### Snippet
```java

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
```

### FieldMayBeFinal
Field `importantEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/G1GCModel.java`
#### Snippet
```java
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, G1_MIXED_GC, FULL_GC, G1_CONCURRENT_CYCLE,
            G1_CONCURRENT_MARK, G1_REMARK, G1_CONCURRENT_REBUILD_REMEMBERED_SETS, G1_PAUSE_CLEANUP, G1_CONCURRENT_UNDO_CYCLE);

```

### FieldMayBeFinal
Field `mainPauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/G1GCModel.java`
#### Snippet
```java
    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, G1_MIXED_GC, FULL_GC, G1_CONCURRENT_CYCLE,
```

### FieldMayBeFinal
Field `collector` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/G1GCModel.java`
#### Snippet
```java
    private long heapRegionSize = UNKNOWN_INT;   // in b
    private boolean regionSizeExact = false;
    private static GCCollectorType collector = GCCollectorType.G1;

    public void setRegionSizeExact(boolean regionSizeExact) {
```

### FieldMayBeFinal
Field `mainPauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/SerialGCModel.java`
#### Snippet
```java
    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC);
```

### FieldMayBeFinal
Field `collector` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/SerialGCModel.java`
#### Snippet
```java
public class SerialGCModel extends GenerationalGCModel {

    private static GCCollectorType collector = GCCollectorType.SERIAL;

    public SerialGCModel() {
```

### FieldMayBeFinal
Field `importantEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/SerialGCModel.java`
#### Snippet
```java
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC);

    @Override
```

### FieldMayBeFinal
Field `parentEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/SerialGCModel.java`
#### Snippet
```java
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC);

```

### FieldMayBeFinal
Field `allEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/SerialGCModel.java`
#### Snippet
```java
    }

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
```

### FieldMayBeFinal
Field `pauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/SerialGCModel.java`
#### Snippet
```java

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
```

### FieldMayBeFinal
Field `name` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/SuggestionType.java`
#### Snippet
```java
    public static final String I18N_PREFIX = "jifa.gclog.diagnose.suggestion.";

    private String name;

    SuggestionType(String name) {
```

### FieldMayBeFinal
Field `options` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/modeInfo/VmOptions.java`
#### Snippet
```java

public class VmOptions {
    private Map<String, VmOption> options = new LinkedHashMap<>(); // use LinkedHashMap to preserve option order
    private String originalOptionString;
    private static Map<String, Integer> optionPriority = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `optionPriority` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/modeInfo/VmOptions.java`
#### Snippet
```java
    private Map<String, VmOption> options = new LinkedHashMap<>(); // use LinkedHashMap to preserve option order
    private String originalOptionString;
    private static Map<String, Integer> optionPriority = new ConcurrentHashMap<>();

    static {
```

### FieldMayBeFinal
Field `originalOptionString` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/modeInfo/VmOptions.java`
#### Snippet
```java
public class VmOptions {
    private Map<String, VmOption> options = new LinkedHashMap<>(); // use LinkedHashMap to preserve option order
    private String originalOptionString;
    private static Map<String, Integer> optionPriority = new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `file` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/GCLogAnalyzer.java`
#### Snippet
```java

    private static final Logger LOGGER = LoggerFactory.getLogger(GCLogAnalyzer.class);
    private File file;
    private ProgressListener listener;

```

### FieldMayBeFinal
Field `listener` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/GCLogAnalyzer.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(GCLogAnalyzer.class);
    private File file;
    private ProgressListener listener;

    private final int MAX_SINGLE_LINE_LENGTH = 2048; // max length in hotspot
```

### FieldMayBeFinal
Field `mainPauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/CMSGCModel.java`
#### Snippet
```java
    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC, CMS_CONCURRENT_MARK_SWEPT,
```

### FieldMayBeFinal
Field `allEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/CMSGCModel.java`
#### Snippet
```java
    }

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
```

### FieldMayBeFinal
Field `importantEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/CMSGCModel.java`
#### Snippet
```java
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC, CMS_CONCURRENT_MARK_SWEPT,
            CMS_INITIAL_MARK, CMS_CONCURRENT_ABORTABLE_PRECLEAN, CMS_FINAL_REMARK, CMS_CONCURRENT_SWEEP);

```

### FieldMayBeFinal
Field `pauseEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/CMSGCModel.java`
#### Snippet
```java

    private static List<GCEventType> allEventTypes = GCModel.calcAllEventTypes(collector);
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
```

### FieldMayBeFinal
Field `collector` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/CMSGCModel.java`
#### Snippet
```java

public class CMSGCModel extends GenerationalGCModel {
    private static GCCollectorType collector = GCCollectorType.CMS;

    public CMSGCModel() {
```

### FieldMayBeFinal
Field `parentEventTypes` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/CMSGCModel.java`
#### Snippet
```java
    private static List<GCEventType> pauseEventTypes = GCModel.calcPauseEventTypes(collector);
    private static List<GCEventType> mainPauseEventTypes = GCModel.calcMainPauseEventTypes(collector);
    private static List<GCEventType> parentEventTypes = GCModel.calcParentEventTypes(collector);
    private static List<GCEventType> importantEventTypes = List.of(YOUNG_GC, FULL_GC, CMS_CONCURRENT_MARK_SWEPT,
            CMS_INITIAL_MARK, CMS_CONCURRENT_ABORTABLE_PRECLEAN, CMS_FINAL_REMARK, CMS_CONCURRENT_SWEEP);
```

### FieldMayBeFinal
Field `model` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/GlobalDiagnoser.java`
#### Snippet
```java
 */
public class GlobalDiagnoser {
    private GCModel model;
    private AnalysisConfig config;

```

### FieldMayBeFinal
Field `mostSeriousProblemList` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/GlobalDiagnoser.java`
#### Snippet
```java

    private Key2ValueListMap<String, Double> allProblems = new Key2ValueListMap<>();
    private List<AbnormalPoint> mostSeriousProblemList = new ArrayList<>();
    private List<AbnormalPoint> mergedMostSeriousProblemList = new ArrayList<>();
    private AbnormalPoint mostSerious = AbnormalPoint.LEAST_SERIOUS;
```

### FieldMayBeFinal
Field `globalDiagnoseRules` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/GlobalDiagnoser.java`
#### Snippet
```java
    }

    private static List<Method> globalDiagnoseRules = new ArrayList<>();

    static {
```

### FieldMayBeFinal
Field `config` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/GlobalDiagnoser.java`
#### Snippet
```java
public class GlobalDiagnoser {
    private GCModel model;
    private AnalysisConfig config;

    private Key2ValueListMap<String, Double> allProblems = new Key2ValueListMap<>();
```

### FieldMayBeFinal
Field `allProblems` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/GlobalDiagnoser.java`
#### Snippet
```java
    private AnalysisConfig config;

    private Key2ValueListMap<String, Double> allProblems = new Key2ValueListMap<>();
    private List<AbnormalPoint> mostSeriousProblemList = new ArrayList<>();
    private List<AbnormalPoint> mergedMostSeriousProblemList = new ArrayList<>();
```

### FieldMayBeFinal
Field `mergedMostSeriousProblemList` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/GlobalDiagnoser.java`
#### Snippet
```java
    private Key2ValueListMap<String, Double> allProblems = new Key2ValueListMap<>();
    private List<AbnormalPoint> mostSeriousProblemList = new ArrayList<>();
    private List<AbnormalPoint> mergedMostSeriousProblemList = new ArrayList<>();
    private AbnormalPoint mostSerious = AbnormalPoint.LEAST_SERIOUS;

```

### FieldMayBeFinal
Field `ooms` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCModel.java`
#### Snippet
```java

    private List<Safepoint> safepoints = new ArrayList<>();
    private List<ThreadEvent> ooms = new ArrayList<>();
    // time from beginning of program
    private double startTime = Constant.UNKNOWN_DOUBLE;
```

### FieldMayBeFinal
Field `safepoints` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCModel.java`
#### Snippet
```java
    private List<GCEvent> gcCollectionEvents = new ArrayList<>(); // store events that contain collection info

    private List<Safepoint> safepoints = new ArrayList<>();
    private List<ThreadEvent> ooms = new ArrayList<>();
    // time from beginning of program
```

### FieldMayBeFinal
Field `gcCollectionEvents` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCModel.java`
#### Snippet
```java
    private List<GCEvent> gcEvents = new ArrayList<>(); // store parent events only
    private List<GCEvent> allEvents = new ArrayList<>(); // store all events, order by their appearance in log
    private List<GCEvent> gcCollectionEvents = new ArrayList<>(); // store events that contain collection info

    private List<Safepoint> safepoints = new ArrayList<>();
```

### FieldMayBeFinal
Field `globalDiagnoseInfoCache` may be 'final'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/GCModel.java`
#### Snippet
```java
    private GCLogMetadata metadata;

    private ConcurrentLRUCache<AnalysisConfig, GlobalDiagnoseInfo> globalDiagnoseInfoCache = new ConcurrentLRUCache<>(3);
    private boolean metaspaceCapacityReliable = false;

```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `errors` are updated, but never queried
in `backend/thread-dump-analyzer/src/main/java/org/eclipse/jifa/tda/parser/JStackParser.java`
#### Snippet
```java
        private final AtomicInteger processing;

        private final List<Throwable> errors;

        private final Snapshot snapshot;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `progress` is redundant
in `backend/worker/src/main/java/org/eclipse/jifa/worker/support/Analyzer.java`
#### Snippet
```java

        if (progressListener == null) {
            org.eclipse.jifa.common.vo.Progress progress = buildProgressIfFinished(fileType, fileName);
            return progress;
        } else {
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/diagnoser/AnalysisConfig.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        AnalysisConfig config = (AnalysisConfig) o;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `backend/thread-dump-analyzer/src/main/java/org/eclipse/jifa/tda/ThreadDumpAnalyzer.java`
#### Snippet
```java
                List<VMonitor> vMonitors = new ArrayList<>();
                for (Monitor monitor : frame.getMonitors()) {
                    String clazz = null;
                    RawMonitor rm = monitor.getRawMonitor();
                    clazz = rm.getClazz();
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `line` is always 'null'
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/parser/AbstractGCLogParser.java`
#### Snippet
```java
            endParsing();
        } catch (Exception e) {
            LOGGER.debug("fail to parse \"{}\", {}", line, e.getMessage());
        }

```

### ConstantValue
Condition `type == G1_MIXED_GC` is always `true`
in `backend/gc-log-analyzer/src/main/java/org/eclipse/jifa/gclog/model/G1GCModel.java`
#### Snippet
```java
                        lastGCInCycle = null;
                        lastConcCycleEndTime = Double.MAX_VALUE;
                    } else if (type == G1_MIXED_GC) {
                        lastGCInCycle = event;
                    }
```

### ConstantValue
Condition `count >= 2` is always `true`
in `backend/thread-dump-analyzer/src/main/java/org/eclipse/jifa/tda/parser/JStackParser.java`
#### Snippet
```java
        int count = Math.max(2, Runtime.getRuntime().availableProcessors());
        ES = Executors.newFixedThreadPool(count);
        assert count >= 2;

        for (int i = 0; i < count; i++) {
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'doOnTerminate(io.reactivex.functions.Action)' is marked unstable with @Experimental
in `backend/master/src/main/java/org/eclipse/jifa/master/service/impl/WorkerServiceImpl.java`
#### Snippet
```java
    public void selectMostIdleWorker(Handler<AsyncResult<Worker>> handler) {
        dbClient.rxGetConnection()
                .flatMap(conn -> pivot.selectMostIdleWorker(conn).doOnTerminate(conn::close))
                .subscribe(SingleHelper.toObserver(handler));
    }
```

### UnstableApiUsage
'doOnTerminate(io.reactivex.functions.Action)' is marked unstable with @Experimental
in `backend/master/src/main/java/org/eclipse/jifa/master/service/impl/Pivot.java`
#### Snippet
```java
    public Single<Boolean> isDBConnectivity() {
        return dbClient.rxGetConnection()
            .flatMap(conn -> selectTrue(conn).doOnTerminate(
                () -> {
                    LOGGER.info("Close connection for DB connectivity test");
```

### UnstableApiUsage
'doOnTerminate(io.reactivex.functions.Action)' is marked unstable with @Experimental
in `backend/master/src/main/java/org/eclipse/jifa/master/service/impl/Pivot.java`
#### Snippet
```java
    Completable transferDone(String name, FileTransferState transferState, long size) {
        return dbClient.rxGetConnection()
                       .flatMap(conn -> selectActiveJob(conn, JobType.FILE_TRANSFER, name).doOnTerminate(conn::close))
                       .flatMapCompletable(
                           job -> finish(job, conn -> updateFileTransferResult(conn, job, name, transferState, size))
```

