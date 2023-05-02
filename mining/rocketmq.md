# rocketmq 
 
# Bad smells
I found 2028 bad smells with 80 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 318 | false |
| JavadocDeclaration | 213 | false |
| DuplicatedCode | 141 | false |
| UnusedAssignment | 132 | false |
| SwitchStatementWithTooFewBranches | 123 | false |
| Deprecation | 106 | false |
| TrivialIf | 90 | false |
| DanglingJavadoc | 79 | false |
| ConstantValue | 55 | false |
| DuplicateBranchesInSwitch | 52 | false |
| DataFlowIssue | 52 | false |
| FieldCanBeLocal | 51 | false |
| UnnecessaryLocalVariable | 50 | true |
| IgnoreResultOfCall | 40 | false |
| UNCHECKED_WARNING | 34 | false |
| BusyWait | 33 | false |
| StringBufferReplaceableByString | 29 | false |
| NonAtomicOperationOnVolatileField | 26 | false |
| CatchMayIgnoreException | 25 | false |
| IntegerMultiplicationImplicitCastToLong | 24 | false |
| StringConcatenationInsideStringBufferAppend | 23 | false |
| DeprecatedIsStillUsed | 21 | false |
| RedundantMethodOverride | 20 | false |
| CommentedOutCode | 18 | false |
| UnnecessaryContinue | 17 | false |
| NullableProblems | 14 | false |
| PointlessArithmeticExpression | 13 | false |
| EmptyStatementBody | 13 | false |
| InnerClassMayBeStatic | 12 | true |
| ConditionCoveredByFurtherCondition | 11 | false |
| UnnecessarySemicolon | 10 | false |
| AutoCloseableResource | 10 | false |
| RedundantCast | 10 | false |
| NonFinalFieldInEnum | 9 | false |
| IOStreamConstructor | 9 | false |
| WrapperTypeMayBePrimitive | 8 | false |
| NonStrictComparisonCanBeEquality | 8 | true |
| ManualMinMaxCalculation | 7 | false |
| TrivialStringConcatenation | 7 | false |
| SynchronizeOnNonFinalField | 7 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 7 | false |
| IfStatementWithIdenticalBranches | 6 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 6 | false |
| OctalLiteral | 5 | false |
| SimplifiableConditionalExpression | 5 | false |
| JavadocLinkAsPlainText | 5 | false |
| RedundantTypeArguments | 4 | false |
| InfiniteLoopStatement | 4 | false |
| MismatchedCollectionQueryUpdate | 4 | false |
| StringConcatenationInLoops | 4 | false |
| OptionalUsedAsFieldOrParameterType | 4 | false |
| CaughtExceptionImmediatelyRethrown | 4 | false |
| UnnecessaryUnicodeEscape | 4 | false |
| UseBulkOperation | 4 | false |
| ConditionalBreakInInfiniteLoop | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| CharsetObjectCanBeUsed | 3 | false |
| UnnecessaryStringEscape | 2 | true |
| UnnecessaryReturn | 2 | true |
| FinalStaticMethod | 2 | false |
| PointlessBitwiseExpression | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| StringEquality | 1 | false |
| UnnecessaryModifier | 1 | true |
| UnnecessaryLabelOnContinueStatement | 1 | false |
| UnnecessaryLabelOnBreakStatement | 1 | false |
| RegExpRedundantEscape | 1 | false |
| ManualArrayCopy | 1 | false |
| RefusedBequest | 1 | false |
| FinalPrivateMethod | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| ExplicitArrayFilling | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| TextLabelInSwitchStatement | 1 | false |
| RedundantLengthCheck | 1 | false |
| UnaryPlus | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| CollectionContainsUrl | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| ExcessiveRangeCheck | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new DispatchRequest\[dispatchRequestList.size()\]'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                                }
                            }
                            dispatchRequestOrderlyQueue.put(task.id, dispatchRequestList.toArray(new DispatchRequest[dispatchRequestList.size()]));
                            mappedPageHoldCount.getAndDecrement();
                        } catch (Exception e) {
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java

            // Record ConsumeQueue information
            Long queueOffset = msgInner.getQueueOffset();

            // this msg maybe a inner-batch msg.
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
            long wroteOffset = fileFromOffset + byteBuffer.position();
            // Record ConsumeQueue information
            Long queueOffset = messageExtBatch.getQueueOffset();
            long beginQueueOffset = queueOffset;
            int totalMsgLen = 0;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
    public String toString() {
        final StringBuilder sb = new StringBuilder(1024);
        Long totalTimes = getPutMessageTimesTotal();
        if (0 == totalTimes) {
            totalTimes = 1L;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        public static double getTPS(final CallSnapshot begin, final CallSnapshot end) {
            long total = end.callTimesTotal - begin.callTimesTotal;
            Long time = end.timestamp - begin.timestamp;

            double tps = total / time.doubleValue();
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `store/src/main/java/org/apache/rocketmq/store/ha/autoswitch/AutoSwitchHAConnection.java`
#### Snippet
```java
                            case HANDSHAKE:
                                // SlaveBrokerId
                                Long slaveBrokerId = byteBufferRead.getLong(readPosition + AutoSwitchHAClient.HANDSHAKE_HEADER_SIZE - 8);
                                AutoSwitchHAConnection.this.slaveId = slaveBrokerId;
                                // Flag(isSyncFromLastFile)
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java

    private long getQueueOffsetByKey(MessageExtBrokerInner msg, int tranType) {
        Long queueOffset = msg.getQueueOffset();

        // Transaction messages that require special handling
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `acl/src/main/java/org/apache/rocketmq/acl/plain/RemoteAddressStrategyFactory.java`
#### Snippet
```java
                        value = netAddress.substring(this.head.length(), netAddress.lastIndexOf('.', netAddress.lastIndexOf('.') - 1));
                    }
                    Integer address = Integer.valueOf(value);
                    return address >= this.start && address <= this.end;
                }
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `acl/src/main/java/org/apache/rocketmq/acl/plain/RemoteAddressStrategyFactory.java`
#### Snippet
```java
                if (netAddress.startsWith(this.head)) {
                    String value = netAddress.substring(5 * index, 5 * index + 4);
                    Integer address = Integer.parseInt(value, 16);
                    return address >= this.start && address <= this.end;
                }
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `!=`, not 'equals()'
in `test/src/main/java/org/apache/rocketmq/test/listener/rmq/order/RMQOrderListener.java`
#### Snippet
```java
        for (MessageExt msg : msgs) {
            if (isDebug) {
                if (listenerName != null && listenerName != "") {
                    LOGGER.info(listenerName + ": " + msg);
                } else {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `openmessaging/src/main/java/io/openmessaging/rocketmq/promise/FutureState.java`
#### Snippet
```java
    public final int value;

    private FutureState(int value) {
        this.value = value;
    }
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
         *  2. DLedger committedPos may be missing, so here just require dispatchBehindBytes <= 0
         */
        while (true) {
            if (dispatchBehindBytes() <= 0) {
                break;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
                        msgExt.setQueueOffset(offset + (i / ConsumeQueue.CQ_STORE_UNIT_SIZE));
                        TimerRequest timerRequest = new TimerRequest(offsetPy, sizePy, delayedTime, System.currentTimeMillis(), MAGIC_DEFAULT, msgExt);
                        while (true) {
                            if (enqueuePutQueue.offer(timerRequest, 3, TimeUnit.SECONDS)) {
                                break;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
                public void run() {
                    int num = 0;
                    while (true) {
                        try {
                            final Message msg = buildMessage(topic);
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1 * 60 * 60 * 1000` can be replaced with '60 \* 60 \* 1000'
in `common/src/main/java/org/apache/rocketmq/common/stats/StatsItem.java`
#### Snippet
```java
        synchronized (this.csListDay) {
            if (this.csListDay.size() == 0) {
                this.csListDay.add(new CallSnapshot(System.currentTimeMillis() - 1 * 60 * 60 * 1000, 0, 0));
            }
            this.csListDay.add(new CallSnapshot(System.currentTimeMillis(), this.times.sum(), this.value
```

### PointlessArithmeticExpression
`4 // 1 TOTALSIZE + 4 // 2 MAGICCODE + 4 // 3 BODYCRC ...` can be replaced with '4 + 4 + 4 + 4 + 4 + 8 + 8 + 4 + 8 + bornhostLength + 8 + storehostAddressLength + 4 + 8 + 4 + bodyLength + 1 + topicLen + 2 + propertiesLength'
in `common/src/main/java/org/apache/rocketmq/common/message/MessageDecoder.java`
#### Snippet
```java
            byteBuffer = ByteBuffer.allocate(storeSize);
        } else {
            storeSize = 4 // 1 TOTALSIZE
                + 4 // 2 MAGICCODE
                + 4 // 3 BODYCRC
                + 4 // 4 QUEUEID
                + 4 // 5 FLAG
                + 8 // 6 QUEUEOFFSET
                + 8 // 7 PHYSICALOFFSET
                + 4 // 8 SYSFLAG
                + 8 // 9 BORNTIMESTAMP
                + bornhostLength // 10 BORNHOST
                + 8 // 11 STORETIMESTAMP
                + storehostAddressLength // 12 STOREHOSTADDRESS
                + 4 // 13 RECONSUMETIMES
                + 8 // 14 Prepared Transaction Offset
                + 4 + bodyLength // 14 BODY
                + 1 + topicLen // 15 TOPIC
                + 2 + propertiesLength // 16 propertiesLength
                + 0;
            byteBuffer = ByteBuffer.allocate(storeSize);
        }
```

### PointlessArithmeticExpression
`1000 * 1` can be replaced with '1000'
in `test/src/main/java/org/apache/rocketmq/test/util/MQAdminTestUtils.java`
#### Snippet
```java
                } catch (Exception e) {
                    e.printStackTrace();
                    Thread.sleep(1000 * 1);
                }
            }
```

### PointlessArithmeticExpression
`2 * 1` can be replaced with '2'
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueueExt.java`
#### Snippet
```java
    public static class CqExtUnit {
        public static final short MIN_EXT_UNIT_SIZE
            = 2 * 1 // size, 32k max
            + 8 * 2 // msg time + tagCode
            + 2; // bitMapSize
```

### PointlessArithmeticExpression
`1 * 1000` can be replaced with '1000'
in `store/src/main/java/org/apache/rocketmq/store/ha/FlowMonitor.java`
#### Snippet
```java
    public void run() {
        while (!this.isStopped()) {
            this.waitForRunning(1 * 1000);
            this.calculateSpeed();
        }
```

### PointlessArithmeticExpression
`60 * 1` can be replaced with '60'
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
    private Map<Long/*bucket*/, LongAdder/*times*/> lastBuckets = new TreeMap<>();

    private static int printTPSInterval = 60 * 1;

    private final LongAdder putMessageFailedTimes = new LongAdder();
```

### PointlessArithmeticExpression
`1L * 60 * 60 * 1000` can be replaced with '60 \* 60 \* 1000'
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
    private boolean mappedFileSwapEnable = true;
    private long commitLogForceSwapMapInterval = 12L * 60 * 60 * 1000;
    private long commitLogSwapMapInterval = 1L * 60 * 60 * 1000;
    private int commitLogSwapMapReserveFileNum = 100;
    private long logicQueueForceSwapMapInterval = 12L * 60 * 60 * 1000;
```

### PointlessArithmeticExpression
`1L * 60 * 60 * 1000` can be replaced with '60 \* 60 \* 1000'
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
    private int commitLogSwapMapReserveFileNum = 100;
    private long logicQueueForceSwapMapInterval = 12L * 60 * 60 * 1000;
    private long logicQueueSwapMapInterval = 1L * 60 * 60 * 1000;
    private long cleanSwapedMapInterval = 5L * 60 * 1000;
    private int logicQueueSwapMapReserveFileNum = 20;
```

### PointlessArithmeticExpression
`1000 * 1` can be replaced with '1000'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopOrderlyService.java`
#### Snippet
```java
                    ConsumeMessagePopOrderlyService.this.lockMQPeriodically();
                }
            }, 1000 * 1, ProcessQueue.REBALANCE_LOCK_INTERVAL, TimeUnit.MILLISECONDS);
        }
    }
```

### PointlessArithmeticExpression
`1000 * 1` can be replaced with '1000'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
                    }
                }
            }, 1000 * 1, ProcessQueue.REBALANCE_LOCK_INTERVAL, TimeUnit.MILLISECONDS);
        }
    }
```

### PointlessArithmeticExpression
`0 - msg.getBody().length` can be replaced with '- msg.getBody().length'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ProcessQueue.java`
#### Snippet
```java
                        if (prev != null) {
                            removedCnt--;
                            msgSize.addAndGet(0 - msg.getBody().length);
                        }
                    }
```

### PointlessArithmeticExpression
`0 - this.consumingMsgOrderlyTreeMap.size()` can be replaced with '- this.consumingMsgOrderlyTreeMap.size()'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ProcessQueue.java`
#### Snippet
```java
            try {
                Long offset = this.consumingMsgOrderlyTreeMap.lastKey();
                msgCount.addAndGet(0 - this.consumingMsgOrderlyTreeMap.size());
                for (MessageExt msg : this.consumingMsgOrderlyTreeMap.values()) {
                    msgSize.addAndGet(0 - msg.getBody().length);
```

### PointlessArithmeticExpression
`0 - msg.getBody().length` can be replaced with '- msg.getBody().length'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ProcessQueue.java`
#### Snippet
```java
                msgCount.addAndGet(0 - this.consumingMsgOrderlyTreeMap.size());
                for (MessageExt msg : this.consumingMsgOrderlyTreeMap.values()) {
                    msgSize.addAndGet(0 - msg.getBody().length);
                }
                this.consumingMsgOrderlyTreeMap.clear();
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `store/src/main/java/org/apache/rocketmq/store/AllocateMappedFileService.java`
#### Snippet
```java
        log.info(this.getServiceName() + " service started");

        while (!this.isStopped() && this.mmapOperation()) {

        }
```

### EmptyStatementBody
`if` statement has empty body
in `store/src/main/java/org/apache/rocketmq/store/index/IndexFile.java`
#### Snippet
```java
            try {
                int slotValue = this.mappedByteBuffer.getInt(absSlotPos);
                if (slotValue <= invalidIndex || slotValue > this.indexHeader.getIndexCount()
                    || this.indexHeader.getIndexCount() <= 1) {
                } else {
```

### EmptyStatementBody
`if` statement has empty body
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                int destroyMappedFileIntervalForcibly =
                    DefaultMessageStore.this.getMessageStoreConfig().getDestroyMapedFileIntervalForcibly();
                if (DefaultMessageStore.this.commitLog.retryDeleteFirstFile(destroyMappedFileIntervalForcibly)) {
                }
            }
```

### EmptyStatementBody
`if` statement has empty body
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        int checkNum = 0;
        while (true) {
            if (dequeuePutQueue.size() > 0
                || !checkStateForGetMessages(AbstractStateService.WAITING)
                || !checkStateForPutMessages(AbstractStateService.WAITING)) {
```

### EmptyStatementBody
`if` statement has empty body
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        scheduler.scheduleAtFixedRate(new Runnable() {
            @Override public void run() {
                if (TimerMessageStore.this.messageStore instanceof DefaultMessageStore &&
                    ((DefaultMessageStore) TimerMessageStore.this.messageStore).getBrokerConfig().isInBrokerContainer()) {
//                    InnerLoggerFactory.BROKER_IDENTITY.set(((DefaultMessageStore) TimerMessageStore.this.messageStore).getBrokerConfig().getLoggerIdentifier());
```

### EmptyStatementBody
`if` statement has empty body
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        scheduler.scheduleAtFixedRate(new Runnable() {
            @Override public void run() {
                if (TimerMessageStore.this.messageStore instanceof DefaultMessageStore &&
                    ((DefaultMessageStore) TimerMessageStore.this.messageStore).getBrokerConfig().isInBrokerContainer()) {
//                    InnerLoggerFactory.BROKER_IDENTITY.set(((DefaultMessageStore) TimerMessageStore.this.messageStore).getBrokerConfig().getLoggerIdentifier());
```

### EmptyStatementBody
`if` statement has empty body
in `acl/src/main/java/org/apache/rocketmq/acl/common/AclUtils.java`
#### Snippet
```java

    public static boolean isScope(String[] num, int index) {
        if (num.length <= index) {

        }
```

### EmptyStatementBody
`else` statement has empty body
in `broker/src/main/java/org/apache/rocketmq/broker/client/rebalance/RebalanceLockManager.java`
#### Snippet
```java
                    clientId, e);
            }
        } else {

        }
```

### EmptyStatementBody
`while` statement has empty body
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AckMessageProcessor.java`
#### Snippet
```java
                return response;
            }
            while (!this.brokerController.getPopMessageProcessor().getQueueLockManager().tryLock(lockKey)) {
            }
            try {
```

### EmptyStatementBody
`if` statement has empty body
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
            mappingContext.setCurrentItem(mappingItem);

            if (globalOffset < mappingItem.getLogicOffset()) {
                //handleOffsetMoved
                //If the physical queue is reused, we should handle the PULL_OFFSET_MOVED independently
```

### EmptyStatementBody
`if` statement has empty body
in `broker/src/main/java/org/apache/rocketmq/broker/processor/SendMessageProcessor.java`
#### Snippet
```java
            //no need to care the broker name
            long staticLogicOffset = mappingItem.computeStaticQueueOffsetLoosely(responseHeader.getQueueOffset());
            if (staticLogicOffset < 0) {
                //if the logic offset is -1, just let it go
                //maybe we need a dynamic config
```

### EmptyStatementBody
`while` statement has empty body
in `broker/src/main/java/org/apache/rocketmq/broker/processor/ChangeInvisibleTimeProcessor.java`
#### Snippet
```java
            return response;
        }
        while (!this.brokerController.getPopMessageProcessor().getQueueLockManager().tryLock(requestHeader.getTopic(), requestHeader.getConsumerGroup(), requestHeader.getQueueId())) {
        }
        try {
```

### EmptyStatementBody
`if` statement has empty body
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/LocalMessageCache.java`
#### Snippet
```java
                        if (!msgTreeMap.isEmpty()) {
                            msg = msgTreeMap.firstEntry().getValue();
                            if (System.currentTimeMillis() - Long.parseLong(MessageAccessor.getConsumeStartTimeStamp(msg))
                                > clientConfig.getRmqMessageConsumeTimeout() * 60 * 1000) {
                                //Expired, ack and remove it.
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `filter/src/main/java/org/apache/rocketmq/filter/parser/TokenMgrError.java`
#### Snippet
```java
                    continue;
                case '\'':
                    retval.append("\\\'");
                    continue;
                case '\\':
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `filter/src/main/java/org/apache/rocketmq/filter/parser/ParseException.java`
#### Snippet
```java
                    continue;
                case '\'':
                    retval.append("\\\'");
                    continue;
                case '\\':
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (14 lines)
in `common/src/main/java/org/apache/rocketmq/common/message/MessageDecoder.java`
#### Snippet
```java
    public static final int QUEUE_OFFSET_POSITION = 4 + 4 + 4 + 4 + 4;
    public static final int SYSFLAG_POSITION = 4 + 4 + 4 + 4 + 4 + 8 + 8;
//    public static final int BODY_SIZE_POSITION = 4 // 1 TOTALSIZE
//        + 4 // 2 MAGICCODE
//        + 4 // 3 BODYCRC
```

### CommentedOutCode
Commented out code (2 lines)
in `store/src/main/java/org/apache/rocketmq/store/AllocateMappedFileService.java`
#### Snippet
```java
                }
            }
            // return this.fileSize < other.fileSize ? 1 : this.fileSize >
            // other.fileSize ? -1 : 0;
        }
```

### CommentedOutCode
Commented out code (2 lines)
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java

        private void printFlushProgress() {
            // CommitLog.log.info("how much disk fall behind memory, "
            // + CommitLog.this.mappedFileQueue.howMuchFallBehind());
        }
```

### CommentedOutCode
Commented out code (5 lines)
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionService.java`
#### Snippet
```java
    }

//    @Override
//    public void start() {
//        compactionStore.load();
```

### CommentedOutCode
Commented out code (3 lines)
in `store/src/main/java/org/apache/rocketmq/store/queue/SparseConsumeQueue.java`
#### Snippet
```java
            short batchSize = byteBuffer.getShort();
            if (offset >= 0 && size > 0 && msgBaseOffset >= 0 && batchSize > 0) {
//                mappedFile.setWrotePosition(i + CQ_STORE_UNIT_SIZE);
//                mappedFile.setFlushedPosition(i + CQ_STORE_UNIT_SIZE);
//                mappedFile.setCommittedPosition(i + CQ_STORE_UNIT_SIZE);
```

### CommentedOutCode
Commented out code (3 lines)
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionLog.java`
#### Snippet
```java

        long beginTime = System.nanoTime();
//        List<String> fileNameToReplace = mappedFileList.stream()
//            .map(m -> m.getFile().getName())
//            .collect(Collectors.toList());
```

### CommentedOutCode
Commented out code (3 lines)
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionLog.java`
#### Snippet
```java
    }

//    public SparseConsumeQueue getCompactionScq() {
//        return compactionScq;
//    }
```

### CommentedOutCode
Commented out code (6 lines)
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java


        // this.scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
        // @Override
        // public void run() {
```

### CommentedOutCode
Commented out code (9 lines)
in `store/src/main/java/org/apache/rocketmq/store/logfile/DefaultMappedFile.java`
#### Snippet
```java

            // prevent gc
            // if (j % 1000 == 0) {
            //     log.info("j={}, costTime={}", j, System.currentTimeMillis() - time);
            //     time = System.currentTimeMillis();
```

### CommentedOutCode
Commented out code (8 lines)
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        } else {

            //            boolean convertStringExpressions = false;
            //            if( sql.startsWith(CONVERT_STRING_EXPRESSIONS_PREFIX)) {
            //                convertStringExpressions = true;
```

### CommentedOutCode
Commented out code (3 lines)
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
            } finally {
                ComparisonExpression.CONVERT_STRING_EXPRESSIONS.remove();
                //                if( convertStringExpressions ) {
                //                    ComparisonExpression.CONVERT_STRING_EXPRESSIONS.remove();
                //                }
```

### CommentedOutCode
Commented out code (11 lines)
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicConfigManager.java`
#### Snippet
```java
            // To avoid the above case, we comment the below codes, please use mqadmin API to update
            // the order filed.
            /*for (Map.Entry<String, TopicConfig> entry : this.topicConfigTable.entrySet()) {
                String topic = entry.getKey();
                if (!orderTopics.contains(topic)) {
```

### CommentedOutCode
Commented out code (5 lines)
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
            }

//            // check ak done
//            if (isCkDone(pointWrapper)) {
//                // cancel ck for timer
```

### CommentedOutCode
Commented out code (2 lines)
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
                    popBufferMergeService.addCkMock(requestHeader.getConsumerGroup(), topic, queueId, finalOffset,
                        requestHeader.getInvisibleTime(), popTime, reviveQid, result.getNextBeginOffset(), brokerController.getBrokerConfig().getBrokerName());
//                this.brokerController.getConsumerOffsetManager().commitOffset(channel.remoteAddress().toString(), requestHeader.getConsumerGroup(), topic,
//                        queueId, getMessageTmpResult.getNextBeginOffset());
                }
```

### CommentedOutCode
Commented out code (2 lines)
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
    private RemotingCommand getAllTopicConfig(ChannelHandlerContext ctx, RemotingCommand request) {
        final RemotingCommand response = RemotingCommand.createResponseCommand(GetAllTopicConfigResponseHeader.class);
        // final GetAllTopicConfigResponseHeader responseHeader =
        // (GetAllTopicConfigResponseHeader) response.readCustomHeader();

```

### CommentedOutCode
Commented out code (4 lines)
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredMessageQueueContainer.java`
#### Snippet
```java

        // building indexes with offsetId is no longer supported because offsetId has changed in tiered storage
//        AppendResult result = indexFile.append(messageQueue, request.getOffsetId(), request.getCommitLogOffset(), request.getMsgSize(), request.getStoreTimestamp());
//        if (result != AppendResult.SUCCESS) {
//            return result;
```

### CommentedOutCode
Commented out code (2 lines)
in `example/src/main/java/org/apache/rocketmq/example/simple/PullConsumer.java`
#### Snippet
```java

        }
//        executors.shutdown();
//        consumer.shutdown();
    }
```

### CommentedOutCode
Commented out code (7 lines)
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/body/ConsumerRunningInfo.java`
#### Snippet
```java

                // after consumer.unsubscribe , SubscriptionSet is Empty
                //if (prev != null) {
                //
                //    if (prev.getSubscriptionSet().isEmpty()) {
```

## RuleId[id=UnnecessaryLabelOnContinueStatement]
### UnnecessaryLabelOnContinueStatement
Unnecessary label `EOFLoop` on continue statement
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                        }
                    }
                    continue EOFLoop;
                }
            }
```

## RuleId[id=UnnecessaryLabelOnBreakStatement]
### UnnecessaryLabelOnBreakStatement
Unnecessary label `jj_entries_loop` on break statement
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                    }
                    jjExpentries.add(jjExpentry);
                    break jj_entries_loop;
                }
            }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `openmessaging/src/main/java/io/openmessaging/rocketmq/utils/BeanUtils.java`
#### Snippet
```java
            final Set<String> keySet = properties.keySet();
            for (String key : keySet) {
                String[] keyGroup = key.split("[\\._]");
                for (int i = 0; i < keyGroup.length; i++) {
                    keyGroup[i] = keyGroup[i].toLowerCase();
```

## RuleId[id=ManualArrayCopy]
### ManualArrayCopy
Manual array copy
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        } else if (jjEndpos != 0) {
            jjExpentry = new int[jjEndpos];
            for (int i = 0; i < jjEndpos; i++) {
                jjExpentry[i] = jjLasttokens[i];
            }
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `filter/src/main/java/org/apache/rocketmq/filter/util/BitsArray.java`
#### Snippet
```java
    }

    public BitsArray clone() {
        byte[] clone = new byte[this.byteLength()];

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `proxy/src/main/java/org/apache/rocketmq/proxy/metrics/ProxyMetricsManager.java`
#### Snippet
```java
                return true;
            case LOG:
                return true;
        }
        return false;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
                        return CompletableFuture.completedFuture(new PutMessageResult(PutMessageStatus.MESSAGE_ILLEGAL, result));
                    case UNKNOWN_ERROR:
                        beginTimeInLock = 0;
                        return CompletableFuture.completedFuture(new PutMessageResult(PutMessageStatus.UNKNOWN_ERROR, result));
                    default:
                        beginTimeInLock = 0;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPullConsumerImpl.java`
#### Snippet
```java
        switch (this.serviceState) {
            case CREATE_JUST:
                break;
            case RUNNING:
                this.persistConsumerOffset();
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPullConsumerImpl.java`
#### Snippet
```java
                break;
            case SHUTDOWN_ALREADY:
                break;
            default:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
        switch (this.serviceState) {
            case CREATE_JUST:
                break;
            case RUNNING:
                persistConsumerOffset();
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                break;
            case ResponseCode.PULL_NOT_FOUND:
                popStatus = PopStatus.POLLING_NOT_FOUND;
                break;
            default:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
                        break;
                    case POLLING_FULL:
                        DefaultMQPushConsumerImpl.this.executePopPullRequestLater(popRequest, pullTimeDelayMillsWhenException);
                        break;
                    default:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
        switch (this.serviceState) {
            case CREATE_JUST:
                break;
            case RUNNING:
                this.consumeMessageService.shutdown(awaitTerminateMillis);
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
                break;
            case SHUTDOWN_ALREADY:
                break;
            default:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
            switch (this.defaultMQPushConsumer.getMessageModel()) {
                case BROADCASTING:
                    break;
                case CLUSTERING:
                    final String retryTopic = MixAll.getRetryTopic(this.defaultMQPushConsumer.getConsumerGroup());
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
        switch (this.serviceState) {
            case CREATE_JUST:
                break;
            case RUNNING:
                this.mQClientFactory.unregisterProducer(this.defaultMQProducer.getProducerGroup());
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
                break;
            case SHUTDOWN_ALREADY:
                break;
            default:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
                                return null;
                            case ONEWAY:
                                return null;
                            case SYNC:
                                if (sendResult.getSendStatus() != SendStatus.SEND_OK) {
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `acl/src/main/java/org/apache/rocketmq/acl/common/Permission.java`
#### Snippet
```java
                return Permission.PUB | Permission.SUB;
            case AclConstants.DENY:
                return Permission.DENY;
            default:
                return Permission.DENY;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
            case 100:
                if ((active0 & 0x200L) != 0L) {
                    jjmatchedKind = 9;
                    jjmatchedPos = 2;
                }
                break;
            case 108:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                break;
            case 108:
                return jjMoveStringLiteralDfa3_0(active0, 0xc000L);
            case 116:
                if ((active0 & 0x100L) != 0L) {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa3_0(active0, 0xc000L);
            case 116:
                if ((active0 & 0x100L) != 0L) {
                    jjmatchedKind = 8;
                    jjmatchedPos = 2;
                }
                return jjMoveStringLiteralDfa3_0(active0, 0x800L);
            case 117:
                return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa3_0(active0, 0x800L);
            case 117:
                return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
            default:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa4_0(active0, 0x800L);
            case 101:
                if ((active0 & 0x2000L) != 0L) {
                    jjmatchedKind = 13;
                    jjmatchedPos = 3;
                }
                break;
            case 108:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                break;
            case 108:
                if ((active0 & 0x8000L) != 0L) {
                    jjmatchedKind = 15;
                    jjmatchedPos = 3;
                }
                break;
            case 115:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                break;
            case 115:
                return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
            case 119:
                return jjMoveStringLiteralDfa4_0(active0, 0x800L);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
            case 119:
                return jjMoveStringLiteralDfa4_0(active0, 0x800L);
            default:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                break;
            case 110:
                if ((active0 & 0x800L) != 0L) {
                    jjmatchedKind = 11;
                    jjmatchedPos = 6;
                }
                break;
            default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa1_0(0x2000L);
            case 97:
                return jjMoveStringLiteralDfa1_0(0x200L);
            case 98:
                return jjMoveStringLiteralDfa1_0(0x800L);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa1_0(0x200L);
            case 98:
                return jjMoveStringLiteralDfa1_0(0x800L);
            case 102:
                return jjMoveStringLiteralDfa1_0(0x4000L);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa1_0(0x800L);
            case 102:
                return jjMoveStringLiteralDfa1_0(0x4000L);
            case 105:
                return jjMoveStringLiteralDfa1_0(0x11000L);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa1_0(0x4000L);
            case 105:
                return jjMoveStringLiteralDfa1_0(0x11000L);
            case 110:
                return jjMoveStringLiteralDfa1_0(0x8100L);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa1_0(0x11000L);
            case 110:
                return jjMoveStringLiteralDfa1_0(0x8100L);
            case 111:
                return jjMoveStringLiteralDfa1_0(0x400L);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa1_0(0x8100L);
            case 111:
                return jjMoveStringLiteralDfa1_0(0x400L);
            case 116:
                return jjMoveStringLiteralDfa1_0(0x2000L);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa1_0(0x400L);
            case 116:
                return jjMoveStringLiteralDfa1_0(0x2000L);
            default:
                return jjMoveNfa_0(5, 0);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
            case 97:
                return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
            case 101:
                return jjMoveStringLiteralDfa2_0(active0, 0x800L);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
            case 101:
                return jjMoveStringLiteralDfa2_0(active0, 0x800L);
            case 110:
                if ((active0 & 0x1000L) != 0L) {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa2_0(active0, 0x800L);
            case 110:
                if ((active0 & 0x1000L) != 0L) {
                    jjmatchedKind = 12;
                    jjmatchedPos = 1;
                }
                return jjMoveStringLiteralDfa2_0(active0, 0x200L);
            case 111:
                return jjMoveStringLiteralDfa2_0(active0, 0x100L);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa2_0(active0, 0x200L);
            case 111:
                return jjMoveStringLiteralDfa2_0(active0, 0x100L);
            case 114:
                if ((active0 & 0x400L) != 0L) {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa2_0(active0, 0x100L);
            case 114:
                if ((active0 & 0x400L) != 0L) {
                    jjmatchedKind = 10;
                    jjmatchedPos = 1;
                }
                return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
            case 115:
                if ((active0 & 0x10000L) != 0L) {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
            case 115:
                if ((active0 & 0x10000L) != 0L) {
                    jjmatchedKind = 16;
                    jjmatchedPos = 1;
                }
                break;
            case 117:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                break;
            case 117:
                return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
            default:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa5_0(active0, 0x800L);
            case 101:
                if ((active0 & 0x4000L) != 0L) {
                    jjmatchedKind = 14;
                    jjmatchedPos = 4;
                }
                return jjMoveStringLiteralDfa5_0(active0, 0x800L);
            default:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return jjMoveStringLiteralDfa6_0(active0, 0x800L);
            case 101:
                return jjMoveStringLiteralDfa6_0(active0, 0x800L);
            default:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `broker/src/main/java/org/apache/rocketmq/broker/metrics/BrokerMetricsManager.java`
#### Snippet
```java
                return true;
            case LOG:
                return true;
        }
        return false;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
                break;
            case NO_MATCHED_MESSAGE:
                response.setCode(ResponseCode.PULL_RETRY_IMMEDIATELY);
                break;
            case OFFSET_FOUND_NULL:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
                break;
            case OFFSET_OVERFLOW_ONE:
                response.setCode(ResponseCode.PULL_NOT_FOUND);
                break;
            case OFFSET_RESET:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `example/src/main/java/org/apache/rocketmq/example/simple/PullScheduleService.java`
#### Snippet
```java
                    switch (pullResult.getPullStatus()) {
                        case FOUND:
                            break;
                        case NO_MATCHED_MSG:
                            break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `example/src/main/java/org/apache/rocketmq/example/simple/PullScheduleService.java`
#### Snippet
```java
                            break;
                        case NO_MATCHED_MSG:
                            break;
                        case NO_NEW_MSG:
                        case OFFSET_ILLEGAL:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `example/src/main/java/org/apache/rocketmq/example/simple/PullScheduleService.java`
#### Snippet
```java
                        case NO_NEW_MSG:
                        case OFFSET_ILLEGAL:
                            break;
                        default:
                            break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `example/src/main/java/org/apache/rocketmq/example/simple/PullConsumer.java`
#### Snippet
```java
                                            break;
                                        case NO_MATCHED_MSG:
                                            consumer.updateConsumeOffset(messageQueue, pullResult.getNextBeginOffset());
                                            break;
                                        default:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `example/src/main/java/org/apache/rocketmq/example/simple/AclClient.java`
#### Snippet
```java
                    switch (pullResult.getPullStatus()) {
                        case FOUND:
                            break;
                        case NO_MATCHED_MSG:
                            break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `example/src/main/java/org/apache/rocketmq/example/simple/AclClient.java`
#### Snippet
```java
                            break;
                        case NO_MATCHED_MSG:
                            break;
                        case NO_NEW_MSG:
                            break SINGLE_MQ;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `example/src/main/java/org/apache/rocketmq/example/simple/AclClient.java`
#### Snippet
```java
                            break SINGLE_MQ;
                        case OFFSET_ILLEGAL:
                            break;
                        default:
                            break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `example/src/main/java/org/apache/rocketmq/example/namespace/PullConsumerWithNamespace.java`
#### Snippet
```java
                            break;
                        case NO_MATCHED_MSG:
                            break;
                        case NO_NEW_MSG:
                            break SINGLE_MQ;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `example/src/main/java/org/apache/rocketmq/example/namespace/PullConsumerWithNamespace.java`
#### Snippet
```java
                            break SINGLE_MQ;
                        case OFFSET_ILLEGAL:
                            break;
                        default:
                            break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `example/src/main/java/org/apache/rocketmq/example/transaction/TransactionListenerImpl.java`
#### Snippet
```java
                    return LocalTransactionState.UNKNOW;
                case 1:
                    return LocalTransactionState.COMMIT_MESSAGE;
                case 2:
                    return LocalTransactionState.ROLLBACK_MESSAGE;
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
    };

    private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2) {
        switch (hiByte) {
            case 0:
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `name` in enum 'BoundaryType'
in `common/src/main/java/org/apache/rocketmq/common/BoundaryType.java`
#### Snippet
```java
    UPPER("upper");

    private String name;

    BoundaryType(String name) {
```

### NonFinalFieldInEnum
Non-final field `name` in enum 'MessageRequestMode'
in `common/src/main/java/org/apache/rocketmq/common/message/MessageRequestMode.java`
#### Snippet
```java
    POP("POP");

    private String name;

    MessageRequestMode(String name) {
```

### NonFinalFieldInEnum
Non-final field `name` in enum 'BoundaryType'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/common/BoundaryType.java`
#### Snippet
```java
    UPPER("upper");

    private String name;

    BoundaryType(String name) {
```

### NonFinalFieldInEnum
Non-final field `type` in enum 'FileSegmentType'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/TieredFileSegment.java`
#### Snippet
```java
        INDEX(2);

        private int type;

        FileSegmentType(int type) {
```

### NonFinalFieldInEnum
Non-final field `name` in enum 'TlsMode'
in `remoting/src/main/java/org/apache/rocketmq/remoting/common/TlsMode.java`
#### Snippet
```java
    ENFORCING("enforcing");

    private String name;

    TlsMode(String name) {
```

### NonFinalFieldInEnum
Non-final field `code` in enum 'LanguageCode'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/LanguageCode.java`
#### Snippet
```java
    RUST((byte) 12);

    private byte code;

    LanguageCode(byte code) {
```

### NonFinalFieldInEnum
Non-final field `code` in enum 'SerializeType'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/SerializeType.java`
#### Snippet
```java
    ROCKETMQ((byte) 1);

    private byte code;

    SerializeType(byte code) {
```

### NonFinalFieldInEnum
Non-final field `typeCN` in enum 'ConsumeType'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/ConsumeType.java`
#### Snippet
```java
    CONSUME_POP("POP");

    private String typeCN;

    ConsumeType(String typeCN) {
```

### NonFinalFieldInEnum
Non-final field `modeCN` in enum 'MessageModel'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/MessageModel.java`
#### Snippet
```java
    CLUSTERING("CLUSTERING");

    private String modeCN;

    MessageModel(String modeCN) {
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `077`
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                while (i != startsAt);
            } else if (curChar < 128) {
                long l = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
```

### OctalLiteral
Octal integer `077`
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                int hiByte = (int) (curChar >> 8);
                int i1 = hiByte >> 6;
                long l1 = 1L << (hiByte & 077);
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
```

### OctalLiteral
Octal integer `077`
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                long l1 = 1L << (hiByte & 077);
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
```

### OctalLiteral
Octal integer `077`
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                if (jjmatchedPos + 1 < curPos)
                    inputStream.backup(curPos - jjmatchedPos - 1);
                if ((JJ_TO_TOKEN[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
                    matchedToken = jjFillToken();
                    matchedToken.specialToken = specialToken;
```

### OctalLiteral
Octal integer `077`
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                    return matchedToken;
                } else {
                    if ((JJ_TO_SPECIAL[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
                        matchedToken = jjFillToken();
                        if (specialToken == null)
```

## RuleId[id=Deprecation]
### Deprecation
'compress(byte\[\], int)' is deprecated
in `common/src/main/java/org/apache/rocketmq/common/message/MessageDecoder.java`
#### Snippet
```java
        byte[] newBody = messageExt.getBody();
        if (needCompress && (sysFlag & MessageSysFlag.COMPRESSED_FLAG) == MessageSysFlag.COMPRESSED_FLAG) {
            newBody = UtilAll.compress(body, 5);
        }
        int bodyLength = newBody.length;
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/schema/SchemaDefiner.java`
#### Snippet
```java
            API_CLASS_LIST.add(DefaultMQPushConsumer.class);
            API_CLASS_LIST.add(DefaultMQProducer.class);
            API_CLASS_LIST.add(DefaultMQPullConsumer.class);
            API_CLASS_LIST.add(DefaultLitePullConsumer.class);
            API_CLASS_LIST.add(DefaultMQAdminExt.class);
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/factory/ConsumerFactory.java`
#### Snippet
```java
    }

    public static DefaultMQPullConsumer getRMQPullConsumer(String nsAddr, String consumerGroup) throws Exception {
        DefaultMQPullConsumer defaultMQPullConsumer = new DefaultMQPullConsumer(consumerGroup);
        defaultMQPullConsumer.setInstanceName(UUID.randomUUID().toString());
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/factory/ConsumerFactory.java`
#### Snippet
```java

    public static DefaultMQPullConsumer getRMQPullConsumer(String nsAddr, String consumerGroup) throws Exception {
        DefaultMQPullConsumer defaultMQPullConsumer = new DefaultMQPullConsumer(consumerGroup);
        defaultMQPullConsumer.setInstanceName(UUID.randomUUID().toString());
        defaultMQPullConsumer.setNamesrvAddr(nsAddr);
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/factory/ConsumerFactory.java`
#### Snippet
```java

    public static DefaultMQPullConsumer getRMQPullConsumer(String nsAddr, String consumerGroup) throws Exception {
        DefaultMQPullConsumer defaultMQPullConsumer = new DefaultMQPullConsumer(consumerGroup);
        defaultMQPullConsumer.setInstanceName(UUID.randomUUID().toString());
        defaultMQPullConsumer.setNamesrvAddr(nsAddr);
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
        //defaultMQProducer.createTopic(lmqTopic, lmqTopic, 8);
        for (int i = 0; i < pullConsumerNum; i++) {
            DefaultMQPullConsumer defaultMQPullConsumer = new DefaultMQPullConsumer();
            defaultMQPullConsumers[i] = defaultMQPullConsumer;
            defaultMQPullConsumer.setNamesrvAddr(namesrv);
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
        //defaultMQProducer.createTopic(lmqTopic, lmqTopic, 8);
        for (int i = 0; i < pullConsumerNum; i++) {
            DefaultMQPullConsumer defaultMQPullConsumer = new DefaultMQPullConsumer();
            defaultMQPullConsumers[i] = defaultMQPullConsumer;
            defaultMQPullConsumer.setNamesrvAddr(namesrv);
```

### Deprecation
'setBrokerSuspendMaxTimeMillis(long)' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
            defaultMQPullConsumer.setInstanceName("CID_RMQ_SYS_LMQ_TEST_" + i);
            defaultMQPullConsumer.setRegisterTopics(new HashSet<>(Collections.singletonList(lmqTopic)));
            defaultMQPullConsumer.setBrokerSuspendMaxTimeMillis(suspendTime);
            defaultMQPullConsumer.setConsumerTimeoutMillisWhenSuspend(suspendTime + 1000);
            defaultMQPullConsumer.start();
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
                            long id = rid.incrementAndGet();
                            int index = (Integer.MAX_VALUE & (int) id) % defaultMQPullConsumers.length;
                            DefaultMQPullConsumer defaultMQPullConsumer = defaultMQPullConsumers[index];
                            String lmq = LMQ_PREFIX + queuePrefix + id % benchOffsetNum;
                            String lmqCid = LMQ_PREFIX + "GID_LMQ@@c" + flag + "-" + id % benchOffsetNum;
```

### Deprecation
'getDefaultMQPullConsumerImpl()' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
                            updateHeader.setCommitOffset(newOffset1);
                            defaultMQPullConsumer
                                .getDefaultMQPullConsumerImpl()
                                .getRebalanceImpl()
                                .getmQClientFactory()
```

### Deprecation
'getDefaultMQPullConsumerImpl()' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
                            queryHeader.setQueueId(0);
                            long newOffset2 = defaultMQPullConsumer
                                .getDefaultMQPullConsumerImpl()
                                .getRebalanceImpl()
                                .getmQClientFactory()
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    public static DefaultMQProducer defaultMQProducer;
    private static int pullConsumerNum = Integer.parseInt(System.getProperty("pullConsumerNum", "8"));
    public static DefaultMQPullConsumer[] defaultMQPullConsumers = new DefaultMQPullConsumer[pullConsumerNum];
    private static AtomicLong rid = new AtomicLong();
    private static final String LMQ_PREFIX = "%LMQ%";
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    public static DefaultMQProducer defaultMQProducer;
    private static int pullConsumerNum = Integer.parseInt(System.getProperty("pullConsumerNum", "8"));
    public static DefaultMQPullConsumer[] defaultMQPullConsumers = new DefaultMQPullConsumer[pullConsumerNum];
    private static AtomicLong rid = new AtomicLong();
    private static final String LMQ_PREFIX = "%LMQ%";
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
            return;
        }
        DefaultMQPullConsumer defaultMQPullConsumer = defaultMQPullConsumers[(int) (eventId % pullConsumerNum)];
        Long offset = offsetMap.get(mq);
        if (offset == null) {
```

### Deprecation
'maxOffset(org.apache.rocketmq.common.message.MessageQueue)' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
        if (offset == null) {
            long start = System.currentTimeMillis();
            offset = defaultMQPullConsumer.maxOffset(mq);
            StatUtil.addInvoke("maxOffset", System.currentTimeMillis() - start);
            offsetMap.put(mq, offset);
```

### Deprecation
'getDefaultMQPullConsumerImpl()' is deprecated
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
        Map<String, Long> offsetMap = new ConcurrentHashMap<>();
        String statKey = "benchOffset";
        TopicRouteData topicRouteData = defaultMQPullConsumers[0].getDefaultMQPullConsumerImpl().
            getRebalanceImpl().getmQClientFactory().getMQClientAPIImpl().
            getTopicRouteInfoFromNameServer(lmqTopic, 3000);
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/MQHelper.java`
#### Snippet
```java
        final long timestamp) throws Exception {

        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer(consumerGroup);
        consumer.setInstanceName(instanceName);
        consumer.setMessageModel(messageModel);
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/MQHelper.java`
#### Snippet
```java
        final long timestamp) throws Exception {

        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer(consumerGroup);
        consumer.setInstanceName(instanceName);
        consumer.setMessageModel(messageModel);
```

### Deprecation
'searchOffset(org.apache.rocketmq.common.message.MessageQueue, long)' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/MQHelper.java`
#### Snippet
```java
                TreeSet<MessageQueue> mqsNew = new TreeSet<>(mqs);
                for (MessageQueue mq : mqsNew) {
                    long offset = consumer.searchOffset(mq, timestamp);
                    if (offset >= 0) {
                        consumer.updateConsumeOffset(mq, offset);
```

### Deprecation
'getDefaultMQPullConsumerImpl()' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/MQHelper.java`
#### Snippet
```java
        } finally {
            if (mqs != null) {
                consumer.getDefaultMQPullConsumerImpl().getOffsetStore().persistAll(mqs);
            }
            consumer.shutdown();
```

### Deprecation
'recoverAbnormally(long)' is deprecated
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
            this.commitLog.recoverNormally(maxPhyOffsetOfConsumeQueue);
        } else {
            this.commitLog.recoverAbnormally(maxPhyOffsetOfConsumeQueue);
        }

```

### Deprecation
'getdLedgerConfig()' is deprecated
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        String storePathPhysic;
        if (DefaultMessageStore.this.getMessageStoreConfig().isEnableDLegerCommitLog()) {
            storePathPhysic = ((DLedgerCommitLog) DefaultMessageStore.this.getCommitLog()).getdLedgerServer().getdLedgerConfig().getDataStorePath();
        } else {
            storePathPhysic = DefaultMessageStore.this.getMessageStoreConfig().getStorePathCommitLog();
```

### Deprecation
'getdLedgerConfig()' is deprecated
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
            return null;
        }
        int mappedFileSize = this.dLedgerServer.getdLedgerConfig().getMappedFileSizeForEntryData();
        MmapFile mappedFile = this.dLedgerFileList.findMappedFileByOffset(offset, returnFirstOnNotFound);
        if (mappedFile != null) {
```

### Deprecation
Overrides deprecated method in 'org.apache.rocketmq.store.CommitLog'
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java

    @Override
    public void recoverAbnormally(long maxPhyOffsetOfConsumeQueue) {
        recover(maxPhyOffsetOfConsumeQueue);
    }
```

### Deprecation
'setPreferredLeaderId(java.lang.String)' is deprecated
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
        dLedgerConfig.setDeleteWhen(defaultMessageStore.getMessageStoreConfig().getDeleteWhen());
        dLedgerConfig.setFileReservedHours(defaultMessageStore.getMessageStoreConfig().getFileReservedTime() + 1);
        dLedgerConfig.setPreferredLeaderId(defaultMessageStore.getMessageStoreConfig().getPreferredLeaderId());
        dLedgerConfig.setEnableBatchPush(defaultMessageStore.getMessageStoreConfig().isEnableBatchPush());
        dLedgerConfig.setDiskSpaceRatioToCheckExpired(defaultMessageStore.getMessageStoreConfig().getDiskMaxUsedSpaceRatio() / 100f);
```

### Deprecation
'getdLedgerStore()' is deprecated
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
        id = Integer.parseInt(dLedgerConfig.getSelfId().substring(1)) + 1;
        dLedgerServer = new DLedgerServer(dLedgerConfig);
        dLedgerFileStore = (DLedgerMmapFileStore) dLedgerServer.getdLedgerStore();
        DLedgerMmapFileStore.AppendHook appendHook = (entry, buffer, bodyOffset) -> {
            assert bodyOffset == DLedgerEntry.BODY_OFFSET;
```

### Deprecation
'getdLedgerConfig()' is deprecated
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
            return false;
        }
        int mappedFileSize = this.dLedgerServer.getdLedgerConfig().getMappedFileSizeForEntryData();
        MmapFile mappedFile = this.dLedgerFileList.findMappedFileByOffset(offset, offset == 0);
        if (mappedFile != null) {
```

### Deprecation
'getdLedgerConfig()' is deprecated
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
            return super.getMessage(offset, size);
        }
        int mappedFileSize = this.dLedgerServer.getdLedgerConfig().getMappedFileSizeForEntryData();
        MmapFile mappedFile = this.dLedgerFileList.findMappedFileByOffset(offset, offset == 0);
        if (mappedFile != null) {
```

### Deprecation
'COMMIT' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopOrderlyService.java`
#### Snippet
```java
            if (status != null) {
                switch (status) {
                    case COMMIT:
                        result.setConsumeResult(CMResult.CR_COMMIT);
                        break;
```

### Deprecation
'ROLLBACK' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopOrderlyService.java`
#### Snippet
```java
                        result.setConsumeResult(CMResult.CR_COMMIT);
                        break;
                    case ROLLBACK:
                        result.setConsumeResult(CMResult.CR_ROLLBACK);
                        break;
```

### Deprecation
'getDefaultMQPushConsumerImpl()' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopOrderlyService.java`
#### Snippet
```java
            newMsg.setDelayTimeLevel(3 + msg.getReconsumeTimes());

            this.defaultMQPushConsumer.getDefaultMQPushConsumerImpl().getmQClientFactory().getDefaultMQProducer().send(newMsg);
            return true;
        } catch (Exception e) {
```

### Deprecation
'io.netty.util.internal.ConcurrentSet' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopOrderlyService.java`
#### Snippet
```java
    private final MessageListenerOrderly messageListener;
    private final BlockingQueue<Runnable> consumeRequestQueue;
    private final ConcurrentSet<ConsumeRequest> consumeRequestSet = new ConcurrentSet<>();
    private final ThreadPoolExecutor consumeExecutor;
    private final String consumerGroup;
```

### Deprecation
'io.netty.util.internal.ConcurrentSet' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopOrderlyService.java`
#### Snippet
```java
    private final MessageListenerOrderly messageListener;
    private final BlockingQueue<Runnable> consumeRequestQueue;
    private final ConcurrentSet<ConsumeRequest> consumeRequestSet = new ConcurrentSet<>();
    private final ThreadPoolExecutor consumeExecutor;
    private final String consumerGroup;
```

### Deprecation
'org.apache.rocketmq.client.impl.consumer.DefaultMQPullConsumerImpl' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalancePullImpl.java`
#### Snippet
```java
    private final DefaultMQPullConsumerImpl defaultMQPullConsumerImpl;

    public RebalancePullImpl(DefaultMQPullConsumerImpl defaultMQPullConsumerImpl) {
        this(null, null, null, null, defaultMQPullConsumerImpl);
    }
```

### Deprecation
'org.apache.rocketmq.client.impl.consumer.DefaultMQPullConsumerImpl' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalancePullImpl.java`
#### Snippet
```java
    public RebalancePullImpl(String consumerGroup, MessageModel messageModel,
        AllocateMessageQueueStrategy allocateMessageQueueStrategy,
        MQClientInstance mQClientFactory, DefaultMQPullConsumerImpl defaultMQPullConsumerImpl) {
        super(consumerGroup, messageModel, allocateMessageQueueStrategy, mQClientFactory);
        this.defaultMQPullConsumerImpl = defaultMQPullConsumerImpl;
```

### Deprecation
'org.apache.rocketmq.client.impl.consumer.DefaultMQPullConsumerImpl' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalancePullImpl.java`
#### Snippet
```java

public class RebalancePullImpl extends RebalanceImpl {
    private final DefaultMQPullConsumerImpl defaultMQPullConsumerImpl;

    public RebalancePullImpl(DefaultMQPullConsumerImpl defaultMQPullConsumerImpl) {
```

### Deprecation
'getDefaultMQPushConsumerImpl()' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
            newMsg.setDelayTimeLevel(3 + msg.getReconsumeTimes());

            this.defaultMQPushConsumer.getDefaultMQPushConsumerImpl().getmQClientFactory().getDefaultMQProducer().send(newMsg);
            return true;
        } catch (Exception e) {
```

### Deprecation
'ROLLBACK' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java

                            if (null == status
                                || ConsumeOrderlyStatus.ROLLBACK == status
                                || ConsumeOrderlyStatus.SUSPEND_CURRENT_QUEUE_A_MOMENT == status) {
                                log.warn("consumeMessage Orderly return not OK, Group: {} Msgs: {} MQ: {}",
```

### Deprecation
'COMMIT' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
                                consumeMessageContext.setStatus(status.toString());
                                consumeMessageContext
                                    .setSuccess(ConsumeOrderlyStatus.SUCCESS == status || ConsumeOrderlyStatus.COMMIT == status);
                                ConsumeMessageOrderlyService.this.defaultMQPushConsumerImpl.executeHookAfter(consumeMessageContext);
                            }
```

### Deprecation
'COMMIT' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
        if (context.isAutoCommit()) {
            switch (status) {
                case COMMIT:
                case ROLLBACK:
                    log.warn("the message queue consume result is illegal, we think you want to ack these message {}",
```

### Deprecation
'ROLLBACK' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
            switch (status) {
                case COMMIT:
                case ROLLBACK:
                    log.warn("the message queue consume result is illegal, we think you want to ack these message {}",
                        consumeRequest.getMessageQueue());
```

### Deprecation
'COMMIT' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
                    this.getConsumerStatsManager().incConsumeOKTPS(consumerGroup, consumeRequest.getMessageQueue().getTopic(), msgs.size());
                    break;
                case COMMIT:
                    commitOffset = consumeRequest.getProcessQueue().commit();
                    break;
```

### Deprecation
'ROLLBACK' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
                    commitOffset = consumeRequest.getProcessQueue().commit();
                    break;
                case ROLLBACK:
                    consumeRequest.getProcessQueue().rollback();
                    this.submitConsumeRequestLater(
```

### Deprecation
'COMMIT' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
            if (status != null) {
                switch (status) {
                    case COMMIT:
                        result.setConsumeResult(CMResult.CR_COMMIT);
                        break;
```

### Deprecation
'ROLLBACK' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
                        result.setConsumeResult(CMResult.CR_COMMIT);
                        break;
                    case ROLLBACK:
                        result.setConsumeResult(CMResult.CR_ROLLBACK);
                        break;
```

### Deprecation
'getDefaultMQPushConsumerImpl()' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ProcessQueue.java`
#### Snippet
```java
     */
    public void cleanExpiredMsg(DefaultMQPushConsumer pushConsumer) {
        if (pushConsumer.getDefaultMQPushConsumerImpl().isConsumeOrderly()) {
            return;
        }
```

### Deprecation
'sendMessageBack(org.apache.rocketmq.common.message.MessageExt, int)' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ProcessQueue.java`
#### Snippet
```java
            try {

                pushConsumer.sendMessageBack(msg, 3);
                log.info("send expire msg back. topic={}, msgId={}, storeHost={}, queueId={}, queueOffset={}", msg.getTopic(), msg.getMsgId(), msg.getStoreHost(), msg.getQueueId(), msg.getQueueOffset());
                try {
```

### Deprecation
'CONSUME_FROM_LAST_OFFSET_AND_FROM_MIN_WHEN_BOOT_FIRST' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalancePushImpl.java`
#### Snippet
```java
        final OffsetStore offsetStore = this.defaultMQPushConsumerImpl.getOffsetStore();
        switch (consumeFromWhere) {
            case CONSUME_FROM_LAST_OFFSET_AND_FROM_MIN_WHEN_BOOT_FIRST:
            case CONSUME_FROM_MIN_OFFSET:
            case CONSUME_FROM_MAX_OFFSET:
```

### Deprecation
'CONSUME_FROM_MIN_OFFSET' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalancePushImpl.java`
#### Snippet
```java
        switch (consumeFromWhere) {
            case CONSUME_FROM_LAST_OFFSET_AND_FROM_MIN_WHEN_BOOT_FIRST:
            case CONSUME_FROM_MIN_OFFSET:
            case CONSUME_FROM_MAX_OFFSET:
            case CONSUME_FROM_LAST_OFFSET: {
```

### Deprecation
'CONSUME_FROM_MAX_OFFSET' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalancePushImpl.java`
#### Snippet
```java
            case CONSUME_FROM_LAST_OFFSET_AND_FROM_MIN_WHEN_BOOT_FIRST:
            case CONSUME_FROM_MIN_OFFSET:
            case CONSUME_FROM_MAX_OFFSET:
            case CONSUME_FROM_LAST_OFFSET: {
                long lastOffset = offsetStore.readOffset(mq, ReadOffsetType.READ_FROM_STORE);
```

### Deprecation
'org.apache.rocketmq.client.producer.TransactionCheckListener' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/MQProducerInner.java`
#### Snippet
```java
    boolean isPublishTopicNeedUpdate(final String topic);

    TransactionCheckListener checkListener();
    TransactionListener getCheckListener();

```

### Deprecation
'getDefaultMQProducerImpl()' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/factory/MQClientInstance.java`
#### Snippet
```java
                    this.rebalanceService.start();
                    // Start push service
                    this.defaultMQProducer.getDefaultMQProducerImpl().start(false);
                    log.info("the client factory [{}] start OK", this.clientId);
                    this.serviceState = ServiceState.RUNNING;
```

### Deprecation
'org.apache.rocketmq.client.impl.consumer.DefaultMQPullConsumerImpl' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/factory/MQClientInstance.java`
#### Snippet
```java
            DefaultMQPushConsumerImpl consumer = (DefaultMQPushConsumerImpl) impl;
            return consumer.getOffsetStore().cloneOffsetTable(topic);
        } else if (impl instanceof DefaultMQPullConsumerImpl) {
            DefaultMQPullConsumerImpl consumer = (DefaultMQPullConsumerImpl) impl;
            return consumer.getOffsetStore().cloneOffsetTable(topic);
```

### Deprecation
'org.apache.rocketmq.client.impl.consumer.DefaultMQPullConsumerImpl' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/factory/MQClientInstance.java`
#### Snippet
```java
            return consumer.getOffsetStore().cloneOffsetTable(topic);
        } else if (impl instanceof DefaultMQPullConsumerImpl) {
            DefaultMQPullConsumerImpl consumer = (DefaultMQPullConsumerImpl) impl;
            return consumer.getOffsetStore().cloneOffsetTable(topic);
        } else {
```

### Deprecation
'org.apache.rocketmq.client.impl.consumer.DefaultMQPullConsumerImpl' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/factory/MQClientInstance.java`
#### Snippet
```java
            return consumer.getOffsetStore().cloneOffsetTable(topic);
        } else if (impl instanceof DefaultMQPullConsumerImpl) {
            DefaultMQPullConsumerImpl consumer = (DefaultMQPullConsumerImpl) impl;
            return consumer.getOffsetStore().cloneOffsetTable(topic);
        } else {
```

### Deprecation
'getDefaultMQProducerImpl()' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/factory/MQClientInstance.java`
#### Snippet
```java
            switch (this.serviceState) {
                case RUNNING:
                    this.defaultMQProducer.getDefaultMQProducerImpl().shutdown(false);

                    this.serviceState = ServiceState.SHUTDOWN_ALREADY;
```

### Deprecation
'org.apache.rocketmq.remoting.protocol.body.GetConsumerStatusBody' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            case ResponseCode.SUCCESS: {
                if (response.getBody() != null) {
                    GetConsumerStatusBody body = GetConsumerStatusBody.decode(response.getBody(), GetConsumerStatusBody.class);
                    return body.getConsumerTable();
                }
```

### Deprecation
'org.apache.rocketmq.remoting.protocol.body.GetConsumerStatusBody' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            case ResponseCode.SUCCESS: {
                if (response.getBody() != null) {
                    GetConsumerStatusBody body = GetConsumerStatusBody.decode(response.getBody(), GetConsumerStatusBody.class);
                    return body.getConsumerTable();
                }
```

### Deprecation
'org.apache.rocketmq.remoting.protocol.body.GetConsumerStatusBody' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            case ResponseCode.SUCCESS: {
                if (response.getBody() != null) {
                    GetConsumerStatusBody body = GetConsumerStatusBody.decode(response.getBody(), GetConsumerStatusBody.class);
                    return body.getConsumerTable();
                }
```

### Deprecation
'getDefaultMQProducerImpl()' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
            message.setKeys(keySet);
            try {
                Set<String> traceBrokerSet = tryGetMessageQueueBrokerSet(traceProducer.getDefaultMQProducerImpl(), traceTopic);
                SendCallback callback = new SendCallback() {
                    @Override
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/consumer/MQPullConsumerScheduleService.java`
#### Snippet
```java
    }

    public void setDefaultMQPullConsumer(DefaultMQPullConsumer defaultMQPullConsumer) {
        this.defaultMQPullConsumer = defaultMQPullConsumer;
    }
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/consumer/MQPullConsumerScheduleService.java`
#### Snippet
```java
    private final ConcurrentMap<MessageQueue, PullTaskImpl> taskTable =
        new ConcurrentHashMap<>();
    private DefaultMQPullConsumer defaultMQPullConsumer;
    private int pullThreadNums = 20;
    private ConcurrentMap<String /* topic */, PullTaskCallback> callbackTable =
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/consumer/MQPullConsumerScheduleService.java`
#### Snippet
```java
    }

    public DefaultMQPullConsumer getDefaultMQPullConsumer() {
        return defaultMQPullConsumer;
    }
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/consumer/MQPullConsumerScheduleService.java`
#### Snippet
```java

    public MQPullConsumerScheduleService(final String consumerGroup) {
        this.defaultMQPullConsumer = new DefaultMQPullConsumer(consumerGroup);
        this.defaultMQPullConsumer.setMessageModel(MessageModel.CLUSTERING);
    }
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/consumer/MQPullConsumerScheduleService.java`
#### Snippet
```java

    public MQPullConsumerScheduleService(final String consumerGroup, final RPCHook rpcHook) {
        this.defaultMQPullConsumer = new DefaultMQPullConsumer(consumerGroup, rpcHook);
        this.defaultMQPullConsumer.setMessageModel(MessageModel.CLUSTERING);
    }
```

### Deprecation
'getOffsetStore()' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
                this.pullAPIWrapper.registerFilterMessageHook(filterMessageHookList);

                if (this.defaultMQPushConsumer.getOffsetStore() != null) {
                    this.offsetStore = this.defaultMQPushConsumer.getOffsetStore();
                } else {
```

### Deprecation
'getOffsetStore()' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java

                if (this.defaultMQPushConsumer.getOffsetStore() != null) {
                    this.offsetStore = this.defaultMQPushConsumer.getOffsetStore();
                } else {
                    switch (this.defaultMQPushConsumer.getMessageModel()) {
```

### Deprecation
'setOffsetStore(org.apache.rocketmq.client.consumer.store.OffsetStore)' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
                            break;
                    }
                    this.defaultMQPushConsumer.setOffsetStore(this.offsetStore);
                }
                this.offsetStore.load();
```

### Deprecation
'org.apache.rocketmq.client.producer.TransactionCheckListener' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/producer/TransactionMQProducer.java`
#### Snippet
```java
    }

    public TransactionCheckListener getTransactionCheckListener() {
        return transactionCheckListener;
    }
```

### Deprecation
'org.apache.rocketmq.client.producer.TransactionCheckListener' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/producer/TransactionMQProducer.java`
#### Snippet
```java

public class TransactionMQProducer extends DefaultMQProducer {
    private TransactionCheckListener transactionCheckListener;
    private int checkThreadPoolMinSize = 1;
    private int checkThreadPoolMaxSize = 1;
```

### Deprecation
'org.apache.rocketmq.client.producer.LocalTransactionExecuter' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/producer/MQProducer.java`
#### Snippet
```java

    TransactionSendResult sendMessageInTransaction(final Message msg,
        final LocalTransactionExecuter tranExecuter, final Object arg) throws MQClientException;

    TransactionSendResult sendMessageInTransaction(final Message msg,
```

### Deprecation
'getAclConfigDataVersion()' is deprecated
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainAccessValidator.java`
#### Snippet
```java
    @Override
    public String getAclConfigVersion() {
        return aclPlugEngine.getAclConfigDataVersion();
    }

```

### Deprecation
'org.apache.rocketmq.client.producer.LocalTransactionExecuter' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java

    public TransactionSendResult sendMessageInTransaction(final Message msg,
        final LocalTransactionExecuter localTransactionExecuter, final Object arg)
        throws MQClientException {
        TransactionListener transactionListener = getCheckListener();
```

### Deprecation
'org.apache.rocketmq.client.producer.TransactionCheckListener' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
            @Override
            public void run() {
                TransactionCheckListener transactionCheckListener = DefaultMQProducerImpl.this.checkListener();
                TransactionListener transactionListener = getCheckListener();
                if (transactionCheckListener != null || transactionListener != null) {
```

### Deprecation
'send(org.apache.rocketmq.common.message.Message, org.apache.rocketmq.common.message.MessageQueue, org.apache.rocketmq.client.producer.SendCallback, long)' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/producer/DefaultMQProducer.java`
#### Snippet
```java
        throws MQClientException, RemotingException, InterruptedException {
        msg.setTopic(withNamespace(msg.getTopic()));
        this.defaultMQProducerImpl.send(msg, queueWithNamespace(mq), sendCallback, timeout);
    }

```

### Deprecation
'org.apache.rocketmq.client.producer.LocalTransactionExecuter' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/producer/DefaultMQProducer.java`
#### Snippet
```java
     */
    @Override
    public TransactionSendResult sendMessageInTransaction(Message msg, LocalTransactionExecuter tranExecuter,
        final Object arg)
        throws MQClientException {
```

### Deprecation
'send(org.apache.rocketmq.common.message.Message, org.apache.rocketmq.common.message.MessageQueue, org.apache.rocketmq.client.producer.SendCallback, long)' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/producer/DefaultMQProducer.java`
#### Snippet
```java
    public void send(Collection<Message> msgs, MessageQueue mq,
        SendCallback sendCallback, long timeout) throws MQClientException, RemotingException, MQBrokerException, InterruptedException {
        this.defaultMQProducerImpl.send(batch(msgs), queueWithNamespace(mq), sendCallback, timeout);
    }

```

### Deprecation
'send(org.apache.rocketmq.common.message.Message, org.apache.rocketmq.client.producer.SendCallback, long)' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/producer/DefaultMQProducer.java`
#### Snippet
```java
    public void send(Collection<Message> msgs, SendCallback sendCallback,
        long timeout) throws MQClientException, RemotingException, MQBrokerException, InterruptedException {
        this.defaultMQProducerImpl.send(batch(msgs), sendCallback, timeout);
    }

```

### Deprecation
'send(org.apache.rocketmq.common.message.Message, org.apache.rocketmq.client.producer.SendCallback, long)' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/producer/DefaultMQProducer.java`
#### Snippet
```java
        throws MQClientException, RemotingException, InterruptedException {
        msg.setTopic(withNamespace(msg.getTopic()));
        this.defaultMQProducerImpl.send(msg, sendCallback, timeout);
    }

```

### Deprecation
'send(org.apache.rocketmq.common.message.Message, org.apache.rocketmq.client.producer.MessageQueueSelector, java.lang.Object, org.apache.rocketmq.client.producer.SendCallback, long)' is deprecated
in `client/src/main/java/org/apache/rocketmq/client/producer/DefaultMQProducer.java`
#### Snippet
```java
        throws MQClientException, RemotingException, InterruptedException {
        msg.setTopic(withNamespace(msg.getTopic()));
        this.defaultMQProducerImpl.send(msg, selector, arg, sendCallback, timeout);
    }

```

### Deprecation
'org.apache.rocketmq.remoting.protocol.body.GetConsumerStatusBody' is deprecated
in `broker/src/main/java/org/apache/rocketmq/broker/client/net/Broker2Client.java`
#### Snippet
```java
                        case ResponseCode.SUCCESS: {
                            if (response.getBody() != null) {
                                GetConsumerStatusBody body =
                                    GetConsumerStatusBody.decode(response.getBody(),
                                        GetConsumerStatusBody.class);
```

### Deprecation
'org.apache.rocketmq.remoting.protocol.body.GetConsumerStatusBody' is deprecated
in `broker/src/main/java/org/apache/rocketmq/broker/client/net/Broker2Client.java`
#### Snippet
```java
                            if (response.getBody() != null) {
                                GetConsumerStatusBody body =
                                    GetConsumerStatusBody.decode(response.getBody(),
                                        GetConsumerStatusBody.class);

```

### Deprecation
'org.apache.rocketmq.remoting.protocol.body.GetConsumerStatusBody' is deprecated
in `broker/src/main/java/org/apache/rocketmq/broker/client/net/Broker2Client.java`
#### Snippet
```java
                                GetConsumerStatusBody body =
                                    GetConsumerStatusBody.decode(response.getBody(),
                                        GetConsumerStatusBody.class);

                                consumerStatusTable.put(clientId, body.getMessageQueueTable());
```

### Deprecation
'org.apache.rocketmq.remoting.protocol.body.GetConsumerStatusBody' is deprecated
in `broker/src/main/java/org/apache/rocketmq/broker/client/net/Broker2Client.java`
#### Snippet
```java

        result.setCode(ResponseCode.SUCCESS);
        GetConsumerStatusBody resBody = new GetConsumerStatusBody();
        resBody.setConsumerTable(consumerStatusTable);
        result.setBody(resBody.encode());
```

### Deprecation
'org.apache.rocketmq.remoting.protocol.body.GetConsumerStatusBody' is deprecated
in `broker/src/main/java/org/apache/rocketmq/broker/client/net/Broker2Client.java`
#### Snippet
```java

        result.setCode(ResponseCode.SUCCESS);
        GetConsumerStatusBody resBody = new GetConsumerStatusBody();
        resBody.setConsumerTable(consumerStatusTable);
        result.setBody(resBody.encode());
```

### Deprecation
'getAclConfigVersion()' is deprecated
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
            AccessValidator accessValidator = this.brokerController.getAccessValidatorMap().get(PlainAccessValidator.class);

            responseHeader.setVersion(accessValidator.getAclConfigVersion());
            responseHeader.setBrokerAddr(this.brokerController.getBrokerAddr());
            responseHeader.setBrokerName(this.brokerController.getBrokerConfig().getBrokerName());
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/simple/AclClient.java`
#### Snippet
```java

    public static void pullConsumer() throws MQClientException {
        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer("please_rename_unique_group_name_6", getAclRPCHook());
        consumer.setNamesrvAddr("127.0.0.1:9876");
        consumer.start();
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/simple/AclClient.java`
#### Snippet
```java

    public static void pullConsumer() throws MQClientException {
        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer("please_rename_unique_group_name_6", getAclRPCHook());
        consumer.setNamesrvAddr("127.0.0.1:9876");
        consumer.start();
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/namespace/PullConsumerWithNamespace.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        DefaultMQPullConsumer pullConsumer = new DefaultMQPullConsumer(NAMESPACE, CONSUMER_GROUP);
        pullConsumer.setNamesrvAddr(DEFAULT_NAMESRVADDR);
        pullConsumer.start();
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/namespace/PullConsumerWithNamespace.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        DefaultMQPullConsumer pullConsumer = new DefaultMQPullConsumer(NAMESPACE, CONSUMER_GROUP);
        pullConsumer.setNamesrvAddr(DEFAULT_NAMESRVADDR);
        pullConsumer.start();
```

### Deprecation
'getDefaultMQProducerImpl()' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
            int compressLevel = commandLine.hasOption("cl") ? Integer.parseInt(commandLine.getOptionValue("cl")) : 5;
            int compressOverHowMuch = commandLine.hasOption("ch") ? Integer.parseInt(commandLine.getOptionValue("ch")) : 4096;
            producer.getDefaultMQProducerImpl().setCompressType(CompressionType.of(compressType));
            producer.getDefaultMQProducerImpl().setCompressLevel(compressLevel);
            producer.setCompressMsgBodyOverHowmuch(compressOverHowMuch);
```

### Deprecation
'getDefaultMQProducerImpl()' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
            int compressOverHowMuch = commandLine.hasOption("ch") ? Integer.parseInt(commandLine.getOptionValue("ch")) : 4096;
            producer.getDefaultMQProducerImpl().setCompressType(CompressionType.of(compressType));
            producer.getDefaultMQProducerImpl().setCompressLevel(compressLevel);
            producer.setCompressMsgBodyOverHowmuch(compressOverHowMuch);
            System.out.printf("compressType: %s compressLevel: %s%n", compressType, compressLevel);
```

### Deprecation
'getDefaultMQProducerImpl()' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
                            }
                            if (asyncEnable) {
                                ThreadPoolExecutor e = (ThreadPoolExecutor) producer.getDefaultMQProducerImpl().getAsyncSenderExecutor();
                                // Flow control
                                while (e.getQueue().size() > MAX_LENGTH_ASYNC_QUEUE) {
```

### Deprecation
'getDefaultMQPushConsumerImpl()' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/tracemessage/OpenTracingPushConsumer.java`
#### Snippet
```java
        // Uncomment the following line while debugging, namesrvAddr should be set to your local address
//        consumer.setNamesrvAddr(DEFAULT_NAMESRVADDR);
        consumer.getDefaultMQPushConsumerImpl().registerConsumeMessageHook(new ConsumeMessageOpenTracingHookImpl(tracer));

        consumer.subscribe(TOPIC, "*");
```

### Deprecation
'getDefaultMQProducerImpl()' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/tracemessage/OpenTracingProducer.java`
#### Snippet
```java
        // Uncomment the following line while debugging, namesrvAddr should be set to your local address
//        producer.setNamesrvAddr(DEFAULT_NAMESRVADDR);
        producer.getDefaultMQProducerImpl().registerSendMessageHook(new SendMessageOpenTracingHookImpl(tracer));
        producer.start();

```

### Deprecation
'getDefaultMQProducerImpl()' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/tracemessage/OpenTracingTransactionProducer.java`
#### Snippet
```java
        // Uncomment the following line while debugging, namesrvAddr should be set to your local address
//        producer.setNamesrvAddr(DEFAULT_NAMESRVADDR);
        producer.getDefaultMQProducerImpl().registerSendMessageHook(new SendMessageOpenTracingHookImpl(tracer));
        producer.getDefaultMQProducerImpl().registerEndTransactionHook(new EndTransactionOpenTracingHookImpl(tracer));

```

### Deprecation
'getDefaultMQProducerImpl()' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/tracemessage/OpenTracingTransactionProducer.java`
#### Snippet
```java
//        producer.setNamesrvAddr(DEFAULT_NAMESRVADDR);
        producer.getDefaultMQProducerImpl().registerSendMessageHook(new SendMessageOpenTracingHookImpl(tracer));
        producer.getDefaultMQProducerImpl().registerEndTransactionHook(new EndTransactionOpenTracingHookImpl(tracer));

        producer.setTransactionListener(new TransactionListener() {
```

### Deprecation
'getDefaultMQProducerImpl()' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java
            int compressLevel = commandLine.hasOption("cl") ? Integer.parseInt(commandLine.getOptionValue("cl")) : 5;
            int compressOverHowMuch = commandLine.hasOption("ch") ? Integer.parseInt(commandLine.getOptionValue("ch")) : 4096;
            producer.getDefaultMQProducerImpl().setCompressType(CompressionType.of(compressType));
            producer.getDefaultMQProducerImpl().setCompressLevel(compressLevel);
            producer.setCompressMsgBodyOverHowmuch(compressOverHowMuch);
```

### Deprecation
'getDefaultMQProducerImpl()' is deprecated
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java
            int compressOverHowMuch = commandLine.hasOption("ch") ? Integer.parseInt(commandLine.getOptionValue("ch")) : 4096;
            producer.getDefaultMQProducerImpl().setCompressType(CompressionType.of(compressType));
            producer.getDefaultMQProducerImpl().setCompressLevel(compressLevel);
            producer.setCompressMsgBodyOverHowmuch(compressOverHowMuch);
            System.out.printf("compressType: %s compressLevel: %s%n", compressType, compressLevel);
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/PullConsumerImpl.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(PullConsumerImpl.class);

    private final DefaultMQPullConsumer rocketmqPullConsumer;
    private final KeyValue properties;
    private boolean started = false;
```

### Deprecation
'getDefaultMQPullConsumerImpl()' is deprecated
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/PullConsumerImpl.java`
#### Snippet
```java
                    PullResult pullResult = consumer.pull(mq, "*",
                        offset, localMessageCache.nextPullBatchNums());
                    ProcessQueue pq = rocketmqPullConsumer.getDefaultMQPullConsumerImpl().getRebalanceImpl()
                        .getProcessQueueTable().get(mq);
                    switch (pullResult.getPullStatus()) {
```

### Deprecation
'getDefaultMQPushConsumerImpl()' is deprecated
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
    @Override
    public boolean isSuspended() {
        return this.rocketmqPushConsumer.getDefaultMQPushConsumerImpl().isPause();
    }

```

### Deprecation
'getDefaultMQPullConsumerImpl()' is deprecated
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/LocalMessageCache.java`
#### Snippet
```java

    private void cleanExpireMsg() {
        for (final Map.Entry<MessageQueue, ProcessQueue> next : rocketmqPullConsumer.getDefaultMQPullConsumerImpl()
            .getRebalanceImpl().getProcessQueueTable().entrySet()) {
            ProcessQueue pq = next.getValue();
```

### Deprecation
'sendMessageBack(org.apache.rocketmq.common.message.MessageExt, int)' is deprecated
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/LocalMessageCache.java`
#### Snippet
```java

                try {
                    rocketmqPullConsumer.sendMessageBack(msg, 3);
                    log.info("Send expired msg back. topic={}, msgId={}, storeHost={}, queueId={}, queueOffset={}",
                        msg.getTopic(), msg.getMsgId(), msg.getStoreHost(), msg.getQueueId(), msg.getQueueOffset());
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/LocalMessageCache.java`
#### Snippet
```java
    private final Map<String, ConsumeRequest> consumedRequest;
    private final ConcurrentHashMap<MessageQueue, Long> pullOffsetTable;
    private final DefaultMQPullConsumer rocketmqPullConsumer;
    private final ClientConfig clientConfig;
    private final ScheduledExecutorService cleanExpireMsgExecutors;
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/LocalMessageCache.java`
#### Snippet
```java
    private final ScheduledExecutorService cleanExpireMsgExecutors;

    LocalMessageCache(final DefaultMQPullConsumer rocketmqPullConsumer, final ClientConfig clientConfig) {
        consumeRequestCache = new LinkedBlockingQueue<>(clientConfig.getRmqPullMessageCacheCapacity());
        this.consumedRequest = new ConcurrentHashMap<>();
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `common/src/main/java/org/apache/rocketmq/common/TopicQueueId.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MessageQueueInBroker{");
        sb.append("topic='").append(topic).append('\'');
        sb.append(", queueId=").append(queueId);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `common/src/main/java/org/apache/rocketmq/common/help/FAQUrl.java`
#### Snippet
```java
            int index = errorMessage.indexOf(TIP_STRING_BEGIN);
            if (-1 == index) {
                StringBuilder sb = new StringBuilder(errorMessage.length() + UNEXPECTED_EXCEPTION_URL.length() + MORE_INFORMATION.length() + 1);
                sb.append(errorMessage);
                sb.append("\n");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `common/src/main/java/org/apache/rocketmq/common/help/FAQUrl.java`
#### Snippet
```java

    public static String suggestTodo(final String url) {
        StringBuilder sb = new StringBuilder(TIP_STRING_BEGIN.length() + url.length() + TIP_STRING_END.length());
        sb.append(TIP_STRING_BEGIN);
        sb.append(url);
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
            return null;
        }
        return new StringBuilder().append(ip[0] & 0xFF).append(".").append(
                ip[1] & 0xFF).append(".").append(ip[2] & 0xFF)
            .append(".").append(ip[3] & 0xFF).toString();
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `common/src/main/java/org/apache/rocketmq/common/utils/NetworkUtil.java`
#### Snippet
```java

    public static String socketAddress2String(final SocketAddress addr) {
        StringBuilder sb = new StringBuilder();
        InetSocketAddress inetSocketAddress = (InetSocketAddress) addr;
        sb.append(inetSocketAddress.getAddress().getHostAddress());
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `test/src/main/java/org/apache/rocketmq/test/util/TestUtil.java`
#### Snippet
```java

    public static String addQuoteToParamater(String param) {
        StringBuilder sb = new StringBuilder("'");
        sb.append(param).append("'");
        return sb.toString();
```

### StringBufferReplaceableByString
`StringBuilder res` can be replaced with 'String'
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtil.java`
#### Snippet
```java
        else {
            len = n - len;
            StringBuilder res = new StringBuilder();
            res.append(getCheseWord(len));
            res.append(suffix);
```

### StringBufferReplaceableByString
`StringBuilder res` can be replaced with 'String'
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtil.java`
#### Snippet
```java
        else {
            len = n - len;
            StringBuilder res = new StringBuilder(prefix);
            res.append(getStringWithCharacter(len));
            return res.toString();
```

### StringBufferReplaceableByString
`StringBuilder res` can be replaced with 'String'
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtil.java`
#### Snippet
```java
        else {
            len = n - len;
            StringBuilder res = new StringBuilder(prefix);
            res.append(getCheseWord(len));
            return res.toString();
```

### StringBufferReplaceableByString
`StringBuilder res` can be replaced with 'String'
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtil.java`
#### Snippet
```java
        else {
            len = n - len;
            StringBuilder res = new StringBuilder();
            res.append(getStringWithCharacter(len));
            res.append(suffix);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/ha/autoswitch/BrokerMetadata.java`
#### Snippet
```java
    @Override
    public String encodeToStr() {
        StringBuilder sb = new StringBuilder();
        sb.append(clusterName).append("#");
        sb.append(brokerName).append("#");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/ha/autoswitch/TempBrokerMetadata.java`
#### Snippet
```java
    @Override
    public String encodeToStr() {
        StringBuilder sb = new StringBuilder();
        sb.append(clusterName).append("#");
        sb.append(brokerName).append("#");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java

    private String getGetMissTps() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getGetMissTps(10));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java

    private String getGetTransferredTps() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getGetTransferredTps(10));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java

    private String getGetFoundTps() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getGetFoundTps(10));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java

    private String getPutTps() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getPutTps(10));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java

    private String getGetTotalTps() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getGetTotalTps(10));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/pop/AckMsg.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AckMsg{");
        sb.append("ackOffset=").append(ackOffset);
        sb.append(", startOffset=").append(startOffset);
```

### StringBufferReplaceableByString
`StringBuffer strBuilder` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
    public String buildAccountStatsKey(String accountOwnerParent, String accountOwnerSelf, String instanceId,
        String topic, String group, String msgType, String flowlimitThreshold) {
        StringBuffer strBuilder = new StringBuffer();
        strBuilder.append(accountOwnerParent);
        strBuilder.append("@");
```

### StringBufferReplaceableByString
`StringBuffer strBuilder` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
        final String msgType) {
        final String sep = "|";
        StringBuffer strBuilder = new StringBuffer();
        strBuilder.append(owner).append(sep);
        strBuilder.append(instanceId).append(sep);
```

### StringBufferReplaceableByString
`StringBuffer strBuilder` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
        final String msgType, String flowlimitThreshold) {
        final String sep = "|";
        StringBuffer strBuilder = new StringBuffer();
        strBuilder.append(owner).append(sep);
        strBuilder.append(instanceId).append(sep);
```

### StringBufferReplaceableByString
`StringBuilder strBuilder` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java

    public String buildCommercialStatsKey(String owner, String topic, String group, String type) {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(owner);
        strBuilder.append("@");
```

### StringBufferReplaceableByString
`StringBuffer strBuilder` can be replaced with 'String'
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
    public String buildAccountStatsKey(String accountOwnerParent, String accountOwnerSelf, String instanceId,
        String topic, String group, String msgType) {
        StringBuffer strBuilder = new StringBuffer();
        strBuilder.append(accountOwnerParent);
        strBuilder.append("@");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/PopRequest.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PopRequest{");
        sb.append("cmd=").append(remotingCommand);
        sb.append(", channel=").append(channel);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/PullRequestHoldService.java`
#### Snippet
```java

    private String buildKey(final String topic, final int queueId) {
        StringBuilder sb = new StringBuilder(topic.length() + 5);
        sb.append(topic);
        sb.append(TOPIC_QUEUEID_SEPARATOR);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("CkWrap{");
            sb.append("rq=").append(reviveQueueId);
            sb.append(", rqo=").append(reviveQueueOffset);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/DataVersion.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataVersion[");
        sb.append("timestamp=").append(timestamp);
        sb.append(", counter=").append(counter);
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/NamespaceUtil.java`
#### Snippet
```java
        }

        return new StringBuilder()
            .append(MixAll.RETRY_GROUP_TOPIC_PREFIX)
            .append(wrapNamespace(namespace, consumerGroup))
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/namesrv/QueryDataVersionResponseHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QueryDataVersionResponseHeader{");
        sb.append("changed=").append(changed);
        sb.append('}');
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java

        }
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SimpleCharStream.java`
#### Snippet
```java
            } else
                maxNextCharInd += i;
            return;
        } catch (java.io.IOException e) {
            --bufpos;
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `filter/src/main/java/org/apache/rocketmq/filter/parser/TokenMgrError.java`
#### Snippet
```java
     * equivalents in the given string
     */
    protected static final String addEscapes(String str) {
        StringBuilder retval = new StringBuilder();
        char ch;
```

### FinalStaticMethod
'static' method declared `final`
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
    };

    private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2) {
        switch (hiByte) {
            case 0:
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java

    public void setDispatchMaxBuffer(long value) {
        this.dispatchMaxBuffer = value > this.dispatchMaxBuffer ? value : this.dispatchMaxBuffer;
    }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
            this.putLock.lock();
            this.putMessageEntireTimeMax =
                value > this.putMessageEntireTimeMax ? value : this.putMessageEntireTimeMax;
            this.putLock.unlock();
        }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
            this.getLock.lock();
            this.getMessageEntireTimeMax =
                value > this.getMessageEntireTimeMax ? value : this.getMessageEntireTimeMax;
            this.getLock.unlock();
        }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
            return 10;

        if (this.diskMaxUsedSpaceRatio > 95)
            return 95;

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `broker/src/main/java/org/apache/rocketmq/broker/filter/ConsumerFilterManager.java`
#### Snippet
```java
                        long deadTime = System.currentTimeMillis() - 30 * 1000;
                        filterData.setDeadTime(
                                deadTime <= filterData.getBornTime() ? filterData.getBornTime() : deadTime
                        );
                    }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PeekMessageProcessor.java`
#### Snippet
```java
            return offset;
        } else {
            return bufferOffset > offset ? bufferOffset : offset;
        }
    }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `broker/src/main/java/org/apache/rocketmq/broker/processor/NotificationProcessor.java`
#### Snippet
```java
            return offset;
        } else {
            return bufferOffset > offset ? bufferOffset : offset;
        }
    }
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`valve != null ? valve.printZeroLine() : false` can be simplified to 'valve != null \&\& valve.printZeroLine()'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledPrinter.java`
#### Snippet
```java

    protected boolean printZeroLine() {
        return valve != null ? valve.printZeroLine() : false;
    }

```

### SimplifiableConditionalExpression
`valve != null ? valve.enabled() : false` can be simplified to 'valve != null \&\& valve.enabled()'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledPrinter.java`
#### Snippet
```java

    protected boolean enabled() {
        return valve != null ? valve.enabled() : false;
    }

```

### SimplifiableConditionalExpression
`brokerConfig != null ? brokerConfig.isAccountStatsEnable() : true` can be simplified to 'brokerConfig==null \|\| brokerConfig.isAccountStatsEnable()'
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
                    @Override
                    public boolean enabled() {
                        return brokerConfig != null ? brokerConfig.isAccountStatsEnable() : true;
                    }

```

### SimplifiableConditionalExpression
`brokerConfig != null ? brokerConfig.isAccountStatsPrintZeroValues() : true` can be simplified to 'brokerConfig==null \|\| brokerConfig.isAccountStatsPrintZeroValues()'
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
                    @Override
                    public boolean printZeroLine() {
                        return brokerConfig != null ? brokerConfig.isAccountStatsPrintZeroValues() : true;
                    }
                }
```

### SimplifiableConditionalExpression
`commandLine.hasOption('c') ? Boolean.parseBoolean(commandLine.getOptionValue('c')) : true` can be simplified to '!commandLine.hasOption('c') \|\| Boolean.parseBoolean(commandLine.getOptionValue('c'))'
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Consumer.java`
#### Snippet
```java
        final boolean msgTraceEnable = commandLine.hasOption('m') && Boolean.parseBoolean(commandLine.getOptionValue('m'));
        final boolean aclEnable = commandLine.hasOption('a') && Boolean.parseBoolean(commandLine.getOptionValue('a'));
        final boolean clientRebalanceEnable = commandLine.hasOption('c') ? Boolean.parseBoolean(commandLine.getOptionValue('c')) : true;

        String group = groupPrefix;
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/PolishExpr.java`
#### Snippet
```java

                preType = Type.PARENTHESIS;
                segments.add(createOperator((char) chValue + ""));
            } else if (38 == chValue || 124 == chValue) {

```

### TrivialStringConcatenation
Empty string used in concatenation
in `test/src/main/java/org/apache/rocketmq/test/util/DuplicateMessageInfo.java`
#### Snippet
```java
                        }

                        strBQueue.get(msgQueueListIndex).append("" + msgQueueListIndex + "\t" +
                            msgIdMap.get(lQueueList.get(msgQueueListIndex).get(msgListIndex)) + "\t"
                            + lQueueList.get(msgQueueListIndex).get(msgListIndex) + "\r\n");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `test/src/main/java/org/apache/rocketmq/test/schema/SchemaTools.java`
#### Snippet
```java
                int ordinal = ((Enum<?>)enumObject).ordinal();
                String key = String.format("Field %s", name);
                String value = String.format("%s %s %s", "public", "int", "" + ordinal);
                map.put(key, value);
            }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
    private MessageExtBrokerInner convert(MessageExt messageExt, long enqueueTime, boolean needRoll) {
        if (enqueueTime != -1) {
            MessageAccessor.putProperty(messageExt, TIMER_ENQUEUE_MS, enqueueTime + "");
        }
        if (needRoll) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        if (needRoll) {
            if (messageExt.getProperty(TIMER_ROLL_TIMES) != null) {
                MessageAccessor.putProperty(messageExt, TIMER_ROLL_TIMES, Integer.parseInt(messageExt.getProperty(TIMER_ROLL_TIMES)) + 1 + "");
            } else {
                MessageAccessor.putProperty(messageExt, TIMER_ROLL_TIMES, 1 + "");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
            }
        }
        MessageAccessor.putProperty(messageExt, TIMER_DEQUEUE_MS, System.currentTimeMillis() + "");
        MessageExtBrokerInner message = convertMessage(messageExt, needRoll);
        return message;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `broker/src/main/java/org/apache/rocketmq/broker/util/HookUtils.java`
#### Snippet
```java
                return new PutMessageResult(PutMessageStatus.WHEEL_TIMER_FLOW_CONTROL, null);
            }
            MessageAccessor.putProperty(msg, MessageConst.PROPERTY_TIMER_OUT_MS, deliverMs + "");
            MessageAccessor.putProperty(msg, MessageConst.PROPERTY_REAL_TOPIC, msg.getTopic());
            MessageAccessor.putProperty(msg, MessageConst.PROPERTY_REAL_QUEUE_ID, String.valueOf(msg.getQueueId()));
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
                    balanced = mqSet.equals(getWorkingMessageQueue(topic));
                } else {
                    this.messageQueueChanged(topic, Collections.<MessageQueue>emptySet(), Collections.<MessageQueue>emptySet());
                    log.warn("doRebalance, {}, but the topic[{}] not exist.", consumerGroup, topic);
                }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
                    balanced = mqSet.equals(getWorkingMessageQueue(topic));
                } else {
                    this.messageQueueChanged(topic, Collections.<MessageQueue>emptySet(), Collections.<MessageQueue>emptySet());
                    log.warn("doRebalance, {}, but the topic[{}] not exist.", consumerGroup, topic);
                }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
                if (null == mqSet) {
                    if (!topic.startsWith(MixAll.RETRY_GROUP_TOPIC_PREFIX)) {
                        this.messageQueueChanged(topic, Collections.<MessageQueue>emptySet(), Collections.<MessageQueue>emptySet());
                        log.warn("doRebalance, {}, but the topic[{}] not exist.", consumerGroup, topic);
                    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
                if (null == mqSet) {
                    if (!topic.startsWith(MixAll.RETRY_GROUP_TOPIC_PREFIX)) {
                        this.messageQueueChanged(topic, Collections.<MessageQueue>emptySet(), Collections.<MessageQueue>emptySet());
                        log.warn("doRebalance, {}, but the topic[{}] not exist.", consumerGroup, topic);
                    }
```

## RuleId[id=MismatchedStringBuilderQueryUpdate]
### MismatchedStringBuilderQueryUpdate
Contents of `StringBuilder orderTopicString` are updated, but never queried
in `client/src/main/java/org/apache/rocketmq/client/impl/MQAdminImpl.java`
#### Snippet
```java
                MQClientException exception = null;

                StringBuilder orderTopicString = new StringBuilder();

                for (BrokerData brokerData : brokerDataList) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/org/apache/rocketmq/common/ThreadFactoryImpl.java`
#### Snippet
```java

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r, threadNamePrefix + this.threadIndex.incrementAndGet());
        thread.setDaemon(daemon);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `common/src/main/java/org/apache/rocketmq/common/metrics/NopLongUpDownCounter.java`
#### Snippet
```java
    }

    @Override public void add(long l, Attributes attributes, Context context) {

    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `common/src/main/java/org/apache/rocketmq/common/metrics/NopLongUpDownCounter.java`
#### Snippet
```java
    }

    @Override public void add(long l, Attributes attributes, Context context) {

    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `common/src/main/java/org/apache/rocketmq/common/metrics/NopLongUpDownCounter.java`
#### Snippet
```java
    }

    @Override public void add(long l, Attributes attributes) {

    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `common/src/main/java/org/apache/rocketmq/common/metrics/NopLongHistogram.java`
#### Snippet
```java
    }

    @Override public void record(long l, Attributes attributes) {

    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `common/src/main/java/org/apache/rocketmq/common/metrics/NopLongHistogram.java`
#### Snippet
```java
    }

    @Override public void record(long l, Attributes attributes, Context context) {

    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `common/src/main/java/org/apache/rocketmq/common/metrics/NopLongHistogram.java`
#### Snippet
```java
    }

    @Override public void record(long l, Attributes attributes, Context context) {

    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `common/src/main/java/org/apache/rocketmq/common/metrics/NopLongCounter.java`
#### Snippet
```java
    }

    @Override public void add(long l, Attributes attributes, Context context) {

    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `common/src/main/java/org/apache/rocketmq/common/metrics/NopLongCounter.java`
#### Snippet
```java
    }

    @Override public void add(long l, Attributes attributes, Context context) {

    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `common/src/main/java/org/apache/rocketmq/common/metrics/NopLongCounter.java`
#### Snippet
```java
    }

    @Override public void add(long l, Attributes attributes) {

    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `proxy/src/main/java/org/apache/rocketmq/proxy/grpc/v2/channel/GrpcClientChannel.java`
#### Snippet
```java

        @Override
        public int compareTo(ChannelId o) {
            if (this == o) {
                return 0;
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/route/TopicRouteService.java`
#### Snippet
```java
            refreshAfterWrite(config.getTopicRouteServiceCacheExpiredInSeconds(), TimeUnit.SECONDS).
            executor(cacheRefreshExecutor).build(new CacheLoader<String, MessageQueueView>() {
                @Override public @Nullable MessageQueueView load(String topic) throws Exception {
                    try {
                        TopicRouteData topicRouteData = topicRouteCacheLoader.loadTopicRouteData(topic);
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/route/TopicRouteService.java`
#### Snippet
```java
                }

                @Override public @Nullable MessageQueueView reload(@NonNull String key,
                    @NonNull MessageQueueView oldValue) throws Exception {
                    try {
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/route/TopicRouteService.java`
#### Snippet
```java

                @Override public @Nullable MessageQueueView reload(@NonNull String key,
                    @NonNull MessageQueueView oldValue) throws Exception {
                    try {
                        return load(key);
```

## RuleId[id=ExplicitArrayFilling]
### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `filter/src/main/java/org/apache/rocketmq/filter/util/BitsArray.java`
#### Snippet
```java
        }
        bytes = new byte[temp];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) 0x00;
        }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/PolishExpr.java`
#### Snippet
```java
    /**
     * Shunting-yard algorithm <br/>
     * http://en.wikipedia.org/wiki/Shunting_yard_algorithm
     *
     * @return the compute result of Shunting-yard algorithm
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/apache/rocketmq/common/fastjson/GenericMapSuperclassDeserializer.java`
#### Snippet
```java

/**
 * workaround https://github.com/alibaba/fastjson/issues/3730
 */
public class GenericMapSuperclassDeserializer implements ObjectDeserializer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/org/apache/rocketmq/common/compression/CompressionType.java`
#### Snippet
```java
     *    Compression types number can be extended to seven {@link MessageSysFlag}
     *
     *    Benchmarks from https://github.com/facebook/zstd
     *
     *    |   Compressor   |  Ratio  | Compression | Decompress |
```

### JavadocLinkAsPlainText
Link specified as plain text
in `proxy/src/main/java/org/apache/rocketmq/proxy/remoting/protocol/http2proxy/Http2ProtocolProxyHandler.java`
#### Snippet
```java
     * The full HTTP/2 connection preface is "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"
     * <p>
     * ref: https://datatracker.ietf.org/doc/html/rfc7540#section-3.5
     */
    private static final int PRI_INT = 0x50524920;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
     * Use MessageVersion.MESSAGE_VERSION_V2 automatically if topic length larger than Bytes.MAX_VALUE.
     * Otherwise, store use MESSAGE_VERSION_V1. Note: Client couldn't decode MESSAGE_VERSION_V2 version message.
     * Enable this config to resolve this issue. https://github.com/apache/rocketmq/issues/5568
     */
    private boolean autoMessageVersionOnTopicLen = true;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `test/src/main/java/org/apache/rocketmq/test/util/parallel/Task4Test.java`
#### Snippet
```java

public class Task4Test extends ParallelTask {
    private String name = "";

    public Task4Test(String name) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `test/src/main/java/org/apache/rocketmq/test/client/mq/MQAsyncProducer.java`
#### Snippet
```java
    private AbstractMQProducer producer = null;
    private long msgNum;
    private int intervalMills;
    private Thread sendT;
    private AtomicBoolean bPause = new AtomicBoolean(false);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/StoreCheckpoint.java`
#### Snippet
```java
public class StoreCheckpoint {
    private static final Logger log = LoggerFactory.getLogger(LoggerName.STORE_LOGGER_NAME);
    private final RandomAccessFile randomAccessFile;
    private final FileChannel fileChannel;
    private final MappedByteBuffer mappedByteBuffer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueueExt.java`
#### Snippet
```java
    private final int queueId;

    private final String storePath;
    private final int mappedFileSize;
    private ByteBuffer tempContainer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/AllocateMappedFileService.java`
#### Snippet
```java
public class AllocateMappedFileService extends ServiceThread {
    private static final Logger log = LoggerFactory.getLogger(LoggerName.STORE_LOGGER_NAME);
    private static int waitTimeOut = 1000 * 5;
    private ConcurrentMap<String, AllocateRequest> requestTable =
        new ConcurrentHashMap<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
    private Map<Long/*bucket*/, LongAdder/*times*/> lastBuckets = new TreeMap<>();

    private static int printTPSInterval = 60 * 1;

    private final LongAdder putMessageFailedTimes = new LongAdder();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java
    private final ByteBuffer byteBufferIndex;

    private final String storePath;
    private final int mappedFileSize;
    private long maxPhysicOffset = -1;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionPositionMgr.java`
#### Snippet
```java
    public static final String CHECKPOINT_FILE = "position-checkpoint";

    private transient String compactionPath;
    private transient String checkpointFileName;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionStore.java`
#### Snippet
```java
    private final int scanInterval = 30000;
    private final int compactionInterval;
    private final int compactionThreadNum;
    private final int offsetMapSize;
    private String masterAddr;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionStore.java`
#### Snippet
```java
    private final ConcurrentHashMap<String, CompactionLog> compactionLogTable;
    private final ScheduledExecutorService compactionSchedule;
    private final int scanInterval = 30000;
    private final int compactionInterval;
    private final int compactionThreadNum;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionStore.java`
#### Snippet
```java
    public static final String COMPACTION_CQ_DIR = "compactionCq";

    private final String compactionPath;
    private final String compactionLogPath;
    private final String compactionCqPath;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
    static class BatchConsumeQueueIterator implements ReferredIterator<CqUnit> {
        private SelectMappedBufferResult sbr;
        private int relativePos = 0;

        public BatchConsumeQueueIterator(SelectMappedBufferResult sbr) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerWheel.java`
#### Snippet
```java
    public final int precisionMs;
    private String fileName;
    private final RandomAccessFile randomAccessFile;
    private final FileChannel fileChannel;
    private final MappedByteBuffer mappedByteBuffer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerWheel.java`
#### Snippet
```java
    public final int slotsTotal;
    public final int precisionMs;
    private String fileName;
    private final RandomAccessFile randomAccessFile;
    private final FileChannel fileChannel;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/logfile/DefaultMappedFile.java`
#### Snippet
```java

    private class Itr implements Iterator<SelectMappedBufferResult> {
        private int start;
        private int current;
        private ByteBuffer buf;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
    private String timerCheckMetricsWhen = "05";

    private boolean timerSkipUnknownError = false;
    private boolean timerWarmEnable = false;
    private boolean timerStopDequeue = false;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java

    private boolean timerSkipUnknownError = false;
    private boolean timerWarmEnable = false;
    private boolean timerStopDequeue = false;
    private int timerCongestNumEachSlot = Integer.MAX_VALUE;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
    private boolean timerSkipUnknownError = false;
    private boolean timerWarmEnable = false;
    private boolean timerStopDequeue = false;
    private int timerCongestNumEachSlot = Integer.MAX_VALUE;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
    private boolean timerStopEnqueue = false;

    private String timerCheckMetricsWhen = "05";

    private boolean timerSkipUnknownError = false;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
    private int timerPutMessageThreadNum = 3;

    private boolean timerEnableDisruptor = false;

    private boolean timerEnableCheckMetrics = true;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopOrderlyService.java`
#### Snippet
```java
    private final DefaultMQPushConsumer defaultMQPushConsumer;
    private final MessageListenerOrderly messageListener;
    private final BlockingQueue<Runnable> consumeRequestQueue;
    private final ConcurrentSet<ConsumeRequest> consumeRequestSet = new ConcurrentSet<>();
    private final ThreadPoolExecutor consumeExecutor;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
    private final DefaultMQPushConsumer defaultMQPushConsumer;
    private final MessageListenerOrderly messageListener;
    private final BlockingQueue<Runnable> consumeRequestQueue;
    private final ThreadPoolExecutor consumeExecutor;
    private final String consumerGroup;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopConcurrentlyService.java`
#### Snippet
```java
    private final DefaultMQPushConsumer defaultMQPushConsumer;
    private final MessageListenerConcurrently messageListener;
    private final BlockingQueue<Runnable> consumeRequestQueue;
    private final ThreadPoolExecutor consumeExecutor;
    private final String consumerGroup;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
    private final DefaultMQPushConsumer defaultMQPushConsumer;
    private final MessageListenerConcurrently messageListener;
    private final BlockingQueue<Runnable> consumeRequestQueue;
    private final ThreadPoolExecutor consumeExecutor;
    private final String consumerGroup;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
    // only for test purpose, will be modified by reflection in unit test.
    @SuppressWarnings("FieldMayBeFinal")
    private static boolean doNotUpdateTopicSubscribeInfoWhenSubscriptionChanged = false;

    public DefaultLitePullConsumerImpl(final DefaultLitePullConsumer defaultLitePullConsumer, final RPCHook rpcHook) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
    private final RemotingClient remotingClient;
    private final TopAddressing topAddressing;
    private final ClientRemotingProcessor clientRemotingProcessor;
    private String nameSrvAddr = null;
    private ClientConfig clientConfig;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
    private final static short MAX_MSG_KEY_SIZE = Short.MAX_VALUE - 10000;
    private final int queueSize;
    private final int batchSize;
    private final int maxMsgSize;
    private final long pollingTimeMil;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
    class AsyncDataSendTask implements Runnable {
        private final String traceTopicName;
        private final String regionId;
        private final List<TraceTransferBean> traceTransferBeanList;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
    // The last discard number of log
    private AtomicLong discardCount;
    private Thread worker;
    private final ArrayBlockingQueue<TraceContext> traceContextQueue;
    private final HashMap<String, TraceDataSegment> taskQueueByTopic;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
    private final static AtomicInteger COUNTER = new AtomicInteger();
    private final static short MAX_MSG_KEY_SIZE = Short.MAX_VALUE - 10000;
    private final int queueSize;
    private final int batchSize;
    private final int maxMsgSize;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/consumer/DefaultLitePullConsumer.java`
#### Snippet
```java
     * Long polling mode, the Consumer connection max suspend time, it is not recommended to modify
     */
    private long brokerSuspendMaxTimeMillis = 1000 * 20;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
    // only for test purpose, will be modified by reflection in unit test.
    @SuppressWarnings("FieldMayBeFinal")
    private static boolean doNotUpdateTopicSubscribeInfoWhenSubscriptionChanged = false;

    public DefaultMQPushConsumerImpl(DefaultMQPushConsumer defaultMQPushConsumer, RPCHook rpcHook) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/consumer/store/LocalFileOffsetStore.java`
#### Snippet
```java
        System.getProperty("user.home") + File.separator + ".rocketmq_offsets");
    private final static Logger log = LoggerFactory.getLogger(LocalFileOffsetStore.class);
    private final MQClientInstance mQClientFactory;
    private final String groupName;
    private final String storePath;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
    private final ArrayList<EndTransactionHook> endTransactionHookList = new ArrayList<>();
    private final RPCHook rpcHook;
    private final BlockingQueue<Runnable> asyncSenderThreadPoolQueue;
    private final ExecutorService defaultAsyncSenderExecutor;
    protected BlockingQueue<Runnable> checkRequestQueue;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `controller/src/main/java/org/apache/rocketmq/controller/ControllerStartup.java`
#### Snippet
```java
    private static Logger log;
    private static Properties properties = null;
    private static CommandLine commandLine = null;

    public static void main(String[] args) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `controller/src/main/java/org/apache/rocketmq/controller/impl/DLedgerController.java`
#### Snippet
```java
    private final EventSerializer eventSerializer;
    private final RoleChangeHandler roleHandler;
    private final DLedgerControllerStateMachine statemachine;
    private final ScheduledExecutorService scanInactiveMasterService;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
    }

    private String sql;

    protected SelectorParser(String sql) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
    private final int countOfMinute1 = (int) (60 * 1000 / interval);
    private final int countOfSecond1 = (int) (1000 / interval);
    private final int countOfSecond30 = (int) (30 * 1000 / interval);

    private volatile boolean master = false;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
    private final PopMessageProcessor.QueueLockManager queueLockManager;
    private final long interval = 5;
    private final long minute5 = 5 * 60 * 1000;
    private final int countOfMinute1 = (int) (60 * 1000 / interval);
    private final int countOfSecond1 = (int) (1000 / interval);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
    private final long interval = 5;
    private final long minute5 = 5 * 60 * 1000;
    private final int countOfMinute1 = (int) (60 * 1000 / interval);
    private final int countOfSecond1 = (int) (1000 / interval);
    private final int countOfSecond30 = (int) (30 * 1000 / interval);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredCommitLog.java`
#### Snippet
```java
    public static final int BLANK_MAGIC_CODE = 0xBBCCDDEE ^ 1880681586 + 8;

    private final MessageQueue messageQueue;
    private final TieredMessageStoreConfig storeConfig;
    private final TieredFileQueue fileQueue;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredConsumeQueue.java`
#### Snippet
```java
        + 4 /* message size: int, 4 bytes */
        + 8 /* tag hash code: long, 8 bytes */;
    private final MessageQueue messageQueue;
    private final TieredMessageStoreConfig storeConfig;
    private final TieredFileQueue fileQueue;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredConsumeQueue.java`
#### Snippet
```java
        + 8 /* tag hash code: long, 8 bytes */;
    private final MessageQueue messageQueue;
    private final TieredMessageStoreConfig storeConfig;
    private final TieredFileQueue fileQueue;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/posix/PosixFileSegment.java`
#### Snippet
```java
    private static final String OPERATION_POSIX_WRITE = "write";

    private final String basePath;
    private final String filepath;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredIndexFile.java`
#### Snippet
```java
        private final int maxHashSlotNum;
        private final int maxIndexNum;
        private final int fileMaxSize;
        private MappedFile originFile;
        private TieredFileQueue fileQueue;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredIndexFile.java`
#### Snippet
```java

    static class CompactTask implements Runnable {
        private final TieredMessageStoreConfig storeConfig;

        private final int maxHashSlotNum;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `openmessaging/src/main/java/io/openmessaging/rocketmq/promise/DefaultPromise.java`
#### Snippet
```java
    private volatile FutureState state = FutureState.DOING;
    private V result = null;
    private long timeout;
    private long createTime;
    private Throwable exception = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `openmessaging/src/main/java/io/openmessaging/rocketmq/producer/AbstractOMSProducer.java`
#### Snippet
```java
    final DefaultMQProducer rocketmqProducer;
    private boolean started = false;
    private final ClientConfig clientConfig;

    AbstractOMSProducer(final KeyValue properties) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/PullConsumerImpl.java`
#### Snippet
```java
    private final MQPullConsumerScheduleService pullConsumerScheduleService;
    private final LocalMessageCache localMessageCache;
    private final ClientConfig clientConfig;

    public PullConsumerImpl(final KeyValue properties) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `srvutil/src/main/java/org/apache/rocketmq/util/cache/ExpiredLocalCache.java`
#### Snippet
```java
public class ExpiredLocalCache<K, T> {
    private ConcurrentLinkedHashMap<K, CacheObject<T>> cache;
    private EvictionListener<K, CacheObject<T>> listener;

    public ExpiredLocalCache(int size) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `srvutil/src/main/java/org/apache/rocketmq/srvutil/AclFileWatchService.java`
#### Snippet
```java
    private int aclFilesNum;
    @Deprecated
    private final Map<String, String> fileCurrentHash;
    private Map<String, Long> fileLastModifiedTime;
    private List<String/**absolute pathname **/> fileList = new ArrayList<>();
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
        File[] files = file.listFiles();
        if (files == null || files.length <= 0) {
            file.delete();
            STORE_LOG.info("delete empty direct, {}", file.getPath());
        }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
        }
        if (file.isFile()) {
            file.delete();
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
                deleteFile(file1);
            }
            file.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `common/src/main/java/org/apache/rocketmq/common/utils/IOTinyUtils.java`
#### Snippet
```java
        }

        fileOrDir.delete();
    }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `common/src/main/java/org/apache/rocketmq/common/utils/IOTinyUtils.java`
#### Snippet
```java
        }
        File tf = new File(target);
        tf.getParentFile().mkdirs();
        if (!tf.exists() && !tf.createNewFile()) {
            throw new RuntimeException("failed to create target file.");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `common/src/main/java/org/apache/rocketmq/common/MixAll.java`
#### Snippet
```java
        File fileParent = file.getParentFile();
        if (fileParent != null) {
            fileParent.mkdirs();
        }
        IOTinyUtils.writeStringToFile(file, str, "UTF-8");
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `common/src/main/java/org/apache/rocketmq/common/MixAll.java`
#### Snippet
```java
            int len = in.available();
            byte[] data = new byte[len];
            in.read(data, 0, len);
            return new String(data, StandardCharsets.UTF_8);
        } catch (Exception ignored) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `test/src/main/java/org/apache/rocketmq/test/util/FileUtil.java`
#### Snippet
```java
        File file = new File(filePath + File.separator + fileName);
        if (file.exists()) {
            file.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `test/src/main/java/org/apache/rocketmq/test/util/FileUtil.java`
#### Snippet
```java
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
```

### IgnoreResultOfCall
Result of `VerifyUtils.verifyBalance()` is ignored
in `test/src/main/java/org/apache/rocketmq/test/util/VerifyUtils.java`
#### Snippet
```java

    public static void main(String[] args) {
        verifyBalance(400, 0.1f, 230, 190);
    }
}
```

### IgnoreResultOfCall
Result of `PrometheusHttpServer.forceFlush()` is ignored
in `proxy/src/main/java/org/apache/rocketmq/proxy/metrics/ProxyMetricsManager.java`
#### Snippet
```java
        }
        if (proxyConfig.getMetricsExporterType() == BrokerConfig.MetricsExporterType.PROM) {
            prometheusHttpServer.forceFlush();
            prometheusHttpServer.shutdown();
        }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `store/src/main/java/org/apache/rocketmq/store/MultiPathMappedFileQueue.java`
#### Snippet
```java
            File file = new File(path);
            if (file.isDirectory()) {
                file.delete();
            }
        }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `store/src/main/java/org/apache/rocketmq/store/MappedFileQueue.java`
#### Snippet
```java
        File file = new File(storePath);
        if (file.isDirectory()) {
            file.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMetrics.java`
#### Snippet
```java
            if (configFile.exists()) {
                Files.copy(configFile, new File(backup));
                configFile.delete();
            }

```

### IgnoreResultOfCall
Result of `File.renameTo()` is ignored
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMetrics.java`
#### Snippet
```java
            }

            tmpFile.renameTo(configFile);
        } catch (IOException e) {
            log.error("Failed to persist {}", temp, e);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java

            try {
                this.scheduledExecutorService.awaitTermination(3, TimeUnit.SECONDS);
                this.scheduledCleanQueueExecutorService.awaitTermination(3, TimeUnit.SECONDS);
                Thread.sleep(1000 * 3);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
            try {
                this.scheduledExecutorService.awaitTermination(3, TimeUnit.SECONDS);
                this.scheduledCleanQueueExecutorService.awaitTermination(3, TimeUnit.SECONDS);
                Thread.sleep(1000 * 3);
            } catch (InterruptedException e) {
```

### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        }

        lockFile.getChannel().write(ByteBuffer.wrap("lock".getBytes(StandardCharsets.UTF_8)));
        lockFile.getChannel().force(true);

```

### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `store/src/main/java/org/apache/rocketmq/store/logfile/DefaultMappedFile.java`
#### Snippet
```java
                this.fileChannel.position(currentPos);
                while (data.hasRemaining()) {
                    this.fileChannel.write(data);
                }
            } catch (Throwable e) {
```

### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `store/src/main/java/org/apache/rocketmq/store/logfile/DefaultMappedFile.java`
#### Snippet
```java
                byteBuffer.limit(writePos);
                this.fileChannel.position(lastCommittedPosition);
                this.fileChannel.write(byteBuffer);
                COMMITTED_POSITION_UPDATER.set(this, writePos);
            } catch (Throwable e) {
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `client/src/main/java/org/apache/rocketmq/client/producer/RequestResponseFuture.java`
#### Snippet
```java

    public Message waitResponseMessage(final long timeout) throws InterruptedException {
        this.countDownLatch.await(timeout, TimeUnit.MILLISECONDS);
        return this.responseMsg;
    }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
                    File defaultAclFile = new File(fileName);
                    if (!defaultAclFile.exists()) {
                        defaultAclFile.createNewFile();
                    }
                } catch (IOException e) {
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
            }
            try {
                countDownLatch.await(timeoutMills, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                LOGGER.error("query dataversion from nameserver countDownLatch await Exception", e);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        scheduledExecutorService.shutdown();
        try {
            scheduledExecutorService.awaitTermination(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException ignore) {
            BrokerController.LOG.warn("shutdown ScheduledExecutorService was Interrupted!  ", ignore);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `broker/src/main/java/org/apache/rocketmq/broker/schedule/ScheduleMessageService.java`
#### Snippet
```java
            this.deliverExecutorService.shutdown();
            try {
                this.deliverExecutorService.awaitTermination(WAIT_FOR_SHUTDOWN, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                log.error("deliverExecutorService awaitTermination error", e);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `broker/src/main/java/org/apache/rocketmq/broker/schedule/ScheduleMessageService.java`
#### Snippet
```java
                this.handleExecutorService.shutdown();
                try {
                    this.handleExecutorService.awaitTermination(WAIT_FOR_SHUTDOWN, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    log.error("handleExecutorService awaitTermination error", e);
```

### IgnoreResultOfCall
Result of `PrometheusHttpServer.forceFlush()` is ignored
in `broker/src/main/java/org/apache/rocketmq/broker/metrics/BrokerMetricsManager.java`
#### Snippet
```java
        }
        if (brokerConfig.getMetricsExporterType() == BrokerConfig.MetricsExporterType.PROM) {
            prometheusHttpServer.forceFlush();
            prometheusHttpServer.shutdown();
        }
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
                    }
                    try {
                        countDownLatch.await(2000, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        LOGGER.warn("lockBatchMQ exception on {}, {}", this.brokerController.getBrokerConfig().getBrokerName(), e);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/posix/PosixFileSegment.java`
#### Snippet
```java

        if (file.exists()) {
            file.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/posix/PosixFileSegment.java`
#### Snippet
```java
                    ByteBuffer buffer = ByteBuffer.wrap(byteArray);
                    while (buffer.hasRemaining()) {
                        writeFileChannel.write(buffer);
                    }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/posix/PosixFileSegment.java`
#### Snippet
```java
                        File dir = file.getParentFile();
                        if (!dir.exists()) {
                            dir.mkdirs();
                        }

```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/posix/PosixFileSegment.java`
#### Snippet
```java

                        // TODO use direct IO to avoid polluting the page cache
                        file.createNewFile();
                        this.readFileChannel = new RandomAccessFile(file, "r").getChannel();
                        this.writeFileChannel = new RandomAccessFile(file, "rwd").getChannel();
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `example/src/main/java/org/apache/rocketmq/example/simple/AsyncProducer.java`
#### Snippet
```java
            }
        }
        countDownLatch.await(5, TimeUnit.SECONDS);
        producer.shutdown();
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredIndexFile.java`
#### Snippet
```java
            File compactFile = new File(compactFilePath);
            if (compactFile.exists()) {
                compactFile.delete();
            }
            this.compactFile = new DefaultMappedFile(compactFilePath, fileMaxSize);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredIndexFile.java`
#### Snippet
```java
        File compactFile = new File(compactFilePath);
        if (compactFile.exists()) {
            compactFile.delete();
        }
        fileQueue.destroy();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredIndexFile.java`
#### Snippet
```java
        if (isFileSealed(curMappedFile)) {
            if (preFileExists) {
                preFile.delete();
            }
            boolean rename = curMappedFile.renameTo(preFilepath);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
        try {
            sendThreadPool.shutdown();
            sendThreadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
            executorService.shutdown();
            try {
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
            executorService.shutdown();
            try {
                executorService.awaitTermination(5000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
            }
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/ResponseFuture.java`
#### Snippet
```java

    public RemotingCommand waitResponse(final long timeoutMillis) throws InterruptedException {
        this.countDownLatch.await(timeoutMillis, TimeUnit.MILLISECONDS);
        return this.responseCommand;
    }
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
            long timeoutMills = clientConfig.getRmqMessageConsumeTimeout() * 60 * 1000;
            try {
                sync.await(Math.max(0, timeoutMills - costs), TimeUnit.MILLISECONDS);
            } catch (InterruptedException ignore) {
            }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `setListener()` is identical to its super method
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQNormalConsumer.java`
#### Snippet
```java

    @Override
    public void setListener(AbstractListener listener) {
        this.listener = listener;
    }
```

### RedundantMethodOverride
Method `getListener()` is identical to its super method
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQNormalConsumer.java`
#### Snippet
```java

    @Override
    public AbstractListener getListener() {
        return listener;
    }
```

### RedundantMethodOverride
Method `clearMsg()` is identical to its super method
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQNormalConsumer.java`
#### Snippet
```java

    @Override
    public void clearMsg() {
        this.listener.clearMsg();
    }
```

### RedundantMethodOverride
Method `equals()` is identical to its super method
in `proxy/src/main/java/org/apache/rocketmq/proxy/common/ReceiptHandleGroup.java`
#### Snippet
```java

        @Override
        public boolean equals(Object o) {
            return this == o;
        }
```

### RedundantMethodOverride
Method `doBeginRead()` is identical to its super method
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/relay/ProxyChannel.java`
#### Snippet
```java

    @Override
    protected void doBeginRead() throws Exception {

    }
```

### RedundantMethodOverride
Method `doBind()` is identical to its super method
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/relay/ProxyChannel.java`
#### Snippet
```java

    @Override
    protected void doBind(SocketAddress localAddress) throws Exception {

    }
```

### RedundantMethodOverride
Method `doDisconnect()` is identical to its super method
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/relay/ProxyChannel.java`
#### Snippet
```java

    @Override
    protected void doDisconnect() throws Exception {

    }
```

### RedundantMethodOverride
Method `metadata()` is identical to its super method
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/relay/ProxyChannel.java`
#### Snippet
```java

    @Override
    public ChannelMetadata metadata() {
        return null;
    }
```

### RedundantMethodOverride
Method `newUnsafe()` is identical to its super method
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/relay/ProxyChannel.java`
#### Snippet
```java

    @Override
    protected AbstractUnsafe newUnsafe() {
        return null;
    }
```

### RedundantMethodOverride
Method `doClose()` is identical to its super method
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/relay/ProxyChannel.java`
#### Snippet
```java

    @Override
    protected void doClose() throws Exception {

    }
```

### RedundantMethodOverride
Method `isCompatible()` is identical to its super method
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/relay/ProxyChannel.java`
#### Snippet
```java

    @Override
    protected boolean isCompatible(EventLoop loop) {
        return false;
    }
```

### RedundantMethodOverride
Method `doWrite()` is identical to its super method
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/relay/ProxyChannel.java`
#### Snippet
```java

    @Override
    protected void doWrite(ChannelOutboundBuffer in) throws Exception {

    }
```

### RedundantMethodOverride
Method `config()` is identical to its super method
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/relay/ProxyChannel.java`
#### Snippet
```java

    @Override
    public ChannelConfig config() {
        return null;
    }
```

### RedundantMethodOverride
Method `getBrokerId()` is identical to its super method
in `store/src/main/java/org/apache/rocketmq/store/ha/autoswitch/TempBrokerMetadata.java`
#### Snippet
```java
    }

    public Long getBrokerId() {
        return brokerId;
    }
```

### RedundantMethodOverride
Method `remove()` is identical to its super method
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
```

### RedundantMethodOverride
Method `remove()` is identical to its super method
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
```

### RedundantMethodOverride
Method `rollNextFile()` is identical to its super method
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java

    @Override
    public long rollNextFile(final long offset) {
        int mappedFileSize = this.defaultMessageStore.getMessageStoreConfig().getMappedFileSizeCommitLog();
        return offset + mappedFileSize - offset % mappedFileSize;
```

### RedundantMethodOverride
Method `removeUnnecessaryPopMessageQueue()` is identical to its super method
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalancePushImpl.java`
#### Snippet
```java
    }

    public boolean removeUnnecessaryPopMessageQueue(final MessageQueue mq, final PopProcessQueue pq) {
        return true;
    }
```

### RedundantMethodOverride
Method `encode()` is identical to its super method
in `broker/src/main/java/org/apache/rocketmq/broker/offset/LmqConsumerOffsetManager.java`
#### Snippet
```java

    @Override
    public String encode(final boolean prettyFormat) {
        return RemotingSerializable.toJson(this, prettyFormat);
    }
```

### RedundantMethodOverride
Method `getHAServerAddr()` is identical to its super method
in `container/src/main/java/org/apache/rocketmq/container/InnerBrokerController.java`
#### Snippet
```java

    @Override
    public String getHAServerAddr() {
        return this.brokerConfig.getBrokerIP2() + ":" + this.messageStoreConfig.getHaListenPort();
    }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
printTPSInterval \* 1000: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java

    private void printTps() {
        if (System.currentTimeMillis() > (this.lastPrintTimestamp + printTPSInterval * 1000)) {
            this.lastPrintTimestamp = System.currentTimeMillis();

```

### IntegerMultiplicationImplicitCastToLong
maxTimeMsPerCount \* 2: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/util/PerfCounter.java`
#### Snippet
```java
            while (!this.isStopped()) {
                try {
                    long maxLiveTimeMs = maxTimeMsPerCount * 2 + 1000;
                    this.waitForRunning(maxLiveTimeMs);
                    if (perfs.size() >= maxKeyNumPerf
```

### IntegerMultiplicationImplicitCastToLong
i \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerWheel.java`
#### Snippet
```java
            int slotIndex = (firstSlotIndex + i) % (slotsTotal * 2);
            localBuffer.get().position(slotIndex * Slot.SIZE);
            if ((timeStartMs + i * precisionMs) / precisionMs != localBuffer.get().getLong()) {
                continue;
            }
```

### IntegerMultiplicationImplicitCastToLong
i \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerWheel.java`
#### Snippet
```java
            int slotIndex = (firstSlotIndex + i) % (slotsTotal * 2);
            localBuffer.get().position(slotIndex * Slot.SIZE);
            if ((timeStartMs + i * precisionMs) / precisionMs == localBuffer.get().getLong()) {
                localBuffer.get().getLong(); //first pos
                localBuffer.get().getLong(); //last pos
```

### IntegerMultiplicationImplicitCastToLong
j \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
            int periodTotal = 0;
            for (int j = slotBeforeNum; j < slotTotalNum; j++) {
                Slot slotEach = timerWheel.getSlot(currTime + j * precisionMs);
                periodTotal += slotEach.num;
            }
```

### IntegerMultiplicationImplicitCastToLong
timerRollWindowSlots \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        //copy the value first, avoid concurrent problem
        long tmpWriteTimeMs = currWriteTimeMs;
        boolean needRoll = delayedTime - tmpWriteTimeMs >= timerRollWindowSlots * precisionMs;
        int magic = MAGIC_DEFAULT;
        if (needRoll) {
```

### IntegerMultiplicationImplicitCastToLong
timerRollWindowSlots \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        if (needRoll) {
            magic = magic | MAGIC_ROLL;
            if (delayedTime - tmpWriteTimeMs - timerRollWindowSlots * precisionMs < timerRollWindowSlots / 3 * precisionMs) {
                //give enough time to next roll
                delayedTime = tmpWriteTimeMs + (timerRollWindowSlots / 2) * precisionMs;
```

### IntegerMultiplicationImplicitCastToLong
timerRollWindowSlots / 3 \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        if (needRoll) {
            magic = magic | MAGIC_ROLL;
            if (delayedTime - tmpWriteTimeMs - timerRollWindowSlots * precisionMs < timerRollWindowSlots / 3 * precisionMs) {
                //give enough time to next roll
                delayedTime = tmpWriteTimeMs + (timerRollWindowSlots / 2) * precisionMs;
```

### IntegerMultiplicationImplicitCastToLong
(timerRollWindowSlots / 2) \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
            if (delayedTime - tmpWriteTimeMs - timerRollWindowSlots * precisionMs < timerRollWindowSlots / 3 * precisionMs) {
                //give enough time to next roll
                delayedTime = tmpWriteTimeMs + (timerRollWindowSlots / 2) * precisionMs;
            } else {
                delayedTime = tmpWriteTimeMs + timerRollWindowSlots * precisionMs;
```

### IntegerMultiplicationImplicitCastToLong
timerRollWindowSlots \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
                delayedTime = tmpWriteTimeMs + (timerRollWindowSlots / 2) * precisionMs;
            } else {
                delayedTime = tmpWriteTimeMs + timerRollWindowSlots * precisionMs;
            }
        }
```

### IntegerMultiplicationImplicitCastToLong
100 \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
                try {
                    if (!TimerMessageStore.this.enqueue(0)) {
                        waitForRunning(100 * precisionMs / 1000);
                    }
                } catch (Throwable e) {
```

### IntegerMultiplicationImplicitCastToLong
100 \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
                try {
                    setState(AbstractStateService.WAITING);
                    List<TimerRequest> trs = dequeueGetQueue.poll(100 * precisionMs / 1000, TimeUnit.MILLISECONDS);
                    if (null == trs || trs.size() == 0) {
                        continue;
```

### IntegerMultiplicationImplicitCastToLong
100 \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
                    }
                    if (-1 == TimerMessageStore.this.dequeue()) {
                        waitForRunning(100 * precisionMs / 1000);
                    }
                } catch (Throwable e) {
```

### IntegerMultiplicationImplicitCastToLong
slotsTotal \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        //check timer wheel
        currReadTimeMs = timerCheckpoint.getLastReadTimeMs();
        long nextReadTimeMs = formatTimeMs(System.currentTimeMillis()) - slotsTotal * precisionMs + TIMER_BLANK_SLOTS * precisionMs;
        if (currReadTimeMs < nextReadTimeMs) {
            currReadTimeMs = nextReadTimeMs;
```

### IntegerMultiplicationImplicitCastToLong
TIMER_BLANK_SLOTS \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        //check timer wheel
        currReadTimeMs = timerCheckpoint.getLastReadTimeMs();
        long nextReadTimeMs = formatTimeMs(System.currentTimeMillis()) - slotsTotal * precisionMs + TIMER_BLANK_SLOTS * precisionMs;
        if (currReadTimeMs < nextReadTimeMs) {
            currReadTimeMs = nextReadTimeMs;
```

### IntegerMultiplicationImplicitCastToLong
500 \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
                                    }
                                    doRes = PUT_NEED_RETRY != doPut(msg, needRoll(tr.getMagic()));
                                    Thread.sleep(500 * precisionMs / 1000);
                                }
                                perfs.endTick("dequeue_put");
```

### IntegerMultiplicationImplicitCastToLong
3 \* precisionMs: integer multiplication implicitly cast to long
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
            return -1;
        }
        if (preReadTimeMs >= currReadTimeMs + 3 * precisionMs) {
            return -1;
        }
```

### IntegerMultiplicationImplicitCastToLong
delayLevelTable\[delayLevelTable.length - 1\] \* 1000 \* 2: integer multiplication implicitly cast to long
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopConcurrentlyService.java`
#### Snippet
```java

        long msgDelaytime = System.currentTimeMillis() - msgExt.getBornTimestamp();
        if (msgDelaytime > delayLevelTable[delayLevelTable.length - 1] * 1000 * 2) {
            log.warn("Consume too many times, ack message async. message {}", msgExt.toString());
            this.defaultMQPushConsumerImpl.ackAsync(msgExt, consumerGroup);
```

### IntegerMultiplicationImplicitCastToLong
delayLevelTable\[delayLevel\] \* 1000: integer multiplication implicitly cast to long
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopConcurrentlyService.java`
#### Snippet
```java
            int delayLevel = delayLevelTable.length - 1;
            for (; delayLevel >= 0; delayLevel--) {
                if (msgDelaytime >= delayLevelTable[delayLevel] * 1000) {
                    delayLevel++;
                    break;
```

### IntegerMultiplicationImplicitCastToLong
brokerController.getBrokerConfig().getPopCkStayBufferTime() \* 2: integer multiplication implicitly cast to long
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
                } else {
                    if (System.currentTimeMillis() - pointWrapper.getCk().getPopTime()
                        > brokerController.getBrokerConfig().getPopCkStayBufferTime() * 2) {
                        POP_LOGGER.warn("[PopBuffer] ck offset long time not commit, {}", pointWrapper);
                    }
```

### IntegerMultiplicationImplicitCastToLong
slotPosition \* INDEX_FILE_HASH_SLOT_SIZE: integer multiplication implicitly cast to long
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredIndexFile.java`
#### Snippet
```java
        for (int i = fileSegmentList.size() - 1; i >= 0; i--) {
            TieredFileSegment fileSegment = fileSegmentList.get(i);
            CompletableFuture<ByteBuffer> tmpFuture = fileSegment.readAsync(INDEX_FILE_HEADER_SIZE + slotPosition * INDEX_FILE_HASH_SLOT_SIZE, INDEX_FILE_HASH_SLOT_SIZE)
                .thenCompose(slotBuffer -> {
                    int indexPosition = slotBuffer.getInt();
```

### IntegerMultiplicationImplicitCastToLong
slotCnt \* slotDis: integer multiplication implicitly cast to long
in `example/src/main/java/org/apache/rocketmq/example/benchmark/timer/TimerProducer.java`
#### Snippet
```java
        for (int slotCnt = 0; slotCnt < slotsTotal; slotCnt++) {
            for (int msgCnt = 0; msgCnt < msgsTotalPerSlotThread; msgCnt++) {
                long delayTime = startDelayTime + slotCnt * slotDis;
                delayList.add(delayTime);
            }
```

### IntegerMultiplicationImplicitCastToLong
clientConfig.getRmqMessageConsumeTimeout() \* 60 \* 1000: integer multiplication implicitly cast to long
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/PushConsumerImpl.java`
#### Snippet
```java
            listener.onReceived(omsMsg, context);
            long costs = System.currentTimeMillis() - begin;
            long timeoutMills = clientConfig.getRmqMessageConsumeTimeout() * 60 * 1000;
            try {
                sync.await(Math.max(0, timeoutMills - costs), TimeUnit.MILLISECONDS);
```

### IntegerMultiplicationImplicitCastToLong
clientConfig.getRmqMessageConsumeTimeout() \* 60 \* 1000: integer multiplication implicitly cast to long
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/LocalMessageCache.java`
#### Snippet
```java
                            msg = msgTreeMap.firstEntry().getValue();
                            if (System.currentTimeMillis() - Long.parseLong(MessageAccessor.getConsumeStartTimeStamp(msg))
                                > clientConfig.getRmqMessageConsumeTimeout() * 60 * 1000) {
                                //Expired, ack and remove it.
                            } else {
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `common/src/main/java/org/apache/rocketmq/common/logging/JoranConfiguratorExt.java`
#### Snippet
```java
                    String errMsg = "Could not close input stream";
                    addError(errMsg, ioe);
                    throw new JoranException(errMsg, ioe);
                }
            }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `common/src/main/java/org/apache/rocketmq/common/message/MessageDecoder.java`
#### Snippet
```java
        int storeSize = messageExt.getStoreSize();
        ByteBuffer byteBuffer;
        if (storeSize > 0) {
            byteBuffer = ByteBuffer.allocate(storeSize);
        } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
            } else {
                //The max timestamp of this file is smaller than the given timestamp, so double check the previous file
                if (i + 1 <= mappedFileNum - 1) {
                    mappedFile = mappedFileQueue.getMappedFiles().get(i + 1);
                    targetBcq = mappedFile;
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/TopicPublishInfo.java`
#### Snippet
```java

    public MessageQueue selectOneMessageQueue(final String lastBrokerName) {
        if (lastBrokerName == null) {
            return selectOneMessageQueue();
        } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `broker/src/main/java/org/apache/rocketmq/broker/filter/ConsumerFilterManager.java`
#### Snippet
```java

                // if subscribe data is changed, or consumer is died too long.
                if (change) {
                    ConsumerFilterData consumerFilterData = build(topic, consumerGroup, expression, type, clientVersion);
                    if (consumerFilterData == null) {
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `broker/src/main/java/org/apache/rocketmq/broker/processor/NotificationProcessor.java`
#### Snippet
```java
            String key = KeyBuilder.buildPollingNotificationKey(requestHeader.getTopic(), requestHeader.getQueueId());
            ArrayBlockingQueue<NotificationRequest> queue = pollingMap.get(key);
            if (queue == null) {
                queue = new ArrayBlockingQueue<>(this.brokerController.getBrokerConfig().getPopPollingSize());
                pollingMap.put(key, queue);
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
                    //read the earliest one
                    if (requestOffset < minOffset) {
                        if (code == ResponseCode.PULL_OFFSET_MOVED) {
                            responseCode = ResponseCode.PULL_OFFSET_MOVED;
                            nextBeginOffset = minOffset;
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
        for (int i = 0; i < sendThreadNum; i++) {
            sendPool.execute(() -> {
                while (true) {
                    if (StatUtil.isOverFlow(pubKey, tps)) {
                        try {
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
                @Override
                public void run() {
                    while (true) {
                        try {
                            if (StatUtil.isOverFlow(statKey, tps)) {
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `example/src/main/java/org/apache/rocketmq/example/simple/PullConsumer.java`
#### Snippet
```java
                @Override
                public void run() {
                    while (true) {
                        try {
                            Set<MessageQueue> messageQueues = consumer.fetchMessageQueuesInBalance(topic);
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `example/src/main/java/org/apache/rocketmq/example/benchmark/TransactionProducer.java`
#### Snippet
```java
                @Override
                public void run() {
                    while (true) {
                        boolean success = false;
                        final long beginTimestamp = System.currentTimeMillis();
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `SYSTEM_TOPIC_WHITE_LIST` are queried, but never updated
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/util/TieredStoreUtil.java`
#### Snippet
```java
    };

    private final static List<String> SYSTEM_TOPIC_WHITE_LIST = new LinkedList<>();

    private volatile static TieredMetadataStore metadataStoreInstance;
```

### MismatchedCollectionQueryUpdate
Contents of collection `cache` are queried, but never updated
in `example/src/main/java/org/apache/rocketmq/example/benchmark/TransactionProducer.java`
#### Snippet
```java
    private StatsBenchmarkTProducer statBenchmark;
    private TxSendConfig sendConfig;
    private final LRUMap<Long, Integer> cache = new LRUMap<>(200000);

    private class MsgMeta {
```

### MismatchedCollectionQueryUpdate
Contents of collection `topicRouteTable` are queried, but never updated
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/ClientMetadata.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.COMMON_LOGGER_NAME);

    private final ConcurrentMap<String/* Topic */, TopicRouteData> topicRouteTable = new ConcurrentHashMap<>();
    private final ConcurrentMap<String/* Topic */, ConcurrentMap<MessageQueue, String/*brokerName*/>> topicEndPointsTable = new ConcurrentHashMap<>();
    private final ConcurrentMap<String/* Broker Name */, HashMap<Long/* brokerId */, String/* address */>> brokerAddrTable =
```

### MismatchedCollectionQueryUpdate
Contents of collection `wrapperMap` are updated, but never queried
in `openmessaging/src/main/java/io/openmessaging/rocketmq/utils/BeanUtils.java`
#### Snippet
```java
    }

    private static Map<Class<?>, Class<?>> wrapperMap = new HashMap<>();

    static {
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`0x1 << 0` can be replaced with '0x1'
in `common/src/main/java/org/apache/rocketmq/common/sysflag/SubscriptionSysFlag.java`
#### Snippet
```java
public class SubscriptionSysFlag {

    private final static int FLAG_UNIT = 0x1 << 0;

    public static int buildSysFlag(final boolean unit) {
```

### PointlessBitwiseExpression
`0x1 << 0` can be replaced with '0x1'
in `common/src/main/java/org/apache/rocketmq/common/sysflag/TopicSysFlag.java`
#### Snippet
```java
public class TopicSysFlag {

    private final static int FLAG_UNIT = 0x1 << 0;

    private final static int FLAG_UNIT_SUB = 0x1 << 1;
```

## RuleId[id=TextLabelInSwitchStatement]
### TextLabelInSwitchStatement
Text label `label_5:` in 'switch' statement
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                                list = new ArrayList();
                                list.add(t);
                                label_5:
                                while (true) {
                                    switch ((jjNtk == -1) ? jj_ntk() : jjNtk) {
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `common/src/main/java/org/apache/rocketmq/common/namesrv/DefaultTopAddressing.java`
#### Snippet
```java
                }
                for (Map.Entry<String, String> entry : this.para.entrySet()) {
                    url += entry.getKey() + "=" + entry.getValue() + "&";
                }
                url = url.substring(0, url.length() - 1);
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `test/src/main/java/org/apache/rocketmq/test/util/DuplicateMessageInfo.java`
#### Snippet
```java
            strToWrite = strBuilder + titleString;
            for (int i = 0; i < msgListSize; i++)
                strToWrite += strBQueue.get(i).toString() + "\r\n";

            byteToWrite = strToWrite.getBytes(StandardCharsets.UTF_8);
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `filter/src/main/java/org/apache/rocketmq/filter/parser/ParseException.java`
#### Snippet
```java
        for (int i = 0; i < maxSize; i++) {
            if (i != 0) {
                retval += " ";
            }
            if (tok.kind == 0) {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `filter/src/main/java/org/apache/rocketmq/filter/parser/ParseException.java`
#### Snippet
```java
                break;
            }
            retval += " " + tokenImage[tok.kind];
            retval += " \"";
            retval += add_escapes(tok.image);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `messageDigest` initializer `null` is redundant
in `common/src/main/java/org/apache/rocketmq/common/utils/BinaryUtil.java`
#### Snippet
```java
public class BinaryUtil {
    public static byte[] calculateMd5(byte[] binaryData) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
```

### UnusedAssignment
Variable `ip` initializer `null` is redundant
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
        try {
            Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress ip = null;
            byte[] internalIP = null;
            while (allNetInterfaces.hasMoreElements()) {
```

### UnusedAssignment
Variable `result` initializer `src` is redundant
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
    @Deprecated
    public static byte[] compress(final byte[] src, final int level) throws IOException {
        byte[] result = src;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(src.length);
        java.util.zip.Deflater defeater = new java.util.zip.Deflater(level);
```

### UnusedAssignment
Variable `result` initializer `src` is redundant
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
    @Deprecated
    public static byte[] uncompress(final byte[] src) throws IOException {
        byte[] result = src;
        byte[] uncompressData = new byte[src.length];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(src);
```

### UnusedAssignment
Variable `n` initializer `0` is redundant
in `common/src/main/java/org/apache/rocketmq/common/utils/IOTinyUtils.java`
#### Snippet
```java
        char[] buffer = new char[1 << 12];
        long count = 0;
        for (int n = 0; (n = input.read(buffer)) >= 0; ) {
            output.write(buffer, 0, n);
            count += n;
```

### UnusedAssignment
Variable `resp` initializer `null` is redundant
in `common/src/main/java/org/apache/rocketmq/common/utils/HttpTinyClient.java`
#### Snippet
```java
            conn.connect();
            int respCode = conn.getResponseCode();
            String resp = null;

            if (HttpURLConnection.HTTP_OK == respCode) {
```

### UnusedAssignment
Variable `resp` initializer `null` is redundant
in `common/src/main/java/org/apache/rocketmq/common/utils/HttpTinyClient.java`
#### Snippet
```java

            int respCode = conn.getResponseCode();
            String resp = null;

            if (HttpURLConnection.HTTP_OK == respCode) {
```

### UnusedAssignment
Variable `arg` initializer `null` is redundant
in `common/src/main/java/org/apache/rocketmq/common/MixAll.java`
#### Snippet
```java
                        if (pt != null && pt.length > 0) {
                            String cn = pt[0].getSimpleName();
                            Object arg = null;
                            if (cn.equals("int") || cn.equals("Integer")) {
                                arg = Integer.parseInt(property);
```

### UnusedAssignment
Variable `result` initializer `src` is redundant
in `common/src/main/java/org/apache/rocketmq/common/compression/ZstdCompressor.java`
#### Snippet
```java
    @Override
    public byte[] compress(byte[] src, int level) throws IOException {
        byte[] result = src;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(src.length);
        ZstdOutputStream outputStream = new ZstdOutputStream(byteArrayOutputStream, level);
```

### UnusedAssignment
Variable `result` initializer `src` is redundant
in `common/src/main/java/org/apache/rocketmq/common/compression/ZstdCompressor.java`
#### Snippet
```java
    @Override
    public byte[] decompress(byte[] src) throws IOException {
        byte[] result = src;
        byte[] uncompressData = new byte[src.length];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(src);
```

### UnusedAssignment
Variable `result` initializer `src` is redundant
in `common/src/main/java/org/apache/rocketmq/common/compression/ZlibCompressor.java`
#### Snippet
```java
    @Override
    public byte[] compress(byte[] src, int level) throws IOException {
        byte[] result = src;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(src.length);
        java.util.zip.Deflater defeater = new java.util.zip.Deflater(level);
```

### UnusedAssignment
Variable `result` initializer `src` is redundant
in `common/src/main/java/org/apache/rocketmq/common/compression/ZlibCompressor.java`
#### Snippet
```java
    @Override
    public byte[] decompress(byte[] src) throws IOException {
        byte[] result = src;
        byte[] uncompressData = new byte[src.length];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(src);
```

### UnusedAssignment
Variable `result` initializer `src` is redundant
in `common/src/main/java/org/apache/rocketmq/common/compression/Lz4Compressor.java`
#### Snippet
```java
    @Override
    public byte[] compress(byte[] src, int level) throws IOException {
        byte[] result = src;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(src.length);
        LZ4FrameOutputStream outputStream = new LZ4FrameOutputStream(byteArrayOutputStream);
```

### UnusedAssignment
Variable `result` initializer `src` is redundant
in `common/src/main/java/org/apache/rocketmq/common/compression/Lz4Compressor.java`
#### Snippet
```java
    @Override
    public byte[] decompress(byte[] src) throws IOException {
        byte[] result = src;
        byte[] uncompressData = new byte[src.length];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(src);
```

### UnusedAssignment
Variable `fileName` initializer `""` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/FileUtil.java`
#### Snippet
```java

    private String filePath = "";
    private String fileName = "";

    public FileUtil(String filePath, String fileName) {
```

### UnusedAssignment
Variable `filePath` initializer `""` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/FileUtil.java`
#### Snippet
```java
    private static String lineSeparator = System.getProperty("line.separator");

    private String filePath = "";
    private String fileName = "";

```

### UnusedAssignment
Variable `val` initializer `defval` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/TestUtil.java`
#### Snippet
```java

    public static Long parseStringToLong(String s, Long defval) {
        Long val = defval;
        try {
            val = Long.parseLong(s);
```

### UnusedAssignment
Variable `val` initializer `defval` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/TestUtil.java`
#### Snippet
```java

    public static Integer parseStringToInteger(String s, Integer defval) {
        Integer val = defval;
        try {
            val = Integer.parseInt(s);
```

### UnusedAssignment
Variable `collect` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java
                if (!collectMap.containsKey(realKey)
                    || collectMap.get(realKey) instanceof ListDataCollectorImpl) {
                    DataCollector collect = null;
                    if (collectMap.containsKey(realKey)) {
                        DataCollector src = collectMap.get(realKey);
```

### UnusedAssignment
Variable `collect` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java
                if (!collectMap.containsKey(realKey)
                    || collectMap.get(realKey) instanceof MapDataCollectorImpl) {
                    DataCollector collect = null;
                    if (collectMap.containsKey(realKey)) {
                        DataCollector src = collectMap.get(realKey);
```

### UnusedAssignment
Variable `name` initializer `""` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/parallel/Task4Test.java`
#### Snippet
```java

public class Task4Test extends ParallelTask {
    private String name = "";

    public Task4Test(String name) {
```

### UnusedAssignment
Variable `index` initializer `0` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtil.java`
#### Snippet
```java
        int[] result = new int[n];
        Random rd = new Random();
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            index = rd.nextInt(len--);
```

### UnusedAssignment
Variable `producer` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/client/mq/MQAsyncProducer.java`
#### Snippet
```java
public class MQAsyncProducer {
    private static Logger logger = LoggerFactory.getLogger(MQAsyncProducer.class);
    private AbstractMQProducer producer = null;
    private long msgNum;
    private int intervalMills;
```

### UnusedAssignment
Variable `nsAddr` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQTransactionalProducer.java`
#### Snippet
```java
    private static Logger logger  = LoggerFactory.getLogger(RMQTransactionalProducer.class);
    private TransactionMQProducer producer = null;
    private String nsAddr = null;

    public RMQTransactionalProducer(String nsAddr, String topic, TransactionListener transactionListener) {
```

### UnusedAssignment
Variable `metaqResult` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQTransactionalProducer.java`
#### Snippet
```java
    public ResultWrapper send(Object msg, Object arg) {
        boolean commitMsg = ((Pair<Boolean, LocalTransactionState>) arg).getObject2() == LocalTransactionState.COMMIT_MESSAGE;
        org.apache.rocketmq.client.producer.SendResult metaqResult = null;
        Message message = (Message) msg;
        try {
```

### UnusedAssignment
Variable `internalSendResult` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQNormalProducer.java`
#### Snippet
```java

    public ResultWrapper send(Object msg, Object orderKey) {
        org.apache.rocketmq.client.producer.SendResult internalSendResult = null;
        Message message = (Message) msg;
        try {
```

### UnusedAssignment
Variable `internalSendResult` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQNormalProducer.java`
#### Snippet
```java

    public ResultWrapper sendMQ(Message msg, MessageQueue mq) {
        org.apache.rocketmq.client.producer.SendResult internalSendResult = null;
        try {
            long start = System.currentTimeMillis();
```

### UnusedAssignment
Variable `nsAddr` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQNormalProducer.java`
#### Snippet
```java
    private static Logger logger = LoggerFactory.getLogger(RMQNormalProducer.class);
    private DefaultMQProducer producer = null;
    private String nsAddr = null;

    public RMQNormalProducer(String nsAddr, String topic) {
```

### UnusedAssignment
Variable `nsAddr` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQAsyncSendProducer.java`
#### Snippet
```java
    private static Logger logger = LoggerFactory
        .getLogger(RMQAsyncSendProducer.class);
    private String nsAddr = null;
    private DefaultMQProducer producer = null;
    private SendCallback sendCallback = null;
```

### UnusedAssignment
Variable `sendCallback` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQAsyncSendProducer.java`
#### Snippet
```java
    private String nsAddr = null;
    private DefaultMQProducer producer = null;
    private SendCallback sendCallback = null;
    private List<SendResult> successSendResult = Collections.synchronizedList(new ArrayList<SendResult>());
    private AtomicInteger exceptionMsgCount = new AtomicInteger(0);
```

### UnusedAssignment
Variable `msgsWithMQId` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/message/MessageQueueMsg.java`
#### Snippet
```java
public class MessageQueueMsg {
    private Map<MessageQueue, List<Object>> msgsWithMQ = null;
    private Map<Integer, List<Object>> msgsWithMQId = null;
    private Collection<Object> msgBodys = null;

```

### UnusedAssignment
Variable `msgBodys` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/message/MessageQueueMsg.java`
#### Snippet
```java
    private Map<MessageQueue, List<Object>> msgsWithMQ = null;
    private Map<Integer, List<Object>> msgsWithMQId = null;
    private Collection<Object> msgBodys = null;

    public MessageQueueMsg(List<MessageQueue> mqs, int msgSize) {
```

### UnusedAssignment
Variable `msgsWithMQ` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/message/MessageQueueMsg.java`
#### Snippet
```java

public class MessageQueueMsg {
    private Map<MessageQueue, List<Object>> msgsWithMQ = null;
    private Map<Integer, List<Object>> msgsWithMQId = null;
    private Collection<Object> msgBodys = null;
```

### UnusedAssignment
Variable `msgSize` initializer `0` is redundant
in `test/src/main/java/org/apache/rocketmq/test/factory/TagMessage.java`
#### Snippet
```java
    private List<String> tags = null;
    private String topic = null;
    private int msgSize = 0;
    private Map<String, List<Object>> rmqMsgs = new HashMap<String, List<Object>>();

```

### UnusedAssignment
Variable `tags` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/factory/TagMessage.java`
#### Snippet
```java

public class TagMessage {
    private List<String> tags = null;
    private String topic = null;
    private int msgSize = 0;
```

### UnusedAssignment
Variable `topic` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/factory/TagMessage.java`
#### Snippet
```java
public class TagMessage {
    private List<String> tags = null;
    private String topic = null;
    private int msgSize = 0;
    private Map<String, List<Object>> rmqMsgs = new HashMap<String, List<Object>>();
```

### UnusedAssignment
Variable `msgDelayTimes` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/listener/rmq/concurrent/RMQDelayListener.java`
#### Snippet
```java

public class RMQDelayListener extends AbstractListener implements MessageListenerConcurrently {
    private DataCollector msgDelayTimes = null;

    public RMQDelayListener() {
```

### UnusedAssignment
Variable `msgQueue` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/listener/rmq/order/RMQOrderListener.java`
#### Snippet
```java

    private void putMsg(MessageExt msg) {
        Collection<Object> msgQueue = null;
        String key = getKey(msg.getQueueId(), msg.getStoreHost().toString());
        if (!msgs.containsKey(key)) {
```

### UnusedAssignment
Variable `msgBodys` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/clientinterface/MQCollector.java`
#### Snippet
```java

public abstract class MQCollector {
    protected DataCollector msgBodys = null;
    protected DataCollector originMsgs = null;
    protected DataCollector errorMsgs = null;
```

### UnusedAssignment
Variable `originMsgs` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/clientinterface/MQCollector.java`
#### Snippet
```java
public abstract class MQCollector {
    protected DataCollector msgBodys = null;
    protected DataCollector originMsgs = null;
    protected DataCollector errorMsgs = null;
    protected Map<Object, Object> originMsgIndex = null;
```

### UnusedAssignment
Variable `producerGroupName` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/clientinterface/AbstractMQProducer.java`
#### Snippet
```java
    protected ResultWrapper sendResult = new ResultWrapper();
    protected boolean startSuccess = false;
    protected String producerGroupName = null;
    protected String producerInstanceName = null;
    protected boolean isDebug = false;
```

### UnusedAssignment
Variable `producerInstanceName` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/clientinterface/AbstractMQProducer.java`
#### Snippet
```java
    protected boolean startSuccess = false;
    protected String producerGroupName = null;
    protected String producerInstanceName = null;
    protected boolean isDebug = false;

```

### UnusedAssignment
Variable `topic` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/clientinterface/AbstractMQProducer.java`
#### Snippet
```java

public abstract class AbstractMQProducer extends MQCollector implements MQProducer {
    protected String topic = null;

    protected ResultWrapper sendResult = new ResultWrapper();
```

### UnusedAssignment
Variable `fieldValue` initializer `"null"` is redundant
in `test/src/main/java/org/apache/rocketmq/test/schema/SchemaTools.java`
#### Snippet
```java
            }
            field.setAccessible(true);
            Object fieldValue = "null";
            try {
                fieldValue = field.get(obj);
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `test/src/main/java/org/apache/rocketmq/test/schema/SchemaTools.java`
#### Snippet
```java
        for (File file: dir.listFiles()) {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            String line = null;
            TreeMap<String, String> kvs = new TreeMap<>();
            while ((line = br.readLine()) != null) {
```

### UnusedAssignment
Variable `sampleTopicRouteData` initializer `null` is redundant
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/admin/DefaultAdminService.java`
#### Snippet
```java
        }

        TopicRouteData sampleTopicRouteData = null;
        try {
            sampleTopicRouteData = this.getTopicRouteDataDirectlyFromNameServer(sampleTopic);
```

### UnusedAssignment
Variable `sslContextBuilder` initializer `null` is redundant
in `proxy/src/main/java/org/apache/rocketmq/proxy/remoting/MultiProtocolTlsHelper.java`
#### Snippet
```java
        }

        SslContextBuilder sslContextBuilder = null;
        if (tlsTestModeEnable) {
            SelfSignedCertificate selfSignedCertificate = new SelfSignedCertificate();
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `store/src/main/java/org/apache/rocketmq/store/FlushDiskWatcher.java`
#### Snippet
```java
    public void run() {
        while (!isStopped()) {
            GroupCommitRequest request = null;
            try {
                request = commitRequests.take();
```

### UnusedAssignment
Variable `ret` initializer `false` is redundant
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueueExt.java`
#### Snippet
```java
            return false;
        }
        boolean ret = false;
        try {
            ret = cqExtUnit.read(bufferResult.getByteBuffer());
```

### UnusedAssignment
The value changed at `skipFileNum++` is never used
in `store/src/main/java/org/apache/rocketmq/store/MappedFileQueue.java`
#### Snippet
```java
                    }
                } else {
                    skipFileNum++;
                    //avoid deleting files in the middle
                    break;
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
        msg.setBodyCRC(UtilAll.crc32(msg.getBody()));
        // Back to Results
        AppendMessageResult result = null;

        StoreStatsService storeStatsService = this.defaultMessageStore.getStoreStatsService();
```

### UnusedAssignment
Variable `elapsedTimeInLock` initializer `0` is redundant
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
        updateMaxMessageSize(putMessageThreadLocal);
        String topicQueueKey = generateKey(putMessageThreadLocal.getKeyBuilder(), msg);
        long elapsedTimeInLock = 0;
        MappedFile unlockMappedFile = null;
        MappedFile mappedFile = this.mappedFileQueue.getLastMappedFile();
```

### UnusedAssignment
Variable `elapsedTimeInLock` initializer `0` is redundant
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
        }

        long elapsedTimeInLock = 0;
        MappedFile unlockMappedFile = null;
        MappedFile mappedFile = this.mappedFileQueue.getLastMappedFile();
```

### UnusedAssignment
Variable `high` initializer `0` is redundant
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java
            long offset = 0;
            int low = minLogicOffset > mappedFile.getFileFromOffset() ? (int) (minLogicOffset - mappedFile.getFileFromOffset()) : 0;
            int high = 0;
            int midOffset = -1, targetOffset = -1, leftOffset = -1, rightOffset = -1;
            long minPhysicOffset = this.messageStore.getMinPhyOffset();
```

### UnusedAssignment
Variable `midOffset` initializer `-1` is redundant
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java
            int low = minLogicOffset > mappedFile.getFileFromOffset() ? (int) (minLogicOffset - mappedFile.getFileFromOffset()) : 0;
            int high = 0;
            int midOffset = -1, targetOffset = -1, leftOffset = -1, rightOffset = -1;
            long minPhysicOffset = this.messageStore.getMinPhyOffset();
            int range = mappedFile.getFileSize();
```

### UnusedAssignment
Variable `mid` initializer `-1` is redundant
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
        final int unitShift,
        long targetValue) {
        int mid = -1;
        while (left <= right) {
            mid = ceil((left + right) / 2);
```

### UnusedAssignment
Variable `mid` initializer `-1` is redundant
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
        long targetValue) {
        int maxRight = right;
        int mid = -1;
        while (left <= right) {
            mid = ceil((left + right) / 2);
```

### UnusedAssignment
Variable `targetBcq` initializer `null` is redundant
in `store/src/main/java/org/apache/rocketmq/store/queue/SparseConsumeQueue.java`
#### Snippet
```java

    protected MappedFile searchFileByOffsetOrRight(long msgOffset) {
        MappedFile targetBcq = null;
        boolean searchBcqByCacheEnable = this.messageStore.getMessageStoreConfig().isSearchBcqByCacheEnable();
        if (searchBcqByCacheEnable) {
```

### UnusedAssignment
Variable `lastBuffer` initializer `null` is redundant
in `store/src/main/java/org/apache/rocketmq/store/queue/ConsumeQueueStore.java`
#### Snippet
```java
        //Correct unSubmit consumeOffset
        if (messageStoreConfig.isDuplicationEnable()) {
            SelectMappedBufferResult lastBuffer = null;
            long startReadOffset = messageStore.getCommitLog().getConfirmOffset() == -1 ? 0 : messageStore.getCommitLog().getConfirmOffset();
            while ((lastBuffer = messageStore.selectOneMessageByOffset(startReadOffset)) != null) {
```

### UnusedAssignment
Variable `next` initializer `null` is redundant
in `store/src/main/java/org/apache/rocketmq/store/plugin/AbstractPluginMessageStore.java`
#### Snippet
```java

public abstract class AbstractPluginMessageStore implements MessageStore {
    protected MessageStore next = null;
    protected MessageStorePluginContext context;

```

### UnusedAssignment
Variable `index` initializer `0` is redundant
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionLog.java`
#### Snippet
```java
            int tryNum = 0;
            int maxTryNum = entryNum + hashSize - 4;
            int index = 0;
            do {
                if (tryNum >= maxTryNum) {
```

### UnusedAssignment
Variable `newFiles` initializer `Lists.newArrayList()` is redundant
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionLog.java`
#### Snippet
```java
            log.info("replicating message is empty");   //break
        } else {
            List<MappedFile> newFiles = Lists.newArrayList();
            List<MappedFile> toCompactFiles = Lists.newArrayList(replicating.getLog().getMappedFiles());
            putMessageLock.lock();
```

### UnusedAssignment
Variable `lastBuffer` initializer `null` is redundant
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        //copy a new map
        ConcurrentHashMap<String, Long> newMap = new ConcurrentHashMap<>(consumeQueueStore.getTopicQueueTable());
        SelectMappedBufferResult lastBuffer = null;
        long startReadOffset = phyOffset == -1 ? 0 : phyOffset;
        while ((lastBuffer = selectOneMessageByOffset(startReadOffset)) != null) {
```

### UnusedAssignment
Variable `status` initializer `GetMessageStatus.NO_MESSAGE_IN_QUEUE` is redundant
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        long beginTime = this.getSystemClock().now();

        GetMessageStatus status = GetMessageStatus.NO_MESSAGE_IN_QUEUE;
        long nextBeginOffset = offset;
        long minOffset = 0;
```

### UnusedAssignment
Variable `deleteCount` initializer `0` is redundant
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java

        private void deleteExpiredFiles() {
            int deleteCount = 0;
            long fileReservedTime = DefaultMessageStore.this.getMessageStoreConfig().getFileReservedTime();
            int deletePhysicFilesInterval = DefaultMessageStore.this.getMessageStoreConfig().getDeleteCommitLogFilesInterval();
```

### UnusedAssignment
Variable `aliveReplicasNum` initializer `1` is redundant
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
    private final static int MAX_PULL_MSG_SIZE = 128 * 1024 * 1024;

    private volatile int aliveReplicasNum = 1;

    // Refer the MessageStore of MasterBroker in the same process.
```

### UnusedAssignment
Variable `result` initializer `true` is redundant
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
    @Override
    public boolean load() {
        boolean result = true;

        try {
```

### UnusedAssignment
Variable `strArr` initializer `null` is redundant
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
            @Override
            public boolean online(StatisticsItem item) {
                String[] strArr = null;
                try {
                    strArr = splitAccountStatKey(item.getStatObject());
```

### UnusedAssignment
Variable `wroteOffset` initializer `0` is redundant
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
                dledgerFuture = (BatchAppendFuture<AppendEntryResponse>) appendFuture;

                long wroteOffset = 0;

                int msgIdLength = (messageExtBatch.getSysFlag() & MessageSysFlag.STOREHOSTADDRESS_V6_FLAG) == 0 ? 4 + 4 + 8 : 16 + 4 + 8;
```

### UnusedAssignment
Variable `responseHeader` initializer `null` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQAdminImpl.java`
#### Snippet
```java
                                            switch (response.getCode()) {
                                                case ResponseCode.SUCCESS: {
                                                    QueryMessageResponseHeader responseHeader = null;
                                                    try {
                                                        responseHeader =
```

### UnusedAssignment
Variable `messageId` initializer `null` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQAdminImpl.java`
#### Snippet
```java
    public MessageExt viewMessage(String msgId)
        throws RemotingException, MQBrokerException, InterruptedException, MQClientException {
        MessageId messageId = null;
        try {
            messageId = MessageDecoder.decodeMessageId(msgId);
```

### UnusedAssignment
Variable `shardingKeyIndex` initializer `0` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopOrderlyService.java`
#### Snippet
```java
        private final PopProcessQueue processQueue;
        private final MessageQueue messageQueue;
        private int shardingKeyIndex = 0;

        public ConsumeRequest(PopProcessQueue processQueue, MessageQueue messageQueue) {
```

### UnusedAssignment
Variable `putMessageResult` initializer `null` is redundant
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        }

        PutMessageResult putMessageResult = null;
        if (escapeBridgeHook != null) {
            putMessageResult = escapeBridgeHook.apply(message);
```

### UnusedAssignment
Variable `lastBrokerRole` initializer `BrokerRole.SLAVE` is redundant
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
    private final int precisionMs;
    private final MessageStoreConfig storeConfig;
    private volatile BrokerRole lastBrokerRole = BrokerRole.SLAVE;
    private TimerMetrics timerMetrics;
    private long lastTimeOfCheckMetrics = System.currentTimeMillis();
```

### UnusedAssignment
Variable `nextOffset` initializer `-1L` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
                    ProcessQueue pq = createProcessQueue();
                    pq.setLocked(true);
                    long nextOffset = -1L;
                    try {
                        nextOffset = this.computePullFromWhereWithException(mq);
```

### UnusedAssignment
Variable `allocateResult` initializer `null` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
                    AllocateMessageQueueStrategy strategy = this.allocateMessageQueueStrategy;

                    List<MessageQueue> allocateResult = null;
                    try {
                        allocateResult = strategy.allocate(
```

### UnusedAssignment
Variable `consumeMessageContext` initializer `null` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPullConsumerImpl.java`
#### Snippet
```java
        this.resetTopic(pullResult.getMsgFoundList());
        if (!this.consumeMessageHookList.isEmpty()) {
            ConsumeMessageContext consumeMessageContext = null;
            consumeMessageContext = new ConsumeMessageContext();
            consumeMessageContext.setNamespace(defaultMQPullConsumer.getNamespace());
```

### UnusedAssignment
Variable `offset` initializer `0L` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
                }

                long offset = 0L;
                try {
                    offset = nextPullOffset(messageQueue);
```

### UnusedAssignment
Variable `pullTimeDelayMillsWhenException` initializer `1000` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
     * Delay some time when exception occur
     */
    private long pullTimeDelayMillsWhenException = 1000;
    /**
     * Flow control interval when message cache is full
```

### UnusedAssignment
Variable `offset` initializer `-1` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java

    private long nextPullOffset(MessageQueue messageQueue) throws MQClientException {
        long offset = -1;
        long seekOffset = assignedMessageQueue.getSeekOffset(messageQueue);
        if (seekOffset != -1) {
```

### UnusedAssignment
Variable `popStatus` initializer `PopStatus.NO_NEW_MSG` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
    private PopResult processPopResponse(final String brokerName, final RemotingCommand response, String topic,
        CommandCustomHeader requestHeader) throws MQBrokerException, RemotingCommandException {
        PopStatus popStatus = PopStatus.NO_NEW_MSG;
        List<MessageExt> msgFoundList = null;
        switch (response.getCode()) {
```

### UnusedAssignment
Variable `pullStatus` initializer `PullStatus.NO_NEW_MSG` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        final RemotingCommand response,
        final String addr) throws MQBrokerException, RemotingCommandException {
        PullStatus pullStatus = PullStatus.NO_NEW_MSG;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS:
```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
    ) throws RemotingException, MQBrokerException, InterruptedException {
        long beginStartTime = System.currentTimeMillis();
        RemotingCommand request = null;
        String msgType = msg.getProperty(MessageConst.PROPERTY_MESSAGE_TYPE);
        boolean isReply = msgType != null && msgType.equals(MixAll.REPLY_MESSAGE_FLAG);
```

### UnusedAssignment
Variable `pullTimeDelayMillsWhenException` initializer `3000` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
     * Delay some time when exception occur
     */
    private long pullTimeDelayMillsWhenException = 3000;
    /**
     * Flow control interval when message cache is full
```

### UnusedAssignment
Variable `offset` initializer `-1L` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
            if (processQueue.isLocked()) {
                if (!pullRequest.isPreviouslyLocked()) {
                    long offset = -1L;
                    try {
                        offset = this.rebalanceImpl.computePullFromWhereWithException(pullRequest.getMessageQueue());
```

### UnusedAssignment
Variable `offsetSerializeWrapper` initializer `null` is redundant
in `client/src/main/java/org/apache/rocketmq/client/consumer/store/LocalFileOffsetStore.java`
#### Snippet
```java
        }
        if (content != null && content.length() > 0) {
            OffsetSerializeWrapper offsetSerializeWrapper = null;
            try {
                offsetSerializeWrapper =
```

### UnusedAssignment
Variable `offsetSerializeWrapper` initializer `null` is redundant
in `client/src/main/java/org/apache/rocketmq/client/consumer/store/LocalFileOffsetStore.java`
#### Snippet
```java
            return this.readLocalOffsetBak();
        } else {
            OffsetSerializeWrapper offsetSerializeWrapper = null;
            try {
                offsetSerializeWrapper =
```

### UnusedAssignment
The value `true` assigned to `messageCloned` is never used
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
                            if (!messageCloned) {
                                tmpMessage = MessageAccessor.cloneMessage(msg);
                                messageCloned = true;
                            }
                            msg.setTopic(NamespaceUtil.withoutNamespace(msg.getTopic(), this.defaultMQProducer.getNamespace()));
```

### UnusedAssignment
Variable `sendResult` initializer `null` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
        Validators.checkMessage(msg, this.defaultMQProducer);

        SendResult sendResult = null;
        MessageAccessor.putProperty(msg, MessageConst.PROPERTY_TRANSACTION_PREPARED, "true");
        MessageAccessor.putProperty(msg, MessageConst.PROPERTY_PRODUCER_GROUP, this.defaultMQProducer.getProducerGroup());
```

### UnusedAssignment
Variable `mq` initializer `null` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
        TopicPublishInfo topicPublishInfo = this.tryToFindTopicPublishInfo(msg.getTopic());
        if (topicPublishInfo != null && topicPublishInfo.ok()) {
            MessageQueue mq = null;
            try {
                List<MessageQueue> messageQueueList =
```

### UnusedAssignment
Variable `endTimestamp` initializer `beginTimestampFirst` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
        long beginTimestampFirst = System.currentTimeMillis();
        long beginTimestampPrev = beginTimestampFirst;
        long endTimestamp = beginTimestampFirst;
        TopicPublishInfo topicPublishInfo = this.tryToFindTopicPublishInfo(msg.getTopic());
        if (topicPublishInfo != null && topicPublishInfo.ok()) {
```

### UnusedAssignment
Variable `yamlDataObject` initializer `null` is redundant
in `acl/src/main/java/org/apache/rocketmq/acl/common/AclUtils.java`
#### Snippet
```java

    public static RPCHook getAclRPCHook(InputStream inputStream) {
        JSONObject yamlDataObject = null;
        try {
            yamlDataObject = AclUtils.getYamlDataObject(inputStream, JSONObject.class);
```

### UnusedAssignment
Variable `newAccountsMap` initializer `null` is redundant
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
        PlainAccessConfig plainAccessConfig) {

        PlainAccessConfig newAccountsMap = null;
        if (existedAccountMap == null) {
            newAccountsMap = new PlainAccessConfig();
```

### UnusedAssignment
Variable `updateAccountMap` initializer `null` is redundant
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java

        if (accessKeyTable.containsKey(plainAccessConfig.getAccessKey())) {
            PlainAccessConfig updateAccountMap = null;
            String aclFileName = accessKeyTable.get(plainAccessConfig.getAccessKey());
            PlainAccessData aclAccessConfigMap = AclUtils.getYamlDataObject(aclFileName, PlainAccessData.class);
```

### UnusedAssignment
Variable `n` initializer `128` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/util/BloomFilter.java`
#### Snippet
```java
    // as error rate, 10/100 = 0.1
    private int f = 10;
    private int n = 128;

    // hash function num, by calculation.
```

### UnusedAssignment
Variable `f` initializer `10` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/util/BloomFilter.java`
#### Snippet
```java

    // as error rate, 10/100 = 0.1
    private int f = 10;
    private int n = 128;

```

### UnusedAssignment
Variable `topicConfigWrapper` initializer `null` is redundant
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/processor/DefaultRequestProcessor.java`
#### Snippet
```java
        }

        TopicConfigSerializeWrapper topicConfigWrapper = null;
        List<String> filterServerList = null;

```

### UnusedAssignment
Variable `k` initializer `0` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SimpleCharStream.java`
#### Snippet
```java
        }

        int i = 0, j = 0, k = 0;
        int nextColDiff = 0, columnDiff = 0;

```

### UnusedAssignment
Variable `nextColDiff` initializer `0` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SimpleCharStream.java`
#### Snippet
```java

        int i = 0, j = 0, k = 0;
        int nextColDiff = 0, columnDiff = 0;

        while (i < len && bufline[j = start % bufsize] == bufline[k = ++start % bufsize]) {
```

### UnusedAssignment
Variable `line` initializer `1` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SimpleCharStream.java`
#### Snippet
```java

    protected int column = 0;
    protected int line = 1;

    protected boolean prevCharIsCR = false;
```

### UnusedAssignment
Variable `column` initializer `0` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SimpleCharStream.java`
#### Snippet
```java
    protected int[] bufcolumn;

    protected int column = 0;
    protected int line = 1;

```

### UnusedAssignment
Variable `left` initializer `null` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
    final public Expression unaryExpr() throws ParseException {
        String s = null;
        Expression left = null;
        if (jj_2_4(2147483647)) {
            jj_consume_token(31);
```

### UnusedAssignment
Variable `left` initializer `null` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
    // ----------------------------------------------------------------------------
    final public BooleanExpression JmsSelector() throws ParseException {
        Expression left = null;
        left = orExpression();
        {
```

### UnusedAssignment
Variable `left` initializer `null` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
    final public PropertyExpression variable() throws ParseException {
        Token t;
        PropertyExpression left = null;
        t = jj_consume_token(ID);
        left = new PropertyExpression(t.image);
```

### UnusedAssignment
Variable `left` initializer `null` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    final public Expression primaryExpr() throws ParseException {
        Expression left = null;
        switch ((jjNtk == -1) ? jj_ntk() : jjNtk) {
            case TRUE:
```

### UnusedAssignment
Variable `left` initializer `null` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        Token t;
        String s;
        ConstantExpression left = null;
        switch ((jjNtk == -1) ? jj_ntk() : jjNtk) {
            case STRING_LITERAL:
```

### UnusedAssignment
Variable `curPos` initializer `0` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
        Token specialToken = null;
        Token matchedToken;
        int curPos = 0;

        EOFLoop:
```

### UnusedAssignment
Variable `convertStringExpressions` initializer `false` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/expression/ComparisonExpression.java`
#### Snippet
```java
    public static final ThreadLocal<Boolean> CONVERT_STRING_EXPRESSIONS = new ThreadLocal<>();

    boolean convertStringExpressions = false;

    /**
```

### UnusedAssignment
Variable `found` initializer `false` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicRouteInfoManager.java`
#### Snippet
```java
        }
        String brokerAddr = null;
        boolean found = false;

        Map<Long/* brokerId */, String/* address */> map = this.brokerAddrTable.get(brokerName);
```

### UnusedAssignment
The value `true` assigned to `found` is never used
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicRouteInfoManager.java`
#### Snippet
```java
                Map.Entry<Long, String> entry = map.entrySet().iterator().next();
                brokerAddr = entry.getValue();
                found = true;
            }
        }
```

### UnusedAssignment
Variable `clientChannelInfoFound` initializer `null` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/client/ProducerManager.java`
#### Snippet
```java

    public synchronized void registerProducer(final String group, final ClientChannelInfo clientChannelInfo) {
        ClientChannelInfo clientChannelInfoFound = null;

        ConcurrentHashMap<Channel, ClientChannelInfo> channelTable = this.groupChannelTable.get(group);
```

### UnusedAssignment
Variable `response` initializer `null` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand request = RemotingCommand.createRequestCommand(RequestCode.GET_BROKER_MEMBER_GROUP, requestHeader);

        RemotingCommand response = null;
        response = this.remotingClient.invokeSync(null, request, 3000);
        assert response != null;
```

### UnusedAssignment
Variable `pullStatus` initializer `PullStatus.NO_NEW_MSG` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        final RemotingCommand response,
        final String addr) throws MQBrokerException, RemotingCommandException {
        PullStatus pullStatus = PullStatus.NO_NEW_MSG;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS:
```

### UnusedAssignment
Variable `sendResult` initializer `null` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
                RemotingCommand response = responseFuture.getResponseCommand();
                if (null != response) {
                    SendResult sendResult = null;
                    try {
                        sendResult = this.processSendResponse(brokerName, msg, response);
```

### UnusedAssignment
Variable `enableAsyncDeliver` initializer `false` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/schedule/ScheduleMessageService.java`
#### Snippet
```java
    private int maxDelayLevel;
    private DataVersion dataVersion = new DataVersion();
    private boolean enableAsyncDeliver = false;
    private ScheduledExecutorService handleExecutorService;
    private final ScheduledExecutorService scheduledPersistService;
```

### UnusedAssignment
Variable `mqtraceContext` initializer `null` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/processor/ReplyMessageProcessor.java`
#### Snippet
```java
    public RemotingCommand processRequest(ChannelHandlerContext ctx,
        RemotingCommand request) throws RemotingCommandException {
        SendMessageContext mqtraceContext = null;
        SendMessageRequestHeader requestHeader = parseRequestHeader(request);
        if (requestHeader == null) {
```

### UnusedAssignment
Variable `subscriptionData` initializer `null` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
        }

        SubscriptionData subscriptionData = null;
        ConsumerFilterData consumerFilterData = null;
        final boolean hasSubscriptionFlag = PullSysFlag.hasSubscriptionFlag(requestHeader.getSysFlag());
```

### UnusedAssignment
Variable `allocateResult` initializer `null` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/processor/QueryAssignmentProcessor.java`
#### Snippet
```java
                Collections.sort(mqAll);
                Collections.sort(cidAll);
                List<MessageQueue> allocateResult = null;

                try {
```

### UnusedAssignment
Variable `putMessageResult` initializer `null` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/processor/SendMessageProcessor.java`
#### Snippet
```java
            return null;
        } else {
            PutMessageResult putMessageResult = null;
            if (sendTransactionPrepareMessage) {
                putMessageResult = this.brokerController.getTransactionalMessageService().prepareMessage(msgInner);
```

### UnusedAssignment
Variable `maxPhysicalOffset` initializer `Long.MAX_VALUE` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
            requestHeader.setQueueId(mappingItem.getQueueId());

            long maxPhysicalOffset = Long.MAX_VALUE;
            if (maxItem.getBname().equals(mappingDetail.getBname())) {
                //current broker
```

### UnusedAssignment
Variable `midOffset` initializer `-1` is redundant
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredMessageQueueContainer.java`
#### Snippet
```java

        // Perform binary search
        long midOffset = -1;
        long targetOffset = -1;
        long leftOffset = -1;
```

### UnusedAssignment
Variable `pullResult` initializer `null` is redundant
in `example/src/main/java/org/apache/rocketmq/example/simple/PullConsumer.java`
#### Snippet
```java
                                continue;
                            }
                            PullResult pullResult = null;
                            for (MessageQueue messageQueue : messageQueues) {
                                try {
```

### UnusedAssignment
Variable `commandLine` initializer `null` is redundant
in `example/src/main/java/org/apache/rocketmq/example/operation/Consumer.java`
#### Snippet
```java
        HelpFormatter hf = new HelpFormatter();
        hf.setWidth(110);
        CommandLine commandLine = null;
        try {
            commandLine = parser.parse(options, args);
```

### UnusedAssignment
Variable `commandLine` initializer `null` is redundant
in `example/src/main/java/org/apache/rocketmq/example/operation/Producer.java`
#### Snippet
```java
        HelpFormatter hf = new HelpFormatter();
        hf.setWidth(110);
        CommandLine commandLine = null;
        try {
            commandLine = parser.parse(options, args);
```

### UnusedAssignment
Variable `times` initializer `0` is redundant
in `example/src/main/java/org/apache/rocketmq/example/benchmark/TransactionProducer.java`
#### Snippet
```java
        statBenchmark.getCheckCount().increment();

        int times = 0;
        try {
            String checkTimes = msg.getUserProperty(MessageConst.PROPERTY_TRANSACTION_CHECK_TIMES);
```

### UnusedAssignment
Variable `rpcResponsePromise` initializer `null` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
        }
        String addr = getBrokerAddrByNameOrException(request.getHeader().bname);
        Promise<RpcResponse> rpcResponsePromise = null;
        try {
            switch (request.getCode()) {
```

### UnusedAssignment
Variable `errorMessage` initializer `null` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
        }
        int errorCode = ResponseCode.RPC_UNKNOWN;
        String errorMessage = null;
        if (!responseFuture.isSendRequestOK()) {
            errorCode = ResponseCode.RPC_SEND_TO_CHANNEL_FAILED;
```

### UnusedAssignment
Variable `logger` initializer `null` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/NettyLogger.java`
#### Snippet
```java
    private static class NettyBridgeLogger implements io.netty.util.internal.logging.InternalLogger {

        private Logger logger = null;

        private static final String EXCEPTION_MESSAGE = "Unexpected exception:";
```

### UnusedAssignment
Variable `startForAWhile` initializer `false` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/body/ConsumerRunningInfo.java`
#### Snippet
```java
        boolean push = isPushType(prev);

        boolean startForAWhile = false;
        {

```

### UnusedAssignment
Variable `push` initializer `false` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/body/ConsumerRunningInfo.java`
#### Snippet
```java
    public static String analyzeProcessQueue(final String clientId, ConsumerRunningInfo info) {
        StringBuilder sb = new StringBuilder();
        boolean push = false;
        {
            String property = info.getProperties().getProperty(ConsumerRunningInfo.PROP_CONSUME_TYPE);
```

### UnusedAssignment
Variable `orderMsg` initializer `false` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/body/ConsumerRunningInfo.java`
#### Snippet
```java
        }

        boolean orderMsg = false;
        {
            String property = info.getProperties().getProperty(ConsumerRunningInfo.PROP_CONSUME_ORDERLY);
```

### UnusedAssignment
Variable `cacheSize` initializer `DEFAULT_CACHE_SIZE` is redundant
in `srvutil/src/main/java/org/apache/rocketmq/util/cache/LocalCache.java`
#### Snippet
```java
    private static final int DEFAULT_CACHE_SIZE = 1000;

    private int cacheSize = DEFAULT_CACHE_SIZE;
    private CacheEvictHandler<K, V> handler;

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `providerClazz != null` is always `true`
in `common/src/main/java/org/apache/rocketmq/common/utils/NetworkUtil.java`
#### Snippet
```java
            try {
                final Class<?> providerClazz = Class.forName("sun.nio.ch.EPollSelectorProvider");
                if (providerClazz != null) {
                    try {
                        final Method method = providerClazz.getMethod("provider");
```

### ConstantValue
Condition `method != null` is always `true`
in `common/src/main/java/org/apache/rocketmq/common/utils/NetworkUtil.java`
#### Snippet
```java
                    try {
                        final Method method = providerClazz.getMethod("provider");
                        if (method != null) {
                            final SelectorProvider selectorProvider = (SelectorProvider) method.invoke(null);
                            if (selectorProvider != null) {
```

### ConstantValue
Condition `pt != null` is always `true`
in `common/src/main/java/org/apache/rocketmq/common/MixAll.java`
#### Snippet
```java
                    if (property != null) {
                        Class<?>[] pt = method.getParameterTypes();
                        if (pt != null && pt.length > 0) {
                            String cn = pt[0].getSimpleName();
                            Object arg = null;
```

### ConstantValue
Condition `!recvAll` is always `true`
in `test/src/main/java/org/apache/rocketmq/test/util/MQWait.java`
#### Snippet
```java
        long startTime = System.currentTimeMillis();
        Collection<Object> noDupMsgs = new ArrayList<Object>();
        while (!recvAll) {
            if ((System.currentTimeMillis() - startTime) < timeoutMills) {
                noDupMsgs.clear();
```

### ConstantValue
Condition `null != req` is always `true`
in `store/src/main/java/org/apache/rocketmq/store/AllocateMappedFileService.java`
#### Snippet
```java
            log.warn(this.getServiceName() + " service has exception. ", e);
            this.hasException = true;
            if (null != req) {
                requestQueue.offer(req);
                try {
```

### ConstantValue
Condition `null != mfs` is always `true`
in `store/src/main/java/org/apache/rocketmq/store/MappedFileQueue.java`
#### Snippet
```java
        List<MappedFile> files = new ArrayList<>();
        int skipFileNum = 0;
        if (null != mfs) {
            //do check before deleting
            checkSelf();
```

### ConstantValue
Condition `skipFileNum > 0` is always `false`
in `store/src/main/java/org/apache/rocketmq/store/MappedFileQueue.java`
#### Snippet
```java
                long liveMaxTimestamp = mappedFile.getLastModifiedTimestamp() + expiredTime;
                if (System.currentTimeMillis() >= liveMaxTimestamp || cleanImmediately) {
                    if (skipFileNum > 0) {
                        log.info("Delete CommitLog {} but skip {} files", mappedFile.getFileName(), skipFileNum);
                    }
```

### ConstantValue
Condition `processSuccess` is always `true`
in `store/src/main/java/org/apache/rocketmq/store/ha/autoswitch/AutoSwitchHAConnection.java`
#### Snippet
```java
                            changeCurrentState(slaveState);
                        }
                        if (processSuccess) {
                            continue;
                        }
```

### ConstantValue
Condition `index >= 1000` is always `true`
in `store/src/main/java/org/apache/rocketmq/store/util/PerfCounter.java`
#### Snippet
```java
        if (index < 1000) {
            return index;
        } else if (index >= 1000 && index < 2000) {
            return (index - 1000) * 10 + 1000;
        } else {
```

### ConstantValue
Condition `cost >= 1000` is always `true`
in `store/src/main/java/org/apache/rocketmq/store/util/PerfCounter.java`
#### Snippet
```java
            return (int) cost;
        }
        if (cost >= 1000 && cost < 1000 + 1000 * 10) {
            int units = (int) ((cost - 1000) / 10);
            return 1000 + units;
```

### ConstantValue
Condition `null == indexFile` is always `true`
in `store/src/main/java/org/apache/rocketmq/store/index/IndexService.java`
#### Snippet
```java
        IndexFile indexFile = null;

        for (int times = 0; null == indexFile && times < MAX_TRY_IDX_CREATE; times++) {
            indexFile = this.getAndCreateLastIndexFile();
            if (null != indexFile) {
```

### ConstantValue
Condition `lastBuffer != null` is always `true`
in `store/src/main/java/org/apache/rocketmq/store/queue/ConsumeQueueStore.java`
#### Snippet
```java
                    startReadOffset += msg.getStoreSize();
                } finally {
                    if (lastBuffer != null)
                        lastBuffer.release();
                }
```

### ConstantValue
Condition `lastBuffer != null` is always `true`
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                LOGGER.error("resetWriteOffset error.", e);
            } finally {
                if (lastBuffer != null)
                    lastBuffer.release();
            }
```

### ConstantValue
Condition `getResult == null` is always `false`
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java

        // lazy init no data found.
        if (getResult == null) {
            getResult = new GetMessageResult(0);
        }
```

### ConstantValue
Condition `topicPublishInfo != null` is always `true`
in `client/src/main/java/org/apache/rocketmq/client/impl/MQAdminImpl.java`
#### Snippet
```java
            if (topicRouteData != null) {
                TopicPublishInfo topicPublishInfo = MQClientInstance.topicRouteData2TopicPublishInfo(topic, topicRouteData);
                if (topicPublishInfo != null && topicPublishInfo.ok()) {
                    return parsePublishMessageQueues(topicPublishInfo.getMessageQueueList());
                }
```

### ConstantValue
Value `roll` is always 'false'
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java

        if (!roll && null != message.getProperty(MessageConst.PROPERTY_TIMER_DEL_UNIQKEY)) {
            LOGGER.warn("Trying do put delete timer msg:[{}] roll:[{}]", message, roll);
            return PUT_NO_RETRY;
        }
```

### ConstantValue
Condition `null != currList` is always `true`
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
            }
        }
        if (null != currList && currList.size() > 0) {
            lists.add(currList);
        }
```

### ConstantValue
Value `mqAll` is always 'null'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
            log.info("broker rebalanced result changed. allocateMessageQueueStrategyName={}, group={}, topic={}, clientId={}, assignmentSet={}",
                strategyName, consumerGroup, topic, this.mQClientFactory.getClientId(), messageQueueAssignments);
            this.messageQueueChanged(topic, mqAll, mqSet);
        }

```

### ConstantValue
Condition `msgs != null` is always `true`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopConcurrentlyService.java`
#### Snippet
```java
            ConsumeReturnType returnType = ConsumeReturnType.SUCCESS;
            try {
                if (msgs != null && !msgs.isEmpty()) {
                    for (MessageExt msg : msgs) {
                        MessageAccessor.setConsumeStartTimeStamp(msg, String.valueOf(System.currentTimeMillis()));
```

### ConstantValue
Condition `msgs != null` is always `true`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopConcurrentlyService.java`
#### Snippet
```java
                ConsumeMessagePopConcurrentlyService.this.processConsumeResult(status, context, this);
            } else {
                if (msgs != null) {
                    processQueue.decFoundMsg(-msgs.size());
                }
```

### ConstantValue
Condition `messageBody == null` is always `false`
in `client/src/main/java/org/apache/rocketmq/client/trace/TraceView.java`
#### Snippet
```java
        List<TraceView> messageTraceViewList = new ArrayList<>();
        String messageBody = new String(messageExt.getBody(), StandardCharsets.UTF_8);
        if (messageBody == null || messageBody.length() <= 0) {
            return messageTraceViewList;
        }
```

### ConstantValue
Condition `msgs != null` is always `true`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
            ConsumeReturnType returnType = ConsumeReturnType.SUCCESS;
            try {
                if (msgs != null && !msgs.isEmpty()) {
                    for (MessageExt msg : msgs) {
                        MessageAccessor.setConsumeStartTimeStamp(msg, String.valueOf(System.currentTimeMillis()));
```

### ConstantValue
Condition `str != null` is always `true`
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java

        String str = MixAll.properties2String(properties);
        if (str != null && str.length() > 0) {
            request.setBody(str.getBytes(MixAll.DEFAULT_CHARSET));
            RemotingCommand response = this.remotingClient
```

### ConstantValue
Condition `pullResult != null` is always `true`
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                    try {
                        PullResult pullResult = MQClientAPIImpl.this.processPullResponse(response, addr);
                        assert pullResult != null;
                        pullCallback.onSuccess(pullResult);
                    } catch (Exception e) {
```

### ConstantValue
Condition `popResult != null` is always `true`
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                        PopResult
                            popResult = MQClientAPIImpl.this.processPopResponse(brokerName, response, requestHeader.getTopic(), requestHeader);
                        assert popResult != null;
                        popCallback.onSuccess(popResult);
                    } catch (Exception e) {
```

### ConstantValue
Condition `str == null` is always `false`
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingConnectException, MQClientException {
        String str = MixAll.properties2String(properties);
        if (str == null || str.length() < 1) {
            return;
        }
```

### ConstantValue
Condition `normalTopic != null` is always `true`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
            if (msg.getTopic().startsWith(popRetryPrefix)) {
                String normalTopic = KeyBuilder.parseNormalTopic(msg.getTopic(), consumerGroup);
                if (normalTopic != null && !normalTopic.isEmpty()) {
                    msg.setTopic(normalTopic);
                }
```

### ConstantValue
Value `requestMsg` is always 'null'
in `client/src/main/java/org/apache/rocketmq/client/producer/RequestResponseFuture.java`
#### Snippet
```java

    public Message getRequestMsg() {
        return requestMsg;
    }

```

### ConstantValue
Condition is always true
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        }
        {
            if (true)
                return rc.toString();
        }
```

### ConstantValue
Condition is always true
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        }
        {
            if (true)
                return left;
        }
```

### ConstantValue
Condition is always true
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        left = orExpression();
        {
            if (true)
                return asBooleanExpression(left);
        }
```

### ConstantValue
Condition is always true
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        }
        {
            if (true)
                return left;
        }
```

### ConstantValue
Condition is always true
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        }
        {
            if (true)
                return left;
        }
```

### ConstantValue
Condition is always true
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        left = new PropertyExpression(t.image);
        {
            if (true)
                return left;
        }
```

### ConstantValue
Condition is always true
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        }
        {
            if (true)
                return left;
        }
```

### ConstantValue
Condition is always true
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        }
        {
            if (true)
                return left;
        }
```

### ConstantValue
Condition is always true
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        }
        {
            if (true)
                return left;
        }
```

### ConstantValue
Condition is always true
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        }
        {
            if (true)
                return left;
        }
```

### ConstantValue
Condition `foundQueueData` is always `true` when reached
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/routeinfo/RouteInfoManager.java`
#### Snippet
```java
        log.debug("pickupTopicRouteData {} {}", topic, topicRouteData);

        if (foundBrokerData && foundQueueData) {

            topicRouteData.setTopicQueueMappingByBroker(this.topicQueueMappingInfoTable.get(topic));
```

### ConstantValue
Value `change` is always 'true'
in `broker/src/main/java/org/apache/rocketmq/broker/filter/ConsumerFilterManager.java`
#### Snippet
```java

                    log.info("Consumer filter info change, old: {}, new: {}, change: {}",
                        old, consumerFilterData, change);

                    return true;
```

### ConstantValue
Value `orderInfo` is always 'null'
in `broker/src/main/java/org/apache/rocketmq/broker/offset/ConsumerOrderInfoManager.java`
#### Snippet
```java
        OrderInfo orderInfo = qs.get(queueId);
        if (orderInfo == null) {
            log.warn("OrderInfo is null, {}, {}, {}", key, queueOffset, orderInfo);
            return queueOffset + 1;
        }
```

### ConstantValue
Condition `rpcHooks == null` is always `false`
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java

        List<RPCHook> rpcHooks = ServiceProvider.load(RPCHook.class);
        if (rpcHooks == null || rpcHooks.isEmpty()) {
            return;
        }
```

### ConstantValue
Condition `setMessageRequestModeRequestBody != null` is always `true`
in `broker/src/main/java/org/apache/rocketmq/broker/processor/QueryAssignmentProcessor.java`
#### Snippet
```java
                MessageQueueAssignment messageQueueAssignment = new MessageQueueAssignment();
                messageQueueAssignment.setMessageQueue(messageQueue);
                if (setMessageRequestModeRequestBody != null) {
                    messageQueueAssignment.setMode(setMessageRequestModeRequestBody.getMode());
                }
```

### ConstantValue
Result of `ThreadLocalRandom.current().nextInt(99999999) % TCMT_QUEUE_NUMS` is always '0'
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/DefaultTransactionalMessageCheckListener.java`
#### Snippet
```java
    private MessageExtBrokerInner toMessageExtBrokerInner(MessageExt msgExt) {
        TopicConfig topicConfig = this.getBrokerController().getTopicConfigManager().createTopicOfTranCheckMaxTime(TCMT_QUEUE_NUMS, PermName.PERM_READ | PermName.PERM_WRITE);
        int queueId = ThreadLocalRandom.current().nextInt(99999999) % TCMT_QUEUE_NUMS;
        MessageExtBrokerInner inner = new MessageExtBrokerInner();
        inner.setTopic(topicConfig.getTopicName());
```

### ConstantValue
Condition `foundList == null` is always `false`
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/TransactionalMessageBridge.java`
#### Snippet
```java
                        getMessageResult.getBufferTotalSize());
                    this.brokerController.getBrokerStatsManager().incBrokerGetNums(topic, getMessageResult.getMessageCount());
                    if (foundList == null || foundList.size() == 0) {
                        break;
                    }
```

### ConstantValue
Condition `keyArray == null` is always `false`
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
            }
            String[] keyArray = entry.getKey().split(PopAckConstants.SPLIT);
            if (keyArray == null || keyArray.length != 3) {
                continue;
            }
```

### ConstantValue
Condition `keyArray == null` is always `false`
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
                        }
                        String[] keyArray = entry.getKey().split(PopAckConstants.SPLIT);
                        if (keyArray == null || keyArray.length != 3) {
                            continue;
                        }
```

### ConstantValue
Condition `!stop` is always `true`
in `example/src/main/java/org/apache/rocketmq/example/openmessaging/SimplePullConsumer.java`
#### Snippet
```java
                consumer.ack(msgId);

                if (!stop) {
                    stop = msgId.equalsIgnoreCase(sendResult.messageId());
                }
```

### ConstantValue
Condition `properties != null` is always `true`
in `remoting/src/main/java/org/apache/rocketmq/remoting/Configuration.java`
#### Snippet
```java
        for (Object configObject : this.configObjectList) {
            Properties properties = MixAll.object2Properties(configObject);
            if (properties != null) {
                merge(properties, this.allConfigs);
            } else {
```

### ConstantValue
Condition `this.storePathField != null` is always `true`
in `remoting/src/main/java/org/apache/rocketmq/remoting/Configuration.java`
#### Snippet
```java
                // check
                this.storePathField = object.getClass().getDeclaredField(fieldName);
                assert this.storePathField != null
                    && !Modifier.isStatic(this.storePathField.getModifiers());
                this.storePathField.setAccessible(true);
```

### ConstantValue
Condition `mqEndPoints != null` is always `true`
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/ClientMetadata.java`
#### Snippet
```java
        {
            ConcurrentMap<MessageQueue, String> mqEndPoints = topicRouteData2EndpointsForStaticTopic(topic, topicRouteData);
            if (mqEndPoints != null
                    && !mqEndPoints.isEmpty()) {
                topicEndPointsTable.put(topic, mqEndPoints);
```

### ConstantValue
Condition `response != null` is always `true`
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/MQProtosHelper.java`
#### Snippet
```java
        try {
            RemotingCommand response = RemotingHelper.invokeSync(nsaddr, request, timeoutMillis);
            if (response != null) {
                return ResponseCode.SUCCESS == response.getCode();
            }
```

### ConstantValue
Value `addrRemote` is always 'null'
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/NettyRemotingClient.java`
#### Snippet
```java

                    if (null == prevCW) {
                        LOGGER.info("eventCloseChannel: the channel[{}] has been removed from the channel table before", addrRemote);
                        removeItemFromTable = false;
                    }
```

### ConstantValue
Condition `this.nettyEventExecutor != null` is always `true`
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/NettyRemotingClient.java`
#### Snippet
```java
            this.eventLoopGroupWorker.shutdownGracefully();

            if (this.nettyEventExecutor != null) {
                this.nettyEventExecutor.shutdown();
            }
```

### ConstantValue
Condition `level == LEVEL_0` is always `true`
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/statictopic/TopicQueueMappingDetail.java`
#### Snippet
```java
            Integer globalId =  entry.getKey();
            List<LogicQueueMappingItem> items = entry.getValue();
            if (level == LEVEL_0
                    && items.size() >= 1) {
                LogicQueueMappingItem curr = items.get(items.size() - 1);
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `flagBits`
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java
    public boolean getAndMakeDiskFull() {
        boolean result = !((this.flagBits & DISK_FULL_BIT) == DISK_FULL_BIT);
        this.flagBits |= DISK_FULL_BIT;
        return result;
    }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `flagBits`
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java

    public void makeLogicsQueueError() {
        this.flagBits |= WRITE_LOGICS_QUEUE_ERROR_BIT;
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `flagBits`
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java
        boolean result = this.isWriteable();
        if (!result) {
            this.flagBits &= ~NOT_WRITEABLE_BIT;
        }
        return result;
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `flagBits`
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java

    public void makeIndexFileError() {
        this.flagBits |= WRITE_INDEX_FILE_ERROR_BIT;
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `flagBits`
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java
        boolean result = this.isReadable();
        if (!result) {
            this.flagBits &= ~NOT_READABLE_BIT;
        }
        return result;
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `flagBits`
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java
    public boolean getAndMakeDiskOK() {
        boolean result = !((this.flagBits & DISK_FULL_BIT) == DISK_FULL_BIT);
        this.flagBits &= ~DISK_FULL_BIT;
        return result;
    }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `flagBits`
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java
        boolean result = this.isReadable();
        if (result) {
            this.flagBits |= NOT_READABLE_BIT;
        }
        return result;
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `flagBits`
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java
        boolean result = this.isWriteable();
        if (result) {
            this.flagBits |= NOT_WRITEABLE_BIT;
        }
        return result;
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `dispatchMaxBuffer`
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java

    public void setDispatchMaxBuffer(long value) {
        this.dispatchMaxBuffer = value > this.dispatchMaxBuffer ? value : this.dispatchMaxBuffer;
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `putMessageEntireTimeMax`
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        if (value > this.putMessageEntireTimeMax) {
            this.putLock.lock();
            this.putMessageEntireTimeMax =
                value > this.putMessageEntireTimeMax ? value : this.putMessageEntireTimeMax;
            this.putLock.unlock();
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `getMessageEntireTimeMax`
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        if (value > this.getMessageEntireTimeMax) {
            this.getLock.lock();
            this.getMessageEntireTimeMax =
                value > this.getMessageEntireTimeMax ? value : this.getMessageEntireTimeMax;
            this.getLock.unlock();
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `reputFromOffset`
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                            }
                            byteBuffer.position(byteBuffer.position() + totalSize);
                            this.reputFromOffset += totalSize;
                            readSize += totalSize;
                        } else {
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `reputFromOffset`
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                            doNext = false;
                            if (totalSize == 0) {
                                this.reputFromOffset = DefaultMessageStore.this.commitLog.rollNextFile(this.reputFromOffset);
                            }
                            this.createBatchDispatchRequest(byteBuffer, batchDispatchRequestStart, batchDispatchRequestSize);
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `manualDeleteFileSeveralTimes`
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java

                if (isManualDelete) {
                    this.manualDeleteFileSeveralTimes--;
                }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `reputFromOffset`
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                                }

                                this.reputFromOffset += size;
                                readSize += size;
                                if (!DefaultMessageStore.this.getMessageStoreConfig().isDuplicationEnable() &&
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `reputFromOffset`
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                                }
                            } else if (size == 0) {
                                this.reputFromOffset = DefaultMessageStore.this.commitLog.rollNextFile(this.reputFromOffset);
                                readSize = result.getSize();
                            }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `reputFromOffset`
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                            if (size > 0) {
                                LOGGER.error("[BUG]read total count not equals msg total size. reputFromOffset={}", reputFromOffset);
                                this.reputFromOffset += size;
                            } else {
                                doNext = false;
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `reputFromOffset`
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                                    LOGGER.error("[BUG]dispatch message to consume queue error, COMMITLOG OFFSET: {}",
                                        this.reputFromOffset);
                                    this.reputFromOffset += result.getSize() - readSize;
                                }
                            }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `currReadTimeMs`
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java

    private void moveReadTime() {
        currReadTimeMs = currReadTimeMs + precisionMs;
        commitReadTimeMs = currReadTimeMs;
    }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `currQueueOffset`
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
            currQueueOffset = queueOffset + 1;
        }
        currQueueOffset = Math.min(currQueueOffset, timerCheckpoint.getMasterTimerQueueOffset());

        //check timer wheel
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `preReadTimeMs`
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        Slot slot = timerWheel.getSlot(preReadTimeMs);
        if (-1 == slot.timeMs) {
            preReadTimeMs = preReadTimeMs + precisionMs;
            return 0;
        }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `preReadTimeMs`
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
            }
        } finally {
            preReadTimeMs = preReadTimeMs + precisionMs;
        }
        return 1;
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `commitPosition`
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/TieredFileSegment.java`
#### Snippet
```java
                            commitMsgQueueOffset = MessageBufferUtil.getQueueOffset(bufferList.get(bufferList.size() - 1));
                        }
                        commitPosition += finalBufferSize;
                        return true;
                    }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `appendPosition`
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/TieredFileSegment.java`
#### Snippet
```java
        codaBuffer.putLong(endTimestamp);
        codaBuffer.flip();
        appendPosition += TieredCommitLog.CODA_SIZE;
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `appendPosition`
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/TieredFileSegment.java`
#### Snippet
```java
                beginTimestamp = byteBuf.getLong(TieredIndexFile.INDEX_FILE_HEADER_BEGIN_TIME_STAMP_POSITION);
                endTimestamp = byteBuf.getLong(TieredIndexFile.INDEX_FILE_HEADER_END_TIME_STAMP_POSITION);
                appendPosition += byteBuf.remaining();
                uploadBufferList.add(byteBuf);
                setFull();
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `appendPosition`
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/TieredFileSegment.java`
#### Snippet
```java
                }
            }
            appendPosition += byteBuf.remaining();
            uploadBufferList.add(byteBuf);
            return AppendResult.SUCCESS;
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `common/src/main/java/org/apache/rocketmq/common/MixAll.java`
#### Snippet
```java
        for (Map.Entry<Object, Object> entry : entrySet) {
            if (entry.getValue() != null) {
                sb.append(entry.getKey().toString() + "=" + entry.getValue().toString() + "\n");
            }
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `test/src/main/java/org/apache/rocketmq/test/util/DuplicateMessageInfo.java`
#### Snippet
```java
                        }

                        strBQueue.get(msgQueueListIndex).append("" + msgQueueListIndex + "\t" +
                            msgIdMap.get(lQueueList.get(msgQueueListIndex).get(msgListIndex)) + "\t"
                            + lQueueList.get(msgQueueListIndex).get(msgListIndex) + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `test/src/main/java/org/apache/rocketmq/test/util/DuplicateMessageInfo.java`
#### Snippet
```java
        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append("msgTotalNum:" + msgTotalNum + "\r\n");
        strBuilder.append("msgTotalDupNum:" + msgTotalDupNum + "\r\n");
        strBuilder.append("msgNoDupNum:" + msgNoDupNum + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `test/src/main/java/org/apache/rocketmq/test/util/DuplicateMessageInfo.java`
#### Snippet
```java

        strBuilder.append("msgTotalNum:" + msgTotalNum + "\r\n");
        strBuilder.append("msgTotalDupNum:" + msgTotalDupNum + "\r\n");
        strBuilder.append("msgNoDupNum:" + msgNoDupNum + "\r\n");
        strBuilder.append("msgDupRate" + getFloatNumString(msgDupRate) + "%\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `test/src/main/java/org/apache/rocketmq/test/util/DuplicateMessageInfo.java`
#### Snippet
```java
        strBuilder.append("msgTotalNum:" + msgTotalNum + "\r\n");
        strBuilder.append("msgTotalDupNum:" + msgTotalDupNum + "\r\n");
        strBuilder.append("msgNoDupNum:" + msgNoDupNum + "\r\n");
        strBuilder.append("msgDupRate" + getFloatNumString(msgDupRate) + "%\r\n");

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `test/src/main/java/org/apache/rocketmq/test/util/DuplicateMessageInfo.java`
#### Snippet
```java
        strBuilder.append("msgTotalDupNum:" + msgTotalDupNum + "\r\n");
        strBuilder.append("msgNoDupNum:" + msgNoDupNum + "\r\n");
        strBuilder.append("msgDupRate" + getFloatNumString(msgDupRate) + "%\r\n");

        strBuilder.append("queue\tmsg(dupNum/dupRate)\tdupRate\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `test/src/main/java/org/apache/rocketmq/test/util/DuplicateMessageInfo.java`
#### Snippet
```java
            float msgQueueInnerDupRate = ((float) msgDupNum / (float) msgNum) * 100.0f;

            strBuilder.append(i + "\t" + msgDupNum + "/" + getFloatNumString(msgQueueDupRate) + "%" + "\t\t" +
                getFloatNumString(msgQueueInnerDupRate) + "%\r\n");
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        }

        sb.append("\truntime: " + this.getFormatRuntime() + "\r\n");
        sb.append("\tputMessageEntireTimeMax: " + this.putMessageEntireTimeMax + "\r\n");
        sb.append("\tputMessageTimesTotal: " + totalTimes + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java

        sb.append("\truntime: " + this.getFormatRuntime() + "\r\n");
        sb.append("\tputMessageEntireTimeMax: " + this.putMessageEntireTimeMax + "\r\n");
        sb.append("\tputMessageTimesTotal: " + totalTimes + "\r\n");
        sb.append("\tgetPutMessageFailedTimes: " + this.getPutMessageFailedTimes() + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        sb.append("\truntime: " + this.getFormatRuntime() + "\r\n");
        sb.append("\tputMessageEntireTimeMax: " + this.putMessageEntireTimeMax + "\r\n");
        sb.append("\tputMessageTimesTotal: " + totalTimes + "\r\n");
        sb.append("\tgetPutMessageFailedTimes: " + this.getPutMessageFailedTimes() + "\r\n");
        sb.append("\tputMessageSizeTotal: " + this.getPutMessageSizeTotal() + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        sb.append("\tputMessageEntireTimeMax: " + this.putMessageEntireTimeMax + "\r\n");
        sb.append("\tputMessageTimesTotal: " + totalTimes + "\r\n");
        sb.append("\tgetPutMessageFailedTimes: " + this.getPutMessageFailedTimes() + "\r\n");
        sb.append("\tputMessageSizeTotal: " + this.getPutMessageSizeTotal() + "\r\n");
        sb.append("\tputMessageDistributeTime: " + this.getPutMessageDistributeTimeStringInfo(totalTimes)
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        sb.append("\tputMessageTimesTotal: " + totalTimes + "\r\n");
        sb.append("\tgetPutMessageFailedTimes: " + this.getPutMessageFailedTimes() + "\r\n");
        sb.append("\tputMessageSizeTotal: " + this.getPutMessageSizeTotal() + "\r\n");
        sb.append("\tputMessageDistributeTime: " + this.getPutMessageDistributeTimeStringInfo(totalTimes)
            + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        sb.append("\tgetPutMessageFailedTimes: " + this.getPutMessageFailedTimes() + "\r\n");
        sb.append("\tputMessageSizeTotal: " + this.getPutMessageSizeTotal() + "\r\n");
        sb.append("\tputMessageDistributeTime: " + this.getPutMessageDistributeTimeStringInfo(totalTimes)
            + "\r\n");
        sb.append("\tputMessageAverageSize: " + (this.getPutMessageSizeTotal() / totalTimes.doubleValue())
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        sb.append("\tputMessageDistributeTime: " + this.getPutMessageDistributeTimeStringInfo(totalTimes)
            + "\r\n");
        sb.append("\tputMessageAverageSize: " + (this.getPutMessageSizeTotal() / totalTimes.doubleValue())
            + "\r\n");
        sb.append("\tdispatchMaxBuffer: " + this.dispatchMaxBuffer + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        sb.append("\tputMessageAverageSize: " + (this.getPutMessageSizeTotal() / totalTimes.doubleValue())
            + "\r\n");
        sb.append("\tdispatchMaxBuffer: " + this.dispatchMaxBuffer + "\r\n");
        sb.append("\tgetMessageEntireTimeMax: " + this.getMessageEntireTimeMax + "\r\n");
        sb.append("\tputTps: " + this.getPutTps() + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
            + "\r\n");
        sb.append("\tdispatchMaxBuffer: " + this.dispatchMaxBuffer + "\r\n");
        sb.append("\tgetMessageEntireTimeMax: " + this.getMessageEntireTimeMax + "\r\n");
        sb.append("\tputTps: " + this.getPutTps() + "\r\n");
        sb.append("\tgetFoundTps: " + this.getGetFoundTps() + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        sb.append("\tdispatchMaxBuffer: " + this.dispatchMaxBuffer + "\r\n");
        sb.append("\tgetMessageEntireTimeMax: " + this.getMessageEntireTimeMax + "\r\n");
        sb.append("\tputTps: " + this.getPutTps() + "\r\n");
        sb.append("\tgetFoundTps: " + this.getGetFoundTps() + "\r\n");
        sb.append("\tgetMissTps: " + this.getGetMissTps() + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        sb.append("\tgetMessageEntireTimeMax: " + this.getMessageEntireTimeMax + "\r\n");
        sb.append("\tputTps: " + this.getPutTps() + "\r\n");
        sb.append("\tgetFoundTps: " + this.getGetFoundTps() + "\r\n");
        sb.append("\tgetMissTps: " + this.getGetMissTps() + "\r\n");
        sb.append("\tgetTotalTps: " + this.getGetTotalTps() + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        sb.append("\tputTps: " + this.getPutTps() + "\r\n");
        sb.append("\tgetFoundTps: " + this.getGetFoundTps() + "\r\n");
        sb.append("\tgetMissTps: " + this.getGetMissTps() + "\r\n");
        sb.append("\tgetTotalTps: " + this.getGetTotalTps() + "\r\n");
        sb.append("\tgetTransferredTps: " + this.getGetTransferredTps() + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        sb.append("\tgetFoundTps: " + this.getGetFoundTps() + "\r\n");
        sb.append("\tgetMissTps: " + this.getGetMissTps() + "\r\n");
        sb.append("\tgetTotalTps: " + this.getGetTotalTps() + "\r\n");
        sb.append("\tgetTransferredTps: " + this.getGetTransferredTps() + "\r\n");
        return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        sb.append("\tgetMissTps: " + this.getGetMissTps() + "\r\n");
        sb.append("\tgetTotalTps: " + this.getGetTotalTps() + "\r\n");
        sb.append("\tgetTransferredTps: " + this.getGetTransferredTps() + "\r\n");
        return sb.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `filter/src/main/java/org/apache/rocketmq/filter/parser/TokenMgrError.java`
#### Snippet
```java
                    if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                        String s = "0000" + Integer.toString(ch, 16);
                        retval.append("\\u" + s.substring(s.length() - 4, s.length()));
                    } else {
                        retval.append(ch);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `filter/src/main/java/org/apache/rocketmq/filter/parser/ParseException.java`
#### Snippet
```java
                    if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                        String s = "0000" + Integer.toString(ch, 16);
                        retval.append("\\u" + s.substring(s.length() - 4, s.length()));
                    } else {
                        retval.append(ch);
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `remoting/src/main/java/org/apache/rocketmq/remoting/Configuration.java`
#### Snippet
```java
    public Configuration(Logger log, Object... configObjects) {
        this.log = log;
        if (configObjects == null || configObjects.length == 0) {
            return;
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `common/src/main/java/org/apache/rocketmq/common/utils/ServiceProvider.java`
#### Snippet
```java
                            objectId(serviceClazz.getClassLoader()), clazz.getName());
                    }
                    return (T) serviceClazz.getDeclaredConstructor().newInstance();
                } catch (ClassNotFoundException ex) {
                    if (classLoader == thisClassLoader) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'T'
in `common/src/main/java/org/apache/rocketmq/common/utils/ServiceProvider.java`
#### Snippet
```java
            LOG.error("Unable to init service.", e);
        }
        return (T) serviceClazz;
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'addFuture(T, Future)' as a member of raw type 'org.apache.rocketmq.common.statistics.FutureHolder'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledPrinter.java`
#### Snippet
```java
        }, getInitialDelay(), interval, TimeUnit.MILLISECONDS);

        addFuture(statisticsItem, future);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'removeAllFuture(T)' as a member of raw type 'org.apache.rocketmq.common.statistics.FutureHolder'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledPrinter.java`
#### Snippet
```java

    public void remove(final StatisticsItem statisticsItem) {
        removeAllFuture(statisticsItem);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'removeAllFuture(T)' as a member of raw type 'org.apache.rocketmq.common.statistics.FutureHolder'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledIncrementPrinter.java`
#### Snippet
```java
    public void remove(StatisticsItem item) {
        // remove task
        removeAllFuture(item);

        String kind = item.getStatKind();
```

### UNCHECKED_WARNING
Unchecked call to 'addFuture(T, Future)' as a member of raw type 'org.apache.rocketmq.common.statistics.FutureHolder'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledIncrementPrinter.java`
#### Snippet
```java
            }
        }, getInitialDelay(), interval, TimeUnit.MILLISECONDS);
        addFuture(item, future);

        // sample every TPS_INTREVAL
```

### UNCHECKED_WARNING
Unchecked call to 'addFuture(T, Future)' as a member of raw type 'org.apache.rocketmq.common.statistics.FutureHolder'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledIncrementPrinter.java`
#### Snippet
```java
            }
        }, TPS_INTREVAL, TPS_INTREVAL, TimeUnit.MILLISECONDS);
        addFuture(item, futureSample);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.apache.rocketmq.common.Pair'
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQTransactionalProducer.java`
#### Snippet
```java
    @Override
    public ResultWrapper send(Object msg, Object arg) {
        boolean commitMsg = ((Pair<Boolean, LocalTransactionState>) arg).getObject2() == LocalTransactionState.COMMIT_MESSAGE;
        org.apache.rocketmq.client.producer.SendResult metaqResult = null;
        Message message = (Message) msg;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.proxy.grpc.v2.channel.GrpcChannelManager.ResultFuture' to 'org.apache.rocketmq.proxy.grpc.v2.channel.GrpcChannelManager.ResultFuture'
in `proxy/src/main/java/org/apache/rocketmq/proxy/grpc/v2/channel/GrpcChannelManager.java`
#### Snippet
```java

    public <T> CompletableFuture<ProxyRelayResult<T>> getAndRemoveResponseFuture(String nonce) {
        ResultFuture<T> resultFuture = this.resultNonceFutureMap.remove(nonce);
        if (resultFuture != null) {
            return resultFuture.future;
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.grpc.stub.StreamObserver' to 'io.grpc.stub.StreamObserver'
in `proxy/src/main/java/org/apache/rocketmq/proxy/grpc/v2/GrpcMessagingApplication.java`
#### Snippet
```java
                try {
                    GrpcTask grpcTask = (GrpcTask) r;
                    writeResponse(grpcTask.context, grpcTask.request, grpcTask.executeRejectResponse, grpcTask.streamObserver, null, null);
                } catch (Throwable t) {
                    log.warn("write rejected error response failed", t);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.CompletableFuture\[\]' to 'java.util.concurrent.CompletableFuture\[\]'
in `proxy/src/main/java/org/apache/rocketmq/proxy/grpc/v2/consumer/AckMessageActivity.java`
#### Snippet
```java
            validateTopicAndConsumerGroup(request.getTopic(), request.getGroup());

            CompletableFuture<AckMessageResultEntry>[] futures = new CompletableFuture[request.getEntriesCount()];
            for (int i = 0; i < request.getEntriesCount(); i++) {
                futures[i] = processAckMessage(ctx, request, request.getEntries(i));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `proxy/src/main/java/org/apache/rocketmq/proxy/common/ProxyContext.java`
#### Snippet
```java

    public <T> T getVal(String key) {
        return (T) this.value.get(key);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.ConcurrentHashMap' to 'java.util.concurrent.ConcurrentHashMap'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
    public boolean resetWriteOffset(long phyOffset) {
        //copy a new map
        ConcurrentHashMap<String, Long> newMap = new ConcurrentHashMap<>(consumeQueueStore.getTopicQueueTable());
        SelectMappedBufferResult lastBuffer = null;
        long startReadOffset = phyOffset == -1 ? 0 : phyOffset;
```

### UNCHECKED_WARNING
Unchecked call to 'ConcurrentHashMap(Map)' as a member of raw type 'java.util.concurrent.ConcurrentHashMap'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
    public boolean resetWriteOffset(long phyOffset) {
        //copy a new map
        ConcurrentHashMap<String, Long> newMap = new ConcurrentHashMap<>(consumeQueueStore.getTopicQueueTable());
        SelectMappedBufferResult lastBuffer = null;
        long startReadOffset = phyOffset == -1 ? 0 : phyOffset;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `client/src/main/java/org/apache/rocketmq/client/trace/hook/ConsumeMessageOpenTracingHookImpl.java`
#### Snippet
```java
            return;
        }
        List<Span> spanList = (List<Span>) context.getMqTraceContext();
        if (spanList == null) {
            return;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
    public Set<String> getClusterList(String topic,
        long timeoutMillis) {
        return Collections.EMPTY_SET;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.HashMap'
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                clusterAclVersionInfo.setBrokerAddr(responseHeader.getBrokerAddr());
                clusterAclVersionInfo.setAclConfigDataVersion(DataVersion.fromJson(responseHeader.getVersion(), DataVersion.class));
                HashMap<String, Object> dataVersionMap = JSON.parseObject(responseHeader.getAllAclFileVersion(), HashMap.class);
                Map<String, DataVersion> allAclConfigDataVersion = new HashMap<>(dataVersionMap.size(), 1);
                for (Map.Entry<String, Object> entry : dataVersionMap.entrySet()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
                return;
            }
            List<TraceTransferBean> dataToSend = new ArrayList(traceTransferBeanList);
            AsyncDataSendTask asyncDataSendTask = new AsyncDataSendTask(traceTopicName, regionId, dataToSend);
            traceExecutor.submit(asyncDataSendTask);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
                return;
            }
            List<TraceTransferBean> dataToSend = new ArrayList(traceTransferBeanList);
            AsyncDataSendTask asyncDataSendTask = new AsyncDataSendTask(traceTopicName, regionId, dataToSend);
            traceExecutor.submit(asyncDataSendTask);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Set'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
                        @Override
                        public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
                            Set<String> brokerSet = (Set<String>) arg;
                            List<MessageQueue> filterMqs = new ArrayList<>();
                            for (MessageQueue queue : mqs) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
                .reduce(currentMsgKeySize, (acc, x) -> acc + x.length(), Integer::sum);
            if (currentMsgSize >= traceProducer.getMaxMessageSize() - 10 * 1000 || currentMsgKeySize >= MAX_MSG_KEY_SIZE) {
                List<TraceTransferBean> dataToSend = new ArrayList(traceTransferBeanList);
                AsyncDataSendTask asyncDataSendTask = new AsyncDataSendTask(traceTopicName, regionId, dataToSend);
                traceExecutor.submit(asyncDataSendTask);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
                .reduce(currentMsgKeySize, (acc, x) -> acc + x.length(), Integer::sum);
            if (currentMsgSize >= traceProducer.getMaxMessageSize() - 10 * 1000 || currentMsgKeySize >= MAX_MSG_KEY_SIZE) {
                List<TraceTransferBean> dataToSend = new ArrayList(traceTransferBeanList);
                AsyncDataSendTask asyncDataSendTask = new AsyncDataSendTask(traceTopicName, regionId, dataToSend);
                traceExecutor.submit(asyncDataSendTask);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
        private final String traceTopicName;
        private final String regionId;
        private final List<TraceTransferBean> traceTransferBeanList = new ArrayList();

        TraceDataSegment(String traceTopicName, String regionId) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.HashMap'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
        this.discardCount = new AtomicLong(0L);
        this.traceContextQueue = new ArrayBlockingQueue<>(1024);
        this.taskQueueByTopic = new HashMap();
        this.group = group;
        this.type = type;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `controller/src/main/java/org/apache/rocketmq/controller/processor/ControllerRequestProcessor.java`
#### Snippet
```java
                                                             RemotingCommand request) throws Exception {
        if (request.getBody() != null) {
            final List<String> brokerNames = RemotingSerializable.decode(request.getBody(), List.class);
            if (brokerNames != null && brokerNames.size() > 0) {
                final CompletableFuture<RemotingCommand> future = this.controllerManager.getController().getSyncStateData(brokerNames);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                                t = stringLitteral();
                                list = new ArrayList();
                                list.add(t);
                                label_5:
                                while (true) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                                    jj_consume_token(29);
                                    t = stringLitteral();
                                    list.add(t);
                                }
                                jj_consume_token(30);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                                    t = stringLitteral();
                                    list = new ArrayList();
                                    list.add(t);
                                    label_6:
                                    while (true) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                                        jj_consume_token(29);
                                        t = stringLitteral();
                                        list.add(t);
                                    }
                                    jj_consume_token(30);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `broker/src/main/java/org/apache/rocketmq/broker/client/DefaultConsumerIdsChangeListener.java`
#### Snippet
```java
                    return;
                }
                List<Channel> channels = (List<Channel>) args[0];
                if (channels != null && brokerController.getBrokerConfig().isNotifyConsumerIdsChangedEnable()) {
                    if (this.brokerController.getBrokerConfig().isRealTimeNotifyConsumerChange()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `broker/src/main/java/org/apache/rocketmq/broker/client/DefaultConsumerIdsChangeListener.java`
#### Snippet
```java
                    return;
                }
                Collection<SubscriptionData> subscriptionDataList = (Collection<SubscriptionData>) args[0];
                this.brokerController.getConsumerFilterManager().register(group, subscriptionDataList);
                break;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.ArrayList'
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/ManyPullRequest.java`
#### Snippet
```java
    public synchronized List<PullRequest> cloneListAndClear() {
        if (!this.pullRequestList.isEmpty()) {
            List<PullRequest> result = (ArrayList<PullRequest>) this.pullRequestList.clone();
            this.pullRequestList.clear();
            return result;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.broker.processor.PopBufferMergeService.QueueWithTime' to 'org.apache.rocketmq.broker.processor.PopBufferMergeService.QueueWithTime'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
            QueueWithTime old = this.commitOffsets.putIfAbsent(pointWrapper.getLockKey(), queue);
            if (old != null) {
                queue = old;
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
        switch (responseCommand.getCode()) {
            case ResponseCode.SUCCESS: {
                rpcResponsePromise.setSuccess(new RpcResponse(ResponseCode.SUCCESS, null, RemotingSerializable.decode(responseCommand.getBody(), bodyClass)));
                break;
            }
```

## RuleId[id=UnaryPlus]
### UnaryPlus
Unary `+` operator
in `common/src/main/java/org/apache/rocketmq/common/message/MessageDecoder.java`
#### Snippet
```java
                8 +  // 12 Prepared Transaction Offset
                4 + bodyLength +  // 13 BODY
                +1 + topicLen +  // 14 TOPIC
                2 + propertiesLength // 15 propertiesLength
            ;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                deleteFile(file1);
            }
```

### DataFlowIssue
Method invocation `getBytes` may produce `NullPointerException`
in `common/src/main/java/org/apache/rocketmq/common/utils/HttpTinyClient.java`
#### Snippet
```java
            setHeaders(conn, headers, encoding);

            conn.getOutputStream().write(encodedContent.getBytes(MixAll.DEFAULT_CHARSET));

            int respCode = conn.getResponseCode();
```

### DataFlowIssue
Casting `this.bornHost` to `InetSocketAddress` will produce `ClassCastException` for any non-null value
in `common/src/main/java/org/apache/rocketmq/common/message/MessageExt.java`
#### Snippet
```java
                return ((InetSocketAddress) bornHost).getHostString();
            }
            InetAddress inetAddress = ((InetSocketAddress) this.bornHost).getAddress();

            return null != inetAddress ? inetAddress.getHostName() : null;
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `test/src/main/java/org/apache/rocketmq/test/util/FileUtil.java`
#### Snippet
```java

    public static void main(String[] args) {
        String filePath = FileUtil.class.getResource("/").getPath();
        String fileName = "test.txt";
        FileUtil fileUtil = new FileUtil(filePath, fileName);
```

### DataFlowIssue
Variable is already assigned to this value
in `test/src/main/java/org/apache/rocketmq/test/util/TestUtil.java`
#### Snippet
```java
            val = Long.parseLong(s);
        } catch (NumberFormatException e) {
            val = defval;
        }
        return val;
```

### DataFlowIssue
Variable is already assigned to this value
in `test/src/main/java/org/apache/rocketmq/test/util/TestUtil.java`
#### Snippet
```java
            val = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            val = defval;
        }
        return val;
```

### DataFlowIssue
Variable is already assigned to this value
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtil.java`
#### Snippet
```java
                v = getIntegerBetween(mn, mx);
                if (v == mx) {
                    mx = v;
                }
                if (v == mn) {
```

### DataFlowIssue
Variable is already assigned to this value
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtil.java`
#### Snippet
```java
                }
                if (v == mn) {
                    mn = v;
                }
            }
```

### DataFlowIssue
Dereference of `dir.listFiles()` may produce `NullPointerException`
in `test/src/main/java/org/apache/rocketmq/test/schema/SchemaTools.java`
#### Snippet
```java
        File dir = new File(String.format("%s/%s", base, label));
        Map<String, TreeMap<String, String>> schemaMap = new TreeMap<>();
        for (File file: dir.listFiles()) {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            String line = null;
```

### DataFlowIssue
Method invocation `hashCode` may produce `NullPointerException`
in `proxy/src/main/java/org/apache/rocketmq/proxy/grpc/v2/producer/SendMessageActivity.java`
#### Snippet
```java
                    // With shardingKey
                    List<AddressableMessageQueue> writeQueues = messageQueueView.getWriteSelector().getQueues();
                    int bucket = Hashing.consistentHash(shardingKey.hashCode(), writeQueues.size());
                    targetMessageQueue = writeQueues.get(bucket);
                } else {
```

### DataFlowIssue
Method invocation `getWriteQueueNums` may produce `NullPointerException`
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionStore.java`
#### Snippet
```java
                //check topic flag
                if (Objects.equals(policy, CleanupPolicy.COMPACTION)) {
                    for (int queueId = 0; queueId < topicConfig.getWriteQueueNums(); queueId++) {
                        loadAndGetClog(it.getKey(), queueId);
                    }
```

### DataFlowIssue
Method invocation `getStoreTimestamp` may produce `NullPointerException`
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
                    MappedFile firstBcq = mappedFileQueue.getFirstMappedFile();
                    BatchOffsetIndex minForFirstBcq = getMinMsgOffset(firstBcq, false, true);
                    if (minForFirstBcq != null && minForFirstBcq.getStoreTimestamp() <= timestamp && timestamp < minForLastBcq.getStoreTimestamp()) {
                        // old search logic
                        targetBcq = this.searchTimeFromFiles(timestamp);
```

### DataFlowIssue
Method invocation `getMsgOffset` may produce `NullPointerException`
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
                    MappedFile firstBcq = mappedFileQueue.getFirstMappedFile();
                    BatchOffsetIndex minForFirstBcq = getMinMsgOffset(firstBcq, false, false);
                    if (minForFirstBcq != null && minForFirstBcq.getMsgOffset() <= msgOffset && msgOffset < minForLastBcq.getMsgOffset()) {
                        // old search logic
                        targetBcq = this.searchOffsetFromFiles(msgOffset);
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `store/src/main/java/org/apache/rocketmq/store/queue/ConsumeQueueStore.java`
#### Snippet
```java
                this.messageStore);
        } else {
            throw new RuntimeException(format("queue type %s is not supported.", cqType.toString()));
        }
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java

            if (maxOffset == 0) {
                status = GetMessageStatus.NO_MESSAGE_IN_QUEUE;
                nextBeginOffset = nextOffsetCorrection(offset, 0);
            } else if (offset < minOffset) {
```

### DataFlowIssue
Variable is already assigned to this value
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceLitePullImpl.java`
#### Snippet
```java
                    }
                } else {
                    result = -1;
                }
                break;
```

### DataFlowIssue
Variable is already assigned to this value
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceLitePullImpl.java`
#### Snippet
```java
                    result = 0L;
                } else {
                    result = -1;
                }
                break;
```

### DataFlowIssue
Method invocation `getTime` may produce `NullPointerException`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceLitePullImpl.java`
#### Snippet
```java
                        try {
                            long timestamp = UtilAll.parseDate(this.litePullConsumerImpl.getDefaultLitePullConsumer().getConsumeTimestamp(),
                                UtilAll.YYYYMMDDHHMMSS).getTime();
                            result = this.mQClientFactory.getMQAdminImpl().searchOffset(mq, timestamp);
                        } catch (MQClientException e) {
```

### DataFlowIssue
Variable is already assigned to this value
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceLitePullImpl.java`
#### Snippet
```java
                    }
                } else {
                    result = -1;
                }
                break;
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
                fileIndexPy = (int) (tr.getOffsetPy() / commitLogFileSize);
            } else {
                currList.add(tr);
                if (++msgIndex % 2000 == 0) {
                    lists.add(currList);
```

### DataFlowIssue
Variable is already assigned to this value
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
                                returnType = ConsumeReturnType.FAILED;
                            } else if (ConsumeOrderlyStatus.SUCCESS == status) {
                                returnType = ConsumeReturnType.SUCCESS;
                            }

```

### DataFlowIssue
Method invocation `getProps` may produce `NullPointerException`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java

                            if (ConsumeMessageOrderlyService.this.defaultMQPushConsumerImpl.hasHook()) {
                                consumeMessageContext.getProps().put(MixAll.CONSUME_CONTEXT_TYPE, returnType.name());
                            }

```

### DataFlowIssue
Method invocation `setStatus` may produce `NullPointerException`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java

                            if (ConsumeMessageOrderlyService.this.defaultMQPushConsumerImpl.hasHook()) {
                                consumeMessageContext.setStatus(status.toString());
                                consumeMessageContext
                                    .setSuccess(ConsumeOrderlyStatus.SUCCESS == status || ConsumeOrderlyStatus.COMMIT == status);
```

### DataFlowIssue
Method invocation `getTime` may produce `NullPointerException`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalancePushImpl.java`
#### Snippet
```java
                        try {
                            long timestamp = UtilAll.parseDate(this.defaultMQPushConsumerImpl.getDefaultMQPushConsumer().getConsumeTimestamp(),
                                UtilAll.YYYYMMDDHHMMSS).getTime();
                            result = this.mQClientFactory.getMQAdminImpl().searchOffset(mq, timestamp);
                        } catch (MQClientException e) {
```

### DataFlowIssue
Variable is already assigned to this value
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopConcurrentlyService.java`
#### Snippet
```java
                returnType = ConsumeReturnType.FAILED;
            } else if (ConsumeConcurrentlyStatus.CONSUME_SUCCESS == status) {
                returnType = ConsumeReturnType.SUCCESS;
            }

```

### DataFlowIssue
Method invocation `getProps` may produce `NullPointerException`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopConcurrentlyService.java`
#### Snippet
```java

            if (ConsumeMessagePopConcurrentlyService.this.defaultMQPushConsumerImpl.hasHook()) {
                consumeMessageContext.getProps().put(MixAll.CONSUME_CONTEXT_TYPE, returnType.name());
                consumeMessageContext.setStatus(status.toString());
                consumeMessageContext.setSuccess(ConsumeConcurrentlyStatus.CONSUME_SUCCESS == status);
```

### DataFlowIssue
Variable is already assigned to this value
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
                returnType = ConsumeReturnType.FAILED;
            } else if (ConsumeConcurrentlyStatus.CONSUME_SUCCESS == status) {
                returnType = ConsumeReturnType.SUCCESS;
            }

```

### DataFlowIssue
Method invocation `getProps` may produce `NullPointerException`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java

            if (ConsumeMessageConcurrentlyService.this.defaultMQPushConsumerImpl.hasHook()) {
                consumeMessageContext.getProps().put(MixAll.CONSUME_CONTEXT_TYPE, returnType.name());
            }

```

### DataFlowIssue
Method invocation `setStatus` may produce `NullPointerException`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java

            if (ConsumeMessageConcurrentlyService.this.defaultMQPushConsumerImpl.hasHook()) {
                consumeMessageContext.setStatus(status.toString());
                consumeMessageContext.setSuccess(ConsumeConcurrentlyStatus.CONSUME_SUCCESS == status);
                ConsumeMessageConcurrentlyService.this.defaultMQPushConsumerImpl.executeHookAfter(consumeMessageContext);
```

### DataFlowIssue
Variable is already assigned to this value
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                break;
            case ResponseCode.PULL_NOT_FOUND:
                pullStatus = PullStatus.NO_NEW_MSG;
                break;
            case ResponseCode.PULL_RETRY_IMMEDIATELY:
```

### DataFlowIssue
Method invocation `setSendResult` may produce `NullPointerException`
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java

                if (this.hasSendMessageHook()) {
                    context.setSendResult(sendResult);
                    this.executeSendMessageHookAfter(context);
                }
```

### DataFlowIssue
Method invocation `setException` may produce `NullPointerException`
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
            } catch (RemotingException | InterruptedException | MQBrokerException e) {
                if (this.hasSendMessageHook()) {
                    context.setException(e);
                    this.executeSendMessageHookAfter(context);
                }
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
        File file = new File(path);
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getAbsolutePath();
            File f = new File(fileName);
```

### DataFlowIssue
Method invocation `getAccounts` may produce `NullPointerException`
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
            String aclFileName = accessKeyTable.get(plainAccessConfig.getAccessKey());
            PlainAccessData aclAccessConfigMap = AclUtils.getYamlDataObject(aclFileName, PlainAccessData.class);
            List<PlainAccessConfig> accounts = aclAccessConfigMap.getAccounts();
            if (null != accounts) {
                for (PlainAccessConfig account : accounts) {
```

### DataFlowIssue
Argument `ctx` might be null
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/processor/DefaultRequestProcessor.java`
#### Snippet
```java
                return this.wipeWritePermOfBroker(ctx, request);
            case RequestCode.ADD_WRITE_PERM_OF_BROKER:
                return this.addWritePermOfBroker(ctx, request);
            case RequestCode.GET_ALL_TOPIC_LIST_FROM_NAMESERVER:
                return this.getAllTopicListFromNameserver(ctx, request);
```

### DataFlowIssue
Argument `ctx` might be null
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/processor/DefaultRequestProcessor.java`
#### Snippet
```java
                return this.addWritePermOfBroker(ctx, request);
            case RequestCode.GET_ALL_TOPIC_LIST_FROM_NAMESERVER:
                return this.getAllTopicListFromNameserver(ctx, request);
            case RequestCode.DELETE_TOPIC_IN_NAMESRV:
                return this.deleteTopicInNamesrv(ctx, request);
```

### DataFlowIssue
Method invocation `iterator` may produce `NullPointerException`
in `filter/src/main/java/org/apache/rocketmq/filter/expression/UnaryExpression.java`
#### Snippet
```java

                int count = 0;
                for (Iterator i = inList.iterator(); i.hasNext(); ) {
                    Object o = (Object) i.next();
                    if (count != 0) {
```

### DataFlowIssue
Result of 'min' is the same as the first argument making the call meaningless
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java

        if (curPos < toRet)
            for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
                try {
                    curChar = inputStream.readChar();
```

### DataFlowIssue
Casting `lv` to `String` will produce `ClassCastException` for any non-null value
in `filter/src/main/java/org/apache/rocketmq/filter/expression/ComparisonExpression.java`
#### Snippet
```java
                if (lc == Boolean.class) {
                    if (convertStringExpressions && rc == String.class) {
                        lv = Boolean.valueOf((String) lv).booleanValue();
                    } else {
                        return -1;
```

### DataFlowIssue
Variable is already assigned to this value
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
                break;
            case ResponseCode.PULL_NOT_FOUND:
                pullStatus = PullStatus.NO_NEW_MSG;
                break;
            case ResponseCode.PULL_RETRY_IMMEDIATELY:
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `broker/src/main/java/org/apache/rocketmq/broker/filter/ExpressionForRetryMessageFilter.java`
#### Snippet
```java
                tempProperties = MessageDecoder.decodeProperties(msgBuffer);
            }
            String realTopic = tempProperties.get(MessageConst.PROPERTY_RETRY_TOPIC);
            String group = subscriptionData.getTopic().substring(MixAll.RETRY_GROUP_TOPIC_PREFIX.length());
            realFilterData = this.consumerFilterManager.get(realTopic, group);
```

### DataFlowIssue
Result of 'min' is the same as the second argument making the call meaningless
in `broker/src/main/java/org/apache/rocketmq/broker/offset/ConsumerOffsetManager.java`
#### Snippet
```java
                        Long offset = queueMinOffset.get(entry.getKey());
                        if (offset == null) {
                            queueMinOffset.put(entry.getKey(), Math.min(Long.MAX_VALUE, entry.getValue()));
                        } else {
                            queueMinOffset.put(entry.getKey(), Math.min(entry.getValue(), offset));
```

### DataFlowIssue
Variable is already assigned to this value
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
                        //actually, we need do nothing, but keep the code structure here
                        if (code == ResponseCode.PULL_OFFSET_MOVED) {
                            responseCode = ResponseCode.PULL_OFFSET_MOVED;
                            nextBeginOffset = maxOffset;
                        } else {
```

### DataFlowIssue
Variable is already assigned to this value
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
                        } else {
                            //maybe current broker is the slave
                            responseCode = code;
                        }
                    } else if (requestOffset < minOffset) {
```

### DataFlowIssue
Variable is already assigned to this value
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
                        responseCode = ResponseCode.PULL_RETRY_IMMEDIATELY;
                    } else {
                        responseCode = code;
                    }
                }
```

### DataFlowIssue
Variable is already assigned to this value
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
                    } else {
                        //let it go
                        responseCode = code;
                    }
                }
```

### DataFlowIssue
Variable is already assigned to this value
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
                        }
                    } else {
                        responseCode = code;
                    }
                }
```

### DataFlowIssue
Variable is already assigned to this value
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/TransactionalMessageBridge.java`
#### Snippet
```java
                case NO_MESSAGE_IN_QUEUE:
                case OFFSET_OVERFLOW_ONE:
                    pullStatus = PullStatus.NO_NEW_MSG;
                    LOGGER.warn("No new message. GetMessageStatus={}, topic={}, groupId={}, requestOffset={}",
                        getMessageResult.getStatus(), topic, group, offset);
```

### DataFlowIssue
Variable is already assigned to this value
in `example/src/main/java/org/apache/rocketmq/example/benchmark/TransactionProducer.java`
#### Snippet
```java
                            success = sendResult != null && sendResult.getSendStatus() == SendStatus.SEND_OK;
                        } catch (Throwable e) {
                            success = false;
                        } finally {
                            final long currentRT = System.currentTimeMillis() - beginTimestamp;
```

### DataFlowIssue
Dereference of `cmd` may produce `NullPointerException`
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/RemotingCommand.java`
#### Snippet
```java
            byteBuffer.readBytes(bodyData);
        }
        cmd.body = bodyData;

        return cmd;
```

### DataFlowIssue
Argument `msg` might be null
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/LocalMessageCache.java`
#### Snippet
```java

                try {
                    rocketmqPullConsumer.sendMessageBack(msg, 3);
                    log.info("Send expired msg back. topic={}, msgId={}, storeHost={}, queueId={}, queueOffset={}",
                        msg.getTopic(), msg.getMsgId(), msg.getStoreHost(), msg.getQueueId(), msg.getQueueOffset());
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `srvutil/src/main/java/org/apache/rocketmq/srvutil/AclFileWatchService.java`
#### Snippet
```java
        }
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getAbsolutePath();
            File f = new File(fileName);
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/org/apache/rocketmq/common/ServiceState.java`
#### Snippet
```java
     * Service Start failure
     */
    START_FAILED;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/Type.java`
#### Snippet
```java
    OPERATOR,
    PARENTHESIS,
    SEPAERATOR;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/sysmessage/HeartbeatType.java`
#### Snippet
```java
public enum HeartbeatType {
    REGISTER,
    UNREGISTER;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `store/src/main/java/org/apache/rocketmq/store/config/BrokerRole.java`
#### Snippet
```java
    ASYNC_MASTER,
    SYNC_MASTER,
    SLAVE;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `client/src/main/java/org/apache/rocketmq/client/consumer/store/ReadOffsetType.java`
#### Snippet
```java
     * From memory,then from storage
     */
    MEMORY_FIRST_THEN_STORE;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `client/src/main/java/org/apache/rocketmq/client/consumer/listener/ConsumeOrderlyStatus.java`
#### Snippet
```java
     * Suspend current queue a moment
     */
    SUSPEND_CURRENT_QUEUE_A_MOMENT;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `client/src/main/java/org/apache/rocketmq/client/consumer/listener/ConsumeConcurrentlyStatus.java`
#### Snippet
```java
     * Failure consumption,later try to consume
     */
    RECONSUME_LATER;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `acl/src/main/java/org/apache/rocketmq/acl/common/SigningAlgorithm.java`
#### Snippet
```java
    HmacSHA1,
    HmacSHA256,
    HmacMD5;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/RemotingCommandType.java`
#### Snippet
```java
public enum RemotingCommandType {
    REQUEST_COMMAND,
    RESPONSE_COMMAND;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/route/MessageQueueRouteState.java`
#### Snippet
```java
    Normal,
    WriteOnly,
    ;
}

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary empty string argument
in `acl/src/main/java/org/apache/rocketmq/acl/common/AclUtils.java`
#### Snippet
```java
    public static byte[] combineRequestContent(RemotingCommand request, SortedMap<String, String> fieldsMap) {
        try {
            StringBuilder sb = new StringBuilder("");
            for (Map.Entry<String, String> entry : fieldsMap.entrySet()) {
                if (!SessionCredentials.SIGNATURE.equals(entry.getKey())) {
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `filter/src/main/java/org/apache/rocketmq/filter/parser/TokenMgrError.java`
#### Snippet
```java
                    if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                        String s = "0000" + Integer.toString(ch, 16);
                        retval.append("\\u" + s.substring(s.length() - 4, s.length()));
                    } else {
                        retval.append(ch);
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `filter/src/main/java/org/apache/rocketmq/filter/parser/ParseException.java`
#### Snippet
```java
                    if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                        String s = "0000" + Integer.toString(ch, 16);
                        retval.append("\\u" + s.substring(s.length() - 4, s.length()));
                    } else {
                        retval.append(ch);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'CONSUME_FROM_MAX_OFFSET' is still used
in `common/src/main/java/org/apache/rocketmq/common/consumer/ConsumeFromWhere.java`
#### Snippet
```java
    CONSUME_FROM_MIN_OFFSET,
    @Deprecated
    CONSUME_FROM_MAX_OFFSET,
    CONSUME_FROM_FIRST_OFFSET,
    CONSUME_FROM_TIMESTAMP,
```

### DeprecatedIsStillUsed
Deprecated member 'CONSUME_FROM_MIN_OFFSET' is still used
in `common/src/main/java/org/apache/rocketmq/common/consumer/ConsumeFromWhere.java`
#### Snippet
```java
    CONSUME_FROM_LAST_OFFSET_AND_FROM_MIN_WHEN_BOOT_FIRST,
    @Deprecated
    CONSUME_FROM_MIN_OFFSET,
    @Deprecated
    CONSUME_FROM_MAX_OFFSET,
```

### DeprecatedIsStillUsed
Deprecated member 'CONSUME_FROM_LAST_OFFSET_AND_FROM_MIN_WHEN_BOOT_FIRST' is still used
in `common/src/main/java/org/apache/rocketmq/common/consumer/ConsumeFromWhere.java`
#### Snippet
```java

    @Deprecated
    CONSUME_FROM_LAST_OFFSET_AND_FROM_MIN_WHEN_BOOT_FIRST,
    @Deprecated
    CONSUME_FROM_MIN_OFFSET,
```

### DeprecatedIsStillUsed
Deprecated member 'recoverAbnormally' is still used
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java

    @Deprecated
    public void recoverAbnormally(long maxPhyOffsetOfConsumeQueue) {
        // recover by the minimum time stamp
        boolean checkCRCOnRecover = this.defaultMessageStore.getMessageStoreConfig().isCheckCRCOnRecover();
```

### DeprecatedIsStillUsed
Deprecated member 'GROUP_GET_FALL_SIZE' is still used
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
    public static final String INNER_RT = "INNER_RT";

    @Deprecated public static final String GROUP_GET_FALL_SIZE = Stats.GROUP_GET_FALL_SIZE;
    @Deprecated public static final String GROUP_GET_FALL_TIME = Stats.GROUP_GET_FALL_TIME;
    // Pull Message Latency
```

### DeprecatedIsStillUsed
Deprecated member 'GROUP_GET_FALL_TIME' is still used
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java

    @Deprecated public static final String GROUP_GET_FALL_SIZE = Stats.GROUP_GET_FALL_SIZE;
    @Deprecated public static final String GROUP_GET_FALL_TIME = Stats.GROUP_GET_FALL_TIME;
    // Pull Message Latency
    @Deprecated public static final String GROUP_GET_LATENCY = Stats.GROUP_GET_LATENCY;
```

### DeprecatedIsStillUsed
Deprecated member 'getConsumeStatus' is still used
in `client/src/main/java/org/apache/rocketmq/client/impl/ClientRemotingProcessor.java`
#### Snippet
```java

    @Deprecated
    public RemotingCommand getConsumeStatus(ChannelHandlerContext ctx,
        RemotingCommand request) throws RemotingCommandException {
        final RemotingCommand response = RemotingCommand.createResponseCommand(null);
```

### DeprecatedIsStillUsed
Deprecated member 'computePullFromWhere' is still used
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
     */
    @Deprecated
    public abstract long computePullFromWhere(final MessageQueue mq);

    public abstract long computePullFromWhereWithException(final MessageQueue mq) throws MQClientException;
```

### DeprecatedIsStillUsed
Deprecated member 'uploadFilterClassToAllFilterServer' is still used
in `client/src/main/java/org/apache/rocketmq/client/impl/factory/MQClientInstance.java`
#### Snippet
```java
     */
    @Deprecated
    private void uploadFilterClassToAllFilterServer(final String consumerGroup, final String fullClassName,
        final String topic,
        final String filterClassSource) {
```

### DeprecatedIsStillUsed
Deprecated member 'DefaultMQPullConsumerImpl' is still used
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPullConsumerImpl.java`
#### Snippet
```java
 */
@Deprecated
public class DefaultMQPullConsumerImpl implements MQConsumerInner {
    private static final Logger log = LoggerFactory.getLogger(DefaultMQPullConsumerImpl.class);
    private final DefaultMQPullConsumer defaultMQPullConsumer;
```

### DeprecatedIsStillUsed
Deprecated member 'setBrokerSuspendMaxTimeMillis' is still used
in `client/src/main/java/org/apache/rocketmq/client/consumer/DefaultMQPullConsumer.java`
#### Snippet
```java
     */
    @Deprecated
    public void setBrokerSuspendMaxTimeMillis(long brokerSuspendMaxTimeMillis) {
        this.brokerSuspendMaxTimeMillis = brokerSuspendMaxTimeMillis;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'TransactionCheckListener' is still used
in `client/src/main/java/org/apache/rocketmq/client/producer/TransactionCheckListener.java`
#### Snippet
```java
 */
@Deprecated
public interface TransactionCheckListener {
    LocalTransactionState checkLocalTransactionState(final MessageExt msg);
}
```

### DeprecatedIsStillUsed
Deprecated member 'setTransactionCheckListener' is still used
in `client/src/main/java/org/apache/rocketmq/client/producer/TransactionMQProducer.java`
#### Snippet
```java
     */
    @Deprecated
    public void setTransactionCheckListener(TransactionCheckListener transactionCheckListener) {
        this.transactionCheckListener = transactionCheckListener;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'LocalTransactionExecuter' is still used
in `client/src/main/java/org/apache/rocketmq/client/producer/LocalTransactionExecuter.java`
#### Snippet
```java
 */
@Deprecated
public interface LocalTransactionExecuter {
    LocalTransactionState executeLocalTransactionBranch(final Message msg, final Object arg);
}
```

### DeprecatedIsStillUsed
Deprecated member 'checkListener' is still used
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
    @Override
    @Deprecated
    public TransactionCheckListener checkListener() {
        if (this.defaultMQProducer instanceof TransactionMQProducer) {
            TransactionMQProducer producer = (TransactionMQProducer) defaultMQProducer;
```

### DeprecatedIsStillUsed
Deprecated member 'getAclConfigVersion' is still used
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     */
    @Deprecated
    String getAclConfigVersion();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'dataVersion' is still used
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java

    @Deprecated
    private final DataVersion dataVersion = new DataVersion();

    private List<String> fileList = new ArrayList<>();
```

### DeprecatedIsStillUsed
Deprecated member 'getAclConfigDataVersion' is still used
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java

    @Deprecated
    public String getAclConfigDataVersion() {
        return this.dataVersion.toJson();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'aclConfigDataVersion' is still used
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/body/ClusterAclVersionInfo.java`
#### Snippet
```java

    @Deprecated
    private DataVersion aclConfigDataVersion;

    private Map<String, DataVersion> allAclConfigDataVersion;
```

### DeprecatedIsStillUsed
Deprecated member 'GetConsumerStatusBody' is still used
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/body/GetConsumerStatusBody.java`
#### Snippet
```java

@Deprecated
public class GetConsumerStatusBody extends RemotingSerializable {
    private Map<MessageQueue, Long> messageQueueTable = new HashMap<>();
    private Map<String, Map<MessageQueue, Long>> consumerTable =
```

### DeprecatedIsStillUsed
Deprecated member 'fileCurrentHash' is still used
in `srvutil/src/main/java/org/apache/rocketmq/srvutil/AclFileWatchService.java`
#### Snippet
```java
    private int aclFilesNum;
    @Deprecated
    private final Map<String, String> fileCurrentHash;
    private Map<String, Long> fileLastModifiedTime;
    private List<String/**absolute pathname **/> fileList = new ArrayList<>();
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `openmessaging/src/main/java/io/openmessaging/rocketmq/utils/OMSUtil.java`
#### Snippet
```java
     */
    public static String buildInstanceName() {
        return Integer.toString(UtilAll.getPid()) + "%OpenMessaging" + "%" + System.nanoTime();
    }

```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQAdminImpl.java`
#### Snippet
```java
                                        RemotingCommand response = responseFuture.getResponseCommand();
                                        if (response != null) {
                                            switch (response.getCode()) {
                                                case ResponseCode.SUCCESS: {
                                                    QueryMessageResponseHeader responseHeader = null;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            RemotingCommand response = this.remotingClient
                .invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr), request, timeoutMillis);
            switch (response.getCode()) {
                case ResponseCode.SUCCESS: {
                    return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return true;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(null, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                GetEarliestMsgStoretimeResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        assert response != null;

        switch (response.getCode()) {
            case ResponseCode.SUCCESS:
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(null, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            .invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), brokerAddr), request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                QuerySubscriptionResponseBody subscriptionResponseBody =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            .invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), brokerAddr), request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return ConsumerConnection.decode(response.getBody(), ConsumerConnection.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            .invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), brokerAddr), request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return RemotingSerializable.decode(response.getBody(), SubscriptionGroupConfig.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr), request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                if (response.getBody() != null) {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return true;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        assert response != null;

        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return HARuntimeInfo.decode(response.getBody(), HARuntimeInfo.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                RemotingCommand response = this.remotingClient.invokeSync(namesrvAddr, request, timeoutMillis);
                assert response != null;
                switch (response.getCode()) {
                    case ResponseCode.SUCCESS: {
                        break;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            RemotingCommand response = this.remotingClient.invokeSync(nameServer, request, timeoutMillis);
            assert response != null;
            switch (response.getCode()) {
                case ResponseCode.SUCCESS: {
                    break;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                ConsumeStats consumeStats = ConsumeStats.decode(response.getBody(), ConsumeStats.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            RemotingCommand response = this.remotingClient
                .invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr), request, timeoutMillis);
            switch (response.getCode()) {
                case ResponseCode.SUCCESS: {
                    return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                if (response.getBody() != null) {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                GetMinOffsetResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                RemotingCommand response = this.remotingClient.invokeSync(namesrvAddr, request, timeoutMillis);
                assert response != null;
                switch (response.getCode()) {
                    case ResponseCode.SUCCESS: {
                        break;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                SearchOffsetResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr), request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                GetBrokerAclConfigResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return ProducerTableInfo.decode(response.getBody(), ProducerTableInfo.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(null, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                if (response.getBody() != null) {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return MixAll.string2Properties(new String(response.getBody(), MixAll.DEFAULT_CHARSET));
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(null, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return ClusterInfo.decode(response.getBody(), ClusterInfo.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(null, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return KVTable.decode(response.getBody(), KVTable.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            RemotingCommand response = this.remotingClient.invokeSync(controller, request, timeoutMillis);
            assert response != null;
            switch (response.getCode()) {
                case ResponseCode.SUCCESS: {
                    break;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        final RemotingCommand response = this.remotingClient.invokeSync(leaderAddress, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                if (response.getBody() != null) {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(null, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                GetKVConfigResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(nameSrvAddr, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                AddWritePermOfBrokerResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(null, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return KVTable.decode(response.getBody(), KVTable.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(null, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                GetMaxOffsetResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(null, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(namesrvAddr, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                WipeWritePermOfBrokerResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return response.getVersion();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(leaderAddress, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return RemotingSerializable.decode(response.getBody(), BrokerReplicasInfo.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                QueryConsumeTimeSpanBody consumeTimeSpanBody = GroupList.decode(response.getBody(), QueryConsumeTimeSpanBody.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                GroupList groupList = GroupList.decode(response.getBody(), GroupList.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                QueryAssignmentResponseBody queryAssignmentResponseBody = QueryAssignmentResponseBody.decode(response.getBody(), QueryAssignmentResponseBody.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                TopicStatsTable topicStatsTable = TopicStatsTable.decode(response.getBody(), TopicStatsTable.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                ByteBuffer byteBuffer = ByteBuffer.wrap(response.getBody());
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return RemotingSerializable.decode(response.getBody(), GroupForbidden.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return ProducerConnection.decode(response.getBody(), ProducerConnection.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        final RemotingCommand response = this.remotingClient.invokeSync(brokerAddr, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return RemotingSerializable.decode(response.getBody(), EpochEntryCache.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                if (response.getBody() != null) {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        final RemotingCommand response = this.remotingClient.invokeSync(leaderAddress, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                BrokerMemberGroup brokerMemberGroup = RemotingSerializable.decode(response.getBody(), BrokerMemberGroup.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        assert response != null;

        switch (response.getCode()) {
            case ResponseCode.SUCCESS:
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return true;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            .invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), brokerAddr), request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return SubscriptionGroupWrapper.decode(response.getBody(), SubscriptionGroupWrapper.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return TopicConfigSerializeWrapper.decode(response.getBody(), TopicConfigSerializeWrapper.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                SearchOffsetResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return true;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                LockBatchResponseBody responseBody = LockBatchResponseBody.decode(response.getBody(), LockBatchResponseBody.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            request, timeoutMillis);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(brokerAddr, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(this.clientConfig.isVipChannelEnabled(), addr),
            request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                TopicList topicList = TopicList.decode(response.getBody(), TopicList.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        request.setBody(classBody);
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, timeoutMillis);
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has only 'default' case
in `filter/src/main/java/org/apache/rocketmq/filter/parser/Token.java`
#### Snippet
```java
     */
    public static Token newToken(int ofKind, String image) {
        switch (ofKind) {
            default:
                return new Token(ofKind, image);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                        left = ComparisonExpression.createNotBetween(left, low, high);
                    } else {
                        switch ((jjNtk == -1) ? jj_ntk() : jjNtk) {
                            case IN:
                                jj_consume_token(IN);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                                label_5:
                                while (true) {
                                    switch ((jjNtk == -1) ? jj_ntk() : jjNtk) {
                                        case 29:
                                            break;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                                    label_6:
                                    while (true) {
                                        switch ((jjNtk == -1) ? jj_ntk() : jjNtk) {
                                            case 29:
                                                break;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        label_1:
        while (true) {
            switch ((jjNtk == -1) ? jj_ntk() : jjNtk) {
                case OR:
                    break;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        label_2:
        while (true) {
            switch ((jjNtk == -1) ? jj_ntk() : jjNtk) {
                case AND:
                    break;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                        left = ComparisonExpression.createIsNull(left);
                    } else {
                        switch ((jjNtk == -1) ? jj_ntk() : jjNtk) {
                            case IS:
                                jj_consume_token(IS);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java

    private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2) {
        switch (hiByte) {
            case 0:
                return (JJ_BIT_VEC_2[i2] & l2) != 0L;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(null, request, 3_000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return ClusterInfo.decode(response.getBody(), ClusterInfo.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(namesrvAddr, request, timeoutMills);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                RegisterBrokerResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(namesrvAddr, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return ConsumerOffsetSerializeWrapper.decode(response.getBody(), ConsumerOffsetSerializeWrapper.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(true, addr), request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return TimerCheckpoint.decode(ByteBuffer.wrap(response.getBody()));
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(true, addr), request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return TopicConfigSerializeWrapper.decode(response.getBody(), TopicConfigAndMappingSerializeWrapper.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return MessageRequestModeSerializeWrapper.decode(response.getBody(), MessageRequestModeSerializeWrapper.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        final RemotingCommand response = this.remotingClient.invokeSync(controllerAddress, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case SUCCESS: {
                assert response.getBody() != null;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return new String(response.getBody(), MixAll.DEFAULT_CHARSET);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(masterBrokerAddr, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                ExchangeHAInfoResponseHeader responseHeader = (ExchangeHAInfoResponseHeader) response.decodeCommandCustomHeader(ExchangeHAInfoResponseHeader.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(MixAll.brokerVIPChannel(true, addr), request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return TimerMetrics.TimerMetricsSerializeWrapper.decode(response.getBody(), TimerMetrics.TimerMetricsSerializeWrapper.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        assert response != null;

        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                GetMinOffsetResponseHeader responseHeader = (GetMinOffsetResponseHeader) response.decodeCommandCustomHeader(GetMinOffsetResponseHeader.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                GetMaxOffsetResponseHeader responseHeader = (GetMaxOffsetResponseHeader) response.decodeCommandCustomHeader(GetMaxOffsetResponseHeader.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(addr, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return SubscriptionGroupWrapper.decode(response.getBody(), SubscriptionGroupWrapper.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        final RemotingCommand response = this.remotingClient.invokeSync(controllerAddress, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case SUCCESS: {
                final GetReplicaInfoResponseHeader header = (GetReplicaInfoResponseHeader) response.decodeCommandCustomHeader(GetReplicaInfoResponseHeader.class);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
                            DataVersion nameServerDataVersion = null;
                            Boolean changed = false;
                            switch (response.getCode()) {
                                case ResponseCode.SUCCESS: {
                                    QueryDataVersionResponseHeader queryDataVersionResponseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        assert response != null;

        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                byte[] body = response.getBody();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java

        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/client/net/Broker2Client.java`
#### Snippet
```java
                        this.brokerController.getRemotingServer().invokeSync(entry.getKey(), request, 5000);
                    assert response != null;
                    switch (response.getCode()) {
                        case ResponseCode.SUCCESS: {
                            if (response.getBody() != null) {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PeekMessageProcessor.java`
#### Snippet
```java
        responseHeader.setRestNum(restNum);
        response.setRemark(getMessageResult.getStatus().name());
        switch (response.getCode()) {
            case ResponseCode.SUCCESS:

```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/processor/ReplyMessageProcessor.java`
#### Snippet
```java
                    RemotingCommand pushResponse = this.brokerController.getBroker2Client().callClient(channel, request);
                    assert pushResponse != null;
                    switch (pushResponse.getCode()) {
                        case ResponseCode.SUCCESS: {
                            pushReplyResult.setPushOk(true);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AbstractSendMessageProcessor.java`
#### Snippet
```java
            String commercialOwner = request.getExtFields().get(BrokerStatsManager.COMMERCIAL_OWNER);

            switch (putMessageResult.getPutMessageStatus()) {
                case PUT_OK:
                    String backTopic = msgExt.getTopic();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/processor/SendMessageProcessor.java`
#### Snippet
```java
        RemotingCommand request) throws RemotingCommandException {
        SendMessageContext sendMessageContext;
        switch (request.getCode()) {
            case RequestCode.CONSUMER_SEND_MSG_BACK:
                return this.consumerSendMsgBack(ctx, request);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
            }
            finalResponse.setRemark(getMessageResult.getStatus().name());
            switch (finalResponse.getCode()) {
                case ResponseCode.SUCCESS:
                    if (this.brokerController.getBrokerConfig().isTransferMsgByHeap()) {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
        boolean isC = false;
        LanguageCode language = request.getLanguage();
        switch (language) {
            case CPP:
                isC = true;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/TieredDispatcher.java`
#### Snippet
```java
                if (storeConfig.isMessageIndexEnable() && result == AppendResult.SUCCESS) {
                    result = container.appendIndexFile(request);
                    switch (result) {
                        case SUCCESS:
                            Long count = ifMetricsMap.computeIfAbsent(messageQueue, key -> 0L);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/TieredMessageFetcher.java`
#### Snippet
```java
            readConsumeQueueFuture = container.readConsumeQueue(queueOffset, batchSize);
        } catch (TieredStoreException e) {
            switch (e.getErrorCode()) {
                case NO_NEW_DATA:
                    result.setStatus(GetMessageStatus.OFFSET_OVERFLOW_ONE);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
        RemotingCommand responseCommand = this.remotingClient.invokeSync(addr, requestCommand, timeoutMillis);
        assert responseCommand != null;
        switch (responseCommand.getCode()) {
            case ResponseCode.SUCCESS: {
                UpdateConsumerOffsetResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
        RemotingCommand responseCommand = this.remotingClient.invokeSync(addr, requestCommand, timeoutMillis);
        assert responseCommand != null;
        switch (responseCommand.getCode()) {
            case ResponseCode.SUCCESS: {
                GetMaxOffsetResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
        RemotingCommand responseCommand = this.remotingClient.invokeSync(addr, requestCommand, timeoutMillis);
        assert responseCommand != null;
        switch (responseCommand.getCode()) {
            case ResponseCode.SUCCESS: {
                GetMinOffsetResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
        RemotingCommand responseCommand = this.remotingClient.invokeSync(addr, requestCommand, timeoutMillis);
        assert responseCommand != null;
        switch (responseCommand.getCode()) {
            case ResponseCode.SUCCESS: {
                SearchOffsetResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
        RemotingCommand responseCommand = this.remotingClient.invokeSync(addr, requestCommand, timeoutMillis);
        assert responseCommand != null;
        switch (responseCommand.getCode()) {
            case ResponseCode.SUCCESS: {
                GetEarliestMsgStoretimeResponseHeader responseHeader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
        RemotingCommand responseCommand = this.remotingClient.invokeSync(addr, requestCommand, timeoutMillis);
        assert responseCommand != null;
        switch (responseCommand.getCode()) {
            case ResponseCode.SUCCESS: {
                rpcResponsePromise.setSuccess(new RpcResponse(ResponseCode.SUCCESS, null, RemotingSerializable.decode(responseCommand.getBody(), bodyClass)));
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `openmessaging/src/main/java/io/openmessaging/rocketmq/consumer/PullConsumerImpl.java`
#### Snippet
```java
                    ProcessQueue pq = rocketmqPullConsumer.getDefaultMQPullConsumerImpl().getRebalanceImpl()
                        .getProcessQueueTable().get(mq);
                    switch (pullResult.getPullStatus()) {
                        case FOUND:
                            if (pq != null) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
            List<PlainAccessData.DataVersion> dataVersions = plainAclConfData.getDataVersion();
            DataVersion dataVersion = new DataVersion();
            if (dataVersions != null && !dataVersions.isEmpty()) {
                DataVersion firstElement = new DataVersion();
                firstElement.setCounter(new AtomicLong(dataVersions.get(0).getCounter()));
                firstElement.setTimestamp(dataVersions.get(0).getTimestamp());
                dataVersion.assignNewOne(firstElement);
            }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerStartup.java`
#### Snippet
```java
            @Override
            public void run() {
                synchronized (this) {
                    log.info("Shutdown hook was invoked, {}", this.shutdownTimes.incrementAndGet());
                    if (!this.hasShutdown) {
                        this.hasShutdown = true;
                        long beginTime = System.currentTimeMillis();
                        brokerController.shutdown();
                        long consumingTimeTotal = System.currentTimeMillis() - beginTime;
                        log.info("Shutdown hook over, consuming total time(ms): {}", consumingTimeTotal);
                    }
                }
            }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerStartup.java`
#### Snippet
```java
        if (properties == null) {
            return;
        }
        String rmqAddressServerDomain = properties.getProperty("rmqAddressServerDomain", MixAll.WS_DOMAIN_NAME);
        String rmqAddressServerSubGroup = properties.getProperty("rmqAddressServerSubGroup", MixAll.WS_DOMAIN_SUBGROUP);
        System.setProperty("rocketmq.namesrv.domain", rmqAddressServerDomain);
        System.setProperty("rocketmq.namesrv.domain.subgroup", rmqAddressServerSubGroup);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/filter/ExpressionForRetryMessageFilter.java`
#### Snippet
```java
        Object ret = null;
        try {
            MessageEvaluationContext context = new MessageEvaluationContext(tempProperties);

            ret = realFilterData.getCompiledExpression().evaluate(context);
        } catch (Throwable e) {
            log.error("Message Filter error, " + realFilterData + ", " + tempProperties, e);
        }

        log.debug("Pull eval result: {}, {}, {}", ret, realFilterData, tempProperties);

        if (ret == null || !(ret instanceof Boolean)) {
            return false;
        }

        return (Boolean) ret;
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/latency/BrokerFastFailure.java`
#### Snippet
```java
                    final Runnable runnable = blockingQueue.peek();
                    if (null == runnable) {
                        break;
                    }
                    final RequestTask rt = castRunnable(runnable);
                    if (rt == null || rt.isStopRun()) {
                        break;
                    }

                    final long behind = System.currentTimeMillis() - rt.getCreateTimestamp();
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/metrics/BrokerMetricsManager.java`
#### Snippet
```java
        if (brokerConfig == null) {
            return false;
        }
        BrokerConfig.MetricsExporterType exporterType = brokerConfig.getMetricsExporterType();
        if (!exporterType.isEnable()) {
            return false;
        }

        switch (exporterType) {
            case OTLP_GRPC:
                return StringUtils.isNotBlank(brokerConfig.getMetricsGrpcExporterTarget());
            case PROM:
                return true;
            case LOG:
                return true;
        }
        return false;
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/metrics/BrokerMetricsManager.java`
#### Snippet
```java
            String endpoint = brokerConfig.getMetricsGrpcExporterTarget();
            if (!endpoint.startsWith("http")) {
                endpoint = "https://" + endpoint;
            }
            OtlpGrpcMetricExporterBuilder metricExporterBuilder = OtlpGrpcMetricExporter.builder()
                .setEndpoint(endpoint)
                .setTimeout(brokerConfig.getMetricGrpcExporterTimeOutInMills(), TimeUnit.MILLISECONDS)
                .setAggregationTemporalitySelector(type -> {
                    if (brokerConfig.isMetricsInDelta() &&
                        (type == InstrumentType.COUNTER || type == InstrumentType.OBSERVABLE_COUNTER || type == InstrumentType.HISTOGRAM)) {
                        return AggregationTemporality.DELTA;
                    }
                    return AggregationTemporality.CUMULATIVE;
                });

            String headers = brokerConfig.getMetricsGrpcExporterHeader();
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/metrics/BrokerMetricsManager.java`
#### Snippet
```java
        if (metricsExporterType == BrokerConfig.MetricsExporterType.LOG) {
            SLF4JBridgeHandler.removeHandlersForRootLogger();
            SLF4JBridgeHandler.install();
            loggingMetricExporter = LoggingMetricExporter.create(brokerConfig.isMetricsInDelta() ? AggregationTemporality.DELTA : AggregationTemporality.CUMULATIVE);
            java.util.logging.Logger.getLogger(LoggingMetricExporter.class.getName()).setLevel(java.util.logging.Level.FINEST);
            periodicMetricReader = PeriodicMetricReader.builder(loggingMetricExporter)
                .setInterval(brokerConfig.getMetricLoggingExporterIntervalInMills(), TimeUnit.MILLISECONDS)
                .build();
            providerBuilder.registerMetricReader(periodicMetricReader);
        }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/metrics/BrokerMetricsManager.java`
#### Snippet
```java
        if (brokerConfig.getMetricsExporterType() == BrokerConfig.MetricsExporterType.OTLP_GRPC) {
            periodicMetricReader.forceFlush();
            periodicMetricReader.shutdown();
            metricExporter.shutdown();
        }
        if (brokerConfig.getMetricsExporterType() == BrokerConfig.MetricsExporterType.PROM) {
            prometheusHttpServer.forceFlush();
            prometheusHttpServer.shutdown();
        }
        if (brokerConfig.getMetricsExporterType() == BrokerConfig.MetricsExporterType.LOG) {
            periodicMetricReader.forceFlush();
            periodicMetricReader.shutdown();
            loggingMetricExporter.shutdown();
        }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/metrics/ConsumerLagCalculator.java`
#### Snippet
```java
        long consumerOffset = offsetManager.queryOffset(group, topic, queueId);
        if (consumerOffset < 0) {
            consumerOffset = brokerOffset;
        }

        long lag = calculateMessageCount(group, topic, queueId, consumerOffset, brokerOffset);
        long consumerStoreTimeStamp = getStoreTimeStamp(topic, queueId, consumerOffset);
        return new Pair<>(lag, consumerStoreTimeStamp);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/offset/BroadcastOffsetStore.java`
#### Snippet
```java
        AtomicLong offsetOld = this.offsetTable.get(queueId);
        if (null == offsetOld) {
            offsetOld = this.offsetTable.putIfAbsent(queueId, new AtomicLong(offset));
        }

        if (null != offsetOld) {
            if (increaseOnly) {
                MixAll.compareAndIncreaseOnly(offsetOld, offset);
            } else {
                offsetOld.set(offset);
            }
        }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/offset/ConsumerOrderInfoManager.java`
#### Snippet
```java
        String key = buildKey(topic, group);
        ConcurrentHashMap<Integer/*queueId*/, OrderInfo> qs = table.get(key);
        if (qs == null) {
            qs = new ConcurrentHashMap<>(16);
            ConcurrentHashMap<Integer/*queueId*/, OrderInfo> old = table.putIfAbsent(key, qs);
            if (old != null) {
                qs = old;
            }
        }

        OrderInfo orderInfo = qs.get(queueId);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        RemotingCommand response = this.remotingClient.invokeSync(namesrvAddr, request, 3000);
        assert response != null;
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                return;
            }
            default:
                break;
        }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        PullMessageRequestHeader requestHeader = new PullMessageRequestHeader();
        requestHeader.setConsumerGroup(consumerGroup);
        requestHeader.setTopic(topic);
        requestHeader.setQueueId(queueId);
        requestHeader.setQueueOffset(offset);
        requestHeader.setMaxMsgNums(maxNums);
        requestHeader.setSysFlag(PullSysFlag.buildSysFlag(false, false, true, false));
        requestHeader.setCommitOffset(0L);
        requestHeader.setSuspendTimeoutMillis(0L);
        requestHeader.setSubscription(SubscriptionData.SUB_ALL);
        requestHeader.setSubVersion(System.currentTimeMillis());
        requestHeader.setMaxMsgBytes(Integer.MAX_VALUE);
        requestHeader.setExpressionType(ExpressionType.TAG);
        requestHeader.setBname(brokerName);

        RemotingCommand request = RemotingCommand.createRequestCommand(RequestCode.PULL_MESSAGE, requestHeader);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
                String traFlag = msg.getProperty(MessageConst.PROPERTY_TRANSACTION_PREPARED);
                if (Boolean.parseBoolean(traFlag)) {
                    msg.setTransactionId(msg.getProperty(MessageConst.PROPERTY_UNIQ_CLIENT_MESSAGE_ID_KEYIDX));
                }
                MessageAccessor.putProperty(msg, MessageConst.PROPERTY_MIN_OFFSET,
                    Long.toString(pullResult.getMinOffset()));
                MessageAccessor.putProperty(msg, MessageConst.PROPERTY_MAX_OFFSET,
                    Long.toString(pullResult.getMaxOffset()));
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AckMessageProcessor.java`
#### Snippet
```java
        TopicConfig topicConfig = this.brokerController.getTopicConfigManager().selectTopicConfig(requestHeader.getTopic());
        if (null == topicConfig) {
            POP_LOGGER.error("The topic {} not exist, consumer: {} ", requestHeader.getTopic(), RemotingHelper.parseChannelRemoteAddr(channel));
            response.setCode(ResponseCode.TOPIC_NOT_EXIST);
            response.setRemark(String.format("topic[%s] not exist, apply first please! %s", requestHeader.getTopic(), FAQUrl.suggestTodo(FAQUrl.APPLY_TOPIC_URL)));
            return response;
        }

        if (requestHeader.getQueueId() >= topicConfig.getReadQueueNums() || requestHeader.getQueueId() < 0) {
            String errorInfo = String.format("queueId[%d] is illegal, topic:[%s] topicConfig.readQueueNums:[%d] consumer:[%s]",
                requestHeader.getQueueId(), requestHeader.getTopic(), topicConfig.getReadQueueNums(), channel.remoteAddress());
            POP_LOGGER.warn(errorInfo);
            response.setCode(ResponseCode.MESSAGE_ILLEGAL);
            response.setRemark(errorInfo);
            return response;
        }
        long minOffset = this.brokerController.getMessageStore().getMinOffsetInQueue(requestHeader.getTopic(), requestHeader.getQueueId());
        long maxOffset = this.brokerController.getMessageStore().getMaxOffsetInQueue(requestHeader.getTopic(), requestHeader.getQueueId());
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AckMessageProcessor.java`
#### Snippet
```java
        ackMsg.setAckOffset(requestHeader.getOffset());
        ackMsg.setStartOffset(ExtraInfoUtil.getCkQueueOffset(extraInfo));
        ackMsg.setConsumerGroup(requestHeader.getConsumerGroup());
        ackMsg.setTopic(requestHeader.getTopic());
        ackMsg.setQueueId(requestHeader.getQueueId());
        ackMsg.setPopTime(ExtraInfoUtil.getPopTime(extraInfo));
        ackMsg.setBrokerName(ExtraInfoUtil.getBrokerName(extraInfo));

        int rqId = ExtraInfoUtil.getReviveQid(extraInfo);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AckMessageProcessor.java`
#### Snippet
```java
        msgInner.setTopic(reviveTopic);
        msgInner.setBody(JSON.toJSONString(ackMsg).getBytes(DataConverter.charset));
        //msgInner.setQueueId(Integer.valueOf(extraInfo[3]));
        msgInner.setQueueId(rqId);
        msgInner.setTags(PopAckConstants.ACK_TAG);
        msgInner.setBornTimestamp(System.currentTimeMillis());
        msgInner.setBornHost(this.brokerController.getStoreHost());
        msgInner.setStoreHost(this.brokerController.getStoreHost());
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/ChangeInvisibleTimeProcessor.java`
#### Snippet
```java
        msgInner.setBody(JSON.toJSONString(ck).getBytes(DataConverter.charset));
        msgInner.setQueueId(reviveQid);
        msgInner.setTags(PopAckConstants.CK_TAG);
        msgInner.setBornTimestamp(System.currentTimeMillis());
        msgInner.setBornHost(this.brokerController.getStoreHost());
        msgInner.setStoreHost(this.brokerController.getStoreHost());
        msgInner.setDeliverTimeMs(ck.getReviveTime() - PopAckConstants.ackTimeInterval);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/DefaultPullMessageResultHandler.java`
#### Snippet
```java
                    Attributes attributes = BrokerMetricsManager.newAttributesBuilder()
                        .put(LABEL_TOPIC, requestHeader.getTopic())
                        .put(LABEL_CONSUMER_GROUP, requestHeader.getConsumerGroup())
                        .put(LABEL_IS_SYSTEM, TopicValidator.isSystemTopic(requestHeader.getTopic()) || MixAll.isSysConsumerGroup(requestHeader.getConsumerGroup()))
                        .build();
                    BrokerMetricsManager.messagesOutTotal.add(getMessageResult.getMessageCount(), attributes);
                    BrokerMetricsManager.throughputOutTotal.add(getMessageResult.getBufferTotalSize(), attributes);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/DefaultPullMessageResultHandler.java`
#### Snippet
```java
                    final long beginTimeMills = this.brokerController.getMessageStore().now();
                    final byte[] r = this.readGetMessageResult(getMessageResult, requestHeader.getConsumerGroup(), requestHeader.getTopic(), requestHeader.getQueueId());
                    this.brokerController.getBrokerStatsManager().incGroupGetLatency(requestHeader.getConsumerGroup(),
                        requestHeader.getTopic(), requestHeader.getQueueId(),
                        (int) (this.brokerController.getMessageStore().now() - beginTimeMills));
                    response.setBody(r);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/NotificationProcessor.java`
#### Snippet
```java
                if (response != null) {
                    response.setOpaque(request.getRemotingCommand().getOpaque());
                    response.markResponseType();
                    NettyRemotingAbstract.writeResponse(request.getChannel(), request.getRemotingCommand(), response, future -> {
                        if (!future.isSuccess()) {
                            POP_LOGGER.error("ProcessRequestWrapper response to {} failed", request.getChannel().remoteAddress(), future.cause());
                            POP_LOGGER.error(request.toString());
                            POP_LOGGER.error(response.toString());
                        }
                    });
                }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/NotificationProcessor.java`
#### Snippet
```java
        response.setOpaque(request.getOpaque());

        if (!PermName.isReadable(this.brokerController.getBrokerConfig().getBrokerPermission())) {
            response.setCode(ResponseCode.NO_PERMISSION);
            response.setRemark(String.format("the broker[%s] peeking message is forbidden", this.brokerController.getBrokerConfig().getBrokerIP1()));
            return response;
        }

        TopicConfig topicConfig = this.brokerController.getTopicConfigManager().selectTopicConfig(requestHeader.getTopic());
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
        TopicConfig topicConfig =
            this.brokerController.getTopicConfigManager().selectTopicConfig(requestHeader.getTopic());
        if (null == topicConfig) {
            POP_LOGGER.error("The topic {} not exist, consumer: {} ", requestHeader.getTopic(),
                RemotingHelper.parseChannelRemoteAddr(channel));
            response.setCode(ResponseCode.TOPIC_NOT_EXIST);
            response.setRemark(String.format("topic[%s] not exist, apply first please! %s", requestHeader.getTopic(),
                FAQUrl.suggestTodo(FAQUrl.APPLY_TOPIC_URL)));
            return response;
        }

        if (!PermName.isReadable(topicConfig.getPerm())) {
            response.setCode(ResponseCode.NO_PERMISSION);
            response.setRemark("the topic[" + requestHeader.getTopic() + "] peeking message is forbidden");
            return response;
        }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PeekMessageProcessor.java`
#### Snippet
```java
        SubscriptionGroupConfig subscriptionGroupConfig = this.brokerController.getSubscriptionGroupManager().findSubscriptionGroupConfig(requestHeader.getConsumerGroup());
        if (null == subscriptionGroupConfig) {
            response.setCode(ResponseCode.SUBSCRIPTION_GROUP_NOT_EXIST);
            response.setRemark(String.format("subscription group [%s] does not exist, %s", requestHeader.getConsumerGroup(), FAQUrl.suggestTodo(FAQUrl.SUBSCRIPTION_GROUP_NOT_EXIST)));
            return response;
        }

        if (!subscriptionGroupConfig.isConsumeEnable()) {
            response.setCode(ResponseCode.NO_PERMISSION);
            response.setRemark("subscription group no permission, " + requestHeader.getConsumerGroup());
            return response;
        }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/NotificationProcessor.java`
#### Snippet
```java
            TopicConfig retryTopicConfig = this.brokerController.getTopicConfigManager().selectTopicConfig(KeyBuilder.buildPopRetryTopic(requestHeader.getTopic(), requestHeader.getConsumerGroup()));
            if (retryTopicConfig != null) {
                for (int i = 0; i < retryTopicConfig.getReadQueueNums(); i++) {
                    int queueId = (randomQ + i) % retryTopicConfig.getReadQueueNums();
                    hasMsg = hasMsgFromQueue(true, requestHeader, queueId);
                    if (hasMsg) {
                        break;
                    }
                }
            }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/NotificationProcessor.java`
#### Snippet
```java
        long offset = this.brokerController.getConsumerOffsetManager().queryOffset(cid, topic, queueId);
        if (offset < 0) {
            offset = this.brokerController.getMessageStore().getMinOffsetInQueue(topic, queueId);
        }
        long bufferOffset = this.brokerController.getPopMessageProcessor().getPopBufferMergeService()
            .getLatestOffset(topic, cid, queueId);
        if (bufferOffset < 0) {
            return offset;
        } else {
            return bufferOffset > offset ? bufferOffset : offset;
        }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PeekMessageProcessor.java`
#### Snippet
```java
            TopicConfig retryTopicConfig = this.brokerController.getTopicConfigManager().selectTopicConfig(KeyBuilder.buildPopRetryTopic(requestHeader.getTopic(), requestHeader.getConsumerGroup()));
            if (retryTopicConfig != null) {
                for (int i = 0; i < retryTopicConfig.getReadQueueNums(); i++) {
                    int queueId = (randomQ + i) % retryTopicConfig.getReadQueueNums();
                    restNum = peekMsgFromQueue(true, getMessageResult, requestHeader, queueId, restNum, reviveQid, channel, popTime);
                }
            }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PeekMessageProcessor.java`
#### Snippet
```java
        final ByteBuffer byteBuffer = ByteBuffer.allocate(getMessageResult.getBufferTotalSize());

        long storeTimestamp = 0;
        try {
            List<ByteBuffer> messageBufferList = getMessageResult.getMessageBufferList();
            for (ByteBuffer bb : messageBufferList) {

                byteBuffer.put(bb);
                storeTimestamp = bb.getLong(MessageDecoder.MESSAGE_STORE_TIMESTAMP_POSITION);
            }
        } finally {
            getMessageResult.release();
        }

        this.brokerController.getBrokerStatsManager().recordDiskFallBehindTime(group, topic, queueId, this.brokerController.getMessageStore().now() - storeTimestamp);
        return byteBuffer.array();
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
            if (entry.getKey() == null) {
                continue;
            }
            String[] keyArray = entry.getKey().split(PopAckConstants.SPLIT);
            if (keyArray == null || keyArray.length != 3) {
                continue;
            }
            String topic = keyArray[0];
            String cid = keyArray[1];
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
            this.reviveQueueId = reviveQueueId;
            this.reviveQueueOffset = reviveQueueOffset;
            this.ck = point;
            this.bits = new AtomicInteger(0);
            this.toStoreBits = new AtomicInteger(0);
            this.nextBeginOffset = nextBeginOffset;
            this.lockKey = ck.getTopic() + PopAckConstants.SPLIT + ck.getCId() + PopAckConstants.SPLIT + ck.getQueueId();
            this.mergeKey = point.getTopic() + point.getCId() + point.getQueueId() + point.getStartOffset() + point.getPopTime() + point.getBrokerName();
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
            TopicConfig retryTopicConfig =
                this.brokerController.getTopicConfigManager().selectTopicConfig(KeyBuilder.buildPopRetryTopic(requestHeader.getTopic(), requestHeader.getConsumerGroup()));
            if (retryTopicConfig != null) {
                for (int i = 0; i < retryTopicConfig.getReadQueueNums(); i++) {
                    int queueId = (randomQ + i) % retryTopicConfig.getReadQueueNums();
                    getMessageFuture = getMessageFuture.thenCompose(restNum -> popMsgFromQueue(true, getMessageResult, requestHeader, queueId, restNum, reviveQid, channel, popTime, finalMessageFilter,
                        startOffsetInfo, msgOffsetInfo, finalOrderCountInfo));
                }
            }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/ReplyMessageProcessor.java`
#### Snippet
```java
        final long startTimstamp = this.brokerController.getBrokerConfig().getStartAcceptSendRequestTimeStamp();
        if (this.brokerController.getMessageStore().now() < startTimstamp) {
            response.setCode(ResponseCode.SYSTEM_ERROR);
            response.setRemark(String.format("broker unable to service, until %s", UtilAll.timeMillisToHumanString2(startTimstamp)));
            return response;
        }

        response.setCode(-1);
        super.msgCheck(ctx, requestHeader, request, response);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/ReplyMessageProcessor.java`
#### Snippet
```java
            if (!BrokerMetricsManager.isRetryOrDlqTopic(msg.getTopic())) {
                Attributes attributes = BrokerMetricsManager.newAttributesBuilder()
                    .put(LABEL_TOPIC, msg.getTopic())
                    .put(LABEL_MESSAGE_TYPE, messageType.getMetricsValue())
                    .put(LABEL_IS_SYSTEM, TopicValidator.isSystemTopic(msg.getTopic()))
                    .build();
                BrokerMetricsManager.messagesInTotal.add(putMessageResult.getAppendMessageResult().getMsgNum(), attributes);
                BrokerMetricsManager.throughputInTotal.add(putMessageResult.getAppendMessageResult().getWroteBytes(), attributes);
                BrokerMetricsManager.messageSize.record(putMessageResult.getAppendMessageResult().getWroteBytes() / putMessageResult.getAppendMessageResult().getMsgNum(), attributes);
            }
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/processor/SendMessageProcessor.java`
#### Snippet
```java
        msgInner.setBornTimestamp(requestHeader.getBornTimestamp());
        msgInner.setBornHost(ctx.channel().remoteAddress());
        msgInner.setStoreHost(this.getStoreHost());
        msgInner.setReconsumeTimes(requestHeader.getReconsumeTimes() == null ? 0 : requestHeader.getReconsumeTimes());
        String clusterName = this.brokerController.getBrokerConfig().getBrokerClusterName();
        MessageAccessor.putProperty(msgInner, MessageConst.PROPERTY_CLUSTER, clusterName);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/schedule/ScheduleMessageService.java`
#### Snippet
```java
        MessageExtBrokerInner msgInner = new MessageExtBrokerInner();
        msgInner.setBody(msgExt.getBody());
        msgInner.setFlag(msgExt.getFlag());
        MessageAccessor.setProperties(msgInner, msgExt.getProperties());

        TopicFilterType topicFilterType = MessageExt.parseTopicFilterType(msgInner.getSysFlag());
        long tagsCodeValue =
            MessageExtBrokerInner.tagsString2tagsCode(topicFilterType, msgInner.getTags());
        msgInner.setTagsCode(tagsCodeValue);
        msgInner.setPropertiesString(MessageDecoder.messageProperties2String(msgExt.getProperties()));

        msgInner.setSysFlag(msgExt.getSysFlag());
        msgInner.setBornTimestamp(msgExt.getBornTimestamp());
        msgInner.setBornHost(msgExt.getBornHost());
        msgInner.setStoreHost(msgExt.getStoreHost());
        msgInner.setReconsumeTimes(msgExt.getReconsumeTimes());

        msgInner.setWaitStoreMsgOK(false);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/slave/SlaveSynchronize.java`
#### Snippet
```java
                    ConcurrentMap<String, TopicConfig> newTopicConfigTable = topicWrapper.getTopicConfigTable();
                    //delete
                    ConcurrentMap<String, TopicConfig> topicConfigTable = this.brokerController.getTopicConfigManager().getTopicConfigTable();
                    for (Iterator<Map.Entry<String, TopicConfig>> it = topicConfigTable.entrySet().iterator(); it.hasNext(); ) {
                        Map.Entry<String, TopicConfig> item = it.next();
                        if (!newTopicConfigTable.containsKey(item.getKey())) {
                            it.remove();
                        }
                    }
                    //update
                    topicConfigTable.putAll(newTopicConfigTable);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicConfigManager.java`
#### Snippet
```java
            log.info("update topic sys flag. oldTopicSysFlag={}, newTopicSysFlag={}", oldTopicSysFlag,
                topicConfig.getTopicSysFlag());

            this.topicConfigTable.put(topic, topicConfig);

            long stateMachineVersion = brokerController.getMessageStore() != null ? brokerController.getMessageStore().getStateMachineVersion() : 0;
            dataVersion.nextVersion(stateMachineVersion);

            this.persist();
            this.brokerController.registerBrokerAll(false, true, true);
```

### DuplicatedCode
Duplicated code
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicQueueMappingCleanService.java`
#### Snippet
```java
                    if (isStopped()) {
                        break;
                    }
                    TopicQueueMappingDetail mappingDetail = this.topicQueueMappingManager.getTopicQueueMappingTable().get(topic);
                    if (mappingDetail == null
                            || mappingDetail.getHostedQueues().isEmpty()) {
                        continue;
                    }
                    if (!mappingDetail.getBname().equals(brokerConfig.getBrokerName())) {
                        log.warn("The TopicQueueMappingDetail [{}] should not exist in this broker", mappingDetail);
                        continue;
                    }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/consumer/store/LocalFileOffsetStore.java`
#### Snippet
```java
        if (mq != null) {
            AtomicLong offsetOld = this.offsetTable.get(mq);
            if (null == offsetOld) {
                offsetOld = this.offsetTable.putIfAbsent(mq, new AtomicLong(offset));
            }

            if (null != offsetOld) {
                if (increaseOnly) {
                    MixAll.compareAndIncreaseOnly(offsetOld, offset);
                } else {
                    offsetOld.set(offset);
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/consumer/store/LocalFileOffsetStore.java`
#### Snippet
```java
        Map<MessageQueue, Long> cloneOffsetTable = new HashMap<>(this.offsetTable.size(), 1);
        for (Map.Entry<MessageQueue, AtomicLong> entry : this.offsetTable.entrySet()) {
            MessageQueue mq = entry.getKey();
            if (!UtilAll.isBlank(topic) && !topic.equals(mq.getTopic())) {
                continue;
            }
            cloneOffsetTable.put(mq, entry.getValue().get());

        }
        return cloneOffsetTable;
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
        List<MessageExt> msgs = new ArrayList<>();
        msgs.add(msg);
        MessageQueue mq = new MessageQueue();
        mq.setBrokerName(brokerName);
        mq.setTopic(msg.getTopic());
        mq.setQueueId(msg.getQueueId());

        ConsumeConcurrentlyContext context = new ConsumeConcurrentlyContext(mq);

        this.defaultMQPushConsumerImpl.resetRetryAndNamespace(msgs, this.consumerGroup);

        final long beginTime = System.currentTimeMillis();

        log.info("consumeMessageDirectly receive new message: {}", msg);
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
            ConsumeConcurrentlyStatus status = this.messageListener.consumeMessage(msgs, context);
            if (status != null) {
                switch (status) {
                    case CONSUME_SUCCESS:
                        result.setConsumeResult(CMResult.CR_SUCCESS);
                        break;
                    case RECONSUME_LATER:
                        result.setConsumeResult(CMResult.CR_LATER);
                        break;
                    default:
                        break;
                }
            } else {
                result.setConsumeResult(CMResult.CR_RETURN_NULL);
            }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
        final int consumeBatchSize = this.defaultMQPushConsumer.getConsumeMessageBatchMaxSize();
        if (msgs.size() <= consumeBatchSize) {
            ConsumeRequest consumeRequest = new ConsumeRequest(msgs, processQueue, messageQueue);
            try {
                this.consumeExecutor.submit(consumeRequest);
            } catch (RejectedExecutionException e) {
                this.submitConsumeRequestLater(consumeRequest);
            }
        } else {
            for (int total = 0; total < msgs.size(); ) {
                List<MessageExt> msgThis = new ArrayList<>(consumeBatchSize);
                for (int i = 0; i < consumeBatchSize; i++, total++) {
                    if (total < msgs.size()) {
                        msgThis.add(msgs.get(total));
                    } else {
                        break;
                    }
                }

                ConsumeRequest consumeRequest = new ConsumeRequest(msgThis, processQueue, messageQueue);
                try {
                    this.consumeExecutor.submit(consumeRequest);
                } catch (RejectedExecutionException e) {
                    for (; total < msgs.size(); total++) {
                        msgThis.add(msgs.get(total));
                    }

                    this.submitConsumeRequestLater(consumeRequest);
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
                consumeMessageContext = new ConsumeMessageContext();
                consumeMessageContext.setNamespace(defaultMQPushConsumer.getNamespace());
                consumeMessageContext.setConsumerGroup(defaultMQPushConsumer.getConsumerGroup());
                consumeMessageContext.setProps(new HashMap<>());
                consumeMessageContext.setMq(messageQueue);
                consumeMessageContext.setMsgList(msgs);
                consumeMessageContext.setSuccess(false);
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
        ConsumeMessageDirectlyResult result = new ConsumeMessageDirectlyResult();
        result.setOrder(true);

        List<MessageExt> msgs = new ArrayList<>();
        msgs.add(msg);
        MessageQueue mq = new MessageQueue();
        mq.setBrokerName(brokerName);
        mq.setTopic(msg.getTopic());
        mq.setQueueId(msg.getQueueId());

        ConsumeOrderlyContext context = new ConsumeOrderlyContext(mq);

        this.defaultMQPushConsumerImpl.resetRetryAndNamespace(msgs, this.consumerGroup);

        final long beginTime = System.currentTimeMillis();

        log.info("consumeMessageDirectly receive new message: {}", msg);
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
            ConsumeOrderlyStatus status = this.messageListener.consumeMessage(msgs, context);
            if (status != null) {
                switch (status) {
                    case COMMIT:
                        result.setConsumeResult(CMResult.CR_COMMIT);
                        break;
                    case ROLLBACK:
                        result.setConsumeResult(CMResult.CR_ROLLBACK);
                        break;
                    case SUCCESS:
                        result.setConsumeResult(CMResult.CR_SUCCESS);
                        break;
                    case SUSPEND_CURRENT_QUEUE_A_MOMENT:
                        result.setConsumeResult(CMResult.CR_LATER);
                        break;
                    default:
                        break;
                }
            } else {
                result.setConsumeResult(CMResult.CR_RETURN_NULL);
            }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
        boolean suspend = false;
        if (msgs != null && !msgs.isEmpty()) {
            for (MessageExt msg : msgs) {
                if (msg.getReconsumeTimes() >= getMaxReconsumeTimes()) {
                    MessageAccessor.setReconsumeTime(msg, String.valueOf(msg.getReconsumeTimes()));
                    if (!sendMessageBack(msg)) {
                        suspend = true;
                        msg.setReconsumeTimes(msg.getReconsumeTimes() + 1);
                    }
                } else {
                    suspend = true;
                    msg.setReconsumeTimes(msg.getReconsumeTimes() + 1);
                }
            }
        }
        return suspend;
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java
            Message newMsg = new Message(MixAll.getRetryTopic(this.defaultMQPushConsumer.getConsumerGroup()), msg.getBody());
            MessageAccessor.setProperties(newMsg, msg.getProperties());
            String originMsgId = MessageAccessor.getOriginMessageId(msg);
            MessageAccessor.setOriginMessageId(newMsg, UtilAll.isBlank(originMsgId) ? msg.getMsgId() : originMsgId);
            newMsg.setFlag(msg.getFlag());
            MessageAccessor.putProperty(newMsg, MessageConst.PROPERTY_RETRY_TOPIC, msg.getTopic());
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
        if (null == mq) {
            throw new MQClientException("mq is null", null);
        }

        if (offset < 0) {
            throw new MQClientException("offset < 0", null);
        }

        if (maxNums <= 0) {
            throw new MQClientException("maxNums <= 0", null);
        }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPullConsumerImpl.java`
#### Snippet
```java
        this.isRunning();

        if (null == mq) {
            throw new MQClientException("mq is null", null);
        }

        if (offset < 0) {
            throw new MQClientException("offset < 0", null);
        }

        if (maxNums <= 0) {
            throw new MQClientException("maxNums <= 0", null);
        }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPullConsumerImpl.java`
#### Snippet
```java
            String originMsgId = MessageAccessor.getOriginMessageId(msg);
            MessageAccessor.setOriginMessageId(newMsg, UtilAll.isBlank(originMsgId) ? msg.getMsgId() : originMsgId);
            newMsg.setFlag(msg.getFlag());
            MessageAccessor.setProperties(newMsg, msg.getProperties());
            MessageAccessor.putProperty(newMsg, MessageConst.PROPERTY_RETRY_TOPIC, msg.getTopic());
            MessageAccessor.setReconsumeTime(newMsg, String.valueOf(msg.getReconsumeTimes() + 1));
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
            String desBrokerName = brokerName;
            if (brokerName != null && brokerName.startsWith(MixAll.LOGICAL_QUEUE_MOCK_BROKER_PREFIX)) {
                desBrokerName = this.mQClientFactory.getBrokerNameFromMessageQueue(this.defaultMQPushConsumer.queueWithNamespace(new MessageQueue(topic, brokerName, queueId)));
            }


            FindBrokerResult
                findBrokerResult = this.mQClientFactory.findBrokerAddressInSubscribe(desBrokerName, MixAll.MASTER_ID, true);
            if (null == findBrokerResult) {
                this.mQClientFactory.updateTopicRouteInfoFromNameServer(topic);
                findBrokerResult = this.mQClientFactory.findBrokerAddressInSubscribe(desBrokerName, MixAll.MASTER_ID, true);
            }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
            PopMessageRequestHeader requestHeader = new PopMessageRequestHeader();
            requestHeader.setConsumerGroup(consumerGroup);
            requestHeader.setTopic(mq.getTopic());
            requestHeader.setQueueId(mq.getQueueId());
            requestHeader.setMaxMsgNums(maxNums);
            requestHeader.setInvisibleTime(invisibleTime);
            requestHeader.setInitMode(initMode);
            requestHeader.setExpType(expressionType);
            requestHeader.setExp(expression);
            requestHeader.setOrder(order);
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
        for (Entry<MessageQueue, ProcessQueue> entry : removeQueueMap.entrySet()) {
            MessageQueue mq = entry.getKey();
            ProcessQueue pq = entry.getValue();

            if (this.removeUnnecessaryMessageQueue(mq, pq)) {
                this.processQueueTable.remove(mq);
                changed = true;
                log.info("doRebalance, {}, remove unnecessary mq, {}", consumerGroup, mq);
            }
        }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
                if (nextOffset >= 0) {
                    ProcessQueue pre = this.processQueueTable.putIfAbsent(mq, pq);
                    if (pre != null) {
                        log.info("doRebalance, {}, mq already exists, {}", consumerGroup, mq);
                    } else {
                        log.info("doRebalance, {}, add a new mq, {}", consumerGroup, mq);
                        PullRequest pullRequest = new PullRequest();
                        pullRequest.setConsumerGroup(consumerGroup);
                        pullRequest.setNextOffset(nextOffset);
                        pullRequest.setMessageQueue(mq);
                        pullRequest.setProcessQueue(pq);
                        pullRequestList.add(pullRequest);
                        changed = true;
                    }
                } else {
                    log.warn("doRebalance, {}, add new mq failed, {}", consumerGroup, mq);
                }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
                if (requestHeader.getTopic().startsWith(MixAll.RETRY_GROUP_TOPIC_PREFIX)) {
                    String reconsumeTimes = MessageAccessor.getReconsumeTime(msg);
                    if (reconsumeTimes != null) {
                        requestHeader.setReconsumeTimes(Integer.valueOf(reconsumeTimes));
                        MessageAccessor.clearProperty(msg, MessageConst.PROPERTY_RECONSUME_TIME);
                    }

                    String maxReconsumeTimes = MessageAccessor.getMaxReconsumeTimes(msg);
                    if (maxReconsumeTimes != null) {
                        requestHeader.setMaxReconsumeTimes(Integer.valueOf(maxReconsumeTimes));
                        MessageAccessor.clearProperty(msg, MessageConst.PROPERTY_MAX_RECONSUME_TIMES);
                    }
                }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
        long beginTimestamp = System.currentTimeMillis();
        prepareSendRequest(msg, timeout);
        final String correlationId = msg.getProperty(MessageConst.PROPERTY_CORRELATION_ID);

        final RequestResponseFuture requestResponseFuture = new RequestResponseFuture(correlationId, timeout, requestCallback);
        RequestFutureHolder.getInstance().getRequestFutureTable().put(correlationId, requestResponseFuture);

        long cost = System.currentTimeMillis() - beginTimestamp;
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/trace/TraceDataEncoder.java`
#### Snippet
```java
                pubContext.setTimeStamp(Long.parseLong(line[1]));
                pubContext.setRegionId(line[2]);
                pubContext.setGroupName(line[3]);
                TraceBean bean = new TraceBean();
                bean.setTopic(line[4]);
                bean.setMsgId(line[5]);
                bean.setTags(line[6]);
                bean.setKeys(line[7]);
                bean.setStoreHost(line[8]);
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/trace/TraceDataEncoder.java`
#### Snippet
```java
                sb.append(ctx.getTraceType()).append(TraceConstants.CONTENT_SPLITOR)//
                    .append(ctx.getTimeStamp()).append(TraceConstants.CONTENT_SPLITOR)//
                    .append(ctx.getRegionId()).append(TraceConstants.CONTENT_SPLITOR)//
                    .append(ctx.getGroupName()).append(TraceConstants.CONTENT_SPLITOR)//
                    .append(bean.getTopic()).append(TraceConstants.CONTENT_SPLITOR)//
                    .append(bean.getMsgId()).append(TraceConstants.CONTENT_SPLITOR)//
                    .append(bean.getTags()).append(TraceConstants.CONTENT_SPLITOR)//
                    .append(bean.getKeys()).append(TraceConstants.CONTENT_SPLITOR)//
                    .append(bean.getStoreHost()).append(TraceConstants.CONTENT_SPLITOR)//
                    .append(bean.getBodyLength()).append(TraceConstants.CONTENT_SPLITOR)//
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/trace/hook/SendMessageOpenTracingHookImpl.java`
#### Snippet
```java
        span.setTag(Tags.PEER_SERVICE, TraceConstants.ROCKETMQ_SERVICE);
        span.setTag(Tags.MESSAGE_BUS_DESTINATION, msg.getTopic());
        span.setTag(TraceConstants.ROCKETMQ_TAGS, msg.getTags());
        span.setTag(TraceConstants.ROCKETMQ_KEYS, msg.getKeys());
        span.setTag(TraceConstants.ROCKETMQ_SOTRE_HOST, context.getBrokerAddr());
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/org/apache/rocketmq/client/trace/hook/EndTransactionTraceHookImpl.java`
#### Snippet
```java
        tuxeContext.setGroupName(NamespaceUtil.withoutNamespace(context.getProducerGroup()));
        //build the data bean object of message trace
        TraceBean traceBean = new TraceBean();
        traceBean.setTopic(NamespaceUtil.withoutNamespace(context.getMessage().getTopic()));
        traceBean.setTags(context.getMessage().getTags());
        traceBean.setKeys(context.getMessage().getKeys());
        traceBean.setStoreHost(context.getBrokerAddr());
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/rocketmq/common/BrokerConfig.java`
#### Snippet
```java
            switch (value) {
                case 1:
                    return OTLP_GRPC;
                case 2:
                    return PROM;
                case 3:
                    return LOG;
                default:
                    return DISABLE;
            }
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
        byte[] result = src;
        byte[] uncompressData = new byte[src.length];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(src);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(src.length);

        try {
            while (true) {
                int len = inflaterInputStream.read(uncompressData, 0, uncompressData.length);
                if (len <= 0) {
                    break;
                }
                byteArrayOutputStream.write(uncompressData, 0, len);
            }
            byteArrayOutputStream.flush();
            result = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw e;
        } finally {
            try {
                byteArrayInputStream.close();
            } catch (IOException e) {
                log.error("Failed to close the stream", e);
            }
            try {
                inflaterInputStream.close();
            } catch (IOException e) {
                log.error("Failed to close the stream", e);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                log.error("Failed to close the stream", e);
            }
        }

        return result;
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
        byte[] result = src;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(src.length);
        java.util.zip.Deflater defeater = new java.util.zip.Deflater(level);
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, defeater);
        try {
            deflaterOutputStream.write(src);
            deflaterOutputStream.finish();
            deflaterOutputStream.close();
            result = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            defeater.end();
            throw e;
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException ignored) {
            }

            defeater.end();
        }

        return result;
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/rocketmq/common/compression/Lz4Compressor.java`
#### Snippet
```java
            while (true) {
                int len = lz4InputStream.read(uncompressData, 0, uncompressData.length);
                if (len <= 0) {
                    break;
                }
                resultOutputStream.write(uncompressData, 0, len);
            }
            resultOutputStream.flush();
            resultOutputStream.close();
            result = resultOutputStream.toByteArray();
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/PolishExpr.java`
#### Snippet
```java
                if (Type.OPERATOR == preType) {
                    segments.add(createOperator(expression
                        .substring(wordStartIndex, wordStartIndex + wordLen)));
                    wordStartIndex = -1;
                    wordLen = 0;
                } else if (Type.OPERAND == preType) {
                    segments.add(new Operand(expression.substring(wordStartIndex, wordStartIndex + wordLen)));
                    wordStartIndex = -1;
                    wordLen = 0;
                }
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/rocketmq/common/message/MessageDecoder.java`
#### Snippet
```java
        byte[] body = messageExt.getBody();
        byte[] topics = messageExt.getTopic().getBytes(CHARSET_UTF8);
        byte topicLen = (byte) topics.length;
        String properties = messageProperties2String(messageExt.getProperties());
        byte[] propertiesBytes = properties.getBytes(CHARSET_UTF8);
        short propertiesLength = (short) propertiesBytes.length;
        int sysFlag = messageExt.getSysFlag();
        int bornhostLength = (sysFlag & MessageSysFlag.BORNHOST_V6_FLAG) == 0 ? 8 : 20;
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/rocketmq/common/message/MessageDecoder.java`
#### Snippet
```java
        byteBuffer.putInt(storeSize);

        // 2 MAGICCODE
        byteBuffer.putInt(MESSAGE_MAGIC_CODE);

        // 3 BODYCRC
        int bodyCRC = messageExt.getBodyCRC();
        byteBuffer.putInt(bodyCRC);

        // 4 QUEUEID
        int queueId = messageExt.getQueueId();
        byteBuffer.putInt(queueId);

        // 5 FLAG
        int flag = messageExt.getFlag();
        byteBuffer.putInt(flag);

        // 6 QUEUEOFFSET
        long queueOffset = messageExt.getQueueOffset();
        byteBuffer.putLong(queueOffset);

        // 7 PHYSICALOFFSET
        long physicOffset = messageExt.getCommitLogOffset();
        byteBuffer.putLong(physicOffset);

        // 8 SYSFLAG
        byteBuffer.putInt(sysFlag);

        // 9 BORNTIMESTAMP
        long bornTimeStamp = messageExt.getBornTimestamp();
        byteBuffer.putLong(bornTimeStamp);

        // 10 BORNHOST
        InetSocketAddress bornHost = (InetSocketAddress) messageExt.getBornHost();
        byteBuffer.put(bornHost.getAddress().getAddress());
        byteBuffer.putInt(bornHost.getPort());
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/rocketmq/common/message/MessageDecoder.java`
#### Snippet
```java
        byteBuffer.put(serverHost.getAddress().getAddress());
        byteBuffer.putInt(serverHost.getPort());

        // 13 RECONSUMETIMES
        int reconsumeTimes = messageExt.getReconsumeTimes();
        byteBuffer.putInt(reconsumeTimes);

        // 14 Prepared Transaction Offset
        long preparedTransactionOffset = messageExt.getPreparedTransactionOffset();
        byteBuffer.putLong(preparedTransactionOffset);

        // 15 BODY
        byteBuffer.putInt(bodyLength);
        byteBuffer.put(newBody);

        // 16 TOPIC
        byteBuffer.put(topicLen);
        byteBuffer.put(topics);

        // 17 properties
        byteBuffer.putShort(propertiesLength);
        byteBuffer.put(propertiesBytes);

        return byteBuffer.array();
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/rocketmq/common/message/MessageDecoder.java`
#### Snippet
```java
        int reconsumeTimes = messageExt.getReconsumeTimes();
        byteBuffer.putInt(reconsumeTimes);

        // 12 Prepared Transaction Offset
        long preparedTransactionOffset = messageExt.getPreparedTransactionOffset();
        byteBuffer.putLong(preparedTransactionOffset);

        // 13 BODY
        byteBuffer.putInt(bodyLength);
        byteBuffer.put(newBody);

        // 14 TOPIC
        byteBuffer.put(topicLen);
        byteBuffer.put(topics);

        // 15 properties
        byteBuffer.putShort(propertiesLength);
        byteBuffer.put(propertiesBytes);

        return byteBuffer.array();
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/rocketmq/common/stats/StatsItem.java`
#### Snippet
```java
        this.scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    samplingInSeconds();
                } catch (Throwable ignored) {
                }
            }
        }, 0, 10, TimeUnit.SECONDS);

        this.scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    samplingInMinutes();
                } catch (Throwable ignored) {
                }
            }
        }, 0, 10, TimeUnit.MINUTES);

        this.scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    samplingInHour();
                } catch (Throwable ignored) {
                }
            }
        }, 0, 1, TimeUnit.HOURS);

        this.scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    printAtMinutes();
                } catch (Throwable ignored) {
                }
            }
        }, Math.abs(UtilAll.computeNextMinutesTimeMillis() - System.currentTimeMillis()), 1000 * 60, TimeUnit.MILLISECONDS);

        this.scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    printAtHour();
                } catch (Throwable ignored) {
                }
            }
        }, Math.abs(UtilAll.computeNextHourTimeMillis() - System.currentTimeMillis()), 1000 * 60 * 60, TimeUnit.MILLISECONDS);
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/rocketmq/common/utils/HttpTinyClient.java`
#### Snippet
```java
            int respCode = conn.getResponseCode();
            String resp = null;

            if (HttpURLConnection.HTTP_OK == respCode) {
                resp = IOTinyUtils.toString(conn.getInputStream(), encoding);
            } else {
                resp = IOTinyUtils.toString(conn.getErrorStream(), encoding);
            }
            return new HttpResult(respCode, resp);
```

### DuplicatedCode
Duplicated code
in `container/src/main/java/org/apache/rocketmq/container/BrokerContainer.java`
#### Snippet
```java
        brokerConfig.setInBrokerContainer(true);
        if (storeConfig.isDuplicationEnable()) {
            LOG.error("Can not add broker to container when duplicationEnable is true currently");
            throw new Exception("Can not add broker to container when duplicationEnable is true currently");
        }
        InnerBrokerController brokerController = new InnerBrokerController(this, brokerConfig, storeConfig);
        BrokerIdentity brokerIdentity = brokerController.getBrokerIdentity();
        final BrokerController previousBroker = dLedgerBrokerControllers.putIfAbsent(brokerIdentity, brokerController);
```

### DuplicatedCode
Duplicated code
in `controller/src/main/java/org/apache/rocketmq/controller/ControllerStartup.java`
#### Snippet
```java
        if (null == controller) {
            throw new IllegalArgumentException("ControllerManager is null");
        }

        boolean initResult = controller.initialize();
        if (!initResult) {
            controller.shutdown();
            System.exit(-3);
        }

        Runtime.getRuntime().addShutdownHook(new ShutdownHookThread(log, (Callable<Void>) () -> {
            controller.shutdown();
            return null;
        }));

        controller.start();

        return controller;
```

### DuplicatedCode
Duplicated code
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/NamesrvStartup.java`
#### Snippet
```java
        boolean initResult = controller.initialize();
        if (!initResult) {
            controller.shutdown();
            System.exit(-3);
        }

        Runtime.getRuntime().addShutdownHook(new ShutdownHookThread(log, (Callable<Void>) () -> {
            controller.shutdown();
            return null;
        }));

        controller.start();

        return controller;
```

### DuplicatedCode
Duplicated code
in `controller/src/main/java/org/apache/rocketmq/controller/impl/manager/ReplicasInfoManager.java`
#### Snippet
```java
        if (newMaster != null && newMaster.equals(oldMaster)) {
            // old master still valid, change nothing
            String err = String.format("The old master %s is still alive, not need to elect new master for broker %s", oldMaster, brokerReplicaInfo.getBrokerName());
            LOGGER.warn("{}", err);
            // the master still exist
            response.setMasterEpoch(syncStateInfo.getMasterEpoch());
            response.setSyncStateSetEpoch(syncStateInfo.getSyncStateSetEpoch());
            response.setMasterBrokerId(oldMaster);
            response.setMasterAddress(brokerReplicaInfo.getBrokerAddress(oldMaster));

            result.setBody(new ElectMasterResponseBody(syncStateSet).encode());
            result.setCodeAndRemark(ResponseCode.CONTROLLER_MASTER_STILL_EXIST, err);
            return result;
        }
```

### DuplicatedCode
Duplicated code
in `controller/src/main/java/org/apache/rocketmq/controller/processor/ControllerRequestProcessor.java`
#### Snippet
```java
            String bodyStr;
            try {
                bodyStr = new String(body, MixAll.DEFAULT_CHARSET);
            } catch (UnsupportedEncodingException e) {
                log.error("updateConfig byte array to string error: ", e);
                response.setCode(ResponseCode.SYSTEM_ERROR);
                response.setRemark("UnsupportedEncodingException " + e);
                return response;
            }

            Properties properties = MixAll.string2Properties(bodyStr);
            if (properties == null) {
                log.error("updateConfig MixAll.string2Properties error {}", bodyStr);
                response.setCode(ResponseCode.SYSTEM_ERROR);
                response.setRemark("string2Properties error");
                return response;
            }
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java
        RPCHook rpcHook = null;
        if (aclEnable) {
            String ak = commandLine.hasOption("ak") ? String.valueOf(commandLine.getOptionValue("ak")) : AclClient.ACL_ACCESS_KEY;
            String sk = commandLine.hasOption("sk") ? String.valueOf(commandLine.getOptionValue("sk")) : AclClient.ACL_SECRET_KEY;
            rpcHook = AclClient.getAclRPCHook(ak, sk);
        }
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java
        if (enableCompress) {
            String compressType = commandLine.hasOption("ct") ? commandLine.getOptionValue("ct").trim() : "ZLIB";
            int compressLevel = commandLine.hasOption("cl") ? Integer.parseInt(commandLine.getOptionValue("cl")) : 5;
            int compressOverHowMuch = commandLine.hasOption("ch") ? Integer.parseInt(commandLine.getOptionValue("ch")) : 4096;
            producer.getDefaultMQProducerImpl().setCompressType(CompressionType.of(compressType));
            producer.getDefaultMQProducerImpl().setCompressLevel(compressLevel);
            producer.setCompressMsgBodyOverHowmuch(compressOverHowMuch);
            System.out.printf("compressType: %s compressLevel: %s%n", compressType, compressLevel);
        } else {
            producer.setCompressMsgBodyOverHowmuch(Integer.MAX_VALUE);
        }

        producer.start();
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java
        Option opt = new Option("w", "threadCount", true, "Thread count, Default: 64");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("s", "messageSize", true, "Message Size, Default: 128");
        opt.setRequired(false);
        options.addOption(opt);
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("k", "keyEnable", true, "Message Key Enable, Default: false");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("t", "topic", true, "Topic name, Default: BenchmarkTest");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("l", "tagCount", true, "Tag count, Default: 0");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("m", "msgTraceEnable", true, "Message Trace Enable, Default: false");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("a", "aclEnable", true, "Acl Enable, Default: false");
        opt.setRequired(false);
        options.addOption(opt);
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
        opt = new Option("k", "keyEnable", true, "Message Key Enable, Default: false");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("t", "topic", true, "Topic name, Default: BenchmarkTest");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("l", "tagCount", true, "Tag count, Default: 0");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("m", "msgTraceEnable", true, "Message Trace Enable, Default: false");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("a", "aclEnable", true, "Acl Enable, Default: false");
        opt.setRequired(false);
        options.addOption(opt);
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("c", "compressEnable", true, "Enable compress msg over 4K, Default: false");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("ct", "compressType", true, "Message compressed type, Default: ZLIB");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("cl", "compressLevel", true, "Message compressed level, Default: 5");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("ch", "compressOverHowMuch", true, "Compress message when body over how much(unit Byte), Default: 4096");
        opt.setRequired(false);
        options.addOption(opt);

        return options;
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Consumer.java`
#### Snippet
```java
                    Long[] begin = snapshotList.getFirst();
                    Long[] end = snapshotList.getLast();

                    final long consumeTps =
                        (long) (((end[1] - begin[1]) / (double) (end[0] - begin[0])) * 1000L);
                    final double averageB2CRT = (end[2] - begin[2]) / (double) (end[1] - begin[1]);
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Consumer.java`
#### Snippet
```java
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("m", "msgTraceEnable", true, "Message Trace Enable, Default: false");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("a", "aclEnable", true, "Acl Enable, Default: false");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("ak", "accessKey", true, "Acl access key, Default: 12345678");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("sk", "secretKey", true, "Acl secret key, Default: rocketmq2");
        opt.setRequired(false);
        options.addOption(opt);
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/benchmark/TransactionProducer.java`
#### Snippet
```java
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("a", "aclEnable", true, "Acl Enable, Default: false");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("ak", "accessKey", true, "Acl access key, Default: 12345678");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("sk", "secretKey", true, "Acl secret key, Default: rocketmq2");
        opt.setRequired(false);
        options.addOption(opt);
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
        Long[] begin = snapshotList.getFirst();
        Long[] end = snapshotList.getLast();

        final long sendTps = (long) (((end[3] - begin[3]) / (double) (end[0] - begin[0])) * 1000L);
        final double averageRT = (end[5] - begin[5]) / (double) (end[3] - begin[3]);
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/benchmark/timer/TimerConsumer.java`
#### Snippet
```java
        Option opt = new Option("n", "namesrvAddr", true, "Nameserver address, default: localhost:9876");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("t", "topic", true, "Send messages to which topic, default: BenchmarkTest");
        opt.setRequired(false);
        options.addOption(opt);
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/filter/SqlFilterConsumer.java`
#### Snippet
```java
        consumer.registerMessageListener(new MessageListenerConcurrently() {

            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
                ConsumeConcurrentlyContext context) {
                System.out.printf("%s Receive New Messages: %s %n", Thread.currentThread().getName(), msgs);
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();
        System.out.printf("Consumer Started.%n");
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/operation/Consumer.java`
#### Snippet
```java
        opt.setRequired(true);
        options.addOption(opt);

        DefaultParser parser = new DefaultParser();
        HelpFormatter hf = new HelpFormatter();
        hf.setWidth(110);
        CommandLine commandLine = null;
        try {
            commandLine = parser.parse(options, args);
            if (commandLine.hasOption('h')) {
                hf.printHelp("producer", options, true);
                return null;
            }
        } catch (ParseException e) {
            hf.printHelp("producer", options, true);
            return null;
        }

        return commandLine;
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/simple/LitePullConsumerAssign.java`
#### Snippet
```java
        litePullConsumer.assign(assignList);
        litePullConsumer.seek(assignList.get(0), 10);
        try {
            while (running) {
                List<MessageExt> messageExts = litePullConsumer.poll();
                System.out.printf("%s %n", messageExts);
                litePullConsumer.commit();
            }
        } finally {
            litePullConsumer.shutdown();
        }
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/tracemessage/TraceProducer.java`
#### Snippet
```java
            try {
                {
                    Message msg = new Message(TOPIC,
                        TAG,
                        KEY,
                        "Hello world".getBytes(RemotingHelper.DEFAULT_CHARSET));
                    SendResult sendResult = producer.send(msg);
                    System.out.printf("%s%n", sendResult);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/tracemessage/OpenTracingProducer.java`
#### Snippet
```java
        Configuration.SamplerConfiguration samplerConfig = Configuration.SamplerConfiguration.fromEnv()
            .withType(ConstSampler.TYPE)
            .withParam(1);
        Configuration.ReporterConfiguration reporterConfig = Configuration.ReporterConfiguration.fromEnv()
            .withLogSpans(true);

        Configuration config = new Configuration("rocketmq")
            .withSampler(samplerConfig)
            .withReporter(reporterConfig);
        GlobalTracer.registerIfAbsent(config.getTracer());
        return config.getTracer();
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/example/tracemessage/OpenTracingPushConsumer.java`
#### Snippet
```java
        consumer.subscribe(TOPIC, "*");
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        consumer.setConsumeTimestamp("20181109221800");
        consumer.registerMessageListener((MessageListenerConcurrently) (msgs, context) -> {
            System.out.printf("%s Receive New Messages: %s %n", Thread.currentThread().getName(), msgs);
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        });
        consumer.start();
        System.out.printf("Consumer Started.%n");
```

### DuplicatedCode
Duplicated code
in `filter/src/main/java/org/apache/rocketmq/filter/parser/ParseException.java`
#### Snippet
```java
        StringBuilder retval = new StringBuilder();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 0:
                    continue;
                case '\b':
                    retval.append("\\b");
                    continue;
                case '\t':
                    retval.append("\\t");
                    continue;
                case '\n':
                    retval.append("\\n");
                    continue;
                case '\f':
                    retval.append("\\f");
                    continue;
                case '\r':
                    retval.append("\\r");
                    continue;
                case '\"':
                    retval.append("\\\"");
                    continue;
                case '\'':
                    retval.append("\\\'");
                    continue;
                case '\\':
                    retval.append("\\\\");
                    continue;
                default:
                    if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                        String s = "0000" + Integer.toString(ch, 16);
                        retval.append("\\u" + s.substring(s.length() - 4, s.length()));
                    } else {
                        retval.append(ch);
                    }
                    continue;
            }
        }
        return retval.toString();
```

### DuplicatedCode
Duplicated code
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        tokenSource.ReInit(jjInputStream);
        token = new Token();
        jjNtk = -1;
        jjGen = 0;
        for (int i = 0; i < 13; i++)
            jjLa1[i] = -1;
        for (int i = 0; i < jj2Rtns.length; i++)
            jj2Rtns[i] = new JJCalls();
```

### DuplicatedCode
Duplicated code
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        token = new Token();
        jjNtk = -1;
        jjGen = 0;
        for (int i = 0; i < 13; i++)
            jjLa1[i] = -1;
        for (int i = 0; i < jj2Rtns.length; i++)
            jj2Rtns[i] = new JJCalls();
```

### DuplicatedCode
Duplicated code
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/processor/ClientRequestProcessor.java`
#### Snippet
```java
            byte[] content;
            Boolean standardJsonOnly = requestHeader.getAcceptStandardJsonOnly();
            if (request.getVersion() >= MQVersion.Version.V4_9_4.ordinal() || null != standardJsonOnly && standardJsonOnly) {
                content = topicRouteData.encode(SerializerFeature.BrowserCompatible,
                    SerializerFeature.QuoteFieldNames, SerializerFeature.SkipTransientField,
                    SerializerFeature.MapSortField);
            } else {
                content = topicRouteData.encode();
            }

            response.setBody(content);
            response.setCode(ResponseCode.SUCCESS);
            response.setRemark(null);
            return response;
```

### DuplicatedCode
Duplicated code
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/processor/DefaultRequestProcessor.java`
#### Snippet
```java
        if (StringUtils.isNotBlank(content)) {
            try {
                response.setBody(content.getBytes(MixAll.DEFAULT_CHARSET));
            } catch (UnsupportedEncodingException e) {
                log.error("getConfig error, ", e);
                response.setCode(ResponseCode.SYSTEM_ERROR);
                response.setRemark("UnsupportedEncodingException " + e);
                return response;
            }
        }

        response.setCode(ResponseCode.SUCCESS);
        response.setRemark(null);
        return response;
```

### DuplicatedCode
Duplicated code
in `proxy/src/main/java/org/apache/rocketmq/proxy/common/ReceiptHandleGroup.java`
#### Snippet
```java
        Map<String, HandleData> handleMap = this.receiptHandleMap.get(msgID);
        if (handleMap == null) {
            return null;
        }
        long timeout = ConfigurationManager.getProxyConfig().getLockTimeoutMsInHandleGroup();
        AtomicReference<MessageReceiptHandle> res = new AtomicReference<>();
```

### DuplicatedCode
Duplicated code
in `proxy/src/main/java/org/apache/rocketmq/proxy/remoting/MultiProtocolTlsHelper.java`
#### Snippet
```java
        if (null == authMode || authMode.trim().isEmpty()) {
            return ClientAuth.NONE;
        }

        for (ClientAuth clientAuth : ClientAuth.values()) {
            if (clientAuth.name().equals(authMode.toUpperCase())) {
                return clientAuth;
            }
        }

        return ClientAuth.NONE;
```

### DuplicatedCode
Duplicated code
in `proxy/src/main/java/org/apache/rocketmq/proxy/remoting/activity/ConsumerManagerActivity.java`
#### Snippet
```java
        Set<MessageQueue> mqSet = requestBody.getMqSet();
        if (mqSet.isEmpty()) {
            response.setBody(requestBody.encode());
            response.setRemark("MessageQueue set is empty");
            return response;
        }

        String brokerName = new ArrayList<>(mqSet).get(0).getBrokerName();
        messagingProcessor.request(context, brokerName, request, Duration.ofSeconds(3).toMillis())
            .thenAccept(r -> writeResponse(ctx, context, request, r))
            .exceptionally(t -> {
                writeErrResponse(ctx, context, request, t);
                return null;
            });
        return null;
```

### DuplicatedCode
Duplicated code
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/mqclient/MQClientAPIExt.java`
#### Snippet
```java
            this.getRemotingClient().invokeAsync(brokerAddr, request, timeoutMillis, responseFuture -> {
                RemotingCommand response = responseFuture.getResponseCommand();
                if (response != null) {
                    try {
                        future.complete(this.processSendResponse(brokerName, msg, response, brokerAddr));
                    } catch (Exception e) {
                        future.completeExceptionally(e);
                    }
                } else {
                    future.completeExceptionally(processNullResponseErr(responseFuture));
                }
            });
```

### DuplicatedCode
Duplicated code
in `remoting/src/main/java/org/apache/rocketmq/remoting/common/RemotingHelper.java`
#### Snippet
```java
                while (byteBufferSize.hasRemaining()) {
                    int length = socketChannel.read(byteBufferSize);
                    if (length > 0) {
                        if (byteBufferSize.hasRemaining()) {
                            if ((System.currentTimeMillis() - beginTime) > timeoutMillis) {

                                throw new RemotingTimeoutException(addr, timeoutMillis);
                            }
                        }
                    } else {
                        throw new RemotingTimeoutException(addr, timeoutMillis);
                    }

                    Thread.sleep(1);
                }
```

### DuplicatedCode
Duplicated code
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/NettyLogger.java`
#### Snippet
```java
            if (internalLogLevel.equals(InternalLogLevel.DEBUG)) {
                logger.debug(s, o);
            }
            if (internalLogLevel.equals(InternalLogLevel.TRACE)) {
                logger.info(s, o);
            }
            if (internalLogLevel.equals(InternalLogLevel.INFO)) {
                logger.info(s, o);
            }
            if (internalLogLevel.equals(InternalLogLevel.WARN)) {
                logger.warn(s, o);
            }
            if (internalLogLevel.equals(InternalLogLevel.ERROR)) {
                logger.error(s, o);
            }
```

### DuplicatedCode
Duplicated code
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/TlsHelper.java`
#### Snippet
```java
        LOGGER.info("{} = {}", TLS_TEST_MODE_ENABLE, tlsTestModeEnable);
        LOGGER.info("{} = {}", TLS_SERVER_NEED_CLIENT_AUTH, tlsServerNeedClientAuth);
        LOGGER.info("{} = {}", TLS_SERVER_KEYPATH, tlsServerKeyPath);
        LOGGER.info("{} = {}", TLS_SERVER_KEYPASSWORD, tlsServerKeyPassword);
        LOGGER.info("{} = {}", TLS_SERVER_CERTPATH, tlsServerCertPath);
        LOGGER.info("{} = {}", TLS_SERVER_AUTHCLIENT, tlsServerAuthClient);
```

### DuplicatedCode
Duplicated code
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/ExtraInfoUtil.java`
#### Snippet
```java
        if (stringBuilder == null) {
            stringBuilder = new StringBuilder(64);
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.append(";");
        }

        stringBuilder.append(retry ? RETRY_TOPIC : NORMAL_TOPIC)
            .append(MessageConst.KEY_SEPARATOR).append(queueId)
            .append(MessageConst.KEY_SEPARATOR).append(startOffset);
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
            processOffset += mappedFileOffset;
            // Set a candidate confirm offset.
            // In most cases, this value will be overwritten by confirmLog.init.
            // It works if some confirmed messages are lost.
            this.setConfirmOffset(lastValidMsgPhyOffset);
            this.mappedFileQueue.setFlushedWhere(processOffset);
            this.mappedFileQueue.setCommittedWhere(processOffset);
            this.mappedFileQueue.truncateDirtyFiles(processOffset);

            // Clear ConsumeQueue redundant data
            if (maxPhyOffsetOfConsumeQueue >= processOffset) {
                log.warn("maxPhyOffsetOfConsumeQueue({}) >= processOffset({}), truncate dirty logic files", maxPhyOffsetOfConsumeQueue, processOffset);
                this.defaultMessageStore.truncateDirtyLogicFiles(processOffset);
            }
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
        long elapsedTimeInLock = 0;
        MappedFile unlockMappedFile = null;
        MappedFile mappedFile = this.mappedFileQueue.getLastMappedFile();

        long currOffset;
        if (mappedFile == null) {
            currOffset = 0;
        } else {
            currOffset = mappedFile.getFileFromOffset() + mappedFile.getWrotePosition();
        }

        int needAckNums = this.defaultMessageStore.getMessageStoreConfig().getInSyncReplicas();
        boolean needHandleHA = needHandleHA(msg);

        if (needHandleHA && this.defaultMessageStore.getBrokerConfig().isEnableControllerMode()) {
            if (this.defaultMessageStore.getHaService().inSyncReplicasNums(currOffset) < this.defaultMessageStore.getMessageStoreConfig().getMinInSyncReplicas()) {
                return CompletableFuture.completedFuture(new PutMessageResult(PutMessageStatus.IN_SYNC_REPLICAS_NOT_ENOUGH, null));
            }
            if (this.defaultMessageStore.getMessageStoreConfig().isAllAckInSyncStateSet()) {
                // -1 means all ack in SyncStateSet
                needAckNums = MixAll.ALL_ACK_IN_SYNC_STATE_SET;
            }
        } else if (needHandleHA && this.defaultMessageStore.getBrokerConfig().isEnableSlaveActingMaster()) {
            int inSyncReplicas = Math.min(this.defaultMessageStore.getAliveReplicaNumInGroup(),
                this.defaultMessageStore.getHaService().inSyncReplicasNums(currOffset));
            needAckNums = calcNeedAckNums(inSyncReplicas);
            if (needAckNums > inSyncReplicas) {
                // Tell the producer, don't have enough slaves to handle the send request
                return CompletableFuture.completedFuture(new PutMessageResult(PutMessageStatus.IN_SYNC_REPLICAS_NOT_ENOUGH, null));
            }
        }
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
        final int tranType = MessageSysFlag.getTransactionValue(messageExtBatch.getSysFlag());

        if (tranType != MessageSysFlag.TRANSACTION_NOT_TYPE) {
            return CompletableFuture.completedFuture(new PutMessageResult(PutMessageStatus.MESSAGE_ILLEGAL, null));
        }
        if (messageExtBatch.getDelayTimeLevel() > 0) {
            return CompletableFuture.completedFuture(new PutMessageResult(PutMessageStatus.MESSAGE_ILLEGAL, null));
        }
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
            switch (tranType) {
                // Prepared and Rollback message is not consumed, will not enter the consume queue
                case MessageSysFlag.TRANSACTION_PREPARED_TYPE:
                case MessageSysFlag.TRANSACTION_ROLLBACK_TYPE:
                    queueOffset = 0L;
                    break;
                case MessageSysFlag.TRANSACTION_NOT_TYPE:
                case MessageSysFlag.TRANSACTION_COMMIT_TYPE:
                default:
                    break;
            }
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java
            int index = mappedFiles.size() - 3;
            if (index < 0) {
                index = 0;
            }

            int mappedFileSizeLogics = this.mappedFileSize;
            MappedFile mappedFile = mappedFiles.get(index);
            ByteBuffer byteBuffer = mappedFile.sliceByteBuffer();
            long processOffset = mappedFile.getFileFromOffset();
            long mappedFileOffset = 0;
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java
                                    if (attempt < floor) {
                                        break;
                                    }
                                    byteBuffer.position(attempt);
                                    long physicalOffset = byteBuffer.getLong();
                                    int messageSize = byteBuffer.getInt();
                                    long messageStoreTimestamp = messageStore.getCommitLog()
                                        .pickupStoreTimestamp(physicalOffset, messageSize);
                                    if (messageStoreTimestamp == timestamp) {
                                        previousAttempt = attempt;
                                        continue;
                                    }
                                    break;
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java
            int start = 0;
            int len = mappedFile.getFileSize();

            // calculate start and len for first segment and last segment to reduce scanning
            // first file segment
            if (mappedFile.getFileFromOffset() <= physicalOffsetFrom) {
                start = (int) (physicalOffsetFrom - mappedFile.getFileFromOffset());
                if (mappedFile.getFileFromOffset() + mappedFile.getFileSize() >= physicalOffsetTo) {
                    // current mapped file covers search range completely.
                    len = (int) (physicalOffsetTo - physicalOffsetFrom);
                } else {
                    len = mappedFile.getFileSize() - start;
                }
            }

            // last file segment
            if (0 == start && mappedFile.getFileFromOffset() + mappedFile.getFileSize() > physicalOffsetTo) {
                len = (int) (physicalOffsetTo - mappedFile.getFileFromOffset());
            }

            // select partial data to scan
            SelectMappedBufferResult slice = mappedFile.selectMappedBuffer(start, len);
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java
                        raw++;
                        current += CQ_STORE_UNIT_SIZE;

                        if (raw >= messageStore.getMessageStoreConfig().getMaxConsumeQueueScan()) {
                            sample = true;
                            break;
                        }

                        if (match > messageStore.getMessageStoreConfig().getSampleCountThreshold()) {
                            sample = true;
                            break;
                        }
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java
        long result = match;
        if (sample) {
            if (0 == raw) {
                log.error("[BUG]. Raw should NOT be 0");
                return 0;
            }
            result = (long) (match * (to - from) * 1.0 / raw);
        }
        log.debug("Result={}, raw={}, match={}, sample={}", result, raw, match, sample);
        return result;
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/MessageExtEncoder.java`
#### Snippet
```java
        this.byteBuf.writeLong(0);
        // 8 SYSFLAG
        this.byteBuf.writeInt(msgInner.getSysFlag());
        // 9 BORNTIMESTAMP
        this.byteBuf.writeLong(msgInner.getBornTimestamp());

        // 10 BORNHOST
        ByteBuffer bornHostBytes = msgInner.getBornHostBytes();
        this.byteBuf.writeBytes(bornHostBytes.array());

        // 11 STORETIMESTAMP
        this.byteBuf.writeLong(msgInner.getStoreTimestamp());

        // 12 STOREHOSTADDRESS
        ByteBuffer storeHostBytes = msgInner.getStoreHostBytes();
        this.byteBuf.writeBytes(storeHostBytes.array());

        // 13 RECONSUMETIMES
        this.byteBuf.writeInt(msgInner.getReconsumeTimes());
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/MessageExtEncoder.java`
#### Snippet
```java
            messagesByteBuff.getInt();
            // 2 MAGICCODE
            messagesByteBuff.getInt();
            // 3 BODYCRC
            messagesByteBuff.getInt();
            // 4 FLAG
            int flag = messagesByteBuff.getInt();
            // 5 BODY
            int bodyLen = messagesByteBuff.getInt();
            int bodyPos = messagesByteBuff.position();
            int bodyCrc = UtilAll.crc32(messagesByteBuff.array(), bodyPos, bodyLen);
            messagesByteBuff.position(bodyPos + bodyLen);
            // 6 properties
            short propertiesLen = messagesByteBuff.getShort();
            int propertiesPos = messagesByteBuff.position();
            messagesByteBuff.position(propertiesPos + propertiesLen);
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
        LongAdder rs = putMessageTopicSizeTotal.get(topic);
        if (null == rs) {
            rs = new LongAdder();
            LongAdder previous = putMessageTopicSizeTotal.putIfAbsent(topic, rs);
            if (previous != null) {
                rs = previous;
            }
        }
        return rs;
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
            PutMessageStatus putMessageStatus = PutMessageStatus.UNKNOWN_ERROR;
            switch (DLedgerResponseCode.valueOf(appendEntryResponse.getCode())) {
                case SUCCESS:
                    putMessageStatus = PutMessageStatus.PUT_OK;
                    break;
                case INCONSISTENT_LEADER:
                case NOT_LEADER:
                case LEADER_NOT_READY:
                case DISK_FULL:
                    putMessageStatus = PutMessageStatus.SERVICE_NOT_AVAILABLE;
                    break;
                case WAIT_QUORUM_ACK_TIMEOUT:
                    //Do not return flush_slave_timeout to the client, for the client will ignore it.
                    putMessageStatus = PutMessageStatus.IN_SYNC_REPLICAS_NOT_ENOUGH;
                    break;
                case LEADER_PENDING_FULL:
                    putMessageStatus = PutMessageStatus.OS_PAGE_CACHE_BUSY;
                    break;
            }
            PutMessageResult putMessageResult = new PutMessageResult(putMessageStatus, appendResult);
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
            int sysflag = msgInner.getSysFlag();

            int bornHostLength = (sysflag & MessageSysFlag.BORNHOST_V6_FLAG) == 0 ? 4 + 4 : 16 + 4;
            int storeHostLength = (sysflag & MessageSysFlag.STOREHOSTADDRESS_V6_FLAG) == 0 ? 4 + 4 : 16 + 4;
            ByteBuffer bornHostHolder = ByteBuffer.allocate(bornHostLength);
            ByteBuffer storeHostHolder = ByteBuffer.allocate(storeHostLength);
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
            msgStoreItemMemory.putInt(msgInner.getSysFlag());
            // 9 BORNTIMESTAMP
            msgStoreItemMemory.putLong(msgInner.getBornTimestamp());
            // 10 BORNHOST
            resetByteBuffer(bornHostHolder, bornHostLength);
            msgStoreItemMemory.put(msgInner.getBornHostBytes(bornHostHolder));
            // 11 STORETIMESTAMP
            msgStoreItemMemory.putLong(msgInner.getStoreTimestamp());
            // 12 STOREHOSTADDRESS
            resetByteBuffer(storeHostHolder, storeHostLength);
            msgStoreItemMemory.put(msgInner.getStoreHostBytes(storeHostHolder));
            //this.msgBatchMemory.put(msgInner.getStoreHostBytes());
            // 13 RECONSUMETIMES
            msgStoreItemMemory.putInt(msgInner.getReconsumeTimes());
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/ha/DefaultHAService.java`
#### Snippet
```java
            info.setMaster(false);

            info.getHaClientRuntimeInfo().setMasterAddr(this.haClient.getHaMasterAddress());
            info.getHaClientRuntimeInfo().setMaxOffset(this.getDefaultMessageStore().getMaxPhyOffset());
            info.getHaClientRuntimeInfo().setLastReadTimestamp(this.haClient.getLastReadTimestamp());
            info.getHaClientRuntimeInfo().setLastWriteTimestamp(this.haClient.getLastWriteTimestamp());
            info.getHaClientRuntimeInfo().setTransferredByteInSecond(this.haClient.getTransferredByteInSecond());
            info.getHaClientRuntimeInfo().setMasterFlushOffset(this.defaultMessageStore.getMasterFlushedOffset());
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/ha/DefaultHAService.java`
#### Snippet
```java
                HARuntimeInfo.HAConnectionRuntimeInfo cInfo = new HARuntimeInfo.HAConnectionRuntimeInfo();

                long slaveAckOffset = conn.getSlaveAckOffset();
                cInfo.setSlaveAckOffset(slaveAckOffset);
                cInfo.setDiff(masterPutWhere - slaveAckOffset);
                cInfo.setAddr(conn.getClientAddress().substring(1));
                cInfo.setTransferredByteInSecond(conn.getTransferredByteInSecond());
                cInfo.setTransferFromWhere(conn.getTransferFromWhere());
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/ha/autoswitch/AutoSwitchHAConnection.java`
#### Snippet
```java
            SelectionKey sk = this.socketChannel.keyFor(this.selector);
            if (sk != null) {
                sk.cancel();
            }

            try {
                this.selector.close();
                this.socketChannel.close();
            } catch (IOException e) {
                AutoSwitchHAConnection.LOGGER.error("", e);
            }

            flowMonitor.shutdown(true);

            AutoSwitchHAConnection.LOGGER.info(this.getServiceName() + " service end");
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
                    index++;
                    if (index >= mappedFiles.size()) {
                        log.info("Recover last batch consume queue file over, last mapped file:{} ", mappedFile.getFileName());
                        break;
                    } else {
                        mappedFile = mappedFiles.get(index);
                        byteBuffer = mappedFile.sliceByteBuffer();
                        processOffset = mappedFile.getFileFromOffset();
                        mappedFileOffset = 0;
                        log.info("Recover next batch consume queue file: " + mappedFile.getFileName());
                    }
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
        StringBuilder strBuilder;
        if (topic != null && group != null) {
            strBuilder = new StringBuilder(topic.length() + group.length() + 6);
        } else {
            strBuilder = new StringBuilder();
        }
        strBuilder.append(topic).append("@").append(queueId).append("@").append(group);
        return strBuilder.toString();
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
        final StatsItemSet statsItemSet = this.statsTable.get(BROKER_GET_NUMS_WITHOUT_SYSTEM_TOPIC);
        if (statsItemSet == null) {
            return 0;
        }
        final StatsItem statsItem = statsItemSet.getStatsItem(this.clusterName);
        if (statsItem == null) {
            return 0;
        }
        return statsItem.getValue().longValue();
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
        strBuilder.append(owner);
        strBuilder.append("@");
        strBuilder.append(topic);
        strBuilder.append("@");
        strBuilder.append(group);
        strBuilder.append("@");
        strBuilder.append(type);
        return strBuilder.toString();
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
        StringBuffer strBuilder = new StringBuffer();
        strBuilder.append(accountOwnerParent);
        strBuilder.append("@");
        strBuilder.append(accountOwnerSelf);
        strBuilder.append("@");
        strBuilder.append(instanceId);
        strBuilder.append("@");
        strBuilder.append(topic);
        strBuilder.append("@");
        strBuilder.append(group);
        strBuilder.append("@");
        strBuilder.append(msgType);
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
        final String sep = "|";
        StringBuffer strBuilder = new StringBuffer();
        strBuilder.append(owner).append(sep);
        strBuilder.append(instanceId).append(sep);
        strBuilder.append(topic).append(sep);
        strBuilder.append(group).append(sep);
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
                if (null == timeSbr || timeSbr.getStartOffset() > currOffsetPy) {
                    timeSbr = timerLog.getWholeBuffer(currOffsetPy);
                    if (null != timeSbr) {
                        sbrs.add(timeSbr);
                    }
                }
                if (null == timeSbr) {
                    break;
                }
                long prevPos = -1;
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
            CountDownLatch deleteLatch = new CountDownLatch(deleteMsgStack.size());
            //read the delete msg: the msg used to mark another msg is deleted
            for (List<TimerRequest> deleteList : splitIntoLists(deleteMsgStack)) {
                for (TimerRequest tr : deleteList) {
                    tr.setLatch(deleteLatch);
                }
                dequeueGetQueue.put(deleteList);
            }
            //do we need to use loop with tryAcquire
            checkDequeueLatch(deleteLatch, currReadTimeMs);
```

### DuplicatedCode
Duplicated code
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMetrics.java`
#### Snippet
```java
        Metric pair = timingDistribution.get(period);
        if (null != pair) {
            return pair;
        }
        pair = new Metric();
        final Metric previous = timingDistribution.putIfAbsent(period, pair);
        if (null != previous) {
            return previous;
        }
        return pair;
```

### DuplicatedCode
Duplicated code
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQNormalProducer.java`
#### Snippet
```java
            this.msgRTs.addData(System.currentTimeMillis() - start);
            if (isDebug) {
                logger.info("SendResult: {}", internalSendResult);
            }
            sendResult.setMsgId(internalSendResult.getMsgId());
            sendResult.setSendResult(internalSendResult.getSendStatus().equals(SendStatus.SEND_OK));
            sendResult.setBrokerIp(internalSendResult.getMessageQueue().getBrokerName());
            msgBodys.addData(new String(message.getBody(), StandardCharsets.UTF_8));
            originMsgs.addData(msg);
            originMsgIndex.put(new String(message.getBody(), StandardCharsets.UTF_8), internalSendResult);
```

### DuplicatedCode
Duplicated code
in `test/src/main/java/org/apache/rocketmq/test/util/MQAdminTestUtils.java`
#### Snippet
```java
        ClientMetadata clientMetadata = MQAdminUtils.getBrokerMetadata(defaultMQAdminExt);
        MQAdminUtils.checkIfMasterAlive(brokerConfigMap.keySet(), defaultMQAdminExt, clientMetadata);
        // now do the remapping
        //Step1: let the new leader can be write without the logicOffset
        for (String broker : brokersToMapIn) {
            String addr = clientMetadata.findMasterBrokerAddr(broker);
            TopicConfigAndQueueMapping configMapping = brokerConfigMap.get(broker);
            defaultMQAdminExt.createStaticTopic(addr, defaultMQAdminExt.getCreateTopicKey(), configMapping, configMapping.getMappingDetail(), force);
        }
        //Step2: forbid the write of old leader
        for (String broker : brokersToMapOut) {
            String addr = clientMetadata.findMasterBrokerAddr(broker);
            TopicConfigAndQueueMapping configMapping = brokerConfigMap.get(broker);
            defaultMQAdminExt.createStaticTopic(addr, defaultMQAdminExt.getCreateTopicKey(), configMapping, configMapping.getMappingDetail(), force);
        }
```

### DuplicatedCode
Duplicated code
in `test/src/main/java/org/apache/rocketmq/test/util/MQAdminTestUtils.java`
#### Snippet
```java
        for (String broker : brokerConfigMap.keySet()) {
            if (brokersToMapIn.contains(broker) || brokersToMapOut.contains(broker)) {
                continue;
            }
            String addr = clientMetadata.findMasterBrokerAddr(broker);
            TopicConfigAndQueueMapping configMapping = brokerConfigMap.get(broker);
            defaultMQAdminExt.createStaticTopic(addr, defaultMQAdminExt.getCreateTopicKey(), configMapping, configMapping.getMappingDetail(), force);
        }
```

### DuplicatedCode
Duplicated code
in `test/src/main/java/org/apache/rocketmq/test/util/MQAdminTestUtils.java`
#### Snippet
```java
        final CommandLine commandLine = ServerUtil.parseCmdLine("mqadmin " + cmd.commandName(), args, cmd.buildCommandlineOptions(options), new DefaultParser());
        if (null == commandLine) {
            return;
        }
        if (commandLine.hasOption('n')) {
            String namesrvAddr = commandLine.getOptionValue('n');
            System.setProperty(MixAll.NAMESRV_ADDR_PROPERTY, namesrvAddr);
        }
        cmd.execute(commandLine, options, null);
```

### DuplicatedCode
Duplicated code
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredMessageQueueContainer.java`
#### Snippet
```java
                        if (attempt < minQueueOffset) {
                            break;
                        }
                        message = getMessageAsync(attempt).join();
                        storeTime = MessageBufferUtil.getStoreTimeStamp(message);
                        if (storeTime == timestamp) {
                            previousAttempt = attempt;
                            continue;
                        }
                        break;
```

### DuplicatedCode
Duplicated code
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/metrics/TieredStoreMetricsManager.java`
#### Snippet
```java
                    MessageQueue mq = container.getMessageQueue();
                    long maxOffset = next.getMaxOffsetInQueue(mq.getTopic(), mq.getQueueId());
                    long maxTimestamp = next.getMessageStoreTimeStamp(mq.getTopic(), mq.getQueueId(), maxOffset - 1);
                    if (maxTimestamp > 0 && System.currentTimeMillis() - maxTimestamp > (long) storeConfig.getTieredStoreFileReservedTime() * 60 * 60 * 1000) {
                        continue;
                    }

                    Attributes commitLogAttributes = newAttributesBuilder()
                        .put(LABEL_TOPIC, mq.getTopic())
                        .put(LABEL_QUEUE_ID, mq.getQueueId())
                        .put(LABEL_FILE_TYPE, TieredFileSegment.FileSegmentType.COMMIT_LOG.name().toLowerCase())
                        .build();
```

## RuleId[id=CollectionContainsUrl]
### CollectionContainsUrl
Set `urlSet` may contain URL objects
in `common/src/main/java/org/apache/rocketmq/common/logging/DefaultJoranConfiguratorExt.java`
#### Snippet
```java

    private void multiplicityWarning(String resourceName, ClassLoader classLoader) {
        Set<URL> urlSet = null;
        try {
            urlSet = Loader.getResources(resourceName, classLoader);
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `common/src/main/java/org/apache/rocketmq/common/stats/MomentStatsItem.java`
#### Snippet
```java

                    MomentStatsItem.this.value.set(0);
                } catch (Throwable e) {
                }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `test/src/main/java/org/apache/rocketmq/test/util/MQWait.java`
#### Snippet
```java
                    recvAll = true;
                    break;
                } catch (Throwable e) {
                }
                TestUtil.waitForMonment(500);
```

### CatchMayIgnoreException
Empty `catch` block
in `common/src/main/java/org/apache/rocketmq/common/consistenthash/ConsistentHashRouter.java`
#### Snippet
```java
            try {
                instance = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `test/src/main/java/org/apache/rocketmq/test/util/MQAdminTestUtils.java`
#### Snippet
```java
            mqAdminExt.start();
            mqAdminExt.createTopic(clusterName, topic, queueNum, attributes);
        } catch (Exception e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `test/src/main/java/org/apache/rocketmq/test/util/MQAdminTestUtils.java`
#### Snippet
```java
            TopicStatsTable topicInfo = mqAdminExt.examineTopicStats(topic);
            createResult = !topicInfo.getOffsetTable().isEmpty();
        } catch (Exception e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `store/src/main/java/org/apache/rocketmq/store/MappedFileQueue.java`
#### Snippet
```java
                            try {
                                Thread.sleep(deleteFilesInterval);
                            } catch (InterruptedException e) {
                            }
                        }
```

### CatchMayIgnoreException
Empty `catch` block
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java

            return dispatchRequest;
        } catch (Exception e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `store/src/main/java/org/apache/rocketmq/store/ha/autoswitch/AutoSwitchHAService.java`
#### Snippet
```java
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
```

### CatchMayIgnoreException
Empty `catch` block
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                lock.release();
                lockFile.close();
            } catch (IOException e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                            }
                        }
                    } catch (Exception e) {
                    }
                }
```

### CatchMayIgnoreException
Empty `catch` block
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                long storeTime = this.getCommitLog().pickupStoreTimestamp(phyOffset, size);
                return storeTime;
            } catch (Exception e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `store/src/main/java/org/apache/rocketmq/store/stats/BrokerStatsManager.java`
#### Snippet
```java
        try {
            return this.statsTable.get(statsName).getStatsItem(statsKey);
        } catch (Exception e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ProcessQueue.java`
#### Snippet
```java
            info.setLastPullTimestamp(this.lastPullTimestamp);
            info.setLastConsumeTimestamp(this.lastConsumeTimestamp);
        } catch (Exception e) {
        } finally {
            this.treeMapLock.readLock().unlock();
```

### CatchMayIgnoreException
Empty `catch` block
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ProcessQueue.java`
#### Snippet
```java
                this.treeMapLock.readLock().unlock();
            }
        } catch (InterruptedException e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                                context.getProducer().executeSendMessageHookAfter(context);
                            }
                        } catch (Throwable e) {
                        }

```

### CatchMayIgnoreException
Empty `catch` block
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                            try {
                                sendCallback.onSuccess(sendResult);
                            } catch (Throwable e) {
                            }

```

### CatchMayIgnoreException
Empty `catch` block
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                }
                while (p != null);
            } catch (LookaheadSuccess ls) {
            }
        }
```

### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        try {
            scheduledExecutorService.awaitTermination(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException ignore) {
            BrokerController.LOG.warn("shutdown ScheduledExecutorService was Interrupted!  ", ignore);
            Thread.currentThread().interrupt();
```

### CatchMayIgnoreException
Empty `catch` block
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        if (!isShouldRunning()) {
```

### CatchMayIgnoreException
Empty `catch` block
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
                    }
                }
            } catch (Throwable e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
            selectMappedBufferResult.getByteBuffer().get(body);
            request.setBody(body);
        } catch (UnknownHostException e) {
        } finally {
            if (selectMappedBufferResult != null) {
```

### CatchMayIgnoreException
Empty `catch` block
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
            try {
                executorService.awaitTermination(5000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
            }

```

### CatchMayIgnoreException
Empty `catch` block
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e1) {
                            }
                        } catch (MQClientException e) {
```

### CatchMayIgnoreException
Empty `catch` block
in `example/src/main/java/org/apache/rocketmq/example/benchmark/TransactionProducer.java`
#### Snippet
```java
                                try {
                                    Thread.sleep(config.sendInterval);
                                } catch (InterruptedException e) {
                                }
                            }
```

### CatchMayIgnoreException
Empty `catch` block
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e1) {
                            }
                            statsBenchmark.getSendRequestFailedCount().increment();
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `common/src/main/java/org/apache/rocketmq/common/utils/IOTinyUtils.java`
#### Snippet
```java
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            os.write(data.getBytes(encoding));
        } finally {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `test/src/main/java/org/apache/rocketmq/test/schema/SchemaTools.java`
#### Snippet
```java
        Map<String, TreeMap<String, String>> schemaMap = new TreeMap<>();
        for (File file: dir.listFiles()) {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            String line = null;
            TreeMap<String, String> kvs = new TreeMap<>();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `proxy/src/main/java/org/apache/rocketmq/proxy/remoting/MultiProtocolTlsHelper.java`
#### Snippet
```java
public class MultiProtocolTlsHelper extends TlsHelper {
    private final static Logger log = LoggerFactory.getLogger(LoggerName.PROXY_LOGGER_NAME);
    private static final DecryptionStrategy DECRYPTION_STRATEGY = (privateKeyEncryptPath, forClient) -> new FileInputStream(privateKeyEncryptPath);

    public static SslContext buildSslContext() throws IOException, CertificateException {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `controller/src/main/java/org/apache/rocketmq/controller/ControllerStartup.java`
#### Snippet
```java
            String file = commandLine.getOptionValue('c');
            if (file != null) {
                InputStream in = new BufferedInputStream(new FileInputStream(file));
                properties = new Properties();
                properties.load(in);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `container/src/main/java/org/apache/rocketmq/container/BrokerContainerStartup.java`
#### Snippet
```java

        public Properties loadConfig() throws Exception {
            InputStream in = new BufferedInputStream(new FileInputStream(file));
            Properties properties = new Properties();
            properties.load(in);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/TlsHelper.java`
#### Snippet
```java
        public InputStream decryptPrivateKey(final String privateKeyEncryptPath,
            final boolean forClient) throws IOException {
            return new FileInputStream(privateKeyEncryptPath);
        }
    };
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/TlsHelper.java`
#### Snippet
```java
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(configFile);
            properties.load(inputStream);
        } catch (IOException ignore) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/TlsHelper.java`
#### Snippet
```java

                return sslContextBuilder.keyManager(
                    !isNullOrEmpty(tlsClientCertPath) ? new FileInputStream(tlsClientCertPath) : null,
                    !isNullOrEmpty(tlsClientKeyPath) ? decryptionStrategy.decryptPrivateKey(tlsClientKeyPath, true) : null,
                    !isNullOrEmpty(tlsClientKeyPassword) ? tlsClientKeyPassword : null)
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/TlsHelper.java`
#### Snippet
```java
            } else {
                SslContextBuilder sslContextBuilder = SslContextBuilder.forServer(
                    !isNullOrEmpty(tlsServerCertPath) ? new FileInputStream(tlsServerCertPath) : null,
                    !isNullOrEmpty(tlsServerKeyPath) ? decryptionStrategy.decryptPrivateKey(tlsServerKeyPath, false) : null,
                    !isNullOrEmpty(tlsServerKeyPassword) ? tlsServerKeyPassword : null)
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `common/src/main/java/org/apache/rocketmq/common/CountDownLatch2.java`
#### Snippet
```java
        }

        protected void reset() {
            setState(startCount);
        }
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
                if (mqSet != null && cidAll != null) {
                    List<MessageQueue> mqAll = new ArrayList<>();
                    mqAll.addAll(mqSet);

                    Collections.sort(mqAll);
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPullConsumerImpl.java`
#### Snippet
```java
            Set<MessageQueue> mqs = new HashSet<>();
            Set<MessageQueue> allocateMq = this.rebalanceImpl.getProcessQueueTable().keySet();
            mqs.addAll(allocateMq);
            this.offsetStore.persistAll(mqs);
        } catch (Exception e) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
        Set<SubscriptionData> subSet = new HashSet<>();

        subSet.addAll(this.rebalanceImpl.getSubscriptionInner().values());

        return subSet;
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java
            Set<MessageQueue> mqs = new HashSet<>();
            Set<MessageQueue> allocateMq = this.rebalanceImpl.getProcessQueueTable().keySet();
            mqs.addAll(allocateMq);

            this.offsetStore.persistAll(mqs);
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `broker/src/main/java/org/apache/rocketmq/broker/client/ConsumerGroupInfo.java`
#### Snippet
```java
        List<Channel> result = new ArrayList<>();

        result.addAll(this.channelInfoTable.keySet());

        return result;
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `broker/src/main/java/org/apache/rocketmq/broker/processor/QueryAssignmentProcessor.java`
#### Snippet
```java

                List<MessageQueue> mqAll = new ArrayList<>();
                mqAll.addAll(mqSet);
                Collections.sort(mqAll);
                Collections.sort(cidAll);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `common/src/main/java/org/apache/rocketmq/common/logging/DefaultJoranConfiguratorExt.java`
#### Snippet
```java
            sm.add(new InfoStatus("Could NOT find resource [" + resourceName + "]", context));
        } else {
            sm.add(new InfoStatus("Found resource [" + resourceName + "] at [" + url.toString() + "]", context));
            multiplicityWarning(resourceName, classLoader);
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
        requestHeader.setTranStateTableOffset(sendResult.getQueueOffset());
        requestHeader.setMsgId(sendResult.getMsgId());
        String remark = localException != null ? ("executeLocalTransactionBranch exception: " + localException.toString()) : null;
        this.mQClientFactory.getMQClientAPIImpl().endTransactionOneway(brokerAddr, requestHeader, remark,
            this.defaultMQProducer.getSendMsgTimeout());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/NettyRemotingClient.java`
#### Snippet
```java
                    return cw.getChannel();
                } else {
                    LOGGER.warn("createChannel: connect remote host[" + addr + "] failed, " + channelFuture.toString());
                }
            } else {
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `FlushCommitLogService` may be 'static'
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
    }

    abstract class FlushCommitLogService extends ServiceThread {
        protected static final int RETRY_TIMES_OVER = 10;
    }
```

### InnerClassMayBeStatic
Inner class `BatchDispatchRequest` may be 'static'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
    }

    class BatchDispatchRequest {

        private ByteBuffer byteBuffer;
```

### InnerClassMayBeStatic
Inner class `DispatchRequestOrderlyQueue` may be 'static'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
    }

    class DispatchRequestOrderlyQueue {

        DispatchRequest[][] buffer;
```

### InnerClassMayBeStatic
Inner class `MessageQueueState` may be 'static'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/AssignedMessageQueue.java`
#### Snippet
```java
    }

    private class MessageQueueState {
        private MessageQueue messageQueue;
        private ProcessQueue processQueue;
```

### InnerClassMayBeStatic
Inner class `EncodeResult` may be 'static'
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
    }

    class EncodeResult {
        private String queueOffsetKey;
        private ByteBuffer data;
```

### InnerClassMayBeStatic
Inner class `AbstractStateService` may be 'static'
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
    }

    abstract class AbstractStateService extends ServiceThread {
        public static final int INITIAL = -1, START = 0, WAITING = 1, RUNNING = 2, END = 3;
        protected int state = INITIAL;
```

### InnerClassMayBeStatic
Inner class `ConsumeRequest` may be 'static'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
    }

    public class ConsumeRequest {
        private final List<MessageExt> messageExts;
        private final MessageQueue messageQueue;
```

### InnerClassMayBeStatic
Inner class `FaultItem` may be 'static'
in `client/src/main/java/org/apache/rocketmq/client/latency/LatencyFaultToleranceImpl.java`
#### Snippet
```java
    }

    class FaultItem implements Comparable<FaultItem> {
        private final String name;
        private volatile long currentLatency;
```

### InnerClassMayBeStatic
Inner class `PushReplyResult` may be 'static'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/ReplyMessageProcessor.java`
#### Snippet
```java
    }

    class PushReplyResult {
        boolean pushOk;
        String remark;
```

### InnerClassMayBeStatic
Inner class `PopCheckPointWrapper` may be 'static'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
    }

    public class PopCheckPointWrapper {
        private final int reviveQueueId;
        // -1: not stored, >=0: stored, Long.MAX: storing.
```

### InnerClassMayBeStatic
Inner class `QueueWithTime` may be 'static'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
    }

    public class QueueWithTime<T> {
        private final LinkedBlockingDeque<T> queue;
        private long time;
```

### InnerClassMayBeStatic
Inner class `MsgMeta` may be 'static'
in `example/src/main/java/org/apache/rocketmq/example/benchmark/TransactionProducer.java`
#### Snippet
```java
    private final LRUMap<Long, Integer> cache = new LRUMap<>(200000);

    private class MsgMeta {
        long batchId;
        long msgId;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `common/src/main/java/org/apache/rocketmq/common/utils/ServiceProvider.java`
#### Snippet
```java
            classLoader = Thread.currentThread().getContextClassLoader();
        } catch (SecurityException ex) {
            /**
             * The getContextClassLoader() method throws SecurityException when the context
             * class loader isn't an ancestor of the calling class's class
```

### DanglingJavadoc
Dangling Javadoc comment
in `common/src/main/java/org/apache/rocketmq/common/namesrv/NamesrvConfig.java`
#### Snippet
```java
 */

/**
 * $Id: NamesrvConfig.java 1839 2013-05-16 02:12:02Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `store/src/main/java/org/apache/rocketmq/store/MessageExtEncoder.java`
#### Snippet
```java
    public PutMessageResult encode(MessageExtBrokerInner msgInner) {
        this.byteBuf.clear();
        /**
         * Serialize message
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java
    @Override
    public CqUnit getEarliestUnit() {
        /**
         * here maybe should not return null
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
                }
            } else {
                /**
                 *  It will go to here under two conditions:
                 1. the files number is 1, and it has no data
```

### DanglingJavadoc
Dangling Javadoc comment
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        }

        /**
         * 1. Make sure the fast-forward messages to be truncated during the recovering according to the max physical offset of the commitlog;
         * 2. DLedger committedPos may be missing, so the maxPhysicalPosInLogicQueue maybe bigger that maxOffset returned by DLedgerCommitLog, just let it go;
```

### DanglingJavadoc
Dangling Javadoc comment
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        if (maxPhysicalPosInLogicQueue < this.commitLog.getMinOffset()) {
            maxPhysicalPosInLogicQueue = this.commitLog.getMinOffset();
            /**
             * This happens in following conditions:
             * 1. If someone removes all the consumequeue files or the disk get damaged.
```

### DanglingJavadoc
Dangling Javadoc comment
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        this.reputMessageService.setReputFromOffset(maxPhysicalPosInLogicQueue);

        /**
         *  1. Finish dispatching the messages fall behind, then to start other services.
         *  2. DLedger committedPos may be missing, so here just require dispatchBehindBytes <= 0
```

### DanglingJavadoc
Dangling Javadoc comment
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
            String key = msgInner.getTopic() + "-" + msgInner.getQueueId();

            /**
             * Serialize message
             */
```

### DanglingJavadoc
Dangling Javadoc comment
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalancePushImpl.java`
#### Snippet
```java
    @Override
    public void messageQueueChanged(String topic, Set<MessageQueue> mqAll, Set<MessageQueue> mqDivided) {
        /**
         * When rebalance result changed, should update subscription's version to notify broker.
         * Fix: inconsistency subscription may lead to consumer miss messages.
```

### DanglingJavadoc
Dangling Javadoc comment
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java

    @Deprecated
    /**
     * The method is deprecated because its name is ambiguous, this method relies on the background thread commit consumerOffset rather than the synchronous commit offset.
     * The method is expected to be removed after version 5.1.0. It is recommended to use the {@link #commit()} method.
```

### DanglingJavadoc
Dangling Javadoc comment
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java

    @Deprecated
    /**
     * The method is deprecated because its name is ambiguous, this method relies on the background thread commit consumerOffset rather than the synchronous commit offset.
     * The method is expected to be removed after version 5.1.0. It is recommended to use the {@link #commit(java.util.Map, boolean)} method.
```

### DanglingJavadoc
Dangling Javadoc comment
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
    private String defaultAclFile;

    private Map<String/** fileFullPath **/, Map<String/** AccessKey **/, PlainAccessResource>> aclPlainAccessResourceMap = new HashMap<>();

    private Map<String/** AccessKey **/, String/** fileFullPath **/> accessKeyTable = new HashMap<>();
```

### DanglingJavadoc
Dangling Javadoc comment
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
    private String defaultAclFile;

    private Map<String/** fileFullPath **/, Map<String/** AccessKey **/, PlainAccessResource>> aclPlainAccessResourceMap = new HashMap<>();

    private Map<String/** AccessKey **/, String/** fileFullPath **/> accessKeyTable = new HashMap<>();
```

### DanglingJavadoc
Dangling Javadoc comment
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
    private boolean isWatchStart;

    private Map<String/** fileFullPath **/, DataVersion> dataVersionMap = new HashMap<>();

    @Deprecated
```

### DanglingJavadoc
Dangling Javadoc comment
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
    private RemoteAddressStrategyFactory remoteAddressStrategyFactory = new RemoteAddressStrategyFactory();

    private Map<String/** fileFullPath **/, List<RemoteAddressStrategy>> globalWhiteRemoteAddressStrategyMap = new HashMap<>();

    private boolean isWatchStart;
```

### DanglingJavadoc
Dangling Javadoc comment
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
    private Map<String/** fileFullPath **/, Map<String/** AccessKey **/, PlainAccessResource>> aclPlainAccessResourceMap = new HashMap<>();

    private Map<String/** AccessKey **/, String/** fileFullPath **/> accessKeyTable = new HashMap<>();

    private List<RemoteAddressStrategy> globalWhiteRemoteAddressStrategy = new ArrayList<>();
```

### DanglingJavadoc
Dangling Javadoc comment
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
    private Map<String/** fileFullPath **/, Map<String/** AccessKey **/, PlainAccessResource>> aclPlainAccessResourceMap = new HashMap<>();

    private Map<String/** AccessKey **/, String/** fileFullPath **/> accessKeyTable = new HashMap<>();

    private List<RemoteAddressStrategy> globalWhiteRemoteAddressStrategy = new ArrayList<>();
```

### DanglingJavadoc
Dangling Javadoc comment
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SimpleCharStream.java`
#### Snippet
```java

    @Deprecated
    /**
     * @deprecated
     * @see #getEndColumn
```

### DanglingJavadoc
Dangling Javadoc comment
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SimpleCharStream.java`
#### Snippet
```java

    @Deprecated
    /**
     * @deprecated
     * @see #getEndLine
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.fastRemotingServer.registerProcessor(RequestCode.SEND_BATCH_MESSAGE, sendMessageProcessor, this.sendMessageExecutor);
        this.fastRemotingServer.registerProcessor(RequestCode.CONSUMER_SEND_MSG_BACK, sendMessageProcessor, this.sendMessageExecutor);
        /**
         * PullMessageProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.remotingServer.registerProcessor(RequestCode.LITE_PULL_MESSAGE, this.pullMessageProcessor, this.litePullMessageExecutor);
        this.pullMessageProcessor.registerConsumeMessageHook(consumeMessageHookList);
        /**
         * PeekMessageProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
         */
        this.remotingServer.registerProcessor(RequestCode.PEEK_MESSAGE, this.peekMessageProcessor, this.pullMessageExecutor);
        /**
         * PopMessageProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.remotingServer.registerProcessor(RequestCode.POP_MESSAGE, this.popMessageProcessor, this.pullMessageExecutor);

        /**
         * AckMessageProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.remotingServer.registerProcessor(RequestCode.ACK_MESSAGE, this.ackMessageProcessor, this.ackMessageExecutor);
        this.fastRemotingServer.registerProcessor(RequestCode.ACK_MESSAGE, this.ackMessageProcessor, this.ackMessageExecutor);
        /**
         * ChangeInvisibleTimeProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.remotingServer.registerProcessor(RequestCode.CHANGE_MESSAGE_INVISIBLETIME, this.changeInvisibleTimeProcessor, this.ackMessageExecutor);
        this.fastRemotingServer.registerProcessor(RequestCode.CHANGE_MESSAGE_INVISIBLETIME, this.changeInvisibleTimeProcessor, this.ackMessageExecutor);
        /**
         * notificationProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.remotingServer.registerProcessor(RequestCode.NOTIFICATION, this.notificationProcessor, this.pullMessageExecutor);

        /**
         * pollingInfoProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.remotingServer.registerProcessor(RequestCode.POLLING_INFO, this.pollingInfoProcessor, this.pullMessageExecutor);

        /**
         * ReplyMessageProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.fastRemotingServer.registerProcessor(RequestCode.SEND_REPLY_MESSAGE_V2, replyMessageProcessor, replyMessageExecutor);

        /**
         * QueryMessageProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.fastRemotingServer.registerProcessor(RequestCode.VIEW_MESSAGE_BY_ID, queryProcessor, this.queryMessageExecutor);

        /**
         * ClientManageProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.fastRemotingServer.registerProcessor(RequestCode.CHECK_CLIENT_CONFIG, clientManageProcessor, this.clientManageExecutor);

        /**
         * ConsumerManageProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.fastRemotingServer.registerProcessor(RequestCode.QUERY_CONSUMER_OFFSET, consumerManageProcessor, this.consumerManageExecutor);

        /**
         * QueryAssignmentProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
        this.fastRemotingServer.registerProcessor(RequestCode.SET_MESSAGE_REQUEST_MODE, queryAssignmentProcessor, loadBalanceExecutor);

        /**
         * EndTransactionProcessor
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/EndTransactionResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: EndTransactionResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/UpdateConsumerOffsetRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: UpdateConsumerOffsetRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/GetMinOffsetRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: GetMinOffsetRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/ViewMessageRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: ViewMessageRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/route/TopicRouteData.java`
#### Snippet
```java
 */

/**
 * $Id: TopicRouteData.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/GetSubscriptionGroupConfigRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: GetAllTopicConfigResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/PullMessageResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: PullMessageResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/QueryTopicConsumeByWhoRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: QueryMessageRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/SendMessageRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: SendMessageRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/QuerySubscriptionByConsumerRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: QueryMessageRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/GetMinOffsetResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: GetMinOffsetResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/QueryCorrectionOffsetHeader.java`
#### Snippet
```java
 */

/**
 * $Id: GetMinOffsetRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/QueryTopicsByConsumerRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: QueryMessageRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/QueryConsumerOffsetResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: QueryConsumerOffsetResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/UpdateGroupForbiddenRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: CreateTopicRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/GetEarliestMsgStoretimeRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: GetEarliestMsgStoretimeRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/QueryMessageRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: QueryMessageRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/DeleteTopicRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: DeleteTopicRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/CloneGroupOffsetRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: DeleteTopicRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/GetAllTopicConfigResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: GetAllTopicConfigResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/QueryConsumerOffsetRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: QueryConsumerOffsetRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/GetEarliestMsgStoretimeResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: GetEarliestMsgStoretimeResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/ViewMessageResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: ViewMessageResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/CheckTransactionStateRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: EndTransactionRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/SearchOffsetRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: SearchOffsetRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/GetMaxOffsetRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: GetMaxOffsetRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/GetMaxOffsetResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: GetMaxOffsetResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/SearchOffsetResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: SearchOffsetResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/GetBrokerConfigResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: GetBrokerConfigResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/CheckTransactionStateResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: EndTransactionResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/UpdateConsumerOffsetResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: UpdateConsumerOffsetResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/QueryMessageResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: QueryMessageResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/CreateTopicRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: CreateTopicRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/namesrv/RegisterBrokerRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: RegisterBrokerRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/SendMessageResponseHeader.java`
#### Snippet
```java
 */

/**
 * $Id: SendMessageResponseHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/namesrv/RegisterOrderTopicRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: RegisterOrderTopicRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/namesrv/GetRouteInfoRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: GetRouteInfoRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/namesrv/UnRegisterBrokerRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: UnRegisterBrokerRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/header/PullMessageRequestHeader.java`
#### Snippet
```java
 */

/**
 * $Id: PullMessageRequestHeader.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/ProducerData.java`
#### Snippet
```java
 */

/**
 * $Id: ProducerData.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/ConsumeType.java`
#### Snippet
```java
 */

/**
 * $Id: ConsumeType.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/MessageModel.java`
#### Snippet
```java
 */

/**
 * $Id: MessageModel.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/HeartbeatData.java`
#### Snippet
```java
 */

/**
 * $Id: HeartbeatData.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/ConsumerData.java`
#### Snippet
```java
 */

/**
 * $Id: ConsumerData.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/SubscriptionData.java`
#### Snippet
```java
 */

/**
 * $Id: SubscriptionData.java 1835 2013-05-16 02:00:50Z vintagewang@apache.org $
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `srvutil/src/main/java/org/apache/rocketmq/srvutil/AclFileWatchService.java`
#### Snippet
```java
    private final Map<String, String> fileCurrentHash;
    private Map<String, Long> fileLastModifiedTime;
    private List<String/**absolute pathname **/> fileList = new ArrayList<>();
    private final AclFileWatchService.Listener listener;
    private static final int WATCH_INTERVAL = 5000;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java

    public static boolean isInternalV6IP(InetAddress inetAddr) {
        if (inetAddr.isAnyLocalAddress() // Wild card ipv6
            || inetAddr.isLinkLocalAddress() // Single broadcast ipv6 address: fe80:xx:xx...
            || inetAddr.isLoopbackAddress() //Loopback ipv6 address
```

### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
            return true;
        } else if (ip[0] == (byte) 172) {
            if (ip[1] >= (byte) 16 && ip[1] <= (byte) 31) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
            }
        } else if (ip[0] == (byte) 192) {
            if (ip[1] == (byte) 168) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/apache/rocketmq/common/filter/ExpressionType.java`
#### Snippet
```java

    public static boolean isTagType(String type) {
        if (type == null || "".equals(type) || TAG.equals(type)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/apache/rocketmq/common/message/MessageQueue.java`
#### Snippet
```java
            return false;
        if (topic == null) {
            if (other.topic != null)
                return false;
        } else if (!topic.equals(other.topic))
```

### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/apache/rocketmq/common/message/MessageQueue.java`
#### Snippet
```java
            if (other.topic != null)
                return false;
        } else if (!topic.equals(other.topic))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/apache/rocketmq/common/message/MessageQueueForC.java`
#### Snippet
```java
            return false;

        if (offset != other.offset) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java

    public boolean isReadable() {
        if ((this.flagBits & NOT_READABLE_BIT) == 0) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java
    //for consume queue, just ignore the DISK_FULL_BIT
    public boolean isCQWriteable() {
        if ((this.flagBits & (NOT_WRITEABLE_BIT | WRITE_LOGICS_QUEUE_ERROR_BIT | WRITE_INDEX_FILE_ERROR_BIT)) == 0) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java

    public boolean isIndexFileError() {
        if ((this.flagBits & WRITE_INDEX_FILE_ERROR_BIT) == WRITE_INDEX_FILE_ERROR_BIT) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java

    public boolean isWriteable() {
        if ((this.flagBits & (NOT_WRITEABLE_BIT | WRITE_LOGICS_QUEUE_ERROR_BIT | DISK_FULL_BIT | WRITE_INDEX_FILE_ERROR_BIT)) == 0) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/RunningFlags.java`
#### Snippet
```java

    public boolean isLogicsQueueError() {
        if ((this.flagBits & WRITE_LOGICS_QUEUE_ERROR_BIT) == WRITE_LOGICS_QUEUE_ERROR_BIT) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `proxy/src/main/java/org/apache/rocketmq/proxy/processor/ReceiptHandleProcessor.java`
#### Snippet
```java
        if (t instanceof ProxyException) {
            ProxyException proxyException = (ProxyException) t;
            if (ProxyExceptionCode.INVALID_BROKER_NAME.equals(proxyException.getCode()) ||
                ProxyExceptionCode.INVALID_RECEIPT_HANDLE.equals(proxyException.getCode())) {
                return false;
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueueExt.java`
#### Snippet
```java
            if (tagsCode != cqExtUnit.tagsCode)
                return false;
            if (!Arrays.equals(filterBitMap, cqExtUnit.filterBitMap))
                return false;

```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/AllocateMappedFileService.java`
#### Snippet
```java
            } else if (!filePath.equals(other.filePath))
                return false;
            if (fileSize != other.fileSize)
                return false;
            return true;
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/MappedFileQueue.java`
#### Snippet
```java
            return true;
        }
        if (mappedFileLast.isFull()) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/MappedFileQueue.java`
#### Snippet
```java
        }
        MappedFile mappedFileLast = getLastMappedFile();
        if (mappedFileLast.getWrotePosition() + msgSize > mappedFileLast.getFileSize()) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/ha/DefaultHAService.java`
#### Snippet
```java

    protected boolean isInSyncSlave(final long masterPutWhere, HAConnection conn) {
        if (masterPutWhere - conn.getSlaveAckOffset() < this.defaultMessageStore.getMessageStoreConfig()
            .getHaMaxGapNotInSync()) {
            return true;
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
        }

        if (BrokerRole.SYNC_MASTER != this.defaultMessageStore.getMessageStoreConfig().getBrokerRole()) {
            // No need to check ha in async or slave broker
            return false;
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java

            boolean needAssignOffset = true;
            if (defaultMessageStore.getMessageStoreConfig().isDuplicationEnable()
                && defaultMessageStore.getMessageStoreConfig().getBrokerRole() != BrokerRole.SLAVE) {
                needAssignOffset = false;
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java
        String multiDispatchQueue = prop.get(MessageConst.PROPERTY_INNER_MULTI_DISPATCH);
        String multiQueueOffset = prop.get(MessageConst.PROPERTY_INNER_MULTI_QUEUE_OFFSET);
        if (StringUtils.isBlank(multiDispatchQueue) || StringUtils.isBlank(multiQueueOffset)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/kv/MessageFetcher.java`
#### Snippet
```java

        RemotingCommand response = client.invokeSync(masterAddr, request, 1000 * 30L);
        if (response != null && response.getCode() == ResponseCode.SUCCESS) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/kv/MessageFetcher.java`
#### Snippet
```java

        RemotingCommand response = client.invokeSync(masterAddr, request, 1000 * 30L);
        if (response != null && response.getCode() == ResponseCode.SUCCESS) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/queue/SparseConsumeQueue.java`
#### Snippet
```java
            return true;
        }
        if (mappedFileQueue.getLastMappedFile().getWrotePosition() + BatchConsumeQueue.CQ_STORE_UNIT_SIZE
            > mappedFileQueue.getMappedFileSize()) {
            return true;
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionLog.java`
#### Snippet
```java
            }

            if (messageTotal > this.messageStoreConfig.getMaxTransferCountOnMessageInDisk() - 1) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionLog.java`
#### Snippet
```java
            }

            if (messageTotal > this.messageStoreConfig.getMaxTransferCountOnMessageInMemory() - 1) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullRequest.java`
#### Snippet
```java
            return false;
        if (messageQueue == null) {
            if (other.messageQueue != null)
                return false;
        } else if (!messageQueue.equals(other.messageQueue))
```

### TrivialIf
`if` statement can be simplified
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullRequest.java`
#### Snippet
```java
            if (other.messageQueue != null)
                return false;
        } else if (!messageQueue.equals(other.messageQueue))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopOrderlyService.java`
#### Snippet
```java
                return true;
            }
            if (messageQueue != null && messageQueue.equals(other.messageQueue)) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
            return true;
        }
        if (RANDOM.nextInt(1000) > 1000 * (congestNum - storeConfig.getTimerCongestNumEachSlot()) / (storeConfig.getTimerCongestNumEachSlot() + 0.1)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PopRequest.java`
#### Snippet
```java

        if (messageQueue == null) {
            if (other.messageQueue != null)
                return false;
        } else if (!messageQueue.equals(other.messageQueue)) {
```

### TrivialIf
`if` statement can be simplified
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PopRequest.java`
#### Snippet
```java
            if (other.messageQueue != null)
                return false;
        } else if (!messageQueue.equals(other.messageQueue)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `client/src/main/java/org/apache/rocketmq/client/trace/hook/SendMessageTraceHookImpl.java`
#### Snippet
```java
        int costTime = (int) ((System.currentTimeMillis() - traceContext.getTimeStamp()) / traceContext.getTraceBeans().size());
        traceContext.setCostTime(costTime);
        if (context.getSendResult().getSendStatus().equals(SendStatus.SEND_OK)) {
            traceContext.setSuccess(true);
        } else {
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/util/BloomFilterData.java`
#### Snippet
```java
        if (bitNum != that.bitNum)
            return false;
        if (!Arrays.equals(bitPos, that.bitPos))
            return false;

```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/util/BloomFilter.java`
#### Snippet
```java
        if (m != that.m)
            return false;
        if (n != that.n)
            return false;

```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/util/BloomFilter.java`
#### Snippet
```java
     */
    public boolean isValid(BloomFilterData filterData) {
        if (filterData == null
            || filterData.getBitNum() != this.m
            || filterData.getBitPos() == null
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/util/BitsArray.java`
#### Snippet
```java

        boolean value = getBit(bitPos);
        if (value ^ set) {
            setBit(bitPos, true);
        } else {
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                if (jj_3R_10()) {
                    jjScanpos = xsp;
                    if (jj_3R_11())
                        return true;
                }
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(32))
            return true;
        if (jj_3R_7())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
            }
        }
        if (jj_scan_token(30))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    private boolean jj_3R_22() {
        if (jj_scan_token(TRUE))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(31))
            return true;
        if (jj_3R_7())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    private boolean jj_3R_11() {
        if (jj_3R_12())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                                if (jj_3R_41()) {
                                    jjScanpos = xsp;
                                    if (jj_3_3())
                                        return true;
                                }
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(IS))
            return true;
        if (jj_scan_token(NULL))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(AND))
            return true;
        if (jj_3R_7())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(29))
            return true;
        if (jj_3R_27())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    private boolean jj_3R_24() {
        if (jj_scan_token(NULL))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(26))
            return true;
        if (jj_3R_7())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    private boolean jj_3R_20() {
        if (jj_scan_token(DECIMAL_LITERAL))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(22))
            return true;
        if (jj_3R_30())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                if (jj_3_1()) {
                    jjScanpos = xsp;
                    if (jj_3R_35())
                        return true;
                }
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(OR))
            return true;
        if (jj_3R_25())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    private boolean jj_3R_27() {
        if (jj_scan_token(STRING_LITERAL))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    private boolean jj_3R_23() {
        if (jj_scan_token(FALSE))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    private boolean jj_3R_17() {
        if (jj_scan_token(ID))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
            }
        }
        if (jj_scan_token(30))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
            if (jj_3R_14()) {
                jjScanpos = xsp;
                if (jj_3R_15())
                    return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(29))
            return true;
        if (jj_3R_27())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_3R_18())
            return true;
        if (jj_scan_token(30))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(AND))
            return true;
        if (jj_3R_28())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(31))
            return true;
        if (jj_3R_7())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(25))
            return true;
        if (jj_3R_7())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(AND))
            return true;
        if (jj_3R_7())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
                        if (jj_3R_23()) {
                            jjScanpos = xsp;
                            if (jj_3R_24())
                                return true;
                        }
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(27))
            return true;
        if (jj_3R_7())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(23))
            return true;
        if (jj_3R_30())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(24))
            return true;
        if (jj_3R_7())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    private boolean jj_3R_19() {
        if (jj_3R_27())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(NOT))
            return true;
        if (jj_scan_token(NULL))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    private boolean jj_3R_13() {
        if (jj_3R_16())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    private boolean jj_3R_21() {
        if (jj_scan_token(FLOATING_POINT_LITERAL))
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
        if (jj_scan_token(NOT))
            return true;
        if (jj_3R_7())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java

    private boolean jj_3R_14() {
        if (jj_3R_17())
            return true;
        return false;
```

### TrivialIf
`if` statement can be simplified
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                return (JJ_BIT_VEC_2[i2] & l2) != 0L;
            default:
                if ((JJ_BIT_VEC_0[i1] & l1) != 0L)
                    return true;
                return false;
```

### TrivialIf
`if` statement can be simplified
in `broker/src/main/java/org/apache/rocketmq/broker/client/ClientChannelInfo.java`
#### Snippet
```java
        ClientChannelInfo other = (ClientChannelInfo) obj;
        if (channel == null) {
            if (other.channel != null)
                return false;
        } else if (this.channel != other.channel) {
```

### TrivialIf
`if` statement can be simplified
in `broker/src/main/java/org/apache/rocketmq/broker/client/ClientChannelInfo.java`
#### Snippet
```java
            if (other.channel != null)
                return false;
        } else if (this.channel != other.channel) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
                regionId = MixAll.DEFAULT_TRACE_REGION_ID;
            }
            if (traceOn != null && traceOn.equals("false")) {
                sendResult.setTraceOn(false);
            } else {
```

### TrivialIf
`if` statement can be simplified
in `broker/src/main/java/org/apache/rocketmq/broker/filter/ExpressionMessageFilter.java`
#### Snippet
```java
        }
        BloomFilter bloomFilter = this.consumerFilterManager.getBloomFilter();
        if (bloomFilter != null && bloomFilter.isValid(consumerFilterData.getBloomFilterData())) {
            bloomDataValid = true;
        } else {
```

### TrivialIf
`if` statement can be simplified
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
    @Override
    public boolean rejectRequest() {
        if (!this.brokerController.getBrokerConfig().isSlaveReadEnable()
            && this.brokerController.getMessageStoreConfig().getBrokerRole() == BrokerRole.SLAVE) {
            return true;
```

### TrivialIf
`if` statement can be simplified
in `broker/src/main/java/org/apache/rocketmq/broker/processor/SendMessageProcessor.java`
#### Snippet
```java
        }

        if (this.brokerController.getMessageStore().isOSPageCacheBusy() || this.brokerController.getMessageStore().isTransientStorePoolDeficient()) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/TransactionalMessageBridge.java`
#### Snippet
```java

        PutMessageResult result = putMessageReturnResult(makeOpMessageInner(message, opQueue));
        if (result != null && result.getPutMessageStatus() == PutMessageStatus.PUT_OK) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
        }
        boolean force = false;
        if (requestHeader.getForce() != null && requestHeader.getForce()) {
            force = true;
        }
```

### TrivialIf
`if` statement can be simplified
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/TieredMessageStore.java`
#### Snippet
```java
        }

        if (deepStorageLevel.check(TieredMessageStoreConfig.TieredStorageLevel.NOT_IN_MEM)
            && !next.checkInMemByConsumeOffset(topic, queueId, offset, batchSize)) {
            return true;
```

### TrivialIf
`if` statement can be simplified
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/NamespaceUtil.java`
#### Snippet
```java
        }

        if (TopicValidator.isSystemTopic(resource) || MixAll.isSysConsumerGroup(resource)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/route/TopicRouteData.java`
#### Snippet
```java
            return false;
        if (topicQueueMappingByBroker == null) {
            if (other.topicQueueMappingByBroker != null)
                return false;
        } else if (!topicQueueMappingByBroker.equals(other.topicQueueMappingByBroker))
```

### TrivialIf
`if` statement can be simplified
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/route/TopicRouteData.java`
#### Snippet
```java
            if (other.topicQueueMappingByBroker != null)
                return false;
        } else if (!topicQueueMappingByBroker.equals(other.topicQueueMappingByBroker))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/SubscriptionData.java`
#### Snippet
```java
            return false;
        if (expressionType == null) {
            if (other.expressionType != null)
                return false;
        } else if (!expressionType.equals(other.expressionType))
```

### TrivialIf
`if` statement can be simplified
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/SubscriptionData.java`
#### Snippet
```java
            if (other.expressionType != null)
                return false;
        } else if (!expressionType.equals(other.expressionType))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/statictopic/TopicQueueMappingUtils.java`
#### Snippet
```java
                assert oldItem.getQueueId() == newItem.getQueueId();
                assert oldItem.getStartOffset() == newItem.getStartOffset();
                if (oldItem.getLogicOffset() != -1) {
                    assert oldItem.getLogicOffset() == newItem.getLogicOffset();
                }
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `lock`
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java
        if (!collectMap.containsKey(realKey)
            || collectMap.get(realKey) instanceof ListDataCollectorImpl) {
            synchronized (lock) {
                if (!collectMap.containsKey(realKey)
                    || collectMap.get(realKey) instanceof ListDataCollectorImpl) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `lock`
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java
        if (!collectMap.containsKey(realKey)
            || collectMap.get(realKey) instanceof MapDataCollectorImpl) {
            synchronized (lock) {
                if (!collectMap.containsKey(realKey)
                    || collectMap.get(realKey) instanceof MapDataCollectorImpl) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `lock`
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java
        String realKey = key;
        if (!collectMap.containsKey(realKey)) {
            synchronized (lock) {
                if (!collectMap.containsKey(realKey)) {
                    DataCollector collect = (DataCollector) new MapDataCollectorImpl();
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `this.requestsRead`
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java

        private void doCommit() {
            synchronized (this.requestsRead) {
                if (!this.requestsRead.isEmpty()) {
                    for (GroupCommitRequest req : this.requestsRead) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `this.requestsWrite`
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java

        public synchronized boolean putRequest(final GroupCommitRequest request) {
            synchronized (this.requestsWrite) {
                this.requestsWrite.add(request);
            }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `lastBrokerRole`
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        BrokerRole currRole = storeConfig.getBrokerRole();
        if (lastBrokerRole != currRole) {
            synchronized (lastBrokerRole) {
                LOGGER.info("Broker role change from {} to {}", lastBrokerRole, currRole);
                //if change to master, do something
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `this.registerTopics`
in `client/src/main/java/org/apache/rocketmq/client/consumer/DefaultMQPullConsumer.java`
#### Snippet
```java
    @Override
    public void registerMessageQueueListener(String topic, MessageQueueListener listener) {
        synchronized (this.registerTopics) {
            this.registerTopics.add(withNamespace(topic));
            if (listener != null) {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'topicConfig'
in `common/src/main/java/org/apache/rocketmq/common/utils/CleanupPolicyUtils.java`
#### Snippet
```java
    }

    public static CleanupPolicy getDeletePolicy(Optional<TopicConfig> topicConfig) {
        if (!topicConfig.isPresent()) {
            return CleanupPolicy.valueOf(TopicAttributes.CLEANUP_POLICY_ATTRIBUTE.getDefaultValue());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'topicConfig'
in `common/src/main/java/org/apache/rocketmq/common/utils/CleanupPolicyUtils.java`
#### Snippet
```java

public class CleanupPolicyUtils {
    public static boolean isCompaction(Optional<TopicConfig> topicConfig) {
        return Objects.equals(CleanupPolicy.COMPACTION, getDeletePolicy(topicConfig));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'topicConfig'
in `common/src/main/java/org/apache/rocketmq/common/utils/QueueTypeUtils.java`
#### Snippet
```java
public class QueueTypeUtils {

    public static boolean isBatchCq(Optional<TopicConfig> topicConfig) {
        return Objects.equals(CQType.BatchCQ, getCQType(topicConfig));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'topicConfig'
in `common/src/main/java/org/apache/rocketmq/common/utils/QueueTypeUtils.java`
#### Snippet
```java
    }

    public static CQType getCQType(Optional<TopicConfig> topicConfig) {
        if (!topicConfig.isPresent()) {
            return CQType.valueOf(TopicAttributes.QUEUE_TYPE_ATTRIBUTE.getDefaultValue());
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
        }
        File[] files = file.listFiles();
        if (files == null || files.length <= 0) {
            file.delete();
            STORE_LOG.info("delete empty direct, {}", file.getPath());
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItem.java`
#### Snippet
```java

    public StatisticsItem(String statKind, String statObject, String... itemNames) {
        if (itemNames == null || itemNames.length <= 0) {
            throw new InvalidParameterException("StatisticsItem \"itemNames\" is empty");
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `client/src/main/java/org/apache/rocketmq/client/trace/TraceView.java`
#### Snippet
```java
        List<TraceView> messageTraceViewList = new ArrayList<>();
        String messageBody = new String(messageExt.getBody(), StandardCharsets.UTF_8);
        if (messageBody == null || messageBody.length() <= 0) {
            return messageTraceViewList;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `client/src/main/java/org/apache/rocketmq/client/trace/TraceDataEncoder.java`
#### Snippet
```java
    public static List<TraceContext> decoderFromTraceDataString(String traceData) {
        List<TraceContext> resList = new ArrayList<>();
        if (traceData == null || traceData.length() <= 0) {
            return resList;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `client/src/main/java/org/apache/rocketmq/client/latency/LatencyFaultToleranceImpl.java`
#### Snippet
```java
            Collections.sort(tmpList);
            final int half = tmpList.size() / 2;
            if (half <= 0) {
                return tmpList.get(0).getName();
            } else {
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `client/src/main/java/org/apache/rocketmq/client/producer/RequestFutureHolder.java`
#### Snippet
```java
    public synchronized void shutdown(DefaultMQProducerImpl producer) {
        this.producerSet.remove(producer);
        if (this.producerSet.size() <= 0 && null != this.scheduledExecutorService) {
            ScheduledExecutorService executorService = this.scheduledExecutorService;
            this.scheduledExecutorService = null;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `broker/src/main/java/org/apache/rocketmq/broker/processor/SendMessageProcessor.java`
#### Snippet
```java

        String uniqKey = oriProps.get(MessageConst.PROPERTY_UNIQ_CLIENT_MESSAGE_ID_KEYIDX);
        if (uniqKey == null || uniqKey.length() <= 0) {
            uniqKey = MessageClientIDSetter.createUniqID();
            oriProps.put(MessageConst.PROPERTY_UNIQ_CLIENT_MESSAGE_ID_KEYIDX, uniqKey);
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredFileQueue.java`
#### Snippet
```java
        fileSegmentLock.readLock().lock();
        try {
            if (fileSegmentList.size() <= 0) {
                return -1;
            }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `common/src/main/java/org/apache/rocketmq/common/utils/BinaryUtil.java`
#### Snippet
```java

    public static String generateMd5(String bodyStr) {
        byte[] bytes = calculateMd5(bodyStr.getBytes(Charset.forName("UTF-8")));
        return Hex.encodeHexString(bytes, false);
    }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `common/src/main/java/org/apache/rocketmq/common/utils/DataConverter.java`
#### Snippet
```java

public class DataConverter {
    public static Charset charset = Charset.forName("UTF-8");

    public static byte[] Long2Byte(Long v) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `common/src/main/java/org/apache/rocketmq/common/MixAll.java`
#### Snippet
```java

            if (result) {
                return new String(data, "UTF-8");
            }
        }
```

## RuleId[id=ExcessiveRangeCheck]
### ExcessiveRangeCheck
Can be replaced with 'lexState != 0'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
     */
    public void SwitchTo(int lexState) {
        if (lexState >= 1 || lexState < 0)
            throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.",
                TokenMgrError.INVALID_LEXICAL_STATE);
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileOutputStream' used without 'try'-with-resources statement
in `common/src/main/java/org/apache/rocketmq/common/utils/IOTinyUtils.java`
#### Snippet
```java
        FileChannel tc = null;
        try {
            tc = new FileOutputStream(tf).getChannel();
            sc = new FileInputStream(sf).getChannel();
            sc.transferTo(0, sc.size(), tc);
```

### AutoCloseableResource
'FileInputStream' used without 'try'-with-resources statement
in `common/src/main/java/org/apache/rocketmq/common/utils/IOTinyUtils.java`
#### Snippet
```java
        try {
            tc = new FileOutputStream(tf).getChannel();
            sc = new FileInputStream(sf).getChannel();
            sc.transferTo(0, sc.size(), tc);
        } finally {
```

### AutoCloseableResource
'SelectableChannel' used without 'try'-with-resources statement
in `store/src/main/java/org/apache/rocketmq/store/ha/DefaultHAService.java`
#### Snippet
```java
                        for (SelectionKey k : selected) {
                            if (k.isAcceptable()) {
                                SocketChannel sc = ((ServerSocketChannel) k.channel()).accept();

                                if (sc != null) {
```

### AutoCloseableResource
'RandomAccessFile' used without 'try'-with-resources statement
in `store/src/main/java/org/apache/rocketmq/store/logfile/DefaultMappedFile.java`
#### Snippet
```java

        try {
            this.fileChannel = new RandomAccessFile(this.file, "rw").getChannel();
            this.mappedByteBuffer = this.fileChannel.map(MapMode.READ_WRITE, 0, fileSize);
            TOTAL_MAPPED_VIRTUAL_MEMORY.addAndGet(fileSize);
```

### AutoCloseableResource
'ObservableLongGauge' used without 'try'-with-resources statement
in `broker/src/main/java/org/apache/rocketmq/broker/metrics/PopMetricsManager.java`
#### Snippet
```java
            .setDescription("Time number of buffered offset")
            .ofLongs()
            .buildWithCallback(measurement -> calculatePopBufferOffsetSize(brokerController, measurement));
        meter.gaugeBuilder(GAUGE_POP_CHECKPOINT_BUFFER_SIZE)
            .setDescription("The number of buffered checkpoint")
```

### AutoCloseableResource
'ObservableLongGauge' used without 'try'-with-resources statement
in `broker/src/main/java/org/apache/rocketmq/broker/metrics/PopMetricsManager.java`
#### Snippet
```java
            .setDescription("The number of buffered checkpoint")
            .ofLongs()
            .buildWithCallback(measurement -> calculatePopBufferCkSize(brokerController, measurement));
        meter.gaugeBuilder(GAUGE_POP_REVIVE_LAG)
            .setDescription("The processing lag of revive topic")
```

### AutoCloseableResource
'ObservableLongGauge' used without 'try'-with-resources statement
in `broker/src/main/java/org/apache/rocketmq/broker/metrics/PopMetricsManager.java`
#### Snippet
```java
            .setUnit("milliseconds")
            .ofLongs()
            .buildWithCallback(measurement -> calculatePopReviveLag(brokerController, measurement));
        meter.gaugeBuilder(GAUGE_POP_REVIVE_LATENCY)
            .setDescription("The processing latency of revive topic")
```

### AutoCloseableResource
'ObservableLongGauge' used without 'try'-with-resources statement
in `broker/src/main/java/org/apache/rocketmq/broker/metrics/PopMetricsManager.java`
#### Snippet
```java
            .setUnit("milliseconds")
            .ofLongs()
            .buildWithCallback(measurement -> calculatePopReviveLatency(brokerController, measurement));
    }

```

### AutoCloseableResource
'RandomAccessFile' used without 'try'-with-resources statement
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/posix/PosixFileSegment.java`
#### Snippet
```java
                        // TODO use direct IO to avoid polluting the page cache
                        file.createNewFile();
                        this.readFileChannel = new RandomAccessFile(file, "r").getChannel();
                        this.writeFileChannel = new RandomAccessFile(file, "rwd").getChannel();
                        this.file = file;
```

### AutoCloseableResource
'RandomAccessFile' used without 'try'-with-resources statement
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/posix/PosixFileSegment.java`
#### Snippet
```java
                        file.createNewFile();
                        this.readFileChannel = new RandomAccessFile(file, "r").getChannel();
                        this.writeFileChannel = new RandomAccessFile(file, "rwd").getChannel();
                        this.file = file;
                    } catch (Exception e) {
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'ip != null' covered by subsequent condition 'ip instanceof Inet4Address'
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
                while (addresses.hasMoreElements()) {
                    ip = (InetAddress) addresses.nextElement();
                    if (ip != null && ip instanceof Inet4Address) {
                        byte[] ipByte = ip.getAddress();
                        if (ipByte.length == 4) {
```

### ConditionCoveredByFurtherCondition
Condition 'ip != null' covered by subsequent condition 'ip instanceof Inet6Address'
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
                            }
                        }
                    } else if (ip != null && ip instanceof Inet6Address) {
                        byte[] ipByte = ip.getAddress();
                        if (ipByte.length == 16) {
```

### ConditionCoveredByFurtherCondition
Condition 'null == opNew' covered by subsequent condition 'LEFTPARENTHESIS != opNew'
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/PolishExpr.java`
#### Snippet
```java
                    segments.add(opNew);
                }
                if (null == opNew || LEFTPARENTHESIS != opNew)
                    throw new IllegalArgumentException("mismatched parentheses");
            } else if (isOperator(token)) {
```

### ConditionCoveredByFurtherCondition
Condition 'object != null' covered by subsequent condition 'object == Boolean.TRUE'
in `filter/src/main/java/org/apache/rocketmq/filter/expression/UnaryInExpression.java`
#### Snippet
```java
    public boolean matches(EvaluationContext context) throws Exception {
        Object object = evaluate(context);
        return object != null && object == Boolean.TRUE;
    }

```

### ConditionCoveredByFurtherCondition
Condition 'object != null' covered by subsequent condition 'object == Boolean.TRUE'
in `filter/src/main/java/org/apache/rocketmq/filter/expression/BooleanConstantExpression.java`
#### Snippet
```java
    public boolean matches(EvaluationContext context) throws Exception {
        Object object = evaluate(context);
        return object != null && object == Boolean.TRUE;
    }
}
```

### ConditionCoveredByFurtherCondition
Condition 'object != null' covered by subsequent condition 'object == Boolean.TRUE'
in `filter/src/main/java/org/apache/rocketmq/filter/expression/LogicExpression.java`
#### Snippet
```java
    public boolean matches(EvaluationContext context) throws Exception {
        Object object = evaluate(context);
        return object != null && object == Boolean.TRUE;
    }

```

### ConditionCoveredByFurtherCondition
Condition 'object != null' covered by subsequent condition 'object == Boolean.TRUE'
in `filter/src/main/java/org/apache/rocketmq/filter/expression/UnaryExpression.java`
#### Snippet
```java
        public boolean matches(EvaluationContext context) throws Exception {
            Object object = evaluate(context);
            return object != null && object == Boolean.TRUE;
        }
    }
```

### ConditionCoveredByFurtherCondition
Condition 'object != null' covered by subsequent condition 'object == Boolean.TRUE'
in `filter/src/main/java/org/apache/rocketmq/filter/expression/ComparisonExpression.java`
#### Snippet
```java
    public boolean matches(EvaluationContext context) throws Exception {
        Object object = evaluate(context);
        return object != null && object == Boolean.TRUE;
    }

```

### ConditionCoveredByFurtherCondition
Condition 'ret == null' covered by subsequent condition '!(ret instanceof Boolean)'
in `broker/src/main/java/org/apache/rocketmq/broker/filter/ExpressionMessageFilter.java`
#### Snippet
```java
        log.debug("Pull eval result: {}, {}, {}", ret, realFilterData, tempProperties);

        if (ret == null || !(ret instanceof Boolean)) {
            return false;
        }
```

### ConditionCoveredByFurtherCondition
Condition 'ret == null' covered by subsequent condition '!(ret instanceof Boolean)'
in `broker/src/main/java/org/apache/rocketmq/broker/filter/ExpressionForRetryMessageFilter.java`
#### Snippet
```java
        log.debug("Pull eval result: {}, {}, {}", ret, realFilterData, tempProperties);

        if (ret == null || !(ret instanceof Boolean)) {
            return false;
        }
```

### ConditionCoveredByFurtherCondition
Condition 'ret != null' covered by subsequent condition 'ret instanceof Boolean'
in `broker/src/main/java/org/apache/rocketmq/broker/filter/CommitLogDispatcherCalcBitMap.java`
#### Snippet
```java

                // eval true
                if (ret != null && ret instanceof Boolean && (Boolean) ret) {
                    consumerFilterManager.getBloomFilter().hashTo(
                        filterData.getBloomFilterData(),
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/PopRequest.java`
#### Snippet
```java
    }

    public static final Comparator<PopRequest> COMPARATOR = (o1, o2) -> {
        int ret = (int) (o1.getExpired() - o2.getExpired());

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `expression.charAt(...)` to `int` is redundant
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/PolishExpr.java`
#### Snippet
```java

        for (int i = 0; i < size; i++) {
            int chValue = (int) expression.charAt(i);

            if (97 <= chValue && chValue <= 122 || 65 <= chValue && chValue <= 90
```

### RedundantCast
Casting `token` to `Operator` is redundant
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/PolishExpr.java`
#### Snippet
```java

    public static boolean isRightParenthesis(Op token) {
        return token instanceof Operator && RIGHTPARENTHESIS == (Operator) token;
    }

```

### RedundantCast
Casting `token` to `Operator` is redundant
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/PolishExpr.java`
#### Snippet
```java

    public static boolean isLeftParenthesis(Op token) {
        return token instanceof Operator && LEFTPARENTHESIS == (Operator) token;
    }

```

### RedundantCast
Casting `new MapDataCollectorImpl()` to `DataCollector` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java
            synchronized (lock) {
                if (!collectMap.containsKey(realKey)) {
                    DataCollector collect = (DataCollector) new MapDataCollectorImpl();
                    collectMap.put(realKey, collect);
                }
```

### RedundantCast
Casting `size` to `int` is redundant
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueueExt.java`
#### Snippet
```java
        @Override
        public int hashCode() {
            int result = (int) size;
            result = 31 * result + (int) (tagsCode ^ (tagsCode >>> 32));
            result = 31 * result + (int) (msgStoreTime ^ (msgStoreTime >>> 32));
```

### RedundantCast
Casting `(factor * ConsumeQueue.CQ_STORE_UNIT_SIZE)` to `int` is redundant
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java

        int factor = (int) Math.ceil(this.mappedFileSizeConsumeQueue / (ConsumeQueue.CQ_STORE_UNIT_SIZE * 1.0));
        return (int) (factor * ConsumeQueue.CQ_STORE_UNIT_SIZE);
    }

```

### RedundantCast
Casting `i.next()` to `Object` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/expression/UnaryExpression.java`
#### Snippet
```java
                int count = 0;
                for (Iterator i = inList.iterator(); i.hasNext(); ) {
                    Object o = (Object) i.next();
                    if (count != 0) {
                        answer.append(", ");
```

### RedundantCast
Casting `(curChar >> 8)` to `int` is redundant
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParserTokenManager.java`
#### Snippet
```java
                while (i != startsAt);
            } else {
                int hiByte = (int) (curChar >> 8);
                int i1 = hiByte >> 6;
                long l1 = 1L << (hiByte & 077);
```

### RedundantCast
Casting `super.clone()` to `NettyServerConfig` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/NettyServerConfig.java`
#### Snippet
```java
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (NettyServerConfig) super.clone();
    }

```

### RedundantCast
Casting `result` to `Buffer` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/RemotingCommand.java`
#### Snippet
```java
        result.put(headerData);

        ((Buffer) result).flip();

        return result;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param expression` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/PolishExpr.java`
#### Snippet
```java

    /**
     * @param expression
     * @return
     * @throws Exception
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/PolishExpr.java`
#### Snippet
```java
    /**
     * @param expression
     * @return
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/PolishExpr.java`
#### Snippet
```java
     * @param expression
     * @return
     * @throws Exception
     */
    private static List<Op> participle(String expression) {
```

### JavadocDeclaration
Exception is not declared to be thrown by method participle
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/PolishExpr.java`
#### Snippet
```java
     * @param expression
     * @return
     * @throws Exception
     */
    private static List<Op> participle(String expression) {
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/message/MessageExt.java`
#### Snippet
```java
     * achieves topicSysFlag value from transient properties
     *
     * @return
     */
    public Integer getTopicSysFlag() {
```

### JavadocDeclaration
`@param topicSysFlag` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/message/MessageExt.java`
#### Snippet
```java
     * set topicSysFlag to transient properties, or clear it
     *
     * @param topicSysFlag
     */
    public void setTopicSysFlag(Integer topicSysFlag) {
```

### JavadocDeclaration
`@param groupSysFlag` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/message/MessageExt.java`
#### Snippet
```java
     * set groupSysFlag to transient properties, or clear it
     *
     * @param groupSysFlag
     */
    public void setGroupSysFlag(Integer groupSysFlag) {
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/message/MessageExt.java`
#### Snippet
```java
     * achieves groupSysFlag value from transient properties
     *
     * @return
     */
    public Integer getGroupSysFlag() {
```

### JavadocDeclaration
`@param deltas` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/Interceptor.java`
#### Snippet
```java
     * increase multiple values
     *
     * @param deltas
     */
    void inc(long... deltas);
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledPrinter.java`
#### Snippet
```java
        /**
         * whether enabled
         * @return
         */
        boolean enabled();
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledPrinter.java`
#### Snippet
```java
        /**
         * Get initial delay value
         * @return
         */
        long get();
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledPrinter.java`
#### Snippet
```java
        /**
         * whether print zero lines
         * @return
         */
        boolean printZeroLine();
```

### JavadocDeclaration
`@throws` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/compression/Compressor.java`
#### Snippet
```java
     * @param src bytes ready to decompress
     * @return decompressed byte data
     * @throws IOException
     */
    byte[] decompress(byte[] src) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/compression/Compressor.java`
#### Snippet
```java
     * @param level compression level used to balance compression rate and time consumption
     * @return compressed byte data
     * @throws IOException
     */
    byte[] compress(byte[] src, int level) throws IOException;
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsBrief.java`
#### Snippet
```java
     * Getters
     *
     * @return
     */
    public long getMax() {
```

### JavadocDeclaration
`@param item` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItem.java`
#### Snippet
```java
     * subtract another StatisticsItem
     *
     * @param item
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItem.java`
#### Snippet
```java
     *
     * @param item
     * @return
     */
    public StatisticsItem subtract(StatisticsItem item) {
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItem.java`
#### Snippet
```java
     * Warning: no guarantee of itemAccumulates consistency
     *
     * @return
     */
    public StatisticsItem snapshot() {
```

### JavadocDeclaration
`@param kind` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsManager.java`
#### Snippet
```java
     * Increment a StatisticsItem
     *
     * @param kind
     * @param key
     * @param itemAccumulates
```

### JavadocDeclaration
`@param key` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsManager.java`
#### Snippet
```java
     *
     * @param kind
     * @param key
     * @param itemAccumulates
     */
```

### JavadocDeclaration
`@param itemAccumulates` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsManager.java`
#### Snippet
```java
     * @param kind
     * @param key
     * @param itemAccumulates
     */
    public boolean inc(String kind, String key, long... itemAccumulates) {
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledIncrementPrinter.java`
#### Snippet
```java
         * Getters
         *
         * @return
         */
        public long getMax() {
```

### JavadocDeclaration
`@param channel` tag description is missing
in `proxy/src/main/java/org/apache/rocketmq/proxy/remoting/channel/RemotingChannelManager.java`
#### Snippet
```java
    /**
     * to get the org channel pass by nettyRemotingServer
     * @param channel
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `proxy/src/main/java/org/apache/rocketmq/proxy/remoting/channel/RemotingChannelManager.java`
#### Snippet
```java
     * to get the org channel pass by nettyRemotingServer
     * @param channel
     * @return
     */
    protected Channel getOrgRawChannel(Channel channel) {
```

### JavadocDeclaration
`@param newAddress` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/ha/HAClient.java`
#### Snippet
```java
     * Update master address
     *
     * @param newAddress
     */
    void updateMasterAddress(String newAddress);
```

### JavadocDeclaration
`@param haConnectionState` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/ha/HAClient.java`
#### Snippet
```java
     * Change the current state for ha connection for testing
     *
     * @param haConnectionState
     */
    void changeCurrentState(HAConnectionState haConnectionState);
```

### JavadocDeclaration
`@param newAddress` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/ha/HAClient.java`
#### Snippet
```java
     * Update master ha address
     *
     * @param newAddress
     */
    void updateHaMasterAddress(String newAddress);
```

### JavadocDeclaration
`@param phyOffset` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     * Set physical offset
     *
     * @param phyOffset
     */
    void setPhysicalOffset(long phyOffset);
```

### JavadocDeclaration
`@param sendMessageBackHook` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     * Set send message back hook
     *
     * @param sendMessageBackHook
     */
    void setSendMessageBackHook(SendMessageBackHook sendMessageBackHook);
```

### JavadocDeclaration
`@param startOffset` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     * Get last mapped file
     *
     * @param startOffset
     * @return true when get the last mapped file, false when get null
     */
```

### JavadocDeclaration
`@param byteBuffer` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     * Check message and return size
     *
     * @param byteBuffer
     * @param checkCRC
     * @param checkDupInfo
```

### JavadocDeclaration
`@param checkCRC` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     *
     * @param byteBuffer
     * @param checkCRC
     * @param checkDupInfo
     * @param readBody
```

### JavadocDeclaration
`@param checkDupInfo` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     * @param byteBuffer
     * @param checkCRC
     * @param checkDupInfo
     * @param readBody
     * @return DispatchRequest
```

### JavadocDeclaration
`@param readBody` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     * @param checkCRC
     * @param checkDupInfo
     * @param readBody
     * @return DispatchRequest
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     * Get master broker message store in process in broker container
     *
     * @return
     */
    MessageStore getMasterStoreInProcess();
```

### JavadocDeclaration
`@param offset` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     * Use FileChannel to get data
     *
     * @param offset
     * @param size
     * @param byteBuffer
```

### JavadocDeclaration
`@param size` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     *
     * @param offset
     * @param size
     * @param byteBuffer
     * @return
```

### JavadocDeclaration
`@param byteBuffer` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     * @param offset
     * @param size
     * @param byteBuffer
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     * @param size
     * @param byteBuffer
     * @return
     */
    boolean getData(long offset, int size, ByteBuffer byteBuffer);
```

### JavadocDeclaration
`@param masterStoreInProcess` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/MessageStore.java`
#### Snippet
```java
     * Set master broker message store in process
     *
     * @param masterStoreInProcess
     */
    void setMasterStoreInProcess(MessageStore masterStoreInProcess);
```

### JavadocDeclaration
`@param request` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/ha/HAService.java`
#### Snippet
```java
     * Put GroupConnectionStateRequest for preOnline
     *
     * @param request
     */
    void putGroupConnectionStateRequest(HAConnectionStateNotificationRequest request);
```

### JavadocDeclaration
`@param defaultMessageStore` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/ha/HAService.java`
#### Snippet
```java
     * Init HAService, must be called before other methods.
     *
     * @param defaultMessageStore
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/ha/HAService.java`
#### Snippet
```java
     *
     * @param defaultMessageStore
     * @throws IOException
     */
    void init(DefaultMessageStore defaultMessageStore) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/ha/HAService.java`
#### Snippet
```java
     * Start HA Service
     *
     * @throws Exception
     */
    void start() throws Exception;
```

### JavadocDeclaration
`@param newAddr` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/ha/HAService.java`
#### Snippet
```java
     * Update master address
     *
     * @param newAddr
     */
    void updateMasterAddress(String newAddr);
```

### JavadocDeclaration
`@param newAddr` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/ha/HAService.java`
#### Snippet
```java
     * Update ha master address
     *
     * @param newAddr
     */
    void updateHaMasterAddress(String newAddr);
```

### JavadocDeclaration
`@param request` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/ha/HAService.java`
#### Snippet
```java
     * Put request to handle HA
     *
     * @param request
     */
    void putRequest(final CommitLog.GroupCommitRequest request);
```

### JavadocDeclaration
`@param msg` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/hook/PutMessageHook.java`
#### Snippet
```java
    /**
     *  Execute before put message. For example, Message verification or special message transform
     * @param msg
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/hook/PutMessageHook.java`
#### Snippet
```java
     *  Execute before put message. For example, Message verification or special message transform
     * @param msg
     * @return
     */
    PutMessageResult executeBeforePutMessage(MessageExt msg);
```

### JavadocDeclaration
`@param msgList` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/hook/SendMessageBackHook.java`
#### Snippet
```java
     * Slave send message back to master at certain offset when HA handshake
     *
     * @param msgList
     * @param brokerName
     * @param brokerAddr
```

### JavadocDeclaration
`@param brokerName` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/hook/SendMessageBackHook.java`
#### Snippet
```java
     *
     * @param msgList
     * @param brokerName
     * @param brokerAddr
     * @return
```

### JavadocDeclaration
`@param brokerAddr` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/hook/SendMessageBackHook.java`
#### Snippet
```java
     * @param msgList
     * @param brokerName
     * @param brokerAddr
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/hook/SendMessageBackHook.java`
#### Snippet
```java
     * @param brokerName
     * @param brokerAddr
     * @return
     */
    boolean executeSendMessageBack(List<MessageExt> msgList, String brokerName, String brokerAddr);
```

### JavadocDeclaration
`@param timestamp` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
     * Find the message whose timestamp is the smallest, greater than or equal to the given time.
     *
     * @param timestamp
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
     *
     * @param timestamp
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param msgOffset` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
     * Gets SelectMappedBufferResult by batch-message offset
     * Node: the caller is responsible for the release of SelectMappedBufferResult
     * @param msgOffset
     * @return SelectMappedBufferResult
     */
```

### JavadocDeclaration
`@param msgOffset` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/queue/SparseConsumeQueue.java`
#### Snippet
```java
     * Gets SelectMappedBufferResult by batch-message offset, if not found will return the next valid offset buffer
     * Node: the caller is responsible for the release of SelectMappedBufferResult
     * @param msgOffset
     * @return SelectMappedBufferResult
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/logfile/MappedFile.java`
#### Snippet
```java
    /**
     * Get the last flush time
     * @return
     */
    long getLastFlushTime();
```

### JavadocDeclaration
`@param type` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/logfile/MappedFile.java`
#### Snippet
```java
    /**
     * Warm up the mapped bytebuffer
     * @param type
     * @param pages
     */
```

### JavadocDeclaration
`@param pages` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/logfile/MappedFile.java`
#### Snippet
```java
     * Warm up the mapped bytebuffer
     * @param type
     * @param pages
     */
    void warmMappedFile(FlushDiskType type, int pages);
```

### JavadocDeclaration
`@throws` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/logfile/MappedFile.java`
#### Snippet
```java
    /**
     * move the file to the parent directory
     * @throws IOException
     */
    void moveToParent() throws IOException;
```

### JavadocDeclaration
`@return` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/logfile/MappedFile.java`
#### Snippet
```java
    /**
     * Get the underlying file
     * @return
     */
    File getFile();
```

### JavadocDeclaration
`@throws` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/logfile/MappedFile.java`
#### Snippet
```java
     * @param fileSize file size
     * @param transientStorePool transient store pool
     * @throws IOException
     */
    void init(String fileName, int fileSize, TransientStorePool transientStorePool) throws IOException;
```

### JavadocDeclaration
`@param putMessageContext` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/logfile/MappedFile.java`
#### Snippet
```java
     * @param message a message to append
     * @param messageCallback the specific call back to execute the real append action
     * @param putMessageContext
     * @return the append result
     */
```

### JavadocDeclaration
`@param putMessageContext` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/logfile/MappedFile.java`
#### Snippet
```java
     * @param message a message to append
     * @param messageCallback the specific call back to execute the real append action
     * @param putMessageContext
     * @return the append result
     */
```

### JavadocDeclaration
`@param attributes` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/MQAdmin.java`
#### Snippet
```java
     * @param queueNum topic's queue number
     * @param topicSysFlag topic system flag
     * @param attributes
     */
    void createTopic(String key, String newTopic, int queueNum, int topicSysFlag, Map<String, String> attributes)
```

### JavadocDeclaration
`@param attributes` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/MQAdmin.java`
#### Snippet
```java
     * @param newTopic topic name
     * @param queueNum topic's queue number
     * @param attributes
     */
    void createTopic(final String key, final String newTopic, final int queueNum, Map<String, String> attributes)
```

### JavadocDeclaration
`@throws` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java

    /**
     * @throws Exception
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java

    /**
     * @throws IOException
     */
    private void createTempFile() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java

    /**
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
IOException is not declared to be thrown by method load
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java

    /**
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param pushConsumer` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ProcessQueue.java`
#### Snippet
```java

    /**
     * @param pushConsumer
     */
    public void cleanExpiredMsg(DefaultMQPushConsumer pushConsumer) {
```

### JavadocDeclaration
`@param mq` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
    /**
     *
     * @param mq
     * @param invisibleTime
     * @param maxNums
```

### JavadocDeclaration
`@param invisibleTime` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
     *
     * @param mq
     * @param invisibleTime
     * @param maxNums
     * @param consumerGroup
```

### JavadocDeclaration
`@param maxNums` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
     * @param mq
     * @param invisibleTime
     * @param maxNums
     * @param consumerGroup
     * @param timeout
```

### JavadocDeclaration
`@param consumerGroup` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
     * @param invisibleTime
     * @param maxNums
     * @param consumerGroup
     * @param timeout
     * @param popCallback
```

### JavadocDeclaration
`@param timeout` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
     * @param maxNums
     * @param consumerGroup
     * @param timeout
     * @param popCallback
     * @param poll
```

### JavadocDeclaration
`@param popCallback` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
     * @param consumerGroup
     * @param timeout
     * @param popCallback
     * @param poll
     * @param initMode
```

### JavadocDeclaration
`@param poll` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
     * @param timeout
     * @param popCallback
     * @param poll
     * @param initMode
    //     * @param expressionType
```

### JavadocDeclaration
`@param order` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
    //     * @param expressionType
    //     * @param expression
     * @param order
     * @throws MQClientException
     * @throws RemotingException
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
    //     * @param expression
     * @param order
     * @throws MQClientException
     * @throws RemotingException
     * @throws InterruptedException
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
     * @param order
     * @throws MQClientException
     * @throws RemotingException
     * @throws InterruptedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
     * @throws MQClientException
     * @throws RemotingException
     * @throws InterruptedException
     */
    public void popAsync(MessageQueue mq, long invisibleTime, int maxNums, String consumerGroup,
```

### JavadocDeclaration
`@param mq` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
     * When the network is unstable, using this interface may return wrong offset.
     * It is recommended to use computePullFromWhereWithException instead.
     * @param mq
     * @return offset
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/trace/TraceDispatcher.java`
#### Snippet
```java
     * Write flush action
     *
     * @throws IOException
     */
    void flush() throws IOException;
```

### JavadocDeclaration
`@return` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/trace/TraceDispatcher.java`
#### Snippet
```java
     * Append the transferring data
     * @param ctx data information
     * @return
     */
    boolean append(Object ctx);
```

### JavadocDeclaration
`@param traceData` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/trace/TraceDataEncoder.java`
#### Snippet
```java
     * Resolving traceContext list From trace data String
     *
     * @param traceData
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/trace/TraceDataEncoder.java`
#### Snippet
```java
     *
     * @param traceData
     * @return
     */
    public static List<TraceContext> decoderFromTraceDataString(String traceData) {
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/trace/TraceDataEncoder.java`
#### Snippet
```java
     * Encoding the trace context into data strings and keyset sets
     *
     * @param ctx
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/trace/TraceDataEncoder.java`
#### Snippet
```java
     *
     * @param ctx
     * @return
     */
    public static TraceTransferBean encoderFromContextBean(TraceContext ctx) {
```

### JavadocDeclaration
`@param messageQueues` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
     * Specify offset commit
     *
     * @param messageQueues
     * @param persist
     */
```

### JavadocDeclaration
`@param persist` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
     *
     * @param messageQueues
     * @param persist
     */
    public synchronized void commit(final Map<MessageQueue, Long> messageQueues, boolean persist) {
```

### JavadocDeclaration
`@param topic` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
     * subscribe data by customizing messageQueueListener
     *
     * @param topic
     * @param subExpression
     * @param messageQueueListener
```

### JavadocDeclaration
`@param subExpression` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
     *
     * @param topic
     * @param subExpression
     * @param messageQueueListener
     * @throws MQClientException
```

### JavadocDeclaration
`@param messageQueueListener` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
     * @param topic
     * @param subExpression
     * @param messageQueueListener
     * @throws MQClientException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
     * @param subExpression
     * @param messageQueueListener
     * @throws MQClientException
     */
    public synchronized void subscribe(String topic, String subExpression,
```

### JavadocDeclaration
`@return` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
     * Get the queue assigned in subscribe mode
     *
     * @return
     */
    public synchronized Set<MessageQueue> assignment() {
```

### JavadocDeclaration
`@param addr` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java

    /**
     * @param addr
     * @param requestHeader
     * @param timeoutMillis
```

### JavadocDeclaration
`@param requestHeader` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
    /**
     * @param addr
     * @param requestHeader
     * @param timeoutMillis
     * @throws InterruptedException
```

### JavadocDeclaration
`@param timeoutMillis` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
     * @param addr
     * @param requestHeader
     * @param timeoutMillis
     * @throws InterruptedException
     * @throws RemotingTimeoutException
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
     * @param requestHeader
     * @param timeoutMillis
     * @throws InterruptedException
     * @throws RemotingTimeoutException
     * @throws RemotingSendRequestException
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
     * @param timeoutMillis
     * @throws InterruptedException
     * @throws RemotingTimeoutException
     * @throws RemotingSendRequestException
     * @throws RemotingConnectException
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
     * @throws InterruptedException
     * @throws RemotingTimeoutException
     * @throws RemotingSendRequestException
     * @throws RemotingConnectException
     * @throws MQBrokerException
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
     * @throws RemotingTimeoutException
     * @throws RemotingSendRequestException
     * @throws RemotingConnectException
     * @throws MQBrokerException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
     * @throws RemotingSendRequestException
     * @throws RemotingConnectException
     * @throws MQBrokerException
     */
    public GroupForbidden updateAndGetGroupForbidden(String addr, UpdateGroupForbiddenRequestHeader requestHeader,
```

### JavadocDeclaration
`@param messageQueues` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/TopicMessageQueueChangeListener.java`
#### Snippet
```java
     * expanded or shrunk.
     *
     * @param messageQueues
     */
    void onChanged(String topic, Set<MessageQueue> messageQueues);
```

### JavadocDeclaration
`@param messageQueue` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java
     * Get the last committed offset for the given message queue.
     *
     * @param messageQueue
     * @return offset, if offset equals -1 means no offset in broker.
     * @throws MQClientException if there is any client error.
```

### JavadocDeclaration
`@param timestamp` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java
     *
     * @param messageQueue Message queues that needs to get offset by timestamp.
     * @param timestamp
     * @return offset
     * @throws MQClientException if there is any client error.
```

### JavadocDeclaration
`@param topic` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java
    /**
     * Subscribe some topic with subExpression and messageQueueListener
     * @param topic
     * @param subExpression
     * @param messageQueueListener
```

### JavadocDeclaration
`@param subExpression` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java
     * Subscribe some topic with subExpression and messageQueueListener
     * @param topic
     * @param subExpression
     * @param messageQueueListener
     */
```

### JavadocDeclaration
`@param messageQueueListener` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java
     * @param topic
     * @param subExpression
     * @param messageQueueListener
     */
    void subscribe(final String topic, final String subExpression, final MessageQueueListener messageQueueListener) throws MQClientException;
```

### JavadocDeclaration
`@param messageQueue` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java
     * you may lose data if this API is arbitrarily used in the middle of consumption.
     *
     * @param messageQueue
     */
    void seekToBegin(MessageQueue messageQueue)throws MQClientException;
```

### JavadocDeclaration
`@param messageQueue` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java
     * this API is arbitrarily used in the middle of consumption.
     *
     * @param messageQueue
     * @param offset
     */
```

### JavadocDeclaration
`@param offset` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java
     *
     * @param messageQueue
     * @param offset
     */
    void seek(MessageQueue messageQueue, long offset) throws MQClientException;
```

### JavadocDeclaration
`@param messageQueue` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java
     * you may lose data if this API is arbitrarily used in the middle of consumption.
     *
     * @param messageQueue
     */
    void seekToEnd(MessageQueue messageQueue)throws MQClientException;
```

### JavadocDeclaration
`@return` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java
    /**
     * subscribe mode, get assigned MessageQueue
     * @return
     * @throws MQClientException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/LitePullConsumer.java`
#### Snippet
```java
     * subscribe mode, get assigned MessageQueue
     * @return
     * @throws MQClientException
     */
    Set<MessageQueue> assignment() throws MQClientException;
```

### JavadocDeclaration
`@param mq` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/store/OffsetStore.java`
#### Snippet
```java

    /**
     * @param mq
     * @param offset
     * @param isOneway
```

### JavadocDeclaration
`@param offset` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/store/OffsetStore.java`
#### Snippet
```java
    /**
     * @param mq
     * @param offset
     * @param isOneway
     */
```

### JavadocDeclaration
`@param isOneway` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/store/OffsetStore.java`
#### Snippet
```java
     * @param mq
     * @param offset
     * @param isOneway
     */
    void updateConsumeOffsetToBroker(MessageQueue mq, long offset, boolean isOneway) throws RemotingException,
```

### JavadocDeclaration
`@return` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/DefaultLitePullConsumer.java`
#### Snippet
```java
     * Get the MessageQueue assigned in subscribe mode
     *
     * @return
     * @throws MQClientException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/DefaultLitePullConsumer.java`
#### Snippet
```java
     *
     * @return
     * @throws MQClientException
     */
    @Override
```

### JavadocDeclaration
`@param topic` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/DefaultLitePullConsumer.java`
#### Snippet
```java
     * Subscribe some topic with subExpression and messageQueueListener
     *
     * @param topic
     * @param subExpression
     * @param messageQueueListener
```

### JavadocDeclaration
`@param subExpression` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/DefaultLitePullConsumer.java`
#### Snippet
```java
     *
     * @param topic
     * @param subExpression
     * @param messageQueueListener
     */
```

### JavadocDeclaration
`@param messageQueueListener` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/consumer/DefaultLitePullConsumer.java`
#### Snippet
```java
     * @param topic
     * @param subExpression
     * @param messageQueueListener
     */
    @Override
```

### JavadocDeclaration
Javadoc pointing to itself
in `client/src/main/java/org/apache/rocketmq/client/consumer/DefaultMQPushConsumer.java`
#### Snippet
```java
     * In orderly mode, -1 means Integer.MAX_VALUE.
     *
     * If messages are re-consumed more than {@link #maxReconsumeTimes} before success.
     */
    private int maxReconsumeTimes = -1;
```

### JavadocDeclaration
`@param msg` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java

    /**
     * @param msg
     * @param mq
     * @param sendCallback
```

### JavadocDeclaration
`@param mq` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
    /**
     * @param msg
     * @param mq
     * @param sendCallback
     * @param timeout      the <code>sendCallback</code> will be invoked at most time
```

### JavadocDeclaration
`@param sendCallback` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     * @param msg
     * @param mq
     * @param sendCallback
     * @param timeout      the <code>sendCallback</code> will be invoked at most time
     * @throws MQClientException
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     * @param sendCallback
     * @param timeout      the <code>sendCallback</code> will be invoked at most time
     * @throws MQClientException
     * @throws RemotingException
     * @throws InterruptedException
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     * @param timeout      the <code>sendCallback</code> will be invoked at most time
     * @throws MQClientException
     * @throws RemotingException
     * @throws InterruptedException
     * @deprecated It will be removed at 4.4.0 cause for exception handling and the wrong Semantics of timeout. A new one will be
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     * @throws MQClientException
     * @throws RemotingException
     * @throws InterruptedException
     * @deprecated It will be removed at 4.4.0 cause for exception handling and the wrong Semantics of timeout. A new one will be
     * provided in next version
```

### JavadocDeclaration
`@param msg` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     * provided in next version
     *
     * @param msg
     * @param selector
     * @param arg
```

### JavadocDeclaration
`@param selector` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     *
     * @param msg
     * @param selector
     * @param arg
     * @param sendCallback
```

### JavadocDeclaration
`@param arg` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     * @param msg
     * @param selector
     * @param arg
     * @param sendCallback
     * @param timeout      the <code>sendCallback</code> will be invoked at most time
```

### JavadocDeclaration
`@param sendCallback` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     * @param selector
     * @param arg
     * @param sendCallback
     * @param timeout      the <code>sendCallback</code> will be invoked at most time
     * @throws MQClientException
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     * @param sendCallback
     * @param timeout      the <code>sendCallback</code> will be invoked at most time
     * @throws MQClientException
     * @throws RemotingException
     * @throws InterruptedException
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     * @param timeout      the <code>sendCallback</code> will be invoked at most time
     * @throws MQClientException
     * @throws RemotingException
     * @throws InterruptedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     * @throws MQClientException
     * @throws RemotingException
     * @throws InterruptedException
     */
    @Deprecated
```

### JavadocDeclaration
`@param msg` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java

    /**
     * @param msg
     * @param sendCallback
     * @param timeout      the <code>sendCallback</code> will be invoked at most time
```

### JavadocDeclaration
`@param sendCallback` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
    /**
     * @param msg
     * @param sendCallback
     * @param timeout      the <code>sendCallback</code> will be invoked at most time
     * @throws RejectedExecutionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
     * @param sendCallback
     * @param timeout      the <code>sendCallback</code> will be invoked at most time
     * @throws RejectedExecutionException
     * @deprecated It will be removed at 4.4.0 cause for exception handling and the wrong Semantics of timeout. A new one will be
     * provided in next version
```

### JavadocDeclaration
`@throws` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/producer/DefaultMQProducer.java`
#### Snippet
```java
     * @param arg Argument used along with local transaction executor.
     * @return Transaction result.
     * @throws MQClientException
     */
    @Override
```

### JavadocDeclaration
`@param attributes` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/producer/DefaultMQProducer.java`
#### Snippet
```java
     * @param queueNum topic's queue number
     * @param topicSysFlag topic system flag
     * @param attributes
     * @throws MQClientException if there is any client error.
     */
```

### JavadocDeclaration
`@param attributes` tag description is missing
in `client/src/main/java/org/apache/rocketmq/client/producer/DefaultMQProducer.java`
#### Snippet
```java
     * @param newTopic topic name
     * @param queueNum topic's queue number
     * @param attributes
     * @throws MQClientException if there is any client error.
     */
```

### JavadocDeclaration
Exception is not declared to be thrown by method AuthorizationHeader
in `acl/src/main/java/org/apache/rocketmq/acl/common/AuthorizationHeader.java`
#### Snippet
```java
     *
     * @param header gRPC header string.
     * @throws Exception exception.
     */
    public AuthorizationHeader(String header) throws DecoderException {
```

### JavadocDeclaration
Tag `return` is not allowed here
in `controller/src/main/java/org/apache/rocketmq/controller/BrokerHeartbeatManager.java`
#### Snippet
```java
    /**
     * initialize the resources
     * @return
     */
    void initialize();
```

### JavadocDeclaration
`@return` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     * Delete the access resource config
     *
     * @return
     */
    boolean deleteAccessConfig(String accessKey);
```

### JavadocDeclaration
`@param request` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     * Parse to get the AccessResource(user, resource, needed permission)
     *
     * @param request
     * @param remoteAddr
     * @return Plain access resource result,include access key,signature and some other access attributes.
```

### JavadocDeclaration
`@param remoteAddr` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     *
     * @param request
     * @param remoteAddr
     * @return Plain access resource result,include access key,signature and some other access attributes.
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     * Update globalWhiteRemoteAddresses in acl yaml config file
     *
     * @return
     */
    boolean updateGlobalWhiteAddrsConfig(List<String> globalWhiteAddrsList);
```

### JavadocDeclaration
`@param plainAccessConfig` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     * Update the access resource config
     *
     * @param plainAccessConfig
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     *
     * @param plainAccessConfig
     * @return
     */
    boolean updateAccessConfig(PlainAccessConfig plainAccessConfig);
```

### JavadocDeclaration
`@return` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     * get all access resource config version information
     *
     * @return
     */
    Map<String, DataVersion> getAllAclConfigVersion();
```

### JavadocDeclaration
`@return` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     * Get the access resource config version information
     *
     * @return
     */
    @Deprecated
```

### JavadocDeclaration
`@param accessResource` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     * Validate the access resource.
     *
     * @param accessResource
     */
    void validate(AccessResource accessResource);
```

### JavadocDeclaration
`@param messageV3` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
    /**
     * Parse to get the AccessResource from gRPC protocol
     * @param messageV3
     * @param header
     * @return Plain access resource
```

### JavadocDeclaration
`@param header` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     * Parse to get the AccessResource from gRPC protocol
     * @param messageV3
     * @param header
     * @return Plain access resource
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `acl/src/main/java/org/apache/rocketmq/acl/AccessValidator.java`
#### Snippet
```java
     * get broker cluster acl config information
     *
     * @return
     */
    AclConfig getAllAclConfig();
```

### JavadocDeclaration
`@param expression` tag description is missing
in `filter/src/main/java/org/apache/rocketmq/filter/expression/BinaryExpression.java`
#### Snippet
```java

    /**
     * @param expression
     */
    public void setLeft(Expression expression) {
```

### JavadocDeclaration
`@param expression` tag description is missing
in `filter/src/main/java/org/apache/rocketmq/filter/expression/BinaryExpression.java`
#### Snippet
```java

    /**
     * @param expression
     */
    public void setRight(Expression expression) {
```

### JavadocDeclaration
`@param left` tag description is missing
in `filter/src/main/java/org/apache/rocketmq/filter/expression/LogicExpression.java`
#### Snippet
```java

    /**
     * @param left
     * @param right
     */
```

### JavadocDeclaration
`@param right` tag description is missing
in `filter/src/main/java/org/apache/rocketmq/filter/expression/LogicExpression.java`
#### Snippet
```java
    /**
     * @param left
     * @param right
     */
    public LogicExpression(BooleanExpression left, BooleanExpression right) {
```

### JavadocDeclaration
`@param left` tag description is missing
in `filter/src/main/java/org/apache/rocketmq/filter/expression/ComparisonExpression.java`
#### Snippet
```java

    /**
     * @param left
     * @param right
     */
```

### JavadocDeclaration
`@param right` tag description is missing
in `filter/src/main/java/org/apache/rocketmq/filter/expression/ComparisonExpression.java`
#### Snippet
```java
    /**
     * @param left
     * @param right
     */
    public ComparisonExpression(Expression left, Expression right) {
```

### JavadocDeclaration
`@param left` tag description is missing
in `filter/src/main/java/org/apache/rocketmq/filter/expression/ComparisonExpression.java`
#### Snippet
```java

    /**
     * @param left
     * @param right
     */
```

### JavadocDeclaration
`@param right` tag description is missing
in `filter/src/main/java/org/apache/rocketmq/filter/expression/ComparisonExpression.java`
#### Snippet
```java
    /**
     * @param left
     * @param right
     */
    private static void checkEqualOperandCompatability(Expression left, Expression right) {
```

### JavadocDeclaration
`@param clusterName` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
     * compression feature is deprecated.
     *
     * @param clusterName
     * @param brokerAddr
     * @param brokerName
```

### JavadocDeclaration
`@param brokerAddr` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
     *
     * @param clusterName
     * @param brokerAddr
     * @param brokerName
     * @param brokerId
```

### JavadocDeclaration
`@param brokerName` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
     * @param clusterName
     * @param brokerAddr
     * @param brokerName
     * @param brokerId
     * @param haServerAddr
```

### JavadocDeclaration
`@param brokerId` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
     * @param brokerAddr
     * @param brokerName
     * @param brokerId
     * @param haServerAddr
     * @param topicConfigWrapper
```

### JavadocDeclaration
`@param haServerAddr` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
     * @param brokerName
     * @param brokerId
     * @param haServerAddr
     * @param topicConfigWrapper
     * @param filterServerList
```

### JavadocDeclaration
`@param topicConfigWrapper` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
     * @param brokerId
     * @param haServerAddr
     * @param topicConfigWrapper
     * @param filterServerList
     * @param oneway
```

### JavadocDeclaration
`@param filterServerList` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
     * @param haServerAddr
     * @param topicConfigWrapper
     * @param filterServerList
     * @param oneway
     * @param timeoutMills
```

### JavadocDeclaration
`@param oneway` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
     * @param topicConfigWrapper
     * @param filterServerList
     * @param oneway
     * @param timeoutMills
     * @param compressed default false
```

### JavadocDeclaration
`@param timeoutMills` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
     * @param filterServerList
     * @param oneway
     * @param timeoutMills
     * @param compressed default false
     * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
     * @param timeoutMills
     * @param compressed default false
     * @return
     */
    public List<RegisterBrokerResult> registerBrokerAll(
```

### JavadocDeclaration
`@param shouldStart` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/plugin/BrokerAttachedPlugin.java`
#### Snippet
```java
     * Some plugin need do something when status changed. For example, brokerRole change to master or slave.
     *
     * @param shouldStart
     */
    void statusChanged(boolean shouldStart);
```

### JavadocDeclaration
`@param runtimeInfo` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/plugin/BrokerAttachedPlugin.java`
#### Snippet
```java
     * Some plugin need build runningInfo when prepare runtime info.
     *
     * @param runtimeInfo
     */
    void buildRuntimeInfo(Map<String, String> runtimeInfo);
```

### JavadocDeclaration
`@param brokerAddr` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/plugin/BrokerAttachedPlugin.java`
#### Snippet
```java
     * Sync metadata reverse from slave
     *
     * @param brokerAddr
     */
    void syncMetadataReverse(String brokerAddr) throws Exception;
```

### JavadocDeclaration
`@param requestHeader` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/EndTransactionProcessor.java`
#### Snippet
```java
     * And the commit/rollback request whose validity period exceeds CheckImmunityTimeInSeconds and is not checked back will be processed and failed
     * returns ILLEGAL_OPERATION 604 error
     * @param requestHeader
     * @param messageExt
     * @return
```

### JavadocDeclaration
`@param messageExt` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/EndTransactionProcessor.java`
#### Snippet
```java
     * returns ILLEGAL_OPERATION 604 error
     * @param requestHeader
     * @param messageExt
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/EndTransactionProcessor.java`
#### Snippet
```java
     * @param requestHeader
     * @param messageExt
     * @return
     */
    public boolean rejectCommitOrRollback(EndTransactionRequestHeader requestHeader, MessageExt messageExt) {
```

### JavadocDeclaration
`@param topic` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/QueryAssignmentProcessor.java`
#### Snippet
```java
     * client should skip the update logic
     *
     * @param topic
     * @param consumerGroup
     * @param clientId
```

### JavadocDeclaration
`@param consumerGroup` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/QueryAssignmentProcessor.java`
#### Snippet
```java
     *
     * @param topic
     * @param consumerGroup
     * @param clientId
     * @param messageModel
```

### JavadocDeclaration
`@param clientId` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/QueryAssignmentProcessor.java`
#### Snippet
```java
     * @param topic
     * @param consumerGroup
     * @param clientId
     * @param messageModel
     * @param strategyName
```

### JavadocDeclaration
`@param messageModel` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/QueryAssignmentProcessor.java`
#### Snippet
```java
     * @param consumerGroup
     * @param clientId
     * @param messageModel
     * @param strategyName
     * @return the MessageQueues assigned to this client
```

### JavadocDeclaration
`@param strategyName` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/QueryAssignmentProcessor.java`
#### Snippet
```java
     * @param clientId
     * @param messageModel
     * @param strategyName
     * @return the MessageQueues assigned to this client
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/SendMessageProcessor.java`
#### Snippet
```java
     * If the response is not null, it meets some errors
     *
     * @return
     */

```

### JavadocDeclaration
`@param messageExt` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/TransactionalMessageService.java`
#### Snippet
```java
     * Delete prepare message when this message has been committed or rolled back.
     *
     * @param messageExt
     */
    boolean deletePrepareMessage(MessageExt messageExt);
```

### JavadocDeclaration
`@param brokerController` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/AbstractTransactionalMessageCheckListener.java`
#### Snippet
```java
     * Inject brokerController for this listener
     *
     * @param brokerController
     */
    public void setBrokerController(BrokerController brokerController) {
```

### JavadocDeclaration
`@param group` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/subscription/SubscriptionGroupManager.java`
#### Snippet
```java
     * clear the bit value to 0 at the specific index (from 0)
     *
     * @param group
     * @param topic
     * @param forbiddenIndex from 0
```

### JavadocDeclaration
`@param topic` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/subscription/SubscriptionGroupManager.java`
#### Snippet
```java
     *
     * @param group
     * @param topic
     * @param forbiddenIndex from 0
     */
```

### JavadocDeclaration
`@param group` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/subscription/SubscriptionGroupManager.java`
#### Snippet
```java
     * set the bit value to 1 at the specific index (from 0)
     *
     * @param group
     * @param topic
     * @param forbiddenIndex from 0
```

### JavadocDeclaration
`@param topic` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/subscription/SubscriptionGroupManager.java`
#### Snippet
```java
     *
     * @param group
     * @param topic
     * @param forbiddenIndex from 0
     */
```

### JavadocDeclaration
`@param point` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
     * put to store && add to buffer.
     *
     * @param point
     * @param reviveQueueId
     * @param reviveQueueOffset
```

### JavadocDeclaration
`@param reviveQueueId` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
     *
     * @param point
     * @param reviveQueueId
     * @param reviveQueueOffset
     * @param nextBeginOffset
```

### JavadocDeclaration
`@param reviveQueueOffset` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
     * @param point
     * @param reviveQueueId
     * @param reviveQueueOffset
     * @param nextBeginOffset
     * @return
```

### JavadocDeclaration
`@param nextBeginOffset` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
     * @param reviveQueueId
     * @param reviveQueueOffset
     * @param nextBeginOffset
     * @return
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
     * @param reviveQueueOffset
     * @param nextBeginOffset
     * @return
     */
    public void addCkJustOffset(PopCheckPoint point, int reviveQueueId, long reviveQueueOffset, long nextBeginOffset) {
```

### JavadocDeclaration
`@param usedExpireMillis` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
         * is not thread safe, may cause duplicate lock
         *
         * @param usedExpireMillis
         * @return
         */
```

### JavadocDeclaration
`@return` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
         *
         * @param usedExpireMillis
         * @return
         */
        public int cleanUnusedLock(final long usedExpireMillis) {
```

### JavadocDeclaration
`@param channel` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java

    /**
     * @param channel
     * @param remotingCommand
     * @param requestHeader
```

### JavadocDeclaration
`@param remotingCommand` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
    /**
     * @param channel
     * @param remotingCommand
     * @param requestHeader
     * @return
```

### JavadocDeclaration
`@param requestHeader` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
     * @param channel
     * @param remotingCommand
     * @param requestHeader
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
     * @param remotingCommand
     * @param requestHeader
     * @return
     */
    private int polling(final Channel channel, RemotingCommand remotingCommand,
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java

    /**
     * @param ctx
     * @param request
     * @return
```

### JavadocDeclaration
`@param request` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
    /**
     * @param ctx
     * @param request
     * @return
     * @throws RemotingCommandException
```

### JavadocDeclaration
`@return` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
     * @param ctx
     * @param request
     * @return
     * @throws RemotingCommandException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
     * @param request
     * @return
     * @throws RemotingCommandException
     */
    private RemotingCommand getSubscriptionGroup(ChannelHandlerContext ctx,
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java

    /**
     * @param ctx
     * @param request
     * @return
```

### JavadocDeclaration
`@param request` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
    /**
     * @param ctx
     * @param request
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
     * @param ctx
     * @param request
     * @return
     */
    private RemotingCommand updateAndGetGroupForbidden(ChannelHandlerContext ctx, RemotingCommand request)
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `queue` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/queue/RoundQueue.java`
#### Snippet
```java
public class RoundQueue<E> {

    private Queue<E> queue;
    private int capacity;

```

### FieldMayBeFinal
Field `capacity` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/queue/RoundQueue.java`
#### Snippet
```java

    private Queue<E> queue;
    private int capacity;

    public RoundQueue(int capacity) {
```

### FieldMayBeFinal
Field `tree` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/queue/ConcurrentTreeMap.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.BROKER_LOGGER_NAME);
    private final ReentrantLock lock;
    private TreeMap<K, V> tree;
    private RoundQueue<K> roundQueue;

```

### FieldMayBeFinal
Field `roundQueue` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/queue/ConcurrentTreeMap.java`
#### Snippet
```java
    private final ReentrantLock lock;
    private TreeMap<K, V> tree;
    private RoundQueue<K> roundQueue;

    public ConcurrentTreeMap(int capacity, Comparator<? super K> comparator) {
```

### FieldMayBeFinal
Field `isInit` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/BrokerConfigSingleton.java`
#### Snippet
```java

public class BrokerConfigSingleton {
    private static AtomicBoolean isInit = new AtomicBoolean();
    private static BrokerConfig brokerConfig;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/BoundaryType.java`
#### Snippet
```java
    UPPER("upper");

    private String name;

    BoundaryType(String name) {
```

### FieldMayBeFinal
Field `thisClassLoader` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/utils/ServiceProvider.java`
#### Snippet
```java
     * A reference to the classloader that loaded this class. It's more efficient to compute it once and cache it here.
     */
    private static ClassLoader thisClassLoader;
    
    /**
```

### FieldMayBeFinal
Field `symbol` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/Op.java`
#### Snippet
```java
public abstract class Op {

    private String symbol;

    protected Op(String symbol) {
```

### FieldMayBeFinal
Field `compareable` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/Operator.java`
#### Snippet
```java

    private int priority;
    private boolean compareable;

    private Operator(String symbol, int priority, boolean compareable) {
```

### FieldMayBeFinal
Field `priority` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/filter/impl/Operator.java`
#### Snippet
```java
    public static final Operator OR = new Operator("||", 15, true);

    private int priority;
    private boolean compareable;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/message/MessageRequestMode.java`
#### Snippet
```java
    POP("POP");

    private String name;

    MessageRequestMode(String name) {
```

### FieldMayBeFinal
Field `unitName` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/namesrv/DefaultTopAddressing.java`
#### Snippet
```java
    private String nsAddr;
    private String wsAddr;
    private String unitName;
    private Map<String, String> para;
    private List<TopAddressing> topAddressingList;
```

### FieldMayBeFinal
Field `topAddressingList` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/namesrv/DefaultTopAddressing.java`
#### Snippet
```java
    private String unitName;
    private Map<String, String> para;
    private List<TopAddressing> topAddressingList;

    public DefaultTopAddressing(final String wsAddr) {
```

### FieldMayBeFinal
Field `wsAddr` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/namesrv/DefaultTopAddressing.java`
#### Snippet
```java

    private String nsAddr;
    private String wsAddr;
    private String unitName;
    private Map<String, String> para;
```

### FieldMayBeFinal
Field `futureMap` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/statistics/FutureHolder.java`
#### Snippet
```java

public class FutureHolder<T> {
    private ConcurrentMap<T, BlockingQueue<Future>> futureMap = new ConcurrentHashMap<>(8);

    public void addFuture(T t, Future future) {
```

### FieldMayBeFinal
Field `totalCount` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsBrief.java`
#### Snippet
```java
    private long[][] topPercentileMeta;
    private AtomicInteger[] counts;
    private AtomicLong totalCount;

    // max min avg total
```

### FieldMayBeFinal
Field `counts` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsBrief.java`
#### Snippet
```java
    // TopPercentile
    private long[][] topPercentileMeta;
    private AtomicInteger[] counts;
    private AtomicLong totalCount;

```

### FieldMayBeFinal
Field `topPercentileMeta` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsBrief.java`
#### Snippet
```java

    // TopPercentile
    private long[][] topPercentileMeta;
    private AtomicInteger[] counts;
    private AtomicLong totalCount;
```

### FieldMayBeFinal
Field `statKind` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItem.java`
#### Snippet
```java
 */
public class StatisticsItem {
    private String statKind;
    private String statObject;

```

### FieldMayBeFinal
Field `itemNames` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItem.java`
#### Snippet
```java
    private String statObject;

    private String[] itemNames;
    private AtomicLong[] itemAccumulates;
    private AtomicLong invokeTimes;
```

### FieldMayBeFinal
Field `statObject` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItem.java`
#### Snippet
```java
public class StatisticsItem {
    private String statKind;
    private String statObject;

    private String[] itemNames;
```

### FieldMayBeFinal
Field `kindMetaMap` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsManager.java`
#### Snippet
```java
     * Set of Statistics Kind Metadata
     */
    private Map<String, StatisticsKindMeta> kindMetaMap;

    /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/util/MQWait.java`
#### Snippet
```java

public class MQWait {
    private static Logger logger = LoggerFactory.getLogger(MQWait.class);

    public static boolean waitConsumeAll(int timeoutMills, Collection<Object> allSendMsgs,
```

### FieldMayBeFinal
Field `tpsItemNames` may be 'final'
in `common/src/main/java/org/apache/rocketmq/common/statistics/StatisticsItemScheduledIncrementPrinter.java`
#### Snippet
```java
public class StatisticsItemScheduledIncrementPrinter extends StatisticsItemScheduledPrinter {

    private String[] tpsItemNames;

    public static final int TPS_INITIAL_DELAY = 0;
```

### FieldMayBeFinal
Field `lineSeparator` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/util/FileUtil.java`
#### Snippet
```java

public class FileUtil {
    private static String lineSeparator = System.getProperty("line.separator");

    private String filePath = "";
```

### FieldMayBeFinal
Field `rd` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtils.java`
#### Snippet
```java
    private static final int UNICODE_START = '\u4E00';
    private static final int UNICODE_END = '\u9FA0';
    private static Random rd = new Random();

    private RandomUtils() {
```

### FieldMayBeFinal
Field `datas` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/impl/ListDataCollectorImpl.java`
#### Snippet
```java
public class ListDataCollectorImpl implements DataCollector {

    private List<Object> datas = new ArrayList<Object>();
    private boolean lock = false;

```

### FieldMayBeFinal
Field `collectMap` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java
public final class DataCollectorManager {
    private static DataCollectorManager instance = new DataCollectorManager();
    private Map<String, DataCollector> collectMap = new HashMap<String, DataCollector>();
    private Object lock = new Object();

```

### FieldMayBeFinal
Field `instance` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java

public final class DataCollectorManager {
    private static DataCollectorManager instance = new DataCollectorManager();
    private Map<String, DataCollector> collectMap = new HashMap<String, DataCollector>();
    private Object lock = new Object();
```

### FieldMayBeFinal
Field `lock` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java
    private static DataCollectorManager instance = new DataCollectorManager();
    private Map<String, DataCollector> collectMap = new HashMap<String, DataCollector>();
    private Object lock = new Object();

    private DataCollectorManager() {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/util/VerifyUtils.java`
#### Snippet
```java

public class VerifyUtils {
    private static Logger logger = LoggerFactory.getLogger(VerifyUtils.class);

    public static int verify(Collection<Object> sendMsgs, Collection<Object> recvMsgs) {
```

### FieldMayBeFinal
Field `datas` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/impl/MapDataCollectorImpl.java`
#### Snippet
```java
public class MapDataCollectorImpl implements DataCollector {

    private Map<Object, AtomicInteger> datas = new ConcurrentHashMap<Object, AtomicInteger>();
    private boolean lock = false;

```

### FieldMayBeFinal
Field `rd` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtil.java`
#### Snippet
```java
    private static final int UNICODE_START = '\u4E00';
    private static final int UNICODE_END = '\u9FA0';
    private static Random rd = new Random();

    private RandomUtil() {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQBroadCastConsumer.java`
#### Snippet
```java

public class RMQBroadCastConsumer extends RMQNormalConsumer {
    private static Logger logger = LoggerFactory.getLogger(RMQBroadCastConsumer.class);

    public RMQBroadCastConsumer(String nsAddr, String topic, String subExpression,
```

### FieldMayBeFinal
Field `bPause` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/mq/MQAsyncProducer.java`
#### Snippet
```java
    private int intervalMills;
    private Thread sendT;
    private AtomicBoolean bPause = new AtomicBoolean(false);

    public MQAsyncProducer(final AbstractMQProducer producer, final long msgNum,
```

### FieldMayBeFinal
Field `msgNum` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/mq/MQAsyncProducer.java`
#### Snippet
```java
    private static Logger logger = LoggerFactory.getLogger(MQAsyncProducer.class);
    private AbstractMQProducer producer = null;
    private long msgNum;
    private int intervalMills;
    private Thread sendT;
```

### FieldMayBeFinal
Field `intervalMills` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/mq/MQAsyncProducer.java`
#### Snippet
```java
    private AbstractMQProducer producer = null;
    private long msgNum;
    private int intervalMills;
    private Thread sendT;
    private AtomicBoolean bPause = new AtomicBoolean(false);
```

### FieldMayBeFinal
Field `sendT` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/mq/MQAsyncProducer.java`
#### Snippet
```java
    private long msgNum;
    private int intervalMills;
    private Thread sendT;
    private AtomicBoolean bPause = new AtomicBoolean(false);

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/mq/MQAsyncProducer.java`
#### Snippet
```java

public class MQAsyncProducer {
    private static Logger logger = LoggerFactory.getLogger(MQAsyncProducer.class);
    private AbstractMQProducer producer = null;
    private long msgNum;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQSqlConsumer.java`
#### Snippet
```java

public class RMQSqlConsumer extends RMQNormalConsumer {
    private static Logger logger = LoggerFactory.getLogger(RMQSqlConsumer.class);
    private MessageSelector selector;

```

### FieldMayBeFinal
Field `selector` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQSqlConsumer.java`
#### Snippet
```java
public class RMQSqlConsumer extends RMQNormalConsumer {
    private static Logger logger = LoggerFactory.getLogger(RMQSqlConsumer.class);
    private MessageSelector selector;

    public RMQSqlConsumer(String nsAddr, String topic, MessageSelector selector,
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQTransactionalProducer.java`
#### Snippet
```java

public class RMQTransactionalProducer extends AbstractMQProducer {
    private static Logger logger  = LoggerFactory.getLogger(RMQTransactionalProducer.class);
    private TransactionMQProducer producer = null;
    private String nsAddr = null;
```

### FieldMayBeFinal
Field `log` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/util/MQAdminTestUtils.java`
#### Snippet
```java

public class MQAdminTestUtils {
    private static Logger log = LoggerFactory.getLogger(MQAdminTestUtils.class);

    private static DefaultMQAdminExt mqAdminExt;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQNormalProducer.java`
#### Snippet
```java

public class RMQNormalProducer extends AbstractMQProducer {
    private static Logger logger = LoggerFactory.getLogger(RMQNormalProducer.class);
    private DefaultMQProducer producer = null;
    private String nsAddr = null;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQAsyncSendProducer.java`
#### Snippet
```java

public class RMQAsyncSendProducer extends AbstractMQProducer {
    private static Logger logger = LoggerFactory
        .getLogger(RMQAsyncSendProducer.class);
    private String nsAddr = null;
```

### FieldMayBeFinal
Field `exceptionMsgCount` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQAsyncSendProducer.java`
#### Snippet
```java
    private SendCallback sendCallback = null;
    private List<SendResult> successSendResult = Collections.synchronizedList(new ArrayList<SendResult>());
    private AtomicInteger exceptionMsgCount = new AtomicInteger(0);
    private int msgSize = 0;

```

### FieldMayBeFinal
Field `successSendResult` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/client/rmq/RMQAsyncSendProducer.java`
#### Snippet
```java
    private DefaultMQProducer producer = null;
    private SendCallback sendCallback = null;
    private List<SendResult> successSendResult = Collections.synchronizedList(new ArrayList<SendResult>());
    private AtomicInteger exceptionMsgCount = new AtomicInteger(0);
    private int msgSize = 0;
```

### FieldMayBeFinal
Field `rmqMsgs` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/factory/TagMessage.java`
#### Snippet
```java
    private String topic = null;
    private int msgSize = 0;
    private Map<String, List<Object>> rmqMsgs = new HashMap<String, List<Object>>();

    public TagMessage(String tag, String topic, int msgSize) {
```

### FieldMayBeFinal
Field `msgs` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/listener/rmq/order/RMQOrderListener.java`
#### Snippet
```java

public class RMQOrderListener extends AbstractListener implements MessageListenerOrderly {
    private Map<String/* brokerId_brokerIp */, Collection<Object>> msgs = new ConcurrentHashMap<String, Collection<Object>>();

    public RMQOrderListener() {
```

### FieldMayBeFinal
Field `consumerThreadNum` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static int lmqNum = Integer.parseInt(System.getProperty("lmqNum", "1"));
    private static int sendThreadNum = Integer.parseInt(System.getProperty("sendThreadNum", "64"));
    private static int consumerThreadNum = Integer.parseInt(System.getProperty("consumerThreadNum", "64"));
    private static String brokerName = System.getProperty("brokerName", "broker-a");
    private static int size = Integer.parseInt(System.getProperty("size", "128"));
```

### FieldMayBeFinal
Field `rid` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static int pullConsumerNum = Integer.parseInt(System.getProperty("pullConsumerNum", "8"));
    public static DefaultMQPullConsumer[] defaultMQPullConsumers = new DefaultMQPullConsumer[pullConsumerNum];
    private static AtomicLong rid = new AtomicLong();
    private static final String LMQ_PREFIX = "%LMQ%";

```

### FieldMayBeFinal
Field `suspendTime` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static String brokerName = System.getProperty("brokerName", "broker-a");
    private static int size = Integer.parseInt(System.getProperty("size", "128"));
    private static int suspendTime = Integer.parseInt(System.getProperty("suspendTime", "2000"));
    private static final boolean RETRY_NO_MATCHED_MSG = Boolean.parseBoolean(System.getProperty("retry_no_matched_msg", "false"));
    private static boolean benchOffset = Boolean.parseBoolean(System.getProperty("benchOffset", "false"));
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java

public class BenchLmqStore {
    private static Logger logger = LoggerFactory.getLogger(BenchLmqStore.class);
    private static String namesrv = System.getProperty("namesrv", "127.0.0.1:9876");
    private static String lmqTopic = System.getProperty("lmqTopic", "lmqTestTopic");
```

### FieldMayBeFinal
Field `lmqNum` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static String queuePrefix = System.getProperty("queuePrefix", "lmqTest");
    private static int tps = Integer.parseInt(System.getProperty("tps", "1"));
    private static int lmqNum = Integer.parseInt(System.getProperty("lmqNum", "1"));
    private static int sendThreadNum = Integer.parseInt(System.getProperty("sendThreadNum", "64"));
    private static int consumerThreadNum = Integer.parseInt(System.getProperty("consumerThreadNum", "64"));
```

### FieldMayBeFinal
Field `pullConsumerNum` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static Map<Integer, Map<MessageQueue, Long>> pullEvent = new ConcurrentHashMap<>(256);
    public static DefaultMQProducer defaultMQProducer;
    private static int pullConsumerNum = Integer.parseInt(System.getProperty("pullConsumerNum", "8"));
    public static DefaultMQPullConsumer[] defaultMQPullConsumers = new DefaultMQPullConsumer[pullConsumerNum];
    private static AtomicLong rid = new AtomicLong();
```

### FieldMayBeFinal
Field `offsetMap` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static boolean benchOffset = Boolean.parseBoolean(System.getProperty("benchOffset", "false"));
    private static int benchOffsetNum = Integer.parseInt(System.getProperty("benchOffsetNum", "1"));
    private static Map<MessageQueue, Long> offsetMap = new ConcurrentHashMap<>(256);
    private static Map<MessageQueue, Boolean> pullStatus = new ConcurrentHashMap<>(256);
    private static Map<Integer, Map<MessageQueue, Long>> pullEvent = new ConcurrentHashMap<>(256);
```

### FieldMayBeFinal
Field `benchOffsetNum` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static final boolean RETRY_NO_MATCHED_MSG = Boolean.parseBoolean(System.getProperty("retry_no_matched_msg", "false"));
    private static boolean benchOffset = Boolean.parseBoolean(System.getProperty("benchOffset", "false"));
    private static int benchOffsetNum = Integer.parseInt(System.getProperty("benchOffsetNum", "1"));
    private static Map<MessageQueue, Long> offsetMap = new ConcurrentHashMap<>(256);
    private static Map<MessageQueue, Boolean> pullStatus = new ConcurrentHashMap<>(256);
```

### FieldMayBeFinal
Field `size` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static int consumerThreadNum = Integer.parseInt(System.getProperty("consumerThreadNum", "64"));
    private static String brokerName = System.getProperty("brokerName", "broker-a");
    private static int size = Integer.parseInt(System.getProperty("size", "128"));
    private static int suspendTime = Integer.parseInt(System.getProperty("suspendTime", "2000"));
    private static final boolean RETRY_NO_MATCHED_MSG = Boolean.parseBoolean(System.getProperty("retry_no_matched_msg", "false"));
```

### FieldMayBeFinal
Field `lmqTopic` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static Logger logger = LoggerFactory.getLogger(BenchLmqStore.class);
    private static String namesrv = System.getProperty("namesrv", "127.0.0.1:9876");
    private static String lmqTopic = System.getProperty("lmqTopic", "lmqTestTopic");
    private static boolean enableSub = Boolean.parseBoolean(System.getProperty("enableSub", "true"));
    private static String queuePrefix = System.getProperty("queuePrefix", "lmqTest");
```

### FieldMayBeFinal
Field `brokerName` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static int sendThreadNum = Integer.parseInt(System.getProperty("sendThreadNum", "64"));
    private static int consumerThreadNum = Integer.parseInt(System.getProperty("consumerThreadNum", "64"));
    private static String brokerName = System.getProperty("brokerName", "broker-a");
    private static int size = Integer.parseInt(System.getProperty("size", "128"));
    private static int suspendTime = Integer.parseInt(System.getProperty("suspendTime", "2000"));
```

### FieldMayBeFinal
Field `pullEvent` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static Map<MessageQueue, Long> offsetMap = new ConcurrentHashMap<>(256);
    private static Map<MessageQueue, Boolean> pullStatus = new ConcurrentHashMap<>(256);
    private static Map<Integer, Map<MessageQueue, Long>> pullEvent = new ConcurrentHashMap<>(256);
    public static DefaultMQProducer defaultMQProducer;
    private static int pullConsumerNum = Integer.parseInt(System.getProperty("pullConsumerNum", "8"));
```

### FieldMayBeFinal
Field `benchOffset` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static int suspendTime = Integer.parseInt(System.getProperty("suspendTime", "2000"));
    private static final boolean RETRY_NO_MATCHED_MSG = Boolean.parseBoolean(System.getProperty("retry_no_matched_msg", "false"));
    private static boolean benchOffset = Boolean.parseBoolean(System.getProperty("benchOffset", "false"));
    private static int benchOffsetNum = Integer.parseInt(System.getProperty("benchOffsetNum", "1"));
    private static Map<MessageQueue, Long> offsetMap = new ConcurrentHashMap<>(256);
```

### FieldMayBeFinal
Field `tps` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static boolean enableSub = Boolean.parseBoolean(System.getProperty("enableSub", "true"));
    private static String queuePrefix = System.getProperty("queuePrefix", "lmqTest");
    private static int tps = Integer.parseInt(System.getProperty("tps", "1"));
    private static int lmqNum = Integer.parseInt(System.getProperty("lmqNum", "1"));
    private static int sendThreadNum = Integer.parseInt(System.getProperty("sendThreadNum", "64"));
```

### FieldMayBeFinal
Field `queuePrefix` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static String lmqTopic = System.getProperty("lmqTopic", "lmqTestTopic");
    private static boolean enableSub = Boolean.parseBoolean(System.getProperty("enableSub", "true"));
    private static String queuePrefix = System.getProperty("queuePrefix", "lmqTest");
    private static int tps = Integer.parseInt(System.getProperty("tps", "1"));
    private static int lmqNum = Integer.parseInt(System.getProperty("lmqNum", "1"));
```

### FieldMayBeFinal
Field `namesrv` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
public class BenchLmqStore {
    private static Logger logger = LoggerFactory.getLogger(BenchLmqStore.class);
    private static String namesrv = System.getProperty("namesrv", "127.0.0.1:9876");
    private static String lmqTopic = System.getProperty("lmqTopic", "lmqTestTopic");
    private static boolean enableSub = Boolean.parseBoolean(System.getProperty("enableSub", "true"));
```

### FieldMayBeFinal
Field `sendThreadNum` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static int tps = Integer.parseInt(System.getProperty("tps", "1"));
    private static int lmqNum = Integer.parseInt(System.getProperty("lmqNum", "1"));
    private static int sendThreadNum = Integer.parseInt(System.getProperty("sendThreadNum", "64"));
    private static int consumerThreadNum = Integer.parseInt(System.getProperty("consumerThreadNum", "64"));
    private static String brokerName = System.getProperty("brokerName", "broker-a");
```

### FieldMayBeFinal
Field `pullStatus` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static int benchOffsetNum = Integer.parseInt(System.getProperty("benchOffsetNum", "1"));
    private static Map<MessageQueue, Long> offsetMap = new ConcurrentHashMap<>(256);
    private static Map<MessageQueue, Boolean> pullStatus = new ConcurrentHashMap<>(256);
    private static Map<Integer, Map<MessageQueue, Long>> pullEvent = new ConcurrentHashMap<>(256);
    public static DefaultMQProducer defaultMQProducer;
```

### FieldMayBeFinal
Field `enableSub` may be 'final'
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
    private static String namesrv = System.getProperty("namesrv", "127.0.0.1:9876");
    private static String lmqTopic = System.getProperty("lmqTopic", "lmqTestTopic");
    private static boolean enableSub = Boolean.parseBoolean(System.getProperty("enableSub", "true"));
    private static String queuePrefix = System.getProperty("queuePrefix", "lmqTest");
    private static int tps = Integer.parseInt(System.getProperty("tps", "1"));
```

### FieldMayBeFinal
Field `mqClientAdmin` may be 'final'
in `proxy/src/main/java/org/apache/rocketmq/proxy/service/mqclient/MQClientAPIExt.java`
#### Snippet
```java
    private final ClientConfig clientConfig;

    private MqClientAdminImpl mqClientAdmin;

    public MQClientAPIExt(
```

### FieldMayBeFinal
Field `putMessageNormalLock` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/PutMessageReentrantLock.java`
#### Snippet
```java
 */
public class PutMessageReentrantLock implements PutMessageLock {
    private ReentrantLock putMessageNormalLock = new ReentrantLock(); // NonfairSync

    @Override
```

### FieldMayBeFinal
Field `putMessageSpinLock` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/PutMessageSpinLock.java`
#### Snippet
```java
public class PutMessageSpinLock implements PutMessageLock {
    //true: Can lock, false : in lock.
    private AtomicBoolean putMessageSpinLock = new AtomicBoolean(true);

    @Override
```

### FieldMayBeFinal
Field `topicQueueTableKey` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/PutMessageContext.java`
#### Snippet
```java

public class PutMessageContext {
    private String topicQueueTableKey;
    private long[] phyPos;
    private int batchSize;
```

### FieldMayBeFinal
Field `byteBuf` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/MessageExtEncoder.java`
#### Snippet
```java
public class MessageExtEncoder {
    protected static final Logger log = LoggerFactory.getLogger(LoggerName.STORE_LOGGER_NAME);
    private ByteBuf byteBuf;
    // The maximum length of the message body.
    private int maxMessageBodySize;
```

### FieldMayBeFinal
Field `commercialSizePerMsg` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/GetMessageResult.java`
#### Snippet
```java

    private int msgCount4Commercial = 0;
    private int commercialSizePerMsg = 4 * 1024;

    public static final GetMessageResult NO_MATCH_LOGIC_QUEUE =
```

### FieldMayBeFinal
Field `subscriptionData` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageFilter.java`
#### Snippet
```java
public class DefaultMessageFilter implements MessageFilter {

    private SubscriptionData subscriptionData;

    public DefaultMessageFilter(final SubscriptionData subscriptionData) {
```

### FieldMayBeFinal
Field `defaultMessageStore` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/ha/HAConnectionStateNotificationService.java`
#### Snippet
```java
    private volatile long lastCheckTimeStamp = -1;
    private HAService haService;
    private DefaultMessageStore defaultMessageStore;

    public HAConnectionStateNotificationService(HAService haService, DefaultMessageStore defaultMessageStore) {
```

### FieldMayBeFinal
Field `haService` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/ha/HAConnectionStateNotificationService.java`
#### Snippet
```java
    private volatile HAConnectionStateNotificationRequest request;
    private volatile long lastCheckTimeStamp = -1;
    private HAService haService;
    private DefaultMessageStore defaultMessageStore;

```

### FieldMayBeFinal
Field `messageStore` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/AllocateMappedFileService.java`
#### Snippet
```java
        new PriorityBlockingQueue<>();
    private volatile boolean hasException = false;
    private DefaultMessageStore messageStore;

    public AllocateMappedFileService(DefaultMessageStore messageStore) {
```

### FieldMayBeFinal
Field `requestTable` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/AllocateMappedFileService.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.STORE_LOGGER_NAME);
    private static int waitTimeOut = 1000 * 5;
    private ConcurrentMap<String, AllocateRequest> requestTable =
        new ConcurrentHashMap<>();
    private PriorityBlockingQueue<AllocateRequest> requestQueue =
```

### FieldMayBeFinal
Field `waitTimeOut` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/AllocateMappedFileService.java`
#### Snippet
```java
public class AllocateMappedFileService extends ServiceThread {
    private static final Logger log = LoggerFactory.getLogger(LoggerName.STORE_LOGGER_NAME);
    private static int waitTimeOut = 1000 * 5;
    private ConcurrentMap<String, AllocateRequest> requestTable =
        new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `requestQueue` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/AllocateMappedFileService.java`
#### Snippet
```java
    private ConcurrentMap<String, AllocateRequest> requestTable =
        new ConcurrentHashMap<>();
    private PriorityBlockingQueue<AllocateRequest> requestQueue =
        new PriorityBlockingQueue<>();
    private volatile boolean hasException = false;
```

### FieldMayBeFinal
Field `defaultMessageStore` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/ha/DefaultHAClient.java`
#### Snippet
```java
    private ByteBuffer byteBufferRead = ByteBuffer.allocate(READ_MAX_BUFFER_SIZE);
    private ByteBuffer byteBufferBackup = ByteBuffer.allocate(READ_MAX_BUFFER_SIZE);
    private DefaultMessageStore defaultMessageStore;
    private volatile HAConnectionState currentState = HAConnectionState.READY;
    private FlowMonitor flowMonitor;
```

### FieldMayBeFinal
Field `flowMonitor` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/ha/DefaultHAClient.java`
#### Snippet
```java
    private DefaultMessageStore defaultMessageStore;
    private volatile HAConnectionState currentState = HAConnectionState.READY;
    private FlowMonitor flowMonitor;

    public DefaultHAClient(DefaultMessageStore defaultMessageStore) throws IOException {
```

### FieldMayBeFinal
Field `selector` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/ha/DefaultHAClient.java`
#### Snippet
```java
    private final ByteBuffer reportOffset = ByteBuffer.allocate(REPORT_HEADER_SIZE);
    private SocketChannel socketChannel;
    private Selector selector;
    /**
     * last time that slave reads date from master.
```

### FieldMayBeFinal
Field `readSocketService` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/ha/DefaultHAConnection.java`
#### Snippet
```java
    private final String clientAddress;
    private WriteSocketService writeSocketService;
    private ReadSocketService readSocketService;
    private volatile HAConnectionState currentState = HAConnectionState.TRANSFER;
    private volatile long slaveRequestOffset = -1;
```

### FieldMayBeFinal
Field `writeSocketService` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/ha/DefaultHAConnection.java`
#### Snippet
```java
    private final SocketChannel socketChannel;
    private final String clientAddress;
    private WriteSocketService writeSocketService;
    private ReadSocketService readSocketService;
    private volatile HAConnectionState currentState = HAConnectionState.TRANSFER;
```

### FieldMayBeFinal
Field `flowMonitor` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/ha/DefaultHAConnection.java`
#### Snippet
```java
    private volatile long slaveRequestOffset = -1;
    private volatile long slaveAckOffset = -1;
    private FlowMonitor flowMonitor;

    public DefaultHAConnection(final DefaultHAService haService, final SocketChannel socketChannel) throws IOException {
```

### FieldMayBeFinal
Field `putLock` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
    private volatile long getMessageEntireTimeMax = 0;
    // for putMessageEntireTimeMax
    private ReentrantLock putLock = new ReentrantLock();
    // for getMessageEntireTimeMax
    private ReentrantLock getLock = new ReentrantLock();
```

### FieldMayBeFinal
Field `messageStoreBootTimestamp` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
    private volatile LongAdder[] putMessageDistributeTime;
    private volatile LongAdder[] lastPutMessageDistributeTime;
    private long messageStoreBootTimestamp = System.currentTimeMillis();
    private volatile long putMessageEntireTimeMax = 0;
    private volatile long getMessageEntireTimeMax = 0;
```

### FieldMayBeFinal
Field `samplingLock` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
    private volatile long dispatchMaxBuffer = 0;

    private ReentrantLock samplingLock = new ReentrantLock();
    private long lastPrintTimestamp = System.currentTimeMillis();

```

### FieldMayBeFinal
Field `getLock` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
    private ReentrantLock putLock = new ReentrantLock();
    // for getMessageEntireTimeMax
    private ReentrantLock getLock = new ReentrantLock();

    private volatile long dispatchMaxBuffer = 0;
```

### FieldMayBeFinal
Field `printTPSInterval` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java
    private Map<Long/*bucket*/, LongAdder/*times*/> lastBuckets = new TreeMap<>();

    private static int printTPSInterval = 60 * 1;

    private final LongAdder putMessageFailedTimes = new LongAdder();
```

### FieldMayBeFinal
Field `endTimestampIndex` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/index/IndexHeader.java`
#### Snippet
```java
    public static final int INDEX_HEADER_SIZE = 40;
    private static int beginTimestampIndex = 0;
    private static int endTimestampIndex = 8;
    private static int beginPhyoffsetIndex = 16;
    private static int endPhyoffsetIndex = 24;
```

### FieldMayBeFinal
Field `beginPhyoffsetIndex` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/index/IndexHeader.java`
#### Snippet
```java
    private static int beginTimestampIndex = 0;
    private static int endTimestampIndex = 8;
    private static int beginPhyoffsetIndex = 16;
    private static int endPhyoffsetIndex = 24;
    private static int hashSlotcountIndex = 32;
```

### FieldMayBeFinal
Field `beginTimestampIndex` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/index/IndexHeader.java`
#### Snippet
```java
public class IndexHeader {
    public static final int INDEX_HEADER_SIZE = 40;
    private static int beginTimestampIndex = 0;
    private static int endTimestampIndex = 8;
    private static int beginPhyoffsetIndex = 16;
```

### FieldMayBeFinal
Field `hashSlotcountIndex` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/index/IndexHeader.java`
#### Snippet
```java
    private static int beginPhyoffsetIndex = 16;
    private static int endPhyoffsetIndex = 24;
    private static int hashSlotcountIndex = 32;
    private static int indexCountIndex = 36;
    private final ByteBuffer byteBuffer;
```

### FieldMayBeFinal
Field `indexCountIndex` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/index/IndexHeader.java`
#### Snippet
```java
    private static int endPhyoffsetIndex = 24;
    private static int hashSlotcountIndex = 32;
    private static int indexCountIndex = 36;
    private final ByteBuffer byteBuffer;
    private final AtomicLong beginTimestamp = new AtomicLong(0);
```

### FieldMayBeFinal
Field `endPhyoffsetIndex` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/index/IndexHeader.java`
#### Snippet
```java
    private static int endTimestampIndex = 8;
    private static int beginPhyoffsetIndex = 16;
    private static int endPhyoffsetIndex = 24;
    private static int hashSlotcountIndex = 32;
    private static int indexCountIndex = 36;
```

### FieldMayBeFinal
Field `indexSize` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/index/IndexFile.java`
#### Snippet
```java
     * Key HashCode(4) + Physical Offset(8) + Time Diff(4) + Next Index Pos(4) = 20 Bytes
     */
    private static int indexSize = 20;
    private static int invalidIndex = 0;
    private final int hashSlotNum;
```

### FieldMayBeFinal
Field `hashSlotSize` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/index/IndexFile.java`
#### Snippet
```java
public class IndexFile {
    private static final Logger log = LoggerFactory.getLogger(LoggerName.STORE_LOGGER_NAME);
    private static int hashSlotSize = 4;
    /**
     * Each index's store unit. Format:
```

### FieldMayBeFinal
Field `invalidIndex` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/index/IndexFile.java`
#### Snippet
```java
     */
    private static int indexSize = 20;
    private static int invalidIndex = 0;
    private final int hashSlotNum;
    private final int indexNum;
```

### FieldMayBeFinal
Field `log` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerLog.java`
#### Snippet
```java

public class TimerLog {
    private static Logger log = LoggerFactory.getLogger(LoggerName.STORE_LOGGER_NAME);
    public final static int BLANK_MAGIC_CODE = 0xBBCCDDEE ^ 1880681586 + 8;
    private final static int MIN_BLANK_LEN = 4 + 8 + 4;
```

### FieldMayBeFinal
Field `fileName` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerWheel.java`
#### Snippet
```java
    public final int slotsTotal;
    public final int precisionMs;
    private String fileName;
    private final RandomAccessFile randomAccessFile;
    private final FileChannel fileChannel;
```

### FieldMayBeFinal
Field `brokerConfig` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/plugin/MessageStorePluginContext.java`
#### Snippet
```java
    private BrokerStatsManager brokerStatsManager;
    private MessageArrivingListener messageArrivingListener;
    private BrokerConfig brokerConfig;
    private final Configuration configuration;

```

### FieldMayBeFinal
Field `messageArrivingListener` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/plugin/MessageStorePluginContext.java`
#### Snippet
```java
    private MessageStoreConfig messageStoreConfig;
    private BrokerStatsManager brokerStatsManager;
    private MessageArrivingListener messageArrivingListener;
    private BrokerConfig brokerConfig;
    private final Configuration configuration;
```

### FieldMayBeFinal
Field `messageStoreConfig` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/plugin/MessageStorePluginContext.java`
#### Snippet
```java

public class MessageStorePluginContext {
    private MessageStoreConfig messageStoreConfig;
    private BrokerStatsManager brokerStatsManager;
    private MessageArrivingListener messageArrivingListener;
```

### FieldMayBeFinal
Field `brokerStatsManager` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/plugin/MessageStorePluginContext.java`
#### Snippet
```java
public class MessageStorePluginContext {
    private MessageStoreConfig messageStoreConfig;
    private BrokerStatsManager brokerStatsManager;
    private MessageArrivingListener messageArrivingListener;
    private BrokerConfig brokerConfig;
```

### FieldMayBeFinal
Field `byteBuffer` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
    class BatchDispatchRequest {

        private ByteBuffer byteBuffer;

        private int position;
```

### FieldMayBeFinal
Field `dispatchService` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        private MainBatchDispatchRequestService mainBatchDispatchRequestService;

        private DispatchService dispatchService;

        public ConcurrentReputMessageService() {
```

### FieldMayBeFinal
Field `topicConfigTable` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java

    // this is a unmodifiableMap
    private ConcurrentMap<String, TopicConfig> topicConfigTable;

    private final ScheduledExecutorService scheduledCleanQueueExecutorService =
```

### FieldMayBeFinal
Field `mainBatchDispatchRequestService` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        private long batchId = 0;

        private MainBatchDispatchRequestService mainBatchDispatchRequestService;

        private DispatchService dispatchService;
```

### FieldMayBeFinal
Field `dispatchRequestOrderlyQueueSize` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
    private final ConcurrentLinkedQueue<BatchDispatchRequest> batchDispatchRequestQueue = new ConcurrentLinkedQueue<>();

    private int dispatchRequestOrderlyQueueSize = 16;

    private final DispatchRequestOrderlyQueue dispatchRequestOrderlyQueue = new DispatchRequestOrderlyQueue(dispatchRequestOrderlyQueueSize);
```

### FieldMayBeFinal
Field `position` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        private ByteBuffer byteBuffer;

        private int position;

        private int size;
```

### FieldMayBeFinal
Field `lockFile` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
    private final LinkedList<CommitLogDispatcher> dispatcherList;

    private RandomAccessFile lockFile;

    private FileLock lock;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        private int size;

        private long id;

        public BatchDispatchRequest(ByteBuffer byteBuffer, int position, int size, long id) {
```

### FieldMayBeFinal
Field `size` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        private int position;

        private int size;

        private long id;
```

### FieldMayBeFinal
Field `forceCleanFailedTimes` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
        private volatile boolean cleanImmediately = false;

        private int forceCleanFailedTimes = 0;

        double getDiskSpaceWarningLevelRatio() {
```

### FieldMayBeFinal
Field `factoryIndexGenerator` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientManager.java`
#### Snippet
```java
    private final static Logger log = LoggerFactory.getLogger(MQClientManager.class);
    private static MQClientManager instance = new MQClientManager();
    private AtomicInteger factoryIndexGenerator = new AtomicInteger();
    private ConcurrentMap<String/* clientId */, MQClientInstance> factoryTable =
        new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `instance` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientManager.java`
#### Snippet
```java
public class MQClientManager {
    private final static Logger log = LoggerFactory.getLogger(MQClientManager.class);
    private static MQClientManager instance = new MQClientManager();
    private AtomicInteger factoryIndexGenerator = new AtomicInteger();
    private ConcurrentMap<String/* clientId */, MQClientInstance> factoryTable =
```

### FieldMayBeFinal
Field `factoryTable` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientManager.java`
#### Snippet
```java
    private static MQClientManager instance = new MQClientManager();
    private AtomicInteger factoryIndexGenerator = new AtomicInteger();
    private ConcurrentMap<String/* clientId */, MQClientInstance> factoryTable =
        new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `start` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/logfile/DefaultMappedFile.java`
#### Snippet
```java

    private class Itr implements Iterator<SelectMappedBufferResult> {
        private int start;
        private int current;
        private ByteBuffer buf;
```

### FieldMayBeFinal
Field `buf` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/logfile/DefaultMappedFile.java`
#### Snippet
```java
        private int start;
        private int current;
        private ByteBuffer buf;

        public Itr(int pos) {
```

### FieldMayBeFinal
Field `timerSkipUnknownError` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
    private String timerCheckMetricsWhen = "05";

    private boolean timerSkipUnknownError = false;
    private boolean timerWarmEnable = false;
    private boolean timerStopDequeue = false;
```

### FieldMayBeFinal
Field `timerWarmEnable` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java

    private boolean timerSkipUnknownError = false;
    private boolean timerWarmEnable = false;
    private boolean timerStopDequeue = false;
    private int timerCongestNumEachSlot = Integer.MAX_VALUE;
```

### FieldMayBeFinal
Field `timerStopDequeue` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
    private boolean timerSkipUnknownError = false;
    private boolean timerWarmEnable = false;
    private boolean timerStopDequeue = false;
    private int timerCongestNumEachSlot = Integer.MAX_VALUE;

```

### FieldMayBeFinal
Field `timerCheckMetricsWhen` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
    private boolean timerStopEnqueue = false;

    private String timerCheckMetricsWhen = "05";

    private boolean timerSkipUnknownError = false;
```

### FieldMayBeFinal
Field `timerEnableDisruptor` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/config/MessageStoreConfig.java`
#### Snippet
```java
    private int timerPutMessageThreadNum = 3;

    private boolean timerEnableDisruptor = false;

    private boolean timerEnableCheckMetrics = true;
```

### FieldMayBeFinal
Field `mqLockTable` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/MessageQueueLock.java`
#### Snippet
```java
 */
public class MessageQueueLock {
    private ConcurrentMap<MessageQueue, ConcurrentMap<Integer, Object>> mqLockTable =
        new ConcurrentHashMap<>(32);

```

### FieldMayBeFinal
Field `waitInterval` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceService.java`
#### Snippet
```java

public class RebalanceService extends ServiceThread {
    private static long waitInterval =
        Long.parseLong(System.getProperty(
            "rocketmq.client.rebalance.waitInterval", "20000"));
```

### FieldMayBeFinal
Field `status` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
        private ByteBuffer data;
        private List<byte[]> batchData;
        private AppendMessageStatus status;
        private int totalMsgLen;

```

### FieldMayBeFinal
Field `sbr` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java
    public static class DLedgerSelectMappedBufferResult extends SelectMappedBufferResult {

        private SelectMmapBufferResult sbr;

        public DLedgerSelectMappedBufferResult(SelectMmapBufferResult sbr) {
```

### FieldMayBeFinal
Field `queueOffsetKey` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/dledger/DLedgerCommitLog.java`
#### Snippet
```java

    class EncodeResult {
        private String queueOffsetKey;
        private ByteBuffer data;
        private List<byte[]> batchData;
```

### FieldMayBeFinal
Field `frequency` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
    private TimerMetrics timerMetrics;
    private long lastTimeOfCheckMetrics = System.currentTimeMillis();
    private AtomicInteger frequency = new AtomicInteger(0);
    //the dequeue is an asynchronous process, use this flag to track if the status has changed
    private boolean dequeueStatusChangeFlag = false;
```

### FieldMayBeFinal
Field `timerMetrics` may be 'final'
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
    private final MessageStoreConfig storeConfig;
    private volatile BrokerRole lastBrokerRole = BrokerRole.SLAVE;
    private TimerMetrics timerMetrics;
    private long lastTimeOfCheckMetrics = System.currentTimeMillis();
    private AtomicInteger frequency = new AtomicInteger(0);
```

### FieldMayBeFinal
Field `waitAckCounter` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PopProcessQueue.java`
#### Snippet
```java

    private long lastPopTimestamp;
    private AtomicInteger waitAckCounter = new AtomicInteger(0);
    private volatile boolean dropped = false;

```

### FieldMayBeFinal
Field `random` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
    private volatile boolean connectBrokerByUser = false;
    private volatile long defaultBrokerId = MixAll.MASTER_ID;
    private Random random = new Random(System.nanoTime());
    private ArrayList<FilterMessageHook> filterMessageHookList = new ArrayList<>();

```

### FieldMayBeFinal
Field `pullFromWhichNodeTable` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
    private final String consumerGroup;
    private final boolean unitMode;
    private ConcurrentMap<MessageQueue, AtomicLong/* brokerId */> pullFromWhichNodeTable =
        new ConcurrentHashMap<>(32);
    private volatile boolean connectBrokerByUser = false;
```

### FieldMayBeFinal
Field `topicClientRebalance` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java

    private Map<String, String> topicBrokerRebalance = new ConcurrentHashMap<>();
    private Map<String, String> topicClientRebalance = new ConcurrentHashMap<>();

    public RebalanceImpl(String consumerGroup, MessageModel messageModel,
```

### FieldMayBeFinal
Field `topicBrokerRebalance` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/RebalanceImpl.java`
#### Snippet
```java
    private static final int QUERY_ASSIGNMENT_TIMEOUT = 3000;

    private Map<String, String> topicBrokerRebalance = new ConcurrentHashMap<>();
    private Map<String, String> topicClientRebalance = new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `localDispatcher` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/hook/SendMessageTraceHookImpl.java`
#### Snippet
```java
public class SendMessageTraceHookImpl implements SendMessageHook {

    private TraceDispatcher localDispatcher;

    public SendMessageTraceHookImpl(TraceDispatcher localDispatcher) {
```

### FieldMayBeFinal
Field `tracer` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/hook/EndTransactionOpenTracingHookImpl.java`
#### Snippet
```java
public class EndTransactionOpenTracingHookImpl implements EndTransactionHook {

    private Tracer tracer;

    public EndTransactionOpenTracingHookImpl(Tracer tracer) {
```

### FieldMayBeFinal
Field `rebalanceImpl` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPullConsumerImpl.java`
#### Snippet
```java
    private PullAPIWrapper pullAPIWrapper;
    private OffsetStore offsetStore;
    private RebalanceImpl rebalanceImpl = new RebalancePullImpl(this);

    public DefaultMQPullConsumerImpl(final DefaultMQPullConsumer defaultMQPullConsumer, final RPCHook rpcHook) {
```

### FieldMayBeFinal
Field `tracer` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/hook/SendMessageOpenTracingHookImpl.java`
#### Snippet
```java
public class SendMessageOpenTracingHookImpl implements SendMessageHook {

    private Tracer tracer;

    public SendMessageOpenTracingHookImpl(Tracer tracer) {
```

### FieldMayBeFinal
Field `localDispatcher` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/hook/ConsumeMessageTraceHookImpl.java`
#### Snippet
```java
public class ConsumeMessageTraceHookImpl implements ConsumeMessageHook {

    private TraceDispatcher localDispatcher;

    public ConsumeMessageTraceHookImpl(TraceDispatcher localDispatcher) {
```

### FieldMayBeFinal
Field `localDispatcher` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/hook/EndTransactionTraceHookImpl.java`
#### Snippet
```java
public class EndTransactionTraceHookImpl implements EndTransactionHook {

    private TraceDispatcher localDispatcher;

    public EndTransactionTraceHookImpl(TraceDispatcher localDispatcher) {
```

### FieldMayBeFinal
Field `tracer` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/hook/ConsumeMessageOpenTracingHookImpl.java`
#### Snippet
```java
public class ConsumeMessageOpenTracingHookImpl implements ConsumeMessageHook {

    private Tracer tracer;

    public ConsumeMessageOpenTracingHookImpl(Tracer tracer) {
```

### FieldMayBeFinal
Field `topicMessageQueueChangeListenerMap` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
    private final ScheduledExecutorService scheduledExecutorService;

    private Map<String, TopicMessageQueueChangeListener> topicMessageQueueChangeListenerMap = new HashMap<>();

    private Map<String, Set<MessageQueue>> messageQueuesForTopic = new HashMap<>();
```

### FieldMayBeFinal
Field `defaultLitePullConsumer` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
    private ConcurrentHashMap<String/* topic */, String/* subExpression */> topicToSubExpression = new ConcurrentHashMap<>();

    private DefaultLitePullConsumer defaultLitePullConsumer;

    private final ConcurrentMap<MessageQueue, PullTaskImpl> taskTable =
```

### FieldMayBeFinal
Field `scheduledThreadPoolExecutor` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
    private final BlockingQueue<ConsumeRequest> consumeRequestCache = new LinkedBlockingQueue<>();

    private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    private final ScheduledExecutorService scheduledExecutorService;
```

### FieldMayBeFinal
Field `rebalanceImpl` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
    private OffsetStore offsetStore;

    private RebalanceImpl rebalanceImpl = new RebalanceLitePullImpl(this);

    private enum SubscriptionType {
```

### FieldMayBeFinal
Field `assignedMessageQueue` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
        new ConcurrentHashMap<>();

    private AssignedMessageQueue assignedMessageQueue = new AssignedMessageQueue();

    private final BlockingQueue<ConsumeRequest> consumeRequestCache = new LinkedBlockingQueue<>();
```

### FieldMayBeFinal
Field `topicToSubExpression` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
    private static final long PULL_TIME_DELAY_MILLS_ON_EXCEPTION = 3 * 1000;

    private ConcurrentHashMap<String/* topic */, String/* subExpression */> topicToSubExpression = new ConcurrentHashMap<>();

    private DefaultLitePullConsumer defaultLitePullConsumer;
```

### FieldMayBeFinal
Field `messageQueuesForTopic` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
    private Map<String, TopicMessageQueueChangeListener> topicMessageQueueChangeListenerMap = new HashMap<>();

    private Map<String, Set<MessageQueue>> messageQueuesForTopic = new HashMap<>();

    private long consumeRequestFlowControlTimes = 0L;
```

### FieldMayBeFinal
Field `clientConfig` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
    private final ClientRemotingProcessor clientRemotingProcessor;
    private String nameSrvAddr = null;
    private ClientConfig clientConfig;

    public MQClientAPIImpl(final NettyClientConfig nettyClientConfig,
```

### FieldMayBeFinal
Field `sendSmartMsg` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
public class MQClientAPIImpl implements NameServerUpdateCallback {
    private final static Logger log = LoggerFactory.getLogger(MQClientAPIImpl.class);
    private static boolean sendSmartMsg =
        Boolean.parseBoolean(System.getProperty("org.apache.rocketmq.client.sendSmartMsg", "true"));

```

### FieldMayBeFinal
Field `type` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/consumer/MessageSelector.java`
#### Snippet
```java
     * @see org.apache.rocketmq.common.filter.ExpressionType
     */
    private String type;

    /**
```

### FieldMayBeFinal
Field `expression` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/consumer/MessageSelector.java`
#### Snippet
```java
     * expression content.
     */
    private String expression;

    private MessageSelector(String type, String expression) {
```

### FieldMayBeFinal
Field `discardCount` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
    private final ThreadPoolExecutor traceExecutor;
    // The last discard number of log
    private AtomicLong discardCount;
    private Thread worker;
    private final ArrayBlockingQueue<TraceContext> traceContextQueue;
```

### FieldMayBeFinal
Field `sendWhichQueue` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
    private DefaultMQProducerImpl hostProducer;
    private DefaultMQPushConsumerImpl hostConsumer;
    private volatile ThreadLocalIndex sendWhichQueue = new ThreadLocalIndex();
    private String dispatcherId = UUID.randomUUID().toString();
    private volatile String traceTopicName;
```

### FieldMayBeFinal
Field `appenderQueue` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
    private final ArrayBlockingQueue<TraceContext> traceContextQueue;
    private final HashMap<String, TraceDataSegment> taskQueueByTopic;
    private ArrayBlockingQueue<Runnable> appenderQueue;
    private volatile Thread shutDownHook;
    private volatile boolean stopped = false;
```

### FieldMayBeFinal
Field `isStarted` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
    private String dispatcherId = UUID.randomUUID().toString();
    private volatile String traceTopicName;
    private AtomicBoolean isStarted = new AtomicBoolean(false);
    private volatile AccessChannel accessChannel = AccessChannel.LOCAL;
    private String group;
```

### FieldMayBeFinal
Field `group` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
    private AtomicBoolean isStarted = new AtomicBoolean(false);
    private volatile AccessChannel accessChannel = AccessChannel.LOCAL;
    private String group;
    private Type type;

```

### FieldMayBeFinal
Field `type` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
    private volatile AccessChannel accessChannel = AccessChannel.LOCAL;
    private String group;
    private Type type;

    public AsyncTraceDispatcher(String group, Type type, String traceTopicName, RPCHook rpcHook) {
```

### FieldMayBeFinal
Field `hasShutdown` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
        if (shutDownHook == null) {
            shutDownHook = new Thread(new Runnable() {
                private volatile boolean hasShutdown = false;

                @Override
```

### FieldMayBeFinal
Field `dispatcherId` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
    private DefaultMQPushConsumerImpl hostConsumer;
    private volatile ThreadLocalIndex sendWhichQueue = new ThreadLocalIndex();
    private String dispatcherId = UUID.randomUUID().toString();
    private volatile String traceTopicName;
    private AtomicBoolean isStarted = new AtomicBoolean(false);
```

### FieldMayBeFinal
Field `brokerSuspendMaxTimeMillis` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/consumer/DefaultLitePullConsumer.java`
#### Snippet
```java
     * Long polling mode, the Consumer connection max suspend time, it is not recommended to modify
     */
    private long brokerSuspendMaxTimeMillis = 1000 * 20;

    /**
```

### FieldMayBeFinal
Field `popDelayLevel` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPushConsumerImpl.java`
#### Snippet
```java

    //10s 30s 1m 2m 3m 4m 5m 6m 7m 8m 9m 10m 20m 30m 1h 2h
    private int[] popDelayLevel = new int[] {10, 30, 60, 120, 180, 240, 300, 360, 420, 480, 540, 600, 1200, 1800, 3600, 7200};

    private static final int MAX_POP_INVISIBLE_TIME = 300000;
```

### FieldMayBeFinal
Field `offsetTable` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/consumer/store/LocalFileOffsetStore.java`
#### Snippet
```java
    private final String groupName;
    private final String storePath;
    private ConcurrentMap<MessageQueue, AtomicLong> offsetTable =
        new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `random` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/producer/selector/SelectMessageQueueByRandom.java`
#### Snippet
```java

public class SelectMessageQueueByRandom implements MessageQueueSelector {
    private Random random = new Random(System.currentTimeMillis());

    @Override
```

### FieldMayBeFinal
Field `offsetTable` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/consumer/store/RemoteBrokerOffsetStore.java`
#### Snippet
```java
    private final MQClientInstance mQClientFactory;
    private final String groupName;
    private ConcurrentMap<MessageQueue, AtomicLong> offsetTable =
        new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `requestFutureTable` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/producer/RequestFutureHolder.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(RequestFutureHolder.class);
    private static final RequestFutureHolder INSTANCE = new RequestFutureHolder();
    private ConcurrentHashMap<String, RequestResponseFuture> requestFutureTable = new ConcurrentHashMap<>();
    private final Set<DefaultMQProducerImpl> producerSet = new HashSet<>();
    private ScheduledExecutorService scheduledExecutorService = null;
```

### FieldMayBeFinal
Field `aclPlugEngine` may be 'final'
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainAccessValidator.java`
#### Snippet
```java
public class PlainAccessValidator implements AccessValidator {

    private PlainPermissionManager aclPlugEngine;

    public PlainAccessValidator() {
```

### FieldMayBeFinal
Field `mqFaultStrategy` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
    private MQClientInstance mQClientFactory;
    private ArrayList<CheckForbiddenHook> checkForbiddenHookList = new ArrayList<>();
    private MQFaultStrategy mqFaultStrategy = new MQFaultStrategy();
    private ExecutorService asyncSenderExecutor;

```

### FieldMayBeFinal
Field `checkForbiddenHookList` may be 'final'
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
    private ServiceState serviceState = ServiceState.CREATE_JUST;
    private MQClientInstance mQClientFactory;
    private ArrayList<CheckForbiddenHook> checkForbiddenHookList = new ArrayList<>();
    private MQFaultStrategy mqFaultStrategy = new MQFaultStrategy();
    private ExecutorService asyncSenderExecutor;
```

### FieldMayBeFinal
Field `netAddress` may be 'final'
in `acl/src/main/java/org/apache/rocketmq/acl/plain/RemoteAddressStrategyFactory.java`
#### Snippet
```java
    public static class OneRemoteAddressStrategy implements RemoteAddressStrategy {

        private String netAddress;

        public OneRemoteAddressStrategy(String netAddress) {
```

### FieldMayBeFinal
Field `brokerAddress` may be 'final'
in `controller/src/main/java/org/apache/rocketmq/controller/impl/event/UpdateBrokerAddressEvent.java`
#### Snippet
```java
    private String brokerName;

    private String brokerAddress;

    private Long brokerId;
```

### FieldMayBeFinal
Field `brokerId` may be 'final'
in `controller/src/main/java/org/apache/rocketmq/controller/impl/event/UpdateBrokerAddressEvent.java`
#### Snippet
```java
    private String brokerAddress;

    private Long brokerId;

    public UpdateBrokerAddressEvent(String clusterName, String brokerName, String brokerAddress, Long brokerId) {
```

### FieldMayBeFinal
Field `clusterName` may be 'final'
in `controller/src/main/java/org/apache/rocketmq/controller/impl/event/UpdateBrokerAddressEvent.java`
#### Snippet
```java
public class UpdateBrokerAddressEvent implements EventMessage {

    private String clusterName;

    private String brokerName;
```

### FieldMayBeFinal
Field `brokerName` may be 'final'
in `controller/src/main/java/org/apache/rocketmq/controller/impl/event/UpdateBrokerAddressEvent.java`
#### Snippet
```java
    private String clusterName;

    private String brokerName;

    private String brokerAddress;
```

### FieldMayBeFinal
Field `heartbeatManager` may be 'final'
in `controller/src/main/java/org/apache/rocketmq/controller/ControllerManager.java`
#### Snippet
```java
    private final RemotingClient remotingClient;
    private Controller controller;
    private BrokerHeartbeatManager heartbeatManager;
    private ExecutorService controllerRequestExecutor;
    private BlockingQueue<Runnable> controllerRequestThreadPoolQueue;
```

### FieldMayBeFinal
Field `notifyService` may be 'final'
in `controller/src/main/java/org/apache/rocketmq/controller/ControllerManager.java`
#### Snippet
```java
    private BlockingQueue<Runnable> controllerRequestThreadPoolQueue;

    private NotifyService notifyService;

    public ControllerManager(ControllerConfig controllerConfig, NettyServerConfig nettyServerConfig,
```

### FieldMayBeFinal
Field `defaultAclDir` may be 'final'
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
        System.getenv(MixAll.ROCKETMQ_HOME_ENV));

    private String defaultAclDir;

    private String defaultAclFile;
```

### FieldMayBeFinal
Field `fileHome` may be 'final'
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.COMMON_LOGGER_NAME);

    private String fileHome = System.getProperty(MixAll.ROCKETMQ_HOME_PROPERTY,
        System.getenv(MixAll.ROCKETMQ_HOME_ENV));

```

### FieldMayBeFinal
Field `remoteAddressStrategyFactory` may be 'final'
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
    private List<RemoteAddressStrategy> globalWhiteRemoteAddressStrategy = new ArrayList<>();

    private RemoteAddressStrategyFactory remoteAddressStrategyFactory = new RemoteAddressStrategyFactory();

    private Map<String/** fileFullPath **/, List<RemoteAddressStrategy>> globalWhiteRemoteAddressStrategyMap = new HashMap<>();
```

### FieldMayBeFinal
Field `defaultAclFile` may be 'final'
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
    private String defaultAclDir;

    private String defaultAclFile;

    private Map<String/** fileFullPath **/, Map<String/** AccessKey **/, PlainAccessResource>> aclPlainAccessResourceMap = new HashMap<>();
```

### FieldMayBeFinal
Field `brokerLifecycleListeners` may be 'final'
in `controller/src/main/java/org/apache/rocketmq/controller/impl/DLedgerController.java`
#### Snippet
```java
    private ScheduledFuture scanInactiveMasterFuture;

    private List<BrokerLifecycleListener> brokerLifecycleListeners;

    // Usr for checking whether the broker is alive
```

### FieldMayBeFinal
Field `isScheduling` may be 'final'
in `controller/src/main/java/org/apache/rocketmq/controller/impl/DLedgerController.java`
#### Snippet
```java
    private ElectPolicy electPolicy;

    private AtomicBoolean isScheduling = new AtomicBoolean(false);

    public DLedgerController(final ControllerConfig config, final BrokerValidPredicate brokerAlivePredicate) {
```

### FieldMayBeFinal
Field `startupTimeMillis` may be 'final'
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/processor/ClientRequestProcessor.java`
#### Snippet
```java

    protected NamesrvController namesrvController;
    private long startupTimeMillis;

    private AtomicBoolean needCheckNamesrvReady = new AtomicBoolean(true);
```

### FieldMayBeFinal
Field `log` may be 'final'
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/processor/ClientRequestProcessor.java`
#### Snippet
```java
public class ClientRequestProcessor implements NettyRequestProcessor {

    private static Logger log = LoggerFactory.getLogger(LoggerName.NAMESRV_LOGGER_NAME);

    protected NamesrvController namesrvController;
```

### FieldMayBeFinal
Field `needCheckNamesrvReady` may be 'final'
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/processor/ClientRequestProcessor.java`
#### Snippet
```java
    private long startupTimeMillis;

    private AtomicBoolean needCheckNamesrvReady = new AtomicBoolean(true);

    public ClientRequestProcessor(final NamesrvController namesrvController) {
```

### FieldMayBeFinal
Field `unregistrationQueue` may be 'final'
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/routeinfo/BatchUnregistrationService.java`
#### Snippet
```java
public class BatchUnregistrationService extends ServiceThread {
    private final RouteInfoManager routeInfoManager;
    private BlockingQueue<UnRegisterBrokerRequestHeader> unregistrationQueue;
    private static final Logger log = LoggerFactory.getLogger(LoggerName.NAMESRV_LOGGER_NAME);

```

### FieldMayBeFinal
Field `k` may be 'final'
in `filter/src/main/java/org/apache/rocketmq/filter/util/BloomFilter.java`
#### Snippet
```java

    // hash function num, by calculation.
    private int k;
    // bit count, by calculation.
    private int m;
```

### FieldMayBeFinal
Field `log` may be 'final'
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/processor/DefaultRequestProcessor.java`
#### Snippet
```java

public class DefaultRequestProcessor implements NettyRequestProcessor {
    private static Logger log = LoggerFactory.getLogger(LoggerName.NAMESRV_LOGGER_NAME);

    protected final NamesrvController namesrvController;
```

### FieldMayBeFinal
Field `bytes` may be 'final'
in `filter/src/main/java/org/apache/rocketmq/filter/util/BitsArray.java`
#### Snippet
```java
public class BitsArray implements Cloneable {

    private byte[] bytes;
    private int bitLength;

```

### FieldMayBeFinal
Field `bitLength` may be 'final'
in `filter/src/main/java/org/apache/rocketmq/filter/util/BitsArray.java`
#### Snippet
```java

    private byte[] bytes;
    private int bitLength;

    public static BitsArray create(int bitLength) {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `filter/src/main/java/org/apache/rocketmq/filter/expression/ConstantExpression.java`
#### Snippet
```java
public class ConstantExpression implements Expression {

    private Object value;

    public ConstantExpression(Object value) {
```

### FieldMayBeFinal
Field `jjExpentries` may be 'final'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
    }

    private java.util.List<int[]> jjExpentries = new java.util.ArrayList<>();
    private int[] jjExpentry;
    private int jjKind = -1;
```

### FieldMayBeFinal
Field `jjLasttokens` may be 'final'
in `filter/src/main/java/org/apache/rocketmq/filter/parser/SelectorParser.java`
#### Snippet
```java
    private int[] jjExpentry;
    private int jjKind = -1;
    private int[] jjLasttokens = new int[100];
    private int jjEndpos;

```

### FieldMayBeFinal
Field `brokerController` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicQueueMappingManager.java`
#### Snippet
```java
    //this data version should be equal to the TopicConfigManager
    private final DataVersion dataVersion = new DataVersion();
    private transient BrokerController brokerController;

    private final ConcurrentMap<String, TopicQueueMappingDetail> topicQueueMappingTable = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `scheduledExecutorService` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/client/ClientHousekeepingService.java`
#### Snippet
```java
    private final BrokerController brokerController;

    private ScheduledExecutorService scheduledExecutorService;

    public ClientHousekeepingService(final BrokerController brokerController) {
```

### FieldMayBeFinal
Field `brokerController` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicRouteInfoManager.java`
#### Snippet
```java

    private ScheduledExecutorService scheduledExecutorService;
    private BrokerController brokerController;

    public TopicRouteInfoManager(BrokerController brokerController) {
```

### FieldMayBeFinal
Field `positiveAtomicCounter` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/client/ProducerManager.java`
#### Snippet
```java
    private final ConcurrentHashMap<String, Channel> clientChannelTable = new ConcurrentHashMap<>();
    protected final BrokerStatsManager brokerStatsManager;
    private PositiveAtomicCounter positiveAtomicCounter = new PositiveAtomicCounter();
    private final List<ProducerChangeListener> producerChangeListenerList = new CopyOnWriteArrayList<>();

```

### FieldMayBeFinal
Field `dataVersion` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicConfigManager.java`
#### Snippet
```java
    private transient final Lock topicConfigTableLock = new ReentrantLock();
    private ConcurrentMap<String, TopicConfig> topicConfigTable = new ConcurrentHashMap<>(1024);
    private DataVersion dataVersion = new DataVersion();
    private transient BrokerController brokerController;

```

### FieldMayBeFinal
Field `brokerAddr` may be 'final'
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/routeinfo/RouteInfoManager.java`
#### Snippet
```java
class BrokerAddrInfo {
    private String clusterName;
    private String brokerAddr;

    private int hash;
```

### FieldMayBeFinal
Field `clusterName` may be 'final'
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/routeinfo/RouteInfoManager.java`
#### Snippet
```java
 */
class BrokerAddrInfo {
    private String clusterName;
    private String brokerAddr;

```

### FieldMayBeFinal
Field `properties` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/filter/MessageEvaluationContext.java`
#### Snippet
```java
public class MessageEvaluationContext implements EvaluationContext {

    private Map<String, String> properties;

    public MessageEvaluationContext(Map<String, String> properties) {
```

### FieldMayBeFinal
Field `bloomFilter` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/filter/ConsumerFilterManager.java`
#### Snippet
```java

    private transient BrokerController brokerController;
    private transient BloomFilter bloomFilter;

    public ConsumerFilterManager() {
```

### FieldMayBeFinal
Field `dLegerServer` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/dledger/DLedgerRoleChangeHandler.java`
#### Snippet
```java
    private DefaultMessageStore messageStore;
    private DLedgerCommitLog dLedgerCommitLog;
    private DLedgerServer dLegerServer;
    private Future<?> slaveSyncFuture;
    private long lastSyncTimeMs = System.currentTimeMillis();
```

### FieldMayBeFinal
Field `messageStore` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/dledger/DLedgerRoleChangeHandler.java`
#### Snippet
```java
    private ExecutorService executorService;
    private BrokerController brokerController;
    private DefaultMessageStore messageStore;
    private DLedgerCommitLog dLedgerCommitLog;
    private DLedgerServer dLegerServer;
```

### FieldMayBeFinal
Field `dLedgerCommitLog` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/dledger/DLedgerRoleChangeHandler.java`
#### Snippet
```java
    private BrokerController brokerController;
    private DefaultMessageStore messageStore;
    private DLedgerCommitLog dLedgerCommitLog;
    private DLedgerServer dLegerServer;
    private Future<?> slaveSyncFuture;
```

### FieldMayBeFinal
Field `brokerController` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/dledger/DLedgerRoleChangeHandler.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerName.BROKER_LOGGER_NAME);
    private ExecutorService executorService;
    private BrokerController brokerController;
    private DefaultMessageStore messageStore;
    private DLedgerCommitLog dLedgerCommitLog;
```

### FieldMayBeFinal
Field `executorService` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/dledger/DLedgerRoleChangeHandler.java`
#### Snippet
```java

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerName.BROKER_LOGGER_NAME);
    private ExecutorService executorService;
    private BrokerController brokerController;
    private DefaultMessageStore messageStore;
```

### FieldMayBeFinal
Field `brokerOuterAPI` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicQueueMappingCleanService.java`
#### Snippet
```java

    private TopicQueueMappingManager topicQueueMappingManager;
    private BrokerOuterAPI brokerOuterAPI;
    private RpcClient rpcClient;
    private MessageStoreConfig messageStoreConfig;
```

### FieldMayBeFinal
Field `brokerConfig` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicQueueMappingCleanService.java`
#### Snippet
```java
    private RpcClient rpcClient;
    private MessageStoreConfig messageStoreConfig;
    private BrokerConfig brokerConfig;
    private BrokerController brokerController;

```

### FieldMayBeFinal
Field `topicQueueMappingManager` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicQueueMappingCleanService.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.BROKER_LOGGER_NAME);

    private TopicQueueMappingManager topicQueueMappingManager;
    private BrokerOuterAPI brokerOuterAPI;
    private RpcClient rpcClient;
```

### FieldMayBeFinal
Field `rpcClient` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicQueueMappingCleanService.java`
#### Snippet
```java
    private TopicQueueMappingManager topicQueueMappingManager;
    private BrokerOuterAPI brokerOuterAPI;
    private RpcClient rpcClient;
    private MessageStoreConfig messageStoreConfig;
    private BrokerConfig brokerConfig;
```

### FieldMayBeFinal
Field `brokerController` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicQueueMappingCleanService.java`
#### Snippet
```java
    private MessageStoreConfig messageStoreConfig;
    private BrokerConfig brokerConfig;
    private BrokerController brokerController;

    public TopicQueueMappingCleanService(BrokerController brokerController) {
```

### FieldMayBeFinal
Field `messageStoreConfig` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/topic/TopicQueueMappingCleanService.java`
#### Snippet
```java
    private BrokerOuterAPI brokerOuterAPI;
    private RpcClient rpcClient;
    private MessageStoreConfig messageStoreConfig;
    private BrokerConfig brokerConfig;
    private BrokerController brokerController;
```

### FieldMayBeFinal
Field `configuration` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/BrokerController.java`
#### Snippet
```java
    private TimerCheckpoint timerCheckpoint;
    protected BrokerFastFailure brokerFastFailure;
    private Configuration configuration;
    protected TopicQueueMappingCleanService topicQueueMappingCleanService;
    protected FileWatchService fileWatchService;
```

### FieldMayBeFinal
Field `scheduledExecutorService` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/filtersrv/FilterServerManager.java`
#### Snippet
```java
    private final BrokerController brokerController;

    private ScheduledExecutorService scheduledExecutorService = Executors
        .newSingleThreadScheduledExecutor(new ThreadFactoryImpl("FilterServerManagerScheduledThread"));

```

### FieldMayBeFinal
Field `resendCount` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/schedule/ScheduleMessageService.java`
#### Snippet
```java
        private CompletableFuture<PutMessageResult> future;

        private volatile AtomicInteger resendCount = new AtomicInteger(0);
        private volatile ProcessStatus status = ProcessStatus.RUNNING;

```

### FieldMayBeFinal
Field `reviveTopic` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AckMessageProcessor.java`
#### Snippet
```java
    private static final Logger POP_LOGGER = LoggerFactory.getLogger(LoggerName.ROCKETMQ_POP_LOGGER_NAME);
    private final BrokerController brokerController;
    private String reviveTopic;
    private PopReviveService[] popReviveServices;

```

### FieldMayBeFinal
Field `popReviveServices` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AckMessageProcessor.java`
#### Snippet
```java
    private final BrokerController brokerController;
    private String reviveTopic;
    private PopReviveService[] popReviveServices;

    public AckMessageProcessor(final BrokerController brokerController) {
```

### FieldMayBeFinal
Field `random` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PeekMessageProcessor.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(LoggerName.BROKER_LOGGER_NAME);
    private final BrokerController brokerController;
    private Random random = new Random(System.currentTimeMillis());

    public PeekMessageProcessor(final BrokerController brokerController) {
```

### FieldMayBeFinal
Field `checkNotificationPollingThread` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/NotificationProcessor.java`
#### Snippet
```java
    private static final String BORN_TIME = "bornTime";
    private ConcurrentLinkedHashMap<String, ArrayBlockingQueue<NotificationRequest>> pollingMap = new ConcurrentLinkedHashMap.Builder<String, ArrayBlockingQueue<NotificationRequest>>().maximumWeightedCapacity(100000).build();
    private Thread checkNotificationPollingThread;

    public NotificationProcessor(final BrokerController brokerController) {
```

### FieldMayBeFinal
Field `pollingMap` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/NotificationProcessor.java`
#### Snippet
```java
    private Random random = new Random(System.currentTimeMillis());
    private static final String BORN_TIME = "bornTime";
    private ConcurrentLinkedHashMap<String, ArrayBlockingQueue<NotificationRequest>> pollingMap = new ConcurrentLinkedHashMap.Builder<String, ArrayBlockingQueue<NotificationRequest>>().maximumWeightedCapacity(100000).build();
    private Thread checkNotificationPollingThread;

```

### FieldMayBeFinal
Field `random` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/NotificationProcessor.java`
#### Snippet
```java
    private static final Logger POP_LOGGER = LoggerFactory.getLogger(LoggerName.ROCKETMQ_POP_LOGGER_NAME);
    private final BrokerController brokerController;
    private Random random = new Random(System.currentTimeMillis());
    private static final String BORN_TIME = "bornTime";
    private ConcurrentLinkedHashMap<String, ArrayBlockingQueue<NotificationRequest>> pollingMap = new ConcurrentLinkedHashMap.Builder<String, ArrayBlockingQueue<NotificationRequest>>().maximumWeightedCapacity(100000).build();
```

### FieldMayBeFinal
Field `messageRequestModeManager` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/QueryAssignmentProcessor.java`
#### Snippet
```java
    private final ConcurrentHashMap<String, AllocateMessageQueueStrategy> name2LoadStrategy = new ConcurrentHashMap<>();

    private MessageRequestModeManager messageRequestModeManager;

    public QueryAssignmentProcessor(final BrokerController brokerController) {
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/NotificationRequest.java`
#### Snippet
```java
public class NotificationRequest {
    private RemotingCommand remotingCommand;
    private Channel channel;
    private long expired;
    private AtomicBoolean complete = new AtomicBoolean(false);
```

### FieldMayBeFinal
Field `complete` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/NotificationRequest.java`
#### Snippet
```java
    private Channel channel;
    private long expired;
    private AtomicBoolean complete = new AtomicBoolean(false);

    public NotificationRequest(RemotingCommand remotingCommand, Channel channel, long expired) {
```

### FieldMayBeFinal
Field `expired` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/NotificationRequest.java`
#### Snippet
```java
    private RemotingCommand remotingCommand;
    private Channel channel;
    private long expired;
    private AtomicBoolean complete = new AtomicBoolean(false);

```

### FieldMayBeFinal
Field `remotingCommand` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/NotificationRequest.java`
#### Snippet
```java

public class NotificationRequest {
    private RemotingCommand remotingCommand;
    private Channel channel;
    private long expired;
```

### FieldMayBeFinal
Field `complete` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/PopRequest.java`
#### Snippet
```java
    private Channel channel;
    private long expired;
    private AtomicBoolean complete = new AtomicBoolean(false);
    private final long op = COUNTER.getAndIncrement();

```

### FieldMayBeFinal
Field `expired` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/PopRequest.java`
#### Snippet
```java
    private RemotingCommand remotingCommand;
    private Channel channel;
    private long expired;
    private AtomicBoolean complete = new AtomicBoolean(false);
    private final long op = COUNTER.getAndIncrement();
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/PopRequest.java`
#### Snippet
```java

    private RemotingCommand remotingCommand;
    private Channel channel;
    private long expired;
    private AtomicBoolean complete = new AtomicBoolean(false);
```

### FieldMayBeFinal
Field `remotingCommand` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/longpolling/PopRequest.java`
#### Snippet
```java
    private static final AtomicLong COUNTER = new AtomicLong(Long.MIN_VALUE);

    private RemotingCommand remotingCommand;
    private Channel channel;
    private long expired;
```

### FieldMayBeFinal
Field `brokerController` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/TransactionalMessageCheckService.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.TRANSACTION_LOGGER_NAME);

    private BrokerController brokerController;

    public TransactionalMessageCheckService(BrokerController brokerController) {
```

### FieldMayBeFinal
Field `brokerController` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/TransactionalOpBatchService.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerName.TRANSACTION_LOGGER_NAME);

    private BrokerController brokerController;
    private TransactionalMessageServiceImpl transactionalMessageService;

```

### FieldMayBeFinal
Field `transactionalMessageService` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/TransactionalOpBatchService.java`
#### Snippet
```java

    private BrokerController brokerController;
    private TransactionalMessageServiceImpl transactionalMessageService;

    private long wakeupTimestamp = 0;
```

### FieldMayBeFinal
Field `contextQueue` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/MessageQueueOpContext.java`
#### Snippet
```java
    private AtomicInteger totalSize = new AtomicInteger(0);
    private volatile long lastWriteTimestamp;
    private LinkedBlockingQueue<String> contextQueue;

    public MessageQueueOpContext(long timestamp, int queueLength) {
```

### FieldMayBeFinal
Field `totalSize` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/MessageQueueOpContext.java`
#### Snippet
```java

public class MessageQueueOpContext {
    private AtomicInteger totalSize = new AtomicInteger(0);
    private volatile long lastWriteTimestamp;
    private LinkedBlockingQueue<String> contextQueue;
```

### FieldMayBeFinal
Field `tempBrokerMetadata` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/controller/ReplicasManager.java`
#### Snippet
```java
    private BrokerMetadata brokerMetadata;

    private TempBrokerMetadata tempBrokerMetadata;

    private Set<Long> syncStateSet;
```

### FieldMayBeFinal
Field `brokerMetadata` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/controller/ReplicasManager.java`
#### Snippet
```java
    private volatile int originalBrokerPermission = 0;

    private BrokerMetadata brokerMetadata;

    private TempBrokerMetadata tempBrokerMetadata;
```

### FieldMayBeFinal
Field `random` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/controller/ReplicasManager.java`
#### Snippet
```java
    private int masterEpoch = 0;
    private long lastSyncTimeMs = System.currentTimeMillis();
    private Random random = new Random();

    public ReplicasManager(final BrokerController brokerController) {
```

### FieldMayBeFinal
Field `queueId` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopReviveService.java`
#### Snippet
```java
    private static final Logger POP_LOGGER = LoggerFactory.getLogger(LoggerName.ROCKETMQ_POP_LOGGER_NAME);

    private int queueId;
    private BrokerController brokerController;
    private String reviveTopic;
```

### FieldMayBeFinal
Field `brokerController` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopReviveService.java`
#### Snippet
```java

    private int queueId;
    private BrokerController brokerController;
    private String reviveTopic;
    private long currentReviveMessageTimestamp = -1;
```

### FieldMayBeFinal
Field `reviveTopic` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopReviveService.java`
#### Snippet
```java
    private int queueId;
    private BrokerController brokerController;
    private String reviveTopic;
    private long currentReviveMessageTimestamp = -1;
    private volatile boolean shouldRunPopRevive = false;
```

### FieldMayBeFinal
Field `subscriptionGroupTable` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/subscription/SubscriptionGroupManager.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.BROKER_LOGGER_NAME);

    private ConcurrentMap<String, SubscriptionGroupConfig> subscriptionGroupTable =
        new ConcurrentHashMap<>(1024);

```

### FieldMayBeFinal
Field `brokerContainerIP` may be 'final'
in `container/src/main/java/org/apache/rocketmq/container/BrokerContainerConfig.java`
#### Snippet
```java

    @ImportantField
    private String brokerContainerIP = NetworkUtil.getLocalAddress();

    private String brokerConfigPaths = null;
```

### FieldMayBeFinal
Field `counter` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
        new ConcurrentHashMap<>();
    private volatile boolean serving = true;
    private AtomicInteger counter = new AtomicInteger(0);
    private int scanTimes = 0;
    private final BrokerController brokerController;
```

### FieldMayBeFinal
Field `shutdownTimes` may be 'final'
in `container/src/main/java/org/apache/rocketmq/container/BrokerContainerStartup.java`
#### Snippet
```java
            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                private volatile boolean hasShutdown = false;
                private AtomicInteger shutdownTimes = new AtomicInteger(0);

                @Override
```

### FieldMayBeFinal
Field `totalPollingNum` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
    private ConcurrentHashMap<String, ConcurrentHashMap<String, Byte>> topicCidMap;
    private ConcurrentLinkedHashMap<String, ConcurrentSkipListSet<PopRequest>> pollingMap;
    private AtomicLong totalPollingNum = new AtomicLong(0);
    private PopLongPollingService popLongPollingService;
    private PopBufferMergeService popBufferMergeService;
```

### FieldMayBeFinal
Field `expiredLocalCache` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java

    public class QueueLockManager extends ServiceThread {
        private ConcurrentHashMap<String, TimedLock> expiredLocalCache = new ConcurrentHashMap<>(100000);

        public String buildLockKey(String topic, String consumerGroup, int queueId) {
```

### FieldMayBeFinal
Field `pollingMap` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java

    private ConcurrentHashMap<String, ConcurrentHashMap<String, Byte>> topicCidMap;
    private ConcurrentLinkedHashMap<String, ConcurrentSkipListSet<PopRequest>> pollingMap;
    private AtomicLong totalPollingNum = new AtomicLong(0);
    private PopLongPollingService popLongPollingService;
```

### FieldMayBeFinal
Field `popLongPollingService` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
    private ConcurrentLinkedHashMap<String, ConcurrentSkipListSet<PopRequest>> pollingMap;
    private AtomicLong totalPollingNum = new AtomicLong(0);
    private PopLongPollingService popLongPollingService;
    private PopBufferMergeService popBufferMergeService;
    private QueueLockManager queueLockManager;
```

### FieldMayBeFinal
Field `topicCidMap` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
    private static final int NOT_POLLING = 3;

    private ConcurrentHashMap<String, ConcurrentHashMap<String, Byte>> topicCidMap;
    private ConcurrentLinkedHashMap<String, ConcurrentSkipListSet<PopRequest>> pollingMap;
    private AtomicLong totalPollingNum = new AtomicLong(0);
```

### FieldMayBeFinal
Field `queueLockManager` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
    private PopLongPollingService popLongPollingService;
    private PopBufferMergeService popBufferMergeService;
    private QueueLockManager queueLockManager;
    private AtomicLong ckMessageNumber;

```

### FieldMayBeFinal
Field `popBufferMergeService` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
    private AtomicLong totalPollingNum = new AtomicLong(0);
    private PopLongPollingService popLongPollingService;
    private PopBufferMergeService popBufferMergeService;
    private QueueLockManager queueLockManager;
    private AtomicLong ckMessageNumber;
```

### FieldMayBeFinal
Field `ckMessageNumber` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
    private PopBufferMergeService popBufferMergeService;
    private QueueLockManager queueLockManager;
    private AtomicLong ckMessageNumber;

    public PopMessageProcessor(final BrokerController brokerController) {
```

### FieldMayBeFinal
Field `offset` may be 'final'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/common/MessageCacheKey.java`
#### Snippet
```java
public class MessageCacheKey {
    private TieredMessageQueueContainer container;
    private long offset;

    public MessageCacheKey(TieredMessageQueueContainer container, long offset) {
```

### FieldMayBeFinal
Field `container` may be 'final'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/common/MessageCacheKey.java`
#### Snippet
```java

public class MessageCacheKey {
    private TieredMessageQueueContainer container;
    private long offset;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/common/BoundaryType.java`
#### Snippet
```java
    UPPER("upper");

    private String name;

    BoundaryType(String name) {
```

### FieldMayBeFinal
Field `minOffset` may be 'final'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/common/SelectMappedBufferResultWrapper.java`
#### Snippet
```java

    private long curOffset;
    private long minOffset;
    private long maxOffset;
    private long size;
```

### FieldMayBeFinal
Field `maxOffset` may be 'final'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/common/SelectMappedBufferResultWrapper.java`
#### Snippet
```java
    private long curOffset;
    private long minOffset;
    private long maxOffset;
    private long size;

```

### FieldMayBeFinal
Field `accessCount` may be 'final'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/common/SelectMappedBufferResultWrapper.java`
#### Snippet
```java
public class SelectMappedBufferResultWrapper {
    private final SelectMappedBufferResult result;
    private LongAdder accessCount = new LongAdder();

    private long curOffset;
```

### FieldMayBeFinal
Field `size` may be 'final'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/common/SelectMappedBufferResultWrapper.java`
#### Snippet
```java
    private long minOffset;
    private long maxOffset;
    private long size;

    public SelectMappedBufferResultWrapper(SelectMappedBufferResult result, long curOffset, long minOffset, long maxOffset, long size) {
```

### FieldMayBeFinal
Field `opQueueMap` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/TransactionalMessageServiceImpl.java`
#### Snippet
```java
    private ServiceThread transactionalOpBatchService;

    private ConcurrentHashMap<MessageQueue, MessageQueue> opQueueMap = new ConcurrentHashMap<>();

    public TransactionalMessageServiceImpl(TransactionalMessageBridge transactionBridge) {
```

### FieldMayBeFinal
Field `transactionalOpBatchService` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/TransactionalMessageServiceImpl.java`
#### Snippet
```java
    private final ConcurrentHashMap<Integer, MessageQueueOpContext> deleteContext = new ConcurrentHashMap<>();

    private ServiceThread transactionalOpBatchService;

    private ConcurrentHashMap<MessageQueue, MessageQueue> opQueueMap = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `transactionalMessageBridge` may be 'final'
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/TransactionalMessageServiceImpl.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.TRANSACTION_LOGGER_NAME);

    private TransactionalMessageBridge transactionalMessageBridge;

    private static final int PULL_MSG_RETRY_NUMBER = 1;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/provider/TieredFileSegment.java`
#### Snippet
```java
        INDEX(2);

        private int type;

        FileSegmentType(int type) {
```

### FieldMayBeFinal
Field `fileQueue` may be 'final'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredIndexFile.java`
#### Snippet
```java
        private final int fileMaxSize;
        private MappedFile originFile;
        private TieredFileQueue fileQueue;
        private final MappedFile compactFile;

```

### FieldMayBeFinal
Field `originFile` may be 'final'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredIndexFile.java`
#### Snippet
```java
        private final int maxIndexNum;
        private final int fileMaxSize;
        private MappedFile originFile;
        private TieredFileQueue fileQueue;
        private final MappedFile compactFile;
```

### FieldMayBeFinal
Field `curFileLock` may be 'final'
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/container/TieredIndexFile.java`
#### Snippet
```java
    private MappedFile curMappedFile;

    private ReentrantLock curFileLock = new ReentrantLock();
    private Future<Void> inflightCompactFuture = CompletableFuture.completedFuture(null);

```

### FieldMayBeFinal
Field `consumeTimes` may be 'final'
in `example/src/main/java/org/apache/rocketmq/example/operation/Consumer.java`
#### Snippet
```java

            consumer.registerMessageListener(new MessageListenerConcurrently() {
                AtomicLong consumeTimes = new AtomicLong(0);

                @Override
```

### FieldMayBeFinal
Field `consumeTimes` may be 'final'
in `example/src/main/java/org/apache/rocketmq/example/ordermessage/Consumer.java`
#### Snippet
```java

        consumer.registerMessageListener(new MessageListenerOrderly() {
            AtomicLong consumeTimes = new AtomicLong(0);

            @Override
```

### FieldMayBeFinal
Field `localTrans` may be 'final'
in `example/src/main/java/org/apache/rocketmq/example/transaction/TransactionListenerImpl.java`
#### Snippet
```java
    private AtomicInteger transactionIndex = new AtomicInteger(0);

    private ConcurrentHashMap<String, Integer> localTrans = new ConcurrentHashMap<>();

    @Override
```

### FieldMayBeFinal
Field `transactionIndex` may be 'final'
in `example/src/main/java/org/apache/rocketmq/example/transaction/TransactionListenerImpl.java`
#### Snippet
```java

public class TransactionListenerImpl implements TransactionListener {
    private AtomicInteger transactionIndex = new AtomicInteger(0);

    private ConcurrentHashMap<String, Integer> localTrans = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `maxSize` may be 'final'
in `example/src/main/java/org/apache/rocketmq/example/benchmark/TransactionProducer.java`
#### Snippet
```java
class LRUMap<K, V> extends LinkedHashMap<K, V> {

    private int maxSize;

    public LRUMap(int maxSize) {
```

### FieldMayBeFinal
Field `statBenchmark` may be 'final'
in `example/src/main/java/org/apache/rocketmq/example/benchmark/TransactionProducer.java`
#### Snippet
```java

class TransactionListenerImpl implements TransactionListener {
    private StatsBenchmarkTProducer statBenchmark;
    private TxSendConfig sendConfig;
    private final LRUMap<Long, Integer> cache = new LRUMap<>(200000);
```

### FieldMayBeFinal
Field `sendConfig` may be 'final'
in `example/src/main/java/org/apache/rocketmq/example/benchmark/TransactionProducer.java`
#### Snippet
```java
class TransactionListenerImpl implements TransactionListener {
    private StatsBenchmarkTProducer statBenchmark;
    private TxSendConfig sendConfig;
    private final LRUMap<Long, Integer> cache = new LRUMap<>(200000);

```

### FieldMayBeFinal
Field `header` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcRequest.java`
#### Snippet
```java
public class RpcRequest {
    int code;
    private RpcRequestHeader header;
    private Object body;

```

### FieldMayBeFinal
Field `body` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcRequest.java`
#### Snippet
```java
    int code;
    private RpcRequestHeader header;
    private Object body;

    public RpcRequest(int code, RpcRequestHeader header, Object body) {
```

### FieldMayBeFinal
Field `configObjectList` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/Configuration.java`
#### Snippet
```java
    private final Logger log;

    private List<Object> configObjectList = new ArrayList<>(4);
    private String storePath;
    private boolean storePathFromConfig = false;
```

### FieldMayBeFinal
Field `readWriteLock` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/Configuration.java`
#### Snippet
```java
    private Field storePathField;
    private DataVersion dataVersion = new DataVersion();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    /**
     * All properties include configs in object and extend properties.
```

### FieldMayBeFinal
Field `requestCodeMap` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RequestBuilder.java`
#### Snippet
```java
public class RequestBuilder {

    private static Map<Integer, Class> requestCodeMap = new HashMap<>();
    static {
        requestCodeMap.put(RequestCode.PULL_MESSAGE, PullMessageRequestHeader.class);
```

### FieldMayBeFinal
Field `allConfigs` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/Configuration.java`
#### Snippet
```java
     * All properties include configs in object and extend properties.
     */
    private Properties allConfigs = new Properties();

    public Configuration(Logger log) {
```

### FieldMayBeFinal
Field `dataVersion` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/Configuration.java`
#### Snippet
```java
    private Object storePathObject;
    private Field storePathField;
    private DataVersion dataVersion = new DataVersion();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    /**
```

### FieldMayBeFinal
Field `clientHookList` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
    private RemotingClient remotingClient;

    private List<RpcClientHook> clientHookList = new ArrayList<>();

    public RpcClientImpl(ClientMetadata clientMetadata, RemotingClient remotingClient) {
```

### FieldMayBeFinal
Field `clientMetadata` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
public class RpcClientImpl implements RpcClient {

    private ClientMetadata clientMetadata;

    private RemotingClient remotingClient;
```

### FieldMayBeFinal
Field `remotingClient` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/rpc/RpcClientImpl.java`
#### Snippet
```java
    private ClientMetadata clientMetadata;

    private RemotingClient remotingClient;

    private List<RpcClientHook> clientHookList = new ArrayList<>();
```

### FieldMayBeFinal
Field `name` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/common/TlsMode.java`
#### Snippet
```java
    ENFORCING("enforcing");

    private String name;

    TlsMode(String name) {
```

### FieldMayBeFinal
Field `code` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/LanguageCode.java`
#### Snippet
```java
    RUST((byte) 12);

    private byte code;

    LanguageCode(byte code) {
```

### FieldMayBeFinal
Field `code` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/SerializeType.java`
#### Snippet
```java
    ROCKETMQ((byte) 1);

    private byte code;

    SerializeType(byte code) {
```

### FieldMayBeFinal
Field `nettyLoggerSeted` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/NettyLogger.java`
#### Snippet
```java
public class NettyLogger {

    private static AtomicBoolean nettyLoggerSeted = new AtomicBoolean(false);
    
    private static InternalLogLevel nettyLogLevel = InternalLogLevel.ERROR;
```

### FieldMayBeFinal
Field `nettyLogLevel` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/netty/NettyLogger.java`
#### Snippet
```java
    private static AtomicBoolean nettyLoggerSeted = new AtomicBoolean(false);
    
    private static InternalLogLevel nettyLogLevel = InternalLogLevel.ERROR;

    public static void initNettyLogger() {
```

### FieldMayBeFinal
Field `isActivated` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/body/HARuntimeInfo.java`
#### Snippet
```java
        private long lastWriteTimestamp;
        private long masterFlushOffset;
        private boolean isActivated = false;

        public String getMasterAddr() {
```

### FieldMayBeFinal
Field `userConsumerInfo` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/body/ConsumerRunningInfo.java`
#### Snippet
```java
    private TreeMap<String/* Topic */, ConsumeStatus> statusTable = new TreeMap<>();

    private TreeMap<String, String> userConsumerInfo = new TreeMap<>();

    private String jstack;
```

### FieldMayBeFinal
Field `requestId` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/RemotingCommand.java`
#### Snippet
```java
    private static final String BOOLEAN_CANONICAL_NAME_2 = boolean.class.getCanonicalName();
    private static volatile int configVersion = -1;
    private static AtomicInteger requestId = new AtomicInteger(0);

    private static SerializeType serializeTypeConfigInThisServer = SerializeType.JSON;
```

### FieldMayBeFinal
Field `typeCN` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/ConsumeType.java`
#### Snippet
```java
    CONSUME_POP("POP");

    private String typeCN;

    ConsumeType(String typeCN) {
```

### FieldMayBeFinal
Field `modeCN` may be 'final'
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/heartbeat/MessageModel.java`
#### Snippet
```java
    CLUSTERING("CLUSTERING");

    private String modeCN;

    MessageModel(String modeCN) {
```

### FieldMayBeFinal
Field `messageId` may be 'final'
in `openmessaging/src/main/java/io/openmessaging/rocketmq/domain/SendResultImpl.java`
#### Snippet
```java

public class SendResultImpl implements SendResult {
    private String messageId;
    private KeyValue properties;

```

### FieldMayBeFinal
Field `properties` may be 'final'
in `openmessaging/src/main/java/io/openmessaging/rocketmq/domain/SendResultImpl.java`
#### Snippet
```java
public class SendResultImpl implements SendResult {
    private String messageId;
    private KeyValue properties;

    public SendResultImpl(final String messageId, final KeyValue properties) {
```

### FieldMayBeFinal
Field `sysHeaders` may be 'final'
in `openmessaging/src/main/java/io/openmessaging/rocketmq/domain/BytesMessageImpl.java`
#### Snippet
```java

public class BytesMessageImpl implements BytesMessage {
    private KeyValue sysHeaders;
    private KeyValue userHeaders;
    private byte[] body;
```

### FieldMayBeFinal
Field `userHeaders` may be 'final'
in `openmessaging/src/main/java/io/openmessaging/rocketmq/domain/BytesMessageImpl.java`
#### Snippet
```java
public class BytesMessageImpl implements BytesMessage {
    private KeyValue sysHeaders;
    private KeyValue userHeaders;
    private byte[] body;

```

### FieldMayBeFinal
Field `wrapperMap` may be 'final'
in `openmessaging/src/main/java/io/openmessaging/rocketmq/utils/BeanUtils.java`
#### Snippet
```java
    }

    private static Map<Class<?>, Class<?>> wrapperMap = new HashMap<>();

    static {
```

### FieldMayBeFinal
Field `primitiveWrapperMap` may be 'final'
in `openmessaging/src/main/java/io/openmessaging/rocketmq/utils/BeanUtils.java`
#### Snippet
```java
     * Maps primitive {@code Class}es to their corresponding wrapper {@code Class}.
     */
    private static Map<Class<?>, Class<?>> primitiveWrapperMap = new HashMap<>();

    static {
```

### FieldMayBeFinal
Field `createTime` may be 'final'
in `openmessaging/src/main/java/io/openmessaging/rocketmq/promise/DefaultPromise.java`
#### Snippet
```java
    private V result = null;
    private long timeout;
    private long createTime;
    private Throwable exception = null;
    private List<FutureListener<V>> promiseListenerList;
```

### FieldMayBeFinal
Field `timeout` may be 'final'
in `openmessaging/src/main/java/io/openmessaging/rocketmq/promise/DefaultPromise.java`
#### Snippet
```java
    private volatile FutureState state = FutureState.DOING;
    private V result = null;
    private long timeout;
    private long createTime;
    private Throwable exception = null;
```

### FieldMayBeFinal
Field `exp` may be 'final'
in `srvutil/src/main/java/org/apache/rocketmq/util/cache/CacheObject.java`
#### Snippet
```java
    private T target;
    private long bornTime = System.currentTimeMillis();
    private long exp;

    public CacheObject(long exp, T target) {
```

### FieldMayBeFinal
Field `target` may be 'final'
in `srvutil/src/main/java/org/apache/rocketmq/util/cache/CacheObject.java`
#### Snippet
```java

public class CacheObject<T> {
    private T target;
    private long bornTime = System.currentTimeMillis();
    private long exp;
```

### FieldMayBeFinal
Field `bornTime` may be 'final'
in `srvutil/src/main/java/org/apache/rocketmq/util/cache/CacheObject.java`
#### Snippet
```java
public class CacheObject<T> {
    private T target;
    private long bornTime = System.currentTimeMillis();
    private long exp;

```

### FieldMayBeFinal
Field `expiredLocalCache` may be 'final'
in `srvutil/src/main/java/org/apache/rocketmq/util/cache/LockManager.java`
#### Snippet
```java

public class LockManager {
    private static ExpiredLocalCache<String, AtomicBoolean> expiredLocalCache = new ExpiredLocalCache<>(100000);

    public static boolean tryLock(String key, long lockTime) {
```

### FieldMayBeFinal
Field `handler` may be 'final'
in `srvutil/src/main/java/org/apache/rocketmq/util/cache/LocalCache.java`
#### Snippet
```java

    private int cacheSize = DEFAULT_CACHE_SIZE;
    private CacheEvictHandler<K, V> handler;

    /**
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `srvutil/src/main/java/org/apache/rocketmq/util/cache/ExpiredLocalCache.java`
#### Snippet
```java

public class ExpiredLocalCache<K, T> {
    private ConcurrentLinkedHashMap<K, CacheObject<T>> cache;
    private EvictionListener<K, CacheObject<T>> listener;

```

### FieldMayBeFinal
Field `shutdownTimes` may be 'final'
in `srvutil/src/main/java/org/apache/rocketmq/srvutil/ShutdownHookThread.java`
#### Snippet
```java
public class ShutdownHookThread extends Thread {
    private volatile boolean hasShutdown = false;
    private AtomicInteger shutdownTimes = new AtomicInteger(0);
    private final Logger log;
    private final Callable callback;
```

### FieldMayBeFinal
Field `md` may be 'final'
in `srvutil/src/main/java/org/apache/rocketmq/srvutil/AclFileWatchService.java`
#### Snippet
```java
    private final AclFileWatchService.Listener listener;
    private static final int WATCH_INTERVAL = 5000;
    private MessageDigest md = MessageDigest.getInstance("MD5");
    private String defaultAclFile;

```

### FieldMayBeFinal
Field `fileList` may be 'final'
in `srvutil/src/main/java/org/apache/rocketmq/srvutil/AclFileWatchService.java`
#### Snippet
```java
    private final Map<String, String> fileCurrentHash;
    private Map<String, Long> fileLastModifiedTime;
    private List<String/**absolute pathname **/> fileList = new ArrayList<>();
    private final AclFileWatchService.Listener listener;
    private static final int WATCH_INTERVAL = 5000;
```

### FieldMayBeFinal
Field `defaultAclFile` may be 'final'
in `srvutil/src/main/java/org/apache/rocketmq/srvutil/AclFileWatchService.java`
#### Snippet
```java
    private static final int WATCH_INTERVAL = 5000;
    private MessageDigest md = MessageDigest.getInstance("MD5");
    private String defaultAclFile;

    public AclFileWatchService(String path, String defaultAclFile, final AclFileWatchService.Listener listener) throws Exception {
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java
            byteArrayOutputStream.flush();
            result = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw e;
        } finally {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `common/src/main/java/org/apache/rocketmq/common/compression/ZstdCompressor.java`
#### Snippet
```java
            resultOutputStream.close();
            result = resultOutputStream.toByteArray();
        } catch (IOException e) {
            throw e;
        } finally {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `common/src/main/java/org/apache/rocketmq/common/compression/ZlibCompressor.java`
#### Snippet
```java
            byteArrayOutputStream.flush();
            result = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw e;
        } finally {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `common/src/main/java/org/apache/rocketmq/common/compression/Lz4Compressor.java`
#### Snippet
```java
            resultOutputStream.close();
            result = resultOutputStream.toByteArray();
        } catch (IOException e) {
            throw e;
        } finally {
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `store/src/main/java/org/apache/rocketmq/store/MappedFileQueue.java`
#### Snippet
```java
                    && mappedFile.getMappedByteBufferAccessCountSinceLastSwap() > 0) {
                mappedFile.swapMap();
                continue;
            }
        }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
                    } else {
                        //The min timestamp of this file is larger than the given timestamp, so check the next file
                        continue;
                    }
                }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
                        log.warn(msg.toString());
                        exception = e;
                        continue;
                    } catch (MQBrokerException e) {
                        endTimestamp = System.currentTimeMillis();
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `client/src/main/java/org/apache/rocketmq/client/impl/producer/DefaultMQProducerImpl.java`
#### Snippet
```java
                        exception = e;
                        if (this.defaultMQProducer.getRetryResponseCodes().contains(e.getResponseCode())) {
                            continue;
                        } else {
                            if (sendResult != null) {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `acl/src/main/java/org/apache/rocketmq/acl/plain/PlainPermissionManager.java`
#### Snippet
```java
            File f = new File(fileName);
            if (fileName.equals(fileHome + MixAll.ACL_CONF_TOOLS_FILE)) {
                continue;
            } else if (fileName.endsWith(".yml") || fileName.endsWith(".yaml")) {
                allAclFileFullPath.add(fileName);
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `filter/src/main/java/org/apache/rocketmq/filter/parser/TokenMgrError.java`
#### Snippet
```java
                        retval.append(ch);
                    }
                    continue;
            }
        }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `filter/src/main/java/org/apache/rocketmq/filter/parser/ParseException.java`
#### Snippet
```java
                        retval.append(ch);
                    }
                    continue;
            }
        }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `broker/src/main/java/org/apache/rocketmq/broker/processor/ConsumerManageProcessor.java`
#### Snippet
```java
                    } else {
                        //not found
                        continue;
                    }
                } else {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `broker/src/main/java/org/apache/rocketmq/broker/processor/ConsumerManageProcessor.java`
#### Snippet
```java
                        break;
                    } else if (rpcResponse.getCode() == ResponseCode.QUERY_NOT_FOUND) {
                        continue;
                    } else {
                        //this should not happen
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
                POP_LOGGER.info("[PopBuffer]remove long time not used sub {} of topic {} in buffer!", cid, topic);
                iterator.remove();
                continue;
            }
        }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
            // double check
            if (isCkDone(pointWrapper)) {
                continue;
            } else if (pointWrapper.isJustOffset()) {
                // just offset should be in store.
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
                    countCk++;
                }
                continue;
            } else if (removeCk) {
                // put buffer ak to store
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopBufferMergeService.java`
#### Snippet
```java
                    iterator.remove();
                    counter.decrementAndGet();
                    continue;
                }
            }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopMessageProcessor.java`
#### Snippet
```java
                            POP_LOGGER.info("remove not exit sub {} of topic {} in pollingMap!", cid, topic);
                            pollingMapIter.remove();
                            continue;
                        }
                    }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
                    if (offsetResponseHeader.getOffset() < 0
                        || item.checkIfEndOffsetDecided() && offsetResponseHeader.getOffset() >= item.getEndOffset()) {
                        continue;
                    } else {
                        offset = item.computeStaticQueueOffsetStrictly(offsetResponseHeader.getOffset());
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/statictopic/TopicQueueMappingUtils.java`
#### Snippet
```java
            LogicQueueMappingItem item =  mappingItems.get(i);
            if (ignoreNegative && item.getLogicOffset() < 0) {
                continue;
            } else {
                return item;
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `srvutil/src/main/java/org/apache/rocketmq/srvutil/AclFileWatchService.java`
#### Snippet
```java
            File f = new File(fileName);
            if (fileName.equals(aclPath + File.separator + "tools.yml")) {
                continue;
            } else if (fileName.endsWith(".yml") || fileName.endsWith(".yaml")) {
                fileList.add(fileName);
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u9FA0` can be replaced with '龠'
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtils.java`
#### Snippet
```java
public class RandomUtils {
    private static final int UNICODE_START = '\u4E00';
    private static final int UNICODE_END = '\u9FA0';
    private static Random rd = new Random();

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u4E00` can be replaced with '一'
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtils.java`
#### Snippet
```java

public class RandomUtils {
    private static final int UNICODE_START = '\u4E00';
    private static final int UNICODE_END = '\u9FA0';
    private static Random rd = new Random();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u9FA0` can be replaced with '龠'
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtil.java`
#### Snippet
```java

    private static final int UNICODE_START = '\u4E00';
    private static final int UNICODE_END = '\u9FA0';
    private static Random rd = new Random();

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u4E00` can be replaced with '一'
in `test/src/main/java/org/apache/rocketmq/test/util/RandomUtil.java`
#### Snippet
```java
public final class RandomUtil {

    private static final int UNICODE_START = '\u4E00';
    private static final int UNICODE_END = '\u9FA0';
    private static Random rd = new Random();
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `csList`
in `common/src/main/java/org/apache/rocketmq/common/stats/StatsItem.java`
#### Snippet
```java
    private static StatsSnapshot computeStatsData(final LinkedList<CallSnapshot> csList) {
        StatsSnapshot statsSnapshot = new StatsSnapshot();
        synchronized (csList) {
            double tps = 0;
            double avgpt = 0;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `lock`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopOrderlyService.java`
#### Snippet
```java
    private void submitConsumeRequest(final ConsumeRequest consumeRequest, boolean force) {
        Object lock = consumeRequestLock.fetchLockObject(consumeRequest.getMessageQueue(), consumeRequest.shardingKeyIndex);
        synchronized (lock) {
            boolean isNewReq = consumeRequestSet.add(consumeRequest);
            if (force || isNewReq) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `objLock`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageOrderlyService.java`
#### Snippet
```java

            final Object objLock = messageQueueLock.fetchLockObject(this.messageQueue);
            synchronized (objLock) {
                if (MessageModel.BROADCASTING.equals(ConsumeMessageOrderlyService.this.defaultMQPushConsumerImpl.messageModel())
                    || this.processQueue.isLocked() && !this.processQueue.isLockExpired()) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `topics`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultMQPullConsumerImpl.java`
#### Snippet
```java
        Set<String> topics = this.defaultMQPullConsumer.getRegisterTopics();
        if (topics != null) {
            synchronized (topics) {
                for (String t : topics) {
                    SubscriptionData ms = null;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `objLock`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
                        case FOUND:
                            final Object objLock = messageQueueLock.fetchLockObject(messageQueue);
                            synchronized (objLock) {
                                if (pullResult.getMsgFoundList() != null && !pullResult.getMsgFoundList().isEmpty() && assignedMessageQueue.getSeekOffset(messageQueue) == -1) {
                                    processQueue.putMessage(pullResult.getMsgFoundList());
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `objLock`
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
        }
        final Object objLock = messageQueueLock.fetchLockObject(messageQueue);
        synchronized (objLock) {
            clearMessageQueueInCache(messageQueue);

```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `container`
in `tieredstore/src/main/java/org/apache/rocketmq/tieredstore/TieredMessageFetcher.java`
#### Snippet
```java
        }

        synchronized (container) {
            inflightRequest = container.getInflightRequest(nextBeginOffset, maxMsgNums);
            if (!inflightRequest.isAllDone()) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `exsit` is redundant
in `common/src/main/java/org/apache/rocketmq/common/queue/ConcurrentTreeMap.java`
#### Snippet
```java
                return exsit;
            } else {
                V exsit = tree.get(key);
                return exsit;
            }
```

### UnnecessaryLocalVariable
Local variable `bitMap` is redundant
in `common/src/main/java/org/apache/rocketmq/common/topic/TopicValidator.java`
#### Snippet
```java
        int strLen = str.length();
        int len = VALID_CHAR_BIT_MAP.length;
        boolean[] bitMap = VALID_CHAR_BIT_MAP;
        for (int i = 0; i < strLen; i++) {
            char ch = str.charAt(i);
```

### UnnecessaryLocalVariable
Local variable `hexArray` is redundant
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java

    public static void writeShort(char[] buffer, int pos, int value) {
        char[] hexArray = HEX_ARRAY;
        for (int moveBits = 12; moveBits >= 0; moveBits -= 4) {
            buffer[pos++] = hexArray[(value >>> moveBits) & 0x0F];
```

### UnnecessaryLocalVariable
Local variable `hexArray` is redundant
in `common/src/main/java/org/apache/rocketmq/common/UtilAll.java`
#### Snippet
```java

    public static void writeInt(char[] buffer, int pos, int value) {
        char[] hexArray = HEX_ARRAY;
        for (int moveBits = 28; moveBits >= 0; moveBits -= 4) {
            buffer[pos++] = hexArray[(value >>> moveBits) & 0x0F];
```

### UnnecessaryLocalVariable
Local variable `isa` is redundant
in `common/src/main/java/org/apache/rocketmq/common/utils/NetworkUtil.java`
#### Snippet
```java
        String host = addr.substring(0, split);
        String port = addr.substring(split + 1);
        InetSocketAddress isa = new InetSocketAddress(host, Integer.parseInt(port));
        return isa;
    }
```

### UnnecessaryLocalVariable
Local variable `brokerAddrNew` is redundant
in `common/src/main/java/org/apache/rocketmq/common/MixAll.java`
#### Snippet
```java
            String ip = brokerAddr.substring(0, split);
            String port = brokerAddr.substring(split + 1);
            String brokerAddrNew = ip + ":" + (Integer.parseInt(port) - 2);
            return brokerAddrNew;
        } else {
```

### UnnecessaryLocalVariable
Local variable `realKey` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java

    public DataCollector fetchMapDataCollector(String key) {
        String realKey = key;
        if (!collectMap.containsKey(realKey)
            || collectMap.get(realKey) instanceof ListDataCollectorImpl) {
```

### UnnecessaryLocalVariable
Local variable `realKey` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java

    public DataCollector fetchListDataCollector(String key) {
        String realKey = key;
        if (!collectMap.containsKey(realKey)
            || collectMap.get(realKey) instanceof MapDataCollectorImpl) {
```

### UnnecessaryLocalVariable
Local variable `realKey` is redundant
in `test/src/main/java/org/apache/rocketmq/test/util/data/collect/DataCollectorManager.java`
#### Snippet
```java

    public DataCollector fetchDataCollector(String key) {
        String realKey = key;
        if (!collectMap.containsKey(realKey)) {
            synchronized (lock) {
```

### UnnecessaryLocalVariable
Local variable `sizeTemp` is redundant
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueueExt.java`
#### Snippet
```java
         */
        private int calcUnitSize() {
            int sizeTemp = MIN_EXT_UNIT_SIZE + (filterBitMap == null ? 0 : filterBitMap.length);
            return sizeTemp;
        }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
        if (mappedFile != null) {
            int pos = (int) (offset % mappedFileSize);
            SelectMappedBufferResult result = mappedFile.selectMappedBuffer(pos);
            return result;
        }
```

### UnnecessaryLocalVariable
Local variable `map` is redundant
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java

    public long getPutMessageTimesTotal() {
        Map<String, LongAdder> map = putMessageTopicTimesTotal;
        return map.values()
                .parallelStream()
```

### UnnecessaryLocalVariable
Local variable `map` is redundant
in `store/src/main/java/org/apache/rocketmq/store/StoreStatsService.java`
#### Snippet
```java

    public long getPutMessageSizeTotal() {
        Map<String, LongAdder> map = putMessageTopicSizeTotal;
        return map.values()
                .parallelStream()
```

### UnnecessaryLocalVariable
Local variable `logicFileSize` is redundant
in `store/src/main/java/org/apache/rocketmq/store/ConsumeQueue.java`
#### Snippet
```java
        long lastOffset = -1;

        int logicFileSize = this.mappedFileSize;

        MappedFile mappedFile = this.mappedFileQueue.getLastMappedFile();
```

### UnnecessaryLocalVariable
Local variable `clog` is redundant
in `store/src/main/java/org/apache/rocketmq/store/kv/CompactionStore.java`
#### Snippet
```java

    private CompactionLog loadAndGetClog(String topic, int queueId) {
        CompactionLog clog = compactionLogTable.compute(topic + "_" + queueId, (k, v) -> {
            if (v == null) {
                try {
```

### UnnecessaryLocalVariable
Local variable `slaveBrokerId` is redundant
in `store/src/main/java/org/apache/rocketmq/store/ha/autoswitch/AutoSwitchHAConnection.java`
#### Snippet
```java
                            case HANDSHAKE:
                                // SlaveBrokerId
                                Long slaveBrokerId = byteBufferRead.getLong(readPosition + AutoSwitchHAClient.HANDSHAKE_HEADER_SIZE - 8);
                                AutoSwitchHAConnection.this.slaveId = slaveBrokerId;
                                // Flag(isSyncFromLastFile)
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `store/src/main/java/org/apache/rocketmq/store/queue/BatchConsumeQueue.java`
#### Snippet
```java
    @Override
    public boolean flush(final int flushLeastPages) {
        boolean result = this.mappedFileQueue.flush(flushLeastPages);
        return result;
    }
```

### UnnecessaryLocalVariable
Local variable `msg` is redundant
in `store/src/main/java/org/apache/rocketmq/store/index/IndexService.java`
#### Snippet
```java
        if (indexFile != null) {
            long endPhyOffset = indexFile.getEndPhyOffset();
            DispatchRequest msg = req;
            String topic = msg.getTopic();
            String keys = msg.getKeys();
```

### UnnecessaryLocalVariable
Local variable `pluginMessageStore` is redundant
in `store/src/main/java/org/apache/rocketmq/store/plugin/MessageStoreFactory.java`
#### Snippet
```java
                    Class<AbstractPluginMessageStore> clazz = (Class<AbstractPluginMessageStore>) Class.forName(pluginClass);
                    Constructor<AbstractPluginMessageStore> construct = clazz.getConstructor(MessageStorePluginContext.class, MessageStore.class);
                    AbstractPluginMessageStore pluginMessageStore = construct.newInstance(context, messageStore);
                    messageStore = pluginMessageStore;
                } catch (Throwable e) {
```

### UnnecessaryLocalVariable
Local variable `storeTime` is redundant
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                final long phyOffset = result.getPos();
                final int size = result.getSize();
                long storeTime = this.getCommitLog().pickupStoreTimestamp(phyOffset, size);
                return storeTime;
            } catch (Exception e) {
```

### UnnecessaryLocalVariable
Local variable `offsetPy` is redundant
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                try {
                    if (bufferConsumeQueue.hasNext()) {
                        long offsetPy = bufferConsumeQueue.next().getPos();
                        return offsetPy;
                    }
```

### UnnecessaryLocalVariable
Local variable `message` is redundant
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
        }
        MessageAccessor.putProperty(messageExt, TIMER_DEQUEUE_MS, System.currentTimeMillis() + "");
        MessageExtBrokerInner message = convertMessage(messageExt, needRoll);
        return message;
    }
```

### UnnecessaryLocalVariable
Local variable `pullResult` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/PullAPIWrapper.java`
#### Snippet
```java
            }

            PullResult pullResult = this.mQClientFactory.getMQClientAPIImpl().pullMessage(
                brokerAddr,
                requestHeader,
```

### UnnecessaryLocalVariable
Local variable `listener` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessagePopConcurrentlyService.java`
#### Snippet
```java
            }

            MessageListenerConcurrently listener = ConsumeMessagePopConcurrentlyService.this.messageListener;
            ConsumeConcurrentlyContext context = new ConsumeConcurrentlyContext(messageQueue);
            ConsumeConcurrentlyStatus status = null;
```

### UnnecessaryLocalVariable
Local variable `listener` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/ConsumeMessageConcurrentlyService.java`
#### Snippet
```java
            }

            MessageListenerConcurrently listener = ConsumeMessageConcurrentlyService.this.messageListener;
            ConsumeConcurrentlyContext context = new ConsumeConcurrentlyContext(messageQueue);
            ConsumeConcurrentlyStatus status = null;
```

### UnnecessaryLocalVariable
Local variable `offset` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/consumer/DefaultLitePullConsumerImpl.java`
#### Snippet
```java
    private long fetchConsumeOffset(MessageQueue messageQueue) throws MQClientException {
        checkServiceState();
        long offset = this.rebalanceImpl.computePullFromWhereWithException(messageQueue);
        return offset;
    }
```

### UnnecessaryLocalVariable
Local variable `topicStatsTable` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                TopicStatsTable topicStatsTable = TopicStatsTable.decode(response.getBody(), TopicStatsTable.class);
                return topicStatsTable;
            }
```

### UnnecessaryLocalVariable
Local variable `info` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                byte[] body = response.getBody();
                if (body != null) {
                    ConsumeMessageDirectlyResult info = ConsumeMessageDirectlyResult.decode(body, ConsumeMessageDirectlyResult.class);
                    return info;
                }
```

### UnnecessaryLocalVariable
Local variable `topicList` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                byte[] body = response.getBody();
                if (body != null) {
                    TopicList topicList = TopicList.decode(body, TopicList.class);
                    return topicList;
                }
```

### UnnecessaryLocalVariable
Local variable `messageQueues` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
            case ResponseCode.SUCCESS: {
                LockBatchResponseBody responseBody = LockBatchResponseBody.decode(response.getBody(), LockBatchResponseBody.class);
                Set<MessageQueue> messageQueues = responseBody.getLockOKMQSet();
                return messageQueues;
            }
```

### UnnecessaryLocalVariable
Local variable `info` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                byte[] body = response.getBody();
                if (body != null) {
                    ConsumerRunningInfo info = ConsumerRunningInfo.decode(body, ConsumerRunningInfo.class);
                    return info;
                }
```

### UnnecessaryLocalVariable
Local variable `topicList` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
                byte[] body = response.getBody();
                if (body != null) {
                    TopicList topicList = TopicList.decode(body, TopicList.class);
                    return topicList;
                }
```

### UnnecessaryLocalVariable
Local variable `topicList` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                TopicList topicList = TopicList.decode(response.getBody(), TopicList.class);
                return topicList;
            }
```

### UnnecessaryLocalVariable
Local variable `groupList` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                GroupList groupList = GroupList.decode(response.getBody(), GroupList.class);
                return groupList;
            }
```

### UnnecessaryLocalVariable
Local variable `consumeStats` is redundant
in `client/src/main/java/org/apache/rocketmq/client/impl/MQClientAPIImpl.java`
#### Snippet
```java
        switch (response.getCode()) {
            case ResponseCode.SUCCESS: {
                ConsumeStats consumeStats = ConsumeStats.decode(response.getBody(), ConsumeStats.class);
                return consumeStats;
            }
```

### UnnecessaryLocalVariable
Local variable `signature` is redundant
in `acl/src/main/java/org/apache/rocketmq/acl/common/AclUtils.java`
#### Snippet
```java

    public static String calSignature(byte[] data, String secretKey) {
        String signature = AclSigner.calSignature(data, secretKey);
        return signature;
    }
```

### UnnecessaryLocalVariable
Local variable `controller` is redundant
in `namesrv/src/main/java/org/apache/rocketmq/namesrv/NamesrvStartup.java`
#### Snippet
```java
        try {
            parseCommandlineAndConfigFile(args);
            NamesrvController controller = createAndStartNamesrvController();
            return controller;
        } catch (Throwable e) {
```

### UnnecessaryLocalVariable
Local variable `requestHeaderV2` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/out/BrokerOuterAPI.java`
#### Snippet
```java
        requestHeader.setBatch(false);

        SendMessageRequestHeaderV2 requestHeaderV2 = SendMessageRequestHeaderV2.createSendMessageRequestHeaderV2(requestHeader);
        return requestHeaderV2;
    }
```

### UnnecessaryLocalVariable
Local variable `expired` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/client/rebalance/RebalanceLockManager.java`
#### Snippet
```java

        public boolean isExpired() {
            boolean expired =
                (System.currentTimeMillis() - this.lastUpdateTimestamp) > REBALANCE_LOCK_MAX_LIVE_TIME;

```

### UnnecessaryLocalVariable
Local variable `currentBroker` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AbstractSendMessageProcessor.java`
#### Snippet
```java
        // The broker that received the request.
        // It may be a master broker or a slave broker
        final BrokerController currentBroker = this.brokerController;

        SubscriptionGroupConfig subscriptionGroupConfig =
```

### UnnecessaryLocalVariable
Local variable `finalResponse` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PullMessageProcessor.java`
#### Snippet
```java
            } else {
                SubscriptionData finalSubscriptionData = subscriptionData;
                RemotingCommand finalResponse = response;
                messageStore.getMessageAsync(group, topic, queueId, requestHeader.getQueueOffset(),
                        requestHeader.getMaxMsgNums(), messageFilter)
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `broker/src/main/java/org/apache/rocketmq/broker/processor/AdminBrokerProcessor.java`
#### Snippet
```java
    private RemotingCommand getUnknownCmdResponse(ChannelHandlerContext ctx, RemotingCommand request) {
        String error = " request type " + request.getCode() + " not supported";
        final RemotingCommand response =
            RemotingCommand.createResponseCommand(RemotingSysResponseCode.REQUEST_CODE_NOT_SUPPORTED, error);
        return response;
```

### UnnecessaryLocalVariable
Local variable `snap` is redundant
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java

    public Long[] createSnapshot() {
        Long[] snap = new Long[] {
            System.currentTimeMillis(),
            this.sendRequestSuccessCount.longValue(),
```

### UnnecessaryLocalVariable
Local variable `snap` is redundant
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Consumer.java`
#### Snippet
```java

    public Long[] createSnapshot() {
        Long[] snap = new Long[] {
            System.currentTimeMillis(),
            this.receiveMessageTotalCount.longValue(),
```

### UnnecessaryLocalVariable
Local variable `snap` is redundant
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java

    public Long[] createSnapshot() {
        Long[] snap = new Long[] {
            System.currentTimeMillis(),
            this.sendRequestSuccessCount.longValue(),
```

### UnnecessaryLocalVariable
Local variable `length` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/RocketMQSerializable.java`
#### Snippet
```java
    private static int calTotalLen(int remark, int ext) {
        // int code(~32767)
        int length = 2
            // LanguageCode language
            + 1
```

### UnnecessaryLocalVariable
Local variable `isa` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/common/RemotingHelper.java`
#### Snippet
```java
        String host = addr.substring(0, split);
        String port = addr.substring(split + 1);
        InetSocketAddress isa = new InetSocketAddress(host, Integer.parseInt(port));
        return isa;
    }
```

### UnnecessaryLocalVariable
Local variable `objectHeader` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/RemotingCommand.java`
#### Snippet
```java
        if (classHeader != null) {
            try {
                CommandCustomHeader objectHeader = classHeader.getDeclaredConstructor().newInstance();
                cmd.customHeader = objectHeader;
            } catch (InstantiationException e) {
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `srvutil/src/main/java/org/apache/rocketmq/util/cache/ExpiredLocalCache.java`
#### Snippet
```java
            return null;
        }
        T ret = object.getTarget();
        return ret;
    }
```

### UnnecessaryLocalVariable
Local variable `mapInBroker` is redundant
in `remoting/src/main/java/org/apache/rocketmq/remoting/protocol/statictopic/TopicQueueMappingUtils.java`
#### Snippet
```java
            }
            //remapping
            final String mapInBroker = broker;
            final String mapOutBroker = topicQueueMappingOne.getBname();
            brokersToMapIn.add(mapInBroker);
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `test/src/main/java/org/apache/rocketmq/test/util/MQAdminTestUtils.java`
#### Snippet
```java
                return true;
            }
            Thread.sleep(100);
        }
        return false;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `test/src/main/java/org/apache/rocketmq/test/listener/rmq/concurrent/RMQBlockListener.java`
#### Snippet
```java
            while (block) {
                inBlock = true;
                Thread.sleep(100);
            }
        } catch (InterruptedException ignore) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
                    if (StatUtil.isOverFlow(pubKey, tps)) {
                        try {
                            Thread.sleep(100L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `test/src/main/java/org/apache/rocketmq/test/lmq/benchmark/BenchLmqStore.java`
#### Snippet
```java
                        try {
                            if (StatUtil.isOverFlow(statKey, tps)) {
                                Thread.sleep(100L);
                            }
                            long start = System.currentTimeMillis();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `store/src/main/java/org/apache/rocketmq/store/FlushDiskWatcher.java`
#### Snippet
```java
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    log.warn(
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `store/src/main/java/org/apache/rocketmq/store/ha/DefaultHAConnection.java`
#### Snippet
```java

                    if (-1 == DefaultHAConnection.this.slaveRequestOffset) {
                        Thread.sleep(10);
                        continue;
                    }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `store/src/main/java/org/apache/rocketmq/store/CommitLog.java`
#### Snippet
```java
                try {
                    if (flushCommitLogTimed) {
                        Thread.sleep(interval);
                    } else {
                        this.waitForRunning(interval);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `store/src/main/java/org/apache/rocketmq/store/ha/autoswitch/AutoSwitchHAService.java`
#### Snippet
```java
            getDefaultMessageStore().getCommitLog().getFlushManager().wakeUpCommit();
            try {
                Thread.sleep(100);
            } catch (Exception e) {

```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `store/src/main/java/org/apache/rocketmq/store/ha/autoswitch/AutoSwitchHAService.java`
#### Snippet
```java
        while (defaultMessageStore.dispatchBehindBytes() > 0) {
            try {
                Thread.sleep(100);
            } catch (Exception ignored) {

```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `store/src/main/java/org/apache/rocketmq/store/util/PerfCounter.java`
#### Snippet
```java
                    logger.error("{} get unknown errror", getServiceName(), e);
                    try {
                        Thread.sleep(1000);
                    } catch (Throwable ignored) {

```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
                break;
            }
            Thread.sleep(1000);
            LOGGER.info("Try to finish doing reput the messages fall behind during the starting, reputOffset={} maxOffset={} behind={}", this.reputMessageService.getReputFromOffset(), this.getMaxPhyOffset(), this.dispatchBehindBytes());
        }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `store/src/main/java/org/apache/rocketmq/store/DefaultMessageStore.java`
#### Snippet
```java
            for (int i = 0; i < 50 && this.isCommitLogAvailable(); i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `store/src/main/java/org/apache/rocketmq/store/timer/TimerMessageStore.java`
#### Snippet
```java
                                    }
                                    doRes = PUT_NEED_RETRY != doPut(msg, needRoll(tr.getMagic()));
                                    Thread.sleep(500 * precisionMs / 1000);
                                }
                                perfs.endTick("dequeue_put");
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `client/src/main/java/org/apache/rocketmq/client/trace/AsyncTraceDispatcher.java`
#### Snippet
```java
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                break;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `broker/src/main/java/org/apache/rocketmq/broker/dledger/DLedgerRoleChangeHandler.java`
#### Snippet
```java
                                    break;
                                }
                                Thread.sleep(100);
                            }
                            if (succ) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `broker/src/main/java/org/apache/rocketmq/broker/processor/NotificationProcessor.java`
#### Snippet
```java
                    }
                    try {
                        Thread.sleep(200L);
                        Collection<ArrayBlockingQueue<NotificationRequest>> pops = pollingMap.values();
                        for (ArrayBlockingQueue<NotificationRequest> popQ : pops) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `broker/src/main/java/org/apache/rocketmq/broker/processor/PopReviveService.java`
#### Snippet
```java
                // Fixme: why sleep is useful here?
                try {
                    Thread.sleep(100);
                } catch (Throwable ignore) {
                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/TransactionalMessageServiceImpl.java`
#### Snippet
```java
                                if (escapeFailCnt < MAX_RETRY_TIMES_FOR_ESCAPE) {
                                    escapeFailCnt++;
                                    Thread.sleep(100L * (2 ^ escapeFailCnt));
                                } else {
                                    escapeFailCnt = 0;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `broker/src/main/java/org/apache/rocketmq/broker/transaction/queue/TransactionalMessageServiceImpl.java`
#### Snippet
```java

                                try {
                                    Thread.sleep(SLEEP_WHILE_NO_OP);
                                } catch (Throwable ignored) {
                                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `example/src/main/java/org/apache/rocketmq/example/simple/PullConsumer.java`
#### Snippet
```java
                            Set<MessageQueue> messageQueues = consumer.fetchMessageQueuesInBalance(topic);
                            if (messageQueues == null || messageQueues.isEmpty()) {
                                Thread.sleep(1000);
                                continue;
                            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `example/src/main/java/org/apache/rocketmq/example/simple/PullConsumer.java`
#### Snippet
```java
                                            break;
                                        case NO_NEW_MSG:
                                            Thread.sleep(1);
                                            consumer.updateConsumeOffset(messageQueue, pullResult.getNextBeginOffset());
                                            break;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `example/src/main/java/org/apache/rocketmq/example/operation/Producer.java`
#### Snippet
```java
                } catch (Exception e) {
                    e.printStackTrace();
                    Thread.sleep(1000);
                }
            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
                                // Flow control
                                while (e.getQueue().size() > MAX_LENGTH_ASYNC_QUEUE) {
                                    Thread.sleep(SLEEP_FOR_A_WHILE);
                                }
                                producer.send(msg, new SendCallback() {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java

                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ignored) {
                            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
                            statsBenchmark.getSendRequestFailedCount().increment();
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e1) {
                            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `example/src/main/java/org/apache/rocketmq/example/benchmark/Producer.java`
#### Snippet
```java
                            log.error("[BENCHMARK_PRODUCER] Send Exception", e);
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ignored) {
                            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `example/src/main/java/org/apache/rocketmq/example/benchmark/TransactionProducer.java`
#### Snippet
```java
                            if (config.sendInterval > 0) {
                                try {
                                    Thread.sleep(config.sendInterval);
                                } catch (InterruptedException e) {
                                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java

                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ignored) {
                            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java
                            statsBenchmark.getSendMessageFailedCount().add(msgs.size());
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e1) {
                            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `example/src/main/java/org/apache/rocketmq/example/benchmark/BatchProducer.java`
#### Snippet
```java
                            logger.error("[BENCHMARK_PRODUCER] Send Exception", e);
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ignored) {
                            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `remoting/src/main/java/org/apache/rocketmq/remoting/common/RemotingHelper.java`
#### Snippet
```java
                    }

                    Thread.sleep(1);
                }

```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `remoting/src/main/java/org/apache/rocketmq/remoting/common/RemotingHelper.java`
#### Snippet
```java
                    }

                    Thread.sleep(1);
                }

```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `remoting/src/main/java/org/apache/rocketmq/remoting/common/RemotingHelper.java`
#### Snippet
```java
                    }

                    Thread.sleep(1);
                }

```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `proxy/src/main/java/org/apache/rocketmq/proxy/grpc/v2/common/GrpcConverter.java`
#### Snippet
```java
        if (keys != null) {
            String[] keysArray = keys.split(MessageConst.KEY_SEPARATOR);
            systemPropertiesBuilder.addAllKeys(Arrays.asList(keysArray));
        }

```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `broker/src/main/java/org/apache/rocketmq/broker/filter/ConsumerFilterData.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o, Collections.<String>emptyList());
    }
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `controller/src/main/java/org/apache/rocketmq/controller/impl/manager/ReplicasInfoManager.java`
#### Snippet
```java
            final Map<Long, String> brokerIdTable = brokerReplicaInfo.getBrokerIdTable();
            final Map<Long, String> memberGroup = new HashMap<>();
            brokerIdTable.forEach((id, addr) -> memberGroup.put(id, addr));
            group.setBrokerAddrs(memberGroup);
            return group;
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `broker/src/main/java/org/apache/rocketmq/broker/filter/MessageEvaluationContext.java`
#### Snippet
```java

        for (Entry<String, String> entry : properties.entrySet()) {
            copy.put(entry.getKey(), entry.getValue());
        }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `example/src/main/java/org/apache/rocketmq/example/simple/LitePullConsumerAssignWithSubExpression.java`
#### Snippet
```java
        List<MessageQueue> assignList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            assignList.add(list.get(i));
        }
        mqSet = litePullConsumer.fetchMessageQueues("TopicTest1");
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `example/src/main/java/org/apache/rocketmq/example/simple/LitePullConsumerAssignWithSubExpression.java`
#### Snippet
```java
        list = new ArrayList<>(mqSet);
        for (int i = 0; i < list.size(); i++) {
            assignList.add(list.get(i));
        }
        litePullConsumer.assign(assignList);
```

