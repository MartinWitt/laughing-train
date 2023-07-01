# gctoolkit 
 
# Bad smells
I found 264 bad smells with 16 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldCanBeLocal | 37 | false |
| RegExpRedundantEscape | 29 | false |
| JavadocDeclaration | 28 | false |
| FieldMayBeFinal | 27 | false |
| UnusedAssignment | 14 | false |
| DanglingJavadoc | 10 | false |
| ClassEscapesItsScope | 10 | false |
| RegExpSingleCharAlternation | 10 | false |
| RedundantMethodOverride | 9 | false |
| CommentedOutCode | 6 | false |
| InnerClassMayBeStatic | 6 | true |
| AccessStaticViaInstance | 6 | false |
| ConstantValue | 6 | false |
| OverwrittenKey | 6 | false |
| DataFlowIssue | 5 | false |
| AutoCloseableResource | 5 | false |
| UNUSED_IMPORT | 4 | false |
| MismatchedCollectionQueryUpdate | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| SimplifyStreamApiCallChains | 3 | false |
| EmptyStatementBody | 3 | false |
| UnnecessaryReturn | 3 | true |
| UnnecessaryToStringCall | 3 | true |
| IgnoreResultOfCall | 3 | false |
| RedundantOperationOnEmptyContainer | 2 | false |
| MismatchedArrayReadWrite | 2 | false |
| UnnecessarySemicolon | 2 | false |
| CatchMayIgnoreException | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| NonFinalFieldInEnum | 1 | false |
| DuplicatedCode | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| ExplicitArrayFilling | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| RedundantStringFormatCall | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
| SuspiciousIndentAfterControlStatement | 1 | false |
## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Array `empty` is always empty
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingGCLogFile.java`
#### Snippet
```java
                case 0:
                    String[] empty = new String[0];
                    return Arrays.stream(empty);
                case 1:
                    return segments.getFirst().stream();
```

### RedundantOperationOnEmptyContainer
Collection `new ArrayList`() is always empty
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileZipSegment.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return new ArrayList<String>().stream();
    }

```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `empty` are read, but never written to
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingGCLogFile.java`
#### Snippet
```java
            switch (segments.size()) {
                case 0:
                    String[] empty = new String[0];
                    return Arrays.stream(empty);
                case 1:
```

### MismatchedArrayReadWrite
Contents of array `promotionFailureSizesForwardReference` are written to, but never read
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    private ReferenceGCSummary referenceGCForwardReference;
    private CPUSummary scavengeCPUSummaryForwardReference;
    private int[] promotionFailureSizesForwardReference;

    private long totalFreeSpaceForwardReference;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
        fillOutMemoryPoolData(youngCollection, forwardReference);
        fillOutMetaspaceData(youngCollection, forwardReference);
        youngCollection.add(forwardReference.getCPUSummary());
        // add in reference processing
        return youngCollection;
```

### DataFlowIssue
Method invocation `isDirectory` may produce `NullPointerException`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/SafepointLogFile.java`
#### Snippet
```java
        do {
            entry = zipStream.getNextEntry();
        } while (entry.isDirectory());
        return new BufferedReader(new InputStreamReader(new BufferedInputStream(zipStream))).lines();
    }
```

### DataFlowIssue
Method invocation `isPlainText` will produce `NullPointerException`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/SafepointLogFile.java`
#### Snippet
```java

    public Stream<String> stream() throws IOException {
        if (metadata.isPlainText()) {
            return Files.lines(path);
        } else if (metadata.isZip()) {
```

### DataFlowIssue
Method invocation `isZip` will produce `NullPointerException`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/SafepointLogFile.java`
#### Snippet
```java
        if (metadata.isPlainText()) {
            return Files.lines(path);
        } else if (metadata.isZip()) {
            return streamZipFile();
        } else if (metadata.isGZip()) {
```

### DataFlowIssue
Method invocation `isGZip` will produce `NullPointerException`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/SafepointLogFile.java`
#### Snippet
```java
        } else if (metadata.isZip()) {
            return streamZipFile();
        } else if (metadata.isGZip()) {
            return streamGZipFile();
        }
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `api/src/main/java/com/microsoft/gctoolkit/event/shenandoah/ShenandoahCycle.java`
#### Snippet
```java
        Pause_Final_Mark, Concurrent_cleanup,
        Concurrent_evacuation, Pause_Init_Update_Refs,
        Concurrent_update_references, Pause_Final_Update_Refs;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
        OLD,
        HUMONGOUS,
        ARCHIVE;
    }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'List.of().stream()' can be replaced with 'Stream.of()'
in `api/src/main/java/com/microsoft/gctoolkit/io/SingleLogFileMetadata.java`
#### Snippet
```java

    public Stream<LogFileSegment> logFiles() {
        return List.of(logFile).stream();
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
        concurrentPhaseActive = false;
        publish(cycle);
        eventQueue.stream().forEach(this::publish);
        eventQueue.clear();
    }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
            publish(event);
            concurrentPhaseActive = false;
            eventQueue.stream().forEach(this::publish);
            eventQueue.clear();
        } else {
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
                timeStamp = getClock();
                safePointReason = ApplicationStoppedTime.VMOperations.valueOf(trace.getGroup(1));
            } else if ((trace = LEAVING_SAFEPOINT.parse(line)) != null) {
            } //noop this one.

```

