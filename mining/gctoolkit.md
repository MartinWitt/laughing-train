# gctoolkit 
 
# Bad smells
I found 485 bad smells with 36 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=RedundantFieldInitialization] | 75 | false |
| RuleId[ruleID=NestedAssignment] | 66 | false |
| RuleId[ruleID=EmptyMethod] | 40 | false |
| RuleId[ruleID=ReturnNull] | 32 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 29 | false |
| RuleId[ruleID=IntegerMultiplicationImplicitCastToLong] | 16 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 16 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 14 | true |
| RuleId[ruleID=UnusedAssignment] | 12 | false |
| RuleId[ruleID=SystemOutErr] | 12 | false |
| RuleId[ruleID=CommentedOutCode] | 11 | false |
| RuleId[ruleID=RedundantMethodOverride] | 11 | false |
| RuleId[ruleID=FieldMayBeStatic] | 11 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 10 | false |
| RuleId[ruleID=RegExpSingleCharAlternation] | 10 | false |
| RuleId[ruleID=BoundedWildcard] | 7 | false |
| RuleId[ruleID=ConstantValue] | 7 | false |
| RuleId[ruleID=AccessStaticViaInstance] | 6 | false |
| RuleId[ruleID=DataFlowIssue] | 6 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 6 | true |
| RuleId[ruleID=OverwrittenKey] | 6 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 5 | true |
| RuleId[ruleID=UnnecessaryReturn] | 4 | true |
| RuleId[ruleID=UNUSED_IMPORT] | 4 | false |
| RuleId[ruleID=MismatchedCollectionQueryUpdate] | 4 | false |
| RuleId[ruleID=Convert2MethodRef] | 4 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 4 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 4 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 4 | true |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 3 | false |
| RuleId[ruleID=IOResource] | 3 | false |
| RuleId[ruleID=RedundantOperationOnEmptyContainer] | 3 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 3 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 3 | true |
| RuleId[ruleID=MismatchedArrayReadWrite] | 2 | false |
| RuleId[ruleID=EmptyStatementBody] | 2 | false |
| RuleId[ruleID=ObsoleteCollection] | 2 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 2 | false |
| RuleId[ruleID=ManualMinMaxCalculation] | 2 | false |
| RuleId[ruleID=SimplifyOptionalCallChains] | 2 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 2 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 2 | false |
| RuleId[ruleID=CatchMayIgnoreException] | 2 | false |
| RuleId[ruleID=SamePackageImport] | 2 | false |
| RuleId[ruleID=AssignmentToLambdaParameter] | 2 | false |
| RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod] | 1 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 1 | false |
| RuleId[ruleID=MissortedModifiers] | 1 | false |
| RuleId[ruleID=ExplicitArrayFilling] | 1 | false |
| RuleId[ruleID=CodeBlock2Expr] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=ExceptionNameDoesntEndWithException] | 1 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 1 | false |
| RuleId[ruleID=Java9UndeclaredServiceUsage] | 1 | false |
| RuleId[ruleID=SetReplaceableByEnumSet] | 1 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 1 | false |
| RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup] | 1 | false |
## RuleId[ruleID=MismatchedArrayReadWrite]
### RuleId[ruleID=MismatchedArrayReadWrite]
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

### RuleId[ruleID=MismatchedArrayReadWrite]
Contents of array `promotionFailureSizesForwardReference` are written to, but never read
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    private ReferenceGCSummary referenceGCForwardReference;
    private CPUSummary scavengeCPUSummaryForwardReference;
    private int[] promotionFailureSizesForwardReference;

    private long totalFreeSpaceForwardReference;
```

## RuleId[ruleID=EmptyStatementBody]
### RuleId[ruleID=EmptyStatementBody]
`if` statement has empty body
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
                timeStamp = getClock();
                safePointReason = ApplicationStoppedTime.VMOperations.valueOf(trace.getGroup(1));
            } else if ((trace = LEAVING_SAFEPOINT.parse(line)) != null) {
            } //noop this one.

```

### RuleId[ruleID=EmptyStatementBody]
`if` statement has empty body
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
        if (line.startsWith("from space")) return true;
        if (line.startsWith("to   space")) return true;
        if (line.contains("[0xffff") && line.endsWith("000)")) ;

        if (line.startsWith("Finished ")) return true;
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `prefixFilter` from instance context
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/LogLineFilter.java`
#### Snippet
```java
        if (prefixFilter != null) {
            if (!prefixFilter.startsWith("^"))
                prefixFilter = "^" + prefixFilter;
            filterPattern = Pattern.compile(prefixFilter + "(.+)");
        }
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (3 lines)
in `api/src/main/java/com/microsoft/gctoolkit/GCToolKit.java`
#### Snippet
```java
        //todo: revert this to DataSource to account for non-GC log data sources once we have a use case (maybe JFR but JFR timers drift badly ATM)
        //setup message bus
        //DataSourceBus dataSourceBus = setupDataSourceBus();
        //JVMEventBus eventBus = setupJVMEventBus();
        //registerParsers(dataSourceBus,logFile.diary());
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (68 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ParNewSerial.java`
#### Snippet
```java
//    public static final Pattern PARNEW_SERIAL_FULL_SPLIT = Pattern.compile( "^: " + BEFORE_AFTER_CONFIGURED_PAUSE + "\\]" + TENURED_BLOCK + " " + BEFORE_AFTER_CONFIGURED + ", " + PERM_RECORD + ", " + PAUSE_TIME);

/*

    public static final Pattern PAR_OLD_REDUCTION = Pattern.compile("\\[ParOldGen: " + FROM_TO_CONFIGURED + "\\]");
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (8 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    /*
    private static final int METASPACE_OCCUPANCY_BEFORE_COLLECTION = 24;
    private static final int METASPACE_OCCUPANCY_AFTER_COLLECTION = 25;
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (8 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingCMSPatterns.java`
#### Snippet
```java
     */

//    public static final String DECIMAL_POINT = "(?:\\.|,)";
//    public static final String INTEGER = "\\d+";
//    public static final String REAL_NUMBER = INTEGER + DECIMAL_POINT + INTEGER;
```

### RuleId[ruleID=CommentedOutCode]
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

### RuleId[ruleID=CommentedOutCode]
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

### RuleId[ruleID=CommentedOutCode]
Commented out code (20 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
    }

//    double toKBytes(double value, String units) {
//        switch (units.charAt(0)) {
//            case 'G':
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (3 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
    private boolean inConcurrentPhase = false;

//    private boolean isCMS;
//    private boolean isParallel;
//    private boolean isSerial;
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (77 lines)
in `api/src/main/java/com/microsoft/gctoolkit/event/GCEvent.java`
#### Snippet
```java
    }

//    /**
//     *
//     * @return is a Z cycle
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java

    //46.435: [GC 46.435: [ParNew: 19136K->19136K(19136K), 0.0000274 secs]46.435: [CMS46.458: [CMS-concurrent-sweep: 0.060/0.117 secs] [Times: user=0.21 sys=0.01, real=0.12 secs]
    //public static final ParseRule PARNEW_CONCURRENT_MODE_END = new ParseRule (GC_PREFIX + PARNEW_BLOCK + TIMESTAMP + "\\[CMS" + CMS_PHASE_END + "(?: " + CPU_BREAKDOWN + ")?$");
    //public static final String CMS_PHASE_END = DATE_TIMESTAMP + "\\[CMS-concurrent-(.+): " + CPU_WALLCLOCK + "\\]";
    public void parNewConcurrentModeEnd(GCLogTrace trace, String line) {
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (4 lines)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    /*
    private MemoryPoolSummary extractPermspaceRecord(GCLogTrace trace) {
        int index = (trace.getGroup(2) == null) ? 2 : 4;
```

## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java

    String DATE_STAMP = "\\[" + DATE + "\\]";
    String UPTIME = "\\[" + INTEGER + DECIMAL_POINT + "\\d{3}s\\]";
    String TIME_MILLIS = "\\[\\d+ms\\]";
    String TIME_NANOS = "\\[\\d+ns\\]";
```

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\+` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
     */

    String DATE_STAMP = "\\[" + DATE + "\\]";
    String UPTIME = "\\[" + INTEGER + DECIMAL_POINT + "\\d{3}s\\]";
    String TIME_MILLIS = "\\[\\d+ms\\]";
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
     */

    String DATE_STAMP = "\\[" + DATE + "\\]";
    String UPTIME = "\\[" + INTEGER + DECIMAL_POINT + "\\d{3}s\\]";
    String TIME_MILLIS = "\\[\\d+ms\\]";
```

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
    Pattern TAGS = Pattern.compile(".*(?<=^|\\])\\[([a-z0-9,. ]+)\\]");

    String UNIFIED_META_RECORD = "Metaspace: " + BEFORE_AFTER_CONFIGURED;
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\]` in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java
    //Using zero-width negative lookbehind to miss capturing records formatted like [0x1f03].
    //[0.081s][trace][safepoint] Thread: 0x00007fd0d2006800  [0x1f03] State: _at_safepoint _has_called_back 0 _at_poll_safepoint 0
    Pattern TAGS = Pattern.compile(".*(?<=^|\\])\\[([a-z0-9,. ]+)\\]");

    String UNIFIED_META_RECORD = "Metaspace: " + BEFORE_AFTER_CONFIGURED;
```

### RuleId[ruleID=RegExpRedundantEscape]
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

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\]` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFile.java`
#### Snippet
```java
    // e.g., [0.011s][info ][gc            ] Using G1
    // But have to watch out for things like [ParNew...
    private static final Pattern LINE_STARTS_WITH_DECORATOR = Pattern.compile("^\\[\\d.+?\\]");
    private static final int SHOULD_HAVE_SEEN_A_UNIFIED_DECORATOR_BY_THIS_LINE_IN_THE_LOG = 25;

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\+` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    // Pre-unified tokens
    private static final String TIMESTAMP = "(" + TIME + "): ";
    private static final String DATE_STAMP = "(" + DATE + "): ";
    private static final String DATE_TIMESTAMP = "^(?:" + DATE_STAMP + ")?" + TIMESTAMP;

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\+` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java

    // Unified Tokens
    private static final String DATE_TAG = "\\[" + DATE + "\\]";
    private static final String UPTIME_TAG = "\\[(" + TIME + ")s\\]";

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\]` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java

    // Unified Tokens
    private static final String DATE_TAG = "\\[" + DATE + "\\]";
    private static final String UPTIME_TAG = "\\[(" + TIME + ")s\\]";

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\+` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final String DECIMAL_POINT = "(?:\\.|,)";
    private static final String INTEGER = "\\d+";
    private static final String DATE = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[\\+|\\-]\\d{4}";
    private static final String TIME = INTEGER + DECIMAL_POINT + "\\d{3}";

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\]` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    // Unified Tokens
    private static final String DATE_TAG = "\\[" + DATE + "\\]";
    private static final String UPTIME_TAG = "\\[(" + TIME + ")s\\]";

    // Pre-unified tokens
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\+` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final Pattern PREUNIFIED_DATE_TIMESTAMP = Pattern.compile(DATE_TIMESTAMP);
    // JEP 158 has ISO-8601 time and uptime in seconds and milliseconds as the first two decorators.
    private static final Pattern UNIFIED_DATE_TIMESTAMP = Pattern.compile("^(" + DATE_TAG + ")?(" + UPTIME_TAG + ")?");
    private static final DateTimeStamp EMPTY_DATE = new DateTimeStamp(-1.0d);

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\]` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final Pattern PREUNIFIED_DATE_TIMESTAMP = Pattern.compile(DATE_TIMESTAMP);
    // JEP 158 has ISO-8601 time and uptime in seconds and milliseconds as the first two decorators.
    private static final Pattern UNIFIED_DATE_TIMESTAMP = Pattern.compile("^(" + DATE_TAG + ")?(" + UPTIME_TAG + ")?");
    private static final DateTimeStamp EMPTY_DATE = new DateTimeStamp(-1.0d);

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\]` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final Pattern PREUNIFIED_DATE_TIMESTAMP = Pattern.compile(DATE_TIMESTAMP);
    // JEP 158 has ISO-8601 time and uptime in seconds and milliseconds as the first two decorators.
    private static final Pattern UNIFIED_DATE_TIMESTAMP = Pattern.compile("^(" + DATE_TAG + ")?(" + UPTIME_TAG + ")?");
    private static final DateTimeStamp EMPTY_DATE = new DateTimeStamp(-1.0d);

```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\+` in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final String TIMESTAMP = "(" + TIME + "): ";
    private static final String DATE_STAMP = "(" + DATE + "): ";
    private static final String DATE_TIMESTAMP = "^(?:" + DATE_STAMP + ")?" + TIMESTAMP;

    //  2017-09-07T09:00:12.795+0200: 0.716:
