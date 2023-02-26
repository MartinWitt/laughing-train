# zookeeper 
 
# Bad smells
I found 1908 bad smells with 195 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| PublicFieldAccessedInSynchronizedContext | 307 | false |
| SystemOutErr | 144 | false |
| RedundantFieldInitialization | 132 | false |
| DataFlowIssue | 115 | false |
| ReturnNull | 108 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 93 | false |
| StringConcatenationInsideStringBufferAppend | 87 | false |
| ConstantValue | 61 | false |
| UnusedAssignment | 52 | false |
| SizeReplaceableByIsEmpty | 46 | true |
| SynchronizationOnLocalVariableOrMethodParameter | 45 | false |
| BoundedWildcard | 44 | false |
| SynchronizeOnThis | 41 | false |
| UnnecessaryLocalVariable | 40 | true |
| UtilityClassWithoutPrivateConstructor | 37 | true |
| UnnecessaryFullyQualifiedName | 29 | false |
| AssignmentToMethodParameter | 28 | false |
| DeprecatedIsStillUsed | 28 | false |
| NestedAssignment | 25 | false |
| RedundantStringFormatCall | 25 | false |
| UnnecessaryToStringCall | 25 | true |
| ZeroLengthArrayInitialization | 23 | false |
| CodeBlock2Expr | 20 | true |
| Convert2MethodRef | 17 | false |
| AbstractMethodCallInConstructor | 17 | false |
| DynamicRegexReplaceableByCompiledPattern | 16 | false |
| NonShortCircuitBoolean | 15 | false |
| IOResource | 13 | false |
| SynchronizeOnNonFinalField | 13 | false |
| ThrowablePrintStackTrace | 13 | false |
| NonProtectedConstructorInAbstractClass | 11 | true |
| UnnecessaryBoxing | 10 | false |
| CallToStringConcatCanBeReplacedByOperator | 9 | false |
| SwitchStatementWithConfusingDeclaration | 9 | false |
| EmptyMethod | 9 | false |
| NonFinalFieldOfException | 9 | false |
| StringOperationCanBeSimplified | 8 | false |
| StringBufferReplaceableByString | 8 | false |
| RedundantSuppression | 7 | false |
| UnnecessaryReturn | 7 | true |
| ReplaceAssignmentWithOperatorAssignment | 6 | false |
| UnnecessarySemicolon | 6 | false |
| BusyWait | 6 | false |
| StringEqualsEmptyString | 6 | false |
| UnnecessaryUnboxing | 5 | false |
| OptionalUsedAsFieldOrParameterType | 5 | false |
| NestedSynchronizedStatement | 5 | false |
| Java8MapApi | 5 | false |
| ClassNameSameAsAncestorName | 4 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 4 | false |
| UnnecessarySuperQualifier | 4 | false |
| ExceptionNameDoesntEndWithException | 4 | false |
| RedundantOperationOnEmptyContainer | 4 | false |
| CatchMayIgnoreException | 4 | false |
| Convert2Lambda | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| WrapperTypeMayBePrimitive | 3 | false |
| TrivialStringConcatenation | 3 | false |
| IntegerMultiplicationImplicitCastToLong | 3 | false |
| JavaReflectionInvocation | 3 | false |
| RedundantFileCreation | 3 | false |
| DuplicateBranchesInSwitch | 3 | false |
| WhileLoopSpinsOnField | 3 | false |
| StringBufferReplaceableByStringBuilder | 3 | false |
| FieldMayBeStatic | 3 | false |
| Anonymous2MethodRef | 3 | false |
| PointlessArithmeticExpression | 2 | false |
| CommentedOutCode | 2 | false |
| RegExpRedundantEscape | 2 | false |
| ObjectNotify | 2 | false |
| AccessStaticViaInstance | 2 | false |
| RedundantMethodOverride | 2 | false |
| NonStrictComparisonCanBeEquality | 2 | true |
| AssignmentToLambdaParameter | 2 | false |
| ConditionalBreakInInfiniteLoop | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| DuplicateExpressions | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| AnonymousHasLambdaAlternative | 2 | false |
| IfStatementMissingBreakInLoop | 2 | false |
| InfiniteLoopStatement | 2 | false |
| UseOfPropertiesAsHashtable | 2 | false |
| RedundantImplements | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| MagicConstant | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| IgnoreResultOfCall | 1 | false |
| PointlessBitwiseExpression | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| UseCompareMethod | 1 | false |
| WaitNotInLoop | 1 | false |
| UseBulkOperation | 1 | false |
| RedundantArrayCreation | 1 | true |
| RegExpSimplifiable | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| InstanceofCatchParameter | 1 | false |
| ParameterCanBeLocal | 1 | false |
| MismatchedJavadocCode | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| ConditionCoveredByFurtherCondition | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| ThreadStartInConstruction | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[childs.size()\]'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        synchronized (node) {
            Set<String> childs = node.getChildren();
            children = childs.toArray(new String[childs.size()]);
            len = (node.data == null ? 0 : node.data.length);
        }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[childs.size()\]'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            nodeCopy = new DataNode(node.data, node.acl, statCopy);
            Set<String> childs = node.getChildren();
            children = childs.toArray(new String[childs.size()]);
        }
        serializeNodeData(oa, pathString, nodeCopy);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[childs.size()\]'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        synchronized (node) {
            Set<String> childs = node.getChildren();
            children = childs.toArray(new String[childs.size()]);
        }
        if (children.length == 0) {
```

## RuleId[ruleID=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                            }
                            // extract server id x from first part of joiner: server.x
                            Long sid = Long.parseLong(parts[0].substring(parts[0].lastIndexOf('.') + 1));
                            QuorumServer qs = new QuorumServer(sid, parts[1]);
                            if (qs.clientAddr == null || qs.electionAddr == null || qs.addr == null) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            QuorumVerifier newQV = self.getLastSeenQuorumVerifier();

            Long designatedLeader = getDesignatedLeader(newLeaderProposal, zk.getZxid());

            self.processReconfig(newQV, designatedLeader, zk.getZxid(), true);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            //otherwise an up-to-date follower will be designated as leader. This saves
            //leader election time, unless the designated leader fails
            Long designatedLeader = getDesignatedLeader(p, zxid);

            QuorumVerifier newQV = p.qvAcksetPairs.get(p.qvAcksetPairs.size() - 1).getQuorumVerifier();
```

## RuleId[ruleID=MagicConstant]
### MagicConstant
Should be one of: SelectionKey.OP_READ, SelectionKey.OP_WRITE, SelectionKey.OP_CONNECT, SelectionKey.OP_ACCEPT or their combination
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxnFactory.java`
#### Snippet
```java
                NIOServerCnxn cnxn = (NIOServerCnxn) key.attachment();
                if (cnxn.isSelectable()) {
                    key.interestOps(cnxn.getInterestOps());
                }
            }
```

## RuleId[ruleID=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1 * 60 * 1000L` can be replaced with '60 \* 1000L'
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
    // thread will not sleep between refresh attempts any less than 1 minute (60*1000 milliseconds = 1 minute).
    // Change the '1' to e.g. 5, to change this to 5 minutes.
    private static final long DEFAULT_MIN_TIME_BEFORE_RELOGIN = 1 * 60 * 1000L;
    public static final String MIN_TIME_BEFORE_RELOGIN_CONFIG_KEY = "zookeeper.kerberos.minReLoginTimeMs";
    private static final long MIN_TIME_BEFORE_RELOGIN = Long.getLong(
```

### PointlessArithmeticExpression
`1 * 24 * 60 * 60` can be replaced with '24 \* 60 \* 60'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/JettyAdminServer.java`
#### Snippet
```java
    public static final String DEFAULT_COMMAND_URL = "/commands";
    private static final String DEFAULT_ADDRESS = "0.0.0.0";
    public static final int DEFAULT_STS_MAX_AGE = 1 * 24 * 60 * 60;  // seconds in a day
    public static final int DEFAULT_HTTP_VERSION = 11;  // based on HttpVersion.java in jetty

```

## RuleId[ruleID=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `serverParts`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

            for (String serverAddress : serverAddresses) {
                String serverParts[] = ConfigUtils.getHostAndPort(serverAddress);
                if ((serverClientParts.length > 2) || (serverParts.length < 3)
                        || (serverParts.length > 4)) {
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `INODE_IDX` from instance context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        nodeSB.append("\"dsize\":").append(dataLen).append(",");
        nodeSB.append("\"dev\":").append(0).append(",");
        nodeSB.append("\"ino\":").append(++INODE_IDX);
        nodeSB.append("}");

```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `zookeeper-server/src/main/java/org/apache/zookeeper/jmx/ManagedUtil.java`
#### Snippet
```java

                // Add the root logger to the Hierarchy MBean
                // org.apache.log4j.Logger rootLogger =
                // org.apache.log4j.Logger.getRootLogger();
                Object rootLogger = Class.forName("org.apache.log4j.Logger")
```

### CommentedOutCode
Commented out code (2 lines)
in `zookeeper-server/src/main/java/org/apache/zookeeper/jmx/ManagedUtil.java`
#### Snippet
```java
                // Get each logger from the Log4J Repository and add it to the
                // Hierarchy MBean created above.
                // org.apache.log4j.spi.LoggerRepository r =
                // org.apache.log4j.LogManager.getLoggerRepository();
                Object r = Class.forName("org.apache.log4j.LogManager")
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KerberosName.java`
#### Snippet
```java
     */
    private static final Pattern ruleParser = Pattern.compile(
        "\\s*((DEFAULT)|(RULE:\\[(\\d*):([^\\]]*)](\\(([^)]*)\\))?"
        + "(s/([^/]*)/([^/]*)/(g)?)?))");

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ConfigUtils.java`
#### Snippet
```java
                return nsa;
            }
            return new String[]{s.replaceAll("\\[|\\]", "")};
        } else {
            return s.split(":");
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `PathParentIterator` on 'this' is unnecessary in this context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/PathParentIterator.java`
#### Snippet
```java
     */
    public Iterable<String> asIterable() {
        return () -> PathParentIterator.this;
    }

```

## RuleId[ruleID=ObjectNotify]
### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/RequestThrottler.java`
#### Snippet
```java
    @SuppressFBWarnings(value = "NN_NAKED_NOTIFY", justification = "state change is in ZooKeeperServer.decInProgress() ")
    public synchronized void throttleWake() {
        this.notify();
    }

```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerSyncThrottler.java`
#### Snippet
```java
            syncInProgress--;
            newCount = syncInProgress;
            countSyncObject.notify();
        }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`stat.length() == 0` can be replaced with 'stat.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/StatsTrack.java`
#### Snippet
```java
    public StatsTrack(String stat) {
        this.stats.clear();
        if (stat == null || stat.length() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`candidates.size() == 0` can be replaced with 'candidates.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/JLineZNodeCompleter.java`
#### Snippet
```java
        }
        Collections.sort(candidates);
        return candidates.size() == 0 ? buffer.length() : buffer.lastIndexOf("/") + 1;
    }

```

### SizeReplaceableByIsEmpty
`pathVsWatchers.size() == 0` can be replaced with 'pathVsWatchers.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
    private boolean contains(String path, Watcher watcherObj, Map<String, Set<Watcher>> pathVsWatchers) {
        boolean watcherExists = true;
        if (pathVsWatchers == null || pathVsWatchers.size() == 0) {
            watcherExists = false;
        } else {
```

### SizeReplaceableByIsEmpty
`watchers.size() > 0` can be replaced with '!watchers.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
                watcherExists = false;
            } else if (watcherObj == null) {
                watcherExists = watchers.size() > 0;
            } else {
                watcherExists = watchers.contains(watcherObj);
```

### SizeReplaceableByIsEmpty
`children.size() == 0` can be replaced with 'children.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/DelQuotaCommand.java`
#### Snippet
```java
        }
        List<String> children = zk.getChildren(path, false);
        if (children.size() == 0) {
            zk.delete(path, -1);
            String parent = path.substring(0, path.lastIndexOf('/'));
```

### SizeReplaceableByIsEmpty
`children.size() == 0` can be replaced with 'children.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/SetQuotaCommand.java`
#### Snippet
```java
                return;
            }
            if (children.size() == 0) {
                return;
            }
```

### SizeReplaceableByIsEmpty
`children.size() == 0` can be replaced with 'children.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/SetQuotaCommand.java`
#### Snippet
```java
                }

                if (children.size() == 0) {
                    return;
                }
```

### SizeReplaceableByIsEmpty
`s.length() == 0` can be replaced with 's.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/jmx/MBeanRegistry.java`
#### Snippet
```java
        String[] tokens = path.split("/");
        for (String s : tokens) {
            if (s.length() == 0) {
                continue;
            }
```

### SizeReplaceableByIsEmpty
`subject.getPrincipals().size() > 0` can be replaced with '!subject.getPrincipals().isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/SecurityUtils.java`
#### Snippet
```java
            // server is using a JAAS-authenticated subject: determine service
            // principal name and hostname from zk server's subject.
            if (subject.getPrincipals().size() > 0) {
                try {
                    final Object[] principals = subject.getPrincipals().toArray();
```

### SizeReplaceableByIsEmpty
`pendingQueue.size() == 0` can be replaced with 'pendingQueue.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            Packet packet;
            synchronized (pendingQueue) {
                if (pendingQueue.size() == 0) {
                    throw new IOException("Nothing in the queue, but got " + replyHdr.getXid());
                }
```

### SizeReplaceableByIsEmpty
`watchers.size() > 0` can be replaced with '!watchers.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                for (Entry<EventType, Set<Watcher>> entry : materializedWatchers.entrySet()) {
                    Set<Watcher> watchers = entry.getValue();
                    if (watchers.size() > 0) {
                        queueEvent(p.watchDeregistration.getClientPath(), err, watchers, entry.getKey());
                        // ignore connectionloss when removing from local
```

### SizeReplaceableByIsEmpty
`validInetAddresses.size() > 0` can be replaced with '!validInetAddresses.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/NettyUtils.java`
#### Snippet
```java
            }
            LOG.debug("Detected {} local network addresses: {}", validInetAddresses.size(), validInetAddresses);
            return validInetAddresses.size() > 0 ? validInetAddresses.size() : DEFAULT_INET_ADDRESS_COUNT;
        } catch (SocketException ex) {
            LOG.warn("Failed to list all network interfaces, assuming 1", ex);
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathTrie.java`
#### Snippet
```java
         Objects.requireNonNull(path, "Path cannot be null");

         if (path.length() == 0) {
             throw new IllegalArgumentException("Invalid path: " + path);
         }
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathTrie.java`
#### Snippet
```java
         Objects.requireNonNull(path, "Path cannot be null");

         if (path.length() == 0) {
             throw new IllegalArgumentException("Invalid path: " + path);
         }
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathTrie.java`
#### Snippet
```java
         Objects.requireNonNull(path, "Path cannot be null");

         if (path.length() == 0) {
             throw new IllegalArgumentException("Invalid path: " + path);
         }
```

### SizeReplaceableByIsEmpty
`keyStorePassword.length() == 0` can be replaced with 'keyStorePassword.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PEMFileLoader.java`
#### Snippet
```java
    public KeyStore loadKeyStore() throws IOException, GeneralSecurityException {
        Optional<String> passwordOption;
        if (keyStorePassword == null || keyStorePassword.length() == 0) {
            passwordOption = Optional.empty();
        } else {
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathUtils.java`
#### Snippet
```java
             throw new IllegalArgumentException("Path cannot be null");
         }
         if (path.length() == 0) {
             throw new IllegalArgumentException("Path length must be > 0");
         }
```

### SizeReplaceableByIsEmpty
`propertyValue.length() == 0` can be replaced with 'propertyValue.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/KeyStoreFileType.java`
#### Snippet
```java
     */
    public static KeyStoreFileType fromPropertyValue(String propertyValue) {
        if (propertyValue == null || propertyValue.length() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`prop.length() == 0` can be replaced with 'prop.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
         */
        public static ClientAuth fromPropertyValue(String prop) {
            if (prop == null || prop.length() == 0) {
                return NEED;
            }
```

### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/StringUtils.java`
#### Snippet
```java
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

```

### SizeReplaceableByIsEmpty
`splits[i].length() > 0` can be replaced with '!splits\[i\].isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/StringUtils.java`
#### Snippet
```java
        for (int i = 0; i < splits.length; i++) {
            splits[i] = splits[i].trim();
            if (splits[i].length() > 0) {
                results.add(splits[i]);
            }
```

### SizeReplaceableByIsEmpty
`children.size() == 0` can be replaced with 'children.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotRecursiveSummary.java`
#### Snippet
```java

    long[] result = {1L, dataSum};
    if (children.size() == 0) {
      return result;
    }
```

### SizeReplaceableByIsEmpty
`children.size() > 0` can be replaced with '!children.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
            children = n.getChildren();
        }
        if (children != null && children.size() > 0) {
            System.out.print("[" + nodeSB);
            for (String child : children) {
```

### SizeReplaceableByIsEmpty
`uniqacls.size() == 0` can be replaced with 'uniqacls.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
        // This resolves https://issues.apache.org/jira/browse/ZOOKEEPER-1877
        List<ACL> uniqacls = removeDuplicates(acls);
        if (uniqacls == null || uniqacls.size() == 0) {
            throw new KeeperException.InvalidACLException(path);
        }
```

### SizeReplaceableByIsEmpty
`results.size() > 0` can be replaced with '!results.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
    public void multi(Iterable<Op> ops, MultiCallback cb, Object ctx) {
        List<OpResult> results = validatePath(ops);
        if (results.size() > 0) {
            cb.processResult(KeeperException.Code.BADARGUMENTS.intValue(), null, ctx, results);
            return;
```

### SizeReplaceableByIsEmpty
`remaining.length() > 0` can be replaced with '!remaining.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KerberosName.java`
#### Snippet
```java
        List<Rule> result = new ArrayList<>();
        String remaining = rules.trim();
        while (remaining.length() > 0) {
            Matcher matcher = ruleParser.matcher(remaining);
            if (!matcher.lookingAt()) {
```

### SizeReplaceableByIsEmpty
`acl.size() == 0` can be replaced with 'acl.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
        LOG.debug("Client credentials: {}", ids);

        if (acl == null || acl.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/PathParentIterator.java`
#### Snippet
```java
        } else {
            path = path.substring(0, path.lastIndexOf('/'));
            if (path.length() == 0) {
                path = "/";
            }
```

### SizeReplaceableByIsEmpty
`pendingSyncs.size() == 0` can be replaced with 'pendingSyncs.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FollowerZooKeeperServer.java`
#### Snippet
```java

    public synchronized void sync() {
        if (pendingSyncs.size() == 0) {
            LOG.warn("Not expecting a sync.");
            return;
```

### SizeReplaceableByIsEmpty
`pendingTxns.size() == 0` can be replaced with 'pendingTxns.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FollowerZooKeeperServer.java`
#### Snippet
```java
     */
    public void commit(long zxid) {
        if (pendingTxns.size() == 0) {
            LOG.warn("Committing " + Long.toHexString(zxid) + " without seeing txn");
            return;
```

### SizeReplaceableByIsEmpty
`pendingSyncs.size() == 0` can be replaced with 'pendingSyncs.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverZooKeeperServer.java`
#### Snippet
```java
     */
    public synchronized void sync() {
        if (pendingSyncs.size() == 0) {
            LOG.warn("Not expecting a sync.");
            return;
```

### SizeReplaceableByIsEmpty
`outstandingProposals.size() == 0` can be replaced with 'outstandingProposals.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
        }

        if (outstandingProposals.size() == 0) {
            LOG.debug("outstanding is 0");
            return;
```

### SizeReplaceableByIsEmpty
`set.size() == 0` can be replaced with 'set.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumHierarchical.java`
#### Snippet
```java
         */
        LOG.debug("Set size: {}", set.size());
        if (set.size() == 0) {
            return false;
        }
```

### SizeReplaceableByIsEmpty
`this.quorumVerifier.getAllMembers().size() > 0` can be replaced with '!this.quorumVerifier.getAllMembers().isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ControllerServerConfig.java`
#### Snippet
```java
     */
    public void ensureComplete() throws IOException {
        if (this.quorumVerifier != null && this.quorumVerifier.getAllMembers().size() > 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`storedFiles.size() > 0` can be replaced with '!storedFiles.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
         */
        private boolean goToNextLog() throws IOException {
            if (storedFiles.size() > 0) {
                this.logFile = storedFiles.remove(storedFiles.size() - 1);
                ia = createInputArchive(this.logFile);
```

### SizeReplaceableByIsEmpty
`snapList.size() == 0` can be replaced with 'snapList.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileSnap.java`
#### Snippet
```java
        // we should  give up
        List<File> snapList = findNValidSnapshots(100);
        if (snapList.size() == 0) {
            return -1L;
        }
```

### SizeReplaceableByIsEmpty
`files.size() == 0` can be replaced with 'files.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileSnap.java`
#### Snippet
```java
    public File findMostRecentSnapshot() {
        List<File> files = findNValidSnapshots(1);
        if (files.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`leaderOffers.size() > 0` can be replaced with '!leaderOffers.isEmpty()'
in `zookeeper-recipes/zookeeper-recipes-election/src/main/java/org/apache/zookeeper/recipes/leader/LeaderElectionSupport.java`
#### Snippet
```java
        List<LeaderOffer> leaderOffers = toLeaderOffers(zooKeeper.getChildren(rootNodeName, false));

        if (leaderOffers.size() > 0) {
            return leaderOffers.get(0).getHostName();
        }
```

### SizeReplaceableByIsEmpty
`listeners.size() > 0` can be replaced with '!listeners.isEmpty()'
in `zookeeper-recipes/zookeeper-recipes-election/src/main/java/org/apache/zookeeper/recipes/leader/LeaderElectionSupport.java`
#### Snippet
```java

        synchronized (listeners) {
            if (listeners.size() > 0) {
                for (LeaderElectionAware observer : listeners) {
                    observer.onElectionEvent(eventType);
```

### SizeReplaceableByIsEmpty
`orderedChildren.size() == 0` can be replaced with 'orderedChildren.isEmpty()'
in `zookeeper-recipes/zookeeper-recipes-queue/src/main/java/org/apache/zookeeper/recipes/queue/DistributedQueue.java`
#### Snippet
```java
                throw new NoSuchElementException();
            }
            if (orderedChildren.size() == 0) {
                throw new NoSuchElementException();
            }
```

### SizeReplaceableByIsEmpty
`orderedChildren.size() == 0` can be replaced with 'orderedChildren.isEmpty()'
in `zookeeper-recipes/zookeeper-recipes-queue/src/main/java/org/apache/zookeeper/recipes/queue/DistributedQueue.java`
#### Snippet
```java
                continue;
            }
            if (orderedChildren.size() == 0) {
                childWatcher.await();
                continue;
```

### SizeReplaceableByIsEmpty
`orderedChildren.size() == 0` can be replaced with 'orderedChildren.isEmpty()'
in `zookeeper-recipes/zookeeper-recipes-queue/src/main/java/org/apache/zookeeper/recipes/queue/DistributedQueue.java`
#### Snippet
```java
                throw new NoSuchElementException();
            }
            if (orderedChildren.size() == 0) {
                throw new NoSuchElementException();
            }
```

### SizeReplaceableByIsEmpty
`sample.labelNames.size() > 0` can be replaced with '!sample.labelNames.isEmpty()'
in `zookeeper-metrics-providers/zookeeper-prometheus-metrics/src/main/java/org/apache/zookeeper/metrics/prometheus/PrometheusMetricsProvider.java`
#### Snippet
```java
        StringBuilder keyBuilder = new StringBuilder();
        keyBuilder.append(sample.name);
        if (sample.labelNames.size() > 0) {
            keyBuilder.append('{');
            for (int i = 0; i < sample.labelNames.size(); ++i) {
```

### SizeReplaceableByIsEmpty
`observerMasters.size() > 0` can be replaced with '!observerMasters.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

    private boolean useObserverMasters() {
        return getLearnerType() == LearnerType.OBSERVER && observerMasters.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`addrList.size() > 0` can be replaced with '!addrList.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            List<InetSocketAddress> electionAddrList = new LinkedList<>(electionAddr.getAllAddresses());

            if (addrList.size() > 0 && electionAddrList.size() > 0) {
                addrList.sort(Comparator.comparing(InetSocketAddress::getHostString));
                electionAddrList.sort(Comparator.comparing(InetSocketAddress::getHostString));
```

### SizeReplaceableByIsEmpty
`electionAddrList.size() > 0` can be replaced with '!electionAddrList.isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            List<InetSocketAddress> electionAddrList = new LinkedList<>(electionAddr.getAllAddresses());

            if (addrList.size() > 0 && electionAddrList.size() > 0) {
                addrList.sort(Comparator.comparing(InetSocketAddress::getHostString));
                electionAddrList.sort(Comparator.comparing(InetSocketAddress::getHostString));
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxnFactory.java`
#### Snippet
```java
            + numSelectorThreads + " selector thread(s), "
            + (numWorkerThreads > 0 ? numWorkerThreads : "no") + " worker threads, and "
            + (directBufferBytes == 0 ? "gathered writes." : ("" + (directBufferBytes / 1024) + " kB direct buffers."));
        LOG.info(logMsg);
        for (int i = 0; i < numSelectorThreads; ++i) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/command/MonitorCommand.java`
#### Snippet
```java
        } else if (value instanceof Long || value instanceof Integer) {
            // format as integers
            output(key, value + "");
        } else if (value instanceof Number) {
            // format as floating point
```

### TrivialStringConcatenation
Empty string used in concatenation
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/command/MonitorCommand.java`
#### Snippet
```java
        } else if (value instanceof Number) {
            // format as floating point
            output(key, ((Number) value).doubleValue() + "");
        } else {
            output(key, value.toString());
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
        if (f.exists()) {
            try {
                f.delete();
            } catch (Exception e) {
                LOG.warn("deleting {} failed", filename);
```

## RuleId[ruleID=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.zookeeper.server.ZooKeeperServer.isSerializeLastProcessedZxidEnabled()' accessed via instance reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/Commands.java`
#### Snippet
```java
            }

            if (!zkServer.isSerializeLastProcessedZxidEnabled()) {
                response.setStatusCode(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                LOG.warn("Restore command requires serializeLastProcessedZxidEnable flag is set to true");
```

### AccessStaticViaInstance
Static member 'org.apache.zookeeper.server.ZooKeeperServer.isSerializeLastProcessedZxidEnabled()' accessed via instance reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/Commands.java`
#### Snippet
```java
            }

            if (!zkServer.isSerializeLastProcessedZxidEnabled()) {
                response.setStatusCode(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                LOG.warn("Snapshot command requires serializeLastProcessedZxidEnable flag is set to true");
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/StatsTrack.java`
#### Snippet
```java
    private long getValue(String key) {
        Long val = this.stats.get(key);
        return val == null ? -1 : val.longValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/OSMXBean.java`
#### Snippet
```java
        if (!ibmvendor) {
            ofdc = getOSUnixMXBeanMethod("getOpenFileDescriptorCount");
            return (ofdc != null ? ofdc.longValue() : -1);
        }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/OSMXBean.java`
#### Snippet
```java
        if (!ibmvendor) {
            mfdc = getOSUnixMXBeanMethod("getMaxFileDescriptorCount");
            return (mfdc != null ? mfdc.longValue() : -1);
        }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
        oa.writeInt(sessSnap.size(), "count");
        for (Entry<Long, Integer> entry : sessSnap.entrySet()) {
            oa.writeLong(entry.getKey().longValue(), "id");
            oa.writeInt(entry.getValue().intValue(), "timeout");
        }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
        for (Entry<Long, Integer> entry : sessSnap.entrySet()) {
            oa.writeLong(entry.getKey().longValue(), "id");
            oa.writeInt(entry.getValue().intValue(), "timeout");
        }
        dt.serialize(oa, "tree");
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PEMFileLoader.java`
#### Snippet
```java
    }

    static class Builder extends FileKeyStoreLoader.Builder<PEMFileLoader> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/JKSFileLoader.java`
#### Snippet
```java
    }

    static class Builder extends FileKeyStoreLoader.Builder<JKSFileLoader> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PKCS12FileLoader.java`
#### Snippet
```java
    }

    static class Builder extends FileKeyStoreLoader.Builder<PKCS12FileLoader> {

        @Override
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/BCFKSFileLoader.java`
#### Snippet
```java
    }

    static class Builder extends FileKeyStoreLoader.Builder<BCFKSFileLoader> {
        @Override
        BCFKSFileLoader build() {
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `toString()` only delegates to its super method
in `zookeeper-server/src/main/java/org/apache/zookeeper/admin/ZooKeeperAdmin.java`
#### Snippet
```java
     */
    @Override
    public String toString() {
        return super.toString();
    }
```

### RedundantMethodOverride
Method `isHidden()` is identical to its super method
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LocalPeerBean.java`
#### Snippet
```java
    }

    public boolean isHidden() {
        return false;
    }
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
self.getInitLimit() \* self.getTickTime(): integer multiplication implicitly cast to long
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                long start = Time.currentElapsedTime();
                long cur = start;
                long end = start + self.getInitLimit() * self.getTickTime();
                while (!electionFinished && cur < end) {
                    electingFollowers.wait(end - cur);
```

### IntegerMultiplicationImplicitCastToLong
self.getInitLimit() \* self.getTickTime(): integer multiplication implicitly cast to long
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                long start = Time.currentElapsedTime();
                long cur = start;
                long end = start + self.getInitLimit() * self.getTickTime();
                while (!quorumFormed && cur < end) {
                    newLeaderProposal.qvAcksetPairs.wait(end - cur);
```

### IntegerMultiplicationImplicitCastToLong
self.getInitLimit() \* self.getTickTime(): integer multiplication implicitly cast to long
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                }
                long cur = start;
                long end = start + self.getInitLimit() * self.getTickTime();
                while (waitingForNewEpoch && cur < end && !quitWaitForEpoch) {
                    connectingFollowers.wait(end - cur);
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
                String line;
                Method readLine = consoleC.getMethod("readLine", String.class);
                while ((line = (String) readLine.invoke(console, getPrompt())) != null) {
                    executeLine(line);
                }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java

                String line;
                while ((line = br.readLine()) != null) {
                    executeLine(line);
                }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                                if (result instanceof ErrorResult
                                    && KeeperException.Code.OK.intValue()
                                       != (newRc = ((ErrorResult) result).getErr())) {
                                    break;
                                }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/FourLetterWordMain.java`
#### Snippet
```java
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    public X509Util(ZKConfig zkConfig) {
        this.zkConfig = zkConfig;
        keyStoreFileWatcher = trustStoreFileWatcher = null;
    }

```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/Shell.java`
#### Snippet
```java
            char[] buf = new char[512];
            int nRead;
            while ((nRead = lines.read(buf, 0, buf.length)) > 0) {
                output.append(buf, 0, nRead);
            }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxn.java`
#### Snippet
```java
            // Remove the buffers that we have sent
            ByteBuffer bb;
            while ((bb = outgoingBuffers.peek()) != null) {
                if (bb == ServerCnxnFactory.closeConn) {
                    throw new CloseRequestException("close requested", DisconnectReason.CLIENT_CLOSED_CONNECTION);
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxn.java`
#### Snippet
```java

            // Remove the buffers that we have sent
            while ((bb = outgoingBuffers.peek()) != null) {
                if (bb == ServerCnxnFactory.closeConn) {
                    throw new CloseRequestException("close requested", DisconnectReason.CLIENT_CLOSED_CONNECTION);
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/WorkerService.java`
#### Snippet
```java
        for (ExecutorService worker : workers) {
            boolean terminated = false;
            while ((now = Time.currentElapsedTime()) <= endTime) {
                try {
                    terminated = worker.awaitTermination(endTime - now, TimeUnit.MILLISECONDS);
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxnFactory.java`
#### Snippet
```java
                }
                SocketChannel accepted;
                while ((accepted = acceptedQueue.poll()) != null) {
                    fastCloseSock(accepted);
                }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxnFactory.java`
#### Snippet
```java
        private void processInterestOpsUpdateRequests() {
            SelectionKey key;
            while (!stopped && (key = updateQueue.poll()) != null) {
                if (!key.isValid()) {
                    cleanupSelectionKey(key);
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxnFactory.java`
#### Snippet
```java
        private void processAcceptedConnections() {
            SocketChannel accepted;
            while (!stopped && (accepted = acceptedQueue.poll()) != null) {
                SelectionKey key = null;
                try {
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/RequestThrottler.java`
#### Snippet
```java
        Request request;
        LOG.info("Draining request throttler queue");
        while ((request = submittedRequests.poll()) != null) {
            dropped += 1;
            dropRequest(request);
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                break;
            case NOOP:
                newNodeDigest = prevNodeDigest = 0;
                break;
            default:
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/OSMXBean.java`
#### Snippet
```java
            try {
                String openFileDesCount;
                if ((openFileDesCount = output.readLine()) != null) {
                    return Long.parseLong(openFileDesCount);
                }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/OSMXBean.java`
#### Snippet
```java
            try {
                String maxFileDesCount;
                if ((maxFileDesCount = output.readLine()) != null) {
                    return Long.parseLong(maxFileDesCount);
                }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/ReadAheadEndpoint.java`
#### Snippet
```java

        this.endPoint = channel;
        start = ByteBuffer.wrap(bytes = new byte[readAheadLength]);
        start.flip();
        leftToRead = readAheadLength;
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/metric/AvgMinMaxCounter.java`
#### Snippet
```java
    private void setMax(long value) {
        long current;
        while (value > (current = max.get()) && !max.compareAndSet(current, value)) {
            // no op
        }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/metric/AvgMinMaxCounter.java`
#### Snippet
```java
    private void setMin(long value) {
        long current;
        while (value < (current = min.get()) && !min.compareAndSet(current, value)) {
            // no op
        }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
                    byte[] buf = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = input.read(buf)) > 0) {
                        output.write(buf, 0, bytesRead);
                    }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
                       && requestsToProcess > 0
                       && (maxReadBatchSize < 0 || readsProcessed <= maxReadBatchSize)
                       && (request = queuedRequests.poll()) != null) {
                    requestsToProcess--;
                    if (needCommit(request) || pendingRequests.containsKey(request.sessionId)) {
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java

                            // Verify if there is any change in the proposed leader
                            while ((n = recvqueue.poll(finalizeWait, TimeUnit.MILLISECONDS)) != null) {
                                if (totalOrderPredicate(n.leader, n.zxid, n.peerEpoch, proposedLeader, proposedZxid, proposedEpoch)) {
                                    recvqueue.put(n);
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/SnapStream.java`
#### Snippet
```java
            int readlen = 0;
            int l;
            while (readlen < 5 && (l = raf.read(bytes, readlen, bytes.length - readlen)) >= 0) {
                readlen += l;
            }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
        /** Local variable to read fsync.warningthresholdms into */
        Long fsyncWarningThreshold;
        if ((fsyncWarningThreshold = Long.getLong(ZOOKEEPER_FSYNC_WARNING_THRESHOLD_MS_PROPERTY)) == null) {
            fsyncWarningThreshold = Long.getLong(FSYNC_WARNING_THRESHOLD_MS_PROPERTY, 1000);
        }
```

### NestedAssignment
Result of assignment expression used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
                ZKMBeanInfo p;
                if (getMyId() == s.id) {
                    p = jmxLocalPeerBean = new LocalPeerBean(this);
                    try {
                        MBeanRegistry.getInstance().register(p, jmxQuorumBean);
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`nextSid = nextSid | (id << 56)` could be simplified to 'nextSid \|= (id \<\< 56)'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SessionTrackerImpl.java`
#### Snippet
```java
        long nextSid;
        nextSid = (Time.currentElapsedTime() << 24) >>> 8;
        nextSid = nextSid | (id << 56);
        if (nextSid == EphemeralType.CONTAINER_EPHEMERAL_OWNER) {
            ++nextSid;  // this is an unlikely edge case, but check it just in case
```

### ReplaceAssignmentWithOperatorAssignment
`result[0] = result[0] + childResult[0]` could be simplified to 'result\[0\] += childResult\[0\]'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotRecursiveSummary.java`
#### Snippet
```java
          printZnode(dataTree, name + (name.equals("/") ? "" : "/") + child, childBuilder,
              level + 1, maxDepth);
      result[0] = result[0] + childResult[0];
      result[1] = result[1] + childResult[1];
    }
```

### ReplaceAssignmentWithOperatorAssignment
`result[1] = result[1] + childResult[1]` could be simplified to 'result\[1\] += childResult\[1\]'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotRecursiveSummary.java`
#### Snippet
```java
              level + 1, maxDepth);
      result[0] = result[0] + childResult[0];
      result[1] = result[1] + childResult[1];
    }

```

### ReplaceAssignmentWithOperatorAssignment
`path = path + String.format(Locale.ENGLISH, "%010d", parentCVersion)` could be simplified to 'path += String.format(Locale.ENGLISH, "%010d", parentCVersion)'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
        int parentCVersion = parentRecord.stat.getCversion();
        if (createMode.isSequential()) {
            path = path + String.format(Locale.ENGLISH, "%010d", parentCVersion);
        }
        validatePath(path, request.sessionId);
```

### ReplaceAssignmentWithOperatorAssignment
`logSize = logSize * 1024` could be simplified to 'logSize \*= 1024'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java

            // Convert to bytes
            logSize = logSize * 1024;
            txnLogSizeLimit = logSize;
        }
```

### ReplaceAssignmentWithOperatorAssignment
`idx = idx - 1` could be simplified to 'idx -= 1'
in `zookeeper-recipes/zookeeper-recipes-lock/src/main/java/org/apache/zookeeper/recipes/lock/ZNodeName.java`
#### Snippet
```java
        } else {
            if (idx > 0 && name.charAt(idx - 1) == '-') {
                idx = idx - 1;
            }
            this.prefix = name.substring(0, idx);
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `principal` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
    private LoginContext login = null;
    private String loginContextName = null;
    private String principal = null;

    // Initialize 'lastLogin' to do a login at first time
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastLogin` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java

    // Initialize 'lastLogin' to do a login at first time
    private long lastLogin = Time.currentElapsedTime() - MIN_TIME_BEFORE_RELOGIN;
    private final ZKConfig zkConfig;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `loginContextName` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java

    private LoginContext login = null;
    private String loginContextName = null;
    private String principal = null;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `subject` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
      MIN_TIME_BEFORE_RELOGIN_CONFIG_KEY, DEFAULT_MIN_TIME_BEFORE_RELOGIN);

    private Subject subject = null;
    private Thread t = null;
    private boolean isKrbTicket = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sockKey` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNIO.java`
#### Snippet
```java
    private final Selector selector = Selector.open();

    private SelectionKey sockKey;

    private SocketAddress localSocketAddress;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mapBean2Path` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/jmx/MBeanRegistry.java`
#### Snippet
```java
    private final Object LOCK = new Object();

    private Map<ZKMBeanInfo, String> mapBean2Path = new ConcurrentHashMap<>();

    private MBeanServer mBeanServer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `mBeanServer` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/jmx/MBeanRegistry.java`
#### Snippet
```java
    private Map<ZKMBeanInfo, String> mapBean2Path = new ConcurrentHashMap<>();

    private MBeanServer mBeanServer;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `xid` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java

    // @VisibleForTesting
    protected int xid = 1;

    // @VisibleForTesting
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `requestTimeout` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
     * then it is assumed that the response packet is lost.
     */
    private long requestTimeout;

    ZKWatchManager getWatcherManager() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `login` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java

    private static final Logger LOG = LoggerFactory.getLogger(ZooKeeperSaslClient.class);
    private Login login = null;
    private SaslClient saslClient;
    private boolean isSASLConfigured = true;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `saslState` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
    }

    private SaslState saslState = SaslState.INITIAL;

    private boolean gotLastPacket = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `serverAddresses` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(StaticHostProvider.class);

    private List<InetSocketAddress> serverAddresses = new ArrayList<>(5);

    private Random sourceOfRandomness;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sourceOfRandomness` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java
    private List<InetSocketAddress> serverAddresses = new ArrayList<>(5);

    private Random sourceOfRandomness;
    private int lastIndex = -1;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentIndex` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java
    private int lastIndex = -1;

    private int currentIndex = -1;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastIndex` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java

    private Random sourceOfRandomness;
    private int lastIndex = -1;

    private int currentIndex = -1;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logLock` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
    public int commitLogCount;
    protected Queue<Proposal> committedLog = new ArrayDeque<>();
    protected ReentrantReadWriteLock logLock = new ReentrantReadWriteLock();
    private volatile boolean initialized = false;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `dataTree` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
     * all these members.
     */
    protected DataTree dataTree;
    protected ConcurrentHashMap<Long, Integer> sessionsWithTimeouts;
    protected FileTxnSnapLog snapLog;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `committedLog` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
    public static final int DEFAULT_COMMIT_LOG_COUNT = 500;
    public int commitLogCount;
    protected Queue<Proposal> committedLog = new ArrayDeque<>();
    protected ReentrantReadWriteLock logLock = new ReentrantReadWriteLock();
    private volatile boolean initialized = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `digestCalculator` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
    private final RequestProcessor nextProcessor;
    private final boolean digestEnabled;
    private DigestCalculator digestCalculator;

    ZooKeeperServer zks;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `zks` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
    private DigestCalculator digestCalculator;

    ZooKeeperServer zks;

    public enum DigestOpCode {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `localAddress` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java
    private final ChannelGroup allChannels = new DefaultChannelGroup("zkServerCnxns", new DefaultEventExecutor());
    private final Map<InetAddress, AtomicInteger> ipMap = new ConcurrentHashMap<>();
    private InetSocketAddress localAddress;
    private int maxClientCnxns = 60;
    int listenBacklog = -1;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `initialized` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/ProviderRegistry.java`
#### Snippet
```java
    public static final String AUTHPROVIDER_PROPERTY_PREFIX = "zookeeper.authProvider.";

    private static boolean initialized = false;
    private static final Map<String, AuthenticationProvider> authenticationProviders = new HashMap<>();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `numberOfElements` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/CircularBuffer.java`
#### Snippet
```java
    private final int capacity;
    private int oldest;
    private AtomicInteger numberOfElements = new AtomicInteger();

    @SuppressWarnings("unchecked")
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `txnLogFactory` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    protected int listenBacklog = -1;
    protected SessionTracker sessionTracker;
    private FileTxnSnapLog txnLogFactory = null;
    private ZKDatabase zkDb;
    private ResponseCache readResponseCache;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sessionTracker` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    /** Socket listen backlog. Value of -1 indicates unset */
    protected int listenBacklog = -1;
    protected SessionTracker sessionTracker;
    private FileTxnSnapLog txnLogFactory = null;
    private ZKDatabase zkDb;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `zkDb` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    protected SessionTracker sessionTracker;
    private FileTxnSnapLog txnLogFactory = null;
    private ZKDatabase zkDb;
    private ResponseCache readResponseCache;
    private ResponseCache getChildrenResponseCache;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jvmPauseMonitor` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    public static final Exception ok = new Exception("No prob");
    protected RequestProcessor firstProcessor;
    protected JvmPauseMonitor jvmPauseMonitor;
    protected volatile State state = State.INITIAL;
    private boolean isResponseCachingEnabled = true;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `requestThrottler` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
        "Internally the throttler has a BlockingQueue so "
        + "once the throttler is created and started, it is thread-safe")
    private RequestThrottler requestThrottler;
    public static final String SNAP_COUNT = "zookeeper.snapCount";

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `localSessionEnabled` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    private static final int DEFAULT_GLOBAL_OUTSTANDING_LIMIT = 1000;

    private boolean localSessionEnabled = false;
    protected enum State {
        INITIAL,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `firstProcessor` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    private final AtomicLong hzxid = new AtomicLong(0);
    public static final Exception ok = new Exception("No prob");
    protected RequestProcessor firstProcessor;
    protected JvmPauseMonitor jvmPauseMonitor;
    protected volatile State state = State.INITIAL;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pendingException` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/ReadAheadEndpoint.java`
#### Snippet
```java
    private final byte[] bytes;
    private int leftToRead;
    private IOException pendingException = null;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `prepRequestProcessor` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LeaderZooKeeperServer.java`
#### Snippet
```java
    CommitProcessor commitProcessor;

    PrepRequestProcessor prepRequestProcessor;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `upgradeableSessionTracker` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java

    public final QuorumPeer self;
    protected UpgradeableSessionTracker upgradeableSessionTracker;

    protected QuorumZooKeeperServer(FileTxnSnapLog logFactory, int tickTime, int minSessionTimeout,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `dataWatches` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
    private final NodeHashMap nodes;

    private IWatchManager dataWatches;

    private IWatchManager childWatches;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `childWatches` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
    private IWatchManager dataWatches;

    private IWatchManager childWatches;

    /** cached total size of paths and data for all DataNodes */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `self` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
    }

    QuorumPeer self;
    LearnerZooKeeperServer zk;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `bufferedOutput` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
    LearnerZooKeeperServer zk;

    protected BufferedOutputStream bufferedOutput;

    protected Socket sock;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `zk` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java

    QuorumPeer self;
    LearnerZooKeeperServer zk;

    protected BufferedOutputStream bufferedOutput;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sock` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
    protected BufferedOutputStream bufferedOutput;

    protected Socket sock;
    protected MultipleAddresses leaderAddr;
    protected AtomicBoolean sockBeingClosed = new AtomicBoolean(false);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `leaderOs` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
    LearnerSender sender = null;
    protected InputArchive leaderIs;
    protected OutputArchive leaderOs;
    /** the protocol version of the leader */
    protected int leaderProtocolVersion = 0x01;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `leaderIs` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java

    LearnerSender sender = null;
    protected InputArchive leaderIs;
    protected OutputArchive leaderOs;
    /** the protocol version of the leader */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `syncRequestProcessorEnabled` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverZooKeeperServer.java`
#### Snippet
```java
     */

    private boolean syncRequestProcessorEnabled = this.self.getSyncEnabled();

    /*
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `threadCnt` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
     * Counter to count worker threads
     */
    private AtomicInteger threadCnt = new AtomicInteger(0);

    /*
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sid` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
    class RecvWorker extends ZooKeeperThread {

        Long sid;
        Socket sock;
        volatile boolean running = true;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `serverSocket` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java

        class ListenerHandler implements Runnable, Closeable {
            private ServerSocket serverSocket;
            private InetSocketAddress address;
            private boolean portUnification;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sid` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
    class SendWorker extends ZooKeeperThread {

        Long sid;
        Socket sock;
        RecvWorker recvWorker;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sock` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java

        Long sid;
        Socket sock;
        RecvWorker recvWorker;
        volatile boolean running = true;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `self` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
    private final AtomicLong followerCounter = new AtomicLong(-1);

    private QuorumPeer self;
    private FollowerZooKeeperServer zks;
    private int port;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `listenerRunning` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
    private Thread thread;
    private ServerSocket ss;
    private boolean listenerRunning;
    private ScheduledExecutorService pinger;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `proposedPkts` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
    private static final int PKTS_SIZE_LIMIT = 32 * 1024 * 1024;
    private static volatile int pktsSizeLimit = Integer.getInteger("zookeeper.observerMaster.sizeLimit", PKTS_SIZE_LIMIT);
    private ConcurrentLinkedQueue<QuorumPacket> proposedPkts = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<QuorumPacket> committedPkts = new ConcurrentLinkedQueue<>();
    private int pktsSize = 0;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `activeObservers` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
    private int port;

    private Set<LearnerHandler> activeObservers = Collections.newSetFromMap(new ConcurrentHashMap<>());

    private final ConcurrentHashMap<LearnerHandler, LearnerHandlerBean> connectionBeans = new ConcurrentHashMap<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `zks` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java

    private QuorumPeer self;
    private FollowerZooKeeperServer zks;
    private int port;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `queuedRequests` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
     * Incoming requests.
     */
    protected LinkedBlockingQueue<Request> queuedRequests = new LinkedBlockingQueue<>();

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `waitingForNewEpoch` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java

    long epoch = -1;
    boolean waitingForNewEpoch = true;

    // when a reconfig occurs where the leader is removed or becomes an observer,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastProposed` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    }

    long lastProposed;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ackLoggingFrequency` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    // log ack latency if zxid is a multiple of ackLoggingFrequency. If <=0, disable logging.
    private static final String ACK_LOGGING_FREQUENCY = "zookeeper.leader.ackLoggingFrequency";
    private static int ackLoggingFrequency;

    static {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `leaderStateSummary` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    }

    StateSummary leaderStateSummary;

    long epoch = -1;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `leaderStartTime` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
     * Timestamp when this leader started serving request (Quorum is running)
     */
    private long leaderStartTime;

    public long getUptime() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `syncInProgress` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerSyncThrottler.java`
#### Snippet
```java

    private final Object countSyncObject = new Object();
    private int syncInProgress;

    private volatile int maxConcurrentSyncs;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `proposedZxid` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
    AtomicLong logicalclock = new AtomicLong(); /* Election instance */
    long proposedLeader;
    long proposedZxid;
    long proposedEpoch;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `self` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
    }

    QuorumPeer self;
    Messenger messenger;
    AtomicLong logicalclock = new AtomicLong(); /* Election instance */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `proposedEpoch` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
    long proposedLeader;
    long proposedZxid;
    long proposedEpoch;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `proposedLeader` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
    Messenger messenger;
    AtomicLong logicalclock = new AtomicLong(); /* Election instance */
    long proposedLeader;
    long proposedZxid;
    long proposedEpoch;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logicalclock` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
    QuorumPeer self;
    Messenger messenger;
    AtomicLong logicalclock = new AtomicLong(); /* Election instance */
    long proposedLeader;
    long proposedZxid;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `client` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/CommandClient.java`
#### Snippet
```java
    private final int hostPort;
    private final String hostName;
    private HttpClient client;
    private boolean started = false;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cnxnFactory` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ZooKeeperServerController.java`
#### Snippet
```java

    private QuorumPeer quorumPeer;
    private ControllableConnectionFactory cnxnFactory;

    public ZooKeeperServerController(QuorumPeerConfig config) throws IOException {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `quorumPeer` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ZooKeeperServerController.java`
#### Snippet
```java
    private static final long DEFAULT_DELAY_MS = 1000;

    private QuorumPeer quorumPeer;
    private ControllableConnectionFactory cnxnFactory;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `listener` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ControllerService.java`
#### Snippet
```java

    private ZooKeeperServerController controller;
    private CommandListener listener;

    protected QuorumPeerConfig config;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `controller` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ControllerService.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(ControllerService.class);

    private ZooKeeperServerController controller;
    private CommandListener listener;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logDir` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
    volatile FileOutputStream fos = null;

    File logDir;
    private final boolean forceSync = !System.getProperty("zookeeper.forceSync", "yes").equals("no");
    long dbId;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `txnLogSizeLimit` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
     * The actual txnlog size limit in bytes.
     */
    private static long txnLogSizeLimit = -1;

    static {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastSnapshotInfo` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileSnap.java`
#### Snippet
```java

    File snapDir;
    SnapshotInfo lastSnapshotInfo = null;
    private volatile boolean close = false;
    private static final int VERSION = 2;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `zooKeeper` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-recipes/zookeeper-recipes-election/src/main/java/org/apache/zookeeper/recipes/leader/LeaderElectionSupport.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(LeaderElectionSupport.class);

    private ZooKeeper zooKeeper;

    private State state;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `listeners` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-recipes/zookeeper-recipes-election/src/main/java/org/apache/zookeeper/recipes/leader/LeaderElectionSupport.java`
#### Snippet
```java

    private State state;
    private Set<LeaderElectionAware> listeners;

    private String rootNodeName;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `rootNodeName` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-recipes/zookeeper-recipes-election/src/main/java/org/apache/zookeeper/recipes/leader/LeaderElectionSupport.java`
#### Snippet
```java
    private Set<LeaderElectionAware> listeners;

    private String rootNodeName;
    private LeaderOffer leaderOffer;
    private String hostName;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `state` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-recipes/zookeeper-recipes-election/src/main/java/org/apache/zookeeper/recipes/leader/LeaderElectionSupport.java`
#### Snippet
```java
    private ZooKeeper zooKeeper;

    private State state;
    private Set<LeaderElectionAware> listeners;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `id` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-recipes/zookeeper-recipes-lock/src/main/java/org/apache/zookeeper/recipes/lock/WriteLock.java`
#### Snippet
```java

    private final String dir;
    private String id;
    private ZNodeName idName;
    private String ownerId;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myid` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
     * My id
     */
    private long myid;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `zkDb` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
     * message from the leader
     */
    private ZKDatabase zkDb;

    private JvmPauseMonitor jvmPauseMonitor;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `adminServer` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    private final QuorumStats quorumStats;

    AdminServer adminServer;

    private final boolean reconfigEnabled;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `electionAlg` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    private int electionType;

    Election electionAlg;

    ServerCnxnFactory cnxnFactory;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cnxnFactory` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    Election electionAlg;

    ServerCnxnFactory cnxnFactory;
    ServerCnxnFactory secureCnxnFactory;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `observer` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    public Follower follower;
    public Leader leader;
    public Observer observer;

    protected Follower makeFollower(FileTxnSnapLog logFactory) throws IOException {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `follower` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    public Follower follower;
    public Leader leader;
    public Observer observer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `nextObserverMaster` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    private int nextObserverMaster = 0;
    private QuorumServer nextObserverMaster() {
        if (nextObserverMaster >= observerMasters.size()) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `secureCnxnFactory` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

    ServerCnxnFactory cnxnFactory;
    ServerCnxnFactory secureCnxnFactory;

    private FileTxnSnapLog logFactory = null;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `observerMasters` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    private ArrayList<QuorumServer> observerMasters = new ArrayList<>();
    private void updateObserverMasterList() {
        if (observerMasterPort <= 0) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `electionType` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    private int electionType;

    Election electionAlg;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `shuttingDownLE` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    boolean shuttingDownLE = false;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `leader` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

    public Follower follower;
    public Leader leader;
    public Observer observer;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `observerMasterPort` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    private int observerMasterPort;

    public int getObserverMasterPort() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jvmPauseMonitor` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    private ZKDatabase zkDb;

    private JvmPauseMonitor jvmPauseMonitor;

    public static final class AddressTuple {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `configFilename` is accessed in both synchronized and unsynchronized contexts
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    private String configFilename = null;

    public int getQuorumSize() {
```

## RuleId[ruleID=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooDefs.java`
#### Snippet
```java
    public interface Perms {

        int READ = 1 << 0;

        int WRITE = 1 << 1;
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java

                    String value = entry.getValue().toString().trim();
                    servers.add(key.concat("=").concat(value));
                }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java

                    String value = entry.getValue().toString().trim();
                    servers.add(key.concat("=").concat(value));
                }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java

                    String value = entry.getValue().toString().trim();
                    out.write(key.concat("=").concat(value).concat("\n"));
                }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java

                    String value = entry.getValue().toString().trim();
                    out.write(key.concat("=").concat(value).concat("\n"));
                }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java

                    String value = entry.getValue().toString().trim();
                    out.write(key.concat("=").concat(value).concat("\n"));
                }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
                // updates the dynamic file pointer
                String dynamicConfigFilePath = PathUtils.normalizeFileSystemPath(dynamicFile.getCanonicalPath());
                out.write("dynamicConfigFile=".concat(dynamicConfigFilePath).concat("\n"));
            }
        });
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
                // updates the dynamic file pointer
                String dynamicConfigFilePath = PathUtils.normalizeFileSystemPath(dynamicFile.getCanonicalPath());
                out.write("dynamicConfigFile=".concat(dynamicConfigFilePath).concat("\n"));
            }
        });
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumHierarchical.java`
#### Snippet
```java
                str = sid.toString();
            } else {
                str = str.concat(":").concat(sid.toString());
            }
            groups.put(gid, str);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumHierarchical.java`
#### Snippet
```java
                str = sid.toString();
            } else {
                str = str.concat(":").concat(sid.toString());
            }
            groups.put(gid, str);
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
        }
        LOG.info("Initiating logout for {}", principal);
        synchronized (Login.class) {
            //clear up the kerberos state. But the tokens are not cleared! As per
            //the Java kerberos login module code, only the kerberos credentials
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNIO.java`
#### Snippet
```java
        selector.select(waitTimeOut);
        Set<SelectionKey> selected;
        synchronized (this) {
            selected = selector.selectedKeys();
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
        try {
            if (!initializedLogin) {
                synchronized (this) {
                    if (login == null) {
                        LOG.debug("JAAS loginContext is: {}", loginContext);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/FileChangeWatcher.java`
#### Snippet
```java
    private synchronized void setState(State newState) {
        state = newState;
        this.notifyAll();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/FileChangeWatcher.java`
#### Snippet
```java
    synchronized void waitForState(State desiredState) throws InterruptedException {
        while (this.state != desiredState) {
            this.wait();
        }
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java
        InetSocketAddress addr;

        synchronized (this) {
            if (reconfigMode) {
                addr = nextHostInReconfigMode();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/RequestThrottler.java`
#### Snippet
```java
    synchronized void throttleSleep(int stallTime) throws InterruptedException {
        ServerMetrics.getMetrics().REQUEST_THROTTLE_WAIT_COUNT.add(1);
        this.wait(stallTime);
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/RequestThrottler.java`
#### Snippet
```java
    @SuppressFBWarnings(value = "NN_NAKED_NOTIFY", justification = "state change is in ZooKeeperServer.decInProgress() ")
    public synchronized void throttleWake() {
        this.notify();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java
    @Override
    public void shutdown() {
        synchronized (this) {
            if (killed) {
                LOG.info("already shutdown {}", localAddress);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java
            zkServer.shutdown();
        }
        synchronized (this) {
            killed = true;
            notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java
        synchronized (this) {
            killed = true;
            notifyAll();
        }
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java
    @Override
    public void join() throws InterruptedException {
        synchronized (this) {
            while (!killed) {
                wait();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java
        synchronized (this) {
            while (!killed) {
                wait();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ReferenceCountedACLCache.java`
#### Snippet
```java
        }

        synchronized (this) {
            for (Map.Entry<Long, List<ACL>> entry : deserializedMap.entrySet()) {
                Long val = entry.getKey();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ReferenceCountedACLCache.java`
#### Snippet
```java
    public void serialize(OutputArchive oa) throws IOException {
        Map<Long, List<ACL>> clonedLongKeyMap;
        synchronized (this) {
            clonedLongKeyMap = new HashMap<>(longKeyMap);
        }
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/ProviderRegistry.java`
#### Snippet
```java

    public static void initialize() {
        synchronized (ProviderRegistry.class) {
            IPAuthenticationProvider ipp = new IPAuthenticationProvider();
            authenticationProviders.put(ipp.getScheme(), ipp);
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/ProviderRegistry.java`
#### Snippet
```java

    public static void addOrUpdateProvider(String authKey) {
        synchronized (ProviderRegistry.class) {
            if (authKey.startsWith(AUTHPROVIDER_PROPERTY_PREFIX)) {
                String className = System.getProperty(authKey);
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/ProviderRegistry.java`
#### Snippet
```java
    //VisibleForTesting
    public static void reset() {
        synchronized (ProviderRegistry.class) {
            initialized = false;
            authenticationProviders.clear();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    public void submitRequestNow(Request si) {
        if (firstProcessor == null) {
            synchronized (this) {
                try {
                    // Since all requests are passed to the request
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
                    // after the setup.
                    while (state == State.INITIAL) {
                        wait(1000);
                    }
                } catch (InterruptedException e) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    public synchronized void startServing() {
        setState(State.RUNNING);
        notifyAll();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    public void enqueueRequest(Request si) {
        if (requestThrottler == null) {
            synchronized (this) {
                try {
                    // Since all requests are passed to the request
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
                    // after the setup.
                    while (state == State.INITIAL) {
                        wait(1000);
                    }
                } catch (InterruptedException e) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
        localSessionEnabled = sessionTracker.isLocalSessionsEnabled();

        notifyAll();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatcherCleaner.java`
#### Snippet
```java
            }
        }
        synchronized (this) {
            if (deadWatchers.add(watcherBit)) {
                totalDeadWatchers.incrementAndGet();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatcherCleaner.java`
#### Snippet
```java
            }

            synchronized (this) {
                // Clean the dead watchers need to go through all the current
                // watches, which is pretty heavy and may take a second if
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManager.java`
#### Snippet
```java
        Set<Watcher> watchers = new HashSet<>();
        PathParentIterator pathParentIterator = getPathParentIterator(path);
        synchronized (this) {
            for (String localPath : pathParentIterator.asIterable()) {
                Set<Watcher> thisWatchers = watchTable.get(localPath);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
    public void run() {
        ServerSocket ss;
        synchronized (this) {
            ss = this.ss;
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
    @SuppressFBWarnings("NN_NAKED_NOTIFY")
    private synchronized void wakeup() {
        notifyAll();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
                 * the following two lines is important!).
                 */
                synchronized (this) {
                    commitIsWaiting = !committedRequests.isEmpty();
                    requestsToProcess = queuedRequests.size();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
                        // Waiting for requests to process
                        while (!stopped && requestsToProcess == 0 && !commitIsWaiting) {
                            wait();
                            commitIsWaiting = !committedRequests.isEmpty();
                            requestsToProcess = queuedRequests.size();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
     */
    public void commit(long zxid) {
        synchronized (this) {
            lastCommitted = zxid;
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            zk.setZxid(ZxidUtils.makeZxid(epoch, 0));

            synchronized (this) {
                lastProposed = zk.getZxid();
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java

            while (true) {
                synchronized (this) {
                    long start = Time.currentElapsedTime();
                    long cur = start;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                    long end = start + self.tickTime / 2;
                    while (cur < end) {
                        wait(end - cur);
                        cur = Time.currentElapsedTime();
                    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
        p.request = request;

        synchronized (this) {
            p.addQuorumVerifier(self.getQuorumVerifier());

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    //commit and send some info
    public void commitAndActivate(long zxid, long designatedLeader) {
        synchronized (this) {
            lastCommitted = zxid;
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
            int notTimeout = minNotificationInterval;

            synchronized (this) {
                logicalclock.incrementAndGet();
                updateProposal(getInitId(), getInitLastLoggedZxid(), getPeerEpoch());
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java

        if (voteSet.hasAllQuorums() && checkLeader(outofelection, n.leader, n.electionEpoch)) {
            synchronized (this) {
                logicalclock.set(n.electionEpoch);
                setPeerState(n.leader, voteSet);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-recipes/zookeeper-recipes-election/src/main/java/org/apache/zookeeper/recipes/leader/LeaderElectionSupport.java`
#### Snippet
```java
        LeaderOffer newLeaderOffer = new LeaderOffer();
        byte[] hostnameBytes;
        synchronized (this) {
            newLeaderOffer.setHostName(hostName);
            hostnameBytes = hostName.getBytes();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    public String[] getQuorumPeers() {
        List<String> l = new ArrayList<>();
        synchronized (this) {
            if (leader != null) {
                for (LearnerHandler fh : leader.getLearners()) {
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `password` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/SaslClientCallbackHandler.java`
#### Snippet
```java
public class SaslClientCallbackHandler implements CallbackHandler {

    private String password = null;
    private static final Logger LOG = LoggerFactory.getLogger(SaslClientCallbackHandler.class);
    private final String entity;
```

### UnusedAssignment
Variable `isKrbTicket` initializer `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
    private Subject subject = null;
    private Thread t = null;
    private boolean isKrbTicket = false;
    private boolean isUsingTicketCache = false;

```

### UnusedAssignment
Variable `loginContextName` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java

    private LoginContext login = null;
    private String loginContextName = null;
    private String principal = null;

```

### UnusedAssignment
Variable `login` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
    private boolean isUsingTicketCache = false;

    private LoginContext login = null;
    private String loginContextName = null;
    private String principal = null;
```

### UnusedAssignment
Variable `subject` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
      MIN_TIME_BEFORE_RELOGIN_CONFIG_KEY, DEFAULT_MIN_TIME_BEFORE_RELOGIN);

    private Subject subject = null;
    private Thread t = null;
    private boolean isKrbTicket = false;
```

### UnusedAssignment
Variable `watcherExists` initializer `true` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java

    private boolean contains(String path, Watcher watcherObj, Map<String, Set<Watcher>> pathVsWatchers) {
        boolean watcherExists = true;
        if (pathVsWatchers == null || pathVsWatchers.size() == 0) {
            watcherExists = false;
```

### UnusedAssignment
Variable `data` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/DelQuotaCommand.java`
#### Snippet
```java
            return true;
        }
        byte[] data = null;
        try {
            data = zk.getData(quotaPath, false, new Stat());
```

### UnusedAssignment
Variable `children` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/SetQuotaCommand.java`
#### Snippet
```java
            sb.append(splits[i]);
            quotaPath = sb.toString();
            List<String> children = null;
            try {
                children = zk.getChildren(quotaPath, false);
```

### UnusedAssignment
Variable `packet` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
        WatchRegistration watchRegistration,
        WatchDeregistration watchDeregistration) {
        Packet packet = null;

        // Note that we do not generate the Xid for the packet yet. It is
```

### UnusedAssignment
Variable `materializedWatchers` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
        // clients will be notified with 'Data/Child WatchRemoved' event type.
        if (p.watchDeregistration != null) {
            Map<EventType, Set<Watcher>> materializedWatchers = null;
            try {
                materializedWatchers = p.watchDeregistration.unregister(err);
```

### UnusedAssignment
Variable `timeoutTimerTask` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Shell.java`
#### Snippet
```java
        ProcessBuilder builder = new ProcessBuilder(getExecString());
        Timer timeOutTimer = null;
        ShellTimeoutTimerTask timeoutTimerTask = null;
        timedOut = new AtomicBoolean(false);
        completed = new AtomicBoolean(false);
```

### UnusedAssignment
Variable `lastChange` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java

    private ChangeRecord getRecordForPath(String path) throws KeeperException.NoNodeException {
        ChangeRecord lastChange = null;
        synchronized (zks.outstandingChanges) {
            lastChange = zks.outstandingChangesForPath.get(path);
```

### UnusedAssignment
The value `false` assigned to `useClientReload` is never used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java
            } catch (IOException e) {
                LOG.error("unable to set up client certificate reload filewatcher", e);
                useClientReload = false;
            }
        }
```

### UnusedAssignment
Variable `advancedFlowControlEnabled` initializer `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java

    public static final String NETTY_ADVANCED_FLOW_CONTROL = "zookeeper.netty.advancedFlowControl.enabled";
    private boolean advancedFlowControlEnabled = false;

    private static final AttributeKey<NettyServerCnxn> CONNECTION_ATTRIBUTE = AttributeKey.valueOf("NettyServerCnxn");
```

### UnusedAssignment
Variable `childLabels` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java

      void populateChildren(String path, DataTree dataTree, TreeInfo treeInfo, int currentDepth) throws Exception {
        List<String> childLabels = null;
        childLabels = dataTree.getChildren(path, null, null);

```

### UnusedAssignment
Variable `num` initializer `-1` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java
        File dataDir = validateAndGetFile(args[0]);
        File snapDir = dataDir;
        int num = -1;
        String countOption = "";
        if (args.length == 3) {
```

### UnusedAssignment
Variable `countOption` initializer `""` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java
        File snapDir = dataDir;
        int num = -1;
        String countOption = "";
        if (args.length == 3) {
            countOption = args[1];
```

### UnusedAssignment
Variable `stat` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/FinalRequestProcessor.java`
#### Snippet
```java
            } else {
                int opCode = request.type;
                Stat stat = null;
                // Serialized read and get children responses could be cached by the connection
                // object. Cache entries are identified by their path and last modified zxid,
```

### UnusedAssignment
Variable `txn` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
        hdr.deserialize(ia, "hdr");
        bais.mark(bais.available());
        Record txn = null;
        switch (hdr.getType()) {
        case OpCode.createSession:
```

### UnusedAssignment
Variable `closeSessionTxnEnabled` initializer `true` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    // this feature is confirmed to be stable
    public static final String CLOSE_SESSION_TXN_ENABLED = "zookeeper.closeSessionTxn.enabled";
    private static boolean closeSessionTxnEnabled = true;
    private volatile CountDownLatch restoreLatch;

```

### UnusedAssignment
Variable `n` initializer `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/ReadAheadEndpoint.java`
#### Snippet
```java
    private synchronized void readAhead() throws IOException {
        if (leftToRead > 0) {
            int n = 0;
            do {
                n = endPoint.fill(start);
```

### UnusedAssignment
Variable `connector` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/JettyAdminServer.java`
#### Snippet
```java

        server = new Server();
        ServerConnector connector = null;

        if (!portUnification && !forceHttps) {
```

### UnusedAssignment
Variable `keyStore` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/JettyAdminServer.java`
#### Snippet
```java
                        x509Util.getSslTruststorePasswdProperty(),
                        x509Util.getSslTruststorePasswdPathProperty());
                KeyStore keyStore = null, trustStore = null;

                try {
```

### UnusedAssignment
Variable `trustStore` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/JettyAdminServer.java`
#### Snippet
```java
                        x509Util.getSslTruststorePasswdProperty(),
                        x509Util.getSslTruststorePasswdPathProperty());
                KeyStore keyStore = null, trustStore = null;

                try {
```

### UnusedAssignment
Variable `children` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            return;
        }
        String[] children = null;
        int len = 0;
        synchronized (node) {
```

### UnusedAssignment
Variable `len` initializer `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        }
        String[] children = null;
        int len = 0;
        synchronized (node) {
            Set<String> childs = node.getChildren();
```

### UnusedAssignment
Variable `children` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            return;
        }
        String[] children = null;
        DataNode nodeCopy;
        synchronized (node) {
```

### UnusedAssignment
Variable `lastdata` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            throw new KeeperException.NoNodeException();
        }
        byte[] lastdata = null;
        synchronized (n) {
            lastdata = n.data;
```

### UnusedAssignment
Variable `record` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                for (Txn subtxn : txns) {
                    ByteBuffer bb = ByteBuffer.wrap(subtxn.getData());
                    Record record = null;
                    switch (subtxn.getType()) {
                    case OpCode.create:
```

### UnusedAssignment
Variable `cloned` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            return new HashSet<>();
        }
        Set<String> cloned = null;
        synchronized (retv) {
            cloned = (HashSet<String>) retv.clone();
```

### UnusedAssignment
Variable `children` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
    private void traverseNode(String path) {
        DataNode node = getNode(path);
        String[] children = null;
        synchronized (node) {
            Set<String> childs = node.getChildren();
```

### UnusedAssignment
Variable `bytes` initializer `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        if (lastPrefix != null) {
            // ok we have some match and need to update
            long bytes = 0;
            synchronized (node) {
                bytes = (node.data == null ? 0 : -(node.data.length));
```

### UnusedAssignment
Variable `data` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
    public byte[] getData(String path, Stat stat, Watcher watcher) throws KeeperException.NoNodeException {
        DataNode n = nodes.get(path);
        byte[] data = null;
        if (n == null) {
            throw new KeeperException.NoNodeException();
```

### UnusedAssignment
Variable `b` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
                while (running && !shutdown && sock != null) {

                    ByteBuffer b = null;
                    try {
                        BlockingQueue<ByteBuffer> bq = queueSendMap.get(sid);
```

### UnusedAssignment
Variable `sid` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java

    private void handleConnection(Socket sock, DataInputStream din) throws IOException {
        Long sid = null, protocolVersion = null;
        MultipleAddresses electionAddr = null;

```

### UnusedAssignment
Variable `protocolVersion` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java

    private void handleConnection(Socket sock, DataInputStream din) throws IOException {
        Long sid = null, protocolVersion = null;
        MultipleAddresses electionAddr = null;

```

### UnusedAssignment
Variable `dout` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java

    private boolean startConnection(Socket sock, Long sid) throws IOException {
        DataOutputStream dout = null;
        DataInputStream din = null;
        LOG.debug("startConnection (myId:{} --> sid:{})", self.getMyId(), sid);
```

### UnusedAssignment
Variable `din` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
    private boolean startConnection(Socket sock, Long sid) throws IOException {
        DataOutputStream dout = null;
        DataInputStream din = null;
        LOG.debug("startConnection (myId:{} --> sid:{})", self.getMyId(), sid);
        try {
```

### UnusedAssignment
Variable `din` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
     */
    public void receiveConnection(final Socket sock) {
        DataInputStream din = null;
        try {
            din = new DataInputStream(new BufferedInputStream(sock.getInputStream()));
```

### UnusedAssignment
Variable `requestsToProcess` initializer `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
             * that will lead to a starvation of non-local committed requests.
             */
            int requestsToProcess = 0;
            boolean commitIsWaiting = false;
            do {
```

### UnusedAssignment
Variable `commitIsWaiting` initializer `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
             */
            int requestsToProcess = 0;
            boolean commitIsWaiting = false;
            do {
                /*
```

### UnusedAssignment
Variable `shutdownMessage` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            boolean tickSkip = true;
            // If not null then shutdown this leader
            String shutdownMessage = null;

            while (true) {
```

### UnusedAssignment
Variable `ss` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java

            long peerLastZxid;
            StateSummary ss = null;
            long zxid = qp.getZxid();
            long newEpoch = learnerMaster.getEpochToPropose(this.getSid(), lastAcceptedEpoch);
```

### UnusedAssignment
Variable `authzFlag` initializer `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/SaslQuorumServerCallbackHandler.java`
#### Snippet
```java
        String authorizationID = ac.getAuthorizationID();

        boolean authzFlag = false;
        // 1. Matches authenticationID and authorizationID
        authzFlag = authenticationID.equals(authorizationID);
```

### UnusedAssignment
Variable `len` initializer `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/command/WatchCommand.java`
#### Snippet
```java
public class WatchCommand extends AbstractFourLetterCommand {

    int len = 0;
    public WatchCommand(PrintWriter pw, ServerCnxn serverCnxn, int len) {
        super(pw, serverCnxn);
```

### UnusedAssignment
Variable `trace` initializer `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/command/SetTraceMaskCommand.java`
#### Snippet
```java
public class SetTraceMaskCommand extends AbstractFourLetterCommand {

    long trace = 0;
    public SetTraceMaskCommand(PrintWriter pw, ServerCnxn serverCnxn, long trace) {
        super(pw, serverCnxn);
```

### UnusedAssignment
Variable `wrThread` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
        WorkerReceiver wr;
        Thread wsThread = null;
        Thread wrThread = null;

        /**
```

### UnusedAssignment
Variable `ackstate` initializer `QuorumPeer.ServerState.LOOKING` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java

                            // State of peer that sent this message
                            QuorumPeer.ServerState ackstate = QuorumPeer.ServerState.LOOKING;
                            switch (rstate) {
                            case 0:
```

### UnusedAssignment
Variable `wsThread` initializer `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
        WorkerSender ws;
        WorkerReceiver wr;
        Thread wsThread = null;
        Thread wrThread = null;

```

### UnusedAssignment
Variable `configData` initializer `dummyData` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
        /*
         * Used to send a QuorumVerifier (configuration info)
         */ byte[] configData = dummyData;

        /*
```

### UnusedAssignment
Variable `isValid` initializer `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/SnapStream.java`
#### Snippet
```java
        }

        boolean isValid = false;
        switch (getStreamMode(file.getName())) {
        case GZIP:
```

### UnusedAssignment
Variable `leaderChange` initializer `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

            boolean roleChange = updateLearnerType(qv);
            boolean leaderChange = false;
            if (suggestedLeaderId != null) {
                // zxid should be non-null too
```

## RuleId[ruleID=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`e.toString().indexOf(UNKNOWN_SERVER_ERROR_TEXT) > -1` can be replaced with 'e.toString().contains(UNKNOWN_SERVER_ERROR_TEXT)'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/SaslQuorumAuthLearner.java`
#### Snippet
```java
                    // TODO: introspect about e: look for GSS information.
                    final String UNKNOWN_SERVER_ERROR_TEXT = "(Mechanism level: Server not found in Kerberos database (7) - UNKNOWN_SERVER)";
                    if (e.toString().indexOf(UNKNOWN_SERVER_ERROR_TEXT) > -1) {
                        error += " This may be caused by Java's being unable to resolve the Zookeeper Quorum Member's"
                                 + " hostname correctly. You may want to try to adding"
```

## RuleId[ruleID=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxn.java`
#### Snippet
```java

        synchronized (outgoingBuffers) {
            for (ByteBuffer buffer : buffers) {
                outgoingBuffers.add(buffer);
            }
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java

    public enum DigestOpCode {
        NOOP, ADD, REMOVE, UPDATE;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumVerifier.java`
#### Snippet
```java
    default String getOraclePath() {
        return null;
    };

    String toString();
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/embedded/ExitHandler.java`
#### Snippet
```java
     * Only log the error. This option is meant to be used only in tests.
     */
    LOG_ONLY;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/CGenerator.java`
#### Snippet
```java

        try (FileWriter c = new FileWriter(new File(outputDirectory, mName + ".c"));
             FileWriter h = new FileWriter(new File(outputDirectory, mName + ".h"));
        ) {
            h.write("/**\n");
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/CppGenerator.java`
#### Snippet
```java

        try (FileWriter cc = new FileWriter(new File(outputDirectory, mName + ".cc"));
             FileWriter hh = new FileWriter(new File(outputDirectory, mName + ".hh"));
        ) {
            hh.write("/**\n");
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
        }

        try (FileWriter cs = new FileWriter(new File(outputDirectory, getName() + ".cs"));) {
            cs.write("// File generated by hadoop record compiler. Do not edit.\n");
            cs.write("/**\n");
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary empty string argument
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
          }
        }
        System.out.println("");
      }
    }
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
                quorumListenOnAllIPs = parseBoolean(key, value);
            } else if (key.equals("peerType")) {
                if (value.toLowerCase().equals("observer")) {
                    peerType = LearnerType.OBSERVER;
                } else if (value.toLowerCase().equals("participant")) {
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
                if (value.toLowerCase().equals("observer")) {
                    peerType = LearnerType.OBSERVER;
                } else if (value.toLowerCase().equals("participant")) {
                    peerType = LearnerType.PARTICIPANT;
                } else {
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java

    public String genCsharpReadWrapper(String fname, int tag, boolean decl) {
        StringBuilder ret = new StringBuilder("");
        if (decl) {
            ret.append("    System.Collections.SortedDictionary<string,string> " + capitalize(fname) + ";\n");
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java

    public String genJavaReadWrapper(String fname, String tag, boolean decl) {
        StringBuilder ret = new StringBuilder("");
        if (decl) {
            ret.append("    java.util.TreeMap " + fname + ";\n");
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java

    public String genJavaReadWrapper(String fname, String tag, boolean decl) {
        StringBuilder ret = new StringBuilder("");
        if (decl) {
            ret.append("      java.util.List " + fname + ";\n");
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java

    public String genJavaReadWrapper(String fname, String tag, boolean decl) {
        StringBuilder ret = new StringBuilder("");
        if (decl) {
            ret.append("    " + getJavaFQName() + " " + fname + ";\n");
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java

    public String genCsharpReadWrapper(String fname, String tag, boolean decl) {
        StringBuilder ret = new StringBuilder("");
        if (decl) {
            ret.append("    " + getCsharpFQName(mFQName) + " " + fname + ";\n");
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `start()` overrides synchronized method
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java

    @Override
    public void start() {
        int numCores = Runtime.getRuntime().availableProcessors();
        int numWorkerThreads = Integer.getInteger(ZOOKEEPER_COMMIT_PROC_NUM_WORKER_THREADS, numCores);
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `start()` overrides synchronized method
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/embedded/ZooKeeperServerEmbeddedImpl.java`
#### Snippet
```java
                    return new QuorumPeer() {
                        @Override
                        public void start() {
                            super.start();
                            boundClientPort = getClientPort();
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java

        @Override
        public void mark(int readLimit) {
            throw new UnsupportedOperationException("mark");
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java

        @Override
        public void reset() {
            throw new UnsupportedOperationException("reset");
        }
```

## RuleId[ruleID=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `path` declared in one 'switch' branch and used in another
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
            zks.sessionTracker.checkSession(request.sessionId, request.getOwner());
            DeleteRequest deleteRequest = (DeleteRequest) record;
            String path = deleteRequest.getPath();
            String parentPath = getParentPathAndValidate(path);
            ChangeRecord parentRecord = getRecordForPath(parentPath);
```

### SwitchStatementWithConfusingDeclaration
Local variable `parentPath` declared in one 'switch' branch and used in another
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
            DeleteRequest deleteRequest = (DeleteRequest) record;
            String path = deleteRequest.getPath();
            String parentPath = getParentPathAndValidate(path);
            ChangeRecord parentRecord = getRecordForPath(parentPath);
            zks.checkACL(request.cnxn, parentRecord.acl, ZooDefs.Perms.DELETE, request.authInfo, path, null);
```

### SwitchStatementWithConfusingDeclaration
Local variable `parentRecord` declared in one 'switch' branch and used in another
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
            String path = deleteRequest.getPath();
            String parentPath = getParentPathAndValidate(path);
            ChangeRecord parentRecord = getRecordForPath(parentPath);
            zks.checkACL(request.cnxn, parentRecord.acl, ZooDefs.Perms.DELETE, request.authInfo, path, null);
            ChangeRecord nodeRecord = getRecordForPath(path);
```

### SwitchStatementWithConfusingDeclaration
Local variable `nodeRecord` declared in one 'switch' branch and used in another
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
            ChangeRecord parentRecord = getRecordForPath(parentPath);
            zks.checkACL(request.cnxn, parentRecord.acl, ZooDefs.Perms.DELETE, request.authInfo, path, null);
            ChangeRecord nodeRecord = getRecordForPath(path);
            checkAndIncVersion(nodeRecord.stat.getVersion(), deleteRequest.getVersion(), path);
            if (nodeRecord.childCount > 0) {
```

### SwitchStatementWithConfusingDeclaration
Local variable `newVersion` declared in one 'switch' branch and used in another
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
            zks.checkACL(request.cnxn, nodeRecord.acl, ZooDefs.Perms.WRITE, request.authInfo, path, null);
            zks.checkQuota(path, nodeRecord.data, setDataRequest.getData(), OpCode.setData);
            int newVersion = checkAndIncVersion(nodeRecord.stat.getVersion(), setDataRequest.getVersion(), path);
            request.setTxn(new SetDataTxn(path, setDataRequest.getData(), newVersion));
            nodeRecord = nodeRecord.duplicate(request.getHdr().getZxid());
```

### SwitchStatementWithConfusingDeclaration
Local variable `stat` declared in one 'switch' branch and used in another
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                CreateTxn create2Txn = (CreateTxn) txn;
                rc.path = create2Txn.getPath();
                Stat stat = new Stat();
                createNode(
                    create2Txn.getPath(),
```

### SwitchStatementWithConfusingDeclaration
Local variable `request` declared in one 'switch' branch and used in another
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
            txn = logEntry.getTxn();
            digest = logEntry.getDigest();
            Request request = new Request(hdr.getClientId(), hdr.getCxid(), hdr.getType(), hdr, txn, 0);
            request.logLatency(ServerMetrics.getMetrics().COMMIT_PROPAGATION_LATENCY);
            request.setTxnDigest(digest);
```

### SwitchStatementWithConfusingDeclaration
Local variable `obs` declared in one 'switch' branch and used in another
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
            request.logLatency(ServerMetrics.getMetrics().COMMIT_PROPAGATION_LATENCY);
            request.setTxnDigest(digest);
            ObserverZooKeeperServer obs = (ObserverZooKeeperServer) zk;
            obs.commitRequest(request);
            break;
```

### SwitchStatementWithConfusingDeclaration
Local variable `pif` declared in one 'switch' branch and used in another
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                switch (qp.getType()) {
                case Leader.PROPOSAL:
                    PacketInFlight pif = new PacketInFlight();
                    logEntry = SerializeUtils.deserializeTxn(qp.getData());
                    pif.hdr = logEntry.getHeader();
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `clientConfig` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNetty.java`
#### Snippet
```java
            if (sslContext == null || sslEngine == null) {
                try (X509Util x509Util = new ClientX509Util()) {
                    sslContext = x509Util.createSSLContext(clientConfig);
                    sslEngine = sslContext.createSSLEngine(host, port);
                    sslEngine.setUseClientMode(true);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `callbackHandler` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
                                     + getLoginContextMessage());
        }
        LoginContext loginContext = new LoginContext(loginContextName, callbackHandler);
        loginContext.login();
        LOG.info("{} successfully logged in.", loginContextName);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `state` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
         */
        synchronized ZooKeeper.States getZkState() {
            return state;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `xid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
        // must not be used for requests -- see SendThread.readResponse.
        // Skip from MAX to 1.
        if (xid == Integer.MAX_VALUE) {
            xid = 1;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `xid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
        // Skip from MAX to 1.
        if (xid == Integer.MAX_VALUE) {
            xid = 1;
        }
        return xid++;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `xid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            xid = 1;
        }
        return xid++;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `state` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java

        synchronized void changeZkState(ZooKeeper.States newState) throws IOException {
            if (!state.isAlive() && newState == States.CONNECTING) {
                throw new IOException(
                        "Connection has already been closed and reconnection is not allowed");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `state` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            }
            // It's safer to place state modification at the end.
            state = newState;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `state` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
        // later packet will be notified.
        synchronized (outgoingQueue) {
            if (!state.isAlive() || closing) {
                conLossPacket(packet);
            } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `rng` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/BlueThrottle.java`
#### Snippet
```java
        }

        return !(rng.nextDouble() < drop);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.dataTree` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
        }
        try {
            if (this.dataTree.getNode(ZooDefs.CONFIG_NODE) == null) {
                // should only happen during upgrade
                LOG.warn("configuration znode missing (should only happen during upgrade), creating the node");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.dataTree` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
                // should only happen during upgrade
                LOG.warn("configuration znode missing (should only happen during upgrade), creating the node");
                this.dataTree.addConfigNode();
            }
            this.dataTree.setData(
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.dataTree` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
                this.dataTree.addConfigNode();
            }
            this.dataTree.setData(
                ZooDefs.CONFIG_NODE,
                qv.toString().getBytes(UTF_8),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logLock` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
    public synchronized Collection<Proposal> getCommittedLog() {
        final Collection<Proposal> result;
        ReadLock rl = logLock.readLock();
        // make a copy if this thread is not already holding a lock
        if (logLock.getReadHoldCount() > 0) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logLock` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
        ReadLock rl = logLock.readLock();
        // make a copy if this thread is not already holding a lock
        if (logLock.getReadHoldCount() > 0) {
            result = this.committedLog;
        } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.committedLog` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
        // make a copy if this thread is not already holding a lock
        if (logLock.getReadHoldCount() > 0) {
            result = this.committedLog;
        } else {
            rl.lock();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.committedLog` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
            rl.lock();
            try {
                result = new ArrayList<>(this.committedLog);
            } finally {
                rl.unlock();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
    private long getCurrentTreeDigest() {
        long digest;
        synchronized (zks.outstandingChanges) {
            if (zks.outstandingChanges.isEmpty()) {
                digest = zks.getZKDatabase().getDataTree().getTreeDigest();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
        long digest;
        synchronized (zks.outstandingChanges) {
            if (zks.outstandingChanges.isEmpty()) {
                digest = zks.getZKDatabase().getDataTree().getTreeDigest();
                LOG.debug("Digest got from data tree is: {}", digest);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
        synchronized (zks.outstandingChanges) {
            if (zks.outstandingChanges.isEmpty()) {
                digest = zks.getZKDatabase().getDataTree().getTreeDigest();
                LOG.debug("Digest got from data tree is: {}", digest);
            } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                LOG.debug("Digest got from data tree is: {}", digest);
            } else {
                digest = zks.outstandingChanges.peekLast().precalculatedDigest.treeDigest;
                LOG.debug("Digest got from outstandingChanges is: {}", digest);
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java

    protected void addChangeRecord(ChangeRecord c) {
        synchronized (zks.outstandingChanges) {
            zks.outstandingChanges.add(c);
            zks.outstandingChangesForPath.put(c.path, c);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
    protected void addChangeRecord(ChangeRecord c) {
        synchronized (zks.outstandingChanges) {
            zks.outstandingChanges.add(c);
            zks.outstandingChangesForPath.put(c.path, c);
            ServerMetrics.getMetrics().OUTSTANDING_CHANGES_QUEUED.add(1);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
        synchronized (zks.outstandingChanges) {
            zks.outstandingChanges.add(c);
            zks.outstandingChangesForPath.put(c.path, c);
            ServerMetrics.getMetrics().OUTSTANDING_CHANGES_QUEUED.add(1);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java

    private ChangeRecord getOutstandingChange(String path) {
        synchronized (zks.outstandingChanges) {
            return zks.outstandingChangesForPath.get(path);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
    private ChangeRecord getOutstandingChange(String path) {
        synchronized (zks.outstandingChanges) {
            return zks.outstandingChangesForPath.get(path);
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
            //zks.sessionTracker.checkSession(request.sessionId, request.getOwner());
            long startTime = Time.currentElapsedTime();
            synchronized (zks.outstandingChanges) {
                // need to move getEphemerals into zks.outstandingChanges
                // synchronized block, otherwise there will be a race
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                // condition with the on flying deleteNode txn, and we'll
                // delete the node again here, which is not correct
                Set<String> es = zks.getZKDatabase().getEphemerals(request.sessionId);
                for (ChangeRecord c : zks.outstandingChanges) {
                    if (c.stat == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                // delete the node again here, which is not correct
                Set<String> es = zks.getZKDatabase().getEphemerals(request.sessionId);
                for (ChangeRecord c : zks.outstandingChanges) {
                    if (c.stat == null) {
                        // Doing a delete
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                    request.setTxn(new CloseSessionTxn(new ArrayList<String>(es)));
                }
                zks.sessionTracker.setSessionClosing(request.sessionId);
            }
            ServerMetrics.getMetrics().CLOSE_SESSION_PREP_TIME.add(Time.currentElapsedTime() - startTime);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
     */
    void rollbackPendingChanges(long zxid, Map<String, ChangeRecord> pendingChangeRecords) {
        synchronized (zks.outstandingChanges) {
            // Grab a list iterator starting at the END of the list so we can iterate in reverse
            Iterator<ChangeRecord> iter = zks.outstandingChanges.descendingIterator();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
        synchronized (zks.outstandingChanges) {
            // Grab a list iterator starting at the END of the list so we can iterate in reverse
            Iterator<ChangeRecord> iter = zks.outstandingChanges.descendingIterator();
            while (iter.hasNext()) {
                ChangeRecord c = iter.next();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                    // Remove all outstanding changes for paths of this multi.
                    // Previous records will be added back later.
                    zks.outstandingChangesForPath.remove(c.path);
                } else {
                    break;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java

            // we don't need to roll back any records because there is nothing left.
            if (zks.outstandingChanges.isEmpty()) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
            }

            long firstZxid = zks.outstandingChanges.peek().zxid;

            for (ChangeRecord c : pendingChangeRecords.values()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java

                // add previously existing records back.
                zks.outstandingChangesForPath.put(c.path, c);
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
    private ChangeRecord getRecordForPath(String path) throws KeeperException.NoNodeException {
        ChangeRecord lastChange = null;
        synchronized (zks.outstandingChanges) {
            lastChange = zks.outstandingChangesForPath.get(path);
            if (lastChange == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
        ChangeRecord lastChange = null;
        synchronized (zks.outstandingChanges) {
            lastChange = zks.outstandingChangesForPath.get(path);
            if (lastChange == null) {
                DataNode n = zks.getZKDatabase().getNode(path);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
            lastChange = zks.outstandingChangesForPath.get(path);
            if (lastChange == null) {
                DataNode n = zks.getZKDatabase().getNode(path);
                if (n != null) {
                    Set<String> children;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zks` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                        children = n.getChildren();
                    }
                    lastChange = new ChangeRecord(-1, path, n.stat, children.size(), zks.getZKDatabase().aclForNode(n));

                    if (digestEnabled) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `data` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
    public synchronized void deserialize(InputArchive archive, String tag) throws IOException {
        archive.startRecord("node");
        data = archive.readBuffer("data");
        acl = archive.readLong("acl");
        stat = new StatPersisted();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `acl` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        archive.startRecord("node");
        data = archive.readBuffer("data");
        acl = archive.readLong("acl");
        stat = new StatPersisted();
        stat.deserialize(archive, "statpersisted");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        data = archive.readBuffer("data");
        acl = archive.readLong("acl");
        stat = new StatPersisted();
        stat.deserialize(archive, "statpersisted");
        archive.endRecord("node");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        acl = archive.readLong("acl");
        stat = new StatPersisted();
        stat.deserialize(archive, "statpersisted");
        archive.endRecord("node");
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `data` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
    public synchronized void serialize(OutputArchive archive, String tag) throws IOException {
        archive.startRecord(this, "node");
        archive.writeBuffer(data, "data");
        archive.writeLong(acl, "acl");
        stat.serialize(archive, "statpersisted");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `acl` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        archive.startRecord(this, "node");
        archive.writeBuffer(data, "data");
        archive.writeLong(acl, "acl");
        stat.serialize(archive, "statpersisted");
        archive.endRecord(this, "node");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        archive.writeBuffer(data, "data");
        archive.writeLong(acl, "acl");
        stat.serialize(archive, "statpersisted");
        archive.endRecord(this, "node");
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java

    public synchronized void copyStat(Stat to) {
        to.setAversion(stat.getAversion());
        to.setCtime(stat.getCtime());
        to.setCzxid(stat.getCzxid());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
    public synchronized void copyStat(Stat to) {
        to.setAversion(stat.getAversion());
        to.setCtime(stat.getCtime());
        to.setCzxid(stat.getCzxid());
        to.setMtime(stat.getMtime());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        to.setAversion(stat.getAversion());
        to.setCtime(stat.getCtime());
        to.setCzxid(stat.getCzxid());
        to.setMtime(stat.getMtime());
        to.setMzxid(stat.getMzxid());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        to.setCtime(stat.getCtime());
        to.setCzxid(stat.getCzxid());
        to.setMtime(stat.getMtime());
        to.setMzxid(stat.getMzxid());
        to.setPzxid(stat.getPzxid());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        to.setCzxid(stat.getCzxid());
        to.setMtime(stat.getMtime());
        to.setMzxid(stat.getMzxid());
        to.setPzxid(stat.getPzxid());
        to.setVersion(stat.getVersion());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        to.setMtime(stat.getMtime());
        to.setMzxid(stat.getMzxid());
        to.setPzxid(stat.getPzxid());
        to.setVersion(stat.getVersion());
        to.setEphemeralOwner(getClientEphemeralOwner(stat));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        to.setMzxid(stat.getMzxid());
        to.setPzxid(stat.getPzxid());
        to.setVersion(stat.getVersion());
        to.setEphemeralOwner(getClientEphemeralOwner(stat));
        to.setDataLength(data == null ? 0 : data.length);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        to.setPzxid(stat.getPzxid());
        to.setVersion(stat.getVersion());
        to.setEphemeralOwner(getClientEphemeralOwner(stat));
        to.setDataLength(data == null ? 0 : data.length);
        int numChildren = 0;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `data` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        to.setVersion(stat.getVersion());
        to.setEphemeralOwner(getClientEphemeralOwner(stat));
        to.setDataLength(data == null ? 0 : data.length);
        int numChildren = 0;
        if (this.children != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `data` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        to.setVersion(stat.getVersion());
        to.setEphemeralOwner(getClientEphemeralOwner(stat));
        to.setDataLength(data == null ? 0 : data.length);
        int numChildren = 0;
        if (this.children != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stat` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
        // to the count of the changes (v3 semantics)
        // for every create there is a delete except for the children still present
        to.setCversion(stat.getCversion() * 2 - numChildren);
        to.setNumChildren(numChildren);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `data` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java

    public synchronized byte[] getData() {
        return data;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `aclIndex` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ReferenceCountedACLCache.java`
#### Snippet
```java
                Long val = entry.getKey();
                List<ACL> aclList = entry.getValue();
                if (aclIndex < val) {
                    aclIndex = val;
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `aclIndex` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ReferenceCountedACLCache.java`
#### Snippet
```java
                List<ACL> aclList = entry.getValue();
                if (aclIndex < val) {
                    aclIndex = val;
                }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `maxLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized long getMaxLatency() {
        return maxLatency;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `disconnectReason` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized void resetStats() {
        disconnectReason = DisconnectReason.RESET_COMMAND;
        packetsReceived.set(0);
        packetsSent.set(0);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `minLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        packetsReceived.set(0);
        packetsSent.set(0);
        minLatency = Long.MAX_VALUE;
        maxLatency = 0;
        lastOp = "NA";
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `maxLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        packetsSent.set(0);
        minLatency = Long.MAX_VALUE;
        maxLatency = 0;
        lastOp = "NA";
        lastCxid = -1;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastOp` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        minLatency = Long.MAX_VALUE;
        maxLatency = 0;
        lastOp = "NA";
        lastCxid = -1;
        lastZxid = -1;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastCxid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        maxLatency = 0;
        lastOp = "NA";
        lastCxid = -1;
        lastZxid = -1;
        lastResponseTime = 0;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastZxid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        lastOp = "NA";
        lastCxid = -1;
        lastZxid = -1;
        lastResponseTime = 0;
        lastLatency = 0;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastResponseTime` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        lastCxid = -1;
        lastZxid = -1;
        lastResponseTime = 0;
        lastLatency = 0;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        lastZxid = -1;
        lastResponseTime = 0;
        lastLatency = 0;

        count = 0;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `count` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        lastLatency = 0;

        count = 0;
        totalLatency = 0;
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `totalLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

        count = 0;
        totalLatency = 0;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `count` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized long getAvgLatency() {
        return count == 0 ? 0 : totalLatency / count;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `totalLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized long getAvgLatency() {
        return count == 0 ? 0 : totalLatency / count;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `count` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized long getAvgLatency() {
        return count == 0 ? 0 : totalLatency / count;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `minLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized long getMinLatency() {
        return minLatency == Long.MAX_VALUE ? 0 : minLatency;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `minLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized long getMinLatency() {
        return minLatency == Long.MAX_VALUE ? 0 : minLatency;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastOp` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized String getLastOperation() {
        return lastOp;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized long getLastLatency() {
        return lastLatency;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastResponseTime` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized long getLastResponseTime() {
        return lastResponseTime;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastCxid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized long getLastCxid() {
        return lastCxid;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastZxid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

    public synchronized long getLastZxid() {
        return lastZxid;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastCxid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        // in the clients last real operation
        if (cxid >= 0) {
            lastCxid = cxid;
        }
        lastZxid = zxid;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastZxid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
            lastCxid = cxid;
        }
        lastZxid = zxid;
        lastOp = op;
        lastResponseTime = end;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastOp` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        }
        lastZxid = zxid;
        lastOp = op;
        lastResponseTime = end;
        long elapsed = end - start;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastResponseTime` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        lastZxid = zxid;
        lastOp = op;
        lastResponseTime = end;
        long elapsed = end - start;
        lastLatency = elapsed;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        lastResponseTime = end;
        long elapsed = end - start;
        lastLatency = elapsed;
        if (elapsed < minLatency) {
            minLatency = elapsed;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `minLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        long elapsed = end - start;
        lastLatency = elapsed;
        if (elapsed < minLatency) {
            minLatency = elapsed;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `minLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        lastLatency = elapsed;
        if (elapsed < minLatency) {
            minLatency = elapsed;
        }
        if (elapsed > maxLatency) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `maxLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
            minLatency = elapsed;
        }
        if (elapsed > maxLatency) {
            maxLatency = elapsed;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `maxLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        }
        if (elapsed > maxLatency) {
            maxLatency = elapsed;
        }
        count++;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `count` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
            maxLatency = elapsed;
        }
        count++;
        totalLatency += elapsed;
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `totalLatency` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
        }
        count++;
        totalLatency += elapsed;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sessionTracker` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
        // set running to false and they will detect it during the poll
        // interval.
        if (sessionTracker != null) {
            sessionTracker.shutdown();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sessionTracker` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
        // interval.
        if (sessionTracker != null) {
            sessionTracker.shutdown();
        }
        if (firstProcessor != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `firstProcessor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
            sessionTracker.shutdown();
        }
        if (firstProcessor != null) {
            firstProcessor.shutdown();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `firstProcessor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
        }
        if (firstProcessor != null) {
            firstProcessor.shutdown();
        }
        if (jvmPauseMonitor != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `jvmPauseMonitor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
            firstProcessor.shutdown();
        }
        if (jvmPauseMonitor != null) {
            jvmPauseMonitor.serviceStop();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `jvmPauseMonitor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
        }
        if (jvmPauseMonitor != null) {
            jvmPauseMonitor.serviceStop();
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `state` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
                    // processor chain. The state will be updated to RUNNING
                    // after the setup.
                    while (state == State.INITIAL) {
                        wait(1000);
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `firstProcessor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
                    LOG.warn("Unexpected interruption", e);
                }
                if (firstProcessor == null || state != State.RUNNING) {
                    throw new RuntimeException("Not started");
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `state` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
                    LOG.warn("Unexpected interruption", e);
                }
                if (firstProcessor == null || state != State.RUNNING) {
                    throw new RuntimeException("Not started");
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `state` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
                    // processor chain. The state will be updated to RUNNING
                    // after the setup.
                    while (state == State.INITIAL) {
                        wait(1000);
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pendingSyncs` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FollowerZooKeeperServer.java`
#### Snippet
```java

    public synchronized void sync() {
        if (pendingSyncs.size() == 0) {
            LOG.warn("Not expecting a sync.");
            return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pendingSyncs` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FollowerZooKeeperServer.java`
#### Snippet
```java
        }

        Request r = pendingSyncs.remove();
        if (r instanceof LearnerSyncRequest) {
            LearnerSyncRequest lsr = (LearnerSyncRequest) r;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `commitProcessor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FollowerZooKeeperServer.java`
#### Snippet
```java
            lsr.fh.queuePacket(new QuorumPacket(Leader.SYNC, 0, null, null));
        }
        commitProcessor.commit(r);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `prepRequestProcessor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LeaderZooKeeperServer.java`
#### Snippet
```java
        containerManager = new ContainerManager(
            getZKDatabase(),
            prepRequestProcessor,
            Integer.getInteger("znode.container.checkIntervalMs", (int) TimeUnit.MINUTES.toMillis(1)),
            Integer.getInteger("znode.container.maxPerMinute", 10000),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `upgradeableSessionTracker` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java
        // session, and make the session creation request.  This is to
        // avoid another thread upgrading the session in parallel.
        synchronized (upgradeableSessionTracker) {
            if (upgradeableSessionTracker.isLocalSession(sessionId)) {
                int timeout = upgradeableSessionTracker.upgradeSession(sessionId);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `upgradeableSessionTracker` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java
        // avoid another thread upgrading the session in parallel.
        synchronized (upgradeableSessionTracker) {
            if (upgradeableSessionTracker.isLocalSession(sessionId)) {
                int timeout = upgradeableSessionTracker.upgradeSession(sessionId);
                CreateSessionTxn txn = new CreateSessionTxn(timeout);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `upgradeableSessionTracker` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java
        synchronized (upgradeableSessionTracker) {
            if (upgradeableSessionTracker.isLocalSession(sessionId)) {
                int timeout = upgradeableSessionTracker.upgradeSession(sessionId);
                CreateSessionTxn txn = new CreateSessionTxn(timeout);
                return new Request(null, sessionId, 0, OpCode.createSession, RequestRecord.fromRecord(txn), null);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leaderIs` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
     */
    void readPacket(QuorumPacket pp) throws IOException {
        synchronized (leaderIs) {
            leaderIs.readRecord(pp, "packet");
            messageTracker.trackReceived(pp.getType());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leaderIs` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
    void readPacket(QuorumPacket pp) throws IOException {
        synchronized (leaderIs) {
            leaderIs.readRecord(pp, "packet");
            messageTracker.trackReceived(pp.getType());
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leaderOs` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java

    void writePacketNow(QuorumPacket pp, boolean flush) throws IOException {
        synchronized (leaderOs) {
            if (pp != null) {
                messageTracker.trackSent(pp.getType());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leaderOs` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
            if (pp != null) {
                messageTracker.trackSent(pp.getType());
                leaderOs.writeRecord(pp, "packet");
            }
            if (flush) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `bufferedOutput` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
            }
            if (flush) {
                bufferedOutput.flush();
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
        Deque<Long> packetsCommitted = new ArrayDeque<>();
        Deque<PacketInFlight> packetsNotCommitted = new ArrayDeque<>();
        synchronized (zk) {
            if (qp.getType() == Leader.DIFF) {
                LOG.info("Getting a diff from the leader 0x{}", Long.toHexString(qp.getZxid()));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
            if (qp.getType() == Leader.DIFF) {
                LOG.info("Getting a diff from the leader 0x{}", Long.toHexString(qp.getZxid()));
                self.setSyncMode(QuorumPeer.SyncMode.DIFF);
                if (zk.shouldForceWriteInitialSnapshotAfterLeaderElection()) {
                    LOG.info("Forcing a snapshot write as part of upgrading from an older Zookeeper. This should only happen while upgrading.");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                LOG.info("Getting a diff from the leader 0x{}", Long.toHexString(qp.getZxid()));
                self.setSyncMode(QuorumPeer.SyncMode.DIFF);
                if (zk.shouldForceWriteInitialSnapshotAfterLeaderElection()) {
                    LOG.info("Forcing a snapshot write as part of upgrading from an older Zookeeper. This should only happen while upgrading.");
                    snapshotNeeded = true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                }
            } else if (qp.getType() == Leader.SNAP) {
                self.setSyncMode(QuorumPeer.SyncMode.SNAP);
                LOG.info("Getting a snapshot from leader 0x{}", Long.toHexString(qp.getZxid()));
                // The leader is going to dump the database
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                // The leader is going to dump the database
                // db is clear as part of deserializeSnapshot()
                zk.getZKDatabase().deserializeSnapshot(leaderIs);
                // ZOOKEEPER-2819: overwrite config node content extracted
                // from leader snapshot with local config, to avoid potential
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leaderIs` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                // The leader is going to dump the database
                // db is clear as part of deserializeSnapshot()
                zk.getZKDatabase().deserializeSnapshot(leaderIs);
                // ZOOKEEPER-2819: overwrite config node content extracted
                // from leader snapshot with local config, to avoid potential
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                // from leader snapshot with local config, to avoid potential
                // inconsistency of config node content during rolling restart.
                if (!self.isReconfigEnabled()) {
                    LOG.debug("Reset config node content from local config after deserialization of snapshot.");
                    zk.getZKDatabase().initConfigInZKDatabase(self.getQuorumVerifier());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                if (!self.isReconfigEnabled()) {
                    LOG.debug("Reset config node content from local config after deserialization of snapshot.");
                    zk.getZKDatabase().initConfigInZKDatabase(self.getQuorumVerifier());
                }
                String signature = leaderIs.readString("signature");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                if (!self.isReconfigEnabled()) {
                    LOG.debug("Reset config node content from local config after deserialization of snapshot.");
                    zk.getZKDatabase().initConfigInZKDatabase(self.getQuorumVerifier());
                }
                String signature = leaderIs.readString("signature");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leaderIs` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    zk.getZKDatabase().initConfigInZKDatabase(self.getQuorumVerifier());
                }
                String signature = leaderIs.readString("signature");
                if (!signature.equals("BenWasHere")) {
                    LOG.error("Missing signature. Got {}", signature);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    throw new IOException("Missing signature");
                }
                zk.getZKDatabase().setlastProcessedZxid(qp.getZxid());

                // immediately persist the latest snapshot when there is txn log gap
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
            } else if (qp.getType() == Leader.TRUNC) {
                //we need to truncate the log to the lastzxid of the leader
                self.setSyncMode(QuorumPeer.SyncMode.TRUNC);
                LOG.warn("Truncating log to get in sync with the leader 0x{}", Long.toHexString(qp.getZxid()));
                boolean truncated = zk.getZKDatabase().truncateLog(qp.getZxid());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                self.setSyncMode(QuorumPeer.SyncMode.TRUNC);
                LOG.warn("Truncating log to get in sync with the leader 0x{}", Long.toHexString(qp.getZxid()));
                boolean truncated = zk.getZKDatabase().truncateLog(qp.getZxid());
                if (!truncated) {
                    // not able to truncate the log
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    ServiceUtils.requestSystemExit(ExitCode.QUORUM_PACKET_ERROR.getValue());
                }
                zk.getZKDatabase().setlastProcessedZxid(qp.getZxid());

            } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                ServiceUtils.requestSystemExit(ExitCode.QUORUM_PACKET_ERROR.getValue());
            }
            zk.getZKDatabase().initConfigInZKDatabase(self.getQuorumVerifier());
            zk.createSessionTracker();

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                ServiceUtils.requestSystemExit(ExitCode.QUORUM_PACKET_ERROR.getValue());
            }
            zk.getZKDatabase().initConfigInZKDatabase(self.getQuorumVerifier());
            zk.createSessionTracker();

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
            }
            zk.getZKDatabase().initConfigInZKDatabase(self.getQuorumVerifier());
            zk.createSessionTracker();

            long lastQueued = 0;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
            // we are now going to start getting transactions to apply followed by an UPTODATE
            outerLoop:
            while (self.isRunning()) {
                readPacket(qp);
                switch (qp.getType()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    if (pif.hdr.getType() == OpCode.reconfig) {
                        SetDataTxn setDataTxn = (SetDataTxn) pif.rec;
                        QuorumVerifier qv = self.configFromString(new String(setDataTxn.getData(), UTF_8));
                        self.setLastSeenQuorumVerifier(qv, true);
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                        SetDataTxn setDataTxn = (SetDataTxn) pif.rec;
                        QuorumVerifier qv = self.configFromString(new String(setDataTxn.getData(), UTF_8));
                        self.setLastSeenQuorumVerifier(qv, true);
                    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    pif = packetsNotCommitted.peekFirst();
                    if (pif.hdr.getZxid() == qp.getZxid() && qp.getType() == Leader.COMMITANDACTIVATE) {
                        QuorumVerifier qv = self.configFromString(new String(((SetDataTxn) pif.rec).getData(), UTF_8));
                        boolean majorChange = self.processReconfig(
                            qv,
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    if (pif.hdr.getZxid() == qp.getZxid() && qp.getType() == Leader.COMMITANDACTIVATE) {
                        QuorumVerifier qv = self.configFromString(new String(((SetDataTxn) pif.rec).getData(), UTF_8));
                        boolean majorChange = self.processReconfig(
                            qv,
                            ByteBuffer.wrap(qp.getData()).getLong(), qp.getZxid(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                                Long.toHexString(pif.hdr.getZxid()));
                        } else {
                            zk.processTxn(pif.hdr, pif.rec);
                            packetsNotCommitted.remove();
                        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                        packet.rec = logEntry.getTxn();
                        packet.digest = logEntry.getDigest();
                        QuorumVerifier qv = self.configFromString(new String(((SetDataTxn) packet.rec).getData(), UTF_8));
                        boolean majorChange = self.processReconfig(qv, suggestedLeaderId, qp.getZxid(), true);
                        if (majorChange) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                        packet.digest = logEntry.getDigest();
                        QuorumVerifier qv = self.configFromString(new String(((SetDataTxn) packet.rec).getData(), UTF_8));
                        boolean majorChange = self.processReconfig(qv, suggestedLeaderId, qp.getZxid(), true);
                        if (majorChange) {
                            throw new Exception("changes proposed in reconfig");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    if (!writeToTxnLog) {
                        // Apply to db directly if we haven't taken the snapshot
                        zk.processTxn(packet.hdr, packet.rec);
                    } else {
                        packetsNotCommitted.add(packet);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    LOG.info("Learner received UPTODATE message");
                    if (newLeaderQV != null) {
                        boolean majorChange = self.processReconfig(newLeaderQV, null, null, true);
                        if (majorChange) {
                            throw new Exception("changes proposed in reconfig");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    }
                    if (isPreZAB1_0) {
                        zk.takeSnapshot(syncSnapshot);
                        self.setCurrentEpoch(newEpoch);
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    if (isPreZAB1_0) {
                        zk.takeSnapshot(syncSnapshot);
                        self.setCurrentEpoch(newEpoch);
                    }
                    self.setZooKeeperServer(zk);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                        self.setCurrentEpoch(newEpoch);
                    }
                    self.setZooKeeperServer(zk);
                    self.adminServer.setZooKeeperServer(zk);
                    break outerLoop;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                        self.setCurrentEpoch(newEpoch);
                    }
                    self.setZooKeeperServer(zk);
                    self.adminServer.setZooKeeperServer(zk);
                    break outerLoop;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    }
                    self.setZooKeeperServer(zk);
                    self.adminServer.setZooKeeperServer(zk);
                    break outerLoop;
                case Leader.NEWLEADER: // Getting NEWLEADER here instead of in discovery
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    }
                    self.setZooKeeperServer(zk);
                    self.adminServer.setZooKeeperServer(zk);
                    break outerLoop;
                case Leader.NEWLEADER: // Getting NEWLEADER here instead of in discovery
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    if (qp.getData() != null && qp.getData().length > 1) {
                        try {
                            QuorumVerifier qv = self.configFromString(new String(qp.getData(), UTF_8));
                            self.setLastSeenQuorumVerifier(qv, true);
                            newLeaderQV = qv;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                        try {
                            QuorumVerifier qv = self.configFromString(new String(qp.getData(), UTF_8));
                            self.setLastSeenQuorumVerifier(qv, true);
                            newLeaderQV = qv;
                        } catch (Exception e) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java

                    if (snapshotNeeded) {
                        zk.takeSnapshot(syncSnapshot);
                    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    }

                    self.setCurrentEpoch(newEpoch);
                    writeToTxnLog = true;
                    //Anything after this needs to go to the transaction log, not applied directly in memory
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sock` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java

                    // ZOOKEEPER-3911: make sure sync the uncommitted logs before commit them (ACK NEWLEADER).
                    sock.setSoTimeout(self.tickTime * self.syncLimit);
                    self.setSyncMode(QuorumPeer.SyncMode.NONE);
                    zk.startupWithoutServing();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java

                    // ZOOKEEPER-3911: make sure sync the uncommitted logs before commit them (ACK NEWLEADER).
                    sock.setSoTimeout(self.tickTime * self.syncLimit);
                    self.setSyncMode(QuorumPeer.SyncMode.NONE);
                    zk.startupWithoutServing();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java

                    // ZOOKEEPER-3911: make sure sync the uncommitted logs before commit them (ACK NEWLEADER).
                    sock.setSoTimeout(self.tickTime * self.syncLimit);
                    self.setSyncMode(QuorumPeer.SyncMode.NONE);
                    zk.startupWithoutServing();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    // ZOOKEEPER-3911: make sure sync the uncommitted logs before commit them (ACK NEWLEADER).
                    sock.setSoTimeout(self.tickTime * self.syncLimit);
                    self.setSyncMode(QuorumPeer.SyncMode.NONE);
                    zk.startupWithoutServing();
                    if (zk instanceof FollowerZooKeeperServer) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    sock.setSoTimeout(self.tickTime * self.syncLimit);
                    self.setSyncMode(QuorumPeer.SyncMode.NONE);
                    zk.startupWithoutServing();
                    if (zk instanceof FollowerZooKeeperServer) {
                        FollowerZooKeeperServer fzk = (FollowerZooKeeperServer) zk;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    self.setSyncMode(QuorumPeer.SyncMode.NONE);
                    zk.startupWithoutServing();
                    if (zk instanceof FollowerZooKeeperServer) {
                        FollowerZooKeeperServer fzk = (FollowerZooKeeperServer) zk;
                        for (PacketInFlight p : packetsNotCommitted) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `zk` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    zk.startupWithoutServing();
                    if (zk instanceof FollowerZooKeeperServer) {
                        FollowerZooKeeperServer fzk = (FollowerZooKeeperServer) zk;
                        for (PacketInFlight p : packetsNotCommitted) {
                            fzk.logRequest(p.hdr, p.rec, p.digest);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pendingSyncs` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverZooKeeperServer.java`
#### Snippet
```java
     */
    public synchronized void sync() {
        if (pendingSyncs.size() == 0) {
            LOG.warn("Not expecting a sync.");
            return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pendingSyncs` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverZooKeeperServer.java`
#### Snippet
```java
        }

        Request r = pendingSyncs.remove();
        commitProcessor.commit(r);
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `commitProcessor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverZooKeeperServer.java`
#### Snippet
```java

        Request r = pendingSyncs.remove();
        commitProcessor.commit(r);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `syncProcessor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverZooKeeperServer.java`
#### Snippet
```java
        }
        super.shutdown();
        if (syncRequestProcessorEnabled && syncProcessor != null) {
            syncProcessor.shutdown();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `syncProcessor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverZooKeeperServer.java`
#### Snippet
```java
        super.shutdown();
        if (syncRequestProcessorEnabled && syncProcessor != null) {
            syncProcessor.shutdown();
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `dout` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
                return;
            }
            dout.writeInt(b.capacity());
            dout.write(b.array());
            dout.flush();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `dout` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
            }
            dout.writeInt(b.capacity());
            dout.write(b.array());
            dout.flush();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `dout` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
            dout.writeInt(b.capacity());
            dout.write(b.array());
            dout.flush();
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.recvWorker` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java

        synchronized void setRecv(RecvWorker recvWorker) {
            this.recvWorker = recvWorker;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `recvWorker` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
         */
        synchronized RecvWorker getRecvWorker() {
            return recvWorker;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
         */
        synchronized boolean finish() {
            LOG.debug("RecvWorker.finish called. sid: {}. myId: {}", sid, QuorumCnxManager.this.mySid);
            if (!running) {
                /*
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
        synchronized boolean finish() {
            LOG.debug("RecvWorker.finish called. sid: {}. myId: {}", sid, QuorumCnxManager.this.mySid);
            if (!running) {
                /*
                 * Avoids running finish() twice.
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
                 * Avoids running finish() twice.
                 */
                return running;
            }
            running = false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
                return running;
            }
            running = false;

            this.interrupt();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
            this.interrupt();
            threadCnt.decrementAndGet();
            return running;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java

        synchronized boolean finish() {
            LOG.debug("Calling SendWorker.finish for {}", sid);

            if (!running) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
            LOG.debug("Calling SendWorker.finish for {}", sid);

            if (!running) {
                /*
                 * Avoids running finish() twice.
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
                 * Avoids running finish() twice.
                 */
                return running;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
            }

            running = false;
            closeSocket(sock);

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sock` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java

            running = false;
            closeSocket(sock);

            this.interrupt();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `recvWorker` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java

            this.interrupt();
            if (recvWorker != null) {
                recvWorker.finish();
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `recvWorker` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
            this.interrupt();
            if (recvWorker != null) {
                recvWorker.finish();
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
            }

            LOG.debug("Removing entry from senderWorkerMap sid={}", sid);

            senderWorkerMap.remove(sid, this);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `sid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
            LOG.debug("Removing entry from senderWorkerMap sid={}", sid);

            senderWorkerMap.remove(sid, this);
            threadCnt.decrementAndGet();
            return running;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
            senderWorkerMap.remove(sid, this);
            threadCnt.decrementAndGet();
            return running;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ping` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
        thread.start();
        pinger = Executors.newSingleThreadScheduledExecutor();
        pinger.scheduleAtFixedRate(ping, self.tickTime / 2, self.tickTime / 2, TimeUnit.MILLISECONDS);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stopped` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
        long startWaitTime = Time.currentElapsedTime();
        synchronized (emptyPoolSync) {
            while ((!stopped) && isProcessingRequest()) {
                emptyPoolSync.wait();
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queuedRequests` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
                synchronized (this) {
                    commitIsWaiting = !committedRequests.isEmpty();
                    requestsToProcess = queuedRequests.size();
                    if (requestsToProcess == 0 && !commitIsWaiting) {
                        // Waiting for requests to process
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `stopped` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
                    if (requestsToProcess == 0 && !commitIsWaiting) {
                        // Waiting for requests to process
                        while (!stopped && requestsToProcess == 0 && !commitIsWaiting) {
                            wait();
                            commitIsWaiting = !committedRequests.isEmpty();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `queuedRequests` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
                            wait();
                            commitIsWaiting = !committedRequests.isEmpty();
                            requestsToProcess = queuedRequests.size();
                        }
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `syncProcessor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerZooKeeperServer.java`
#### Snippet
```java
        }
        try {
            if (syncProcessor != null) {
                syncProcessor.shutdown();
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `syncProcessor` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerZooKeeperServer.java`
#### Snippet
```java
        try {
            if (syncProcessor != null) {
                syncProcessor.shutdown();
            }
        } catch (Exception e) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastProposed` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java

            synchronized (this) {
                lastProposed = zk.getZxid();
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastCommitted` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                     * */
                    if (!tickSkip && !syncedAckSet.hasAllQuorums()
                        && !(self.getQuorumVerifier().overrideQuorumDecision(getForwardingFollowers()) && self.getQuorumVerifier().revalidateOutstandingProp(this, new ArrayList<>(outstandingProposals.values()), lastCommitted))) {
                        // Lost quorum of last committed and/or last proposed
                        // config, set shutdown flag
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `electionFinished` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    public void waitForEpochAck(long id, StateSummary ss) throws IOException, InterruptedException {
        synchronized (electingFollowers) {
            if (electionFinished) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leaderStateSummary` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            }
            if (ss.getCurrentEpoch() != -1) {
                if (ss.isMoreRecentThan(leaderStateSummary)) {
                    throw new IOException("Follower is ahead of the leader, leader summary: "
                                          + leaderStateSummary.getCurrentEpoch()
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leaderStateSummary` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                if (ss.isMoreRecentThan(leaderStateSummary)) {
                    throw new IOException("Follower is ahead of the leader, leader summary: "
                                          + leaderStateSummary.getCurrentEpoch()
                                          + " (current epoch), "
                                          + leaderStateSummary.getLastZxid()
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leaderStateSummary` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                                          + leaderStateSummary.getCurrentEpoch()
                                          + " (current epoch), "
                                          + leaderStateSummary.getLastZxid()
                                          + " (last zxid)");
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `electionFinished` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            QuorumVerifier verifier = self.getQuorumVerifier();
            if (electingFollowers.contains(self.getMyId()) && verifier.containsQuorum(electingFollowers)) {
                electionFinished = true;
                electingFollowers.notifyAll();
            } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `electionFinished` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                long cur = start;
                long end = start + self.getInitLimit() * self.getTickTime();
                while (!electionFinished && cur < end) {
                    electingFollowers.wait(end - cur);
                    cur = Time.currentElapsedTime();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `electionFinished` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                    cur = Time.currentElapsedTime();
                }
                if (!electionFinished) {
                    throw new InterruptedException("Timeout while waiting for epoch to be acked by quorum");
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastProposed` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    @Override
    public synchronized long getLastProposed() {
        return lastProposed;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastCommitted` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    public void commitAndActivate(long zxid, long designatedLeader) {
        synchronized (this) {
            lastCommitted = zxid;
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `allowedToCommit` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    @Override
    public synchronized void processAck(long sid, long zxid, SocketAddress followerAddr) {
        if (!allowedToCommit) {
            return; // last op committed was a leader change - from now on
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastCommitted` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            return;
        }
        if (lastCommitted >= zxid) {
            LOG.debug(
                "proposal has already been committed, pzxid: 0x{} zxid: 0x{}",
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastCommitted` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            LOG.debug(
                "proposal has already been committed, pzxid: 0x{} zxid: 0x{}",
                Long.toHexString(lastCommitted),
                Long.toHexString(zxid));
            // The proposal has already been committed
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `allowedToCommit` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
        if (hasCommitted && p.request != null && p.request.getHdr().getType() == OpCode.reconfig) {
            long curZxid = zxid;
            while (allowedToCommit && hasCommitted && p != null) {
                curZxid++;
                p = outstandingProposals.get(curZxid);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastCommitted` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    public void commit(long zxid) {
        synchronized (this) {
            lastCommitted = zxid;
        }
        QuorumPacket qp = new QuorumPacket(Leader.COMMIT, zxid, null, null);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastProposed` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            LOG.debug("Proposing:: {}", request);

            lastProposed = p.packet.getZxid();
            outstandingProposals.put(lastProposed, p);
            sendPacket(pp);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastProposed` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java

            lastProposed = p.packet.getZxid();
            outstandingProposals.put(lastProposed, p);
            sendPacket(pp);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastCommitted` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    private synchronized void startZkServer() {
        // Update lastCommitted and Db's zxid to a value representing the new epoch
        lastCommitted = zk.getZxid();
        LOG.info("Have quorum of supporters, sids: [{}]; starting up and setting last processed zxid: 0x{}",
                 newLeaderProposal.ackSetsToString(),
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `allowedToCommit` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            if (designatedLeader != self.getMyId()) {
                LOG.warn("This leader is not the designated leader, it will be initialized with allowedToCommit = false");
                allowedToCommit = false;
            }
        } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastProposed` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
        // Queue up any outstanding requests enabling the receipt of
        // new requests
        if (lastProposed > lastSeenZxid) {
            for (Proposal p : toBeApplied) {
                if (p.packet.getZxid() <= lastSeenZxid) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastProposed` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
        }

        return lastProposed;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastProposed` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            sendSync(r);
        } else {
            pendingSyncs.computeIfAbsent(lastProposed, k -> new ArrayList<>()).add(r);
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `quorumFormed` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
        synchronized (newLeaderProposal.qvAcksetPairs) {

            if (quorumFormed) {
                return;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `quorumFormed` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java

            if (newLeaderProposal.hasAllQuorums()) {
                quorumFormed = true;
                newLeaderProposal.qvAcksetPairs.notifyAll();
            } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `quorumFormed` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                long cur = start;
                long end = start + self.getInitLimit() * self.getTickTime();
                while (!quorumFormed && cur < end) {
                    newLeaderProposal.qvAcksetPairs.wait(end - cur);
                    cur = Time.currentElapsedTime();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `quorumFormed` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                    cur = Time.currentElapsedTime();
                }
                if (!quorumFormed) {
                    throw new InterruptedException("Timeout while waiting for NEWLEADER to be acked by quorum");
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastCommitted` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java

        // commit proposals in order
        if (zxid != lastCommitted + 1) {
            LOG.warn(
                "Commiting zxid 0x{} from {} not first!",
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastCommitted` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                Long.toHexString(zxid),
                followerAddr);
            LOG.warn("First is 0x{}", Long.toHexString(lastCommitted + 1));
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `allowedToCommit` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                LOG.info(String.format("Committing a reconfiguration (reconfigEnabled=%s); this leader is not the designated "
                        + "leader anymore, setting allowedToCommit=false", self.isReconfigEnabled()));
                allowedToCommit = false;
            }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waitingForNewEpoch` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    public long getEpochToPropose(long sid, long lastAcceptedEpoch) throws InterruptedException, IOException {
        synchronized (connectingFollowers) {
            if (!waitingForNewEpoch) {
                return epoch;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `epoch` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
        synchronized (connectingFollowers) {
            if (!waitingForNewEpoch) {
                return epoch;
            }
            if (lastAcceptedEpoch >= epoch) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `epoch` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                return epoch;
            }
            if (lastAcceptedEpoch >= epoch) {
                epoch = lastAcceptedEpoch + 1;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `epoch` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            }
            if (lastAcceptedEpoch >= epoch) {
                epoch = lastAcceptedEpoch + 1;
            }
            if (isParticipant(sid)) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waitingForNewEpoch` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            QuorumVerifier verifier = self.getQuorumVerifier();
            if (connectingFollowers.contains(self.getMyId()) && verifier.containsQuorum(connectingFollowers)) {
                waitingForNewEpoch = false;
                self.setAcceptedEpoch(epoch);
                connectingFollowers.notifyAll();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `epoch` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
            if (connectingFollowers.contains(self.getMyId()) && verifier.containsQuorum(connectingFollowers)) {
                waitingForNewEpoch = false;
                self.setAcceptedEpoch(epoch);
                connectingFollowers.notifyAll();
            } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waitingForNewEpoch` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                long cur = start;
                long end = start + self.getInitLimit() * self.getTickTime();
                while (waitingForNewEpoch && cur < end && !quitWaitForEpoch) {
                    connectingFollowers.wait(end - cur);
                    cur = Time.currentElapsedTime();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `waitingForNewEpoch` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                    cur = Time.currentElapsedTime();
                }
                if (waitingForNewEpoch) {
                    throw new InterruptedException("Timeout while waiting for epoch from quorum");
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `epoch` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                }
            }
            return epoch;
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `localSessionsEnabled` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerSessionTracker.java`
#### Snippet
```java
        // to know there is a on flying createSession request because it might
        // be upgraded by other server which owns the session before move.
        if (localSessionsEnabled) {
            removeLocalSession(sessionId);
            finishedUpgrading(sessionId);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `localSessionsEnabled` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LeaderSessionTracker.java`
#### Snippet
```java
        // to know there is a on flying createSession request because it might
        // be upgraded by other server which owns the session before move.
        if (localSessionsEnabled) {
            removeLocalSession(sessionId);
            finishedUpgrading(sessionId);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastZxid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java

    public synchronized long getLastZxid() {
        return lastZxid;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastZxid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
        requestsReceived.set(0);

        lastZxid = -1;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logicalclock` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java

            synchronized (this) {
                logicalclock.incrementAndGet();
                updateProposal(getInitId(), getInitLastLoggedZxid(), getPeerEpoch());
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logicalclock` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
        if (voteSet.hasAllQuorums() && checkLeader(outofelection, n.leader, n.electionEpoch)) {
            synchronized (this) {
                logicalclock.set(n.electionEpoch);
                setPeerState(n.leader, voteSet);
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                response.buffer.get(b);

                                synchronized (self) {
                                    try {
                                        rqv = self.configFromString(new String(b, UTF_8));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                synchronized (self) {
                                    try {
                                        rqv = self.configFromString(new String(b, UTF_8));
                                        QuorumVerifier curQV = self.getQuorumVerifier();
                                        if (rqv.getVersion() > curQV.getVersion()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                    try {
                                        rqv = self.configFromString(new String(b, UTF_8));
                                        QuorumVerifier curQV = self.getQuorumVerifier();
                                        if (rqv.getVersion() > curQV.getVersion()) {
                                            LOG.info("{} Received version: {} my version: {}",
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                        if (rqv.getVersion() > curQV.getVersion()) {
                                            LOG.info("{} Received version: {} my version: {}",
                                                     self.getMyId(),
                                                     Long.toHexString(rqv.getVersion()),
                                                     Long.toHexString(self.getQuorumVerifier().getVersion()));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                                     self.getMyId(),
                                                     Long.toHexString(rqv.getVersion()),
                                                     Long.toHexString(self.getQuorumVerifier().getVersion()));
                                            if (self.getPeerState() == ServerState.LOOKING) {
                                                LOG.debug("Invoking processReconfig(), state: {}", self.getServerState());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                                     Long.toHexString(rqv.getVersion()),
                                                     Long.toHexString(self.getQuorumVerifier().getVersion()));
                                            if (self.getPeerState() == ServerState.LOOKING) {
                                                LOG.debug("Invoking processReconfig(), state: {}", self.getServerState());
                                                self.processReconfig(rqv, null, null, false);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                                     Long.toHexString(self.getQuorumVerifier().getVersion()));
                                            if (self.getPeerState() == ServerState.LOOKING) {
                                                LOG.debug("Invoking processReconfig(), state: {}", self.getServerState());
                                                self.processReconfig(rqv, null, null, false);
                                                if (!rqv.equals(curQV)) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                            if (self.getPeerState() == ServerState.LOOKING) {
                                                LOG.debug("Invoking processReconfig(), state: {}", self.getServerState());
                                                self.processReconfig(rqv, null, null, false);
                                                if (!rqv.equals(curQV)) {
                                                    LOG.info("restarting leader election");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                                if (!rqv.equals(curQV)) {
                                                    LOG.info("restarting leader election");
                                                    self.shuttingDownLE = true;
                                                    self.getElectionAlg().shutdown();

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                                    LOG.info("restarting leader election");
                                                    self.shuttingDownLE = true;
                                                    self.getElectionAlg().shutdown();

                                                    break;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `self` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                                }
                                            } else {
                                                LOG.debug("Skip processReconfig(), state: {}", self.getServerState());
                                            }
                                        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `proposedLeader` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
            leader,
            Long.toHexString(zxid),
            proposedLeader,
            Long.toHexString(proposedZxid));

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `proposedZxid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
            Long.toHexString(zxid),
            proposedLeader,
            Long.toHexString(proposedZxid));

        proposedLeader = leader;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `proposedLeader` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
            Long.toHexString(proposedZxid));

        proposedLeader = leader;
        proposedZxid = zxid;
        proposedEpoch = epoch;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `proposedZxid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java

        proposedLeader = leader;
        proposedZxid = zxid;
        proposedEpoch = epoch;
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `proposedEpoch` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
        proposedLeader = leader;
        proposedZxid = zxid;
        proposedEpoch = epoch;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `proposedLeader` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java

    public synchronized Vote getVote() {
        return new Vote(proposedLeader, proposedZxid, proposedEpoch);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `proposedZxid` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java

    public synchronized Vote getVote() {
        return new Vote(proposedLeader, proposedZxid, proposedEpoch);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `proposedEpoch` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java

    public synchronized Vote getVote() {
        return new Vote(proposedLeader, proposedZxid, proposedEpoch);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logStream` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
     */
    public synchronized void rollLog() throws IOException {
        if (logStream != null) {
            this.logStream.flush();
            prevLogsRunningTotal += getCurrentLogSize();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.logStream` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
    public synchronized void rollLog() throws IOException {
        if (logStream != null) {
            this.logStream.flush();
            prevLogsRunningTotal += getCurrentLogSize();
            this.logStream = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.logStream` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            this.logStream.flush();
            prevLogsRunningTotal += getCurrentLogSize();
            this.logStream = null;
            oa = null;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `oa` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            prevLogsRunningTotal += getCurrentLogSize();
            this.logStream = null;
            oa = null;

            // Roll over the current log file into the running total
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logStream` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
     */
    public synchronized void commit() throws IOException {
        if (logStream != null) {
            logStream.flush();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logStream` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
    public synchronized void commit() throws IOException {
        if (logStream != null) {
            logStream.flush();
        }
        for (FileOutputStream log : streamsToFlush) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logFileWrite` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
     */
    public synchronized long getCurrentLogSize() {
        if (logFileWrite != null) {
            return logFileWrite.length();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logFileWrite` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
    public synchronized long getCurrentLogSize() {
        if (logFileWrite != null) {
            return logFileWrite.length();
        }
        return 0;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastZxidSeen` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            return false;
        }
        if (hdr.getZxid() <= lastZxidSeen) {
            LOG.warn(
                "Current zxid {} is <= {} for {}",
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastZxidSeen` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
                "Current zxid {} is <= {} for {}",
                hdr.getZxid(),
                lastZxidSeen,
                Request.op2String(hdr.getType()));
        } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastZxidSeen` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
                Request.op2String(hdr.getType()));
        } else {
            lastZxidSeen = hdr.getZxid();
        }
        if (logStream == null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logStream` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            lastZxidSeen = hdr.getZxid();
        }
        if (logStream == null) {
            LOG.info("Creating new log file: {}", Util.makeLogName(hdr.getZxid()));

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logFileWrite` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            LOG.info("Creating new log file: {}", Util.makeLogName(hdr.getZxid()));

            logFileWrite = new File(logDir, Util.makeLogName(hdr.getZxid()));
            fos = new FileOutputStream(logFileWrite);
            logStream = new BufferedOutputStream(fos);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logDir` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            LOG.info("Creating new log file: {}", Util.makeLogName(hdr.getZxid()));

            logFileWrite = new File(logDir, Util.makeLogName(hdr.getZxid()));
            fos = new FileOutputStream(logFileWrite);
            logStream = new BufferedOutputStream(fos);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `fos` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java

            logFileWrite = new File(logDir, Util.makeLogName(hdr.getZxid()));
            fos = new FileOutputStream(logFileWrite);
            logStream = new BufferedOutputStream(fos);
            oa = BinaryOutputArchive.getArchive(logStream);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logFileWrite` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java

            logFileWrite = new File(logDir, Util.makeLogName(hdr.getZxid()));
            fos = new FileOutputStream(logFileWrite);
            logStream = new BufferedOutputStream(fos);
            oa = BinaryOutputArchive.getArchive(logStream);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logStream` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            logFileWrite = new File(logDir, Util.makeLogName(hdr.getZxid()));
            fos = new FileOutputStream(logFileWrite);
            logStream = new BufferedOutputStream(fos);
            oa = BinaryOutputArchive.getArchive(logStream);
            FileHeader fhdr = new FileHeader(TXNLOG_MAGIC, VERSION, dbId);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `fos` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            logFileWrite = new File(logDir, Util.makeLogName(hdr.getZxid()));
            fos = new FileOutputStream(logFileWrite);
            logStream = new BufferedOutputStream(fos);
            oa = BinaryOutputArchive.getArchive(logStream);
            FileHeader fhdr = new FileHeader(TXNLOG_MAGIC, VERSION, dbId);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `oa` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            fos = new FileOutputStream(logFileWrite);
            logStream = new BufferedOutputStream(fos);
            oa = BinaryOutputArchive.getArchive(logStream);
            FileHeader fhdr = new FileHeader(TXNLOG_MAGIC, VERSION, dbId);
            fhdr.serialize(oa, "fileheader");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logStream` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            fos = new FileOutputStream(logFileWrite);
            logStream = new BufferedOutputStream(fos);
            oa = BinaryOutputArchive.getArchive(logStream);
            FileHeader fhdr = new FileHeader(TXNLOG_MAGIC, VERSION, dbId);
            fhdr.serialize(oa, "fileheader");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `dbId` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            logStream = new BufferedOutputStream(fos);
            oa = BinaryOutputArchive.getArchive(logStream);
            FileHeader fhdr = new FileHeader(TXNLOG_MAGIC, VERSION, dbId);
            fhdr.serialize(oa, "fileheader");
            // Make sure that the magic number is written before padding.
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `oa` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            oa = BinaryOutputArchive.getArchive(logStream);
            FileHeader fhdr = new FileHeader(TXNLOG_MAGIC, VERSION, dbId);
            fhdr.serialize(oa, "fileheader");
            // Make sure that the magic number is written before padding.
            logStream.flush();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logStream` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            fhdr.serialize(oa, "fileheader");
            // Make sure that the magic number is written before padding.
            logStream.flush();
            filePadding.setCurrentSize(fos.getChannel().position());
            streamsToFlush.add(fos);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `fos` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            // Make sure that the magic number is written before padding.
            logStream.flush();
            filePadding.setCurrentSize(fos.getChannel().position());
            streamsToFlush.add(fos);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `fos` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            logStream.flush();
            filePadding.setCurrentSize(fos.getChannel().position());
            streamsToFlush.add(fos);
        }
        filePadding.padFile(fos.getChannel());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `fos` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            streamsToFlush.add(fos);
        }
        filePadding.padFile(fos.getChannel());
        byte[] buf = Util.marshallTxnEntry(hdr, txn, digest);
        if (buf == null || buf.length == 0) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `oa` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
        Checksum crc = makeChecksumAlgorithm();
        crc.update(buf, 0, buf.length);
        oa.writeLong(crc.getValue(), "txnEntryCRC");
        Util.writeTxnBytes(oa, buf);

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `oa` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
        crc.update(buf, 0, buf.length);
        oa.writeLong(crc.getValue(), "txnEntryCRC");
        Util.writeTxnBytes(oa, buf);

        return true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logStream` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
     */
    public synchronized void close() throws IOException {
        if (logStream != null) {
            logStream.close();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `logStream` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
    public synchronized void close() throws IOException {
        if (logStream != null) {
            logStream.close();
        }
        for (FileOutputStream log : streamsToFlush) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `lastSnapshotInfo` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileSnap.java`
#### Snippet
```java
                }

                lastSnapshotInfo = new SnapshotInfo(
                    Util.getZxidFromName(snapShot.getName(), SNAPSHOT_FILE_PREFIX),
                    snapShot.lastModified() / 1000);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `adminServer` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        startServerCnxnFactory();
        try {
            adminServer.start();
        } catch (AdminServerException e) {
            LOG.warn("Problem starting AdminServer", e);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leader` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

    protected synchronized void setLeader(Leader newLeader) {
        leader = newLeader;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leader` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

    public synchronized ZooKeeperServer getActiveServer() {
        if (leader != null) {
            return leader.zk;
        } else if (follower != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leader` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    public synchronized ZooKeeperServer getActiveServer() {
        if (leader != null) {
            return leader.zk;
        } else if (follower != null) {
            return follower.zk;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `follower` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        if (leader != null) {
            return leader.zk;
        } else if (follower != null) {
            return follower.zk;
        } else if (observer != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `follower` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            return leader.zk;
        } else if (follower != null) {
            return follower.zk;
        } else if (observer != null) {
            return observer.zk;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `observer` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        } else if (follower != null) {
            return follower.zk;
        } else if (observer != null) {
            return observer.zk;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `observer` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            return follower.zk;
        } else if (observer != null) {
            return observer.zk;
        }
        return null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `shuttingDownLE` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            LOG.warn("Restarting Leader Election");
            getElectionAlg().shutdown();
            shuttingDownLE = false;
            startLeaderElection();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leader` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
                            try {
                                long proposed;
                                synchronized (leader) {
                                    proposed = leader.lastProposed;
                                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leader` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
                                long proposed;
                                synchronized (leader) {
                                    proposed = leader.lastProposed;
                                }
                                responseBuffer.putLong(proposed);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `follower` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

    protected synchronized void setFollower(Follower newFollower) {
        follower = newFollower;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `responder` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

    public synchronized void stopLeaderElection() {
        responder.running = false;
        responder.interrupt();
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `responder` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    public synchronized void stopLeaderElection() {
        responder.running = false;
        responder.interrupt();
    }
    public synchronized void startLeaderElection() {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.electionAlg` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        }

        this.electionAlg = createElectionAlgorithm(electionType);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leader` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        List<String> l = new ArrayList<>();
        synchronized (this) {
            if (leader != null) {
                for (LearnerHandler fh : leader.getLearners()) {
                    if (fh.getSocket() != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leader` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        synchronized (this) {
            if (leader != null) {
                for (LearnerHandler fh : leader.getLearners()) {
                    if (fh.getSocket() != null) {
                        String s = formatInetAddr((InetSocketAddress) fh.getSocket().getRemoteSocketAddress());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `leader` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
                    if (fh.getSocket() != null) {
                        String s = formatInetAddr((InetSocketAddress) fh.getSocket().getRemoteSocketAddress());
                        if (leader.isLearnerSynced(fh)) {
                            s += "*";
                        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `follower` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
                    }
                }
            } else if (follower != null) {
                l.add(formatInetAddr((InetSocketAddress) follower.sock.getRemoteSocketAddress()));
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `follower` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
                }
            } else if (follower != null) {
                l.add(formatInetAddr((InetSocketAddress) follower.sock.getRemoteSocketAddress()));
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `observer` accessed in synchronized context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

    protected synchronized void setObserver(Observer newObserver) {
        observer = newObserver;
    }

```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `zookeeper-server/src/main/java/org/apache/zookeeper/JLineZNodeCompleter.java`
#### Snippet
```java

    @SuppressWarnings({"unchecked", "rawtypes"})
    public int complete(String buffer, int cursor, List candidates) {
        // Guarantee that the final token is the one we're expanding
        buffer = buffer.substring(0, cursor);
```

### RedundantSuppression
Redundant suppression
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKUtil.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private static void visitSubTreeDFSHelper(
        ZooKeeper zk,
        final String path,
```

### RedundantSuppression
Redundant suppression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/EphemeralType.java`
#### Snippet
```java
                throw new IllegalArgumentException("ttl must be positive and cannot be larger than: " + TTL.maxValue());
            }
            //noinspection PointlessBitwiseExpression
            return EXTENDED_MASK
                   | EXTENDED_BIT_TTL
```

### RedundantSuppression
Redundant suppression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxnFactory.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public void closeAll(ServerCnxn.DisconnectReason reason) {
        // clear all the connections on which we are selecting
        for (ServerCnxn cnxn : cnxns) {
```

### RedundantSuppression
Redundant suppression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/JettyAdminServer.java`
#### Snippet
```java

            // Extract keyword arguments to command from request parameters
            @SuppressWarnings("unchecked") Map<String, String[]> parameterMap = request.getParameterMap();
            Map<String, String> kwargs = new HashMap<>();
            for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
```

### RedundantSuppression
Redundant suppression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

    @SuppressWarnings("deprecation")
    protected Election createElectionAlgorithm(int electionAlgorithm) {
        Election le = null;

```

### RedundantSuppression
Redundant suppression
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

    @SuppressWarnings("deprecation")
    protected Election makeLEStrategy() {
        LOG.debug("Initializing leader election protocol...");
        return electionAlg;
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keyPassword'
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/PemReader.java`
#### Snippet
```java
    }

    public static PrivateKey loadPrivateKey(String privateKey, Optional<String> keyPassword) throws IOException, GeneralSecurityException {
        Matcher matcher = PRIVATE_KEY_PATTERN.matcher(privateKey);
        if (!matcher.find()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keyPassword'
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/PemReader.java`
#### Snippet
```java
    }

    public static KeyStore loadKeyStore(File certificateChainFile, File privateKeyFile, Optional<String> keyPassword) throws IOException, GeneralSecurityException {
        PrivateKey key = loadPrivateKey(privateKeyFile, keyPassword);

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keyPassword'
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/PemReader.java`
#### Snippet
```java
    }

    public static PrivateKey loadPrivateKey(File privateKeyFile, Optional<String> keyPassword) throws IOException, GeneralSecurityException {
        String privateKey = new String(Files.readAllBytes(privateKeyFile.toPath()), US_ASCII);
        return loadPrivateKey(privateKey, keyPassword);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sequence'
in `zookeeper-recipes/zookeeper-recipes-lock/src/main/java/org/apache/zookeeper/recipes/lock/ZNodeName.java`
#### Snippet
```java
    private final String name;
    private final String prefix;
    private final Optional<Integer> sequence;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'executorOptional'
in `zookeeper-metrics-providers/zookeeper-prometheus-metrics/src/main/java/org/apache/zookeeper/metrics/prometheus/PrometheusMetricsProvider.java`
#### Snippet
```java
    private int maxQueueSize = 1000000;
    private long workerShutdownTimeoutMs = 1000;
    private Optional<ExecutorService> executorOptional = Optional.empty();

    @Override
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
                        removedWatchers.add(watcher);
                        // cleanup <path vs watchlist>
                        if (watchers.size() <= 0) {
                            pathVsWatcher.remove(path);
                        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                          e);
                        throw e;
                    } else if (tries >= 4) {
                        LOG.error(
                          "Unexpected exception, retries exceeded. tries={}, remaining init limit={}, connecting to {}",
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ServerAdminClient.java`
#### Snippet
```java

    private static void usage() {
        System.out.println("usage: java [-cp CLASSPATH] org.apache.zookeeper.ServerAdminClient "
                           + "host port op (ruok|stat|dump|kill|gettracemask|settracemask) [arguments]");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ServerAdminClient.java`
#### Snippet
```java
            int rc = is.read(resBytes);
            String retv = new String(resBytes, UTF_8);
            System.out.println("rc=" + rc + " retv=" + retv);
        } catch (IOException e) {
            LOG.warn("Unexpected exception", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ServerAdminClient.java`
#### Snippet
```java
            ByteBuffer res = ByteBuffer.wrap(resBytes);
            long retv = res.getLong();
            System.out.println("rc=" + rc
                               + " retv=0" + Long.toOctalString(retv)
                               + " masks=0" + Long.toOctalString(traceMask));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ServerAdminClient.java`
#### Snippet
```java
            int rc = is.read(resBytes);
            String retv = new String(resBytes, UTF_8);
            System.out.println("rc=" + rc + " retv=" + retv);
        } catch (IOException e) {
            LOG.warn("Unexpected exception", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ServerAdminClient.java`
#### Snippet
```java
            dump(host, port);
        } else {
            System.out.println("Unrecognized op: " + op);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ServerAdminClient.java`
#### Snippet
```java
            int rc = is.read(resBytes);
            String retv = new String(resBytes, UTF_8);
            System.out.println("rc=" + rc + " retv=" + retv);
        } catch (IOException e) {
            LOG.warn("Unexpected exception", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ServerAdminClient.java`
#### Snippet
```java
            ByteBuffer res = ByteBuffer.wrap(resBytes);
            long retv = res.getLong();
            System.out.println("rc=" + rc + " retv=0" + Long.toOctalString(retv));
        } catch (IOException e) {
            LOG.warn("Unexpected exception", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ServerAdminClient.java`
#### Snippet
```java
            int rc = is.read(resBytes);
            String retv = new String(resBytes, UTF_8);
            System.out.println("rc=" + rc + " retv=" + retv);
        } catch (IOException e) {
            LOG.warn("Unexpected exception", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/Version.java`
#### Snippet
```java

    public static void printUsage() {
        System.out.print("Usage:\tjava -cp ... org.apache.zookeeper.Version "
                         + "[--full | --short | --revision],\n\tPrints --full version "
                         + "info if no arg specified.");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/Version.java`
#### Snippet
```java
        }
        if (args.length == 0 || (args.length == 1 && args[0].equals("--full"))) {
            System.out.println(getFullVersion());
            ServiceUtils.requestSystemExit(ExitCode.EXECUTION_FINISHED.getValue());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/Version.java`
#### Snippet
```java
        }
        if (args[0].equals("--short")) {
            System.out.println(getVersion());
        } else if (args[0].equals("--revision")) {
            System.out.println(getVersionRevision());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/Version.java`
#### Snippet
```java
            System.out.println(getVersion());
        } else if (args[0].equals("--revision")) {
            System.out.println(getVersionRevision());
        } else {
            printUsage();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java

    public static void printMessage(String msg) {
        System.out.println("\n" + msg);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
    void run() throws IOException, InterruptedException {
        if (cl.getCommand() == null) {
            System.out.println("Welcome to ZooKeeper!");

            boolean jlinemissing = false;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
                Class<?> completorC = Class.forName("org.apache.zookeeper.JLineZNodeCompleter");

                System.out.println("JLine support is enabled");

                Object console = consoleC.getConstructor().newInstance();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java

            if (jlinemissing) {
                System.out.println("JLine support is disabled");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
        } catch (CliException ex) {
            exitCode = ex.getExitCode();
            System.err.println(ex.getMessage());
        }
        return watch;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
                    }
                } catch (NoSuchElementException e) {
                    System.err.println("Error: no argument found for option " + opt);
                    return false;
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java

    static void usage() {
        System.err.println("ZooKeeper -server host:port -client-configuration properties-file cmd args");
        List<String> cmdList = new ArrayList<>(commandMap.keySet());
        Collections.sort(cmdList);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
        Collections.sort(cmdList);
        for (String cmd : cmdList) {
            System.err.println("\t" + cmd + " " + commandMap.get(cmd));
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
                    continue;
                }
                System.out.println(i + " - " + history.get(i));
            }
        } else if (cmd.equals("printwatches")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
        } else if (cmd.equals("printwatches")) {
            if (args.length == 1) {
                System.out.println("printwatches is " + (printWatches ? "on" : "off"));
            } else {
                printWatches = args[1].equals("on");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
        // Below commands all need a live connection
        if (zk == null || !zk.getState().isAlive()) {
            System.out.println("Not connected");
            return false;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
        if (cl.getOption("secure") != null) {
            System.setProperty(ZKClientConfig.SECURE_CLIENT, "true");
            System.out.println("Secure connection is enabled");
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
    public ZooKeeperMain(String[] args) throws IOException, InterruptedException {
        cl.parseOptions(args);
        System.out.println("Connecting to " + cl.getOption("server"));
        connectToZK(cl.getOption("server"));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/CliCommand.java`
#### Snippet
```java
     */
    public CliCommand(String cmdStr, String optionStr) {
        this.out = System.out;
        this.err = System.err;
        this.cmdStr = cmdStr;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/CliCommand.java`
#### Snippet
```java
    public CliCommand(String cmdStr, String optionStr) {
        this.out = System.out;
        this.err = System.err;
        this.cmdStr = cmdStr;
        this.optionStr = optionStr;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/AclParser.java`
#### Snippet
```java
                break;
            default:
                System.err.println("Unknown perm type: " + permString.charAt(i));
            }
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/AclParser.java`
#### Snippet
```java
            int lastColon = a.lastIndexOf(':');
            if (firstColon == -1 || lastColon == -1 || firstColon == lastColon) {
                System.err.println(a + " does not have the form scheme:id:perm");
                continue;
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/DelQuotaCommand.java`
#### Snippet
```java
        String quotaPath = Quotas.limitPath(path);
        if (zk.exists(quotaPath, false) == null) {
            System.out.println("Quota does not exist for " + path);
            return true;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/SetQuotaCommand.java`
#### Snippet
```java
        if ((quotaStrack.getCount() > -1 && quotaStrack.getCount() < statStrack.getCount()) || (quotaStrack.getCountHardLimit() > -1
                && quotaStrack.getCountHardLimit() < statStrack.getCount())) {
            System.out.println("[Warning]: the count quota you create is less than the existing count:" + statStrack.getCount());
        }
        if ((quotaStrack.getBytes() > -1 && quotaStrack.getBytes() < statStrack.getBytes()) || (quotaStrack.getByteHardLimit() > -1
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/SetQuotaCommand.java`
#### Snippet
```java
        if ((quotaStrack.getBytes() > -1 && quotaStrack.getBytes() < statStrack.getBytes()) || (quotaStrack.getByteHardLimit() > -1
                && quotaStrack.getByteHardLimit() < statStrack.getBytes())) {
            System.out.println("[Warning]: the bytes quota you create is less than the existing bytes:" + statStrack.getBytes());
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/FourLetterWordMain.java`
#### Snippet
```java
    public static void main(String[] args) throws IOException, SSLContextException {
        if (args.length == 3) {
            System.out.println(send4LetterWord(args[0], Integer.parseInt(args[1]), args[2]));
        } else if (args.length == 4) {
            System.out.println(send4LetterWord(args[0], Integer.parseInt(args[1]), args[2], Boolean.parseBoolean(args[3])));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/FourLetterWordMain.java`
#### Snippet
```java
            System.out.println(send4LetterWord(args[0], Integer.parseInt(args[1]), args[2]));
        } else if (args.length == 4) {
            System.out.println(send4LetterWord(args[0], Integer.parseInt(args[1]), args[2], Boolean.parseBoolean(args[3])));
        } else {
            System.out.println("Usage: FourLetterWordMain <host> <port> <cmd> <secure(optional)>");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/FourLetterWordMain.java`
#### Snippet
```java
            System.out.println(send4LetterWord(args[0], Integer.parseInt(args[1]), args[2], Boolean.parseBoolean(args[3])));
        } else {
            System.out.println("Usage: FourLetterWordMain <host> <port> <cmd> <secure(optional)>");
        }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServerMain.java`
#### Snippet
```java
            LOG.error("Invalid arguments, exiting abnormally", e);
            LOG.info(USAGE);
            System.err.println(USAGE);
            ZKAuditProvider.addServerStartFailureAuditLog();
            ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServerMain.java`
#### Snippet
```java
        } catch (ConfigException e) {
            LOG.error("Invalid config, exiting abnormally", e);
            System.err.println("Invalid config, exiting abnormally");
            ZKAuditProvider.addServerStartFailureAuditLog();
            ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServerMain.java`
#### Snippet
```java
        } catch (DatadirException e) {
            LOG.error("Unable to access datadir, exiting abnormally", e);
            System.err.println("Unable to access datadir, exiting abnormally");
            ZKAuditProvider.addServerStartFailureAuditLog();
            ServiceUtils.requestSystemExit(ExitCode.UNABLE_TO_ACCESS_DATADIR.getValue());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServerMain.java`
#### Snippet
```java
        } catch (AdminServerException e) {
            LOG.error("Unable to start AdminServer, exiting abnormally", e);
            System.err.println("Unable to start AdminServer, exiting abnormally");
            ZKAuditProvider.addServerStartFailureAuditLog();
            ServiceUtils.requestSystemExit(ExitCode.ERROR_STARTING_ADMIN_SERVER.getValue());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotRecursiveSummary.java`
#### Snippet
```java
  public static void main(String[] args) throws Exception {
    if (args.length != 3) {
      System.err.println(getUsage());
      System.exit(2);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotRecursiveSummary.java`
#### Snippet
```java
      maxDepth = Integer.parseInt(args[2]);
    } catch (NumberFormatException e) {
      System.err.println(getUsage());
      System.exit(2);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotRecursiveSummary.java`
#### Snippet
```java
    StringBuilder builder = new StringBuilder();
    printZnode(dataTree, startingNode, builder, 0, maxDepth);
    System.out.println(builder);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
                Time.currentWallTime());
        } catch (NoNodeException e) {
            System.out.println("configuration node missing - should not happen");
        }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/TraceFormatter.java`
#### Snippet
```java
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("USAGE: TraceFormatter trace_file");
            ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/TraceFormatter.java`
#### Snippet
```java
                }
            }
            System.out.println(DateFormat.getDateTimeInstance(DateFormat.SHORT,
                    DateFormat.LONG).format(new Date(time))
                    + ": "
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java

    private void printHex(String prefix, long value) {
        System.out.println(String.format("  %s = %#016x", prefix, value));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
    private void printStat(StatPersisted stat) {
        printHex("cZxid", stat.getCzxid());
        System.out.println("  ctime = " + new Date(stat.getCtime()).toString());
        printHex("mZxid", stat.getMzxid());
        System.out.println("  mtime = " + new Date(stat.getMtime()).toString());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        System.out.println("  ctime = " + new Date(stat.getCtime()).toString());
        printHex("mZxid", stat.getMzxid());
        System.out.println("  mtime = " + new Date(stat.getMtime()).toString());
        printHex("pZxid", stat.getPzxid());
        System.out.println("  cversion = " + stat.getCversion());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        System.out.println("  mtime = " + new Date(stat.getMtime()).toString());
        printHex("pZxid", stat.getPzxid());
        System.out.println("  cversion = " + stat.getCversion());
        System.out.println("  dataVersion = " + stat.getVersion());
        System.out.println("  aclVersion = " + stat.getAversion());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        printHex("pZxid", stat.getPzxid());
        System.out.println("  cversion = " + stat.getCversion());
        System.out.println("  dataVersion = " + stat.getVersion());
        System.out.println("  aclVersion = " + stat.getAversion());
        printHex("ephemeralOwner", stat.getEphemeralOwner());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        System.out.println("  cversion = " + stat.getCversion());
        System.out.println("  dataVersion = " + stat.getVersion());
        System.out.println("  aclVersion = " + stat.getAversion());
        printHex("ephemeralOwner", stat.getEphemeralOwner());
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
    private void printSnapshotJson(final DataTree dataTree) {
        JsonStringEncoder encoder = JsonStringEncoder.getInstance();
        System.out.printf(
            "[1,0,{\"progname\":\"SnapshotFormatter.java\",\"progver\":\"0.01\",\"timestamp\":%d}",
            System.currentTimeMillis());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
            System.currentTimeMillis());
        printZnodeJson(dataTree, "/", encoder);
        System.out.print("]");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        DataTree.ZxidDigest targetZxidDigest = dataTree.getDigestFromLoadedSnapshot();
        if (targetZxidDigest != null) {
            System.out.println(String.format("Target zxid digest is: %s, %s",
                    Long.toHexString(targetZxidDigest.zxid), targetZxidDigest.digest));
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
                    Long.toHexString(targetZxidDigest.zxid), targetZxidDigest.digest));
        }
        System.out.println(String.format("----%nLast zxid: 0x%s", Long.toHexString(Math.max(fileNameZxid, dtZxid))));
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        }
        if (args.length != i || snapshotFile == null) {
            System.err.println("USAGE: SnapshotFormatter [-d|-json] snapshot_file");
            System.err.println("       -d dump the data for each znode");
            System.err.println("       -json dump znode info in json format");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        if (args.length != i || snapshotFile == null) {
            System.err.println("USAGE: SnapshotFormatter [-d|-json] snapshot_file");
            System.err.println("       -d dump the data for each znode");
            System.err.println("       -json dump znode info in json format");
            ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
            System.err.println("USAGE: SnapshotFormatter [-d|-json] snapshot_file");
            System.err.println("       -d dump the data for each znode");
            System.err.println("       -json dump znode info in json format");
            ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
            return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        String error = ZKUtil.validateFileInput(snapshotFile);
        if (null != error) {
            System.err.println(error);
            ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java

        if (dumpData && dumpJson) {
            System.err.println("Cannot specify both data dump (-d) and json mode (-json) in same call");
            ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java

    private long printZnode(DataTree dataTree, String name, boolean dumpData) {
        System.out.println("----");
        DataNode n = dataTree.getNode(name);
        Set<String> children;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        long zxid;
        synchronized (n) { // keep findbugs happy
            System.out.println(name);
            printStat(n.stat);
            zxid = Math.max(n.stat.getMzxid(), n.stat.getPzxid());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
            zxid = Math.max(n.stat.getMzxid(), n.stat.getPzxid());
            if (dumpData) {
                System.out.println("  data = " + (n.data == null ? "" : Base64.getEncoder().encodeToString(n.data)));
            } else {
                System.out.println("  dataLength = " + (n.data == null ? 0 : n.data.length));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
                System.out.println("  data = " + (n.data == null ? "" : Base64.getEncoder().encodeToString(n.data)));
            } else {
                System.out.println("  dataLength = " + (n.data == null ? 0 : n.data.length));
            }
            children = n.getChildren();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java

        if (null == n) {
            System.err.println("DataTree Node for " + fullPath + " doesn't exist");
            return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
            : fullPath.substring(fullPath.lastIndexOf("/") + 1);

        System.out.print(",");

        int dataLen;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        }
        if (children != null && children.size() > 0) {
            System.out.print("[" + nodeSB);
            for (String child : children) {
                printZnodeJson(dataTree, fullPath + (fullPath.equals("/") ? "" : "/") + child, encoder);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
                printZnodeJson(dataTree, fullPath + (fullPath.equals("/") ? "" : "/") + child, encoder);
            }
            System.out.print("]");
        } else {
            System.out.print(nodeSB);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
            System.out.print("]");
        } else {
            System.out.print(nodeSB);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java

    private long printZnodeDetails(DataTree dataTree, boolean dumpData) {
        System.out.println(String.format("ZNode Details (count=%d):", dataTree.getNodeCount()));

        final long zxid = printZnode(dataTree, "/", dumpData);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java

        final long zxid = printZnode(dataTree, "/", dumpData);
        System.out.println("----");
        return zxid;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java

    private void printSessionDetails(DataTree dataTree, Map<Long, Integer> sessions) {
        System.out.println("Session Details (sid, timeout, ephemeralCount):");
        for (Map.Entry<Long, Integer> e : sessions.entrySet()) {
            long sid = e.getKey();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        for (Map.Entry<Long, Integer> e : sessions.entrySet()) {
            long sid = e.getKey();
            System.out.println(String.format("%#016x, %d, %d", sid, e.getValue(), dataTree.getEphemerals(sid).size()));
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      if (leftNode != null && rightNode != null) {
        if (debug) {
          System.out.println(String.format("Comparing %s to %s", leftNode.label, rightNode.label));
        }
        int result = leftNode.label.compareTo(rightNode.label);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
        if (result < 0) {
          if (debug) {
            System.out.println("left is less");
          }
          printLeftOnly(leftNode, byteThreshold, nodeThreshold, debug, interactive);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
        } else if (result > 0) {
          if (debug) {
            System.out.println("right is less");
          }
          printRightOnly(rightNode, byteThreshold, nodeThreshold, debug, interactive);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
        } else {
          if (debug) {
            System.out.println("same");
          }
          printBoth(leftNode, rightNode, byteThreshold, nodeThreshold, debug, interactive);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      long end = System.nanoTime();

      System.out.println(String.format("Processed data tree in %f seconds",
          ((((double) end - beginning) / 1000000)) / 1000));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      builder.append(String.format("Node %s found only in left tree. ", node.label));
      printNode(node, builder);
      System.out.println(builder.toString());
    } else if (debug || interactive) {
      System.out.println(String.format("Filtered left node %s of size %d", node.label, node.descendantSize));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      System.out.println(builder.toString());
    } else if (debug || interactive) {
      System.out.println(String.format("Filtered left node %s of size %d", node.label, node.descendantSize));
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      printThresholdInfo(byteThreshold, nodeThreshold);
      for (int i = 0; i < maxDepth; i++) {
        System.out.println(String.format("Analysis for depth %d", i));
        compareLine(left, right, i, byteThreshold, nodeThreshold, debug, interactive);
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      int currentDepth = 0;
      while (currentDepth < maxDepth) {
        System.out.println(String.format("Current depth is %d", currentDepth));
        System.out.println("- Press enter to move to print current depth layer;\n- Type a number to jump to and print all nodes at a given depth;\n- Enter an ABSOLUTE path to print the immediate subtree of a node. Path must start with '/'.");
        String input = scanner.nextLine();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      while (currentDepth < maxDepth) {
        System.out.println(String.format("Current depth is %d", currentDepth));
        System.out.println("- Press enter to move to print current depth layer;\n- Type a number to jump to and print all nodes at a given depth;\n- Enter an ABSOLUTE path to print the immediate subtree of a node. Path must start with '/'.");
        String input = scanner.nextLine();
        printThresholdInfo(byteThreshold, nodeThreshold);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
        if (input.isEmpty()) {
          // input is Enter
          System.out.println(String.format("Analysis for depth %d", currentDepth));
          compareLine(left, right, currentDepth, byteThreshold, nodeThreshold, debug, interactive);
          currentDepth++;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
          // input is a path
          if (input.startsWith("/")){
            System.out.println(String.format("Analysis for node %s", input));
            compareSubtree(left, right, input, byteThreshold, nodeThreshold, debug, interactive);
          } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
              int depth = Integer.parseInt(input);
              if (depth < 0 || depth >= maxDepth) {
                System.out.println(String.format("Depth must be in range [%d, %d]", 0, maxDepth - 1));
                continue;
              }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
              }
              currentDepth = depth;
              System.out.println(String.format("Analysis for depth %d", currentDepth));
              compareLine(left, right, currentDepth, byteThreshold, nodeThreshold, debug, interactive);
            } catch (NumberFormatException ex) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
            } catch (NumberFormatException ex) {
              // input is invalid
              System.out.println(String.format("Input %s is not valid. Depth must be in range [%d, %d]. Path must be an absolute path which starts with '/'.", input, 0, maxDepth - 1));
            }
          }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
          }
        }
        System.out.println("");
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      }
    }
    System.out.println("All layers compared.");
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java

  private static void printThresholdInfo(int byteThreshold, int nodeThreshold) {
    System.out.println(String.format("Printing analysis for nodes difference larger than %d bytes or node count difference larger than %d.", byteThreshold, nodeThreshold));
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
    if (Math.abs(rightNode.descendantSize - leftNode.descendantSize) > byteThreshold
        || Math.abs(rightNode.descendantCount - leftNode.descendantCount) > nodeThreshold) {
      System.out.println(String.format(
          "Node %s found in both trees. Delta: %d bytes, %d descendants",
          leftNode.label,
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
          rightNode.descendantCount - leftNode.descendantCount));
    } else if (debug || interactive) {
      System.out.println(String.format("Filtered node %s of left size %d, right size %d", leftNode.label, leftNode.descendantSize, rightNode.descendantSize));
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java

    if (leftRoot == null && rightRoot == null) {
      System.out.println(String.format("Path %s is neither found in left tree nor right tree.", path));
    } else {
      compareNodes(leftList, rightList, byteThreshold, nodeThreshold, debug, interactive);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      builder.append(String.format("Node %s found only in right tree. ", node.label));
      printNode(node, builder);
      System.out.println(builder.toString());
    } else if (debug || interactive) {
      System.out.println(String.format("Filtered right node %s of size %d", node.label, node.descendantSize));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      System.out.println(builder.toString());
    } else if (debug || interactive) {
      System.out.println(String.format("Filtered right node %s of size %d", node.label, node.descendantSize));
    }
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      parsedOptions = new DefaultParser().parse(options, args);
    } catch (ParseException e) {
      System.err.println(e.getMessage());
      usage();
      ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
    boolean debug = parsedOptions.hasOption(debugOption);
    boolean interactive = parsedOptions.hasOption(interactiveOption);
    System.out.println("Successfully parsed options!");
    TreeInfo leftTree = new TreeInfo(left);
    TreeInfo rightTree = new TreeInfo(right);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
    TreeInfo rightTree = new TreeInfo(right);

    System.out.println(leftTree.toString());
    System.out.println(rightTree.toString());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java

    System.out.println(leftTree.toString());
    System.out.println(rightTree.toString());

    compareTrees(leftTree, rightTree, byteThreshold, nodeThreshold, debug, interactive);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
    fileSnap.deserialize(dataTree, sessions, ia);
    long end = System.nanoTime();
    System.out.println(String.format("Deserialized snapshot in %s in %f seconds", file.getName(),
        (((double) (end - beginning) / 1000000)) / 1000));
    return dataTree;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java

    static void printUsage() {
        System.out.println("Usage:");
        System.out.println("PurgeTxnLog dataLogDir [snapDir] -n count");
        System.out.println("\tdataLogDir -- path to the txn log directory");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java
    static void printUsage() {
        System.out.println("Usage:");
        System.out.println("PurgeTxnLog dataLogDir [snapDir] -n count");
        System.out.println("\tdataLogDir -- path to the txn log directory");
        System.out.println("\tsnapDir -- path to the snapshot directory");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java
        System.out.println("Usage:");
        System.out.println("PurgeTxnLog dataLogDir [snapDir] -n count");
        System.out.println("\tdataLogDir -- path to the txn log directory");
        System.out.println("\tsnapDir -- path to the snapshot directory");
        System.out.println("\tcount -- the number of old snaps/logs you want "
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java
        System.out.println("PurgeTxnLog dataLogDir [snapDir] -n count");
        System.out.println("\tdataLogDir -- path to the txn log directory");
        System.out.println("\tsnapDir -- path to the snapshot directory");
        System.out.println("\tcount -- the number of old snaps/logs you want "
                           + "to keep, value should be greater than or equal to 3");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java
        System.out.println("\tdataLogDir -- path to the txn log directory");
        System.out.println("\tsnapDir -- path to the snapshot directory");
        System.out.println("\tcount -- the number of old snaps/logs you want "
                           + "to keep, value should be greater than or equal to 3");
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java
            result = Integer.parseInt(number);
            if (result < 3) {
                System.err.println(COUNT_ERR_MSG);
                printUsageThenExit();
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java
            }
        } catch (NumberFormatException e) {
            System.err.println("'" + number + "' can not be parsed to integer.");
            printUsageThenExit();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java

            LOG.info(msg);
            System.out.println(msg);

            if (!f.delete()) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java

            if (!f.delete()) {
                System.err.println("Failed to remove " + f.getPath());
            }
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java
        File file = new File(path);
        if (!file.exists()) {
            System.err.println("Path '" + file.getAbsolutePath() + "' does not exist. ");
            printUsageThenExit();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KerberosName.java`
#### Snippet
```java
        int i = 0;
        for (Rule r : rules) {
            System.out.println(++i + " " + r);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KerberosName.java`
#### Snippet
```java
        for (String arg : args) {
            KerberosName name = new KerberosName(arg);
            System.out.println("Name: " + name + " to " + name.getShortName());
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/DigestAuthenticationProvider.java`
#### Snippet
```java
    public static void main(String[] args) throws NoSuchAlgorithmException {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + "->" + generateDigest(args[i]));
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
        ExitCode rc = ExitCode.INVALID_INVOCATION;
        if (args.length != 3) {
            System.out.println("Usage: LogChopper zxid_to_chop_to txn_log_to_chop chopped_filename");
            System.out.println("    this program will read the txn_log_to_chop file and copy all the transactions");
            System.out.println("    from it up to (and including) the given zxid into chopped_filename.");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
        if (args.length != 3) {
            System.out.println("Usage: LogChopper zxid_to_chop_to txn_log_to_chop chopped_filename");
            System.out.println("    this program will read the txn_log_to_chop file and copy all the transactions");
            System.out.println("    from it up to (and including) the given zxid into chopped_filename.");
            ServiceUtils.requestSystemExit(rc.getValue());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
            System.out.println("Usage: LogChopper zxid_to_chop_to txn_log_to_chop chopped_filename");
            System.out.println("    this program will read the txn_log_to_chop file and copy all the transactions");
            System.out.println("    from it up to (and including) the given zxid into chopped_filename.");
            ServiceUtils.requestSystemExit(rc.getValue());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            System.out.println("Got exception: " + e.getMessage());
        }
        ServiceUtils.requestSystemExit(rc.getValue());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java

        if (fhdr.getMagic() != FileTxnLog.TXNLOG_MAGIC) {
            System.err.println("Invalid magic number in txn log file");
            return false;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
            return false;
        }
        System.out.println("ZooKeeper Transactional Log File with dbid "
                           + fhdr.getDbid()
                           + " txnlog format version "
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
                bytes = logStream.readBuffer("txnEntry");
            } catch (EOFException e) {
                System.out.println("EOF reached after " + count + " txns.");
                // returning false because nothing was chopped
                return false;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
                // Since we preallocate, we define EOF to be an
                // empty transaction
                System.out.println("EOF reached after " + count + " txns.");
                // returning false because nothing was chopped
                return false;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
            Record txn = entry.getTxn();
            if (logStream.readByte("EOR") != 'B') {
                System.out.println("Last transaction was partial.");
                throw new EOFException("Last transaction was partial.");
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
                long previousEpoch = ZxidUtils.getEpochFromZxid(previousZxid);
                if (txnEpoch == previousEpoch) {
                    System.out.println(String.format("There is intra-epoch gap between %x and %x", previousZxid, txnZxid));
                } else if (txnCounter != 1) {
                    System.out.println(String.format("There is inter-epoch gap between %x and %x", previousZxid, txnZxid));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
                    System.out.println(String.format("There is intra-epoch gap between %x and %x", previousZxid, txnZxid));
                } else if (txnCounter != 1) {
                    System.out.println(String.format("There is inter-epoch gap between %x and %x", previousZxid, txnZxid));
                }
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
            if (txnZxid > zxid) {
                if (count == 0 || !hasZxid) {
                    System.out.println(String.format("This log does not contain zxid %x", zxid));
                    return false;
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
                    return false;
                }
                System.out.println(String.format("Chopping at %x new log has %d records", zxid, count));
                return true;
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerMain.java`
#### Snippet
```java
            LOG.error("Invalid arguments, exiting abnormally", e);
            LOG.info(USAGE);
            System.err.println(USAGE);
            ZKAuditProvider.addServerStartFailureAuditLog();
            ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerMain.java`
#### Snippet
```java
        } catch (ConfigException e) {
            LOG.error("Invalid config, exiting abnormally", e);
            System.err.println("Invalid config, exiting abnormally");
            ZKAuditProvider.addServerStartFailureAuditLog();
            ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerMain.java`
#### Snippet
```java
        } catch (DatadirException e) {
            LOG.error("Unable to access datadir, exiting abnormally", e);
            System.err.println("Unable to access datadir, exiting abnormally");
            ZKAuditProvider.addServerStartFailureAuditLog();
            ServiceUtils.requestSystemExit(ExitCode.UNABLE_TO_ACCESS_DATADIR.getValue());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerMain.java`
#### Snippet
```java
        } catch (AdminServerException e) {
            LOG.error("Unable to start AdminServer, exiting abnormally", e);
            System.err.println("Unable to start AdminServer, exiting abnormally");
            ZKAuditProvider.addServerStartFailureAuditLog();
            ServiceUtils.requestSystemExit(ExitCode.ERROR_STARTING_ADMIN_SERVER.getValue());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ControllerService.java`
#### Snippet
```java
            new ControllerService().start(config);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.err.println("Usage: TestControllerMain controller-port configfile");
            ServiceUtils.requestSystemExit(ExitCode.UNEXPECTED_ERROR.getValue());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ControllerService.java`
#### Snippet
```java
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.err.println("Usage: TestControllerMain controller-port configfile");
            ServiceUtils.requestSystemExit(ExitCode.UNEXPECTED_ERROR.getValue());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
            txnStr);
        if (prefix != null && !"".equals(prefix.trim())) {
            System.out.print(prefix + " - ");
        }
        if (txns.endsWith("\n")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
        }
        if (txns.endsWith("\n")) {
            System.out.print(txns);
        } else {
            System.out.println(txns);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
            System.out.print(txns);
        } else {
            System.out.println(txns);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
    private boolean askForFix(Scanner scanner) throws TxnLogToolkitException {
        while (true) {
            System.out.print("Would you like to fix it (Yes/No/Abort) ? ");
            char answer = Character.toUpperCase(scanner.next().charAt(0));
            switch (answer) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
    private void printStat() {
        if (recoveryMode) {
            System.out.printf("Recovery file %s has been written with %d fixed CRC error(s)%n", recoveryLogFile, crcFixed);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
                txnLogFile.getName());
        }
        System.out.println("ZooKeeper Transactional Log File with dbid " + fhdr.getDbid()
                           + " txnlog format version " + fhdr.getVersion());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
                bytes = logStream.readBuffer("txnEntry");
            } catch (EOFException e) {
                System.out.println("EOF reached after " + count + " txns.");
                return;
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
                // Since we preallocate, we define EOF to be an
                // empty transaction
                System.out.println("EOF reached after " + count + " txns.");
                return;
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
            }
        } catch (TxnLogToolkitParseException e) {
            System.err.println(e.getMessage() + "\n");
            printHelpAndExit(e.getExitCode(), e.getOptions());
        } catch (TxnLogToolkitException e) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
            printHelpAndExit(e.getExitCode(), e.getOptions());
        } catch (TxnLogToolkitException e) {
            System.err.println(e.getMessage());
            ServiceUtils.requestSystemExit(e.getExitCode());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            System.out.println("Got exception: " + e.getMessage());
        }
    }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/SecurityUtils.java`
#### Snippet
```java
            return null;
        }
        return principalConfig.split("[/]");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            String hostPort = addr.getHostString() + ":" + addr.getPort();
            MDC.put("myid", hostPort);
            setName(getName().replaceAll("\\(.*\\)", "(" + hostPort + ")"));
            if (clientConfig.isSaslClientEnabled()) {
                try {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java

            // jute toString is horrible, remove unnecessary newlines
            return sb.toString().replaceAll("\r*\n+", " ");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
     */
    private static String makeThreadName(String suffix) {
        String name = Thread.currentThread().getName().replaceAll("-EventThread", "");
        return name + suffix;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    static String[] getDefaultCipherSuitesForJavaVersion(String javaVersion) {
        Objects.requireNonNull(javaVersion);
        if (javaVersion.matches("\\d+")) {
            // Must be Java 9 or later
            LOG.debug("Using Java9+ optimized cipher suites for Java version {}", javaVersion);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java

                // Input may be delimited by either commas or newlines so convert to common newline separated format
                newMembers = newMembers.replaceAll(",", "\n");

                try {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ConfigUtils.java`
#### Snippet
```java
                return nsa;
            }
            return new String[]{s.replaceAll("\\[|\\]", "")};
        } else {
            return s.split(":");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ConfigUtils.java`
#### Snippet
```java
            return newKeyValue.trim();
        }
        String oldPropertyKey = newPropertyKey.replace("zookeeper.", "");
        String oldKeyValue = System.getProperty(oldPropertyKey);

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/SaslQuorumServerCallbackHandler.java`
#### Snippet
```java
        // ensemble and will reject it.
        if (authzFlag) {
            String[] components = authorizationID.split("[/@]");
            if (components.length == 3) {
                authzFlag = authzHosts.contains(components[1]);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/embedded/ZooKeeperServerEmbeddedImpl.java`
#### Snippet
```java
        if (confAddress != null) {
            return confAddress.getHostString()
                .replace("0.0.0.0", "localhost")
                .replace("0:0:0:0:0:0:0:0", "localhost")
                + ":" + boundPort;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/embedded/ZooKeeperServerEmbeddedImpl.java`
#### Snippet
```java
            return confAddress.getHostString()
                .replace("0.0.0.0", "localhost")
                .replace("0:0:0:0:0:0:0:0", "localhost")
                + ":" + boundPort;
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java

    public String getCppFQName() {
        return mFQName.replaceAll("\\.", "::");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java

    public String getCppNameSpace() {
        return mModule.replaceAll("\\.", "::");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
    public void genJavaCode(File outputDirectory) throws IOException {
        String pkg = getJavaPackage();
        String pkgpath = pkg.replaceAll("\\.", "/");
        File pkgdir = new File(outputDirectory, pkgpath);
        if (!pkgdir.exists()) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
    public void genCppCode(FileWriter hh, FileWriter cc)
            throws IOException {
        String[] ns = getCppNameSpace().split("::");
        for (int i = 0; i < ns.length; i++) {
            hh.write("namespace " + ns[i] + " {\n");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
    public JRecord(String name, ArrayList<JField> flist) {
        super("struct " + name.substring(name.lastIndexOf('.') + 1),
                name.replaceAll("\\.", "::"), getCsharpFQName(name), name, "Record", name, getCsharpFQName("IRecord"));
        mFQName = name;
        int idx = name.lastIndexOf('.');
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `CliCommand()` of an abstract class should not be declared 'public'
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/CliCommand.java`
#### Snippet
```java
     * @param optionStr the string used to call this command
     */
    public CliCommand(String cmdStr, String optionStr) {
        this.out = System.out;
        this.err = System.err;
```

### NonProtectedConstructorInAbstractClass
Constructor `KeeperException()` of an abstract class should not be declared 'public'
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
    private String path;

    public KeeperException(Code code) {
        this.code = code;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `X509Util()` of an abstract class should not be declared 'public'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    }

    public X509Util(ZKConfig zkConfig) {
        this.zkConfig = zkConfig;
        keyStoreFileWatcher = trustStoreFileWatcher = null;
```

### NonProtectedConstructorInAbstractClass
Constructor `X509Util()` of an abstract class should not be declared 'public'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private FileChangeWatcher trustStoreFileWatcher;

    public X509Util() {
        this(null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Shell()` of an abstract class should not be declared 'public'
in `zookeeper-server/src/main/java/org/apache/zookeeper/Shell.java`
#### Snippet
```java
     *        command.
     */
    public Shell(long interval) {
        this.interval = interval;
        this.lastTime = (interval < 0) ? 0 : -interval;
```

### NonProtectedConstructorInAbstractClass
Constructor `Shell()` of an abstract class should not be declared 'public'
in `zookeeper-server/src/main/java/org/apache/zookeeper/Shell.java`
#### Snippet
```java
    private volatile AtomicBoolean completed;

    public Shell() {
        this(0L);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSelectThread()` of an abstract class should not be declared 'public'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxnFactory.java`
#### Snippet
```java
        protected final Selector selector;

        public AbstractSelectThread(String name) throws IOException {
            super(name);
            // Allows the JVM to shutdown even if this thread is still running.
```

### NonProtectedConstructorInAbstractClass
Constructor `WatchRegistration()` of an abstract class should not be declared 'public'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
        private String clientPath;

        public WatchRegistration(Watcher watcher, String clientPath) {
            this.watcher = watcher;
            this.clientPath = clientPath;
```

### NonProtectedConstructorInAbstractClass
Constructor `ServerCnxn()` of an abstract class should not be declared 'public'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
    }

    public ServerCnxn(final ZooKeeperServer zkServer) {
        this.zkServer = zkServer;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `LearnerZooKeeperServer()` of an abstract class should not be declared 'public'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerZooKeeperServer.java`
#### Snippet
```java
    protected SyncRequestProcessor syncProcessor;

    public LearnerZooKeeperServer(FileTxnSnapLog logFactory, int tickTime, int minSessionTimeout, int maxSessionTimeout, int listenBacklog, ZKDatabase zkDb, QuorumPeer self) throws IOException {
        super(logFactory, tickTime, minSessionTimeout, maxSessionTimeout, listenBacklog, zkDb, self);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFourLetterCommand()` of an abstract class should not be declared 'public'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/command/AbstractFourLetterCommand.java`
#### Snippet
```java
    protected ServerCnxnFactory factory;

    public AbstractFourLetterCommand(PrintWriter pw, ServerCnxn serverCnxn) {
        this.pw = pw;
        this.serverCnxn = serverCnxn;
```

## RuleId[ruleID=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'jline.console.completer.Completer'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
                Object completor = completorC.getConstructor(ZooKeeper.class).newInstance(zk);
                Method addCompletor = consoleC.getMethod("addCompleter", Class.forName("jline.console.completer.Completer"));
                addCompletor.invoke(console, completor);

                String line;
```

### JavaReflectionInvocation
Argument is not assignable to 'java.lang.String'
in `zookeeper-server/src/main/java/org/apache/zookeeper/jmx/ManagedUtil.java`
#### Snippet
```java
                                                  .getMethod("getName", (Class<?>[]) null)
                                                  .invoke(rootLogger, (Object[]) null);
                hdm.getClass().getMethod("addLoggerMBean", String.class).invoke(hdm, rootLoggerName);

                // Get each logger from the Log4J Repository and add it to the
```

### JavaReflectionInvocation
Argument is not assignable to 'java.lang.String'
in `zookeeper-server/src/main/java/org/apache/zookeeper/jmx/ManagedUtil.java`
#### Snippet
```java
                                              .getMethod("getName", (Class<?>[]) null)
                                              .invoke(logger, (Object[]) null);
                    hdm.getClass().getMethod("addLoggerMBean", String.class).invoke(hdm, loggerName);
                }
            } catch (Exception e) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `zookeeper-server/src/main/java/org/apache/zookeeper/JLineZNodeCompleter.java`
#### Snippet
```java
    public int complete(String buffer, int cursor, List candidates) {
        // Guarantee that the final token is the one we're expanding
        buffer = buffer.substring(0, cursor);
        String token = "";
        if (!buffer.endsWith(" ")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `p`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNetty.java`
#### Snippet
```java
                break;
            }
            p = outgoingQueue.remove();
        }
        // TODO: maybe we should flush in the loop above every N packets/bytes?
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `zookeeper-server/src/main/java/org/apache/zookeeper/jmx/MBeanRegistry.java`
#### Snippet
```java
                continue;
            }
            sb.append("name").append(index++).append("=").append(s).append(",");
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `connectString`
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ConnectStringParser.java`
#### Snippet
```java
                this.chrootPath = chrootPath;
            }
            connectString = connectString.substring(0, off);
        } else {
            this.chrootPath = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `configFile`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKConfig.java`
#### Snippet
```java
        LOG.info("Reading configuration from: {}", configFile.getAbsolutePath());
        try {
            configFile = (new VerifyingFileFactory.Builder(LOG).warnForRelativePath()
                                                               .failForNonExistingPath()
                                                               .build()).validate(configFile);
```

### AssignmentToMethodParameter
Assignment to method parameter `out`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/IOUtils.java`
#### Snippet
```java
            if (close) {
                out.close();
                out = null;
                in.close();
                in = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `in`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/IOUtils.java`
#### Snippet
```java
                out = null;
                in.close();
                in = null;
            }
        } finally {
```

### AssignmentToMethodParameter
Assignment to method parameter `trustStorePassword`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
        final boolean clientHostnameVerificationEnabled) throws TrustManagerException {
        if (trustStorePassword == null) {
            trustStorePassword = "";
        }
        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `keyStorePassword`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
        String keyStoreTypeProp) throws KeyManagerException {
        if (keyStorePassword == null) {
            keyStorePassword = "";
        }
        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DigestCalculator.java`
#### Snippet
```java
        // to avoid mismatch.
        if (path.equals("/")) {
            path = "";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ByteBufferInputStream.java`
#### Snippet
```java
            return 0;
        }
        n = Math.min(n, bb.remaining());
        bb.position(bb.position() + (int) n);
        return n;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ByteBufferInputStream.java`
#### Snippet
```java
        }
        if (len > bb.remaining()) {
            len = bb.remaining();
        }
        bb.get(b, off, len);
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/DigestAuthenticationProvider.java`
#### Snippet
```java

    private static char encode(int i) {
        i &= 0x3f;
        if (i < 26) {
            return (char) ('A' + i);
```

### AssignmentToMethodParameter
Assignment to method parameter `passwd`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
        if (passwd == null) {
            // Possible since it's just deserialized from a packet on the wire.
            passwd = new byte[0];
        }
        long sessionId = sessionTracker.createSession(timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `oldMode`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatcherModeManager.java`
#### Snippet
```java
    private void adjustRecursiveQty(WatcherMode oldMode, WatcherMode newMode) {
        if (oldMode == null) {
            oldMode = WatcherMode.DEFAULT_WATCHER_MODE;
        }
        if (oldMode.isRecursive() != newMode.isRecursive()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/RequestPathMetricsCollector.java`
#### Snippet
```java
            sb.append(pathTokenizer.nextToken());
        }
        path = sb.toString();
        return path;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `maxInProcessingDeadWatchers`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatcherCleaner.java`
#### Snippet
```java
        int suggestedMaxInProcessingThreshold = watcherCleanThreshold * watcherCleanThreadsNum;
        if (maxInProcessingDeadWatchers > 0 && maxInProcessingDeadWatchers < suggestedMaxInProcessingThreshold) {
            maxInProcessingDeadWatchers = suggestedMaxInProcessingThreshold;
            LOG.info(
                "The maxInProcessingDeadWatchers config is smaller than the suggested one, change it to use {}",
```

### AssignmentToMethodParameter
Assignment to method parameter `parentCVersion`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            nodes.preChange(parentName, parent);
            if (parentCVersion == -1) {
                parentCVersion = parent.stat.getCversion();
                parentCVersion++;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `parentCVersion`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            if (parentCVersion == -1) {
                parentCVersion = parent.stat.getCversion();
                parentCVersion++;
            }
            // There is possibility that we'll replay txns for a node which
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
    public void setCversionPzxid(String path, int newCversion, long zxid) throws KeeperException.NoNodeException {
        if (path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }
        DataNode node = nodes.get(path);
```

### AssignmentToMethodParameter
Assignment to method parameter `newCversion`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        synchronized (node) {
            if (newCversion == -1) {
                newCversion = node.stat.getCversion() + 1;
            }
            if (newCversion > node.stat.getCversion()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `voteSet`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
        if (n.electionEpoch == logicalclock.get()) {
            recvset.put(n.sid, new Vote(n.leader, n.zxid, n.electionEpoch, n.peerEpoch, n.state));
            voteSet = getVoteTracker(recvset, new Vote(n.version, n.leader, n.zxid, n.electionEpoch, n.peerEpoch, n.state));
            if (voteSet.hasAllQuorums() && checkLeader(recvset, n.leader, n.electionEpoch)) {
                setPeerState(n.leader, voteSet);
```

### AssignmentToMethodParameter
Assignment to method parameter `voteSet`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
         */
        outofelection.put(n.sid, new Vote(n.version, n.leader, n.zxid, n.electionEpoch, n.peerEpoch, n.state));
        voteSet = getVoteTracker(outofelection, new Vote(n.version, n.leader, n.zxid, n.electionEpoch, n.peerEpoch, n.state));

        if (voteSet.hasAllQuorums() && checkLeader(outofelection, n.leader, n.electionEpoch)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `lastCommitted`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumOracleMaj.java`
#### Snippet
```java
                            break;
                        } else {
                            lastCommitted = p.request.zxid;
                            outstandingProposal.remove(p);
                        }
```

### AssignmentToMethodParameter
Assignment to method parameter `fileSize`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FilePadding.java`
#### Snippet
```java
            // file size is larger than what we already have
            if (position > fileSize) {
                fileSize = position + preAllocSize;
                fileSize -= fileSize % preAllocSize;
            } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `fileSize`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FilePadding.java`
#### Snippet
```java
            if (position > fileSize) {
                fileSize = position + preAllocSize;
                fileSize -= fileSize % preAllocSize;
            } else {
                fileSize += preAllocSize;
```

### AssignmentToMethodParameter
Assignment to method parameter `fileSize`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FilePadding.java`
#### Snippet
```java
                fileSize -= fileSize % preAllocSize;
            } else {
                fileSize += preAllocSize;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `quorumConfig`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        this.zkDb = new ZKDatabase(this.logFactory);
        if (quorumConfig == null) {
            quorumConfig = new QuorumMaj(quorumPeers);
        }
        setQuorumVerifier(quorumConfig, false);
```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `pendingQueue`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNetty.java`
#### Snippet
```java
                    && (p.requestHeader.getType() != ZooDefs.OpCode.auth)) {
                    p.requestHeader.setXid(cnxn.getXid());
                    synchronized (pendingQueue) {
                        pendingQueue.add(p);
                    }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `pendingQueue`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNIO.java`
#### Snippet
```java
                        && p.requestHeader.getType() != OpCode.ping
                        && p.requestHeader.getType() != OpCode.auth) {
                        synchronized (pendingQueue) {
                            pendingQueue.add(p);
                        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `p`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java

        if (p.cb == null) {
            synchronized (p) {
                p.finished = true;
                p.notifyAll();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `packet`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            watchRegistration,
            watchDeregistration);
        synchronized (packet) {
            if (requestTimeout > 0) {
                // Wait for request completion with timeout
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotRecursiveSummary.java`
#### Snippet
```java
    Set<String> children;
    long dataSum = 0L;
    synchronized (n) { // keep findbugs happy
      if (n.data != null) {
        dataSum += n.data.length;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        Set<String> children;
        long zxid;
        synchronized (n) { // keep findbugs happy
            System.out.println(name);
            printStat(n.stat);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java

        int dataLen;
        synchronized (n) { // keep findbugs happy
            dataLen = (n.data == null) ? 0 : n.data.length;
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java

        Set<String> children;
        synchronized (n) { // keep findbugs happy
            children = n.getChildren();
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                if (n != null) {
                    Set<String> children;
                    synchronized (n) {
                        children = n.getChildren();
                    }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `login`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperSaslServer.java`
#### Snippet
```java

    private SaslServer createSaslServer(final Login login) {
        synchronized (login) {
            Subject subject = login.getSubject();
            return SecurityUtils.createSaslServer(subject, "zookeeper", "zk-sasl-md5", login.callbackHandler, LOG);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `watches`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
            if (shouldAddWatch(rc)) {
                Map<String, Set<Watcher>> watches = getWatches(rc);
                synchronized (watches) {
                    Set<Watcher> watchers = watches.get(clientPath);
                    if (watchers == null) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `childNode`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
            DataNode childNode = dataTree.getNode(childPath);
            long size;
            synchronized (childNode) {
              size = childNode.data == null ? 0 : childNode.data.length;
            }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
            return;
        }
        synchronized (node) {
            limitStats = new StatsTrack(node.data);
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
            return;
        }
        synchronized (node) {
            currentStats = new StatsTrack(node.data);
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/QuotaMetricsUtils.java`
#### Snippet
```java
        }
        final String[] children;
        synchronized (node) {
            children = node.getChildren().toArray(new String[0]);
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `watchers`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManagerOptimized.java`
#### Snippet
```java
                pwriter.println(e.getKey());
                BitHashSet watchers = e.getValue();
                synchronized (watchers) {
                    for (Integer wbit : watchers) {
                        Watcher w = watcherBitIdMap.get(wbit);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `watchers`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManagerOptimized.java`
#### Snippet
```java
        for (Entry<String, BitHashSet> e : pathWatches.entrySet()) {
            BitHashSet watchers = e.getValue();
            synchronized (watchers) {
                Set<Long> ids = new HashSet<>(watchers.size());
                path2ids.put(e.getKey(), ids);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `watchers`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManagerOptimized.java`
#### Snippet
```java
        // Avoid race condition between dead watcher cleaner in
        // WatcherCleaner and iterating here
        synchronized (watchers) {
            for (Integer wBit : watchers) {
                if (suppress != null && suppress.contains(wBit)) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `watchers`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManagerOptimized.java`
#### Snippet
```java
            BitHashSet watchers = e.getValue();
            // avoid race condition with add/remove
            synchronized (watchers) {
                for (Integer wbit : watchers) {
                    Watcher w = watcherBitIdMap.get(wbit);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `tmp`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            Set<String> tmp = entry.getValue();
            if (tmp != null) {
                synchronized (tmp) {
                    for (String path : tmp) {
                        pwriter.println("\t" + path);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            throw new KeeperException.NoNodeException();
        }
        synchronized (n) {
            n.copyStat(stat);
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            ia.readRecord(node, "node");
            nodes.put(path, node);
            synchronized (node) {
                aclCache.addUsage(node.acl);
            }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `parent`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            throw new KeeperException.NoNodeException();
        }
        synchronized (parent) {
            // Add the ACL to ACL cache first, to avoid the ACL not being
            // created race condition during fuzzy snapshot sync.
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `list`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                    ephemerals.put(ephemeralOwner, list);
                }
                synchronized (list) {
                    list.add(path);
                }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        }
        byte[] lastdata = null;
        synchronized (n) {
            lastdata = n.data;
            nodes.preChange(path, n);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `retv`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        }
        Set<String> cloned = null;
        synchronized (retv) {
            cloned = (HashSet<String>) retv.clone();
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `value`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        for (Map.Entry<String, DataNode> entry : nodes.entrySet()) {
            DataNode value = entry.getValue();
            synchronized (value) {
                result += getNodeSize(entry.getKey(), value.data);
            }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            throw new KeeperException.NoNodeException();
        }
        synchronized (n) {
            if (stat != null) {
                n.copyStat(stat);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            throw new KeeperException.NoNodeException();
        }
        synchronized (n) {
            aclCache.removeUsage(n.acl);
            nodes.preChange(path, n);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        String[] children = null;
        int len = 0;
        synchronized (node) {
            Set<String> childs = node.getChildren();
            children = childs.toArray(new String[childs.size()]);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        String[] children = null;
        DataNode nodeCopy;
        synchronized (node) {
            StatPersisted statCopy = new StatPersisted();
            copyStatPersisted(node.stat, statCopy);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java

    public List<ACL> getACL(DataNode node) {
        synchronized (node) {
            return aclCache.convertLong(node.acl);
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `statNode`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            return;
        }
        synchronized (statNode) {
            updatedStat = new StatsTrack(statNode.data);
            updatedStat.setCount(updatedStat.getCount() + countDiff);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            throw new KeeperException.NoNodeException(path);
        }
        synchronized (node) {
            if (newCversion == -1) {
                newCversion = node.stat.getCversion() + 1;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        }
        List<String> children;
        synchronized (n) {
            if (stat != null) {
                n.copyStat(stat);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        DataNode node = getNode(path);
        String[] children = null;
        synchronized (node) {
            Set<String> childs = node.getChildren();
            children = childs.toArray(new String[childs.size()]);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `parent`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            throw new KeeperException.NoNodeException();
        }
        synchronized (parent) {
            nodes.preChange(parentName, parent);
            parent.removeChild(childName);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        }
        nodes.remove(path);
        synchronized (node) {
            aclCache.removeUsage(node.acl);
            nodeDataSize.addAndGet(-getNodeSize(path, node.data));
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `parent`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        // only need to sync on containers and ttls, will update it in a
        // separate patch.
        synchronized (parent) {
            long eowner = node.stat.getEphemeralOwner();
            EphemeralType ephemeralType = EphemeralType.get(eowner);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `nodes`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                Set<String> nodes = ephemerals.get(eowner);
                if (nodes != null) {
                    synchronized (nodes) {
                        nodes.remove(path);
                    }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            // ok we have some match and need to update
            long bytes = 0;
            synchronized (node) {
                bytes = (node.data == null ? 0 : -(node.data.length));
            }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `node`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            return;
        }
        synchronized (node) {
            nodes.preChange(statPath, node);
            node.data = strack.getStatsBytes();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `n`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            throw new KeeperException.NoNodeException();
        }
        synchronized (n) {
            n.copyStat(stat);
            if (watcher != null) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `login`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/SaslQuorumAuthLearner.java`
#### Snippet
```java
        }
        if (login.getSubject() != null) {
            synchronized (login) {
                try {
                    final byte[] retval = Subject.doAs(login.getSubject(), new PrivilegedExceptionAction<byte[]>() {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `outerLockObject`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        QuorumCnxManager qcm = qcmRef.get();
        Object outerLockObject = (qcm != null) ? qcm : QV_LOCK;
        synchronized (outerLockObject) {
            synchronized (QV_LOCK) {
                if (lastSeenQuorumVerifier != null && lastSeenQuorumVerifier.getVersion() > qv.getVersion()) {
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/OpResult.java`
#### Snippet
```java

        public byte[] getData() {
            return data == null ? null : Arrays.copyOf(data, data.length);
        }
        public Stat getStat() {
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/SaslServerPrincipal.java`
#### Snippet
```java
        public WrapperInetAddress getAddress() {
            InetAddress ia = addr.getAddress();
            return ia == null ? null : new WrapperInetAddress(ia);
        }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKUtil.java`
#### Snippet
```java
            return "'" + file.getAbsolutePath() + "' is a directory. it must be a file.";
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNetty.java`
#### Snippet
```java
    SocketAddress getRemoteSocketAddress() {
        Channel copiedChanRef = channel;
        return (copiedChanRef == null) ? null : copiedChanRef.remoteAddress();
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNetty.java`
#### Snippet
```java
    SocketAddress getLocalSocketAddress() {
        Channel copiedChanRef = channel;
        return (copiedChanRef == null) ? null : copiedChanRef.localAddress();
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNIO.java`
#### Snippet
```java
    private Packet findSendablePacket(LinkedBlockingDeque<Packet> outgoingQueue, boolean tunneledAuthInProgres) {
        if (outgoingQueue.isEmpty()) {
            return null;
        }
        // If we've already starting sending the first packet, we better finish
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNIO.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
     */
    public List<OpResult> getResults() {
        return results != null ? new ArrayList<OpResult>(results) : null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/jmx/MBeanRegistry.java`
#### Snippet
```java
    protected ObjectName makeObjectName(String path, ZKMBeanInfo bean) throws MalformedObjectNameException {
        if (path == null) {
            return null;
        }
        StringBuilder beanName = new StringBuilder(DOMAIN + ":");
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/SecurityUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/SecurityUtils.java`
#### Snippet
```java
                                } catch (SaslException e) {
                                    LOG.error("Zookeeper Server failed to create a SaslServer to interact with a client during session initiation", e);
                                    return null;
                                }
                            }
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/SecurityUtils.java`
#### Snippet
```java
            } catch (Exception e) {
                LOG.error("Exception while trying to create SASL client", e);
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/SecurityUtils.java`
#### Snippet
```java
    private static String[] getComponents(String principalConfig) {
        if (principalConfig == null) {
            return null;
        }
        return principalConfig.split("[/]");
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
            return login.getLoginContextName();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
            // ..but consume (with a log message) all other types of exceptions.
            LOG.error("Exception while trying to create SASL client.", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
        }
        // No event ready to emit yet.
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathUtils.java`
#### Snippet
```java
     public static String getTopNamespace(final String path) {
         if (path == null) {
             return null;
         }
         final String[] parts = path.split("/");
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathUtils.java`
#### Snippet
```java
         }
         final String[] parts = path.split("/");
         return parts.length > 1 ? parts[1] : null;
     }
 }
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/KeyStoreFileType.java`
#### Snippet
```java
    public static KeyStoreFileType fromPropertyValue(String propertyValue) {
        if (propertyValue == null || propertyValue.length() == 0) {
            return null;
        }
        return KeyStoreFileType.valueOf(propertyValue.toUpperCase());
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private FileChangeWatcher newFileChangeWatcher(String fileLocation) throws IOException {
        if (fileLocation == null || fileLocation.isEmpty()) {
            return null;
        }
        final Path filePath = Paths.get(fileLocation).toAbsolutePath();
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/StringUtils.java`
#### Snippet
```java
    public static String joinStrings(List<String> list, String delim) {
        Objects.requireNonNull(delim);
        return list == null ? null : String.join(delim, list);
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/Shell.java`
#### Snippet
```java
        // ulimit isn't supported on Windows
        if (WINDOWS) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java
    public synchronized InetSocketAddress getServerAtIndex(int i) {
        if (i < 0 || i >= serverAddresses.size()) {
            return null;
        }
        return serverAddresses.get(i);
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKHostnameVerifier.java`
#### Snippet
```java
    private static String extractCN(final String subjectPrincipal) throws SSLException {
        if (subjectPrincipal == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKHostnameVerifier.java`
#### Snippet
```java
                }
            }
            return null;
        } catch (final InvalidNameException e) {
            throw new SSLException(subjectPrincipal + " is not a valid X500 distinguished name");
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/Request.java`
#### Snippet
```java
            return request.readBytes();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/Request.java`
#### Snippet
```java
            return readRequestRecord(constructor);
        } catch (IOException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxn.java`
#### Snippet
```java
    public InetSocketAddress getRemoteSocketAddress() {
        if (!sock.isOpen()) {
            return null;
        }
        return (InetSocketAddress) sock.socket().getRemoteSocketAddress();
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxn.java`
#### Snippet
```java
    protected ServerStats serverStats() {
        if (zkServer == null) {
            return null;
        }
        return zkServer.serverStats();
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxn.java`
#### Snippet
```java
    public InetAddress getSocketAddress() {
        if (!sock.isOpen()) {
            return null;
        }
        return sock.socket().getInetAddress();
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ConnectionBean.java`
#### Snippet
```java
        InetSocketAddress sockAddr = connection.getRemoteSocketAddress();
        if (sockAddr == null) {
            return null;
        }
        return sockAddr.getAddress().getHostAddress() + ":" + sockAddr.getPort();
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ConnectionBean.java`
#### Snippet
```java
            return res;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxnFactory.java`
#### Snippet
```java

    public static ByteBuffer getDirectBuffer() {
        return directBufferBytes > 0 ? directBuffer.get() : null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DumbWatcher.java`
#### Snippet
```java
    @Override
    protected ServerStats serverStats() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DumbWatcher.java`
#### Snippet
```java
    @Override
    public Certificate[] getClientCertificateChain() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DumbWatcher.java`
#### Snippet
```java
    @Override
    public InetSocketAddress getRemoteSocketAddress() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ResponseCache.java`
#### Snippet
```java
        Entry entry = cache.get(key);
        if (entry == null) {
            return null;
        }
        if (!stat.equals(entry.stat)) {
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ResponseCache.java`
#### Snippet
```java
            // The node has been modified, invalidate cache.
            cache.remove(key);
            return null;
        } else {
            return entry.data;
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ExpiryQueue.java`
#### Snippet
```java
        if (newExpiryTime.equals(prevExpiryTime)) {
            // No change, so nothing to update
            return null;
        }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java

        if (!digestEnabled) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                break;
            default:
                return null;
        }
        long treeDigest = getCurrentTreeDigest() - prevNodeDigest + newNodeDigest;
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
        if (r.getErr() != 0) {
            if (r.getErr() == KeeperException.Code.NONODE.intValue()) {
                return null;
            }
            throw KeeperException.create(KeeperException.Code.get(r.getErr()), clientPath);
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
        }

        return response.getStat().getCzxid() == -1 ? null : response.getStat();
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxn.java`
#### Snippet
```java
    public Certificate[] getClientCertificateChain() {
        if (clientChain == null) {
            return null;
        }
        return Arrays.copyOf(clientChain, clientChain.length);
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxn.java`
#### Snippet
```java
    protected ServerStats serverStats() {
        if (zkServer == null) {
            return null;
        }
        return zkServer.serverStats();
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ReferenceCountedACLCache.java`
#### Snippet
```java
    public synchronized List<ACL> convertLong(Long longVal) {
        if (longVal == null) {
            return null;
        }
        if (longVal == OPEN_UNSAFE_ACL_ID) {
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KeyAuthenticationProvider.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/WrappedAuthenticationProvider.java`
#### Snippet
```java
    static ServerAuthenticationProvider wrap(AuthenticationProvider provider) {
        if (provider == null) {
            return null;
        }
        return (provider instanceof ServerAuthenticationProvider)
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/IPAuthenticationProvider.java`
#### Snippet
```java
        String[] parts = addr.split("\\.", -1);
        if (parts.length != 4) {
            return null;
        }
        byte[] b = new byte[4];
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/IPAuthenticationProvider.java`
#### Snippet
```java
                    b[i] = (byte) v;
                } else {
                    return null;
                }
            } catch (NumberFormatException e) {
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/IPAuthenticationProvider.java`
#### Snippet
```java
                }
            } catch (NumberFormatException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/OSMXBean.java`
#### Snippet
```java
            LOG.warn("Not able to load class or method for com.sun.managment.UnixOperatingSystemMXBean.", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/BitMap.java`
#### Snippet
```java
            T value = bit2Value.get(bit);
            if (value == null) {
                return null;
            }
            value2Bit.remove(value);
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/AuthUtil.java`
#### Snippet
```java
    public static String getUsers(List<Id> authInfo) {
        if (authInfo == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/AuthUtil.java`
#### Snippet
```java
            .collect(Collectors.joining(","));

        return formatted.isEmpty() ? null : formatted;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/AuthUtil.java`
#### Snippet
```java
    public static String getUser(Id id) {
        AuthenticationProvider provider = ProviderRegistry.getProvider(id.getScheme());
        return provider == null ? null : provider.getUserName(id.getId());
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ConfigUtils.java`
#### Snippet
```java
            return oldKeyValue.trim();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
    public static byte[] serializeRequest(Request request) {
        if (request == null || request.getHdr() == null) {
            return null;
        }
        byte[] data = new byte[32];
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/CircularBuffer.java`
#### Snippet
```java
    public synchronized T peek() {
        if (numberOfElements.get() <= 0) {
            return null;
        }
        return buffer[oldest];
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/CircularBuffer.java`
#### Snippet
```java
        if (newSize < 0) {
            numberOfElements.incrementAndGet();
            return null;
        }
        T polled = buffer[oldest];
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/PostCommand.java`
#### Snippet
```java
    @Override
    public CommandResponse runGet(ZooKeeperServer zkServer, Map<String, String> kwargs) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java

    public ResponseCache getReadResponseCache() {
        return isResponseCachingEnabled ? readResponseCache : null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java

    public ResponseCache getGetChildrenResponseCache() {
        return isResponseCachingEnabled ? getChildrenResponseCache : null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/GetCommand.java`
#### Snippet
```java
    @Override
    public CommandResponse runPost(ZooKeeperServer zkServer, InputStream inputStream) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchesReport.java`
#### Snippet
```java
    public Set<String> getPaths(long sessionId) {
        Set<String> s = id2paths.get(sessionId);
        return s != null ? Collections.unmodifiableSet(s) : null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchesPathReport.java`
#### Snippet
```java
    public Set<Long> getSessions(String path) {
        Set<Long> s = path2Ids.get(path);
        return s != null ? Collections.unmodifiableSet(s) : null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/JettyAdminServer.java`
#### Snippet
```java
            if (cmd == null || cmd.equals("/")) {
                printCommandLinks(response);
                return null;
            }
            // Strip leading "/"
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManager.java`
#### Snippet
```java
                ZooTrace.logTraceMessage(LOG, ZooTrace.EVENT_DELIVERY_TRACE_MASK, "No watchers for " + path);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManagerOptimized.java`
#### Snippet
```java
        BitHashSet watchers = remove(path);
        if (watchers == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LeaderZooKeeperServer.java`
#### Snippet
```java
            final Leader leader = getLeader();
            if (leader == null) {
                return null;
            }
            return supplier.apply(leader);
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java
    public Request checkUpgradeSession(Request request) throws IOException, KeeperException {
        if (request.isThrottled()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java
        if ((request.type != OpCode.create && request.type != OpCode.create2 && request.type != OpCode.multi)
            || !upgradeableSessionTracker.isLocalSession(request.sessionId)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java
            }
            if (!containsEphemeralCreate) {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java
            CreateMode createMode = CreateMode.fromFlag(createRequest.getFlags());
            if (!createMode.isEphemeral()) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java

        if (rootZookeeper.equals(lastPrefix) || lastPrefix.isEmpty()) {
            return null;
        } else {
            return lastPrefix;
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Follower.java`
#### Snippet
```java

    public Integer getSyncedObserverSize() {
        return om == null ? null : om.getNumActiveObservers();
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
        int i = filename.lastIndexOf('.');
        if (i < 0 || i >= filename.length()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
            return Long.toHexString(version);
        } catch (NumberFormatException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
    @Override
    public QuorumAuthServer getQuorumAuthServer() {
        return (self == null) ? null : self.authServer;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
        if (pkt == null || pkt.getZxid() > zxid) {
            LOG.debug("ignore missing proposal packet for {}", Long.toHexString(zxid));
            return null;
        }
        if (pkt.getZxid() != zxid) {
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    @Override
    public QuorumAuthServer getQuorumAuthServer() {
        return (self == null) ? null : self.authServer;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumVerifier.java`
#### Snippet
```java

    default String getOraclePath() {
        return null;
    };

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                }
            }
            return null;
        } finally {
            try {
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
            } else {
                LOG.info("Oracle indicates not to follow");
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/Util.java`
#### Snippet
```java
            if (ia.readByte("EOF") != 'B') {
                LOG.error("Last transaction was partial.");
                return null;
            }
            return bytes;
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/Util.java`
#### Snippet
```java
        } catch (EOFException e) {
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-jute/src/main/java/org/apache/jute/RecordReader.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-jute/src/main/java/org/apache/jute/RecordWriter.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-jute/src/main/java/org/apache/jute/BinaryInputArchive.java`
#### Snippet
```java
        int len = in.readInt();
        if (len == -1) {
            return null;
        }
        checkLength(len);
```

### ReturnNull
Return of `null`
in `zookeeper-jute/src/main/java/org/apache/jute/BinaryInputArchive.java`
#### Snippet
```java
        int len = readInt(tag);
        if (len == -1) {
            return null;
        }
        return new BinaryIndex(len);
```

### ReturnNull
Return of `null`
in `zookeeper-jute/src/main/java/org/apache/jute/BinaryInputArchive.java`
#### Snippet
```java
        int len = readInt(tag);
        if (len == -1) {
            return null;
        }
        checkLength(len);
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileSnap.java`
#### Snippet
```java
        List<File> files = findNValidSnapshots(1);
        if (files.size() == 0) {
            return null;
        }
        return files.get(0);
```

### ReturnNull
Return of `null`
in `zookeeper-recipes/zookeeper-recipes-lock/src/main/java/org/apache/zookeeper/recipes/lock/ZNodeName.java`
#### Snippet
```java
        } catch (Exception e) {
            LOG.warn("Number format exception for {}", seq, e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `zookeeper-recipes/zookeeper-recipes-election/src/main/java/org/apache/zookeeper/recipes/leader/LeaderElectionSupport.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-recipes/zookeeper-recipes-queue/src/main/java/org/apache/zookeeper/recipes/queue/DistributedQueue.java`
#### Snippet
```java
            return element();
        } catch (NoSuchElementException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `zookeeper-recipes/zookeeper-recipes-queue/src/main/java/org/apache/zookeeper/recipes/queue/DistributedQueue.java`
#### Snippet
```java
            return remove();
        } catch (NoSuchElementException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `zookeeper-recipes/zookeeper-recipes-queue/src/main/java/org/apache/zookeeper/recipes/queue/DistributedQueue.java`
#### Snippet
```java
        } catch (KeeperException.NoNodeException e) {
            LOG.warn("Unexpected exception", e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `zookeeper-recipes/zookeeper-recipes-queue/src/main/java/org/apache/zookeeper/recipes/queue/DistributedQueue.java`
#### Snippet
```java
            return minName;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        if (configFilename == null) {
            LOG.warn("configFilename is null! This should only happen in tests.");
            return null;
        }
        return configFilename + QuorumPeerConfig.nextDynamicConfigFileSuffix;
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    public InetSocketAddress getClientAddress() {
        final AddressTuple addrs = myAddrs.get();
        return (addrs == null) ? null : addrs.clientAddr;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            return observer.zk;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            return follower.getSyncedObserverSize();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            LOG.info("cannot validate request, observer masters not enabled");
        }
        return null;
    }

```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `cnxnCount`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java
        ipMap.compute(addr, (a, cnxnCount) -> {
            if (cnxnCount == null) {
                cnxnCount = new AtomicInteger();
            }
            cnxnCount.incrementAndGet();
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `path`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/RequestPathMetricsCollector.java`
#### Snippet
```java
            Map<String, Integer> newSlot = new ConcurrentHashMap<>();
            tobeProcessedSlot.stream().filter(path -> path != null).forEach((path) -> {
                path = trimPathDepth(path, maxDepth);
                newSlot.put(path, newSlot.getOrDefault(path, 0) + 1);
            });
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `serverPrincipal` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/SaslServerPrincipal.java`
#### Snippet
```java
            LOG.debug("Canonicalized address to {}", hostName);
        }
        String serverPrincipal = principalUserName + "/" + hostName;
        return serverPrincipal;
    }
```

### UnnecessaryLocalVariable
Local variable `path` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/JLineZNodeCompleter.java`
#### Snippet
```java

    private int completeZNode(String buffer, String token, List<String> candidates) {
        String path = token;
        int idx = path.lastIndexOf("/") + 1;
        String prefix = path.substring(idx);
```

### UnnecessaryLocalVariable
Local variable `saslServer` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/SecurityUtils.java`
#### Snippet
```java
                // TODO: use 'authMech=' value in zoo.cfg.
                try {
                    SaslServer saslServer = Sasl.createSaslServer("DIGEST-MD5", protocol, serverName, null, callbackHandler);
                    return saslServer;
                } catch (SaslException e) {
```

### UnnecessaryLocalVariable
Local variable `saslClient` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/SecurityUtils.java`
#### Snippet
```java
                            serviceName,
                            serviceHostname);
                        SaslClient saslClient = Sasl.createSaslClient(
                            mechs,
                            clientPrincipalName,
```

### UnnecessaryLocalVariable
Local variable `retval` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
            synchronized (login) {
                try {
                    final byte[] retval = Subject.doAs(subject, new PrivilegedExceptionAction<byte[]>() {
                        public byte[] run() throws SaslException {
                            LOG.debug("saslClient.evaluateChallenge(len={})", saslToken.length);
```

### UnnecessaryLocalVariable
Local variable `pp` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/TxnLogProposalIterator.java`
#### Snippet
```java
            byte[] serializedData = Util.marshallTxnEntry(itr.getHeader(), itr.getTxn(), itr.getDigest());

            QuorumPacket pp = new QuorumPacket(Leader.PROPOSAL, itr.getHeader().getZxid(), serializedData, null);
            p.packet = pp;
            p.request = null;
```

### UnnecessaryLocalVariable
Local variable `clientCxnSocket` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
            Constructor<?> clientCxnConstructor = Class.forName(clientCnxnSocketName)
                                                       .getDeclaredConstructor(ZKClientConfig.class);
            ClientCnxnSocket clientCxnSocket = (ClientCnxnSocket) clientCxnConstructor.newInstance(getClientConfig());
            return clientCxnSocket;
        } catch (Exception e) {
```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public void getData(final String path, Watcher watcher, DataCallback cb, Object ctx) {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public void sync(final String path, VoidCallback cb, Object ctx) {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
        Stat stat,
        long ttl) throws KeeperException, InterruptedException {
        final String clientPath = path;
        PathUtils.validatePath(clientPath, createMode.isSequential());
        EphemeralType.validateTTL(createMode, ttl);
```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public void getACL(final String path, Stat stat, ACLCallback cb, Object ctx) {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public List<String> getChildren(final String path, Watcher watcher) throws KeeperException, InterruptedException {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public void setACL(final String path, List<ACL> acl, int version, StatCallback cb, Object ctx) {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public void delete(final String path, int version, VoidCallback cb, Object ctx) {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public void setData(final String path, byte[] data, int version, StatCallback cb, Object ctx) {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public void exists(final String path, Watcher watcher, StatCallback cb, Object ctx) {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
        Object ctx,
        long ttl) {
        final String clientPath = path;
        PathUtils.validatePath(clientPath, createMode.isSequential());
        EphemeralType.validateTTL(createMode, ttl);
```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
        boolean local) throws InterruptedException, KeeperException {
        PathUtils.validatePath(path);
        final String clientPath = path;
        final String serverPath = prependChroot(clientPath);
        WatchDeregistration wcb = new WatchDeregistration(clientPath, watcher, watcherType, local, getWatchManager());
```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
    public void getAllChildrenNumber(final String path, AsyncCallback.AllChildrenNumberCallback cb, Object ctx) {

        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
        List<ACL> acl,
        CreateMode createMode) throws KeeperException, InterruptedException {
        final String clientPath = path;
        PathUtils.validatePath(clientPath, createMode.isSequential());
        EphemeralType.validateTTL(createMode, -1);
```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
        StringCallback cb,
        Object ctx) {
        final String clientPath = path;
        PathUtils.validatePath(clientPath, createMode.isSequential());
        EphemeralType.validateTTL(createMode, -1);
```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
    public int getAllChildrenNumber(final String path) throws KeeperException, InterruptedException {

        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public List<ACL> getACL(final String path, Stat stat) throws KeeperException, InterruptedException {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `ioe` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxnFactory.java`
#### Snippet
```java
            return serverCnxnFactory;
        } catch (Exception e) {
            IOException ioe = new IOException("Couldn't instantiate " + serverCnxnFactoryName, e);
            throw ioe;
        }
```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public void delete(final String path, int version) throws InterruptedException, KeeperException {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public void getChildren(final String path, Watcher watcher, Children2Callback cb, Object ctx) {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public Stat setData(final String path, byte[] data, int version) throws KeeperException, InterruptedException {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
        Watcher watcher,
        Stat stat) throws KeeperException, InterruptedException {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
        Object ctx) {
        PathUtils.validatePath(path);
        final String clientPath = path;
        final String serverPath = prependChroot(clientPath);
        WatchDeregistration wcb = new WatchDeregistration(clientPath, watcher, watcherType, local, getWatchManager());
```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public byte[] getData(final String path, Watcher watcher, Stat stat) throws KeeperException, InterruptedException {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public Stat exists(final String path, Watcher watcher) throws KeeperException, InterruptedException {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public void getChildren(final String path, Watcher watcher, ChildrenCallback cb, Object ctx) {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);

```

### UnnecessaryLocalVariable
Local variable `clientPath` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     */
    public Stat setACL(final String path, List<ACL> acl, int aclVersion) throws KeeperException, InterruptedException {
        final String clientPath = path;
        PathUtils.validatePath(clientPath);
        validateACL(acl);
```

### UnnecessaryLocalVariable
Local variable `b` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/IPAuthenticationProvider.java`
#### Snippet
```java
    // bytes (to distinguish between IPv4 and IPv6
    private byte[] addr2Bytes(String addr) {
        byte[] b = v4addr2Bytes(addr);
        // TODO Write the v6addr2Bytes
        return b;
```

### UnnecessaryLocalVariable
Local variable `ioe` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManagerFactory.java`
#### Snippet
```java
            return watchManager;
        } catch (Exception e) {
            IOException ioe = new IOException("Couldn't instantiate " + watchManagerName, e);
            throw ioe;
        }
```

### UnnecessaryLocalVariable
Local variable `globalOutstandingLimit` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FollowerZooKeeperServer.java`
#### Snippet
```java
    public int getGlobalOutstandingLimit() {
        int divisor = self.getQuorumSize() > 2 ? self.getQuorumSize() - 1 : 1;
        int globalOutstandingLimit = super.getGlobalOutstandingLimit() / divisor;
        return globalOutstandingLimit;
    }
```

### UnnecessaryLocalVariable
Local variable `globalOutstandingLimit` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LeaderZooKeeperServer.java`
#### Snippet
```java
    public int getGlobalOutstandingLimit() {
        int divisor = self.getQuorumSize() > 2 ? self.getQuorumSize() - 1 : 1;
        int globalOutstandingLimit = super.getGlobalOutstandingLimit() / divisor;
        return globalOutstandingLimit;
    }
```

### UnnecessaryLocalVariable
Local variable `map` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerZooKeeperServer.java`
#### Snippet
```java
            return ((LearnerSessionTracker) sessionTracker).snapshot();
        }
        Map<Long, Integer> map = Collections.emptyMap();
        return map;
    }
```

### UnnecessaryLocalVariable
Local variable `retval` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/SaslQuorumAuthLearner.java`
#### Snippet
```java
            synchronized (login) {
                try {
                    final byte[] retval = Subject.doAs(login.getSubject(), new PrivilegedExceptionAction<byte[]>() {
                        public byte[] run() throws SaslException {
                            LOG.debug("saslClient.evaluateChallenge(len={})", saslToken.length);
```

### UnnecessaryLocalVariable
Local variable `getFunc` is redundant
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JType.java`
#### Snippet
```java

    String genCsharpGetSet(String fname, int fIdx) {
        String getFunc = "  public " + getCsharpType() + " " + capitalize(fname) + " { get; set; } ";
        return getFunc;
    }
```

## RuleId[ruleID=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/Util.java`
#### Snippet
```java
            long z1 = Util.getZxidFromName(o1.getName(), prefix);
            long z2 = Util.getZxidFromName(o2.getName(), prefix);
            int result = z1 < z2 ? -1 : (z1 > z2 ? 1 : 0);
            return ascending ? result : -result;
        }
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
                        LOG.info("TGT refresh sleeping until: {}", until.toString());
                        try {
                            Thread.sleep(nextRefresh - now);
                        } catch (InterruptedException ie) {
                            LOG.warn("TGT renewal thread has been interrupted and will exit.");
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SessionTrackerImpl.java`
#### Snippet
```java
                long waitTime = sessionExpiryQueue.getWaitTime();
                if (waitTime > 0) {
                    Thread.sleep(waitTime);
                    continue;
                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxnFactory.java`
#### Snippet
```java
                    long waitTime = cnxnExpiryQueue.getWaitTime();
                    if (waitTime > 0) {
                        Thread.sleep(waitTime);
                        continue;
                    }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/JvmPauseMonitor.java`
#### Snippet
```java
                long startTime = Instant.now().toEpochMilli();
                try {
                    Thread.sleep(sleepTimeMs);
                } catch (InterruptedException ie) {
                    return;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    }
                }
                Thread.sleep(leaderConnectDelayDuringRetryMs);
            }

```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
                        try {
                            close();
                            Thread.sleep(1000);
                        } catch (IOException ie) {
                            LOG.error("Error closing server socket", ie);
```

## RuleId[ruleID=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/RequestThrottler.java`
#### Snippet
```java
    synchronized void throttleSleep(int stallTime) throws InterruptedException {
        ServerMetrics.getMetrics().REQUEST_THROTTLE_WAIT_COUNT.add(1);
        this.wait(stallTime);
    }

```

## RuleId[ruleID=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/StandardTypeFileKeyStoreLoader.java`
#### Snippet
```java
    @Override
    public KeyStore loadTrustStore() throws IOException, GeneralSecurityException {
        try (InputStream inputStream = new FileInputStream(new File(trustStorePath))) {
            KeyStore ts = keyStoreInstance();
            ts.load(inputStream, passwordStringToCharArray(trustStorePassword));
```

### RedundantFileCreation
`new File` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/StandardTypeFileKeyStoreLoader.java`
#### Snippet
```java
    @Override
    public KeyStore loadKeyStore() throws IOException, GeneralSecurityException {
        try (InputStream inputStream = new FileInputStream(new File(keyStorePath))) {
            KeyStore ks = keyStoreInstance();
            ks.load(inputStream, passwordStringToCharArray(keyStorePassword));
```

### RedundantFileCreation
`new File` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
            @Override
            public void write(OutputStream output) throws IOException {
                try (InputStream input = new FileInputStream(new File(configFileStr))) {
                    byte[] buf = new byte[1024];
                    int bytesRead;
```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxn.java`
#### Snippet
```java
        synchronized (outgoingBuffers) {
            for (ByteBuffer buffer : buffers) {
                outgoingBuffers.add(buffer);
            }
            outgoingBuffers.add(packetSentinel);
```

## RuleId[ruleID=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
        long zxid = maxLog;
        try (FileTxnLog txn = new FileTxnLog(logDir); TxnIterator itr = txn.read(maxLog)) {
            while (true) {
                if (!itr.next()) {
                    break;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnSnapLog.java`
#### Snippet
```java
        long startTime = Time.currentElapsedTime();
        try {
            while (true) {
                // iterator points to
                // the first valid txn when initialized
```

## RuleId[ruleID=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
        private String command = null;
        public static final Pattern ARGS_PATTERN = Pattern.compile("\\s*([^\"\']\\S*|\"[^\"]*\"|'[^']*')\\s*");
        public static final Pattern QUOTED_PATTERN = Pattern.compile("^([\'\"])(.*)(\\1)$");

        public MyCommandOptions() {
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
        private List<String> cmdArgs = null;
        private String command = null;
        public static final Pattern ARGS_PATTERN = Pattern.compile("\\s*([^\"\']\\S*|\"[^\"]*\"|'[^']*')\\s*");
        public static final Pattern QUOTED_PATTERN = Pattern.compile("^([\'\"])(.*)(\\1)$");

```

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/FileChangeWatcher.java`
#### Snippet
```java
        LOG.debug("Registering with watch service: {}", dirPath);

        dirPath.register(watchService, new WatchEvent.Kind<?>[]{StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.OVERFLOW});
        state = State.NEW;
        this.watcherThread = new WatcherThread(watchService, callback);
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/Request.java`
#### Snippet
```java
        case OpCode.multiRead:
        case OpCode.whoAmI:
            return false;
        case OpCode.create:
        case OpCode.create2:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/Request.java`
#### Snippet
```java
        switch (type) {
        case OpCode.notification:
            return false;
        case OpCode.check:
        case OpCode.closeSession:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/embedded/ZooKeeperServerEmbeddedImpl.java`
#### Snippet
```java
        switch (exitHandler) {
            case EXIT:
                ServiceUtils.setSystemExitProcedure(ServiceUtils.SYSTEM_EXIT);
                break;
            case LOG_ONLY:
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[/]` can be simplified to '/'
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/SecurityUtils.java`
#### Snippet
```java
            return null;
        }
        return principalConfig.split("[/]");
    }

```

## RuleId[ruleID=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `(i + 1 == chars.length) || chars[i + 1] == '/'`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathUtils.java`
#### Snippet
```java
                 break;
             } else if (c == '.' && lastc == '.') {
                 if (chars[i - 2] == '/' && ((i + 1 == chars.length) || chars[i + 1] == '/')) {
                     reason = "relative paths not allowed @" + i;
                     break;
```

### DuplicateExpressions
Multiple occurrences of `(i + 1 == chars.length) || chars[i + 1] == '/'`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathUtils.java`
#### Snippet
```java
                 }
             } else if (c == '.') {
                 if (chars[i - 1] == '/' && ((i + 1 == chars.length) || chars[i + 1] == '/')) {
                     reason = "relative paths not allowed @" + i;
                     break;
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            sb.append("clientPath:" + clientPath);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManagerOptimized.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(watcherBitIdMap.size()).append(" connections watching ").append(pathSize()).append(" paths\n");
        sb.append("Total watches:").append(size());
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Follower.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Follower ").append(sock);
        sb.append(" lastQueuedZxid:").append(lastQueued);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Observer ").append(sock);
        sb.append(" pendingRevalidationCount:").append(pendingRevalidations.size());
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LearnerHandler ").append(sock);
        sb.append(" tickOfNextAckDeadline:").append(tickOfNextAckDeadline());
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JBuffer.java`
#### Snippet
```java

    public String genJavaSlurpBytes(String b, String s, String l) {
        StringBuilder sb = new StringBuilder();
        sb.append("        {\n");
        sb.append("           int i = org.apache.jute.Utils.readVInt(" + b + ", " + s + ");\n");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JBuffer.java`
#### Snippet
```java

    public String genJavaCompareBytes() {
        StringBuilder sb = new StringBuilder();
        sb.append("        {\n");
        sb.append("           int i1 = org.apache.jute.Utils.readVInt(b1, s1);\n");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JBuffer.java`
#### Snippet
```java

    public String genJavaCompareTo(String fname, String other) {
        StringBuilder sb = new StringBuilder();
        sb.append("    {\n");
        sb.append("      byte[] my = " + fname + ";\n");
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `containsWatcher |= contains_temp`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
                boolean contains_temp = contains(path, watcher,
                        persistentWatches);
                containsWatcher |= contains_temp;
            }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `containsWatcher |= contains_temp`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
                boolean contains_temp = contains(path, watcher,
                        persistentRecursiveWatches);
                containsWatcher |= contains_temp;
            }
            break;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `containsWatcher |= contains_temp`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
            synchronized (existWatches) {
                boolean contains_temp = contains(path, watcher, existWatches);
                containsWatcher |= contains_temp;
            }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `containsWatcher |= contains_temp`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
                boolean contains_temp = contains(path, watcher,
                        persistentWatches);
                containsWatcher |= contains_temp;
            }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `containsWatcher |= contains_temp`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
                boolean contains_temp = contains(path, watcher,
                        persistentRecursiveWatches);
                containsWatcher |= contains_temp;
            }
            break;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `containsWatcher |= contains_temp`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
            synchronized (dataWatches) {
                boolean contains_temp = contains(path, watcher, dataWatches);
                containsWatcher |= contains_temp;
            }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `containsWatcher |= contains_temp`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
            synchronized (existWatches) {
                boolean contains_temp = contains(path, watcher, existWatches);
                containsWatcher |= contains_temp;
            }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `containsWatcher |= contains_temp`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
                boolean contains_temp = contains(path, watcher,
                        persistentWatches);
                containsWatcher |= contains_temp;
            }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `containsWatcher |= contains_temp`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
                boolean contains_temp = contains(path, watcher,
                        persistentRecursiveWatches);
                containsWatcher |= contains_temp;
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removedWatcher |= removedDataWatcher`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
            synchronized (existWatches) {
                boolean removedDataWatcher = removeWatches(existWatches, watcher, clientPath, local, rc, dataWatchersToRem);
                removedWatcher |= removedDataWatcher;
            }
            break;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removedWatcher |= removedDataWatcher`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
            synchronized (dataWatches) {
                boolean removedDataWatcher = removeWatches(dataWatches, watcher, clientPath, local, rc, dataWatchersToRem);
                removedWatcher |= removedDataWatcher;
            }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removedWatcher |= removedDataWatcher`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
            synchronized (existWatches) {
                boolean removedDataWatcher = removeWatches(existWatches, watcher, clientPath, local, rc, dataWatchersToRem);
                removedWatcher |= removedDataWatcher;
            }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removedWatcher |= removedPersistentWatcher`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
                boolean removedPersistentWatcher = removeWatches(persistentWatches,
                        watcher, clientPath, local, rc, persistentWatchersToRem);
                removedWatcher |= removedPersistentWatcher;
            }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `removedWatcher |= removedPersistentRecursiveWatcher`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
                boolean removedPersistentRecursiveWatcher = removeWatches(persistentRecursiveWatches,
                        watcher, clientPath, local, rc, persistentWatchersToRem);
                removedWatcher |= removedPersistentRecursiveWatcher;
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `seenRwServerBefore |= !isRO`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            sessionPasswd = _sessionPasswd;
            changeZkState((isRO) ? States.CONNECTEDREADONLY : States.CONNECTED);
            seenRwServerBefore |= !isRO;
            LOG.info(
                "Session establishment complete on server {}, session id = 0x{}, negotiated timeout = {}{}",
```

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKUtil.java`
#### Snippet
```java
            // Handle race condition where a node is listed
            // but gets deleted before it can be queried
            return; // ignore
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/DigestLoginModule.java`
#### Snippet
```java
            this.subject.getPrivateCredentials().add(password);
        }
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
                cnxn.disableRecv();
            }
            return;
        } else if (h.getType() == OpCode.sasl) {
            processSasl(request, cnxn, h);
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
                // Authentication enforcement is failed
                // Already sent response to user about failure and closed the session, lets return
                return;
            } else {
                Request si = new Request(cnxn, cnxn.getSessionId(), h.getXid(), h.getType(), request, cnxn.getAuthInfo());
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerSessionTracker.java`
#### Snippet
```java
            try {
                localSessionTracker.setOwner(sessionId, owner);
                return;
            } catch (SessionExpiredException e) {
                // Check whether it's a global session. We can ignore those
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerSessionTracker.java`
#### Snippet
```java
            try {
                localSessionTracker.checkSession(sessionId, owner);
                return;
            } catch (UnknownSessionException e) {
                // Check whether it's a global session. We can ignore those
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/NullQuorumAuthLearner.java`
#### Snippet
```java
    @Override
    public void authenticate(Socket sock, String hostname) {
        return; // simply return don't require auth
    }

```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ServiceUtils` has no concrete subclass
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/ServiceUtils.java`
#### Snippet
```java
 * Utilities for service management.
 */
public abstract class ServiceUtils {

    private static final Logger LOG = LoggerFactory.getLogger(ServiceUtils.class);
```

### AbstractClassNeverImplemented
Abstract class `MetricsProviderBootstrap` has no concrete subclass
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/MetricsProviderBootstrap.java`
#### Snippet
```java
 * Utility for bootstrap process of MetricsProviders
 */
public abstract class MetricsProviderBootstrap {

    private static final Logger LOG = LoggerFactory.getLogger(MetricsProviderBootstrap.class);
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Entry`
in `zookeeper-server/src/main/java/org/apache/zookeeper/Environment.java`
#### Snippet
```java
    }

    private static void put(List<Entry> l, String k, String v) {
        l.add(new Entry(k, v));
    }
```

### BoundedWildcard
Can generalize to `? extends Op`
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiOperationRecord.java`
#### Snippet
```java
    }

    public MultiOperationRecord(Iterable<Op> ops) throws IllegalArgumentException {
        for (Op op : ops) {
            setOrCheckOpKind(op.getKind());
```

### BoundedWildcard
Can generalize to `? super String`
in `zookeeper-server/src/main/java/org/apache/zookeeper/JLineZNodeCompleter.java`
#### Snippet
```java
    }

    private int completeCommand(String buffer, String token, List<String> candidates) {
        for (String cmd : ZooKeeperMain.getCommands()) {
            if (cmd.startsWith(token)) {
```

### BoundedWildcard
Can generalize to `? extends Watcher`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
    }

    private void addTo(Set<Watcher> from, Set<Watcher> to) {
        if (from != null) {
            to.addAll(from);
```

### BoundedWildcard
Can generalize to `? super Watcher`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
    }

    private void addTo(Set<Watcher> from, Set<Watcher> to) {
        if (from != null) {
            to.addAll(from);
```

### BoundedWildcard
Can generalize to `? extends Set`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
    }

    private boolean contains(String path, Watcher watcherObj, Map<String, Set<Watcher>> pathVsWatchers) {
        boolean watcherExists = true;
        if (pathVsWatchers == null || pathVsWatchers.size() == 0) {
```

### BoundedWildcard
Can generalize to `? extends Set`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java

    protected boolean removeWatches(
        Map<String, Set<Watcher>> pathVsWatcher,
        Watcher watcher,
        String path,
```

### BoundedWildcard
Can generalize to `? super Watcher`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
        boolean local,
        int rc,
        Set<Watcher> removedWatchers) throws KeeperException {
        if (!local && rc != KeeperException.Code.OK.intValue()) {
            throw KeeperException.create(KeeperException.Code.get(rc), path);
```

### BoundedWildcard
Can generalize to `? super String`
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/CliCommand.java`
#### Snippet
```java
     * @param cmdMap
     */
    public void addToMap(Map<String, CliCommand> cmdMap) {
        cmdMap.put(cmdStr, this);
    }
```

### BoundedWildcard
Can generalize to `? extends OpResult`
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
    }

    void setMultiResults(List<OpResult> results) {
        this.results = results;
    }
```

### BoundedWildcard
Can generalize to `? super CliCommand`
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/CliCommand.java`
#### Snippet
```java
     * @param cmdMap
     */
    public void addToMap(Map<String, CliCommand> cmdMap) {
        cmdMap.put(cmdStr, this);
    }
```

### BoundedWildcard
Can generalize to `? extends Watcher`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
        }

        private void queueEvent(WatchedEvent event, Set<Watcher> materializedWatchers) {
            if (event.getType() == EventType.None && sessionState == event.getState()) {
                return;
```

### BoundedWildcard
Can generalize to `? super WatchEvent`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/FileChangeWatcher.java`
#### Snippet
```java
        final Consumer<WatchEvent<?>> callback;

        WatcherThread(WatchService watchService, Consumer<WatchEvent<?>> callback) {
            super(THREAD_NAME);
            this.watchService = watchService;
```

### BoundedWildcard
Can generalize to `? extends InetSocketAddress`
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java
    }

    private List<InetSocketAddress> shuffle(Collection<InetSocketAddress> serverAddresses) {
        List<InetSocketAddress> tmpList = new ArrayList<>(serverAddresses.size());
        tmpList.addAll(serverAddresses);
```

### BoundedWildcard
Can generalize to `? extends ChangeRecord`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
     * @param pendingChangeRecords
     */
    void rollbackPendingChanges(long zxid, Map<String, ChangeRecord> pendingChangeRecords) {
        synchronized (zks.outstandingChanges) {
            // Grab a list iterator starting at the END of the list so we can iterate in reverse
```

### BoundedWildcard
Can generalize to `? extends Op`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
    }

    private List<OpResult> validatePath(Iterable<Op> ops) {
        List<OpResult> results = new ArrayList<>();
        boolean error = false;
```

### BoundedWildcard
Can generalize to `? extends Op`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
    }

    private MultiOperationRecord generateMultiTransaction(Iterable<Op> ops) {
        // reconstructing transaction with the chroot prefix
        List<Op> transaction = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends TreeInfo.TreeNode`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
  }

  private static void compareNodes(List<TreeInfo.TreeNode> leftList, List<TreeInfo.TreeNode> rightList, int byteThreshold, int nodeThreshold, boolean debug, boolean interactive) {
    Comparator<TreeInfo.TreeNode> alphabeticComparator = TreeInfo.MakeAlphabeticComparator();
    Collections.sort(leftList, alphabeticComparator);
```

### BoundedWildcard
Can generalize to `? extends TreeInfo.TreeNode`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
  }

  private static void compareNodes(List<TreeInfo.TreeNode> leftList, List<TreeInfo.TreeNode> rightList, int byteThreshold, int nodeThreshold, boolean debug, boolean interactive) {
    Comparator<TreeInfo.TreeNode> alphabeticComparator = TreeInfo.MakeAlphabeticComparator();
    Collections.sort(leftList, alphabeticComparator);
```

### BoundedWildcard
Can generalize to `? super Long`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
    }

    public static void deserializeSnapshot(DataTree dt, InputArchive ia, Map<Long, Integer> sessions) throws IOException {
        int count = ia.readInt("count");
        while (count > 0) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
    }

    public static void deserializeSnapshot(DataTree dt, InputArchive ia, Map<Long, Integer> sessions) throws IOException {
        int count = ia.readInt("count");
        while (count > 0) {
```

### BoundedWildcard
Can generalize to `? extends GcTimes`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/JvmPauseMonitor.java`
#### Snippet
```java
    }

    private String formatMessage(long extraSleepTime, Map<String, GcTimes> gcTimesAfterSleep, Map<String, GcTimes> gcTimesBeforeSleep) {

        Set<String> gcBeanNames = new HashSet<>(gcTimesAfterSleep.keySet());
```

### BoundedWildcard
Can generalize to `? super String`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
     * @param response a sink which collects the data.
     */
    public void dumpMonitorValues(BiConsumer<String, Object> response) {
        ServerStats stats = serverStats();
        response.accept("version", Version.getFullVersion());
```

### BoundedWildcard
Can generalize to `? super String`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/QuotaMetricsUtils.java`
#### Snippet
```java

    private static void aggregateQuotaLimitOrUsage(final String namespace,
                                           final Map<String, Number> metricsMap,
                                           final long limitOrUsage) {
        metricsMap.put(namespace, metricsMap.getOrDefault(namespace, 0).longValue() + limitOrUsage);
```

### BoundedWildcard
Can generalize to `? super PathStatsQueue`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/RequestPathMetricsCollector.java`
#### Snippet
```java
    }

    Map<String, Integer> aggregatePaths(int queryMaxDepth, Predicate<PathStatsQueue> predicate) {
        final Map<String, Integer> combinedMap = new HashMap<>(REQUEST_PREPROCESS_TOPPATH_MAX);
        final int maxDepth = Math.min(queryMaxDepth, REQUEST_PREPROCESS_PATH_DEPTH);
```

### BoundedWildcard
Can generalize to `? super Map.Entry`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/RequestPathMetricsCollector.java`
#### Snippet
```java
    }

    void logTopPaths(Map<String, Integer> combinedMap, final Consumer<Map.Entry<String, Integer>> output) {
        combinedMap.entrySet()
                   .stream()
```

### BoundedWildcard
Can generalize to `? super Leader`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LeaderZooKeeperServer.java`
#### Snippet
```java
    }

    private org.apache.zookeeper.metrics.Gauge gaugeWithLeader(Function<Leader, Number> supplier) {
        return () -> {
            final Leader leader = getLeader();
```

### BoundedWildcard
Can generalize to `? extends Number`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LeaderZooKeeperServer.java`
#### Snippet
```java
    }

    private org.apache.zookeeper.metrics.Gauge gaugeWithLeader(Function<Leader, Number> supplier) {
        return () -> {
            final Leader leader = getLeader();
```

### BoundedWildcard
Can generalize to `? super String`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java

    @Override
    public void dumpMonitorValues(BiConsumer<String, Object> response) {
        super.dumpMonitorValues(response);
        response.accept("peer_state", self.getDetailedPeerState());
```

### BoundedWildcard
Can generalize to `? super Socket`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
        private CountDownLatch latch;

        LeaderConnector(InetSocketAddress address, AtomicReference<Socket> socket, CountDownLatch latch) {
            this.address = address;
            this.socket = socket;
```

### BoundedWildcard
Can generalize to `? super String`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverZooKeeperServer.java`
#### Snippet
```java

    @Override
    public void dumpMonitorValues(BiConsumer<String, Object> response) {
        super.dumpMonitorValues(response);
        response.accept("observer_master_id", getObserver().getLearnerMasterId());
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
     * {@link BlockingQueue#poll(long, java.util.concurrent.TimeUnit)}
     */
    private ByteBuffer pollSendQueue(final BlockingQueue<ByteBuffer> queue,
          final long timeout, final TimeUnit unit) throws InterruptedException {
       return queue.poll(timeout, unit);
```

### BoundedWildcard
Can generalize to `? super ByteBuffer`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
     * @param buffer Reference to the buffer to be inserted in the queue
     */
    private void addToSendQueue(final BlockingQueue<ByteBuffer> queue,
        final ByteBuffer buffer) {
        final boolean success = queue.offer(buffer);
```

### BoundedWildcard
Can generalize to `? extends Socket`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
    static final Supplier<Socket> DEFAULT_SOCKET_FACTORY = () -> new Socket();
    private static Supplier<Socket> SOCKET_FACTORY = DEFAULT_SOCKET_FACTORY;
    static void setSocketFactory(Supplier<Socket> factory) {
        SOCKET_FACTORY = factory;
    }
```

### BoundedWildcard
Can generalize to `? super Integer`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerSessionTracker.java`
#### Snippet
```java
    private final ConcurrentMap<Long, Integer> globalSessionsWithTimeouts;

    public LearnerSessionTracker(SessionExpirer expirer, ConcurrentMap<Long, Integer> sessionsWithTimeouts, int tickTime, long id, boolean localSessionsEnabled, ZooKeeperServerListener listener) {
        this.expirer = expirer;
        this.touchTable.set(new ConcurrentHashMap<>());
```

### BoundedWildcard
Can generalize to `? extends Vote`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
     * @param   electionEpoch   epoch id
     */
    protected boolean checkLeader(Map<Long, Vote> votes, long leader, long electionEpoch) {

        boolean predicate = true;
```

### BoundedWildcard
Can generalize to `? super String`
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
        }

        void dump(BiConsumer<String, Object> sink) {
            gauges.forEach((name, metric) -> {
                Number value = metric.get();
```

### BoundedWildcard
Can generalize to `? super String`
in `zookeeper-metrics-providers/zookeeper-prometheus-metrics/src/main/java/org/apache/zookeeper/metrics/prometheus/PrometheusMetricsProvider.java`
#### Snippet
```java
     */
    @Override
    public void dump(BiConsumer<String, Object> sink) {
        sampleGauges();
        Enumeration<Collector.MetricFamilySamples> samplesFamilies = collectorRegistry.metricFamilySamples();
```

### BoundedWildcard
Can generalize to `? extends QuorumServer`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
     * @return The number of followers in the map
     */
    protected static int countParticipants(Map<Long, QuorumServer> peers) {
        int count = 0;
        for (QuorumServer q : peers.values()) {
```

### BoundedWildcard
Can generalize to `? extends QuorumServer`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    private static InetSocketAddress getClientAddress(Map<Long, QuorumServer> quorumPeers, long myid, int clientPort) throws IOException {
        QuorumServer quorumServer = quorumPeers.get(myid);
        if (null == quorumServer) {
```

### BoundedWildcard
Can generalize to `? extends QuorumServer`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    private void updateRemotePeerMXBeans(Map<Long, QuorumServer> newMembers) {
        Set<Long> existingMembers = new HashSet<>(newMembers.keySet());
        existingMembers.retainAll(jmxRemotePeerBean.keySet());
```

### BoundedWildcard
Can generalize to `? super InetSocketAddress`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            + " and client_config is port or host:port";

        private void initializeWithAddressString(String addressStr, Function<InetSocketAddress, InetAddress> getInetAddress) throws ConfigException {
            LearnerType newType = null;
            String[] serverClientParts = addressStr.split(";");
```

### BoundedWildcard
Can generalize to `? extends InetAddress`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            + " and client_config is port or host:port";

        private void initializeWithAddressString(String addressStr, Function<InetSocketAddress, InetAddress> getInetAddress) throws ConfigException {
            LearnerType newType = null;
            String[] serverClientParts = addressStr.split(";");
```

### BoundedWildcard
Can generalize to `? extends InetSocketAddress`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        }

        private List<InetSocketAddress> excludedSpecialAddresses(List<InetSocketAddress> addrs) {
            List<InetSocketAddress> included = new ArrayList<>();

```

## RuleId[ruleID=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
        if (!sendingThreadStarted) {
            // Start sending packets
            new Thread() {
                public void run() {
                    Thread.currentThread().setName("Sender-" + sock.getRemoteSocketAddress());
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
                        // changes in each of election strategy classes which is
                        // unnecessary code coupling.
                        Thread roZkMgr = new Thread() {
                            public void run() {
                                try {
```

## RuleId[ruleID=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
            boolean unimplemented = false;
            for (JField f : mFields) {
                if ((f.getType() instanceof JMap)
                        || (f.getType() instanceof JVector)) {
                    unimplemented = true;
```

### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
            boolean unimplemented = false;
            for (JField f : mFields) {
                if ((f.getType() instanceof JMap)
                        || (f.getType() instanceof JVector)) {
                    unimplemented = true;
```

## RuleId[ruleID=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FollowerRequestProcessor.java`
#### Snippet
```java
    public void run() {
        try {
            while (!finished) {
                ServerMetrics.getMetrics().LEARNER_REQUEST_PROCESSOR_QUEUE_SIZE.add(queuedRequests.size());

```

### WhileLoopSpinsOnField
`while` loop spins on field
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
            ss = this.ss;
        }
        while (listenerRunning) {
            try {
                Socket s = ss.accept();
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverRequestProcessor.java`
#### Snippet
```java
    public void run() {
        try {
            while (!finished) {
                ServerMetrics.getMetrics().LEARNER_REQUEST_PROCESSOR_QUEUE_SIZE.add(queuedRequests.size());

```

## RuleId[ruleID=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/AtomicFileOutputStream.java`
#### Snippet
```java
                    // On windows, renameTo does not replace.
                    if (!origFile.delete() || !tmpFile.renameTo(origFile)) {
                        throw new IOException("Could not rename temporary file " + tmpFile + " to " + origFile);
                    }
                }
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumOracleMaj.java`
#### Snippet
```java
    public boolean updateNeedOracle(List<LearnerHandler> forwardingFollowers) {
        // Do we have the quorum
        needOracle.set(forwardingFollowers.isEmpty() && super.getVotingMembers().size() == 2);
        return needOracle.get();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumOracleMaj.java`
#### Snippet
```java
        }
        QuorumOracleMaj qm = (QuorumOracleMaj) o;
        if (qm.getVersion() == super.getVersion()) {
            return true;
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumOracleMaj.java`
#### Snippet
```java
            return true;
        }
        if (super.getAllMembers().size() != qm.getAllMembers().size()) {
            return false;
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumOracleMaj.java`
#### Snippet
```java
            return false;
        }
        for (QuorumPeer.QuorumServer qs : super.getAllMembers().values()) {
            QuorumPeer.QuorumServer qso = qm.getAllMembers().get(qs.id);
            if (qso == null || !qs.equals(qso)) {
```

## RuleId[ruleID=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/TraceFormatter.java`
#### Snippet
```java
        }
        FileChannel fc = new FileInputStream(args[0]).getChannel();
        while (true) {
            ByteBuffer bb = ByteBuffer.allocate(41);
            fc.read(bb);
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            queuedPackets.add(new QuorumPacket(Leader.UPTODATE, -1, null, null));

            while (true) {
                qp = new QuorumPacket();
                ia.readRecord(qp, "packet");
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/WhoAmICommand.java`
#### Snippet
```java
            if (clientInfos != null) {
                // clientInfos will never be null, added null check to pass static checks
                clientInfos.forEach(clientInfo -> {
                    out.println(clientInfo.getAuthScheme() + ": " + clientInfo.getUser());
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/audit/ZKAuditProvider.java`
#### Snippet
```java
        if (isAuditEnabled()) {
            log(getZKUser(), AuditConstants.OP_START, Result.SUCCESS);
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                log(getZKUser(), AuditConstants.OP_STOP, Result.INVOKED);
            }));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
            throw new IOException("Key/trust store path does not have a parent: " + filePath);
        }
        return new FileChangeWatcher(parentPath, watchEvent -> {
            handleWatchEvent(filePath, watchEvent);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/AuthenticationHelper.java`
#### Snippet
```java
            String enforceAuthSchemesProp = System.getProperty(ENFORCE_AUTH_SCHEMES);
            if (enforceAuthSchemesProp != null) {
                Arrays.stream(enforceAuthSchemesProp.split(",")).forEach(s -> {
                    enforceAuthSchemes.add(s.trim());
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java
            ChannelFuture parentCloseFuture = parentChannel.close();
            if (bossGroup != null) {
                parentCloseFuture.addListener(future -> {
                    bossGroup.shutdownGracefully();
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java
            ChannelGroupFuture allChannelsCloseFuture = allChannels.close();
            if (workerGroup != null) {
                allChannelsCloseFuture.addListener(future -> {
                    workerGroup.shutdownGracefully();
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java

        rootContext.registerGauge("quorum_size", () -> {
            return self.getQuorumSize();
        });
    }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
        public Counter getCounter(String name) {
            return counters.computeIfAbsent(name, (n) -> {
                return new SimpleCounter(n);
            });
        }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java

        void reset() {
            counters.values().forEach(metric -> {
                metric.reset();
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
                metric.reset();
            });
            counterSets.values().forEach(metric -> {
                metric.reset();
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
                metric.reset();
            });
            basicSummaries.values().forEach(metric -> {
                metric.reset();
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
                metric.reset();
            });
            summaries.values().forEach(metric -> {
                metric.reset();
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
                metric.reset();
            });
            basicSummarySets.values().forEach(metric -> {
                metric.reset();
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
                metric.reset();
            });
            summarySets.values().forEach(metric -> {
                metric.reset();
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
            );

            counters.values().forEach(metric -> {
                metric.values().forEach(sink);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
                metric.values().forEach(sink);
            });
            counterSets.values().forEach(metric -> {
                metric.values().forEach(sink);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
                metric.values().forEach(sink);
            });
            basicSummaries.values().forEach(metric -> {
                metric.values().forEach(sink);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
                metric.values().forEach(sink);
            });
            summaries.values().forEach(metric -> {
                metric.values().forEach(sink);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
                metric.values().forEach(sink);
            });
            basicSummarySets.values().forEach(metric -> {
                metric.values().forEach(sink);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
                metric.values().forEach(sink);
            });
            summarySets.values().forEach(metric -> {
                metric.values().forEach(sink);
            });
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
            } else if (key.startsWith("metricsProvider.")) {
                String keyForMetricsProvider = key.substring(16);
                metricsProviderConfiguration.put(keyForMetricsProvider, value);
            } else if (key.equals("multiAddress.enabled")) {
                multiAddressEnabled = parseBoolean(key, value);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/embedded/ZooKeeperServerEmbeddedImpl.java`
#### Snippet
```java
    ZooKeeperServerEmbeddedImpl(Properties p, Path baseDir, ExitHandler exitHandler) throws Exception {
        if (!p.containsKey("dataDir")) {
            p.put("dataDir", baseDir.resolve("data").toAbsolutePath().toString());
        }
        Path configFile = Files.createTempFile(baseDir, "zookeeper.configuration", ".properties");
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `zookeeper-jute/src/main/java/org/apache/jute/InputArchive.java`
#### Snippet
```java
    void readRecord(Record r, String tag) throws IOException;

    void startRecord(String tag) throws IOException;

    void endRecord(String tag) throws IOException;
```

### EmptyMethod
All implementations of this method are empty
in `zookeeper-jute/src/main/java/org/apache/jute/InputArchive.java`
#### Snippet
```java
    void startRecord(String tag) throws IOException;

    void endRecord(String tag) throws IOException;

    Index startVector(String tag) throws IOException;
```

### EmptyMethod
All implementations of this method are empty
in `zookeeper-jute/src/main/java/org/apache/jute/InputArchive.java`
#### Snippet
```java
    Index startVector(String tag) throws IOException;

    void endVector(String tag) throws IOException;

    Index startMap(String tag) throws IOException;
```

### EmptyMethod
All implementations of this method are empty
in `zookeeper-jute/src/main/java/org/apache/jute/InputArchive.java`
#### Snippet
```java
    Index startMap(String tag) throws IOException;

    void endMap(String tag) throws IOException;

}
```

### EmptyMethod
All implementations of this method are empty
in `zookeeper-recipes/zookeeper-recipes-lock/src/main/java/org/apache/zookeeper/recipes/lock/LockListener.java`
#### Snippet
```java
     * released.
     */
    void lockReleased();

}
```

### EmptyMethod
The method is empty
in `zookeeper-recipes/zookeeper-recipes-lock/src/main/java/org/apache/zookeeper/recipes/lock/ProtocolSupport.java`
#### Snippet
```java
     * some custom closing operations to release resources.
     */
    protected void doClose() {

    }
```

### EmptyMethod
Method only calls its super
in `zookeeper-server/src/main/java/org/apache/zookeeper/admin/ZooKeeperAdmin.java`
#### Snippet
```java
     */
    @Override
    public String toString() {
        return super.toString();
    }
```

### EmptyMethod
The method is empty
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/metric/Metric.java`
#### Snippet
```java
    public void add(long value) {
    }
    public void add(int key, long value) {
    }
    public void add(String key, long value) {
```

### EmptyMethod
Method only calls its super
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/NullQuorumAuthLearner.java`
#### Snippet
```java

    @Override
    public void authenticate(Socket sock, String hostname) {
        return; // simply return don't require auth
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiOperationRecord.java`
#### Snippet
```java

    private List<Op> ops = new ArrayList<>();
    private Op.OpKind opKind = null;

    public MultiOperationRecord() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/SaslClientCallbackHandler.java`
#### Snippet
```java
public class SaslClientCallbackHandler implements CallbackHandler {

    private String password = null;
    private static final Logger LOG = LoggerFactory.getLogger(SaslClientCallbackHandler.class);
    private final String entity;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNetty.java`
#### Snippet
```java

        private SSLContext sslContext = null;
        private SSLEngine sslEngine = null;
        private String host;
        private int port;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNetty.java`
#### Snippet
```java
    private class ZKClientPipelineFactory extends ChannelInitializer<SocketChannel> {

        private SSLContext sslContext = null;
        private SSLEngine sslEngine = null;
        private String host;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
    private LoginContext login = null;
    private String loginContextName = null;
    private String principal = null;

    // Initialize 'lastLogin' to do a login at first time
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
    private Thread t = null;
    private boolean isKrbTicket = false;
    private boolean isUsingTicketCache = false;

    private LoginContext login = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
    private Subject subject = null;
    private Thread t = null;
    private boolean isKrbTicket = false;
    private boolean isUsingTicketCache = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java

    private LoginContext login = null;
    private String loginContextName = null;
    private String principal = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
    private boolean isUsingTicketCache = false;

    private LoginContext login = null;
    private String loginContextName = null;
    private String principal = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
      MIN_TIME_BEFORE_RELOGIN_CONFIG_KEY, DEFAULT_MIN_TIME_BEFORE_RELOGIN);

    private Subject subject = null;
    private Thread t = null;
    private boolean isKrbTicket = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java

    private Subject subject = null;
    private Thread t = null;
    private boolean isKrbTicket = false;
    private boolean isUsingTicketCache = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
        private Map<String, String> options = new HashMap<>();
        private List<String> cmdArgs = null;
        private String command = null;
        public static final Pattern ARGS_PATTERN = Pattern.compile("\\s*([^\"\']\\S*|\"[^\"]*\"|'[^']*')\\s*");
        public static final Pattern QUOTED_PATTERN = Pattern.compile("^([\'\"])(.*)(\\1)$");
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
    protected MyCommandOptions cl = new MyCommandOptions();
    protected HashMap<Integer, String> history = new HashMap<>();
    protected int commandCount = 0;
    protected boolean printWatches = true;
    protected int exitCode = ExitCode.EXECUTION_FINISHED.getValue();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java

        private Map<String, String> options = new HashMap<>();
        private List<String> cmdArgs = null;
        private String command = null;
        public static final Pattern ARGS_PATTERN = Pattern.compile("\\s*([^\"\']\\S*|\"[^\"]*\"|'[^']*')\\s*");
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
    protected ZooKeeper zk;
    protected String host = "";
    private CountDownLatch connectLatch = null;

    public boolean getPrintWatches() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
        // Set to true if and only if constructor of ZooKeeperSaslClient
        // throws a LoginException: see startConnect() below.
        private boolean saslLoginFailed = false;

        private void startConnect(InetSocketAddress addr) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
        }

        private InetSocketAddress rwServerAddress = null;

        private static final int minPingRwTimeout = 100;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java

        private volatile boolean wasKilled = false;
        private volatile boolean isRunning = false;

        EventThread() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
     * operation)
     */
    private volatile boolean closing = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
        private volatile KeeperState sessionState = KeeperState.Disconnected;

        private volatile boolean wasKilled = false;
        private volatile boolean isRunning = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
     * then non-zero sessionId is fake, otherwise it is valid.
     */
    volatile boolean seenRwServerBefore = false;

    private final ZKClientConfig clientConfig;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
    private SaslState saslState = SaslState.INITIAL;

    private boolean gotLastPacket = false;
    /** informational message indicating the current configuration status */
    private final String configStatus;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java

    private static final Logger LOG = LoggerFactory.getLogger(ZooKeeperSaslClient.class);
    private Login login = null;
    private SaslClient saslClient;
    private boolean isSASLConfigured = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
    @Deprecated
    public static final String ENABLE_CLIENT_SASL_DEFAULT = "true";
    private volatile boolean initializedLogin = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/compat/ProtocolManager.java`
#### Snippet
```java
 */
public final class ProtocolManager {
    private volatile Boolean isReadonlyAvailable = null;

    public boolean isReadonlyAvailable() {
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/Shell.java`
#### Snippet
```java

    /**Time after which the executing script would be timedout*/
    protected long timeOutInterval = 0L;
    /** If or not script timed out*/
    private AtomicBoolean timedOut;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java
     * The following fields are used to migrate clients during reconfiguration
     */
    private boolean reconfigMode = false;

    private final List<InetSocketAddress> oldServers = new ArrayList<>(5);
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/RateLogger.java`
#### Snippet
```java
    private String msg = null;
    private long timestamp;
    private int count = 0;
    private String value = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/RateLogger.java`
#### Snippet
```java

    private final Logger LOG;
    private String msg = null;
    private long timestamp;
    private int count = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/RateLogger.java`
#### Snippet
```java
    private long timestamp;
    private int count = 0;
    private String value = null;

    public void flush() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/TxnLogProposalIterator.java`
#### Snippet
```java
    public static final TxnLogProposalIterator EMPTY_ITERATOR = new TxnLogProposalIterator();

    private boolean hasNext = false;

    private TxnIterator itr;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/Request.java`
#### Snippet
```java
    private KeeperException e;

    public QuorumVerifier qv = null;

    private TxnDigest txnDigest;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/Request.java`
#### Snippet
```java
     * If this is a create or close request for a local-only session.
     */
    private boolean isLocalSession = false;

    private int largeRequestSize = -1;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/Request.java`
#### Snippet
```java
    private TxnDigest txnDigest;

    private boolean isThrottledFlag = false;

    public boolean isThrottled() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxnFactory.java`
#### Snippet
```java
        private final Collection<SelectorThread> selectorThreads;
        private Iterator<SelectorThread> selectorIterator;
        private volatile boolean reconfiguring = false;

        public AcceptThread(ServerSocketChannel ss, InetSocketAddress addr, Set<SelectorThread> selectorThreads) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
    protected Queue<Proposal> committedLog = new ArrayDeque<>();
    protected ReentrantReadWriteLock logLock = new ReentrantReadWriteLock();
    private volatile boolean initialized = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
     * should never be used otherwise
     */
    private static boolean failCreate = false;

    LinkedBlockingQueue<Request> submittedRequests = new LinkedBlockingQueue<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerConfig.java`
#### Snippet
```java

    /** JVM Pause Monitor feature switch */
    protected boolean jvmPauseMonitorToRun = false;
    /** JVM Pause Monitor warn threshold in ms */
    protected long jvmPauseWarnThresholdMs;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataNode.java`
#### Snippet
```java
     * should be synchronized on except deserializing (for speed up issues).
     */
    private Set<String> children = null;

    private static final Set<String> EMPTY_SET = Collections.emptySet();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NettyServerCnxnFactory.java`
#### Snippet
```java

    public static final String NETTY_ADVANCED_FLOW_CONTROL = "zookeeper.netty.advancedFlowControl.enabled";
    private boolean advancedFlowControlEnabled = false;

    private static final AttributeKey<NettyServerCnxn> CONNECTION_ATTRIBUTE = AttributeKey.valueOf("NettyServerCnxn");
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ReferenceCountedACLCache.java`
#### Snippet
```java
     * these are the number of acls that we have in the datatree
     */
    long aclIndex = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
    abstract void setSessionTimeout(int sessionTimeout);

    protected ZooKeeperSaslServer zooKeeperSaslServer = null;

    public static class CloseRequestException extends IOException {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
     * a connection is still alive (false positive).
     */
    private volatile boolean stale = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java
     * must also be dropped to ensure ordering guarantees.
     */
    private volatile boolean invalid = false;

    abstract int getSessionTimeout();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/ProviderRegistry.java`
#### Snippet
```java
    public static final String AUTHPROVIDER_PROPERTY_PREFIX = "zookeeper.authProvider.";

    private static boolean initialized = false;
    private static final Map<String, AuthenticationProvider> authenticationProviders = new HashMap<>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/VerifyingFileFactory.java`
#### Snippet
```java
    public static class Builder {

        private boolean warnForRelativePathOption = false;
        private boolean failForNonExistingPathOption = false;
        private final Logger log;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/VerifyingFileFactory.java`
#### Snippet
```java

        private boolean warnForRelativePathOption = false;
        private boolean failForNonExistingPathOption = false;
        private final Logger log;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/BitHashSet.java`
#### Snippet
```java

        return new Iterator<Integer>() {
            int returnedCount = 0;
            int bitIndex = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/BitHashSet.java`
#### Snippet
```java

    // To record how many elements in this set.
    private int elementCount = 0;

    public BitHashSet() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/BitHashSet.java`
#### Snippet
```java
        return new Iterator<Integer>() {
            int returnedCount = 0;
            int bitIndex = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/JvmPauseMonitor.java`
#### Snippet
```java
    public static final long INFO_THRESHOLD_DEFAULT = 1000;

    private long numGcWarnThresholdExceeded = 0;
    private long numGcInfoThresholdExceeded = 0;
    private long totalGcExtraSleepTime = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/JvmPauseMonitor.java`
#### Snippet
```java
    private long numGcWarnThresholdExceeded = 0;
    private long numGcInfoThresholdExceeded = 0;
    private long totalGcExtraSleepTime = 0;

    private Thread monitorThread;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/JvmPauseMonitor.java`
#### Snippet
```java

    private long numGcWarnThresholdExceeded = 0;
    private long numGcInfoThresholdExceeded = 0;
    private long totalGcExtraSleepTime = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    protected int listenBacklog = -1;
    protected SessionTracker sessionTracker;
    private FileTxnSnapLog txnLogFactory = null;
    private ZKDatabase zkDb;
    private ResponseCache readResponseCache;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
    private static final int DEFAULT_GLOBAL_OUTSTANDING_LIMIT = 1000;

    private boolean localSessionEnabled = false;
    protected enum State {
        INITIAL,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/ReadAheadEndpoint.java`
#### Snippet
```java
    private final byte[] bytes;
    private int leftToRead;
    private IOException pendingException = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatcherCleaner.java`
#### Snippet
```java
    private final RateLogger RATE_LOGGER = new RateLogger(LOG);

    private volatile boolean stopped = false;
    private final Object cleanEvent = new Object();
    private final Object processingCompletedEvent = new Object();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
    }

    public volatile long lastProcessedZxid = 0;

    public ProcessTxnResult processTxn(TxnHeader header, Record txn, TxnDigest digest) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
    private static final AtomicReference<QuorumPeer.QuorumServer> nextLearnerMaster = new AtomicReference<>();

    private QuorumPeer.QuorumServer currentLearnerMaster = null;

    Observer(QuorumPeer self, ObserverZooKeeperServer observerZooKeeperServer) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
    }

    LearnerSender sender = null;
    protected InputArchive leaderIs;
    protected OutputArchive leaderOs;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FollowerRequestProcessor.java`
#### Snippet
```java
    LinkedBlockingQueue<Request> queuedRequests = new LinkedBlockingQueue<>();

    boolean finished = false;

    public FollowerRequestProcessor(FollowerZooKeeperServer zks, RequestProcessor nextProcessor) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ReadOnlyRequestProcessor.java`
#### Snippet
```java
    private final LinkedBlockingQueue<Request> queuedRequests = new LinkedBlockingQueue<>();

    private volatile boolean finished = false;

    private final RequestProcessor nextProcessor;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected long serverId = UNSET_SERVERID;

    protected QuorumVerifier quorumVerifier = null, lastSeenQuorumVerifier = null;
    protected int snapRetainCount = 3;
    protected int purgeInterval = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected long serverId = UNSET_SERVERID;

    protected QuorumVerifier quorumVerifier = null, lastSeenQuorumVerifier = null;
    protected int snapRetainCount = 3;
    protected int purgeInterval = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
     */
    protected boolean quorumServerRequireSasl = false;
    protected boolean quorumLearnerRequireSasl = false;
    protected boolean quorumEnableSasl = false;
    protected String quorumServicePrincipal = QuorumAuth.QUORUM_KERBEROS_SERVICE_PRINCIPAL_DEFAULT_VALUE;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected int electionAlg = 3;
    protected int electionPort = 2182;
    protected boolean quorumListenOnAllIPs = false;

    protected long serverId = UNSET_SERVERID;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected Properties metricsProviderConfiguration = new Properties();
    protected boolean localSessionsEnabled = false;
    protected boolean localSessionsUpgradingEnabled = false;
    /** defaults to -1 if not set explicitly */
    protected int clientPortListenBacklog = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected File dataLogDir;
    protected String dynamicConfigFileStr = null;
    protected String configFileStr = null;
    protected int tickTime = ZooKeeperServer.DEFAULT_TICK_TIME;
    protected int maxClientCnxns = 60;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected InetSocketAddress secureClientPortAddress;
    protected boolean sslQuorum = false;
    protected boolean shouldUsePortUnification = false;
    protected int observerMasterPort;
    protected boolean sslQuorumReloadCertFiles = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected InetSocketAddress clientPortAddress;
    protected InetSocketAddress secureClientPortAddress;
    protected boolean sslQuorum = false;
    protected boolean shouldUsePortUnification = false;
    protected int observerMasterPort;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected boolean quorumServerRequireSasl = false;
    protected boolean quorumLearnerRequireSasl = false;
    protected boolean quorumEnableSasl = false;
    protected String quorumServicePrincipal = QuorumAuth.QUORUM_KERBEROS_SERVICE_PRINCIPAL_DEFAULT_VALUE;
    protected String quorumLearnerLoginContext = QuorumAuth.QUORUM_LEARNER_SASL_LOGIN_CONTEXT_DFAULT_VALUE;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected String metricsProviderClassName = DefaultMetricsProvider.class.getName();
    protected Properties metricsProviderConfiguration = new Properties();
    protected boolean localSessionsEnabled = false;
    protected boolean localSessionsUpgradingEnabled = false;
    /** defaults to -1 if not set explicitly */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected File dataDir;
    protected File dataLogDir;
    protected String dynamicConfigFileStr = null;
    protected String configFileStr = null;
    protected int tickTime = ZooKeeperServer.DEFAULT_TICK_TIME;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected boolean shouldUsePortUnification = false;
    protected int observerMasterPort;
    protected boolean sslQuorumReloadCertFiles = false;
    protected File dataDir;
    protected File dataLogDir;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java

    private static boolean standaloneEnabled = true;
    private static boolean reconfigEnabled = false;

    protected InetSocketAddress clientPortAddress;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
     * JVM Pause Monitor feature switch
     */
    protected boolean jvmPauseMonitorToRun = false;
    /**
     * JVM Pause Monitor warn threshold in ms
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
     * Configurations for the quorumpeer-to-quorumpeer sasl authentication
     */
    protected boolean quorumServerRequireSasl = false;
    protected boolean quorumLearnerRequireSasl = false;
    protected boolean quorumEnableSasl = false;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    protected QuorumVerifier quorumVerifier = null, lastSeenQuorumVerifier = null;
    protected int snapRetainCount = 3;
    protected int purgeInterval = 0;
    protected boolean syncEnabled = true;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
     */

    volatile boolean shutdown = false;

    /*
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
    private ConcurrentLinkedQueue<QuorumPacket> proposedPkts = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue<QuorumPacket> committedPkts = new ConcurrentLinkedQueue<>();
    private int pktsSize = 0;

    private long lastProposedZxid;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ReadOnlyZooKeeperServer.java`
#### Snippet
```java

    protected final QuorumPeer self;
    private volatile boolean shutdown = false;

    ReadOnlyZooKeeperServer(FileTxnSnapLog logFactory, QuorumPeer self, ZKDatabase zkDb) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    protected final Set<Long> connectingFollowers = new HashSet<>();

    private volatile boolean quitWaitForEpoch = false;
    private volatile long timeStartWaitForEpoch = -1;
    private volatile SyncedLearnerTracker voteSet;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java

    // VisibleForTesting
    protected boolean quorumFormed = false;

    // the follower acceptor thread
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    protected final Set<Long> electingFollowers = new HashSet<>();
    // VisibleForTesting
    protected boolean electionFinished = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java

    // the follower acceptor thread
    volatile LearnerCnxAcceptor cnxAcceptor = null;

    // list of all the learners, including followers and observers
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverRequestProcessor.java`
#### Snippet
```java
    LinkedBlockingQueue<Request> queuedRequests = new LinkedBlockingQueue<>();

    boolean finished = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
        private boolean started = false;
        private long currentZxid = 0;
        private long currentTime = 0;
        private long nextZxid = 0;
        private long nextTime = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
     */
    public static final String FORCE_SNAP_SYNC = "zookeeper.forceSnapshotSync";
    private boolean forceSnapSync = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
        private long currentTime = 0;
        private long nextZxid = 0;
        private long nextTime = 0;

        public synchronized void start() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
     * ZooKeeper server identifier of this learner
     */
    protected long sid = 0;

    long getSid() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
    private class SyncLimitCheck {

        private boolean started = false;
        private long currentZxid = 0;
        private long currentTime = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
        private long currentZxid = 0;
        private long currentTime = 0;
        private long nextZxid = 0;
        private long nextTime = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
     * Keep track of whether we have started send packets thread
     */
    private volatile boolean sendingThreadStarted = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
     * for sync throttling
     */
    private LearnerSyncThrottler syncThrottler = null;

    LearnerHandler(Socket sock, BufferedInputStream bufferedInput, LearnerMaster learnerMaster) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java

        private boolean started = false;
        private long currentZxid = 0;
        private long currentTime = 0;
        private long nextZxid = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/command/WatchCommand.java`
#### Snippet
```java
public class WatchCommand extends AbstractFourLetterCommand {

    int len = 0;
    public WatchCommand(PrintWriter pw, ServerCnxn serverCnxn, int len) {
        super(pw, serverCnxn);
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumMaj.java`
#### Snippet
```java
    private Map<Long, QuorumServer> votingMembers = new HashMap<>();
    private Map<Long, QuorumServer> observingMembers = new HashMap<>();
    private long version = 0;
    protected int half;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/command/SetTraceMaskCommand.java`
#### Snippet
```java
public class SetTraceMaskCommand extends AbstractFourLetterCommand {

    long trace = 0;
    public SetTraceMaskCommand(PrintWriter pw, ServerCnxn serverCnxn, long trace) {
        super(pw, serverCnxn);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/command/FourLetterCommands.java`
#### Snippet
```java
    private static final Set<String> whiteListedCommands = new HashSet<>();

    private static boolean whiteListInitialized = false;

    // @VisibleForTesting
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ControllableConnectionFactory.java`
#### Snippet
```java
public class ControllableConnectionFactory extends NIOServerCnxnFactory {
    private static final Logger LOG = LoggerFactory.getLogger(ControllableConnectionFactory.class);
    private long responseDelayInMs = 0;
    private long remainingRequestsToFail = 0;
    private long remainingResponsesToHold = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ControllableConnectionFactory.java`
#### Snippet
```java
    private long responseDelayInMs = 0;
    private long remainingRequestsToFail = 0;
    private long remainingResponsesToHold = 0;

    public ControllableConnectionFactory() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ControllableConnectionFactory.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(ControllableConnectionFactory.class);
    private long responseDelayInMs = 0;
    private long remainingRequestsToFail = 0;
    private long remainingResponsesToHold = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
        WorkerReceiver wr;
        Thread wsThread = null;
        Thread wrThread = null;

        /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
        WorkerSender ws;
        WorkerReceiver wr;
        Thread wsThread = null;
        Thread wrThread = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/CommandClient.java`
#### Snippet
```java
    private final String hostName;
    private HttpClient client;
    private boolean started = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ControllerService.java`
#### Snippet
```java
    protected QuorumPeerConfig config;
    private ServerCnxnFactory serverCnxnFactory = null;
    protected QuorumPeer quorumPeer = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ControllerService.java`
#### Snippet
```java

    protected QuorumPeerConfig config;
    private ServerCnxnFactory serverCnxnFactory = null;
    protected QuorumPeer quorumPeer = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumHierarchical.java`
#### Snippet
```java
    private HashMap<Long, Long> groupWeight = new HashMap<>();

    private int numGroups = 0;

    private Map<Long, QuorumServer> allMembers = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumHierarchical.java`
#### Snippet
```java
    private Map<Long, QuorumServer> observingMembers = new HashMap<>();

    private long version = 0;

    public int hashCode() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumOracleMaj.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(QuorumOracleMaj.class);

    private String oracle = null;

    private final AtomicBoolean needOracle = new AtomicBoolean(true);
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
    private File recoveryLogFile;
    private FilePadding filePadding = new FilePadding();
    private boolean force = false;

    // chop mode
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java

    private File txnLogFile;
    private boolean recoveryMode = false;
    private boolean verbose = false;
    private FileInputStream txnFis;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
    private File txnLogFile;
    private boolean recoveryMode = false;
    private boolean verbose = false;
    private FileInputStream txnFis;
    private BinaryInputArchive logStream;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java

    // Recovery mode
    private int crcFixed = 0;
    private FileOutputStream recoveryFos;
    private BinaryOutputArchive recoveryOa;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
    long dbId;
    private final Queue<FileOutputStream> streamsToFlush = new ArrayDeque<>();
    File logFileWrite = null;
    private FilePadding filePadding = new FilePadding();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
        static final String CRC_ERROR = "CRC check failed";

        PositionInputStream inputStream = null;
        //stored files is the list of files greater than
        //the zxid we are looking for.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
    volatile BufferedOutputStream logStream = null;
    volatile OutputArchive oa;
    volatile FileOutputStream fos = null;

    File logDir;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java

    long lastZxidSeen;
    volatile BufferedOutputStream logStream = null;
    volatile OutputArchive oa;
    volatile FileOutputStream fos = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileSnap.java`
#### Snippet
```java
    File snapDir;
    SnapshotInfo lastSnapshotInfo = null;
    private volatile boolean close = false;
    private static final int VERSION = 2;
    private static final long dbId = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileSnap.java`
#### Snippet
```java

    File snapDir;
    SnapshotInfo lastSnapshotInfo = null;
    private volatile boolean close = false;
    private static final int VERSION = 2;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
public class JMap extends JCompType {

    private static int level = 0;

    private static String getLevel() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
public class JVector extends JCompType {

    private static int level = 0;

    private static String getId(String id) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        public MultipleAddresses electionAddr = new MultipleAddresses();

        public InetSocketAddress clientAddr = null;

        public long id;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    private AtomicLong leaderId = new AtomicLong(-1);

    private boolean reconfigFlag = false; // indicates that a reconfig just committed

    public synchronized void setPeerState(ServerState newState) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
     * (broadcast and fast leader election).
     */
    protected boolean quorumListenOnAllIPs = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    boolean shuttingDownLE = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    ServerCnxnFactory secureCnxnFactory;

    private FileTxnSnapLog logFactory = null;

    private final QuorumStats quorumStats;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        public LearnerType type = LearnerType.PARTICIPANT;

        public boolean isClientAddrFromStatic = false;

        private List<InetSocketAddress> myAddrs;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
     * False by default to preserve existing behavior.
     */
    protected boolean localSessionsEnabled = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java

    //last proposed quorum verifier
    private QuorumVerifier lastSeenQuorumVerifier = null;

    // Lock object that guard access to quorumVerifier and lastSeenQuorumVerifier.
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    private int nextObserverMaster = 0;
    private QuorumServer nextObserverMaster() {
        if (nextObserverMaster >= observerMasters.size()) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
    }

    private String configFilename = null;

    public int getQuorumSize() {
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `AutoCloseable`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
 *   GCM and Java8 performs better with CBC, so these seem like reasonable defaults.
 */
public abstract class X509Util implements Closeable, AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(X509Util.class);
```

### RedundantImplements
Redundant interface declaration `Closeable`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
 * </pre></blockquote>
 */
public class FileTxnLog implements TxnLog, Closeable {

    private static final Logger LOG;
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
                        LOG.error("Exception while listening to address {}", address, e);

                        if (e instanceof SocketException) {
                            socketException.set(true);
                        }
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `ReconfigInProgress` does not end with 'Exception'
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
     */
    @InterfaceAudience.Public
    public static class ReconfigInProgress extends KeeperException {

        public ReconfigInProgress() {
```

### ExceptionNameDoesntEndWithException
Exception class name `NewConfigNoQuorum` does not end with 'Exception'
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
     */
    @InterfaceAudience.Public
    public static class NewConfigNoQuorum extends KeeperException {

        public NewConfigNoQuorum() {
```

### ExceptionNameDoesntEndWithException
Exception class name `BadFormatString` does not end with 'Exception'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KerberosName.java`
#### Snippet
```java

    @SuppressWarnings("serial")
    public static class BadFormatString extends IOException {

        BadFormatString(String msg) {
```

### ExceptionNameDoesntEndWithException
Exception class name `NoMatchingRule` does not end with 'Exception'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KerberosName.java`
#### Snippet
```java

    @SuppressWarnings("serial")
    public static class NoMatchingRule extends IOException {

        NoMatchingRule(String msg) {
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ConfigUtils.java`
#### Snippet
```java
            return "";
        }
        StringBuffer sb = new StringBuffer();
        boolean first = true;
        String version = "";
```

### StringBufferReplaceableByStringBuilder
`StringBuffer fQName` may be declared as 'StringBuilder'
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
    public static String getCsharpFQName(String name) {
        String[] packages = name.split("\\.");
        StringBuffer fQName = new StringBuffer();
        for (int i = 0; i < packages.length; i++) {
            String pack = packages[i];
```

### StringBufferReplaceableByStringBuilder
`StringBuffer namespace` may be declared as 'StringBuilder'
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
    public String getCsharpNameSpace() {
        String[] parts = mModule.split("\\.");
        StringBuffer namespace = new StringBuffer();
        for (int i = 0; i < parts.length; i++) {
            String capitalized = parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1).toLowerCase();
```

## RuleId[ruleID=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java

    private void printHex(String prefix, long value) {
        System.out.println(String.format("  %s = %#016x", prefix, value));
    }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        DataTree.ZxidDigest targetZxidDigest = dataTree.getDigestFromLoadedSnapshot();
        if (targetZxidDigest != null) {
            System.out.println(String.format("Target zxid digest is: %s, %s",
                    Long.toHexString(targetZxidDigest.zxid), targetZxidDigest.digest));
        }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
                    Long.toHexString(targetZxidDigest.zxid), targetZxidDigest.digest));
        }
        System.out.println(String.format("----%nLast zxid: 0x%s", Long.toHexString(Math.max(fileNameZxid, dtZxid))));
    }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java

    private long printZnodeDetails(DataTree dataTree, boolean dumpData) {
        System.out.println(String.format("ZNode Details (count=%d):", dataTree.getNodeCount()));

        final long zxid = printZnode(dataTree, "/", dumpData);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        for (Map.Entry<Long, Integer> e : sessions.entrySet()) {
            long sid = e.getKey();
            System.out.println(String.format("%#016x, %d, %d", sid, e.getValue(), dataTree.getEphemerals(sid).size()));
        }
    }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      if (leftNode != null && rightNode != null) {
        if (debug) {
          System.out.println(String.format("Comparing %s to %s", leftNode.label, rightNode.label));
        }
        int result = leftNode.label.compareTo(rightNode.label);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      long end = System.nanoTime();

      System.out.println(String.format("Processed data tree in %f seconds",
          ((((double) end - beginning) / 1000000)) / 1000));
    }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      System.out.println(builder.toString());
    } else if (debug || interactive) {
      System.out.println(String.format("Filtered left node %s of size %d", node.label, node.descendantSize));
    }
  }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      printThresholdInfo(byteThreshold, nodeThreshold);
      for (int i = 0; i < maxDepth; i++) {
        System.out.println(String.format("Analysis for depth %d", i));
        compareLine(left, right, i, byteThreshold, nodeThreshold, debug, interactive);
      }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      int currentDepth = 0;
      while (currentDepth < maxDepth) {
        System.out.println(String.format("Current depth is %d", currentDepth));
        System.out.println("- Press enter to move to print current depth layer;\n- Type a number to jump to and print all nodes at a given depth;\n- Enter an ABSOLUTE path to print the immediate subtree of a node. Path must start with '/'.");
        String input = scanner.nextLine();
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
        if (input.isEmpty()) {
          // input is Enter
          System.out.println(String.format("Analysis for depth %d", currentDepth));
          compareLine(left, right, currentDepth, byteThreshold, nodeThreshold, debug, interactive);
          currentDepth++;
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
          // input is a path
          if (input.startsWith("/")){
            System.out.println(String.format("Analysis for node %s", input));
            compareSubtree(left, right, input, byteThreshold, nodeThreshold, debug, interactive);
          } else {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
              int depth = Integer.parseInt(input);
              if (depth < 0 || depth >= maxDepth) {
                System.out.println(String.format("Depth must be in range [%d, %d]", 0, maxDepth - 1));
                continue;
              }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
              }
              currentDepth = depth;
              System.out.println(String.format("Analysis for depth %d", currentDepth));
              compareLine(left, right, currentDepth, byteThreshold, nodeThreshold, debug, interactive);
            } catch (NumberFormatException ex) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
            } catch (NumberFormatException ex) {
              // input is invalid
              System.out.println(String.format("Input %s is not valid. Depth must be in range [%d, %d]. Path must be an absolute path which starts with '/'.", input, 0, maxDepth - 1));
            }
          }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java

  private static void printThresholdInfo(int byteThreshold, int nodeThreshold) {
    System.out.println(String.format("Printing analysis for nodes difference larger than %d bytes or node count difference larger than %d.", byteThreshold, nodeThreshold));
  }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
    if (Math.abs(rightNode.descendantSize - leftNode.descendantSize) > byteThreshold
        || Math.abs(rightNode.descendantCount - leftNode.descendantCount) > nodeThreshold) {
      System.out.println(String.format(
          "Node %s found in both trees. Delta: %d bytes, %d descendants",
          leftNode.label,
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
          rightNode.descendantCount - leftNode.descendantCount));
    } else if (debug || interactive) {
      System.out.println(String.format("Filtered node %s of left size %d, right size %d", leftNode.label, leftNode.descendantSize, rightNode.descendantSize));
    }
  }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java

    if (leftRoot == null && rightRoot == null) {
      System.out.println(String.format("Path %s is neither found in left tree nor right tree.", path));
    } else {
      compareNodes(leftList, rightList, byteThreshold, nodeThreshold, debug, interactive);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      System.out.println(builder.toString());
    } else if (debug || interactive) {
      System.out.println(String.format("Filtered right node %s of size %d", node.label, node.descendantSize));
    }
  }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
    fileSnap.deserialize(dataTree, sessions, ia);
    long end = System.nanoTime();
    System.out.println(String.format("Deserialized snapshot in %s in %f seconds", file.getName(),
        (((double) (end - beginning) / 1000000)) / 1000));
    return dataTree;
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
                long previousEpoch = ZxidUtils.getEpochFromZxid(previousZxid);
                if (txnEpoch == previousEpoch) {
                    System.out.println(String.format("There is intra-epoch gap between %x and %x", previousZxid, txnZxid));
                } else if (txnCounter != 1) {
                    System.out.println(String.format("There is inter-epoch gap between %x and %x", previousZxid, txnZxid));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
                    System.out.println(String.format("There is intra-epoch gap between %x and %x", previousZxid, txnZxid));
                } else if (txnCounter != 1) {
                    System.out.println(String.format("There is inter-epoch gap between %x and %x", previousZxid, txnZxid));
                }
            }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
            if (txnZxid > zxid) {
                if (count == 0 || !hasZxid) {
                    System.out.println(String.format("This log does not contain zxid %x", zxid));
                    return false;
                }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
                    return false;
                }
                System.out.println(String.format("Chopping at %x new log has %d records", zxid, count));
                return true;
            }
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `exitCode` of exception class
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/CliException.java`
#### Snippet
```java
public class CliException extends Exception {

    protected int exitCode;

    protected static final int DEFAULT_EXCEPTION_EXIT_CODE = 1;
```

### NonFinalFieldOfException
Non-final field `code` of exception class
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
    }

    private Code code;

    private String path;
```

### NonFinalFieldOfException
Non-final field `path` of exception class
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
    private Code code;

    private String path;

    public KeeperException(Code code) {
```

### NonFinalFieldOfException
Non-final field `results` of exception class
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
     * these results.
     */
    private List<OpResult> results;

    /**
```

### NonFinalFieldOfException
Non-final field `exitCode` of exception class
in `zookeeper-server/src/main/java/org/apache/zookeeper/Shell.java`
#### Snippet
```java
    public static class ExitCodeException extends IOException {

        int exitCode;

        public ExitCodeException(int exitCode, String message) {
```

### NonFinalFieldOfException
Non-final field `reason` of exception class
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

        private static final long serialVersionUID = -7854505709816442681L;
        private DisconnectReason reason;

        public CloseRequestException(String msg, DisconnectReason reason) {
```

### NonFinalFieldOfException
Non-final field `reason` of exception class
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxn.java`
#### Snippet
```java

        private static final long serialVersionUID = -8255690282104294178L;
        private DisconnectReason reason;

        public EndOfStreamException(String msg, DisconnectReason reason) {
```

### NonFinalFieldOfException
Non-final field `options` of exception class
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java

        private static final long serialVersionUID = 1L;
        private Options options;

        TxnLogToolkitParseException(Options options, int exitCode, String message, Object... params) {
```

### NonFinalFieldOfException
Non-final field `exitCode` of exception class
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java

        private static final long serialVersionUID = 1L;
        private int exitCode;

        TxnLogToolkitException(int exitCode, String message, Object... params) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java

        public String[] getArgArray() {
            return cmdArgs.toArray(new String[0]);
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
                LOG.debug("ServerSaslResponseCallback(): saslToken server response: (length={})", usedata.length);
            } else {
                usedata = new byte[0];
                LOG.debug("ServerSaslResponseCallback(): using empty data[] as server response (length={})", usedata.length);
            }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
    private final ZKClientConfig clientConfig;

    private byte[] saslToken = new byte[0];

    public enum SaslState {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
                sendSaslPacket(cnxn);
            } else {
                byte[] emptyToken = new byte[0];
                sendSaslPacket(emptyToken, cnxn);
            }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/NetUtils.java`
#### Snippet
```java
        } else {
            //Not an IPV6 host port string
            return new String[] {};
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/PemReader.java`
#### Snippet
```java
                             key,
                             keyPassword.orElse("").toCharArray(),
                             certificateChain.toArray(new Certificate[0]));
        return keyStore;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ConnectionBean.java`
#### Snippet
```java
    public String[] getEphemeralNodes() {
        if (zk.getZKDatabase() != null) {
            String[] res = zk.getZKDatabase().getEphemerals(sessionId).toArray(new String[0]);
            Arrays.sort(res);
            return res;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                        for (String joiner : joiningServers) {
                            // joiner should have the following format: server.x = server_spec;client_spec
                            String[] parts = StringUtils.split(joiner, "=").toArray(new String[0]);
                            if (parts.length != 2) {
                                throw new KeeperException.BadArgumentsException("Wrong format of server string");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
        if (passwd == null) {
            // Possible since it's just deserialized from a packet on the wire.
            passwd = new byte[0];
        }
        long sessionId = sessionTracker.createSession(timeout);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/QuotaMetricsUtils.java`
#### Snippet
```java
        final String[] children;
        synchronized (node) {
            children = node.getChildren().toArray(new String[0]);
        }
        if (children.length == 0) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/RequestPathMetricsCollector.java`
#### Snippet
```java
            Map<String, Integer> snapShot = mapReducePaths(
                maxDepth,
                Arrays.asList(currentSlot.get().toArray(new String[0])));
            // Starting from the snapshot and go through the queue to reduce them into one map
            // the iterator can run concurrently with write but we want to use a real lock in the test
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        }

        nodes.put(configZookeeper, new DataNode(new byte[0], -1L, new StatPersisted()));
        try {
            // Reconfig node is access controlled by default (ZOOKEEPER-2014).
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
     * create a /zookeeper filesystem that is the proc filesystem of zookeeper
     */
    private final DataNode procDataNode = new DataNode(new byte[0], -1L, new StatPersisted());

    /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
     * but we usually use the nodes hashmap to find nodes in the tree.
     */
    private DataNode root = new DataNode(new byte[0], -1L, new StatPersisted());

    /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
     * zookeeper
     */
    private final DataNode quotaDataNode = new DataNode(new byte[0], -1L, new StatPersisted());

    public DataTree() {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/SaslQuorumAuthLearner.java`
#### Snippet
```java
            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
            DataInputStream din = new DataInputStream(sock.getInputStream());
            byte[] responseToken = new byte[0];
            sc = SecurityUtils.createSaslClient(
                learnerLogin.getSubject(),
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/SaslQuorumAuthLearner.java`
#### Snippet
```java

            if (sc.hasInitialResponse()) {
                responseToken = createSaslToken(new byte[0], sc, learnerLogin);
            }
            send(dout, responseToken);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/SaslQuorumAuthServer.java`
#### Snippet
```java
                if (dout != null) {
                    // send error message to the learner
                    send(dout, new byte[0], QuorumAuth.Status.ERROR);
                }
            } catch (IOException ioe) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
    }

    static byte[] dummyData = new byte[0];

    /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
            v.add(f);
        }
        return v.toArray(new File[0]);

    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-recipes/zookeeper-recipes-queue/src/main/java/org/apache/zookeeper/recipes/queue/DistributedQueue.java`
#### Snippet
```java
                return true;
            } catch (KeeperException.NoNodeException e) {
                zookeeper.create(dir, new byte[0], acl, CreateMode.PERSISTENT);
            }
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-recipes/zookeeper-recipes-queue/src/main/java/org/apache/zookeeper/recipes/queue/DistributedQueue.java`
#### Snippet
```java
                orderedChildren = orderedChildren(childWatcher);
            } catch (KeeperException.NoNodeException e) {
                zookeeper.create(dir, new byte[0], acl, CreateMode.PERSISTENT);
                continue;
            }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            }
        }
        return l.toArray(new String[0]);
    }

```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `canonicalize` is always 'true'
in `zookeeper-server/src/main/java/org/apache/zookeeper/SaslServerPrincipal.java`
#### Snippet
```java
                ZKClientConfig.ZK_SASL_CLIENT_CANONICALIZE_HOSTNAME,
                canonicalizeText,
                canonicalize);
        }

```

### ConstantValue
Condition `retry >= 0` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
                        String kinitArgs = "-R";
                        int retry = 1;
                        while (retry >= 0) {
                            try {
                                LOG.debug("running ticket cache refresh command: {} {}", cmd, kinitArgs);
```

### ConstantValue
Condition `retry >= 0` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
                    try {
                        int retry = 1;
                        while (retry >= 0) {
                            try {
                                reLogin();
```

### ConstantValue
Condition `rc == KeeperException.Code.OK.intValue() || (local && rc != KeeperException.Code.OK.intValue())` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
        // irrespective of rc. Otherwise shouldn't remove watchers locally
        // when sees failure from server.
        if (rc == KeeperException.Code.OK.intValue() || (local && rc != KeeperException.Code.OK.intValue())) {
            // Remove all the watchers for the given path
            if (watcher == null) {
```

### ConstantValue
Condition `local` is always `true` when reached
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
        // irrespective of rc. Otherwise shouldn't remove watchers locally
        // when sees failure from server.
        if (rc == KeeperException.Code.OK.intValue() || (local && rc != KeeperException.Code.OK.intValue())) {
            // Remove all the watchers for the given path
            if (watcher == null) {
```

### ConstantValue
Condition `local && rc != KeeperException.Code.OK.intValue()` is always `true` when reached
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
        // irrespective of rc. Otherwise shouldn't remove watchers locally
        // when sees failure from server.
        if (rc == KeeperException.Code.OK.intValue() || (local && rc != KeeperException.Code.OK.intValue())) {
            // Remove all the watchers for the given path
            if (watcher == null) {
```

### ConstantValue
Condition `rc != KeeperException.Code.OK.intValue()` is always `true` when reached
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKWatchManager.java`
#### Snippet
```java
        // irrespective of rc. Otherwise shouldn't remove watchers locally
        // when sees failure from server.
        if (rc == KeeperException.Code.OK.intValue() || (local && rc != KeeperException.Code.OK.intValue())) {
            // Remove all the watchers for the given path
            if (watcher == null) {
```

### ConstantValue
Condition `request != null` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                if (request instanceof ConnectRequest) {
                    request.serialize(boa, "connect");
                } else if (request != null) {
                    request.serialize(boa, "request");
                }
```

### ConstantValue
Condition `p.response instanceof SetDataResponse` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                        LOG.warn("Somehow a null cb got to EventThread!");
                    } else if (p.response instanceof ExistsResponse
                               || p.response instanceof SetDataResponse
                               || p.response instanceof SetACLResponse) {
                        StatCallback cb = (StatCallback) p.cb;
```

### ConstantValue
Value `p.response` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                        LOG.warn("Somehow a null cb got to EventThread!");
                    } else if (p.response instanceof ExistsResponse
                               || p.response instanceof SetDataResponse
                               || p.response instanceof SetACLResponse) {
                        StatCallback cb = (StatCallback) p.cb;
```

### ConstantValue
Condition `p.response instanceof SetACLResponse` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                    } else if (p.response instanceof ExistsResponse
                               || p.response instanceof SetDataResponse
                               || p.response instanceof SetACLResponse) {
                        StatCallback cb = (StatCallback) p.cb;
                        if (rc == Code.OK.intValue()) {
```

### ConstantValue
Value `p.response` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                    } else if (p.response instanceof ExistsResponse
                               || p.response instanceof SetDataResponse
                               || p.response instanceof SetACLResponse) {
                        StatCallback cb = (StatCallback) p.cb;
                        if (rc == Code.OK.intValue()) {
```

### ConstantValue
Condition `p.response instanceof ExistsResponse` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                        StatCallback cb = (StatCallback) p.cb;
                        if (rc == Code.OK.intValue()) {
                            if (p.response instanceof ExistsResponse) {
                                cb.processResult(rc, clientPath, p.ctx, ((ExistsResponse) p.response).getStat());
                            } else if (p.response instanceof SetDataResponse) {
```

### ConstantValue
Condition `p.response instanceof GetDataResponse` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null);
                        }
                    } else if (p.response instanceof GetDataResponse) {
                        DataCallback cb = (DataCallback) p.cb;
                        GetDataResponse rsp = (GetDataResponse) p.response;
```

### ConstantValue
Value `p.response` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null);
                        }
                    } else if (p.response instanceof GetDataResponse) {
                        DataCallback cb = (DataCallback) p.cb;
                        GetDataResponse rsp = (GetDataResponse) p.response;
```

### ConstantValue
Condition `p.response instanceof GetACLResponse` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null, null);
                        }
                    } else if (p.response instanceof GetACLResponse) {
                        ACLCallback cb = (ACLCallback) p.cb;
                        GetACLResponse rsp = (GetACLResponse) p.response;
```

### ConstantValue
Value `p.response` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null, null);
                        }
                    } else if (p.response instanceof GetACLResponse) {
                        ACLCallback cb = (ACLCallback) p.cb;
                        GetACLResponse rsp = (GetACLResponse) p.response;
```

### ConstantValue
Condition `p.response instanceof GetChildrenResponse` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null, null);
                        }
                    } else if (p.response instanceof GetChildrenResponse) {
                        ChildrenCallback cb = (ChildrenCallback) p.cb;
                        GetChildrenResponse rsp = (GetChildrenResponse) p.response;
```

### ConstantValue
Value `p.response` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null, null);
                        }
                    } else if (p.response instanceof GetChildrenResponse) {
                        ChildrenCallback cb = (ChildrenCallback) p.cb;
                        GetChildrenResponse rsp = (GetChildrenResponse) p.response;
```

### ConstantValue
Condition `p.response instanceof GetAllChildrenNumberResponse` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null);
                        }
                    } else if (p.response instanceof GetAllChildrenNumberResponse) {
                        AllChildrenNumberCallback cb = (AllChildrenNumberCallback) p.cb;
                        GetAllChildrenNumberResponse rsp = (GetAllChildrenNumberResponse) p.response;
```

### ConstantValue
Value `p.response` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null);
                        }
                    } else if (p.response instanceof GetAllChildrenNumberResponse) {
                        AllChildrenNumberCallback cb = (AllChildrenNumberCallback) p.cb;
                        GetAllChildrenNumberResponse rsp = (GetAllChildrenNumberResponse) p.response;
```

### ConstantValue
Condition `p.response instanceof GetChildren2Response` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, -1);
                        }
                    } else if (p.response instanceof GetChildren2Response) {
                        Children2Callback cb = (Children2Callback) p.cb;
                        GetChildren2Response rsp = (GetChildren2Response) p.response;
```

### ConstantValue
Value `p.response` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, -1);
                        }
                    } else if (p.response instanceof GetChildren2Response) {
                        Children2Callback cb = (Children2Callback) p.cb;
                        GetChildren2Response rsp = (GetChildren2Response) p.response;
```

### ConstantValue
Condition `p.response instanceof CreateResponse` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null, null);
                        }
                    } else if (p.response instanceof CreateResponse) {
                        StringCallback cb = (StringCallback) p.cb;
                        CreateResponse rsp = (CreateResponse) p.response;
```

### ConstantValue
Value `p.response` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null, null);
                        }
                    } else if (p.response instanceof CreateResponse) {
                        StringCallback cb = (StringCallback) p.cb;
                        CreateResponse rsp = (CreateResponse) p.response;
```

### ConstantValue
Condition `p.response instanceof Create2Response` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null);
                        }
                    } else if (p.response instanceof Create2Response) {
                        Create2Callback cb = (Create2Callback) p.cb;
                        Create2Response rsp = (Create2Response) p.response;
```

### ConstantValue
Value `p.response` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null);
                        }
                    } else if (p.response instanceof Create2Response) {
                        Create2Callback cb = (Create2Callback) p.cb;
                        Create2Response rsp = (Create2Response) p.response;
```

### ConstantValue
Condition `p.response instanceof MultiResponse` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null, null);
                        }
                    } else if (p.response instanceof MultiResponse) {
                        MultiCallback cb = (MultiCallback) p.cb;
                        MultiResponse rsp = (MultiResponse) p.response;
```

### ConstantValue
Value `p.response` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null, null);
                        }
                    } else if (p.response instanceof MultiResponse) {
                        MultiCallback cb = (MultiCallback) p.cb;
                        MultiResponse rsp = (MultiResponse) p.response;
```

### ConstantValue
Condition `p.response instanceof GetEphemeralsResponse` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null);
                        }
                    } else if (p.response instanceof GetEphemeralsResponse) {
                        EphemeralsCallback cb = (EphemeralsCallback) p.cb;
                        GetEphemeralsResponse rsp = (GetEphemeralsResponse) p.response;
```

### ConstantValue
Value `p.response` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                            cb.processResult(rc, clientPath, p.ctx, null);
                        }
                    } else if (p.response instanceof GetEphemeralsResponse) {
                        EphemeralsCallback cb = (EphemeralsCallback) p.cb;
                        GetEphemeralsResponse rsp = (GetEphemeralsResponse) p.response;
```

### ConstantValue
Condition `c > '\u0000'` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathUtils.java`
#### Snippet
```java
                     break;
                 }
             } else if (c > '\u0000' && c <= '\u001f'
                        || c >= '\u007f' && c <= '\u009F'
                        || c >= '\ud800' && c <= '\uf8ff'
```

### ConstantValue
Condition `c <= '\uffff'` is always `true` when reached
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathUtils.java`
#### Snippet
```java
                        || c >= '\u007f' && c <= '\u009F'
                        || c >= '\ud800' && c <= '\uf8ff'
                        || c >= '\ufff0' && c <= '\uffff') {
                 reason = "invalid character @" + i;
                 break;
```

### ConstantValue
Value `hostname` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKHostnameVerifier.java`
#### Snippet
```java
    private static String normaliseAddress(final String hostname) {
        if (hostname == null) {
            return hostname;
        }
        try {
```

### ConstantValue
Condition `subjectAlts != null` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKHostnameVerifier.java`
#### Snippet
```java
        final HostNameType hostType = determineHostFormat(host);
        final List<SubjectName> subjectAlts = getSubjectAltNames(cert);
        if (subjectAlts != null && !subjectAlts.isEmpty()) {
            switch (hostType) {
            case IPv4:
```

### ConstantValue
Condition `uniqacls == null` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
        // This resolves https://issues.apache.org/jira/browse/ZOOKEEPER-1877
        List<ACL> uniqacls = removeDuplicates(acls);
        if (uniqacls == null || uniqacls.size() == 0) {
            throw new KeeperException.InvalidACLException(path);
        }
```

### ConstantValue
Condition `getRecordForPath(path) != null` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
        validatePath(path, request.sessionId);
        try {
            if (getRecordForPath(path) != null) {
                throw new KeeperException.NodeExistsException(path);
            }
```

### ConstantValue
Condition `!(lastSeenQV instanceof QuorumOracleMaj)` is always `true` when reached
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                }

                if (!(lastSeenQV instanceof QuorumMaj) && !(lastSeenQV instanceof QuorumOracleMaj)) {
                    String msg = "Incremental reconfiguration requested but last configuration seen has a non-majority quorum system";
                    LOG.warn(msg);
```

### ConstantValue
Condition `lastSeenQV instanceof QuorumOracleMaj` is always `false` when reached
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                }

                if (!(lastSeenQV instanceof QuorumMaj) && !(lastSeenQV instanceof QuorumOracleMaj)) {
                    String msg = "Incremental reconfiguration requested but last configuration seen has a non-majority quorum system";
                    LOG.warn(msg);
```

### ConstantValue
Condition `lastSeenQV instanceof QuorumMaj` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                }

                if (lastSeenQV instanceof QuorumMaj) {
                    request.qv = new QuorumMaj(nextServers);
                } else {
```

### ConstantValue
Value `interactive` is always 'false'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      for (int i = 0; i < maxDepth; i++) {
        System.out.println(String.format("Analysis for depth %d", i));
        compareLine(left, right, i, byteThreshold, nodeThreshold, debug, interactive);
      }
    } else {
```

### ConstantValue
Value `interactive` is always 'true'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
          // input is Enter
          System.out.println(String.format("Analysis for depth %d", currentDepth));
          compareLine(left, right, currentDepth, byteThreshold, nodeThreshold, debug, interactive);
          currentDepth++;
        } else {
```

### ConstantValue
Value `interactive` is always 'true'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
          if (input.startsWith("/")){
            System.out.println(String.format("Analysis for node %s", input));
            compareSubtree(left, right, input, byteThreshold, nodeThreshold, debug, interactive);
          } else {
            // input is a number
```

### ConstantValue
Value `interactive` is always 'true'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
              currentDepth = depth;
              System.out.println(String.format("Analysis for depth %d", currentDepth));
              compareLine(left, right, currentDepth, byteThreshold, nodeThreshold, debug, interactive);
            } catch (NumberFormatException ex) {
              // input is invalid
```

### ConstantValue
Condition `output != null` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/OSMXBean.java`
#### Snippet
```java
                }
            } finally {
                if (output != null) {
                    output.close();
                }
```

### ConstantValue
Condition `output != null` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/OSMXBean.java`
#### Snippet
```java
                }
            } finally {
                if (output != null) {
                    output.close();
                }
```

### ConstantValue
Value `enforceQuota` is always 'true'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
        enforceQuota = Boolean.parseBoolean(System.getProperty(ENFORCE_QUOTA, "false"));
        if (enforceQuota) {
            LOG.info("{} = {}, Quota Enforce enables", ENFORCE_QUOTA, enforceQuota);
        }

```

### ConstantValue
Condition `self != null` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/AckRequestProcessor.java`
#### Snippet
```java
    public void processRequest(Request request) {
        QuorumPeer self = leader.self;
        if (self != null) {
            request.logLatency(ServerMetrics.getMetrics().PROPOSAL_ACK_CREATION_LATENCY);
            leader.processAck(self.getMyId(), request.zxid, null);
```

### ConstantValue
Condition `i >= filename.length()` is always `false` when reached
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
    public static String getVersionFromFilename(String filename) {
        int i = filename.lastIndexOf('.');
        if (i < 0 || i >= filename.length()) {
            return null;
        }
```

### ConstantValue
Value `sock` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
        } catch (X509Exception e) {
            LOG.warn("Cannot open secure channel to {} at election address {}", sid, electionAddr, e);
            closeSocket(sock);
            return;
        } catch (UnresolvedAddressException | IOException e) {
```

### ConstantValue
Condition `lastSeenQV != null` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
                }
            }
            if (lastSeenQV != null
                && lastProposedView.containsKey(sid)
                && (!knownId
```

### ConstantValue
Condition `shutdownMessage != null` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                }
            }
            if (shutdownMessage != null) {
                shutdown(shutdownMessage);
                // leader goes in looking state
```

### ConstantValue
Value `mess` is always 'null'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
        String entry = null;
        if (type != null) {
            entry = type + " " + Long.toHexString(p.getZxid()) + " " + mess;
        }
        return entry;
```

### ConstantValue
Condition `packetZxid > peerLastZxid` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
                    queueOpPacket(Leader.DIFF, lastCommittedZxid);
                    needOpPacket = false;
                } else if (packetZxid > peerLastZxid) {
                    // Peer have some proposals that the learnerMaster hasn't seen yet
                    // it may used to be a leader
```

### ConstantValue
Value `quorumRequireSasl` is always 'false'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/SaslQuorumAuthLearner.java`
#### Snippet
```java
                "Skipping SASL authentication as {}={}",
                QuorumAuth.QUORUM_LEARNER_SASL_AUTH_REQUIRED,
                quorumRequireSasl);
            return;
        }
```

### ConstantValue
Value `quorumRequireSasl` is always 'false'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/SaslQuorumAuthServer.java`
#### Snippet
```java
                    sock.getRemoteSocketAddress(),
                    QuorumAuth.QUORUM_SERVER_SASL_AUTH_REQUIRED,
                    quorumRequireSasl);
                // let it through, we don't require auth
            }
```

### ConstantValue
Condition `txn instanceof CreateTxn` is always `true`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
            return txnData.toString();
        }
        if (txn instanceof CreateTxn) {
            CreateTxn createTxn = ((CreateTxn) txn);
            txnData.append(createTxn.getPath() + "," + checkNullToEmpty(createTxn.getData()))
```

### ConstantValue
Condition `buf == null` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
        filePadding.padFile(fos.getChannel());
        byte[] buf = Util.marshallTxnEntry(hdr, txn, digest);
        if (buf == null || buf.length == 0) {
            throw new IOException("Faulty serialization for header " + "and txn");
        }
```

### ConstantValue
Condition `fh == null` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnLog.java`
#### Snippet
```java
        FileHeader fh = readHeader(itr.logFile);
        itr.close();
        if (fh == null) {
            throw new IOException("Unsupported Format.");
        }
```

### ConstantValue
Condition `addr2 == null` is always `false`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            return (addr1 != null || addr2 == null)
                   && (addr1 == null || addr2 != null)
                   && (addr1 == null || addr2 == null || addr1.equals(addr2));
        }

```

### ConstantValue
Value `enableAuth` is always 'true'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            LOG.info("QuorumPeer communication is not secured! (SASL auth disabled)");
        } else {
            LOG.info("{} set to {}", QuorumAuth.QUORUM_SASL_AUTH_ENABLED, enableAuth);
        }
    }
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            StringBuilder sb = new StringBuilder();

            sb.append("clientPath:" + clientPath);
            sb.append(" serverPath:" + serverPath);
            sb.append(" finished:" + finished);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java

            sb.append("clientPath:" + clientPath);
            sb.append(" serverPath:" + serverPath);
            sb.append(" finished:" + finished);

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            sb.append("clientPath:" + clientPath);
            sb.append(" serverPath:" + serverPath);
            sb.append(" finished:" + finished);

            sb.append(" header:: " + requestHeader);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            sb.append(" finished:" + finished);

            sb.append(" header:: " + requestHeader);
            sb.append(" replyHeader:: " + replyHeader);
            sb.append(" request:: " + request);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java

            sb.append(" header:: " + requestHeader);
            sb.append(" replyHeader:: " + replyHeader);
            sb.append(" request:: " + request);
            sb.append(" response:: " + response);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            sb.append(" header:: " + requestHeader);
            sb.append(" replyHeader:: " + replyHeader);
            sb.append(" request:: " + request);
            sb.append(" response:: " + response);

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            sb.append(" replyHeader:: " + replyHeader);
            sb.append(" request:: " + request);
            sb.append(" response:: " + response);

            // jute toString is horrible, remove unnecessary newlines
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerStats.java`
#### Snippet
```java
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Latency min/avg/max: " + getMinLatency() + "/" + getAvgLatency() + "/" + getMaxLatency() + "\n");
        sb.append("Received: " + getPacketsReceived() + "\n");
        sb.append("Sent: " + getPacketsSent() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerStats.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("Latency min/avg/max: " + getMinLatency() + "/" + getAvgLatency() + "/" + getMaxLatency() + "\n");
        sb.append("Received: " + getPacketsReceived() + "\n");
        sb.append("Sent: " + getPacketsSent() + "\n");
        sb.append("Connections: " + getNumAliveClientConnections() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerStats.java`
#### Snippet
```java
        sb.append("Latency min/avg/max: " + getMinLatency() + "/" + getAvgLatency() + "/" + getMaxLatency() + "\n");
        sb.append("Received: " + getPacketsReceived() + "\n");
        sb.append("Sent: " + getPacketsSent() + "\n");
        sb.append("Connections: " + getNumAliveClientConnections() + "\n");

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerStats.java`
#### Snippet
```java
        sb.append("Received: " + getPacketsReceived() + "\n");
        sb.append("Sent: " + getPacketsSent() + "\n");
        sb.append("Connections: " + getNumAliveClientConnections() + "\n");

        if (provider != null) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerStats.java`
#### Snippet
```java

        if (provider != null) {
            sb.append("Outstanding: " + getOutstandingRequests() + "\n");
            sb.append("Zxid: 0x" + Long.toHexString(getLastProcessedZxid()) + "\n");
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerStats.java`
#### Snippet
```java
        if (provider != null) {
            sb.append("Outstanding: " + getOutstandingRequests() + "\n");
            sb.append("Zxid: 0x" + Long.toHexString(getLastProcessedZxid()) + "\n");
        }
        sb.append("Mode: " + getServerState() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerStats.java`
#### Snippet
```java
            sb.append("Zxid: 0x" + Long.toHexString(getLastProcessedZxid()) + "\n");
        }
        sb.append("Mode: " + getServerState() + "\n");
        return sb.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotRecursiveSummary.java`
#### Snippet
```java
    if (maxDepth == 0 || level <= maxDepth) {
      String tab = String.join("", Collections.nCopies(level, "--"));
      builder.append(tab + " " + name + "\n");
      builder.append(tab + "   children: " + (result[0] - 1) + "\n");
      builder.append(tab + "   data: " + result[1] + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotRecursiveSummary.java`
#### Snippet
```java
      String tab = String.join("", Collections.nCopies(level, "--"));
      builder.append(tab + " " + name + "\n");
      builder.append(tab + "   children: " + (result[0] - 1) + "\n");
      builder.append(tab + "   data: " + result[1] + "\n");
      builder.append(childBuilder);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotRecursiveSummary.java`
#### Snippet
```java
      builder.append(tab + " " + name + "\n");
      builder.append(tab + "   children: " + (result[0] - 1) + "\n");
      builder.append(tab + "   data: " + result[1] + "\n");
      builder.append(childBuilder);
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ConfigUtils.java`
#### Snippet
```java
            }
            if (null != qs.clientAddr) {
                sb.append(qs.clientAddr.getHostString() + ":" + qs.clientAddr.getPort());
            }
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringWriter.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumHierarchical.java`
#### Snippet
```java
        }

        sw.append("version=" + Long.toHexString(version));

        return sw.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
        if (txn instanceof CreateTxn) {
            CreateTxn createTxn = ((CreateTxn) txn);
            txnData.append(createTxn.getPath() + "," + checkNullToEmpty(createTxn.getData()))
                   .append("," + createTxn.getAcl() + "," + createTxn.getEphemeral())
                   .append("," + createTxn.getParentCVersion());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
        } else if (txn instanceof SetDataTxn) {
            SetDataTxn setDataTxn = ((SetDataTxn) txn);
            txnData.append(setDataTxn.getPath() + "," + checkNullToEmpty(setDataTxn.getData()))
                   .append("," + setDataTxn.getVersion());
        } else if (txn instanceof CreateContainerTxn) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
        } else if (txn instanceof CreateContainerTxn) {
            CreateContainerTxn createContainerTxn = ((CreateContainerTxn) txn);
            txnData.append(createContainerTxn.getPath() + "," + checkNullToEmpty(createContainerTxn.getData()))
                   .append("," + createContainerTxn.getAcl() + "," + createContainerTxn.getParentCVersion());
        } else if (txn instanceof CreateTTLTxn) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
        } else if (txn instanceof CreateTTLTxn) {
            CreateTTLTxn createTTLTxn = ((CreateTTLTxn) txn);
            txnData.append(createTTLTxn.getPath() + "," + checkNullToEmpty(createTTLTxn.getData()))
                   .append("," + createTTLTxn.getAcl() + "," + createTTLTxn.getParentCVersion())
                   .append("," + createTTLTxn.getTtl());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
                Txn t = txnList.get(i);
                if (i == 0) {
                    txnData.append(Request.op2String(t.getType()) + ":" + checkNullToEmpty(t.getData()));
                } else {
                    txnData.append(";" + Request.op2String(t.getType()) + ":" + checkNullToEmpty(t.getData()));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
                    txnData.append(Request.op2String(t.getType()) + ":" + checkNullToEmpty(t.getData()));
                } else {
                    txnData.append(";" + Request.op2String(t.getType()) + ":" + checkNullToEmpty(t.getData()));
                }
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder("    {\n");
        incrLevel();
        ret.append("      a_.StartMap(" + fname + ",\"" + tag + "\");\n");
        ret.append("      java.util.Set " + getId("es") + " = " + fname + ".entrySet();\n");
        ret.append("      for(java.util.Iterator " + getId("midx") + " = " + getId("es") + ".iterator(); " + getId("midx") + ".hasNext(); ) {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        incrLevel();
        ret.append("      a_.StartMap(" + fname + ",\"" + tag + "\");\n");
        ret.append("      java.util.Set " + getId("es") + " = " + fname + ".entrySet();\n");
        ret.append("      for(java.util.Iterator " + getId("midx") + " = " + getId("es") + ".iterator(); " + getId("midx") + ".hasNext(); ) {\n");
        ret.append("        java.util.Map.Entry " + getId("me") + " = (java.util.Map.Entry) " + getId("midx") + ".next();\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("      a_.StartMap(" + fname + ",\"" + tag + "\");\n");
        ret.append("      java.util.Set " + getId("es") + " = " + fname + ".entrySet();\n");
        ret.append("      for(java.util.Iterator " + getId("midx") + " = " + getId("es") + ".iterator(); " + getId("midx") + ".hasNext(); ) {\n");
        ret.append("        java.util.Map.Entry " + getId("me") + " = (java.util.Map.Entry) " + getId("midx") + ".next();\n");
        ret.append("        " + mKey.getCsharpWrapperType() + " " + getId("k") + " = (" + mKey.getCsharpWrapperType() + ") " + getId("me") + ".getKey();\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("      java.util.Set " + getId("es") + " = " + fname + ".entrySet();\n");
        ret.append("      for(java.util.Iterator " + getId("midx") + " = " + getId("es") + ".iterator(); " + getId("midx") + ".hasNext(); ) {\n");
        ret.append("        java.util.Map.Entry " + getId("me") + " = (java.util.Map.Entry) " + getId("midx") + ".next();\n");
        ret.append("        " + mKey.getCsharpWrapperType() + " " + getId("k") + " = (" + mKey.getCsharpWrapperType() + ") " + getId("me") + ".getKey();\n");
        ret.append("        " + mValue.getCsharpWrapperType() + " " + getId("v") + " = (" + mValue.getCsharpWrapperType() + ") " + getId("me") + ".getValue();\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("      for(java.util.Iterator " + getId("midx") + " = " + getId("es") + ".iterator(); " + getId("midx") + ".hasNext(); ) {\n");
        ret.append("        java.util.Map.Entry " + getId("me") + " = (java.util.Map.Entry) " + getId("midx") + ".next();\n");
        ret.append("        " + mKey.getCsharpWrapperType() + " " + getId("k") + " = (" + mKey.getCsharpWrapperType() + ") " + getId("me") + ".getKey();\n");
        ret.append("        " + mValue.getCsharpWrapperType() + " " + getId("v") + " = (" + mValue.getCsharpWrapperType() + ") " + getId("me") + ".getValue();\n");
        ret.append(mKey.genCsharpWriteWrapper(getId("k"), getId("k")));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("        java.util.Map.Entry " + getId("me") + " = (java.util.Map.Entry) " + getId("midx") + ".next();\n");
        ret.append("        " + mKey.getCsharpWrapperType() + " " + getId("k") + " = (" + mKey.getCsharpWrapperType() + ") " + getId("me") + ".getKey();\n");
        ret.append("        " + mValue.getCsharpWrapperType() + " " + getId("v") + " = (" + mValue.getCsharpWrapperType() + ") " + getId("me") + ".getValue();\n");
        ret.append(mKey.genCsharpWriteWrapper(getId("k"), getId("k")));
        ret.append(mValue.genCsharpWriteWrapper(getId("v"), getId("v")));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append(mValue.genCsharpWriteWrapper(getId("v"), getId("v")));
        ret.append("      }\n");
        ret.append("      a_.EndMap(" + fname + ",\"" + tag + "\");\n");
        ret.append("    }\n");
        decrLevel();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder("    {\n");
        incrLevel();
        ret.append("      a_.startMap(" + fname + ",\"" + tag + "\");\n");
        ret.append("      java.util.Set " + getId("es") + " = " + fname + ".entrySet();\n");
        ret.append("      for(java.util.Iterator " + getId("midx") + " = " + getId("es") + ".iterator(); " + getId("midx") + ".hasNext(); ) {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        incrLevel();
        ret.append("      a_.startMap(" + fname + ",\"" + tag + "\");\n");
        ret.append("      java.util.Set " + getId("es") + " = " + fname + ".entrySet();\n");
        ret.append("      for(java.util.Iterator " + getId("midx") + " = " + getId("es") + ".iterator(); " + getId("midx") + ".hasNext(); ) {\n");
        ret.append("        java.util.Map.Entry " + getId("me") + " = (java.util.Map.Entry) " + getId("midx") + ".next();\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("      a_.startMap(" + fname + ",\"" + tag + "\");\n");
        ret.append("      java.util.Set " + getId("es") + " = " + fname + ".entrySet();\n");
        ret.append("      for(java.util.Iterator " + getId("midx") + " = " + getId("es") + ".iterator(); " + getId("midx") + ".hasNext(); ) {\n");
        ret.append("        java.util.Map.Entry " + getId("me") + " = (java.util.Map.Entry) " + getId("midx") + ".next();\n");
        ret.append("        " + mKey.getJavaWrapperType() + " " + getId("k") + " = (" + mKey.getJavaWrapperType() + ") " + getId("me") + ".getKey();\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("      java.util.Set " + getId("es") + " = " + fname + ".entrySet();\n");
        ret.append("      for(java.util.Iterator " + getId("midx") + " = " + getId("es") + ".iterator(); " + getId("midx") + ".hasNext(); ) {\n");
        ret.append("        java.util.Map.Entry " + getId("me") + " = (java.util.Map.Entry) " + getId("midx") + ".next();\n");
        ret.append("        " + mKey.getJavaWrapperType() + " " + getId("k") + " = (" + mKey.getJavaWrapperType() + ") " + getId("me") + ".getKey();\n");
        ret.append("        " + mValue.getJavaWrapperType() + " " + getId("v") + " = (" + mValue.getJavaWrapperType() + ") " + getId("me") + ".getValue();\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("      for(java.util.Iterator " + getId("midx") + " = " + getId("es") + ".iterator(); " + getId("midx") + ".hasNext(); ) {\n");
        ret.append("        java.util.Map.Entry " + getId("me") + " = (java.util.Map.Entry) " + getId("midx") + ".next();\n");
        ret.append("        " + mKey.getJavaWrapperType() + " " + getId("k") + " = (" + mKey.getJavaWrapperType() + ") " + getId("me") + ".getKey();\n");
        ret.append("        " + mValue.getJavaWrapperType() + " " + getId("v") + " = (" + mValue.getJavaWrapperType() + ") " + getId("me") + ".getValue();\n");
        ret.append(mKey.genJavaWriteWrapper(getId("k"), getId("k")));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("        java.util.Map.Entry " + getId("me") + " = (java.util.Map.Entry) " + getId("midx") + ".next();\n");
        ret.append("        " + mKey.getJavaWrapperType() + " " + getId("k") + " = (" + mKey.getJavaWrapperType() + ") " + getId("me") + ".getKey();\n");
        ret.append("        " + mValue.getJavaWrapperType() + " " + getId("v") + " = (" + mValue.getJavaWrapperType() + ") " + getId("me") + ".getValue();\n");
        ret.append(mKey.genJavaWriteWrapper(getId("k"), getId("k")));
        ret.append(mValue.genJavaWriteWrapper(getId("v"), getId("v")));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append(mValue.genJavaWriteWrapper(getId("v"), getId("v")));
        ret.append("      }\n");
        ret.append("      a_.endMap(" + fname + ",\"" + tag + "\");\n");
        ret.append("    }\n");
        decrLevel();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder("");
        if (decl) {
            ret.append("    System.Collections.SortedDictionary<string,string> " + capitalize(fname) + ";\n");
        }
        ret.append("    {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("    {\n");
        incrLevel();
        ret.append("      Org.Apache.Jute.IIndex " + getId("midx") + " = a_.StartMap(\"" + tag + "\");\n");
        ret.append("      " + fname + "= new System.Collections.SortedDictionary<string,string>();\n");
        ret.append("      for (; !" + getId("midx") + ".done(); " + getId("midx") + ".incr()) {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        incrLevel();
        ret.append("      Org.Apache.Jute.IIndex " + getId("midx") + " = a_.StartMap(\"" + tag + "\");\n");
        ret.append("      " + fname + "= new System.Collections.SortedDictionary<string,string>();\n");
        ret.append("      for (; !" + getId("midx") + ".done(); " + getId("midx") + ".incr()) {\n");
        ret.append(mKey.genCsharpReadWrapper(getId("k"), getId("k"), true));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("      Org.Apache.Jute.IIndex " + getId("midx") + " = a_.StartMap(\"" + tag + "\");\n");
        ret.append("      " + fname + "= new System.Collections.SortedDictionary<string,string>();\n");
        ret.append("      for (; !" + getId("midx") + ".done(); " + getId("midx") + ".incr()) {\n");
        ret.append(mKey.genCsharpReadWrapper(getId("k"), getId("k"), true));
        ret.append(mValue.genCsharpReadWrapper(getId("v"), getId("v"), true));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append(mKey.genCsharpReadWrapper(getId("k"), getId("k"), true));
        ret.append(mValue.genCsharpReadWrapper(getId("v"), getId("v"), true));
        ret.append("        " + fname + ".Add(" + getId("k") + "," + getId("v") + ");\n");
        ret.append("      }\n");
        ret.append("    a_.EndMap(\"" + tag + "\");\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("        " + fname + ".Add(" + getId("k") + "," + getId("v") + ");\n");
        ret.append("      }\n");
        ret.append("    a_.EndMap(\"" + tag + "\");\n");
        decrLevel();
        ret.append("    }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder("");
        if (decl) {
            ret.append("    java.util.TreeMap " + fname + ";\n");
        }
        ret.append("    {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("    {\n");
        incrLevel();
        ret.append("      org.apache.jute.Index " + getId("midx") + " = a_.startMap(\"" + tag + "\");\n");
        ret.append("      " + fname + "=new java.util.TreeMap();\n");
        ret.append("      for (; !" + getId("midx") + ".done(); " + getId("midx") + ".incr()) {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        incrLevel();
        ret.append("      org.apache.jute.Index " + getId("midx") + " = a_.startMap(\"" + tag + "\");\n");
        ret.append("      " + fname + "=new java.util.TreeMap();\n");
        ret.append("      for (; !" + getId("midx") + ".done(); " + getId("midx") + ".incr()) {\n");
        ret.append(mKey.genJavaReadWrapper(getId("k"), getId("k"), true));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("      org.apache.jute.Index " + getId("midx") + " = a_.startMap(\"" + tag + "\");\n");
        ret.append("      " + fname + "=new java.util.TreeMap();\n");
        ret.append("      for (; !" + getId("midx") + ".done(); " + getId("midx") + ".incr()) {\n");
        ret.append(mKey.genJavaReadWrapper(getId("k"), getId("k"), true));
        ret.append(mValue.genJavaReadWrapper(getId("v"), getId("v"), true));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append(mKey.genJavaReadWrapper(getId("k"), getId("k"), true));
        ret.append(mValue.genJavaReadWrapper(getId("v"), getId("v"), true));
        ret.append("        " + fname + ".put(" + getId("k") + "," + getId("v") + ");\n");
        ret.append("      }\n");
        ret.append("    a_.endMap(\"" + tag + "\");\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JMap.java`
#### Snippet
```java
        ret.append("        " + fname + ".put(" + getId("k") + "," + getId("v") + ");\n");
        ret.append("      }\n");
        ret.append("    a_.endMap(\"" + tag + "\");\n");
        decrLevel();
        ret.append("    }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JBuffer.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("        {\n");
        sb.append("           int i = org.apache.jute.Utils.readVInt(" + b + ", " + s + ");\n");
        sb.append("           int z = WritableUtils.getVIntSize(i);\n");
        sb.append("           " + s + " += z+i; " + l + " -= (z+i);\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JBuffer.java`
#### Snippet
```java
        sb.append("           int i = org.apache.jute.Utils.readVInt(" + b + ", " + s + ");\n");
        sb.append("           int z = WritableUtils.getVIntSize(i);\n");
        sb.append("           " + s + " += z+i; " + l + " -= (z+i);\n");
        sb.append("        }\n");
        return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JBuffer.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("    {\n");
        sb.append("      byte[] my = " + fname + ";\n");
        sb.append("      byte[] ur = " + other + ";\n");
        sb.append("      ret = org.apache.jute.Utils.compareBytes(my,0,my.length,ur,0,ur.length);\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JBuffer.java`
#### Snippet
```java
        sb.append("    {\n");
        sb.append("      byte[] my = " + fname + ";\n");
        sb.append("      byte[] ur = " + other + ";\n");
        sb.append("      ret = org.apache.jute.Utils.compareBytes(my,0,my.length,ur,0,ur.length);\n");
        sb.append("    }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder();
        if (decl) {
            ret.append("      System.Collections.Generic.List<" + mElement.getCsharpType() + "> " + capitalize(fname) + ";\n");
        }
        ret.append("    {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("    {\n");
        incrLevel();
        ret.append("      IIndex " + getId("vidx") + " = a_.StartVector(\"" + tag + "\");\n");
        ret.append("      if (" + getId("vidx") + "!= null) {");
        ret.append("          " + capitalize(fname) + "=new System.Collections.Generic.List<" + mElement.getCsharpType() + ">();\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        incrLevel();
        ret.append("      IIndex " + getId("vidx") + " = a_.StartVector(\"" + tag + "\");\n");
        ret.append("      if (" + getId("vidx") + "!= null) {");
        ret.append("          " + capitalize(fname) + "=new System.Collections.Generic.List<" + mElement.getCsharpType() + ">();\n");
        ret.append("          for (; !" + getId("vidx") + ".Done(); " + getId("vidx") + ".Incr()) {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("      IIndex " + getId("vidx") + " = a_.StartVector(\"" + tag + "\");\n");
        ret.append("      if (" + getId("vidx") + "!= null) {");
        ret.append("          " + capitalize(fname) + "=new System.Collections.Generic.List<" + mElement.getCsharpType() + ">();\n");
        ret.append("          for (; !" + getId("vidx") + ".Done(); " + getId("vidx") + ".Incr()) {\n");
        ret.append(mElement.genCsharpReadWrapper(getId("e"), getId("e"), true));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("      if (" + getId("vidx") + "!= null) {");
        ret.append("          " + capitalize(fname) + "=new System.Collections.Generic.List<" + mElement.getCsharpType() + ">();\n");
        ret.append("          for (; !" + getId("vidx") + ".Done(); " + getId("vidx") + ".Incr()) {\n");
        ret.append(mElement.genCsharpReadWrapper(getId("e"), getId("e"), true));
        ret.append("            " + capitalize(fname) + ".Add(" + getId("e") + ");\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("          for (; !" + getId("vidx") + ".Done(); " + getId("vidx") + ".Incr()) {\n");
        ret.append(mElement.genCsharpReadWrapper(getId("e"), getId("e"), true));
        ret.append("            " + capitalize(fname) + ".Add(" + getId("e") + ");\n");
        ret.append("          }\n");
        ret.append("      }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("          }\n");
        ret.append("      }\n");
        ret.append("    a_.EndVector(\"" + tag + "\");\n");
        decrLevel();
        ret.append("    }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder("    {\n");
        incrLevel();
        ret.append("      a_.startVector(" + fname + ",\"" + tag + "\");\n");
        ret.append("      if (" + fname + "!= null) {");
        ret.append("          int " + getId("len") + " = " + fname + ".size();\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        incrLevel();
        ret.append("      a_.startVector(" + fname + ",\"" + tag + "\");\n");
        ret.append("      if (" + fname + "!= null) {");
        ret.append("          int " + getId("len") + " = " + fname + ".size();\n");
        ret.append("          for(int " + getId("vidx") + " = 0; " + getId("vidx") + "<" + getId("len") + "; " + getId("vidx") + "++) {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("      a_.startVector(" + fname + ",\"" + tag + "\");\n");
        ret.append("      if (" + fname + "!= null) {");
        ret.append("          int " + getId("len") + " = " + fname + ".size();\n");
        ret.append("          for(int " + getId("vidx") + " = 0; " + getId("vidx") + "<" + getId("len") + "; " + getId("vidx") + "++) {\n");
        ret.append("            " + mElement.getJavaWrapperType() + " " + getId("e") + " = (" + mElement.getJavaWrapperType() + ") " + fname + ".get(" + getId("vidx") + ");\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("      if (" + fname + "!= null) {");
        ret.append("          int " + getId("len") + " = " + fname + ".size();\n");
        ret.append("          for(int " + getId("vidx") + " = 0; " + getId("vidx") + "<" + getId("len") + "; " + getId("vidx") + "++) {\n");
        ret.append("            " + mElement.getJavaWrapperType() + " " + getId("e") + " = (" + mElement.getJavaWrapperType() + ") " + fname + ".get(" + getId("vidx") + ");\n");
        ret.append(mElement.genJavaWriteWrapper(getId("e"), getId("e")));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("          int " + getId("len") + " = " + fname + ".size();\n");
        ret.append("          for(int " + getId("vidx") + " = 0; " + getId("vidx") + "<" + getId("len") + "; " + getId("vidx") + "++) {\n");
        ret.append("            " + mElement.getJavaWrapperType() + " " + getId("e") + " = (" + mElement.getJavaWrapperType() + ") " + fname + ".get(" + getId("vidx") + ");\n");
        ret.append(mElement.genJavaWriteWrapper(getId("e"), getId("e")));
        ret.append("          }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("          }\n");
        ret.append("      }\n");
        ret.append("      a_.endVector(" + fname + ",\"" + tag + "\");\n");
        ret.append("    }\n");
        decrLevel();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder("    {\n");
        incrLevel();
        ret.append("      a_.StartVector(" + capitalize(fname) + ",\"" + tag + "\");\n");
        ret.append("      if (" + capitalize(fname) + "!= null) {");
        ret.append("          int " + getId("len") + " = " + capitalize(fname) + ".Count;\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        incrLevel();
        ret.append("      a_.StartVector(" + capitalize(fname) + ",\"" + tag + "\");\n");
        ret.append("      if (" + capitalize(fname) + "!= null) {");
        ret.append("          int " + getId("len") + " = " + capitalize(fname) + ".Count;\n");
        ret.append("          for(int " + getId("vidx") + " = 0; " + getId("vidx") + "<" + getId("len") + "; " + getId("vidx") + "++) {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("      a_.StartVector(" + capitalize(fname) + ",\"" + tag + "\");\n");
        ret.append("      if (" + capitalize(fname) + "!= null) {");
        ret.append("          int " + getId("len") + " = " + capitalize(fname) + ".Count;\n");
        ret.append("          for(int " + getId("vidx") + " = 0; " + getId("vidx") + "<" + getId("len") + "; " + getId("vidx") + "++) {\n");
        ret.append("            " + mElement.getCsharpWrapperType() + " " + getId("e") + " = (" + mElement.getCsharpWrapperType() + ") " + capitalize(fname) + "[" + getId("vidx") + "];\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("      if (" + capitalize(fname) + "!= null) {");
        ret.append("          int " + getId("len") + " = " + capitalize(fname) + ".Count;\n");
        ret.append("          for(int " + getId("vidx") + " = 0; " + getId("vidx") + "<" + getId("len") + "; " + getId("vidx") + "++) {\n");
        ret.append("            " + mElement.getCsharpWrapperType() + " " + getId("e") + " = (" + mElement.getCsharpWrapperType() + ") " + capitalize(fname) + "[" + getId("vidx") + "];\n");
        ret.append(mElement.genCsharpWriteWrapper(getId("e"), getId("e")));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("          int " + getId("len") + " = " + capitalize(fname) + ".Count;\n");
        ret.append("          for(int " + getId("vidx") + " = 0; " + getId("vidx") + "<" + getId("len") + "; " + getId("vidx") + "++) {\n");
        ret.append("            " + mElement.getCsharpWrapperType() + " " + getId("e") + " = (" + mElement.getCsharpWrapperType() + ") " + capitalize(fname) + "[" + getId("vidx") + "];\n");
        ret.append(mElement.genCsharpWriteWrapper(getId("e"), getId("e")));
        ret.append("          }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("          }\n");
        ret.append("      }\n");
        ret.append("      a_.EndVector(" + capitalize(fname) + ",\"" + tag + "\");\n");
        ret.append("    }\n");
        decrLevel();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder("");
        if (decl) {
            ret.append("      java.util.List " + fname + ";\n");
        }
        ret.append("    {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("    {\n");
        incrLevel();
        ret.append("      Index " + getId("vidx") + " = a_.startVector(\"" + tag + "\");\n");
        ret.append("      if (" + getId("vidx") + "!= null) {");
        ret.append("          " + fname + "=new java.util.ArrayList<" + mElement.getJavaType() + ">();\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        incrLevel();
        ret.append("      Index " + getId("vidx") + " = a_.startVector(\"" + tag + "\");\n");
        ret.append("      if (" + getId("vidx") + "!= null) {");
        ret.append("          " + fname + "=new java.util.ArrayList<" + mElement.getJavaType() + ">();\n");
        ret.append("          for (; !" + getId("vidx") + ".done(); " + getId("vidx") + ".incr()) {\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("      Index " + getId("vidx") + " = a_.startVector(\"" + tag + "\");\n");
        ret.append("      if (" + getId("vidx") + "!= null) {");
        ret.append("          " + fname + "=new java.util.ArrayList<" + mElement.getJavaType() + ">();\n");
        ret.append("          for (; !" + getId("vidx") + ".done(); " + getId("vidx") + ".incr()) {\n");
        ret.append(mElement.genJavaReadWrapper(getId("e"), getId("e"), true));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("      if (" + getId("vidx") + "!= null) {");
        ret.append("          " + fname + "=new java.util.ArrayList<" + mElement.getJavaType() + ">();\n");
        ret.append("          for (; !" + getId("vidx") + ".done(); " + getId("vidx") + ".incr()) {\n");
        ret.append(mElement.genJavaReadWrapper(getId("e"), getId("e"), true));
        ret.append("            " + fname + ".add(" + getId("e") + ");\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("          for (; !" + getId("vidx") + ".done(); " + getId("vidx") + ".incr()) {\n");
        ret.append(mElement.genJavaReadWrapper(getId("e"), getId("e"), true));
        ret.append("            " + fname + ".add(" + getId("e") + ");\n");
        ret.append("          }\n");
        ret.append("      }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JVector.java`
#### Snippet
```java
        ret.append("          }\n");
        ret.append("      }\n");
        ret.append("    a_.endVector(\"" + tag + "\");\n");
        decrLevel();
        ret.append("    }\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder("");
        if (decl) {
            ret.append("    " + getJavaFQName() + " " + fname + ";\n");
        }
        ret.append("    " + fname + "= new " + getJavaFQName() + "();\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
            ret.append("    " + getJavaFQName() + " " + fname + ";\n");
        }
        ret.append("    " + fname + "= new " + getJavaFQName() + "();\n");
        ret.append("    a_.readRecord(" + fname + ",\"" + tag + "\");\n");
        return ret.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
        }
        ret.append("    " + fname + "= new " + getJavaFQName() + "();\n");
        ret.append("    a_.readRecord(" + fname + ",\"" + tag + "\");\n");
        return ret.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder("");
        if (decl) {
            ret.append("    " + getCsharpFQName(mFQName) + " " + fname + ";\n");
        }
        ret.append("    " + fname + "= new " + getCsharpFQName(mFQName) + "();\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
            ret.append("    " + getCsharpFQName(mFQName) + " " + fname + ";\n");
        }
        ret.append("    " + fname + "= new " + getCsharpFQName(mFQName) + "();\n");
        ret.append("    a_.ReadRecord(" + fname + ",\"" + tag + "\");\n");
        return ret.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `zookeeper-jute/src/main/java/org/apache/jute/compiler/JRecord.java`
#### Snippet
```java
        }
        ret.append("    " + fname + "= new " + getCsharpFQName(mFQName) + "();\n");
        ret.append("    a_.ReadRecord(" + fname + ",\"" + tag + "\");\n");
        return ret.toString();
    }
```

## RuleId[ruleID=IOResource]
### IOResource
'FileInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/TraceFormatter.java`
#### Snippet
```java
            ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
        }
        FileChannel fc = new FileInputStream(args[0]).getChannel();
        while (true) {
            ByteBuffer bb = ByteBuffer.allocate(41);
```

### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
    } else {
      // interactive mode
      Scanner scanner = new Scanner(System.in);
      int currentDepth = 0;
      while (currentDepth < maxDepth) {
```

### IOResource
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
        // Send back the ping with our session data
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        Map<Long, Integer> touchTable = zk.getTouchSnapshot();
        for (Entry<Long, Integer> entry : touchTable.entrySet()) {
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
    protected void revalidate(QuorumPacket qp) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(qp.getData());
        DataInputStream dis = new DataInputStream(bis);
        long sessionId = dis.readLong();
        boolean valid = dis.readBoolean();
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
    public void revalidateSession(QuorumPacket qp, LearnerHandler learnerHandler) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(qp.getData());
        DataInputStream dis = new DataInputStream(bis);
        long id = dis.readLong();
        int to = dis.readInt();
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
    boolean revalidateLearnerSession(QuorumPacket qp) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(qp.getData());
        DataInputStream dis = new DataInputStream(bis);
        long id = dis.readLong();
        boolean valid = dis.readBoolean();
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    public void revalidateSession(QuorumPacket qp, LearnerHandler learnerHandler) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(qp.getData());
        DataInputStream dis = new DataInputStream(bis);
        long id = dis.readLong();
        int to = dis.readInt();
```

### IOResource
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
        int to = dis.readInt();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeLong(id);
        boolean valid = zk.checkIfValidGlobalSession(id, to);
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "REVALIDATE";
            ByteArrayInputStream bis = new ByteArrayInputStream(p.getData());
            DataInputStream dis = new DataInputStream(bis);
            try {
                long id = dis.readLong();
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
                    // Process the touches
                    ByteArrayInputStream bis = new ByteArrayInputStream(qp.getData());
                    DataInputStream dis = new DataInputStream(bis);
                    while (dis.available() > 0) {
                        long sess = dis.readLong();
```

### IOResource
'FileTxnLog' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnSnapLog.java`
#### Snippet
```java
     */
    public long getLastLoggedZxid() {
        FileTxnLog txnLog = new FileTxnLog(dataDir);
        return txnLog.getLastLoggedZxid();
    }
```

### IOResource
'FileTxnLog' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnSnapLog.java`
#### Snippet
```java
     */
    public TxnIterator readTxnLog(long zxid, boolean fastForward) throws IOException {
        FileTxnLog txnLog = new FileTxnLog(dataDir);
        return txnLog.read(zxid, fastForward);
    }
```

### IOResource
'FileTxnLog' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnSnapLog.java`
#### Snippet
```java
        long deserializeResult = snapLog.deserialize(dt, sessions);
        ServerMetrics.getMetrics().STARTUP_SNAP_LOAD_TIME.add(Time.currentElapsedTime() - snapLoadingStartTime);
        FileTxnLog txnLog = new FileTxnLog(dataDir);
        boolean trustEmptyDB;
        File initFile = new File(dataDir.getParent(), "initialize");
```

## RuleId[ruleID=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Map `this.stats` is always empty
in `zookeeper-server/src/main/java/org/apache/zookeeper/StatsTrack.java`
#### Snippet
```java
     */
    public StatsTrack(String stat) {
        this.stats.clear();
        if (stat == null || stat.length() == 0) {
            return;
```

### RedundantOperationOnEmptyContainer
Collection `packetsNotCommitted` is always empty
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
        if (zk instanceof FollowerZooKeeperServer) {
            FollowerZooKeeperServer fzk = (FollowerZooKeeperServer) zk;
            for (PacketInFlight p : packetsNotCommitted) {
                fzk.logRequest(p.hdr, p.rec, p.digest);
            }
```

### RedundantOperationOnEmptyContainer
Collection `packetsCommitted` is always empty
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                fzk.logRequest(p.hdr, p.rec, p.digest);
            }
            for (Long zxid : packetsCommitted) {
                fzk.commit(zxid);
            }
```

### RedundantOperationOnEmptyContainer
Collection `packetsNotCommitted` is always empty
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
            // and UPTODATE
            ObserverZooKeeperServer ozk = (ObserverZooKeeperServer) zk;
            for (PacketInFlight p : packetsNotCommitted) {
                Long zxid = packetsCommitted.peekFirst();
                if (p.hdr.getZxid() != zxid) {
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `MIN_SNAP_RETAIN_COUNT` may be 'static'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java
     * @see org.apache.zookeeper.server.PurgeTxnLog#purge(File, File, int)
     */
    private final int MIN_SNAP_RETAIN_COUNT = 3;

    /**
```

### FieldMayBeStatic
Field `markerPacketInterval` may be 'static'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
     * It is ok if packetCounter overflows.
     */
    private final int markerPacketInterval = 1000;
    private AtomicInteger packetCounter = new AtomicInteger();

```

### FieldMayBeStatic
Field `prefix` may be 'static'
in `zookeeper-recipes/zookeeper-recipes-queue/src/main/java/org/apache/zookeeper/recipes/queue/DistributedQueue.java`
#### Snippet
```java
    private List<ACL> acl = ZooDefs.Ids.OPEN_ACL_UNSAFE;

    private final String prefix = "qn-";

    public DistributedQueue(ZooKeeper zookeeper, String dir, List<ACL> acl) {
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Quotas` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/Quotas.java`
#### Snippet
```java
 * for quota
 */
public class Quotas {

    /** the zookeeper nodes that acts as the management and status node **/
```

### UtilityClassWithoutPrivateConstructor
Class `Environment` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/Environment.java`
#### Snippet
```java
 *
 */
public class Environment {

    public static final String JAAS_CONF_KEY = "java.security.auth.login.config";
```

### UtilityClassWithoutPrivateConstructor
Class `ZooDefs` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooDefs.java`
#### Snippet
```java

@InterfaceAudience.Public
public class ZooDefs {

    public static final String CONFIG_NODE = "/zookeeper/config";
```

### UtilityClassWithoutPrivateConstructor
Class `SaslServerPrincipal` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/SaslServerPrincipal.java`
#### Snippet
```java
 * Computes the Server Principal for a SASL client.
 */
public class SaslServerPrincipal {

    private static final Logger LOG = LoggerFactory.getLogger(SaslServerPrincipal.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ServerAdminClient` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/ServerAdminClient.java`
#### Snippet
```java

@InterfaceAudience.Public
public class ServerAdminClient {

    private static final Logger LOG = LoggerFactory.getLogger(ServerAdminClient.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ZookeeperBanner` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZookeeperBanner.java`
#### Snippet
```java
 *
 */
public class ZookeeperBanner {

    private static final String[] BANNER = {
```

### UtilityClassWithoutPrivateConstructor
Class `ZKUtil` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKUtil.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class ZKUtil {

    private static final Logger LOG = LoggerFactory.getLogger(ZKUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `WakeupPacket` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxnSocketNetty.java`
#### Snippet
```java

    // *************** <END> CientCnxnSocketNetty </END> ******************
    private static class WakeupPacket {

        private static final Packet instance = new Packet(null, null, null, null, null);
```

### UtilityClassWithoutPrivateConstructor
Class `CommandFactory` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/CommandFactory.java`
#### Snippet
```java
 * Factory class for creating instances of {@link CliCommand}.
 */
public class CommandFactory {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `AclParser` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/AclParser.java`
#### Snippet
```java
 * a parser for ACL strings
 */
public class AclParser {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ManagedUtil` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/jmx/ManagedUtil.java`
#### Snippet
```java
 * Shared utilities
 */
public class ManagedUtil {

    private static final Logger LOG = LoggerFactory.getLogger(ManagedUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ZKAuditProvider` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/audit/ZKAuditProvider.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class ZKAuditProvider {
    static final String AUDIT_ENABLE = "zookeeper.audit.enable";
    static final String AUDIT_IMPL_CLASS = "zookeeper.audit.impl.class";
```

### UtilityClassWithoutPrivateConstructor
Class `SecurityUtils` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/util/SecurityUtils.java`
#### Snippet
```java
import org.slf4j.Logger;

public final class SecurityUtils {

    public static final String QUORUM_HOSTNAME_PATTERN = "_HOST";
```

### UtilityClassWithoutPrivateConstructor
Class `FourLetterWordMain` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/FourLetterWordMain.java`
#### Snippet
```java

@InterfaceAudience.Public
public class FourLetterWordMain {

    //in milliseconds, socket should connect/read within this period otherwise SocketTimeoutException
```

### UtilityClassWithoutPrivateConstructor
Class `AuditHelper` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/audit/AuditHelper.java`
#### Snippet
```java
 * Helper class to decouple audit log code.
 */
public final class AuditHelper {
    private static final Logger LOG = LoggerFactory.getLogger(AuditHelper.class);

```

### UtilityClassWithoutPrivateConstructor
Class `NettyUtils` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/NettyUtils.java`
#### Snippet
```java
 * Helper methods for netty code.
 */
public class NettyUtils {

    private static final Logger LOG = LoggerFactory.getLogger(NettyUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `FileKeyStoreLoaderBuilderProvider` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/FileKeyStoreLoaderBuilderProvider.java`
#### Snippet
```java
import java.util.Objects;

public class FileKeyStoreLoaderBuilderProvider {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `IOUtils` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/IOUtils.java`
#### Snippet
```java
 */

public class IOUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PathUtils` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathUtils.java`
#### Snippet
```java
  * Path related utilities
  */
 public class PathUtils {

     /** validate the provided znode path string
```

### UtilityClassWithoutPrivateConstructor
Class `NetUtils` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/NetUtils.java`
#### Snippet
```java
 * This class contains common utilities for netstuff. Like printing IPv6 literals correctly
 */
public class NetUtils {

    public static String formatInetAddr(InetSocketAddress addr) {
```

### UtilityClassWithoutPrivateConstructor
Class `Time` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/Time.java`
#### Snippet
```java
import java.util.Date;

public class Time {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ZooTrace` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooTrace.java`
#### Snippet
```java
 * Logback must be correctly configured to capture the TRACE messages.
 */
public class ZooTrace {

    public static final long CLIENT_REQUEST_TRACE_MASK = 1 << 1;
```

### UtilityClassWithoutPrivateConstructor
Class `ServerCnxnHelper` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ServerCnxnHelper.java`
#### Snippet
```java
package org.apache.zookeeper.server;

public class ServerCnxnHelper {

    /** gets maximum number of connections in ZooKeeper */
```

### UtilityClassWithoutPrivateConstructor
Class `TraceFormatter` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/TraceFormatter.java`
#### Snippet
```java
import org.apache.zookeeper.util.ServiceUtils;

public class TraceFormatter {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PurgeTxnLog` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PurgeTxnLog.java`
#### Snippet
```java
 */
@InterfaceAudience.Public
public class PurgeTxnLog {

    private static final Logger LOG = LoggerFactory.getLogger(PurgeTxnLog.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ProviderRegistry` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/ProviderRegistry.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class ProviderRegistry {

    private static final Logger LOG = LoggerFactory.getLogger(ProviderRegistry.class);
```

### UtilityClassWithoutPrivateConstructor
Class `KerberosUtil` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/KerberosUtil.java`
#### Snippet
```java
import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosUtil {

    public static String getDefaultRealm() throws IllegalArgumentException {
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigUtils` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ConfigUtils.java`
#### Snippet
```java
import org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException;

public class ConfigUtils {

    public static String getClientConfigStr(String configData) {
```

### UtilityClassWithoutPrivateConstructor
Class `ZxidUtils` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ZxidUtils.java`
#### Snippet
```java
package org.apache.zookeeper.server.util;

public class ZxidUtils {

    public static long getEpochFromZxid(long zxid) {
```

### UtilityClassWithoutPrivateConstructor
Class `SerializeUtils` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class SerializeUtils {

    private static final Logger LOG = LoggerFactory.getLogger(SerializeUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `LogChopper` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/LogChopper.java`
#### Snippet
```java
 */
@InterfaceAudience.Public
public class LogChopper {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `AdminServerFactory` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/admin/AdminServerFactory.java`
#### Snippet
```java
 * Factory class for creating an AdminServer.
 */
public class AdminServerFactory {

    private static final Logger LOG = LoggerFactory.getLogger(AdminServerFactory.class);
```

### UtilityClassWithoutPrivateConstructor
Class `WatchManagerFactory` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManagerFactory.java`
#### Snippet
```java
 * zookeeper.watchManagerName option.
 */
public class WatchManagerFactory {

    private static final Logger LOG = LoggerFactory.getLogger(WatchManagerFactory.class);
```

### UtilityClassWithoutPrivateConstructor
Class `QuorumAuth` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/QuorumAuth.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class QuorumAuth {

    private static final Logger LOG = LoggerFactory.getLogger(QuorumAuth.class);
```

### UtilityClassWithoutPrivateConstructor
Class `FourLetterCommands` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/command/FourLetterCommands.java`
#### Snippet
```java
 * This class contains constants for all the four letter commands
 */
public class FourLetterCommands {

    /*
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/Util.java`
#### Snippet
```java
 * low level I/O file operations and marshalling/unmarshalling.
 */
public class Util {

    private static final Logger LOG = LoggerFactory.getLogger(Util.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SnapStream` has only 'static' members, and lacks a 'private' constructor
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/SnapStream.java`
#### Snippet
```java
 * Represent the Stream used in serialize and deserialize the Snapshot.
 */
public class SnapStream {

    private static final Logger LOG = LoggerFactory.getLogger(SnapStream.class);
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Switch label `ZooDefs.OpCode.create` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiOperationRecord.java`
#### Snippet
```java
            while (!h.getDone()) {
                switch (h.getType()) {
                case ZooDefs.OpCode.create:
                case ZooDefs.OpCode.create2:
                case ZooDefs.OpCode.createContainer:
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.create2` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiOperationRecord.java`
#### Snippet
```java
                switch (h.getType()) {
                case ZooDefs.OpCode.create:
                case ZooDefs.OpCode.create2:
                case ZooDefs.OpCode.createContainer:
                    CreateRequest cr = new CreateRequest();
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.createContainer` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiOperationRecord.java`
#### Snippet
```java
                case ZooDefs.OpCode.create:
                case ZooDefs.OpCode.create2:
                case ZooDefs.OpCode.createContainer:
                    CreateRequest cr = new CreateRequest();
                    cr.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.createTTL` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiOperationRecord.java`
#### Snippet
```java
                    add(Op.create(cr.getPath(), cr.getData(), cr.getAcl(), cr.getFlags()));
                    break;
                case ZooDefs.OpCode.createTTL:
                    CreateTTLRequest crTtl = new CreateTTLRequest();
                    crTtl.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.delete` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiOperationRecord.java`
#### Snippet
```java
                    add(Op.create(crTtl.getPath(), crTtl.getData(), crTtl.getAcl(), crTtl.getFlags(), crTtl.getTtl()));
                    break;
                case ZooDefs.OpCode.delete:
                    DeleteRequest dr = new DeleteRequest();
                    dr.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.setData` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiOperationRecord.java`
#### Snippet
```java
                    add(Op.delete(dr.getPath(), dr.getVersion()));
                    break;
                case ZooDefs.OpCode.setData:
                    SetDataRequest sdr = new SetDataRequest();
                    sdr.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.check` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiOperationRecord.java`
#### Snippet
```java
                    add(Op.setData(sdr.getPath(), sdr.getData(), sdr.getVersion()));
                    break;
                case ZooDefs.OpCode.check:
                    CheckVersionRequest cvr = new CheckVersionRequest();
                    cvr.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.getChildren` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiOperationRecord.java`
#### Snippet
```java
                    add(Op.check(cvr.getPath(), cvr.getVersion()));
                    break;
                case ZooDefs.OpCode.getChildren:
                    GetChildrenRequest gcr = new GetChildrenRequest();
                    gcr.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.getData` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiOperationRecord.java`
#### Snippet
```java
                    add(Op.getChildren(gcr.getPath()));
                    break;
                case ZooDefs.OpCode.getData:
                    GetDataRequest gdr = new GetDataRequest();
                    gdr.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.create` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiResponse.java`
#### Snippet
```java
        while (!h.getDone()) {
            switch (h.getType()) {
            case ZooDefs.OpCode.create:
                CreateResponse cr = new CreateResponse();
                cr.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.create2` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiResponse.java`
#### Snippet
```java
                break;

            case ZooDefs.OpCode.create2:
                Create2Response cr2 = new Create2Response();
                cr2.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.delete` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiResponse.java`
#### Snippet
```java
                break;

            case ZooDefs.OpCode.delete:
                results.add(new OpResult.DeleteResult());
                break;
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.setData` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiResponse.java`
#### Snippet
```java
                break;

            case ZooDefs.OpCode.setData:
                SetDataResponse sdr = new SetDataResponse();
                sdr.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.check` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiResponse.java`
#### Snippet
```java
                break;

            case ZooDefs.OpCode.check:
                results.add(new OpResult.CheckResult());
                break;
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.getChildren` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiResponse.java`
#### Snippet
```java
                break;

            case ZooDefs.OpCode.getChildren:
                GetChildrenResponse gcr = new GetChildrenResponse();
                gcr.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.getData` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiResponse.java`
#### Snippet
```java
                break;

            case ZooDefs.OpCode.getData:
                GetDataResponse gdr = new GetDataResponse();
                gdr.deserialize(archive, tag);
```

### DataFlowIssue
Switch label `ZooDefs.OpCode.error` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/MultiResponse.java`
#### Snippet
```java
                break;

            case ZooDefs.OpCode.error:
                // TODO: need way to more cleanly serialize/deserialize exceptions
                ErrorResponse er = new ErrorResponse();
```

### DataFlowIssue
Variable is already assigned to this value
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/RemoveWatchesCommand.java`
#### Snippet
```java
            wtype = WatcherType.Data;
        } else if (cl.hasOption("a")) {
            wtype = WatcherType.Any;
        }
        // whether to remove the watches locally
```

### DataFlowIssue
Switch label `PING_XID` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
            replyHdr.deserialize(bbia, "header");
            switch (replyHdr.getXid()) {
            case PING_XID:
                LOG.debug("Got ping response for session id: 0x{} after {}ms.",
                    Long.toHexString(sessionId),
```

### DataFlowIssue
Switch label `AUTHPACKET_XID` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                    ((System.nanoTime() - lastPingSentNs) / 1000000));
                return;
              case AUTHPACKET_XID:
                LOG.debug("Got auth session id: 0x{}", Long.toHexString(sessionId));
                if (replyHdr.getErr() == KeeperException.Code.AUTHFAILED.intValue()) {
```

### DataFlowIssue
Switch label `NOTIFICATION_XID` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                }
              return;
            case NOTIFICATION_XID:
                LOG.debug("Got notification session id: 0x{}",
                    Long.toHexString(sessionId));
```

### DataFlowIssue
Condition `request instanceof ConnectRequest` is redundant and can be replaced with a null check
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                    requestHeader.serialize(boa, "header");
                }
                if (request instanceof ConnectRequest) {
                    request.serialize(boa, "connect");
                } else if (request != null) {
```

### DataFlowIssue
Condition `p.response instanceof ExistsResponse` is redundant and can be replaced with a null check
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                    if (p.cb == null) {
                        LOG.warn("Somehow a null cb got to EventThread!");
                    } else if (p.response instanceof ExistsResponse
                               || p.response instanceof SetDataResponse
                               || p.response instanceof SetACLResponse) {
```

### DataFlowIssue
Variable is already assigned to this value
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/ZKConfig.java`
#### Snippet
```java
        LOG.info("Reading configuration from: {}", configFile.getAbsolutePath());
        try {
            configFile = (new VerifyingFileFactory.Builder(LOG).warnForRelativePath()
                                                               .failForNonExistingPath()
                                                               .build()).validate(configFile);
```

### DataFlowIssue
Dereference of `committedLog.peek()` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
            if (committedLog.size() > commitLogCount) {
                committedLog.remove();
                minCommittedLog = committedLog.peek().packet.getZxid();
            }
            if (committedLog.isEmpty()) {
```

### DataFlowIssue
Method invocation `sendResponse` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/UnimplementedRequestProcessor.java`
#### Snippet
```java
        ReplyHeader rh = new ReplyHeader(request.cxid, request.zxid, ke.code().intValue());
        try {
            request.cnxn.sendResponse(rh, null, "response");
        } catch (IOException e) {
            throw new RequestProcessorException("Can't send the response", e);
```

### DataFlowIssue
Argument `rightNode` might be null
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
        leftIndex++;
      } else {
        printRightOnly(rightNode, byteThreshold, nodeThreshold, debug, interactive);
        rightIndex++;
      }
```

### DataFlowIssue
Dereference of `rc` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/FinalRequestProcessor.java`
#### Snippet
```java
                rsp = new MultiResponse();

                for (ProcessTxnResult subTxnResult : rc.multiResult) {

                    OpResult subResult;
```

### DataFlowIssue
Dereference of `rc` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/FinalRequestProcessor.java`
#### Snippet
```java
            case OpCode.create: {
                lastOp = "CREA";
                rsp = new CreateResponse(rc.path);
                err = Code.get(rc.err);
                requestPathMetricsCollector.registerRequest(request.type, rc.path);
```

### DataFlowIssue
Dereference of `rc` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/FinalRequestProcessor.java`
#### Snippet
```java
            case OpCode.createContainer: {
                lastOp = "CREA";
                rsp = new Create2Response(rc.path, rc.stat);
                err = Code.get(rc.err);
                requestPathMetricsCollector.registerRequest(request.type, rc.path);
```

### DataFlowIssue
Dereference of `rc` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/FinalRequestProcessor.java`
#### Snippet
```java
            case OpCode.deleteContainer: {
                lastOp = "DELE";
                err = Code.get(rc.err);
                requestPathMetricsCollector.registerRequest(request.type, rc.path);
                break;
```

### DataFlowIssue
Dereference of `rc` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/FinalRequestProcessor.java`
#### Snippet
```java
            case OpCode.setData: {
                lastOp = "SETD";
                rsp = new SetDataResponse(rc.stat);
                err = Code.get(rc.err);
                requestPathMetricsCollector.registerRequest(request.type, rc.path);
```

### DataFlowIssue
Dereference of `rc` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/FinalRequestProcessor.java`
#### Snippet
```java
                rsp = new GetDataResponse(
                    ((QuorumZooKeeperServer) zks).self.getQuorumVerifier().toString().getBytes(UTF_8),
                    rc.stat);
                err = Code.get(rc.err);
                break;
```

### DataFlowIssue
Dereference of `rc` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/FinalRequestProcessor.java`
#### Snippet
```java
            case OpCode.setACL: {
                lastOp = "SETA";
                rsp = new SetACLResponse(rc.stat);
                err = Code.get(rc.err);
                requestPathMetricsCollector.registerRequest(request.type, rc.path);
```

### DataFlowIssue
Dereference of `rc` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/FinalRequestProcessor.java`
#### Snippet
```java
            case OpCode.closeSession: {
                lastOp = "CLOS";
                err = Code.get(rc.err);
                break;
            }
```

### DataFlowIssue
Dereference of `rc` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/FinalRequestProcessor.java`
#### Snippet
```java
            case OpCode.check: {
                lastOp = "CHEC";
                rsp = new SetDataResponse(rc.stat);
                err = Code.get(rc.err);
                break;
```

### DataFlowIssue
Switch label `OpCode.createSession` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
        Record txn = null;
        switch (hdr.getType()) {
        case OpCode.createSession:
            // This isn't really an error txn; it just has the same
            // format. The error represents the timeout
```

### DataFlowIssue
Switch label `OpCode.closeSession` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
            txn = new CreateSessionTxn();
            break;
        case OpCode.closeSession:
            txn = ZooKeeperServer.isCloseSessionTxnEnabled()
                    ?  new CloseSessionTxn() : null;
```

### DataFlowIssue
Switch label `OpCode.create` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
                    ?  new CloseSessionTxn() : null;
            break;
        case OpCode.create:
        case OpCode.create2:
            txn = new CreateTxn();
```

### DataFlowIssue
Switch label `OpCode.create2` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
            break;
        case OpCode.create:
        case OpCode.create2:
            txn = new CreateTxn();
            break;
```

### DataFlowIssue
Switch label `OpCode.createTTL` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
            txn = new CreateTxn();
            break;
        case OpCode.createTTL:
            txn = new CreateTTLTxn();
            break;
```

### DataFlowIssue
Switch label `OpCode.createContainer` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
            txn = new CreateTTLTxn();
            break;
        case OpCode.createContainer:
            txn = new CreateContainerTxn();
            break;
```

### DataFlowIssue
Switch label `OpCode.delete` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
            txn = new CreateContainerTxn();
            break;
        case OpCode.delete:
        case OpCode.deleteContainer:
            txn = new DeleteTxn();
```

### DataFlowIssue
Switch label `OpCode.deleteContainer` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
            break;
        case OpCode.delete:
        case OpCode.deleteContainer:
            txn = new DeleteTxn();
            break;
```

### DataFlowIssue
Switch label `OpCode.reconfig` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
            txn = new DeleteTxn();
            break;
        case OpCode.reconfig:
        case OpCode.setData:
            txn = new SetDataTxn();
```

### DataFlowIssue
Switch label `OpCode.setData` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
            break;
        case OpCode.reconfig:
        case OpCode.setData:
            txn = new SetDataTxn();
            break;
```

### DataFlowIssue
Switch label `OpCode.setACL` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
            txn = new SetDataTxn();
            break;
        case OpCode.setACL:
            txn = new SetACLTxn();
            break;
```

### DataFlowIssue
Switch label `OpCode.error` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
            txn = new SetACLTxn();
            break;
        case OpCode.error:
            txn = new ErrorTxn();
            break;
```

### DataFlowIssue
Switch label `OpCode.multi` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/SerializeUtils.java`
#### Snippet
```java
            txn = new ErrorTxn();
            break;
        case OpCode.multi:
            txn = new MultiTxn();
            break;
```

### DataFlowIssue
Condition `txn instanceof CreateSessionTxn` is redundant and can be replaced with a null check
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java

        if (opCode == OpCode.createSession) {
            if (hdr != null && txn instanceof CreateSessionTxn) {
                CreateSessionTxn cst = (CreateSessionTxn) txn;
                sessionTracker.commitSession(sessionId, cst.getTimeOut());
```

### DataFlowIssue
Variable is already assigned to this value
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
                } catch (RuntimeException e) {
                    LOG.warn("Caught runtime exception from AuthenticationProvider: {}", scheme, e);
                    authReturn = KeeperException.Code.AUTHFAILED;
                }
            }
```

### DataFlowIssue
Switch label `OpCode.create` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            rc.multiResult = null;
            switch (header.getType()) {
            case OpCode.create:
                CreateTxn createTxn = (CreateTxn) txn;
                rc.path = createTxn.getPath();
```

### DataFlowIssue
Switch label `OpCode.create2` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                    null);
                break;
            case OpCode.create2:
                CreateTxn create2Txn = (CreateTxn) txn;
                rc.path = create2Txn.getPath();
```

### DataFlowIssue
Switch label `OpCode.createTTL` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                rc.stat = stat;
                break;
            case OpCode.createTTL:
                CreateTTLTxn createTtlTxn = (CreateTTLTxn) txn;
                rc.path = createTtlTxn.getPath();
```

### DataFlowIssue
Switch label `OpCode.createContainer` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                rc.stat = stat;
                break;
            case OpCode.createContainer:
                CreateContainerTxn createContainerTxn = (CreateContainerTxn) txn;
                rc.path = createContainerTxn.getPath();
```

### DataFlowIssue
Switch label `OpCode.delete` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                rc.stat = stat;
                break;
            case OpCode.delete:
            case OpCode.deleteContainer:
                DeleteTxn deleteTxn = (DeleteTxn) txn;
```

### DataFlowIssue
Switch label `OpCode.deleteContainer` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                break;
            case OpCode.delete:
            case OpCode.deleteContainer:
                DeleteTxn deleteTxn = (DeleteTxn) txn;
                rc.path = deleteTxn.getPath();
```

### DataFlowIssue
Switch label `OpCode.reconfig` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                deleteNode(deleteTxn.getPath(), header.getZxid());
                break;
            case OpCode.reconfig:
            case OpCode.setData:
                SetDataTxn setDataTxn = (SetDataTxn) txn;
```

### DataFlowIssue
Switch label `OpCode.setData` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                break;
            case OpCode.reconfig:
            case OpCode.setData:
                SetDataTxn setDataTxn = (SetDataTxn) txn;
                rc.path = setDataTxn.getPath();
```

### DataFlowIssue
Switch label `OpCode.setACL` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                    header.getTime());
                break;
            case OpCode.setACL:
                SetACLTxn setACLTxn = (SetACLTxn) txn;
                rc.path = setACLTxn.getPath();
```

### DataFlowIssue
Switch label `OpCode.closeSession` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                rc.stat = setACL(setACLTxn.getPath(), setACLTxn.getAcl(), setACLTxn.getVersion());
                break;
            case OpCode.closeSession:
                long sessionId = header.getClientId();
                if (txn != null) {
```

### DataFlowIssue
Switch label `OpCode.error` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                }
                break;
            case OpCode.error:
                ErrorTxn errTxn = (ErrorTxn) txn;
                rc.err = errTxn.getErr();
```

### DataFlowIssue
Switch label `OpCode.check` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                rc.err = errTxn.getErr();
                break;
            case OpCode.check:
                CheckVersionTxn checkTxn = (CheckVersionTxn) txn;
                rc.path = checkTxn.getPath();
```

### DataFlowIssue
Switch label `OpCode.multi` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                rc.path = checkTxn.getPath();
                break;
            case OpCode.multi:
                MultiTxn multiTxn = (MultiTxn) txn;
                List<Txn> txns = multiTxn.getTxns();
```

### DataFlowIssue
Switch label `Leader.PING` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Follower.java`
#### Snippet
```java
    protected void processPacket(QuorumPacket qp) throws Exception {
        switch (qp.getType()) {
        case Leader.PING:
            ping(qp);
            break;
```

### DataFlowIssue
Switch label `Leader.PROPOSAL` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Follower.java`
#### Snippet
```java
            ping(qp);
            break;
        case Leader.PROPOSAL:
            ServerMetrics.getMetrics().LEARNER_PROPOSAL_RECEIVED_COUNT.add(1);
            TxnLogEntry logEntry = SerializeUtils.deserializeTxn(qp.getData());
```

### DataFlowIssue
Switch label `Leader.COMMIT` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Follower.java`
#### Snippet
```java
            }
            break;
        case Leader.COMMIT:
            ServerMetrics.getMetrics().LEARNER_COMMIT_RECEIVED_COUNT.add(1);
            fzk.commit(qp.getZxid());
```

### DataFlowIssue
Switch label `Leader.COMMITANDACTIVATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Follower.java`
#### Snippet
```java
            break;

        case Leader.COMMITANDACTIVATE:
            // get the new configuration from the request
            Request request = fzk.pendingTxns.element();
```

### DataFlowIssue
Switch label `Leader.UPTODATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Follower.java`
#### Snippet
```java
            }
            break;
        case Leader.UPTODATE:
            LOG.error("Received an UPTODATE message after Follower started");
            break;
```

### DataFlowIssue
Switch label `Leader.REVALIDATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Follower.java`
#### Snippet
```java
            LOG.error("Received an UPTODATE message after Follower started");
            break;
        case Leader.REVALIDATE:
            if (om == null || !om.revalidateLearnerSession(qp)) {
                revalidate(qp);
```

### DataFlowIssue
Switch label `Leader.SYNC` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Follower.java`
#### Snippet
```java
            }
            break;
        case Leader.SYNC:
            fzk.sync();
            break;
```

### DataFlowIssue
Switch label `Leader.PING` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
        Record txn;
        switch (qp.getType()) {
        case Leader.PING:
            ping(qp);
            break;
```

### DataFlowIssue
Switch label `Leader.PROPOSAL` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
            ping(qp);
            break;
        case Leader.PROPOSAL:
            LOG.warn("Ignoring proposal");
            break;
```

### DataFlowIssue
Switch label `Leader.COMMIT` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
            LOG.warn("Ignoring proposal");
            break;
        case Leader.COMMIT:
            LOG.warn("Ignoring commit");
            break;
```

### DataFlowIssue
Switch label `Leader.UPTODATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
            LOG.warn("Ignoring commit");
            break;
        case Leader.UPTODATE:
            LOG.error("Received an UPTODATE message after Observer started");
            break;
```

### DataFlowIssue
Switch label `Leader.REVALIDATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
            LOG.error("Received an UPTODATE message after Observer started");
            break;
        case Leader.REVALIDATE:
            revalidate(qp);
            break;
```

### DataFlowIssue
Switch label `Leader.SYNC` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
            revalidate(qp);
            break;
        case Leader.SYNC:
            ((ObserverZooKeeperServer) zk).sync();
            break;
```

### DataFlowIssue
Switch label `Leader.INFORM` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
            ((ObserverZooKeeperServer) zk).sync();
            break;
        case Leader.INFORM:
            ServerMetrics.getMetrics().LEARNER_COMMIT_RECEIVED_COUNT.add(1);
            logEntry = SerializeUtils.deserializeTxn(qp.getData());
```

### DataFlowIssue
Switch label `Leader.INFORMANDACTIVATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Observer.java`
#### Snippet
```java
            obs.commitRequest(request);
            break;
        case Leader.INFORMANDACTIVATE:
            // get new designated leader from (current) leader's message
            ByteBuffer buffer = ByteBuffer.wrap(qp.getData());
```

### DataFlowIssue
Variable is already assigned to this value
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                if (zk.shouldForceWriteInitialSnapshotAfterLeaderElection()) {
                    LOG.info("Forcing a snapshot write as part of upgrading from an older Zookeeper. This should only happen while upgrading.");
                    snapshotNeeded = true;
                    syncSnapshot = true;
                } else {
```

### DataFlowIssue
Switch label `Leader.PROPOSAL` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                readPacket(qp);
                switch (qp.getType()) {
                case Leader.PROPOSAL:
                    PacketInFlight pif = new PacketInFlight();
                    logEntry = SerializeUtils.deserializeTxn(qp.getData());
```

### DataFlowIssue
Switch label `Leader.COMMIT` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    packetsNotCommitted.add(pif);
                    break;
                case Leader.COMMIT:
                case Leader.COMMITANDACTIVATE:
                    pif = packetsNotCommitted.peekFirst();
```

### DataFlowIssue
Switch label `Leader.COMMITANDACTIVATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    break;
                case Leader.COMMIT:
                case Leader.COMMITANDACTIVATE:
                    pif = packetsNotCommitted.peekFirst();
                    if (pif.hdr.getZxid() == qp.getZxid() && qp.getType() == Leader.COMMITANDACTIVATE) {
```

### DataFlowIssue
Switch label `Leader.INFORM` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    }
                    break;
                case Leader.INFORM:
                case Leader.INFORMANDACTIVATE:
                    PacketInFlight packet = new PacketInFlight();
```

### DataFlowIssue
Switch label `Leader.INFORMANDACTIVATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    break;
                case Leader.INFORM:
                case Leader.INFORMANDACTIVATE:
                    PacketInFlight packet = new PacketInFlight();

```

### DataFlowIssue
Switch label `Leader.UPTODATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java

                    break;
                case Leader.UPTODATE:
                    LOG.info("Learner received UPTODATE message");
                    if (newLeaderQV != null) {
```

### DataFlowIssue
Switch label `Leader.NEWLEADER` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                    self.adminServer.setZooKeeperServer(zk);
                    break outerLoop;
                case Leader.NEWLEADER: // Getting NEWLEADER here instead of in discovery
                    // means this is Zab 1.0
                    LOG.info("Learner received NEWLEADER message");
```

### DataFlowIssue
Argument `StringUtils.joinStrings(servers, "\n")` might be null
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeerConfig.java`
#### Snippet
```java

                Collections.sort(servers);
                out.write(StringUtils.joinStrings(servers, "\n"));
            }
        });
```

### DataFlowIssue
Method invocation `isThrottled` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
                        request = committedRequests.peek();

                        if (request.isThrottled()) {
                            LOG.error("Throttled request in committed pool: {}. Exiting.", request);
                            ServiceUtils.requestSystemExit(ExitCode.UNEXPECTED_ERROR.getValue());
```

### DataFlowIssue
Method invocation `setHdr` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java
                                 * session that needs to be notified.
                                 */
                                topPending.setHdr(request.getHdr());
                                topPending.setTxn(request.getTxn());
                                topPending.setTxnDigest(request.getTxnDigest());
```

### DataFlowIssue
Switch label `Leader.ACK` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java

        switch (p.getType()) {
        case Leader.ACK:
            type = "ACK";
            break;
```

### DataFlowIssue
Switch label `Leader.COMMIT` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "ACK";
            break;
        case Leader.COMMIT:
            type = "COMMIT";
            break;
```

### DataFlowIssue
Switch label `Leader.FOLLOWERINFO` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "COMMIT";
            break;
        case Leader.FOLLOWERINFO:
            type = "FOLLOWERINFO";
            break;
```

### DataFlowIssue
Switch label `Leader.NEWLEADER` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "FOLLOWERINFO";
            break;
        case Leader.NEWLEADER:
            type = "NEWLEADER";
            break;
```

### DataFlowIssue
Switch label `Leader.PING` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "NEWLEADER";
            break;
        case Leader.PING:
            type = "PING";
            break;
```

### DataFlowIssue
Switch label `Leader.PROPOSAL` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "PING";
            break;
        case Leader.PROPOSAL:
            type = "PROPOSAL";
            break;
```

### DataFlowIssue
Switch label `Leader.REQUEST` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "PROPOSAL";
            break;
        case Leader.REQUEST:
            type = "REQUEST";
            break;
```

### DataFlowIssue
Switch label `Leader.REVALIDATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "REQUEST";
            break;
        case Leader.REVALIDATE:
            type = "REVALIDATE";
            ByteArrayInputStream bis = new ByteArrayInputStream(p.getData());
```

### DataFlowIssue
Switch label `Leader.UPTODATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java

            break;
        case Leader.UPTODATE:
            type = "UPTODATE";
            break;
```

### DataFlowIssue
Switch label `Leader.DIFF` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "UPTODATE";
            break;
        case Leader.DIFF:
            type = "DIFF";
            break;
```

### DataFlowIssue
Switch label `Leader.TRUNC` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "DIFF";
            break;
        case Leader.TRUNC:
            type = "TRUNC";
            break;
```

### DataFlowIssue
Switch label `Leader.SNAP` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "TRUNC";
            break;
        case Leader.SNAP:
            type = "SNAP";
            break;
```

### DataFlowIssue
Switch label `Leader.ACKEPOCH` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "SNAP";
            break;
        case Leader.ACKEPOCH:
            type = "ACKEPOCH";
            break;
```

### DataFlowIssue
Switch label `Leader.SYNC` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "ACKEPOCH";
            break;
        case Leader.SYNC:
            type = "SYNC";
            break;
```

### DataFlowIssue
Switch label `Leader.INFORM` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "SYNC";
            break;
        case Leader.INFORM:
            type = "INFORM";
            break;
```

### DataFlowIssue
Switch label `Leader.COMMITANDACTIVATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "INFORM";
            break;
        case Leader.COMMITANDACTIVATE:
            type = "COMMITANDACTIVATE";
            break;
```

### DataFlowIssue
Switch label `Leader.INFORMANDACTIVATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
            type = "COMMITANDACTIVATE";
            break;
        case Leader.INFORMANDACTIVATE:
            type = "INFORMANDACTIVATE";
            break;
```

### DataFlowIssue
Switch label `Leader.ACK` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java

                switch (qp.getType()) {
                case Leader.ACK:
                    if (this.learnerType == LearnerType.OBSERVER) {
                        LOG.debug("Received ACK from Observer {}", this.sid);
```

### DataFlowIssue
Switch label `Leader.PING` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
                    learnerMaster.processAck(this.sid, qp.getZxid(), sock.getLocalSocketAddress());
                    break;
                case Leader.PING:
                    // Process the touches
                    ByteArrayInputStream bis = new ByteArrayInputStream(qp.getData());
```

### DataFlowIssue
Switch label `Leader.REVALIDATE` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
                    }
                    break;
                case Leader.REVALIDATE:
                    ServerMetrics.getMetrics().REVALIDATE_COUNT.add(1);
                    learnerMaster.revalidateSession(qp, this);
```

### DataFlowIssue
Switch label `Leader.REQUEST` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java
                    learnerMaster.revalidateSession(qp, this);
                    break;
                case Leader.REQUEST:
                    bb = ByteBuffer.wrap(qp.getData());
                    sessionId = bb.getLong();
```

### DataFlowIssue
Method invocation `hasInitialResponse` may produce `NullPointerException`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/auth/SaslQuorumAuthLearner.java`
#### Snippet
```java
                "QuorumLearner");

            if (sc.hasInitialResponse()) {
                responseToken = createSaslToken(new byte[0], sc, learnerLogin);
            }
```

### DataFlowIssue
Variable is already assigned to this value
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                            switch (rstate) {
                            case 0:
                                ackstate = QuorumPeer.ServerState.LOOKING;
                                break;
                            case 1:
```

### DataFlowIssue
Switch label `OpCode.createSession` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnSnapLog.java`
#### Snippet
```java
        ProcessTxnResult rc;
        switch (hdr.getType()) {
        case OpCode.createSession:
            sessions.put(hdr.getClientId(), ((CreateSessionTxn) txn).getTimeOut());
            if (LOG.isTraceEnabled()) {
```

### DataFlowIssue
Switch label `OpCode.closeSession` is unreachable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnSnapLog.java`
#### Snippet
```java
            rc = dt.processTxn(hdr, txn);
            break;
        case OpCode.closeSession:
            sessions.remove(hdr.getClientId());
            if (LOG.isTraceEnabled()) {
```

## RuleId[ruleID=ParameterCanBeLocal]
### ParameterCanBeLocal
Parameter can be converted to a local variable
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
    }

    private Vote receivedFollowingNotification(Map<Long, Vote> recvset, Map<Long, Vote> outofelection, SyncedLearnerTracker voteSet, Notification n) {
        /*
         * Consider all notifications from the same epoch
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'NoSyncConnected' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/Watcher.java`
#### Snippet
```java
            /** Unused, this state is never generated by the server */
            @Deprecated
            NoSyncConnected(1),

            /** The client is in the connected state - it is connected
```

### DeprecatedIsStillUsed
Deprecated member 'APIError' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int APIError = -100;

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'EphemeralOnLocalSession' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java

        @Deprecated
        int EphemeralOnLocalSession = -120;

    }
```

### DeprecatedIsStillUsed
Deprecated member 'NewConfigNoQuorum' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int NewConfigNoQuorum = -13;

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'NodeExists' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int NodeExists = -110;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#NOTEMPTY} instead
```

### DeprecatedIsStillUsed
Deprecated member 'BadVersion' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int BadVersion = -103;
        /**
         * @deprecated deprecated in 3.1.0, use
```

### DeprecatedIsStillUsed
Deprecated member 'SessionExpired' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int SessionExpired = -112;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#INVALIDCALLBACK}
```

### DeprecatedIsStillUsed
Deprecated member 'NotEmpty' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int NotEmpty = -111;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#SESSIONEXPIRED} instead
```

### DeprecatedIsStillUsed
Deprecated member 'MarshallingError' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int MarshallingError = -5;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#UNIMPLEMENTED}
```

### DeprecatedIsStillUsed
Deprecated member 'ConnectionLoss' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int ConnectionLoss = -4;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#MARSHALLINGERROR}
```

### DeprecatedIsStillUsed
Deprecated member 'InvalidCallback' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int InvalidCallback = -113;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#INVALIDACL} instead
```

### DeprecatedIsStillUsed
Deprecated member 'SystemError' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int SystemError = -1;
        /**
         * @deprecated deprecated in 3.1.0, use
```

### DeprecatedIsStillUsed
Deprecated member 'Ok' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int Ok = 0;

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'InvalidACL' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int InvalidACL = -114;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#AUTHFAILED} instead
```

### DeprecatedIsStillUsed
Deprecated member 'ReconfigInProgress' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int ReconfigInProgress = -14;

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'BadArguments' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int BadArguments = -8;

        @Deprecated
```

### DeprecatedIsStillUsed
Deprecated member 'OperationTimeout' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int OperationTimeout = -7;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#BADARGUMENTS}
```

### DeprecatedIsStillUsed
Deprecated member 'DataInconsistency' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int DataInconsistency = -3;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#CONNECTIONLOSS}
```

### DeprecatedIsStillUsed
Deprecated member 'NoAuth' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int NoAuth = -102;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#BADVERSION} instead
```

### DeprecatedIsStillUsed
Deprecated member 'NoNode' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int NoNode = -101;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#NOAUTH} instead
```

### DeprecatedIsStillUsed
Deprecated member 'CodeDeprecated' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
    @Deprecated
    @InterfaceAudience.Public
    public interface CodeDeprecated {

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'RuntimeInconsistency' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int RuntimeInconsistency = -2;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#DATAINCONSISTENCY}
```

### DeprecatedIsStillUsed
Deprecated member 'Unimplemented' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int Unimplemented = -6;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#OPERATIONTIMEOUT}
```

### DeprecatedIsStillUsed
Deprecated member 'UnknownSession' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java

        @Deprecated
        int UnknownSession = -12;

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'NoChildrenForEphemerals' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/KeeperException.java`
#### Snippet
```java
         */
        @Deprecated
        int NoChildrenForEphemerals = -108;
        /**
         * @deprecated deprecated in 3.1.0, use {@link Code#NODEEXISTS} instead
```

### DeprecatedIsStillUsed
Deprecated member 'ENABLE_CLIENT_SASL_KEY' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String ENABLE_CLIENT_SASL_KEY = "zookeeper.sasl.client";
    /**
     * @deprecated Use {@link ZKClientConfig#ENABLE_CLIENT_SASL_DEFAULT}
```

### DeprecatedIsStillUsed
Deprecated member 'ENABLE_CLIENT_SASL_DEFAULT' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String ENABLE_CLIENT_SASL_DEFAULT = "true";
    private volatile boolean initializedLogin = false;

```

### DeprecatedIsStillUsed
Deprecated member 'ResponderThread' is still used
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
     */
    @Deprecated
    class ResponderThread extends ZooKeeperThread {

        ResponderThread() {
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKUtil.java`
#### Snippet
```java
     */
    public static String getPermString(int perms) {
        return permCache.computeIfAbsent(perms, k -> constructPermString(k));
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
        commandMap.put("quit", "");
        Stream.of(CommandFactory.Command.values())
            .map(command -> CommandFactory.getInstance(command))
            // add all commands to commandMapCli and commandMap
            .forEach(cliCommand ->{
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/RequestPathMetricsCollector.java`
#### Snippet
```java
        Map<String, Integer> mapReducePaths(int maxDepth, Collection<String> tobeProcessedSlot) {
            Map<String, Integer> newSlot = new ConcurrentHashMap<>();
            tobeProcessedSlot.stream().filter(path -> path != null).forEach((path) -> {
                path = trimPathDepth(path, maxDepth);
                newSlot.put(path, newSlot.getOrDefault(path, 0) + 1);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/RequestPathMetricsCollector.java`
#### Snippet
```java
                        entry -> LOG.info("{} : {}", entry.getKey(), entry.getValue()));
            LOG.info("%nHere are the top Write paths:");
            logTopPaths(aggregatePaths(4, queue -> queue.isWriteOperation()),
                        entry -> LOG.info("{} : {}", entry.getKey(), entry.getValue()));
        }, COLLECTOR_INITIAL_DELAY, COLLECTOR_DELAY, TimeUnit.MINUTES);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LeaderZooKeeperServer.java`
#### Snippet
```java
        rootContext.registerGauge("synced_observers", self::getSynced_observers_metric);
        rootContext.registerGauge("pending_syncs", gaugeWithLeader(
                (leader) -> leader.getNumPendingSyncs()
        ));
        rootContext.registerGauge("leader_uptime", gaugeWithLeader(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LeaderZooKeeperServer.java`
#### Snippet
```java
        ));
        rootContext.registerGauge("leader_uptime", gaugeWithLeader(
                (leader) -> leader.getUptime()
        ));
        rootContext.registerGauge("last_proposal_size", gaugeWithLeader(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java

        rootContext.registerGauge("quorum_size", () -> {
            return self.getQuorumSize();
        });
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
            if (sockBeingClosed.compareAndSet(false, true)) {
                if (closeSocketAsync) {
                    final Thread closingThread = new Thread(() -> closeSockSync(), "CloseSocketThread(sid:" + zk.getServerId());
                    closingThread.setDaemon(true);
                    closingThread.start();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
     * Socket factory, allowing the injection of custom socket implementations for testing
     */
    static final Supplier<Socket> DEFAULT_SOCKET_FACTORY = () -> new Socket();
    private static Supplier<Socket> SOCKET_FACTORY = DEFAULT_SOCKET_FACTORY;
    static void setSocketFactory(Supplier<Socket> factory) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandler.java`
#### Snippet
```java

    void closeSockAsync() {
        final Thread closingThread = new Thread(() -> closeSockSync(), "CloseSocketThread(sid:" + this.sid);
        closingThread.setDaemon(true);
        closingThread.start();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
        public Counter getCounter(String name) {
            return counters.computeIfAbsent(name, (n) -> {
                return new SimpleCounter(n);
            });
        }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
        void reset() {
            counters.values().forEach(metric -> {
                metric.reset();
            });
            counterSets.values().forEach(metric -> {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
            });
            counterSets.values().forEach(metric -> {
                metric.reset();
            });
            basicSummaries.values().forEach(metric -> {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
            });
            basicSummaries.values().forEach(metric -> {
                metric.reset();
            });
            summaries.values().forEach(metric -> {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
            });
            summaries.values().forEach(metric -> {
                metric.reset();
            });
            basicSummarySets.values().forEach(metric -> {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
            });
            basicSummarySets.values().forEach(metric -> {
                metric.reset();
            });
            summarySets.values().forEach(metric -> {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/impl/DefaultMetricsProvider.java`
#### Snippet
```java
            });
            summarySets.values().forEach(metric -> {
                metric.reset();
            });
            // no need to reset gauges
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslOcspEnabledProperty = getConfigPrefix() + "ocsp";
    private String sslClientAuthProperty = getConfigPrefix() + "clientAuth";
    private String sslHandshakeDetectionTimeoutMillisProperty = getConfigPrefix() + "handshakeDetectionTimeoutMillis";

    private ZKConfig zkConfig;
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslEnabledProtocolsProperty = getConfigPrefix() + "enabledProtocols";
    private String cipherSuitesProperty = getConfigPrefix() + "ciphersuites";
    private String sslKeystoreLocationProperty = getConfigPrefix() + "keyStore.location";
    private String sslKeystorePasswdProperty = getConfigPrefix() + "keyStore.password";
    private String sslKeystorePasswdPathProperty = getConfigPrefix() + "keyStore.passwordPath";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslTruststoreLocationProperty = getConfigPrefix() + "trustStore.location";
    private String sslTruststorePasswdProperty = getConfigPrefix() + "trustStore.password";
    private String sslTruststorePasswdPathProperty = getConfigPrefix() + "trustStore.passwordPath";
    private String sslTruststoreTypeProperty = getConfigPrefix() + "trustStore.type";
    private String sslContextSupplierClassProperty = getConfigPrefix() + "context.supplier.class";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslContextSupplierClassProperty = getConfigPrefix() + "context.supplier.class";
    private String sslHostnameVerificationEnabledProperty = getConfigPrefix() + "hostnameVerification";
    private String sslCrlEnabledProperty = getConfigPrefix() + "crl";
    private String sslOcspEnabledProperty = getConfigPrefix() + "ocsp";
    private String sslClientAuthProperty = getConfigPrefix() + "clientAuth";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslTruststorePasswdProperty = getConfigPrefix() + "trustStore.password";
    private String sslTruststorePasswdPathProperty = getConfigPrefix() + "trustStore.passwordPath";
    private String sslTruststoreTypeProperty = getConfigPrefix() + "trustStore.type";
    private String sslContextSupplierClassProperty = getConfigPrefix() + "context.supplier.class";
    private String sslHostnameVerificationEnabledProperty = getConfigPrefix() + "hostnameVerification";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    }

    private String sslProtocolProperty = getConfigPrefix() + "protocol";
    private String sslEnabledProtocolsProperty = getConfigPrefix() + "enabledProtocols";
    private String cipherSuitesProperty = getConfigPrefix() + "ciphersuites";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslProtocolProperty = getConfigPrefix() + "protocol";
    private String sslEnabledProtocolsProperty = getConfigPrefix() + "enabledProtocols";
    private String cipherSuitesProperty = getConfigPrefix() + "ciphersuites";
    private String sslKeystoreLocationProperty = getConfigPrefix() + "keyStore.location";
    private String sslKeystorePasswdProperty = getConfigPrefix() + "keyStore.password";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String cipherSuitesProperty = getConfigPrefix() + "ciphersuites";
    private String sslKeystoreLocationProperty = getConfigPrefix() + "keyStore.location";
    private String sslKeystorePasswdProperty = getConfigPrefix() + "keyStore.password";
    private String sslKeystorePasswdPathProperty = getConfigPrefix() + "keyStore.passwordPath";
    private String sslKeystoreTypeProperty = getConfigPrefix() + "keyStore.type";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslKeystorePasswdPathProperty = getConfigPrefix() + "keyStore.passwordPath";
    private String sslKeystoreTypeProperty = getConfigPrefix() + "keyStore.type";
    private String sslTruststoreLocationProperty = getConfigPrefix() + "trustStore.location";
    private String sslTruststorePasswdProperty = getConfigPrefix() + "trustStore.password";
    private String sslTruststorePasswdPathProperty = getConfigPrefix() + "trustStore.passwordPath";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java

    private String sslProtocolProperty = getConfigPrefix() + "protocol";
    private String sslEnabledProtocolsProperty = getConfigPrefix() + "enabledProtocols";
    private String cipherSuitesProperty = getConfigPrefix() + "ciphersuites";
    private String sslKeystoreLocationProperty = getConfigPrefix() + "keyStore.location";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslHostnameVerificationEnabledProperty = getConfigPrefix() + "hostnameVerification";
    private String sslCrlEnabledProperty = getConfigPrefix() + "crl";
    private String sslOcspEnabledProperty = getConfigPrefix() + "ocsp";
    private String sslClientAuthProperty = getConfigPrefix() + "clientAuth";
    private String sslHandshakeDetectionTimeoutMillisProperty = getConfigPrefix() + "handshakeDetectionTimeoutMillis";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslKeystoreLocationProperty = getConfigPrefix() + "keyStore.location";
    private String sslKeystorePasswdProperty = getConfigPrefix() + "keyStore.password";
    private String sslKeystorePasswdPathProperty = getConfigPrefix() + "keyStore.passwordPath";
    private String sslKeystoreTypeProperty = getConfigPrefix() + "keyStore.type";
    private String sslTruststoreLocationProperty = getConfigPrefix() + "trustStore.location";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslCrlEnabledProperty = getConfigPrefix() + "crl";
    private String sslOcspEnabledProperty = getConfigPrefix() + "ocsp";
    private String sslClientAuthProperty = getConfigPrefix() + "clientAuth";
    private String sslHandshakeDetectionTimeoutMillisProperty = getConfigPrefix() + "handshakeDetectionTimeoutMillis";

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslKeystoreTypeProperty = getConfigPrefix() + "keyStore.type";
    private String sslTruststoreLocationProperty = getConfigPrefix() + "trustStore.location";
    private String sslTruststorePasswdProperty = getConfigPrefix() + "trustStore.password";
    private String sslTruststorePasswdPathProperty = getConfigPrefix() + "trustStore.passwordPath";
    private String sslTruststoreTypeProperty = getConfigPrefix() + "trustStore.type";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslTruststoreTypeProperty = getConfigPrefix() + "trustStore.type";
    private String sslContextSupplierClassProperty = getConfigPrefix() + "context.supplier.class";
    private String sslHostnameVerificationEnabledProperty = getConfigPrefix() + "hostnameVerification";
    private String sslCrlEnabledProperty = getConfigPrefix() + "crl";
    private String sslOcspEnabledProperty = getConfigPrefix() + "ocsp";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslTruststorePasswdPathProperty = getConfigPrefix() + "trustStore.passwordPath";
    private String sslTruststoreTypeProperty = getConfigPrefix() + "trustStore.type";
    private String sslContextSupplierClassProperty = getConfigPrefix() + "context.supplier.class";
    private String sslHostnameVerificationEnabledProperty = getConfigPrefix() + "hostnameVerification";
    private String sslCrlEnabledProperty = getConfigPrefix() + "crl";
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConfigPrefix()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/X509Util.java`
#### Snippet
```java
    private String sslKeystorePasswdProperty = getConfigPrefix() + "keyStore.password";
    private String sslKeystorePasswdPathProperty = getConfigPrefix() + "keyStore.passwordPath";
    private String sslKeystoreTypeProperty = getConfigPrefix() + "keyStore.type";
    private String sslTruststoreLocationProperty = getConfigPrefix() + "trustStore.location";
    private String sslTruststorePasswdProperty = getConfigPrefix() + "trustStore.password";
```

## RuleId[ruleID=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return number but the return type is array
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ConnectionMXBean.java`
#### Snippet
```java
    String getStartedTime();
    /**
     * @return number of ephemeral nodes owned by this connection
     */
    String[] getEphemeralNodes();
```

## RuleId[ruleID=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `zookeeper-server/src/main/java/org/apache/zookeeper/Shell.java`
#### Snippet
```java
        try {
            errThread.start();
        } catch (IllegalStateException ise) {
        }
        try {
```

### CatchMayIgnoreException
Empty `catch` block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/controller/ControllerService.java`
#### Snippet
```java
            try {
                svc.run();
            } catch (Exception e) {
            }
        });
```

### CatchMayIgnoreException
Empty `catch` block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/Util.java`
#### Snippet
```java
            }
            return bytes;
        } catch (EOFException e) {
        }
        return null;
```

### CatchMayIgnoreException
Empty `catch` block
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/Util.java`
#### Snippet
```java
            try {
                zxid = Long.parseLong(nameParts[1], 16);
            } catch (NumberFormatException e) {
            }
        }
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
                    } else if (now < nextRefresh) {
                        Date until = new Date(nextRefresh);
                        LOG.info("TGT refresh sleeping until: {}", until.toString());
                        try {
                            Thread.sleep(nextRefresh - now);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/StatPrinter.java`
#### Snippet
```java
    public void print(Stat stat) {
        out.println("cZxid = 0x" + Long.toHexString(stat.getCzxid()));
        out.println("ctime = " + new Date(stat.getCtime()).toString());
        out.println("mZxid = 0x" + Long.toHexString(stat.getMzxid()));
        out.println("mtime = " + new Date(stat.getMtime()).toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/StatPrinter.java`
#### Snippet
```java
        out.println("ctime = " + new Date(stat.getCtime()).toString());
        out.println("mZxid = 0x" + Long.toHexString(stat.getMzxid()));
        out.println("mtime = " + new Date(stat.getMtime()).toString());
        out.println("pZxid = 0x" + Long.toHexString(stat.getPzxid()));
        out.println("cversion = " + stat.getCversion());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java
            return new InetSocketAddress(resolvedAddresses.get(0), address.getPort());
        } catch (UnknownHostException e) {
            LOG.error("Unable to resolve address: {}", address.toString(), e);
            return address;
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
    private void printStat(StatPersisted stat) {
        printHex("cZxid", stat.getCzxid());
        System.out.println("  ctime = " + new Date(stat.getCtime()).toString());
        printHex("mZxid", stat.getMzxid());
        System.out.println("  mtime = " + new Date(stat.getMtime()).toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotFormatter.java`
#### Snippet
```java
        System.out.println("  ctime = " + new Date(stat.getCtime()).toString());
        printHex("mZxid", stat.getMzxid());
        System.out.println("  mtime = " + new Date(stat.getMtime()).toString());
        printHex("pZxid", stat.getPzxid());
        System.out.println("  cversion = " + stat.getCversion());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                                LOG.info("Got user-level KeeperException when processing {} aborting"
                                         + " remaining multi ops. Error Path:{} Error:{}",
                                         request.toString(),
                                         e.getPath(),
                                         e.getMessage());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                LOG.info(
                    "Got user-level KeeperException when processing {} Error Path:{} Error:{}",
                    request.toString(),
                    e.getPath(),
                    e.getMessage());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      builder.append(String.format("Node %s found only in left tree. ", node.label));
      printNode(node, builder);
      System.out.println(builder.toString());
    } else if (debug || interactive) {
      System.out.println(String.format("Filtered left node %s of size %d", node.label, node.descendantSize));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
      builder.append(String.format("Node %s found only in right tree. ", node.label));
      printNode(node, builder);
      System.out.println(builder.toString());
    } else if (debug || interactive) {
      System.out.println(String.format("Filtered right node %s of size %d", node.label, node.descendantSize));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java
    TreeInfo rightTree = new TreeInfo(right);

    System.out.println(leftTree.toString());
    System.out.println(rightTree.toString());

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/SnapshotComparer.java`
#### Snippet
```java

    System.out.println(leftTree.toString());
    System.out.println(rightTree.toString());

    compareTrees(leftTree, rightTree, byteThreshold, nodeThreshold, debug, interactive);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/auth/KerberosName.java`
#### Snippet
```java
            }
        }
        throw new NoMatchingRule("No rules applied to " + toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/VerifyingFileFactory.java`
#### Snippet
```java
    private void doFailForNonExistingPath(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file.toString() + " file is missing");
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ConfigUtils.java`
#### Snippet
```java
            }
        }
        return version + " " + sb.toString();
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/JvmPauseMonitor.java`
#### Snippet
```java
            GcTimes diff = gcTimesAfterSleep.get(name).subtract(gcTimesBeforeSleep.get(name));
            if (diff.gcCount != 0) {
                gcDiffs.add("GC pool '" + name + "' had collection(s): " + diff.toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
                sessionTracker.commitSession(sessionId, cst.getTimeOut());
            } else if (request == null || !request.isLocalSession()) {
                LOG.warn("*****>>>>> Got {} {}",  txn.getClass(), txn.toString());
            }
        } else if (opCode == OpCode.closeSession) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LeaderBean.java`
#### Snippet
```java
        for (LearnerHandler handler : leader.getLearners()) {
            if (handler.getLearnerType() == LearnerType.PARTICIPANT) {
                sb.append(handler.toString()).append("\n");
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
                        try {
                            if (address.isReachable(500)) {
                                LOG.debug("destination address {} is reachable for sid {}", address.toString(), sid);
                                ongoingAsyncValidation.set(false);
                                return;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
                                Duration.ofMillis(self.getMultiAddressReachabilityCheckTimeoutMs()));
                    }
                    LOG.debug("Initial message parsed by {}: {}", self.getMyId(), init.toString());
                } catch (InitialMessage.InitialMessageException ex) {
                    LOG.error("Initial message parsing error!", ex);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
                // the last-seen-quorumverifier of the leader, which we change below
                try {
                    LOG.debug(String.format("set lastSeenQuorumVerifier to currentQuorumVerifier (%s)", curQV.toString()));
                    QuorumVerifier newQV = self.configFromString(curQV.toString());
                    newQV.setVersion(zk.getZxid());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerHandlerBean.java`
#### Snippet
```java
    @Override
    public void terminateConnection() {
        LOG.info("terminating learner handler connection on demand {}", toString());
        learnerHandler.shutdown();
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumHierarchical.java`
#### Snippet
```java
        try {
            if (!configFile.exists()) {
                throw new IllegalArgumentException(configFile.toString() + " file is missing");
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
        txnLogFile = loadTxnFile(txnLogFileName);
        if (recoveryMode) {
            recoveryLogFile = new File(txnLogFile.toString() + ".fixed");
            if (recoveryLogFile.exists()) {
                throw new TxnLogToolkitException(
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
            sb.append(addr).append(",");
        }
        LOG.info("Updated learner master list to be {}", sb.toString());
        Collections.shuffle(observerMasters);
        // Reset the internal index of the observerMaster when
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `AbstractSelectThread` may be 'static'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/NIOServerCnxnFactory.java`
#### Snippet
```java
     * and SelectorThread (which selects on client connections) classes.
     */
    private abstract class AbstractSelectThread extends ZooKeeperThread {

        protected final Selector selector;
```

## RuleId[ruleID=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/PrepRequestProcessor.java`
#### Snippet
```java
                if (n != null) {
                    Set<String> children;
                    synchronized (n) {
                        children = n.getChildren();
                    }
```

### NestedSynchronizedStatement
Nested `synchronized` statement
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatcherCleaner.java`
#### Snippet
```java
                ServerMetrics.getMetrics().DEAD_WATCHERS_QUEUED.add(1);
                if (deadWatchers.size() >= watcherCleanThreshold) {
                    synchronized (cleanEvent) {
                        cleanEvent.notifyAll();
                    }
```

### NestedSynchronizedStatement
Nested `synchronized` statement
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                    ephemerals.put(ephemeralOwner, list);
                }
                synchronized (list) {
                    list.add(path);
                }
```

### NestedSynchronizedStatement
Nested `synchronized` statement
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                Set<String> nodes = ephemerals.get(eowner);
                if (nodes != null) {
                    synchronized (nodes) {
                        nodes.remove(path);
                    }
```

### NestedSynchronizedStatement
Nested `synchronized` statement
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
        Object outerLockObject = (qcm != null) ? qcm : QV_LOCK;
        synchronized (outerLockObject) {
            synchronized (QV_LOCK) {
                if (lastSeenQuorumVerifier != null && lastSeenQuorumVerifier.getVersion() > qv.getVersion()) {
                    LOG.error("setLastSeenQuorumVerifier called with stale config "
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java

    public void executeLine(String line) throws InterruptedException, IOException {
        if (!line.equals("")) {
            cl.parseCommand(line);
            addToHistory(commandCount, line);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        updateWriteStat(path, bytes);
        dataWatches.triggerWatch(path, Event.EventType.NodeCreated);
        childWatches.triggerWatch(parentName.equals("") ? "/" : parentName, Event.EventType.NodeChildrenChanged);
    }

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        WatcherOrBitSet processed = dataWatches.triggerWatch(path, EventType.NodeDeleted);
        childWatches.triggerWatch(path, EventType.NodeDeleted, processed);
        childWatches.triggerWatch("".equals(parentName) ? "/" : parentName, EventType.NodeChildrenChanged);
    }

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/TxnLogToolkit.java`
#### Snippet
```java
                Request.op2String(hdr.getType()),
            txnStr);
        if (prefix != null && !"".equals(prefix.trim())) {
            System.out.print(prefix + " - ");
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `zookeeper-jute/src/main/java/org/apache/jute/ToStringOutputArchive.java`
#### Snippet
```java

    public void startRecord(Record r, String tag) throws IOException {
        if (tag != null && !"".equals(tag)) {
            printCommaUnlessFirst();
            stream.print("s{");
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `zookeeper-jute/src/main/java/org/apache/jute/ToStringOutputArchive.java`
#### Snippet
```java

    public void endRecord(Record r, String tag) throws IOException {
        if (tag == null || "".equals(tag)) {
            stream.print("\n");
            isFirst = true;
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZKClientConfig.java`
#### Snippet
```java
     */
    public boolean isSaslClientEnabled() {
        return Boolean.valueOf(getProperty(ENABLE_CLIENT_SASL_KEY, ENABLE_CLIENT_SASL_DEFAULT));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/BitMap.java`
#### Snippet
```java

    private final BitSet freedBitSet = new BitSet();
    private Integer nextBit = Integer.valueOf(0);

    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
```

### UnnecessaryBoxing
Unnecessary boxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumMaj.java`
#### Snippet
```java
        for (QuorumServer qs : allMembers.values()) {
            if (qs.type == LearnerType.PARTICIPANT) {
                votingMembers.put(Long.valueOf(qs.id), qs);
            } else {
                observingMembers.put(Long.valueOf(qs.id), qs);
```

### UnnecessaryBoxing
Unnecessary boxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumMaj.java`
#### Snippet
```java
                votingMembers.put(Long.valueOf(qs.id), qs);
            } else {
                observingMembers.put(Long.valueOf(qs.id), qs);
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumMaj.java`
#### Snippet
```java
                long sid = Long.parseLong(key.substring(dot + 1));
                QuorumServer qs = new QuorumServer(sid, value);
                allMembers.put(Long.valueOf(sid), qs);
                if (qs.type == LearnerType.PARTICIPANT) {
                    votingMembers.put(Long.valueOf(sid), qs);
```

### UnnecessaryBoxing
Unnecessary boxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumMaj.java`
#### Snippet
```java
                allMembers.put(Long.valueOf(sid), qs);
                if (qs.type == LearnerType.PARTICIPANT) {
                    votingMembers.put(Long.valueOf(sid), qs);
                } else {
                    observingMembers.put(Long.valueOf(sid), qs);
```

### UnnecessaryBoxing
Unnecessary boxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumMaj.java`
#### Snippet
```java
                    votingMembers.put(Long.valueOf(sid), qs);
                } else {
                    observingMembers.put(Long.valueOf(sid), qs);
                }
            } else if (key.equals("version")) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumHierarchical.java`
#### Snippet
```java
                long sid = Long.parseLong(key.substring(dot + 1));
                QuorumServer qs = new QuorumServer(sid, value);
                allMembers.put(Long.valueOf(sid), qs);
                if (qs.type == LearnerType.PARTICIPANT) {
                    participatingMembers.put(Long.valueOf(sid), qs);
```

### UnnecessaryBoxing
Unnecessary boxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumHierarchical.java`
#### Snippet
```java
                allMembers.put(Long.valueOf(sid), qs);
                if (qs.type == LearnerType.PARTICIPANT) {
                    participatingMembers.put(Long.valueOf(sid), qs);
                } else {
                    observingMembers.put(Long.valueOf(sid), qs);
```

### UnnecessaryBoxing
Unnecessary boxing
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumHierarchical.java`
#### Snippet
```java
                    participatingMembers.put(Long.valueOf(sid), qs);
                } else {
                    observingMembers.put(Long.valueOf(sid), qs);
                }
            } else if (key.startsWith("group")) {
```

## RuleId[ruleID=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `login`
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/ZooKeeperSaslClient.java`
#### Snippet
```java
        Subject subject = login.getSubject();
        if (subject != null) {
            synchronized (login) {
                try {
                    final byte[] retval = Subject.doAs(subject, new PrivilegedExceptionAction<byte[]>() {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `upgradeableSessionTracker`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumZooKeeperServer.java`
#### Snippet
```java
        // session, and make the session creation request.  This is to
        // avoid another thread upgrading the session in parallel.
        synchronized (upgradeableSessionTracker) {
            if (upgradeableSessionTracker.isLocalSession(sessionId)) {
                int timeout = upgradeableSessionTracker.upgradeSession(sessionId);
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `digestLog`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
        lastProcessedZxidDigest = zxidDigest;
        if (zxidDigest.zxid % DIGEST_LOG_INTERVAL == 0) {
            synchronized (digestLog) {
                digestLog.add(zxidDigest);
                if (digestLog.size() > DIGEST_LOG_LIMIT) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `digestLog`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
     */
    public List<ZxidDigest> getDigestLog() {
        synchronized (digestLog) {
            // Return a copy of current digest log
            return new LinkedList<>(digestLog);
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `leaderIs`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
     */
    void readPacket(QuorumPacket pp) throws IOException {
        synchronized (leaderIs) {
            leaderIs.readRecord(pp, "packet");
            messageTracker.trackReceived(pp.getType());
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `leaderOs`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java

    void writePacketNow(QuorumPacket pp, boolean flush) throws IOException {
        synchronized (leaderOs) {
            if (pp != null) {
                messageTracker.trackSent(pp.getType());
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `zk`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
        Deque<Long> packetsCommitted = new ArrayDeque<>();
        Deque<PacketInFlight> packetsNotCommitted = new ArrayDeque<>();
        synchronized (zk) {
            if (qp.getType() == Leader.DIFF) {
                LOG.info("Getting a diff from the leader 0x{}", Long.toHexString(qp.getZxid()));
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `emptyPoolSync`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java

        long startWaitTime = Time.currentElapsedTime();
        synchronized (emptyPoolSync) {
            while ((!stopped) && isProcessingRequest()) {
                emptyPoolSync.wait();
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `emptyPoolSync`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/CommitProcessor.java`
#### Snippet
```java

    private void wakeupOnEmpty() {
        synchronized (emptyPoolSync) {
            emptyPoolSync.notifyAll();
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `newLeaderProposal.qvAcksetPairs`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Leader.java`
#### Snippet
```java
    public void waitForNewLeaderAck(long sid, long zxid) throws InterruptedException {

        synchronized (newLeaderProposal.qvAcksetPairs) {

            if (quorumFormed) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `self`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/FastLeaderElection.java`
#### Snippet
```java
                                response.buffer.get(b);

                                synchronized (self) {
                                    try {
                                        rqv = self.configFromString(new String(b, UTF_8));
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `listeners`
in `zookeeper-recipes/zookeeper-recipes-election/src/main/java/org/apache/zookeeper/recipes/leader/LeaderElectionSupport.java`
#### Snippet
```java
        LOG.debug("Dispatching event: {}", eventType);

        synchronized (listeners) {
            if (listeners.size() > 0) {
                for (LeaderElectionAware observer : listeners) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `leader`
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumPeer.java`
#### Snippet
```java
                            try {
                                long proposed;
                                synchronized (leader) {
                                    proposed = leader.lastProposed;
                                }
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'p.response instanceof ExistsResponse' covered by subsequent condition 'p.response instanceof SetDataResponse'
in `zookeeper-server/src/main/java/org/apache/zookeeper/ClientCnxn.java`
#### Snippet
```java
                    if (p.cb == null) {
                        LOG.warn("Somehow a null cb got to EventThread!");
                    } else if (p.response instanceof ExistsResponse
                               || p.response instanceof SetDataResponse
                               || p.response instanceof SetACLResponse) {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/CreateMode.java`
#### Snippet
```java
     * a candidate to be deleted by the server at some point in the future.
     * Given this property, you should be prepared to get
     * {@link org.apache.zookeeper.KeeperException.NoNodeException}
     * when creating children inside of this container node.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKUtil.java`
#### Snippet
```java

    /**
     * Same as {@link #deleteRecursive(org.apache.zookeeper.ZooKeeper, java.lang.String, int)}
     * kept here for compatibility with 3.5 clients.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZKUtil.java`
#### Snippet
```java

    /**
     * Same as {@link #deleteRecursive(org.apache.zookeeper.ZooKeeper, java.lang.String, int)}
     * kept here for compatibility with 3.5 clients.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.security.auth.login` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
     * @param zkConfig
     *            client or server configurations
     * @throws javax.security.auth.login.LoginException
     *             Thrown if authentication fails.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.security.auth.login` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
    /**
     * Re-login a principal. This method assumes that {@link #login(String)} has happened already.
     * @throws javax.security.auth.login.LoginException on a failure
     */
    // c.f. HADOOP-6559
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/Op.java`
#### Snippet
```java
 * the provided factory methods.
 *
 * @see ZooKeeper#create(String, byte[], java.util.List, CreateMode)
 * @see ZooKeeper#create(String, byte[], java.util.List, CreateMode, org.apache.zookeeper.AsyncCallback.StringCallback, Object)
 * @see ZooKeeper#delete(String, int)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/Op.java`
#### Snippet
```java
 *
 * @see ZooKeeper#create(String, byte[], java.util.List, CreateMode)
 * @see ZooKeeper#create(String, byte[], java.util.List, CreateMode, org.apache.zookeeper.AsyncCallback.StringCallback, Object)
 * @see ZooKeeper#delete(String, int)
 * @see ZooKeeper#setData(String, byte[], int)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/Op.java`
#### Snippet
```java
 *
 * @see ZooKeeper#create(String, byte[], java.util.List, CreateMode)
 * @see ZooKeeper#create(String, byte[], java.util.List, CreateMode, org.apache.zookeeper.AsyncCallback.StringCallback, Object)
 * @see ZooKeeper#delete(String, int)
 * @see ZooKeeper#setData(String, byte[], int)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/Op.java`
#### Snippet
```java
    /**
     * Constructs a create operation.  Arguments are as for the ZooKeeper method of the same name.
     * @see ZooKeeper#create(String, byte[], java.util.List, CreateMode)
     *
     * @param path
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/Op.java`
#### Snippet
```java
     * Constructs a create operation.  Arguments are as for the ZooKeeper method of the same name
     * but adding an optional ttl
     * @see ZooKeeper#create(String, byte[], java.util.List, CreateMode)
     *
     * @param path
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/Op.java`
#### Snippet
```java
     * Constructs a create operation.  Arguments are as for the ZooKeeper method of the same name
     * but adding an optional ttl
     * @see ZooKeeper#create(String, byte[], java.util.List, CreateMode)
     * @see CreateMode#fromFlag(int)
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/Op.java`
#### Snippet
```java
    /**
     * Constructs a create operation.  Arguments are as for the ZooKeeper method of the same name.
     * @see ZooKeeper#create(String, byte[], java.util.List, CreateMode)
     * @see CreateMode#fromFlag(int)
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/FourLetterWordMain.java`
#### Snippet
```java
     * @param secure whether to use SSL
     * @return server response
     * @throws java.io.IOException
     * @throws SSLContextException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/FourLetterWordMain.java`
#### Snippet
```java
     * @param timeout in milliseconds, maximum time to wait while connecting/reading data
     * @return server response
     * @throws java.io.IOException
     * @throws SSLContextException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/FourLetterWordMain.java`
#### Snippet
```java
     * @param cmd the 4letterword
     * @return server response
     * @throws java.io.IOException
     * @throws SSLContextException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/common/PathUtils.java`
#### Snippet
```java
     public static String normalizeFileSystemPath(String path) {
         if (path != null) {
             String osname = java.lang.System.getProperty("os.name");
             if (osname.toLowerCase().contains("windows")) {
                 return path.replace('\\', '/');
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.server` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTreeBean.java`
#### Snippet
```java
    DataTree dataTree;

    public DataTreeBean(org.apache.zookeeper.server.DataTree dataTree) {
        this.dataTree = dataTree;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
     * @throws InterruptedException If the server transaction is interrupted.
     * @throws KeeperException If the server signals an error with a non-zero error code.
     * @throws org.apache.zookeeper.KeeperException.InvalidACLException If the acl is invalide.
     * @throws IllegalArgumentException if an invalid path is specified
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
     * @param request
     * @return true if request is permitted, false if not.
     * @throws java.io.IOException
     */
    public boolean authWriteRequest(Request request) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/RequestPathMetricsCollector.java`
#### Snippet
```java
        requestsMap.put(Request.op2String(setWatches2), new PathStatsQueue(setWatches2));
        requestsMap.put(Request.op2String(sync), new PathStatsQueue(sync));
        this.immutableRequestsMap = java.util.Collections.unmodifiableMap(requestsMap);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.metrics` is unnecessary, and can be replaced with an import
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LeaderZooKeeperServer.java`
#### Snippet
```java
    }

    private org.apache.zookeeper.metrics.Gauge gaugeWithLeader(Function<Leader, Number> supplier) {
        return () -> {
            final Leader leader = getLeader();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
         * allows us to use hash tables to track completion of transactions.
         *
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
         * allows us to use hash tables to track completion of transactions.
         *
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
         *
         * @see ProcessTxnResult#equals(Object)
         * @see java.lang.Object#hashCode()
         */
        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
     * become available.
     *
     * {@link BlockingQueue#poll(long, java.util.concurrent.TimeUnit)}
     */
    private ByteBuffer pollSendQueue(final BlockingQueue<ByteBuffer> queue,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/QuorumCnxManager.java`
#### Snippet
```java
     * become available.
     *
     * {@link BlockingQueue#poll(long, java.util.concurrent.TimeUnit)}
     */
    public Message pollRecvQueue(final long timeout, final TimeUnit unit)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/LearnerSyncThrottler.java`
#### Snippet
```java
     * @param maxConcurrentSyncs maximum concurrent number of syncs
     * @param syncType either a snapshot sync or a txn-based diff sync
     * @throws java.lang.IllegalArgumentException when <code>maxConcurrentSyncs</code>
     *                                            is less than 1
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `zookeeper-server/src/main/java/org/apache/zookeeper/metrics/MetricsProvider.java`
#### Snippet
```java
 *
 * The system will create an instance of the configured class using the default constructor, which must be public.<br>
 * After the instantiation of the provider, the system will call {@link #configure(java.util.Properties) } in order to provide configuration,
 * and then when the system is ready to work it will call {@link #start() }.
 * <br>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.zookeeper.recipes.lock` is unnecessary and can be removed
in `zookeeper-recipes/zookeeper-recipes-lock/src/main/java/org/apache/zookeeper/recipes/lock/ZooKeeperOperation.java`
#### Snippet
```java
/**
 * A callback object which can be used for implementing retry-able operations in the
 * {@link org.apache.zookeeper.recipes.lock.ProtocolSupport} class.
 *
 */
```

## RuleId[ruleID=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ConfigUtils.java`
#### Snippet
```java
                return nsa;
            }
            return new String[]{s.replaceAll("\\[|\\]", "")};
        } else {
            return s.split(":");
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeperMain.java`
#### Snippet
```java
                clientConfig = new ZKClientConfig(cl.getOption("client-configuration"));
            } catch (QuorumPeerConfig.ConfigException e) {
                e.printStackTrace();
                ServiceUtils.requestSystemExit(ExitCode.INVALID_INVOCATION.getValue());
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/cli/SetQuotaCommand.java`
#### Snippet
```java
                    return;
                } catch (InterruptedException | KeeperException e) {
                    e.printStackTrace();
                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ConfigUtils.java`
#### Snippet
```java
            props.load(new StringReader(configData));
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/util/ConfigUtils.java`
#### Snippet
```java
                qs = new QuorumPeer.QuorumServer(-1, value);
            } catch (ConfigException e) {
                e.printStackTrace();
                continue;
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/Learner.java`
#### Snippet
```java
                            newLeaderQV = qv;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumOracleMaj.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumOracleMaj.java`
#### Snippet
```java
            return (char) read == '1';
        } catch (Exception e) {
            e.printStackTrace();
            if (oracle == null) {
                LOG.error("Oracle is not set, return false");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/flexible/QuorumOracleMaj.java`
#### Snippet
```java
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-jute/src/main/java/org/apache/jute/RecordReader.java`
#### Snippet
```java
                return (InputArchive) factory.invoke(null, params);
            } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-jute/src/main/java/org/apache/jute/RecordReader.java`
#### Snippet
```java
                    BinaryInputArchive.class.getDeclaredMethod("getArchive", InputStream.class));
        } catch (SecurityException | NoSuchMethodException ex) {
            ex.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-jute/src/main/java/org/apache/jute/RecordWriter.java`
#### Snippet
```java
                    BinaryOutputArchive.class.getDeclaredMethod("getArchive", OutputStream.class));
        } catch (SecurityException | NoSuchMethodException ex) {
            ex.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zookeeper-jute/src/main/java/org/apache/jute/RecordWriter.java`
#### Snippet
```java
                return (OutputArchive) factory.invoke(null, params);
            } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Resolver() can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java
     */
    public StaticHostProvider(Collection<InetSocketAddress> serverAddresses, long randomnessSeed) {
        init(serverAddresses, randomnessSeed, new Resolver() {
            @Override
            public InetAddress[] getAllByName(String name) throws UnknownHostException {
```

### Anonymous2MethodRef
Anonymous new Resolver() can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/client/StaticHostProvider.java`
#### Snippet
```java
     */
    public StaticHostProvider(Collection<InetSocketAddress> serverAddresses) {
        init(serverAddresses, System.currentTimeMillis() ^ this.hashCode(), new Resolver() {
            @Override
            public InetAddress[] getAllByName(String name) throws UnknownHostException {
```

### Anonymous2MethodRef
Anonymous new PlayBackListener() can be replaced with method reference
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZKDatabase.java`
#### Snippet
```java
    }

    private final PlayBackListener commitProposalPlaybackListener = new PlayBackListener() {
        public void onTxnLoaded(TxnHeader hdr, Record txn, TxnDigest digest) {
            addCommittedProposal(hdr, txn, digest);
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `zookeeper-server/src/main/java/org/apache/zookeeper/ZooKeeper.java`
#### Snippet
```java
                synchronized (watches) {
                    Set<Watcher> watchers = watches.get(clientPath);
                    if (watchers == null) {
                        watchers = new HashSet<>();
                        watches.put(clientPath, watchers);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManager.java`
#### Snippet
```java

        Set<Watcher> list = watchTable.get(path);
        if (list == null) {
            // don't waste memory if there are few watches on a node
            // rehash when the 4th entry is added, doubling size thereafter
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManager.java`
#### Snippet
```java

        Set<String> paths = watch2Paths.get(watcher);
        if (paths == null) {
            // cnxns typically have many watches, so use default cap here
            paths = new HashSet<>();
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
                } else if (eowner != 0) {
                    HashSet<String> list = ephemerals.get(eowner);
                    if (list == null) {
                        list = new HashSet<>();
                        ephemerals.put(eowner, list);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/DataTree.java`
#### Snippet
```java
            } else if (ephemeralOwner != 0) {
                HashSet<String> list = ephemerals.get(ephemeralOwner);
                if (list == null) {
                    list = new HashSet<>();
                    ephemerals.put(ephemeralOwner, list);
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/Login.java`
#### Snippet
```java
        // you can decrease the interval of expiration of tickets (for example, to 3 minutes) by running :
        //  "modprinc -maxlife 3mins <principal>" in kadmin.
        t = new Thread(new Runnable() {
            public void run() {
                LOG.info("TGT refresh thread started.");
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ObserverMaster.java`
#### Snippet
```java
    private ScheduledExecutorService pinger;

    Runnable ping = new Runnable() {
        @Override
        public void run() {
```

### Convert2Lambda
Anonymous new FilenameFilter() can be replaced with lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnSnapLog.java`
#### Snippet
```java

    private void checkLogDir() throws LogDirContentCheckException {
        File[] files = this.dataDir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
```

### Convert2Lambda
Anonymous new FilenameFilter() can be replaced with lambda
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/persistence/FileTxnSnapLog.java`
#### Snippet
```java

    private void checkSnapDir() throws SnapDirContentCheckException {
        File[] files = this.snapDir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
```

## RuleId[ruleID=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/watch/WatchManagerOptimized.java`
#### Snippet
```java
    public WatchManagerOptimized() {
        watcherCleaner = new WatcherCleaner(this);
        watcherCleaner.start();
    }

```

## RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'syncProcessor' to 'SyncRequestProcessor'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/ZooKeeperServer.java`
#### Snippet
```java
        RequestProcessor finalProcessor = new FinalRequestProcessor(this);
        RequestProcessor syncProcessor = new SyncRequestProcessor(this, finalProcessor);
        ((SyncRequestProcessor) syncProcessor).start();
        firstProcessor = new PrepRequestProcessor(this, syncProcessor);
        ((PrepRequestProcessor) firstProcessor).start();
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'prepProcessor' to 'PrepRequestProcessor'
in `zookeeper-server/src/main/java/org/apache/zookeeper/server/quorum/ReadOnlyZooKeeperServer.java`
#### Snippet
```java
        RequestProcessor finalProcessor = new FinalRequestProcessor(this);
        RequestProcessor prepProcessor = new PrepRequestProcessor(this, finalProcessor);
        ((PrepRequestProcessor) prepProcessor).start();
        firstProcessor = new ReadOnlyRequestProcessor(this, prepProcessor);
        ((ReadOnlyRequestProcessor) firstProcessor).start();
```