### EmptyStatementBody
`if` statement has empty body
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedSurvivorMemoryPoolParser.java`
#### Snippet
```java
        if ((trace = DESIRED_SURVIVOR_SIZE.parse(entry)) != null) {
            forwardReference = new SurvivorRecord(new Decorators(entry).getDateTimeStamp(), trace.getLongGroup(1), trace.getIntegerGroup(2), trace.getIntegerGroup(3));
        } else if ((trace = AGE_TABLE_HEADER.parse(entry)) != null) {
            //we've collected this data so.. eat it...
        } else if ((trace = AGE_RECORD.parse(entry)) != null) {
```

### EmptyStatementBody
`if` statement has empty body
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
        if (line.startsWith("from space")) return true;
        if (line.startsWith("to   space")) return true;
        if (line.contains("[0xffff") && line.endsWith("000)")) ;

        if (line.startsWith("Finished ")) return true;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (68 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ParNewSerial.java`
#### Snippet
```java
//    public static final Pattern PARNEW_SERIAL_FULL_SPLIT = Pattern.compile( "^: " + BEFORE_AFTER_CONFIGURED_PAUSE + "\\]" + TENURED_BLOCK + " " + BEFORE_AFTER_CONFIGURED + ", " + PERM_RECORD + ", " + PAUSE_TIME);

/*

    public static final Pattern PAR_OLD_REDUCTION = Pattern.compile("\\[ParOldGen: " + FROM_TO_CONFIGURED + "\\]");
```

### CommentedOutCode
Commented out code (8 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    /*
    private static final int METASPACE_OCCUPANCY_BEFORE_COLLECTION = 24;
    private static final int METASPACE_OCCUPANCY_AFTER_COLLECTION = 25;
```

### CommentedOutCode
Commented out code (7 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    //Ignore these log messages for now.
    private void heapSummary(GCLogTrace trace, String line) {
//        if ( before) {
//            forwardReference.setHeapOccupancyBeforeCollection(trace.getLongGroup(2));
//            forwardReference.setHeapSizeBeforeCollection(trace.getLongGroup(1));
```

### CommentedOutCode
Commented out code (12 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    //ignore this logging for now
    private void youngRegionAllotment(GCLogTrace trace, String line) {
//        if (before) {
//            forwardReference.setYoungOccupancyBeforeCollection(trace.getLongGroup(3));
//            forwardReference.setSurvivorOccupancyBeforeCollection(trace.getLongGroup(5));
```

### CommentedOutCode
Commented out code (2 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java

    //46.435: [GC 46.435: [ParNew: 19136K->19136K(19136K), 0.0000274 secs]46.435: [CMS46.458: [CMS-concurrent-sweep: 0.060/0.117 secs] [Times: user=0.21 sys=0.01, real=0.12 secs]
    //public static final ParseRule PARNEW_CONCURRENT_MODE_END = new ParseRule (GC_PREFIX + PARNEW_BLOCK + TIMESTAMP + "\\[CMS" + CMS_PHASE_END + "(?: " + CPU_BREAKDOWN + ")?$");
    //public static final String CMS_PHASE_END = DATE_TIMESTAMP + "\\[CMS-concurrent-(.+): " + CPU_WALLCLOCK + "\\]";
    public void parNewConcurrentModeEnd(GCLogTrace trace, String line) {
```

### CommentedOutCode
Commented out code (4 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    /*
    private MemoryPoolSummary extractPermspaceRecord(GCLogTrace trace) {
        int index = (trace.getGroup(2) == null) ? 2 : 4;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\+` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    // Pre-unified tokens
    private static final String TIMESTAMP = "(" + TIME + "): ";
    private static final String DATE_STAMP = "(" + DATE + "): ";
    private static final String DATE_TIMESTAMP = "^(?:" + DATE_STAMP + ")?" + TIMESTAMP;

```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final String DECIMAL_POINT = "(?:\\.|,)";
    private static final String INTEGER = "\\d+";
    private static final String DATE = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[\\+|\\-]\\d{4}";
    private static final String TIME = INTEGER + DECIMAL_POINT + "\\d{3}";

```

### RegExpRedundantEscape
Redundant character escape `\+` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final Pattern PREUNIFIED_DATE_TIMESTAMP = Pattern.compile(DATE_TIMESTAMP);
    // JEP 158 has ISO-8601 time and uptime in seconds and milliseconds as the first two decorators.
    private static final Pattern UNIFIED_DATE_TIMESTAMP = Pattern.compile("^(" + DATE_TAG + ")?(" + UPTIME_TAG + ")?");
    private static final DateTimeStamp EMPTY_DATE = new DateTimeStamp(TIMESTAMP_NOT_SET);

```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final Pattern PREUNIFIED_DATE_TIMESTAMP = Pattern.compile(DATE_TIMESTAMP);
    // JEP 158 has ISO-8601 time and uptime in seconds and milliseconds as the first two decorators.
    private static final Pattern UNIFIED_DATE_TIMESTAMP = Pattern.compile("^(" + DATE_TAG + ")?(" + UPTIME_TAG + ")?");
    private static final DateTimeStamp EMPTY_DATE = new DateTimeStamp(TIMESTAMP_NOT_SET);

```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final Pattern PREUNIFIED_DATE_TIMESTAMP = Pattern.compile(DATE_TIMESTAMP);
    // JEP 158 has ISO-8601 time and uptime in seconds and milliseconds as the first two decorators.
    private static final Pattern UNIFIED_DATE_TIMESTAMP = Pattern.compile("^(" + DATE_TAG + ")?(" + UPTIME_TAG + ")?");
    private static final DateTimeStamp EMPTY_DATE = new DateTimeStamp(TIMESTAMP_NOT_SET);

```

### RegExpRedundantEscape
Redundant character escape `\+` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final String TIMESTAMP = "(" + TIME + "): ";
    private static final String DATE_STAMP = "(" + DATE + "): ";
    private static final String DATE_TIMESTAMP = "^(?:" + DATE_STAMP + ")?" + TIMESTAMP;

    //  2017-09-07T09:00:12.795+0200: 0.716:
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    // Unified Tokens
    private static final String DATE_TAG = "\\[" + DATE + "\\]";
    private static final String UPTIME_TAG = "\\[(" + TIME + ")s\\]";

    // Pre-unified tokens
```

### RegExpRedundantEscape
Redundant character escape `\+` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java

    // Unified Tokens
    private static final String DATE_TAG = "\\[" + DATE + "\\]";
    private static final String UPTIME_TAG = "\\[(" + TIME + ")s\\]";

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java

    // Unified Tokens
    private static final String DATE_TAG = "\\[" + DATE + "\\]";
    private static final String UPTIME_TAG = "\\[(" + TIME + ")s\\]";

```

### RegExpRedundantEscape
Redundant character escape `\+` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
    Pattern TAGS = Pattern.compile(".*(?<=^|\\])\\[([a-z0-9,. ]+)\\]");

    String UNIFIED_META_RECORD = "Metaspace: " + BEFORE_AFTER_CONFIGURED;
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
    Pattern TAGS = Pattern.compile(".*(?<=^|\\])\\[([a-z0-9,. ]+)\\]");

    String UNIFIED_META_RECORD = "Metaspace: " + BEFORE_AFTER_CONFIGURED;
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String TIME_NANOS = "\\[\\d+ns\\]";
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java

    String DATE_STAMP = "\\[" + DATE + "\\]";
    String UPTIME = "\\[" + INTEGER + DECIMAL_POINT + "\\d{3}s\\]";
    String TIME_MILLIS = "\\[\\d+ms\\]";
    String TIME_NANOS = "\\[\\d+ns\\]";
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String UPTIME = "\\[" + INTEGER + DECIMAL_POINT + "\\d{3}s\\]";
    String TIME_MILLIS = "\\[\\d+ms\\]";
    String TIME_NANOS = "\\[\\d+ns\\]";
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String DATE_STAMP = "\\[" + DATE + "\\]";
    String UPTIME = "\\[" + INTEGER + DECIMAL_POINT + "\\d{3}s\\]";
    String TIME_MILLIS = "\\[\\d+ms\\]";
    String TIME_NANOS = "\\[\\d+ns\\]";
    String PID_TID = "\\[\\d+\\]";
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String TIME_MILLIS = "\\[\\d+ms\\]";
    String TIME_NANOS = "\\[\\d+ns\\]";
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
```

### RegExpRedundantEscape
Redundant character escape `\+` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
     */

    String DATE_STAMP = "\\[" + DATE + "\\]";
    String UPTIME = "\\[" + INTEGER + DECIMAL_POINT + "\\d{3}s\\]";
    String TIME_MILLIS = "\\[\\d+ms\\]";
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
     */

    String DATE_STAMP = "\\[" + DATE + "\\]";
    String UPTIME = "\\[" + INTEGER + DECIMAL_POINT + "\\d{3}s\\]";
    String TIME_MILLIS = "\\[\\d+ms\\]";
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFile.java`
#### Snippet
```java
    // e.g., [0.011s][info ][gc            ] Using G1
    // But have to watch out for things like [ParNew...
    private static final Pattern LINE_STARTS_WITH_DECORATOR = Pattern.compile("^\\[\\d.+?\\]");
    private static final int SHOULD_HAVE_SEEN_A_UNIFIED_DECORATOR_BY_THIS_LINE_IN_THE_LOG = 25;

```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `channel` in enum 'EventSource'
in `api/src/main/java/com/microsoft/gctoolkit/aggregator/EventSource.java`
#### Snippet
```java
    JVM(JVM_EVENT_PARSER_OUTBOX);

    ChannelName channel;

    EventSource(ChannelName channel) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ShenandoahParser.java`
#### Snippet
```java
        if (ignoreFrequentButUnwantedEntries(line)) return;

        try {
            Optional<AbstractMap.SimpleEntry<GCParseRule, GCLogTrace>> optional = parseRules.keys()
                    .stream()
                    .map(rule -> new AbstractMap.SimpleEntry<>(rule, rule.parse(line)))
                    .filter(tuple -> tuple.getValue() != null)
                    .findFirst();
            if ( optional.isPresent()) {
                AbstractMap.SimpleEntry<GCParseRule, GCLogTrace> ruleAndTrace = optional.get();
                parseRules.get(ruleAndTrace.getKey()).accept(ruleAndTrace.getValue(), line);
                return;
            }
        } catch (Throwable t) {
            LOGGER.throwing(this.getName(), "process", t);
        }

        log(line);
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/GarbageCollectorFlag.java`
#### Snippet
```java
        try {
            return Enum.valueOf(GarbageCollectorFlag.class, string.trim());
        } catch (IllegalArgumentException ex) {
        }
        return null;
```

### CatchMayIgnoreException
Empty `catch` block
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/CommandLineFlag.java`
#### Snippet
```java
        try {
            return Enum.valueOf(CommandLineFlag.class, string.trim());
        } catch (IllegalArgumentException ex) {
        }
        return null;
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
        LinkedList<LogFileSegment> orderedList = new LinkedList<>();
        List<LogFileSegment> workingList = new ArrayList<>();
        workingList.addAll(segments);

        // Find current
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `api/src/main/java/com/microsoft/gctoolkit/GCToolKit.java`
#### Snippet
```java
        } else{
            dataSourceParsers = new ArrayList<>();
            dataSourceParsers.addAll(registeredDataSourceParsers);
        }

```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/UnifiedDiarizer.java`
#### Snippet
```java
            getDiary().setTrue(DEFNEW, SERIAL, GC_CAUSE);
            getDiary().setFalse(PARALLELGC, PARALLELOLDGC, PARNEW, CMS, ICMS, CMS_DEBUG_LEVEL_1, G1GC, ZGC, SHENANDOAH, PRE_JDK70_40, JDK70, JDK80, RSET_STATS);
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     */
    private void ignore(GCLogTrace trace, String line) {
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
     */
    private void ignore(GCLogTrace trace, String line) {
        return;
    }

```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `api/src/main/java/com/microsoft/gctoolkit/event/jvm/SurvivorRecord.java`
#### Snippet
```java

    private void setCalculatedThreshold(int calculatedTenuringThresholdFromLog) {
        if (calculatedTenuringThresholdFromLog <= THEORETICAL_MAX_TENURING_THRESHOLD) {
            this.calculatedTenuringThreshold = calculatedTenuringThresholdFromLog;
        } else {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `api/src/main/java/com/microsoft/gctoolkit/event/jvm/SurvivorRecord.java`
#### Snippet
```java

    private void setMaxTenuringThreshold(int maxTenuringThresholdFromLog) {
        if (maxTenuringThresholdFromLog <= THEORETICAL_MAX_TENURING_THRESHOLD) {
            this.maxTenuringThreshold = maxTenuringThresholdFromLog;
        } else {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
            publish(new ConcurrentReset(startOfPhase, duration, cpuTime, wallTime));
        else
            LOG.warning("concurrent phase choked on " + trace.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `api/src/main/java/com/microsoft/gctoolkit/event/jvm/JVMEvent.java`
#### Snippet
```java
        StringBuilder string = new StringBuilder(getClass().getSimpleName()).append("@");
        if (timeStamp != null)
            string.append(timeStamp.toString());
        else
            string.append("unknown");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    G1GCPauseEvent buildEvent() throws MalformedEvent {
        if (gcType == null ) {
            throw new MalformedEvent("G1GC Event type is undefined (null): " + this.toString());
        }
        switch (this.gcType) {
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ERGO` may be 'static'
in `api/src/main/java/com/microsoft/gctoolkit/event/shenandoah/ShenandoahCycle.java`
#### Snippet
```java
    }

    class ERGO {

        private final int free;
```

### InnerClassMayBeStatic
Inner class `Phase` may be 'static'
in `api/src/main/java/com/microsoft/gctoolkit/event/shenandoah/ShenandoahCycle.java`
#### Snippet
```java


    class Phase {

        Phases phase;
```

### InnerClassMayBeStatic
Inner class `ZGCForwardReference` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ZGCParser.java`
#### Snippet
```java
    }

    private class ZGCForwardReference {
        private final DateTimeStamp startTimeStamp;
        private final GCCause gcCause;
```

### InnerClassMayBeStatic
Inner class `ShenandoahForwardReference` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ShenandoahParser.java`
#### Snippet
```java
    private ShenandoahForwardReference forwardReference;

    private class ShenandoahForwardReference {

        JVMEvent toShenandoahCycle() {
```

### InnerClassMayBeStatic
Inner class `RegionsSummary` may be 'static'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
    }

    class RegionsSummary {

        private int youngRegionsStatistics;
```

### InnerClassMayBeStatic
Inner class `ConcurrentRefinementStatistics` may be 'static'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
     */

    class ConcurrentRefinementStatistics {
        private int cardsProcessed;
        private int completedBuffers;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java

    public void analyze(String gcLogFile) throws IOException {
        /**
         * GC log files can come in  one of two types: single or series of rolling logs.
         * In this sample, we load a single log file.
```

### DanglingJavadoc
Dangling Javadoc comment
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java
        GCToolKit gcToolKit = new GCToolKit();

        /**
         * This call will load all implementations of Aggregator that have been declared in module-info.java.
         * This mechanism makes use of Module SPI.
```

### DanglingJavadoc
Dangling Javadoc comment
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java
        gcToolKit.loadAggregationsFromServiceLoader();

        /**
         * The JavaVirtualMachine contains the aggregations as filled out by the Aggregators.
         * It also contains configuration information about how the JVM was configured for the runtime.
```

### DanglingJavadoc
Dangling Javadoc comment
in `api/src/main/java/com/microsoft/gctoolkit/aggregator/Aggregates.java`
#### Snippet
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
/**
 * This annotation is used by implementations of Aggregator to indicate
 * the source of the events being aggregated.
```

### DanglingJavadoc
Dangling Javadoc comment
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java

    private void references(GCLogTrace trace, String line) {
        /**
         * todo: capture preclean phases
         * Not recording preclean phases for the moment. If the preclean capture groups is not null, then
```

### DanglingJavadoc
Dangling Javadoc comment
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    }

    /***********************************/
    /* Reference processing            */
    /***********************************/
```

### DanglingJavadoc
Dangling Javadoc comment
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    }

    /***********************************/
    /* Adaptive Sizing                 */

```

### DanglingJavadoc
Dangling Javadoc comment
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    }

    /***********************************/
    /* Heap Summary                    */

```

### DanglingJavadoc
Dangling Javadoc comment
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    }

    /***********************************/
    /* Pre 170_40 rules                */
    /* Very old and should not be used */
```

### DanglingJavadoc
Dangling Javadoc comment
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    }

    /*************************/
    /* Support Methods       */

```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'LinkedList.remove()'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/collection/MRUQueue.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public V get(Object key) {
        keys.remove(key);
        if (key != null) {
            keys.offerFirst((K)key); // unchecked cast
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/Decorators.java`
#### Snippet
```java

    /**
     * This class represents the decorators found in the log line as defined by JEP 158 (https://openjdk.java.net/jeps/158).
     * The list, taken from that document is as:
     * time -- Current time and date in ISO-8601 format
```

## RuleId[id=ExplicitArrayFilling]
### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `api/src/main/java/com/microsoft/gctoolkit/jvm/Diary.java`
#### Snippet
```java
    public Diary() {
        states = new TripleState[SupportedFlags.values().length];
        for (int i = 0; i < states.length; i++) states[i] = TripleState.UNKNOWN;
    }

```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
    }

    private double preCompactPhaseDuration = -1.0d;

    private void preCompact(GCLogTrace trace, String line) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int TIME_STAMP = 1;
    private final int VMOP = 2;
    private final int TOTAL_THREADS = 3;
    private final int INITIALLY_RUNNING_THREADS = 4;
    private final int WAITING_TO_BLOCK = 5;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int WAITING_TO_BLOCK = 5;
    private final int SPIN_TIME = 6;
    private final int BLOCK_TIME = 7;
    private final int SYNC_TIME = 8;
    private final int CLEANUP_TIME = 9;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    }

    private final int TIME_STAMP = 1;
    private final int VMOP = 2;
    private final int TOTAL_THREADS = 3;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int VMOP = 2;
    private final int TOTAL_THREADS = 3;
    private final int INITIALLY_RUNNING_THREADS = 4;
    private final int WAITING_TO_BLOCK = 5;
    private final int SPIN_TIME = 6;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int CLEANUP_TIME = 9;
    private final int VMOP_TIME = 10;
    private final int TRAP_COUNT = 11;

}
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int SPIN_TIME = 6;
    private final int BLOCK_TIME = 7;
    private final int SYNC_TIME = 8;
    private final int CLEANUP_TIME = 9;
    private final int VMOP_TIME = 10;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int TOTAL_THREADS = 3;
    private final int INITIALLY_RUNNING_THREADS = 4;
    private final int WAITING_TO_BLOCK = 5;
    private final int SPIN_TIME = 6;
    private final int BLOCK_TIME = 7;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int BLOCK_TIME = 7;
    private final int SYNC_TIME = 8;
    private final int CLEANUP_TIME = 9;
    private final int VMOP_TIME = 10;
    private final int TRAP_COUNT = 11;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int INITIALLY_RUNNING_THREADS = 4;
    private final int WAITING_TO_BLOCK = 5;
    private final int SPIN_TIME = 6;
    private final int BLOCK_TIME = 7;
    private final int SYNC_TIME = 8;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int SYNC_TIME = 8;
    private final int CLEANUP_TIME = 9;
    private final int VMOP_TIME = 10;
    private final int TRAP_COUNT = 11;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java

    private final int TIME_STAMP = 1;
    private final int VMOP = 2;
    private final int TOTAL_THREADS = 3;
    private final int INITIALLY_RUNNING_THREADS = 4;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `api/src/main/java/com/microsoft/gctoolkit/jvm/AbstractJavaVirtualMachine.java`