```

## RuleId[ruleID=ObsoleteCollection]
### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Vector` used
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingGCLogFile.java`
#### Snippet
```java
        ZipFile zipFile = new ZipFile(path.toFile());
        List<ZipEntry> entries = zipFile.stream().filter(entry -> !entry.isDirectory()).collect(Collectors.toList());
        Vector<InputStream> streams = new Vector<>();

        try {
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Vector<>` used
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingGCLogFile.java`
#### Snippet
```java
        ZipFile zipFile = new ZipFile(path.toFile());
        List<ZipEntry> entries = zipFile.stream().filter(entry -> !entry.isDirectory()).collect(Collectors.toList());
        Vector<InputStream> streams = new Vector<>();

        try {
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `collectionCycleCounts.keySet()` may be replaced with 'Map.forEach()' iteration
in `sample/src/main/java/com/microsoft/gctoolkit/sample/aggregation/CollectionCycleCountsSummary.java`
#### Snippet
```java
    private String format = "%s : %s\n";
    public void printOn(PrintStream printStream) {
        collectionCycleCounts.keySet().forEach(k -> printStream.printf(format,k, collectionCycleCounts.get(k)));
    }

```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `collectionCycleCounts.keySet()` may be replaced with 'Map.forEach()' iteration
in `IT/src/main/java/com/microsoft/gctoolkit/integration/aggregation/CollectionCycleCountsSummary.java`
#### Snippet
```java
    private String format = "%s : %s\n";
    public void printOn(PrintStream printStream) {
        collectionCycleCounts.keySet().forEach(k -> printStream.printf(format,k, collectionCycleCounts.get(k)));
    }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`s.length() > 0` can be replaced with '!s.isEmpty()'
in `api/src/main/java/com/microsoft/gctoolkit/io/SingleGCLogFile.java`
#### Snippet
```java
        return stream.filter(Objects::nonNull)
                .map(String::trim)
                .filter(s -> s.length() > 0);
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`s.length() > 0` can be replaced with '!s.isEmpty()'
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFile.java`
#### Snippet
```java
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(s -> s.length() > 0)
                .limit(limit);
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`s.length() > 0` can be replaced with '!s.isEmpty()'
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFile.java`
#### Snippet
```java
                    .filter(Objects::nonNull)
                    .map(String::trim)
                    .filter(s -> s.length() > 0)
                    .map(diarizer::diarize)
                    .filter(completed -> completed)
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`s.length() > 0` can be replaced with '!s.isEmpty()'
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingGCLogFile.java`
#### Snippet
```java
                    .filter(Objects::nonNull)
                    .map(String::trim)
                    .filter(s -> s.length() > 0);
        else // yes, this is returning an empty stream.
            return new ArrayList<String>().stream();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`backlog.size() > 0` can be replaced with '!backlog.isEmpty()'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
     */
    private void drainBacklog() throws InterruptedException {
        if (backlog.size() > 0)
            for (JVMEvent event : backlog)
                consumer.record(event);
```

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `value &= states[flag.ordinal()].isTrue()`
in `api/src/main/java/com/microsoft/gctoolkit/jvm/Diary.java`
#### Snippet
```java
        boolean value = true;
        for (SupportedFlags flag : flags) {
            value &= states[flag.ordinal()].isTrue();
        }
        return value;
```

## RuleId[ruleID=UnnecessaryReturn]
### RuleId[ruleID=UnnecessaryReturn]
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

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     */
    private void ignore(GCLogTrace trace, String line) {
        return;
    }

```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/GCToolkitVertx.java`
#### Snippet
```java
                            }
                            if (event instanceof JVMTermination)
                                return;
                        } catch (Throwable t) {
                            LOGGER.throwing(this.getClass().getName(), "start", t);
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
     */
    private void ignore(GCLogTrace trace, String line) {
        return;
    }

```

## RuleId[ruleID=ManualMinMaxCalculation]
### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.min()' call
in `api/src/main/java/com/microsoft/gctoolkit/event/jvm/SurvivorRecord.java`
#### Snippet
```java

    private void setCalculatedThreshold(int calculatedTenuringThresholdFromLog) {
        if (calculatedTenuringThresholdFromLog <= THEORETICAL_MAX_TENURING_THRESHOLD) {
            this.calculatedTenuringThreshold = calculatedTenuringThresholdFromLog;
        } else {
```

### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.min()' call
in `api/src/main/java/com/microsoft/gctoolkit/event/jvm/SurvivorRecord.java`
#### Snippet
```java

    private void setMaxTenuringThreshold(int maxTenuringThresholdFromLog) {
        if (maxTenuringThresholdFromLog <= THEORETICAL_MAX_TENURING_THRESHOLD) {
            this.maxTenuringThreshold = maxTenuringThresholdFromLog;
        } else {
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super EventSource`
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/jvm/GCToolkitVertxParameters.java`
#### Snippet
```java

    // routine to find what this Aggregator Aggregates.
    private static void aggregatorAggregates(Class<?> clazz, Set<EventSource> eventSources) {

        if (clazz == null || clazz == Aggregator.class) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Point`
in `sample/src/main/java/com/microsoft/gctoolkit/sample/collections/XYDataSet.java`
#### Snippet
```java
    }

    protected void addAll(List<Point> items) {
        dataSeries.addAll(items);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends com.microsoft.gctoolkit.integration.collections.XYDataSet.Point`
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java
    }

    protected void addAll(List<com.microsoft.gctoolkit.integration.collections.XYDataSet.Point> items) {
        dataSeries.addAll(items);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GCLogFileSegment`
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingGCLogFile.java`
#### Snippet
```java
    }

    private Stream<String> stream(LogFileMetadata metadata, LinkedList<GCLogFileSegment> segments) throws IOException {
        //todo: find rolling files....
        if (metadata.isPlainText() || metadata.isDirectory()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends LogFileSegment`
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
    }

    private List<LogFileSegment> removeIneligibleSegments(final List<LogFileSegment> logFileSegments, final LogFileSegment current) {
        return logFileSegments.stream()
                .filter( segment -> segment.getEndTime() <= current.getStartTime())
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends LogFileParser`
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/GCToolkitVertx.java`
#### Snippet
```java
     * @throws IOException If an IOException is thrown while reading the DataSource
     */
    public static DateTimeStamp aggregateDataSource(DataSource<?> dataSource, Set<LogFileParser> logFileParsers, Set<AggregatorVerticle> aggregatorVerticles,  String mailBox) throws IOException {
    	//remove AggregatorVerticle which can not match by the LogFileParser to prevent dead loop
        aggregatorVerticles.removeIf(aggregatorVerticle->{
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AggregatorVerticle`
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/GCToolkitVertx.java`
#### Snippet
```java
     * @throws IOException If an IOException is thrown while reading the DataSource
     */
    public static DateTimeStamp aggregateDataSource(DataSource<?> dataSource, Set<LogFileParser> logFileParsers, Set<AggregatorVerticle> aggregatorVerticles,  String mailBox) throws IOException {
    	//remove AggregatorVerticle which can not match by the LogFileParser to prevent dead loop
        aggregatorVerticles.removeIf(aggregatorVerticle->{
```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `abstract public`
in `api/src/main/java/com/microsoft/gctoolkit/io/FileDataSource.java`
#### Snippet
```java
     * @return a diary.
     */
    abstract public Diary diary() throws IOException;

    /**
```

## RuleId[ruleID=ExplicitArrayFilling]
### RuleId[ruleID=ExplicitArrayFilling]
Can be replaced with single 'Arrays.fill()' method call
in `api/src/main/java/com/microsoft/gctoolkit/jvm/Diary.java`
#### Snippet
```java
    public Diary() {
        states = new TripleState[SupportedFlags.values().length];
        for (int i = 0; i < states.length; i++) states[i] = TripleState.UNKNOWN;
    }

```

## RuleId[ruleID=AccessStaticViaInstance]
### RuleId[ruleID=AccessStaticViaInstance]
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

### RuleId[ruleID=AccessStaticViaInstance]
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

### RuleId[ruleID=AccessStaticViaInstance]
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

### RuleId[ruleID=AccessStaticViaInstance]
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

### RuleId[ruleID=AccessStaticViaInstance]
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

### RuleId[ruleID=AccessStaticViaInstance]
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

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `groupCount()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
    }

    public int groupCount() {
        return trace.groupCount();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `getLongGroup()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
    }

    public long getLongGroup(int index) {
        return Long.parseLong(trace.group(index));
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `getIntegerGroup()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
    }

    public int getIntegerGroup(int index) {
        return Integer.parseInt(trace.group(index));
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `groupNotNull()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
    }

    public boolean groupNotNull(int index) {
        return getGroup(index) != null;
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `extractReferenceBlock()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
    }

    GCLogTrace extractReferenceBlock(String line, GCParseRule rule) {
        return rule.parse(line);
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `getTotalOccupancyWithTotalHeapSizeSummary()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
    }

    MemoryPoolSummary getTotalOccupancyWithTotalHeapSizeSummary(GCLogTrace trace, int offset) {
        MemoryPoolSummary summary = trace.getOccupancyWithMemoryPoolSizeSummary(offset);
        return summary;
```

### RuleId[ruleID=RedundantMethodOverride]
Method `extractCPUSummary()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
    }

    CPUSummary extractCPUSummary(String line) {
        GCLogTrace trace;
        if ((trace = CPU_BREAKDOWN.parse(line)) != null) {
```

### RuleId[ruleID=RedundantMethodOverride]
Method `extractPermGenRecord()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
    }

    MemoryPoolSummary extractPermGenRecord(GCLogTrace trace) {
        int index = (trace.getGroup(2) == null) ? 2 : 4;
        return new PermGenSummary(trace.getLongGroup(index), trace.getLongGroup(4), trace.getLongGroup(6));
```

### RuleId[ruleID=RedundantMethodOverride]
Method `getTotalOccupancyBeforeAfterWithTotalHeapPoolSizeSummary()` is identical to its super method
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java

    // todo: mixes aggregator with parsing. premature optimization...
    MemoryPoolSummary getTotalOccupancyBeforeAfterWithTotalHeapPoolSizeSummary(GCLogTrace trace, int offset) {
        MemoryPoolSummary summary = trace.getOccupancyBeforeAfterWithMemoryPoolSizeSummary(offset);
        return summary;
```

### RuleId[ruleID=RedundantMethodOverride]
Method `hasWarning()` is identical to its super method
in `IT/src/main/java/com/microsoft/gctoolkit/integration/aggregation/PauseTimeSummary.java`
#### Snippet
```java

    @Override
    public boolean hasWarning() {
        return false;
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `isEmpty()` is identical to its super method
in `IT/src/main/java/com/microsoft/gctoolkit/integration/aggregation/PauseTimeSummary.java`
#### Snippet
```java

    @Override
    public boolean isEmpty() {
        return false;
    }
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getBefore() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
        switch (trace.getGroup(1)) {
            case "Eden":
                forwardReference.setEdenOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setEdenOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setEdenSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getAfter() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
            case "Eden":
                forwardReference.setEdenOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setEdenOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setEdenSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setEdenSizeAfterCollection(summary.getAssigned() * regionSize * 1024);
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getBefore() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                forwardReference.setEdenOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setEdenOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setEdenSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setEdenSizeAfterCollection(summary.getAssigned() * regionSize * 1024);
                break;
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getAssigned() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                forwardReference.setEdenOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setEdenSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setEdenSizeAfterCollection(summary.getAssigned() * regionSize * 1024);
                break;
            case "Survivor":
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getBefore() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                break;
            case "Survivor":
                forwardReference.setSurvivorOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setSurvivorOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setSurvivorSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getAfter() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
            case "Survivor":
                forwardReference.setSurvivorOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setSurvivorOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setSurvivorSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setSurvivorSizeAfterCollection(summary.getAssigned() * regionSize * 1024);
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getBefore() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                forwardReference.setSurvivorOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setSurvivorOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setSurvivorSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setSurvivorSizeAfterCollection(summary.getAssigned() * regionSize * 1024);
                break;
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getAssigned() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                forwardReference.setSurvivorOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setSurvivorSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setSurvivorSizeAfterCollection(summary.getAssigned() * regionSize * 1024);
                break;
            case "Old":
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getBefore() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                break;
            case "Old":
                forwardReference.setOldOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setOldOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setOldSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getAfter() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
            case "Old":
                forwardReference.setOldOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setOldOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setOldSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setOldSizeAfterCollection(summary.getAfter() * regionSize * 1024);
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getBefore() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                forwardReference.setOldOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setOldOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setOldSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setOldSizeAfterCollection(summary.getAfter() * regionSize * 1024);
                break;
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getAfter() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                forwardReference.setOldOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setOldSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setOldSizeAfterCollection(summary.getAfter() * regionSize * 1024);
                break;
            case "Humongous":
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getBefore() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                break;
            case "Humongous":
                forwardReference.setHumongousOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setHumongousOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setHumongousSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getAfter() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
            case "Humongous":
                forwardReference.setHumongousOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setHumongousOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setHumongousSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setHumongousSizeAfterCollection(summary.getAfter() * regionSize * 1024);
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getBefore() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                forwardReference.setHumongousOccupancyBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setHumongousOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setHumongousSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setHumongousSizeAfterCollection(summary.getAfter() * regionSize * 1024);
                break;
```

### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
summary.getAfter() \* regionSize \* 1024: integer multiplication implicitly cast to long
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                forwardReference.setHumongousOccupancyAfterCollection(summary.getAfter() * regionSize * 1024);
                forwardReference.setHumongousSizeBeforeCollection(summary.getBefore() * regionSize * 1024);
                forwardReference.setHumongousSizeAfterCollection(summary.getAfter() * regionSize * 1024);
                break;
            case "Archive":
```

## RuleId[ruleID=SimplifyOptionalCallChains]
### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
                .filter(tuple -> tuple.getValue() != null)
                .findFirst();
        if (!ruleToApply.isPresent()) {
            log(line);
            return;
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
                .filter(tuple -> tuple.getValue() != null)
                .findFirst();
        if (!ruleToApply.isPresent()) {
            log(line);
            return;
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `api/src/main/java/com/microsoft/gctoolkit/event/jvm/JVMTermination.java`
#### Snippet
```java

    public double getEstimatedRuntimeDuration() {
        return super.getDateTimeStamp().minus(startTime);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java

    public String getVMOP() {
        return super.getGroup(VMOP);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
                    return;
            }
            super.advanceClock(trace.getDateTimeStamp());
        } catch (Throwable t) {
            LOGGER.log(Level.FINE, "[PARSING ERROR] " + record, t);
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGCLogParser.java`
#### Snippet
```java
        try {
            DateTimeStamp now = new Decorators(record).getDateTimeStamp();
            super.advanceClock(now);
        } catch (Throwable t) {
            LOGGER.log(Level.FINE, "[PARSING ERROR] " + record, t);
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
            LOGGER.warning("Young pause event not recorded: " + pauseEvent.getGcID());
        if (diary.isCMS())
            pauseEvent = new GenerationalForwardReference(ParNew, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
        else if (diary.isPSYoung())
            pauseEvent = new GenerationalForwardReference(PSYoungGen, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
            pauseEvent = new GenerationalForwardReference(ParNew, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
        else if (diary.isPSYoung())
            pauseEvent = new GenerationalForwardReference(PSYoungGen, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
        else if (diary.isSerialFull())
            pauseEvent = new GenerationalForwardReference(DefNew, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
            pauseEvent = new GenerationalForwardReference(PSYoungGen, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
        else if (diary.isSerialFull())
            pauseEvent = new GenerationalForwardReference(DefNew, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
        else {
            LOGGER.warning("Unrecognized collection phase -> " + line);
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
        if (pauseEvent == null) {
            if (diary.isPSOldGen())
                pauseEvent = new GenerationalForwardReference(PSFull, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
            else
                pauseEvent = new GenerationalForwardReference(FullGC, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
                pauseEvent = new GenerationalForwardReference(PSFull, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
            else
                pauseEvent = new GenerationalForwardReference(FullGC, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
            pauseEvent.setStartTime(getClock());
        } else if (pauseEvent.getGarbageCollectionType() == ParNew) {
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
        } else if (pauseEvent.getGarbageCollectionType() != ConcurrentModeFailure) {
            LOGGER.warning("Maybe Full Pause event not recorded: " + pauseEvent.getGcID()); //todo: difficult to know if this is a full or a CMF
            pauseEvent = new GenerationalForwardReference(FullGC, new Decorators(line), super.GCID_COUNTER.parse(line).getIntegerGroup(1));
            pauseEvent.setStartTime(getClock());
        }
```

## RuleId[ruleID=UNUSED_IMPORT]
### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.microsoft.gctoolkit.integration.shared.OneRuntimeAggregator;`
in `IT/src/main/java/com/microsoft/gctoolkit/integration/shared/TwoRuntimeReport.java`
#### Snippet
```java
import com.microsoft.gctoolkit.aggregator.Aggregation;
import com.microsoft.gctoolkit.aggregator.Collates;
import com.microsoft.gctoolkit.integration.shared.OneRuntimeAggregator;
import com.microsoft.gctoolkit.integration.shared.SharedAggregation;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.Set;`
in `api/src/main/java/com/microsoft/gctoolkit/jvm/JavaVirtualMachine.java`
#### Snippet
```java

import java.util.Optional;
import java.util.Set;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
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

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.concurrent.atomic.AtomicInteger;`
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/aggregator/AggregatorVerticle.java`
#### Snippet
```java
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointParser.java`
#### Snippet
```java
    protected void process(String line) {
        SafepointTrace trace;
        if ((trace = TRACE.parse(line)) != null) {
            Safepoint safepoint = trace.toSafepoint();
            consumer.record(safepoint);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
    CPUSummary extractCPUSummary(String line) {
        GCLogTrace trace;
        if ((trace = CPU_BREAKDOWN.parse(line)) != null) {
            return new CPUSummary(trace.getDoubleGroup(1), trace.getDoubleGroup(2), trace.getDoubleGroup(3));
        }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
        double unloading = 0.0d, symbolTable = 0.0d, stringTable = 0.0d, stringAndSymbolTable = 0.0d;

        if ((clause = CLASS_UNLOADING.parse(line)) != null)
            unloading = clause.getDoubleGroup(2);
        if ((clause = SYMBOL_TABLE_SCRUB.parse(line)) != null)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
        if ((clause = CLASS_UNLOADING.parse(line)) != null)
            unloading = clause.getDoubleGroup(2);
        if ((clause = SYMBOL_TABLE_SCRUB.parse(line)) != null)
            symbolTable = clause.getDoubleGroup(2);
        if ((clause = STRING_TABLE_SCRUB.parse(line)) != null)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
        if ((clause = SYMBOL_TABLE_SCRUB.parse(line)) != null)
            symbolTable = clause.getDoubleGroup(2);
        if ((clause = STRING_TABLE_SCRUB.parse(line)) != null)
            stringTable = clause.getDoubleGroup(2);
        if ((clause = STRING_AND_SYMBOL_SCRUB.parse(line)) != null)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
        if ((clause = STRING_TABLE_SCRUB.parse(line)) != null)
            stringTable = clause.getDoubleGroup(2);
        if ((clause = STRING_AND_SYMBOL_SCRUB.parse(line)) != null)
            stringAndSymbolTable = clause.getDoubleGroup(2);

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                youngCollectionCount++;

                if ((trace = ParallelPatterns.PSYOUNGGEN.parse(line)) != null) {
                    getDiary().setTrue(SupportedFlags.GC_DETAILS);
                    getDiary().setFalse(SupportedFlags.TENURING_DISTRIBUTION);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                youngCollectionCount++;

                if ((trace = CMSPatterns.PARNEW.parse(line)) != null) {
                    getDiary().setTrue(SupportedFlags.GC_DETAILS);
                    getDiary().setFalse(SupportedFlags.TENURING_DISTRIBUTION, SupportedFlags.CMS_DEBUG_LEVEL_1, SupportedFlags.MAX_TENURING_THRESHOLD_VIOLATION);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                    getDiary().setFalse(SupportedFlags.TENURING_DISTRIBUTION, SupportedFlags.CMS_DEBUG_LEVEL_1, SupportedFlags.MAX_TENURING_THRESHOLD_VIOLATION);
                    setGCCause(trace.getGroup(4));
                } else if ((trace = CMSPatterns.PARNEW_TENURING.parse(line)) != null) {
                    getDiary().setTrue(SupportedFlags.GC_DETAILS, SupportedFlags.TENURING_DISTRIBUTION);
                    getDiary().setFalse(SupportedFlags.CMS_DEBUG_LEVEL_1);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                    getDiary().setFalse(SupportedFlags.CMS_DEBUG_LEVEL_1);
                    setGCCause(trace.getGroup(3));
                } else if ((trace = SimplePatterns.PARNEW_NO_DETAILS.parse(line)) != null) {
                    getDiary().setFalse(SupportedFlags.GC_DETAILS, SupportedFlags.TENURING_DISTRIBUTION, SupportedFlags.CMS_DEBUG_LEVEL_1, SupportedFlags.PRINT_HEAP_AT_GC, SupportedFlags.MAX_TENURING_THRESHOLD_VIOLATION);
                    setGCCause(trace.getGroup(3));
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                    getDiary().setFalse(SupportedFlags.GC_DETAILS, SupportedFlags.TENURING_DISTRIBUTION, SupportedFlags.CMS_DEBUG_LEVEL_1, SupportedFlags.PRINT_HEAP_AT_GC, SupportedFlags.MAX_TENURING_THRESHOLD_VIOLATION);
                    setGCCause(trace.getGroup(3));
                } else if ((trace = SimplePatterns.PARNEW_START.parse(line)) != null) {
                    getDiary().setFalse(SupportedFlags.GC_DETAILS, SupportedFlags.CMS_DEBUG_LEVEL_1, SupportedFlags.ADAPTIVE_SIZING, SupportedFlags.PRINT_HEAP_AT_GC);
                    setGCCause(trace.groupCount() > 2 ? trace.getGroup(3) : null);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                    getDiary().setFalse(SupportedFlags.GC_DETAILS, SupportedFlags.CMS_DEBUG_LEVEL_1, SupportedFlags.ADAPTIVE_SIZING, SupportedFlags.PRINT_HEAP_AT_GC);
                    setGCCause(trace.groupCount() > 2 ? trace.getGroup(3) : null);
                } else if ((trace = CMSPatterns.PARNEW_REFERENCE_SPLIT.parse(line)) != null) {
                    getDiary().setTrue(SupportedFlags.TENURING_DISTRIBUTION, SupportedFlags.PRINT_REFERENCE_GC);
                    setGCCause(trace.getGroup(3));
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                    setGCCause(trace.getGroup(3));
                }
            } else if ((trace = SerialPatterns.DEFNEW.parse(line)) != null) {
                collectionCount++;
                youngCollectionCount++;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                getDiary().setFalse(SupportedFlags.PARALLELGC, SupportedFlags.PARALLELOLDGC, SupportedFlags.PARNEW, SupportedFlags.G1GC, SupportedFlags.TENURING_DISTRIBUTION, SupportedFlags.RSET_STATS, SupportedFlags.MAX_TENURING_THRESHOLD_VIOLATION);
                setGCCause(trace.getGroup(3));
            } else if ((trace = SerialPatterns.DEFNEW_TENURING.parse(line)) != null) {
                collectionCount++;
                youngCollectionCount++;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                simpleFullGCDetected = true;
                simpleParallelOrParNewDetected = true;
            } else if ((trace = SimplePatterns.GC_START.parse(line)) != null) {
                collectionCount++;
                simpleParallelOrParNewDetected = true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                simpleCMSCycleDetected = true;
                firstCMSCycle = true;
            } else if ((trace = G1GCPatterns.G1_YOUNG_SPLIT_START.parse(line)) != null) {
                collectionCount++;
                youngCollectionCount++;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                    getDiary().setFalse(SupportedFlags.PRE_JDK70_40);
                }
            } else if ((trace = G1GCPatterns.G1_DETAILS.parse(line)) != null) {
                collectionCount++;
                youngCollectionCount++;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                    getDiary().setFalse(SupportedFlags.PRE_JDK70_40);
                }
            } else if ((trace = G1GCPatterns.YOUNG.parse(line)) != null) {
                collectionCount++;
                youngCollectionCount++;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java

                //2014-10-21T11:49:08.954-0500: 12053.551: [GC pause (young)12054.116: [SoftReference, 0 refs, 0.0000070 secs]12054.116: [WeakReference, 234 refs, 0.0000640 secs]12054.116: [FinalReference, 3805 refs, 0.0034010 secs]12054.119: [PhantomReference, 9 refs, 0.0000040 secs]12054.119: [JNI Weak Reference, 0.0001960 secs], 0.58191800 secs]
            } else if ((trace = G1GCPatterns.G1_DETAILS_REFERENCE_GC.parse(line)) != null) {
                collectionCount++;
                youngCollectionCount++;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java

        if (getDiary().isTrue(SupportedFlags.ADAPTIVE_SIZING)) {
            if ((trace = G1GCPatterns.YOUNG_SPLIT_BY_G1ERGONOMICS.parse(line)) != null) {
                collectionCount++;
                youngCollectionCount++;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
        //Can get a lot of information from the perm space record
        // (CMS Perm |PS Perm |Perm |PSPermGen|Metaspace)
        if ((trace = ParallelPatterns.PERM_SPACE_RECORD.parse(line)) != null) {
            String value = trace.getGroup(1).trim();

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
            getDiary().setTrue(SupportedFlags.GC_CAUSE);
        } else if (getDiary().isGenerationalKnown() && getDiary().isGenerational()) {
            if ((trace = PREFIX.parse(line)) != null) {
                if ((trace.getGroup(3) == null) && getDiary().isTrue(SupportedFlags.GC_DETAILS)) {
                    getDiary().setTrue(SupportedFlags.JDK70);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                    getDiary().setFalse(SupportedFlags.PRE_JDK70_40);
                }
            } else if ((trace = FULL_PREFIX.parse(line)) != null) {
                if ((trace.getGroup(3) == null) && getDiary().isTrue(SupportedFlags.GC_DETAILS)) {
                    getDiary().setTrue(SupportedFlags.JDK70);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java

        } else if (getDiary().isG1GCKnown() && getDiary().isG1GC()) {
            if ((trace = G1GC_PREFIX.parse(line)) != null) {
                if (getDiary().isTrue(SupportedFlags.GC_DETAILS) && (trace.gcCause() == GCCause.GCCAUSE_NOT_SET)) {
                    getDiary().setTrue(SupportedFlags.JDK70);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
        GCLogTrace trace;

        if ((trace = PREFIX.parse(line)) != null) {
            String cause = trace.getGroup(3);
            if (cause != null) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
                }
            } else {
                if ((trace = G1GC_PREFIX.parse(line)) != null) {
                    cause = trace.getGroup(3);
                    if (cause == null)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java

        GCLogTrace gcLogTrace;
        if ((gcLogTrace = MEMORY_SUMMARY_RULE.parse(line)) != null) {
            if (gcLogTrace.next() != null)
                getDiary().setTrue(SupportedFlags.GC_DETAILS);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
            getDiary().setFalse(SupportedFlags.PRINT_HEAP_AT_GC);

        if ((trace = TenuredPatterns.TENURING_SUMMARY.parse(line)) != null) {

            //we have seen at least one good tenuring summary without an age breakdown
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java

        //this rule must be evaluated before CONCURRENT_PHASE_END_BLOCK
        if ((trace = ABORT_PRECLEAN_DUE_TO_TIME_CLAUSE.parse(line)) != null)
            abortPrecleanDueToTime(trace);
        else if ((trace = CONCURRENT_PHASE_START_BLOCK.parse(line)) != null)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
        if ((trace = ABORT_PRECLEAN_DUE_TO_TIME_CLAUSE.parse(line)) != null)
            abortPrecleanDueToTime(trace);
        else if ((trace = CONCURRENT_PHASE_START_BLOCK.parse(line)) != null)
            startOfConcurrentPhase(trace);
        else if ((trace = CONCURRENT_PHASE_END_BLOCK.parse(line)) != null)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
        else if ((trace = CONCURRENT_PHASE_START_BLOCK.parse(line)) != null)
            startOfConcurrentPhase(trace);
        else if ((trace = CONCURRENT_PHASE_END_BLOCK.parse(line)) != null)
            endOfConcurrentPhase(trace);
        else if ((trace = PRECLEAN_REFERENCE.parse(line)) != null)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
        else if ((trace = CONCURRENT_PHASE_END_BLOCK.parse(line)) != null)
            endOfConcurrentPhase(trace);
        else if ((trace = PRECLEAN_REFERENCE.parse(line)) != null)
            endConcurrentPrecleanWithReferenceProcessing(trace);
        else if ((trace = INITIAL_MARK.parse(line)) != null)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
        else if ((trace = PRECLEAN_REFERENCE.parse(line)) != null)
            endConcurrentPrecleanWithReferenceProcessing(trace);
        else if ((trace = INITIAL_MARK.parse(line)) != null)
            initialMark(trace);
        else if ((trace = REMARK_CLAUSE.parse(line)) != null)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
        else if ((trace = INITIAL_MARK.parse(line)) != null)
            initialMark(trace);
        else if ((trace = REMARK_CLAUSE.parse(line)) != null)
            remark(trace, line);
        else if ((trace = REMARK_REFERENCE_PROCESSING.parse(line)) != null)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
        else if ((trace = REMARK_CLAUSE.parse(line)) != null)
            remark(trace, line);
        else if ((trace = REMARK_REFERENCE_PROCESSING.parse(line)) != null)
            remarkWithReferenceProcessing(trace, line);
        else if ((trace = SPLIT_REMARK.parse(line)) != null)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
        else if ((trace = REMARK_REFERENCE_PROCESSING.parse(line)) != null)
            remarkWithReferenceProcessing(trace, line);
        else if ((trace = SPLIT_REMARK.parse(line)) != null)
            startOfPhase = getClock();
        else if ((trace = EndOfFile.parse(line)) != null) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
        else if ((trace = SPLIT_REMARK.parse(line)) != null)
            startOfPhase = getClock();
        else if ((trace = EndOfFile.parse(line)) != null) {
            consumer.record(new JVMTermination(getClock(),diary.getTimeOfFirstEvent()));
        }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
        int index = 0;
        String key;
        while ((key = fullGCInternalPhaseOrder.get(++index)) != null) {
            collection.addInternalPhase(key, fullGCInternalPhases.get(key));
        }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileSegment.java`
#### Snippet
```java
        if (linesFound > 0) {
            String line;
            while ((line = randomAccessFile.readLine()) != null) {
                lines.add(line);
            }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java

        try {
            if ((trace = APPLICATION_STOP_TIME.parse(line)) != null) {
                if (lastEventWasGC) {
                    // can estimate TTSP
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java
                    consumer.record(new ApplicationStoppedTime(trace.getDateTimeStamp(), trace.getDoubleGroup(3), lastEventWasGC));
                }
            } else if ((trace = APPLICATION_STOP_TIME_WITH_STOPPING_TIME.parse(line)) != null) {
                consumer.record(new ApplicationStoppedTime(trace.getDateTimeStamp(), trace.getDoubleGroup(3), trace.getDoubleGroup(4), lastEventWasGC));
                lastEventWasGC = false;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java
                lastEventWasGC = false;
                gcPauseTime = GCPAUSE_TIME_NOT_SET;
            } else if ((trace = APPLICATION_TIME.parse(line)) != null) {
                consumer.record(new ApplicationConcurrentTime(trace.getDateTimeStamp(), trace.getDoubleGroup(3)));
                lastEventWasGC = false;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java
                consumer.record(new ApplicationConcurrentTime(trace.getDateTimeStamp(), trace.getDoubleGroup(3)));
                lastEventWasGC = false;
            } else if ((trace = SIMPLE_APPLICATION_STOP_TIME.parse(line)) != null) {
                safePoints.add(new StoppedTime(trace.getDoubleGroup(1), safePoints.isEmpty()));
            } else if ((trace = SIMPLE_APPLICATION_TIME.parse(line)) != null) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java
            } else if ((trace = SIMPLE_APPLICATION_STOP_TIME.parse(line)) != null) {
                safePoints.add(new StoppedTime(trace.getDoubleGroup(1), safePoints.isEmpty()));
            } else if ((trace = SIMPLE_APPLICATION_TIME.parse(line)) != null) {
                safePoints.add(new ConcurrentTime(trace.getDoubleGroup(3)));
            } else if ((trace = GC_PAUSE_CLAUSE.parse(line)) != null) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java
            } else if ((trace = SIMPLE_APPLICATION_TIME.parse(line)) != null) {
                safePoints.add(new ConcurrentTime(trace.getDoubleGroup(3)));
            } else if ((trace = GC_PAUSE_CLAUSE.parse(line)) != null) {
                gcPauseTime = trace.getPauseTime();
                lastEventWasGC = true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java
                gcPauseTime = trace.getPauseTime();
                lastEventWasGC = true;
            } else if ((trace = TLAB_START.parse(line)) != null) {
                extractTLAB(trace, 2);
            } else if ((trace = TLAB_CONT.parse(line)) != null) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java
            } else if ((trace = TLAB_START.parse(line)) != null) {
                extractTLAB(trace, 2);
            } else if ((trace = TLAB_CONT.parse(line)) != null) {
                extractTLAB(trace, 0);
            } else if ((trace = TLAB_TOTALS.parse(line)) != null) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java
            } else if ((trace = TLAB_CONT.parse(line)) != null) {
                extractTLAB(trace, 0);
            } else if ((trace = TLAB_TOTALS.parse(line)) != null) {
                extractTLABSummary(trace);
            } else if (line.equals(END_OF_DATA_SENTINEL)) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/SurvivorMemoryPoolParser.java`
#### Snippet
```java
        GCLogTrace trace;

        if ((trace = TENURING_SUMMARY.parse(entry)) != null) {
            forwardReference = new SurvivorRecord(getClock(), trace.getLongGroup(1), trace.getIntegerGroup(2), trace.getIntegerGroup(3));
        } else if ((trace = TENURING_AGE_BREAKDOWN.parse(entry)) != null) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/SurvivorMemoryPoolParser.java`
#### Snippet
```java
        if ((trace = TENURING_SUMMARY.parse(entry)) != null) {
            forwardReference = new SurvivorRecord(getClock(), trace.getLongGroup(1), trace.getIntegerGroup(2), trace.getIntegerGroup(3));
        } else if ((trace = TENURING_AGE_BREAKDOWN.parse(entry)) != null) {
            forwardReference.add(trace.getIntegerGroup(1), trace.getLongGroup(2));
        } else if (entry.equals(END_OF_DATA_SENTINEL) || (JVM_EXIT.parse(entry) != null)) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
        try {

            if ((trace = UNIFIED_LOGGING_APPLICATION_STOP_TIME_WITH_STOPPING_TIME.parse(line)) != null) {
                if (safePointReason != null)
                    consumer.record(new ApplicationStoppedTime(timeStamp, trace.getDoubleGroup(1), trace.getDoubleGroup(2), safePointReason));
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
            } else if (GC_PAUSE_CLAUSE.parse(line) != null) {
                gcPause = true;
            } else if ((trace = SAFEPOINT_REGION.parse(line)) != null) {
                timeStamp = getClock();
                safePointReason = ApplicationStoppedTime.VMOperations.valueOf(trace.getGroup(1));
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
                timeStamp = getClock();
                safePointReason = ApplicationStoppedTime.VMOperations.valueOf(trace.getGroup(1));
            } else if ((trace = LEAVING_SAFEPOINT.parse(line)) != null) {
            } //noop this one.

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
            } //noop this one.

            else if ((trace = UNIFIED_LOGGING_APPLICATION_TIME.parse(line)) != null) {
                consumer.record(new ApplicationConcurrentTime(getClock(), trace.getDoubleGroup(1)));
            } else if (line.equals(END_OF_DATA_SENTINEL) || (JVM_EXIT.parse(line) != null)) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedSurvivorMemoryPoolParser.java`
#### Snippet
```java
        GCLogTrace trace;

        if ((trace = DESIRED_SURVIVOR_SIZE.parse(entry)) != null) {
            forwardReference = new SurvivorRecord(new Decorators(entry).getDateTimeStamp(), trace.getLongGroup(1), trace.getIntegerGroup(2), trace.getIntegerGroup(3));
        } else if ((trace = AGE_TABLE_HEADER.parse(entry)) != null) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedSurvivorMemoryPoolParser.java`
#### Snippet
```java
        if ((trace = DESIRED_SURVIVOR_SIZE.parse(entry)) != null) {
            forwardReference = new SurvivorRecord(new Decorators(entry).getDateTimeStamp(), trace.getLongGroup(1), trace.getIntegerGroup(2), trace.getIntegerGroup(3));
        } else if ((trace = AGE_TABLE_HEADER.parse(entry)) != null) {
            //we've collected this data so.. eat it...
        } else if ((trace = AGE_RECORD.parse(entry)) != null) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedSurvivorMemoryPoolParser.java`
#### Snippet
```java
        } else if ((trace = AGE_TABLE_HEADER.parse(entry)) != null) {
            //we've collected this data so.. eat it...
        } else if ((trace = AGE_RECORD.parse(entry)) != null) {
            forwardReference.add(trace.getIntegerGroup(1), trace.getLongGroup(2));
            ageDataCollected = true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
        ReferenceGCSummary summary = new ReferenceGCSummary();
        GCLogTrace trace;
        if ((trace = extractReferenceBlock(line, SOFT_REFERENCE)) != null)
            summary.addSoftReferences(trace.getDateTimeStamp(), trace.getIntegerGroup(3), trace.getDuration());

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
            summary.addSoftReferences(trace.getDateTimeStamp(), trace.getIntegerGroup(3), trace.getDuration());

        if ((trace = extractReferenceBlock(line, WEAK_REFERENCE)) != null)
            summary.addWeakReferences(trace.getDateTimeStamp(), trace.getIntegerGroup(3), trace.getDuration());

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
            summary.addWeakReferences(trace.getDateTimeStamp(), trace.getIntegerGroup(3), trace.getDuration());

        if ((trace = extractReferenceBlock(line, FINAL_REFERENCE)) != null)
            summary.addFinalReferences(trace.getDateTimeStamp(), trace.getIntegerGroup(3), trace.getDuration());

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
            summary.addFinalReferences(trace.getDateTimeStamp(), trace.getIntegerGroup(3), trace.getDuration());

        if ((trace = extractReferenceBlock(line, PHANTOM_REFERENCE)) != null) {
            if (trace.groupNotNull(4))
                summary.addPhantomReferences(trace.getDateTimeStamp(), trace.getIntegerGroup(3), trace.getIntegerGroup(4), trace.getDuration());
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
        }

        if ((trace = extractReferenceBlock(line, JNI_REFERENCE)) != null) {
            if (trace.groupNotNull(3))
                summary.addJNIWeakReferences(trace.getDateTimeStamp(), trace.getIntegerGroup(3), trace.getDuration());
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
    CPUSummary extractCPUSummary(String line) {
        GCLogTrace trace;
        if ((trace = CPU_BREAKDOWN.parse(line)) != null) {
            return new CPUSummary(trace.getDoubleGroup(1), trace.getDoubleGroup(2), trace.getDoubleGroup(3));
        }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
        GCLogTrace trace;
        MemoryPoolSummary metaDataPool = null;
        if ((trace = PERM_SPACE_RECORD.parse(line)) != null) {
            String type = trace.getGroup(1).trim();
            if ("CMS Perm".equals(type))
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
                }
            }
        } else if ((trace = META_SPACE_RECORD.parse(line)) != null) {
            int index = (trace.getGroup(1) == null) ? 1 : 3;
            metaDataPool = new MetaspaceRecord(trace.toKBytes(index), trace.toKBytes(3), trace.toKBytes(5));
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `api/src/main/java/com/microsoft/gctoolkit/jvm/Diary.java`
#### Snippet
```java
        boolean first = true;
        for(SupportedFlags flag : SupportedFlags.values()) {
            if (!first || (first = false)) {
                buffer.append(", ");
            }
```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java
        machine.getAggregation(HeapOccupancyAfterCollectionSummary.class)
                .map(HeapOccupancyAfterCollectionSummary::get)
                .ifPresent(summary -> {
                    summary.forEach((gcType, dataSet) -> {
                        System.out.printf(message, gcType, dataSet.size());
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `tagsAndLevels` are updated, but never queried
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/UnifiedDiarizer.java`
#### Snippet
```java

    private final Diary diary;
    private final TreeSet<String> tagsAndLevels = new TreeSet<>();
    private int stopTheWorldEvents = 0;

```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `phases` are updated, but never queried
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalForwardReference.java`
#### Snippet
```java
    private MetaspaceRecord classspace = null;
    private final Map<String, Double> remarkPhases = new ConcurrentHashMap<>();
    private final Map<String, Double> phases = new ConcurrentHashMap<>();

    public GenerationalForwardReference(GarbageCollectionTypes gcType, Decorators decorators, int gcid) {
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `tlabRecords` are updated, but never queried
in `api/src/main/java/com/microsoft/gctoolkit/event/TLABSummary.java`
#### Snippet
```java
public class TLABSummary {

    private ArrayList<String> tlabRecords;

    public TLABSummary() {
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `backlog` are queried, but never updated
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    private DateTimeStamp concurrentPhaseStartTimeStamp;
    private GarbageCollectionTypes concurrentCollectionTypeForwardReference;
    private final ConcurrentLinkedQueue<JVMEvent> backlog = new ConcurrentLinkedQueue<>();

    private final MRUQueue<GCParseRule, BiConsumer<GCLogTrace, String>> parseRules;
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `IT/src/main/java/com/microsoft/gctoolkit/integration/aggregation/HeapOccupancyAfterCollection.java`
#### Snippet
```java
    }

    private void extractHeapOccupancy(ShenandoahCycle event) {
        //aggregation().addDataPoint(event.getGarbageCollectionType(), event.getDateTimeStamp(), event.getOccupancy());
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `api/src/main/java/com/microsoft/gctoolkit/event/TLABSummary.java`
#### Snippet
```java
    }

    public void addTLABRecord() {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1Trap.java`
#### Snippet
```java
    }

    public void execute(Aggregator<?> aggregator) {
    }
}
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    private void parNewFLSHeader(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    private void parNewFLSSeparator(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    private void flsLargeBlockProximity(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    private void flsLargeBlock(GCLogTrace trace, String line) {
    }
    
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    // For example, parseRules.put(MY_NEW_PARSE_RULE, this::noop);
    // It is then possible to set a breakpoint in this method to examine the details of the GCLogTrace.
    private void noop(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    public void plabEntry(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    public void plabSummary(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    public void concurrentPhaseStart(GCLogTrace trace, String line) {
        //not interesting to this parser
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    public void concurrentPhaseEnd(GCLogTrace trace, String line) {
        //not interesting to this parser
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    public void abortPrecleanDueToTimeClause(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    public void fullSplitByConcurrentPhase(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    public void concurrentPhaseYields(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    private void precleanTimedoutWithCards(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    private void shouldCollectConcurrent(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    private void psYoungAdaptivePolicySizeStart(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    private void psYoungAdaptivePolicySizeBody(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    private void adaptivePolicySizeBody(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java
    }

    public void adaptiveSizePolicyStop(GCLogTrace trace, String line) {
        //todo ignored until we collect adaptive size data.
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
     * @param line  Log line.
     */
    private void ignore(GCLogTrace trace, String line) {
        return;
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
    //We have found this section. If PrintHeapAtGC does not interfere
    // this method should consume all remaining lines
    private void garbageFirstHeap(GCLogTrace trace, String line) {
        //Swallow log header that we don't do anything with
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    }

    private void noop(GCLogTrace trace, String line) {}

    /*************
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java

    //Ignore these log messages for now.
    private void heapSummary(GCLogTrace trace, String line) {
//        if ( before) {
//            forwardReference.setHeapOccupancyBeforeCollection(trace.getLongGroup(2));
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    //[15.316s][debug][gc,heap      ] GC(0)   region size 1024K, 24 young (24576K), 0 survivors (0K)
    //ignore this logging for now
    private void youngRegionAllotment(GCLogTrace trace, String line) {
//        if (before) {
//            forwardReference.setYoungOccupancyBeforeCollection(trace.getLongGroup(3));
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     * @param line
     */
    private void concurrentMarkInternalPhases(GCLogTrace trace, String line) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     * @param line
     */
    private void fullClassUnloading(GCLogTrace trace, String line) {
        //forwardReference.fullClassUnloadingDuration(trace.getMillisecondDurationInSeconds());
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     * @param line
     */
    private void fullStringSymbolTable(GCLogTrace trace, String line) {
//        forwardReference.scrubStringSymbolTableDuration(trace.getMillisecondDurationInSeconds());
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
     * @param line  Log line.
     */
    private void ignore(GCLogTrace trace, String line) {
        return;
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
    }

    private void oldSummary(GCLogTrace trace, String line) {
        //the problem is all of the phases have been reported on
        //this data is floating outside events in our current model
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
    }

    private void fullGCPhase(GCLogTrace trace, String line) {
        //todo: noop();
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
    }

    private void parallelPhase(GCLogTrace trace, String line) {
        //todo: noop()
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
    // diagnostics

    private void notYetImplemented() {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ZGCParser.java`
#### Snippet
```java
    }

    private void markSummary(GCLogTrace trace, String s) {
        //trace.notYetImplemented();
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ZGCParser.java`
#### Snippet
```java
    }

    private void relocationSummary(GCLogTrace trace, String s) {
        //trace.notYetImplemented();
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ZGCParser.java`
#### Snippet
```java
    }

    private void nMethods(GCLogTrace trace, String s) {
        //trace.notYetImplemented();
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ZGCParser.java`
#### Snippet
```java
    }

    private void referenceProcessing(GCLogTrace trace, String s) {
        //trace.notYetImplemented();
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ZGCParser.java`
#### Snippet
```java
    }

    private void capacity(GCLogTrace trace, String s) {
        //trace.notYetImplemented();
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `sample/src/main/java/com/microsoft/gctoolkit/sample/aggregation/HeapOccupancyAfterCollection.java`
#### Snippet
```java
    }

    private void extractHeapOccupancy(ShenandoahCycle event) {
        //aggregation().addDataPoint(event.getGarbageCollectionType(), event.getDateTimeStamp(), event.getOccupancy());
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java

    private int initialMarkCount = 0;
    private int remarkCount = 0;
    private int defNewCount = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java
    }

    private int initialMarkCount = 0;
    private int remarkCount = 0;
    private int defNewCount = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java
    private int initialMarkCount = 0;
    private int remarkCount = 0;
    private int defNewCount = 0;

    public int getInitialMarkCount() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/aggregator/Aggregator.java`
#### Snippet
```java
    /// JVMEventDispatcher manages all of the registered events and event consumers
    private final JVMEventDispatcher jvmEventDispatcher = new JVMEventDispatcher();
    private volatile boolean done = false;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1GCPauseEvent.java`
#### Snippet
```java
    private MemoryPoolSummary heap;
    private MemoryPoolSummary permOrMetaspace;
    private ReferenceGCSummary referenceGCSummary = null;

    private CPUSummary cpuSummary;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `sample/src/main/java/com/microsoft/gctoolkit/sample/aggregation/RuntimeAggregation.java`
#### Snippet
```java
public abstract class RuntimeAggregation  implements Aggregation {

    private volatile DateTimeStamp timeOfFirstEvent = null;
    private volatile DateTimeStamp timeOfLastEvent = new DateTimeStamp(0d);

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/event/jvm/SurvivorRecord.java`
#### Snippet
```java
    // JDK bug, we have now seen a max tenuring threshold of 32, even 64
    // Fold anything older than 15 back into the 15th slot
    private ArrayList<Long> bytesAtAge = null;

    public SurvivorRecord(DateTimeStamp timeStamp, long desiredOccupancy, int calculatedTenuringThreshold, int maxTenuringThreshold) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    private int maxTenuringThreshold = 15;
    private int setGCFlags = 0;
    private DateTimeStamp timeOfFirstEvent = null;

    {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    private int youngCountAfterFirstCMSCycle = 0;
    private int collectionCount = 0;
    private int youngCollectionCount = 0;
    private int tenuringSummary = 0;
    private boolean ageTableDetected = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    }

    private boolean firstCMSCycle = false;
    private int youngCountAfterFirstCMSCycle = 0;
    private int collectionCount = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java

    private boolean firstCMSCycle = false;
    private int youngCountAfterFirstCMSCycle = 0;
    private int collectionCount = 0;
    private int youngCollectionCount = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    private int collectionCount = 0;
    private int youngCollectionCount = 0;
    private int tenuringSummary = 0;
    private boolean ageTableDetected = false;
    private int maxTenuringThreshold = 15;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    private boolean ageTableDetected = false;
    private int maxTenuringThreshold = 15;
    private int setGCFlags = 0;
    private DateTimeStamp timeOfFirstEvent = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    private int youngCollectionCount = 0;
    private int tenuringSummary = 0;
    private boolean ageTableDetected = false;
    private int maxTenuringThreshold = 15;
    private int setGCFlags = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    private boolean firstCMSCycle = false;
    private int youngCountAfterFirstCMSCycle = 0;
    private int collectionCount = 0;
    private int youngCollectionCount = 0;
    private int tenuringSummary = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    }

    private boolean simpleParallelOrParNewDetected = false;
    private boolean simpleFullGCDetected = false;
    private boolean simpleCMSCycleDetected = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java

    private boolean simpleParallelOrParNewDetected = false;
    private boolean simpleFullGCDetected = false;
    private boolean simpleCMSCycleDetected = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    private boolean simpleParallelOrParNewDetected = false;
    private boolean simpleFullGCDetected = false;
    private boolean simpleCMSCycleDetected = false;

    //TODO: #148 PSYoung -> PSOldGen, DefNew->PSOldGen, so maybe we need to break up Parallel for generational collections
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java

    private static final Logger LOG = Logger.getLogger(CMSTenuredPoolParser.class.getName());
    private DateTimeStamp startOfPhase = null;
    private GCParseRule EndOfFile = new GCParseRule("END_OF_DATA_SENTINEL", END_OF_DATA_SENTINEL);

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/Decorators.java`
#### Snippet
```java
    int numberOfDecorators;

    private Matcher decoratorMatcher = null;
    private String tags;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/io/SingleGCLogFile.java`
#### Snippet
```java
     */

    private SingleLogFileMetadata metadata = null;

    public SingleGCLogFile(Path path) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private boolean aborted = false;

    public void abortConcurrentMark() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java

    private GarbageCollectionTypes pausePhaseDuringConcurrentCycle = null;
    private GarbageCollectionTypes gcType = null;
    private GarbageCollectionTypes concurrentPhase;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private GarbageCollectionTypes pausePhaseDuringConcurrentCycle = null;
    private GarbageCollectionTypes gcType = null;
    private GarbageCollectionTypes concurrentPhase;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    private static final Logger LOGGER = Logger.getLogger(G1GCForwardReference.class.getName());

    private static int heapRegionSize = 0;
    private static long minHeapSize;
    private static long initialHeapSize;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java

    private int evacuationWorkersUsed = 0;
    private int evacuationWorkersAvailable = 0;

    public void evacuationWorkers(int workersUsed, int available) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java

    //
    private boolean toSpaceExhausted = false;

    public void toSpaceExhausted() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private int evacuationWorkersUsed = 0;
    private int evacuationWorkersAvailable = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java

    // Concurrent Remark values
    private int concurrentMarkWorkersUsed = 0;
    private int concurrentMarkWorkersAvailable = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private UnifiedCountSummary unifiedCountSummary = null;

    public void setProcessedBuffersSummary(UnifiedCountSummary summary) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private DateTimeStamp pausePhaseDuringConcurrentCycleTime = null;
    private double pausePhaseDuringConcurrentCycleDuration = -1.0d;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    // Concurrent Remark values
    private int concurrentMarkWorkersUsed = 0;
    private int concurrentMarkWorkersAvailable = 0;

    public void concurrentMarkWorkers(int used, int available) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    }

    private UnifiedCountSummary terminationAttempts = null;

    public void setTerminationAttempts(UnifiedCountSummary summary) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/jvm/RuntimeDuration.java`
#### Snippet
```java
@Collates(RuntimeDurationAggregator.class)
/* package-scope */ class RuntimeDuration implements Aggregation {
    private volatile DateTimeStamp timeOfFirstEvent = null;
    private volatile DateTimeStamp timeOfLastEvent = new DateTimeStamp(0.0d);
    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/UnifiedDiarizer.java`
#### Snippet
```java
    private final Diary diary;
    private final TreeSet<String> tagsAndLevels = new TreeSet<>();
    private int stopTheWorldEvents = 0;

    {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0.0d` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1Remark.java`
#### Snippet
```java

    private double referenceProcessingTime = 0.0d;
    private double finalizeMarkingTime = 0.0d;
    private double unloadingTime = 0.0d;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0.0d` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1Remark.java`
#### Snippet
```java
    private double referenceProcessingTime = 0.0d;
    private double finalizeMarkingTime = 0.0d;
    private double unloadingTime = 0.0d;

    public G1Remark(DateTimeStamp timeStamp, double referenceProcessingTimes, double duration) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0.0d` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1Remark.java`
#### Snippet
```java
public class G1Remark extends G1RealPause {

    private double referenceProcessingTime = 0.0d;
    private double finalizeMarkingTime = 0.0d;
    private double unloadingTime = 0.0d;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileSegment.java`
#### Snippet
```java
    private final int segmentIndex;
    private final boolean current;
    private DateTimeStamp endTime = null;
    private DateTimeStamp startTime = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileSegment.java`
#### Snippet
```java
    private final boolean current;
    private DateTimeStamp endTime = null;
    private DateTimeStamp startTime = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1Young.java`
#### Snippet
```java
    private StatisticalSummary workerTotal;
    private StatisticalSummary processedBuffersSummary;
    private boolean toSpaceExhausted = false;

    private final Map<String, StatisticalSummary> parallelPhaseSummaries = new ConcurrentHashMap<>();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ForwardReference.java`
#### Snippet
```java
    private final Decorators decorators;
    private final int gcID;
    private DateTimeStamp startTime = null;
    private double duration = -1.0d;
    private GCCause gcCause = GCCause.UNKNOWN_GCCAUSE;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ForwardReference.java`
#### Snippet
```java
    private double duration = -1.0d;
    private GCCause gcCause = GCCause.UNKNOWN_GCCAUSE;
    private CPUSummary cpuSummary = null;

    public ForwardReference(Decorators decorators, int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java

    private G1GCForwardReference forwardReference;
    private boolean concurrentCycleActive = false;
    private boolean concurrentPhaseActive = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    // state variables
    private boolean before = false; //todo what happens if this gets out of sync. #IHateState
    private int gcInvocations = 0;
    private int fullGCInvocations = 0;
    private DateTimeStamp jvmTerminationEventTime = new DateTimeStamp(-1.0d);
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java

    //return to JVM
    private int regionSize = 0; //region size in Gigabytes

    public void heapRegionSize(GCLogTrace trace, String line) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    private G1GCForwardReference forwardReference;
    private boolean concurrentCycleActive = false;
    private boolean concurrentPhaseActive = false;

    private final RuleSet<GCParseRule, BiConsumer<GCLogTrace, String>> parseRules;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
    private boolean before = false; //todo what happens if this gets out of sync. #IHateState
    private int gcInvocations = 0;
    private int fullGCInvocations = 0;
    private DateTimeStamp jvmTerminationEventTime = new DateTimeStamp(-1.0d);

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java

    // state variables
    private boolean before = false; //todo what happens if this gets out of sync. #IHateState
    private int gcInvocations = 0;
    private int fullGCInvocations = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalForwardReference.java`
#### Snippet
```java
    private MemoryPoolSummary tenured = null;
    private MemoryPoolSummary heap = null;
    private MetaspaceRecord metaspace = null;
    private MetaspaceRecord nonClassspace = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalForwardReference.java`
#### Snippet
```java
    private GarbageCollectionTypes gcType;
    private MemoryPoolSummary young = null;
    private MemoryPoolSummary tenured = null;
    private MemoryPoolSummary heap = null;
    private MetaspaceRecord metaspace = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalForwardReference.java`
#### Snippet
```java

    private GarbageCollectionTypes gcType;
    private MemoryPoolSummary young = null;
    private MemoryPoolSummary tenured = null;
    private MemoryPoolSummary heap = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalForwardReference.java`
#### Snippet
```java
    private MemoryPoolSummary heap = null;
    private MetaspaceRecord metaspace = null;
    private MetaspaceRecord nonClassspace = null;

    public MetaspaceRecord getNonClassspace() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalForwardReference.java`
#### Snippet
```java
    private MemoryPoolSummary young = null;
    private MemoryPoolSummary tenured = null;
    private MemoryPoolSummary heap = null;
    private MetaspaceRecord metaspace = null;
    private MetaspaceRecord nonClassspace = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalForwardReference.java`
#### Snippet
```java
    }

    private MetaspaceRecord classspace = null;
    private final Map<String, Double> remarkPhases = new ConcurrentHashMap<>();
    private final Map<String, Double> phases = new ConcurrentHashMap<>();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java
    private final Collection<SafePointData> safePoints = new ArrayList<>();
    private DateTimeStamp timeStamp = new DateTimeStamp(0.0d);
    private boolean lastEventWasGC = false;
    private double gcPauseTime = GCPAUSE_TIME_NOT_SET;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `IT/src/main/java/com/microsoft/gctoolkit/integration/aggregation/RuntimeAggregation.java`
#### Snippet
```java
public class RuntimeAggregation  implements Aggregation {

    private volatile DateTimeStamp timeOfFirstEvent = null;
    private volatile DateTimeStamp timeOfLastEvent = new DateTimeStamp(0d);

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/SurvivorMemoryPoolParser.java`
#### Snippet
```java
public class SurvivorMemoryPoolParser extends PreUnifiedGCLogParser implements TenuredPatterns {

    private SurvivorRecord forwardReference = null;

    public SurvivorMemoryPoolParser(Diary diary, JVMEventConsumer consumer) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
    private DateTimeStamp timeStamp = new DateTimeStamp(0.0d);
    private ApplicationStoppedTime.VMOperations safePointReason = null;
    private boolean gcPause = false;

    public UnifiedJVMEventParser(Diary diary, JVMEventConsumer consumer) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
    private static final Logger LOGGER = Logger.getLogger(UnifiedJVMEventParser.class.getName());
    private DateTimeStamp timeStamp = new DateTimeStamp(0.0d);
    private ApplicationStoppedTime.VMOperations safePointReason = null;
    private boolean gcPause = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/event/generational/ParNew.java`
#### Snippet
```java
public class ParNew extends GenerationalGCPauseEvent {

    private TLABSummary tlabSummary = null;

    private int dutyCycle = -1;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1Trap.java`
#### Snippet
```java
    }

    private int errorCount = 0;

    private void trap(Exception e) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedSurvivorMemoryPoolParser.java`
#### Snippet
```java
    private GCParseRule AGE_RECORD = new GCParseRule("AGE_RECORD", "- age\\s+" + COUNTER + ":\\s+" + COUNTER + " bytes,\\s+" + COUNTER + " total");

    private SurvivorRecord forwardReference = null;
    private boolean ageDataCollected = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedSurvivorMemoryPoolParser.java`
#### Snippet
```java

    private SurvivorRecord forwardReference = null;
    private boolean ageDataCollected = false;

    public UnifiedSurvivorMemoryPoolParser(Diary diary, JVMEventConsumer consumer) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1ConcurrentMark.java`
#### Snippet
```java
    private int availableWorkerThreads = -1;
    private double precleanDuration = -1.0d;
    private boolean aborted = false;

    public G1ConcurrentMark(DateTimeStamp timeStamp, double duration) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/LogLineFilter.java`
#### Snippet
```java
    //Internal hack to deal with our sftp server not being able to capture a complete zip file.
    private static String prefixFilter = null;
    private Pattern filterPattern = null;

    static {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/LogLineFilter.java`
#### Snippet
```java

    //Internal hack to deal with our sftp server not being able to capture a complete zip file.
    private static String prefixFilter = null;
    private Pattern filterPattern = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/LogLineFilter.java`
#### Snippet
```java

    private static final String VERBOSE_PROPERTY = "com.microsoft.gctoolkit.verbose.log";
    private static boolean verbose = false;

    //Internal hack to deal with our sftp server not being able to capture a complete zip file.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
     * Data Extraction methods
     */
    private GenerationalForwardReference pauseEvent = null;
    private GenerationalForwardReference concurrentCyclePauseEvent = null;
    private GenerationalForwardReference concurrentEvent = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
    private GenerationalForwardReference concurrentCyclePauseEvent = null;
    private GenerationalForwardReference concurrentEvent = null;
    private boolean inConcurrentPhase = false;

//    private boolean isCMS;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
     */
    private GenerationalForwardReference pauseEvent = null;
    private GenerationalForwardReference concurrentCyclePauseEvent = null;
    private GenerationalForwardReference concurrentEvent = null;
    private boolean inConcurrentPhase = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
    private GenerationalForwardReference pauseEvent = null;
    private GenerationalForwardReference concurrentCyclePauseEvent = null;
    private GenerationalForwardReference concurrentEvent = null;
    private boolean inConcurrentPhase = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileZipSegment.java`
#### Snippet
```java
    private final Path path;
    private final String segmentName;
    private DateTimeStamp endTime = null;
    private DateTimeStamp startTime = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileZipSegment.java`
#### Snippet
```java
    private final String segmentName;
    private DateTimeStamp endTime = null;
    private DateTimeStamp startTime = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GenerationalHeapParser.java`
#### Snippet
```java

    //Expect Remark
    private boolean expectRemark = false;

    /* Rules not used....
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-19-01-36-55.329.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `MalformedEvent` does not end with 'Exception'
in `api/src/main/java/com/microsoft/gctoolkit/event/MalformedEvent.java`
#### Snippet
```java
package com.microsoft.gctoolkit.event;

public class MalformedEvent extends Exception {
    public MalformedEvent(String message) {
        super(message);
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `api/src/main/java/com/microsoft/gctoolkit/event/jvm/SurvivorRecord.java`
#### Snippet
```java
    public Long[] getBytesAtEachAge() {
        if (bytesAtAge == null)
            return new Long[0];
        return bytesAtAge.toArray(new Long[0]);
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `api/src/main/java/com/microsoft/gctoolkit/event/jvm/SurvivorRecord.java`
#### Snippet
```java
        if (bytesAtAge == null)
            return new Long[0];
        return bytesAtAge.toArray(new Long[0]);
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingGCLogFile.java`
#### Snippet
```java
            switch (segments.size()) {
                case 0:
                    String[] empty = new String[0];
                    return Arrays.stream(empty);
                case 1:
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
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

### RuleId[ruleID=UnusedAssignment]
The value `EndOfFile.parse(line)` assigned to `trace` is never used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
        else if ((trace = SPLIT_REMARK.parse(line)) != null)
            startOfPhase = getClock();
        else if ((trace = EndOfFile.parse(line)) != null) {
            consumer.record(new JVMTermination(getClock(),diary.getTimeOfFirstEvent()));
        }
```

### RuleId[ruleID=UnusedAssignment]
Variable `referenceProcessingTime` initializer `0.0d` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1Remark.java`
#### Snippet
```java
public class G1Remark extends G1RealPause {

    private double referenceProcessingTime = 0.0d;
    private double finalizeMarkingTime = 0.0d;
    private double unloadingTime = 0.0d;
```

### RuleId[ruleID=UnusedAssignment]
Variable `trace` initializer `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JVMEventParser.java`
#### Snippet
```java
    protected void process(String line) {

        GCLogTrace trace = null;

        try {
```

### RuleId[ruleID=UnusedAssignment]
Variable `trace` initializer `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
    protected void process(String line) {

        GCLogTrace trace = null;

        try {
```

### RuleId[ruleID=UnusedAssignment]
The value `LEAVING_SAFEPOINT.parse(line)` assigned to `trace` is never used
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedJVMEventParser.java`
#### Snippet
```java
                timeStamp = getClock();
                safePointReason = ApplicationStoppedTime.VMOperations.valueOf(trace.getGroup(1));
            } else if ((trace = LEAVING_SAFEPOINT.parse(line)) != null) {
            } //noop this one.

```

### RuleId[ruleID=UnusedAssignment]
Variable `baseLength` initializer `0` is redundant
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
        }

        int baseLength = 0;
        if ( "current".equals(bits[bits.length - 1]))
            baseLength = bits.length - 2;
```

### RuleId[ruleID=UnusedAssignment]
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

### RuleId[ruleID=UnusedAssignment]
Variable `prefixFilter` initializer `null` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/LogLineFilter.java`
#### Snippet
```java

    //Internal hack to deal with our sftp server not being able to capture a complete zip file.
    private static String prefixFilter = null;
    private Pattern filterPattern = null;

```

### RuleId[ruleID=UnusedAssignment]
Variable `verbose` initializer `false` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/LogLineFilter.java`
#### Snippet
```java

    private static final String VERBOSE_PROPERTY = "com.microsoft.gctoolkit.verbose.log";
    private static boolean verbose = false;

    //Internal hack to deal with our sftp server not being able to capture a complete zip file.
```

### RuleId[ruleID=UnusedAssignment]
Variable `forwardReference` initializer `trap` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java

    private final G1GCPauseEvent trap = new G1Trap();
    private G1GCPauseEvent forwardReference = trap;

    private DateTimeStamp timeStampForwardReference;
```

### RuleId[ruleID=UnusedAssignment]
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

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
        LogFileSegment current = workingList.stream()
                .filter( segment -> segment.getSegmentName().endsWith(basePattern) || segment.getSegmentName().endsWith(".current"))
                .findFirst().get();

        orderedList.addFirst(current);
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `simpleCMSCycleDetected` is always `true` when reached
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    @Override
    public boolean completed() {
        return getDiary().isComplete() || lineCount < 1 || (simpleCMSCycleDetected && (simpleCMSCycleDetected || simpleFullGCDetected));
    }

```

### RuleId[ruleID=ConstantValue]
Condition `simpleCMSCycleDetected || simpleFullGCDetected` is always `true` when reached
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    @Override
    public boolean completed() {
        return getDiary().isComplete() || lineCount < 1 || (simpleCMSCycleDetected && (simpleCMSCycleDetected || simpleFullGCDetected));
    }

```

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
Value `foundEOL` is always 'false'
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileSegment.java`
#### Snippet
```java
                    eol = CR;
                foundEOL = true;
            } else if (character == CR && !foundEOL) {
                eol = CR;
                foundEOL = true;
```

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
Condition `m == null` is always `false`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JHiccupTrace.java`
#### Snippet
```java
    public static JHiccupTrace toTrace(String line) {
        Matcher m = JHICCUP_LOG_ENTRY.matcher(line);
        return (m == null) ? null : new JHiccupTrace(m);
    }

```

### RuleId[ruleID=ConstantValue]
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

## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'RandomAccessFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileSegment.java`
#### Snippet
```java
        boolean foundEOL = false;
        char eol = 0;
        RandomAccessFile randomAccessFile = new RandomAccessFile(path.toFile(), "r");
        long currentPosition = randomAccessFile.length() - 1;
        int linesFound = 0;
```

### RuleId[ruleID=IOResource]
'ZipFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingGCLogFile.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    private Stream<String> streamZipFile() throws IOException {
        ZipFile zipFile = new ZipFile(path.toFile());
        List<ZipEntry> entries = zipFile.stream().filter(entry -> !entry.isDirectory()).collect(Collectors.toList());
        Vector<InputStream> streams = new Vector<>();
```

### RuleId[ruleID=IOResource]
'ZipFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileZipSegment.java`
#### Snippet
```java
    public Stream<String> stream() {
        try {
            ZipFile file = new ZipFile(path.toFile());
            ZipEntry entry = file.getEntry(this.segmentName);
            return new BufferedReader(new InputStreamReader(file.getInputStream(entry))).lines();
```

## RuleId[ruleID=RedundantOperationOnEmptyContainer]
### RuleId[ruleID=RedundantOperationOnEmptyContainer]
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

### RuleId[ruleID=RedundantOperationOnEmptyContainer]
Collection `new ArrayList`() is always empty
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingGCLogFile.java`
#### Snippet
```java
                    .filter(s -> s.length() > 0);
        else // yes, this is returning an empty stream.
            return new ArrayList<String>().stream();
    }

```

### RuleId[ruleID=RedundantOperationOnEmptyContainer]
Collection `new ArrayList`() is always empty
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileZipSegment.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return new ArrayList<String>().stream();
    }

```

## RuleId[ruleID=FieldMayBeStatic]
### RuleId[ruleID=FieldMayBeStatic]
Field `SYNC_TIME` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int SPIN_TIME = 6;
    private final int BLOCK_TIME = 7;
    private final int SYNC_TIME = 8;
    private final int CLEANUP_TIME = 9;
    private final int VMOP_TIME = 10;
```

### RuleId[ruleID=FieldMayBeStatic]
Field `BLOCK_TIME` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int WAITING_TO_BLOCK = 5;
    private final int SPIN_TIME = 6;
    private final int BLOCK_TIME = 7;
    private final int SYNC_TIME = 8;
    private final int CLEANUP_TIME = 9;
```

### RuleId[ruleID=FieldMayBeStatic]
Field `CLEANUP_TIME` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int BLOCK_TIME = 7;
    private final int SYNC_TIME = 8;
    private final int CLEANUP_TIME = 9;
    private final int VMOP_TIME = 10;
    private final int TRAP_COUNT = 11;
```

### RuleId[ruleID=FieldMayBeStatic]
Field `SPIN_TIME` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int INITIALLY_RUNNING_THREADS = 4;
    private final int WAITING_TO_BLOCK = 5;
    private final int SPIN_TIME = 6;
    private final int BLOCK_TIME = 7;
    private final int SYNC_TIME = 8;
```

### RuleId[ruleID=FieldMayBeStatic]
Field `WAITING_TO_BLOCK` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int TOTAL_THREADS = 3;
    private final int INITIALLY_RUNNING_THREADS = 4;
    private final int WAITING_TO_BLOCK = 5;
    private final int SPIN_TIME = 6;
    private final int BLOCK_TIME = 7;
```

### RuleId[ruleID=FieldMayBeStatic]
Field `TOTAL_THREADS` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int TIME_STAMP = 1;
    private final int VMOP = 2;
    private final int TOTAL_THREADS = 3;
    private final int INITIALLY_RUNNING_THREADS = 4;
    private final int WAITING_TO_BLOCK = 5;
```

### RuleId[ruleID=FieldMayBeStatic]
Field `INITIALLY_RUNNING_THREADS` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int VMOP = 2;
    private final int TOTAL_THREADS = 3;
    private final int INITIALLY_RUNNING_THREADS = 4;
    private final int WAITING_TO_BLOCK = 5;
    private final int SPIN_TIME = 6;
```

### RuleId[ruleID=FieldMayBeStatic]
Field `VMOP_TIME` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int SYNC_TIME = 8;
    private final int CLEANUP_TIME = 9;
    private final int VMOP_TIME = 10;
    private final int TRAP_COUNT = 11;

```

### RuleId[ruleID=FieldMayBeStatic]
Field `TIME_STAMP` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    }

    private final int TIME_STAMP = 1;
    private final int VMOP = 2;
    private final int TOTAL_THREADS = 3;
```

### RuleId[ruleID=FieldMayBeStatic]
Field `TRAP_COUNT` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java
    private final int CLEANUP_TIME = 9;
    private final int VMOP_TIME = 10;
    private final int TRAP_COUNT = 11;

}
```

### RuleId[ruleID=FieldMayBeStatic]
Field `VMOP` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/vmops/SafepointTrace.java`
#### Snippet
```java

    private final int TIME_STAMP = 1;
    private final int VMOP = 2;
    private final int TOTAL_THREADS = 3;
    private final int INITIALLY_RUNNING_THREADS = 4;
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GCCauses` has only 'static' members, and lacks a 'private' constructor
in `api/src/main/java/com/microsoft/gctoolkit/event/GCCauses.java`
#### Snippet
```java
import static com.microsoft.gctoolkit.event.GCCause.*;

public class GCCauses {
    private static final Map<String, GCCause> GC_CAUSES = Map.ofEntries(
        Map.entry(GCCause.JAVA_LANG_SYSTEM.getLabel(), GCCause.JAVA_LANG_SYSTEM),
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/jvm/LogFileParser.java`
#### Snippet
```java
                vertx.eventBus().publish(outbox, event, options);
            } else {
                LOGGER.log(Level.SEVERE, "Thread: {0} is recording Event: {1} that has a null DateTimeStamp, it will be ignored", new Object[]{Thread.currentThread().getName(), event.toString()});
            }
        } catch (Error t) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isPlainText` will produce `NullPointerException`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/io/SafepointLogFile.java`
#### Snippet
```java

    public Stream<String> stream() throws IOException {
        if (metadata.isPlainText()) {
            return Files.lines(path);
        } else if (metadata.isZip()) {
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `api/src/main/java/com/microsoft/gctoolkit/aggregator/EventSource.java`
#### Snippet
```java
     * Events come from the tenured space.
     */
    TENURED;
}

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `api/src/main/java/com/microsoft/gctoolkit/event/shenandoah/ShenandoahCycle.java`
#### Snippet
```java
        Pause_Final_Mark, Concurrent_cleanup,
        Concurrent_evacuation, Pause_Init_Update_Refs,
        Concurrent_update_references, Pause_Final_Update_Refs;
    }

```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
            consumer.record(event);
            concurrentPhaseActive = false;
            eventQueue.stream().forEach(consumer::record);
            eventQueue.clear();
        } else {
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedG1GCParser.java`
#### Snippet
```java
        concurrentPhaseActive = false;
        consumer.record(cycle);
        eventQueue.stream().forEach(consumer::record);
        eventQueue.clear();
    }
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
'List.of().stream()' can be replaced with 'Stream.of()'
in `api/src/main/java/com/microsoft/gctoolkit/io/SingleLogFileMetadata.java`
#### Snippet
```java

    public Stream<LogFileSegment> logFiles() {
        return List.of(logFile).stream();
    }

```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/aggregator/AggregatorVerticle.java`
#### Snippet
```java

    private void monitorForTermination() {
        Executors.newSingleThreadExecutor().execute(() -> completion.awaitUninterruptibly());
    }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `api/src/main/java/com/microsoft/gctoolkit/GCToolKit.java`
#### Snippet
```java
                .map(ServiceLoader.Provider::get)
                .filter(p->p.accepts(diary))
                .forEach(parser->bus.register(parser));

    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingGCLogFile.java`
#### Snippet
```java
        if ( getMetaData().isDirectory() || getMetaData().isPlainText() || getMetaData().isZip())
            return getMetaData().logFiles()
                    .flatMap(segment -> segment.stream())
                    .filter(Objects::nonNull)
                    .map(String::trim)
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
                Files.list(getPath().getParent())
                        .filter(file -> file.getFileName().toString().startsWith(getRootPattern()))
                        .map(p -> new GCLogFileSegment(p)).forEach(segments::add);
            }
        } catch (IOException ioe) {
```

## RuleId[ruleID=CatchMayIgnoreException]
### RuleId[ruleID=CatchMayIgnoreException]
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

### RuleId[ruleID=CatchMayIgnoreException]
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

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `parser/src/main/java/com/microsoft/gctoolkit/parser/CMSTenuredPoolParser.java`
#### Snippet
```java
            consumer.record(new ConcurrentReset(startOfPhase, duration, cpuTime, wallTime));
        else
            LOG.warning("concurrent phase choked on " + trace.toString());
    }

```

### RuleId[ruleID=UnnecessaryToStringCall]
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

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `ERGO` may be 'static'
in `api/src/main/java/com/microsoft/gctoolkit/event/shenandoah/ShenandoahCycle.java`
#### Snippet
```java
    }

    class ERGO {

        private final int free;
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `Phase` may be 'static'
in `api/src/main/java/com/microsoft/gctoolkit/event/shenandoah/ShenandoahCycle.java`
#### Snippet
```java


    class Phase {

        Phases phase;
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `ShenandoahForwardReference` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ShenandoahParser.java`
#### Snippet
```java
    private ShenandoahForwardReference forwardReference;

    private class ShenandoahForwardReference {

        JVMEvent toShenandoahCycle() {
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `ConcurrentRefinementStatistics` may be 'static'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
     */

    class ConcurrentRefinementStatistics {
        private int cardsProcessed;
        private int completedBuffers;
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `RegionsSummary` may be 'static'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/RSetConcurrentRefinement.java`
#### Snippet
```java
    }

    class RegionsSummary {

        private int youngRegionsStatistics;
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `ZGCForwardReference` may be 'static'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ZGCParser.java`
#### Snippet
```java
    }

    private class ZGCForwardReference {
        private final DateTimeStamp startTimeStamp;
        private final GCCause gcCause;
```

## RuleId[ruleID=Java9UndeclaredServiceUsage]
### RuleId[ruleID=Java9UndeclaredServiceUsage]
Usage of service 'com.microsoft.gctoolkit.message.DataSourceConsumer' is not declared in module-info
in `api/src/main/java/com/microsoft/gctoolkit/GCToolKit.java`
#### Snippet
```java

    private void registerParsers(DataSourceBus bus, Diary diary) {
        ServiceLoader.load(DataSourceConsumer.class)
                .stream()
                .map(ServiceLoader.Provider::get)
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### RuleId[ruleID=SetReplaceableByEnumSet]
`HashSet<>` can be replaced with 'EnumSet'
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/jvm/GCToolkitVertxParameters.java`
#### Snippet
```java
            Set<Class<? extends Aggregation>> registeredAggregations) {
        final Set<Aggregator<?>> aggregators = new HashSet<>();
        final Set<EventSource> eventSources = new HashSet<>();

        registeredAggregations.forEach(aggregationClass -> {
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java
                .ifPresent(summary -> {
                    summary.forEach((gcType, dataSet) -> {
                        System.out.printf(message, gcType, dataSet.size());
                        switch (gcType) {
                            case DefNew:
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java
                                break;
                            default:
                                System.out.println(gcType + " not managed");
                                break;
                        }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java

        Optional<CollectionCycleCountsSummary> summary = machine.getAggregation(CollectionCycleCountsSummary.class);
        summary.ifPresent(s -> s.printOn(System.out));
        // Retrieves the Aggregation for PauseTimeSummary. This is a com.microsoft.gctoolkit.sample.aggregation.RuntimeAggregation.
        machine.getAggregation(PauseTimeSummary.class).ifPresent(pauseTimeSummary -> {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java
        // Retrieves the Aggregation for PauseTimeSummary. This is a com.microsoft.gctoolkit.sample.aggregation.RuntimeAggregation.
        machine.getAggregation(PauseTimeSummary.class).ifPresent(pauseTimeSummary -> {
            System.out.printf("Total pause time  : %.4f\n", pauseTimeSummary.getTotalPauseTime());
            System.out.printf("Total run time    : %.4f\n", pauseTimeSummary.getRuntimeDuration());
            System.out.printf("Percent pause time: %.2f\n", pauseTimeSummary.getPercentPaused());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java
        machine.getAggregation(PauseTimeSummary.class).ifPresent(pauseTimeSummary -> {
            System.out.printf("Total pause time  : %.4f\n", pauseTimeSummary.getTotalPauseTime());
            System.out.printf("Total run time    : %.4f\n", pauseTimeSummary.getRuntimeDuration());
            System.out.printf("Percent pause time: %.2f\n", pauseTimeSummary.getPercentPaused());
        });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `sample/src/main/java/com/microsoft/gctoolkit/sample/Main.java`
#### Snippet
```java
            System.out.printf("Total pause time  : %.4f\n", pauseTimeSummary.getTotalPauseTime());
            System.out.printf("Total run time    : %.4f\n", pauseTimeSummary.getRuntimeDuration());
            System.out.printf("Percent pause time: %.2f\n", pauseTimeSummary.getPercentPaused());
        });

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
        //And yes, that means System.out.println is in here in on purpose
        //if ( debugging) {
        System.out.println(threadName + ", not implemented: " + getGroup(0));
        for (int i = 1; i < groupCount() + 1; i++) {
            System.out.println(i + ": " + getGroup(i));
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
        System.out.println(threadName + ", not implemented: " + getGroup(0));
        for (int i = 1; i < groupCount() + 1; i++) {
            System.out.println(i + ": " + getGroup(i));
        }
        System.out.println("-----------------------------------------");
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
            System.out.println(i + ": " + getGroup(i));
        }
        System.out.println("-----------------------------------------");
        //}
    }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `IT/src/main/java/com/microsoft/gctoolkit/integration/shared/TwoRuntimeAggregator.java`
#### Snippet
```java

    public void record(JVMTermination termination) {
        System.out.println("sleeping: " + termination.toString());
        try {
            Thread.sleep(1000);
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `IT/src/main/java/com/microsoft/gctoolkit/integration/shared/TwoRuntimeAggregator.java`
#### Snippet
```java
            Thread.sleep(1000);
            StackTraceElement[] threadDump = Thread.currentThread().getStackTrace();
            Arrays.stream(threadDump).forEach(System.out::println);
        } catch (InterruptedException e) {
            e.printStackTrace();
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGCLogParser.java`
#### Snippet
```java
    void noop() {
        if (DEBUG)
            System.out.println("noop");
    }
}
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `parser/src/main/java/com/microsoft/gctoolkit/parser/AbstractLogTrace.java`
#### Snippet
```java

    protected double convertToDouble(String value) {
        return Double.parseDouble(value.replaceAll(EUROPEAN_FORMAT_SEPARATOR, US_FORMAT_SEPARATOR));
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
            // if base is gc.log, filter out gc.log.<number>
            bits = segments.stream()
                    .filter(segment -> !segment.getSegmentName().matches(".+\\.\\d+$"))
                    .findFirst()
                    .get()
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/src/main/java/com/microsoft/gctoolkit/io/RotatingLogFileMetadata.java`
#### Snippet
```java
        if ( "current".equals(bits[bits.length - 1]))
            baseLength = bits.length - 2;
        else if ( bits[bits.length - 1].matches("\\d+$"))
            baseLength = bits.length - 1;
        else
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JHiccupTrace.java`
#### Snippet
```java

    private double convertToDouble(String value) {
        return Double.parseDouble(value.replaceAll(EUROPEAN_FORMAT_SEPARATOR, US_FORMAT_SEPARATOR));
    }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java
    }

    protected void addAll(List<com.microsoft.gctoolkit.integration.collections.XYDataSet.Point> items) {
        dataSeries.addAll(items);
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java
    }

    public Stream<com.microsoft.gctoolkit.integration.collections.XYDataSet.Point> stream() {
        return dataSeries.stream();
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java

public class XYDataSet {
    private final List<com.microsoft.gctoolkit.integration.collections.XYDataSet.Point> dataSeries;

    public XYDataSet() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java
     * Returns an immutable List of the items in this DataSet.
     */
    public List<com.microsoft.gctoolkit.integration.collections.XYDataSet.Point> getItems() {
        return List.copyOf(dataSeries);
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java

    public void add(Number x, Number y) {
        dataSeries.add(new com.microsoft.gctoolkit.integration.collections.XYDataSet.Point(x, y));
    }

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java
    }

    public XYDataSet(com.microsoft.gctoolkit.integration.collections.XYDataSet series) {
        dataSeries = new ArrayList<>(series.getItems());
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java
    }

    public void add(com.microsoft.gctoolkit.integration.collections.XYDataSet.Point item) {
        dataSeries.add(item);
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java
    public OptionalDouble maxOfY() {
        return dataSeries.stream()
                .map(com.microsoft.gctoolkit.integration.collections.XYDataSet.Point::getY)
                .mapToDouble(Number::doubleValue)
                .max();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java
    }

    public com.microsoft.gctoolkit.integration.collections.XYDataSet scaleAndTranslateXAxis(double scale, double offset) {
        com.microsoft.gctoolkit.integration.collections.XYDataSet translatedSeries = new com.microsoft.gctoolkit.integration.collections.XYDataSet();
        for (com.microsoft.gctoolkit.integration.collections.XYDataSet.Point dataPoint : dataSeries) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java

    public com.microsoft.gctoolkit.integration.collections.XYDataSet scaleAndTranslateXAxis(double scale, double offset) {
        com.microsoft.gctoolkit.integration.collections.XYDataSet translatedSeries = new com.microsoft.gctoolkit.integration.collections.XYDataSet();
        for (com.microsoft.gctoolkit.integration.collections.XYDataSet.Point dataPoint : dataSeries) {
            double scaledXCoordinate = (scale * dataPoint.getX().doubleValue()) + offset;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java

    public com.microsoft.gctoolkit.integration.collections.XYDataSet scaleAndTranslateXAxis(double scale, double offset) {
        com.microsoft.gctoolkit.integration.collections.XYDataSet translatedSeries = new com.microsoft.gctoolkit.integration.collections.XYDataSet();
        for (com.microsoft.gctoolkit.integration.collections.XYDataSet.Point dataPoint : dataSeries) {
            double scaledXCoordinate = (scale * dataPoint.getX().doubleValue()) + offset;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java
    public com.microsoft.gctoolkit.integration.collections.XYDataSet scaleAndTranslateXAxis(double scale, double offset) {
        com.microsoft.gctoolkit.integration.collections.XYDataSet translatedSeries = new com.microsoft.gctoolkit.integration.collections.XYDataSet();
        for (com.microsoft.gctoolkit.integration.collections.XYDataSet.Point dataPoint : dataSeries) {
            double scaledXCoordinate = (scale * dataPoint.getX().doubleValue()) + offset;
            translatedSeries.add(scaledXCoordinate, dataPoint.getY());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java
    }

    public com.microsoft.gctoolkit.integration.collections.XYDataSet scaleSeries(double scaleFactor) {
        com.microsoft.gctoolkit.integration.collections.XYDataSet scaled = new com.microsoft.gctoolkit.integration.collections.XYDataSet();
        for (com.microsoft.gctoolkit.integration.collections.XYDataSet.Point item : dataSeries) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java

    public com.microsoft.gctoolkit.integration.collections.XYDataSet scaleSeries(double scaleFactor) {
        com.microsoft.gctoolkit.integration.collections.XYDataSet scaled = new com.microsoft.gctoolkit.integration.collections.XYDataSet();
        for (com.microsoft.gctoolkit.integration.collections.XYDataSet.Point item : dataSeries) {
            scaled.add(item.getX(), item.getY().doubleValue() * scaleFactor);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java

    public com.microsoft.gctoolkit.integration.collections.XYDataSet scaleSeries(double scaleFactor) {
        com.microsoft.gctoolkit.integration.collections.XYDataSet scaled = new com.microsoft.gctoolkit.integration.collections.XYDataSet();
        for (com.microsoft.gctoolkit.integration.collections.XYDataSet.Point item : dataSeries) {
            scaled.add(item.getX(), item.getY().doubleValue() * scaleFactor);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.microsoft.gctoolkit.integration.collections` is unnecessary and can be removed
in `IT/src/main/java/com/microsoft/gctoolkit/integration/collections/XYDataSet.java`
#### Snippet
```java
    public com.microsoft.gctoolkit.integration.collections.XYDataSet scaleSeries(double scaleFactor) {
        com.microsoft.gctoolkit.integration.collections.XYDataSet scaled = new com.microsoft.gctoolkit.integration.collections.XYDataSet();
        for (com.microsoft.gctoolkit.integration.collections.XYDataSet.Point item : dataSeries) {
            scaled.add(item.getX(), item.getY().doubleValue() * scaleFactor);
        }
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `IT/src/main/java/com/microsoft/gctoolkit/integration/shared/TwoRuntimeAggregator.java`
#### Snippet
```java
            Arrays.stream(threadDump).forEach(System.out::println);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        aggregation().terminate(termination.getEstimatedRuntimeDuration());
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileSegment.java`
#### Snippet
```java
            return Files.lines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileZipSegment.java`
#### Snippet
```java
            return new BufferedReader(new InputStreamReader(file.getInputStream(entry))).lines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<String>().stream();
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedG1GCParser.java`
#### Snippet
```java
            record(forwardReference);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
```

## RuleId[ruleID=RegExpSingleCharAlternation]
### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/unified/UnifiedLoggingTokens.java`
#### Snippet
```java

    String DATE_STAMP = "\\[" + DATE + "\\]";
    String UPTIME = "\\[" + INTEGER + DECIMAL_POINT + "\\d{3}s\\]";
    String TIME_MILLIS = "\\[\\d+ms\\]";
    String TIME_NANOS = "\\[\\d+ns\\]";
```

### RuleId[ruleID=RegExpSingleCharAlternation]
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

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/PreUnifiedDiarizer.java`
#### Snippet
```java
    private static final GCParseRule G1GC_PREFIX = new GCParseRule("G1GC_PREFIX", G1GCTokens.G1GC_PREFIX);
    private static final GCParseRule REFERENCE_PROCESSING_BLOCK = new GCParseRule("REFERENCE_PROCESSING_BLOCK", PreUnifiedTokens.REFERENCE_RECORDS);
    private static final Pattern excludeG1Ergonomics = Pattern.compile("^\\d+(\\.|,)\\d+: \\[G1Ergonomics");


```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    // Unified Tokens
    private static final String DATE_TAG = "\\[" + DATE + "\\]";
    private static final String UPTIME_TAG = "\\[(" + TIME + ")s\\]";

    // Pre-unified tokens
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final Pattern PREUNIFIED_DATE_TIMESTAMP = Pattern.compile(DATE_TIMESTAMP);
    // JEP 158 has ISO-8601 time and uptime in seconds and milliseconds as the first two decorators.
    private static final Pattern UNIFIED_DATE_TIMESTAMP = Pattern.compile("^(" + DATE_TAG + ")?(" + UPTIME_TAG + ")?");
    private static final DateTimeStamp EMPTY_DATE = new DateTimeStamp(-1.0d);

```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    // Patterns needed to support conversion of a log line to a DateTimeStamp

    private static final String DECIMAL_POINT = "(?:\\.|,)";
    private static final String INTEGER = "\\d+";
    private static final String DATE = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[\\+|\\-]\\d{4}";
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final String TIMESTAMP = "(" + TIME + "): ";
    private static final String DATE_STAMP = "(" + DATE + "): ";
    private static final String DATE_TIMESTAMP = "^(?:" + DATE_STAMP + ")?" + TIMESTAMP;

    //  2017-09-07T09:00:12.795+0200: 0.716:
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    private static final String INTEGER = "\\d+";
    private static final String DATE = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[\\+|\\-]\\d{4}";
    private static final String TIME = INTEGER + DECIMAL_POINT + "\\d{3}";

    // Unified Tokens
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java

    // Pre-unified tokens
    private static final String TIMESTAMP = "(" + TIME + "): ";
    private static final String DATE_STAMP = "(" + DATE + "): ";
    private static final String DATE_TIMESTAMP = "^(?:" + DATE_STAMP + ")?" + TIMESTAMP;
```

### RuleId[ruleID=RegExpSingleCharAlternation]
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

## RuleId[ruleID=SamePackageImport]
### RuleId[ruleID=SamePackageImport]
Unnecessary import from the same package `import com.microsoft.gctoolkit.integration.shared.OneRuntimeAggregator;`
in `IT/src/main/java/com/microsoft/gctoolkit/integration/shared/TwoRuntimeReport.java`
#### Snippet
```java
import com.microsoft.gctoolkit.aggregator.Aggregation;
import com.microsoft.gctoolkit.aggregator.Collates;
import com.microsoft.gctoolkit.integration.shared.OneRuntimeAggregator;
import com.microsoft.gctoolkit.integration.shared.SharedAggregation;

```

### RuleId[ruleID=SamePackageImport]
Unnecessary import from the same package `import com.microsoft.gctoolkit.integration.shared.SharedAggregation;`
in `IT/src/main/java/com/microsoft/gctoolkit/integration/shared/TwoRuntimeReport.java`
#### Snippet
```java
import com.microsoft.gctoolkit.aggregator.Collates;
import com.microsoft.gctoolkit.integration.shared.OneRuntimeAggregator;
import com.microsoft.gctoolkit.integration.shared.SharedAggregation;

@Collates(TwoRuntimeAggregator.class)
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `JVMEvent()` of an abstract class should not be declared 'public'
in `api/src/main/java/com/microsoft/gctoolkit/event/jvm/JVMEvent.java`
#### Snippet
```java
     * @param duration The duration of the event in decimal seconds.
     */
    public JVMEvent(DateTimeStamp timeStamp, double duration) {
        this.timeStamp = timeStamp;
        this.duration = duration;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `G1GCPauseEvent()` of an abstract class should not be declared 'public'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1GCPauseEvent.java`
#### Snippet
```java
    private CPUSummary cpuSummary;

    public G1GCPauseEvent(DateTimeStamp timeStamp, GarbageCollectionTypes type, GCCause cause, double duration) {
        super(timeStamp, type, cause, duration);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `PreUnifiedGCLogParser()` of an abstract class should not be declared 'public'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
    private final GCParseRule TIMESTAMP_BLOCK = new GCParseRule("TIMESTAMP_BLOCK", "^" + DATE_TIMESTAMP);

    public PreUnifiedGCLogParser(Diary diary, JVMEventConsumer consumer) {
        super(diary, consumer);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `G1RealPause()` of an abstract class should not be declared 'public'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1RealPause.java`
#### Snippet
```java
 */
public abstract class G1RealPause extends G1GCPauseEvent {
    public G1RealPause(DateTimeStamp timeStamp, GarbageCollectionTypes type, GCCause cause, double duration) {
        super(timeStamp, type, cause, duration);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractLogTrace()` of an abstract class should not be declared 'public'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/AbstractLogTrace.java`
#### Snippet
```java
    protected final Matcher trace;

    public AbstractLogTrace(Matcher matcher) {
        this.trace = matcher;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `GenerationalGCPauseEvent()` of an abstract class should not be declared 'public'
in `api/src/main/java/com/microsoft/gctoolkit/event/generational/GenerationalGCPauseEvent.java`
#### Snippet
```java
    private CPUSummary cpuSummary;

    public GenerationalGCPauseEvent(DateTimeStamp timeStamp, GarbageCollectionTypes type, GCCause cause, double duration) {
        super(timeStamp, type, cause, duration);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `G1GCConcurrentEvent()` of an abstract class should not be declared 'public'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1GCConcurrentEvent.java`
#### Snippet
```java
public abstract class G1GCConcurrentEvent extends G1GCEvent {

    public G1GCConcurrentEvent(DateTimeStamp timeStamp, GarbageCollectionTypes type, GCCause cause, double duration) {
        super(timeStamp, type, cause, duration);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `LogFileMetadata()` of an abstract class should not be declared 'public'
in `api/src/main/java/com/microsoft/gctoolkit/io/LogFileMetadata.java`
#### Snippet
```java
    private final Path path;

    public LogFileMetadata(Path path) throws IOException {
        this.path = path;
        magic();
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `GCLogParser()` of an abstract class should not be declared 'public'
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java


    public GCLogParser(Diary diary, JVMEventConsumer consumer) {
        this.diary = diary;
        this.consumer = consumer;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `CMSPauseEvent()` of an abstract class should not be declared 'public'
in `api/src/main/java/com/microsoft/gctoolkit/event/generational/CMSPauseEvent.java`
#### Snippet
```java
public abstract class CMSPauseEvent extends GenerationalGCPauseEvent implements CMSPhase {

    public CMSPauseEvent(DateTimeStamp timeStamp, GarbageCollectionTypes gcType, GCCause cause, double duration) {
        super(timeStamp, gcType, cause, duration);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `G1GCEvent()` of an abstract class should not be declared 'public'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1GCEvent.java`
#### Snippet
```java
    }

    public G1GCEvent(DateTimeStamp timeStamp, double duration) {
        this(timeStamp, GarbageCollectionTypes.Unknown, GCCause.UNKNOWN_GCCAUSE, duration);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `G1GCEvent()` of an abstract class should not be declared 'public'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1GCEvent.java`
#### Snippet
```java
    }

    public G1GCEvent(DateTimeStamp timeStamp, GarbageCollectionTypes gcType, double duration) {
        this(timeStamp, gcType, GCCause.UNKNOWN_GCCAUSE, duration);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `G1GCEvent()` of an abstract class should not be declared 'public'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1GCEvent.java`
#### Snippet
```java
public abstract class G1GCEvent extends GCEvent {

    public G1GCEvent(DateTimeStamp timeStamp, GarbageCollectionTypes type, GCCause cause, double duration) {
        super(timeStamp, type, cause, duration);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `G1GCEvent()` of an abstract class should not be declared 'public'
in `api/src/main/java/com/microsoft/gctoolkit/event/g1gc/G1GCEvent.java`
#### Snippet
```java


    public G1GCEvent(DateTimeStamp timeStamp, GCCause cause, double duration) {
        this(timeStamp, GarbageCollectionTypes.Unknown, cause, duration);
    }
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offsetInDecimalSeconds`
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
        DateTimeStamp now;
        // if passed value is NAN then consider offset seconds as 0.0d
        offsetInDecimalSeconds = getTimestampValue(offsetInDecimalSeconds);
        if (dateTime != null) {
            int seconds = (int) offsetInDecimalSeconds;
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/collection/MRUQueue.java`
#### Snippet
```java
    @Override
    public V remove(Object key) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/collection/MRUQueue.java`
#### Snippet
```java
            return entries.get(key);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
            notYetImplemented();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
            notYetImplemented();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
            notYetImplemented();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
            notYetImplemented();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogTrace.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/jvm/GCToolkitVertxParameters.java`
#### Snippet
```java

        if (clazz == null) {
            return null;
        } else if (clazz.isAnnotationPresent(Collates.class)) {
            Collates collates = clazz.getAnnotation(Collates.class);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `vertx/src/main/java/com/microsoft/gctoolkit/vertx/jvm/GCToolkitVertxParameters.java`
#### Snippet
```java
            LOGGER.log(Level.WARNING, e + ": Cannot construct instance of " + aggregatorClass);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java
            return new CPUSummary(trace.getDoubleGroup(1), trace.getDoubleGroup(2), trace.getDoubleGroup(3));
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/Decorators.java`
#### Snippet
```java
            LOGGER.log(Level.SEVERE, npe.getMessage(), npe);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/AbstractLogTrace.java`
#### Snippet
```java
            return matcher.group(1);
        } else {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/AbstractLogTrace.java`
#### Snippet
```java
        if (trace.find())
            return new GCLogTrace(trace);
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCParseRule.java`
#### Snippet
```java
            return new GCLogTrace(matcher);
        } else {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/GarbageCollectorFlag.java`
#### Snippet
```java
        } catch (IllegalArgumentException ex) {
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
                // The phase is a reset that occurs after an eager collection of humongous regions. This event will be
                // filled in a future PR.
                return null;
            default:
                throw new MalformedEvent("Unrecognized Event " + gcType);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
                LOGGER.warning("Unrecognized Concurrent Event " + getConcurrentPhase());
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    private MemoryPoolSummary getMemoryPoolSummary(int offset) {
        if (memoryPoolMeasurment[offset + OCCUPANCY_BEFORE_OFFSET] == -1L) //do we have recorded values
            return null;
        //do we know the size of the memory pool prior to the collection
        long sizeBeforeCollection = (memoryPoolMeasurment[offset + SIZE_BEFORE_OFFSET] > -1L) ? memoryPoolMeasurment[offset + SIZE_BEFORE_OFFSET] : memoryPoolMeasurment[offset + SIZE_AFTER_OFFSET];
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/G1GCForwardReference.java`
#### Snippet
```java
    private SurvivorMemoryPoolSummary getSurvivorMemoryPoolSummary() {
        if (memoryPoolMeasurment[SURVIVOR_OCCUPANCY_BEFORE_COLLECTION] == -1L)
            return null;
        return new SurvivorMemoryPoolSummary(memoryPoolMeasurment[SURVIVOR_OCCUPANCY_BEFORE_COLLECTION], memoryPoolMeasurment[SURVIVOR_OCCUPANCY_AFTER_COLLECTION], memoryPoolMeasurment[SURVIVOR_SIZE_AFTER_COLLECTION]);
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/collection/RuleSet.java`
#### Snippet
```java
    @Override
    public V remove(Object key) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/collection/RuleSet.java`
#### Snippet
```java
            return entries.get(key);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/SafepointParseRule.java`
#### Snippet
```java
        } else {
            misses();
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `api/src/main/java/com/microsoft/gctoolkit/io/GCLogFileSegment.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
            return ZonedDateTime.from(temporalAccessor);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/ShenandoahParser.java`
#### Snippet
```java

        JVMEvent toShenandoahCycle() {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java
            return new CPUSummary(trace.getDoubleGroup(1), trace.getDoubleGroup(2), trace.getDoubleGroup(3));
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/JHiccupTrace.java`
#### Snippet
```java
    public static JHiccupTrace toTrace(String line) {
        Matcher m = JHICCUP_LOG_ENTRY.matcher(line);
        return (m == null) ? null : new JHiccupTrace(m);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/jvm/CommandLineFlag.java`
#### Snippet
```java
        } catch (IllegalArgumentException ex) {
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
        }
        notYetImplemented();
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
                LOGGER.warning(values.getGarbageCollectionType() + " is unrecognized");
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `parser/src/main/java/com/microsoft/gctoolkit/parser/UnifiedGenerationalParser.java`
#### Snippet
```java
                LOGGER.warning(forwardReference.getGarbageCollectionType() + " is unrecognized");
        }
        return null;
    }

```

## RuleId[ruleID=AssignmentToLambdaParameter]
### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `value`
in `sample/src/main/java/com/microsoft/gctoolkit/sample/aggregation/CollectionCycleCountsSummary.java`
#### Snippet
```java
    @Override
    public void count(GarbageCollectionTypes gcType) {
        collectionCycleCounts.compute(gcType, (key, value) -> value == null ? 1 : ++value);
    }

```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `value`
in `IT/src/main/java/com/microsoft/gctoolkit/integration/aggregation/CollectionCycleCountsSummary.java`
#### Snippet
```java
    @Override
    public void count(GarbageCollectionTypes gcType) {
        collectionCycleCounts.compute(gcType, (key, value) -> value == null ? 1 : ++value);
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `summary` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/PreUnifiedGCLogParser.java`
#### Snippet
```java

    MemoryPoolSummary getTotalOccupancyWithTotalHeapSizeSummary(GCLogTrace trace, int offset) {
        MemoryPoolSummary summary = trace.getOccupancyWithMemoryPoolSizeSummary(offset);
        return summary;
    }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
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

### RuleId[ruleID=UnnecessaryLocalVariable]
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

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `summary` is redundant
in `parser/src/main/java/com/microsoft/gctoolkit/parser/GCLogParser.java`
#### Snippet
```java

    MemoryPoolSummary getTotalOccupancyWithTotalHeapSizeSummary(GCLogTrace trace, int offset) {
        MemoryPoolSummary summary = trace.getOccupancyWithMemoryPoolSizeSummary(offset);
        return summary;
    }
```

## RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:\\.|,)`
in `api/src/main/java/com/microsoft/gctoolkit/time/DateTimeStamp.java`
#### Snippet
```java
    // Patterns needed to support conversion of a log line to a DateTimeStamp

    private static final String DECIMAL_POINT = "(?:\\.|,)";
    private static final String INTEGER = "\\d+";
    private static final String DATE = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[\\+|\\-]\\d{4}";
```

## RuleId[ruleID=OverwrittenKey]
### RuleId[ruleID=OverwrittenKey]
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

### RuleId[ruleID=OverwrittenKey]
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

### RuleId[ruleID=OverwrittenKey]
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

### RuleId[ruleID=OverwrittenKey]
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

### RuleId[ruleID=OverwrittenKey]
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

### RuleId[ruleID=OverwrittenKey]
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