#### Snippet
```java
    private GCLogFile dataSource;
    private Diary diary;
    private DateTimeStamp estimatedStartTime;
    private DateTimeStamp timeOfLastEvent;
    private double logDuration = -1.0d;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private UnifiedCountSummary unifiedCountSummary = null;

    void setProcessedBuffersSummary(UnifiedCountSummary summary) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java

    private double finalizeMarkingDuration = -1.0d;
    private double systemDictionaryUnloadingDuration = -1.0d;

    void finalizeMarkingDuration(double duration) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java

    private int evacuationWorkersUsed = 0;
    private int evacuationWorkersAvailable = 0;

    void evacuationWorkers(int workersUsed, int available) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java

    private int stringTableProcessed = -1;
    private int stringTableRemoved = -1;

    void stringTableProcessedAndRemoved(int processed, int removed) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java

    private int symbolTableProcessed = -1;
    private int symbolTableRemoved = -1;

    void symbolTableProcessedAndRemoved(int processed, int removed) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private double finalizeMarkingDuration = -1.0d;
    private double systemDictionaryUnloadingDuration = -1.0d;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private int symbolTableProcessed = -1;
    private int symbolTableRemoved = -1;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private UnifiedCountSummary terminationAttempts = null;

    void setTerminationAttempts(UnifiedCountSummary summary) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private int evacuationWorkersUsed = 0;
    private int evacuationWorkersAvailable = 0;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private int stringTableProcessed = -1;
    private int stringTableRemoved = -1;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private double parallelUnloadingDuration = -1.0d;

    void parallelUnloadingDuration(double duration) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    // state variables
    private boolean before = false; //todo what happens if this gets out of sync. #IHateState
    private int gcInvocations = 0;
    private int fullGCInvocations = 0;
    private DateTimeStamp jvmTerminationEventTime = new DateTimeStamp(-1.0d);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    private boolean before = false; //todo what happens if this gets out of sync. #IHateState
    private int gcInvocations = 0;
    private int fullGCInvocations = 0;
    private DateTimeStamp jvmTerminationEventTime = new DateTimeStamp(-1.0d);

```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java

    //return to JVM
    private int regionSize = 0; //region size in Gigabytes

    public void heapRegionSize(GCLogTrace trace, String line) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    private long regionSize;
    @SuppressWarnings("unused")
    private long metaSpaceUsed, metaCapacity, metaCommitted, metaReserved;
    @SuppressWarnings("unused")
    private long classSpaceUsed, classSpaceCapacity, classSpaceCommitted, classSpaceReserved;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    private long regionSize;
    @SuppressWarnings("unused")
    private long metaSpaceUsed, metaCapacity, metaCommitted, metaReserved;
    @SuppressWarnings("unused")
    private long classSpaceUsed, classSpaceCapacity, classSpaceCommitted, classSpaceReserved;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    private long regionSize;
    @SuppressWarnings("unused")
    private long metaSpaceUsed, metaCapacity, metaCommitted, metaReserved;
    @SuppressWarnings("unused")
    private long classSpaceUsed, classSpaceCapacity, classSpaceCommitted, classSpaceReserved;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    private long metaSpaceUsed, metaCapacity, metaCommitted, metaReserved;
    @SuppressWarnings("unused")
    private long classSpaceUsed, classSpaceCapacity, classSpaceCommitted, classSpaceReserved;

    private final G1GCPauseEvent trap = new G1Trap();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    private long regionSize;
    @SuppressWarnings("unused")
    private long metaSpaceUsed, metaCapacity, metaCommitted, metaReserved;
    @SuppressWarnings("unused")
    private long classSpaceUsed, classSpaceCapacity, classSpaceCommitted, classSpaceReserved;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    private long metaSpaceUsed, metaCapacity, metaCommitted, metaReserved;
    @SuppressWarnings("unused")
    private long classSpaceUsed, classSpaceCapacity, classSpaceCommitted, classSpaceReserved;

    private final G1GCPauseEvent trap = new G1Trap();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    private long heapTotal, heapUsed;
    @SuppressWarnings("unused")
    private long regionSize;
    @SuppressWarnings("unused")
    private long metaSpaceUsed, metaCapacity, metaCommitted, metaReserved;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    private long metaSpaceUsed, metaCapacity, metaCommitted, metaReserved;
    @SuppressWarnings("unused")
    private long classSpaceUsed, classSpaceCapacity, classSpaceCommitted, classSpaceReserved;

    private final G1GCPauseEvent trap = new G1Trap();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    private long metaSpaceUsed, metaCapacity, metaCommitted, metaReserved;
    @SuppressWarnings("unused")
    private long classSpaceUsed, classSpaceCapacity, classSpaceCommitted, classSpaceReserved;

    private final G1GCPauseEvent trap = new G1Trap();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    private ReferenceGCSummary referenceGCForwardReference;
    private CPUSummary scavengeCPUSummaryForwardReference;
    private int[] promotionFailureSizesForwardReference;

    private long totalFreeSpaceForwardReference;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/VertxJVMEventChannel.java`
#### Snippet
```java
            latch.await();
        } catch (InterruptedException e) {
            Thread.interrupted();
            LOGGER.log(Level.SEVERE, "Vert.x: Latch.await interrupted: " + e.getLocalizedMessage(), e);
        }
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/VertxDataSourceChannel.java`
#### Snippet
```java
            latch.await();
        } catch (InterruptedException e) {
            Thread.interrupted();
        }
    }
```

### IgnoreResultOfCall
Result of `Stream.findFirst()` is ignored
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFile.java`
#### Snippet
```java
                    .map(diarizer::diarize)
                    .filter(completed -> completed)
                    .findFirst();
            this.diary = diarizer.getDiary();
        }
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'com.microsoft.gctoolkit.parser.UnifiedGCLogParser.GCID_COUNTER' accessed via instance reference
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
        if (pauseEvent == null) {
            if (diary.isPSOldGen())
                pauseEvent = new GenerationalForwardReference(PSFull, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
            else
                pauseEvent = new GenerationalForwardReference(FullGC, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
```

### AccessStaticViaInstance
Static member 'com.microsoft.gctoolkit.parser.UnifiedGCLogParser.GCID_COUNTER' accessed via instance reference
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
                pauseEvent = new GenerationalForwardReference(PSFull, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
            else
                pauseEvent = new GenerationalForwardReference(FullGC, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
            pauseEvent.setStartTime(getClock());
        } else if (pauseEvent.getGarbageCollectionType() == ParNew) {
```

### AccessStaticViaInstance
Static member 'com.microsoft.gctoolkit.parser.UnifiedGCLogParser.GCID_COUNTER' accessed via instance reference
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
        } else if (pauseEvent.getGarbageCollectionType() != ConcurrentModeFailure) {
            LOGGER.warning("Maybe Full Pause event not recorded: " + pauseEvent.getGcID()); //todo: difficult to know if this is a full or a CMF
            pauseEvent = new GenerationalForwardReference(FullGC, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
            pauseEvent.setStartTime(getClock());
        }
```

### AccessStaticViaInstance
Static member 'com.microsoft.gctoolkit.parser.UnifiedGCLogParser.GCID_COUNTER' accessed via instance reference
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
            LOGGER.warning("Young pause event not recorded: " + pauseEvent.getGcID());
        if (diary.isCMS())
            pauseEvent = new GenerationalForwardReference(ParNew, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
        else if (diary.isPSYoung())
            pauseEvent = new GenerationalForwardReference(PSYoungGen, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
```

### AccessStaticViaInstance
Static member 'com.microsoft.gctoolkit.parser.UnifiedGCLogParser.GCID_COUNTER' accessed via instance reference
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
            pauseEvent = new GenerationalForwardReference(ParNew, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
        else if (diary.isPSYoung())
            pauseEvent = new GenerationalForwardReference(PSYoungGen, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
        else if (diary.isSerialFull())
            pauseEvent = new GenerationalForwardReference(DefNew, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
```

### AccessStaticViaInstance
Static member 'com.microsoft.gctoolkit.parser.UnifiedGCLogParser.GCID_COUNTER' accessed via instance reference
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
            pauseEvent = new GenerationalForwardReference(PSYoungGen, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
        else if (diary.isSerialFull())
            pauseEvent = new GenerationalForwardReference(DefNew, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
        else {
            LOGGER.warning("Unrecognized collection phase -> " + line);
```

## RuleId[id=ClassEscapesItsScope]
### ClassEscapesItsScope
Class `XYDataSet` is not exported from module 'com.microsoft.gctoolkit.sample'
in `sample/src/main/java/com/microsoft/gctoolkit/sample/aggregation/HeapOccupancyAfterCollectionSummary.java`
#### Snippet
```java
    }

    public Map<GarbageCollectionTypes, XYDataSet> get() {
        return aggregations;
    }
```

### ClassEscapesItsScope
Class `XYDataSet` is not exported from module 'com.microsoft.gctoolkit.integration'
in `IT/src/main/java/com/microsoft/gctoolkit/integration/aggregation/HeapOccupancyAfterCollectionSummary.java`
#### Snippet
```java
    }

    public Map<GarbageCollectionTypes, XYDataSet> get() {
        return aggregations;
    }
```

### ClassEscapesItsScope
Class `RegionsSummary` is not exported from module 'com.microsoft.gctoolkit.api'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
    }

    public RegionsSummary getElementsByRegionCounts() {
        return elementsByRegionCounts;
    }
```

### ClassEscapesItsScope
Class `ConcurrentRefinementStatistics` is not exported from module 'com.microsoft.gctoolkit.api'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
    }

    public ConcurrentRefinementStatistics getConcurrentRefinementStatistics() {
        return this.concurrentRefinementStatistics;
    }
```

### ClassEscapesItsScope
Class `RegionsSummary` is not exported from module 'com.microsoft.gctoolkit.api'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
    }

    public void setElementsByRegionCounts(RegionsSummary elementsByRegionCounts) {
        this.elementsByRegionCounts = elementsByRegionCounts;
    }
```

### ClassEscapesItsScope
Class `ConcurrentRefinementStatistics` is not exported from module 'com.microsoft.gctoolkit.api'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
    }

    public void setConcurrentRefinementStatistics(ConcurrentRefinementStatistics statistics) {
        this.concurrentRefinementStatistics = statistics;
    }
```

### ClassEscapesItsScope
Class `RegionsSummary` is not exported from module 'com.microsoft.gctoolkit.api'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
    }

    public RegionsSummary getRegionCodeRootSizeAndRegions() {
        return regionCodeRootSizeAndRegions;
    }
```

### ClassEscapesItsScope
Class `RegionsSummary` is not exported from module 'com.microsoft.gctoolkit.api'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
    }

    public void setRegionCodeRootSizeAndRegions(RegionsSummary regionCodeRootSizeAndRegions) {
        this.regionCodeRootSizeAndRegions = regionCodeRootSizeAndRegions;
    }
```

### ClassEscapesItsScope
Class `RegionsSummary` is not exported from module 'com.microsoft.gctoolkit.api'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
    }

    public RegionsSummary getRegionsRSetSizeAndCardCount() {
        return regionsRSetSizeAndCardCount;
    }
```

### ClassEscapesItsScope
Class `RegionsSummary` is not exported from module 'com.microsoft.gctoolkit.api'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
    }

    public void setRegionsRSetSizeAndCardCount(RegionsSummary regionsRSetSizeAndCardCount) {
        this.regionsRSetSizeAndCardCount = regionsRSetSizeAndCardCount;
    }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getLongGroup()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
    }

    public long getLongGroup(int index) {
        return Long.parseLong(trace.group(index));
    }
```

### RedundantMethodOverride
Method `groupNotNull()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
    }

    public boolean groupNotNull(int index) {
        return getGroup(index) != null;
    }
```

### RedundantMethodOverride
Method `getIntegerGroup()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
    }

    public int getIntegerGroup(int index) {
        return Integer.parseInt(trace.group(index));
    }
```

### RedundantMethodOverride
Method `groupCount()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
    }

    public int groupCount() {
        return trace.groupCount();
    }
```

### RedundantMethodOverride
Method `extractReferenceBlock()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
    }

    GCLogTrace extractReferenceBlock(String line, GCParseRule rule) {
        return rule.parse(line);
    }
```

### RedundantMethodOverride
Method `getTotalOccupancyBeforeAfterWithTotalHeapPoolSizeSummary()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java

    // todo: mixes aggregator with parsing. premature optimization...
    MemoryPoolSummary getTotalOccupancyBeforeAfterWithTotalHeapPoolSizeSummary(GCLogTrace trace, int offset) {
        MemoryPoolSummary summary = trace.getOccupancyBeforeAfterWithMemoryPoolSizeSummary(offset);
        return summary;
```

### RedundantMethodOverride
Method `extractPermGenRecord()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
    }

    MemoryPoolSummary extractPermGenRecord(GCLogTrace trace) {
        int index = (trace.getGroup(2) == null) ? 2 : 4;
        return new PermGenSummary(trace.getLongGroup(index), trace.getLongGroup(4), trace.getLongGroup(6));
```

### RedundantMethodOverride
Method `extractCPUSummary()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
    }

    CPUSummary extractCPUSummary(String line) {
        GCLogTrace trace;
        if ((trace = CPU_BREAKDOWN.parse(line)) != null) {
```

### RedundantMethodOverride
Method `getTotalOccupancyWithTotalHeapSizeSummary()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
    }

    MemoryPoolSummary getTotalOccupancyWithTotalHeapSizeSummary(GCLogTrace trace, int offset) {
        MemoryPoolSummary summary = trace.getOccupancyWithMemoryPoolSizeSummary(offset);
        return summary;
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `api/src/main/java/com/microsoft/gctoolkit/io/SingleGCLogFile.java`
#### Snippet
```java
        Stream<String> stream = null;
        if (metadata.isPlainText()) {
            stream = Files.lines(metadata.getPath());
        } else if (metadata.isZip()) {
            stream = streamZipFile(metadata.getPath());
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
        try {
            if (isDirectory()) {
                Files.list(getPath()).map(GCLogFileSegment::new).forEach(segments::add);
            }
            else {
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
            }
            else {
                Files.list(getPath().getParent())
                        .filter(file -> file.getFileName().toString().startsWith(getRootPattern()))
                        .map(p -> new GCLogFileSegment(p)).forEach(segments::add);
```

### AutoCloseableResource
'ZipFile' used without 'try'-with-resources statement
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileZipSegment.java`
#### Snippet
```java
    public Stream<String> stream() {
        try {
            ZipFile file = new ZipFile(path.toFile());
            ZipEntry entry = file.getEntry(this.segmentName);
            return new BufferedReader(new InputStreamReader(file.getInputStream(entry))).lines();
```

### AutoCloseableResource
'RandomAccessFile' used without 'try'-with-resources statement
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileSegment.java`
#### Snippet
```java
        boolean foundEOL = false;
        char eol = 0;
        RandomAccessFile randomAccessFile = new RandomAccessFile(path.toFile(), "r");
        long currentPosition = randomAccessFile.length() - 1;
        int linesFound = 0;
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `parser/src/main/java/com/microsoft/gctoolkit/parser/collection/RuleSet.java`
#### Snippet
```java
    public V put(K key, V value) {
        Node<K,V> node = new Node<>(key, value);
        if (head == null) {
            head = node;
        } else {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
import com.microsoft.gctoolkit.time.DateTimeStamp;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
```

### UNUSED_IMPORT
Unused import `import static com.microsoft.gctoolkit.parser.unified.UnifiedPatterns.CPU_BREAKOUT;`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/UnifiedDiarizer.java`
#### Snippet
```java
import static com.microsoft.gctoolkit.parser.unified.UnifiedG1GCPatterns.G1_TAG;
import static com.microsoft.gctoolkit.parser.unified.UnifiedGenerationalPatterns.*;
import static com.microsoft.gctoolkit.parser.unified.UnifiedPatterns.CPU_BREAKOUT;
import static com.microsoft.gctoolkit.parser.unified.ZGCPatterns.CYCLE_START;
import static com.microsoft.gctoolkit.parser.unified.ZGCPatterns.ZGC_TAG;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.gctoolkit.event.g1gc.G1GCConcurrentEvent;`
in `sample/src/main/java/com/microsoft/gctoolkit/sample/aggregation/PauseTimeAggregator.java`
#### Snippet
```java
import com.microsoft.gctoolkit.aggregator.Aggregator;
import com.microsoft.gctoolkit.aggregator.EventSource;
import com.microsoft.gctoolkit.event.g1gc.G1GCConcurrentEvent;
import com.microsoft.gctoolkit.event.g1gc.G1GCPauseEvent;

```

### UNUSED_IMPORT
Unused import `import java.util.logging.Logger;`
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/VertxJVMEventChannel.java`
#### Snippet
```java
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VertxJVMEventChannel extends VertxChannel implements JVMEventChannel {
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final String INTEGER = "\\d+";
    private static final String DATE = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[\\+|\\-]\\d{4}";
    private static final String TIME = INTEGER + DECIMAL_POINT + "\\d{3}";

    // Unified Tokens
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final Pattern PREUNIFIED_DATE_TIMESTAMP = Pattern.compile(DATE_TIMESTAMP);
    // JEP 158 has ISO-8601 time and uptime in seconds and milliseconds as the first two decorators.
    private static final Pattern UNIFIED_DATE_TIMESTAMP = Pattern.compile("^(" + DATE_TAG + ")?(" + UPTIME_TAG + ")?");
    private static final DateTimeStamp EMPTY_DATE = new DateTimeStamp(TIMESTAMP_NOT_SET);

```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java

    // Pre-unified tokens
    private static final String TIMESTAMP = "(" + TIME + "): ";
    private static final String DATE_STAMP = "(" + DATE + "): ";
    private static final String DATE_TIMESTAMP = "^(?:" + DATE_STAMP + ")?" + TIMESTAMP;
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    // Patterns needed to support conversion of a log line to a DateTimeStamp

    private static final String DECIMAL_POINT = "(?:\\.|,)";
    private static final String INTEGER = "\\d+";
    private static final String DATE = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[\\+|\\-]\\d{4}";
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final String TIMESTAMP = "(" + TIME + "): ";
    private static final String DATE_STAMP = "(" + DATE + "): ";
    private static final String DATE_TIMESTAMP = "^(?:" + DATE_STAMP + ")?" + TIMESTAMP;

    //  2017-09-07T09:00:12.795+0200: 0.716:
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    // Unified Tokens
    private static final String DATE_TAG = "\\[" + DATE + "\\]";
    private static final String UPTIME_TAG = "\\[(" + TIME + ")s\\]";

    // Pre-unified tokens
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    String PID_TID = "\\[\\d+\\]";
    String UNIFIED_LOG_LEVEL_BLOCK = "\\[(?:error|warning|info|debug|trace|develop) *\\]";
    Pattern DECORATORS = Pattern.compile("(" + DATE_STAMP + ")?(" + UPTIME + ")?(" + TIME_MILLIS + ")?(" + TIME_MILLIS + ")?(" + TIME_NANOS + ")?(" + TIME_NANOS + ")?(" + PID_TID + ")?(" + PID_TID + ")?(" + UNIFIED_LOG_LEVEL_BLOCK + ")?");
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java

    String DATE_STAMP = "\\[" + DATE + "\\]";
    String UPTIME = "\\[" + INTEGER + DECIMAL_POINT + "\\d{3}s\\]";
    String TIME_MILLIS = "\\[\\d+ms\\]";
    String TIME_NANOS = "\\[\\d+ns\\]";
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    private static final GCParseRule G1GC_PREFIX = new GCParseRule("G1GC_PREFIX", G1GCTokens.G1GC_PREFIX);
    private static final GCParseRule REFERENCE_PROCESSING_BLOCK = new GCParseRule("REFERENCE_PROCESSING_BLOCK", PreUnifiedTokens.REFERENCE_RECORDS);
    private static final Pattern excludeG1Ergonomics = Pattern.compile("^\\d+(\\.|,)\\d+: \\[G1Ergonomics");


```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    public void splitRemarkReferenceWithWeakReferenceSplitBug(GCLogTrace trace, String line) {
        GCLogTrace remarkTrace = REMARK_CLAUSE.parse(line);
        Pattern durationGroupPattern = Pattern.compile(".* " + PAUSE_TIME);
        Matcher matcher = durationGroupPattern.matcher(line);
        double duration = 0.0d;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Tag `param` is not allowed here
in `api/src/main/java/com/microsoft/gctoolkit/io/SingleGCLogFile.java`
#### Snippet
```java
    /**
     * Constructor for a single, GC log file.
     * @param path The path to the log file.
     */

```

### JavadocDeclaration
`@return` tag description is missing
in `api/src/main/java/com/microsoft/gctoolkit/parser/datatype/TripleState.java`
#### Snippet
```java
     * Transform boolean to it's corresponding TripleState
     * @param value boolean
     * @return
     */
    public static TripleState valueOf(boolean value) {
```

### JavadocDeclaration
`@param channel` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
     * to after the previous event has ended.
     *
     * @param channel
     * @param event
     */
```

### JavadocDeclaration
`@param event` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
     *
     * @param channel
     * @param event
     */
    public void publish(ChannelName channel, JVMEvent event) {
```

### JavadocDeclaration
`@param line` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/UnifiedDiarizer.java`
#### Snippet
```java
    /**
     *
     * @param line
     */
    private void discoverDetails(String line) {
```

### JavadocDeclaration
`@param trace` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
    /**
     * If the forward reference has not been recorded, assume it's state is corrupted so over-write it.
     * @param trace
     * @param line
     */
```

### JavadocDeclaration
`@param line` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
     * If the forward reference has not been recorded, assume it's state is corrupted so over-write it.
     * @param trace
     * @param line
     */
    private void remark(GCLogTrace trace, String line) {
```

### JavadocDeclaration
`@param trace` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
     * If the concurrentCyclePauseEvent has not been recorded, something has gone wrong and it's likely
     * that it doesn't have a consistent state. The default action is to lose it.
     * @param trace
     * @param line
     */
```

### JavadocDeclaration
`@param line` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
     * that it doesn't have a consistent state. The default action is to lose it.
     * @param trace
     * @param line
     */
    private void initialMark(GCLogTrace trace, String line) {
```

### JavadocDeclaration
Tag `param` is not allowed here
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/Decorators.java`
#### Snippet
```java
     * are missing, GCToolkit JVMEvents will have no sense of time. It is possible that the other timing fields could fill
     * in cases where both the time and uptime decorators were missing.
     * @param line
     */

```

### JavadocDeclaration
`@return` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    /**
     * gcType == null -> likely an incomplete record.
     * @return
     */
    G1GCPauseEvent buildEvent() throws MalformedEvent {
```

### JavadocDeclaration
`@param event` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     * phase, the pause event is queued. It will be published when the concurrent phase completes. As each event is
     * published, it corresponding forward reference is released.
     * @param event
     */
    private void publishPauseEvent(G1GCPauseEvent event) {
```

### JavadocDeclaration
`@param trace` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    /**
     * todo: need to capture StringTable data (part of remark at debug level)
     * @param trace
     * @param line
     */
```

### JavadocDeclaration
`@param line` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     * todo: need to capture StringTable data (part of remark at debug level)
     * @param trace
     * @param line
     */
    private void fullStringSymbolTable(GCLogTrace trace, String line) {
```

### JavadocDeclaration
`@param trace` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     * following records describe heap before the collection
     *
     * @param trace
     * @param line
     */
```

### JavadocDeclaration
`@param line` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     *
     * @param trace
     * @param line
     */
    private void heapBeforeAfterGCInvocationCount(GCLogTrace trace, String line) {
```

### JavadocDeclaration
`@param trace` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    /**
     * todo: need to process and view this captured data
     * @param trace
     * @param line
     */
```

### JavadocDeclaration
`@param line` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     * todo: need to process and view this captured data
     * @param trace
     * @param line
     */
    private void fullClassUnloading(GCLogTrace trace, String line) {
```

### JavadocDeclaration
`@param trace` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    /**
     * this is the start of the records, nothing to be captured.
     * @param trace
     * @param line
     */
```

### JavadocDeclaration
`@param line` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     * this is the start of the records, nothing to be captured.
     * @param trace
     * @param line
     */
    private void concurrentMarkInternalPhases(GCLogTrace trace, String line) {
```

### JavadocDeclaration
`@param event` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     * The exception is the Concurrent Undo cycle which causes all concurrent phases to be queued until the
     * undo cycle ends.
     * @param event
     */
    private void publishConcurrentEvent(G1GCConcurrentEvent event) {
```

### JavadocDeclaration
`@param trace` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java

    /**
     * @param trace
     * @param line
     */
```

### JavadocDeclaration
`@param line` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    /**
     * @param trace
     * @param line
     */
    private void metaClassSpace(GCLogTrace trace, String line) {
```

### JavadocDeclaration
`@param trace` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     * Start of concurrent phases which can be ignored (for now??)
     *
     * @param trace
     * @param line
     */
```

### JavadocDeclaration
`@param line` tag description is missing
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     *
     * @param trace
     * @param line
     */

```

### JavadocDeclaration
IOException is not declared to be thrown by method discoverFormat
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFile.java`
#### Snippet
```java
     * the constructors of the subclasses.
     * @return {@code true} if the file uses the unified log format.
     * @throws IOException Thrown from reading the stream.
     */
    private TripleState discoverFormat() {
```

### JavadocDeclaration
Tag `param` is not allowed here
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
     * parser.
     *
     * @param line log line
     * @return boolean true is the line should be ignored.
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
     *
     * @param line log line
     * @return boolean true is the line should be ignored.
     */
    private final GCParseRule corruptedApplicationTime = new GCParseRule("corruptedApplicationTime", DATE_TIMESTAMP + TIMESTAMP);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `EndOfFile` may be 'final'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
    private static final Logger LOG = Logger.getLogger(CMSTenuredPoolParser.class.getName());
    private DateTimeStamp startOfPhase = null;
    private GCParseRule EndOfFile = new GCParseRule("END_OF_DATA_SENTINEL", END_OF_DATA_SENTINEL);

    public CMSTenuredPoolParser() {}
```

### FieldMayBeFinal
Field `timeOfFirstEvent` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/jvm/JVMTermination.java`
#### Snippet
```java
public class JVMTermination extends JVMEvent {

    private DateTimeStamp timeOfFirstEvent;

    /**
```

### FieldMayBeFinal
Field `registeredAggregations` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/GCToolKit.java`
#### Snippet
```java

    private final HashSet<DataSourceParser> registeredDataSourceParsers = new HashSet<>();
    private List<Aggregation> registeredAggregations;
    private JVMEventChannel jvmEventChannel = null;
    private DataSourceChannel dataSourceChannel = null;
```

### FieldMayBeFinal
Field `additiveParsers` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/GCToolKit.java`
#### Snippet
```java
    }

    private List<DataSourceParser> additiveParsers = new ArrayList<>();

    /**
```

### FieldMayBeFinal
Field `logFile` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/io/SingleLogFileMetadata.java`
#### Snippet
```java
    private static final Logger LOG = Logger.getLogger(SingleLogFileMetadata.class.getName());

    private LogFileSegment logFile;

    public SingleLogFileMetadata(Path path) throws IOException {
```

### FieldMayBeFinal
Field `maxChunkSize` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/generational/BinaryTreeDictionary.java`
#### Snippet
```java

    private long totalFreeSpace;
    private long maxChunkSize;
    private int numberOfBlocks;
    private long averageBlockSize;
```

### FieldMayBeFinal
Field `numberOfBlocks` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/generational/BinaryTreeDictionary.java`
#### Snippet
```java
    private long totalFreeSpace;
    private long maxChunkSize;
    private int numberOfBlocks;
    private long averageBlockSize;
    private int treeHeight;
```

### FieldMayBeFinal
Field `treeHeight` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/generational/BinaryTreeDictionary.java`
#### Snippet
```java
    private int numberOfBlocks;
    private long averageBlockSize;
    private int treeHeight;

    public BinaryTreeDictionary(long totalFreeSpace, long maxChunkSize, int numberOfBlocks, long averageBlockSize, int treeHeight) {
```

### FieldMayBeFinal
Field `averageBlockSize` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/generational/BinaryTreeDictionary.java`
#### Snippet
```java
    private long maxChunkSize;
    private int numberOfBlocks;
    private long averageBlockSize;
    private int treeHeight;

```

### FieldMayBeFinal
Field `totalFreeSpace` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/generational/BinaryTreeDictionary.java`
#### Snippet
```java
public class BinaryTreeDictionary {

    private long totalFreeSpace;
    private long maxChunkSize;
    private int numberOfBlocks;
```

### FieldMayBeFinal
Field `cpuTime` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/generational/CMSConcurrentEvent.java`
#### Snippet
```java
public abstract class CMSConcurrentEvent extends GenerationalGCEvent implements CMSPhase {

    private double cpuTime;
    private double wallClockTime;

```

### FieldMayBeFinal
Field `wallClockTime` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/generational/CMSConcurrentEvent.java`
#### Snippet
```java

    private double cpuTime;
    private double wallClockTime;

    protected CMSConcurrentEvent(DateTimeStamp timeStamp, GarbageCollectionTypes type, GCCause cause, double duration, double cpuTime, double wallClockTime) {
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
     * event is completed and then the cached event is emitted.
     */
    private ArrayList<GenerationalGCPauseEvent> cache = new ArrayList<>();

    private void cpuBreakout(GCLogTrace trace, String line) {
```

### FieldMayBeFinal
Field `timeStamp` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    public final static double TIMESTAMP_NOT_SET = Double.NaN;
    private final ZonedDateTime dateTime;
    private double timeStamp;
    public static final Comparator<DateTimeStamp> comparator = getComparator();

```

### FieldMayBeFinal
Field `aggregator` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/message/JVMEventChannelAggregator.java`
#### Snippet
```java

    private ChannelName channel;
    private Aggregator aggregator;

    public JVMEventChannelAggregator(ChannelName channel, Aggregator aggregator) {
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/message/JVMEventChannelAggregator.java`
#### Snippet
```java
public class JVMEventChannelAggregator implements JVMEventChannelListener {

    private ChannelName channel;
    private Aggregator aggregator;

```

### FieldMayBeFinal
Field `format` may be 'final'
in `IT/src/main/java/com/microsoft/gctoolkit/integration/aggregation/CollectionCycleCountsSummary.java`
#### Snippet
```java
    }

    private String format = "%s : %s\n";
    public void printOn(PrintStream printStream) {
        collectionCycleCounts.keySet().forEach(k -> printStream.printf(format,k, collectionCycleCounts.get(k)));
```

### FieldMayBeFinal
Field `collectionCycleCounts` may be 'final'
in `IT/src/main/java/com/microsoft/gctoolkit/integration/aggregation/CollectionCycleCountsSummary.java`
#### Snippet
```java
public class CollectionCycleCountsSummary extends CollectionCycleCountsAggregation {

    private HashMap<GarbageCollectionTypes,Integer> collectionCycleCounts = new HashMap<>();
    @Override
    public void count(GarbageCollectionTypes gcType) {
```

### FieldMayBeFinal
Field `DESIRED_SURVIVOR_SIZE` may be 'final'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedSurvivorMemoryPoolParser.java`
#### Snippet
```java
     * [16.974s][trace][gc,age       ] GC(14) - age  14:     542328 bytes,    8307008 total
     */
    private GCParseRule DESIRED_SURVIVOR_SIZE = new GCParseRule("DESIRED_SURVIVOR_SIZE", "Desired survivor size " + COUNTER + " bytes, new threshold " + COUNTER + " \\(max threshold " + COUNTER + "\\)");
    private GCParseRule AGE_TABLE_HEADER = new GCParseRule("AGE_TABLE_HEADER", "Age table with threshold " + COUNTER + " \\(max threshold " + COUNTER + "\\)");
    private GCParseRule AGE_RECORD = new GCParseRule("AGE_RECORD", "- age\\s+" + COUNTER + ":\\s+" + COUNTER + " bytes,\\s+" + COUNTER + " total");
```

### FieldMayBeFinal
Field `AGE_RECORD` may be 'final'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedSurvivorMemoryPoolParser.java`
#### Snippet
```java
    private GCParseRule DESIRED_SURVIVOR_SIZE = new GCParseRule("DESIRED_SURVIVOR_SIZE", "Desired survivor size " + COUNTER + " bytes, new threshold " + COUNTER + " \\(max threshold " + COUNTER + "\\)");
    private GCParseRule AGE_TABLE_HEADER = new GCParseRule("AGE_TABLE_HEADER", "Age table with threshold " + COUNTER + " \\(max threshold " + COUNTER + "\\)");
    private GCParseRule AGE_RECORD = new GCParseRule("AGE_RECORD", "- age\\s+" + COUNTER + ":\\s+" + COUNTER + " bytes,\\s+" + COUNTER + " total");

    private SurvivorRecord forwardReference = null;
```

### FieldMayBeFinal
Field `AGE_TABLE_HEADER` may be 'final'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedSurvivorMemoryPoolParser.java`
#### Snippet
```java
     */
    private GCParseRule DESIRED_SURVIVOR_SIZE = new GCParseRule("DESIRED_SURVIVOR_SIZE", "Desired survivor size " + COUNTER + " bytes, new threshold " + COUNTER + " \\(max threshold " + COUNTER + "\\)");
    private GCParseRule AGE_TABLE_HEADER = new GCParseRule("AGE_TABLE_HEADER", "Age table with threshold " + COUNTER + " \\(max threshold " + COUNTER + "\\)");
    private GCParseRule AGE_RECORD = new GCParseRule("AGE_RECORD", "- age\\s+" + COUNTER + ":\\s+" + COUNTER + " bytes,\\s+" + COUNTER + " total");

```

### FieldMayBeFinal
Field `endingStringVolume` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1ConcurrentStringDeduplication.java`
#### Snippet
```java

    private double startingStringVolume;
    private double endingStringVolume;
    private double reduction;
    private double percentReduction;
```

### FieldMayBeFinal
Field `startingStringVolume` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1ConcurrentStringDeduplication.java`
#### Snippet
```java
public class G1ConcurrentStringDeduplication extends G1GCConcurrentEvent {

    private double startingStringVolume;
    private double endingStringVolume;
    private double reduction;
```

### FieldMayBeFinal
Field `reduction` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1ConcurrentStringDeduplication.java`
#### Snippet
```java
    private double startingStringVolume;
    private double endingStringVolume;
    private double reduction;
    private double percentReduction;

```

### FieldMayBeFinal
Field `percentReduction` may be 'final'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1ConcurrentStringDeduplication.java`
#### Snippet
```java
    private double endingStringVolume;
    private double reduction;
    private double percentReduction;

    public G1ConcurrentStringDeduplication(DateTimeStamp timeStamp, double startingStringVolume, double endingStringVolume, double reduction, double percentReduction, double duration) {
```

### FieldMayBeFinal
Field `referenceCounts` may be 'final'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    private static final int CLEANER_REFERENCE = 5;
    private double[] referenceProcessingDuarations = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d};
    private int[] referenceCounts = {-1, -1, -1, -1, -1, -1};

    void setSoftReferenceProcessingDuation(double duration) {
```

### FieldMayBeFinal
Field `referenceProcessingDuarations` may be 'final'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    private static final int JNI_WEAK_REFERENCE = 4;
    private static final int CLEANER_REFERENCE = 5;
    private double[] referenceProcessingDuarations = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d};
    private int[] referenceCounts = {-1, -1, -1, -1, -1, -1};

```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `phases` are updated, but never queried
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalForwardReference.java`
#### Snippet
```java
    private MetaspaceRecord classspace = null;
    private final Map<String, Double> remarkPhases = new ConcurrentHashMap<>();
    private final Map<String, Double> phases = new ConcurrentHashMap<>();

    public GenerationalForwardReference(GarbageCollectionTypes gcType, Decorators decorators, int gcid) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `tagsAndLevels` are updated, but never queried
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/UnifiedDiarizer.java`
#### Snippet
```java

    private final Diary diary;
    private final TreeSet<String> tagsAndLevels = new TreeSet<>();
    private int stopTheWorldEvents = 0;

```

### MismatchedCollectionQueryUpdate
Contents of collection `tlabRecords` are updated, but never queried
in `api/src/main/java/com/microsoft/gctoolkit/event/TLABSummary.java`
#### Snippet
```java
public class TLABSummary {

    private ArrayList<String> tlabRecords;

    public TLABSummary() {
```

### MismatchedCollectionQueryUpdate
Contents of collection `backlog` are queried, but never updated
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    private DateTimeStamp concurrentPhaseStartTimeStamp;
    private GarbageCollectionTypes concurrentCollectionTypeForwardReference;
    private final ConcurrentLinkedQueue<JVMEvent> backlog = new ConcurrentLinkedQueue<>();

    private final MRUQueue<GCParseRule, BiConsumer<GCLogTrace, String>> parseRules;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `summary` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
    // todo: mixes aggregator with parsing. premature optimization...
    MemoryPoolSummary getTotalOccupancyBeforeAfterWithTotalHeapPoolSizeSummary(GCLogTrace trace, int offset) {
        MemoryPoolSummary summary = trace.getOccupancyBeforeAfterWithMemoryPoolSizeSummary(offset);
        return summary;
    }
```

### UnnecessaryLocalVariable
Local variable `summary` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java

    MemoryPoolSummary getTotalOccupancyWithTotalHeapSizeSummary(GCLogTrace trace, int offset) {
        MemoryPoolSummary summary = trace.getOccupancyWithMemoryPoolSizeSummary(offset);
        return summary;
    }
```

### UnnecessaryLocalVariable
Local variable `summary` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
    // todo: mixes aggregator with parsing. premature optimization...
    MemoryPoolSummary getTotalOccupancyBeforeAfterWithTotalHeapPoolSizeSummary(GCLogTrace trace, int offset) {
        MemoryPoolSummary summary = trace.getOccupancyBeforeAfterWithMemoryPoolSizeSummary(offset);
        return summary;
    }
```

### UnnecessaryLocalVariable
Local variable `summary` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java

    MemoryPoolSummary getTotalOccupancyWithTotalHeapSizeSummary(GCLogTrace trace, int offset) {
        MemoryPoolSummary summary = trace.getOccupancyWithMemoryPoolSizeSummary(offset);
        return summary;
    }
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `api/src/main/java/com/microsoft/gctoolkit/GCToolKit.java`
#### Snippet
```java
            int lineNumber = stackTrace[2].getLineNumber();
            if (isDebugging(className)) {
                System.out.println(String.format("DEBUG: %s.%s(%s:%d): %s", className, methodName, fileName, lineNumber, message.get()));
            }
        }
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\\.|,)`
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    // Patterns needed to support conversion of a log line to a DateTimeStamp

    private static final String DECIMAL_POINT = "(?:\\.|,)";
    private static final String INTEGER = "\\d+";
    private static final String DATE = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[\\+|\\-]\\d{4}";
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `SPLIT_REMARK.parse(line)` assigned to `trace` is never used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
        else if ((trace = REMARK_REFERENCE_PROCESSING.parse(line)) != null)
            remarkWithReferenceProcessing(trace, line);
        else if ((trace = SPLIT_REMARK.parse(line)) != null)
            startOfPhase = getClock();
        else if ((trace = EndOfFile.parse(line)) != null) {
```

### UnusedAssignment
The value `EndOfFile.parse(line)` assigned to `trace` is never used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
        else if ((trace = SPLIT_REMARK.parse(line)) != null)
            startOfPhase = getClock();
        else if ((trace = EndOfFile.parse(line)) != null) {
            super.publish(ChannelName.CMS_TENURED_POOL_PARSER_OUTBOX, new JVMTermination(getClock(), diary.getTimeOfFirstEvent()));
        }
```

### UnusedAssignment
Variable `baseLength` initializer `0` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
        }

        int baseLength = 0;
        if ( "current".equals(bits[bits.length - 1]))
            baseLength = bits.length - 2;
```

### UnusedAssignment
Variable `aggregator` initializer `null` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/GCToolKit.java`
#### Snippet
```java
            }

            Aggregator<? extends Aggregation> aggregator = null;
            try {
                aggregator = constructor.newInstance(aggregation);
```

### UnusedAssignment
Variable `trace` initializer `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
    protected void process(String line) {

        GCLogTrace trace = null;

        try {
```

### UnusedAssignment
The value `LEAVING_SAFEPOINT.parse(line)` assigned to `trace` is never used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
                timeStamp = getClock();
                safePointReason = ApplicationStoppedTime.VMOperations.valueOf(trace.getGroup(1));
            } else if ((trace = LEAVING_SAFEPOINT.parse(line)) != null) {
            } //noop this one.

```

### UnusedAssignment
Variable `startTime` initializer `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ForwardReference.java`
#### Snippet
```java
    private final Decorators decorators;
    private final int gcID;
    private DateTimeStamp startTime = null;
    private double duration = -1.0d;
    private GCCause gcCause = GCCause.UNKNOWN_GCCAUSE;
```

### UnusedAssignment
Variable `referenceProcessingTime` initializer `0.0d` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1Remark.java`
#### Snippet
```java
public class G1Remark extends G1RealPause {

    private double referenceProcessingTime = 0.0d;
    private double finalizeMarkingTime = 0.0d;
    private double unloadingTime = 0.0d;
```

### UnusedAssignment
The value `AGE_TABLE_HEADER.parse(entry)` assigned to `trace` is never used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedSurvivorMemoryPoolParser.java`
#### Snippet
```java
        if ((trace = DESIRED_SURVIVOR_SIZE.parse(entry)) != null) {
            forwardReference = new SurvivorRecord(new Decorators(entry).getDateTimeStamp(), trace.getLongGroup(1), trace.getIntegerGroup(2), trace.getIntegerGroup(3));
        } else if ((trace = AGE_TABLE_HEADER.parse(entry)) != null) {
            //we've collected this data so.. eat it...
        } else if ((trace = AGE_RECORD.parse(entry)) != null) {
```

### UnusedAssignment
Variable `trace` initializer `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java
    protected void process(String line) {

        GCLogTrace trace = null;

        try {
```

### UnusedAssignment
Variable `prefixFilter` initializer `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/LogLineFilter.java`
#### Snippet
```java

    //Internal hack to deal with our sftp server not being able to capture a complete zip file.
    private static String prefixFilter = null;
    private Pattern filterPattern = null;

```

### UnusedAssignment
Variable `verbose` initializer `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/LogLineFilter.java`
#### Snippet
```java

    private static final String VERBOSE_PROPERTY = "com.microsoft.gctoolkit.verbose.log";
    private static boolean verbose = false;

    //Internal hack to deal with our sftp server not being able to capture a complete zip file.
```

### UnusedAssignment
Variable `collection` initializer `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
        MemoryPoolSummary summary = trace.getOccupancyBeforeAfterWithMemoryPoolSizeSummary(9);
        if ("young".equals(trace.getGroup(4))) {
            G1Young collection = null;
            if (trace.getGroup(6) == null)
                collection = new G1Young(getClock(), trace.gcCause(), trace.getPauseTime());
```

### UnusedAssignment
Variable `forwardReference` initializer `trap` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java

    private final G1GCPauseEvent trap = new G1Trap();
    private G1GCPauseEvent forwardReference = trap;

    private DateTimeStamp timeStampForwardReference;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `dateTimeStamp != null` is always `true`
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileZipSegment.java`
#### Snippet
```java
                    .map(DateTimeStamp::fromGCLogLine)
                    .filter(dateTimeStamp -> dateTimeStamp.hasTimeStamp() || dateTimeStamp.hasDateStamp())
                    .max(Comparator.comparing(dateTimeStamp -> dateTimeStamp != null ? dateTimeStamp.getTimeStamp() : 0))
                    .orElse(new DateTimeStamp(-1.0d));
        }
```

### ConstantValue
Condition `dateTimeStamp != null` is always `true`
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileSegment.java`
#### Snippet
```java
                    .map(DateTimeStamp::fromGCLogLine)
                    .filter(dateTimeStamp -> dateTimeStamp.hasTimeStamp() || dateTimeStamp.hasDateStamp())
                    .max(Comparator.comparing(dateTimeStamp -> dateTimeStamp != null ? dateTimeStamp.getTimeStamp() : 0))
                    .orElse(new DateTimeStamp(-1.0d));
        }
```

### ConstantValue
Condition `!foundEOL` is always `true` when reached
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileSegment.java`
#### Snippet
```java
                    eol = CR;
                foundEOL = true;
            } else if (character == CR && !foundEOL) {
                eol = CR;
                foundEOL = true;
```

### ConstantValue
Condition `m == null` is always `false`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JHiccupTrace.java`
#### Snippet
```java
    public static JHiccupTrace toTrace(String line) {
        Matcher m = JHICCUP_LOG_ENTRY.matcher(line);
        return (m == null) ? null : new JHiccupTrace(m);
    }

```

### ConstantValue
Condition `simpleCMSCycleDetected` is always `true` when reached
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    @Override
    public boolean completed() {
        return getDiary().isComplete() || lineCount < 1 || (simpleCMSCycleDetected && (simpleCMSCycleDetected || simpleFullGCDetected));
    }

```

### ConstantValue
Condition `simpleCMSCycleDetected || simpleFullGCDetected` is always `true` when reached
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    @Override
    public boolean completed() {
        return getDiary().isComplete() || lineCount < 1 || (simpleCMSCycleDetected && (simpleCMSCycleDetected || simpleFullGCDetected));
    }

```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
        LogFileSegment current = workingList.stream()
                .filter( segment -> segment.getSegmentName().endsWith(basePattern) || segment.getSegmentName().endsWith(".current"))
                .findFirst().get();

        orderedList.addFirst(current);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
                    .filter(segment -> !segment.getSegmentName().matches(".+\\.\\d+$"))
                    .findFirst()
                    .get()
                    .getSegmentName().split("\\.");
        } else if ( isZip()) {
```

## RuleId[id=SuspiciousIndentAfterControlStatement]
### SuspiciousIndentAfterControlStatement
Suspicious indentation after 'if' statement
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
            else
                findSegments();
            return this.segments.size();
    }

```

## RuleId[id=OverwrittenKey]
### OverwrittenKey
Duplicate Map key
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
        //, 0.1127040 secs]220.624: [weak refs processing, 0.1513820 secs] [1 CMS-remark: 10541305K(16777216K)] 10742883K(18664704K), 0.7371020 secs]
        //todo: this was capturing records that is shouldn't have so the rule was modified.. now does it work??? Needs through testing now that order of evaluation will change
        parseRules.put(REMARK_DETAILS, this::remarkAt1);
        parseRules.put(SERIAL_REMARK_SCAN_BREAKDOWNS, this::remarkAt15);
        parseRules.put(REMARK_DETAILS, this::remarkAt1);
```

### OverwrittenKey
Duplicate Map key
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
        //todo: this was capturing records that is shouldn't have so the rule was modified.. now does it work??? Needs through testing now that order of evaluation will change
        parseRules.put(REMARK_DETAILS, this::remarkAt1);
        parseRules.put(SERIAL_REMARK_SCAN_BREAKDOWNS, this::remarkAt15);
        parseRules.put(REMARK_DETAILS, this::remarkAt1);
        parseRules.put(SERIAL_REMARK_SCAN_BREAKDOWNS, this::remarkAt15);
```

### OverwrittenKey
Duplicate Map key
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
        parseRules.put(REMARK_DETAILS, this::remarkAt1);
        parseRules.put(SERIAL_REMARK_SCAN_BREAKDOWNS, this::remarkAt15);
        parseRules.put(REMARK_DETAILS, this::remarkAt1);
        parseRules.put(SERIAL_REMARK_SCAN_BREAKDOWNS, this::remarkAt15);
        parseRules.put(REMARK_REFERENCE_PROCESSING, this::recordRemarkWithReferenceProcessing);
```

### OverwrittenKey
Duplicate Map key
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
        parseRules.put(SERIAL_REMARK_SCAN_BREAKDOWNS, this::remarkAt15);
        parseRules.put(REMARK_DETAILS, this::remarkAt1);
        parseRules.put(SERIAL_REMARK_SCAN_BREAKDOWNS, this::remarkAt15);
        parseRules.put(REMARK_REFERENCE_PROCESSING, this::recordRemarkWithReferenceProcessing);
        parseRules.put(TENURING_DETAILS, this::tenuringDetails);
```

### OverwrittenKey
Duplicate Map key
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
        parseRules.put(PARNEW_DETAILS_WITH_CONCURRENT_MODE_FAILURE, this::parNewDetailsWithConcurrentModeFailure);
        parseRules.put(CONCURRENT_MODE_FAILURE_REFERENCE, this::concurrentModeFailureReference);
        parseRules.put(iCMS_PARNEW_DEFNEW_TENURING_DETAILS, this::iCMSParNewDefNewTenuringDetails);
        parseRules.put(iCMS_CONCURRENT_MODE_FAILURE, this::iCMSConcurrentModeFailure);
        parseRules.put(iCMS_CONCURRENT_MODE_FAILURE_META, this::iCMSConcurrentModeFailure);
```

### OverwrittenKey
Duplicate Map key
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
        parseRules.put(iCMS_PARNEW_PROMOTION_FAILURE, this::iCMSParNewPromotionFailure);
        parseRules.put(FULL_GC_ICMS, this::fullGCiCMS);
        parseRules.put(iCMS_PARNEW_DEFNEW_TENURING_DETAILS, this::iCMSParNewDefNewTenuringDetails);
        parseRules.put(iCMS_FULL, this::iCMSFullGC);
        parseRules.put(iCMS_PROMOTION_FAILED, this::iCMSPromotionFailed);
```

